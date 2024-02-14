/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2004PrintCmlForInstrFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is a Print CML for Instr action class of a Packaging Instruction (=Pull) Register screen.
 * <br />梱包指示Register画面のPrint CML for Instrアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W2004.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004PrintCmlForInstrAction extends W2004AbstractAction {

    /**
     * PintrCmlForInstr Facade service
     * <br />PintrCmlForInstr Facadeサービス
     */
    protected UpdateFacadeService<File, W2004CriteriaDomain> w2004PrintCmlForInstrFacadeService;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2004PrintCmlForInstrAction() {
        super();
    }

    /**
     * Setter method for w2004PrintCmlForInstrFacadeService.
     *
     * @param printCmlForInstrFacadeService Set for w2004PrintCmlForInstrFacadeService
     */
    public void setW2004PrintCmlForInstrFacadeService(
        UpdateFacadeService<File, W2004CriteriaDomain> printCmlForInstrFacadeService) {
        w2004PrintCmlForInstrFacadeService = printCmlForInstrFacadeService;
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
     * <pre>
     *   [In the case of download flag = false]
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2004CriteriaDomain}.
     *         - Screen common information
     *
     * - A create of PDF list
     *       {@link W2004PrintCmlForInstrFacadeServiceImpl W2004PrintCmlForInstrFacadeServiceImpl#transact(W2004CriteriaDomain)} is called for {@link W2004CriteriaDomain} to an argument.
     *
     * - Preservation of PDF list
     *       This is an invoke about {@link #saveReport(W2004ActionForm, File)},
     *       The created PDF list is saved in the area of a screen information domain in general.
     *
     * - Setting of a download flag
     *       {@link W2004ActionForm#downloadCmlForInstr} is set as true.
     *
     *   [In the case of download flag = true]
     * - Acquisition of PDF list
     *       This is an invoke about {@link #getReport(W2004ActionForm)},
     *       The PDF list saved in the area of the screen information domain in general is acquired.
     *
     * - Download of PDF list
     *       {@link ActionUtil#downloadBinary (byte[], String, HttpServletResponse)} is called,
     *       The created PDF list is outputted.
     * 
     * 
     * [ダウンロードフラグ = falseの場合]
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2004CriteriaDomain}に設定する
     *       - 画面共通情報
     *       
     * - PDF帳票の作成
     *     {@link W2004CriteriaDomain}を引数に{@link W2004PrintCmlForInstrFacadeServiceImpl W2004PrintCmlForInstrFacadeServiceImpl#transact(W2004CriteriaDomain)}を呼出す
     *     
     * - PDF帳票の保存
     *     {@link #saveReport(W2004ActionForm, File)}を呼び出し、
     *     作成したPDF帳票を画面情報ドメインの汎用エリアに保存する
     *     
     * - ダウンロードフラグの設定
     *     {@link W2004ActionForm#downloadCmlForInstr}をtrueに設定する
     *     
     * [ダウンロードフラグ = trueの場合]
     * - PDF帳票の取得
     *     {@link #getReport(W2004ActionForm)}を呼び出し、
     *     画面情報ドメインの汎用エリアに保存されているPDF帳票を取得する
     * 
     * - PDF帳票のダウンロード
     *     {@link ActionUtil#downloadBinary(byte[], String, HttpServletResponse)}を呼出し、
     *     作成したPDF帳票を出力する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2004ActionForm w2004Form = (W2004ActionForm) form;
        
        if (!w2004Form.isDownloadCmlForInstr()) {
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W2004CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2004Form);
            
            // create of PDF list
            // PDF帳票の作成
            File report = w2004PrintCmlForInstrFacadeService.update(criteriaDomain);

            // Preservation of PDF list
            // PDF帳票の保存
            saveReport(w2004Form, report);
            
            // Setting of a download flag
            // ダウンロードフラグの設定
            w2004Form.setDownloadCmlForInstr(true);
            
            return FORWARD_SUCCESS;
        } else {
            // Acquisition of PDF list
            // PDF帳票の取得
            File report = getReport(w2004Form);
            
            // Download of PDF list
            // PDF帳票のダウンロード
            String fileName = w2004Form.getPltzInstrNo() + "_CML" + EXT_PDF;
            ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);
            
            return null;
        }
    }

    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2004CriteriaDomain prepareCriteriaDomain(W2004ActionForm form) {
        W2004CriteriaDomain criteriaDomain = form.getW2004CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
