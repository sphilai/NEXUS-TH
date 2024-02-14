/*
 * PROJECT：eca0027
 * 
 * TtSearchCriteria のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtSearchCriteriaDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtSearchCriteriaDomain;


/**
 * TtSearchCriteria のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtSearchCriteriaServiceImpl implements TtSearchCriteriaService {

    /**
     * ttSearchCriteriaのDAO
     */
    private TtSearchCriteriaDao ttSearchCriteriaDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtSearchCriteriaServiceImpl() {
    }

    /**
     * ttSearchCriteriaのDAOを設定します。
     * 
     * @param ttSearchCriteriaDao ttSearchCriteriaのDao
     */
    public void setTtSearchCriteriaDao(TtSearchCriteriaDao ttSearchCriteriaDao) {
        this.ttSearchCriteriaDao = ttSearchCriteriaDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSearchCriteriaService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    public List<TtSearchCriteriaDomain> searchByCondition(TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        return ttSearchCriteriaDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSearchCriteriaService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    public List<TtSearchCriteriaDomain> searchByConditionForPaging(TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        return ttSearchCriteriaDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSearchCriteriaService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    public int searchCount(TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        return ttSearchCriteriaDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSearchCriteriaService#create(com.globaldenso.eca0027.core.auto.business.domain.TtSearchCriteriaDomain)
     */
    public void create(TtSearchCriteriaDomain domain) throws ApplicationException {
        ttSearchCriteriaDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSearchCriteriaService#create(java.util.List)
     */
    public void create(List<TtSearchCriteriaDomain> domains) throws ApplicationException {
        for(TtSearchCriteriaDomain domain : domains) {
            ttSearchCriteriaDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSearchCriteriaService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtSearchCriteriaDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    public int updateByCondition(TtSearchCriteriaDomain domain, TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        return ttSearchCriteriaDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSearchCriteriaService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtSearchCriteriaDomain> domains, List<TtSearchCriteriaCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttSearchCriteriaDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSearchCriteriaService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    public int deleteByCondition(TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        return ttSearchCriteriaDao.deleteByCondition(criteria);
    }

}
