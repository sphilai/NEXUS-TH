/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2008UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2008CancelFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Cancel action class of Multiple Item No. in 1Box PKG Register Screen
 * <br />小箱内多品番Register画面のCancelアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2005Init.do
 *     - "error":W2008.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6756 $
 */
public class W2008CancelAction extends W2008AbstractAction {

    /**
     * CancelFacade service
     * <br />CancelFacadeサービス
     */
    protected TransactFacadeService<Void, W2008UpdateDomain> w2008CancelFacadeService;
    
    /**
     * constructor.
     */
    public W2008CancelAction() {
        super();
    }

    /**
     * Setter method for w2008CancelFacadeService.
     *
     * @param transactFacadeService Set for w2008CancelFacadeService
     */
    public void setW2008CancelFacadeService(
        TransactFacadeService<Void, W2008UpdateDomain> transactFacadeService) {
        w2008CancelFacadeService = transactFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W2008UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2008CriteriaDomain})  
     *         - List domain ({@link W2008ListDomain})
     *
     * - Execution of cancellation processing
     *       Created {@link W2008UpdateDomain} is made into an argument, and {@link W2008CancelFacadeServiceImpl W2008CancelFacadeServiceImpl#transact (W2008UpdateDomain)} is called.
     * 
     * 
     * - 更新ドメインの設定
     *     以下の情報を{@link W2008UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2008CriteriaDomain})
     *       - Listドメイン ({@link W2008ListDomain})
     * 
     * - キャンセル処理の実行
     *     作成した{@link W2008UpdateDomain}を引数にして、{@link W2008CancelFacadeServiceImpl W2008CancelFacadeServiceImpl#transact(W2008UpdateDomain)}を呼出す
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2008ActionForm w2008Form = (W2008ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2008UpdateDomain updateDomain = prepareUpdateDomain(w2008Form);
        // Execution of cancellation processing
        // キャンセル処理の実行
        w2008CancelFacadeService.transact(updateDomain);
        
        addGlobalMessage(request, GSCM_I0_0007, 1);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    An update domain is set up.
     * <br />更新ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2008UpdateDomain prepareUpdateDomain(W2008ActionForm form) {
        W2008UpdateDomain updateDomain = new W2008UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW2008CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
