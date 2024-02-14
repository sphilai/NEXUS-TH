/*
 * PROJECT：eca0027
 * 
 * TwCarryOutListPltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain;


/**
 * TwCarryOutListPltz のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TwCarryOutListPltzServiceImpl implements TwCarryOutListPltzService {

    /**
     * twCarryOutListPltzのDAO
     */
    private TwCarryOutListPltzDao twCarryOutListPltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwCarryOutListPltzServiceImpl() {
    }

    /**
     * twCarryOutListPltzのDAOを設定します。
     * 
     * @param twCarryOutListPltzDao twCarryOutListPltzのDao
     */
    public void setTwCarryOutListPltzDao(TwCarryOutListPltzDao twCarryOutListPltzDao) {
        this.twCarryOutListPltzDao = twCarryOutListPltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public TwCarryOutListPltzDomain searchByKey(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public List<TwCarryOutListPltzDomain> searchByCondition(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public List<TwCarryOutListPltzDomain> searchByConditionForPaging(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public int searchCount(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public TwCarryOutListPltzDomain searchByKeyForChange(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public TwCarryOutListPltzDomain lockByKey(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public TwCarryOutListPltzDomain lockByKeyNoWait(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#create(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain)
     */
    public void create(TwCarryOutListPltzDomain domain) throws ApplicationException {
        twCarryOutListPltzDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#create(java.util.List)
     */
    public void create(List<TwCarryOutListPltzDomain> domains) throws ApplicationException {
        for(TwCarryOutListPltzDomain domain : domains) {
            twCarryOutListPltzDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#update(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain)
     */
    public int update(TwCarryOutListPltzDomain domain) throws ApplicationException {
        return twCarryOutListPltzDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#update(java.util.List)
     */
    public int update(List<TwCarryOutListPltzDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwCarryOutListPltzDomain domain : domains) {
            updateCount += twCarryOutListPltzDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public int updateByCondition(TwCarryOutListPltzDomain domain, TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwCarryOutListPltzDomain> domains, List<TwCarryOutListPltzCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twCarryOutListPltzDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public int delete(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public int deleteByCondition(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzDao.deleteByCondition(criteria);
    }

}
