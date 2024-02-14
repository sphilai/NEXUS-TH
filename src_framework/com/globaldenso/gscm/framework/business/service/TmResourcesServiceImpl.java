/*
 * PROJECT：GSCM 共通機能群
 * 
 * TmResources のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.dao.TmResourcesDao;
import com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmResourcesDomain;


/**
 * TmResources のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 17:23:18<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public class TmResourcesServiceImpl implements TmResourcesService {

    /**
     * tmResourcesのDAO
     */
    private TmResourcesDao tmResourcesDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmResourcesServiceImpl() {
    }

    /**
     * tmResourcesのDAOを設定します。
     * 
     * @param tmResourcesDao tmResourcesのDao
     */
    public void setTmResourcesDao(TmResourcesDao tmResourcesDao) {
        this.tmResourcesDao = tmResourcesDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public TmResourcesDomain searchByKey(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public List<TmResourcesDomain> searchByCondition(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public List<TmResourcesDomain> searchByConditionForPaging(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public int searchCount(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public TmResourcesDomain searchByKeyForChange(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public TmResourcesDomain lockByKey(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public TmResourcesDomain lockByKeyNoWait(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#create(com.globaldenso.gscm.framework.business.domain.TmResourcesDomain)
     */
    public void create(TmResourcesDomain domain) throws ApplicationException {
        tmResourcesDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#create(java.util.List)
     */
    public void create(List<TmResourcesDomain> domains) throws ApplicationException {
        for(TmResourcesDomain domain : domains) {
            tmResourcesDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#update(com.globaldenso.gscm.framework.business.domain.TmResourcesDomain)
     */
    public int update(TmResourcesDomain domain) throws ApplicationException {
        return tmResourcesDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#update(java.util.List)
     */
    public int update(List<TmResourcesDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmResourcesDomain domain : domains) {
            updateCount += tmResourcesDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#updateByCondition(com.globaldenso.gscm.framework.business.domain.TmResourcesDomain, com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public int updateByCondition(TmResourcesDomain domain, TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmResourcesDomain> domains, List<TmResourcesCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmResourcesDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#delete(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public int delete(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmResourcesService#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public int deleteByCondition(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return tmResourcesDao.deleteByCondition(criteria);
    }

}
