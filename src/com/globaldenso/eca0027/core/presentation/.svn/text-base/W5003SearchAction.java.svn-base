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
import com.globaldenso.eca0027.core.business.domain.W5003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5003ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The Search action class of Shipping Confirmation Create screen
 * <br />出荷確認Create画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W5003.jsp
 *     - "error":W5003.jsp
 * </pre>
 *
 * @author $Author: 10035024400 $
 * @version $Revision: 8385 $
 */
public class W5003SearchAction extends W5003AbstractAction {

    /**
     * User function use authorization service.
     */
    protected UserAuthService userAuthService;

    /**
     * Search facade service.
     */
    protected SearchFacadeService<List<W5003ListDomain>, W5003CriteriaDomain> w5003SearchFacadeService;

    /**
     * constructor.
     */
    public W5003SearchAction() {
        super();
    }
    
    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for w5003SearchFacadeService.
     *
     * @param w5003SearchFacadeService Set for w5003SearchFacadeService
     */
    public void setW5003SearchFacadeService(
        SearchFacadeService<List<W5003ListDomain>, W5003CriteriaDomain> w5003SearchFacadeService) {
        this.w5003SearchFacadeService = w5003SearchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call the SearchFacadeService.search an argument form.criteriaDomain
     * - Set to form the result of calling SearchFacadeService.search
     *
     * - form.criteriaDomainを引数にW5003SearchFacadeService.searchの呼び出し
     * - W5003SearchFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W5003ActionForm w5003Form = (W5003ActionForm) form;
        
        // Setting the action form.
        // アクションフォームの設定
        w5003Form = prepareForm(w5003Form, true);
        
        // Set of search criteria domain.
        // 検索条件ドメインの設定
        W5003CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w5003Form);
        
        // Execution of the search process.
        // 検索処理の実行
        List<W5003ListDomain> searchResult = w5003SearchFacadeService.search(criteriaDomain);
        
        // Set of search results.
        // 検索結果の設定
        w5003Form.setListDomainList(searchResult);
        
        // Save Search Results.
        // 検索結果の保存
        w5003Form.setSearchResult(searchResult);
        
        // Display control of the Create screen.
        // Create画面の表示制御
        controlDisplay(w5003Form);
        
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
     * @param removeSearchResult List domain (result storage)
     * @return action form
     */
    protected W5003ActionForm prepareForm(W5003ActionForm form, boolean removeSearchResult) {
        // Clear List domain (screen display)
        // Listドメイン(画面表示用)のクリア
        form.setListDomainList(null);
        form.setRowNum(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        // Clear List domain (result storage)
        // Listドメイン(結果保存用)のクリア
        if (removeSearchResult) {
            form.setSearchResult(null);
        }
        
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
     * @throws GscmApplicationException if the user authority does not exist.
     */
    protected W5003CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W5003ActionForm form)
        throws GscmApplicationException {
        
        W5003CriteriaDomain criteriaDomain = form.getW5003CriteriaDomain();
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Page control processing.
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // Setting Permissions.
        // 権限の設定
        if (userAuthService.hasRegisterAll()) {
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
        
        // Setting the weight unit code.
        // 重量単位コードの設定
        criteriaDomain.setWeightUnit(eca0027CommonInfoDomain.getWeightUnit());
        
        // Set weight unit of code (for display)
        // 重量単位コード(表示用)の設定
        criteriaDomain.setWeightUnitDisp(eca0027CommonInfoDomain.getWeightUnitDisp());
        
        // Setting the volume unit code.
        // 容積単位コードの設定
        criteriaDomain.setVolumeUnit(eca0027CommonInfoDomain.getVolumeUnit());
        
        // Setting volume unit of code (for display)
        // 容積単位コード(表示用)の設定
        criteriaDomain.setVolumeUnitDisp(eca0027CommonInfoDomain.getVolumeUnitDisp());
        
        return criteriaDomain;
    }

    /**
     * Make the display control of shipping confirmation Create screen.
     * <br />出荷確認Create画面の表示制御を行います。
     * <pre>
     * - Showing Results Area.
     *
     * - 検索結果エリアを表示にする。
     * </pre>
     *
     * @param form action form
     */
    protected void controlDisplay(W5003ActionForm form) {
        form.setDisplayList(true);
    }
}
