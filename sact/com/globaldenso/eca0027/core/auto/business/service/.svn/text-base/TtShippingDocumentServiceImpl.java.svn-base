/*
 * PROJECT：eca0027
 * 
 * TtShippingDocument のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain;


/**
 * TtShippingDocument のService実装クラスです。<BR>
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
public class TtShippingDocumentServiceImpl implements TtShippingDocumentService {

    /**
     * ttShippingDocumentのDAO
     */
    private TtShippingDocumentDao ttShippingDocumentDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtShippingDocumentServiceImpl() {
    }

    /**
     * ttShippingDocumentのDAOを設定します。
     * 
     * @param ttShippingDocumentDao ttShippingDocumentのDao
     */
    public void setTtShippingDocumentDao(TtShippingDocumentDao ttShippingDocumentDao) {
        this.ttShippingDocumentDao = ttShippingDocumentDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public TtShippingDocumentDomain searchByKey(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public List<TtShippingDocumentDomain> searchByCondition(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public List<TtShippingDocumentDomain> searchByConditionForPaging(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public int searchCount(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public TtShippingDocumentDomain searchByKeyForChange(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public TtShippingDocumentDomain lockByKey(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public TtShippingDocumentDomain lockByKeyNoWait(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#create(com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain)
     */
    public void create(TtShippingDocumentDomain domain) throws ApplicationException {
        ttShippingDocumentDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#create(java.util.List)
     */
    public void create(List<TtShippingDocumentDomain> domains) throws ApplicationException {
        for(TtShippingDocumentDomain domain : domains) {
            ttShippingDocumentDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#update(com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain)
     */
    public int update(TtShippingDocumentDomain domain) throws ApplicationException {
        return ttShippingDocumentDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#update(java.util.List)
     */
    public int update(List<TtShippingDocumentDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtShippingDocumentDomain domain : domains) {
            updateCount += ttShippingDocumentDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public int updateByCondition(TtShippingDocumentDomain domain, TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtShippingDocumentDomain> domains, List<TtShippingDocumentCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttShippingDocumentDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public int delete(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public int deleteByCondition(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return ttShippingDocumentDao.deleteByCondition(criteria);
    }

}
