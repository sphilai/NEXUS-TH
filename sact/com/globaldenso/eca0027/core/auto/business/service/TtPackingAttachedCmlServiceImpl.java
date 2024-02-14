/*
 * PROJECT：eca0027
 * 
 * TtPackingAttachedCml のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain;


/**
 * TtPackingAttachedCml のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 10:26:05<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TtPackingAttachedCmlServiceImpl implements TtPackingAttachedCmlService {

    /**
     * ttPackingAttachedCmlのDAO
     */
    private TtPackingAttachedCmlDao ttPackingAttachedCmlDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPackingAttachedCmlServiceImpl() {
    }

    /**
     * ttPackingAttachedCmlのDAOを設定します。
     * 
     * @param ttPackingAttachedCmlDao ttPackingAttachedCmlのDao
     */
    public void setTtPackingAttachedCmlDao(TtPackingAttachedCmlDao ttPackingAttachedCmlDao) {
        this.ttPackingAttachedCmlDao = ttPackingAttachedCmlDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public TtPackingAttachedCmlDomain searchByKey(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public List<TtPackingAttachedCmlDomain> searchByCondition(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public List<TtPackingAttachedCmlDomain> searchByConditionForPaging(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public int searchCount(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public TtPackingAttachedCmlDomain searchByKeyForChange(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public TtPackingAttachedCmlDomain lockByKey(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public TtPackingAttachedCmlDomain lockByKeyNoWait(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain)
     */
    public void create(TtPackingAttachedCmlDomain domain) throws ApplicationException {
        ttPackingAttachedCmlDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#create(java.util.List)
     */
    public void create(List<TtPackingAttachedCmlDomain> domains) throws ApplicationException {
        for(TtPackingAttachedCmlDomain domain : domains) {
            ttPackingAttachedCmlDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain)
     */
    public int update(TtPackingAttachedCmlDomain domain) throws ApplicationException {
        return ttPackingAttachedCmlDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#update(java.util.List)
     */
    public int update(List<TtPackingAttachedCmlDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPackingAttachedCmlDomain domain : domains) {
            updateCount += ttPackingAttachedCmlDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public int updateByCondition(TtPackingAttachedCmlDomain domain, TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPackingAttachedCmlDomain> domains, List<TtPackingAttachedCmlCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPackingAttachedCmlDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public int delete(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public int deleteByCondition(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return ttPackingAttachedCmlDao.deleteByCondition(criteria);
    }

}
