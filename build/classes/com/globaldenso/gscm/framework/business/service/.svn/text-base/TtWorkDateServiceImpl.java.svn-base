/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * TtWorkDate のService実装クラス
 * Service Implement Class of TtWorkDate
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * Version.   Last Update Author        Detail
 * 1.0.0      March/03/2014  DNITS  Create
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.dao.TtWorkDateDao;
import com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain;


/**
 * TtWorkDate のService実装クラスです。<BR>
 * Service Implement Class of TtWorkDate<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 17:23:18<BR>
 * Create date ： March/03/2014 17:23:18<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * Auto create module from the table definition on March/03/2014
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public class TtWorkDateServiceImpl implements TtWorkDateService {

    /**
     * ttWorkDateのDAO
     * DAO of ttWorkDate
     */
    private TtWorkDateDao ttWorkDateDao;

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public TtWorkDateServiceImpl() {
    }

    /**
     * ttWorkDateのDAOを設定します。
     * Set DAO of ttWorkDate
     * 
     * @param ttWorkDateDao ttWorkDateのDao
     * @param ttWorkDateDao DAO of ttWorkDate
     */
    public void setTtWorkDateDao(TtWorkDateDao ttWorkDateDao) {
        this.ttWorkDateDao = ttWorkDateDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public TtWorkDateDomain searchByKey(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public List<TtWorkDateDomain> searchByCondition(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public List<TtWorkDateDomain> searchByConditionForPaging(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public int searchCount(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public TtWorkDateDomain searchByKeyForChange(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public TtWorkDateDomain lockByKey(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public TtWorkDateDomain lockByKeyNoWait(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#create(com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain)
     */
    public void create(TtWorkDateDomain domain) throws ApplicationException {
        ttWorkDateDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#create(java.util.List)
     */
    public void create(List<TtWorkDateDomain> domains) throws ApplicationException {
        for(TtWorkDateDomain domain : domains) {
            ttWorkDateDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#update(com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain)
     */
    public int update(TtWorkDateDomain domain) throws ApplicationException {
        return ttWorkDateDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#update(java.util.List)
     */
    public int update(List<TtWorkDateDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtWorkDateDomain domain : domains) {
            updateCount += ttWorkDateDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#updateByCondition(com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain, com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public int updateByCondition(TtWorkDateDomain domain, TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtWorkDateDomain> domains, List<TtWorkDateCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttWorkDateDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#delete(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public int delete(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TtWorkDateService#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public int deleteByCondition(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return ttWorkDateDao.deleteByCondition(criteria);
    }

}
