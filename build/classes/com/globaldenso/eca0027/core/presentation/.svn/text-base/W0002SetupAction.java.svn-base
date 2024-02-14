/*
 * PROJECT：GSCMSample
 * 
 * メニュー画面の初期表示アクション
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W0002ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W0002SetupFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 * Setup action of login screen <br />
 * ログイン画面Setupアクション
 * 
 * @author $Author: 810833843 $
 */
public class W0002SetupAction extends W0002AbstractAction {

    /**
     * Setup facade service of the menu screen <br />
     * メニュー画面のSetup Facadeサービス
     */
    protected UpdateFacadeService<Void, W0002ListDomain> w0002SetupFacadeService;
    
    /**
     * constructor. <br />
     * デフォルトコンストラクタ。
     */
    public W0002SetupAction() {
        super();
    }

    /**
     * Setter method for w0002SetupFacadeService.
     *
     * @param setupFacadeService Set for w0002SetupFacadeService
     */
    public void setW0002SetupFacadeService(
        UpdateFacadeService<Void, W0002ListDomain> setupFacadeService) {
        w0002SetupFacadeService = setupFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - set the list domain 
     *     Set the screen common information to {@link W0002ListDomain}
     * 
     * - Execute of the update process
     *     Call {@link W0002SetupFacadeServiceImpl W0002SetupFacadeServiceImpl#update(W0002ListDomain)} with the argument {@link W0002ListDomain}
     * 
     * - transition to the menu screen
     *     in order to perform the processing corresponding to login, screen transitions to the menu screen occurs.
     * 
     * - Listドメインの設定
     *     {@link W0002ListDomain}に画面共通情報を設定する
     *     
     * - 更新処理の実行
     *     {@link W0002ListDomain}を引数に{@link W0002SetupFacadeServiceImpl W0002SetupFacadeServiceImpl#update(W0002ListDomain)}を呼び出す
     *     
     * - メニュー画面へ遷移
     *     ログイン時相当の処理を行うために、メニュー画面に遷移する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W0002ActionForm w0002Form = (W0002ActionForm) form;

        W0002ListDomain listDomain = prepareListDomain(w0002Form);
        
        w0002SetupFacadeService.update(listDomain);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Set the list domain
     * <br />リストドメインを設定します。
     *
     * @param form action form 
     * @return list domain 
     */
    protected W0002ListDomain prepareListDomain(W0002ActionForm form) {
        
        W0002ListDomain listDomain = form.getListDomain();
        
        String charCd = form.getListDomain().getCharCd();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(listDomain, form.getWindowId(), form.getScreenId());
        
        form.getListDomain().setCharCd(charCd);
        
        return listDomain;
    }
}
