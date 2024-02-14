/*
 * PROJECT：eca0027
 * 
 * TtBhtWorkErr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/14  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain;


/**
 * TtBhtWorkErr のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/14 15:07:43<BR>
 * 
 * テーブル定義から2014/06/14に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtBhtWorkErrServiceImpl implements TtBhtWorkErrService {

    /**
     * ttBhtWorkErrのDAO
     */
    private TtBhtWorkErrDao ttBhtWorkErrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtBhtWorkErrServiceImpl() {
    }

    /**
     * ttBhtWorkErrのDAOを設定します。
     * 
     * @param ttBhtWorkErrDao ttBhtWorkErrのDao
     */
    public void setTtBhtWorkErrDao(TtBhtWorkErrDao ttBhtWorkErrDao) {
        this.ttBhtWorkErrDao = ttBhtWorkErrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public TtBhtWorkErrDomain searchByKey(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public List<TtBhtWorkErrDomain> searchByCondition(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public List<TtBhtWorkErrDomain> searchByConditionForPaging(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public int searchCount(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public TtBhtWorkErrDomain searchByKeyForChange(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public TtBhtWorkErrDomain lockByKey(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public TtBhtWorkErrDomain lockByKeyNoWait(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#create(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain)
     */
    public void create(TtBhtWorkErrDomain domain) throws ApplicationException {
        ttBhtWorkErrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#create(java.util.List)
     */
    public void create(List<TtBhtWorkErrDomain> domains) throws ApplicationException {
        for(TtBhtWorkErrDomain domain : domains) {
            ttBhtWorkErrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain)
     */
    public int update(TtBhtWorkErrDomain domain) throws ApplicationException {
        return ttBhtWorkErrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#update(java.util.List)
     */
    public int update(List<TtBhtWorkErrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtBhtWorkErrDomain domain : domains) {
            updateCount += ttBhtWorkErrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public int updateByCondition(TtBhtWorkErrDomain domain, TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtBhtWorkErrDomain> domains, List<TtBhtWorkErrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttBhtWorkErrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public int delete(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public int deleteByCondition(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkErrDao.deleteByCondition(criteria);
    }

}
