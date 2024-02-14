/*
 * PROJECT：GSCM 共通機能群
 * 
 * TmUser のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.dao.TmUserDao;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;


/**
 * TmUser のService実装クラスです。<BR>
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
public class TmUserServiceImpl implements TmUserService {

    /**
     * tmUserのDAO
     */
    private TmUserDao tmUserDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmUserServiceImpl() {
    }

    /**
     * tmUserのDAOを設定します。
     * 
     * @param tmUserDao tmUserのDao
     */
    public void setTmUserDao(TmUserDao tmUserDao) {
        this.tmUserDao = tmUserDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public TmUserDomain searchByKey(TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public List<TmUserDomain> searchByCondition(TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public List<TmUserDomain> searchByConditionForPaging(TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public int searchCount(TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public TmUserDomain searchByKeyForChange(TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public TmUserDomain lockByKey(TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public TmUserDomain lockByKeyNoWait(TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#create(com.globaldenso.gscm.framework.business.domain.TmUserDomain)
     */
    public void create(TmUserDomain domain) throws ApplicationException {
        tmUserDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#create(java.util.List)
     */
    public void create(List<TmUserDomain> domains) throws ApplicationException {
        for(TmUserDomain domain : domains) {
            tmUserDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#update(com.globaldenso.gscm.framework.business.domain.TmUserDomain)
     */
    public int update(TmUserDomain domain) throws ApplicationException {
        return tmUserDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#update(java.util.List)
     */
    public int update(List<TmUserDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmUserDomain domain : domains) {
            updateCount += tmUserDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#updateByCondition(com.globaldenso.gscm.framework.business.domain.TmUserDomain, com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public int updateByCondition(TmUserDomain domain, TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmUserDomain> domains, List<TmUserCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmUserDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#delete(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public int delete(TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserService#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public int deleteByCondition(TmUserCriteriaDomain criteria) throws ApplicationException {
        return tmUserDao.deleteByCondition(criteria);
    }

}
