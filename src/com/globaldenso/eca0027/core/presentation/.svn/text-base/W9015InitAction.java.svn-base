/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9014;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9015;
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
import com.globaldenso.eca0027.core.business.domain.W9014ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9015CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9015ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial action class of CIGMA W/H X-Reference MA Edit Screen.
 * <br />CIGMA W/H X-Reference MA Edit画面の初期表示アクションです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9015.jsp
 *     - "error":W9015.jsp
 * </pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
public class W9015InitAction extends W9015AbstractAction {

    /**
     * Initial display Facade Service/初期表示Facadeサービス
     */
    protected SearchFacadeService<List<W9015ListDomain>, W9015CriteriaDomain>
    w9015InitFacadeService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9015InitAction() {
        super();
    }

    /**
     * Setter method for w9015InitFacadeService.
     *
     * @param initFacadeService Set for w9015InitFacadeService
     */
    public void setW9015InitFacadeService(
        SearchFacadeService<List<W9015ListDomain>, W9015CriteriaDomain> initFacadeService) {
        w9015InitFacadeService = initFacadeService;
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
        W9015ActionForm w9015Form = prepareForm((W9015ActionForm) form);

        // Get screen common information domain.
        WindowInfoDomain windowInfo =
            (WindowInfoDomain)DensoContext.get().getGeneralArea(w9015Form.getWindowId());
        Map<String, ScreenInfoDomain> screenInfo =
            (Map<String, ScreenInfoDomain>)windowInfo.getScreenInfo();
        ScreenInfoDomain screenInfoDomain = screenInfo.get(SCREEN_ID_W9015);
        

        if (screenInfoDomain == null) {
            screenInfoDomain = new ScreenInfoDomain();
        }

        // Set of common information screen.
        screenInfo.put(SCREEN_ID_W9015, screenInfoDomain);

        // Button activity control.
        controlDisplay(request, w9015Form);
        
        // Set search criteria.
        W9015CriteriaDomain w9015Criteria = prepareCriteriaDomain(w9015Form, request);

        // Get handover items.
        ScreenInfoDomain w9014ScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo()
            .get(SCREEN_ID_W9014);
        W9014ActionForm w9014Form = (W9014ActionForm) w9014ScreenInfo.getActionForm();

        if (MODE_EDIT.equals(w9015Form.getW9015CriteriaDomain().getProcMode()) 
            || MODE_REF.equals(w9015Form.getW9015CriteriaDomain().getProcMode())) {

            W9014ListDomain list = w9014Form.getW9014ListDomainList()
                .get(Integer.parseInt(w9015Form.getCk()));
            
            w9015Criteria.setLgcyLibCompCd(list.getLgcyLibCompCd());
            w9015Criteria.setLgcyWhCd(list.getLgcyWhCd());
            w9015Criteria.setPlntCd(list.getPlntCd());

             // Run a search process.
            List<W9015ListDomain> listDomainList = w9015InitFacadeService.search(w9015Criteria);

            if (0 < listDomainList.size()) {

                // Set search result.
                setSearchResult(w9014Form , w9015Form , listDomainList , w9014ScreenInfo);

                return FORWARD_SUCCESS;

            } else {

                // Set the error message.
                saveErrors(request, mapping, GSCM_E0_0001, null);

                // The transition to transition source screen.
                return w9015Form.getCallScreenId();
            }
        }

        w9015Form.setW9015CriteriaDomain(w9015Criteria);

        return FORWARD_SUCCESS;
    }

    /**
     * Set action form.
     * アクションフォームを設定します。
     *
     * @param form アクションフォーム
     * @return アクションフォーム
     */
    protected W9015ActionForm prepareForm(W9015ActionForm form) {

        // Clear List domain.
        form.setW9015ListDomainList(null);

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
     * @param request HTTPリクエスト
     * @return 検索条件ドメイン
     */
    protected W9015CriteriaDomain prepareCriteriaDomain(W9015ActionForm form, 
        HttpServletRequest request) {

        // Set search criteria.
        W9015CriteriaDomain criteriaDomain = new W9015CriteriaDomain();

        // Set screen transition source ID.
        criteriaDomain.setCallScreenId(form.getCallScreenId());
        
        // To save because the compCd is overwritten .
        String compCd = form.getW9015CriteriaDomain().getCompCd();
        
        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        // Set compCd.
        criteriaDomain.setCompCd(compCd);
        
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
     * @param w9014Form アクションフォーム
     * @param w9015Form アクションフォーム
     * @param listDomainList 検索結果
     * @param w9014ScreenInfo 画面共通情報
     */
    protected void setSearchResult(W9014ActionForm w9014Form , W9015ActionForm w9015Form ,
        List<W9015ListDomain> listDomainList, ScreenInfoDomain w9014ScreenInfo) {

        W9015CriteriaDomain criteriaDomain = w9015Form.getW9015CriteriaDomain();

        // Set Criteria domain.
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, listDomainList.get(0));

        // Set domain.
        w9015Form.setW9015ListDomainList(listDomainList);
        w9015Form.setW9015CriteriaDomain(criteriaDomain);

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