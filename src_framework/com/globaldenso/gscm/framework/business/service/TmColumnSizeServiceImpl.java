/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * TmColumnSize のService実装クラス
 * Service Implement Class of TmColumnSize
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * Version.   Last Update Author        Detail
 * 1.0.0      Mar./03/2014  DNITS  Create
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao;
import com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain;


/**
 * TmColumnSize のService実装クラスです。<BR>
 * Service Implement Class of TmColumnSize<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 15:46:53<BR>
 * Create date ： Mar./03/2014 15:46:53<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * Auto create module from the table definition on Mar./03/2014
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public class TmColumnSizeServiceImpl implements TmColumnSizeService {

    /**
     * tmColumnSizeのDAO
     * DAO of tmColumnSize
     */
    private TmColumnSizeDao tmColumnSizeDao;

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public TmColumnSizeServiceImpl() {
    }

    /**
     * tmColumnSizeのDAOを設定します。
     * Set DAO of tmColumnSize
     * 
     * @param tmColumnSizeDao tmColumnSizeのDao
     * @param tmColumnSizeDao DAO of tmColumnSize
     */
    public void setTmColumnSizeDao(TmColumnSizeDao tmColumnSizeDao) {
        this.tmColumnSizeDao = tmColumnSizeDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public TmColumnSizeDomain searchByKey(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public List<TmColumnSizeDomain> searchByCondition(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public List<TmColumnSizeDomain> searchByConditionForPaging(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public int searchCount(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public TmColumnSizeDomain searchByKeyForChange(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public TmColumnSizeDomain lockByKey(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public TmColumnSizeDomain lockByKeyNoWait(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#create(com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain)
     */
    public void create(TmColumnSizeDomain domain) throws ApplicationException {
        tmColumnSizeDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#create(java.util.List)
     */
    public void create(List<TmColumnSizeDomain> domains) throws ApplicationException {
        for(TmColumnSizeDomain domain : domains) {
            tmColumnSizeDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#update(com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain)
     */
    public int update(TmColumnSizeDomain domain) throws ApplicationException {
        return tmColumnSizeDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#update(java.util.List)
     */
    public int update(List<TmColumnSizeDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmColumnSizeDomain domain : domains) {
            updateCount += tmColumnSizeDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#updateByCondition(com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain, com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public int updateByCondition(TmColumnSizeDomain domain, TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmColumnSizeDomain> domains, List<TmColumnSizeCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmColumnSizeDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#delete(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public int delete(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.service.TmColumnSizeService#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public int deleteByCondition(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return tmColumnSizeDao.deleteByCondition(criteria);
    }

}
