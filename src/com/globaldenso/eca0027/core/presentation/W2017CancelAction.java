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
import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2017ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2017UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2017CancelFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Cancel action class of X-tag Register
 * <br />X-tag Register画面のCancelアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2014Init.do
 *     - "error":W2017.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2017CancelAction extends W2017AbstractAction {

    /**
     * CancelFacade service
     * <br />CancelFacadeサービス
     */
    protected TransactFacadeService<Void, W2017UpdateDomain> w2017CancelFacadeService;
    
    /**
     * constructor.
     */
    public W2017CancelAction() {
        super();
    }

    /**
     * Setter method for w2017CancelFacadeService.
     *
     * @param cancelFacadeService Set for cancelFacadeService
     */
    public void setW2017CancelFacadeService(
        TransactFacadeService<Void, W2017UpdateDomain> cancelFacadeService) {
        w2017CancelFacadeService = cancelFacadeService;
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
     * - Setting of an update domain
     *       The following informations are set as {@link W2017UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2017CriteriaDomain})  
     *         - List domain ({@link W2017ListDomain})
     *
     * - Execution of cancellation processing
     *       Created {@link W2017UpdateDomain} is made into an argument, and {@link W2017CancelFacadeServiceImpl W2017CancelFacadeServiceImpl#transact (W2017UpdateDomain)} is called.
     * 
     * 
     * - 更新ドメインの設定
     *     以下の情報を{@link W2017UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2017CriteriaDomain})
     *       - Listドメイン ({@link W2017ListDomain})
     * 
     * - キャンセル処理の実行
     *     作成した{@link W2017UpdateDomain}を引数にして、{@link W2017CancelFacadeServiceImpl W2017CancelFacadeServiceImpl#transact(W2017UpdateDomain)}を呼出す
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2017ActionForm w2017Form = (W2017ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2017UpdateDomain updateDomain = prepareUpdateDomain(w2017Form);
        int deleteCount = 0;
        if (w2017Form.getW2017ListDomainList() != null) {
            deleteCount = w2017Form.getW2017ListDomainList().size();
        }
        // Execution of cancellation processing
        // キャンセル処理の実行
        w2017CancelFacadeService.transact(updateDomain);
        // Registration of a delete message
        // 削除メッセージの登録
        addGlobalMessage(request, GSCM_I0_0007, deleteCount);
        return FORWARD_SUCCESS;
    }
    
    /**
     *    An update domain is set up.
     * <br />更新ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2017UpdateDomain prepareUpdateDomain(W2017ActionForm form) {
        W2017UpdateDomain updateDomain = new W2017UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW2017CriteriaDomain());
        updateDomain.setListDomainList(form.getW2017ListDomainList());
        
        return updateDomain;
    }
}
