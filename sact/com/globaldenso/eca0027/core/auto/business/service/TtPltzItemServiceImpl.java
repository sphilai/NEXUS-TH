/*
 * PROJECT：eca0027
 * 
 * TtPltzItem のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;


/**
 * TtPltzItem のService実装クラスです。<BR>
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
public class TtPltzItemServiceImpl implements TtPltzItemService {

    /**
     * ttPltzItemのDAO
     */
    private TtPltzItemDao ttPltzItemDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzItemServiceImpl() {
    }

    /**
     * ttPltzItemのDAOを設定します。
     * 
     * @param ttPltzItemDao ttPltzItemのDao
     */
    public void setTtPltzItemDao(TtPltzItemDao ttPltzItemDao) {
        this.ttPltzItemDao = ttPltzItemDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public TtPltzItemDomain searchByKey(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public List<TtPltzItemDomain> searchByCondition(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public List<TtPltzItemDomain> searchByConditionForPaging(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public int searchCount(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public TtPltzItemDomain searchByKeyForChange(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public TtPltzItemDomain lockByKey(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public TtPltzItemDomain lockByKeyNoWait(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain)
     */
    public void create(TtPltzItemDomain domain) throws ApplicationException {
        ttPltzItemDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#create(java.util.List)
     */
    public void create(List<TtPltzItemDomain> domains) throws ApplicationException {
        for(TtPltzItemDomain domain : domains) {
            ttPltzItemDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain)
     */
    public int update(TtPltzItemDomain domain) throws ApplicationException {
        return ttPltzItemDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#update(java.util.List)
     */
    public int update(List<TtPltzItemDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPltzItemDomain domain : domains) {
            updateCount += ttPltzItemDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public int updateByCondition(TtPltzItemDomain domain, TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPltzItemDomain> domains, List<TtPltzItemCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPltzItemDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public int delete(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public int deleteByCondition(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemDao.deleteByCondition(criteria);
    }

}
