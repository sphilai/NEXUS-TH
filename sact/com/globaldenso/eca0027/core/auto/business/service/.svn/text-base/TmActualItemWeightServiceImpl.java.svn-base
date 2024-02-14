/*
 * PROJECT：eca0027
 * 
 * TmActualItemWeight のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain;


/**
 * TmActualItemWeight のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/05 17:39:47<BR>
 * 
 * テーブル定義から2014/11/05に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TmActualItemWeightServiceImpl implements TmActualItemWeightService {

    /**
     * tmActualItemWeightのDAO
     */
    private TmActualItemWeightDao tmActualItemWeightDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmActualItemWeightServiceImpl() {
    }

    /**
     * tmActualItemWeightのDAOを設定します。
     * 
     * @param tmActualItemWeightDao tmActualItemWeightのDao
     */
    public void setTmActualItemWeightDao(TmActualItemWeightDao tmActualItemWeightDao) {
        this.tmActualItemWeightDao = tmActualItemWeightDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public TmActualItemWeightDomain searchByKey(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public List<TmActualItemWeightDomain> searchByCondition(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public List<TmActualItemWeightDomain> searchByConditionForPaging(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public int searchCount(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public TmActualItemWeightDomain searchByKeyForChange(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public TmActualItemWeightDomain lockByKey(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public TmActualItemWeightDomain lockByKeyNoWait(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#create(com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain)
     */
    public void create(TmActualItemWeightDomain domain) throws ApplicationException {
        tmActualItemWeightDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#create(java.util.List)
     */
    public void create(List<TmActualItemWeightDomain> domains) throws ApplicationException {
        for(TmActualItemWeightDomain domain : domains) {
            tmActualItemWeightDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#update(com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain)
     */
    public int update(TmActualItemWeightDomain domain) throws ApplicationException {
        return tmActualItemWeightDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#update(java.util.List)
     */
    public int update(List<TmActualItemWeightDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmActualItemWeightDomain domain : domains) {
            updateCount += tmActualItemWeightDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public int updateByCondition(TmActualItemWeightDomain domain, TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmActualItemWeightDomain> domains, List<TmActualItemWeightCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmActualItemWeightDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public int delete(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public int deleteByCondition(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return tmActualItemWeightDao.deleteByCondition(criteria);
    }

}
