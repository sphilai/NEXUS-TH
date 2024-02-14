/*
 * PROJECT：eca0027
 * 
 * TmPkgSpecRev のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain;


/**
 * TmPkgSpecRev のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/05 17:39:47<BR>
 * 
 * テーブル定義から2014/11/05に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TmPkgSpecRevServiceImpl implements TmPkgSpecRevService {

    /**
     * tmPkgSpecRevのDAO
     */
    private TmPkgSpecRevDao tmPkgSpecRevDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSpecRevServiceImpl() {
    }

    /**
     * tmPkgSpecRevのDAOを設定します。
     * 
     * @param tmPkgSpecRevDao tmPkgSpecRevのDao
     */
    public void setTmPkgSpecRevDao(TmPkgSpecRevDao tmPkgSpecRevDao) {
        this.tmPkgSpecRevDao = tmPkgSpecRevDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public TmPkgSpecRevDomain searchByKey(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public List<TmPkgSpecRevDomain> searchByCondition(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public List<TmPkgSpecRevDomain> searchByConditionForPaging(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public int searchCount(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public TmPkgSpecRevDomain searchByKeyForChange(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public TmPkgSpecRevDomain lockByKey(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public TmPkgSpecRevDomain lockByKeyNoWait(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#create(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain)
     */
    public void create(TmPkgSpecRevDomain domain) throws ApplicationException {
        tmPkgSpecRevDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#create(java.util.List)
     */
    public void create(List<TmPkgSpecRevDomain> domains) throws ApplicationException {
        for(TmPkgSpecRevDomain domain : domains) {
            tmPkgSpecRevDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#update(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain)
     */
    public int update(TmPkgSpecRevDomain domain) throws ApplicationException {
        return tmPkgSpecRevDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#update(java.util.List)
     */
    public int update(List<TmPkgSpecRevDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmPkgSpecRevDomain domain : domains) {
            updateCount += tmPkgSpecRevDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public int updateByCondition(TmPkgSpecRevDomain domain, TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmPkgSpecRevDomain> domains, List<TmPkgSpecRevCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmPkgSpecRevDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public int delete(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public int deleteByCondition(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevDao.deleteByCondition(criteria);
    }

}
