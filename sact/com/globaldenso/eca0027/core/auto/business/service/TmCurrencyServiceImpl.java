/*
 * PROJECT：eca0027
 * 
 * TmCurrency のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/28  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain;


/**
 * TmCurrency のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/28 13:48:44<BR>
 * 
 * テーブル定義から2014/04/28に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmCurrencyServiceImpl implements TmCurrencyService {

    /**
     * tmCurrencyのDAO
     */
    private TmCurrencyDao tmCurrencyDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCurrencyServiceImpl() {
    }

    /**
     * tmCurrencyのDAOを設定します。
     * 
     * @param tmCurrencyDao tmCurrencyのDao
     */
    public void setTmCurrencyDao(TmCurrencyDao tmCurrencyDao) {
        this.tmCurrencyDao = tmCurrencyDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public TmCurrencyDomain searchByKey(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public List<TmCurrencyDomain> searchByCondition(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public List<TmCurrencyDomain> searchByConditionForPaging(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public int searchCount(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public TmCurrencyDomain searchByKeyForChange(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public TmCurrencyDomain lockByKey(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public TmCurrencyDomain lockByKeyNoWait(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain)
     */
    public void create(TmCurrencyDomain domain) throws ApplicationException {
        tmCurrencyDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#create(java.util.List)
     */
    public void create(List<TmCurrencyDomain> domains) throws ApplicationException {
        for(TmCurrencyDomain domain : domains) {
            tmCurrencyDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain)
     */
    public int update(TmCurrencyDomain domain) throws ApplicationException {
        return tmCurrencyDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#update(java.util.List)
     */
    public int update(List<TmCurrencyDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCurrencyDomain domain : domains) {
            updateCount += tmCurrencyDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public int updateByCondition(TmCurrencyDomain domain, TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCurrencyDomain> domains, List<TmCurrencyCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCurrencyDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public int delete(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public int deleteByCondition(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return tmCurrencyDao.deleteByCondition(criteria);
    }

}
