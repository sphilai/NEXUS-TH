/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W3004CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The PrintForAll action class of Print Carry Out List by Parts screen
 * <pre>
 *  forward name-path mappings:
 *     - "success":W3004.jsp
 *     - "error":W3004.jsp
 * </pre>
 *
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3004PrintListForAllAction extends W3004AbstractAction {

    /**
     * <p>Search facade service</p>
     */
    protected SearchFacadeService<File, W3004CriteriaDomain> w3004PrintListForAllFacadeService;

    /**
     * <p>Constructor</p>
     *
     */
    public W3004PrintListForAllAction() {
        super();
    }

    /**
     * <p>Setter method for w3004PrintListForAllFacadeService.</p>
     *
     * @param printListForAllFacadeService Set for w3004PrintListForAllFacadeService
     */
    public void setW3004PrintListForAllFacadeService(
        SearchFacadeService<File, W3004CriteriaDomain> printListForAllFacadeService) {
        w3004PrintListForAllFacadeService = printListForAllFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Print Carry Out List by Parts画面のPrintForAll
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W3004ActionForm w3004Form = (W3004ActionForm)form;

        W3004CriteriaDomain w3004CriteriaDomain = w3004Form.getCriteriaDomain();

        // Chonthicha start
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(w3004Form.getWindowId());
        Eca0027CommonInfoDomain commonInfo = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();
        //Add Chonthicha 16Sep2014
        w3004CriteriaDomain.setLoginUserDscId(null);
        w3004CriteriaDomain.setServerId(commonInfo.getServerId());
        w3004CriteriaDomain.setUserAuthList(commonInfo.getUserAuthList());
        // Chonthicha end

        // Call of facade service
        // facadeサービスの呼び出し
        File report = w3004PrintListForAllFacadeService.search(w3004CriteriaDomain);

        // PDF帳票の保存
        // save Report
        saveReport(w3004Form, report);

        // PDF帳票のダウンロード
        // download Report
        String fileName = "CARRYOUTLIST_ITEMNO_" + DateUtil.formatDate(new Date(), "ddMMyyyyHHmmss") + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);

        // Chonthicha.A
        // return FORWARD_SUCCESS;
        return null;
    }
}
