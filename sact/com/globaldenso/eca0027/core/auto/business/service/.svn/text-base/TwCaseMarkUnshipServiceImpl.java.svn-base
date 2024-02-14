/*
 * PROJECT：eca0027
 * 
 * TwCaseMarkUnship のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkUnshipDomain;


/**
 * TwCaseMarkUnship のService実装クラスです。<BR>
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
public class TwCaseMarkUnshipServiceImpl implements TwCaseMarkUnshipService {

    /**
     * twCaseMarkUnshipのDAO
     */
    private TwCaseMarkUnshipDao twCaseMarkUnshipDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwCaseMarkUnshipServiceImpl() {
    }

    /**
     * twCaseMarkUnshipのDAOを設定します。
     * 
     * @param twCaseMarkUnshipDao twCaseMarkUnshipのDao
     */
    public void setTwCaseMarkUnshipDao(TwCaseMarkUnshipDao twCaseMarkUnshipDao) {
        this.twCaseMarkUnshipDao = twCaseMarkUnshipDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public TwCaseMarkUnshipDomain searchByKey(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public List<TwCaseMarkUnshipDomain> searchByCondition(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public List<TwCaseMarkUnshipDomain> searchByConditionForPaging(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public int searchCount(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public TwCaseMarkUnshipDomain searchByKeyForChange(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public TwCaseMarkUnshipDomain lockByKey(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public TwCaseMarkUnshipDomain lockByKeyNoWait(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#create(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkUnshipDomain)
     */
    public void create(TwCaseMarkUnshipDomain domain) throws ApplicationException {
        twCaseMarkUnshipDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#create(java.util.List)
     */
    public void create(List<TwCaseMarkUnshipDomain> domains) throws ApplicationException {
        for(TwCaseMarkUnshipDomain domain : domains) {
            twCaseMarkUnshipDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#update(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkUnshipDomain)
     */
    public int update(TwCaseMarkUnshipDomain domain) throws ApplicationException {
        return twCaseMarkUnshipDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#update(java.util.List)
     */
    public int update(List<TwCaseMarkUnshipDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwCaseMarkUnshipDomain domain : domains) {
            updateCount += twCaseMarkUnshipDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkUnshipDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public int updateByCondition(TwCaseMarkUnshipDomain domain, TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwCaseMarkUnshipDomain> domains, List<TwCaseMarkUnshipCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twCaseMarkUnshipDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public int delete(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkUnshipService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public int deleteByCondition(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkUnshipDao.deleteByCondition(criteria);
    }

}
