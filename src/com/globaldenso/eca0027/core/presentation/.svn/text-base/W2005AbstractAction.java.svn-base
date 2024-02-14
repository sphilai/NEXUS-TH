/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_MIX_TAG_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_MIX_TAG_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2005B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2005R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2005;
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
 * The base action class of Multiple Item No. in 1Box PKG Main Screen
 * <br />小箱内多品番梱包Main Screen画面の基底アクションクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class W2005AbstractAction extends AbstractAction {

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
    public W2005AbstractAction() {
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
     * - Acquisition of a screen common information
     *       A screen common items (LANGUAGE CODE) is set to action form.
     *
     * - A pulldown list is acquired.
     *       This is an invoke of CommonService.getPullDownList to an argument about the following classification VALUE.
     *         - Trans.
     *         - Status
     *         - Issuer
     *       The acquired pulldown list is set as a request.
     * 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストを取得
     *     次の区分値を引数にCommonService.getPullDownListの呼び出し
     *         - Trans.
     *         - Status
     *         - Issuer
     *     取得したプルダウンリストをリクエストに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2005ActionForm w2005Form = (W2005ActionForm) form;
        
        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2005Form);
        
        // Get pulldown lists
        // プルダウンリストの設定
        searchPullDownList(request, w2005Form.getLanguageCd());
        
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

        W2005ActionForm w2005Form = (W2005ActionForm) form;
        
        // Screen fields attributes
        // 画面表示制御
        controlDisplay(w2005Form, request);
        
        // Set transition original screen id
        // 呼出し元画面IDの設定
        w2005Form.setCallScreenId(SCREEN_ID_W2005);
    }

    /**
     *    The item of a screen common information is set to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2005ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     *    The pulldown list displayed on a screen is acquired.
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
        List<? extends SelectListItemDomain> mixTagStatusList = commonService.searchPullDownList(CD_TYPE_MIX_TAG_STATUS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> issuerList = commonService.searchPullDownList(CD_TYPE_ISSUER, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
               
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_TRANS_CD, transCdList);
        request.setAttribute(ATTR_MIX_TAG_STATUS, mixTagStatusList);
        request.setAttribute(ATTR_ISSUER, issuerList);
    }
    
    /**
     * Screen fields attributes.
     * <br />画面表示制御を行います。
     * <pre>
     * When one does not have - W2005R authority
     *       Un-active in the CreateNew button
     *
     * When one does not have - W2005R authority or W2005B authority
     *       Un-active in the Search button
     * 
     * 
     * - W2005R権限が1つもない場合
     *     CreateNewボタンを非活性
     * 
     * - W2005R権限またはW2005B権限が1つもない場合
     *     Searchボタンを非活性
     * </pre>
     * 
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(W2005ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        if (!enableSearch()) {
            disableElementList.add("search");
        }
        if (!enableCreateNew()) {
            disableElementList.add("createNew");
        }
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
        
        // Set search-results fields active/inactive.
        // 検索結果エリアの表示制御
        if (SCREEN_ID_W2005.equals(form.getCallScreenId())) {
            form.setDisplayList(true);
        } else {
            form.setDisplayList(false);
        }
    }
    
    /**
     *    The use propriety of the Search button is returned.
     * <br />Searchボタンの利用可否を返します。
     *
     * @return If there is one or more authority of W2005R or W2005B, they will be true, otherwise, false.<br />W2005RまたはW2005Bの権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableSearch() {
        
        if(!userAuthService.getUserAuthList(PERMIT_FUNC_ID_W2005R, PERMIT_FUNC_ID_W2005B).isEmpty()){
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
     * @return If there is one or more W2005R authority, they will be true, otherwise, false.<br />W2005R権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableCreateNew() {
        if(!userAuthService.getUserAuthList(PERMIT_FUNC_ID_W2005R).isEmpty()){
            return true;
        }
        if (userAuthService.hasRegisterAll()) {
            return true;
        }
        return false;
    }
}
