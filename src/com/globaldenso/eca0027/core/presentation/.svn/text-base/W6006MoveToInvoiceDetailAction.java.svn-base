/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6008;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6006UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class of Move to Invoice Detail action for Documentation Shipping Information Input screen.
 * <br />通関書類作成業務 Invoice Grouping画面のMove to Invoice Detailアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     - "W6007": /W6007Init.do
 *     - "W6008": /W6008Init.do
 *     - "error": W6006
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6006MoveToInvoiceDetailAction extends W6006AbstractAction {
    /**
     * w6006MoveToInvoiceDetailFacadeService
     */
    protected ProcessFacadeService<Void, W6006UpdateDomain> w6006MoveToInvoiceDetailFacadeService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6006MoveToInvoiceDetailAction() {
        super();
    }
     
    /**
     * Setter method for w6006MoveToInvoiceDetailFacadeService.
     *
     * @param moveToInvoiceDetailFacadeService Set for w6006MoveToInvoiceDetailFacadeService
     */
    public void setW6006MoveToInvoiceDetailFacadeService(ProcessFacadeService<Void, W6006UpdateDomain> moveToInvoiceDetailFacadeService) {
        w6006MoveToInvoiceDetailFacadeService = moveToInvoiceDetailFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W6006ActionForm w6006Form = (W6006ActionForm) form;
        // Create a W6006UpdateDomain. 
        // 更新ドメインの設定
        W6006UpdateDomain updateDomain = prepareUpdateDomain(w6006Form);
        
        w6006MoveToInvoiceDetailFacadeService.process(updateDomain);
        
        // Store the ActionForm takeover value. 
        // 引継値の設定
        setParam(w6006Form);
        
        // Invoice Detail画面に遷移
        if (GRP_NO2_MAIN.equals(w6006Form.getGrpNo2())) {
            return SCREEN_ID_W6007;
        } else {
            return SCREEN_ID_W6008;
        }
    }

    /**
     * Create a {@link W6006UpdateDomain}.
     * <br />{@link W6006UpdateDomain}を作成します。
     *
     * @param form Action form of screen<br />
     * 画面のアクションフォーム
     * @return  {@link W6006UpdateDomain} It created. <br />
     * 作成した{@link W6006UpdateDomain}
     */
    protected W6006UpdateDomain prepareUpdateDomain(W6006ActionForm form) {
        W6006UpdateDomain updateDomain = new W6006UpdateDomain();
        W6006CriteriaDomain criteriaDomain = form.getW6006CriteriaDomain();
    

        updateDomain.setW6006CriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
    
    /**
     * Store the ActionForm takeover value.
     * <br />引継値をActionFormに格納します。
     * 
     * @param form Action Form<br />
     * アクションフォーム
     */
    protected void setParam (W6006ActionForm form) {
        W6006CriteriaDomain criteriaDomain = form.getW6006CriteriaDomain();
        int selectedRow = Integer.parseInt(criteriaDomain.getSelected());
        
        W6006ListDomain listDomain = form.getListDomainList().get(selectedRow);
        
        CommonUtil.copyPropertiesDomainToActionForm(form, listDomain);
        form.setShipperCd(criteriaDomain.getShipperCd());
        form.setDateShipped(criteriaDomain.getDateShipped());
    }
}
