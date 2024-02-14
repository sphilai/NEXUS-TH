/*
 * PROJECT：eca0027
 * 
 * TmSailingSchedule のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSailingScheduleDomain;


/**
 * TmSailingSchedule のService実装クラスです。<BR>
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
public class TmSailingScheduleServiceImpl implements TmSailingScheduleService {

    /**
     * tmSailingScheduleのDAO
     */
    private TmSailingScheduleDao tmSailingScheduleDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmSailingScheduleServiceImpl() {
    }

    /**
     * tmSailingScheduleのDAOを設定します。
     * 
     * @param tmSailingScheduleDao tmSailingScheduleのDao
     */
    public void setTmSailingScheduleDao(TmSailingScheduleDao tmSailingScheduleDao) {
        this.tmSailingScheduleDao = tmSailingScheduleDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public TmSailingScheduleDomain searchByKey(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public List<TmSailingScheduleDomain> searchByCondition(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public List<TmSailingScheduleDomain> searchByConditionForPaging(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public int searchCount(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public TmSailingScheduleDomain searchByKeyForChange(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public TmSailingScheduleDomain lockByKey(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public TmSailingScheduleDomain lockByKeyNoWait(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#create(com.globaldenso.eca0027.core.auto.business.domain.TmSailingScheduleDomain)
     */
    public void create(TmSailingScheduleDomain domain) throws ApplicationException {
        tmSailingScheduleDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#create(java.util.List)
     */
    public void create(List<TmSailingScheduleDomain> domains) throws ApplicationException {
        for(TmSailingScheduleDomain domain : domains) {
            tmSailingScheduleDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#update(com.globaldenso.eca0027.core.auto.business.domain.TmSailingScheduleDomain)
     */
    public int update(TmSailingScheduleDomain domain) throws ApplicationException {
        return tmSailingScheduleDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#update(java.util.List)
     */
    public int update(List<TmSailingScheduleDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmSailingScheduleDomain domain : domains) {
            updateCount += tmSailingScheduleDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmSailingScheduleDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public int updateByCondition(TmSailingScheduleDomain domain, TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmSailingScheduleDomain> domains, List<TmSailingScheduleCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmSailingScheduleDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public int delete(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSailingScheduleService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public int deleteByCondition(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return tmSailingScheduleDao.deleteByCondition(criteria);
    }

}
