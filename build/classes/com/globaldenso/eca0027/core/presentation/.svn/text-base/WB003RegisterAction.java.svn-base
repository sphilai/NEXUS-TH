/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB003ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB003UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a registration action class of ordering two or moreP / O registration picture.
 * <br />受注複数P/O登録画面の登録アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/WB003Init.do
 *     - "error":WB003.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10368 $
 */
public class WB003RegisterAction extends WB003AbstractAction {

    /**
     * RegisterFacade service
     * <br />RegisterFacadeサービス
     */
    protected TransactFacadeService<List<? extends WB003ListDomain>, WB003UpdateDomain> wb003RegisterFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB003RegisterAction() {
        super();
    }

    /**
     * Setter method for wb003RegisterFacadeService.
     *
     * @param wb003RegisterFacadeService Set for wb003RegisterFacadeService
     */
    public void setWb003RegisterFacadeService(
        TransactFacadeService<List<? extends WB003ListDomain>, WB003UpdateDomain> wb003RegisterFacadeService) {
        this.wb003RegisterFacadeService = wb003RegisterFacadeService;
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
        WB003ActionForm wB003Form = (WB003ActionForm) form;
        
        // Count of the update number
        // 更新件数のカウント
        int[] cnt = getRegisterCount(wB003Form.getWb003ListDomainList());
        
        // Setting of an update domain
        // 更新ドメインの設定
        WB003UpdateDomain updateDomain = prepareUpdateDomain(wB003Form);
        
        // Execution of registration processing
        // 登録処理の実行
        List<? extends WB003ListDomain> listDomainList = transact(updateDomain, request, wB003Form);
        
        if (listDomainList == null) {
            return FORWARD_ERROR;
        }
        
        // Setting of search results
        // 検索結果の設定
        wB003Form.getWb003CriteriaDomain().setIgnoreWarnings(CHECK_OFF);
        wB003Form.setWb003ListDomainList(listDomainList);
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, cnt);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link WB003UpdateDomain} is created.
     * <br />{@link WB003UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link WB003UpdateDomain}
     */
    @SuppressWarnings("unchecked")
    protected WB003UpdateDomain prepareUpdateDomain(WB003ActionForm form) {
        WB003UpdateDomain updateDomain = new WB003UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // A setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getWb003CriteriaDomain());
        
        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        if (form.getWb003ListDomainList() != null) {
            for (WB003ListDomain listDomain : form.getWb003ListDomainList()) {
                listDomain.setLanguageCd(form.getLanguageCd());
                listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
            }
        }
        updateDomain.setListDomainList((List<WB003ListDomain>)form.getWb003ListDomainList());
        
        return updateDomain;
    }
    
    /**
     *    The delete number is acquired.
     * <br />削除件数を取得します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return Delete number<br />削除件数
     */
    protected int[] getRegisterCount(List<? extends WB003ListDomain> listDomainList) {
        int[] count = new int[3];
        Arrays.fill(count, 0);
        
        for (WB003ListDomain listDomain : listDomainList) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                // New
                // 新規
                if (listDomain.getOdrQty().equals("")){
                    count[0]++;
                // Delete
                // 削除
                } else if ((StringUtils.isEmpty(listDomain.getFirmQty()) || listDomain.getFirmQty().equals("0"))
                    && (StringUtils.isEmpty(listDomain.getForecastQty()) || listDomain.getForecastQty().equals("0"))) {
                    count[1]++;
                // Update
                // 更新
                } else {
                    count[2]++;
                }
            }
        }
        return count;
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
     * @return null if validation error, otherwise WB003ListDomain list
     * @throws ApplicationException When there is an input error<br />入力エラーがある場合
     */
    protected List<? extends WB003ListDomain> transact(WB003UpdateDomain updateDomain, HttpServletRequest request, WB003ActionForm form) throws ApplicationException {
        
        // Execution of input check
        // 入力チェックの実行
        try {
            return wb003RegisterFacadeService.transact(updateDomain);
            
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
            form.getWb003CriteriaDomain().setIgnoreWarnings(CHECK_OFF);
            
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
