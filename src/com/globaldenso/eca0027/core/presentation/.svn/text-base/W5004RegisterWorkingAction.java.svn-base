/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W5004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * The Register Working action class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面のRegister Workingアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W5004Init.do
 *     - "error":W5004.jsp
 * </pre>
 *
 * @author $Author: 10035024400 $
 * @version $Revision: 8184 $
 */
public class W5004RegisterWorkingAction extends W5004AbstractAction {
    
    /**
     * Register working facade service.
     */
    protected TransactFacadeService<List<W5004ListDomain>, W5004UpdateDomain> w5004RegisterWorkingFacadeService;

    /**
     * constructor.
     */
    public W5004RegisterWorkingAction() {
        super();
    }

    /**
     * Setter method for w5004RegisterWorkingFacadeService.
     *
     * @param registerWorkingFacadeService Set for w5004RegisterWorkingFacadeService
     */
    public void setW5004RegisterWorkingFacadeService(
        TransactFacadeService<List<W5004ListDomain>, W5004UpdateDomain> registerWorkingFacadeService) {
        w5004RegisterWorkingFacadeService = registerWorkingFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call the W5004RegisterWorkingFacadeService.update an argument form.criteriaDomain
     *
     * - form.criteriaDomainを引数にW5004RegisterWorkingFacadeService.updateの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        // Set of mass update domain.
        // 一括更新ドメインの設定
        W5004ActionForm w5004Form = (W5004ActionForm) form;
        Timestamp comUpdateTimestamp = w5004Form.getW5004CriteriaDomain().getComUpdateTimestamp();
        
        // Set of common information screen.
        // 画面共通情報の設定
        W5004UpdateDomain updateDomain = new W5004UpdateDomain();
        updateDomain.setCriteriaDomain(w5004Form.getW5004CriteriaDomain());
        updateDomain.setListDomainList(w5004Form.getListDomainList());
        
        w5004Form.getW5004CriteriaDomain().setCallScreenId(SCREEN_ID_W5001);
        w5004Form.getW5004CriteriaDomain().setComUpdateTimestamp(comUpdateTimestamp);
        
        // WindowInfo acquisition.
        // WindowInfo取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
        
        // Set the user name.
        // ユーザー名を設定
        Eca0027CommonInfoDomain eca0027CommonInfoDomain = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();
        updateDomain.getCriteriaDomain().setLoginUserDscId(eca0027CommonInfoDomain.getLoginUserDscId());
        updateDomain.getCriteriaDomain().setWorkedIssuerNm(eca0027CommonInfoDomain.getUserName());
        updateDomain.getCriteriaDomain().setTimeZone(eca0027CommonInfoDomain.getTimeZone());
        
        List<W5004ListDomain> listDomainList = w5004RegisterWorkingFacadeService.transact(updateDomain);
        
        // Set of search results.
        // 検索結果の設定
        setSearchResult(w5004Form, listDomainList);
        
        // Update complete message set
        // 更新完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0006, 1));
        saveMessages(request, messages);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
