/*
 * PROJECT：eca0027
 * 
 * TtXpltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain;


/**
 * TtXpltz のService実装クラスです。<BR>
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
public class TtXpltzServiceImpl implements TtXpltzService {

    /**
     * ttXpltzのDAO
     */
    private TtXpltzDao ttXpltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtXpltzServiceImpl() {
    }

    /**
     * ttXpltzのDAOを設定します。
     * 
     * @param ttXpltzDao ttXpltzのDao
     */
    public void setTtXpltzDao(TtXpltzDao ttXpltzDao) {
        this.ttXpltzDao = ttXpltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public TtXpltzDomain searchByKey(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public List<TtXpltzDomain> searchByCondition(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public List<TtXpltzDomain> searchByConditionForPaging(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public int searchCount(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public TtXpltzDomain searchByKeyForChange(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public TtXpltzDomain lockByKey(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public TtXpltzDomain lockByKeyNoWait(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#create(com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain)
     */
    public void create(TtXpltzDomain domain) throws ApplicationException {
        ttXpltzDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#create(java.util.List)
     */
    public void create(List<TtXpltzDomain> domains) throws ApplicationException {
        for(TtXpltzDomain domain : domains) {
            ttXpltzDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#update(com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain)
     */
    public int update(TtXpltzDomain domain) throws ApplicationException {
        return ttXpltzDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#update(java.util.List)
     */
    public int update(List<TtXpltzDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtXpltzDomain domain : domains) {
            updateCount += ttXpltzDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public int updateByCondition(TtXpltzDomain domain, TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtXpltzDomain> domains, List<TtXpltzCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttXpltzDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public int delete(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtXpltzService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public int deleteByCondition(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return ttXpltzDao.deleteByCondition(criteria);
    }

}
