/*
 * PROJECT：GSCM 共通機能群
 * 
 * TmUserConf のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.dao.TmUserConfDao;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;


/**
 * TmUserConf のService実装クラスです。<BR>
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
public class TmUserConfServiceImpl implements TmUserConfService {

    /**
     * tmUserConfのDAO
     */
    private TmUserConfDao tmUserConfDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmUserConfServiceImpl() {
    }

    /**
     * tmUserConfのDAOを設定します。
     * 
     * @param tmUserConfDao tmUserConfのDao
     */
    public void setTmUserConfDao(TmUserConfDao tmUserConfDao) {
        this.tmUserConfDao = tmUserConfDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public TmUserConfDomain searchByKey(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public List<TmUserConfDomain> searchByCondition(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public List<TmUserConfDomain> searchByConditionForPaging(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public int searchCount(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public TmUserConfDomain searchByKeyForChange(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public TmUserConfDomain lockByKey(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public TmUserConfDomain lockByKeyNoWait(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#create(com.globaldenso.gscm.framework.business.domain.TmUserConfDomain)
     */
    public void create(TmUserConfDomain domain) throws ApplicationException {
        tmUserConfDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#create(java.util.List)
     */
    public void create(List<TmUserConfDomain> domains) throws ApplicationException {
        for(TmUserConfDomain domain : domains) {
            tmUserConfDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#update(com.globaldenso.gscm.framework.business.domain.TmUserConfDomain)
     */
    public int update(TmUserConfDomain domain) throws ApplicationException {
        return tmUserConfDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#update(java.util.List)
     */
    public int update(List<TmUserConfDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmUserConfDomain domain : domains) {
            updateCount += tmUserConfDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#updateByCondition(com.globaldenso.gscm.framework.business.domain.TmUserConfDomain, com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public int updateByCondition(TmUserConfDomain domain, TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmUserConfDomain> domains, List<TmUserConfCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmUserConfDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#delete(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public int delete(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmUserConfService#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public int deleteByCondition(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return tmUserConfDao.deleteByCondition(criteria);
    }

}
