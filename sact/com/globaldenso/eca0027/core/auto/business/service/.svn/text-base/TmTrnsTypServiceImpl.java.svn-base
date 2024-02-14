/*
 * PROJECT：eca0027
 * 
 * TmTrnsTyp のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypDomain;


/**
 * TmTrnsTyp のService実装クラスです。<BR>
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
public class TmTrnsTypServiceImpl implements TmTrnsTypService {

    /**
     * tmTrnsTypのDAO
     */
    private TmTrnsTypDao tmTrnsTypDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmTrnsTypServiceImpl() {
    }

    /**
     * tmTrnsTypのDAOを設定します。
     * 
     * @param tmTrnsTypDao tmTrnsTypのDao
     */
    public void setTmTrnsTypDao(TmTrnsTypDao tmTrnsTypDao) {
        this.tmTrnsTypDao = tmTrnsTypDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public TmTrnsTypDomain searchByKey(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public List<TmTrnsTypDomain> searchByCondition(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public List<TmTrnsTypDomain> searchByConditionForPaging(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public int searchCount(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public TmTrnsTypDomain searchByKeyForChange(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public TmTrnsTypDomain lockByKey(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public TmTrnsTypDomain lockByKeyNoWait(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#create(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypDomain)
     */
    public void create(TmTrnsTypDomain domain) throws ApplicationException {
        tmTrnsTypDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#create(java.util.List)
     */
    public void create(List<TmTrnsTypDomain> domains) throws ApplicationException {
        for(TmTrnsTypDomain domain : domains) {
            tmTrnsTypDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#update(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypDomain)
     */
    public int update(TmTrnsTypDomain domain) throws ApplicationException {
        return tmTrnsTypDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#update(java.util.List)
     */
    public int update(List<TmTrnsTypDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmTrnsTypDomain domain : domains) {
            updateCount += tmTrnsTypDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public int updateByCondition(TmTrnsTypDomain domain, TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmTrnsTypDomain> domains, List<TmTrnsTypCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmTrnsTypDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public int delete(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public int deleteByCondition(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypDao.deleteByCondition(criteria);
    }

}
