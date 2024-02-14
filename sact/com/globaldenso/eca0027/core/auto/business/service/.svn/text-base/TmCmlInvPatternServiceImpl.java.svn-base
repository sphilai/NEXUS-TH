/*
 * PROJECT：eca0027
 * 
 * TmCmlInvPattern のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCmlInvPatternDomain;


/**
 * TmCmlInvPattern のService実装クラスです。<BR>
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
public class TmCmlInvPatternServiceImpl implements TmCmlInvPatternService {

    /**
     * tmCmlInvPatternのDAO
     */
    private TmCmlInvPatternDao tmCmlInvPatternDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCmlInvPatternServiceImpl() {
    }

    /**
     * tmCmlInvPatternのDAOを設定します。
     * 
     * @param tmCmlInvPatternDao tmCmlInvPatternのDao
     */
    public void setTmCmlInvPatternDao(TmCmlInvPatternDao tmCmlInvPatternDao) {
        this.tmCmlInvPatternDao = tmCmlInvPatternDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public TmCmlInvPatternDomain searchByKey(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public List<TmCmlInvPatternDomain> searchByCondition(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public List<TmCmlInvPatternDomain> searchByConditionForPaging(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public int searchCount(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public TmCmlInvPatternDomain searchByKeyForChange(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public TmCmlInvPatternDomain lockByKey(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public TmCmlInvPatternDomain lockByKeyNoWait(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCmlInvPatternDomain)
     */
    public void create(TmCmlInvPatternDomain domain) throws ApplicationException {
        tmCmlInvPatternDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#create(java.util.List)
     */
    public void create(List<TmCmlInvPatternDomain> domains) throws ApplicationException {
        for(TmCmlInvPatternDomain domain : domains) {
            tmCmlInvPatternDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCmlInvPatternDomain)
     */
    public int update(TmCmlInvPatternDomain domain) throws ApplicationException {
        return tmCmlInvPatternDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#update(java.util.List)
     */
    public int update(List<TmCmlInvPatternDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCmlInvPatternDomain domain : domains) {
            updateCount += tmCmlInvPatternDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCmlInvPatternDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public int updateByCondition(TmCmlInvPatternDomain domain, TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCmlInvPatternDomain> domains, List<TmCmlInvPatternCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCmlInvPatternDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public int delete(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCmlInvPatternService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public int deleteByCondition(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return tmCmlInvPatternDao.deleteByCondition(criteria);
    }

}
