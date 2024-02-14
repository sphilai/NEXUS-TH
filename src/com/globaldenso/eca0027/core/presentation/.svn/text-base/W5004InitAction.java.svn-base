/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W5001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W5001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W5001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W5002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5004ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Initialize action class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W5004.jsp
 *     - "errorFromMain":W5001.jsp
 *     - "errorFromCreate":W5003.jsp
 * </pre>
 *
 * @author $Author: 400616000407 $
 * @version $Revision: 9066 $
 */
public class W5004InitAction extends W5004AbstractAction {
    
    /**
     * Init facade service.
     */
    protected SearchFacadeService<List<W5004ListDomain>, W5004CriteriaDomain> w5004InitFacadeService;

    /**
     * constructor.
     */
    public W5004InitAction() {
        super();
    }

    /**
     * Setter method for w5004InitFacadeService.
     *
     * @param initFacadeService Set for w5004InitFacadeService
     */
    public void setW5004InitFacadeService(
        SearchFacadeService<List<W5004ListDomain>, W5004CriteriaDomain> initFacadeService) {
        w5004InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call W5004InitFacadeService.search an argument form.criteriaDomain
     * - Set to form the result of calling W5004InitFacadeService.search
     * - The button activity control by the data access rights
     *     Transition from the Main, when the number without the authority update is included at least one in the search results,
     *     Print Confirmation, Re-Update Container No., Register Working, Cancel button deactivation
     *
     * - form.criteriaDomainを引数にW5004InitFacadeService.searchの呼び出し
     * - W5004InitFacadeService.searchの呼び出し結果をformに設定
     * - データアクセス権限によるボタン活性制御
     *     Mainからの遷移時、検索結果に更新権限のない品番が1つでも含まれる場合、
     *     Print Confirmation、Re-Update Container No.、Register Working、Cancelボタン非活性化
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W5004ActionForm w5004Form = prepareForm((W5004ActionForm) form);
        
        // Set of search criteria domain.
        // 検索条件ドメインの設定
        W5004CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w5004Form);
        
        // Execution of the search process.
        // 検索処理の実行
        List<W5004ListDomain> listDomainList;
        try {
            listDomainList = w5004InitFacadeService.search(criteriaDomain);
        } catch (GscmApplicationException e) {
            ActionMessages messages = new ActionMessages();
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(e.getCode(), e.getArgs()));
            saveErrors(request, messages);
            return w5004Form.getCallScreenId();
        }
        
        if (0 < listDomainList.size()) {
            // Execution of the search process.
            // 検索結果の設定
            setSearchResult(w5004Form, listDomainList);
            
            return FORWARD_SUCCESS;
            
        } else {
            // Set of error messages.
            // エラーメッセージの設定
            saveErrors(request, mapping, GSCM_E0_0010, null);
            
            // The transition to transition source screen.
            // 遷移元画面に遷移
            return w5004Form.getCallScreenId();
        }
    }

    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     * 
     * <pre>
     * - Clear list domain.
     *
     * - リストドメインのクリア
     * </pre>
     *
     * @param form action form
     * @return action form
     */
    protected W5004ActionForm prepareForm(W5004ActionForm form) {
        form.setListDomainList(null);
        
        return form;
    }

    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request
     * @param mapping action mapping
     * @param form action form
     * @return Search conditions domain
     * @throws GscmApplicationException if the user authority does not exist
     */
    protected W5004CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, 
        ActionMapping mapping, W5004ActionForm form) throws GscmApplicationException {
        W5004CriteriaDomain criteriaDomain = form.getW5004CriteriaDomain();
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Specification of transition original screen ID.
        // 遷移元画面IDの設定
        criteriaDomain.setCallScreenId(form.getCallScreenId());
        
        // Setting Permissions.
        // 権限の設定
        String[] permitFuncIdList = { PERMIT_FUNC_ID_W5001R, PERMIT_FUNC_ID_W5001B};
        List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(
            permitFuncIdList);
        criteriaDomain.setUserAuthList(userAuthList);
        
        // Transition from the Main screen.
        // Main画面から遷移時
        if (SCREEN_ID_W5001.equals(form.getCallScreenId())) {
            // Acquisition of common information screen.
            // 画面共通情報の取得
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(
                WINDOW_ID_0);
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(
                SCREEN_ID_W5001);
            
            // Acquisition of shipping confirmation No you have selected in the Main screen.
            // Main画面で選択した出荷確認Noの取得
            W5001ActionForm w5001Form = (W5001ActionForm) screenInfo.getActionForm();
            W5001ListDomain list = w5001Form.getListDomainList().get(Integer.parseInt(
                form.getRowNum()));
            
            // Setting of shipping confirmation NO.
            // 出荷確認NOの設定
            criteriaDomain.setShippingFirmNo(list.getShippingFirmNo());
            
        // Transition from the Create screen.
        // Create画面から遷移時
        } else {
            // Acquisition of common information screen.
            // 画面共通情報の取得
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(
                WINDOW_ID_0);
            ScreenInfoDomain screenInfoW5002 = (ScreenInfoDomain) windowInfo.getScreenInfo().get(
                SCREEN_ID_W5002);
            ScreenInfoDomain screenInfoW5003 = (ScreenInfoDomain) windowInfo.getScreenInfo().get(
                SCREEN_ID_W5003);
            
            // Getting Header information.
            // Header情報の取得
            W5002ActionForm w5002Form = (W5002ActionForm) screenInfoW5002.getActionForm();
            W5002CriteriaDomain headerInfo = w5002Form.getW5002CriteriaDomain();
            
            // Setting the Header information.
            // Header情報の設定
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, headerInfo);
            
            // Get the record you selected in the Create screen.
            // Create画面で選択したレコードの取得
            W5003ActionForm w5003Form = (W5003ActionForm) screenInfoW5003.getActionForm();
            W5003ListDomain list = w5003Form.getListDomainList().get(Integer.parseInt(
                form.getRowNum()));
            
            // Staging Actuality No cases of blank.
            // 山作り実績Noが""の場合
            if (list.getStgActNo() == null) {
                // Set to Staging Instruction No search criteria.
                // 検索条件に荷揃え指示Noを設定
                criteriaDomain.setStgInstrNo(list.getStgInstrNo());
            } else {
                // Set to Staging Actuality No search criteria.
                // 検索条件に山作り実績Noを設定
                criteriaDomain.setStgActNo(list.getStgActNo());
            }
        }
        
        // Configuring the Server ID.
        // サーバIDの設定
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(
            form.getWindowId());
        Eca0027CommonInfoDomain eca0027CommonInfoDomain = 
            (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();
        criteriaDomain.setServerId(eca0027CommonInfoDomain.getServerId());
        
        // Setting the weight unit code.
        // 重量単位コードの設定
        criteriaDomain.setWeightUnit(eca0027CommonInfoDomain.getWeightUnit());
        
        // Set weight unit of code (for display)
        // 重量単位コード(表示用)の設定
        criteriaDomain.setWeightUnitDisp(eca0027CommonInfoDomain.getWeightUnitDisp());
        
        // Setting the volume unit code.
        // 容積単位コードの設定
        criteriaDomain.setVolumeUnit(eca0027CommonInfoDomain.getVolumeUnit());
        
        // Setting volume unit of code (for display)
        // 容積単位コード(表示用)の設定
        criteriaDomain.setVolumeUnitDisp(eca0027CommonInfoDomain.getVolumeUnitDisp());
        
        return criteriaDomain;
    }
    
    /**
     * Set to {@ link ActionMessages} the specified message.
     * <br />指定されたメッセージを{@link ActionMessages}に設定します。
     *
     * @param request HTTP request
     * @param mapping action mapping
     * @param messageId message id
     * @param args The message parameters
     */
    protected void saveErrors(HttpServletRequest request, ActionMapping mapping, 
        String messageId, Object[] args) {
        ActionMessages errors = new ActionMessages();
        errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        saveErrors(request, errors);
    }
}
