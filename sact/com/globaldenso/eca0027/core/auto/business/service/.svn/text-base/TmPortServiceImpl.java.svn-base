/*
 * PROJECT：eca0027
 * 
 * TmPort のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPortDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain;


/**
 * TmPort のService実装クラスです。<BR>
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
public class TmPortServiceImpl implements TmPortService {

    /**
     * tmPortのDAO
     */
    private TmPortDao tmPortDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPortServiceImpl() {
    }

    /**
     * tmPortのDAOを設定します。
     * 
     * @param tmPortDao tmPortのDao
     */
    public void setTmPortDao(TmPortDao tmPortDao) {
        this.tmPortDao = tmPortDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public TmPortDomain searchByKey(TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public List<TmPortDomain> searchByCondition(TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public List<TmPortDomain> searchByConditionForPaging(TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public int searchCount(TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public TmPortDomain searchByKeyForChange(TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public TmPortDomain lockByKey(TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public TmPortDomain lockByKeyNoWait(TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#create(com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain)
     */
    public void create(TmPortDomain domain) throws ApplicationException {
        tmPortDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#create(java.util.List)
     */
    public void create(List<TmPortDomain> domains) throws ApplicationException {
        for(TmPortDomain domain : domains) {
            tmPortDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#update(com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain)
     */
    public int update(TmPortDomain domain) throws ApplicationException {
        return tmPortDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#update(java.util.List)
     */
    public int update(List<TmPortDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmPortDomain domain : domains) {
            updateCount += tmPortDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public int updateByCondition(TmPortDomain domain, TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmPortDomain> domains, List<TmPortCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmPortDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public int delete(TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public int deleteByCondition(TmPortCriteriaDomain criteria) throws ApplicationException {
        return tmPortDao.deleteByCondition(criteria);
    }

}
