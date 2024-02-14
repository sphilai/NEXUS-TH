/*
 * PROJECT：eca0027
 * 
 * TtMixtag のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;


/**
 * TtMixtag のService実装クラスです。<BR>
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
public class TtMixtagServiceImpl implements TtMixtagService {

    /**
     * ttMixtagのDAO
     */
    private TtMixtagDao ttMixtagDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixtagServiceImpl() {
    }

    /**
     * ttMixtagのDAOを設定します。
     * 
     * @param ttMixtagDao ttMixtagのDao
     */
    public void setTtMixtagDao(TtMixtagDao ttMixtagDao) {
        this.ttMixtagDao = ttMixtagDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public TtMixtagDomain searchByKey(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public List<TtMixtagDomain> searchByCondition(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public List<TtMixtagDomain> searchByConditionForPaging(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public int searchCount(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public TtMixtagDomain searchByKeyForChange(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public TtMixtagDomain lockByKey(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public TtMixtagDomain lockByKeyNoWait(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain)
     */
    public void create(TtMixtagDomain domain) throws ApplicationException {
        ttMixtagDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#create(java.util.List)
     */
    public void create(List<TtMixtagDomain> domains) throws ApplicationException {
        for(TtMixtagDomain domain : domains) {
            ttMixtagDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain)
     */
    public int update(TtMixtagDomain domain) throws ApplicationException {
        return ttMixtagDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#update(java.util.List)
     */
    public int update(List<TtMixtagDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtMixtagDomain domain : domains) {
            updateCount += ttMixtagDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public int updateByCondition(TtMixtagDomain domain, TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtMixtagDomain> domains, List<TtMixtagCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttMixtagDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public int delete(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public int deleteByCondition(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagDao.deleteByCondition(criteria);
    }

}
