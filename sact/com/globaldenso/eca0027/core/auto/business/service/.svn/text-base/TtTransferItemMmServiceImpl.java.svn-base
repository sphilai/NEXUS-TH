/*
 * PROJECT：eca0027
 * 
 * TtTransferItemMm のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemMmDomain;


/**
 * TtTransferItemMm のService実装クラスです。<BR>
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
public class TtTransferItemMmServiceImpl implements TtTransferItemMmService {

    /**
     * ttTransferItemMmのDAO
     */
    private TtTransferItemMmDao ttTransferItemMmDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferItemMmServiceImpl() {
    }

    /**
     * ttTransferItemMmのDAOを設定します。
     * 
     * @param ttTransferItemMmDao ttTransferItemMmのDao
     */
    public void setTtTransferItemMmDao(TtTransferItemMmDao ttTransferItemMmDao) {
        this.ttTransferItemMmDao = ttTransferItemMmDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public TtTransferItemMmDomain searchByKey(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public List<TtTransferItemMmDomain> searchByCondition(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public List<TtTransferItemMmDomain> searchByConditionForPaging(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public int searchCount(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public TtTransferItemMmDomain searchByKeyForChange(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public TtTransferItemMmDomain lockByKey(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public TtTransferItemMmDomain lockByKeyNoWait(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemMmDomain)
     */
    public void create(TtTransferItemMmDomain domain) throws ApplicationException {
        ttTransferItemMmDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#create(java.util.List)
     */
    public void create(List<TtTransferItemMmDomain> domains) throws ApplicationException {
        for(TtTransferItemMmDomain domain : domains) {
            ttTransferItemMmDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemMmDomain)
     */
    public int update(TtTransferItemMmDomain domain) throws ApplicationException {
        return ttTransferItemMmDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#update(java.util.List)
     */
    public int update(List<TtTransferItemMmDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtTransferItemMmDomain domain : domains) {
            updateCount += ttTransferItemMmDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemMmDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public int updateByCondition(TtTransferItemMmDomain domain, TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtTransferItemMmDomain> domains, List<TtTransferItemMmCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttTransferItemMmDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public int delete(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemMmService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public int deleteByCondition(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemMmDao.deleteByCondition(criteria);
    }

}
