/*
 * PROJECT：eca0027
 * 
 * TmCd のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCdDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain;


/**
 * TmCd のService実装クラスです。<BR>
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
public class TmCdServiceImpl implements TmCdService {

    /**
     * tmCdのDAO
     */
    private TmCdDao tmCdDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCdServiceImpl() {
    }

    /**
     * tmCdのDAOを設定します。
     * 
     * @param tmCdDao tmCdのDao
     */
    public void setTmCdDao(TmCdDao tmCdDao) {
        this.tmCdDao = tmCdDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public TmCdDomain searchByKey(TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public List<TmCdDomain> searchByCondition(TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public List<TmCdDomain> searchByConditionForPaging(TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public int searchCount(TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public TmCdDomain searchByKeyForChange(TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public TmCdDomain lockByKey(TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public TmCdDomain lockByKeyNoWait(TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain)
     */
    public void create(TmCdDomain domain) throws ApplicationException {
        tmCdDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#create(java.util.List)
     */
    public void create(List<TmCdDomain> domains) throws ApplicationException {
        for(TmCdDomain domain : domains) {
            tmCdDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain)
     */
    public int update(TmCdDomain domain) throws ApplicationException {
        return tmCdDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#update(java.util.List)
     */
    public int update(List<TmCdDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCdDomain domain : domains) {
            updateCount += tmCdDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public int updateByCondition(TmCdDomain domain, TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCdDomain> domains, List<TmCdCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCdDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public int delete(TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCdService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public int deleteByCondition(TmCdCriteriaDomain criteria) throws ApplicationException {
        return tmCdDao.deleteByCondition(criteria);
    }

}
