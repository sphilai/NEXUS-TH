/*
 * PROJECT：eca0027
 * 
 * TmInvSeq のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain;


/**
 * TmInvSeq のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/17 23:10:14<BR>
 * 
 * テーブル定義から2014/04/17に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmInvSeqServiceImpl implements TmInvSeqService {

    /**
     * tmInvSeqのDAO
     */
    private TmInvSeqDao tmInvSeqDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvSeqServiceImpl() {
    }

    /**
     * tmInvSeqのDAOを設定します。
     * 
     * @param tmInvSeqDao tmInvSeqのDao
     */
    public void setTmInvSeqDao(TmInvSeqDao tmInvSeqDao) {
        this.tmInvSeqDao = tmInvSeqDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public TmInvSeqDomain searchByKey(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public List<TmInvSeqDomain> searchByCondition(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public List<TmInvSeqDomain> searchByConditionForPaging(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public int searchCount(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public TmInvSeqDomain searchByKeyForChange(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public TmInvSeqDomain lockByKey(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public TmInvSeqDomain lockByKeyNoWait(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain)
     */
    public void create(TmInvSeqDomain domain) throws ApplicationException {
        tmInvSeqDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#create(java.util.List)
     */
    public void create(List<TmInvSeqDomain> domains) throws ApplicationException {
        for(TmInvSeqDomain domain : domains) {
            tmInvSeqDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain)
     */
    public int update(TmInvSeqDomain domain) throws ApplicationException {
        return tmInvSeqDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#update(java.util.List)
     */
    public int update(List<TmInvSeqDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmInvSeqDomain domain : domains) {
            updateCount += tmInvSeqDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public int updateByCondition(TmInvSeqDomain domain, TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmInvSeqDomain> domains, List<TmInvSeqCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmInvSeqDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public int delete(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public int deleteByCondition(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return tmInvSeqDao.deleteByCondition(criteria);
    }

}
