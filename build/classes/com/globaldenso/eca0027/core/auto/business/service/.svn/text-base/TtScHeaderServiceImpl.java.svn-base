/*
 * PROJECT：eca0027
 * 
 * TtScHeader のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain;


/**
 * TtScHeader のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 14:43:17<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TtScHeaderServiceImpl implements TtScHeaderService {

    /**
     * ttScHeaderのDAO
     */
    private TtScHeaderDao ttScHeaderDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtScHeaderServiceImpl() {
    }

    /**
     * ttScHeaderのDAOを設定します。
     * 
     * @param ttScHeaderDao ttScHeaderのDao
     */
    public void setTtScHeaderDao(TtScHeaderDao ttScHeaderDao) {
        this.ttScHeaderDao = ttScHeaderDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public TtScHeaderDomain searchByKey(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public List<TtScHeaderDomain> searchByCondition(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public List<TtScHeaderDomain> searchByConditionForPaging(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public int searchCount(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public TtScHeaderDomain searchByKeyForChange(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public TtScHeaderDomain lockByKey(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public TtScHeaderDomain lockByKeyNoWait(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#create(com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain)
     */
    public void create(TtScHeaderDomain domain) throws ApplicationException {
        ttScHeaderDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#create(java.util.List)
     */
    public void create(List<TtScHeaderDomain> domains) throws ApplicationException {
        for(TtScHeaderDomain domain : domains) {
            ttScHeaderDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#update(com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain)
     */
    public int update(TtScHeaderDomain domain) throws ApplicationException {
        return ttScHeaderDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#update(java.util.List)
     */
    public int update(List<TtScHeaderDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtScHeaderDomain domain : domains) {
            updateCount += ttScHeaderDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public int updateByCondition(TtScHeaderDomain domain, TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtScHeaderDomain> domains, List<TtScHeaderCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttScHeaderDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public int delete(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public int deleteByCondition(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttScHeaderDao.deleteByCondition(criteria);
    }

}
