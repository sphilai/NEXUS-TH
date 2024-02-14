/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_INV_CTGY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ITEM_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PAY_METH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PRICE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRADE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREIGHT_RESPONSIBLE_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_INV_CTGRY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_ITEM_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PAY_METH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PRICE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRADE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FREIGHT_RESPONSIBLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1002;
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
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The base action class of Export Request Header screen.
 * <br />梱包指示Header画面の基底アクションクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class W1002AbstractAction extends InitialAbstractAction {

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /** 
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * W1001ExpRequestService service<br />
     * W1001ExpRequestService のサービス
     */
    protected W1001ExpRequestService w1001ExpRequestService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public W1002AbstractAction() {
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
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for w1001ExpRequestService.
     *
     * @param expRequestService Set for w1001ExpRequestService
     */
    public void setW1001ExpRequestService(W1001ExpRequestService expRequestService) {
        w1001ExpRequestService = expRequestService;
    }
    
    /**
     * {@inheritDoc}
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
        
        W1002ActionForm w1002Form = (W1002ActionForm) form;
        
        // Acquisition of a screen common items
        // 画面共通項目の取得
        setCommonInfo(w1002Form);
        
        // Setting of a pulldown list
        // プルダウンリストの設定
        searchPullDownList(request, w1002Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     *  - Set a call former SCREEN ID
     *     A call former SCREEN ID is set to action form.
     *  
     * - 呼出し元画面IDの設定
     *     アクション・フォームに呼出し元画面IDを設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        ((W1002ActionForm) form).setCallScreenId(SCREEN_ID_W1002);

        controlDisplay((W1002ActionForm) form, request);
    }

    /**
     * Set the item of a screen common information to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form action form<br />アクション・フォーム
     * @throws ApplicationException <br />
     */
    protected void setCommonInfo(W1002ActionForm form) throws ApplicationException {
        
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        // Setting of LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Acquire the pulldown list displayed on a screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param langCd LANGUAGE CODE<br />言語コード
     * @throws ApplicationException When an ApplicationException pulldown list is unacquirable<br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
       
        // Acquisition of each pulldown list
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> invCatList = commonService.searchPullDownList(CD_TYPE_INV_CTGRY, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        List<? extends SelectListItemDomain> flagList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        List<? extends SelectListItemDomain> itemTypeList = commonService.searchPullDownList(CD_TYPE_ITEM_TYPE, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> payMethList = commonService.searchPullDownList(CD_TYPE_PAY_METH, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        List<? extends SelectListItemDomain> priceTermsList = commonService.searchPullDownList(CD_TYPE_PRICE_TERMS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> tradeTermsList = commonService.searchPullDownList(CD_TYPE_TRADE_TERMS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> transCdList = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> loadingList = commonService.searchPullDownList(CD_TYPE_LOADING_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, false);
        List<? extends SelectListItemDomain> freightResList = commonService.searchPullDownList(CD_TYPE_FREIGHT_RESPONSIBLE, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        List<? extends SelectListItemDomain> currencyList = commonService.searchCurrencyPullDownList(true, false);
        List<? extends SelectListItemDomain> qtyUnitList = w1001ExpRequestService.searchUnitOfVolumePullDownList(true, false);
        List<? extends SelectListItemDomain> cntryList = w1001ExpRequestService.searchCntryCdPullDownList(false);

        // リクエスト属性の設定
        request.setAttribute(ATTR_INV_CTGY, invCatList);
        request.setAttribute(ATTR_FLAG, flagList);
        request.setAttribute(ATTR_ITEM_TYPE, itemTypeList);
        request.setAttribute(ATTR_PAY_METH, payMethList);
        request.setAttribute(ATTR_PRICE_TERMS, priceTermsList);
        request.setAttribute(ATTR_TRADE_TERMS, tradeTermsList);
        request.setAttribute(ATTR_TRANS_CD, transCdList);
        request.setAttribute(ATTR_LOADING_CD, loadingList);
        request.setAttribute(ATTR_FREIGHT_RESPONSIBLE_CD, freightResList);
        request.setAttribute("currencyList", currencyList);
        request.setAttribute("qtyUnit", qtyUnitList);
        request.setAttribute("cntry", cntryList);
    }
    
    /**
     * Acquire the pulldown list displayed on a screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param form W1002ActionForm<br />言語コード
     * @param request HTTP request<br />HTTPリクエスト
     * @throws ApplicationException When an ApplicationException pulldown list is unacquirable<br />プルダウンリストを取得できない場合
     */
    protected void searchContainerSortList(W1002ActionForm form, HttpServletRequest request) throws ApplicationException {
       
        // Acquisition of each pulldown list
        // 各プルダウンリストの取得
        W1001ExpRequestCriteriaDomain w1001ExpRequestCriteriaDomain = new W1001ExpRequestCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(w1001ExpRequestCriteriaDomain , form.getW1002CriteriaDomain());
        String containerSortingKey = w1001ExpRequestService.searchContSortKey(w1001ExpRequestCriteriaDomain);

        if (!CheckUtil.isBlankOrNull(form.getW1002CriteriaDomain().getCompCd())) {
            String shipToCntryCd = w1001ExpRequestService.searchNxsComp(form.getW1002CriteriaDomain().getCompCd()).getCntryCd();
            form.getW1002CriteriaDomain().setShipToCntryCd(shipToCntryCd);
        }
        form.getW1002CriteriaDomain().setContainerSortingKey(containerSortingKey);
    }
    
    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param form W1002ActionForm
     * @param request HttpServletRequest
     */
    protected void controlDisplay(W1002ActionForm form, HttpServletRequest request) {

        List<String> disableElementList = new ArrayList<String>();

        String procMode = form.getW1002CriteriaDomain().getProcMode();
        if (MODE_NEW.equals(procMode) || MODE_COPY_NEW.equals(procMode)) {
            // Set initial data
            disableElementList.add("import");
            disableElementList.add("moveToDescrip");
            disableElementList.add("cancel");
        }
        
        if (MODE_REF.equals(procMode)) {
            // Set disable data.
            if (form.isRegisterFlg()) {
                disableElementList.add("import");
                disableElementList.add("moveToDescrip");
                disableElementList.add("cancel");
            }
            if (form.isCancelFlg() || !enableCreateNew()) {
                disableElementList.add("import");
                disableElementList.add("register");
                disableElementList.add("cancel");
            }
        }

        if (MODE_EDIT.equals(procMode)) {
            // Set disable data.
            if (form.isRegisterFlg()) {
                disableElementList.add("register");
                disableElementList.add("moveToDescrip");
                disableElementList.add("import");
            }
            if (form.isCancelFlg() || !enableCreateNew()) {
                disableElementList.add("import");
                disableElementList.add("register");
                disableElementList.add("cancel");
            }
        }
        if (!CheckUtil.isBlankOrNull(form.getW1002CriteriaDomain().getRequestStatus())) {
            int requestSt = Integer.parseInt(form.getW1002CriteriaDomain().getRequestStatus().split(":")[0].trim());
            if (requestSt > 10) {
                disableElementList.add("import");
            }
        }
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
    
    /**
     *    The use propriety of the CreateNew button is returned.
     * <br />CreateNewボタンの利用可否を返します。
     *
     * @return If there is one or more W2001R authority, they will be true, otherwise, false.<br />W1001R権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableCreateNew() {
        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W1001R);
    }
}
