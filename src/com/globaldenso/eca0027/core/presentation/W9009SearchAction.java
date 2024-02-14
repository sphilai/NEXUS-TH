/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9009B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9009R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9009ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
/**
 * The search action class of CIGMA Ship to X-Reference MA Inquiry Screen.
 * <br />CIGMA Ship to X-Reference MA Inquiry画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9009.jsp
 *     - "error":W9009.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9009SearchAction extends W9009AbstractAction{

    /**
     * Search Facade service/検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W9009ListDomain>, 
        W9009CriteriaDomain> w9009SearchFacadeService;

    /**
     * Default constructor./デフォルトコンストラクタ.
     */
    public W9009SearchAction() {
        super();
    }

    /**
     * Setter method for w9009SearchFacadeService.
     *
     * @param searchFacadeService Set for w9009SearchFacadeService
     */
    public void setW9009SearchFacadeService(SearchFacadeService<List<? extends W9009ListDomain>, 
        W9009CriteriaDomain> searchFacadeService) {
        w9009SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Process of Search.
     * - Set the action form.
     * - Set the search criteria domain.
     * - Run a search process.
     * - Set the search results.
     * - Display control of the Main screen.
     *
     * 検索処理
     * - アクションフォームの設定をする。
     * - 検索条件ドメインを設定する。
     * - 検索処理を実行する。
     * - 検索結果を設定する。
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
        W9009ActionForm w9009Form = prepareForm((W9009ActionForm) form);

        // Set the search criteria domain.
        W9009CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w9009Form);

        // Run a search process.
        List<? extends W9009ListDomain> listDomainList 
            = w9009SearchFacadeService.search(criteriaDomain);
       
        // Set the search results.
        w9009Form.setW9009ListDomainList(listDomainList);

        // Display control of the Main screen
        controlDisplay(w9009Form, request);

        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * アクションフォームを設定します。
     *
     * @param form アクションフォーム
     * @return アクションフォーム
     */
    protected W9009ActionForm prepareForm(W9009ActionForm form) {

        // Set the action form
        form.setW9009ListDomainList(null);
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
     * - Set locale information.
     * - Set permissions.
     * 
     * - 画面共通情報の設定
     * - ページ制御処理
     * - ロケール情報を設定
     * - 権限を設定。
     * 
     * @param request HTTPリクエスト
     * @param mapping アクション・マッピング
     * @param form アクション・フォーム
     * @return 検索条件ドメイン
     * @throws ApplicationException 梱包指示の権限がない場合
     */
    protected W9009CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, 
        ActionMapping mapping, W9009ActionForm form) 
        throws ApplicationException {
        
        W9009CriteriaDomain criteriaDomain = form.getW9009CriteriaDomain();
        
        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Page control processing.
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // Set permissions.
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W9009R, PERMIT_FUNC_ID_W9009B };
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
     * @see com.globaldenso.eca0027.core.presentation.W9009AbstractAction
     *      #controlDisplay(com.globaldenso.eca0027.core.presentation.W9009ActionForm, 
     *                      javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W9009ActionForm form,
        HttpServletRequest request) {

        // Button activity control.
        super.controlDisplay(form, request);

    }

}
