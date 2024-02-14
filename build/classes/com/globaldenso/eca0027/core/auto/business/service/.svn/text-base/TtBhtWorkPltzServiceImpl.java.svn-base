/*
 * PROJECT：eca0027
 * 
 * TtBhtWorkPltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain;


/**
 * TtBhtWorkPltz のService実装クラスです。<BR>
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
public class TtBhtWorkPltzServiceImpl implements TtBhtWorkPltzService {

    /**
     * ttBhtWorkPltzのDAO
     */
    private TtBhtWorkPltzDao ttBhtWorkPltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtBhtWorkPltzServiceImpl() {
    }

    /**
     * ttBhtWorkPltzのDAOを設定します。
     * 
     * @param ttBhtWorkPltzDao ttBhtWorkPltzのDao
     */
    public void setTtBhtWorkPltzDao(TtBhtWorkPltzDao ttBhtWorkPltzDao) {
        this.ttBhtWorkPltzDao = ttBhtWorkPltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public TtBhtWorkPltzDomain searchByKey(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public List<TtBhtWorkPltzDomain> searchByCondition(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public List<TtBhtWorkPltzDomain> searchByConditionForPaging(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public int searchCount(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public TtBhtWorkPltzDomain searchByKeyForChange(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public TtBhtWorkPltzDomain lockByKey(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public TtBhtWorkPltzDomain lockByKeyNoWait(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#create(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain)
     */
    public void create(TtBhtWorkPltzDomain domain) throws ApplicationException {
        ttBhtWorkPltzDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#create(java.util.List)
     */
    public void create(List<TtBhtWorkPltzDomain> domains) throws ApplicationException {
        for(TtBhtWorkPltzDomain domain : domains) {
            ttBhtWorkPltzDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#update(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain)
     */
    public int update(TtBhtWorkPltzDomain domain) throws ApplicationException {
        return ttBhtWorkPltzDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#update(java.util.List)
     */
    public int update(List<TtBhtWorkPltzDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtBhtWorkPltzDomain domain : domains) {
            updateCount += ttBhtWorkPltzDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public int updateByCondition(TtBhtWorkPltzDomain domain, TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtBhtWorkPltzDomain> domains, List<TtBhtWorkPltzCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttBhtWorkPltzDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public int delete(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public int deleteByCondition(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkPltzDao.deleteByCondition(criteria);
    }

}
