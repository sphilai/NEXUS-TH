/*
 * PROJECT：eca0027
 * 
 * TtOnlineReqJobParam のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/07/06  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain;


/**
 * TtOnlineReqJobParam のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/07/06 18:42:21<BR>
 * 
 * テーブル定義から2016/07/06に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13160 $
 */
public class TtOnlineReqJobParamServiceImpl implements TtOnlineReqJobParamService {

    /**
     * ttOnlineReqJobParamのDAO
     */
    private TtOnlineReqJobParamDao ttOnlineReqJobParamDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtOnlineReqJobParamServiceImpl() {
    }

    /**
     * ttOnlineReqJobParamのDAOを設定します。
     * 
     * @param ttOnlineReqJobParamDao ttOnlineReqJobParamのDao
     */
    public void setTtOnlineReqJobParamDao(TtOnlineReqJobParamDao ttOnlineReqJobParamDao) {
        this.ttOnlineReqJobParamDao = ttOnlineReqJobParamDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public TtOnlineReqJobParamDomain searchByKey(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public List<TtOnlineReqJobParamDomain> searchByCondition(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public List<TtOnlineReqJobParamDomain> searchByConditionForPaging(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public int searchCount(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public TtOnlineReqJobParamDomain searchByKeyForChange(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public TtOnlineReqJobParamDomain lockByKey(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public TtOnlineReqJobParamDomain lockByKeyNoWait(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#create(com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain)
     */
    public void create(TtOnlineReqJobParamDomain domain) throws ApplicationException {
        ttOnlineReqJobParamDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#create(java.util.List)
     */
    public void create(List<TtOnlineReqJobParamDomain> domains) throws ApplicationException {
        for(TtOnlineReqJobParamDomain domain : domains) {
            ttOnlineReqJobParamDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#update(com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain)
     */
    public int update(TtOnlineReqJobParamDomain domain) throws ApplicationException {
        return ttOnlineReqJobParamDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#update(java.util.List)
     */
    public int update(List<TtOnlineReqJobParamDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtOnlineReqJobParamDomain domain : domains) {
            updateCount += ttOnlineReqJobParamDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public int updateByCondition(TtOnlineReqJobParamDomain domain, TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtOnlineReqJobParamDomain> domains, List<TtOnlineReqJobParamCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttOnlineReqJobParamDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public int delete(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public int deleteByCondition(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return ttOnlineReqJobParamDao.deleteByCondition(criteria);
    }

}
