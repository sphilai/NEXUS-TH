/*
 * PROJECT：eca0027
 * 
 * TmCigmaWhXref のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;


/**
 * TmCigmaWhXref のService実装クラスです。<BR>
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
public class TmCigmaWhXrefServiceImpl implements TmCigmaWhXrefService {

    /**
     * tmCigmaWhXrefのDAO
     */
    private TmCigmaWhXrefDao tmCigmaWhXrefDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCigmaWhXrefServiceImpl() {
    }

    /**
     * tmCigmaWhXrefのDAOを設定します。
     * 
     * @param tmCigmaWhXrefDao tmCigmaWhXrefのDao
     */
    public void setTmCigmaWhXrefDao(TmCigmaWhXrefDao tmCigmaWhXrefDao) {
        this.tmCigmaWhXrefDao = tmCigmaWhXrefDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public TmCigmaWhXrefDomain searchByKey(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public List<TmCigmaWhXrefDomain> searchByCondition(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public List<TmCigmaWhXrefDomain> searchByConditionForPaging(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public int searchCount(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public TmCigmaWhXrefDomain searchByKeyForChange(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public TmCigmaWhXrefDomain lockByKey(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public TmCigmaWhXrefDomain lockByKeyNoWait(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain)
     */
    public void create(TmCigmaWhXrefDomain domain) throws ApplicationException {
        tmCigmaWhXrefDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#create(java.util.List)
     */
    public void create(List<TmCigmaWhXrefDomain> domains) throws ApplicationException {
        for(TmCigmaWhXrefDomain domain : domains) {
            tmCigmaWhXrefDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain)
     */
    public int update(TmCigmaWhXrefDomain domain) throws ApplicationException {
        return tmCigmaWhXrefDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#update(java.util.List)
     */
    public int update(List<TmCigmaWhXrefDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCigmaWhXrefDomain domain : domains) {
            updateCount += tmCigmaWhXrefDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public int updateByCondition(TmCigmaWhXrefDomain domain, TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCigmaWhXrefDomain> domains, List<TmCigmaWhXrefCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCigmaWhXrefDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public int delete(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public int deleteByCondition(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaWhXrefDao.deleteByCondition(criteria);
    }

}
