/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W1001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * Action class of initial display of a Export Request [Register & Print Request] Main screen.
 * <br />User ID MA Inquiry画面の初期表示アクションクラスです。
 *  * <pre>
 * forward name-path mapping
 *     ‐ "success":W1006
 *     ‐ "error":W1006
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W1006InitAction extends W1006AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1006InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Display control
     *     Active control of the screen item ({@link W1001AbstractAction#controlDisplay(W1001ActionForm, HttpServletRequest)})
     *     Hide the search results area
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W1001AbstractAction#controlDisplay(W1001ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1006ActionForm w1006Form = (W1006ActionForm) form;
        
       /* 
        * Comment for W1003 -> W1006 (Error)  ISSUE DATE 27/04/2016
        // Check authority
        if (!userAuthService.hasRole(ROLE_AREA_ADMIN) 
            && !hasRoleForCompany(ROLE_COMP_ADMIN, w1006Form.getOwnerCompCd(), w1006Form.getUserAuthList())
            && !hasRoleForCompany(ROLE_PLNT_ADMIN, w1006Form.getOwnerCompCd(), w1006Form.getUserAuthList())) {
            w1006Form.setFunctionNo(MODE_REF);
            w1006Form.setDscId(w1006Form.getLoginUserDscId());
            return FORWARD_ERROR;
        }*/
        // The copy of a Header information
        // Header情報のコピー
        copyHeaderInfo(w1006Form);
        // Reset result list.
        W1006CriteriaDomain w1006Criteria = w1006Form.getW1006CriteriaDomain();
        if(w1006Form.getListDomainList() == null || w1006Form.getListDomainList().size() == 0)
        {
            w1006Criteria.setTotalIdTag("0");
        }
        w1006Form.setListDomainList(null);
        
        return FORWARD_SUCCESS;
    }
    /**
    *    A Header information is copied to a search-condition domain.
    * <br />Header情報を検索条件ドメインにコピーします。
    *
    * @param form Action form of a Packaging Instruction (=Pull) Create screen<br />梱包指示Create画面のアクション・フォーム
    */
    protected void copyHeaderInfo(W1006ActionForm form) {
        // Acquisition of a Header information
        // Header情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1003);
        
        // Acquisition of a search-condition domain
        // 検索条件ドメインの取得
        W1006CriteriaDomain w1006Criteria = form.getW1006CriteriaDomain();
        
        if(screenInfo != null){
            W1003CriteriaDomain w1003CriteriaDomain = ((W1003ActionForm) screenInfo.getActionForm()).getW1003CriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(w1006Criteria, w1003CriteriaDomain);
        }else if( form.getCallScreenId() != null &&  form.getCallScreenId().equalsIgnoreCase("w1007")){ //ISSUE 084
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1007);
            W1007CriteriaDomain w1007CriteriaDomain = ((W1007ActionForm) screenInfo.getActionForm()).getW1007CriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(w1006Criteria, w1007CriteriaDomain);
        }else {
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1001);
            W1001CriteriaDomain w1001CriteriaDomain = ((W1001ActionForm) screenInfo.getActionForm()).getW1001CriteriaDomain();
            if (!CheckUtil.isBlankOrNull(w1001CriteriaDomain.getSelected()) && ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList() != null && ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().size() > 0) {
                int selectedRow = Integer.parseInt(w1001CriteriaDomain.getSelected());
                W1001ListDomain w100ListDomain = ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().get(selectedRow);
                // Copy properties domain to domain
                CommonUtil.copyPropertiesDomainToDomain(w1006Criteria, w100ListDomain);
            }
        }
        
        if (!form.getCallScreenId().equals(SCREEN_ID_W1006)) {
            form.setFromScreenId(form.getCallScreenId());
        }
        
    }
}
