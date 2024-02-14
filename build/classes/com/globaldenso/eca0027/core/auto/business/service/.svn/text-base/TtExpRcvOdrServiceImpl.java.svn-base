/*
 * PROJECT：eca0027
 * 
 * TtExpRcvOdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;


/**
 * TtExpRcvOdr のService実装クラスです。<BR>
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
public class TtExpRcvOdrServiceImpl implements TtExpRcvOdrService {

    /**
     * ttExpRcvOdrのDAO
     */
    private TtExpRcvOdrDao ttExpRcvOdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRcvOdrServiceImpl() {
    }

    /**
     * ttExpRcvOdrのDAOを設定します。
     * 
     * @param ttExpRcvOdrDao ttExpRcvOdrのDao
     */
    public void setTtExpRcvOdrDao(TtExpRcvOdrDao ttExpRcvOdrDao) {
        this.ttExpRcvOdrDao = ttExpRcvOdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public TtExpRcvOdrDomain searchByKey(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public List<TtExpRcvOdrDomain> searchByCondition(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public List<TtExpRcvOdrDomain> searchByConditionForPaging(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public int searchCount(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public TtExpRcvOdrDomain searchByKeyForChange(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public TtExpRcvOdrDomain lockByKey(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public TtExpRcvOdrDomain lockByKeyNoWait(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain)
     */
    public void create(TtExpRcvOdrDomain domain) throws ApplicationException {
        ttExpRcvOdrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#create(java.util.List)
     */
    public void create(List<TtExpRcvOdrDomain> domains) throws ApplicationException {
        for(TtExpRcvOdrDomain domain : domains) {
            ttExpRcvOdrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain)
     */
    public int update(TtExpRcvOdrDomain domain) throws ApplicationException {
        return ttExpRcvOdrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#update(java.util.List)
     */
    public int update(List<TtExpRcvOdrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtExpRcvOdrDomain domain : domains) {
            updateCount += ttExpRcvOdrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public int updateByCondition(TtExpRcvOdrDomain domain, TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtExpRcvOdrDomain> domains, List<TtExpRcvOdrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttExpRcvOdrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public int delete(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public int deleteByCondition(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrDao.deleteByCondition(criteria);
    }

}
