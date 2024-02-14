/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREIGHT_RESPONSIBLE_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PALLET_CARTON_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PRICE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FREIGHT_RESPONSIBLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PALLET_CARTON_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PRICE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WC001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 *    This is a base action class of a return recommendation packing-style create, re printing, and a cancellation screen.
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面の基底アクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public abstract class WC001AbstractAction extends AbstractAction {

    /** 
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public WC001AbstractAction() {
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
     * - Acquisition of a screen common information
     *       A screen common items (LANGUAGE CODE) is set to action form.
     *
     * - Acquisition of a pulldown list
     *       This is a call about CommonService.searchPullDownList() to an argument in the following classification VALUE.
     *       The acquired pulldown list is set as a request attribute.
     * 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        WC001ActionForm wc001Form = (WC001ActionForm) form;
        
        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(wc001Form);
        
        // Get pulldown lists
        // プルダウンリストの設定
        searchPullDownList(request, wc001Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Set transition original screen id
     *       Transition-original-screen ID is set to action form.
     * 
     * 
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        ((WC001ActionForm) form).setCallScreenId(SCREEN_ID_WC001);
    }

    /**
     * Set the item of a screen common information to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(WC001ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        Eca0027CommonInfoDomain commonInfo = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();

        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
        
        // // A login user's capacity unit is set up.
        // // ログインユーザーの容量単位を設定
        // form.getCriteriaDomain().setVolumeUnit(commonInfo.getVolumeUnit());
        
        // Date format (for screen display)  
        // 日付フォーマット (画面表示用)
        form.getCriteriaDomain().setDateFormat(commonInfo.getScreenDateFormat());
        
        // SERVER ID
        // サーバーID
        form.getCriteriaDomain().setServerId(commonInfo.getServerId());
        
        // Inv.Category -- "N" -- it fixes
        // Inv.Categoryは"N"固定
        form.getCriteriaDomain().setInvoiceCtgry(FLAG_N);
    }
    
    /**
     *    The locale of a screen common information is acquired.
     * <br />画面共通情報のロケールを取得します。
     *
     * @param form Action form<br />アクションフォーム
     * @return The locale of a screen common information<br />画面共通情報のロケール
     */
    protected Locale getLocale(WC001ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        return commonInfo.getLocale();
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
        List<? extends SelectListItemDomain> transCdList = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> freightResponsibleList = commonService.searchPullDownList(CD_TYPE_FREIGHT_RESPONSIBLE, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, false);
        List<? extends SelectListItemDomain> loadingCdList = commonService.searchPullDownList(CD_TYPE_LOADING_CD, langCd, PULLDOWN_DISP_TYPE_CODE, false);
        List<? extends SelectListItemDomain> priceTermsList = commonService.searchPullDownList(CD_TYPE_PRICE_TERMS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        // UT420 ADD START
        List<? extends SelectListItemDomain> palletCartonTyp = commonService
            .searchPullDownList(CD_TYPE_PALLET_CARTON_TYP, langCd,
                PULLDOWN_DISP_TYPE_VALUE, false);
        // UT420 ADD END
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_TRANS_CD, transCdList);
        request.setAttribute(ATTR_FREIGHT_RESPONSIBLE_CD, freightResponsibleList);
        request.setAttribute(ATTR_LOADING_CD, loadingCdList);
        request.setAttribute(ATTR_PRICE_TERMS, priceTermsList);
        request.setAttribute(ATTR_PALLET_CARTON_TYP, palletCartonTyp); // UT420 ADD
    }

    /**
     * Screen fields attributes.
     * <br />画面表示制御を行います。
     * <pre>
     * From - Clear screen to the time of changes
     *     The following items are made into non-activity.
     *       - Register button
     *       - Print CML button
     *       - Clear button
     * 
     * 
     * - Clear画面から遷移時
     *   以下の項目を非活性にする
     *     - Registerボタン
     *     - Print CMLボタン
     *     - Clearボタン
     * 
     * </pre>
     * 
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(WC001ActionForm form, HttpServletRequest request) {
        // List of un-active items
        // 非活性項目のリスト
        List<String> disableElementList = new ArrayList<String>();
        WC001CriteriaDomain criteria = form.getCriteriaDomain();

        if (criteria.getActionSelect().equals("1")) {
            // Register is active at the time of CreateNew.
            // CreateNew時はRegisterは活性
            if (disableElementList.contains("register")) {
                disableElementList.remove("register");
            }
            // Display is active at the time of CreateNew.
            // CreateNew時はDisplayは活性
            if (disableElementList.contains("display")) {
                disableElementList.remove("display");
            }
        } else {

            // Register is un-active except CreateNew.
            // CreateNew以外はRegisterは非活性
            if (!disableElementList.contains("register")) {
                disableElementList.add("register");
            }
            // Display is un-active except CreateNew.
            // CreateNew以外はDisplayは非活性
            if (!disableElementList.contains("display")) {
                disableElementList.add("display");
            }
        }
        
        if (disableElementList.contains("register")) {
            // printCml is active if this is CreateNew and Re-Print.
            // CreateNew、Re-Printであれば、printCmlは活性
            if (criteria.getActionSelect().equals("1") || criteria.getActionSelect().equals("2") ) {
                if (disableElementList.contains("printCml")) {
                    disableElementList.remove("printCml");
                }
            } else {
                if (!disableElementList.contains("printCml")) {
                    disableElementList.add("printCml");
                }
            }

            // printCml is active if this is CreateNew.
            // CreateNewであれば、printCmlは活性
            if (criteria.getActionSelect().equals("1")) {
                if (disableElementList.contains("clear")) {
                    disableElementList.remove("clear");
                }
            } else {
                if (!disableElementList.contains("clear")) {
                    disableElementList.add("clear");
                }
            }
        } else {

            if (!disableElementList.contains("printCml")) {
                disableElementList.add("printCml");
            }
            if (!disableElementList.contains("clear")) {
                disableElementList.add("clear");
            }
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
