/*
 * PROJECT：eca0027
 * 
 * TtShippingFirm のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain;


/**
 * TtShippingFirm のService実装クラスです。<BR>
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
public class TtShippingFirmServiceImpl implements TtShippingFirmService {

    /**
     * ttShippingFirmのDAO
     */
    private TtShippingFirmDao ttShippingFirmDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtShippingFirmServiceImpl() {
    }

    /**
     * ttShippingFirmのDAOを設定します。
     * 
     * @param ttShippingFirmDao ttShippingFirmのDao
     */
    public void setTtShippingFirmDao(TtShippingFirmDao ttShippingFirmDao) {
        this.ttShippingFirmDao = ttShippingFirmDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public TtShippingFirmDomain searchByKey(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public List<TtShippingFirmDomain> searchByCondition(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public List<TtShippingFirmDomain> searchByConditionForPaging(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public int searchCount(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public TtShippingFirmDomain searchByKeyForChange(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public TtShippingFirmDomain lockByKey(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public TtShippingFirmDomain lockByKeyNoWait(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#create(com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain)
     */
    public void create(TtShippingFirmDomain domain) throws ApplicationException {
        ttShippingFirmDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#create(java.util.List)
     */
    public void create(List<TtShippingFirmDomain> domains) throws ApplicationException {
        for(TtShippingFirmDomain domain : domains) {
            ttShippingFirmDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#update(com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain)
     */
    public int update(TtShippingFirmDomain domain) throws ApplicationException {
        return ttShippingFirmDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#update(java.util.List)
     */
    public int update(List<TtShippingFirmDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtShippingFirmDomain domain : domains) {
            updateCount += ttShippingFirmDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public int updateByCondition(TtShippingFirmDomain domain, TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtShippingFirmDomain> domains, List<TtShippingFirmCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttShippingFirmDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public int delete(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public int deleteByCondition(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return ttShippingFirmDao.deleteByCondition(criteria);
    }

}
