/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;


import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CC_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CC_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_DISPLAY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9016R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9016;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

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
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Export Shipping Item Special Information MA Inquiry screen.
 * <br />Export Shipping Item Special Information MA Inquiry画面の基底アクションクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12652 $
 */
public abstract class W9016AbstractAction extends AbstractAction {

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /** 
     * common services
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9016AbstractAction() {
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
     * {@inheritDoc}
     * <pre>
     * ‐Acquisition of common screen information
     *     Set the screen common items (language code) in Action Form
     * ‐Acquisition of the pull-down list
     *     Call CommonService.searchPullDownList () for argument classification values:
     *         ‐Transport
     *         ‐containerLoose classification
     *         ‐Freight Res. Cd
     *         ‐Vessel product performance Status
     *         ‐Flag
     *     And then set them in the request attribute pull-down list obtained
     * 
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * ‐プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         ‐輸送手段
     *         ‐コンテナルーズ区分
     *         ‐運賃支払いコード
     *         ‐船積実績ステータス
     *         ‐フラグ
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W9016ActionForm W9016Form = (W9016ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(W9016Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        searchPullDownList(request, W9016Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Specification of transition original screen ID
     *     Set the transition source screen ID in Action Form
     * 
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {
        
        ((W9016ActionForm) form).setCallScreenId(SCREEN_ID_W9016);
        
        controlDisplay((W9016ActionForm) form, request);
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form
     */
    protected void setCommonInfo(W9016ActionForm form) {
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
        form.setOwnerCompCd(commonInfo.getOwnerCompCd());
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param langCd Language code <br />言語コード
     * @throws ApplicationException If can not get a pull-down list <br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        
        List<? extends SelectListItemDomain> stgInstrFlgList 
            = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> ccTypeList 
            = commonService.searchPullDownList(CD_TYPE_CC_TYPE, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        // UT387
        List<? extends SelectListItemDomain> displayList 
            = commonService.searchPullDownList(CD_TYPE_DISPLAY, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        
        request.setAttribute("stgInstrFlg", stgInstrFlgList);
        request.setAttribute(ATTR_CC_TYPE, ccTypeList);
        request.setAttribute("display", displayList);
    }
    
    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - If W9016B authority or W9016R authority there are no such
     *     The non-active the Add button
     * 
     * - W9016R権限またはW9016B権限が1つもない場合
     *     Addボタンを非活性
     * </pre>
     * 
     * @param form アクションフォーム
     * @param request HTTPリクエスト
     */
    protected void controlDisplay(W9016ActionForm form, HttpServletRequest request) {
        
        if (!enableAdd()) {
            // Set disable the Add button.
            // Addボタンを非活性状態にする
            ((W9016ActionForm) form).getW9016CriteriaDomain().setSelectCondition("3");
        }
    }
    
    /**
     * Return the availability of the Add button.
     * <br />Addボタンの利用可否を返します。
     *
     * @return True, false and if not, if there is authority of Register All or W9016R <br />Register All、またはW9016Rの権限があればtrue、そうでなければfalse
     */
    protected boolean enableAdd() {
        if (userAuthService.hasRegisterAll()
            || !userAuthService.getUserAuthList(PERMIT_FUNC_ID_W9016R).isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTPリクエスト
     * @param messageId メッセージID
     * @param args メッセージ引数
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
}
