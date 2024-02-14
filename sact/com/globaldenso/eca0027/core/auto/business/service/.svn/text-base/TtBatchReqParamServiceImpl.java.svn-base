/*
 * PROJECT：eca0027
 * 
 * TtBatchReqParam のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain;


/**
 * TtBatchReqParam のService実装クラスです。<BR>
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
public class TtBatchReqParamServiceImpl implements TtBatchReqParamService {

    /**
     * ttBatchReqParamのDAO
     */
    private TtBatchReqParamDao ttBatchReqParamDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtBatchReqParamServiceImpl() {
    }

    /**
     * ttBatchReqParamのDAOを設定します。
     * 
     * @param ttBatchReqParamDao ttBatchReqParamのDao
     */
    public void setTtBatchReqParamDao(TtBatchReqParamDao ttBatchReqParamDao) {
        this.ttBatchReqParamDao = ttBatchReqParamDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public TtBatchReqParamDomain searchByKey(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public List<TtBatchReqParamDomain> searchByCondition(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public List<TtBatchReqParamDomain> searchByConditionForPaging(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public int searchCount(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public TtBatchReqParamDomain searchByKeyForChange(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public TtBatchReqParamDomain lockByKey(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public TtBatchReqParamDomain lockByKeyNoWait(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#create(com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain)
     */
    public void create(TtBatchReqParamDomain domain) throws ApplicationException {
        ttBatchReqParamDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#create(java.util.List)
     */
    public void create(List<TtBatchReqParamDomain> domains) throws ApplicationException {
        for(TtBatchReqParamDomain domain : domains) {
            ttBatchReqParamDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#update(com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain)
     */
    public int update(TtBatchReqParamDomain domain) throws ApplicationException {
        return ttBatchReqParamDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#update(java.util.List)
     */
    public int update(List<TtBatchReqParamDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtBatchReqParamDomain domain : domains) {
            updateCount += ttBatchReqParamDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public int updateByCondition(TtBatchReqParamDomain domain, TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtBatchReqParamDomain> domains, List<TtBatchReqParamCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttBatchReqParamDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public int delete(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public int deleteByCondition(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return ttBatchReqParamDao.deleteByCondition(criteria);
    }

}
