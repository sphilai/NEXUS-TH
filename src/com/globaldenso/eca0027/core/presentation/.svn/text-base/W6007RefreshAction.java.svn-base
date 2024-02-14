/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6007UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;

/**
 * Refresh action class of Documentation Invoice Detail screen.
 * <br />通関書類作成業務 Invoice Detail画面のRefreshアクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6007RefreshAction extends W6007AbstractAction {
    /**
     * W6007RefreshFacadeService
     */
    protected SearchFacadeService<W6007UpdateDomain, W6007CriteriaDomain> w6007RefreshFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6007RefreshAction() {
        super();
    }
    
    /**
     * Setter method for w6007RefreshFacadeService.
     *
     * @param refreshFacadeService Set for w6007RefreshFacadeService
     */
    public void setW6007RefreshFacadeService(
        SearchFacadeService<W6007UpdateDomain, W6007CriteriaDomain> refreshFacadeService) {
        w6007RefreshFacadeService = refreshFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * -See the data that matches the criteria specified in the search condition area
     *   To display the search results area when search results of 1 or more
     * </pre>
     * <pre>
     * ‐検索条件エリアで指定した条件に一致するデータを表示する
     *   検索結果が1件以上の場合に検索結果エリアを表示する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W6007ActionForm w6007Form = (W6007ActionForm)form;
        
        W6007CriteriaDomain criteriaDomain = w6007Form.getW6007CriteriaDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, w6007Form.getWindowId(), w6007Form.getScreenId());
        
        W6007UpdateDomain updateDomain = w6007RefreshFacadeService.search(criteriaDomain);
        
        updateDomain.getCriteriaDomain().setShipperCd(criteriaDomain.getShipperCd());
        updateDomain.getCriteriaDomain().setDateShipped(criteriaDomain.getDateShipped());
        updateDomain.getCriteriaDomain().setGrpNo1(criteriaDomain.getGrpNo1());
        updateDomain.getCriteriaDomain().setGrpNo2(criteriaDomain.getGrpNo2());
        updateDomain.getCriteriaDomain().setCustomerCd(criteriaDomain.getCustomerCd());
        updateDomain.getCriteriaDomain().setHiddenDateShipped(criteriaDomain.getDateShipped());
        
        w6007Form.setW6007CriteriaDomain(updateDomain.getCriteriaDomain());
        w6007Form.setListDomainList(updateDomain.getListDomainList());
        
        return FORWARD_SUCCESS;
    }

}
