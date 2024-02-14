/*
 * PROJECT：eca0027
 * 
 * TmExpShipToShipping のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/12/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;


/**
 * TmExpShipToShipping のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/12/18 16:26:47<BR>
 * 
 * テーブル定義から2017/12/18に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class TmExpShipToShippingServiceImpl implements TmExpShipToShippingService {

    /**
     * tmExpShipToShippingのDAO
     */
    private TmExpShipToShippingDao tmExpShipToShippingDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpShipToShippingServiceImpl() {
    }

    /**
     * tmExpShipToShippingのDAOを設定します。
     * 
     * @param tmExpShipToShippingDao tmExpShipToShippingのDao
     */
    public void setTmExpShipToShippingDao(TmExpShipToShippingDao tmExpShipToShippingDao) {
        this.tmExpShipToShippingDao = tmExpShipToShippingDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain searchByKey(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.searchByKey(criteria);
    }

    /**
     * Export Request
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#searchContainerKeyByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain searchContainerKeyByCondition(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.searchContainerKeyByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public List<TmExpShipToShippingDomain> searchByCondition(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public List<TmExpShipToShippingDomain> searchByConditionForPaging(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public int searchCount(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain searchByKeyForChange(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain lockByKey(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain lockByKeyNoWait(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain)
     */
    public void create(TmExpShipToShippingDomain domain) throws ApplicationException {
        tmExpShipToShippingDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#create(java.util.List)
     */
    public void create(List<TmExpShipToShippingDomain> domains) throws ApplicationException {
        for(TmExpShipToShippingDomain domain : domains) {
            tmExpShipToShippingDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#update(com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain)
     */
    public int update(TmExpShipToShippingDomain domain) throws ApplicationException {
        return tmExpShipToShippingDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#update(java.util.List)
     */
    public int update(List<TmExpShipToShippingDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmExpShipToShippingDomain domain : domains) {
            updateCount += tmExpShipToShippingDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public int updateByCondition(TmExpShipToShippingDomain domain, TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmExpShipToShippingDomain> domains, List<TmExpShipToShippingCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmExpShipToShippingDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public int delete(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public int deleteByCondition(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return tmExpShipToShippingDao.deleteByCondition(criteria);
    }

}
