/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2011;
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
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2012DeleteFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
*    This is a delete action class of a CML Register screen.
 * <br />CML Register画面の削除アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2012.jsp
 *     - "error":W2012.jsp
 *     - "W2011":/W2011Init.do
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7517 $
 */
public class W2012DeleteAction extends W2012AbstractAction {

    /**
     * Delete Facade service
     * <br />削除 Facadeサービス
     */
    protected TransactFacadeService<List<? extends W2012ListDomain>, W2012UpdateDomain> w2012DeleteFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2012DeleteAction() {
        super();
    }

    /**
     * Setter method for w2012DeleteFacadeService.
     * 
     * @param deleteFacadeService Set for w2012DeleteFacadeService
     */
    public void setW2012DeleteFacadeService(
        TransactFacadeService<List<? extends W2012ListDomain>, W2012UpdateDomain> deleteFacadeService) {
        w2012DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return true;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Create of a mass update domain
     *       {@link W2012UpdateDomain} is created and the following information is set up.
     *         - Screen common information
     *       - {@link W2012CriteriaDomain}
     *       - {@link W2012UpdateDomain}
     *       A DSC-ID is set up about {@link W2012ListDomain}.
     *
     * - Execution of a delete process
     *       {@link W2012DeleteFacadeServiceImpl W2012DeleteFacadeServiceImpl#transact(W2012UpdateDomain)} is called for created {@link W2012UpdateDomain} to an argument.
     *
     *   [When the search number is one or more affairs]
     *
     * - Setting of a re retrieval result
     *       {@link W2012ActionForm#setListDomainList(List)} is called and a re retrieval result is set up.
     *
     * - Screen fields attributes
     *       Set screen field attributes {@link W2012AbstractAction#controlDisplay(HttpServletRequest, W2012ActionForm)}.
     *
     *   [When the search number is zero affair]
     *
     * Change to - Create screen.
     *
     * - 一括更新ドメインの作成
     *     {@link W2012UpdateDomain}を作成し、下記の情報を設定する
     *       - 画面共通情報
     *       - {@link W2012CriteriaDomain}
     *       - {@link W2012UpdateDomain}
     *     {@link W2012ListDomain}については、DSC-IDを設定する
     *     
     * - 削除処理の実行
     *     作成した{@link W2012UpdateDomain}を引数に、{@link W2012DeleteFacadeServiceImpl W2012DeleteFacadeServiceImpl#transact(W2012UpdateDomain)}を呼出す
     *     
     * [検索件数が1件以上の場合]
     * 
     * - 再検索結果の設定
     *     {@link W2012ActionForm#setListDomainList(List)}を呼出し、再検索結果を設定する
     *     
     * - 画面表示制御
     *     {@link W2012AbstractAction#controlDisplay(HttpServletRequest, W2012ActionForm)}を呼出し、画面項目の活性制御を行う
     *     
     * [検索件数が0件の場合]
     * 
     * - Create画面へ遷移
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2012ActionForm W2012Form = (W2012ActionForm) form;
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        W2012UpdateDomain deleteDomain = prepareUpdateDomain(W2012Form);
        
        // Execution of a delete process
        // (re retrieval is performed after delete process and information on criteria is overwritten)
        // 削除処理の実行 
        // (削除処理後、再検索を行い、criteriaの情報を上書き)
        List<? extends W2012ListDomain> listDomainList = w2012DeleteFacadeService.transact(deleteDomain);
        
        // Registration of a delete completion message
        // 削除完了メッセージの登録
        addGlobalMessage(request, GSCM_I0_0007, getDeleteCount(deleteDomain.getListDomainList()));
        
        if (listDomainList == null || listDomainList.size() == 0) {
            // It changes to a Create screen.
            // Create画面へ遷移
            return SCREEN_ID_W2011;
        } else {

            // A setting of warning message
            // 警告メッセージの設定
            saveWarnigMsges(request, mapping, listDomainList, W2012Form.getW2012CriteriaDomain());
            
            // Setting of a re retrieval result
            // 再検索結果の設定
            W2012Form.setListDomainList(listDomainList);
            
            // Screen fields attributes
            // 画面表示制御
            controlDisplay(request, W2012Form);

            return FORWARD_SUCCESS;
        }
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
     *     Setting of a mass update domain
     * <br /> 一括更新ドメインの設定
     * <pre>
     * - From Action Form
     *     {@link W2012ListDomain} and {@link W2012CriteriaDomain} are acquired.
     *     It sets to {@link W2012UpdateDomain}.
     *
     * - アクションFormから 
     *   {@link W2012ListDomain} と {@link W2012CriteriaDomain} を取得し
     *   {@link W2012UpdateDomain} にセットする。
     * </pre>
     *
     * @param form Action form<br />アクションフォーム
     * @return Mass update domain<br />一括更新ドメイン
     */
    protected W2012UpdateDomain prepareUpdateDomain(W2012ActionForm form) {
        
        W2012UpdateDomain updateDomain = new W2012UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        ActionUtil.prepareBusinessDomain(form.getW2012CriteriaDomain(), form.getWindowId(), form.getScreenId());

        // A setting of DSC-ID
        // DSC-IDの設定
        for (W2012ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        updateDomain.setCriteriaDomain(form.getW2012CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
    
    /**
     *    The delete number is acquired.
     * <br />削除件数を取得します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return Delete number<br />削除件数
     */
    protected int getDeleteCount(List<? extends W2012ListDomain> listDomainList) {
        int count = 0;
        for (W2012ListDomain listDomain : listDomainList) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                count++;
            }
        }
        return count;
    }
}
