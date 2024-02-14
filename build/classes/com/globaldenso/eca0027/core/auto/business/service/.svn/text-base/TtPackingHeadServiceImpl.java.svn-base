/*
 * PROJECT：eca0027
 * 
 * TtPackingHead のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain;


/**
 * TtPackingHead のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/17 15:44:47<BR>
 * 
 * テーブル定義から2014/11/17に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TtPackingHeadServiceImpl implements TtPackingHeadService {

    /**
     * ttPackingHeadのDAO
     */
    private TtPackingHeadDao ttPackingHeadDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPackingHeadServiceImpl() {
    }

    /**
     * ttPackingHeadのDAOを設定します。
     * 
     * @param ttPackingHeadDao ttPackingHeadのDao
     */
    public void setTtPackingHeadDao(TtPackingHeadDao ttPackingHeadDao) {
        this.ttPackingHeadDao = ttPackingHeadDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public TtPackingHeadDomain searchByKey(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public List<TtPackingHeadDomain> searchByCondition(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public List<TtPackingHeadDomain> searchByConditionForPaging(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public int searchCount(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public TtPackingHeadDomain searchByKeyForChange(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public TtPackingHeadDomain lockByKey(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public TtPackingHeadDomain lockByKeyNoWait(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain)
     */
    public void create(TtPackingHeadDomain domain) throws ApplicationException {
        ttPackingHeadDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#create(java.util.List)
     */
    public void create(List<TtPackingHeadDomain> domains) throws ApplicationException {
        for(TtPackingHeadDomain domain : domains) {
            ttPackingHeadDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain)
     */
    public int update(TtPackingHeadDomain domain) throws ApplicationException {
        return ttPackingHeadDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#update(java.util.List)
     */
    public int update(List<TtPackingHeadDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPackingHeadDomain domain : domains) {
            updateCount += ttPackingHeadDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public int updateByCondition(TtPackingHeadDomain domain, TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPackingHeadDomain> domains, List<TtPackingHeadCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPackingHeadDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public int delete(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public int deleteByCondition(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return ttPackingHeadDao.deleteByCondition(criteria);
    }

}
