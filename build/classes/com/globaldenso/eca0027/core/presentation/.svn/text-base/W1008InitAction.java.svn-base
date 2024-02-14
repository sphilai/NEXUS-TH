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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORWARD_BACK;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 *    This is an initial display action class of action Export Packaging Register screen.
 * <br />梱包指示Header画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1008.jsp
 *     - "error":W1008.jsp
 * </pre>
 *
 * @author $Author: DCS $
 * @version $Revision: 5759 $
 */
public class W1008InitAction extends W1008AbstractAction {
    /**
     * W1008Init Facade service
     * <br />Init Facade サービス
     */
    protected SearchFacadeService<W1008UpdateDomain, W1008UpdateDomain> w1008InitFacadeService;
    /**
     * Constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1008InitAction() {
        super();
    }
 
    /**
     * <p>Setter method for w1008InitFacadeService.</p>
     *
     * @param w1008InitFacadeService Set for w1008InitFacadeService
     */
    public void setW1008InitFacadeService(SearchFacadeService<W1008UpdateDomain, W1008UpdateDomain> w1008InitFacadeService) {
        this.w1008InitFacadeService = w1008InitFacadeService;
    }


    /**
     * {@inheritDoc}
     * <pre>
     * - Display control
     *     Active control of the screen item ({@link W1007AbstractAction#controlDisplay(W1008ActionForm, HttpServletRequest)})
     *     Hide the search results area
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W1007AbstractAction#controlDisplay(W1008ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1008ActionForm w1008Form = prepareForm((W1008ActionForm) form);
        if (!isBack(request)) {
         // The copy of a Header information
            // Header情報のコピー
            //Issue 098
            if (!w1008Form.getCallScreenId().equals(SCREEN_ID_W1008)) {
                copyHeaderInfo(w1008Form);
            }
            //reset clear packingType
            w1008Form.getW1008CriteriaDomain().setPackingType("P");
            PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(w1008Form, mapping, request);
            w1008Form.getW1008CriteriaDomain().setPageInfoCreator(pageInfoCreator);
            // Setting of an update domain
            // 更新ドメインの設定
            W1008UpdateDomain w1008UpdateDomain = prepareUpdateDomain(w1008Form);
            
            /* 
             * Comment for W1007 -> W1008 (Error)  ISSUE DATE 12/05/2016
             * // Check authority
            if (!userAuthService.hasRole(ROLE_AREA_ADMIN) 
                && !hasRoleForCompany(ROLE_COMP_ADMIN, w1008Form.getOwnerCompCd(), w1008Form.getUserAuthList())
                && !hasRoleForCompany(ROLE_PLNT_ADMIN, w1008Form.getOwnerCompCd(), w1008Form.getUserAuthList())) {
                w1008Form.setFunctionNo(MODE_REF);
                w1008Form.setDscId(w1008Form.getLoginUserDscId());
                return SCREEN_ID_W1008;
            }
            */
            // Search 
            W1008UpdateDomain result = w1008InitFacadeService.search(w1008UpdateDomain);
                
            // Setting result list
            w1008Form.setListDomainList(result.getListDomainList());
            w1008Form.setTypeOfShipper(result.getTypeOfShipper());
            w1008Form.getW1008CriteriaDomain().setLengthUnitHeader(w1008Form.getW1008CriteriaDomain().getLengthUnit());
            //Issue 098
            w1008Form.setInitDomainList(result.getInitDomainList());
            
            //Issue 096
            w1008Form.getW1008CriteriaDomain().setRtPage("");
            //  If no more. Return to Export Request  ECA0027-W1007 - Export Request
            if(w1008Form.getListDomainList() == null || w1008Form.getListDomainList().size() == 0)
            {
                return FORWARD_BACK;
            }
        }else{
            w1008Form.getW1008CriteriaDomain().setLengthUnit(w1008Form.getW1008CriteriaDomain().getLengthUnitHeader());
        }
        return FORWARD_SUCCESS;
    }
    /**
    *    A Header information is copied to a search-condition domain.
    * <br />Header情報を検索条件ドメインにコピーします。
    *
    * @param form Action form of a Packaging Instruction (=Pull) Create screen<br />梱包指示Create画面のアクション・フォーム
    */
    @SuppressWarnings("unchecked")
    protected void copyHeaderInfo(W1008ActionForm form) {
        // Acquisition of a Header information
        // Header情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1007);
        List<W1007ListDomain> w1007ListDomainList = (List<W1007ListDomain>)((W1007ActionForm) screenInfo.getActionForm()).getListDomainList();
        List<W1008ListDomain> w1008ListDomainList = convertToW1008ListDomain(w1007ListDomainList);
        form.setListDomainList(w1008ListDomainList);
        // Acquisition of a search-condition domain
        // 検索条件ドメインの取得
        W1008CriteriaDomain w1008Criteria = form.getW1008CriteriaDomain();
        form.setW1008CriteriaDomain(w1008Criteria);
        W1007ActionForm w1007ActionForm = (W1007ActionForm)screenInfo.getActionForm();
       
        // The copy of a Header information
        // Header情報のコピー
        CommonUtil.copyPropertiesDomainToDomain(w1008Criteria, w1007ActionForm.getW1007CriteriaDomain());
    }
   /**
    *    Action form is set up.
    * <br />アクションフォームを設定します。
    *
    * @param form Action form<br />アクションフォーム
    * @return Action form<br />アクションフォーム
    */
    protected W1008ActionForm prepareForm(W1008ActionForm form) {
       
        // Setting page
        form.setCountPerPage(1);
       
        // Backup of Transition-original-screen ID
        // 遷移元画面IDの退避
        form.getW1008CriteriaDomain().setOriginalScreenId(form.getCallScreenId());
       
        return form;
    }
   /**
    *  Prepare Data to UpdateDomain
    *
    * @param form Action form<br />アクションフォーム
    * @return W1008UpdateDomain
    */
    protected W1008UpdateDomain prepareUpdateDomain(W1008ActionForm form) {
        W1008UpdateDomain updateDomain = new W1008UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // Setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW1008CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        //Issue 098
        updateDomain.setInitDomainList(form.getInitDomainList());

        return updateDomain;
    }
   /**
    *  Convert to W1008ListDomain
    *
    * @param listDomain List<? extends W1007ListDomain>
    * @return List<W1008ListDomain>
    */
    protected List<W1008ListDomain> convertToW1008ListDomain(List<? extends W1007ListDomain> listDomain) {
        List<W1008ListDomain> listDomainList = new ArrayList<W1008ListDomain>();
        for (W1007ListDomain domain : listDomain) {
            W1008ListDomain w1008ListDomain = new W1008ListDomain();
            // Copy of property
            // プロパティのコピー
            CommonUtil.copyPropertiesDomainToDomain(w1008ListDomain, domain);
            listDomainList.add(w1008ListDomain);
        }
        return listDomainList;
    }
    
    /**
     * Check if the back button was pressed
     * <br />戻るボタンによる画面遷移かどうかを判定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return true if the back button was pressed, otherwise false<br />戻るボタンによる画面遷移であればtrue、それ以外はfalse
     */
    protected boolean isBack(HttpServletRequest request) {
        return Boolean.valueOf(request.getParameter("back"));
    }
}
