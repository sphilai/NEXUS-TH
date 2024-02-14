/*
 * PROJECT：eca0027
 * 
 * TtBhtWorkTime のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/14  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain;


/**
 * TtBhtWorkTime のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/14 11:34:01<BR>
 * 
 * テーブル定義から2014/06/14に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtBhtWorkTimeServiceImpl implements TtBhtWorkTimeService {

    /**
     * ttBhtWorkTimeのDAO
     */
    private TtBhtWorkTimeDao ttBhtWorkTimeDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtBhtWorkTimeServiceImpl() {
    }

    /**
     * ttBhtWorkTimeのDAOを設定します。
     * 
     * @param ttBhtWorkTimeDao ttBhtWorkTimeのDao
     */
    public void setTtBhtWorkTimeDao(TtBhtWorkTimeDao ttBhtWorkTimeDao) {
        this.ttBhtWorkTimeDao = ttBhtWorkTimeDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public TtBhtWorkTimeDomain searchByKey(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public List<TtBhtWorkTimeDomain> searchByCondition(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public List<TtBhtWorkTimeDomain> searchByConditionForPaging(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public int searchCount(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public TtBhtWorkTimeDomain searchByKeyForChange(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public TtBhtWorkTimeDomain lockByKey(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public TtBhtWorkTimeDomain lockByKeyNoWait(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#create(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain)
     */
    public void create(TtBhtWorkTimeDomain domain) throws ApplicationException {
        ttBhtWorkTimeDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#create(java.util.List)
     */
    public void create(List<TtBhtWorkTimeDomain> domains) throws ApplicationException {
        for(TtBhtWorkTimeDomain domain : domains) {
            ttBhtWorkTimeDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#update(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain)
     */
    public int update(TtBhtWorkTimeDomain domain) throws ApplicationException {
        return ttBhtWorkTimeDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#update(java.util.List)
     */
    public int update(List<TtBhtWorkTimeDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtBhtWorkTimeDomain domain : domains) {
            updateCount += ttBhtWorkTimeDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public int updateByCondition(TtBhtWorkTimeDomain domain, TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtBhtWorkTimeDomain> domains, List<TtBhtWorkTimeCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttBhtWorkTimeDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public int delete(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public int deleteByCondition(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkTimeDao.deleteByCondition(criteria);
    }

}
