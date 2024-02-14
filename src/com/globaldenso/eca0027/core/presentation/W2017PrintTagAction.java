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

import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2017PrintTagFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The PrintTag action class of X-tag Register
 * <br />X-tag Register画面のPrintTagアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W2017.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2017PrintTagAction extends W2017AbstractAction {

    /**
     * PrintTagFacade service
     * <br />PrintTagFacadeサービス
     */
    protected SearchFacadeService<File, W2017CriteriaDomain> w2017PrintTagFacadeService;
    
    /**
     * constructor.
     */
    public W2017PrintTagAction() {
        super();
    }

    /**
     * Setter method for w2017PrintTagFacadeService.
     *
     * @param printTagFacadeService Set for printTagFacadeService
     */
    public void setW2017PrintTagFacadeService(
        SearchFacadeService<File, W2017CriteriaDomain> printTagFacadeService) {
        w2017PrintTagFacadeService = printTagFacadeService;
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2017CriteriaDomain}.
     *         - Screen common information
     *
     * A create of - PDF list
     *       {@link W2017PrintTagFacadeServiceImpl W2017PrintTagFacadeServiceImpl#search (W2017CriteriaDomain)} is called for {@link W2017CriteriaDomain} to an argument.
     *
     * Download of - PDF list
     *       {@link ActionUtil#downloadBinary (byte[], String, HttpServletResponse)} is called,
     *       The created PDF list is outputted.
     * 
     * 
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2017CriteriaDomain}に設定する
     *       - 画面共通情報
     *       
     * - PDF帳票の作成
     *     {@link W2017CriteriaDomain}を引数に{@link W2017PrintTagFacadeServiceImpl W2017PrintTagFacadeServiceImpl#search(W2017CriteriaDomain)}を呼出す
     *     
     * - PDF帳票のダウンロード
     *     {@link ActionUtil#downloadBinary(byte[], String, HttpServletResponse)}を呼出し、
     *     作成したPDF帳票を出力する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W2017ActionForm w2017Form = (W2017ActionForm) form;
        
        if (!w2017Form.isDownload()) {
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W2017CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2017Form);

            // A create of PDF list
            // PDF帳票の作成
            File report = w2017PrintTagFacadeService.search(criteriaDomain);
            
            // Preservation of PDF list
            // PDF帳票の保存
            saveReport(w2017Form, report);
            
            // Setting of a download flag
            // ダウンロードフラグの設定
            w2017Form.setDownload(true);
            
            return FORWARD_SUCCESS;
            
        } else {
            // Acquisition of PDF list
            // PDF帳票の取得
            File report = getReport(w2017Form);
            
            // Download of PDF list
            // PDF帳票のダウンロード
            String fileName = w2017Form.getW2017CriteriaDomain().getXmainMark() + EXT_PDF;
            ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);

            return null;
        }
    }
    
    /**
     * A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2017CriteriaDomain prepareCriteriaDomain(W2017ActionForm form) {
        W2017CriteriaDomain criteriaDomain = form.getW2017CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
