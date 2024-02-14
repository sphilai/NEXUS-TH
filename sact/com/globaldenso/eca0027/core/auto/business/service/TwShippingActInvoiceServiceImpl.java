/*
 * PROJECT：eca0027
 * 
 * TwShippingActInvoice のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain;


/**
 * TwShippingActInvoice のService実装クラスです。<BR>
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
public class TwShippingActInvoiceServiceImpl implements TwShippingActInvoiceService {

    /**
     * twShippingActInvoiceのDAO
     */
    private TwShippingActInvoiceDao twShippingActInvoiceDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwShippingActInvoiceServiceImpl() {
    }

    /**
     * twShippingActInvoiceのDAOを設定します。
     * 
     * @param twShippingActInvoiceDao twShippingActInvoiceのDao
     */
    public void setTwShippingActInvoiceDao(TwShippingActInvoiceDao twShippingActInvoiceDao) {
        this.twShippingActInvoiceDao = twShippingActInvoiceDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public TwShippingActInvoiceDomain searchByKey(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public List<TwShippingActInvoiceDomain> searchByCondition(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public List<TwShippingActInvoiceDomain> searchByConditionForPaging(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public int searchCount(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public TwShippingActInvoiceDomain searchByKeyForChange(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public TwShippingActInvoiceDomain lockByKey(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public TwShippingActInvoiceDomain lockByKeyNoWait(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#create(com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain)
     */
    public void create(TwShippingActInvoiceDomain domain) throws ApplicationException {
        twShippingActInvoiceDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#create(java.util.List)
     */
    public void create(List<TwShippingActInvoiceDomain> domains) throws ApplicationException {
        for(TwShippingActInvoiceDomain domain : domains) {
            twShippingActInvoiceDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#update(com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain)
     */
    public int update(TwShippingActInvoiceDomain domain) throws ApplicationException {
        return twShippingActInvoiceDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#update(java.util.List)
     */
    public int update(List<TwShippingActInvoiceDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwShippingActInvoiceDomain domain : domains) {
            updateCount += twShippingActInvoiceDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public int updateByCondition(TwShippingActInvoiceDomain domain, TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwShippingActInvoiceDomain> domains, List<TwShippingActInvoiceCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twShippingActInvoiceDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public int delete(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public int deleteByCondition(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twShippingActInvoiceDao.deleteByCondition(criteria);
    }

}
