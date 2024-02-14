/*
 * PROJECT：eca0027
 * 
 * TwTransferItemMm のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemMmDomain;


/**
 * TwTransferItemMm のService実装クラスです。<BR>
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
public class TwTransferItemMmServiceImpl implements TwTransferItemMmService {

    /**
     * twTransferItemMmのDAO
     */
    private TwTransferItemMmDao twTransferItemMmDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwTransferItemMmServiceImpl() {
    }

    /**
     * twTransferItemMmのDAOを設定します。
     * 
     * @param twTransferItemMmDao twTransferItemMmのDao
     */
    public void setTwTransferItemMmDao(TwTransferItemMmDao twTransferItemMmDao) {
        this.twTransferItemMmDao = twTransferItemMmDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public TwTransferItemMmDomain searchByKey(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public List<TwTransferItemMmDomain> searchByCondition(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public List<TwTransferItemMmDomain> searchByConditionForPaging(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public int searchCount(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public TwTransferItemMmDomain searchByKeyForChange(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public TwTransferItemMmDomain lockByKey(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public TwTransferItemMmDomain lockByKeyNoWait(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#create(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemMmDomain)
     */
    public void create(TwTransferItemMmDomain domain) throws ApplicationException {
        twTransferItemMmDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#create(java.util.List)
     */
    public void create(List<TwTransferItemMmDomain> domains) throws ApplicationException {
        for(TwTransferItemMmDomain domain : domains) {
            twTransferItemMmDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#update(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemMmDomain)
     */
    public int update(TwTransferItemMmDomain domain) throws ApplicationException {
        return twTransferItemMmDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#update(java.util.List)
     */
    public int update(List<TwTransferItemMmDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwTransferItemMmDomain domain : domains) {
            updateCount += twTransferItemMmDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemMmDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public int updateByCondition(TwTransferItemMmDomain domain, TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwTransferItemMmDomain> domains, List<TwTransferItemMmCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twTransferItemMmDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public int delete(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemMmService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public int deleteByCondition(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemMmDao.deleteByCondition(criteria);
    }

}
