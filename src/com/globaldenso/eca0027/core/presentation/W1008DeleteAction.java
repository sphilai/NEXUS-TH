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

import com.globaldenso.eca0027.core.business.domain.W1008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 *    This is a delete action class of action Export Packaging Register screen.
 * <br />梱包指示Main画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1008.jsp
 *     - "error":W1008.jsp
 * </pre>
 * 
 * @author $Author: DCS $
 * @version $Revision: 6750 $
 */
public class W1008DeleteAction extends W1008AbstractAction {

    /**
     * RegisterFacade service
     * <br />RegisterFacadeサービス
     */
    protected TransactFacadeService<W1008UpdateDomain, W1008UpdateDomain> w1008DeleteFacadeService;
    
    /**
     * constructor.
     */
    public W1008DeleteAction() {
        super();
    }

    /**
     * <p>Setter method for w1008DeleteFacadeService.</p>
     *
     * @param deleteFacadeService Set for w1008DeleteFacadeService
     */
    public void setW1008DeleteFacadeService(
        TransactFacadeService<W1008UpdateDomain, W1008UpdateDomain> deleteFacadeService) {
        w1008DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        // Setting of mass delete domain
        // 一括更新ドメインの設定
        W1008ActionForm W1008Form = (W1008ActionForm) form;
        // Setting of an update domain
        // 更新ドメインの設定
        W1008UpdateDomain updateDomain = prepareUpdateDomain(W1008Form);
        // Search count to delete
        // 登録処理の実行
        int delCount = getDeleteCount(updateDomain);
        // Delete
        W1008UpdateDomain resultDomain = w1008DeleteFacadeService.transact(updateDomain);
        
        W1008Form.setW1008CriteriaDomain(resultDomain.getCriteriaDomain());
        // Setting of search results
        // 検索結果の設定
        W1008Form.setListDomainList(resultDomain.getListDomainList());
        
        if(W1008Form.getListDomainList() == null || W1008Form.getListDomainList().size() == 0)
        {
            W1008Form.setCountPerPage(1);
            if(Integer.parseInt(W1008Form.getCurrentPageNo()) - 1 < 1)
            {
                W1008Form.setCurrentPageNo("1");
            }else{
                W1008Form.setCurrentPageNo(String.valueOf(Integer.parseInt(W1008Form.getCurrentPageNo()) - 1) );
            }
            addGlobalMessage(request, GSCM_I0_0007, delCount);
            return "back";
        }
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0007, delCount);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link W1008UpdateDomain} is created.
     * <br />{@link W1008UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W1008UpdateDomain}
     */
    protected W1008UpdateDomain prepareUpdateDomain(W1008ActionForm form) {
        W1008UpdateDomain updateDomain = new W1008UpdateDomain();
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        // Setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW1008CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
    /**
     * 
     * Get delete count
     * <br />更新件数を取得する。
     * 
     * @param updateDomain Update domain<br />Updateドメイン
     * @return Delete count<br />更新件数
     */
    protected int getDeleteCount(W1008UpdateDomain updateDomain) {
        int count = 0;
        if (updateDomain.getListDomainList() != null) {
            for (W1008ListDomain listDomain : updateDomain.getListDomainList()) {
                if (!CheckUtil.isBlankOrNull(listDomain.getSelected())) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
