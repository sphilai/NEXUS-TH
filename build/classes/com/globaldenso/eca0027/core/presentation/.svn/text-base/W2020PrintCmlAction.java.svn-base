/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
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

import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;


/**
 * Staging Actuality form download action class of Multi Label Register Screen
 * <br />Multi Label Register画面のCML帳票ダウンロードアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W2020.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020PrintCmlAction extends W2020AbstractAction {

    /**
     * Print instr facade service.
     */
    protected SearchFacadeService<File, W2020CriteriaDomain> w2020PrintCmlFacadeService;

    /**
     * constructor.
     */
    public W2020PrintCmlAction() {
        super();
    }

    /**
     * Setter method for w2020PrintStgActFacadeService.
     *
     * @param printCmlFacadeService Set for w2020PrintStgActFacadeService
     */
    public void setW2020PrintCmlFacadeService(
        SearchFacadeService<File, W2020CriteriaDomain> printCmlFacadeService) {
        w2020PrintCmlFacadeService = printCmlFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Get PL domain
     * - call of service facade
     * - Return the PDF form to download response .
     * - PLドメイン取得
     * - facadeサービスの呼び出し
     * - PDF帳票ダウンロードのレスポンス返す。
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm actform,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Get PL domain
        // PLドメイン取得
        W2020ActionForm form = (W2020ActionForm)actform;
        W2020CriteriaDomain w2020CriteriaDomain  = form.getW2020CriteriaDomain();
        ActionUtil.prepareBusinessDomain(w2020CriteriaDomain, form.getWindowId(), form.getScreenId());

        // call of service facade
        // facadeサービスの呼び出し
        File report = w2020PrintCmlFacadeService.search(w2020CriteriaDomain);

        // Return the PDF form to download response .
        // PDF帳票ダウンロードのレスポンス返す。
        if (report != null) {
            String fileName = w2020CriteriaDomain.getFromMainMark();
            if (!w2020CriteriaDomain.getToMainMark().equals(w2020CriteriaDomain.getFromMainMark())) {
                fileName += "_" + w2020CriteriaDomain.getToMainMark();
            }
            fileName += EXT_PDF;
            ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);
        }

        return null;
    }
}
