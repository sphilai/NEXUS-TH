/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB003ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *    Initial display action of ordering two or moreP / O registration picture.
 * <br />受注複数P/O登録画面の初期表示アクション。
 * <pre>
 * forward name-path mappings:
 *     - "success":WB003.jsp
 *     - "error":WB003.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB003InitAction extends WB003AbstractAction {

    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected SearchFacadeService<List<? extends WB003ListDomain>, WB003CriteriaDomain> wb003InitFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public WB003InitAction() {
        super();
    }

    /**
     * Setter method for wb003InitFacadeService.
     *
     * @param wb003InitFacadeService Set for wb003InitFacadeService
     */
    public void setWb003InitFacadeService(
        SearchFacadeService<List<? extends WB003ListDomain>, WB003CriteriaDomain> wb003InitFacadeService) {
        this.wb003InitFacadeService = wb003InitFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Setting of action form
        // アクションフォームの設定
        WB003ActionForm wb003Form = prepareForm((WB003ActionForm) form);

        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        WB003CriteriaDomain criteria = prepareCriteriaDomain(wb003Form);
        
        // Execution of retrieval processing
        // 検索処理の実行
        List<? extends WB003ListDomain> listDomainList = wb003InitFacadeService.search(criteria);

        // Set of search results
        // 検索結果のセット
        wb003Form.setWb003ListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected WB003ActionForm prepareForm(WB003ActionForm form ) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setWb003ListDomainList(null);
        
        return form;
    }
    
    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクション・フォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When there is no authority<br />権限がない場合
     */
    protected WB003CriteriaDomain prepareCriteriaDomain(WB003ActionForm form) throws ApplicationException {
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        WB003CriteriaDomain criteriaDomain = form.getWb003CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Acquisition of B001 screen information
        // B001画面情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(WINDOW_ID_0);
        ScreenInfoDomain screenInfo = (ScreenInfoDomain)windowInfo.getScreenInfo().get(SCREEN_ID_WB001);

        // Acquisition of the VALUE of B001 screen
        // B001画面の値の取得
        WB001ActionForm wb001Form = (WB001ActionForm)screenInfo.getActionForm();
        WB001CriteriaDomain headerInfo = wb001Form.getWb001CriteriaDomain();

        // A setting of the VALUE of B001 screen
        // B001画面の値の設定
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, headerInfo);
        
        // Request parameter acquisition and setting
        // リクエストパラメータ取得と設定
        if (StringUtils.equals(form.getCallScreenId(), SCREEN_ID_WB002)) {
            criteriaDomain.setEtdDueDt(form.getEtdDueDtHidden());
            criteriaDomain.setCustomerItemNo(form.getCustomerItemNoHidden());
        }
        
        return criteriaDomain;
    }
}
