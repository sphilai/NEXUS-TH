/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9010ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9009CgmShipToXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The init service facade implementation class of CIGMA Ship to 
 * X-Reference MA Edit Screen. 
 * <br />CIGMA Ship to X-Reference MA Edit画面の初期処理facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9010InitFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W9010ListDomain>, W9010CriteriaDomain> {

    /**
     * w9009CgmShipToXRefMaService/cgmShipToXRefMaサービス
     */
    protected W9009CgmShipToXRefMaService w9009CgmShipToXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9010InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w9009CgmShipToXRefMaService.
     *
     * @param shipToXRefMaService Set for w9009CgmShipToXRefMaService
     */
    public void setW9009CgmShipToXRefMaService(W9009CgmShipToXRefMaService shipToXRefMaService) {
        w9009CgmShipToXRefMaService = shipToXRefMaService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService
     *      #filterDomain(com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected W9010CriteriaDomain filterDomain(W9010CriteriaDomain criteriaDomain) 
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
    protected void validateItems(W9010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService
     *      #databaseCheck(com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to register for the CIGMA Ship to 
     * X-Reference MA Edit information.
     * CIGMA Ship to X-Reference MA Edit情報を検索するサービスを呼び出します。
     *
     * - Transfer your Register criteria.
     *     Transfer your Register criteria from criteriaDomain to 
     *     W9009CgmShipToXRefMaCriteriaDomain cgmShipToXRefMaCriteria.
     * - Get the register results.
     *     Call w9009CgmShipToXRefMaService.searchByCondition with 
     *     cgmShipToXRefMaCriteria as an argument.
     * - Create a list of domain(W9010ListDomain), return it.
     *     - Transfer the results of w9009CgmShipToXRefMaService.searchByCondition to 
     *       the list of W9010ListDomain.
     *     - Return the list of W9010ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9009CgmShipToXRefMaCriteriaDomain cgmShipToXRefMaCriteriaに検索条件を移送
     * - 検索結果の取得
     *       cgmShipToXRefMaCriteriaを引数にw9009CgmShipToXRefMaService.searchByConditionの呼び出し
     * - 検索結果リストドメインW9010ListDomainのリストを作成し、返却
     *       - w9009CgmShipToXRefMaService.searchByConditionの呼び出し結果をW9010ListDomainのリストに移送
     *       - W9010ListDomainのリストを返却
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W9010ListDomain> callServices(W9010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        W9009CgmShipToXRefMaCriteriaDomain cgmShipToXRefMaCriteria 
            = new W9009CgmShipToXRefMaCriteriaDomain();
        cgmShipToXRefMaCriteria.setLgcyLibCompCd(criteriaDomain.getLgcyLibCompCd());
        cgmShipToXRefMaCriteria.setCustomerCd(criteriaDomain.getCustomerCd());
        cgmShipToXRefMaCriteria.setLgcyShipTo(criteriaDomain.getLgcyShipTo());
        
        // Get the search result.
        List<? extends W9009CgmShipToXRefMaDomain> resultDomain = w9009CgmShipToXRefMaService.
        searchByCondition(cgmShipToXRefMaCriteria);

        // Create a list of domain(W9010ListDomain).
        List<W9010ListDomain> listDomainList = new ArrayList<W9010ListDomain>();

        if (resultDomain != null) {

            for (W9009CgmShipToXRefMaDomain cgmShipToXRefMa : resultDomain) {

                W9010ListDomain listDomain = new W9010ListDomain();
                CommonUtil.copyPropertiesDomainToDomain(listDomain, cgmShipToXRefMa);
                listDomainList.add(listDomain);

            }
        }

        return listDomainList;
    }
}
