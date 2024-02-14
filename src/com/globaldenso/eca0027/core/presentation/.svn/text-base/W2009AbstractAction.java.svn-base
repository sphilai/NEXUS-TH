/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2009;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of CML Main Screen
 * <br />CML一覧画面の基底アクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12609 $
 */
public abstract class W2009AbstractAction extends AbstractAction {

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
    public W2009AbstractAction() {
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
     * 
     * <pre>
     * - Acquisition of a pulldown list
     *       This is a call about CommonService.searchPullDownList() to an argument in the following classification VALUE.
     *           - Transport
     *           - Flag
     *           - Registrant
     *       The acquired pulldown list is set as a request attribute.
     *
     * - プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         - 輸送手段
     *         - フラグ
     *         - 登録者
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W2009ActionForm w2009Form = (W2009ActionForm)form;

        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2009Form);

        // Get pulldown lists
        // プルダウンリストの設定
        searchPullDownList(request, w2009Form.getLanguageCd());

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
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {

        ((W2009ActionForm)form).setCallScreenId(SCREEN_ID_W2009);
    }

    /**
     * Set the item of a screen common information to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     * 
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2009ActionForm form) {
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
    protected void searchPullDownList(HttpServletRequest request, String langCd)
        throws ApplicationException {
        // Acquisition of each pulldown list
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> transCdList = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> flagList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> issuerList = commonService.searchPullDownList(CD_TYPE_ISSUER, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
        
        request.setAttribute(ATTR_TRANS_CD, transCdList);
        request.setAttribute(ATTR_FLAG, flagList);
        request.setAttribute(ATTR_ISSUER, issuerList);
    }
    
    /**
     * Screen fields attributes.
     * <br />画面表示制御を行います。
     * <pre>
     * When one does not have - W2009R authority
     *       Un-active in the CreateNew button
     *
     * When one does not have - W2009R authority or W2009B authority
     *       Un-active in the Search button
     *
     * - W2009R権限が1つもない場合
     *     CreateNewボタンを非活性
     * 
     * - W2009R権限またはW2009B権限が1つもない場合
     *     Searchボタンを非活性
     * </pre>
     * 
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(W2009ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        if (!enableSearch()) {
            disableElementList.add("search");
        }
        if (!enableCreateNew()) {
            disableElementList.add("createNew");
        }
        // UT414 ADD START
        if (!enablePrintMultiCml(form.getListDomainList())) {
            disableElementList.add("printMultiCml");
        }
        // UT414 ADD END
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
    
    /**
     *    The use propriety of the Search button is returned.
     * <br />Searchボタンの利用可否を返します。
     *
     * @return If there is one or more authority of W2009R or W2009B, they will be true, otherwise, false.<br />W2009RまたはW2009Bの権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableSearch() {
        if (!userAuthService.getUserAuthList(PERMIT_FUNC_ID_W2009R, PERMIT_FUNC_ID_W2009B).isEmpty()) {
            return true;
        }
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            return true;
        }
        return false;
    }
    
    /**
     *    The use propriety of the CreateNew button is returned.
     * <br />CreateNewボタンの利用可否を返します。
     *
     * @return If there is one or more W2009R authority, they will be true, otherwise, false.<br />W2009R権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableCreateNew() {
        if (!userAuthService.getUserAuthList(PERMIT_FUNC_ID_W2009R).isEmpty()) {
            return true;
        }
        if (userAuthService.hasRegisterAll()) {
            return true;
        }
        return false;
    }

    /**
     * The use propriety of the printMultiCml button is returned.
     * <br />printMultiCmlボタンの利用可否を返します。
     * UT414 ADD
     * 
     * @param w2009ListDomainList search result list/検索結果リスト
     * @return If there is authority printMultiCml then true, else false/printMultiCmlボタンの利用権限があればtrue。そうでなければfalse
     */
    protected boolean enablePrintMultiCml(List<? extends W2009ListDomain> w2009ListDomainList) {
        if (w2009ListDomainList != null) {
            if (!userAuthService.hasRegisterAll()) {
                // If all the records are not updatable
                // 全レコードが更新可能ではない場合
                for (W2009ListDomain w2009ListDomain : w2009ListDomainList) {
                    if (!AUTH_REGISTER_NUMERIC.equals(w2009ListDomain.getAuthFlg())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
