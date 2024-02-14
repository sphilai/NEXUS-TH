/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9011CgmCusNoXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9012ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service facade implementation class of CIGMA Customer No. X-Reference MA Edit
 * Screen.
 * <br />CIGMA Customer No. X-Reference MA Edit画面の初期処理facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9012InitFacadeServiceImpl extends
     AbstractSearchFacadeService<List<? extends W9012ListDomain> , W9012CriteriaDomain> {

    /**
     * W9011CgmCusNoXRefMaService/w9011CgmCusNoXRefMaサービス
     */
    private W9011CgmCusNoXRefMaService w9011CgmCusNoXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9012InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w9011CgmCusNoXRefMaService.
     *
     * @param cgmCusNoXRefMaService Set for w9011CgmCusNoXRefMaService
     */
    public void setW9011CgmCusNoXRefMaService(W9011CgmCusNoXRefMaService cgmCusNoXRefMaService) {
        w9011CgmCusNoXRefMaService = cgmCusNoXRefMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9012CriteriaDomain filterDomain(W9012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9012CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *     #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to search for the Consignee information.
     * 荷受人情報を検索するサービスを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria.
     * - Get the number of search results.
     *     Call w9011CgmCusNoXRefMaService.searchByCondition with cgmCusNoXRefMaCriteria as an argument.
     * - Create a list of domain(W9012ListDomain), return it.
     *     - Transfer the results of w9011CgmCusNoXRefMaService.searchByCondition to 
     *       the list of W9012ListDomain.
     *     - Return the list of W9012ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteriaに検索条件を移送
     * - 検索件数(1件)の取得
     *       cgmCusNoXRefMaCriteriaを引数にw9011CgmCusNoXRefMaService.searchByConditionの呼び出し
     * - 検索結果リストドメインW9012ListDomainのリストを作成し、返却
     *       - w9011CgmCusNoXRefMaService.searchByConditionの呼び出し結果をW9012ListDomainのリストに移送
     *       - W9012ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W9012ListDomain> callServices(W9012CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria 
            = new W9011CgmCusNoXRefMaCriteriaDomain();
        cgmCusNoXRefMaCriteria.setLgcyLibCompCd(criteriaDomain.getLgcyLibCompCd());
        cgmCusNoXRefMaCriteria.setCustomerCd(criteriaDomain.getCustomerCd());

        // Get the search result.
        List<? extends W9011CgmCusNoXRefMaDomain> resultDomain = w9011CgmCusNoXRefMaService.
            searchByCondition(cgmCusNoXRefMaCriteria);

        // Create a list of domain(W9012ListDomain).
        List<W9012ListDomain> listDomainList = new ArrayList<W9012ListDomain>();

        if (resultDomain != null) {

            for (W9011CgmCusNoXRefMaDomain cgmCusNoXRefMa : resultDomain) {

                W9012ListDomain listDomain = new W9012ListDomain();
                CommonUtil.copyPropertiesDomainToDomain(listDomain, cgmCusNoXRefMa);
                listDomainList.add(listDomain);

            }

        }

        return listDomainList;
    }
}
