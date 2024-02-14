/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2002CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is an initial display action class of a Packaging Instruction (=Pull) Header screen.
 * <br />梱包指示Header画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2002.jsp
 *     - "error":W2002.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2002InitAction extends W2002AbstractAction {

    /**
     * Initial display Facade service
     * <br />初期表示Facadeサービス
     */
    protected DeleteFacadeService<Void, W2002CriteriaDomain> w2002InitFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2002InitAction() {
        super();
    }
    
    /**
     * Setter method for w2002InitFacadeService.
     *
     * @param initFacadeService Set for w2002InitFacadeService
     */
    public void setW2002InitFacadeService(
        DeleteFacadeService<Void, W2002CriteriaDomain> initFacadeService) {
        w2002InitFacadeService = initFacadeService;
    }

    
    /**
     * {@inheritDoc}
     * <pre>
     * A delete of - Palletize Instruction Item No Work
     *       The Palletize Instruction Item No Work which the user registered is deleted.
     * 
     * 
     * - 梱包指示品目番号ワークの削除
     *     ユーザが登録した梱包指示品目番号ワークを削除する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W2002ActionForm w2002Form = (W2002ActionForm) form;
        
        // delete of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの削除
        removePltzInstrItemNo(w2002Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     *    A Palletize Instruction Item No Work is deleted.
     * <br />梱包指示品目番号ワークを削除します。
     * 
     * @param form Action form<br />アクションフォーム
     * @throws ApplicationException When a Palletize Instruction Item No Work is not able to be deleted<br />梱包指示品目番号ワークが削除できなかった場合
     */
    protected void removePltzInstrItemNo(W2002ActionForm form) throws ApplicationException {
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2002CriteriaDomain criteriaDomain = form.getW2002CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // delete of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの削除
        w2002InitFacadeService.delete(criteriaDomain);
    }
}
