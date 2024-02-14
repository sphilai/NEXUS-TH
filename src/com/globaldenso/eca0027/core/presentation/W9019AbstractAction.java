/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_EXP_REGULATION_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9018;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9019;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9019CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base class of action of Export Formalities by Item MA Edit screen.
 * <br />Export Formalities by Item MA Edit画面のの基底アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public abstract class W9019AbstractAction extends AbstractAction {

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
    public W9019AbstractAction() {
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
        
        W9019ActionForm w9019Form = (W9019ActionForm) form;
        
        // Get of common entry screen.
        // 画面共通項目の取得
        setCommonInfo(w9019Form);
        
        // Setting of the pull-down list.
        // プルダウンリストの設定
        searchPullDownList(request, w9019Form);
        
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
        
        ((W9019ActionForm) form).setCallScreenId(SCREEN_ID_W9019);
        
        controlDisplay((W9019ActionForm) form, request);
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form <br />アクション・フォーム
     */
    protected void setCommonInfo(W9019ActionForm form) {
        
        // Get of screen common information domain.
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // setting the language code.
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param w9019Form form <br />フォーム
     * @throws ApplicationException If can not get a pull-down list <br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, W9019ActionForm w9019Form) throws ApplicationException {
        
        String langCd = w9019Form.getLanguageCd();
        String company = "";
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(w9019Form.getWindowId());
        if(windowInfo.getScreenInfo().containsKey(SCREEN_ID_W9019)){
            W9019ActionForm form = (W9019ActionForm) ((ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W9019)).getActionForm();
            company = form.getW9019CriteriaDomain().getCompCd();
            
        } else if(windowInfo.getScreenInfo().containsKey(SCREEN_ID_W9018)){
            W9018ActionForm form = (W9018ActionForm) ((ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W9018)).getActionForm();
            company = form.getW9018CriteriaDomain().getCompCd();
        }
        
        // performed the acquisition of each pull-down.
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> expRegList = commonService.searchExpRegulationTypePullDownList(company, true, true);
        List<? extends SelectListItemDomain> flgList  = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, false);
        
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_EXP_REGULATION_TYPE, expRegList);
        request.setAttribute(ATTR_FLAG, flgList);
    }
    
    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - If W9016B authority or W9016R authority there are no such
     *     The inactive the Register button
     * 
     * - W9016R権限またはW9016B権限が1つもない場合
     *     Registerボタンを非活性
     * </pre>
     * 
     * @param form Action Form <br />アクションフォーム
     * @param request HTTP request <br />HTTPリクエスト
     */
    protected void controlDisplay(W9019ActionForm form, HttpServletRequest request) {
        
        List<String> disableElementList = new ArrayList<String>();
        
        W9019CriteriaDomain criteriaDomain = form.getW9019CriteriaDomain();
        if (MODE_REF.equals(criteriaDomain.getMode())) {
            // REF mode
            // 参照モード
            disableElementList.add("register");
            disableElementList.add("select");
            disableElementList.add("w9019CriteriaDomain.expLimitTyp");
            disableElementList.add("w9019CriteriaDomain.dngrItemFlg");
            disableElementList.add("w9019CriteriaDomain.originCntryCd");
            disableElementList.add("w9019CriteriaDomain.free1RegFlg");
            disableElementList.add("w9019CriteriaDomain.free2RegFlg");
            disableElementList.add("w9019CriteriaDomain.free3RegFlg");
            disableElementList.add("w9019CriteriaDomain.free1Dtl");
            disableElementList.add("w9019CriteriaDomain.free2Dtl");
            disableElementList.add("w9019CriteriaDomain.free3Dtl");
            disableElementList.add("w9019CriteriaDomain.free1OriginCntryFlg");
            disableElementList.add("w9019CriteriaDomain.free2OriginCntryFlg");
            disableElementList.add("w9019CriteriaDomain.free3OriginCntryFlg");
            
        } else {
            // NEW mode, EDIT mode, COPY NEW mode
            // 新規モード、修正モード、コピー新規モード
            if (FLAG_N.equals(criteriaDomain.getCigmaPrdctFlg())) {
                disableElementList.add("select");
                disableElementList.add("w9019CriteriaDomain.expLimitTyp");
                disableElementList.add("w9019CriteriaDomain.originCntryCd");
            }
            // FreeN Value
            if (FLAG_N.equals(criteriaDomain.getFree1RegFlg())) {
                disableElementList.add("w9019CriteriaDomain.free1Dtl");
                disableElementList.add("w9019CriteriaDomain.free1OriginCntryFlg");
            }
            if (FLAG_N.equals(criteriaDomain.getFree2RegFlg())) {
                disableElementList.add("w9019CriteriaDomain.free2Dtl");
                disableElementList.add("w9019CriteriaDomain.free2OriginCntryFlg");
            }
            if (FLAG_N.equals(criteriaDomain.getFree3RegFlg())) {
                disableElementList.add("w9019CriteriaDomain.free3Dtl");
                disableElementList.add("w9019CriteriaDomain.free3OriginCntryFlg");
            }
        }
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);            
    }
    
    /**
     * <br />Business domain class initialization process
     * <br />業務ドメインクラス初期設定処理
     * 
     * @param criteriaDomain domain class
     * @param windowId Window Id
     * @param screenId Screen Id
     * @return domain Class
     */
    protected W9019CriteriaDomain prepareBusinessDomain(W9019CriteriaDomain criteriaDomain, String windowId, String screenId) {
        String compCd = criteriaDomain.getCompCd();

        Timestamp updateTime = criteriaDomain.getComUpdateTimestamp();
        String mode = criteriaDomain.getMode();
        
        ActionUtil.prepareBusinessDomain(criteriaDomain, windowId, screenId);
        criteriaDomain.setCompCd(compCd);
        if(mode != null && mode.equals("2")){
            criteriaDomain.setComUpdateTimestamp(updateTime);
        }
        
        return criteriaDomain;
    }
    
    /**
     * Add the specified message to {@link ActionMessages#GLOBAL_MESSAGE}.
     * 
     * @param request HTTP request
     * @param messageId MESSAGE ID
     * @param args Message argument
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        // Add Message
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        // Register GLOBAL_MESSAGE
        addMessages(request, messages);
    }
}
