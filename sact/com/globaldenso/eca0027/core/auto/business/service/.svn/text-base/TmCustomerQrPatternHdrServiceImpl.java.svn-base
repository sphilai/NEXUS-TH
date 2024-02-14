/*
 * PROJECT：eca0027
 * 
 * TmCustomerQrPatternHdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternHdrDomain;


/**
 * TmCustomerQrPatternHdr のService実装クラスです。<BR>
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
public class TmCustomerQrPatternHdrServiceImpl implements TmCustomerQrPatternHdrService {

    /**
     * tmCustomerQrPatternHdrのDAO
     */
    private TmCustomerQrPatternHdrDao tmCustomerQrPatternHdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCustomerQrPatternHdrServiceImpl() {
    }

    /**
     * tmCustomerQrPatternHdrのDAOを設定します。
     * 
     * @param tmCustomerQrPatternHdrDao tmCustomerQrPatternHdrのDao
     */
    public void setTmCustomerQrPatternHdrDao(TmCustomerQrPatternHdrDao tmCustomerQrPatternHdrDao) {
        this.tmCustomerQrPatternHdrDao = tmCustomerQrPatternHdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public TmCustomerQrPatternHdrDomain searchByKey(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public List<TmCustomerQrPatternHdrDomain> searchByCondition(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public List<TmCustomerQrPatternHdrDomain> searchByConditionForPaging(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public int searchCount(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public TmCustomerQrPatternHdrDomain searchByKeyForChange(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public TmCustomerQrPatternHdrDomain lockByKey(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public TmCustomerQrPatternHdrDomain lockByKeyNoWait(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternHdrDomain)
     */
    public void create(TmCustomerQrPatternHdrDomain domain) throws ApplicationException {
        tmCustomerQrPatternHdrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#create(java.util.List)
     */
    public void create(List<TmCustomerQrPatternHdrDomain> domains) throws ApplicationException {
        for(TmCustomerQrPatternHdrDomain domain : domains) {
            tmCustomerQrPatternHdrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternHdrDomain)
     */
    public int update(TmCustomerQrPatternHdrDomain domain) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#update(java.util.List)
     */
    public int update(List<TmCustomerQrPatternHdrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCustomerQrPatternHdrDomain domain : domains) {
            updateCount += tmCustomerQrPatternHdrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternHdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public int updateByCondition(TmCustomerQrPatternHdrDomain domain, TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCustomerQrPatternHdrDomain> domains, List<TmCustomerQrPatternHdrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCustomerQrPatternHdrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public int delete(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public int deleteByCondition(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmCustomerQrPatternHdrDao.deleteByCondition(criteria);
    }

}
