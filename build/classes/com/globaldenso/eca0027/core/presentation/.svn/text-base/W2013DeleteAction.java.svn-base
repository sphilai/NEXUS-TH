/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W2013CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2013UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Delete action class of CML PKG Info Detail
 * <br />CML CML PKG Info Detail画面のDeleteアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2013.jsp
 *     - "error":W2013.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6761 $
 */
public class W2013DeleteAction extends W2013AbstractAction {

    /**
     * Delete Facade service
     * <br />Delete Facade サービス
     */
    protected DeleteFacadeService<List<? extends W2013ListDomain>, W2013UpdateDomain> w2013DeleteFacadeService;
    
    /**
     * constructor.
     */
    public W2013DeleteAction() {
        super();
    }

    /**
     * Setter method for W2013DeleteFacadeService.
     * 
     * @param deleteFacadeService Set for W2013DeleteFacadeService
     */
    public void setW2013DeleteFacadeService(
        DeleteFacadeService<List<? extends W2013ListDomain>, W2013UpdateDomain> deleteFacadeService) {
        w2013DeleteFacadeService = deleteFacadeService;
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
     * - Call the DeleteFacadeService.search an argument form.criteriaDomain
     * - Set to form the result of calling DeleteFacadeService.search
     *
     * - form.criteriaDomainを引数にDeleteFacadeService.searchの呼び出し
     * - DeleteFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2013ActionForm w2013Form = (W2013ActionForm) form;
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        W2013UpdateDomain deleteDomain = prepareUpdateDomain(w2013Form);
        
        // Execution of a delete process
        // 削除処理の実行
        List<? extends W2013ListDomain> listDomainList = w2013DeleteFacadeService.delete(deleteDomain);
        
        // Registration of a delete completion message
        // 削除完了メッセージの登録
        addGlobalMessage(request, GSCM_I0_0007, getDeleteCount(deleteDomain.getListDomainList()));
        
        // Setting of a re retrieval result
        // 再検索結果の設定
        setSearchResult(w2013Form, listDomainList);
        
        // Screen fields attributes
        // 画面表示制御
        controlDisplay(request, w2013Form);
        
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
     * - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2013AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName){

        if (FORWARD_ERROR.equals(forwardName)) {
            // Display control
            // 表示制御
            controlDisplay(request, (W2013ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }
    }
    
    /**
     *    {@link W2013UpdateDomain} is created.
     * <br />{@link W2013UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Created {@link W2004UpdateDomain}<br />作成した{@link W2004UpdateDomain}
     */
    protected W2013UpdateDomain prepareUpdateDomain(W2013ActionForm form) {
        
        W2013UpdateDomain updateDomain = new W2013UpdateDomain();
        W2013CriteriaDomain criteria = new W2013CriteriaDomain();
        criteria = form.getW2013CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        ActionUtil.prepareBusinessDomain(criteria, form.getWindowId(), form.getScreenId());
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        updateDomain.setCriteriaDomain(criteria);
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
    
    /**
     *    Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param listDomainList Search results<br />検索結果
     */
    protected void setSearchResult(W2013ActionForm form, List<? extends W2013ListDomain> listDomainList) {
        // A setting of a List domain
        // Listドメインの設定
        form.setListDomainList(listDomainList);
    }
    
    /**
     *    The delete number is acquired.
     * <br />削除件数を取得します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return Delete number<br />削除件数
     */
    protected int getDeleteCount(List<? extends W2013ListDomain> listDomainList) {
        int count = 0;
        for (W2013ListDomain listDomain : listDomainList) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                count++;
            }
        }
        return count;
    }
}
