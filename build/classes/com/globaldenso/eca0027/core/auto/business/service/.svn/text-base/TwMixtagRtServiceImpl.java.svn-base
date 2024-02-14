/*
 * PROJECT：eca0027
 * 
 * TwMixtagRt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain;


/**
 * TwMixtagRt のService実装クラスです。<BR>
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
public class TwMixtagRtServiceImpl implements TwMixtagRtService {

    /**
     * twMixtagRtのDAO
     */
    private TwMixtagRtDao twMixtagRtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwMixtagRtServiceImpl() {
    }

    /**
     * twMixtagRtのDAOを設定します。
     * 
     * @param twMixtagRtDao twMixtagRtのDao
     */
    public void setTwMixtagRtDao(TwMixtagRtDao twMixtagRtDao) {
        this.twMixtagRtDao = twMixtagRtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public TwMixtagRtDomain searchByKey(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public List<TwMixtagRtDomain> searchByCondition(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public List<TwMixtagRtDomain> searchByConditionForPaging(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public int searchCount(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public TwMixtagRtDomain searchByKeyForChange(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public TwMixtagRtDomain lockByKey(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public TwMixtagRtDomain lockByKeyNoWait(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#create(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain)
     */
    public void create(TwMixtagRtDomain domain) throws ApplicationException {
        twMixtagRtDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#create(java.util.List)
     */
    public void create(List<TwMixtagRtDomain> domains) throws ApplicationException {
        for(TwMixtagRtDomain domain : domains) {
            twMixtagRtDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#update(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain)
     */
    public int update(TwMixtagRtDomain domain) throws ApplicationException {
        return twMixtagRtDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#update(java.util.List)
     */
    public int update(List<TwMixtagRtDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwMixtagRtDomain domain : domains) {
            updateCount += twMixtagRtDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public int updateByCondition(TwMixtagRtDomain domain, TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwMixtagRtDomain> domains, List<TwMixtagRtCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twMixtagRtDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public int delete(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public int deleteByCondition(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return twMixtagRtDao.deleteByCondition(criteria);
    }

}
