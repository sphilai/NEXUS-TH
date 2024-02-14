/*
 * PROJECT：eca0027
 * 
 * TtInvoice のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;


/**
 * TtInvoice のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 10:26:05<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TtInvoiceServiceImpl implements TtInvoiceService {

    /**
     * ttInvoiceのDAO
     */
    private TtInvoiceDao ttInvoiceDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtInvoiceServiceImpl() {
    }

    /**
     * ttInvoiceのDAOを設定します。
     * 
     * @param ttInvoiceDao ttInvoiceのDao
     */
    public void setTtInvoiceDao(TtInvoiceDao ttInvoiceDao) {
        this.ttInvoiceDao = ttInvoiceDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public TtInvoiceDomain searchByKey(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public List<TtInvoiceDomain> searchByCondition(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public List<TtInvoiceDomain> searchByConditionForPaging(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public int searchCount(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public TtInvoiceDomain searchByKeyForChange(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public TtInvoiceDomain lockByKey(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public TtInvoiceDomain lockByKeyNoWait(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#create(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain)
     */
    public void create(TtInvoiceDomain domain) throws ApplicationException {
        ttInvoiceDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#create(java.util.List)
     */
    public void create(List<TtInvoiceDomain> domains) throws ApplicationException {
        for(TtInvoiceDomain domain : domains) {
            ttInvoiceDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#update(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain)
     */
    public int update(TtInvoiceDomain domain) throws ApplicationException {
        return ttInvoiceDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#update(java.util.List)
     */
    public int update(List<TtInvoiceDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtInvoiceDomain domain : domains) {
            updateCount += ttInvoiceDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public int updateByCondition(TtInvoiceDomain domain, TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtInvoiceDomain> domains, List<TtInvoiceCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttInvoiceDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public int delete(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public int deleteByCondition(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceDao.deleteByCondition(criteria);
    }

}
