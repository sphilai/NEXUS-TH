/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1004;
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
import com.globaldenso.eca0027.core.business.domain.W1004KitListDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Export Request Kit screen.
 * <br />梱包指示Header画面の基底アクションクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class W1004AbstractAction extends AbstractAction {

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
    public W1004AbstractAction() {
        super();
    }

    /**
     * Getter method for commonService.
     *
     * @return the commonService
     */
    public CommonService getCommonService() {
        return commonService;
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
        
        W1004ActionForm w1004Form = (W1004ActionForm) form;
        
        // Acquisition of a screen common items
        // 画面共通項目の取得
        setCommonInfo(w1004Form);
        
        // Setting of a pulldown list
        // プルダウンリストの設定
        searchPullDownList(request, w1004Form.getLanguageCd());
        
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

        W1004ActionForm w1004Form = (W1004ActionForm) form;
        
        // Display control
        // 表示制御
        controlDisplay(request, w1004Form);

        // A setting of call former SCREEN ID
        // 呼出し元画面IDの設定
        w1004Form.setCallScreenId(SCREEN_ID_W1004);
        
    }

    /**
     * Set the item of a screen common information to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W1004ActionForm form) {
        
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Setting of LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
        
        // The display control of list area is initialized.
        // 一覧エリアの表示制御を初期化
        form.setDisplayList(true);
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
        List<? extends SelectListItemDomain> flagList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        List<? extends SelectListItemDomain> qtyUnitList = commonService.searchUnitOfWeightPullDownList(true, true);
        List<? extends SelectListItemDomain> cntryList = w1001ExpRequestService.searchCntryCdPullDownList(true);
        List<? extends SelectListItemDomain> currencyList = commonService.searchCurrencyPullDownList(true, true);

        // リクエスト属性の設定
        request.setAttribute(ATTR_FLAG, flagList);
        request.setAttribute("qtyUnit", qtyUnitList);
        request.setAttribute("cntry", cntryList);
        request.setAttribute("currency", currencyList);
    }

    /**
     *    Display control of a screen item is performed.
     * <br />画面項目の表示制御を行います。
     * <pre>
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクションフォーム
     */
    protected void controlDisplay(HttpServletRequest request,
        W1004ActionForm form) {

        // List of un-active items
        List<String> disableList = new ArrayList<String>();
       
        // Un-active [ about a list item ]
        List<? extends W1004KitListDomain> kitList = form.getKitList();

        if (kitList == null || kitList.size() == 0) {
            form.setDisplayList(false);
            disableList.add("addNewLine10");
            disableList.add("copy");
            disableList.add("save");
            disableList.add("delete");
        } else {
            disableList.add("copy");
            disableList.add("delete");
            boolean removeFlg = false;
            int requestSt = Integer.parseInt(form.getW1004CriteriaDomain().getRequestStatus());
            if (requestSt > 40 || !enableCreateNew()) {
                disableList.add("addNewLine10");
                disableList.add("copy");
                disableList.add("save");
                disableList.add("delete");
            }
            for (int i = 0; i < kitList.size(); i++ ) {
                W1004KitListDomain w1004KitDomain = kitList.get(i);
                w1004KitDomain.setSelected("");
                if (CheckUtil.isBlankOrNull(w1004KitDomain.getExpRequestKitId())) {
                    disableList.add(String.format("kitList[%d].selected", i));
                }else{
                    removeFlg = true;
                }
            }
            if (removeFlg && enableCreateNew()) {
                disableList.remove("copy");
                disableList.remove("delete");
            }
        }
        

        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
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
