/*
 * PROJECT：eca0027
 * 
 * TtCmlErrorHeader のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;


/**
 * TtCmlErrorHeader のService実装クラスです。<BR>
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
public class TtCmlErrorHeaderServiceImpl implements TtCmlErrorHeaderService {

    /**
     * ttCmlErrorHeaderのDAO
     */
    private TtCmlErrorHeaderDao ttCmlErrorHeaderDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtCmlErrorHeaderServiceImpl() {
    }

    /**
     * ttCmlErrorHeaderのDAOを設定します。
     * 
     * @param ttCmlErrorHeaderDao ttCmlErrorHeaderのDao
     */
    public void setTtCmlErrorHeaderDao(TtCmlErrorHeaderDao ttCmlErrorHeaderDao) {
        this.ttCmlErrorHeaderDao = ttCmlErrorHeaderDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public TtCmlErrorHeaderDomain searchByKey(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public List<TtCmlErrorHeaderDomain> searchByCondition(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public List<TtCmlErrorHeaderDomain> searchByConditionForPaging(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public int searchCount(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public TtCmlErrorHeaderDomain searchByKeyForChange(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public TtCmlErrorHeaderDomain lockByKey(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public TtCmlErrorHeaderDomain lockByKeyNoWait(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#create(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain)
     */
    public void create(TtCmlErrorHeaderDomain domain) throws ApplicationException {
        ttCmlErrorHeaderDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#create(java.util.List)
     */
    public void create(List<TtCmlErrorHeaderDomain> domains) throws ApplicationException {
        for(TtCmlErrorHeaderDomain domain : domains) {
            ttCmlErrorHeaderDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#update(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain)
     */
    public int update(TtCmlErrorHeaderDomain domain) throws ApplicationException {
        return ttCmlErrorHeaderDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#update(java.util.List)
     */
    public int update(List<TtCmlErrorHeaderDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtCmlErrorHeaderDomain domain : domains) {
            updateCount += ttCmlErrorHeaderDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public int updateByCondition(TtCmlErrorHeaderDomain domain, TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtCmlErrorHeaderDomain> domains, List<TtCmlErrorHeaderCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttCmlErrorHeaderDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public int delete(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public int deleteByCondition(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttCmlErrorHeaderDao.deleteByCondition(criteria);
    }

}
