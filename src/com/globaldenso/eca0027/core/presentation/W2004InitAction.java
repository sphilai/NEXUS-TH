/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W2002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2004ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2004InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is an initial display action class of a Packaging Instruction (=Pull) Register screen.
 * <br />梱包指示Register画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2004.jsp
 *     - "error":W2004.jsp
 *     - "W2001":/W2001Search.do
 *     - "W2003":/W2003Search.do
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004InitAction extends W2004AbstractAction {

    /**
     * Initial display Facade service
     * <br />初期表示Facadeサービス
     */
    protected SearchFacadeService<List<W2004ListDomain>, W2004CriteriaDomain> w2004InitFacadeService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2004InitAction() {
        super();
    }

    /**
     * Setter method for w2004InitFacadeService.
     *
     * @param initFacadeService Set for w2004InitFacadeService
     */
    public void setW2004InitFacadeService(
        SearchFacadeService<List<W2004ListDomain>, W2004CriteriaDomain> initFacadeService) {
        w2004InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Setting of action form
     *       A List domain is cleared.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2004CriteriaDomain}.
     *         - Screen common information
     *         - Transition-original-screen ID (acquisition at {@link W2004ActionForm#getCallScreenId()})
     *         - Packaging Instruction (=Pull) NO (from a Main screen to the time of changes)
     *         - Information on Header screen (from a Create screen to the time of changes)
     *
     * - Execution of retrieval processing
     *       {@link W2004InitFacadeServiceImpl W2004InitFacadeServiceImpl#} is called for {@link W2004CriteriaDomain} to an argument.
     *
     *   [When search results are one or more affairs]
     *
     * - Setting of search results
     *       The above-mentioned result is set as {@link W2004ActionForm} list domain.
     *       The contents of head data are set as {@link W2004ActionForm} criteria domain.
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
     *     以下の情報を{@link W2004CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - 遷移元画面ID ({@link W2004ActionForm#getCallScreenId()}で取得
     *       - 梱包指示NO (Main画面から遷移時)
     *       - Header画面の情報 (Create画面から遷移時)
     *       
     * - 検索処理の実行
     *     {@link W2004CriteriaDomain}を引数に{@link W2004InitFacadeServiceImpl W2004InitFacadeServiceImpl#search(W2004CriteriaDomain)}を呼出す
     *     
     * [検索結果が1件以上の場合]
     * 
     * - 検索結果の設定
     *     上記の結果を{@link W2004ActionForm}のリストドメインに設定する
     *     先頭データの内容を{@link W2004ActionForm}の検索条件ドメインに設定する
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
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Setting of action form
        // アクションフォームの設定
        W2004ActionForm w2004Form = prepareForm((W2004ActionForm) form);
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2004CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2004Form);
        
        // Execution of retrieval processing
        // 検索処理の実行
        List<W2004ListDomain> listDomainList = w2004InitFacadeService.search(criteriaDomain);
        
        if (0 < listDomainList.size()) {
            // Setting of search results
            // 検索結果の設定
            setSearchResult(w2004Form, listDomainList);
            
            return FORWARD_SUCCESS;
            
        } else {
            // Setting of an error message
            // エラーメッセージの設定
            saveErrors(request, mapping, GSCM_E0_0001, null);
            
            // It changes to a Transition original screen.
            // 遷移元画面に遷移
            return w2004Form.getCallScreenId();
        }
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W2004ActionForm prepareForm(W2004ActionForm form) {
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
     */
    protected W2004CriteriaDomain prepareCriteriaDomain(W2004ActionForm form) {
        W2004CriteriaDomain criteriaDomain = form.getW2004CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Set transition original screen id
        // 遷移元画面IDの設定
        criteriaDomain.setCallScreenId(form.getCallScreenId());

        // From a Main screen to the time of changes
        // Main画面から遷移時
        if (SCREEN_ID_W2001.equals(form.getCallScreenId())) {
            // Setting of Packaging Instruction (=Pull) NO
            // 梱包指示NOの設定
            criteriaDomain.setPltzInstrNo(form.getPltzInstrNo());
            
        // From a Create screen to the time of changes
        // Create画面から遷移時
        } else {
            // Acquisition of a screen common information
            // 画面共通情報の取得
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W2002);

            // Acquisition of a Header information
            // Header情報の取得
            W2002ActionForm w2002Form = (W2002ActionForm) screenInfo.getActionForm();
            W2002CriteriaDomain headerInfo = w2002Form.getW2002CriteriaDomain();
        
            // setting of a Header information
            // Header情報の設定
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, headerInfo);
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
    protected void setSearchResult(W2004ActionForm form, List<W2004ListDomain> listDomainList) {
        
        W2004CriteriaDomain criteriaDomain = form.getW2004CriteriaDomain();

        // setting of a Criteria domain
        // Criteriaドメインの設定
        if (SCREEN_ID_W2001.equals(form.getCallScreenId())) {
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, listDomainList.get(0));
        } else {
            criteriaDomain.setCollateMethTyp(listDomainList.get(0).getCollateMethTyp());
        }

        // setting of a List domain
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
