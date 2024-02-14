/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain;


/**
 * TtExpRequestDtl のService実装クラスです。<BR>
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
public class TtExpRequestDtlServiceImpl implements TtExpRequestDtlService {

    /**
     * ttExpRequestDtlのDAO
     */
    private TtExpRequestDtlDao ttExpRequestDtlDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestDtlServiceImpl() {
    }

    /**
     * ttExpRequestDtlのDAOを設定します。
     * 
     * @param ttExpRequestDtlDao ttExpRequestDtlのDao
     */
    public void setTtExpRequestDtlDao(TtExpRequestDtlDao ttExpRequestDtlDao) {
        this.ttExpRequestDtlDao = ttExpRequestDtlDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public TtExpRequestDtlDomain searchByKey(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public List<TtExpRequestDtlDomain> searchByCondition(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public List<TtExpRequestDtlDomain> searchByConditionForPaging(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public int searchCount(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public TtExpRequestDtlDomain searchByKeyForChange(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public TtExpRequestDtlDomain lockByKey(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public TtExpRequestDtlDomain lockByKeyNoWait(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain)
     */
    public void create(TtExpRequestDtlDomain domain) throws ApplicationException {
        ttExpRequestDtlDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#create(java.util.List)
     */
    public void create(List<TtExpRequestDtlDomain> domains) throws ApplicationException {
        for(TtExpRequestDtlDomain domain : domains) {
            ttExpRequestDtlDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain)
     */
    public int update(TtExpRequestDtlDomain domain) throws ApplicationException {
        return ttExpRequestDtlDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#update(java.util.List)
     */
    public int update(List<TtExpRequestDtlDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtExpRequestDtlDomain domain : domains) {
            updateCount += ttExpRequestDtlDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestDtlDomain domain, TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtExpRequestDtlDomain> domains, List<TtExpRequestDtlCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttExpRequestDtlDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public int delete(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlDao.deleteByCondition(criteria);
    }

}
