/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6004ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * Move to Shipping Information Input action class of Documentation Invoice Data Create screen.
 * <br />通関書類作成業務 Invoice Data Create画面のMove to Shipping Information Inputアクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6004MoveToShippingInformationInputAction extends W6004AbstractAction {
    /**
     * W6004MoveToShippingInformationInputService
     */
    protected ProcessFacadeService<Void, W6004CriteriaDomain> w6004MoveToShippingInformationInputFacadeService;

    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6004MoveToShippingInformationInputAction() {
        super();
    }

    /**
     * Setter method for w6004MoveToShippingInformationInputFacadeService.
     *
     * @param moveToShippingInformationInputFacadeService Set for w6004MoveToShippingInformationInputFacadeService
     */
    public void setW6004MoveToShippingInformationInputFacadeService(
        ProcessFacadeService<Void, W6004CriteriaDomain> moveToShippingInformationInputFacadeService) {
        w6004MoveToShippingInformationInputFacadeService = moveToShippingInformationInputFacadeService;
    }


    /**
     * {@inheritDoc}
     * <pre>
     * Check for the presence of Invoide Palletize Work
     * </pre>
     * <pre>
     * インボイス作成対象パレタイズワークの存在をチェック
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        // Acquisition of form 
        // フォームの取得
        W6004ActionForm w6004Form = (W6004ActionForm) form;

        // Acquisition of CriteriaDomain 
        // CriteriaDomainの取得
        W6004CriteriaDomain criteriaDomain = w6004Form.getCriteriaDomain();

        // Invoide Palletize Work existence check 
        // インボイス作成対象パレタイズワークの存在チェック
        w6004MoveToShippingInformationInputFacadeService.process(criteriaDomain);
        
        // Value is inherited to the screen of a changes place. 
        // 遷移先の画面に値を引き継ぐ
        for (int i = 0; i < w6004Form.getListDomainList().size(); i++) {
            W6004ListDomain domain = w6004Form.getListDomainList().get(i);
            if (CHECK_ON.equals(domain.getSelected())) {
                w6004Form.setContainerSortingKey(domain.getContainerSortingKey());
                break;
            }
        }
                
        return FORWARD_SUCCESS;
    }    
}
