/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7003;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W7002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7004InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial display of class action Shipping Actuality Register screen.
 * <br />船積実績Register画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W7004
 *     - "error":W7004
 *     - "W7001":/W7001Search.do
 *     - "W7003":/W7003Search.do
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004InitAction extends W7004AbstractAction {

    /**
     * Initial display FacadeService<br />
     * 初期表示 FacadeService
     */
    protected SearchFacadeService<W7004UpdateDomain, W7004CriteriaDomain> w7004InitFacadeService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004InitAction() {
        super();
    }

    /**
     * Setter method for w7004InitFacadeService.
     *
     * @param initFacadeService Set for w7004InitFacadeService
     */
    public void setW7004InitFacadeService(SearchFacadeService<W7004UpdateDomain, W7004CriteriaDomain> initFacadeService) {
        w7004InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Setting of Action form
     *   Clear the List domain list.
     *
     * - Set of search criteria domain
     *   The following information {@link W7004CriteriaDomain} Set to.
     *    - Screen information common
     *    - Processing mode
     *        If transition from the Create screen: a new mode
     *        If transition from the Main screen: correction mode
     *    - (Transition from the Main screen) Shipping Actuality No
     *    - Header information on the screen
     *
     * - The execution of the search process
     *   {@link W7004CriteriaDomain} an argument Call {@link W7004InitFacadeServiceImpl}
     *
     * [Search If the result is 1 or more]
     *
     * - Set of search results
     *
     * [Search If the result is 0 Listings]
     *
     * - Transition to transition source screen
     * </pre>
     * <pre>
     * ‐アクションフォームの設定
     *     Listドメインリストをクリアします。
     * 
     * ‐検索条件ドメインの設定
     *     以下の情報を{@link W7004CriteriaDomain}に設定します。
     *         ‐画面共通情報
     *         ‐処理モード
     *             新規モード：Create画面から遷移した場合
     *             修正モード：Main画面から遷移した場合
     *         ‐船積実績No（Main画面から遷移時）
     *         ‐Header画面の情報
     * 
     * ‐検索処理の実行
     *     {@link W7004CriteriaDomain}を引数に{@link W7004InitFacadeServiceImpl}を呼出す
     * 
     * [検索結果が1件以上の場合]
     * 
     * ‐検索結果の設定
     * 
     * [検索結果が0件の場合]
     * 
     * ‐遷移元画面へ遷移
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7004ActionForm w7004Form = prepareForm((W7004ActionForm) form);
        
        W7004CriteriaDomain criteriaDomain = prepareCriteriaDomain(w7004Form);
        
        W7004UpdateDomain updateDomain = w7004InitFacadeService.search(criteriaDomain);
        
        if(updateDomain.getListDomainList() != null) {
            setSearchResult(w7004Form, updateDomain);
            return FORWARD_SUCCESS;
        } else {
            saveErrors(request, mapping, GSCM_E0_0001, null);
            return w7004Form.getCallScreenId();
        }
    }
    
    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     *
     * @param form of action form Shipping Actuality Register screen<br />船積実績Register画面のアクションフォーム
     * @return Action Form<br />アクションフォーム
     */
    protected W7004ActionForm prepareForm(W7004ActionForm form) {
        form.setListDomainList(null);
        
        if (SCREEN_ID_W7001.equals(form.getCallScreenId()) || SCREEN_ID_W7003.equals(form.getCallScreenId())) {
            form.getW7004CriteriaDomain().setOriginalScreenId(form.getCallScreenId());
        }
        
        return form;
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param form of action form Shipping Actuality Register screen<br />船積実績Register画面のアクションフォーム
     * @return Search conditions domain<br />検索条件ドメイン
     */
    protected W7004CriteriaDomain prepareCriteriaDomain(W7004ActionForm form) {
        W7004CriteriaDomain criteriaDomain = form.getW7004CriteriaDomain();
        
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        criteriaDomain.setCallScreenId(form.getCallScreenId());
        
        if (SCREEN_ID_W7003.equals(form.getCallScreenId()))  {
            criteriaDomain.setProcMode(MODE_NEW);
        } else {
            criteriaDomain.setProcMode(MODE_EDIT);
        }
        // Get form data from the previous screen.
        // 画面共通情報の取得
        if (SCREEN_ID_W7001.equals(form.getCallScreenId())) {
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W7001);
            W7001ActionForm w7001Form = (W7001ActionForm) screenInfo.getActionForm();
            
            criteriaDomain.setShippingActNo(w7001Form.getShippingActNo());
        } else if (SCREEN_ID_W7003.equals(form.getCallScreenId())) {
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W7002);
            
            W7002ActionForm w7002Form = (W7002ActionForm) screenInfo.getActionForm();
            W7002CriteriaDomain headerInfo = w7002Form.getW7002CriteriaDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, headerInfo);    
        }
        
        return criteriaDomain;
    }

    /**
     * Set the search results.
     * <br />検索結果を設定します。
     *
     * @param form of action form Shipping Actuality Register screen<br />船積実績Register画面のアクションフォーム
     * @param updateDomain mass update domain<br />一括更新ドメイン
     */
    protected void setSearchResult(W7004ActionForm form, W7004UpdateDomain updateDomain) {
        W7004CriteriaDomain criteriaDomain = form.getW7004CriteriaDomain();
                
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, updateDomain.getCriteriaDomain());
        
        form.setListDomainList(updateDomain.getListDomainList());
    }
    
    /**
     * The specified message {@link ActionMessages} Set to.
     * <br />指定されたメッセージを{@link ActionMessages}に設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクションマッピング
     * @param messageId  ID of the message to be set<br />設定するメッセージのID
     * @param args message argument<br />メッセージ引数
     */
    protected void saveErrors(HttpServletRequest request, ActionMapping mapping, String messageId, Object[] args) {
        ActionMessages errors = new ActionMessages();
        errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        saveErrors(request, errors);
    }
}
