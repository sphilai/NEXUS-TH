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
import com.globaldenso.eca0027.core.business.domain.W2001ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2001ConfirmDetailFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * Confirm Detail action class of a Palletize-Instruction Main screen.
 * <br />梱包指示Main画面のConfirm Detailアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2001.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2001ConfirmDetailAction extends W2001AbstractAction {

    /**
     * ConfirmDetail Facade service
     * <br />ConfirmDetail Facadeサービス
     */
    protected ProcessFacadeService<Void, W2001ListDomain> w2001ConfirmDetailFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2001ConfirmDetailAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * Setter method for w2001ConfirmDetailFacadeService.
     *
     * @param confirmDetailFacadeService Set for w2001ConfirmDetailFacadeService
     */
    public void setW2001ConfirmDetailFacadeService(
        ProcessFacadeService<Void, W2001ListDomain> confirmDetailFacadeService) {
        w2001ConfirmDetailFacadeService = confirmDetailFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create List domain
     *       {@link W2001ListDomain} is generated and the VALUE of {@link W2001ActionForm#getPltzInstrNo()} is set up.
     *
     * - Detailed line selection check
     *       {@link W2001ConfirmDetailFacadeServiceImpl W2001ConfirmDetailFacadeServiceImpl#process(W2001ListDomain)} is called and a detailed line selection check is performed.
     * 
     *
     * - Listドメインの作成
     *     {@link W2001ListDomain}を生成し、{@link W2001ActionForm#getPltzInstrNo()}の値を設定する
     *     
     * - 明細行選択チェック
     *     {@link W2001ConfirmDetailFacadeServiceImpl W2001ConfirmDetailFacadeServiceImpl#process(W2001ListDomain)}を呼出し、明細行選択チェックを行う
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2001ActionForm w2001Form = (W2001ActionForm) form;
        
        // Create List domain
        // Listドメインの作成
        W2001ListDomain listDomain = prepareListDomain(w2001Form);
        
        // Detailed line selection check
        // 明細行選択チェック
        w2001ConfirmDetailFacadeService.process(listDomain);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Create {@link W2001ListDomain}.
     * <br />{@link W2001ListDomain}を作成します。
     *
     * @param form action form<br />アクションフォーム
     * @return {@link W2001ListDomain} which carried out <br />作成した{@link W2001ListDomain}
     */
    protected W2001ListDomain prepareListDomain(W2001ActionForm form) {
        W2001ListDomain listDomain = new W2001ListDomain();
        
        listDomain.setPltzInstrNo(form.getPltzInstrNo());
        
        return listDomain;
    }
}
