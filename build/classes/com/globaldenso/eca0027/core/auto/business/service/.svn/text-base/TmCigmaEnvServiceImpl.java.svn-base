/*
 * PROJECT：eca0027
 * 
 * TmCigmaEnv のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/08/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;


/**
 * TmCigmaEnv のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/04 15:39:57<BR>
 * 
 * テーブル定義から2014/08/04に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TmCigmaEnvServiceImpl implements TmCigmaEnvService {

    /**
     * tmCigmaEnvのDAO
     */
    private TmCigmaEnvDao tmCigmaEnvDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCigmaEnvServiceImpl() {
    }

    /**
     * tmCigmaEnvのDAOを設定します。
     * 
     * @param tmCigmaEnvDao tmCigmaEnvのDao
     */
    public void setTmCigmaEnvDao(TmCigmaEnvDao tmCigmaEnvDao) {
        this.tmCigmaEnvDao = tmCigmaEnvDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public TmCigmaEnvDomain searchByKey(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public List<TmCigmaEnvDomain> searchByCondition(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public List<TmCigmaEnvDomain> searchByConditionForPaging(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public int searchCount(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public TmCigmaEnvDomain searchByKeyForChange(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public TmCigmaEnvDomain lockByKey(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public TmCigmaEnvDomain lockByKeyNoWait(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain)
     */
    public void create(TmCigmaEnvDomain domain) throws ApplicationException {
        tmCigmaEnvDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#create(java.util.List)
     */
    public void create(List<TmCigmaEnvDomain> domains) throws ApplicationException {
        for(TmCigmaEnvDomain domain : domains) {
            tmCigmaEnvDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain)
     */
    public int update(TmCigmaEnvDomain domain) throws ApplicationException {
        return tmCigmaEnvDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#update(java.util.List)
     */
    public int update(List<TmCigmaEnvDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCigmaEnvDomain domain : domains) {
            updateCount += tmCigmaEnvDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public int updateByCondition(TmCigmaEnvDomain domain, TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCigmaEnvDomain> domains, List<TmCigmaEnvCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCigmaEnvDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public int delete(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public int deleteByCondition(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return tmCigmaEnvDao.deleteByCondition(criteria);
    }

}
