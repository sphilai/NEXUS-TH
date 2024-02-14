/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.WB001InitFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB002;

/**
*    Initial display action of an ordering registration header screen.
 * <br />受注登録ヘッダー画面の初期表示アクション。
 * <pre>
 * forward name-path mappings:
 *     - "success":WB001.jsp
 *     - "error":WB001.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB001InitAction extends WB001AbstractAction {

    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected SearchFacadeService<WB001CriteriaDomain, WB001CriteriaDomain> wb001InitFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public WB001InitAction() {
        super();
    }

    /**
     * Setter method for wb001InitFacadeService.
     *
     * @param searchFacadeService Set for wb001InitFacadeService
     */
    public void setWb001InitFacadeService(
        SearchFacadeService<WB001CriteriaDomain, WB001CriteriaDomain> searchFacadeService) {
        wb001InitFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * A setting of - Start Date Release
     *       Link today is acquired and assigned to a login company.
     *       {@link WB001InitFacadeServiceImpl WB001InitFacadeServiceImpl#search(WB001CriteriaDomain)}
     *
     * - Start Date Releaseの設定
     *     ログイン会社に紐づく本日を取得し設定
     *      {@link WB001InitFacadeServiceImpl WB001InitFacadeServiceImpl#search(WB001CriteriaDomain)}
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Setting of action form
        // アクションフォームの設定
        WB001ActionForm wB001ActionForm = (WB001ActionForm) form;
        
        // If this is not return from WB002, Start Date Release will be set up.
        // WB002からの戻りでなければ、Start Date Releaseを設定
        if (!StringUtils.equals(wB001ActionForm.getCallScreenId(), SCREEN_ID_WB002)) {
            WB001CriteriaDomain criteria = searchCigmaAds(wB001ActionForm);
            
            // A setting of a criteria domain
            // criteriaドメインの設定
            wB001ActionForm.setWb001CriteriaDomain(criteria);
        }
       
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Start Date Release is set up.
     * <br />Start Date Releaseを設定します。
     * 
     * @param form Action form<br />アクションフォーム
     * @return Mass update domain<br />一括更新ドメイン
     * @throws ApplicationException When an error unexpected by CommonService occurs<br />CommonServiceで予期せぬエラーが発生した場合
     */
    protected WB001CriteriaDomain searchCigmaAds(WB001ActionForm form) throws ApplicationException {
        // Acquisition of a condition domain
        // 条件ドメインの取得
        WB001CriteriaDomain criteriaDomain = new WB001CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        Eca0027CommonInfoDomain commonInfo = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();
        
        // A login person's COMPANY-CODE setting
        // ログイン者の会社コード設定
        criteriaDomain.setOwnerCompCd(commonInfo.getOwnerCompCd()); 
        
        // A setting of Start Date Release
        // Start Date Releaseの設定
        // Today is acquired in OWNER-COMPANY CD of screen common information (a GSCM standard part is extended).
        // 画面共通情報（GSCM標準部品を拡張）の責任会社コードで本日を取得
        WB001CriteriaDomain resultDomain = wb001InitFacadeService.search(criteriaDomain);
        
        return resultDomain;
    }
}
