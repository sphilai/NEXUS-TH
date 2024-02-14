/*
 * PROJECT：eca0027
 * 
 * TtMixtagRt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain;


/**
 * TtMixtagRt のService実装クラスです。<BR>
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
public class TtMixtagRtServiceImpl implements TtMixtagRtService {

    /**
     * ttMixtagRtのDAO
     */
    private TtMixtagRtDao ttMixtagRtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixtagRtServiceImpl() {
    }

    /**
     * ttMixtagRtのDAOを設定します。
     * 
     * @param ttMixtagRtDao ttMixtagRtのDao
     */
    public void setTtMixtagRtDao(TtMixtagRtDao ttMixtagRtDao) {
        this.ttMixtagRtDao = ttMixtagRtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public TtMixtagRtDomain searchByKey(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public List<TtMixtagRtDomain> searchByCondition(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public List<TtMixtagRtDomain> searchByConditionForPaging(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public int searchCount(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public TtMixtagRtDomain searchByKeyForChange(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public TtMixtagRtDomain lockByKey(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public TtMixtagRtDomain lockByKeyNoWait(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain)
     */
    public void create(TtMixtagRtDomain domain) throws ApplicationException {
        ttMixtagRtDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#create(java.util.List)
     */
    public void create(List<TtMixtagRtDomain> domains) throws ApplicationException {
        for(TtMixtagRtDomain domain : domains) {
            ttMixtagRtDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain)
     */
    public int update(TtMixtagRtDomain domain) throws ApplicationException {
        return ttMixtagRtDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#update(java.util.List)
     */
    public int update(List<TtMixtagRtDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtMixtagRtDomain domain : domains) {
            updateCount += ttMixtagRtDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public int updateByCondition(TtMixtagRtDomain domain, TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtMixtagRtDomain> domains, List<TtMixtagRtCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttMixtagRtDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public int delete(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public int deleteByCondition(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagRtDao.deleteByCondition(criteria);
    }

}
