/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9011B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9011R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9011ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
/**
 * The search action class of CIGMA Customer No. X-Reference MA Inquiry Screen.
 * <br />CIGMA Customer No. X-Reference MA Inquiry画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9011.jsp
 *     - "error":W9011.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9011SearchAction extends W9011AbstractAction{

    /**
     * Search Facade service/検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W9011ListDomain>, 
        W9011CriteriaDomain> w9011SearchFacadeService;

    /**
     * Default constructor./デフォルトコンストラクタ.
     */
    public W9011SearchAction() {
        super();
    }

    /**
     * Setter method for w9011SearchFacadeService.
     *
     * @param searchFacadeService Set for w9011SearchFacadeService
     */
    public void setW9011SearchFacadeService(SearchFacadeService<List<? extends W9011ListDomain>, 
        W9011CriteriaDomain> searchFacadeService) {
        w9011SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Process of Search.
     * - Set the action form.
     * - Set the search criteria domain.
     * - Run a search process.
     *     - Call the W9011SearchFacadeService.search an argument w9011CriteriaDomain
     * - Set the search results.
     *     - Set to form the result of calling W9011SearchFacadeService.search
     * - Display control of the Main screen.
     *
     * 検索処理
     * - アクションフォームの設定をする。
     * - 検索条件ドメインを設定する。
     * - 検索処理を実行する。
     *     - w9011CriteriaDomainを引数にW9011SearchFacadeService.searchの呼び出し
     * - 検索結果を設定する。
     *     - W9011SearchFacadeService.searchの呼び出し結果をformに設定
     * - Main画面の表示制御をする。
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

        // Set the action form.
        W9011ActionForm w9011Form = prepareForm((W9011ActionForm) form);

        // Set the search criteria domain.
        W9011CriteriaDomain w9011CriteriaDomain = prepareCriteriaDomain(request, mapping, w9011Form);

        // Run a search process.
        List<? extends W9011ListDomain> listDomainList 
            = w9011SearchFacadeService.search(w9011CriteriaDomain);

        // Set the search results.
        w9011Form.setW9011ListDomainList(listDomainList);

        // Display control of the Main screen
        controlDisplay(w9011Form, request);

        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * アクションフォームを設定します。
     *
     * @param form アクションフォーム
     * @return アクションフォーム
     */
    protected W9011ActionForm prepareForm(W9011ActionForm form) {

        // Set the action form
        form.setW9011ListDomainList(null);
        form.setCk(null);
        form.setCountPerPage(PAGE_MAX_COUNT);

        return form;
    }

    /**
     * Set the search criteria domain.
     * 検索条件ドメインを設定します。
     * 
     * - Set the screen common information.
     * - Page control processing.
     * - Set permissions.
     * 
     * - 画面共通情報の設定
     * - ページ制御処理
     * - 権限を設定。
     * 
     * @param request HTTPリクエスト
     * @param mapping アクション・マッピング
     * @param form アクション・フォーム
     * @return 検索条件ドメイン
     * @throws ApplicationException 梱包指示の権限がない場合
     */
    protected W9011CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, 
        ActionMapping mapping, W9011ActionForm form) 
        throws ApplicationException {

        W9011CriteriaDomain criteriaDomain = form.getW9011CriteriaDomain();

        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        // Page control processing.
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);

        // Set permissions.
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W9011R, PERMIT_FUNC_ID_W9011B };
            List<? extends UserAuthDomain> userAuthList 
                = userAuthService.getUserAuthList(permitFuncIdList);

            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }

            criteriaDomain.setUserAuthList(userAuthList);
        }
        

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * - Button activity control.
     * - ボタンの活性制御.
     * 
     * @see com.globaldenso.eca0027.core.presentation.W9011AbstractAction
     *      #controlDisplay(com.globaldenso.eca0027.core.presentation.W9011ActionForm, 
     *                      javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W9011ActionForm form,
        HttpServletRequest request) {

        // Button activity control.
        super.controlDisplay(form, request);

    }

}
