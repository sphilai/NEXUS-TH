/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7001UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of CLP register action for Shipping Actuality Main screen.
 * <br />船積実績Main画面のCLP登録のアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W7001
 * </pre>
 *
 * @author $Author$
 * @version $Revision$
 */
public class W7001ClpRegisterAction extends W7001AbstractAction {

    /**
     * Register Facade service
     * <br />Register Facadeサービス
     */
    protected TransactFacadeService<W7001UpdateDomain, W7001UpdateDomain> w7001ClpRegisterFacadeService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ClpRegisterAction() {
        super();
    }

    /**
     * <p>w7001ClpRegisterFacadeService のセッターメソッドです。</p>
     *
     * @param clpRegisterFacadeService w7001ClpRegisterFacadeService に設定する
     */
    public void setW7001ClpRegisterFacadeService(
        TransactFacadeService<W7001UpdateDomain, W7001UpdateDomain> clpRegisterFacadeService) {
        w7001ClpRegisterFacadeService = clpRegisterFacadeService;
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
     *       Created {@link W7001UpdateDomain} is made into an argument, and {@link W7001ClpRegisterFacadeServiceImpl W7001ClpRegisterFacadeServiceImpl#transact(W7001UpdateDomain)} is called.
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
     *     作成した{@link W7001UpdateDomain}を引数にして、{@link W7001ClpRegisterFacadeServiceImpl W7001ClpRegisterFacadeServiceImpl#transact(W7001UpdateDomain)}を呼出す
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
        
        // Execution of registration processing
        // 登録処理の実行
        W7001UpdateDomain resultDomain = w7001ClpRegisterFacadeService.transact(updateDomain);
        
        addGlobalMessage(request, GSCM_I0_0008, resultDomain.getUpdateCount());
        
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
