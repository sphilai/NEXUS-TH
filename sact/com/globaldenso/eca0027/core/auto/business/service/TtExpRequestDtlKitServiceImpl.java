/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtlKit のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain;


/**
 * TtExpRequestDtlKit のService実装クラスです。<BR>
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
public class TtExpRequestDtlKitServiceImpl implements TtExpRequestDtlKitService {

    /**
     * ttExpRequestDtlKitのDAO
     */
    private TtExpRequestDtlKitDao ttExpRequestDtlKitDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestDtlKitServiceImpl() {
    }

    /**
     * ttExpRequestDtlKitのDAOを設定します。
     * 
     * @param ttExpRequestDtlKitDao ttExpRequestDtlKitのDao
     */
    public void setTtExpRequestDtlKitDao(TtExpRequestDtlKitDao ttExpRequestDtlKitDao) {
        this.ttExpRequestDtlKitDao = ttExpRequestDtlKitDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public TtExpRequestDtlKitDomain searchByKey(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public List<TtExpRequestDtlKitDomain> searchByCondition(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public List<TtExpRequestDtlKitDomain> searchByConditionForPaging(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public int searchCount(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public TtExpRequestDtlKitDomain searchByKeyForChange(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public TtExpRequestDtlKitDomain lockByKey(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public TtExpRequestDtlKitDomain lockByKeyNoWait(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain)
     */
    public void create(TtExpRequestDtlKitDomain domain) throws ApplicationException {
        ttExpRequestDtlKitDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#create(java.util.List)
     */
    public void create(List<TtExpRequestDtlKitDomain> domains) throws ApplicationException {
        for(TtExpRequestDtlKitDomain domain : domains) {
            ttExpRequestDtlKitDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain)
     */
    public int update(TtExpRequestDtlKitDomain domain) throws ApplicationException {
        return ttExpRequestDtlKitDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#update(java.util.List)
     */
    public int update(List<TtExpRequestDtlKitDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtExpRequestDtlKitDomain domain : domains) {
            updateCount += ttExpRequestDtlKitDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestDtlKitDomain domain, TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtExpRequestDtlKitDomain> domains, List<TtExpRequestDtlKitCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttExpRequestDtlKitDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public int delete(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlKitDao.deleteByCondition(criteria);
    }

}
