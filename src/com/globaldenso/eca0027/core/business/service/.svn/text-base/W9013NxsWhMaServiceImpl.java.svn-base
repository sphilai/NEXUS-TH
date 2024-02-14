/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9013NxsWhMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9013NxsWhMaCriteriaDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service implementation class of Warehouse Search Screen.
 * <br />
 * 倉庫選択子画面のService実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15692 $
 */
public class W9013NxsWhMaServiceImpl implements W9013NxsWhMaService {

    /**
     * w9013NxsWhMaDao
     */
    private TmNxsWhDao w9013NxsWhMaDao; // NL040 MOD

    /**
     * Default constructor.
     */
    public W9013NxsWhMaServiceImpl() {
    }

    // NL040 MOD START
    /**
     * Setter method of w9013NxsWhMaDao.
     *
     * @param w9013NxsWhMaDao Value to be stored in w9013NxsWhMaDao.
     */
    public void setW9013NxsWhMaDao(TmNxsWhDao w9013NxsWhMaDao) {
        this.w9013NxsWhMaDao = w9013NxsWhMaDao;
    }
    // NL040 MOD END

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the warehouse information.
     * 倉庫情報の検索結果を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to TmNxsWhCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the results of the one page.
     *     Call tmNxsWhService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(NxsWhMaDomain), return it.
     *     - Transfer the results of nxsWhMaService.searchByConditionForPaging to the list of NxsWhMaDomain.
     *     - Return the list of NxsWhMaDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりTmNxsWhCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にtmNxsWhService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインNxsWhMaDomainのリストを作成し、返却
     *       - tmNxsWhService.searchByConditionForPagingの呼び出し結果をNxsWhMaDomainのリストに移送
     *       - NxsWhMaDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhCriteriaDomain)
     */
    public List<W9013NxsWhMaDomain> searchByConditionForPaging(
        W9013NxsWhMaCriteriaDomain w9013NxsWhMaCriteriaDomain) throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TmNxsWhCriteriaDomain tableCriteriaDomain = new TmNxsWhCriteriaDomain();

        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, w9013NxsWhMaCriteriaDomain);
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setCompCdLikeFront(w9013NxsWhMaCriteriaDomain.getCompCd());
        tableCriteriaDomain.setCompCd(null);
        // Wild card Replace.
        String whNm = w9013NxsWhMaCriteriaDomain.getWhNm();
        if(whNm != null) {
            String escWhNm =
                whNm.replace("%", "[%]").replace("_", "[_]");
            tableCriteriaDomain.setWhNmLikeFront(escWhNm);
        }
        tableCriteriaDomain.setWhNm(null);
        
        
        // Call search service.
        List<TmNxsWhDomain> tableResultDomainList = w9013NxsWhMaDao // NL040 MOD
            .searchByConditionForPaging(tableCriteriaDomain);

        List<W9013NxsWhMaDomain> w9013NxsWhMaListDomainList = new ArrayList<W9013NxsWhMaDomain>();
        if (tableResultDomainList != null) {

            for (TmNxsWhDomain resultDomain : tableResultDomainList) {
                W9013NxsWhMaDomain w9013NxsWhMaListDomain = new W9013NxsWhMaDomain();
                
                // Copy the search result.
                CommonUtil.copyPropertiesDomainToDomain(w9013NxsWhMaListDomain, resultDomain);

                w9013NxsWhMaListDomainList.add(w9013NxsWhMaListDomain);
            }
        }

        return w9013NxsWhMaListDomainList;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search count for the warehouse information.
     * 倉庫情報の検索結果件数を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to TmNxsWhCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the number of search results.
     *     Call tmNxsWhService.searchCount with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりTmNxsWhCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にtmNxsWhService.searchCountの呼び出し
     * </pre>
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhCriteriaDomain)
     * 
     */
    public int searchCount(W9013NxsWhMaCriteriaDomain w9013NxsWhMaCriteriaDomain)
        throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TmNxsWhCriteriaDomain tableCriteriaDomain = new TmNxsWhCriteriaDomain();

        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, w9013NxsWhMaCriteriaDomain);
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setCompCdLikeFront(w9013NxsWhMaCriteriaDomain.getCompCd());
        tableCriteriaDomain.setCompCd(null);
        // Wild card Replace.
        String whNm = w9013NxsWhMaCriteriaDomain.getWhNm();
        if(whNm != null) {
            String escWhNm =
                whNm.replace("%", "[%]").replace("_", "[_]");
            tableCriteriaDomain.setWhNmLikeFront(escWhNm);
        }
        tableCriteriaDomain.setWhNm(null);

        return w9013NxsWhMaDao.searchCount(tableCriteriaDomain); // NL040 MOD
    }

}
