/*
 * PROJECT：eca0027
 * 
 * TtShippingActOdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain;


/**
 * TtShippingActOdr のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/11 15:12:22<BR>
 * 
 * テーブル定義から2014/06/11に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtShippingActOdrServiceImpl implements TtShippingActOdrService {

    /**
     * ttShippingActOdrのDAO
     */
    private TtShippingActOdrDao ttShippingActOdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtShippingActOdrServiceImpl() {
    }

    /**
     * ttShippingActOdrのDAOを設定します。
     * 
     * @param ttShippingActOdrDao ttShippingActOdrのDao
     */
    public void setTtShippingActOdrDao(TtShippingActOdrDao ttShippingActOdrDao) {
        this.ttShippingActOdrDao = ttShippingActOdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public TtShippingActOdrDomain searchByKey(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public List<TtShippingActOdrDomain> searchByCondition(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public List<TtShippingActOdrDomain> searchByConditionForPaging(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public int searchCount(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public TtShippingActOdrDomain searchByKeyForChange(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public TtShippingActOdrDomain lockByKey(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public TtShippingActOdrDomain lockByKeyNoWait(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#create(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain)
     */
    public void create(TtShippingActOdrDomain domain) throws ApplicationException {
        ttShippingActOdrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#create(java.util.List)
     */
    public void create(List<TtShippingActOdrDomain> domains) throws ApplicationException {
        for(TtShippingActOdrDomain domain : domains) {
            ttShippingActOdrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain)
     */
    public int update(TtShippingActOdrDomain domain) throws ApplicationException {
        return ttShippingActOdrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#update(java.util.List)
     */
    public int update(List<TtShippingActOdrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtShippingActOdrDomain domain : domains) {
            updateCount += ttShippingActOdrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public int updateByCondition(TtShippingActOdrDomain domain, TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtShippingActOdrDomain> domains, List<TtShippingActOdrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttShippingActOdrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public int delete(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public int deleteByCondition(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return ttShippingActOdrDao.deleteByCondition(criteria);
    }

}
