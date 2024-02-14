/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_REQUEST_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_INV_CTGY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_INV_CTGRY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1001;
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
 * The class of base action for Export Request Main screen.
 * <br />船積実績Main画面の基底アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public abstract class W1001AbstractAction extends AbstractAction {

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /** 
     * common service.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1001AbstractAction() {
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
     * - Acquisition of common screen information.
     *  Set the screen common item (LANGUAGE CODE) in Action Form.
     * - Get the pull-down list.
     *  Call CommonService.searchPullDownList () for the argument classification VALUE following.
     * And then set them in the request attribute pull-down list obtained.
     * </pre>
     * <pre>
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * ‐プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {
        
        W1001ActionForm w1001Form = (W1001ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w1001Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        searchPullDownList(request, w1001Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Set transition source SCREEN ID.
     *     Set the transition source SCREEN ID in Action Form.
     * </pre>
     * <pre>
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        W1001ActionForm w1001Form = (W1001ActionForm) form;
        
        // Screen fields attributes
        // 画面表示制御
        controlDisplay(w1001Form, request);
        
        // Set transition original screen id
        // 呼出し元画面IDの設定
        w1001Form.setCallScreenId(SCREEN_ID_W1001);
    }
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />アクション・フォーム
     */
    protected void setCommonInfo(W1001ActionForm form) {

        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param langCd LANGUAGE CODE<br />言語コード
     * @throws ApplicationException If can not get a pull-down list<br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {

        List<? extends SelectListItemDomain> statusList = commonService.searchPullDownList(CD_TYPE_STATUS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> issuerList = commonService.searchPullDownList(CD_TYPE_ISSUER, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
        List<? extends SelectListItemDomain> transCdList = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> invCtgryList = commonService.searchPullDownList(CD_TYPE_INV_CTGRY, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> flagList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        
        request.setAttribute(ATTR_REQUEST_STATUS, statusList);
        request.setAttribute(ATTR_ISSUER, issuerList);
        request.setAttribute(ATTR_TRANS_CD, transCdList);
        request.setAttribute(ATTR_INV_CTGY, invCtgryList);
        request.setAttribute(ATTR_FLAG, flagList);
    }
    
    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - If W1001B authority or W1001R authority there are no such
     *     The non-active the Add button
     * 
     * - W1001R権限またはW1001B権限が1つもない場合
     *     Addボタンを非活性
     * </pre>
     * 
     * @param form アクションフォーム
     * @param request HTTPリクエスト
     */
    protected void controlDisplay(W1001ActionForm form, HttpServletRequest request) {
        
        List<String> disableElementList = new ArrayList<String>();
        
        // Set screen button attributes.
        // ボタンの活性制御
        if (!enableSearch()) {
            disableElementList.add("search");
        }
        if (!enableCreateNew()) {
            disableElementList.add("createNew");
            disableElementList.add("upload");
            disableElementList.add("duplicate");
        }
        
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
        
        // Set search-results fields active/inactive.
        // 検索結果エリアの表示制御
        if (SCREEN_ID_W1001.equals(form.getCallScreenId())) {
            form.setDisplayList(true);
        } else {
            form.setDisplayList(false);
        }
    }
    
    /**
     *    The use propriety of the Search button is returned.
     * <br />Searchボタンの利用可否を返します。
     *
     * @return If there is one or more authority of W1001R or W1001B, they will be true, otherwise, false.<br />W1001RまたはW1001Bの権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableSearch() {
        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W1001R, PERMIT_FUNC_ID_W1001B);
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
