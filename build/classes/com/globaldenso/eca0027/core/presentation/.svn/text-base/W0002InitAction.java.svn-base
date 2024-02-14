/*
 * PROJECT：GSCMSample
 * 
 * メニュー画面の初期表示アクション
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_I1_0016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W0002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W0002ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W0002InitFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmBusinessException;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * Initial display action of the menu screen <br />
 * メニュー画面初期表示アクション
 * 
 * @author $Author: 10088DS01586 $
 */
public class W0002InitAction extends W0002AbstractAction {

    /**
     * User function authorization service <br />
     * ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Initial display facade Service <br />
     * 初期表示Facadeサービス
     */
    protected SearchFacadeService<W0002ListDomain, W0002CriteriaDomain> w0002InitFacadeService;
    
    /**
     * constructor. <br />
     * デフォルトコンストラクタ。
     */
    public W0002InitAction() {
        super();
    }

    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService - Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for w0002InitFacadeService.
     *
     * @param initFacadeService - Set for w0002InitFacadeService
     */
    public void setW0002InitFacadeService(
        SearchFacadeService<W0002ListDomain, W0002CriteriaDomain> initFacadeService) {
        w0002InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Check user information
     *     If no user information is found, transmit to business common error.
     *     
     * - Check function of use authority
     *     If any permission is not granted to log-in user, screen transitions to business common error.
     * 
     * - ユーザ情報のチェック
     *     ログイン時にユーザ情報が取得できない場合は、業務共通エラー画面に遷移する
     *     
     * - 機能利用権限のチェック
     *     ログインユーザに権限が一つも付与されていない場合は、業務共通エラー画面に遷移する
     * 
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W0002AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        if (!hasUserInfo()) {
            throw new GscmBusinessException(NXS_I1_0016);
        }

        if (!userAuthService.hasUserAuth()) {
            throw new GscmBusinessException(NXS_I1_0016);
        }

        return super.preInvokeExecute(mapping, form, request, response);
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Set of search criteria domain
     *     Set in a the following information:
     *         - LANGUAGE CODE
     *         - COMPANY CODE
     * 
     * - Execute the search process
     *     Call {@link W0002InitFacadeServiceImpl W0002InitFacadeServiceImpl#search(W0002CriteriaDomain)} with the argument {@link W0002CriteriaDomain}
     * 
     * - Set search results
     *     Set the results of the above-mentioned to the action form 
     * 
     * - Set the domain list (personal settings)
     *     Set the value for the screen common information to list domain (personal settings)
     * 
     * 
     * 
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W0002CriteriaDomain}に設定する
     *       - 言語コード
     *       - 会社コード
     *       
     * - 検索処理の実行
     *     {@link W0002CriteriaDomain}を引数に{@link W0002InitFacadeServiceImpl W0002InitFacadeServiceImpl#search(W0002CriteriaDomain)}を呼び出す
     *     
     * - 検索結果の設定
     *     上記の結果をアクションフォームに設定する
     *     
     * - リストドメインの設定 (個人設定)
     *      リストドメインに画面共通情報の対応する値を設定する (個人設定用)
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W0002ActionForm w0002Form = (W0002ActionForm) form;
        
        W0002CriteriaDomain criteriaDomain = prepareCriteriaDomain(w0002Form);
        
        W0002ListDomain listDomain = w0002InitFacadeService.search(criteriaDomain);
        
        w0002Form.setListDomain(listDomain);

        prepareListDomain(listDomain);
        
        return FORWARD_SUCCESS;
    }
    
    
    /**
     * Return true if user information is found in the login process, otherwise false
     * <br />ユーザ情報の有無を取得します。
     *
     * @return ユーザ情報があればtrue、そうでなければfalse
     */
    protected boolean hasUserInfo() {
        // Acquisition of a screen common information
        // 画面共通情報の取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        Eca0027CommonInfoDomain commonInfo = (Eca0027CommonInfoDomain) windowInfo.getCommonInfo();

        return !StringUtils.isEmpty(commonInfo.getUsrNmEn());
    }
    
    /**
     * Set the search criteria domain (for initial display)
     * <br />検索条件ドメインを設定します。(初期表示用)
     *
     * @param form - action form
     * @return search criteria domain
     */
    protected W0002CriteriaDomain prepareCriteriaDomain(W0002ActionForm form) {
        
        W0002CriteriaDomain criteriaDomain = form.getCriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Acquisition of a screen common information
        // 画面共通情報の取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // A setting of LANGUAGE CODE, and a COMPANY CODE
        // 言語コード、会社コードの設定
        criteriaDomain.setLngCd(commonInfo.getLanguageCd());
        criteriaDomain.setCompCd(commonInfo.getOwnerCompCd());
        
        // A setting of system date (a worker's time zone)
        // システム日付 (作業者のタイムゾーン)の設定
        criteriaDomain.setSysdate(DateUtil.convertTime(new Date(), criteriaDomain.getTimeZone()));
        
        return criteriaDomain;
    }

    /**
     * Set the list domain (personal settings)
     * <br />リストドメインを設定します。(個人設定用)
     *
     * @param listDomain - list domain
     */
    protected void prepareListDomain(W0002ListDomain listDomain) {

        // Acquisition of a screen common information
        // 画面共通情報の取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // A setting of LANGUAGE CODE, a character code, and a TIMEZONE ID
        // 言語コード、文字コード、タイムゾーンIDの設定
        listDomain.setUserLngCd(commonInfo.getLanguageCd());
        listDomain.setCharCd(commonInfo.getCharCd());
        listDomain.setTimezoneId(commonInfo.getTimeZone());
    }
}
