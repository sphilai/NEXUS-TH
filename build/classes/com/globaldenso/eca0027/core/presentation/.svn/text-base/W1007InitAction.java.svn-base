/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_AREA_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_COMP_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_PLNT_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1010;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W1001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W1008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1010CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *    This is an initial display action class of a Export Request Header screen.
 * <br />梱包指示Header画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1007.jsp
 *     - "error":W1007.jsp
 * </pre>
 *
 * @author $Author: DCS
 * @version $Revision: 5759 $
 */
public class W1007InitAction extends W1007AbstractAction {
    
    /**
     * Search Facade service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<W1007UpdateDomain, W1007CriteriaDomain> w1007InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1007InitAction() {
        super();
    }


    /**
     * <p>Setter method for w1007InitFacadeService.</p>
     *
     * @param initFacadeService Set for w1007InitFacadeService
     */
    public void setW1007InitFacadeService(
        SearchFacadeService<W1007UpdateDomain, W1007CriteriaDomain> initFacadeService) {
        w1007InitFacadeService = initFacadeService;
    }


    /**
     * {@inheritDoc}
     * <pre>
     * - Display control
     *     Active control of the screen item ({@link W1007AbstractAction#controlDisplay(W1007ActionForm, HttpServletRequest)})
     *     Hide the search results area
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W1007AbstractAction#controlDisplay(W1007ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1007ActionForm w1007Form = (W1007ActionForm) form;
        
        /* 
         * Comment for W1006 -> W1007 (Error)  ISSUE DATE 12/05/2016
         * // Check authority
        if (!userAuthService.hasRole(ROLE_AREA_ADMIN) 
            && !hasRoleForCompany(ROLE_COMP_ADMIN, w1007Form.getOwnerCompCd(), w1007Form.getUserAuthList())
            && !hasRoleForCompany(ROLE_PLNT_ADMIN, w1007Form.getOwnerCompCd(), w1007Form.getUserAuthList())) {
            w1007Form.setFunctionNo(MODE_REF);
            w1007Form.setDscId(w1007Form.getLoginUserDscId());
            return SCREEN_ID_W1007;
        }*/
        // The copy of a Header information
        // Header情報のコピー
        copyHeaderInfo(w1007Form);
        
        // Update value from duplicate ##ISSUE 176
        W1007UpdateDomain updateDomain = w1007InitFacadeService.search(w1007Form.getW1007CriteriaDomain());
        w1007Form.setW1007CriteriaDomain(updateDomain.getCriteriaDomain());
        
        // Reset result list.
        w1007Form.setListDomainList(null);
        w1007Form.getW1007CriteriaDomain().setPackingStatus("");
        return FORWARD_SUCCESS;
    }
    /**
    *    A Header information is copied to a search-condition domain.
    * <br />Header情報を検索条件ドメインにコピーします。
    *
    * @param form Action form of Export Request Create screen<br />梱包指示Create画面のアクション・フォーム
    */
    protected void copyHeaderInfo(W1007ActionForm form) {
           // Acquisition of a Header information
           // Header情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1001);
        if(screenInfo == null)
        {
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1008);
            if(screenInfo != null){
                W1008CriteriaDomain w1008CriteriaDomain = ((W1008ActionForm) screenInfo.getActionForm()).getW1008CriteriaDomain();
                // Acquisition of a search-condition domain
                // 検索条件ドメインの取得
                W1007CriteriaDomain w1007Criteria = form.getW1007CriteriaDomain();
                   
                // The copy of a Header information
                // Header情報のコピー
                CommonUtil.copyPropertiesDomainToDomain(w1007Criteria, w1008CriteriaDomain);
            }
        }else{
            if(((W1001ActionForm) screenInfo.getActionForm()).getListDomainList() != null && ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().size() > 0)
            {
                W1001ListDomain w100ListDomain = ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().get(0);
                
                // Acquisition of a search-condition domain
                // 検索条件ドメインの取得
                W1007CriteriaDomain w1007Criteria = form.getW1007CriteriaDomain();
                  
                // The copy of a Header information
                // Header情報のコピー
                CommonUtil.copyPropertiesDomainToDomain(w1007Criteria, w100ListDomain);
            }
            
        }
        if (form.getCallScreenId().equals(SCREEN_ID_W1006)) {
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1006);
            W1006CriteriaDomain criteriaDomain = ((W1006ActionForm) screenInfo.getActionForm()).getW1006CriteriaDomain();
            // Acquisition of a search-condition domain
            // 検索条件ドメインの取得
            W1007CriteriaDomain w1007Criteria = form.getW1007CriteriaDomain();
              
            // The copy of a Header information
            // Header情報のコピー
            CommonUtil.copyPropertiesDomainToDomain(w1007Criteria, criteriaDomain);
        }else if (form.getCallScreenId().equals(SCREEN_ID_W1002)) {
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1010);
            W1010CriteriaDomain criteriaDomain = ((W1010ActionForm) screenInfo.getActionForm()).getW1010CriteriaDomain();
            // Acquisition of a search-condition domain
            // 検索条件ドメインの取得
            W1007CriteriaDomain w1007Criteria = form.getW1007CriteriaDomain();
              
            // The copy of a Header information
            // Header情報のコピー
            CommonUtil.copyPropertiesDomainToDomain(w1007Criteria, criteriaDomain);
        }

    }

}
