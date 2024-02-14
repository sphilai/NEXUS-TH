/*
 * PROJECT：eca0027
 * 
 * TtEdiRcvOdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/08/06  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrDomain;


/**
 * TtEdiRcvOdr のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/06 12:17:14<BR>
 * 
 * テーブル定義から2014/08/06に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TtEdiRcvOdrServiceImpl implements TtEdiRcvOdrService {

    /**
     * ttEdiRcvOdrのDAO
     */
    private TtEdiRcvOdrDao ttEdiRcvOdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtEdiRcvOdrServiceImpl() {
    }

    /**
     * ttEdiRcvOdrのDAOを設定します。
     * 
     * @param ttEdiRcvOdrDao ttEdiRcvOdrのDao
     */
    public void setTtEdiRcvOdrDao(TtEdiRcvOdrDao ttEdiRcvOdrDao) {
        this.ttEdiRcvOdrDao = ttEdiRcvOdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public TtEdiRcvOdrDomain searchByKey(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public List<TtEdiRcvOdrDomain> searchByCondition(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public List<TtEdiRcvOdrDomain> searchByConditionForPaging(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public int searchCount(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public TtEdiRcvOdrDomain searchByKeyForChange(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public TtEdiRcvOdrDomain lockByKey(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public TtEdiRcvOdrDomain lockByKeyNoWait(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#create(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrDomain)
     */
    public void create(TtEdiRcvOdrDomain domain) throws ApplicationException {
        ttEdiRcvOdrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#create(java.util.List)
     */
    public void create(List<TtEdiRcvOdrDomain> domains) throws ApplicationException {
        for(TtEdiRcvOdrDomain domain : domains) {
            ttEdiRcvOdrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrDomain)
     */
    public int update(TtEdiRcvOdrDomain domain) throws ApplicationException {
        return ttEdiRcvOdrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#update(java.util.List)
     */
    public int update(List<TtEdiRcvOdrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtEdiRcvOdrDomain domain : domains) {
            updateCount += ttEdiRcvOdrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public int updateByCondition(TtEdiRcvOdrDomain domain, TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtEdiRcvOdrDomain> domains, List<TtEdiRcvOdrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttEdiRcvOdrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public int delete(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public int deleteByCondition(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrDao.deleteByCondition(criteria);
    }

}
