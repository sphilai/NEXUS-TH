/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_SHIPPING_FIRM_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CONTAINER_LOOSE_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_WORKER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_SHIPPING_FIRM_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CONTAINER_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W5001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Shipping Confirmation Main Screen
 * <br />出荷確認Main画面の基底アクションクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class W5001AbstractAction extends AbstractAction {

    /** 
     * Common service.
     */
    protected CommonService commonService;
    
    /**
     * User authority service.
     */
    protected UserAuthService userAuthService;

    /**
     * constructor.
     */
    public W5001AbstractAction() {
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
     * - Get the pull-down list, set to request
     *     Call the CommonService.getPullDownList argument to the cut-off value of the next
     *         - Trans.
     *         - Status(Shipping Confirmation)
     *         - C/L
     *         - Issuer
     *         - Worker
     * - Set to request the pull-down list obtained
     * - Determination of function use authority
     *     If there is no function use authority-Register in person login, Create New button deactivation
     *
     * - プルダウンリストを取得
     *     次の区分値を引数にCommonService.getPullDownListの呼び出し
     *         - 輸送手段
     *         - 出荷確認ステータス
     *         - コンテナルーズ区分
     *         - 登録者
     *         - 作業者
     * - 取得したプルダウンリストをリクエストに設定
     * - 機能利用権限の判定
     *     ログイン者に機能利用権限-Registerがない場合、Create Newボタン非活性化
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W5001ActionForm w5001Form = (W5001ActionForm) form;
        
        // Display Settings common items.
        // 画面共通項目の設定
        setCommonInfo(w5001Form);
        
        // Setting of the pull-down list.
        // プルダウンリストの設定
        searchPullDownList(request, w5001Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     * <p>
     * <pre>
     * - Set the screen ID of transition source
     *     set the screen ID of transition source to action form
     *
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * </p>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        W5001ActionForm w5001Form = (W5001ActionForm) form;
        
        // Screen display control.
        // 画面表示制御
        controlDisplay(w5001Form, request);
        
        // Setting of the calling screen ID.
        // 呼出し元画面IDの設定
        w5001Form.setCallScreenId(SCREEN_ID_W5001);
    }

    /**
     * Set the items in the common information to action form
     * <br />画面の共通情報をactionFormに設定する。
     *
     * @param form action form
     */
    protected void setCommonInfo(W5001ActionForm form) {
        // Acquisition of screen common information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        // Language code.
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * Set the pull-down list to be displayed on the screen
     * <br />画面に表示するプルダウンリストを設定します。
     *
     * @param request HTTP request
     * @param langCd Language code
     * @throws ApplicationException not get a pull-down list
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        // Acquisition of each pull-down list.
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> transCdList = 
            commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> shippingFirmStatusList = 
            commonService.searchPullDownList(CD_TYPE_SHIPPING_FIRM_STATUS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> containerLooseTypList = 
            commonService.searchPullDownList(CD_TYPE_CONTAINER_LOOSE, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> issuerList = 
            commonService.searchPullDownList(CD_TYPE_ISSUER, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
        
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_TRANS_CD, transCdList);
        request.setAttribute(ATTR_SHIPPING_FIRM_STATUS, shippingFirmStatusList);
        request.setAttribute(ATTR_CONTAINER_LOOSE_TYP, containerLooseTypList);
        request.setAttribute(ATTR_ISSUER, issuerList);
        request.setAttribute(ATTR_WORKER, issuerList);
    }
    
    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - Active control of the button.
     *     - If W5001R authority there are no such
     *         Deactivate the button CreateNew
     *         
     * - Display control of the search results display area
     *     - Search button is pressed during
     *         Showing result display area
     *         
     *     - (Transition from) (including other menu screen) other than the above
     *         Hide search result display area
     * 
     * - ボタンの活性制御
     *     - W5001R権限が1つもない場合
     *         CreateNewボタンを非活性
     *         
     * - 検索結果表示エリアの表示制御
     *     - Searchボタン押下時
     *         検索結果表示エリアを表示する
     *         
     *     - 上記以外 (他画面(メニューを含む)からの遷移)
     *         検索結果表示エリアを非表示にする
     * </pre>
     * 
     * @param form action form
     * @param request HTTP request
     */
    protected void controlDisplay(W5001ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        // Active control of the button.
        // ボタンの活性制御
        if (!enableCreateNew()) {
            disableElementList.add("createNew");
        }
        
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
        
        // Display control of the search results area.
        // 検索結果エリアの表示制御
        if (SCREEN_ID_W5001.equals(form.getCallScreenId())) {
            form.setDisplayList(true);
        } else {
            form.setDisplayList(false);
        }
    }
    
    /**
     * To return the availability of CreateNew button.
     * <br />CreateNewボタンの利用可否を返します。
     *
     * @return True, false and otherwise be one or more is W5001R authority
     */
    protected boolean enableCreateNew() {
        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W5001R);
    }
}
