/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2012PrintCmlFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Print CML action class of a CML Register screen.
 * <br />CML Register画面のPrint CMLアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W2012.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2012PrintCmlAction extends W2012AbstractAction {

    /**
     * PrintCml Facade service
     * <br />PrintCml Facade サービス
     */
    protected TransactFacadeService<File, W2012CriteriaDomain> w2012PrintCmlFacadeService;
    
    /**
     * constructor.
     */
    public W2012PrintCmlAction() {
        super();
    }

    /**
     * Setter method for w2012PrintCmlFacadeService.
     * 
     * @param printCmlFacadeService Set for w2012PrintCmlFacadeService
     */
    public void setW2012PrintCmlFacadeService(
        TransactFacadeService<File, W2012CriteriaDomain> printCmlFacadeService) {
        w2012PrintCmlFacadeService = printCmlFacadeService;
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
     *       The following informations are set as {@link W2012CriteriaDomain}.
     *         - Screen common information
     *
     * A create of - PDF list
     *       {@link W2012PrintCmlFacadeServiceImpl W2012PrintCmlFacadeServiceImpl#transact(W2012CriteriaDomain)} is called for {@link W2004CriteriaDomain} to an argument.
     *
     * Download of - PDF list
     *       {@link ActionUtil#downloadBinary(byte[], String, HttpServletResponse)} is called,
     *       The created PDF list is outputted.
     *
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2012CriteriaDomain}に設定する
     *       - 画面共通情報
     *       
     * - PDF帳票の作成
     *     {@link W2004CriteriaDomain}を引数に{@link W2012PrintCmlFacadeServiceImpl W2012PrintCmlFacadeServiceImpl#transact(W2012CriteriaDomain)}を呼出す
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
        

        W2012ActionForm w2012Form = (W2012ActionForm) form;
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2012CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2012Form);
        
        // A create of PDF list
        // PDF帳票の作成
        File report = w2012PrintCmlFacadeService.transact(criteriaDomain);
        
        // Download of PDF list
        // PDF帳票のダウンロード
        String fileName = w2012Form.getW2012CriteriaDomain().getMainMark() + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);
        
        return null;

    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - At the time of the screen re-display at the time of error generation
     *     - Display control of a screen item is performed.
     *
     * - At the time of the screen re-display at the time of no error generation
     * - {@link W2012AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2012AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2009AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplay(request, (W2012ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }

    }

    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2012CriteriaDomain prepareCriteriaDomain(W2012ActionForm form) {
        W2012CriteriaDomain criteriaDomain  = form.getW2012CriteriaDomain();
        
        String volumeUnit = criteriaDomain.getVolumeUnit();
        String weightUnit = criteriaDomain.getWeightUnit();
        String lengthUnit = criteriaDomain.getLengthUnit(); // UT110 TRIAL SHIPMENT/号試品対応 ADD
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        criteriaDomain.setVolumeUnit(volumeUnit);
        criteriaDomain.setWeightUnit(weightUnit);
        criteriaDomain.setLengthUnit(lengthUnit); // UT110 TRIAL SHIPMENT/号試品対応 ADD
        
        return criteriaDomain;
    }
}
