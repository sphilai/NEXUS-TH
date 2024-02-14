/*
 * PROJECT：eca0027
 * 
 * TmCigmaCustomerXref のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain;


/**
 * TmCigmaCustomerXref のService実装クラスです。<BR>
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
public class TmCigmaCustomerXrefServiceImpl implements TmCigmaCustomerXrefService {

    /**
     * tmCigmaCustomerXrefのDAO
     */
    private TmCigmaCustomerXrefDao tmCigmaCustomerXrefDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCigmaCustomerXrefServiceImpl() {
    }

    /**
     * tmCigmaCustomerXrefのDAOを設定します。
     * 
     * @param tmCigmaCustomerXrefDao tmCigmaCustomerXrefのDao
     */
    public void setTmCigmaCustomerXrefDao(TmCigmaCustomerXrefDao tmCigmaCustomerXrefDao) {
        this.tmCigmaCustomerXrefDao = tmCigmaCustomerXrefDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public TmCigmaCustomerXrefDomain searchByKey(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public List<TmCigmaCustomerXrefDomain> searchByCondition(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public List<TmCigmaCustomerXrefDomain> searchByConditionForPaging(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public int searchCount(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public TmCigmaCustomerXrefDomain searchByKeyForChange(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public TmCigmaCustomerXrefDomain lockByKey(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public TmCigmaCustomerXrefDomain lockByKeyNoWait(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain)
     */
    public void create(TmCigmaCustomerXrefDomain domain) throws ApplicationException {
        tmCigmaCustomerXrefDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#create(java.util.List)
     */
    public void create(List<TmCigmaCustomerXrefDomain> domains) throws ApplicationException {
        for(TmCigmaCustomerXrefDomain domain : domains) {
            tmCigmaCustomerXrefDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain)
     */
    public int update(TmCigmaCustomerXrefDomain domain) throws ApplicationException {
        return tmCigmaCustomerXrefDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#update(java.util.List)
     */
    public int update(List<TmCigmaCustomerXrefDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCigmaCustomerXrefDomain domain : domains) {
            updateCount += tmCigmaCustomerXrefDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public int updateByCondition(TmCigmaCustomerXrefDomain domain, TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCigmaCustomerXrefDomain> domains, List<TmCigmaCustomerXrefCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCigmaCustomerXrefDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public int delete(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public int deleteByCondition(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaCustomerXrefDao.deleteByCondition(criteria);
    }

}
