/*
 * PROJECT：eca0027
 * 
 * TmCntry のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain;


/**
 * TmCntry のService実装クラスです。<BR>
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
public class TmCntryServiceImpl implements TmCntryService {

    /**
     * tmCntryのDAO
     */
    private TmCntryDao tmCntryDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCntryServiceImpl() {
    }

    /**
     * tmCntryのDAOを設定します。
     * 
     * @param tmCntryDao tmCntryのDao
     */
    public void setTmCntryDao(TmCntryDao tmCntryDao) {
        this.tmCntryDao = tmCntryDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public TmCntryDomain searchByKey(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public List<TmCntryDomain> searchByCondition(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public List<TmCntryDomain> searchByConditionForPaging(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public int searchCount(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public TmCntryDomain searchByKeyForChange(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public TmCntryDomain lockByKey(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public TmCntryDomain lockByKeyNoWait(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain)
     */
    public void create(TmCntryDomain domain) throws ApplicationException {
        tmCntryDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#create(java.util.List)
     */
    public void create(List<TmCntryDomain> domains) throws ApplicationException {
        for(TmCntryDomain domain : domains) {
            tmCntryDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain)
     */
    public int update(TmCntryDomain domain) throws ApplicationException {
        return tmCntryDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#update(java.util.List)
     */
    public int update(List<TmCntryDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCntryDomain domain : domains) {
            updateCount += tmCntryDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public int updateByCondition(TmCntryDomain domain, TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCntryDomain> domains, List<TmCntryCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCntryDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public int delete(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public int deleteByCondition(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return tmCntryDao.deleteByCondition(criteria);
    }

}
