/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2014;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2017UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2017InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Init action class of X-tag Register
 * <br />X-tag Register画面のInitアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2017.jsp
 *     - "error":W2017.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11243 $
 */
public class W2017InitAction extends W2017AbstractAction {

    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected SearchFacadeService<W2017UpdateDomain, W2017UpdateDomain> w2017InitFacadeService;
    
    /**
     * constructor.
     */
    public W2017InitAction() {
        super();
    }

    /**
     * Setter method for w2017InitFacadeService.
     *
     * @param initFacadeService Set for initFacadeService
     */
    public void setW2017InitFacadeService(
        SearchFacadeService<W2017UpdateDomain, W2017UpdateDomain> initFacadeService) {
        w2017InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of action form
     *       A List domain is cleared.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2017UpdateDomain}.
     *         - Screen common information
     *        - Transition-original-screen ID ({acquisition at @link W2017 ActionForm#getCallScreenId()})
     *         - X-Tag No. (from a Main screen to the time of changes)
     *         Information on - Header screen (from a Create screen to the time of changes)
     *
     * - Execution of retrieval processing
     *       {@link W2017InitFacadeServiceImpl W2017InitFacadeServiceImpl#search (W2017UpdateDomain)} is called for {@link W2017UpdateDomain} to an argument.
     *
     *   [When search results are one or more affairs]
     *
     * - Setting of search results
     *       The above-mentioned result is set as {@link W2017ActionForm#w2017ListDomainList}.
     *       The above-mentioned result is set as {@link W2017ActionForm#w2017CriteriaDomain}.
     *
     *   [When the number of search results is zero]
     *
     * - It changes to a Transition original screen.
     *       {@link #saveErrors (HttpServletRequest, ActionMessages)} is called and an error message is set up.
     *       It changes to a Transition original screen.
     * 
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2017UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 遷移元画面ID ({@link W2017ActionForm#getCallScreenId()}で取得
     *       - X-Tag No. (Main画面から遷移時)
     *       - Header画面の情報 (Create画面から遷移時)
     *       
     * - 検索処理の実行
     *     {@link W2017UpdateDomain}を引数に{@link W2017InitFacadeServiceImpl W2017InitFacadeServiceImpl#search(W2017UpdateDomain)}を呼出す
     *     
     * [検索結果が1件以上の場合]
     * 
     * - 検索結果の設定
     *     上記の結果を{@link W2017ActionForm#w2017ListDomainList}に設定する
     *     上記の結果を{@link W2017ActionForm#w2017CriteriaDomain}に設定する
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

        // Setting of action form
        // アクションフォームの設定
        W2017ActionForm w2017Form = prepareForm((W2017ActionForm) form);
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2017CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2017Form);
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        W2017UpdateDomain updateDomain = new W2017UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        
        try {
            // Execution of retrieval processing
            // 検索処理の実行
            W2017UpdateDomain resultDomain = w2017InitFacadeService.search(updateDomain);
            
            if (0 < resultDomain.getListDomainList().size()) {
                // Setting of search results
                // 検索結果の設定
                setSearchResult(w2017Form, resultDomain);
                
                return FORWARD_SUCCESS;
                
            } else {
                // Setting of an error message
                // エラーメッセージの設定
                saveErrors(request, mapping, GSCM_E0_0001, null);
                
                // It changes to a Transition original screen.
                // 遷移元画面に遷移
                return w2017Form.getCallScreenId();
            }
        } catch (GscmApplicationException e) {
            if (NXS_E7_0157.equals(e.getCode())) {
                if (SCREEN_ID_W2014.equals(w2017Form.getCallScreenId()) 
                    || SCREEN_ID_W2016.equals(w2017Form.getCallScreenId())) {
                    saveErrors(request, mapping, e.getCode(), e.getArgs());
                    return w2017Form.getCallScreenId();
                }
                throw e;
            } else {
                throw e;
            }
        }
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W2017ActionForm prepareForm(W2017ActionForm form) {
        // The clearance of a List domain
        // Listドメインのクリア 
        form.setW2017ListDomainList(null);
        
        return form;
    }

    /**
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
        
        // Set transition original screen id
        // 遷移元画面IDの設定
        criteriaDomain.setCallScreenId(form.getCallScreenId());

        // From a Main screen to the time of changes
        // Main画面から遷移時
        if (SCREEN_ID_W2014.equals(form.getCallScreenId())) {
            // Acquisition of a screen common information
            // 画面共通情報の取得
            criteriaDomain.setXmainMark(((W2017ActionForm)form).getXmainMark());
            
        // From a Create screen to the time of changes
        // Create画面から遷移時
        } else {
            // Acquisition of a screen common information
            // 画面共通情報の取得
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W2015);

            // form acquisition of a Header screen
            // Header画面のform取得
            W2015ActionForm w2015Form = (W2015ActionForm) screenInfo.getActionForm();
        
            // A setting of a Header information
            // Header情報の設定
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w2015Form.getW2015CriteriaDomain());
        }
        
        return criteriaDomain;
    }
    
    /**
     *    Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param updateDomain Search results<br />検索結果
     */
    protected void setSearchResult(W2017ActionForm form, W2017UpdateDomain updateDomain) {
        
        form.setW2017CriteriaDomain(updateDomain.getCriteriaDomain());
        form.setW2017ListDomainList(updateDomain.getListDomainList());
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
