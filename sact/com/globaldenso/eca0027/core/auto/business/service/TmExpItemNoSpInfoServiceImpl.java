/*
 * PROJECT：eca0027
 * 
 * TmExpItemNoSpInfo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;


/**
 * TmExpItemNoSpInfo のService実装クラスです。<BR>
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
public class TmExpItemNoSpInfoServiceImpl implements TmExpItemNoSpInfoService {

    /**
     * tmExpItemNoSpInfoのDAO
     */
    private TmExpItemNoSpInfoDao tmExpItemNoSpInfoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpItemNoSpInfoServiceImpl() {
    }

    /**
     * tmExpItemNoSpInfoのDAOを設定します。
     * 
     * @param tmExpItemNoSpInfoDao tmExpItemNoSpInfoのDao
     */
    public void setTmExpItemNoSpInfoDao(TmExpItemNoSpInfoDao tmExpItemNoSpInfoDao) {
        this.tmExpItemNoSpInfoDao = tmExpItemNoSpInfoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public TmExpItemNoSpInfoDomain searchByKey(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public List<TmExpItemNoSpInfoDomain> searchByCondition(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public List<TmExpItemNoSpInfoDomain> searchByConditionForPaging(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public int searchCount(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public TmExpItemNoSpInfoDomain searchByKeyForChange(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public TmExpItemNoSpInfoDomain lockByKey(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public TmExpItemNoSpInfoDomain lockByKeyNoWait(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain)
     */
    public void create(TmExpItemNoSpInfoDomain domain) throws ApplicationException {
        tmExpItemNoSpInfoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#create(java.util.List)
     */
    public void create(List<TmExpItemNoSpInfoDomain> domains) throws ApplicationException {
        for(TmExpItemNoSpInfoDomain domain : domains) {
            tmExpItemNoSpInfoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#update(com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain)
     */
    public int update(TmExpItemNoSpInfoDomain domain) throws ApplicationException {
        return tmExpItemNoSpInfoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#update(java.util.List)
     */
    public int update(List<TmExpItemNoSpInfoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmExpItemNoSpInfoDomain domain : domains) {
            updateCount += tmExpItemNoSpInfoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public int updateByCondition(TmExpItemNoSpInfoDomain domain, TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmExpItemNoSpInfoDomain> domains, List<TmExpItemNoSpInfoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmExpItemNoSpInfoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public int delete(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public int deleteByCondition(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return tmExpItemNoSpInfoDao.deleteByCondition(criteria);
    }

}
