/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

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
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Package Search Sub Screen. <br />
 * 包装材選択子画面の基底アクションクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */

public abstract class Wt004AbstractAction extends AbstractAction {

    /**
     * commonService
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     */
    public Wt004AbstractAction() {
        super();
    }

    /**
     * <p>Getter method for commonService.</p>
     *
     * @return the commonService
     */
    public CommonService getCommonService() {
        return commonService;
    }

    /**
     * <p>Setter method for commonService.</p>
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Pretreatment.
     * - 前処理を行います。
     * 
     * - Get screen common items.
     *     A screen common item (language code) is set as action form. 
     * - Set the pull-down list
     *     The following classification value is made into an argument 
     *     and CommonService.searchPullDownList() is called. 
     *         -RT Flg
     * - The acquired pulldown list is set as a request attribute. 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する。
     * - プルダウンリストの設定
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す。
     *         -RT Flg
     * - 取得したプルダウンリストをリクエスト属性に設定する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #preInvokeExecute(org.apache.struts.action.ActionMapping, 
     *                        org.apache.struts.action.ActionForm, 
     *                        javax.servlet.http.HttpServletRequest,
     *                        javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        Wt004ActionForm thisForm = (Wt004ActionForm)form;

        //Get screen common items.
        setCommonInfo(thisForm);
        
        // Set the pull-down list
        searchPullDownList(request, thisForm.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * - The item of screen common information and languageCd are set to action form.
     * - アクション・フォームに画面共通情報の項目と言語コードを設定します。
     *
     * @param form アクションフォーム
     */
    protected void setCommonInfo(Wt004ActionForm form) {

        // Get the common screen information.
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea
            (form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set language code.
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get the pull-down list.
     * - Call CommonService.searchPullDownList () for the code type, language code, 
     *   code display flag and additional blank line flag argument.
     * - The acquired pulldown list is set as a request attribute.
     * Set request attributes. 
     * 
     * プルダウンリストの取得
     * - コード種別、言語コード、コード表示フラグ、空白行追加フラグを引数にCommonService.searchPullDownList()を呼び出す。
     * - 取得したプルダウンリストをリクエスト属性に設定する。
     * リクエスト属性の設定
     * 
     * @param request HTTPリクエスト
     * @param langCd 言語コード
     * @throws ApplicationException プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {

        // Get the pull-down list.
        List<? extends SelectListItemDomain> pullDownList =  commonService.searchPullDownList(
            Eca0027Constants.CD_TYPE_FLG, langCd, Eca0027Constants.PULLDOWN_DISP_TYPE_CODE, true);

        // Set request attributes.
        request.setAttribute(Eca0027Constants.ATTR_FLG, pullDownList);

    }

}
