/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3010;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W3010DetailDomain;
import com.globaldenso.eca0027.core.business.domain.W3010ReceiveDomain;
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
 *     - &quot;success&quot;:W3010.jsp
 *     - &quot;error&quot;:W3010.jsp
 * </pre>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3010PrintTrAction extends W3010AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected SearchFacadeService<File, W3010ReceiveDomain> w3010PrintTrFacadeService;

    /**
     * <p>
     * Constructor
     * </p>
     */
    public W3010PrintTrAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3010PrintTrFacadeService.
     * </p>
     * 
     * @param printTrFacadeService Set for w3010PrintTrFacadeService
     */
    public void setW3010PrintTrFacadeService(
        SearchFacadeService<File, W3010ReceiveDomain> printTrFacadeService) {
        w3010PrintTrFacadeService = printTrFacadeService;
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

        W3010ActionForm w3010Form = (W3010ActionForm)form;
        W3010DetailDomain criteria = w3010Form.getDetailDomain();
        W3010ReceiveDomain updateDomain = new W3010ReceiveDomain();
        CommonUtil.copyPropertiesDomainToDomain(updateDomain, criteria,
            criteria.getDateFormat());

        // Call of facade service
        // facadeサービスの呼び出し
        File report = w3010PrintTrFacadeService.search(updateDomain);

        // save the pdf file
        saveReport(w3010Form, report);

        // download the pdf file
        String fileName = updateDomain.getTrNo() + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(
            report)), fileName, response);

        return null;
    }

    /**
     * <br />
     * save the pdf file to screenInfo
     * 
     * @param form W3010ActionForm
     * @param report File
     */
    protected void saveReport(W3010ActionForm form, File report) {
        // obtain the screenInfoDomain
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(
            SCREEN_ID_W3010);

        // save the pdf file
        screenInfo.setGeneralArea("report", report);
    }

}
