/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_SHIPPER_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_A;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.COUNT_OF_CONFIRMATION_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.COUNT_OF_STG_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.COUNT_OF_STG_INSTR_NO;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6006ListDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The class of base action for Documentation Invoice Grouping screen.
 * <br />通関書類作成業務 Invoice Grouping画面の基底アクションクラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 10391 $
 */
public abstract class W6006AbstractAction extends AbstractAction {
   
    /** 
     * Common Service
     */
    protected CommonService commonService;
    
    /**
     * Documentation Service
     */
    protected W6001DocService w6001DocService;
    
    /**
     * constructor.
     */
    public W6006AbstractAction() {
        super();
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Acquisition of common screen information
     * 
     * ‐Setting of the pull-down list
     * 
     * ‐Tooltip created
     * </pre>
     * <pre>
     * ‐画面共通情報の取得
     * 
     * ‐プルダウンリストの設定
     * 
     * ‐ツールチップ作成
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {
        
        W6006ActionForm w6006Form = (W6006ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w6006Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        createPullDownList(request, w6006Form);
       // Create a tool tip. 
        //ツールチップ作成
        createToolTip(w6006Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Set of transition source SCREEN ID
     *     Set the transition source SCREEN ID in Action Form
     * 
     * ‐Screen display control
     *     Call the {@link #controlDisplay(W6006ActionForm, HttpServletRequest)}.
     * </pre>
     * <pre>
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * 
     * ‐画面表示制御
     *     {@link #controlDisplay(W6006ActionForm, HttpServletRequest)}を呼び出す。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        ((W6006ActionForm) form).setCallScreenId(SCREEN_ID_W6006);
        
        // Make the display control of the Invoice Grouping screen. 
        // 画面表示制御
        controlDisplay((W6006ActionForm) form, request);
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W6006ActionForm form) {
   
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
        
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        if (!SCREEN_ID_W6006.equals(form.getCallScreenId())) {
            ActionUtil.prepareBusinessDomain(form.getW6006CriteriaDomain(), form.getWindowId(), form.getScreenId());
        }
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param form Action Form
     * @throws ApplicationException If can not get a pull-down list<br />
     * プルダウンリストを取得できない場合
     */
    protected void createPullDownList(HttpServletRequest request, W6006ActionForm form) throws ApplicationException {
        W6006CriteriaDomain criteria = form.getW6006CriteriaDomain();
        // Get the Shipper (combo box data). 
        // Shipperプルダウンリストの取得
        List<? extends SelectListItemDomain> shipperCdList = w6001DocService.searchTwInvPltzByShipperCd(criteria.getLoginUserDscId(), true);

        request.setAttribute(ATTR_SHIPPER_CD, shipperCdList);
    }     
    
    /**
     * Create a tool tip.
     * <br />ツールチップを作成します。
     * 
     * @param form Action Form
     * @throws ApplicationException If can not create a tool tip<br />
     * ツールチップを作成できない場合
     */
    protected void createToolTip(W6006ActionForm form) throws ApplicationException {
        W6006CriteriaDomain criteria = form.getW6006CriteriaDomain();
        // Get the Operation No (Invoice Grouping Screen) 
        List<String> operationNoList = w6001DocService.searchToolTipOnInvoiceGrouping(criteria.getLoginUserDscId(), criteria.getCustomTimingTyp());
        
        if (CUSTOM_TIMING_TYPE_A.equals(criteria.getCustomTimingTyp())) {
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//            criteria.setTitleOfOperationNo(commonService.getResource(criteria.getLocale(), "label.countOfShippingFirmNo"));
            criteria.setTitleOfOperationNo(COUNT_OF_CONFIRMATION_NO);
        } else if (CUSTOM_TIMING_TYPE_B.equals(criteria.getCustomTimingTyp())) {
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//            criteria.setTitleOfOperationNo(commonService.getResource(criteria.getLocale(), "label.countOfStgActNo"));
            criteria.setTitleOfOperationNo(COUNT_OF_STG_ACTUALITY_NO);
        } else {
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//            criteria.setTitleOfOperationNo(commonService.getResource(criteria.getLocale(), "label.countOfStgInstrNo"));
            criteria.setTitleOfOperationNo(COUNT_OF_STG_INSTR_NO);
        }
        
        criteria.setCountOfOperationNo(Integer.toString(operationNoList.size()));
        
        criteria.setOperationNoList(operationNoList);
    }
    
    /**
     * Make the display control of the Invoice Grouping screen.
     * <br />Invoice Grouping画面の表示制御を行います。
     * <pre>
     * ‐Make the display control of the screen by the selected value of the radio button of the search condition.
     * </pre>
     * <pre>
     * ‐検索条件のラジオボタンの選択値によって画面の表示制御を行います。
     * </pre>
     * 
     * @param form Action Form<br />
     * アクションフォーム
     * @param request HTTP request<br />
     * HTTPリクエスト
     */
    protected void controlDisplay(W6006ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        List<? extends W6006ListDomain> listDomainList = form.getListDomainList();
        if(null != listDomainList) {
            for (int i = 0; i < listDomainList.size(); i++) {
                if (FLAG_Y.equals(listDomainList.get(i).getDisabledFlg())) {
                    disableElementList.add(String.format("listDomainList[%d].selected", i));
                }
            }
        }
        
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
}
