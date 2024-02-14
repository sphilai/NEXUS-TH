/*
 * PROJECT：eca0027
 * 
 * TtTmpStock のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;


/**
 * TtTmpStock のService実装クラスです。<BR>
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
public class TtTmpStockServiceImpl implements TtTmpStockService {

    /**
     * ttTmpStockのDAO
     */
    private TtTmpStockDao ttTmpStockDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtTmpStockServiceImpl() {
    }

    /**
     * ttTmpStockのDAOを設定します。
     * 
     * @param ttTmpStockDao ttTmpStockのDao
     */
    public void setTtTmpStockDao(TtTmpStockDao ttTmpStockDao) {
        this.ttTmpStockDao = ttTmpStockDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public TtTmpStockDomain searchByKey(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public List<TtTmpStockDomain> searchByCondition(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public List<TtTmpStockDomain> searchByConditionForPaging(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public int searchCount(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public TtTmpStockDomain searchByKeyForChange(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public TtTmpStockDomain lockByKey(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public TtTmpStockDomain lockByKeyNoWait(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#create(com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain)
     */
    public void create(TtTmpStockDomain domain) throws ApplicationException {
        ttTmpStockDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#create(java.util.List)
     */
    public void create(List<TtTmpStockDomain> domains) throws ApplicationException {
        for(TtTmpStockDomain domain : domains) {
            ttTmpStockDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#update(com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain)
     */
    public int update(TtTmpStockDomain domain) throws ApplicationException {
        return ttTmpStockDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#update(java.util.List)
     */
    public int update(List<TtTmpStockDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtTmpStockDomain domain : domains) {
            updateCount += ttTmpStockDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public int updateByCondition(TtTmpStockDomain domain, TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtTmpStockDomain> domains, List<TtTmpStockCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttTmpStockDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public int delete(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public int deleteByCondition(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return ttTmpStockDao.deleteByCondition(criteria);
    }

}
