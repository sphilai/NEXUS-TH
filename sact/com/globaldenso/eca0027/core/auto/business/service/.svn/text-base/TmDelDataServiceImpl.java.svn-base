/*
 * PROJECT：eca0027
 * 
 * TmDelData のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmDelDataDomain;


/**
 * TmDelData のService実装クラスです。<BR>
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
public class TmDelDataServiceImpl implements TmDelDataService {

    /**
     * tmDelDataのDAO
     */
    private TmDelDataDao tmDelDataDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmDelDataServiceImpl() {
    }

    /**
     * tmDelDataのDAOを設定します。
     * 
     * @param tmDelDataDao tmDelDataのDao
     */
    public void setTmDelDataDao(TmDelDataDao tmDelDataDao) {
        this.tmDelDataDao = tmDelDataDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public TmDelDataDomain searchByKey(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public List<TmDelDataDomain> searchByCondition(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public List<TmDelDataDomain> searchByConditionForPaging(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public int searchCount(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public TmDelDataDomain searchByKeyForChange(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public TmDelDataDomain lockByKey(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public TmDelDataDomain lockByKeyNoWait(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#create(com.globaldenso.eca0027.core.auto.business.domain.TmDelDataDomain)
     */
    public void create(TmDelDataDomain domain) throws ApplicationException {
        tmDelDataDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#create(java.util.List)
     */
    public void create(List<TmDelDataDomain> domains) throws ApplicationException {
        for(TmDelDataDomain domain : domains) {
            tmDelDataDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#update(com.globaldenso.eca0027.core.auto.business.domain.TmDelDataDomain)
     */
    public int update(TmDelDataDomain domain) throws ApplicationException {
        return tmDelDataDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#update(java.util.List)
     */
    public int update(List<TmDelDataDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmDelDataDomain domain : domains) {
            updateCount += tmDelDataDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmDelDataDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public int updateByCondition(TmDelDataDomain domain, TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmDelDataDomain> domains, List<TmDelDataCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmDelDataDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public int delete(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmDelDataService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public int deleteByCondition(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return tmDelDataDao.deleteByCondition(criteria);
    }

}
