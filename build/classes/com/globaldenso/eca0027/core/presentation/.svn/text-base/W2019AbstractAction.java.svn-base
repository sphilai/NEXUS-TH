/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PALLET_CARTON_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PALLET_CARTON_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2019;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 *    This is a base action class of a CML Trans Revise screen.
 * <br />CML Trans Revise画面の基底アクションクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public abstract class W2019AbstractAction extends AbstractAction {

    /** 
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * constructor.
     */
    public W2019AbstractAction() {
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
     * {@inheritDoc}.
     * <pre>
     * - A pulldown list is acquired.
     *       This is an invoke of CommonService.getPullDownList to an argument about the following classification VALUE.
     *         - Change Trans. To Air
     *
     * - Maintenance of a Transition original screen
     *
     * - The acquired pulldown list is set as a request.
     *
     * - プルダウンリストを取得
     *     次の区分値を引数にCommonService.getPullDownListの呼び出し
     *         - Change Trans. To Air
     * 
     * - 遷移元画面の保持
     * 
     * - 取得したプルダウンリストをリクエストに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2019ActionForm w2019Form = (W2019ActionForm)form;
        
        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2019Form);
        
        // Get pulldown lists
        // プルダウンリストの設定
        searchPullDownList(request, w2019Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Set transition original screen id
     *       Transition-original-screen ID is set to action form.
     *
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        controlDisplay((W2019ActionForm)form, request);
        
        ((W2019ActionForm) form).setCallScreenId(SCREEN_ID_W2019);
    }
    
    /**
     * Set the item of a screen common information to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     * 
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2019ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * Acquire the pulldown list displayed on a screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param langCd LANGUAGE CODE<br />言語コード
     * @throws ApplicationException When a pulldown list is unacquirable<br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        // Acquisition of each pulldown list
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> flagList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, false);
        // UT420 ADD START
        List<? extends SelectListItemDomain> palletCartonTyp = commonService
            .searchPullDownList(CD_TYPE_PALLET_CARTON_TYP, langCd,
                PULLDOWN_DISP_TYPE_VALUE, false);
        // UT420 ADD END

        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_FLAG, flagList);
        request.setAttribute(ATTR_PALLET_CARTON_TYP, palletCartonTyp); // UT420 ADD
    }

    /**
     *    Display control of an item is performed.
     * <br />項目の表示制御を行います。
     *
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(W2019ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        if (FLAG_Y.equals(form.getW2019CriteriaDomain().getReviseFlg())) {
            disableElementList.add("w2019CriteriaDomain.reviseFlg");
        }
        
        // UT110 TRIAL SHIPMENT/号試品対応 ADD
        if (FLAG_Y.equals(form.getW2019CriteriaDomain().getManualRegFlg())) {
            disableElementList.add("select");
            disableElementList.add("clear");
        }
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }

    /**
     *    The specified message is added as {@link ActionMessages#GLOBAL_MESSAGE}.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param messageId MESSAGE ID<br />メッセージID
     * @param args Message argument<br />メッセージ引数
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        // Addition of a message
        // メッセージの追加
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        // Registration of GLOBAL_MESSAGE
        // GLOBAL_MESSAGEの登録
        addMessages(request, messages);
    }

}
