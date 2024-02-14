/*
 * PROJECT：eca0027
 * 
 * TtEdiRcvOdrRtry のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/08/06  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain;


/**
 * TtEdiRcvOdrRtry のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/06 12:17:14<BR>
 * 
 * テーブル定義から2014/08/06に自動生成したモジュールです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7336 $
 */
public class TtEdiRcvOdrRtryServiceImpl implements TtEdiRcvOdrRtryService {

    /**
     * ttEdiRcvOdrRtryのDAO
     */
    private TtEdiRcvOdrRtryDao ttEdiRcvOdrRtryDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtEdiRcvOdrRtryServiceImpl() {
    }

    /**
     * ttEdiRcvOdrRtryのDAOを設定します。
     * 
     * @param ttEdiRcvOdrRtryDao ttEdiRcvOdrRtryのDao
     */
    public void setTtEdiRcvOdrRtryDao(TtEdiRcvOdrRtryDao ttEdiRcvOdrRtryDao) {
        this.ttEdiRcvOdrRtryDao = ttEdiRcvOdrRtryDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public TtEdiRcvOdrRtryDomain searchByKey(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public List<TtEdiRcvOdrRtryDomain> searchByCondition(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public List<TtEdiRcvOdrRtryDomain> searchByConditionForPaging(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public int searchCount(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public TtEdiRcvOdrRtryDomain searchByKeyForChange(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public TtEdiRcvOdrRtryDomain lockByKey(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public TtEdiRcvOdrRtryDomain lockByKeyNoWait(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#create(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain)
     */
    public void create(TtEdiRcvOdrRtryDomain domain) throws ApplicationException {
        ttEdiRcvOdrRtryDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#create(java.util.List)
     */
    public void create(List<TtEdiRcvOdrRtryDomain> domains) throws ApplicationException {
        for(TtEdiRcvOdrRtryDomain domain : domains) {
            ttEdiRcvOdrRtryDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#update(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain)
     */
    public int update(TtEdiRcvOdrRtryDomain domain) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#update(java.util.List)
     */
    public int update(List<TtEdiRcvOdrRtryDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtEdiRcvOdrRtryDomain domain : domains) {
            updateCount += ttEdiRcvOdrRtryDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public int updateByCondition(TtEdiRcvOdrRtryDomain domain, TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtEdiRcvOdrRtryDomain> domains, List<TtEdiRcvOdrRtryCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttEdiRcvOdrRtryDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public int delete(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public int deleteByCondition(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrRtryDao.deleteByCondition(criteria);
    }

}
