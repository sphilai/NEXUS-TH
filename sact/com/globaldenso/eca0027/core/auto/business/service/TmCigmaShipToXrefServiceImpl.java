/*
 * PROJECT：eca0027
 * 
 * TmCigmaShipToXref のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;


/**
 * TmCigmaShipToXref のService実装クラスです。<BR>
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
public class TmCigmaShipToXrefServiceImpl implements TmCigmaShipToXrefService {

    /**
     * tmCigmaShipToXrefのDAO
     */
    private TmCigmaShipToXrefDao tmCigmaShipToXrefDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCigmaShipToXrefServiceImpl() {
    }

    /**
     * tmCigmaShipToXrefのDAOを設定します。
     * 
     * @param tmCigmaShipToXrefDao tmCigmaShipToXrefのDao
     */
    public void setTmCigmaShipToXrefDao(TmCigmaShipToXrefDao tmCigmaShipToXrefDao) {
        this.tmCigmaShipToXrefDao = tmCigmaShipToXrefDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public TmCigmaShipToXrefDomain searchByKey(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public List<TmCigmaShipToXrefDomain> searchByCondition(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public List<TmCigmaShipToXrefDomain> searchByConditionForPaging(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public int searchCount(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public TmCigmaShipToXrefDomain searchByKeyForChange(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public TmCigmaShipToXrefDomain lockByKey(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public TmCigmaShipToXrefDomain lockByKeyNoWait(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain)
     */
    public void create(TmCigmaShipToXrefDomain domain) throws ApplicationException {
        tmCigmaShipToXrefDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#create(java.util.List)
     */
    public void create(List<TmCigmaShipToXrefDomain> domains) throws ApplicationException {
        for(TmCigmaShipToXrefDomain domain : domains) {
            tmCigmaShipToXrefDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain)
     */
    public int update(TmCigmaShipToXrefDomain domain) throws ApplicationException {
        return tmCigmaShipToXrefDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#update(java.util.List)
     */
    public int update(List<TmCigmaShipToXrefDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCigmaShipToXrefDomain domain : domains) {
            updateCount += tmCigmaShipToXrefDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public int updateByCondition(TmCigmaShipToXrefDomain domain, TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCigmaShipToXrefDomain> domains, List<TmCigmaShipToXrefCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCigmaShipToXrefDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public int delete(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public int deleteByCondition(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaShipToXrefDao.deleteByCondition(criteria);
    }

}
