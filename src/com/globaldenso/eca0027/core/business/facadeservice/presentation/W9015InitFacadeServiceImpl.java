/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9015CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9015ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9014CgmWhXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service facade implementation class of CIGMA W/H X-Reference MA Edit
 * Screen.
 * <br />CIGMA W/H X-Reference MA Edit画面の初期処理facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9015InitFacadeServiceImpl extends
     AbstractSearchFacadeService<List<? extends W9015ListDomain> , W9015CriteriaDomain> {

    /**
     * w9014CgmWhXRefMaService/w9014CgmWhXRefMaサービス
     */
    private W9014CgmWhXRefMaService w9014CgmWhXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9015InitFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for w9014CgmWhXRefMaService.</p>
     *
     * @param cgmWhXRefMaService Set for w9014CgmWhXRefMaService
     */
    public void setW9014CgmWhXRefMaService(W9014CgmWhXRefMaService cgmWhXRefMaService) {
        w9014CgmWhXRefMaService = cgmWhXRefMaService;
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
    protected W9015CriteriaDomain filterDomain(W9015CriteriaDomain w9015CriteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return w9015CriteriaDomain;
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
    protected void validateItems(W9015CriteriaDomain w9015CriteriaDomain) 
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
    protected void validateConsistency(W9015CriteriaDomain w9015CriteriaDomain)
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
    protected void validateDatabase(W9015CriteriaDomain w9015CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to search for the W/H information.
     * 倉庫情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria.
     * - Get the number of search results.
     *     Call w9014CgmWhXRefMaService.searchByCondition with w9014CgmWhXRefMaCriteria as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaに検索条件を移送
     * - 検索件数(1件)の取得
     *       w9014CgmWhXRefMaCriteriaを引数にw9014CgmWhXRefMaService.searchByConditionの呼び出し
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(
     *      com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W9015ListDomain> callServices(W9015CriteriaDomain w9015CriteriaDomain) 
        throws GscmApplicationException,
            ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria = new W9014CgmWhXRefMaCriteriaDomain();
        w9014CgmWhXRefMaCriteria.setLgcyLibCompCd(w9015CriteriaDomain.getLgcyLibCompCd());
        w9014CgmWhXRefMaCriteria.setLgcyWhCd(w9015CriteriaDomain.getLgcyWhCd());
        w9014CgmWhXRefMaCriteria.setPlntCd(w9015CriteriaDomain.getPlntCd());

        // Get the search result.
        List<? extends W9014CgmWhXRefMaDomain> w9014CgmWhXRefMaDomainList = w9014CgmWhXRefMaService.
            searchByCondition(w9014CgmWhXRefMaCriteria);

        // Create a list of domain(W9012ListDomain).
        List<W9015ListDomain> w9015ListDomainList = new ArrayList<W9015ListDomain>();
        if (w9014CgmWhXRefMaDomainList != null) {


            for (W9014CgmWhXRefMaDomain w9014CgmWhXRefMa : w9014CgmWhXRefMaDomainList) {
                W9015ListDomain w9015ListDomain = new W9015ListDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(w9015ListDomain, w9014CgmWhXRefMa);
                
                w9015ListDomainList.add(w9015ListDomain);
            }

        }

        return w9015ListDomainList;
    }


}
