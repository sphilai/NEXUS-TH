/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INPUT_METH_TYP_MANUAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_DUMMY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2013CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *    This is an initial display action class of a CML PKG Detail screen.
 * <br />CML PKG Detail画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2013.jsp
 *     - "error":W2013.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2013InitAction extends W2013AbstractAction {
        
    /**
     * Init Facade service
     * <br />Init Facade サービス
     */
    protected SearchFacadeService<List<? extends W2013ListDomain>, W2013CriteriaDomain> w2013InitFacadeService;

    /**
     * constructor.
     */
    public W2013InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return true;
    }
    
    /**
     * Setter method for w2013InitFacadeService.
     * 
     * @param initFacadeService Set for w2013InitFacadeService
     */
    public void setW2013InitFacadeService(
        SearchFacadeService<List<? extends W2013ListDomain>, W2013CriteriaDomain> initFacadeService) {
        w2013InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Action form is set up.
     *       A List domain is cleared.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2013CriteriaDomain}.
     *         - Screen common information
     *         - Transition-original-screen ID
     *       - CML No.
     *         - Header information
     *         - processing mode
     *
     * - Retrieval processing execution
     * - Setting of search results
     * - Screen fields attributes
     *
     * - アクションフォームを設定
     *     Listドメインをクリアする
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2013CriteriaDomain}に設定する。
     *       - 画面共通情報
     *       - 遷移元画面ID
     *       - CML No.
     *       - Header情報
     *       - 処理モード
     *       
     * - 検索処理実行
     * - 検索結果の設定
     * - 画面表示制御
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        // processing-mode acquisition
        // 処理モード取得
        String functionMode = (String) request.getAttribute("functionMode");
        String mainMark = (String) request.getAttribute("mainMark");
        
        // Setting of action form
        // アクションフォームの設定
        W2013ActionForm w2013Form = prepareForm((W2013ActionForm) form, functionMode, mainMark);
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2013CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2013Form);
        
        // Execution of retrieval processing
        // 検索処理の実行

        // UT110 TRIAL SHIPMENT/号試品対応 MOD START
        // In the case of 0 exception, Return to the source screen.
        // 0件例外の場合、遷移元に戻る。
        List<? extends W2013ListDomain> listDomainList = null;
        try {
            listDomainList = (List<? extends W2013ListDomain>)w2013InitFacadeService.search(criteriaDomain);
        } catch (GscmApplicationException e) {
            if (GSCM_E0_0001.equals(e.getCode())) {
                saveErrors(request, mapping, GSCM_E0_0001, null);
                return w2013Form.getCallScreenId();
            }
            throw e;
        }
        // UT110 TRIAL SHIPMENT/号試品対応 MOD END
        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        // In the case of manual registration, if 0 list then add empty 10 lines.
        // マニュアル登録の場合、0件なら空の10行を追加。
        if (FLAG_Y.equals(criteriaDomain.getManualRegFlg()) && listDomainList.size() == 0) {
            request.setAttribute("first_add_line", 0); // focus setting.
            List<W2013ListDomain> emptyListDomainList = new ArrayList<W2013ListDomain>();
            for (int i = 0; i < 10; i++) {
                W2013ListDomain listDomain = new W2013ListDomain();
                listDomain.setInputMethod(getInputMethodVal(w2013Form.getLanguageCd())); // input method(name)/包装材種別(名称)
                listDomain.setInputMethTyp(INPUT_METH_TYP_MANUAL);
                listDomain.setPkgTyp(getPkgTypVal(w2013Form.getLanguageCd())); // package type(name)/入力方法(名称)
                listDomain.setPkgTypHidden(PKG_TYP_DUMMY);
                emptyListDomainList.add(listDomain);
            }
            listDomainList = emptyListDomainList;
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END

        // Setting of search results
        // 検索結果の設定
        setSearchResult(w2013Form, listDomainList, criteriaDomain);

        // Display control of a Main screen
        // Main画面の表示制御
        controlDisplay(w2013Form, request);

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
     * - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2013AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName){

        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplay(request, (W2013ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param functionMode Processing mode<br />処理モード
     * @param mainMark     CML No.
     * @return Action form<br />アクションフォーム
     */
    protected W2013ActionForm prepareForm(W2013ActionForm form, String functionMode, String mainMark) {
        
        // The clearance of a List domain
        // Listドメインのクリア 
        form.setListDomainList(null);
        
        // The VALUE from request is set up.
        // request からの値を設定
        form.setFunctionMode(functionMode);
        form.setMainMark(mainMark);
        
        // Backup of Transition-original-screen ID
        // 遷移元画面IDの退避
        form.getW2013CriteriaDomain().setOriginalScreenId(form.getCallScreenId());
        
        return form;
    }

    /**
     *    An information is acquired from action form and a session and a search-condition domain is created.
     * <br />アクションフォーム、セッションから情報を取得して検索条件ドメインを作成
     *
     * <pre>
     *    - The information inputted on the CML Header screen is acquired from a session,
     *      criteria of {@link W2013ActionForm} of a CML Create screen It sets to {@link W2013CriteriaDomain}.
     *
     *    - The information inputted on the CML Register screen is acquired from a session,
     *      criteria of {@link W2013ActionForm} of a CML Create screen It sets to {@link W2013CriteriaDomain}.
     *
     *  - セッションからCML Header画面で入力した情報を取得し、
     *    CML Create画面の{@link W2013ActionForm} の criteria {@link W2013CriteriaDomain} に設定する。
     *  
     *  - セッションからCML Register画面で入力した情報を取得し、
     *    CML Create画面の{@link W2013ActionForm} の criteria {@link W2013CriteriaDomain} に設定する。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws GscmApplicationException When a business error occurs during processing<br />処理中に業務的なエラーが発生した場合
     */
    protected W2013CriteriaDomain prepareCriteriaDomain(W2013ActionForm form) throws GscmApplicationException {
        
        // Acquisition of a search-condition domain
        // 検索条件ドメインの取得
        W2013CriteriaDomain criteriaDomain = form.getW2013CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // A setting of screen taking over information
        // 画面引継ぎ情報の設定
        String functionMode = form.getFunctionMode();
        criteriaDomain.setFunctionMode(form.getFunctionMode());
        criteriaDomain.setCallScreenId(form.getCallScreenId());
        
        // Backup of Transition-original-screen ID
        // 遷移元画面IDの退避
        String originalScreenId = form.getCallScreenId();
        criteriaDomain.setOriginalScreenId(originalScreenId); 

        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        
        // Setting of an initial value
        // When it changes from a CML Register (W2012) screen and a processing mode is registration (1)
        // 初期値の設定
        // CML Register(W2012)画面から遷移し、処理モードが登録(1)の場合
        if (SCREEN_ID_W2012.equals(originalScreenId) && W2009_CML_MODE_EDIT.equals(functionMode)) {
            
            // Acquisition of a Header information
            // Header情報の取得
            WindowInfoDomain w2010windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
            ScreenInfoDomain w2010screenInfo = w2010windowInfo.getScreenInfo().get(SCREEN_ID_W2010);
            W2010CriteriaDomain w2010Criteria = ((W2010ActionForm) w2010screenInfo.getActionForm()).getW2010CriteriaDomain();

            // A setting of a Header information
            // Header情報の設定
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w2010Criteria);
            
            // Acquisition of a Register information
            // Register情報の取得
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W2012);
            W2012ActionForm w2012Form = (W2012ActionForm) screenInfo.getActionForm();
            W2012CriteriaDomain w2012Criteria = w2012Form.getW2012CriteriaDomain();

            // A setting of a Register information
            // Register情報の設定
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w2012Criteria);

            // Authority information is set up.
            // 権限情報を設定
            String baseAuthFlg = AUTH_EMPTY_NUMERIC;
            if (userAuthService.hasBrowseAll()) {
                // Browse All
                baseAuthFlg = AUTH_BROWSE_NUMERIC;
            }
            if (userAuthService.hasRegisterAll()) {
                // In Register All, it overwrites.
                // Register All の場合、上書き。
                baseAuthFlg = AUTH_REGISTER_NUMERIC;
            }
            criteriaDomain.setBaseAuthFlg(baseAuthFlg);
            
            if (AUTH_REGISTER_NUMERIC.equals(baseAuthFlg)) {
                // In the case of Register All
                // Register Allの場合
                criteriaDomain.setUserAuthList(null);
            
            } else {
                // When this is not Register All
                // Register Allでない場合
                String[] permitFuncIdList = { PERMIT_FUNC_ID_W2009R, PERMIT_FUNC_ID_W2009B };
                List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
                
                if (userAuthList.size() == 0 && AUTH_EMPTY_NUMERIC.equals(baseAuthFlg)) {
                    throw new GscmApplicationException(GSCM_I0_0009);
                }
            }

            // Initial value setting in the case of register mode is performed (2.1).  
            // 登録モードの場合の初期値設定を行う(2.1)
            criteriaDomain.setPalletNo(w2012Criteria.getPalletNo());
            criteriaDomain.setShipperCd(w2010Criteria.getShipperCd());
            criteriaDomain.setCustomerCd(w2010Criteria.getCustomerCd());
            criteriaDomain.setLgcyShipTo(w2010Criteria.getLgcyShipTo());
            criteriaDomain.setTrnsCd(w2010Criteria.getTrnsCd());
            criteriaDomain.setPlntCd(w2010Criteria.getPlntCd());
            criteriaDomain.setLgcyWhCd(w2010Criteria.getLgcyWhCd());
            criteriaDomain.setPltzInstrNo(w2010Criteria.getPltzInstrNo());
            criteriaDomain.setPkgFormTyp(w2012Criteria.getPkgFormTyp());
            criteriaDomain.setInvoiceKey(w2012Criteria.getInvoiceKey());
            criteriaDomain.setContainerSortingKey(w2012Criteria.getContainerSortingKey());
            criteriaDomain.setExpPackingDt("");
            criteriaDomain.setExpPackingIssuerNm("");
            criteriaDomain.setMainMark("");
        } else if (SCREEN_ID_W2012.equals(originalScreenId) && W2009_CML_MODE_REF.equals(functionMode)) {
            // It changes from W2012-PKG Materials, and, in the case of reference mode, is.
            // W2012-PKG Materials から遷移し、参照モードの場合
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W2012);
            W2012ActionForm w2012Form = (W2012ActionForm) screenInfo.getActionForm();
            W2012CriteriaDomain w2012Criteria = w2012Form.getW2012CriteriaDomain();
            criteriaDomain.setMainMark(w2012Criteria.getMainMark());
            criteriaDomain.setManualRegFlg(w2012Criteria.getManualRegFlg()); // UT110 TRIAL SHIPMENT/号試品対応 ADD

        // UT304 MULTI LABEL ADD START
        } else if ("W2020".equals(originalScreenId) && W2009_CML_MODE_EDIT.equals(functionMode)) {
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get("W2020");
            W2020ActionForm w2020Form = (W2020ActionForm) screenInfo.getActionForm();
            W2020CriteriaDomain w2020CriteriaDomain = w2020Form.getW2020CriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w2020CriteriaDomain);
        // UT304 MULTI LABEL ADD END

        } else {
            // When it changes from W2019
            // W2019 から遷移した場合
            ScreenInfoDomain screenW2019Info = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W2019);
            W2019ActionForm w2019Form = (W2019ActionForm) screenW2019Info.getActionForm();
            W2019CriteriaDomain w2019Criteria = w2019Form.getW2019CriteriaDomain();
            criteriaDomain.setMainMark(w2019Criteria.getMainMark());
            criteriaDomain.setManualRegFlg(w2019Criteria.getManualRegFlg()); // UT110 TRIAL SHIPMENT/号試品対応 ADD
        }
        
        return criteriaDomain;
    }
        
    /**
     *    Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param listDomainList Search results<br />検索結果
     * @param criteria The domain of search-condition area<br />検索条件エリアのドメイン
     */
    protected void setSearchResult(W2013ActionForm form, List<? extends W2013ListDomain> listDomainList, W2013CriteriaDomain criteria) {
        
        W2013CriteriaDomain criteriaDomain = form.getW2013CriteriaDomain();

        // A setting of a Criteria domain
        // Criteriaドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, criteria);
        
        // A setting of a List domain
        // Listドメインの設定
        form.setListDomainList(listDomainList);
    }
    
    /**
     *    The specified message is set as {@link ActionMessages}.
     * <br />指定されたメッセージを{@link ActionMessages}に設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクションマッピング
     * @param messageId ID of the message to set up<br />設定するメッセージのID
     * @param args Message argument<br />メッセージ引数
     */
    protected void saveErrors(HttpServletRequest request, ActionMapping mapping, String messageId, Object[] args) {
        ActionMessages errors = new ActionMessages();
        errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        saveErrors(request, errors);
    }

    /**
     * Set screen button attributes. Set screen field attributes.
     * <br />ボタンの表示制御、項目の活性・非活性制御
     *
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     * @throws ApplicationException When an error occurs in DB processing<br />DB処理でエラーが発生した場合
     */
    protected void controlDisplay(W2013ActionForm form, HttpServletRequest request) throws ApplicationException {
        // Set screen button attributes.
        // ボタンの活性制御
        super.controlDisplay(request, form);
    }

}
