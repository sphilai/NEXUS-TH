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

import com.globaldenso.eca0027.core.business.domain.W1006UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Move To Register action class of a Packaging Instruction (=Pull) Header screen.
 * <br />梱包指示Header画面のMove To Createアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W1006Init.do
 *     - "error":W1001.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1006MoveToPackagingAction extends W1006AbstractAction {

    /**
     * Edit Facade Service
     * <br />Edit Facadeサービス
     */
    protected ProcessFacadeService<W1006UpdateDomain, W1006UpdateDomain> W1006MoveToPackagingFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1006MoveToPackagingAction() {
        super();
    }

   

    /**
     * <p>Setter method for W1006MoveToPackagingFacadeService.</p>
     *
     * @param moveToPackagingFacadeService Set for W1006MoveToPackagingFacadeService
     */
    public void setW1006MoveToPackagingFacadeService(
        ProcessFacadeService<W1006UpdateDomain, W1006UpdateDomain> moveToPackagingFacadeService) {
        W1006MoveToPackagingFacadeService = moveToPackagingFacadeService;
    }



    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check
     *     Call the {@link W1006EditFacadeServiceImpl}, Line item selection check
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W1006EditFacadeServiceImpl}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1006ActionForm W1006Form = (W1006ActionForm) form;

        // Check selected List Item.
        W1006UpdateDomain updateDomain = prepareUpdateDomain(W1006Form);
        W1006UpdateDomain resultDomain = W1006MoveToPackagingFacadeService.process(updateDomain);

        W1006Form.setW1006CriteriaDomain(resultDomain.getCriteriaDomain());
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W1006UpdateDomain}.
     * <br />{@link W1006UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W1006UpdateDomain} It created <br />作成した{@link W1006UpdateDomain}
     */
    protected W1006UpdateDomain prepareUpdateDomain(W1006ActionForm form) {
        
        W1006UpdateDomain updateDomain = new W1006UpdateDomain();
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW1006CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
