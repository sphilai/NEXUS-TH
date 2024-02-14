/*
 * PROJECT：eca0027
 * 
 * TmItemTypXref のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmItemTypXrefDomain;


/**
 * TmItemTypXref のService実装クラスです。<BR>
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
public class TmItemTypXrefServiceImpl implements TmItemTypXrefService {

    /**
     * tmItemTypXrefのDAO
     */
    private TmItemTypXrefDao tmItemTypXrefDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmItemTypXrefServiceImpl() {
    }

    /**
     * tmItemTypXrefのDAOを設定します。
     * 
     * @param tmItemTypXrefDao tmItemTypXrefのDao
     */
    public void setTmItemTypXrefDao(TmItemTypXrefDao tmItemTypXrefDao) {
        this.tmItemTypXrefDao = tmItemTypXrefDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public TmItemTypXrefDomain searchByKey(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public List<TmItemTypXrefDomain> searchByCondition(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public List<TmItemTypXrefDomain> searchByConditionForPaging(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public int searchCount(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public TmItemTypXrefDomain searchByKeyForChange(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public TmItemTypXrefDomain lockByKey(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public TmItemTypXrefDomain lockByKeyNoWait(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#create(com.globaldenso.eca0027.core.auto.business.domain.TmItemTypXrefDomain)
     */
    public void create(TmItemTypXrefDomain domain) throws ApplicationException {
        tmItemTypXrefDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#create(java.util.List)
     */
    public void create(List<TmItemTypXrefDomain> domains) throws ApplicationException {
        for(TmItemTypXrefDomain domain : domains) {
            tmItemTypXrefDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#update(com.globaldenso.eca0027.core.auto.business.domain.TmItemTypXrefDomain)
     */
    public int update(TmItemTypXrefDomain domain) throws ApplicationException {
        return tmItemTypXrefDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#update(java.util.List)
     */
    public int update(List<TmItemTypXrefDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmItemTypXrefDomain domain : domains) {
            updateCount += tmItemTypXrefDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmItemTypXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public int updateByCondition(TmItemTypXrefDomain domain, TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmItemTypXrefDomain> domains, List<TmItemTypXrefCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmItemTypXrefDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public int delete(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmItemTypXrefService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public int deleteByCondition(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return tmItemTypXrefDao.deleteByCondition(criteria);
    }

}
