/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2007ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Multiple Item No. in 1Box PKG Create
 * <br />小箱内多品番梱包Create画面の基底アクションクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11003 $
 */
public abstract class W2007AbstractAction extends AbstractAction {

    /** 
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * constructor.
     */
    public W2007AbstractAction() {
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
     * {@inheritDoc}.
     * <pre>
     * - Acquisition of a screen common information
     *       A screen common items (LANGUAGE CODE) is set to action form.
     *
     * - A pulldown list is acquired.
     *       This is an invoke of CommonService.getPullDownList to an argument about the following classification VALUE.
     *         - LD CD
     *
     *       The acquired pulldown list is set as a request.
     * 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストを取得
     *     次の区分値を引数にCommonService.getPullDownListの呼び出し
     *         - LD CD
     *         
     *     取得したプルダウンリストをリクエストに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2007ActionForm w2007Form = (W2007ActionForm) form;
        
        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2007Form);
        
        // Get pulldown lists
        // プルダウンリストの設定
        searchPullDownList(request, w2007Form.getLanguageCd());
        
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
        
        W2007ActionForm w2007Form = (W2007ActionForm) form;
        
        // Display control
        // 表示制御
        controlDisplay(request, w2007Form);

        ((W2007ActionForm) form).setCallScreenId(SCREEN_ID_W2007);
    }

    /**
     * The item of a screen common information is set to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2007ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * The pulldown list displayed on a screen is acquired.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param langCd LANGUAGE CODE<br />言語コード
     * @throws ApplicationException When a pulldown list is unacquirable<br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        
        // Acquisition of each pulldown list
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> loadingCdList = commonService.searchPullDownList(CD_TYPE_LOADING_CD, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_LOADING_CD, loadingCdList);
    }
    
    /**
     * The locale of a screen common information is acquired.
     * <br />画面共通情報のロケールを取得します。
     *
     * @param form Action form<br />アクションフォーム
     * @return The locale of a screen common information<br />画面共通情報のロケール
     */
    protected Locale getLocale(W2007ActionForm form) {
        
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        return commonInfo.getLocale();
    }
    
    /**
     * Display control of a Multiple Item No. in 1Box PKG Create screen is performed.
     * <br />小箱内多品Create画面の表示制御を行います。
     * @param request Request<br />リクエスト
     * @param form Action form of a Multiple Item No. in 1Box PKG Create screen<br />小箱内多品Create画面のアクション・フォーム
     */
    protected void controlDisplay(HttpServletRequest request, W2007ActionForm form) {
        
        // Header screen
        // Header画面からの遷移時
        if (SCREEN_ID_W2006.equals(form.getCallScreenId()) || SCREEN_ID_W2008.equals(form.getCallScreenId())) {
            form.setDisplayList(false);
            
        // Other than this
        // それ以外
        } else {
            form.setDisplayList(true);

            List<String> disableList = new ArrayList<String>();
            
            // Set CK, QUANTITY attributes.
            // CK、数量の活性制御
            List<? extends W2007ListDomain> listDomainList = form.getListDomainList();
            if (!CollectionUtils.isEmpty(listDomainList)) {
                for (int i = 0; i < listDomainList.size(); i++) {
                    boolean isDisabled = FLAG_Y.equals(listDomainList.get(i).getDisabledFlg());
                    boolean isSelected = CHECK_ON.equals(listDomainList.get(i).getSelected());
                    boolean isQtyEmpty = StringUtils.isEmpty(listDomainList.get(i).getQty());
                    boolean isTagQtyEmpty = StringUtils.isEmpty(listDomainList.get(i).getTagQty());
                    
// To speed up of the drawing process, don't use disableList to do display control of list items.
// 描画速度を上げるために、一覧の項目制御には disableList を使用しないようにしています。
//
//                    // Setting of a check box
//                    // チェックボックスの設定
                    if (isDisabled) {
                        // listDomainList.get(i).setSelected(CHECK_ON);
                        disableList.add(String.format("listDomainList[%d].selected", i));
                    } else {
                        // listDomainList.get(i).setSelected(CHECK_OFF);
                    }
                    
                    if (isDisabled && !isSelected && isQtyEmpty && isTagQtyEmpty) {
                        disableList.add(String.format("listDomainList[%d].qty", i));
                        disableList.add(String.format("listDomainList[%d].tagQty", i));
                    }

                    // Setting of a check box
                    // チェックボックスの設定
//                    listDomainList.get(i).setSelectedDisabled("false");
//                    listDomainList.get(i).setQtyDisabled("false");
//                    listDomainList.get(i).setTagQtyDisabled("false");
//
//                    if (isDisabled) {
//                        listDomainList.get(i).setSelectedDisabled("true");
//                    } else {
//                    }
//                    
//                    if (isDisabled && !isSelected && isQtyEmpty && isTagQtyEmpty) {
//                        listDomainList.get(i).setQtyDisabled("true");
//                        listDomainList.get(i).setTagQtyDisabled("true");
//                    }
                }
            }
            
            // Setting of an un-active item
            // 非活性項目の設定
            request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
        }
    }
    
    /**
     * The specified message is added as {@link ActionMessages#GLOBAL_MESSAGE}.
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
        
        // GLOBAL_MESSAGE
        // GLOBAL_MESSAGEの登録
        addMessages(request, messages);
    }
}
