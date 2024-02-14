/*
 * PROJECT：eca0027
 * 
 * TwInvItem のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain;


/**
 * TwInvItem のService実装クラスです。<BR>
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
public class TwInvItemServiceImpl implements TwInvItemService {

    /**
     * twInvItemのDAO
     */
    private TwInvItemDao twInvItemDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwInvItemServiceImpl() {
    }

    /**
     * twInvItemのDAOを設定します。
     * 
     * @param twInvItemDao twInvItemのDao
     */
    public void setTwInvItemDao(TwInvItemDao twInvItemDao) {
        this.twInvItemDao = twInvItemDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public TwInvItemDomain searchByKey(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public List<TwInvItemDomain> searchByCondition(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public List<TwInvItemDomain> searchByConditionForPaging(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public int searchCount(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public TwInvItemDomain searchByKeyForChange(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public TwInvItemDomain lockByKey(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public TwInvItemDomain lockByKeyNoWait(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#create(com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain)
     */
    public void create(TwInvItemDomain domain) throws ApplicationException {
        twInvItemDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#create(java.util.List)
     */
    public void create(List<TwInvItemDomain> domains) throws ApplicationException {
        for(TwInvItemDomain domain : domains) {
            twInvItemDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#update(com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain)
     */
    public int update(TwInvItemDomain domain) throws ApplicationException {
        return twInvItemDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#update(java.util.List)
     */
    public int update(List<TwInvItemDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwInvItemDomain domain : domains) {
            updateCount += twInvItemDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public int updateByCondition(TwInvItemDomain domain, TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwInvItemDomain> domains, List<TwInvItemCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twInvItemDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public int delete(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvItemService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public int deleteByCondition(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return twInvItemDao.deleteByCondition(criteria);
    }

}
