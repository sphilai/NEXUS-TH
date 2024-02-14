/*
 * PROJECT：eca0027
 * 
 * TwStgAct のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwStgActDomain;


/**
 * TwStgAct のService実装クラスです。<BR>
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
public class TwStgActServiceImpl implements TwStgActService {

    /**
     * twStgActのDAO
     */
    private TwStgActDao twStgActDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwStgActServiceImpl() {
    }

    /**
     * twStgActのDAOを設定します。
     * 
     * @param twStgActDao twStgActのDao
     */
    public void setTwStgActDao(TwStgActDao twStgActDao) {
        this.twStgActDao = twStgActDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public TwStgActDomain searchByKey(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public List<TwStgActDomain> searchByCondition(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public List<TwStgActDomain> searchByConditionForPaging(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public int searchCount(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public TwStgActDomain searchByKeyForChange(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public TwStgActDomain lockByKey(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public TwStgActDomain lockByKeyNoWait(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#create(com.globaldenso.eca0027.core.auto.business.domain.TwStgActDomain)
     */
    public void create(TwStgActDomain domain) throws ApplicationException {
        twStgActDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#create(java.util.List)
     */
    public void create(List<TwStgActDomain> domains) throws ApplicationException {
        for(TwStgActDomain domain : domains) {
            twStgActDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#update(com.globaldenso.eca0027.core.auto.business.domain.TwStgActDomain)
     */
    public int update(TwStgActDomain domain) throws ApplicationException {
        return twStgActDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#update(java.util.List)
     */
    public int update(List<TwStgActDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwStgActDomain domain : domains) {
            updateCount += twStgActDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwStgActDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public int updateByCondition(TwStgActDomain domain, TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwStgActDomain> domains, List<TwStgActCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twStgActDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public int delete(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgActService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public int deleteByCondition(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return twStgActDao.deleteByCondition(criteria);
    }

}
