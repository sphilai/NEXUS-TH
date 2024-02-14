/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.WB001MoveToRegisterFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Move to Register action class of an ordering registration header screen.
 * <br />受注登録ヘッダー画面のMove to Registerアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/WB002Init.do
 *     - "error":WB001.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10367 $
 */
public class WB001MoveToRegisterAction extends WB001AbstractAction {

    /**
     * MoveToRegisterFacade service
     * <br />MoveToRegisterFacadeサービス
     */
    protected ProcessFacadeService<Void, WB001CriteriaDomain> wb001MoveToRegisterFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB001MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for wb001MoveToRegisterFacadeService.
     *
     * @param processFacadeService Set for wb001MoveToRegisterFacadeService
     */
    public void setWb001MoveToRegisterFacadeService(
        ProcessFacadeService<Void, WB001CriteriaDomain> processFacadeService) {
        wb001MoveToRegisterFacadeService = processFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - input check
     *       {@link WB001MoveToRegisterFacadeServiceImpl WB001MoveToRegisterFacadeServiceImpl#process(WB001CriteriaDomain)} is called,
     *       The VALUE inputted on the ordering registration header screen is checked.
     *
     * - Changes to an ordering registration picture
     *       It changes to an ordering registration picture.
     *
     * - 入力チェック
     *     {@link WB001MoveToRegisterFacadeServiceImpl WB001MoveToRegisterFacadeServiceImpl#process(WB001CriteriaDomain)}を呼出し、
     *     受注登録ヘッダー画面で入力された値をチェックする
     *     
     * - 受注登録画面への遷移
     *     受注登録画面へ遷移する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        WB001ActionForm wb001Form = (WB001ActionForm) form;
        
        // Check of changes conditions
        // 遷移条件のチェック
        boolean result = validateHeader(wb001Form, request);
        
        // It changes to WB002 Order Entry Register screen.
        // WB002 Order Entry Register 画面へ遷移
        if (result) {
            return FORWARD_SUCCESS;
        } else {
            return FORWARD_ERROR;
        }
    }

    /**
     *    The VALUE inputted on the ordering registration header screen is checked.
     * <br />受注登録ヘッダー画面で入力された値をチェックします。
     *
     * @param form Action form of an ordering registration header screen<br />受注登録ヘッダー画面のアクション・フォーム
     * @param request HTTP request<br />HTTPリクエスト
     * @return false if validation error, otherwise true
     * @throws ApplicationException When there is an input error<br />入力エラーがある場合
     */
    protected boolean validateHeader(WB001ActionForm form, HttpServletRequest request) throws ApplicationException {
        // Acquisition of a condition domain
        // 条件ドメインの取得
        WB001CriteriaDomain criteriaDomain = form.getWb001CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // flg off
        criteriaDomain.setWarningFlgCustomerCd("");
        criteriaDomain.setWarningFlgItemNo("");
        
        // Execution of input check
        // 入力チェックの実行
        try {
            wb001MoveToRegisterFacadeService.process(criteriaDomain);
            criteriaDomain.setIgnoreWarnings(CHECK_OFF);
        } catch (ValidationException e) {
            ActionMessages warningMessages = new ActionMessages();
            String stackError = new String();
            List<String> warnigPropertyList = new ArrayList<String>();
            List<MessageDomain> warningMessageDomainList = new ArrayList<MessageDomain>();
            for (MessageDomain error : e.getErrors()){
                if (error.getKey() != null) {
                    stackError = error.getKey();
                }
                if (stackError.startsWith("NXS-W")){
                    if (error.getProperty() != null){
                        warnigPropertyList.add(error.getProperty());
                        if (error.getKey() != null) {
                            warningMessages.add(error.getProperty(), new ActionMessage(error.getKey(), error.getParams()));
                        }
                    }
                    warningMessageDomainList.add(error);
                }
            }
            List<String> errorPropertyList = new ArrayList<String>();
            for (String property : warnigPropertyList){
                for (MessageDomain error : e.getErrors()){
                    if (error.getKey() != null) {
                        stackError = error.getKey();
                    }
                    String[] errFlg = stackError.split("-");
                    if (errFlg[1].startsWith("E")){
                        if (property.equals(error.getProperty())){
                            errorPropertyList.add(property);
                        }
                    }  
                }
            }
            warnigPropertyList.removeAll(errorPropertyList);
            
            for (String property : warnigPropertyList) {
                if ("wb001CriteriaDomain.customerCd".equals(property)){
                    criteriaDomain.setWarningFlgCustomerCd(FLAG_Y);
                }
                if ("wb001CriteriaDomain.itemNo".equals(property)){
                    criteriaDomain.setWarningFlgItemNo(FLAG_Y);
                }
            }
            criteriaDomain.setIgnoreWarnings(CHECK_OFF);
            
            if (!warningMessages.isEmpty()) {
                saveMessages(request, warningMessages);
                e.getErrors().removeAll(warningMessageDomainList);
            }
            
            if (!e.getErrors().isEmpty()) {
                throw e;
            }
            
            return false;
        }
        
        return true;
    }
}
