/*
 * PROJECT：eca0027
 * 
 * TmNxsWh のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;


/**
 * TmNxsWh のService実装クラスです。<BR>
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
public class TmNxsWhServiceImpl implements TmNxsWhService {

    /**
     * tmNxsWhのDAO
     */
    private TmNxsWhDao tmNxsWhDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmNxsWhServiceImpl() {
    }

    /**
     * tmNxsWhのDAOを設定します。
     * 
     * @param tmNxsWhDao tmNxsWhのDao
     */
    public void setTmNxsWhDao(TmNxsWhDao tmNxsWhDao) {
        this.tmNxsWhDao = tmNxsWhDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public TmNxsWhDomain searchByKey(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public List<TmNxsWhDomain> searchByCondition(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public List<TmNxsWhDomain> searchByConditionForPaging(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public int searchCount(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public TmNxsWhDomain searchByKeyForChange(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public TmNxsWhDomain lockByKey(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public TmNxsWhDomain lockByKeyNoWait(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#create(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain)
     */
    public void create(TmNxsWhDomain domain) throws ApplicationException {
        tmNxsWhDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#create(java.util.List)
     */
    public void create(List<TmNxsWhDomain> domains) throws ApplicationException {
        for(TmNxsWhDomain domain : domains) {
            tmNxsWhDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#update(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain)
     */
    public int update(TmNxsWhDomain domain) throws ApplicationException {
        return tmNxsWhDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#update(java.util.List)
     */
    public int update(List<TmNxsWhDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmNxsWhDomain domain : domains) {
            updateCount += tmNxsWhDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public int updateByCondition(TmNxsWhDomain domain, TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmNxsWhDomain> domains, List<TmNxsWhCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmNxsWhDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public int delete(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public int deleteByCondition(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return tmNxsWhDao.deleteByCondition(criteria);
    }

}
