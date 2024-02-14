/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_INPUT_METH_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PKG_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INPUT_METH_TYP_MANUAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_DUMMY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2013;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 *    This is a base action class of a CML PKG Info Detail screen.
 * <br />CML PKG Info Detail画面の基底アクションクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public abstract class W2013AbstractAction extends AbstractAction {

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * UT110 TRIAL SHIPMENT/号試品対応 MOV
     * Code-Master service
     * <br />コード原単位サービス
     */
    protected TmCdService tmCdService;

    /**
     * constructor
     * <br /> デフォルトコンストラクタ
     */
    public W2013AbstractAction() {
        super();
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
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * UT110 TRIAL SHIPMENT/号試品対応 MOV
     * Setter method for tmCdService.
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * No Action
     *
     * 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2013ActionForm w2013Form = (W2013ActionForm)form;

        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2013Form);
        
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
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        ((W2013ActionForm) form).setCallScreenId(SCREEN_ID_W2013);
    }

    /**
     * Set the item of a screen common information to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     * 
     * @param form Action form<br />アクション・フォーム
     * @throws ApplicationException When an error occurs in DB processing<br />DB処理でエラーが発生した場合
     */
    protected void setCommonInfo(W2013ActionForm form) throws ApplicationException {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
        
        // The display control of list area is initialized.
        // 一覧エリアの表示制御を初期化
        form.setDisplayList(true);
    }
    
    /**
     *    Display control of a screen item is performed.
     * <br />画面項目の表示制御を行います。
     * <pre>
     * From - Register screen to the time of changes
     *       The following items are made into non-activity.
     *         - Save & Move to Trans./PKG Revise button
     *         - Add New Line (10) button (in the case of reference mode)
     *         - Delete button (in the case of reference mode)
     *         - In the case of a new addition line (InputMethod = "Dummy")
     *             - Check box
     *         In the case of - reference mode
     *             - Detailed line whole
     *         In the case of - register mode
     *             When - Mix Tag No is not empty
     *                - Check box
     *                - QUANTITY
     *             - When a BRANCH is empty
     *                - Check box
     *             - When a BRANCH is not empty
     *                - selection button
     *
     * From a - Trans./PKG Revise screen to the time of changes
     *       The following items are made into non-activity.
     *         - Save & Move to Register button
     *         When - Mix Tag No is not empty
     *            - Check box
     *            - QUANTITY
     *         - When a BRANCH is empty
     *            - Check box
     *         - When a BRANCH is not empty
     *            - selection button
     *
     * - Register画面から遷移時
     *     以下の項目を非活性にする
     *       - Save & Move to Trans./PKG Revise ボタン
     *       - Add New Line(10) ボタン (参照モードの場合)
     *       - Delete ボタン (参照モードの場合)
     *       - 新規追加行の場合 (InputMethod = "Dummy")
     *           - チェックボックス
     *       - 参照モードの場合
     *           - 明細行全体
     *       - 登録モードの場合
     *           - Mix Tag Noが空でない場合
     *              - チェックボックス
     *              - 数量
     *           - 枝番が空の場合
     *              - チェックボックス
     *           - 枝番が空でない場合
     *              - 選択ボタン
     *           
     * - Trans./PKG Revise画面から遷移時
     *     以下の項目を非活性にする
     *       - Save & Move to Register ボタン
     *       - Mix Tag Noが空でない場合
     *          - チェックボックス
     *          - 数量
     *       - 枝番が空の場合
     *          - チェックボックス
     *       - 枝番が空でない場合
     *          - 選択ボタン
     * </pre>
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクションフォーム
     */
    protected void controlDisplay(HttpServletRequest request,
        W2013ActionForm form) {

        // List of un-active items
        // 非活性項目のリスト
        List<String> disableList = new ArrayList<String>();

        String originalScreenId = form.getW2013CriteriaDomain().getOriginalScreenId();
        String functionMode = form.getW2013CriteriaDomain().getFunctionMode();

        // UT304 MULTI LABEL MOD START
        //if ((SCREEN_ID_W2012.equals(originalScreenId)) {
        if (SCREEN_ID_W2012.equals(originalScreenId) || "W2020".equals(originalScreenId)) {
        // UT304 MULTI LABEL MOD END
            // In the case of the changes from W2012  :   Un-active in a [Save & Move to Trans./PKG] button
            // W2012からの遷移の場合 : 【Save & Move to Trans./PKG】ボタンを非活性
            disableList.add("saveAndMoveToTransPkgRevise");

            if (W2009_CML_MODE_REF.equals(functionMode)) {
                disableList.add("addNewLine10");
                disableList.add("delete");
            }

        } else if (SCREEN_ID_W2019.equals(originalScreenId)) {
            // In the case of the changes from W2019  :   Un-active in a [Save & Move to Register] button
            // W2019からの遷移の場合 : 【Save & Move to Register】ボタンを非活性
            disableList.add("saveAndMoveToRegister");
        }

        // Un-active [ about a list item ]
        // 一覧項目についての非活性
        List<? extends W2013ListDomain> listDomainList = form.getListDomainList();

        if (listDomainList == null || listDomainList.size() == 0) {
            form.setDisplayList(false);
        } else {
            
            // Uniformly un-active in CK check box in the case of the changes and reference mode from W2012
            // W2012からの遷移かつ参照モードの場合、一律CKチェックボックスを非活性
            if (SCREEN_ID_W2012.equals(originalScreenId) && W2009_CML_MODE_REF.equals(functionMode)) {
                for (int i = 0; i < listDomainList.size(); i++ ) {
                    // In the case of W2012 to changes and reference mode
                    // W2012から遷移かつ参照モードの場合
                    disableList.add(String.format("listDomainList[%d].selected", i));
                    disableList.add(String.format("listDomainList[%d].pkgItemNo", i));
                    disableList.add(String.format("select[%d]", i));
                    disableList.add(String.format("listDomainList[%d].qty", i));
                }
            } else {
                // When this is the changes from W2012 and changes from the case of register mode, or W2019
                // W2012からの遷移でかつ登録モードの場合、またはW2019から遷移した場合
                // UT304 MULTI LABEL MOD START
                //if ((SCREEN_ID_W2012.equals(originalScreenId) && W2009_CML_MODE_EDIT.equals(functionMode))
                //        || SCREEN_ID_W2019.equals(originalScreenId)) {
                if (((SCREEN_ID_W2012.equals(originalScreenId) || "W2020".equals(originalScreenId)) && W2009_CML_MODE_EDIT.equals(functionMode))
                    || SCREEN_ID_W2019.equals(originalScreenId)) {
                // UT304 MULTI LABEL MOD END

                    if (listDomainList != null) {
                        int i = 0;
                        for (W2013ListDomain w2013ListDomain : listDomainList) {
                            if (PKG_TYP_DUMMY.equals(w2013ListDomain.getPkgTypHidden())) {
                                // UT398 MOD START
                                //if (CheckUtil.isBlankOrNull(w2013ListDomain.getQty()) || CheckUtil.isBlankOrNull(w2013ListDomain.getPkgItemNo())) {
                                //    disableList.add(String.format("listDomainList[%d].selected", i));
                                //}
                                //if (!CheckUtil.isBlankOrNull(w2013ListDomain.getBrch())) {
                                //    disableList.add(String.format("select[%d]", i));
                                //}
                                if (CheckUtil.isBlankOrNull(w2013ListDomain.getBrch())) {
                                    disableList.add(String.format("listDomainList[%d].selected", i));
                                } else {
                                    disableList.add(String.format("select[%d]", i));
                                }
                                // UT398 MOD END
                            } else {
                                if (!CheckUtil.isBlankOrNull(w2013ListDomain.getMixTagNo())) {
                                    disableList.add(String.format("listDomainList[%d].selected", i));
                                    disableList.add(String.format("listDomainList[%d].qty", i));
                                }
                                if (CheckUtil.isBlankOrNull(w2013ListDomain.getBrch())) {
                                    disableList.add(String.format("listDomainList[%d].selected", i));
                                } else {
                                    disableList.add(String.format("select[%d]", i));
                                }
                            }
                            i++ ;
                        }
                    }
                }
            }
        }

        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
    }

    /**
     *    The locale of a screen common information is acquired.
     * <br />画面共通情報のロケールを取得します。
     *
     * @param form Action form<br />アクションフォーム
     * @return The locale of a screen common information<br />画面共通情報のロケール
     */
    protected Locale getLocale(W2013ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        return commonInfo.getLocale();
    }

    /**
     *    The specified message is added as {@link ActionMessages#GLOBAL_MESSAGE}.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param messageId MESSAGE ID<br />メッセージID
     * @param args Message argument<br />メッセージ引数
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        // Addition of a message
        // メッセージの追加
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        // Registration of GLOBAL_MESSAGE
        // GLOBAL_MESSAGEの登録
        addMessages(request, messages);
    }

    // UT110 TRIAL SHIPMENT/号試品対応 MOV START
    /**
     *    The name of the input method (Manual) is acquired.
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @return The name of the input method<br />入力方法の名称
     * @throws ApplicationException When the input method is unacquirable<br />入力方法が取得できない場合
     */
    protected String getInputMethodVal(String languageCd) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(languageCd);
        criteria.setCdTyp(CD_TYPE_INPUT_METH_TYP);
        criteria.setCd(INPUT_METH_TYP_MANUAL);

        // Acquisition of a name
        // 名称の取得
        return tmCdService.searchByKey(criteria).getValue();
    }
    
    /**
     *    The name of a PACKAGE TYPE (Dummy) is acquired.
     * <br />包装材種別(Dummy)の名称を取得します。
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @return The name of a PACKAGE TYPE<br />包装材種別の名称
     * @throws ApplicationException When a PACKAGE TYPE is unacquirable<br />包装材種別が取得できない場合
     */
    protected String getPkgTypVal(String languageCd) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(languageCd);
        criteria.setCdTyp(CD_TYPE_PKG_TYP);
        criteria.setCd(PKG_TYP_DUMMY);
        
        // Acquisition of a name
        // 名称の取得
        return tmCdService.searchByKey(criteria).getValue();
    }
    // UT110 TRIAL SHIPMENT/号試品対応 MOV END
}
