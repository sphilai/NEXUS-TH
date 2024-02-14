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
import com.globaldenso.eca0027.core.business.domain.W3003CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The PrintForAll action class of Print Carry Out List by CML screen
 * <pre>
 *  forward name-path mappings:
 *     - "success":W3003.jsp
 *     - "error":W3003.jsp
 * </pre>
 *
 * @author SNT ku
 * @version 1.00
 */
public class W3003PrintListForAllAction extends W3003AbstractAction {

    /**
     * <p>Search facade service</p>
     */
    protected SearchFacadeService<File, W3003CriteriaDomain> w3003PrintListForAllFacadeService;

    /**
     * <p>Constructor</p>
     *
     */
    public W3003PrintListForAllAction() {
        super();
    }

    /**
     * <p>Setter method for w3003PrintListForAllFacadeService.</p>
     *
     * @param printListForAllFacadeService w3003PrintListForAllFacadeService
     */
    public void setW3003PrintListForAllFacadeService(
        SearchFacadeService<File, W3003CriteriaDomain> printListForAllFacadeService) {
        w3003PrintListForAllFacadeService = printListForAllFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - PrintForAll of Print Carry Out List by CML
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W3003ActionForm w3003Form = (W3003ActionForm)form;

        W3003CriteriaDomain w3003CriteriaDomain = w3003Form.getCriteriaDomain();

        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(w3003Form.getWindowId());
        Eca0027CommonInfoDomain commonInfo = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();
        //Add Chonthicha 16Sep2014
        w3003CriteriaDomain.setLoginUserDscId(null);
        w3003CriteriaDomain.setServerId(commonInfo.getServerId());
        w3003CriteriaDomain.setUserAuthList(commonInfo.getUserAuthList());

        // Call of facade service
        File report = w3003PrintListForAllFacadeService.search(w3003CriteriaDomain);

        // Save PDF File
        saveReport(w3003Form, report);

        // Download PDF File
        String fileName = "CARRYOUTLIST_CASEMARK_" + DateUtil.formatDate(new Date(), "ddMMyyyyHHmmss") + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);

        return null;
    }
}
