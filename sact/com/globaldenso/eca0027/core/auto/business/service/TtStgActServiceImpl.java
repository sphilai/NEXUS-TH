/*
 * PROJECT：eca0027
 * 
 * TtStgAct のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain;


/**
 * TtStgAct のService実装クラスです。<BR>
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
public class TtStgActServiceImpl implements TtStgActService {

    /**
     * ttStgActのDAO
     */
    private TtStgActDao ttStgActDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtStgActServiceImpl() {
    }

    /**
     * ttStgActのDAOを設定します。
     * 
     * @param ttStgActDao ttStgActのDao
     */
    public void setTtStgActDao(TtStgActDao ttStgActDao) {
        this.ttStgActDao = ttStgActDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public TtStgActDomain searchByKey(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public List<TtStgActDomain> searchByCondition(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public List<TtStgActDomain> searchByConditionForPaging(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public int searchCount(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public TtStgActDomain searchByKeyForChange(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public TtStgActDomain lockByKey(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public TtStgActDomain lockByKeyNoWait(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#create(com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain)
     */
    public void create(TtStgActDomain domain) throws ApplicationException {
        ttStgActDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#create(java.util.List)
     */
    public void create(List<TtStgActDomain> domains) throws ApplicationException {
        for(TtStgActDomain domain : domains) {
            ttStgActDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#update(com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain)
     */
    public int update(TtStgActDomain domain) throws ApplicationException {
        return ttStgActDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#update(java.util.List)
     */
    public int update(List<TtStgActDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtStgActDomain domain : domains) {
            updateCount += ttStgActDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public int updateByCondition(TtStgActDomain domain, TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtStgActDomain> domains, List<TtStgActCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttStgActDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public int delete(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgActService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public int deleteByCondition(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return ttStgActDao.deleteByCondition(criteria);
    }

}
