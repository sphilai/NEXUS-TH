/*
 * PROJECT：eca0027
 * 
 * TtSysInfo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoDomain;


/**
 * TtSysInfo のService実装クラスです。<BR>
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
public class TtSysInfoServiceImpl implements TtSysInfoService {

    /**
     * ttSysInfoのDAO
     */
    private TtSysInfoDao ttSysInfoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtSysInfoServiceImpl() {
    }

    /**
     * ttSysInfoのDAOを設定します。
     * 
     * @param ttSysInfoDao ttSysInfoのDao
     */
    public void setTtSysInfoDao(TtSysInfoDao ttSysInfoDao) {
        this.ttSysInfoDao = ttSysInfoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public TtSysInfoDomain searchByKey(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public List<TtSysInfoDomain> searchByCondition(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public List<TtSysInfoDomain> searchByConditionForPaging(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public int searchCount(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public TtSysInfoDomain searchByKeyForChange(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public TtSysInfoDomain lockByKey(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public TtSysInfoDomain lockByKeyNoWait(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#create(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoDomain)
     */
    public void create(TtSysInfoDomain domain) throws ApplicationException {
        ttSysInfoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#create(java.util.List)
     */
    public void create(List<TtSysInfoDomain> domains) throws ApplicationException {
        for(TtSysInfoDomain domain : domains) {
            ttSysInfoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#update(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoDomain)
     */
    public int update(TtSysInfoDomain domain) throws ApplicationException {
        return ttSysInfoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#update(java.util.List)
     */
    public int update(List<TtSysInfoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtSysInfoDomain domain : domains) {
            updateCount += ttSysInfoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public int updateByCondition(TtSysInfoDomain domain, TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtSysInfoDomain> domains, List<TtSysInfoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttSysInfoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public int delete(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public int deleteByCondition(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoDao.deleteByCondition(criteria);
    }

}
