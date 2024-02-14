/*
 * PROJECT：eca0027
 * 
 * TtScAttached のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain;


/**
 * TtScAttached のService実装クラスです。<BR>
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
public class TtScAttachedServiceImpl implements TtScAttachedService {

    /**
     * ttScAttachedのDAO
     */
    private TtScAttachedDao ttScAttachedDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtScAttachedServiceImpl() {
    }

    /**
     * ttScAttachedのDAOを設定します。
     * 
     * @param ttScAttachedDao ttScAttachedのDao
     */
    public void setTtScAttachedDao(TtScAttachedDao ttScAttachedDao) {
        this.ttScAttachedDao = ttScAttachedDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public TtScAttachedDomain searchByKey(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public List<TtScAttachedDomain> searchByCondition(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public List<TtScAttachedDomain> searchByConditionForPaging(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public int searchCount(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public TtScAttachedDomain searchByKeyForChange(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public TtScAttachedDomain lockByKey(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public TtScAttachedDomain lockByKeyNoWait(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#create(com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain)
     */
    public void create(TtScAttachedDomain domain) throws ApplicationException {
        ttScAttachedDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#create(java.util.List)
     */
    public void create(List<TtScAttachedDomain> domains) throws ApplicationException {
        for(TtScAttachedDomain domain : domains) {
            ttScAttachedDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#update(com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain)
     */
    public int update(TtScAttachedDomain domain) throws ApplicationException {
        return ttScAttachedDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#update(java.util.List)
     */
    public int update(List<TtScAttachedDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtScAttachedDomain domain : domains) {
            updateCount += ttScAttachedDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public int updateByCondition(TtScAttachedDomain domain, TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtScAttachedDomain> domains, List<TtScAttachedCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttScAttachedDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public int delete(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public int deleteByCondition(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttScAttachedDao.deleteByCondition(criteria);
    }

}
