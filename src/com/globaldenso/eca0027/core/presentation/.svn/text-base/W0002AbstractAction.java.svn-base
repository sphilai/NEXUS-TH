/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CHAR_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_LANG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TIMEZONE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CHAR_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_LANG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W0002;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of the menu screen.
 * <br />メニュー画面の基底アクションクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class W0002AbstractAction extends AbstractAction {

    /**
     * common service <br />
     * 共通サービス
     */
    protected CommonService commonService;

    /**
     * constructor. <br />
     * デフォルトコンストラクタ。
     */
    public W0002AbstractAction() {
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
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isTokenCheck()
     */
    @Override
    protected boolean isTokenCheck() {
        return false;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Get common information of screen
     *     Set the screen common items (language code) in Action Form
     * 
     * - Set of the pull-down list
     *     Get the pull-down list below, and set them in the request attribute
     *         - language
     *         - character code
     *         - time zone
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストの設定
     *     以下のプルダウンリストを取得し、リクエスト属性に設定する
     *       - 言語
     *       - 文字コード
     *       - タイムゾーン
     * 
     * </pre>
     *  
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W0002ActionForm w0002Form = (W0002ActionForm) form;
        
        // Setting of a screen common information
        // 画面共通情報の設定
        setCommonInfo(w0002Form);
        
        // Get pulldown lists
        // プルダウンリストの設定
        searchPullDownList(request, w0002Form.getLanguageCd());

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        ((W0002ActionForm) form).setCallScreenId(SCREEN_ID_W0002);
    }

    /**
     * Set the items on the screen common information to the action form and the search criteria.
     * <br />アクション・フォームおよび検索条件ドメインに画面共通情報の項目を設定します。
     *
     * @param form - action form
     */
    protected void setCommonInfo(W0002ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
    
        // Setting of action form
        // アクション・フォームの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get pull-down list to display on screen
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request - HTTP request
     * @param langCd - LANGUAGE CODE
     * @throws ApplicationException - if the pull-down list can not be acquired
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        // Acquisition of each pulldown list
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> langList
            = commonService.searchPullDownList(CD_TYPE_LANG, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        List<? extends SelectListItemDomain> charCdList
            = commonService.searchPullDownList(CD_TYPE_CHAR_CD, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        List<? extends SelectListItemDomain> timezoneList
            = commonService.searchTimezonePullDownList(false);
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_LANG, langList);
        request.setAttribute(ATTR_CHAR_CD, charCdList);
        request.setAttribute(ATTR_TIMEZONE, timezoneList);
    }
}
