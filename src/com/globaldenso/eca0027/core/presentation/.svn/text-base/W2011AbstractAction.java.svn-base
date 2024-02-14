/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CC_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PKG_FORM_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CC_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PKG_FORM_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2011;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2011ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * This is a base action class of a CML Create screen.
 * <br />CML Create画面の基底アクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public abstract class W2011AbstractAction extends AbstractAction {

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
    public W2011AbstractAction() {
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
     *         - LD CD
     *         - PKG Form TYPE
     *         - Stg. Instr. Flg
     *         - C/C TYPE
     * - The acquired pulldown list is set as a request.
     *
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストを取得
     *     次の区分値を引数にCommonService.getPullDownListの呼び出し
     *         - LD CD
     *         - PKG Form TYPE
     *         - Stg. Instr. Flg
     *         - C/C TYPE
     * - 取得したプルダウンリストをリクエストに設定
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

        W2011ActionForm w2011Form = (W2011ActionForm)form;

        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2011Form);

        // Get pulldown lists
        // プルダウンリストの設定
        searchPullDownList(request, w2011Form.getLanguageCd());

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

        ((W2011ActionForm)form).setCallScreenId(SCREEN_ID_W2011);
    }

    /**
     * Set the item of a screen common information to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     * 
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2011ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());
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
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        // Acquisition of each pulldown list
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> loadingCdList = commonService.searchPullDownList(CD_TYPE_LOADING_CD, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> pkgFormTypList = commonService.searchPullDownList(CD_TYPE_PKG_FORM_TYP, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> flagList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> ccTypeList = commonService.searchPullDownList(CD_TYPE_CC_TYPE, langCd, PULLDOWN_DISP_TYPE_CODE, true);
               
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_LOADING_CD, loadingCdList);
        request.setAttribute(ATTR_PKG_FORM_TYP, pkgFormTypList);
        request.setAttribute(ATTR_FLAG, flagList);
        request.setAttribute(ATTR_CC_TYPE, ccTypeList);
    }

    /**
     *    The locale of a screen common information is acquired.
     * <br />画面共通情報のロケールを取得します。
     *
     * @param form Action form<br />アクションフォーム
     * @return The locale of a screen common information<br />画面共通情報のロケール
     */
    protected Locale getLocale(W2011ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        return commonInfo.getLocale();
    }

    /**
     *    Display control of a screen is performed.
     * <br />画面の表示制御を行います。
     * 
     * <pre>
     * At the time of the changes from - Header screen and a Register screen
     *       Set search-results fields inactive.
     *
     * - Except the above
     *       Set search-results fields active.
     *       In disableFlg =='Y', CK is made into non-activity.
     *       disableFlg == 'Y' &amp;&amp;   mixTagFlg == 'N' &amp;&amp;   pkgFormTyp == &quot;S&quot;   a case -- tagQty -- non-activity -- carrying out
     *       In in disableFlg =='N' (with no = check), qty and tagQty are made into non-activity.
     *
     * - Header画面およびRegister画面からの遷移時
     *     検索結果エリアを非表示にする
     * 
     * - 上記以外
     *     検索結果エリアを表示する
     *     disableFlg == 'Y'の場合、CKを非活性にする
     *     disableFlg == 'Y' &amp;&amp; mixTagFlg == 'N' &amp;&amp; pkgFormTyp == &quot;S&quot; の場合、tagQty を非活性にする
     *     disableFlg == 'N'の場合(=チェックなし)の場合、qty、tagQty を非活性にする。
     * </pre>
     * 
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクション・フォーム
     */
    protected void controlDisplay(HttpServletRequest request,
        W2011ActionForm form) {

        List<String> disableList = new ArrayList<String>();

        // Transition original screen
        // 呼出し元画面
        String callScreenId = form.getCallScreenId();

        // At the time of the changes from a Header screen or a Register screen
        // Header画面またはRegister画面からの遷移時
        if (SCREEN_ID_W2010.equals(callScreenId)
            || SCREEN_ID_W2012.equals(callScreenId)) {
            form.setDisplayList(false);
            // Other than this
            // それ以外
        } else {
            // Set and Check CK attributes.
            // CK の活性制御 & check 制御
            List<? extends W2011ListDomain> listDomainList = form
                .getListDomainList();

            if (listDomainList == null) {
                form.setDisplayList(false);
                return;
            } else {
                form.setDisplayList(true);
            }

            if (!CollectionUtils.isEmpty(listDomainList)) {
                for (int i = 0; i < listDomainList.size(); i++ ) {

                    // Setting of a check box
                    // チェックボックスの設定
                    if (FLAG_Y.equals(listDomainList.get(i).getDisableFlg())) {
                        listDomainList.get(i).setSelected(CHECK_ON);
                    } else {
                        listDomainList.get(i).setSelected(CHECK_OFF);
                    }

// To speed up of the drawing process, don't use disableList to do display control of list items.
// 描画速度を上げるために、一覧の項目制御には disableList を使用しないようにしています。
//
//                    // Input control of qty and tagQty
//                    // qty、tagQty の入力制御
//                    if (FLAG_Y.equals(listDomainList.get(i).getDisableFlg())) {
//                        disableList.add(String.format("listDomainList[%d].selected", i));
//                        if (FLAG_Y.equals(listDomainList.get(i).getMixTagFlg())) {
//                            disableList.add(String.format("listDomainList[%d].qty", i));
//                            disableList.add(String.format("listDomainList[%d].tagQty", i));
//                        } else {
//                            if (PKG_FORM_TYP_SINGLE.equals(listDomainList.get(i).getPkgFormTyp())) {
//                                disableList.add(String.format("listDomainList[%d].tagQty", i));
//                            } else if (!PKG_FORM_TYP_MULTI.equals(listDomainList.get(i).getPkgFormTyp())) {
//                                // The case where pkgFormTyp is null is possible.
//                                // pkgFormTyp が null の場合が有得る
//                                disableList.add(String.format("listDomainList[%d].qty", i));
//                                disableList.add(String.format("listDomainList[%d].tagQty", i));
//                            }
//                        }
//                    } else {
//                        disableList.add(String.format("listDomainList[%d].qty", i));
//                        disableList.add(String.format("listDomainList[%d].tagQty", i));
//                    }

                    // Input control of qty and tagQty
                    // qty、tagQty の入力制御
                    listDomainList.get(i).setSelectedDisabled("false");
                    listDomainList.get(i).setQtyDisabled("false");
                    listDomainList.get(i).setTagQtyDisabled("false");

                    if (FLAG_Y.equals(listDomainList.get(i).getDisableFlg())) {
                        listDomainList.get(i).setSelectedDisabled("true");
                        if (FLAG_Y.equals(listDomainList.get(i).getMixTagFlg())) {
                            listDomainList.get(i).setQtyDisabled("true");
                            listDomainList.get(i).setTagQtyDisabled("true");
                        } else {
                            if (!FLAG_Y.equals(form.getW2011CriteriaDomain().getManualRegFlg())) {
                                if (PKG_FORM_TYP_SINGLE.equals(listDomainList.get(i).getPkgFormTyp())) {
                                    listDomainList.get(i).setTagQtyDisabled("true");
                                } else if (!PKG_FORM_TYP_MULTI.equals(listDomainList.get(i).getPkgFormTyp())) {
                                    // The case where pkgFormTyp is null is possible.
                                    // pkgFormTyp が null の場合が有得る
                                    listDomainList.get(i).setQtyDisabled("true");
                                    listDomainList.get(i).setTagQtyDisabled("true");
                                }
                            // UT110 TRIAL SHIPMENT/号試品対応 ADD
                            } else {
                                listDomainList.get(i).setTagQtyDisabled("true");
                            }
                        }
                    } else {
                        listDomainList.get(i).setQtyDisabled("true");
                        listDomainList.get(i).setTagQtyDisabled("true");
                    }
                }
            }
        }
        // Setting of an un-active item
        // 非活性項目の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
    }
    

    /**
     *    Display control of the screen at the time of an error generation is performed.
     * <br />エラー発生時の画面の表示制御を行います。
     * 
     * <pre>
     * - When search results are not able to be acquired
     *       Set search-results fields inactive.
     *
     * - Except the above
     *       Set search-results fields active.
     *       In disableFlg =='Y', CK is made into non-activity.
     *       disableFlg == 'Y' &amp;&amp;   mixTagFlg == 'N' &amp;&amp;   pkgFormTyp == &quot;S&quot;   a case -- tagQty -- non-activity -- carrying out
     *       In in disableFlg =='N' (with no = check), qty and tagQty are made into non-activity.
     *
     * - 検索結果が取得できなかった場合
     *     検索結果エリアを非表示にする
     * 
     * - 上記以外
     *     検索結果エリアを表示する
     *     disableFlg == 'Y'の場合、CKを非活性にする
     *     disableFlg == 'Y' &amp;&amp; mixTagFlg == 'N' &amp;&amp; pkgFormTyp == &quot;S&quot; の場合、tagQty を非活性にする
     *     disableFlg == 'N'の場合(=チェックなし)の場合、qty、tagQty を非活性にする。
     * </pre>
     * 
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクション・フォーム
     */
    protected void controlDisplayErr(HttpServletRequest request,
        W2011ActionForm form) {

        // Set and Check CK attributes.
        // CK の活性制御 & check 制御
        List<? extends W2011ListDomain> listDomainList = form
            .getListDomainList();

        // Set search-results fields active/inactive.
        // 検索結果エリアの表示制御
        if (listDomainList == null) {
            form.setDisplayList(false);
            return;
        } else {
            form.setDisplayList(true);
        }

        List<String> disableList = new ArrayList<String>();

        // Set and Check CK attributes.
        // CK の活性制御 & check 制御
        if (!CollectionUtils.isEmpty(listDomainList)) {
            for (int i = 0; i < listDomainList.size(); i++ ) {

// To speed up of the drawing process, don't use disableList to do display control of list items.
// 描画速度を上げるために、一覧の項目制御には disableList を使用しないようにしています。
//
//                // Input control of checkBox
//                // checkBox の入力制御
//                if (FLAG_Y.equals(listDomainList.get(i).getDisableFlg())) {
//                    disableList.add(String.format("listDomainList[%d].selected", i));
//                }
//
//                // Input control of qty and tagQty
//                // qty、tagQty の入力制御
//                if (CHECK_ON.equals(listDomainList.get(i).getSelected())) {
//                    if (FLAG_Y.equals(listDomainList.get(i).getMixTagFlg())) {
//                        disableList.add(String.format("listDomainList[%d].qty", i));
//                        disableList.add(String.format("listDomainList[%d].tagQty", i));
//                    } else {
//                        if (PKG_FORM_TYP_SINGLE.equals(listDomainList.get(i).getPkgFormTyp())) {
//                            disableList.add(String.format("listDomainList[%d].tagQty", i));
//                        } else if (!PKG_FORM_TYP_MULTI.equals(listDomainList.get(i).getPkgFormTyp())) {
//                            // The case where pkgFormTyp is null is possible.
//                            // pkgFormTyp が null の場合が有得る
//                            disableList.add(String.format("listDomainList[%d].qty", i));
//                            disableList.add(String.format("listDomainList[%d].tagQty", i));
//                        }
//                    }
//                } else {
//                    disableList.add(String.format("listDomainList[%d].qty", i));
//                    disableList.add(String.format("listDomainList[%d].tagQty", i));
//                }

                // Input control of checkBox
                // checkBox の入力制御
                listDomainList.get(i).setSelectedDisabled("false");
                listDomainList.get(i).setQtyDisabled("false");
                listDomainList.get(i).setTagQtyDisabled("false");

                if (FLAG_Y.equals(listDomainList.get(i).getDisableFlg())) {
                    listDomainList.get(i).setSelectedDisabled("true");
                }

                // Input control of qty and tagQty
                // qty、tagQty の入力制御
                if (CHECK_ON.equals(listDomainList.get(i).getSelected())) {
                    if (FLAG_Y.equals(listDomainList.get(i).getMixTagFlg())) {
                        listDomainList.get(i).setQtyDisabled("true");
                        listDomainList.get(i).setTagQtyDisabled("true");
                    } else {
                        if (!FLAG_Y.equals(form.getW2011CriteriaDomain().getManualRegFlg())) {
                            if (PKG_FORM_TYP_SINGLE.equals(listDomainList.get(i).getPkgFormTyp())) {
                                listDomainList.get(i).setTagQtyDisabled("true");
                            } else if (!PKG_FORM_TYP_MULTI.equals(listDomainList.get(i).getPkgFormTyp())) {
                                // The case where pkgFormTyp is null is possible.
                                // pkgFormTyp が null の場合が有得る
                                listDomainList.get(i).setQtyDisabled("true");
                                listDomainList.get(i).setTagQtyDisabled("true");
                            }
                        // UT110 TRIAL SHIPMENT/号試品対応 ADD
                        } else {
                            listDomainList.get(i).setTagQtyDisabled("true");
                        }
                    }
                } else {
                    listDomainList.get(i).setQtyDisabled("true");
                    listDomainList.get(i).setTagQtyDisabled("true");
                }
            }
        }
        // Setting of an un-active item
        // 非活性項目の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
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
}
