/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Print TR action class of Register Parts Transfer Report screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3008.jsp
 *     - &quot;error&quot;:W3008.jsp
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008PrintTrAction extends W3008AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected SearchFacadeService<File, W3008UpdateDomain> w3008PrintTrFacadeService;

    /**
     * <p>
     * Constructor
     * </p>
     */
    public W3008PrintTrAction() {
        super();
    }

    /**
     * <p>Setter method for w3008PrintTrFacadeService.</p>
     *
     * @param printTrFacadeService Set for w3008PrintTrFacadeService
     */
    public void setW3008PrintTrFacadeService(
        SearchFacadeService<File, W3008UpdateDomain> printTrFacadeService) {
        w3008PrintTrFacadeService = printTrFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Register CML Transfer Report : Print TR
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

        W3008ActionForm w3008Form = (W3008ActionForm)form;

        W3008UpdateDomain updateDomain = prepareUpdateDomain(w3008Form);

        // Call of facade service
        // facadeサービスの呼び出し
        File report = w3008PrintTrFacadeService.search(updateDomain);

        // save the pdf file
        saveReport(w3008Form, report);

        // download the pdf file
        String fileName = w3008Form.getCriteriaDomain().getTrNo() + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(
            report)), fileName, response);

        return null;
    }

    /**
     * <br />
     * create updateDomain
     * 
     * @param form W3008ActionForm
     * @return W3008UpdateDomain
     */
    protected W3008UpdateDomain prepareUpdateDomain(W3008ActionForm form) {
        W3008UpdateDomain updateDomain = new W3008UpdateDomain();

        // set the common screen information
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());

        // set languageCd and DSC-ID
        for (W3008ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }

        // set listDomainList
        updateDomain.setW3008ListDomainList(form.getListDomainList());
        updateDomain.setTrNo(form.getCriteriaDomain().getTrNo());

        return updateDomain;
    }
}
