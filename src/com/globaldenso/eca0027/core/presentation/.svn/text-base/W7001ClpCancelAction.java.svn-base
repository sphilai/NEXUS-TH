/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_I1_0001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7001UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7001ClpCancelFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of CLP cancel action for Shipping Actuality Main screen.
 * <br />船積実績Main画面のCLPキャンセルアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W7001
 * </pre>
 *
 * @author $Author$
 * @version $Revision$
 */
public class W7001ClpCancelAction extends W7001AbstractAction {

    /**
     * Cancel Facade service
     * <br />Cancel Facadeサービス
     */
    protected TransactFacadeService<Void, W7001UpdateDomain> w7001ClpCancelFacadeService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ClpCancelAction() {
        super();
    }

    /**
     * <p>w7001ClpCancelFacadeService のセッターメソッドです。</p>
     *
     * @param clpCancelFacadeService w7001ClpCancelFacadeService に設定する
     */
    public void setW7001ClpCancelFacadeService(
        TransactFacadeService<Void, W7001UpdateDomain> clpCancelFacadeService) {
        w7001ClpCancelFacadeService = clpCancelFacadeService;
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
     *       The following informations are set as {@link W7001UpdateDomain}.
     *         - Screen common information
     *         - List domain ({@link W7001ListDomain})
     *
     * - Execution of cancellation processing
     *       Created {@link W7001UpdateDomain} is made into an argument, and {@link W7001ClpCancelFacadeServiceImpl W7001ClpCancelFacadeServiceImpl#transact(W7001UpdateDomain)} is called.
     *
     * - Registration of a message
     *       A delete completion message is added to {@link ActionMessages}.
     * 
     * - 更新ドメインの設定
     *     以下の情報を{@link W7001UpdateDomain}に設定する
     *       - 画面共通情報
     *       - Listドメイン ({@link W7001ListDomain})
     * 
     * - キャンセル処理の実行
     *     作成した{@link W7001UpdateDomain}を引数にして、{@link W7001CancelFacadeServiceImpl W7001CancelFacadeServiceImpl#transact(W7001UpdateDomain)}を呼出す
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

        W7001ActionForm w7001Form = (W7001ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W7001UpdateDomain updateDomain = prepareUpdateDomain(w7001Form);
        
        // Execution of cancellation processing
        // キャンセル処理の実行
        w7001ClpCancelFacadeService.transact(updateDomain);
        
        addGlobalMessage(request, NXS_I1_0001, 1);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set up an update domain.
     * <br />更新ドメインを設定します。
     *
     * @param form action form<br />アクションフォーム
     * @return search-condition domain<br />検索条件ドメイン
     */
    protected W7001UpdateDomain prepareUpdateDomain(W7001ActionForm form) {
        W7001UpdateDomain updateDomain = new W7001UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // A setting of List domain
        // Listドメインの設定
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }

}
