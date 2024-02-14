/*
 * PROJECT：eca0027
 * 
 * TtCmlErrorDtl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain;


/**
 * TtCmlErrorDtl のService実装クラスです。<BR>
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
public class TtCmlErrorDtlServiceImpl implements TtCmlErrorDtlService {

    /**
     * ttCmlErrorDtlのDAO
     */
    private TtCmlErrorDtlDao ttCmlErrorDtlDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtCmlErrorDtlServiceImpl() {
    }

    /**
     * ttCmlErrorDtlのDAOを設定します。
     * 
     * @param ttCmlErrorDtlDao ttCmlErrorDtlのDao
     */
    public void setTtCmlErrorDtlDao(TtCmlErrorDtlDao ttCmlErrorDtlDao) {
        this.ttCmlErrorDtlDao = ttCmlErrorDtlDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public TtCmlErrorDtlDomain searchByKey(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public List<TtCmlErrorDtlDomain> searchByCondition(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public List<TtCmlErrorDtlDomain> searchByConditionForPaging(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public int searchCount(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public TtCmlErrorDtlDomain searchByKeyForChange(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public TtCmlErrorDtlDomain lockByKey(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public TtCmlErrorDtlDomain lockByKeyNoWait(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#create(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain)
     */
    public void create(TtCmlErrorDtlDomain domain) throws ApplicationException {
        ttCmlErrorDtlDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#create(java.util.List)
     */
    public void create(List<TtCmlErrorDtlDomain> domains) throws ApplicationException {
        for(TtCmlErrorDtlDomain domain : domains) {
            ttCmlErrorDtlDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#update(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain)
     */
    public int update(TtCmlErrorDtlDomain domain) throws ApplicationException {
        return ttCmlErrorDtlDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#update(java.util.List)
     */
    public int update(List<TtCmlErrorDtlDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtCmlErrorDtlDomain domain : domains) {
            updateCount += ttCmlErrorDtlDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public int updateByCondition(TtCmlErrorDtlDomain domain, TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtCmlErrorDtlDomain> domains, List<TtCmlErrorDtlCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttCmlErrorDtlDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public int delete(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public int deleteByCondition(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorDtlDao.deleteByCondition(criteria);
    }

}
