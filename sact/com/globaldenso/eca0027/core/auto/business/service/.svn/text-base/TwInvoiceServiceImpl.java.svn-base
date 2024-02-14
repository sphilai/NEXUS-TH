/*
 * PROJECT：eca0027
 * 
 * TwInvoice のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain;


/**
 * TwInvoice のService実装クラスです。<BR>
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
public class TwInvoiceServiceImpl implements TwInvoiceService {

    /**
     * twInvoiceのDAO
     */
    private TwInvoiceDao twInvoiceDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwInvoiceServiceImpl() {
    }

    /**
     * twInvoiceのDAOを設定します。
     * 
     * @param twInvoiceDao twInvoiceのDao
     */
    public void setTwInvoiceDao(TwInvoiceDao twInvoiceDao) {
        this.twInvoiceDao = twInvoiceDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public TwInvoiceDomain searchByKey(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public List<TwInvoiceDomain> searchByCondition(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public List<TwInvoiceDomain> searchByConditionForPaging(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public int searchCount(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public TwInvoiceDomain searchByKeyForChange(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public TwInvoiceDomain lockByKey(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public TwInvoiceDomain lockByKeyNoWait(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#create(com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain)
     */
    public void create(TwInvoiceDomain domain) throws ApplicationException {
        twInvoiceDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#create(java.util.List)
     */
    public void create(List<TwInvoiceDomain> domains) throws ApplicationException {
        for(TwInvoiceDomain domain : domains) {
            twInvoiceDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#update(com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain)
     */
    public int update(TwInvoiceDomain domain) throws ApplicationException {
        return twInvoiceDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#update(java.util.List)
     */
    public int update(List<TwInvoiceDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwInvoiceDomain domain : domains) {
            updateCount += twInvoiceDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public int updateByCondition(TwInvoiceDomain domain, TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwInvoiceDomain> domains, List<TwInvoiceCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twInvoiceDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public int delete(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public int deleteByCondition(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return twInvoiceDao.deleteByCondition(criteria);
    }

}
