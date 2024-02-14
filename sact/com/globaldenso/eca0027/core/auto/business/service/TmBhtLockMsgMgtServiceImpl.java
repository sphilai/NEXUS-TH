/*
 * PROJECT：eca0027
 * 
 * TmBhtLockMsgMgt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain;


/**
 * TmBhtLockMsgMgt のService実装クラスです。<BR>
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
public class TmBhtLockMsgMgtServiceImpl implements TmBhtLockMsgMgtService {

    /**
     * tmBhtLockMsgMgtのDAO
     */
    private TmBhtLockMsgMgtDao tmBhtLockMsgMgtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmBhtLockMsgMgtServiceImpl() {
    }

    /**
     * tmBhtLockMsgMgtのDAOを設定します。
     * 
     * @param tmBhtLockMsgMgtDao tmBhtLockMsgMgtのDao
     */
    public void setTmBhtLockMsgMgtDao(TmBhtLockMsgMgtDao tmBhtLockMsgMgtDao) {
        this.tmBhtLockMsgMgtDao = tmBhtLockMsgMgtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public TmBhtLockMsgMgtDomain searchByKey(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public List<TmBhtLockMsgMgtDomain> searchByCondition(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public List<TmBhtLockMsgMgtDomain> searchByConditionForPaging(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public int searchCount(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public TmBhtLockMsgMgtDomain searchByKeyForChange(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public TmBhtLockMsgMgtDomain lockByKey(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public TmBhtLockMsgMgtDomain lockByKeyNoWait(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#create(com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain)
     */
    public void create(TmBhtLockMsgMgtDomain domain) throws ApplicationException {
        tmBhtLockMsgMgtDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#create(java.util.List)
     */
    public void create(List<TmBhtLockMsgMgtDomain> domains) throws ApplicationException {
        for(TmBhtLockMsgMgtDomain domain : domains) {
            tmBhtLockMsgMgtDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#update(com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain)
     */
    public int update(TmBhtLockMsgMgtDomain domain) throws ApplicationException {
        return tmBhtLockMsgMgtDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#update(java.util.List)
     */
    public int update(List<TmBhtLockMsgMgtDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmBhtLockMsgMgtDomain domain : domains) {
            updateCount += tmBhtLockMsgMgtDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public int updateByCondition(TmBhtLockMsgMgtDomain domain, TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmBhtLockMsgMgtDomain> domains, List<TmBhtLockMsgMgtCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmBhtLockMsgMgtDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public int delete(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public int deleteByCondition(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return tmBhtLockMsgMgtDao.deleteByCondition(criteria);
    }

}
