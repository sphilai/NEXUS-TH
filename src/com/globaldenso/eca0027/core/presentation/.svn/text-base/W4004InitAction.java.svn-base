/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MASK_CHAR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4003;
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
import com.globaldenso.eca0027.core.business.domain.W4002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4004UpdateDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Initialize action class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4004.jsp
 *     - "errorW4001":/W4001Init.do
 *     - "errorW4003":/W4003Init.do
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4004InitAction extends W4004AbstractAction {

    /**
     * Init from Main facade service.
     */
    protected SearchFacadeService<W4004UpdateDomain, W4004CriteriaDomain> w4004InitFacadeService;

    /**
     * Constructor.
     */
    public W4004InitAction() {
        super();
    }

    /**
     * Setter method for w4004InitFacadeService.
     *
     * @param initFacadeService Set for w4004InitFacadeService
     */
    public void setW4004InitFacadeService(
        SearchFacadeService<W4004UpdateDomain, W4004CriteriaDomain> initFacadeService) {
        w4004InitFacadeService = initFacadeService;
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

        W4004ActionForm form = (W4004ActionForm)actForm;

        String forwardName = null;

        try {
            // In the case of transition from the Main screen
            // Main画面からの遷移の場合
            if (!CheckUtil.isBlankOrNull(form.getStgInstrNo())) {
                form.setCallScreenId(SCREEN_ID_W4001);
                forwardName = invokeExecuteFromMain(mapping, form, request, response);

            // In the case of transition from the Create screen
            // Create画面からの遷移の場合
            } else {
                form.setCallScreenId(SCREEN_ID_W4003);
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
     * - Create an instance of W4004CriteriaDomain w4004CriteriaDomain search criteria domain
     * - Set to w4004CriteriaDomain the Staging instruction No. of form
     * - Call W4004InitFacadeService.search an argument w4004CriteriaDomain
     * - Of the result of calling W4004InitFacadeService.search, mask data without reference authority
     * - Set to form the result of calling W4004InitFacadeService.search
     *
     * - 検索条件ドメインのインスタンスW4004CriteriaDomain w4004CriteriaDomainを作成
     * - formのStaging instruction No.をw4004CriteriaDomainに設定
     * - w4004CriteriaDomainを引数にW4004InitFacadeService.searchの呼び出し
     * - W4004InitFacadeService.searchの呼び出し結果のうち、参照権限のないデータをマスク
     * - W4004InitFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form W4004ActionForm
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @return Return code
     * @throws Exception Exception
     */
    protected String invokeExecuteFromMain(ActionMapping mapping, W4004ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Create a domain to be passed to the facade
        // facadeに渡すドメインを作成

        // Get PL domain
        // PLドメイン取得
        W4004CriteriaDomain w4004CriteriaDomain = form.getW4004CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4004CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Staging instruction No. that is selected in the Main screen.
        // Main画面で選択された荷揃え指示No.
        w4004CriteriaDomain.setStgInstrNo(form.getStgInstrNo());

        // Set of function use authority
        // 機能利用権限の設定
        List<? extends UserAuthDomain> userAuthList
            = userAuthService.getUserAuthList(new String[] { PERMIT_FUNC_ID_W4001R, PERMIT_FUNC_ID_W4001B });
        w4004CriteriaDomain.setUserAuthList(userAuthList);

        // Call of facade service
        // facadeサービスの呼び出し

        W4004UpdateDomain resultW4004UpdateDomain = w4004InitFacadeService.search(w4004CriteriaDomain);

        // Data mask when there is no reference authority
        // 参照権限がない場合のデータマスク

        for (W4004ListDomain w4004ListDomain : resultW4004UpdateDomain.getW4004ListDomainList()) {
            // If no RegisterAll, no BrowseAll
            // RegisterAll、BrowseAll共に保有していない場合
            if (!userAuthService.hasBrowseAll()) {
                if (AUTH_EMPTY_NUMERIC.equals(w4004ListDomain.getAuth())) {
                    mask(w4004ListDomain, Arrays.asList("loadingCd", "shipToCd", "dngrItemFlg", "mainMark",
                        "expRequestNo", "grossWeight", "volume", "lastTrRcvDt", "dueDt"));
                    w4004ListDomain.setMaskFlg(FLAG_Y);
                }
            }
        }

        // Set to form the search results
        // 検索結果をフォームに設定
        form.setW4004CriteriaDomain(resultW4004UpdateDomain.getW4004CriteriaDomain());
        form.setW4004ListDomainList(resultW4004UpdateDomain.getW4004ListDomainList());

        return FORWARD_SUCCESS;
    }

    /**
     * Execute process in the case of the transition from the Create screen
     * <br />Create画面からの遷移の場合の実行処理です。
     * <pre>
     * - Create an instance of W4004CriteriaDomain w4004CriteriaDomain search criteria domain
     * - The transfer to w4004CriteriaDomain information w4002CriteriaDomain of Header screen information stack
     * - Call W4004InitFacadeService.search an argument form.w4004CriteriaDomain
     * - Set to form the result of calling W4004InitFacadeService.search
     *
     * - 検索条件ドメインのインスタンスW4004CriteriaDomain w4004CriteriaDomainを作成
     * - Header画面情報スタックのw4002CriteriaDomainの情報をw4004CriteriaDomainに移送
     * - w4004CriteriaDomainを引数にW4004InitFacadeService.searchの呼び出し
     * - W4004InitFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form W4004ActionForm
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @return Return code
     * @throws Exception Exception
     */
    protected String invokeExecuteFromCreate(ActionMapping mapping, W4004ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Create a domain to be passed to the facade
        // facadeに渡すドメインを作成

        // Get PL domain
        // PLドメイン取得
        W4004CriteriaDomain w4004CriteriaDomain = form.getW4004CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4004CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Getting Header PL domain than the screen stack information
        // 画面情報スタックよりHeader PLドメインの取得
        WindowInfoDomain windowInfoDomain = (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfoDomain = windowInfoDomain.getScreenInfo().get(SCREEN_ID_W4002);
        W4002CriteriaDomain w4002CriteriaDomain
            = ((W4002ActionForm)screenInfoDomain.getActionForm()).getW4002CriteriaDomain();

        // Header PL domain -> Create PL domain transfer
        // Header PLドメイン→Create PLドメイン移送
        CommonUtil.copyPropertiesDomainToDomain(w4004CriteriaDomain,
            w4002CriteriaDomain, w4002CriteriaDomain.getScreenDateFormat());

        // Call of facade service
        // facadeサービスの呼び出し

        W4004UpdateDomain resultW4004UpdateDomain = w4004InitFacadeService.search(w4004CriteriaDomain);

        // Set to form the search results
        // 検索結果をフォームに設定
        form.setW4004CriteriaDomain(resultW4004UpdateDomain.getW4004CriteriaDomain());
        form.setW4004ListDomainList(resultW4004UpdateDomain.getW4004ListDomainList());

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
