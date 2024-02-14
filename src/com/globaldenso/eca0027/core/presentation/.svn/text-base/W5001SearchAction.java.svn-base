/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W5001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W5001R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W5001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The Search action class of Shipping Confirmation Main screen
 * <br />出荷確認Main画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W5001.jsp
 *     - "error":W5001.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5001SearchAction extends W5001AbstractAction {
    
    /**
     * Search facade service.
     */
    protected SearchFacadeService<List<W5001ListDomain>, W5001CriteriaDomain> w5001SearchFacadeService;
    
    /**
     * constructor.
     */
    public W5001SearchAction() {
        super();
    }

    /**
     * <p>Setter method for w5001SearchFacadeService.</p>
     *
     * @param searchFacadeService Set for w5001SearchFacadeService
     */
    public void setW5001SearchFacadeService(
        SearchFacadeService<List<W5001ListDomain>, W5001CriteriaDomain> searchFacadeService) {
        this.w5001SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call the SearchFacadeService.search an argument form.criteriaDomain
     * - Set to form the result of calling SearchFacadeService.search
     *
     * - form.criteriaDomainを引数にW5001SearchFacadeService.searchの呼び出し
     * - W5001SearchFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W5001ActionForm w5001Form = prepareForm((W5001ActionForm) form);
        
        // Set of search criteria domain.
        // 検索条件ドメインの設定
        W5001CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w5001Form);
        
        // Execution of the search process.
        // 検索処理の実行
        List<W5001ListDomain> listDomainList = w5001SearchFacadeService.search(criteriaDomain);
        
        // Set of search results.
        // 検索結果の設定
        w5001Form.setListDomainList(listDomainList);
        
        // Display control of the Main screen.
        // Main画面の表示制御
        controlDisplay(w5001Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     * 
     * <pre>
     * - Clear list domain.
     * - Set the maximum number of records per page.
     *
     * - リストドメインのクリア
     * - 1ページのレコード件数の最大値をセット
     * </pre>
     *
     * @param form action form
     * @return action form
     */
    protected W5001ActionForm prepareForm(W5001ActionForm form) {
        form.setListDomainList(null);
        form.setRowNum(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request
     * @param mapping action mapping
     * @param form action form
     * @return Search conditions domain
     * @throws GscmApplicationException if the user authority does not exist
     */
    protected W5001CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W5001ActionForm form)
        throws GscmApplicationException {
        
        W5001CriteriaDomain criteriaDomain = form.getW5001CriteriaDomain();
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Page control processing.
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // Setting Permissions.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W5001R, PERMIT_FUNC_ID_W5001B};
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        // Configuring the Server ID.
        // サーバIDの設定
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        Eca0027CommonInfoDomain eca0027CommonInfoDomain = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();
        criteriaDomain.setServerId(eca0027CommonInfoDomain.getServerId());
        
        return criteriaDomain;
    }

    /**
     * Make the display control of shipping confirmation Main screen.
     * <br />出荷確認Main画面の表示制御を行います。
     * <pre>
     * - Showing Results Area.
     *
     * - 検索結果エリアを表示にする。
     * </pre>
     *
     * @param form action form
     */
    protected void controlDisplay(W5001ActionForm form) {
        form.setDisplayList(true);
    }
}
