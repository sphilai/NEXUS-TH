/*
 * PROJECT：eca0027
 * 
 * TtPltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;


/**
 * TtPltz のService実装クラスです。<BR>
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
public class TtPltzServiceImpl implements TtPltzService {

    /**
     * ttPltzのDAO
     */
    private TtPltzDao ttPltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzServiceImpl() {
    }

    /**
     * ttPltzのDAOを設定します。
     * 
     * @param ttPltzDao ttPltzのDao
     */
    public void setTtPltzDao(TtPltzDao ttPltzDao) {
        this.ttPltzDao = ttPltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public TtPltzDomain searchByKey(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public List<TtPltzDomain> searchByCondition(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public List<TtPltzDomain> searchByConditionForPaging(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public int searchCount(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public TtPltzDomain searchByKeyForChange(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public TtPltzDomain lockByKey(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public TtPltzDomain lockByKeyNoWait(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain)
     */
    public void create(TtPltzDomain domain) throws ApplicationException {
        ttPltzDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#create(java.util.List)
     */
    public void create(List<TtPltzDomain> domains) throws ApplicationException {
        for(TtPltzDomain domain : domains) {
            ttPltzDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain)
     */
    public int update(TtPltzDomain domain) throws ApplicationException {
        return ttPltzDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#update(java.util.List)
     */
    public int update(List<TtPltzDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPltzDomain domain : domains) {
            updateCount += ttPltzDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public int updateByCondition(TtPltzDomain domain, TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPltzDomain> domains, List<TtPltzCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPltzDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public int delete(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public int deleteByCondition(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return ttPltzDao.deleteByCondition(criteria);
    }

}
