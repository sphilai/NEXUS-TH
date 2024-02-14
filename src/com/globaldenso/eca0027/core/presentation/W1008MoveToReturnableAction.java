/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W2012UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

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
public class W1008MoveToReturnableAction extends W1008AbstractAction {

    /**
     * MoveToReturnable Facade service
     */
    protected TransactFacadeService<Void, W1008UpdateDomain> w1008MoveToReturnableFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1008MoveToReturnableAction() {
        super();
    }
    /**
     * <p>Setter method for w1008MoveToReturnableFacadeService.</p>
     *
     * @param moveToReturnableFacadeService Set for w1008MoveToReturnableFacadeService
     */
    public void setW1008MoveToReturnableFacadeService(
        TransactFacadeService<Void, W1008UpdateDomain> moveToReturnableFacadeService) {
        w1008MoveToReturnableFacadeService = moveToReturnableFacadeService;
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        // A setting of mass update domain
        // 一括更新ドメインの設定
        W1008ActionForm w1008Form = (W1008ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W1008UpdateDomain updateDomain = prepareUpdateDomain(w1008Form);
        
        // Execution of processing
        // 処理の実行
        w1008MoveToReturnableFacadeService.transact(updateDomain);
        
        // Screen taking over item
        // 画面引継ぎ項目
        request.setAttribute("mainMark", w1008Form.getW1008CriteriaDomain().getMainMark());
        if(w1008Form.getW1008CriteriaDomain().getLengthUnit() == null || w1008Form.getW1008CriteriaDomain().getLengthUnit().trim().length() == 0)
        {
            w1008Form.getW1008CriteriaDomain().setLengthUnit(w1008Form.getW1008CriteriaDomain().getLengthUnitHeader());
        }
        
        
        return FORWARD_SUCCESS;
    }

   
    
    /**
     *    {@link W2012UpdateDomain} is created.
     * <br />{@link W2012UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W2012UpdateDomain}
     */
    protected W1008UpdateDomain prepareUpdateDomain(W1008ActionForm form) {
        W1008UpdateDomain updateDomain = new W1008UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // A setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW1008CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());

        // Acquisition of a screen common information
        // 画面共通情報の取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        updateDomain.getCriteriaDomain().setLoginUserDscId(commonInfo.getLoginUserDscId());

        return updateDomain;
    }
}
