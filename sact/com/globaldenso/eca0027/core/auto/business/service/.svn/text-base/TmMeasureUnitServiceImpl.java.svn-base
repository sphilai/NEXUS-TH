/*
 * PROJECT：eca0027
 * 
 * TmMeasureUnit のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/12/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;


/**
 * TmMeasureUnit のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/12/05 16:41:35<BR>
 * 
 * テーブル定義から2014/12/05に自動生成したモジュールです。
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 10146 $
 */
public class TmMeasureUnitServiceImpl implements TmMeasureUnitService {

    /**
     * tmMeasureUnitのDAO
     */
    private TmMeasureUnitDao tmMeasureUnitDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmMeasureUnitServiceImpl() {
    }

    /**
     * tmMeasureUnitのDAOを設定します。
     * 
     * @param tmMeasureUnitDao tmMeasureUnitのDao
     */
    public void setTmMeasureUnitDao(TmMeasureUnitDao tmMeasureUnitDao) {
        this.tmMeasureUnitDao = tmMeasureUnitDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public TmMeasureUnitDomain searchByKey(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public List<TmMeasureUnitDomain> searchByCondition(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public List<TmMeasureUnitDomain> searchByConditionForPaging(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public int searchCount(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public TmMeasureUnitDomain searchByKeyForChange(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public TmMeasureUnitDomain lockByKey(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public TmMeasureUnitDomain lockByKeyNoWait(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#create(com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain)
     */
    public void create(TmMeasureUnitDomain domain) throws ApplicationException {
        tmMeasureUnitDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#create(java.util.List)
     */
    public void create(List<TmMeasureUnitDomain> domains) throws ApplicationException {
        for(TmMeasureUnitDomain domain : domains) {
            tmMeasureUnitDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#update(com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain)
     */
    public int update(TmMeasureUnitDomain domain) throws ApplicationException {
        return tmMeasureUnitDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#update(java.util.List)
     */
    public int update(List<TmMeasureUnitDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmMeasureUnitDomain domain : domains) {
            updateCount += tmMeasureUnitDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public int updateByCondition(TmMeasureUnitDomain domain, TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmMeasureUnitDomain> domains, List<TmMeasureUnitCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmMeasureUnitDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public int delete(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public int deleteByCondition(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return tmMeasureUnitDao.deleteByCondition(criteria);
    }

}
