/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2005B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2005R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2018;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.gscm.framework.util.CheckUtil.isBlankOrNull;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2008InitFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Init action class of Multiple Item No. in 1Box PKG Register Screen
 * <br />小箱内多品番Register画面のInitアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2008.jsp
 *     - "error":W2008.jsp
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
public class W2008InitAction extends W2008AbstractAction {

    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected SearchFacadeService<List<? extends W2008ListDomain>, W2008CriteriaDomain> w2008InitFacadeService;

    /**
     * constructor.
     */
    public W2008InitAction() {
        super();
    }

    /**
     * Setter method for w2008InitFacadeService.
     *
     * @param searchFacadeService Set for w2008InitFacadeService
     */
    public void setW2008InitFacadeService(
        SearchFacadeService<List<? extends W2008ListDomain>, W2008CriteriaDomain> searchFacadeService) {
        w2008InitFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of action form
     *       A List domain is cleared.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2008CriteriaDomain}.
     *         - Screen common information
     *        - Transition-original-screen ID ({acquisition at @link W2008 ActionForm#getCallScreenId()})
     *         - Mix Tag No. (from a Main screen to the time of changes)
     *         Information on - Header screen (from a Create screen to the time of changes)
     *
     * - Execution of retrieval processing
     *       {@link W2008InitFacadeServiceImpl W2008InitFacadeServiceImpl#search (W2008CriteriaDomain)} is called for {@link W2008CriteriaDomain} to an argument.
     *
     *   [When search results are one or more affairs]
     *
     * - Setting of search results
     *       The above-mentioned result is set as {@link W2008ActionForm#w2008CriteriaDomain}.
     *       The above-mentioned result is set as {@link W2008ActionForm#listDomainList}.
     *
     * - Screen fields attributes
     *       Set screen field attributes {@link #controlDisplay (W2008ActionForm, HttpServletRequest)}.
     *
     *   [When the number of search results is zero]
     *
     * - It changes to a Transition original screen (in however, the case of the changes from W2018 of a SCREEN ID W2005 changes).
     *       {@link #saveErrors (HttpServletRequest, ActionMessages)} is called and an error message is set up.
     *       It changes to a Transition original screen.
     * 
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2008CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - 遷移元画面ID ({@link W2008ActionForm#getCallScreenId()}で取得
     *       - Mix Tag No. (Main画面から遷移時)
     *       - Header画面の情報 (Create画面から遷移時)
     *       
     * - 検索処理の実行
     *     {@link W2008CriteriaDomain}を引数に{@link W2008InitFacadeServiceImpl W2008InitFacadeServiceImpl#search(W2008CriteriaDomain)}を呼出す
     *     
     * [検索結果が1件以上の場合]
     * 
     * - 検索結果の設定
     *     上記の結果を{@link W2008ActionForm#w2008CriteriaDomain}に設定する
     *     上記の結果を{@link W2008ActionForm#listDomainList}に設定する
     *     
     * - 画面表示制御
     *     {@link #controlDisplay(W2008ActionForm, HttpServletRequest)}を呼出し、画面項目の活性制御を行う
     *     
     * [検索結果が0件の場合]
     * 
     * - 遷移元画面へ遷移(但し、画面IDがW2018からの遷移の場合はW2005に遷移)
     *     {@link #saveErrors(HttpServletRequest, ActionMessages)}を呼出し、エラーメッセージを設定する
     *     遷移元画面へ遷移する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Setting of action form
        // アクションフォームの設定
        W2008ActionForm w2008Form = prepareForm((W2008ActionForm) form);
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2008CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2008Form);
        
        // Execution of retrieval processing
        // 検索処理の実行
        List<? extends W2008ListDomain> listDomainList = w2008InitFacadeService.search(criteriaDomain);
        
        if (listDomainList != null && 0 < listDomainList.size()) {
            // Setting of search results
            // 検索結果の設定
            setSearchResult(w2008Form, listDomainList);
            
            // Display of the warning MSG
            // 警告MSGの表示
            saveWarnigMsges(request, mapping, listDomainList, criteriaDomain);
            
            // Screen fields attributes
            // 画面表示制御
            controlDisplay(w2008Form, request);
            
            return FORWARD_SUCCESS;
            
        } else {
            // Setting of an error message
            // エラーメッセージの設定
            saveErrors(request, mapping, GSCM_E0_0001, null);
            
            // It changes to a Transition original screen.
            // 遷移元画面に遷移
            if(SCREEN_ID_W2018.equals(w2008Form.getCallScreenId())){
                if(!isBlankOrNull(w2008Form.getMixTagNo())){
                    return SCREEN_ID_W2005;
                }
                return SCREEN_ID_W2007;
            }
            return w2008Form.getCallScreenId();
        }
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W2008ActionForm prepareForm(W2008ActionForm form) {
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
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws GscmApplicationException When an user authority information is not able to be acquired<br />ユーザ権限情報が取得できなかった場合
     */
    protected W2008CriteriaDomain prepareCriteriaDomain(W2008ActionForm form) throws GscmApplicationException {
        W2008CriteriaDomain criteriaDomain = form.getW2008CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Set transition original screen id
        // 遷移元画面IDの設定
        criteriaDomain.setCallScreenId(form.getCallScreenId());
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
        
        // From a Main screen to the time of changes
        // Main画面から遷移時
        if (SCREEN_ID_W2005.equals(form.getCallScreenId())) {
            // A setting of Mix Tag No.
            // Mix Tag No.の設定
            criteriaDomain.setMixTagNo(form.getMixTagNo());
            
        // From a Detail screen to the time of changes
        // Detail画面から遷移時 
        } else if(SCREEN_ID_W2018.equals(form.getCallScreenId())){
            
            // If there is Mix Tag No., it will set to a data retrieval condition domain.
            // Mix Tag No.があれば、データ検索条件ドメインにセット
            if(!isBlankOrNull(form.getMixTagNo())){
                criteriaDomain.setMixTagNo(form.getMixTagNo());
            
            } else {
                
                ScreenInfoDomain W2006screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W2006);
                // Acquisition of a Header information
                // Header情報の取得
                W2006ActionForm w2006Form = (W2006ActionForm) W2006screenInfo.getActionForm();
                W2006CriteriaDomain headerInfo = w2006Form.getW2006CriteriaDomain();
                // A setting of a Header information
                // Header情報の設定
                CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, headerInfo);
                
            }
            
        // From a Create screen to the time of changes
        // Create画面から遷移時
        } else {
            
            // Acquisition of a screen common information
            // 画面共通情報の取得
            ScreenInfoDomain W2006screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W2006);
            // Acquisition of a Header information
            // Header情報の取得
            W2006ActionForm w2006Form = (W2006ActionForm) W2006screenInfo.getActionForm();
            W2006CriteriaDomain headerInfo = w2006Form.getW2006CriteriaDomain();
            // A setting of a Header information
            // Header情報の設定
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, headerInfo);
            
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
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2005R, PERMIT_FUNC_ID_W2005B };
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
     */
    protected void setSearchResult(W2008ActionForm form, List<? extends W2008ListDomain> listDomainList) {
        
        W2008CriteriaDomain criteriaDomain = form.getW2008CriteriaDomain();
        
        // A setting of a Criteria domain
        // Criteriaドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, listDomainList.get(0));
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
}
