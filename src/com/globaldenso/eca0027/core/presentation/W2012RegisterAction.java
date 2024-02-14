/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2012UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2012RegisterFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 *    This is a registration action class of a CML Register screen.
 * <br />CML Register画面の登録アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2012.jsp
 *     - "error":W2012.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2012RegisterAction extends W2012AbstractAction {

    /**
     * Compound Facade service
     * <br />複合Facadeサービス
     */
    protected TransactFacadeService<List<? extends W2012ListDomain>, W2012UpdateDomain> w2012RegisterFacadeService;

    /**
     * constructor.
     */
    public W2012RegisterAction() {
        super();
    }

    /**
     * Setter method for w2012RegisterFacadeService.
     * 
     * @param registerFacadeService Set for w2012RegisterFacadeService
     */
    public void setW2012RegisterFacadeService(
        TransactFacadeService<List<? extends W2012ListDomain>, W2012UpdateDomain> registerFacadeService) {
        w2012RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return true;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W2012UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2012CriteriaDomain})  
     *         - List domain ({@link W2012ListDomain})
     *       The following informations are set as {@link W2012CriteriaDomain}.
     *         - Login user ID
     *         - Login user name
     *
     * - Execution of registration processing
     *       Created {@link W2012UpdateDomain} is made into an argument, and {@link W2012RegisterFacadeServiceImpl W2012RegisterFacadeServiceImpl#transact(W2012UpdateDomain)} is called.
     *
     * - Setting of a re retrieval result
     *       The re retrieval result after registration is set as action form.
     *
     * - Screen fields attributes
     *       Set screen field attributes {@link #controlDisplay(HttpServletRequest, W2012ActionForm)}.
     *
     * - 更新ドメインの設定
     *     以下の情報を{@link W2012UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2012CriteriaDomain})
     *       - Listドメイン ({@link W2012ListDomain})
     *     以下の情報を{@link W2012CriteriaDomain}に設定する
     *       - ログインユーザID
     *       - ログインユーザ名
     *       
     * - 登録処理の実行
     *     作成した{@link W2012UpdateDomain}を引数にして、{@link W2012RegisterFacadeServiceImpl W2012RegisterFacadeServiceImpl#transact(W2012UpdateDomain)}を呼出す
     *     
     * - 再検索結果の設定
     *     登録後の再検索結果をアクションフォームに設定する
     *     
     * - 画面表示制御
     *     {@link #controlDisplay(HttpServletRequest, W2012ActionForm)}を呼出し、画面項目の活性制御を行う
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
        W2012ActionForm w2012Form = (W2012ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2012UpdateDomain updateDomain = prepareUpdateDomain(w2012Form);
        
        // Execution of registration processing
        // 登録処理の実行
        List<? extends W2012ListDomain> listDomainList = w2012RegisterFacadeService.transact(updateDomain);
        
        // Registration of a registration completion message
        // 登録完了メッセージの登録
        addGlobalMessage(request, GSCM_I0_0008, 1);
        
        // Setting of search results
        // 検索結果の設定
        w2012Form.setListDomainList(listDomainList);
        w2012Form.setW2012CriteriaDomain(updateDomain.getCriteriaDomain());

        // Screen fields attributes
        // 画面表示制御
        w2012Form.getW2012CriteriaDomain().setFunctionMode(W2009_CML_MODE_REF);
        controlDisplay(request, w2012Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - At the time of the screen re-display at the time of error generation
     *     - Display control of a screen item is performed.
     *
     * - At the time of the screen re-display at the time of no error generation
     * - {@link W2012AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2012AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2009AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplay(request, (W2012ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }

    }
    
    /**
     *    {@link W2012UpdateDomain} is created.
     * <br />{@link W2012UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W2012UpdateDomain}
     */
    protected W2012UpdateDomain prepareUpdateDomain(W2012ActionForm form) {
        W2012UpdateDomain updateDomain = new W2012UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // A setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW2012CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());

        // Acquisition of a screen common information
        // 画面共通情報の取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        updateDomain.getCriteriaDomain().setLoginUserDscId(commonInfo.getLoginUserDscId());
        updateDomain.getCriteriaDomain().setUsrNmEn(commonInfo.getUserName());

        return updateDomain;
    }
}
