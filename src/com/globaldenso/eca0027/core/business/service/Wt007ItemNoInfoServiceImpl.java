/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List; 

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt007ItemNoInfoDao;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt007ItemNoInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt007ItemNoInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The search service implementation class of Item No. Info Sub
 * Screen. <br />
 * 品番表示子画面のService実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt007ItemNoInfoServiceImpl implements
    Wt007ItemNoInfoService {

    /**
     * wt007ItemNoInfoDao
     */
    private Wt007ItemNoInfoDao wt007ItemNoInfoDao;

    /**
     * Default constructor.
     */
    public Wt007ItemNoInfoServiceImpl() {
    }

    /**
     * <p>
     * Setter method for wt007ItemNoInfoDao.
     * </p>
     * 
     * @param wt007ItemNoInfoDao Set for wt007ItemNoInfoDao
     */
    public void setWt007ItemNoInfoDao(
        Wt007ItemNoInfoDao wt007ItemNoInfoDao) {
        this.wt007ItemNoInfoDao = wt007ItemNoInfoDao;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the dao to search count for the Item No. information.
     * 品番情報の検索結果件数を取得するDAOを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to Wt007ItemNoInfoCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt007ItemNoInfoDao.searchCountTtPltzItem with tableCriteriaDomain
     *     as an argument if mainMark is specified.
     *     Call wt007ItemNoInfoDao.searchCountTtMixtagItemNo with tableCriteriaDomain
     *     as an argument if mixTagNo is specified.
     *     
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt007ItemNoInfoCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       mainMarkに入力がある場合は、tableCriteriaDomainを引数に
     *       wt007ItemNoInfoDao.searchCountTtPltzItemを検索します。
     *       mixTagNoに入力がある場合は、tableCriteriaDomainを引数に
     *       wt007ItemNoInfoDao.searchCountTtMixtagItemNoを検索します。
     * </pre>
     */
    
    public int searchCount(Wt007ItemNoInfoCriteriaDomain criteria)
        throws ApplicationException {
        if (!CheckUtil.isBlankOrNull(criteria.getMainMark()) 
            && CheckUtil.isBlankOrNull(criteria.getMixTagNo())) {
            return wt007ItemNoInfoDao.searchCountTtPltzItem(criteria);
        } else {
            if (CheckUtil.isBlankOrNull(criteria.getMainMark()) 
                && !CheckUtil.isBlankOrNull(criteria.getMixTagNo())) {
                return wt007ItemNoInfoDao.searchCountTtMixtagItemNo(criteria);
            } else {
                return 0 ;
            }
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the Item No. information.
     * 品番情報の検索結果を取得するDAOを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to Wt007ItemNoInfoCriteriaDomain tableCriteriaDomain..
     * - Get the results.
     *     Call wt007ItemNoInfoDao.searchByConditionTtPltzItem with tableCriteriaDomain 
     *     as an argument if mainMark is specified.
     *     Call wt007ItemNoInfoDao.searchByConditionTtMixtagItemNo with tableCriteriaDomain 
     *     as an argument if mixTagNo is specified.
     * - Create a list of domain(Wt007ItemNoInfoDomain), return it.
     *     - Transfer the results of wt007ItemNoInfoDao.searchByConditionTtPltzItem or 
     *       wt007ItemNoInfoDao.searchByConditionTtMixtagItemNo
     *       to the list of Wt007ItemNoInfoDomain.
     *     - Return the list of Wt007ItemNoInfoDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt007ItemNoInfoCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索結果を取得
     *       mainMarkに入力がある場合は、tableCriteriaDomainを引数に
     *       wt007ItemNoInfoDao.searchByConditionTtPltzItemを検索します。
     *       mixTagNoに入力がある場合は、tableCriteriaDomainを引数に
     *       wt007ItemNoInfoDao.searchByConditionTtMixtagItemNoを検索します。
     * - 検索結果リストドメインWt007ItemNoInfoDomainのリストを作成し、返却
     *       - wt007ItemNoInfoDao.searchByConditionTtPltzItem、または
     *         wt007ItemNoInfoDao.searchByConditionTtMixtagItemNo
     *         の呼び出し結果をWt007ItemNoInfoDomainのリストに移送
     *       - Wt007ItemNoInfoDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.auto.business.service.Wt007ItemNoInfoDao#searchByCondition
     * (com.globaldenso.eca0027.core.auto.business.domain.Wt007ItemNoInfoCriteriaDomain)
     */
    
    public List<Wt007ItemNoInfoDomain> searchByCondition(
        Wt007ItemNoInfoCriteriaDomain criteria) throws ApplicationException {
        
        if (!CheckUtil.isBlankOrNull(criteria.getMainMark()) 
            && CheckUtil.isBlankOrNull(criteria.getMixTagNo())) {
            return wt007ItemNoInfoDao.searchByConditionTtPltzItem(criteria);
        } else {
            if (CheckUtil.isBlankOrNull(criteria.getMainMark()) 
                && !CheckUtil.isBlankOrNull(criteria.getMixTagNo())) {
                return wt007ItemNoInfoDao.searchByConditionTtMixtagItemNo(criteria);
            } else {
                return null;
            }
        }
    }

}
