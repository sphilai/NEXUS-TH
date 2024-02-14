/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9010;
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
import com.globaldenso.eca0027.core.business.domain.W9009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9010ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial action class of CIGMA Ship to X-Reference MA Edit Screen.
 * <br />CIGMA Ship to X-Reference MA Edit画面初期表示アクション。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9010.jsp
 *     - "error":w9009.jsp
 * </pre>
 * 
 * @author $Author: 10088DS50801 $
 * @version $Revision: 9504 $
 */
public class W9010InitAction extends W9010AbstractAction {

    /**
     * Initial display Facade Service/初期表示Facadeサービス
     */
    protected SearchFacadeService<List<W9010ListDomain>, W9010CriteriaDomain> w9010InitFacadeService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9010InitAction() {
        super();
    }

    /**
     * Setter method for w9010InitFacadeService.
     *
     * @param initFacadeService Set for w9010InitFacadeService
     */
    public void setW9010InitFacadeService(
        SearchFacadeService<List<W9010ListDomain>, W9010CriteriaDomain> initFacadeService) {
        w9010InitFacadeService = initFacadeService;
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
     *         - 検索結果を取得した場合
     *             - 検索結果を設定する。
     *         - 検索結果が0の場合
     *             - エラーメッセージを設定する。
     *             - 遷移元画面に遷移する。
     * - 新規モードの場合
     *     - 検索結果をクリアする。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(
     *      org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        // Set action form.
        W9010ActionForm w9010Form = prepareForm((W9010ActionForm) form);
        
        // Get screen common information domain.
        WindowInfoDomain windowInfo =
            (WindowInfoDomain)DensoContext.get().getGeneralArea(w9010Form.getWindowId());
        Map<String, ScreenInfoDomain> screenInfo =
            (Map<String, ScreenInfoDomain>)windowInfo.getScreenInfo();
        ScreenInfoDomain screenInfoDomain = screenInfo.get(SCREEN_ID_W9010);

        if (screenInfoDomain == null) {
            screenInfoDomain = new ScreenInfoDomain();
        }

        // Set of common information screen.
        screenInfo.put(SCREEN_ID_W9010, screenInfoDomain);

        // Button activity control.
        controlDisplay(request , w9010Form);

        // Set search criteria.
        W9010CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9010Form);

        // Get handover items.
        ScreenInfoDomain w9009ScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo()
            .get(SCREEN_ID_W9009);
        W9009ActionForm w9009Form = (W9009ActionForm) w9009ScreenInfo.getActionForm();

        if (MODE_EDIT.equals(w9010Form.getW9010CriteriaDomain().getProcMode()) 
            || MODE_REF.equals(w9010Form.getW9010CriteriaDomain().getProcMode())) {

            W9009ListDomain list = w9009Form.getW9009ListDomainList().
                get(Integer.parseInt(w9010Form.getCk()));
            criteriaDomain.setCustomerCd(list.getCustomerCd());
            criteriaDomain.setLgcyLibCompCd(list.getLgcyLibCompCd());
            criteriaDomain.setLgcyShipTo(list.getLgcyShipTo());

            // Run a search process.
            List<W9010ListDomain> listDomainList = w9010InitFacadeService.search(criteriaDomain);

            if (0 < listDomainList.size()) {

                // Set search result.
                setSearchResult(w9010Form, listDomainList);

                return FORWARD_SUCCESS;

            } else {

                // Set the error message.
                saveErrors(request, mapping, GSCM_E0_0001, null);

                // The transition to transition source screen.
                return w9010Form.getCallScreenId();
            }

        }

        w9010Form.setW9010CriteriaDomain(criteriaDomain);

        return FORWARD_SUCCESS;
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
    protected W9010CriteriaDomain prepareCriteriaDomain(W9010ActionForm form) {

        W9010CriteriaDomain criteriaDomain = new W9010CriteriaDomain();

        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        // Set screen transition source ID.
        criteriaDomain.setCallScreenId(form.getCallScreenId());

        // Set the processing mode.
        criteriaDomain.setProcMode(form.getProcMode());

        return criteriaDomain;
    }

    /**
     * Set action form.
     * アクションフォームを設定します。
     *
     * @param form アクションフォーム
     * @return アクションフォーム
     */
    protected W9010ActionForm prepareForm(W9010ActionForm form) {

        // Clear List domain.
        form.setW9010ListDomainList(null);

        return form;
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
     *
     * @param w9010Form アクションフォーム
     * @param listDomainList 検索結果
     */
    protected void setSearchResult(W9010ActionForm w9010Form, List<W9010ListDomain> listDomainList) {
        
        W9010CriteriaDomain criteriaDomain = w9010Form.getW9010CriteriaDomain();

        // Set Criteria domain.
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, listDomainList.get(0));

        // Set domain.
        w9010Form.setW9010ListDomainList(listDomainList);
        w9010Form.setW9010CriteriaDomain(criteriaDomain);
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
