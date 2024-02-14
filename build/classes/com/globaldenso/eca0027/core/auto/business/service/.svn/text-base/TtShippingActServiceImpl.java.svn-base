/*
 * PROJECT：eca0027
 * 
 * TtShippingAct のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain;


/**
 * TtShippingAct のService実装クラスです。<BR>
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
public class TtShippingActServiceImpl implements TtShippingActService {

    /**
     * ttShippingActのDAO
     */
    private TtShippingActDao ttShippingActDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtShippingActServiceImpl() {
    }

    /**
     * ttShippingActのDAOを設定します。
     * 
     * @param ttShippingActDao ttShippingActのDao
     */
    public void setTtShippingActDao(TtShippingActDao ttShippingActDao) {
        this.ttShippingActDao = ttShippingActDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public TtShippingActDomain searchByKey(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public List<TtShippingActDomain> searchByCondition(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public List<TtShippingActDomain> searchByConditionForPaging(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public int searchCount(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public TtShippingActDomain searchByKeyForChange(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public TtShippingActDomain lockByKey(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public TtShippingActDomain lockByKeyNoWait(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#create(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain)
     */
    public void create(TtShippingActDomain domain) throws ApplicationException {
        ttShippingActDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#create(java.util.List)
     */
    public void create(List<TtShippingActDomain> domains) throws ApplicationException {
        for(TtShippingActDomain domain : domains) {
            ttShippingActDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#update(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain)
     */
    public int update(TtShippingActDomain domain) throws ApplicationException {
        return ttShippingActDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#update(java.util.List)
     */
    public int update(List<TtShippingActDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtShippingActDomain domain : domains) {
            updateCount += ttShippingActDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public int updateByCondition(TtShippingActDomain domain, TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtShippingActDomain> domains, List<TtShippingActCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttShippingActDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public int delete(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public int deleteByCondition(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActDao.deleteByCondition(criteria);
    }

}
