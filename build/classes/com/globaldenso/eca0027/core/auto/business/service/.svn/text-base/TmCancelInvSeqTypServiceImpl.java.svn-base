/*
 * PROJECT：eca0027
 * 
 * TmCancelInvSeqTyp のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain;


/**
 * TmCancelInvSeqTyp のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/17 23:10:14<BR>
 * 
 * テーブル定義から2014/04/17に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmCancelInvSeqTypServiceImpl implements TmCancelInvSeqTypService {

    /**
     * tmCancelInvSeqTypのDAO
     */
    private TmCancelInvSeqTypDao tmCancelInvSeqTypDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmCancelInvSeqTypServiceImpl() {
    }

    /**
     * tmCancelInvSeqTypのDAOを設定します。
     * 
     * @param tmCancelInvSeqTypDao tmCancelInvSeqTypのDao
     */
    public void setTmCancelInvSeqTypDao(TmCancelInvSeqTypDao tmCancelInvSeqTypDao) {
        this.tmCancelInvSeqTypDao = tmCancelInvSeqTypDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public TmCancelInvSeqTypDomain searchByKey(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public List<TmCancelInvSeqTypDomain> searchByCondition(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public List<TmCancelInvSeqTypDomain> searchByConditionForPaging(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public int searchCount(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public TmCancelInvSeqTypDomain searchByKeyForChange(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public TmCancelInvSeqTypDomain lockByKey(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public TmCancelInvSeqTypDomain lockByKeyNoWait(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#create(com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain)
     */
    public void create(TmCancelInvSeqTypDomain domain) throws ApplicationException {
        tmCancelInvSeqTypDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#create(java.util.List)
     */
    public void create(List<TmCancelInvSeqTypDomain> domains) throws ApplicationException {
        for(TmCancelInvSeqTypDomain domain : domains) {
            tmCancelInvSeqTypDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#update(com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain)
     */
    public int update(TmCancelInvSeqTypDomain domain) throws ApplicationException {
        return tmCancelInvSeqTypDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#update(java.util.List)
     */
    public int update(List<TmCancelInvSeqTypDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmCancelInvSeqTypDomain domain : domains) {
            updateCount += tmCancelInvSeqTypDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public int updateByCondition(TmCancelInvSeqTypDomain domain, TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmCancelInvSeqTypDomain> domains, List<TmCancelInvSeqTypCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmCancelInvSeqTypDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public int delete(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public int deleteByCondition(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return tmCancelInvSeqTypDao.deleteByCondition(criteria);
    }

}
