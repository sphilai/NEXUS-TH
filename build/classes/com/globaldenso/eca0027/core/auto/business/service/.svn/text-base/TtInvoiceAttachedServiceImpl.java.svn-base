/*
 * PROJECT：eca0027
 * 
 * TtInvoiceAttached のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain;


/**
 * TtInvoiceAttached のService実装クラスです。<BR>
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
public class TtInvoiceAttachedServiceImpl implements TtInvoiceAttachedService {

    /**
     * ttInvoiceAttachedのDAO
     */
    private TtInvoiceAttachedDao ttInvoiceAttachedDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtInvoiceAttachedServiceImpl() {
    }

    /**
     * ttInvoiceAttachedのDAOを設定します。
     * 
     * @param ttInvoiceAttachedDao ttInvoiceAttachedのDao
     */
    public void setTtInvoiceAttachedDao(TtInvoiceAttachedDao ttInvoiceAttachedDao) {
        this.ttInvoiceAttachedDao = ttInvoiceAttachedDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public TtInvoiceAttachedDomain searchByKey(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public List<TtInvoiceAttachedDomain> searchByCondition(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public List<TtInvoiceAttachedDomain> searchByConditionForPaging(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public int searchCount(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public TtInvoiceAttachedDomain searchByKeyForChange(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public TtInvoiceAttachedDomain lockByKey(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public TtInvoiceAttachedDomain lockByKeyNoWait(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#create(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain)
     */
    public void create(TtInvoiceAttachedDomain domain) throws ApplicationException {
        ttInvoiceAttachedDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#create(java.util.List)
     */
    public void create(List<TtInvoiceAttachedDomain> domains) throws ApplicationException {
        for(TtInvoiceAttachedDomain domain : domains) {
            ttInvoiceAttachedDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#update(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain)
     */
    public int update(TtInvoiceAttachedDomain domain) throws ApplicationException {
        return ttInvoiceAttachedDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#update(java.util.List)
     */
    public int update(List<TtInvoiceAttachedDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtInvoiceAttachedDomain domain : domains) {
            updateCount += ttInvoiceAttachedDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public int updateByCondition(TtInvoiceAttachedDomain domain, TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtInvoiceAttachedDomain> domains, List<TtInvoiceAttachedCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttInvoiceAttachedDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public int delete(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public int deleteByCondition(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceAttachedDao.deleteByCondition(criteria);
    }

}
