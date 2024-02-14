/*
 * PROJECT：eca0027
 * 
 * TtTransferItemPltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain;


/**
 * TtTransferItemPltz のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TtTransferItemPltzServiceImpl implements TtTransferItemPltzService {

    /**
     * ttTransferItemPltzのDAO
     */
    private TtTransferItemPltzDao ttTransferItemPltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferItemPltzServiceImpl() {
    }

    /**
     * ttTransferItemPltzのDAOを設定します。
     * 
     * @param ttTransferItemPltzDao ttTransferItemPltzのDao
     */
    public void setTtTransferItemPltzDao(TtTransferItemPltzDao ttTransferItemPltzDao) {
        this.ttTransferItemPltzDao = ttTransferItemPltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public TtTransferItemPltzDomain searchByKey(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public List<TtTransferItemPltzDomain> searchByCondition(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public List<TtTransferItemPltzDomain> searchByConditionForPaging(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public int searchCount(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public TtTransferItemPltzDomain searchByKeyForChange(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public TtTransferItemPltzDomain lockByKey(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public TtTransferItemPltzDomain lockByKeyNoWait(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain)
     */
    public void create(TtTransferItemPltzDomain domain) throws ApplicationException {
        ttTransferItemPltzDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#create(java.util.List)
     */
    public void create(List<TtTransferItemPltzDomain> domains) throws ApplicationException {
        for(TtTransferItemPltzDomain domain : domains) {
            ttTransferItemPltzDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain)
     */
    public int update(TtTransferItemPltzDomain domain) throws ApplicationException {
        return ttTransferItemPltzDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#update(java.util.List)
     */
    public int update(List<TtTransferItemPltzDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtTransferItemPltzDomain domain : domains) {
            updateCount += ttTransferItemPltzDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public int updateByCondition(TtTransferItemPltzDomain domain, TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtTransferItemPltzDomain> domains, List<TtTransferItemPltzCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttTransferItemPltzDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public int delete(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public int deleteByCondition(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemPltzDao.deleteByCondition(criteria);
    }

}
