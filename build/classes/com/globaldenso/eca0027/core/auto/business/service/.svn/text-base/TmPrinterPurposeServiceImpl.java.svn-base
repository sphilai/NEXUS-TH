/*
 * PROJECT：eca0027
 * 
 * TmPrinterPurpose のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterPurposeDomain;


/**
 * TmPrinterPurpose のService実装クラスです。<BR>
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
public class TmPrinterPurposeServiceImpl implements TmPrinterPurposeService {

    /**
     * tmPrinterPurposeのDAO
     */
    private TmPrinterPurposeDao tmPrinterPurposeDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPrinterPurposeServiceImpl() {
    }

    /**
     * tmPrinterPurposeのDAOを設定します。
     * 
     * @param tmPrinterPurposeDao tmPrinterPurposeのDao
     */
    public void setTmPrinterPurposeDao(TmPrinterPurposeDao tmPrinterPurposeDao) {
        this.tmPrinterPurposeDao = tmPrinterPurposeDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public TmPrinterPurposeDomain searchByKey(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public List<TmPrinterPurposeDomain> searchByCondition(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public List<TmPrinterPurposeDomain> searchByConditionForPaging(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public int searchCount(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public TmPrinterPurposeDomain searchByKeyForChange(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public TmPrinterPurposeDomain lockByKey(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public TmPrinterPurposeDomain lockByKeyNoWait(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#create(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterPurposeDomain)
     */
    public void create(TmPrinterPurposeDomain domain) throws ApplicationException {
        tmPrinterPurposeDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#create(java.util.List)
     */
    public void create(List<TmPrinterPurposeDomain> domains) throws ApplicationException {
        for(TmPrinterPurposeDomain domain : domains) {
            tmPrinterPurposeDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#update(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterPurposeDomain)
     */
    public int update(TmPrinterPurposeDomain domain) throws ApplicationException {
        return tmPrinterPurposeDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#update(java.util.List)
     */
    public int update(List<TmPrinterPurposeDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmPrinterPurposeDomain domain : domains) {
            updateCount += tmPrinterPurposeDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterPurposeDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public int updateByCondition(TmPrinterPurposeDomain domain, TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmPrinterPurposeDomain> domains, List<TmPrinterPurposeCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmPrinterPurposeDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public int delete(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterPurposeService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public int deleteByCondition(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterPurposeDao.deleteByCondition(criteria);
    }

}
