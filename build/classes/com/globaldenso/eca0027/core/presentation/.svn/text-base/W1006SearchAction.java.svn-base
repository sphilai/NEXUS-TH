/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1006B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1006R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W1006SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 *    This is a search action class of a Export Request [Register & Print Request] Main screen.
 * <br />梱包指示Main画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1006.jsp
 *     - "error":W1006.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W1006SearchAction extends W1006AbstractAction {

    /**
     * Search Facade service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W1006ListDomain>, W1006CriteriaDomain> w1006SearchFacadeService;
    
    /**
     * Constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1006SearchAction() {
        super();
    }

    /**
     * Setter method for w1006SearchFacadeService.
     *
     * @param searchFacadeService Set for w1006SearchFacadeService
     */
    public void setW1006SearchFacadeService(
        SearchFacadeService<List<? extends W1006ListDomain>, W1006CriteriaDomain> searchFacadeService) {
        w1006SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - If the back button was pressed
     *   No Action. (Re-display the screen stack info)
     *   
     * - Otherwise
     *   - Setting of action form
     *         A List domain is cleared.
     *         The maximum search number is set up.
     *
     *   - Setting of a search-condition domain
     *         The following informations are set as {@link W1006CriteriaDomain}.
     *           - Screen common information
     *           - Information required for page control
     *           - User functional utilization right
     *           - A login person's DSC-ID (when the VALUE of Issuer is {@link Eca0027Constants#ISSUER_ID_YOURSELF})  
     *
     *   - Execution of retrieval processing
     *         This is a call about {@link W1006SearchFacadeServiceImpl W1006SearchFacadeServiceImpl#search(W1006CriteriaDomain)} to an argument in {@link W1006CriteriaDomain}.
     *
     *   - Setting of search results
     *         The above-mentioned result is set as a list domain.
     * 
     * - 戻るボタン押下時
     *     何もしない (スタックされた画面情報を再表示)
     * 
     * - 上記以外の場合
     *   - アクションフォームの設定
     *       Listドメインをクリアする
     *       最大検索件数を設定する
     *     
     *   - 検索条件ドメインの設定
     *       以下の情報を{@link W1006CriteriaDomain}に設定する
     *         - 画面共通情報
     *         - ページ制御に必要な情報
     *         - ユーザ機能利用権限
     *         - ログイン者のDSC-ID (Issuerの値が{@link Eca0027Constants#ISSUER_ID_YOURSELF}の場合)
     * 
     *   - 検索処理の実行
     *       {@link W1006CriteriaDomain}を引数に{@link W1006SearchFacadeServiceImpl W1006SearchFacadeServiceImpl#search(W1006CriteriaDomain)}を呼び出す
     *     
     *   - 検索結果の設定
     *       上記の結果をリストドメインに設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        if (!isBack(request)) {
            // Setting of action form
            // アクションフォームの設定
            W1006ActionForm w1006Form = prepareForm((W1006ActionForm) form);
            
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W1006CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w1006Form);
            
            // Execution of retrieval processing
            // 検索処理の実行
            List<? extends W1006ListDomain> listDomainList = w1006SearchFacadeService.search(criteriaDomain);
            
            // Get Request Status
            if(listDomainList != null && listDomainList.size() > 0)
            {
                W1006ListDomain domain = listDomainList.get(0);
                criteriaDomain.setRequestStatus(domain.getRequestStatus());
            }
            // Setting Total ID Tag
            if(listDomainList != null){
                int count = setTotalIDTag(listDomainList);
                criteriaDomain.setTotalIdTag(String.valueOf(count));
            }
            
            // Setting of search results
            // 検索結果の設定
            w1006Form.setListDomainList(listDomainList);
            w1006Form.setW1006CriteriaDomain(criteriaDomain);
        }
        
        return FORWARD_SUCCESS;
    }
    /**
     * Setting Total ID Tag
     * 
     *
     * @param listDomainList W1006ListDomain
     * @return count int
     */
    protected int setTotalIDTag(List<? extends W1006ListDomain> listDomainList) {
        int count = 0;
        for(W1006ListDomain domain : listDomainList)
        {
            if(domain.isHaveCheckBox())
            {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Check if the back button was pressed
     * <br />戻るボタンによる画面遷移かどうかを判定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return true if the back button was pressed, otherwise false<br />戻るボタンによる画面遷移であればtrue、それ以外はfalse
     */
    protected boolean isBack(HttpServletRequest request) {
        return Boolean.valueOf(request.getParameter("back"));
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W1006ActionForm prepareForm(W1006ActionForm form) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        if (!form.getCallScreenId().equals(SCREEN_ID_W1006)) {
            form.setFromScreenId(form.getCallScreenId());
        }
        
        return form;
    }
    
    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクション・マッピング
     * @param form Action form<br />アクション・フォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When there is no authority of a Packaging Instruction (=Pull)<br />梱包指示の権限がない場合
     */
    protected W1006CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W1006ActionForm form) 
        throws ApplicationException {
        
        W1006CriteriaDomain criteriaDomain = form.getW1006CriteriaDomain();
        
        // Acquisition of a Header information
        // Header情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1003);
        
        if(screenInfo != null){
            W1003CriteriaDomain w1003CriteriaDomain = ((W1003ActionForm) screenInfo.getActionForm()).getW1003CriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w1003CriteriaDomain);
        }else if( form.getCallScreenId() != null &&  form.getCallScreenId().equalsIgnoreCase("w1007")){//ISSUE 084
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1007);
            W1007CriteriaDomain w1007CriteriaDomain = ((W1007ActionForm) screenInfo.getActionForm()).getW1007CriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w1007CriteriaDomain);
        }else {
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1001);
            W1001CriteriaDomain w1001CriteriaDomain = ((W1001ActionForm) screenInfo.getActionForm()).getW1001CriteriaDomain();
            if (!CheckUtil.isBlankOrNull(w1001CriteriaDomain.getSelected()) && ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList() != null && ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().size() > 0) {
                int selectedRow = Integer.parseInt(w1001CriteriaDomain.getSelected());
                W1001ListDomain w100ListDomain = ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().get(selectedRow);
                // Copy properties domain to domain
                CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w100ListDomain);
            }
        }
        
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Page control processing
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // Setting of authority
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W1006R, PERMIT_FUNC_ID_W1006B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        return criteriaDomain;
    }
}
