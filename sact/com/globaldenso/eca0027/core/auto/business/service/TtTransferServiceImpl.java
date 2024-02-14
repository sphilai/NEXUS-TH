/*
 * PROJECT：eca0027
 * 
 * TtTransfer のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;


/**
 * TtTransfer のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author: 100011638841 $
 * @version $Revision: 8158 $
 */
public class TtTransferServiceImpl implements TtTransferService {

    /**
     * ttTransferのDAO
     */
    private TtTransferDao ttTransferDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferServiceImpl() {
    }

    /**
     * ttTransferのDAOを設定します。
     * 
     * @param ttTransferDao ttTransferのDao
     */
    public void setTtTransferDao(TtTransferDao ttTransferDao) {
        this.ttTransferDao = ttTransferDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public TtTransferDomain searchByKey(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public List<TtTransferDomain> searchByCondition(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public List<TtTransferDomain> searchByConditionForPaging(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int searchCount(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public TtTransferDomain searchByKeyForChange(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public TtTransferDomain lockByKey(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public TtTransferDomain lockByKeyNoWait(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain)
     */
    public void create(TtTransferDomain domain) throws ApplicationException {
        ttTransferDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#create(java.util.List)
     */
    public void create(List<TtTransferDomain> domains) throws ApplicationException {
        for(TtTransferDomain domain : domains) {
            ttTransferDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain)
     */
    public int update(TtTransferDomain domain) throws ApplicationException {
        return ttTransferDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#update(java.util.List)
     */
    public int update(List<TtTransferDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtTransferDomain domain : domains) {
            updateCount += ttTransferDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int updateByCondition(TtTransferDomain domain, TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtTransferDomain> domains, List<TtTransferCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttTransferDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int delete(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int deleteByCondition(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferDao.deleteByCondition(criteria);
    }

}
