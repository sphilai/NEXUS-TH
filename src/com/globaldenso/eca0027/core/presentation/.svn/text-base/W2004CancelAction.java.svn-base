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
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2004UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2004CancelFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 * The cancell action class of a Palletize-Instruction Register screen.
 * <br />梱包指示Register画面のキャンセル アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2001Init.do
 *     - "error":W2004.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004CancelAction extends W2004AbstractAction {

    /**
     * Cancel Facade service
     * <br />Cancel Facadeサービス
     */
    protected TransactFacadeService<Void, W2004UpdateDomain> w2004CancelFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2004CancelAction() {
        super();
    }

    /**
     * 
     * Setter method for w2004CancelFacadeService.
     *
     * @param cancelFacadeService Set for w2004CancelFacadeService
     */
    public void setW2004CancelFacadeService(TransactFacadeService<Void, W2004UpdateDomain> cancelFacadeService) {
        w2004CancelFacadeService = cancelFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W2004UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2004CriteriaDomain})  
     *         - List domain ({@link W2004ListDomain})
     *
     * - Execution of cancellation processing
     *       Created {@link W2004UpdateDomain} is made into an argument, and {@link W2004CancelFacadeServiceImpl W2004CancelFacadeServiceImpl#transact(W2004UpdateDomain)} is called.
     *
     * - Registration of a message
     *       A delete completion message is added to {@link ActionMessages}.
     * 
     * - 更新ドメインの設定
     *     以下の情報を{@link W2004UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2004CriteriaDomain})
     *       - Listドメイン ({@link W2004ListDomain})
     * 
     * - キャンセル処理の実行
     *     作成した{@link W2004UpdateDomain}を引数にして、{@link W2004CancelFacadeServiceImpl W2004CancelFacadeServiceImpl#transact(W2004UpdateDomain)}を呼出す
     * 
     * - メッセージの登録
     *     削除完了メッセージを{@link ActionMessages}に追加する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2004ActionForm w2004Form = (W2004ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2004UpdateDomain updateDomain = prepareUpdateDomain(w2004Form);
        
        // Execution of cancellation processing
        // キャンセル処理の実行
        w2004CancelFacadeService.transact(updateDomain);
        
        addGlobalMessage(request, GSCM_I0_0007, 1);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set up an update domain.
     * <br />更新ドメインを設定します。
     *
     * @param form action form<br />アクションフォーム
     * @return search-condition domain<br />検索条件ドメイン
     */
    protected W2004UpdateDomain prepareUpdateDomain(W2004ActionForm form) {
        W2004UpdateDomain updateDomain = new W2004UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // A setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW2004CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
