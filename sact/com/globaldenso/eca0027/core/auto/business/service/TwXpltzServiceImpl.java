/*
 * PROJECT：eca0027
 * 
 * TwXpltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain;


/**
 * TwXpltz のService実装クラスです。<BR>
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
public class TwXpltzServiceImpl implements TwXpltzService {

    /**
     * twXpltzのDAO
     */
    private TwXpltzDao twXpltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwXpltzServiceImpl() {
    }

    /**
     * twXpltzのDAOを設定します。
     * 
     * @param twXpltzDao twXpltzのDao
     */
    public void setTwXpltzDao(TwXpltzDao twXpltzDao) {
        this.twXpltzDao = twXpltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public TwXpltzDomain searchByKey(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public List<TwXpltzDomain> searchByCondition(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public List<TwXpltzDomain> searchByConditionForPaging(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public int searchCount(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public TwXpltzDomain searchByKeyForChange(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public TwXpltzDomain lockByKey(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public TwXpltzDomain lockByKeyNoWait(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#create(com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain)
     */
    public void create(TwXpltzDomain domain) throws ApplicationException {
        twXpltzDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#create(java.util.List)
     */
    public void create(List<TwXpltzDomain> domains) throws ApplicationException {
        for(TwXpltzDomain domain : domains) {
            twXpltzDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#update(com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain)
     */
    public int update(TwXpltzDomain domain) throws ApplicationException {
        return twXpltzDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#update(java.util.List)
     */
    public int update(List<TwXpltzDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwXpltzDomain domain : domains) {
            updateCount += twXpltzDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public int updateByCondition(TwXpltzDomain domain, TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwXpltzDomain> domains, List<TwXpltzCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twXpltzDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public int delete(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwXpltzService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public int deleteByCondition(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return twXpltzDao.deleteByCondition(criteria);
    }

}
