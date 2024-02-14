/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PLNT_AND_WH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PLNT_AND_WH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_NEXUS;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2006CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Multiple Item No. in 1Box PKG Header
 * <br />小箱内多品番梱包Header画面の基底アクションクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class W2006AbstractAction extends AbstractAction {

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
    public W2006AbstractAction() {
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
     * - Acquisition of a screen common information
     *       A screen common items (LANGUAGE CODE) is set to action form.
     *
     * - A pulldown list is acquired.
     *       This is an invoke of CommonService.getPullDownList to an argument about the following classification VALUE.
     *         - Palletize Instr. Required
     *         - Trans.
     *         - Plant & W/H Declaration
     *
     *       The acquired pulldown list is set as a request.
     * 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストを取得
     *     次の区分値を引数にCommonService.getPullDownListの呼び出し
     *         - Palletize Instr. Required
     *         - Trans.
     *         - Plant & W/H Declaration
     *         
     *     取得したプルダウンリストをリクエストに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2006ActionForm w2006Form = (W2006ActionForm) form;
        
        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2006Form);
        
        // Get pulldown lists
        // プルダウンリストの設定
        searchPullDownList(request, w2006Form.getLanguageCd());
        
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

        ((W2006ActionForm) form).setCallScreenId(SCREEN_ID_W2006);
    }

    /**
     *    The item of a screen common information is set to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2006ActionForm form) {
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
        List<? extends SelectListItemDomain> flagList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> transCdList = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> plntAndWhList = commonService.searchPullDownList(CD_TYPE_PLNT_AND_WH, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_FLAG, flagList);
        request.setAttribute(ATTR_TRANS_CD, transCdList);
        request.setAttribute(ATTR_PLNT_AND_WH, plntAndWhList);
    }

    /**
     * Perform display control of a screen.
     * <br />画面の表示制御を行います。
     * 
     * <pre>
     * Make header area non-display.
     * 
     * 
     * ヘッダーエリアを非表示にする
     * 
     * </pre>
     * 
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクション・フォーム
     */
    protected void controlDisplay(HttpServletRequest request,
        W2006ActionForm form) {

        List<String> disableList = new ArrayList<String>();

        W2006CriteriaDomain criteria = form.getW2006CriteriaDomain();

        if (criteria == null
            || CheckUtil.isBlankOrNull(criteria.getPltzInstrRequired())) {
            // Deactivation of an item
            // 項目の非活性化
            disableList.add("w2006CriteriaDomain.pltzInstrNo");
            disableList.add("w2006CriteriaDomain.shipperCd");
            disableList.add("w2006CriteriaDomain.customerCd");
            disableList.add("w2006CriteriaDomain.lgcyShipTo");
            disableList.add("w2006CriteriaDomain.trnsCd");
            disableList.add("w2006CriteriaDomain.plntAndWhDeclaration");
            disableList.add("w2006CriteriaDomain.plntCd");
            disableList.add("w2006CriteriaDomain.lgcyWhCd");
            disableList.add("w2006CriteriaDomain.whCompCd");
            disableList.add("w2006CriteriaDomain.whCd");
            if (criteria != null) {
                // VALUE clearance of an un-active item
                // 非活性項目の値クリア
                criteria.setPltzInstrRequired("");
                criteria.setPltzInstrNo("");
                criteria.setShipperCd("");
                criteria.setCustomerCd("");
                criteria.setLgcyShipTo("");
                criteria.setTrnsCd("");
                criteria.setPlntAndWhDeclaration("");
                criteria.setPlntCd("");
                criteria.setLgcyWhCd("");
                criteria.setWhCompCd("");
                criteria.setWhCd("");
            }
        } else {

            if (FLAG_Y.equals(criteria.getPltzInstrRequired())) {
                // Deactivation of an item
                // 項目の非活性化
                disableList.add("w2006CriteriaDomain.shipperCd");
                disableList.add("w2006CriteriaDomain.customerCd");
                disableList.add("w2006CriteriaDomain.lgcyShipTo");
                disableList.add("w2006CriteriaDomain.trnsCd");
                disableList.add("w2006CriteriaDomain.plntAndWhDeclaration");
                disableList.add("w2006CriteriaDomain.plntCd");
                disableList.add("w2006CriteriaDomain.lgcyWhCd");
                disableList.add("w2006CriteriaDomain.whCompCd");
                disableList.add("w2006CriteriaDomain.whCd");
                // VALUE clearance of an un-active item
                // 非活性項目の値クリア
                criteria.setShipperCd("");
                criteria.setCustomerCd("");
                criteria.setLgcyShipTo("");
                criteria.setTrnsCd("");
                criteria.setPlntAndWhDeclaration("");
                criteria.setPlntCd("");
                criteria.setLgcyWhCd("");
                criteria.setWhCompCd("");
                criteria.setWhCd("");
            } else {
                disableList.add("w2006CriteriaDomain.pltzInstrNo");
                criteria.setPltzInstrNo("");
                if (TYP_PLANT_AND_WH_CIGMA.equals(criteria
                    .getPlntAndWhDeclaration())) {
                    // In the case of CIGMA
                    // CIGMAの場合
                    // Deactivation of an item
                    // 項目の非活性化
                    disableList.add("w2006CriteriaDomain.whCompCd");
                    disableList.add("w2006CriteriaDomain.whCd");
                    // VALUE clearance of an un-active item
                    // 非活性項目の値クリア
                    criteria.setWhCompCd("");
                    criteria.setWhCd("");
                } else if (TYP_PLANT_AND_WH_NEXUS.equals(criteria
                    .getPlntAndWhDeclaration())) {
                    // In the case of NEXUS
                    // NEXUSの場合
                    // Deactivation of an item
                    // 項目の非活性化
                    disableList.add("w2006CriteriaDomain.plntCd");
                    disableList.add("w2006CriteriaDomain.lgcyWhCd");
                    // VALUE clearance of an un-active item
                    // 非活性項目の値クリア
                    criteria.setPlntCd("");
                    criteria.setLgcyWhCd("");
                } else {
                    // Deactivation of an item
                    // 項目の非活性化
                    disableList.add("w2006CriteriaDomain.plntCd");
                    disableList.add("w2006CriteriaDomain.lgcyWhCd");
                    disableList.add("w2006CriteriaDomain.whCompCd");
                    disableList.add("w2006CriteriaDomain.whCd");
                    // VALUE clearance of an un-active item
                    // 非活性項目の値クリア
                    criteria.setPlntCd("");
                    criteria.setLgcyWhCd("");
                    criteria.setWhCompCd("");
                    criteria.setWhCd("");
                }
            }
        }

        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);

    }
}
