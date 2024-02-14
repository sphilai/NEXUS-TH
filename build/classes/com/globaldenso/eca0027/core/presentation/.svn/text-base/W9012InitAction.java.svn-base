/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9012;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W9011ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9012ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial action class of CIGMA Customer No. X-Reference MA Edit Screen.
 * <br />CIGMA Customer No. X-Reference MA Edit画面の初期表示アクションです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9012.jsp
 *     - "error":w9012.jsp
 * </pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7885 $
 */
public class W9012InitAction extends W9012AbstractAction {

    /**
     * Initial display Facade Service/初期表示Facadeサービス
     */
    protected SearchFacadeService<List<W9012ListDomain>, W9012CriteriaDomain> w9012InitFacadeService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9012InitAction() {
        super();
    }

    /**
     * Setter method for w9012InitFacadeService.
     *
     * @param initFacadeService Set for w9012InitFacadeService
     */
    public void setW9012InitFacadeService(
        SearchFacadeService<List<W9012ListDomain>, W9012CriteriaDomain> initFacadeService) {
        w9012InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Process of Search.
     * - Set action form.
     * - Get screen common information domain.
     * - Set of common information screen.
     * - Button activity control.
     * - Set search criteria.
     * - In the case of correction mode or reference mode.
     *     - Get handover items.
     *     - Run a search process.
     *     - - Call the w9012InitFacadeService.search an argument criteriaDomain.
     *         - When search results are obtained.
     *             - Set the search results.
     *         - When search results are 0.
     *             - Set the error message.
     *             - The transition to transition source screen.
     * - In the case of the new mode.
     *     - Clear search results.
     * 
     * 検索処理
     * - アクションフォームを設定する。
     * - 画面共通情報ドメインを取得する。
     * - 画面共通情報を設定する。
     * - ボタン活性制御をする。
     * - 検索条件を設定する。
     * - 修正モードまたは、参照モードの場合
     *     - 引継値を取得する。
     *     - 検索処理を実行する。
     *     - criteriaDomainを引数にw9012InitFacadeService.searchを呼び出す。
     *         - 検索結果を取得した場合
     *             - 検索結果を設定する。
     *         - 検索結果が0の場合
     *             - エラーメッセージを設定する。
     *             - 遷移元画面に遷移する。
     * - 新規モードの場合
     *     - 検索結果をクリアする。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #invokeExecute(org.apache.struts.action.ActionMapping,
     *                     org.apache.struts.action.ActionForm, 
     *                     javax.servlet.http.HttpServletRequest,
     *                     javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Set action form.
        W9012ActionForm w9012Form = prepareForm((W9012ActionForm) form);

        // Get screen common information domain.
        WindowInfoDomain windowInfo =
            (WindowInfoDomain)DensoContext.get().getGeneralArea(w9012Form.getWindowId());
        Map<String, ScreenInfoDomain> screenInfo =
            (Map<String, ScreenInfoDomain>)windowInfo.getScreenInfo();
        ScreenInfoDomain screenInfoDomain = screenInfo.get(SCREEN_ID_W9012);

        if (screenInfoDomain == null) {
            screenInfoDomain = new ScreenInfoDomain();
        }

        // Set of common information screen.
        screenInfo.put(SCREEN_ID_W9012, screenInfoDomain);

        // Button activity control.
        controlDisplay(request, w9012Form);

        // Set search criteria.
        W9012CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9012Form);

        // Get handover items.
        ScreenInfoDomain w9011ScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo()
            .get(SCREEN_ID_W9011);
        W9011ActionForm w9011Form = (W9011ActionForm) w9011ScreenInfo.getActionForm();

        if (MODE_EDIT.equals(w9012Form.getW9012CriteriaDomain().getProcMode()) 
            || MODE_REF.equals(w9012Form.getW9012CriteriaDomain().getProcMode())) {

            W9011ListDomain list = w9011Form.getW9011ListDomainList()
                .get(Integer.parseInt(w9012Form.getCk()));

            criteriaDomain.setCustomerCd(list.getCustomerCd());
            criteriaDomain.setLgcyLibCompCd(list.getLgcyLibCompCd());

             // Run a search process.
            List<W9012ListDomain> listDomainList = w9012InitFacadeService.search(criteriaDomain);

            if (0 < listDomainList.size()) {

                // Set search result.
                setSearchResult(w9012Form , listDomainList);

                return FORWARD_SUCCESS;

            } else {

                // Set the error message.
                saveErrors(request, mapping, GSCM_E0_0001, null);

                // The transition to transition source screen.
                return w9012Form.getCallScreenId();
            }
        }

        w9012Form.setW9012CriteriaDomain(criteriaDomain);


        return FORWARD_SUCCESS;
    }

    /**
     * Set action form.
     * アクションフォームを設定します。
     *
     * @param form アクションフォーム
     * @return アクションフォーム
     */
    protected W9012ActionForm prepareForm(W9012ActionForm form) {

        // Clear List domain.
        form.setW9012ListDomainList(null);

        return form;
    }

    /**
     * Set search criteria domain.
     * 検索条件ドメインを設定します。
     * 
     * - Set the screen common information.
     * - Set screen transition source ID.
     * - Set the processing mode.
     * 
     * - 画面共通情報の設定。
     * - 遷移元画面IDの設定。
     * - 処理モードの設定。
     *
     * @param form アクションフォーム
     * @return 検索条件ドメイン
     */
    protected W9012CriteriaDomain prepareCriteriaDomain(W9012ActionForm form) {

        W9012CriteriaDomain criteriaDomain = new W9012CriteriaDomain();

        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        // Set screen transition source ID.
        criteriaDomain.setCallScreenId(form.getCallScreenId());

        // Set the processing mode.
        criteriaDomain.setProcMode(form.getProcMode());

        return criteriaDomain;
    }

    /**
     * Set the search results.
     * 検索結果を設定します。
     * 
     * - Set Criteria domain.
     * - Set domain.
     * 
     * - Criteriaドメインの設定。
     * - ドメインの設定。
     * @param w9012Form アクションフォーム
     * @param listDomainList 検索結果
     */
    protected void setSearchResult(W9012ActionForm w9012Form , List<W9012ListDomain> listDomainList) {

        W9012CriteriaDomain criteriaDomain = w9012Form.getW9012CriteriaDomain();

        // Set Criteria domain.
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, listDomainList.get(0));

        // Set domain.
        w9012Form.setW9012ListDomainList(listDomainList);
        w9012Form.setW9012CriteriaDomain(criteriaDomain);

    }

    /**
     * Set to {@ link ActionMessages} the specified message.
     * 指定されたメッセージを{@link ActionMessages}に設定します。
     *
     * @param request HTTPリクエスト
     * @param mapping アクションマッピング
     * @param messageId 設定するメッセージのID
     * @param args メッセージ引数
     */
    protected void saveErrors(HttpServletRequest request, ActionMapping mapping, 
        String messageId, Object[] args) {

        ActionMessages errors = new ActionMessages();
        errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        saveErrors(request, errors);
    }

}
