/*
 * PROJECT：eca0027
 * 
 * TwInvPltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain;


/**
 * TwInvPltz のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 10:26:05<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TwInvPltzServiceImpl implements TwInvPltzService {

    /**
     * twInvPltzのDAO
     */
    private TwInvPltzDao twInvPltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwInvPltzServiceImpl() {
    }

    /**
     * twInvPltzのDAOを設定します。
     * 
     * @param twInvPltzDao twInvPltzのDao
     */
    public void setTwInvPltzDao(TwInvPltzDao twInvPltzDao) {
        this.twInvPltzDao = twInvPltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public TwInvPltzDomain searchByKey(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public List<TwInvPltzDomain> searchByCondition(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public List<TwInvPltzDomain> searchByConditionForPaging(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public int searchCount(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public TwInvPltzDomain searchByKeyForChange(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public TwInvPltzDomain lockByKey(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public TwInvPltzDomain lockByKeyNoWait(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#create(com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain)
     */
    public void create(TwInvPltzDomain domain) throws ApplicationException {
        twInvPltzDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#create(java.util.List)
     */
    public void create(List<TwInvPltzDomain> domains) throws ApplicationException {
        for(TwInvPltzDomain domain : domains) {
            twInvPltzDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#update(com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain)
     */
    public int update(TwInvPltzDomain domain) throws ApplicationException {
        return twInvPltzDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#update(java.util.List)
     */
    public int update(List<TwInvPltzDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwInvPltzDomain domain : domains) {
            updateCount += twInvPltzDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public int updateByCondition(TwInvPltzDomain domain, TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwInvPltzDomain> domains, List<TwInvPltzCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twInvPltzDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public int delete(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public int deleteByCondition(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return twInvPltzDao.deleteByCondition(criteria);
    }

}
