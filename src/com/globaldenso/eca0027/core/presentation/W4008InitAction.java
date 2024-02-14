/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MASK_CHAR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4005B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4005R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W4006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4008UpdateDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Initialize action class of Staging Actuality Register screen
 * <br />山作り実績Register画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4008.jsp
 *     - "errorW4005":/W4005Init.do
 *     - "errorW4007":/W4007Init.do
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4008InitAction extends W4008AbstractAction {

    /**
     * Init from Main facade service.
     */
    protected SearchFacadeService<W4008UpdateDomain, W4008CriteriaDomain> w4008InitFacadeService;

    /**
     * Constructor.
     */
    public W4008InitAction() {
        super();
    }

    /**
     * Setter method for w4008InitFacadeService.
     *
     * @param initFacadeService Set for w4008InitFacadeService
     */
    public void setW4008InitFacadeService(
        SearchFacadeService<W4008UpdateDomain, W4008CriteriaDomain> initFacadeService) {
        w4008InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - In the case of transition from the Main screen
     *     Call of invokeExecuteFromMain
     * - In the case of transition from the Create screen
     *     Call of invokeExecuteFromCreate
     *
     * - Main画面から遷移の場合
     *     invokeExecuteFromMainの呼び出し
     * - Create画面から遷移の場合
     *     invokeExecuteFromCreateの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4008ActionForm form = (W4008ActionForm)actForm;

        String forwardName = null;

        try {
            // In the case of transition from the Main screen
            // Main画面からの遷移の場合
            if (!CheckUtil.isBlankOrNull(form.getStgActNo())) {
                form.setCallScreenId(SCREEN_ID_W4005);
                forwardName = invokeExecuteFromMain(mapping, form, request, response);

            // In the case of transition from the Create screen
            // Create画面からの遷移の場合
            } else {
                form.setCallScreenId(SCREEN_ID_W4007);
                forwardName = invokeExecuteFromCreate(mapping, form, request, response);
            }

        } catch (GscmApplicationException e) {
            ActionMessages messages = new ActionMessages();
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(e.getCode(), e.getArgs()));
            saveErrors(request, messages);
            forwardName = FORWARD_ERROR + form.getCallScreenId();
        }

        return forwardName;
    }

    /**
     * Execute process in the case of the transition from the Main screen
     * <br />Main画面からの遷移の場合の実行処理です。
     * <pre>
     * - Create an instance of W4008CriteriaDomain w4008CriteriaDomain search criteria domain
     * - Set to w4008CriteriaDomain the Staging actuality No. of form
     * - Call W4008InitFacadeService.search an argument w4008CriteriaDomain
     * - Of the result of calling W4008InitFacadeService.search, mask data without reference authority
     * - Set to form the result of calling W4008InitFacadeService.search
     *
     * - 検索条件ドメインのインスタンスW4008CriteriaDomain w4008CriteriaDomainを作成
     * - formのStaging actuality No.をw4008CriteriaDomainに設定
     * - w4008CriteriaDomainを引数にW4008InitFacadeService.searchの呼び出し
     * - W4008InitFacadeService.searchの呼び出し結果のうち、参照権限のないデータをマスク
     * - W4008InitFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form W4008ActionForm
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @return Return code
     * @throws Exception Exception
     */
    protected String invokeExecuteFromMain(ActionMapping mapping, W4008ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Create a domain to be passed to the facade
        // facadeに渡すドメインを作成

        // Get PL domain
        // PLドメイン取得
        W4008CriteriaDomain w4008CriteriaDomain = form.getW4008CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4008CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Staging actuality No. that is selected in the Main screen.
        // Main画面で選択された山作り実績No.
        w4008CriteriaDomain.setStgActNo(form.getStgActNo());

        // Set of function use authority
        // 機能利用権限の設定
        List<? extends UserAuthDomain> userAuthList
            = userAuthService.getUserAuthList(new String[] { PERMIT_FUNC_ID_W4005R, PERMIT_FUNC_ID_W4005B });
        w4008CriteriaDomain.setUserAuthList(userAuthList);

        // Call of facade service
        // facadeサービスの呼び出し

        W4008UpdateDomain resultW4008UpdateDomain = w4008InitFacadeService.search(w4008CriteriaDomain);
        // Complements search result
        // 検索結果を補完
        resultW4008UpdateDomain.getW4008CriteriaDomain().setWeightUnitDisp(w4008CriteriaDomain.getWeightUnitDisp());
        resultW4008UpdateDomain.getW4008CriteriaDomain().setVolumeUnitDisp(w4008CriteriaDomain.getVolumeUnitDisp());

        // Data mask when there is no reference authority
        // 参照権限がない場合のデータマスク

        for (W4008ListDomain w4008ListDomain : resultW4008UpdateDomain.getW4008ListDomainList()) {
            // If no RegisterAll, no BrowseAll
            // RegisterAll、BrowseAll共に保有していない場合
            if (!userAuthService.hasBrowseAll()) {
                if (AUTH_EMPTY_NUMERIC.equals(w4008ListDomain.getAuth())) {
                    mask(w4008ListDomain, Arrays.asList("mainMarkOrXmainMark", "shipperCd", "shipToCd",
                        "stgInstrNo", "loadingCd", "etd", "carrierCompCd", "grossWeight", "volume", "lastTrRcvDt"));
                    w4008ListDomain.setMaskFlg(FLAG_Y);
                }
            }
        }

        // Set to form the search results
        // 検索結果をフォームに設定
        form.setW4008CriteriaDomain(resultW4008UpdateDomain.getW4008CriteriaDomain());
        form.setW4008ListDomainList(resultW4008UpdateDomain.getW4008ListDomainList());

        return FORWARD_SUCCESS;
    }

    /**
     * Execute process in the case of the transition from the Create screen
     * <br />Create画面からの遷移の場合の実行処理です。
     * <pre>
     * - Create an instance of W4008CriteriaDomain w4008CriteriaDomain search criteria domain
     * - The transfer to w4008CriteriaDomain information w4006CriteriaDomain of Header screen information stack
     * - Call W4008InitFacadeService.search an argument form.w4008CriteriaDomain
     * - Set to form the result of calling W4008InitFacadeService.search
     *
     * - 検索条件ドメインのインスタンスW4008CriteriaDomain w4008CriteriaDomainを作成
     * - Header画面情報スタックのw4006CriteriaDomainの情報をw4008CriteriaDomainに移送
     * - w4008CriteriaDomainを引数にW4008InitFacadeService.searchの呼び出し
     * - W4008InitFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form W4008ActionForm
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @return Return code
     * @throws Exception Exception
     */
    protected String invokeExecuteFromCreate(ActionMapping mapping, W4008ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Create a domain to be passed to the facade
        // facadeに渡すドメインを作成

        // Get PL domain
        // PLドメイン取得
        W4008CriteriaDomain w4008CriteriaDomain = form.getW4008CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4008CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Getting Header PL domain than the screen stack information
        // 画面情報スタックよりHeader PLドメインの取得
        WindowInfoDomain windowInfoDomain = (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfoDomain = windowInfoDomain.getScreenInfo().get(SCREEN_ID_W4006);
        W4006CriteriaDomain w4006CriteriaDomain
            = ((W4006ActionForm)screenInfoDomain.getActionForm()).getW4006CriteriaDomain();

        // Header PL domain -> Create PL domain transfer
        // Header PLドメイン→Create PLドメイン移送
        CommonUtil.copyPropertiesDomainToDomain(w4008CriteriaDomain,
            w4006CriteriaDomain, w4006CriteriaDomain.getScreenDateFormat());

        // Call of facade service
        // facadeサービスの呼び出し

        W4008UpdateDomain resultW4008UpdateDomain = w4008InitFacadeService.search(w4008CriteriaDomain);
        // Complements search result
        // 検索結果を補完
        resultW4008UpdateDomain.getW4008CriteriaDomain().setEtd(w4008CriteriaDomain.getEtd());
        resultW4008UpdateDomain.getW4008CriteriaDomain().setCarrierCompCd(w4008CriteriaDomain.getCarrierCompCd());
        resultW4008UpdateDomain.getW4008CriteriaDomain().setWeightUnitDisp(w4008CriteriaDomain.getWeightUnitDisp());
        resultW4008UpdateDomain.getW4008CriteriaDomain().setVolumeUnitDisp(w4008CriteriaDomain.getVolumeUnitDisp());

        // Set to form the search results
        // 検索結果をフォームに設定
        form.setW4008CriteriaDomain(resultW4008UpdateDomain.getW4008CriteriaDomain());
        form.setW4008ListDomainList(resultW4008UpdateDomain.getW4008ListDomainList());

        return FORWARD_SUCCESS;
    }

    /**
     * Mask processing of field
     * <br />フィールドのマスク処理です。
     * <pre>
     * usage:
     *     mask(listDomain, Arrays.asList("loadingCd", "shipToCd", "dngrItemFlg", "mainMark",
     *         "expRequestNo", "grossWeight", "volume", "lastTrRcvDt", "dueDt"));
     * </pre>
     *
     * @param o object
     * @param maskFieldNameList List of mask field name
     */
    protected void mask(Object o, List<String> maskFieldNameList) {
        Class<?> clazz = o.getClass();
        try {
            for (String maskFieldName : maskFieldNameList) {
                Field maskField = clazz.getDeclaredField(maskFieldName);
                maskField.setAccessible(true);
                String value = (String)maskField.get(o);
                if (value != null) {
                    maskField.set(o, value.replaceAll(".", MASK_CHAR));
                }
            }
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
