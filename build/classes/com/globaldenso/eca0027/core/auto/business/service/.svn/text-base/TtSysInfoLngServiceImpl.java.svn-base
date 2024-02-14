/*
 * PROJECT：eca0027
 * 
 * TtSysInfoLng のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoLngDomain;


/**
 * TtSysInfoLng のService実装クラスです。<BR>
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
public class TtSysInfoLngServiceImpl implements TtSysInfoLngService {

    /**
     * ttSysInfoLngのDAO
     */
    private TtSysInfoLngDao ttSysInfoLngDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtSysInfoLngServiceImpl() {
    }

    /**
     * ttSysInfoLngのDAOを設定します。
     * 
     * @param ttSysInfoLngDao ttSysInfoLngのDao
     */
    public void setTtSysInfoLngDao(TtSysInfoLngDao ttSysInfoLngDao) {
        this.ttSysInfoLngDao = ttSysInfoLngDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public TtSysInfoLngDomain searchByKey(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public List<TtSysInfoLngDomain> searchByCondition(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public List<TtSysInfoLngDomain> searchByConditionForPaging(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public int searchCount(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public TtSysInfoLngDomain searchByKeyForChange(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public TtSysInfoLngDomain lockByKey(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public TtSysInfoLngDomain lockByKeyNoWait(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#create(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoLngDomain)
     */
    public void create(TtSysInfoLngDomain domain) throws ApplicationException {
        ttSysInfoLngDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#create(java.util.List)
     */
    public void create(List<TtSysInfoLngDomain> domains) throws ApplicationException {
        for(TtSysInfoLngDomain domain : domains) {
            ttSysInfoLngDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#update(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoLngDomain)
     */
    public int update(TtSysInfoLngDomain domain) throws ApplicationException {
        return ttSysInfoLngDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#update(java.util.List)
     */
    public int update(List<TtSysInfoLngDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtSysInfoLngDomain domain : domains) {
            updateCount += ttSysInfoLngDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoLngDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public int updateByCondition(TtSysInfoLngDomain domain, TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtSysInfoLngDomain> domains, List<TtSysInfoLngCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttSysInfoLngDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public int delete(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtSysInfoLngService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public int deleteByCondition(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return ttSysInfoLngDao.deleteByCondition(criteria);
    }

}
