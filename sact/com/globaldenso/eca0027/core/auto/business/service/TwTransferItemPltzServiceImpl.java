/*
 * PROJECT：eca0027
 * 
 * TwTransferItemPltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/06  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain;


/**
 * TwTransferItemPltz のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/06 09:19:02<BR>
 * 
 * テーブル定義から2014/06/06に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TwTransferItemPltzServiceImpl implements TwTransferItemPltzService {

    /**
     * twTransferItemPltzのDAO
     */
    private TwTransferItemPltzDao twTransferItemPltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwTransferItemPltzServiceImpl() {
    }

    /**
     * twTransferItemPltzのDAOを設定します。
     * 
     * @param twTransferItemPltzDao twTransferItemPltzのDao
     */
    public void setTwTransferItemPltzDao(TwTransferItemPltzDao twTransferItemPltzDao) {
        this.twTransferItemPltzDao = twTransferItemPltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public TwTransferItemPltzDomain searchByKey(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public List<TwTransferItemPltzDomain> searchByCondition(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public List<TwTransferItemPltzDomain> searchByConditionForPaging(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public int searchCount(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public TwTransferItemPltzDomain searchByKeyForChange(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public TwTransferItemPltzDomain lockByKey(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public TwTransferItemPltzDomain lockByKeyNoWait(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#create(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain)
     */
    public void create(TwTransferItemPltzDomain domain) throws ApplicationException {
        twTransferItemPltzDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#create(java.util.List)
     */
    public void create(List<TwTransferItemPltzDomain> domains) throws ApplicationException {
        for(TwTransferItemPltzDomain domain : domains) {
            twTransferItemPltzDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#update(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain)
     */
    public int update(TwTransferItemPltzDomain domain) throws ApplicationException {
        return twTransferItemPltzDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#update(java.util.List)
     */
    public int update(List<TwTransferItemPltzDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwTransferItemPltzDomain domain : domains) {
            updateCount += twTransferItemPltzDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public int updateByCondition(TwTransferItemPltzDomain domain, TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwTransferItemPltzDomain> domains, List<TwTransferItemPltzCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twTransferItemPltzDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public int delete(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public int deleteByCondition(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzDao.deleteByCondition(criteria);
    }

}
