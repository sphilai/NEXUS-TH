/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt005CmlInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt005CmlInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service implementation class of CML Info Sub Screen.
 * <br />CML情報表示子画面のService実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt005CmlInfoServiceImpl implements Wt005CmlInfoService {

    /**
     * ttPltzService
     */
    private TtPltzService ttPltzService;

    /**
     * Default constructor.
     */
    public Wt005CmlInfoServiceImpl() {
    }

    /**
     * <p>Setter method for ttPltzService.</p>
     *
     * @param ttPltzService Set for ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search for the CML information.
     * CML情報の検索結果を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to TtPltzCriteriaDomain tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call ttPltzService.searchByConditionForPaging 
     *     with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt005CmlInfoDomain), return it.
     *     - Transfer the results of Wt005CmlInfoService.searchByConditionForPaging
     *      to the list of Wt005CmlInfoDomain.
     *     - Return the list of Wt005CmlInfoDomain.
     *
     * - 検索条件の移送
     *       criteriaDomainよりTtPltzCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にttPltzService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWt005CmlInfoDomainのリストを作成し、返却
     *       - ttPltzService.searchByConditionForPagingの呼び出し結果を
     *         Wt005CmlInfoDomainのリストに移送
     *       - Wt005CmlInfoDomainのリストを返却
     * </pre>
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#searchByConditionForPaging 
     * (com.globaldenso.eca0027.core.auto.business.domain.TtPltzCriteriaDomain)
     */
    public ArrayList<Wt005CmlInfoDomain> searchByCondition(
        Wt005CmlInfoCriteriaDomain criteria)
        throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TtPltzCriteriaDomain tableCriteriaDomain = new TtPltzCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);
        

        // Call search service.
        List<TtPltzDomain> tableResultDomainList = 
            ttPltzService.searchByCondition(tableCriteriaDomain);

        ArrayList<Wt005CmlInfoDomain> listDomainList = new ArrayList<Wt005CmlInfoDomain>();
        if (tableResultDomainList != null) {
            
            for (TtPltzDomain resultDomain : tableResultDomainList) {
                Wt005CmlInfoDomain listDomain = new Wt005CmlInfoDomain();
                
                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search count for the CML information.
     * CML情報の検索結果件数を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to TtPltzCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call TtPltzService.searchCount with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりTtPltzCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にTtPltzService.searchCountの呼び出し
     * </pre>
     *       
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#searchCount
     * (com.globaldenso.eca0027.core.auto.business.domain.TtPltzCriteriaDomain)
     */
    public int searchCount(Wt005CmlInfoCriteriaDomain criteria) throws ApplicationException {
        
        // Copy from the criteria on screen to a search criteria Domain.
        TtPltzCriteriaDomain tableCriteriaDomain = new TtPltzCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);
        
        
        return ttPltzService.searchCount(tableCriteriaDomain);
    }

}
