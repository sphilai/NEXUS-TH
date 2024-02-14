/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

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
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Register action class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面の登録アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W5004Init.do
 *     - "error":W5004.jsp
 * </pre>
 *
 * @author $Author: 10035024400 $
 * @version $Revision: 8907 $
 */
public class W5004RegisterAction extends W5004AbstractAction {
    
    /**
     * Register facade service.
     */
    protected TransactFacadeService<List<W5004ListDomain>, W5004UpdateDomain> w5004RegisterFacadeService;

    /**
     * constructor.
     */
    public W5004RegisterAction() {
        super();
    }

    /**
     * Setter method for w5004RegisterFacadeService.
     *
     * @param registerFacadeService Set for w5004RegisterFacadeService
     */
    public void setW5004RegisterFacadeService(
        TransactFacadeService<List<W5004ListDomain>, W5004UpdateDomain> registerFacadeService) {
        w5004RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Create an instance of W5004UpdateDomain updateDomain mass update domain 
     * - Set to updateDomain.criteriaDomain, the form.criteriaDomain 
     * - Set to updateDomain.listDomainList, the form.listDomain 
     * - Call the W5004RegisterFacadeService.transact an argument updateDomain
     *
     * - 一括更新ドメインのインスタンスW5004UpdateDomain updateDomainを作成
     * - form.criteriaDomainを、updateDomain.criteriaDomainに設定
     * - form.listDomainを、updateDomain.listDomainListに設定
     * - updateDomainを引数にW5004RegisterFacadeService.transactの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W5004ActionForm w5004Form = (W5004ActionForm) form;
        
        // PL domain creation
        // PLドメイン作成
        W5004UpdateDomain updateDomain = new W5004UpdateDomain();
        updateDomain.setCriteriaDomain(w5004Form.getW5004CriteriaDomain());
        updateDomain.setListDomainList(w5004Form.getListDomainList());
        
        // Set of common information screen
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, w5004Form.getWindowId(), w5004Form.getScreenId());
        
        // Set company code, the user name
        // 会社コード、ユーザ名を設定
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
        Eca0027CommonInfoDomain eca0027CommonInfoDomain = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();
        updateDomain.setOwnerCompCd(eca0027CommonInfoDomain.getOwnerCompCd());
        updateDomain.getCriteriaDomain().setShippingFirmIssuerNm(eca0027CommonInfoDomain.getUserName());
        updateDomain.getCriteriaDomain().setTimeZone(eca0027CommonInfoDomain.getTimeZone());
        
        // Registration process, the execution of the search process
        // 登録処理、再検索処理の実行
        List<W5004ListDomain> listDomainList = w5004RegisterFacadeService.transact(updateDomain);
        
        // To switch to a transition from the Main screen display the results on the screen
        // 画面の表示結果をMain画面から遷移したように切り替える
        w5004Form.getW5004CriteriaDomain().setCallScreenId(SCREEN_ID_W5001);
        
        // Set to List domain search results
        // 検索結果をListドメインに設定
        setSearchResult(w5004Form, listDomainList);
        
        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, 1));
        saveMessages(request, messages);
        
        return FORWARD_SUCCESS;
    }
}
