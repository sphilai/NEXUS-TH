/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2011CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Init action class of CML Create
 * <br />CML Header画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2011.jsp
 *     - "error":W2011.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2011InitAction extends W2011AbstractAction {

    /**
     * Initialize Facade service
     * <br />初期化Facadeサービス
     */
    protected TransactFacadeService<Void, W2011CriteriaDomain> w2011InitFacadeService;
    
    /**
     * constructor.
     */
    public W2011InitAction() {
        super();
    }
    
    /**
     * Setter method for w2011InitFacadeService.
     * 
     * @param initFacadeService Set for w2011InitFacadeService
     */
    public void setW2011InitFacadeService(
        TransactFacadeService<Void, W2011CriteriaDomain> initFacadeService) {
        w2011InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * The copy of - Header information
     *       The following item of the header information saved at the session is set as a search-condition domain.
     *       - Shipper CD
     *       - CUSTOMER CODE
     *       - LEGACY SHIP TO
     *       - TRANSPORT CODE
     *       - PLANT CODE
     *       - LEGACY WAREHOUSE CODE
     *       - Packaging Instruction (=Pull) NO
     *       - PACKING WAREHOUSE COMPANY CODE
     *       - PACKING WAREHOUSE CODE
     *
     * - Header情報のコピー
     *     セッションに保存されているヘッダ情報の下記項目を検索条件ドメインに設定する
     *     ・荷主コード
     *     ・得意先コード
     *     ・LEGACY送荷先
     *     ・輸送手段コード
     *     ・製造部工場区分
     *     ・LEGACY倉庫コード
     *     ・梱包指示NO
     *     ・梱包倉庫会社コード
     *     ・梱包倉庫コード
     *     
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2011ActionForm w2011Form = (W2011ActionForm) form;
        
        // The copy of a Header information
        // Header情報のコピー
        copyHeaderInfo(w2011Form);
        
        // A delete of a Register information
        // Register情報の削除
        delRegisterInfo(w2011Form);
        
        // A delete of Palletize Item Work
        // パレタイズ対象品ワークの削除
        W2011CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2011Form);
        w2011InitFacadeService.transact(criteriaDomain);
        
        controlDisplay(request, (W2011ActionForm) form);
       
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - At the time of the screen re-display at the time of error generation
     *     - Display control of a screen item is performed.
     *
     * - At the time of the screen re-display at the time of no error generation
     * - {@link W2011AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2011AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     *   
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2011AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {
        
        // Display control
        // 表示制御
        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplayErr(request, (W2011ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }
    }

    /**
     *    The information on a CML Header screen is copied.
     * <br />CML Header画面の情報をコピー
     * 
     * <pre>
     * - The information inputted on the CML Header screen is acquired from a session.
     *     criteria of {@link W2011ActionForm} of a CML Create screen It sets to {@link W2011CriteriaDomain}.
     *
     * - セッションから CML Header画面で入力した情報を取得し
     *   CML Create 画面の {@link W2011ActionForm} の criteria {@link W2011CriteriaDomain} に設定する。
     * </pre>
     *
     * @param form Action form<br />アクションフォーム
     */
    protected void copyHeaderInfo(W2011ActionForm form) {
        
        // Acquisition of a Header information
        // Header情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2010);
        W2010CriteriaDomain w2010Criteria = ((W2010ActionForm) screenInfo.getActionForm()).getW2010CriteriaDomain();

        // Acquisition of a search-condition domain
        // 検索条件ドメインの取得
        W2011CriteriaDomain w2011Criteria = form.getW2011CriteriaDomain();
        
        // The copy of a Header information
        // Header情報のコピー
        w2011Criteria.setShipperCd(w2010Criteria.getShipperCd());
        w2011Criteria.setCustomerCd(w2010Criteria.getCustomerCd());
        w2011Criteria.setLgcyShipTo(w2010Criteria.getLgcyShipTo());
        w2011Criteria.setTrnsCd(w2010Criteria.getTrnsCd());
        w2011Criteria.setPlntCd(w2010Criteria.getPlntCd());
        w2011Criteria.setLgcyWhCd(w2010Criteria.getLgcyWhCd());
        w2011Criteria.setPltzInstrNo(w2010Criteria.getPltzInstrNo());
        w2011Criteria.setPackingWhCompCd(w2010Criteria.getPackingWhCompCd());
        w2011Criteria.setPackingWhCd(w2010Criteria.getPackingWhCd());
        w2011Criteria.setManualRegFlg(w2010Criteria.getManualRegFlg()); // UT110 TRIAL SHIPMENT/号試品対応 ADD
        w2011Criteria.setPalletCartonTyp(w2010Criteria.getPalletCartonTyp()); // UT420 ADD
        w2011Criteria.setPalletCartonTypName(w2010Criteria.getPalletCartonTypName()); // UT420 ADD
    }
    
    /**
     *    Delete of CML Register screen information
     * <br />CML Register画面情報の削除
     * 
     * <pre>
     * - An information when this screen is displayed before is form. It remains in {@link W2011ActionForm}.
     *     Since things are possible, the information on form is cleared.
     *
     * - 以前に本画面を表示した時の情報が form {@link W2011ActionForm} に残っている
     *   ことが有り得るため、formの情報をクリアする。
     * </pre>
     *
     * @param form Action form<br />アクションフォーム
     */
    protected void delRegisterInfo(W2011ActionForm form) {

        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
        Map<String, ScreenInfoDomain> screenInfo = windowInfo.getScreenInfo();
        
        // A delete of CML Register screen information
        // CML Register画面情報の削除
        if (screenInfo.containsKey(SCREEN_ID_W2012)) {
            screenInfo.remove(SCREEN_ID_W2012);
        }
    }
    
    /**
     *    {@link W2011CriteriaDomain} for deleting a Palletize Item Work is generated.
     * <br />パレタイズ対象品ワークを削除するための{@link W2011CriteriaDomain} を生成する。
     * 
     * <pre>
     * - {@link W2011CriteriaDomain} is generated.
     * - A screen common information is set to {@link W2011CriteriaDomain}.
     *
     * - {@link W2011CriteriaDomain} を生成する。
     * - {@link W2011CriteriaDomain}に、画面共通情報を設定する。
     * </pre>
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクションマッピング
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2011CriteriaDomain prepareCriteriaDomain(
        HttpServletRequest request, ActionMapping mapping, W2011ActionForm form) {
        
        W2011CriteriaDomain criteriaDomain = form.getW2011CriteriaDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        return criteriaDomain;
    }

}
