/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain;


/**
 * TtExpRequest のService実装クラスです。<BR>
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
public class TtExpRequestServiceImpl implements TtExpRequestService {

    /**
     * ttExpRequestのDAO
     */
    private TtExpRequestDao ttExpRequestDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestServiceImpl() {
    }

    /**
     * ttExpRequestのDAOを設定します。
     * 
     * @param ttExpRequestDao ttExpRequestのDao
     */
    public void setTtExpRequestDao(TtExpRequestDao ttExpRequestDao) {
        this.ttExpRequestDao = ttExpRequestDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public TtExpRequestDomain searchByKey(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public List<TtExpRequestDomain> searchByCondition(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public List<TtExpRequestDomain> searchByConditionForPaging(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public int searchCount(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public TtExpRequestDomain searchByKeyForChange(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public TtExpRequestDomain lockByKey(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public TtExpRequestDomain lockByKeyNoWait(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain)
     */
    public void create(TtExpRequestDomain domain) throws ApplicationException {
        ttExpRequestDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#create(java.util.List)
     */
    public void create(List<TtExpRequestDomain> domains) throws ApplicationException {
        for(TtExpRequestDomain domain : domains) {
            ttExpRequestDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain)
     */
    public int update(TtExpRequestDomain domain) throws ApplicationException {
        return ttExpRequestDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#update(java.util.List)
     */
    public int update(List<TtExpRequestDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtExpRequestDomain domain : domains) {
            updateCount += ttExpRequestDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestDomain domain, TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtExpRequestDomain> domains, List<TtExpRequestCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttExpRequestDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public int delete(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDao.deleteByCondition(criteria);
    }

}
