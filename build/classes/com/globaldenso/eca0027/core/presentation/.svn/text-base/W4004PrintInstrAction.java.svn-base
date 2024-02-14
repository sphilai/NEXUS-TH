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

import com.globaldenso.eca0027.core.business.domain.W4004CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;


/**
 * Staging Instruction form download action class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面のStaging Instruction帳票ダウンロードアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W4004.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4004PrintInstrAction extends W4004AbstractAction {

    /**
     * Print instr facade service.
     */
    protected SearchFacadeService<File, W4004CriteriaDomain> w4004PrintInstrFacadeService;

    /**
     * constructor.
     */
    public W4004PrintInstrAction() {
        super();
    }

    /**
     * Setter method for w4004PrintInstrFacadeService.
     *
     * @param printInstrFacadeService Set for w4004PrintInstrFacadeService
     */
    public void setW4004PrintInstrFacadeService(
        SearchFacadeService<File, W4004CriteriaDomain> printInstrFacadeService) {
        w4004PrintInstrFacadeService = printInstrFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call the W4004PrintInstrFacadeService.search an argument form.criteriaDomain
     * - Download the PDF response form
     *    Argument to the result of calling W4004PrintInstrFacadeService.search, Call the ActionUtil.downloadBinary
     *
     * - form.criteriaDomainを引数にW4004PrintInstrFacadeService.searchの呼び出し
     * - PDF帳票のダウンロードレスポンス
     *    W4004PrintInstrFacadeService.searchの呼び出し結果を引数に、ActionUtil.downloadBinaryの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4004ActionForm form = (W4004ActionForm)actForm;

        // Get PL domain
        // PLドメイン取得
        W4004CriteriaDomain w4004CriteriaDomain = form.getW4004CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4004CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        File resultFile = w4004PrintInstrFacadeService.search(w4004CriteriaDomain);

        // Download PDF document
        // PDF帳票のダウンロード
        String fileName = form.getStgInstrNo() + EXT_PDF;
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
