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

import com.globaldenso.eca0027.core.business.domain.W1010UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Move To Register action class of a Packaging Instruction (=Pull) Header screen.
 * <br />梱包指示Header画面のMove To Createアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W1007Init.do
 *     - "error":W1010.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1010MoveToPackagingAction extends W1010AbstractAction {

    /**
     * Edit Facade Service
     * <br />Edit Facadeサービス
     */
    protected ProcessFacadeService<W1010UpdateDomain, W1010UpdateDomain> W1010MoveToPackagingFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1010MoveToPackagingAction() {
        super();
    }

    /**
     * <p>Getter method for w1010MoveToPackagingFacadeService.</p>
     *
     * @return the w1010MoveToPackagingFacadeService
     */
    public ProcessFacadeService<W1010UpdateDomain, W1010UpdateDomain> getW1010MoveToPackagingFacadeService() {
        return W1010MoveToPackagingFacadeService;
    }



    /**
     * <p>Setter method for w1010MoveToPackagingFacadeService.</p>
     *
     * @param moveToPackagingFacadeService Set for w1010MoveToPackagingFacadeService
     */
    public void setW1010MoveToPackagingFacadeService(
        ProcessFacadeService<W1010UpdateDomain, W1010UpdateDomain> moveToPackagingFacadeService) {
        W1010MoveToPackagingFacadeService = moveToPackagingFacadeService;
    }





    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check
     *     Call the {@link W1010MoveToPackagingFacadeServiceImpl}, Line item selection check
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W1010MoveToPackagingFacadeService}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1010ActionForm W1010Form = (W1010ActionForm) form;

        // Check selected List Item.
        W1010UpdateDomain updateDomain = prepareUpdateDomain(W1010Form);
        W1010UpdateDomain resultDomain = W1010MoveToPackagingFacadeService.process(updateDomain);

        W1010Form.setW1010CriteriaDomain(resultDomain.getCriteriaDomain());
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W1010UpdateDomain}.
     * <br />{@link W1010UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W1010UpdateDomain} It created <br />作成した{@link W1010UpdateDomain}
     */
    protected W1010UpdateDomain prepareUpdateDomain(W1010ActionForm form) {
        
        W1010UpdateDomain updateDomain = new W1010UpdateDomain();
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW1010CriteriaDomain());
        
        return updateDomain;
    }
    
    
}
