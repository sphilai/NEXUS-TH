/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7001UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7001ConfirmDetailFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * The class of action Confirm Detail for Shipping Actuality Main screen.
 * <br />船積実績Main画面のConfirm Detailアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": /W7004Init.do
 *     ‐ "error": W7001
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001ConfirmDetailAction extends W7001AbstractAction {

    /**
     * ConfirmDetail Facade Service<br />
     * ConfirmDetail Facadeサービス
     */
    protected ProcessFacadeService<Void, W7001UpdateDomain> w7001ConfirmDetailFacadeService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ConfirmDetailAction() {
    }

    /**
     * Setter method for w7001ConfirmDetailFacadeService.
     *
     * @param confirmDetailFacadeService Set for w7001ConfirmDetailFacadeService
     */
    public void setW7001ConfirmDetailFacadeService(ProcessFacadeService<Void, W7001UpdateDomain> confirmDetailFacadeService) {
        w7001ConfirmDetailFacadeService = confirmDetailFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Took over the data that has been selected, transition in the document editing screen Shipping Actuality Register
     *
     * - Line item check
     * Call the {@link W7001ConfirmDetailFacadeServiceImpl}.
     * </pre>
     * <pre>
     * 選択したデータを引き継ぎ、Shipping Actuality Register画面に帳票編集で遷移する
     * 
     * ‐明細行チェック
     *     {@link W7001ConfirmDetailFacadeServiceImpl}を呼出す。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7001ActionForm w7001Form = (W7001ActionForm) form;
        // Create a W7001ListDomain. 
        // リストドメインの作成
        W7001UpdateDomain updateDomain = prepareListDomain(w7001Form);
        
        w7001ConfirmDetailFacadeService.process(updateDomain);
        
        w7001Form.setShippingActNo(updateDomain.getListDomainList().get(0).getShippingActNo());
        
        return FORWARD_SUCCESS;
    }

    
    /**
     * Create a {@link W7001ListDomain}.
     * <br />{@link W7001ListDomain}を作成します。
     *
     * @param form Action Form<br />アクションフォーム
     * @return You created {@link W7001ListDomain}<br />作成した{@link W7001ListDomain}
     */
    protected W7001UpdateDomain prepareListDomain(W7001ActionForm form) {
        W7001UpdateDomain updateDomain = new W7001UpdateDomain();
        
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
