/*
 * PROJECT：eca0027
 * 
 * TmServer のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmServerDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmServerDomain;


/**
 * TmServer のService実装クラスです。<BR>
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
public class TmServerServiceImpl implements TmServerService {

    /**
     * tmServerのDAO
     */
    private TmServerDao tmServerDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmServerServiceImpl() {
    }

    /**
     * tmServerのDAOを設定します。
     * 
     * @param tmServerDao tmServerのDao
     */
    public void setTmServerDao(TmServerDao tmServerDao) {
        this.tmServerDao = tmServerDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public TmServerDomain searchByKey(TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public List<TmServerDomain> searchByCondition(TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public List<TmServerDomain> searchByConditionForPaging(TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public int searchCount(TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public TmServerDomain searchByKeyForChange(TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public TmServerDomain lockByKey(TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public TmServerDomain lockByKeyNoWait(TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#create(com.globaldenso.eca0027.core.auto.business.domain.TmServerDomain)
     */
    public void create(TmServerDomain domain) throws ApplicationException {
        tmServerDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#create(java.util.List)
     */
    public void create(List<TmServerDomain> domains) throws ApplicationException {
        for(TmServerDomain domain : domains) {
            tmServerDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#update(com.globaldenso.eca0027.core.auto.business.domain.TmServerDomain)
     */
    public int update(TmServerDomain domain) throws ApplicationException {
        return tmServerDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#update(java.util.List)
     */
    public int update(List<TmServerDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmServerDomain domain : domains) {
            updateCount += tmServerDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmServerDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public int updateByCondition(TmServerDomain domain, TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmServerDomain> domains, List<TmServerCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmServerDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public int delete(TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public int deleteByCondition(TmServerCriteriaDomain criteria) throws ApplicationException {
        return tmServerDao.deleteByCondition(criteria);
    }

}
