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

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2014ConfirmDetailFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * The ConfirmDetail action class of X-tag Main Screen
 * <br />X-tag Main Screen画面のConfirmDetailアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2017Init.do
 *     - "error":W2014.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2014ConfirmDetailAction extends W2014AbstractAction {

    /**
     * ConfirmDetailFacade service
     * <br />ConfirmDetailFacadeサービス
     */
    protected ProcessFacadeService<W2014UpdateDomain, W2014UpdateDomain> w2014ConfirmDetailFacadeService;
    
    /**
     * constructor.
     */
    public W2014ConfirmDetailAction() {
        super();
    }

    /**
     * Setter method for w2014ConfirmDetailFacadeService.
     *
     * @param processFacadeService Set for w2014ConfirmDetailFacadeService
     */
    public void setW2014ConfirmDetailFacadeService(
        ProcessFacadeService<W2014UpdateDomain, W2014UpdateDomain> processFacadeService) {
        w2014ConfirmDetailFacadeService = processFacadeService;
    }
    
    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Create of a mass update domain
     *       {@link W2014UpdateDomain} is generated and the VALUE of {@link W2014ActionForm#getXmainMark()} is set up.
     *
     * - Detailed line selection check
     *       {@link W2014ConfirmDetailFacadeServiceImpl W2014ConfirmDetailFacadeServiceImpl#process (W2014UpdateDomain)} is called and this is detailed line selection check implementation.
     * 
     * 
     * - 一括更新ドメインの作成
     *     {@link W2014UpdateDomain}を生成し、{@link W2014ActionForm#getXmainMark()}の値を設定
     *     
     * - 明細行選択チェック
     *     {@link W2014ConfirmDetailFacadeServiceImpl W2014ConfirmDetailFacadeServiceImpl#process(W2014UpdateDomain)}を呼出し、明細行選択チェック実施
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2014ActionForm w2014Form = (W2014ActionForm) form;
        
        // Create of a mass update domain
        // 一括更新ドメインの作成
        W2014UpdateDomain updateDomain = prepareUpdateDomain(w2014Form);
        
        // Detailed line selection check
        // 明細行選択チェック
        // w2014Form.setXmainMark((w2014ConfirmDetailFacadeService.process(updateDomain).getXmainMark()));
        w2014ConfirmDetailFacadeService.process(updateDomain).getXmainMark();
        
        return FORWARD_SUCCESS;
    }
    /**
     * {@link W2014UpdateDomain} is created.
     * <br />{@link W2014UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Created {@link W2014UpdateDomain}<br />作成した{@link W2014UpdateDomain}
     */
    protected W2014UpdateDomain prepareUpdateDomain(W2014ActionForm form) {
        
        W2014UpdateDomain updateDomain = new W2014UpdateDomain();
        
        updateDomain.setXmainMark(form.getXmainMark());
        
        return updateDomain;
    }
}
