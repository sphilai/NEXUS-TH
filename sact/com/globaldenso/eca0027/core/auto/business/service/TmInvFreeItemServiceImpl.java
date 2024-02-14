/*
 * PROJECT：eca0027
 * 
 * TmInvFreeItem のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain;


/**
 * TmInvFreeItem のService実装クラスです。<BR>
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
public class TmInvFreeItemServiceImpl implements TmInvFreeItemService {

    /**
     * tmInvFreeItemのDAO
     */
    private TmInvFreeItemDao tmInvFreeItemDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvFreeItemServiceImpl() {
    }

    /**
     * tmInvFreeItemのDAOを設定します。
     * 
     * @param tmInvFreeItemDao tmInvFreeItemのDao
     */
    public void setTmInvFreeItemDao(TmInvFreeItemDao tmInvFreeItemDao) {
        this.tmInvFreeItemDao = tmInvFreeItemDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public TmInvFreeItemDomain searchByKey(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public List<TmInvFreeItemDomain> searchByCondition(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public List<TmInvFreeItemDomain> searchByConditionForPaging(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public int searchCount(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public TmInvFreeItemDomain searchByKeyForChange(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public TmInvFreeItemDomain lockByKey(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public TmInvFreeItemDomain lockByKeyNoWait(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain)
     */
    public void create(TmInvFreeItemDomain domain) throws ApplicationException {
        tmInvFreeItemDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#create(java.util.List)
     */
    public void create(List<TmInvFreeItemDomain> domains) throws ApplicationException {
        for(TmInvFreeItemDomain domain : domains) {
            tmInvFreeItemDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain)
     */
    public int update(TmInvFreeItemDomain domain) throws ApplicationException {
        return tmInvFreeItemDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#update(java.util.List)
     */
    public int update(List<TmInvFreeItemDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmInvFreeItemDomain domain : domains) {
            updateCount += tmInvFreeItemDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public int updateByCondition(TmInvFreeItemDomain domain, TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmInvFreeItemDomain> domains, List<TmInvFreeItemCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmInvFreeItemDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public int delete(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public int deleteByCondition(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return tmInvFreeItemDao.deleteByCondition(criteria);
    }

}
