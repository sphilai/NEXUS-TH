/*
 * PROJECT：eca0027
 * 
 * TtInvoiceHeader のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain;


/**
 * TtInvoiceHeader のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 14:43:17<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TtInvoiceHeaderServiceImpl implements TtInvoiceHeaderService {

    /**
     * ttInvoiceHeaderのDAO
     */
    private TtInvoiceHeaderDao ttInvoiceHeaderDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtInvoiceHeaderServiceImpl() {
    }

    /**
     * ttInvoiceHeaderのDAOを設定します。
     * 
     * @param ttInvoiceHeaderDao ttInvoiceHeaderのDao
     */
    public void setTtInvoiceHeaderDao(TtInvoiceHeaderDao ttInvoiceHeaderDao) {
        this.ttInvoiceHeaderDao = ttInvoiceHeaderDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public TtInvoiceHeaderDomain searchByKey(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public List<TtInvoiceHeaderDomain> searchByCondition(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public List<TtInvoiceHeaderDomain> searchByConditionForPaging(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public int searchCount(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public TtInvoiceHeaderDomain searchByKeyForChange(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public TtInvoiceHeaderDomain lockByKey(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public TtInvoiceHeaderDomain lockByKeyNoWait(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#create(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain)
     */
    public void create(TtInvoiceHeaderDomain domain) throws ApplicationException {
        ttInvoiceHeaderDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#create(java.util.List)
     */
    public void create(List<TtInvoiceHeaderDomain> domains) throws ApplicationException {
        for(TtInvoiceHeaderDomain domain : domains) {
            ttInvoiceHeaderDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#update(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain)
     */
    public int update(TtInvoiceHeaderDomain domain) throws ApplicationException {
        return ttInvoiceHeaderDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#update(java.util.List)
     */
    public int update(List<TtInvoiceHeaderDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtInvoiceHeaderDomain domain : domains) {
            updateCount += ttInvoiceHeaderDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public int updateByCondition(TtInvoiceHeaderDomain domain, TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtInvoiceHeaderDomain> domains, List<TtInvoiceHeaderCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttInvoiceHeaderDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public int delete(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public int deleteByCondition(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return ttInvoiceHeaderDao.deleteByCondition(criteria);
    }

}
