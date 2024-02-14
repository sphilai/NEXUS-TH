/*
 * PROJECT：eca0027
 * 
 * TmSupplierWhXref のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/04/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain;


/**
 * TmSupplierWhXref のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/04/11 17:40:10<BR>
 * 
 * テーブル定義から2016/04/11に自動生成したモジュールです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 13073 $
 */
public class TmSupplierWhXrefServiceImpl implements TmSupplierWhXrefService {

    /**
     * tmSupplierWhXrefのDAO
     */
    private TmSupplierWhXrefDao tmSupplierWhXrefDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmSupplierWhXrefServiceImpl() {
    }

    /**
     * tmSupplierWhXrefのDAOを設定します。
     * 
     * @param tmSupplierWhXrefDao tmSupplierWhXrefのDao
     */
    public void setTmSupplierWhXrefDao(TmSupplierWhXrefDao tmSupplierWhXrefDao) {
        this.tmSupplierWhXrefDao = tmSupplierWhXrefDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public TmSupplierWhXrefDomain searchByKey(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public List<TmSupplierWhXrefDomain> searchByCondition(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public List<TmSupplierWhXrefDomain> searchByConditionForPaging(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public int searchCount(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public TmSupplierWhXrefDomain searchByKeyForChange(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public TmSupplierWhXrefDomain lockByKey(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public TmSupplierWhXrefDomain lockByKeyNoWait(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#create(com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain)
     */
    public void create(TmSupplierWhXrefDomain domain) throws ApplicationException {
        tmSupplierWhXrefDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#create(java.util.List)
     */
    public void create(List<TmSupplierWhXrefDomain> domains) throws ApplicationException {
        for(TmSupplierWhXrefDomain domain : domains) {
            tmSupplierWhXrefDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#update(com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain)
     */
    public int update(TmSupplierWhXrefDomain domain) throws ApplicationException {
        return tmSupplierWhXrefDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#update(java.util.List)
     */
    public int update(List<TmSupplierWhXrefDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmSupplierWhXrefDomain domain : domains) {
            updateCount += tmSupplierWhXrefDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public int updateByCondition(TmSupplierWhXrefDomain domain, TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmSupplierWhXrefDomain> domains, List<TmSupplierWhXrefCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmSupplierWhXrefDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public int delete(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public int deleteByCondition(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return tmSupplierWhXrefDao.deleteByCondition(criteria);
    }

}
