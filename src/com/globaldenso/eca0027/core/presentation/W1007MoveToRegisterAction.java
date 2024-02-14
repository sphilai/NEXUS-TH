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

import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Move To Register action class of a Packaging Instruction (=Pull) Header screen.
 * <br />梱包指示Header画面のMove To Createアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W1006Init.do
 *     - "error":W1007.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1007MoveToRegisterAction extends W1007AbstractAction {

    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1007MoveToRegisterAction() {
        super();
    }

   


    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check
     *     Call the {@link W1007EditFacadeServiceImpl}, Line item selection check
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W1007EditFacadeServiceImpl}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1007ActionForm W1007Form = (W1007ActionForm) form;

        // Check selected List Item.
        W1007UpdateDomain updateDomain = prepareUpdateDomain(W1007Form);

        W1007Form.setW1007CriteriaDomain(updateDomain.getCriteriaDomain());
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W1007UpdateDomain}.
     * <br />{@link W1007UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W1007UpdateDomain} It created <br />作成した{@link W1007UpdateDomain}
     */
    protected W1007UpdateDomain prepareUpdateDomain(W1007ActionForm form) {
        
        W1007UpdateDomain updateDomain = new W1007UpdateDomain();
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW1007CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
