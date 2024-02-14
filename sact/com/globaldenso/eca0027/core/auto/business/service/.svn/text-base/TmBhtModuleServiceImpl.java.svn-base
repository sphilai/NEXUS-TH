/*
 * PROJECT：eca0027
 * 
 * TmBhtModule のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtModuleDomain;


/**
 * TmBhtModule のService実装クラスです。<BR>
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
public class TmBhtModuleServiceImpl implements TmBhtModuleService {

    /**
     * tmBhtModuleのDAO
     */
    private TmBhtModuleDao tmBhtModuleDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmBhtModuleServiceImpl() {
    }

    /**
     * tmBhtModuleのDAOを設定します。
     * 
     * @param tmBhtModuleDao tmBhtModuleのDao
     */
    public void setTmBhtModuleDao(TmBhtModuleDao tmBhtModuleDao) {
        this.tmBhtModuleDao = tmBhtModuleDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public TmBhtModuleDomain searchByKey(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public List<TmBhtModuleDomain> searchByCondition(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public List<TmBhtModuleDomain> searchByConditionForPaging(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public int searchCount(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public TmBhtModuleDomain searchByKeyForChange(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public TmBhtModuleDomain lockByKey(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public TmBhtModuleDomain lockByKeyNoWait(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#create(com.globaldenso.eca0027.core.auto.business.domain.TmBhtModuleDomain)
     */
    public void create(TmBhtModuleDomain domain) throws ApplicationException {
        tmBhtModuleDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#create(java.util.List)
     */
    public void create(List<TmBhtModuleDomain> domains) throws ApplicationException {
        for(TmBhtModuleDomain domain : domains) {
            tmBhtModuleDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#update(com.globaldenso.eca0027.core.auto.business.domain.TmBhtModuleDomain)
     */
    public int update(TmBhtModuleDomain domain) throws ApplicationException {
        return tmBhtModuleDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#update(java.util.List)
     */
    public int update(List<TmBhtModuleDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmBhtModuleDomain domain : domains) {
            updateCount += tmBhtModuleDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmBhtModuleDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public int updateByCondition(TmBhtModuleDomain domain, TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmBhtModuleDomain> domains, List<TmBhtModuleCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmBhtModuleDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public int delete(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public int deleteByCondition(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return tmBhtModuleDao.deleteByCondition(criteria);
    }

}
