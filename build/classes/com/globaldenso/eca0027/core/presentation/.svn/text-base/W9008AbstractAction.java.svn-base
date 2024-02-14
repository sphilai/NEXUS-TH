/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CC_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CONTAINER_LOOSE_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DOC_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CC_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CONTAINER_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9008;
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
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Export Ship to Shipping MA Edit screen.
 * <br />Export Ship to Shipping MA Edit画面の基底アクションクラスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public abstract class W9008AbstractAction extends AbstractAction {

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
    public W9008AbstractAction() {
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
        
        W9008ActionForm W9008Form = (W9008ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(W9008Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        searchPullDownList(request, W9008Form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Specification of transition original screen ID
     *     Set the transition source screen ID in Action Form
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request
        , HttpServletResponse response, String forwardName) {

        ((W9008ActionForm) form).setCallScreenId(SCREEN_ID_W9008);
        
        controlDisplay((W9008ActionForm) form, request);
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form <br />アクション・フォーム
     */
    protected void setCommonInfo(W9008ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param form Action Form <br />アクション・フォーム
     * @throws ApplicationException If can not get a pull-down list <br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, W9008ActionForm form) throws ApplicationException {
        
        List<? extends SelectListItemDomain> loadingCdList 
            = commonService.searchPullDownList(CD_TYPE_LOADING_CD, form.getLanguageCd(), PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> clList 
            = commonService.searchPullDownList(CD_TYPE_CONTAINER_LOOSE, form.getLanguageCd(), PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> ccTypList 
            = commonService.searchPullDownList(CD_TYPE_CC_TYPE, form.getLanguageCd(), PULLDOWN_DISP_TYPE_CODE, true);
        // NL023 ADD START
        List<? extends SelectListItemDomain> flagList
            = commonService.searchPullDownList(CD_TYPE_FLAG, form.getLanguageCd(), PULLDOWN_DISP_TYPE_CODE, true);
        // NL023 ADD END
        
        List<? extends SelectListItemDomain> invTemplateList = null;
        if (form.getW9008CriteriaDomain() != null && form.getW9008CriteriaDomain().getShipperCd() != null) {
            invTemplateList = commonService.searchInvTemplatePullDownList(form.getW9008CriteriaDomain().getShipperCd(), true);
        } else {
            // Set empty data as a pull down list of the ship registry document template.
            // 船積書類テンプレート原単位プルダウンリストに空を設定
            List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
            SelectListItemDomain bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
            invTemplateList = list;
        }
        
        request.setAttribute(ATTR_LOADING_CD, loadingCdList);
        request.setAttribute(ATTR_CONTAINER_LOOSE_TYP, clList);
        request.setAttribute(ATTR_DOC_NO, invTemplateList);
        request.setAttribute(ATTR_CC_TYPE, ccTypList);
        request.setAttribute(ATTR_FLAG, flagList); // NL023 ADD
    }
    
    /**
     * Get the document template Vessel product per unit of the pull-down list.
     * <br />船積書類テンプレート原単位プルダウンリストを取得します。
     *
     * @param request  HTTP request <br />HTTPリクエスト
     * @param shipperCd Shipper
     * @throws ApplicationException If can not get a pull-down list <br />プルダウンリストを取得できない場合
     */
    protected void searchInvTemplatePullDownList(HttpServletRequest request, String shipperCd) throws ApplicationException {
        
        List<? extends SelectListItemDomain> invTemplateList
            = commonService.searchInvTemplatePullDownList(shipperCd, true);
        
        request.setAttribute(ATTR_DOC_NO, invTemplateList);
    }
    
    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - If W9007B authority or W9007R authority there are no such
     *     The inactive the Register button
     * 
     * - W9007R権限またはW9007B権限が1つもない場合
     *     Registerボタンを非活性
     * </pre>
     * 
     * @param form Action Form <br />アクションフォーム
     * @param request HTTP Request <br />HTTPリクエスト
     */
    protected void controlDisplay(W9008ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();

        if(FLAG_Y.equals(form.getW9008CriteriaDomain().getUserAuthForComp())){
            if(form.getW9008CriteriaDomain().getProcMode().equals(MODE_EDIT_REF)){
                form.getW9008CriteriaDomain().setProcMode(MODE_EDIT);
            }
        }else{
            if(form.getW9008CriteriaDomain().getProcMode().equals(MODE_EDIT_REF)){
                form.getW9008CriteriaDomain().setProcMode(MODE_REF);
            }
        }
        
        if(form.getW9008CriteriaDomain().getProcMode().equals(MODE_REF)){
            disableElementList.add("register");
            disableElementList.add("w9008CriteriaDomain.customTimingTyp");
        }
        
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
    /**
     * <br />Add as {@link ActionMessages # GLOBAL_MESSAGE} the specified message
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP Request <br />HTTPリクエスト
     * @param messageId messageId <br />メッセージID
     * @param args  messageArgument <br />メッセージ引数
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
}
