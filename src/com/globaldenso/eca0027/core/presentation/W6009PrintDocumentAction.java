/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W6009PrintDocumentFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of Print Document action for Documentation Invoice Register screen.
 * <br />通関書類作成業務 Invoice Register画面のPrint Documentアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "error":W6009
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11657 $
 */
public class W6009PrintDocumentAction extends W6009AbstractAction {
    /**
     * W6009PrintDocumentFacadeService
     */
    protected SearchFacadeService<File, W6009CriteriaDomain> w6009PrintDocumentFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6009PrintDocumentAction() {
        super();
    }
    
    /**
     * Setter method for w6009PrintDocumentFacadeService.
     *
     * @param printDocumentFacadeService Set for w6009PrintDocumentFacadeService
     */
    public void setW6009PrintDocumentFacadeService(SearchFacadeService<File, W6009CriteriaDomain> printDocumentFacadeService) {
        w6009PrintDocumentFacadeService = printDocumentFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <br />Get the PDF output target data.
     * <br />PDF出力対象データを取得します。
     * <pre>
     * ‐Setting the action form
     * 
     * ‐Set of search criteria domain
     * 
     * ‐Extraction of PDF file
     *     Call {@link W6009PrintDocumentFacadeServiceImpl}.
     * 
     * ‐Download PDF document
     *     FILE NAME ： Invoice No.pdf
     *     And then run the download process by calling {@link ActionUtil#downloadBinary(byte[], String, HttpServletResponse)}.
     * </pre>
     * <pre>
     * ‐アクションフォームの設定
     * 
     * ‐検索条件ドメインの設定
     * 
     * ‐PDFファイルの抽出
     *     {@link W6009PrintDocumentFacadeServiceImpl}を呼び出します。
     * 
     * ‐PDF帳票のダウンロード
     *     ファイル名：インボイスNo.pdf
     *     {@link ActionUtil#downloadBinary(byte[], String, HttpServletResponse)}を呼び出してダウンロード処理を実行します。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W6009ActionForm w6009Form = (W6009ActionForm) form;

        W6009CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w6009Form);
        // Get target zip file.
        // zipファイルの抽出
        File zipFile = w6009PrintDocumentFacadeService.search(criteriaDomain);
        // Download the PDF file.
        // PDF帳票のダウンロード
        // UT186 ZIP DOWNLOAD MOD START
        //String fileName = criteriaDomain.getInvoiceNo() + EXT_PDF;
        String fileName =
            String.format(
                "%s_%s_%s.zip",
                criteriaDomain.getShipperCd(),
                criteriaDomain.getInvoiceNo(),
                new SimpleDateFormat("yyyyMMddHHmmss").format(criteriaDomain.getInvoiceIssueDt())
            )
        ;
        // UT186 ZIP DOWNLOAD MOD END
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(zipFile)), fileName, response);
        
        return null;
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     * 
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param mapping Action mapping<br />
     * アクション・マッピング
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException If it fails to set the search criteria domain<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W6009CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W6009ActionForm form) 
        throws ApplicationException {
        W6009CriteriaDomain criteriaDomain = form.getW6009CriteriaDomain();
        
        //  Setting of a screen common information.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
