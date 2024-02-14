/*
 * PROJECT：eca0027
 * 
 * TmAgent のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain;


/**
 * TmAgent のService実装クラスです。<BR>
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
public class TmAgentServiceImpl implements TmAgentService {

    /**
     * tmAgentのDAO
     */
    private TmAgentDao tmAgentDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmAgentServiceImpl() {
    }

    /**
     * tmAgentのDAOを設定します。
     * 
     * @param tmAgentDao tmAgentのDao
     */
    public void setTmAgentDao(TmAgentDao tmAgentDao) {
        this.tmAgentDao = tmAgentDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public TmAgentDomain searchByKey(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public List<TmAgentDomain> searchByCondition(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public List<TmAgentDomain> searchByConditionForPaging(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public int searchCount(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public TmAgentDomain searchByKeyForChange(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public TmAgentDomain lockByKey(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public TmAgentDomain lockByKeyNoWait(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#create(com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain)
     */
    public void create(TmAgentDomain domain) throws ApplicationException {
        tmAgentDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#create(java.util.List)
     */
    public void create(List<TmAgentDomain> domains) throws ApplicationException {
        for(TmAgentDomain domain : domains) {
            tmAgentDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#update(com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain)
     */
    public int update(TmAgentDomain domain) throws ApplicationException {
        return tmAgentDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#update(java.util.List)
     */
    public int update(List<TmAgentDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmAgentDomain domain : domains) {
            updateCount += tmAgentDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public int updateByCondition(TmAgentDomain domain, TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmAgentDomain> domains, List<TmAgentCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmAgentDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public int delete(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmAgentService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public int deleteByCondition(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return tmAgentDao.deleteByCondition(criteria);
    }

}
