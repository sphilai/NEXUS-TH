/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3011;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W3011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3011ReceiveDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The PrintTr action class
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3011.jsp
 *     - &quot;error&quot;:W3011.jsp
 * </pre>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3011PrintTrAction extends W3011AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected SearchFacadeService<File, W3011ReceiveDomain> w3011PrintTrFacadeService;

    /**
     * <p>
     * Constructor
     * </p>
     */
    public W3011PrintTrAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3011PrintTrFacadeService.
     * </p>
     * 
     * @param printTrFacadeService Set for w3011PrintTrFacadeService
     */
    public void setW3011PrintTrFacadeService(
        SearchFacadeService<File, W3011ReceiveDomain> printTrFacadeService) {
        w3011PrintTrFacadeService = printTrFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Print Carry Out List by CML : PrintForUpdate
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W3011ActionForm w3011Form = (W3011ActionForm)form;
        W3011CriteriaDomain criteria = w3011Form.getCriteriaDomain();
        W3011ReceiveDomain updateDomain = new W3011ReceiveDomain();
        CommonUtil.copyPropertiesDomainToDomain(updateDomain, criteria,
            criteria.getDateFormat());

        // Call of facade service
        // facadeサービスの呼び出し
        File report = w3011PrintTrFacadeService.search(updateDomain);

        // save the pdf file
        saveReport(w3011Form, report);

        // download the pdf file
        String fileName = updateDomain.getTrNo() + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(
            report)), fileName, response);

        /* Chonthicha.A
        return FORWARD_SUCCESS; */
        return null;
    }

    /**
     * <br />
     * save the pdf file to screenInfo
     * 
     * @param form アクションフォーム
     * @param report PDF帳票
     */
    protected void saveReport(W3011ActionForm form, File report) {
        // obtain the screenInfoDomain
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(
            SCREEN_ID_W3011);

        // save the pdf file
        screenInfo.setGeneralArea("report", report);
    }

}
