/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CONTAINER_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FREIGHT_RESPONSIBLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_SHIPPING_ACT_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREIGHT_RESPONSIBLE_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CONTAINER_LOOSE_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_SHIPPING_ACT_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7001;
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
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The class of base action for Shipping Actuality Main screen.
 * <br />船積実績Main画面の基底アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public abstract class W7001AbstractAction extends AbstractAction {

    /** 
     * common service.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001AbstractAction() {
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
     * <pre>
     * - Acquisition of common screen information.
     *  Set the screen common item (LANGUAGE CODE) in Action Form.
     * - Get the pull-down list.
     *  Call CommonService.searchPullDownList () for the argument classification VALUE following.
     *    - Transport  
     *    - CONTAINER LOOSE TYPE 
     *    - FREIGHT RESPONSIBLE CODE 
     *    - SHIPPING ACTUALITY STATUS 
     *    - Flag
     * And then set them in the request attribute pull-down list obtained.
     * </pre>
     * <pre>
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
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {
        
        W7001ActionForm w7001Form = (W7001ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w7001Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        searchPullDownList(request, w7001Form.getLanguageCd());
        
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

        ((W7001ActionForm) form).setCallScreenId(SCREEN_ID_W7001);
    }
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />アクション・フォーム
     */
    protected void setCommonInfo(W7001ActionForm form) {

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

        List<? extends SelectListItemDomain> transCdList = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> clList = commonService.searchPullDownList(CD_TYPE_CONTAINER_LOOSE, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> frList = commonService.searchPullDownList(CD_TYPE_FREIGHT_RESPONSIBLE, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> statusList = commonService.searchPullDownList(CD_TYPE_SHIPPING_ACT_STATUS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> flagList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        
        request.setAttribute(ATTR_TRANS_CD, transCdList);
        request.setAttribute(ATTR_CONTAINER_LOOSE_TYP, clList);
        request.setAttribute(ATTR_FREIGHT_RESPONSIBLE_CD, frList);
        request.setAttribute(ATTR_SHIPPING_ACT_STATUS, statusList);
        request.setAttribute(ATTR_FLAG, flagList);
    }
    
    /**
     * Add {@link ActionMessages#GLOBAL_MESSAGE}
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request
     * @param messageId MESSAGE ID
     * @param args Message argument
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
}
