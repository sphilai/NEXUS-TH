/*
 * PROJECT：eca0027
 * 
 * TwMixtag のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain;


/**
 * TwMixtag のService実装クラスです。<BR>
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
public class TwMixtagServiceImpl implements TwMixtagService {

    /**
     * twMixtagのDAO
     */
    private TwMixtagDao twMixtagDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwMixtagServiceImpl() {
    }

    /**
     * twMixtagのDAOを設定します。
     * 
     * @param twMixtagDao twMixtagのDao
     */
    public void setTwMixtagDao(TwMixtagDao twMixtagDao) {
        this.twMixtagDao = twMixtagDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public TwMixtagDomain searchByKey(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public List<TwMixtagDomain> searchByCondition(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public List<TwMixtagDomain> searchByConditionForPaging(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public int searchCount(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public TwMixtagDomain searchByKeyForChange(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public TwMixtagDomain lockByKey(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public TwMixtagDomain lockByKeyNoWait(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#create(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain)
     */
    public void create(TwMixtagDomain domain) throws ApplicationException {
        twMixtagDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#create(java.util.List)
     */
    public void create(List<TwMixtagDomain> domains) throws ApplicationException {
        for(TwMixtagDomain domain : domains) {
            twMixtagDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#update(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain)
     */
    public int update(TwMixtagDomain domain) throws ApplicationException {
        return twMixtagDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#update(java.util.List)
     */
    public int update(List<TwMixtagDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwMixtagDomain domain : domains) {
            updateCount += twMixtagDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public int updateByCondition(TwMixtagDomain domain, TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwMixtagDomain> domains, List<TwMixtagCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twMixtagDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public int delete(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public int deleteByCondition(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return twMixtagDao.deleteByCondition(criteria);
    }

}
