/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2013;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

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
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2012InitFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *    This is an initial display action class of a CML Register screen.
 * <br />CML Register画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2012.jsp
 *     - "error":W2012.jsp
 *     - "W2011":/W2011Search.do
 *     - "W2009":/W2009Search.do
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class W2012InitAction extends W2012AbstractAction {
    
    /**
     * Init Facade service
     * <br />Init Facade サービス
     */
    protected SearchFacadeService<List<? extends W2012ListDomain>, W2012CriteriaDomain> w2012InitFacadeService;

    /**
     * constructor.
     */
    public W2012InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return true;
    }
    
    /**
     * Setter method for w2012InitFacadeService.
     * 
     * @param initFacadeService Set for w2012InitFacadeService
     */
    public void setW2012InitFacadeService(
        SearchFacadeService<List<? extends W2012ListDomain>, W2012CriteriaDomain> initFacadeService) {
        w2012InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of action form
     *       A List domain is cleared.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2012CriteriaDomain}.
     *         - Screen common information
     *        - Transition-original-screen ID (acquisition at {@link W2012ActionForm#getCallScreenId()})
     *         - CML No. (from a Main screen to the time of changes)
     *         Information on - Header screen (from a Create screen to the time of changes)
     *
     * - Execution of retrieval processing
     *       {@link W2012InitFacadeServiceImpl W2012InitFacadeServiceImpl#search(W2012CriteriaDomain)} is called for {@link W2012CriteriaDomain} to an argument.
     *
     *   [When search results are one or more affairs]
     *
     * - Setting of search results
     *       {@link #setSearchResult(W2012ActionForm, List, W2012CriteriaDomain)} is called,
     *       The data displayed on a screen is set up.
     *
     * - Screen fields attributes
     *       Set screen field attributes {@link #controlDisplay(HttpServletRequest, W2012ActionForm)}.
     *
     *   [When the number of search results is zero]
     *
     * - It changes to a Transition original screen.
     *       {@link #saveErrors(HttpServletRequest, ActionMessages)} is called and an error message is set up.
     *       It changes to a Transition original screen.
     *
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2012CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - 遷移元画面ID ({@link W2012ActionForm#getCallScreenId()}で取得)
     *       - CML No. (Main画面から遷移時)
     *       - Header画面の情報 (Create画面から遷移時)
     *       
     * - 検索処理の実行
     *     {@link W2012CriteriaDomain}を引数に{@link W2012InitFacadeServiceImpl W2012InitFacadeServiceImpl#search(W2012CriteriaDomain)}を呼出す
     *     
     * [検索結果が1件以上の場合]
     * 
     * - 検索結果の設定
     *     {@link #setSearchResult(W2012ActionForm, List, W2012CriteriaDomain)}を呼出し、
     *     画面に表示するデータを設定する
     *     
     * - 画面表示制御
     *     {@link #controlDisplay(HttpServletRequest, W2012ActionForm)}を呼出し、画面項目の活性制御を行う
     *     
     * [検索結果が0件の場合]
     * 
     * - 遷移元画面へ遷移
     *     {@link #saveErrors(HttpServletRequest, ActionMessages)}を呼出し、エラーメッセージを設定する
     *     遷移元画面へ遷移する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        String functionMode = (String)request.getAttribute("functionMode");
        String mainMark = (String)request.getAttribute("mainMark");
        
        // Setting of action form
        // アクションフォームの設定
        W2012ActionForm w2012Form = prepareForm((W2012ActionForm)form);
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2012CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2012Form, functionMode, mainMark);
        
        // Execution of retrieval processing
        // 検索処理の実行
        List<? extends W2012ListDomain> listDomainList = (List<? extends W2012ListDomain>)w2012InitFacadeService.search(criteriaDomain);
        
        if (listDomainList != null && 0 < listDomainList.size()) {
            // Setting of search results
            // 検索結果の設定
            setSearchResult(w2012Form, listDomainList, criteriaDomain);

            // A setting of warning message
            // 警告メッセージの設定
            if (W2009_CML_MODE_EDIT.equals(functionMode)) {
                saveWarnigMsges(request, mapping, listDomainList, criteriaDomain);
            }
            
            // Screen fields attributes
            // Display control of a Main screen
            // 画面表示制御
            // Main画面の表示制御
            controlDisplay((W2012ActionForm)form, request);
            
            return FORWARD_SUCCESS;
            
        } else {
            // Setting of an error message
            // エラーメッセージの設定
            saveErrors(request, mapping, GSCM_E0_0001, null);
            
            if (W2009_CML_MODE_EDIT.equals(functionMode)) {
                return SCREEN_ID_W2011;
            } else {
                return SCREEN_ID_W2009;
            }
        }
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
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W2012ActionForm prepareForm(W2012ActionForm form) {
        // The clearance of a List domain
        // Listドメインのクリア 
        form.setListDomainList(null);
        return form;
    }

    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param functionMode Function mode<br />ファンクションモード
     * @param mainMark MAIN MARK<br />メインマーク
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws GscmApplicationException When an user authority information is not able to be acquired<br />ユーザ権限情報が取得できなかった場合
     */
    protected W2012CriteriaDomain prepareCriteriaDomain(W2012ActionForm form, String functionMode, String mainMark) throws GscmApplicationException {
        
        W2012CriteriaDomain criteriaDomain = form.getW2012CriteriaDomain();
        criteriaDomain.setFunctionMode(functionMode);
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Set transition original screen id
        // 遷移元画面IDの設定
        criteriaDomain.setCallScreenId(form.getCallScreenId());
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        
        if (W2009_CML_MODE_EDIT.equals(functionMode)) {
            
            // A setting of a Header information
            // Header情報の設定
            ScreenInfoDomain w2010ScreenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2010);
            W2010CriteriaDomain w2010Criteria = ((W2010ActionForm) w2010ScreenInfo.getActionForm()).getW2010CriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w2010Criteria);

            // From a CML Create screen to the time of changes
            // CML Create画面から遷移時
            if (SCREEN_ID_W2011.equals(form.getCallScreenId())) {

                criteriaDomain.setOuterPkgCd("");
                criteriaDomain.setPackagingConfirmedFlg(FLAG_N);
            }
            
            // From a PKG Info Detail screen to the time of changes
            // PKG Info Detail画面から遷移時
            if (SCREEN_ID_W2013.equals(form.getCallScreenId())) {

                criteriaDomain.setPackagingConfirmedFlg(FLAG_Y);
            }        
        } else if (W2009_CML_MODE_REF.equals(functionMode)){
            // From a Main screen to the time of changes
            // Main画面から遷移時
            if (SCREEN_ID_W2009.equals(form.getCallScreenId())) {
                
                criteriaDomain.setMainMark(mainMark);
                criteriaDomain.setPackagingConfirmedFlg("");
            }
            // From a PKG Info Detail screen to the time of changes
            // PKG Info Detail画面から遷移時
            if (SCREEN_ID_W2013.equals(form.getCallScreenId())) {
                
                criteriaDomain.setMainMark(form.getW2012CriteriaDomain().getMainMark());
                criteriaDomain.setPackagingConfirmedFlg("");
            }
        }
        
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
            criteriaDomain.setUserAuthList(userAuthList);
        }

        return criteriaDomain;
    }
    

    /**
     *    Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param listDomainList Search results<br />検索結果
     * @param criteria Search-condition domain<br />検索条件ドメイン
     */
    protected void setSearchResult(W2012ActionForm form, List<? extends W2012ListDomain> listDomainList, W2012CriteriaDomain criteria) {
        
        // A setting of a Criteria domain
        // Criteriaドメインの設定
        W2012CriteriaDomain criteriaDomain = form.getW2012CriteriaDomain();
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
     * <br />ボタンの表示制御、項目の活性・非活性制御する。
     *
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(W2012ActionForm form, HttpServletRequest request) {
        // Set screen button attributes.
        // ボタンの活性制御
        super.controlDisplay(request, form);
    }
}
