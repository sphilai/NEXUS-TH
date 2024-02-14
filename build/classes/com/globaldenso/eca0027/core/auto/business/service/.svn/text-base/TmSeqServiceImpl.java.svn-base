/*
 * PROJECT：eca0027
 * 
 * TmSeq のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain;


/**
 * TmSeq のService実装クラスです。<BR>
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
public class TmSeqServiceImpl implements TmSeqService {

    /**
     * tmSeqのDAO
     */
    private TmSeqDao tmSeqDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmSeqServiceImpl() {
    }

    /**
     * tmSeqのDAOを設定します。
     * 
     * @param tmSeqDao tmSeqのDao
     */
    public void setTmSeqDao(TmSeqDao tmSeqDao) {
        this.tmSeqDao = tmSeqDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public TmSeqDomain searchByKey(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public List<TmSeqDomain> searchByCondition(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public List<TmSeqDomain> searchByConditionForPaging(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public int searchCount(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public TmSeqDomain searchByKeyForChange(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public TmSeqDomain lockByKey(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public TmSeqDomain lockByKeyNoWait(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#create(com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain)
     */
    public void create(TmSeqDomain domain) throws ApplicationException {
        tmSeqDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#create(java.util.List)
     */
    public void create(List<TmSeqDomain> domains) throws ApplicationException {
        for(TmSeqDomain domain : domains) {
            tmSeqDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#update(com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain)
     */
    public int update(TmSeqDomain domain) throws ApplicationException {
        return tmSeqDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#update(java.util.List)
     */
    public int update(List<TmSeqDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmSeqDomain domain : domains) {
            updateCount += tmSeqDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public int updateByCondition(TmSeqDomain domain, TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmSeqDomain> domains, List<TmSeqCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmSeqDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public int delete(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSeqService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public int deleteByCondition(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return tmSeqDao.deleteByCondition(criteria);
    }

}
