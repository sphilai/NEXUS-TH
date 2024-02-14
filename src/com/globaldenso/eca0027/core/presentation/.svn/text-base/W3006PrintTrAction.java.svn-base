/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3006UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Print TR action class of Register CML Transfer Report screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3006.jsp
 *     - &quot;error&quot;:W3006.jsp
 * </pre>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3006PrintTrAction extends W3006AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected SearchFacadeService<File, W3006UpdateDomain> w3006PrintTrFacadeService;

    /**
     * <p>
     * Constructor
     * </p>
     */
    public W3006PrintTrAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3006PrintTrFacadeService.
     * </p>
     * 
     * @param printTrFacadeService Set for w3006PrintTrFacadeService
     */
    public void setW3006PrintTrFacadeService(
        SearchFacadeService<File, W3006UpdateDomain> printTrFacadeService) {
        w3006PrintTrFacadeService = printTrFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Register CML Transfer Report : Print TR function
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

        W3006ActionForm w3006Form = (W3006ActionForm)form;

        W3006UpdateDomain updateDomain = prepareUpdateDomain(w3006Form);

        // Call of facade service
        // facadeサービスの呼び出し
        File report = w3006PrintTrFacadeService.search(updateDomain);

        // save pdf file
        saveReport(w3006Form, report);

        // download pdf file
        String fileName = w3006Form.getCriteriaDomain().getTrNo() + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(
            report)), fileName, response);

        return null;
    }

    /**
     * <br />
     * create updateDomain
     * 
     * @param form W3006ActionForm
     * @return W3006UpdateDomain
     */
    protected W3006UpdateDomain prepareUpdateDomain(W3006ActionForm form) {
        W3006UpdateDomain updateDomain = new W3006UpdateDomain();

        // set common screen information
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());

        // set languageCd and DSC-ID
        for (W3006ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }

        // set listDomainList
        updateDomain.setW3006ListDomainList(form.getListDomainList());
        updateDomain.setTrNo(form.getCriteriaDomain().getTrNo());

        return updateDomain;
    }
}
