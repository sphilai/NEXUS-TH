/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB007ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB007UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a registration action class of a Last Digit Change Register Screen.
 * <br />品番末尾変更登録画面の登録アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/WB007Init.do
 *     - "error":WB007.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10368 $
 */
public class WB007RegisterAction extends WB007AbstractAction {

    /**
     * RegisterFacade service
     * <br />RegisterFacadeサービス
     */
    protected TransactFacadeService<WB007UpdateDomain, WB007UpdateDomain> wb007RegisterFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB007RegisterAction() {
        super();
    }

    /**
     * Setter method for wb007RegisterFacadeService.
     * 
     * @param registerFacadeService Set for wb007RegisterFacadeService
     */
    public void setWb007RegisterFacadeService(
        TransactFacadeService<WB007UpdateDomain, WB007UpdateDomain> registerFacadeService) {
        wb007RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // A setting of mass update domain
        // 一括更新ドメインの設定
        WB007ActionForm wB007Form = (WB007ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        WB007UpdateDomain updateDomain = prepareUpdateDomain(wB007Form);
        
        // Execution of registration processing
        // 登録処理の実行
        WB007UpdateDomain resultDomain = transact(updateDomain, request, wB007Form);
        
        if (resultDomain == null) {
            return FORWARD_ERROR;
        }
        
        // Setting of search results
        // 検索結果の設定
        wB007Form.getWb007CriteriaDomain().setIgnoreWarnings(CHECK_OFF);
        wB007Form.setWb007ListDomainList(resultDomain.getListDomainList());
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, resultDomain.getCountUpdData());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link WB007UpdateDomain} is created.
     * <br />{@link WB007UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link WB007UpdateDomain}
     */
    protected WB007UpdateDomain prepareUpdateDomain(WB007ActionForm form) {
        WB007UpdateDomain updateDomain = new WB007UpdateDomain();
        WB007CriteriaDomain criteriaDomain = form.getWb007CriteriaDomain();
        List<WB007ListDomain> listDomainList = new ArrayList<WB007ListDomain>();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        for (WB007ListDomain listDomain : form.getWb007ListDomainList()) {
            ActionUtil.prepareBusinessDomain(listDomain, form.getWindowId(), form.getScreenId());
            listDomainList.add(listDomain);
        }
        
        // A setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }
    
    /**
     *    The specified message is added as {@link ActionMessages#GLOBAL_MESSAGE}.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param cnt Registration / delete / update number<br />登録/削除/更新件数
     */
    protected void addGlobalMessage(HttpServletRequest request, int[] cnt) {
        // Addition of a message
        // メッセージの追加
        ActionMessages messages = getMessages(request);
        
        // Message output of the registration number
        // 登録件数のメッセージ出力
        if (cnt[0] > 0) {
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, cnt[0]));
        }
        // Message output of the update number
        // 更新件数のメッセージ出力
        if (cnt[2] > 0) {
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0006, cnt[2]));
        }
        // Message output of the delete number
        // 削除件数のメッセージ出力
        if (cnt[1] > 0) {
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0007, cnt[1]));
        }
        
        // Registration of GLOBAL_MESSAGE
        // GLOBAL_MESSAGEの登録
        addMessages(request, messages);
    }

    /**
     * Execution of registration processing
     * <br />登録処理を実行します。
     *
     * @param updateDomain Update domain<br />更新ドメイン
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクションフォーム
     * @return null if validation error, otherwise WB007UpdateDomain
     * @throws ApplicationException When there is an input error<br />入力エラーがある場合
     */
    protected WB007UpdateDomain transact(WB007UpdateDomain updateDomain, HttpServletRequest request, WB007ActionForm form) throws ApplicationException {
        
        // Execution of input check
        // 入力チェックの実行
        try {
            return wb007RegisterFacadeService.transact(updateDomain);
            
        } catch (ValidationException e) {
            ActionMessages warningMessages = new ActionMessages();
            String stackError = new String();
            List<MessageDomain> warningMessageDomainList = new ArrayList<MessageDomain>();
            for (MessageDomain error : e.getErrors()){
                if (error.getKey() != null) {
                    stackError = error.getKey();
                }
                if (stackError.startsWith("NXS-W")){
                    if (error.getProperty() != null){
                        if (error.getKey() != null) {
                            warningMessages.add(error.getProperty(), new ActionMessage(error.getKey(), error.getParams()));
                        }
                    }
                    warningMessageDomainList.add(error);
                }
            }
            form.getWb007CriteriaDomain().setIgnoreWarnings(CHECK_OFF);
            
            if (!warningMessages.isEmpty()) {
                saveMessages(request, warningMessages);
                e.getErrors().removeAll(warningMessageDomainList);
            }
            
            if (!e.getErrors().isEmpty()) {
                throw e;
            }
            
            return null;
        }
    }
}
