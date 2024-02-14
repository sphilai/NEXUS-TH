/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base class of action Documentation Shipping Information Input screen.
 * <br />通関書類作成業務 Shipping Information Input画面の基底アクションクラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public abstract class W6005AbstractAction extends AbstractAction {
    /** 
     * common services
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6005AbstractAction() {
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
     * {@inheritDoc}
     * <pre>
     * - Acquisition of common screen information
     *     Set the screen common item (LANGUAGE CODE) in Action Form
     * </pre>
     * <pre>
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W6005ActionForm w6005Form = (W6005ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w6005Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Set of transition source SCREEN ID
     *     Set the transition source SCREEN ID in Action Form
     * </pre>
     * <pre>
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        controlDisplay((W6005ActionForm) form, request);
        
        ((W6005ActionForm) form).setCallScreenId(SCREEN_ID_W6005);
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W6005ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        Eca0027CommonInfoDomain info = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();
        
        form.setCntryCd(info.getCntryCd());
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * 
     * <br />Display control of the screen.
     * 
     * @param form Action form of screen<br />
     * 画面のアクションフォーム
     * @param request Request of the screen<br />
     * 画面のリクエスト
     */
    protected void controlDisplay(W6005ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        if (SCREEN_ID_W6006.equals(form.getCriteriaDomain().getOriginalScreenId())) {
            disableElementList.add("criteriaDomain.carrierCompCd");
            disableElementList.add("criteriaDomain.forwarderCompCd");
            disableElementList.add("criteriaDomain.fmCntryCd");
            disableElementList.add("criteriaDomain.loadingPortCd");
            disableElementList.add("criteriaDomain.toCntryCd");
            disableElementList.add("criteriaDomain.dischargePortCd");
            disableElementList.add("criteriaDomain.vessel");
            disableElementList.add("criteriaDomain.etd");
            disableElementList.add("criteriaDomain.eta");
            disableElementList.add("criteriaDomain.arrivalTime");
            
            disableElementList.add("select");
        }
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
}
