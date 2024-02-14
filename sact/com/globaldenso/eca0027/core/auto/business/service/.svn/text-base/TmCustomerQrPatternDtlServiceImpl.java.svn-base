/*
 * PROJECT：eca0027
 * 
 * TmCustomerQrPatternDtl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternDtlDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternDtlDomain;


/**
 * TmCustomerQrPatternDtl のService実装クラスです。<BR>
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
public class TmCustomerQrPatternDtlServiceImpl implements TmCustomerQrPatternDtlService {

    /**
     * tmCustomerQrPatternDtlのDAO
     */
    private TmCustomerQrPatternDtlDao tmCustomerQrPatternDtlDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCustomerQrPatternDtlServiceImpl() {
    }

    /**
     * tmCustomerQrPatternDtlのDAOを設定します。
     * 
     * @param tmCustomerQrPatternDtlDao tmCustomerQrPatternDtlのDao
     */
    public void setTmCustomerQrPatternDtlDao(TmCustomerQrPatternDtlDao tmCustomerQrPatternDtlDao) {
        this.tmCustomerQrPatternDtlDao = tmCustomerQrPatternDtlDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public TmCustomerQrPatternDtlDomain searchByKey(TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public List<TmCustomerQrPatternDtlDomain> searchByCondition(TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public List<TmCustomerQrPatternDtlDomain> searchByConditionForPaging(TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public int searchCount(TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public TmCustomerQrPatternDtlDomain searchByKeyForChange(TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public TmCustomerQrPatternDtlDomain lockByKey(TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public TmCustomerQrPatternDtlDomain lockByKeyNoWait(TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternDtlDomain)
     */
    public void create(TmCustomerQrPatternDtlDomain domain) throws ApplicationException {
        tmCustomerQrPatternDtlDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#create(java.util.List)
     */
    public void create(List<TmCustomerQrPatternDtlDomain> domains) throws ApplicationException {
        for(TmCustomerQrPatternDtlDomain domain : domains) {
            tmCustomerQrPatternDtlDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternDtlDomain)
     */
    public int update(TmCustomerQrPatternDtlDomain domain) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#update(java.util.List)
     */
    public int update(List<TmCustomerQrPatternDtlDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCustomerQrPatternDtlDomain domain : domains) {
            updateCount += tmCustomerQrPatternDtlDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternDtlDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public int updateByCondition(TmCustomerQrPatternDtlDomain domain, TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCustomerQrPatternDtlDomain> domains, List<TmCustomerQrPatternDtlCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCustomerQrPatternDtlDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public int delete(TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain)
     */
    public int deleteByCondition(TmCustomerQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternDtlDao.deleteByCondition(criteria);
    }

}
