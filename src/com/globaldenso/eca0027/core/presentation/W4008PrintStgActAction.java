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

import com.globaldenso.eca0027.core.business.domain.W4008CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;


/**
 * Staging Actuality form download action class of Staging Actuality Register screen
 * <br />山作り実績Register画面のStaging Actuality帳票ダウンロードアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W4008.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4008PrintStgActAction extends W4008AbstractAction {

    /**
     * Print instr facade service.
     */
    protected SearchFacadeService<File, W4008CriteriaDomain> w4008PrintStgActFacadeService;

    /**
     * constructor.
     */
    public W4008PrintStgActAction() {
        super();
    }

    /**
     * Setter method for w4008PrintStgActFacadeService.
     *
     * @param printStgActFacadeService Set for w4008PrintStgActFacadeService
     */
    public void setW4008PrintStgActFacadeService(
        SearchFacadeService<File, W4008CriteriaDomain> printStgActFacadeService) {
        w4008PrintStgActFacadeService = printStgActFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call the W4008PrintStgActFacadeService.search an argument form.criteriaDomain
     * - Download the PDF response form
     *    Argument to the result of calling W4008PrintStgActFacadeService.search, Call the ActionUtil.downloadBinary
     *
     * - form.criteriaDomainを引数にW4008PrintStgActFacadeService.searchの呼び出し
     * - PDF帳票のダウンロードレスポンス
     *    W4008PrintStgActFacadeService.searchの呼び出し結果を引数に、ActionUtil.downloadBinaryの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4008ActionForm form = (W4008ActionForm)actForm;

        // Get PL domain
        // PLドメイン取得
        W4008CriteriaDomain w4008CriteriaDomain = form.getW4008CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4008CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        File resultFile = w4008PrintStgActFacadeService.search(w4008CriteriaDomain);

        // Download PDF document
        // PDF帳票のダウンロード
        String fileName = form.getStgActNo() + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(resultFile)), fileName, response);

        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
