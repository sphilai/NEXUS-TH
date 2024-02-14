/*
 * PROJECT：eca0027
 * 
 * TmPkgSpecRevHis のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain;


/**
 * TmPkgSpecRevHis のService実装クラスです。<BR>
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
public class TmPkgSpecRevHisServiceImpl implements TmPkgSpecRevHisService {

    /**
     * tmPkgSpecRevHisのDAO
     */
    private TmPkgSpecRevHisDao tmPkgSpecRevHisDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSpecRevHisServiceImpl() {
    }

    /**
     * tmPkgSpecRevHisのDAOを設定します。
     * 
     * @param tmPkgSpecRevHisDao tmPkgSpecRevHisのDao
     */
    public void setTmPkgSpecRevHisDao(TmPkgSpecRevHisDao tmPkgSpecRevHisDao) {
        this.tmPkgSpecRevHisDao = tmPkgSpecRevHisDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public TmPkgSpecRevHisDomain searchByKey(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public List<TmPkgSpecRevHisDomain> searchByCondition(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public List<TmPkgSpecRevHisDomain> searchByConditionForPaging(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public int searchCount(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public TmPkgSpecRevHisDomain searchByKeyForChange(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public TmPkgSpecRevHisDomain lockByKey(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public TmPkgSpecRevHisDomain lockByKeyNoWait(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#create(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain)
     */
    public void create(TmPkgSpecRevHisDomain domain) throws ApplicationException {
        tmPkgSpecRevHisDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#create(java.util.List)
     */
    public void create(List<TmPkgSpecRevHisDomain> domains) throws ApplicationException {
        for(TmPkgSpecRevHisDomain domain : domains) {
            tmPkgSpecRevHisDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#update(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain)
     */
    public int update(TmPkgSpecRevHisDomain domain) throws ApplicationException {
        return tmPkgSpecRevHisDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#update(java.util.List)
     */
    public int update(List<TmPkgSpecRevHisDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmPkgSpecRevHisDomain domain : domains) {
            updateCount += tmPkgSpecRevHisDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public int updateByCondition(TmPkgSpecRevHisDomain domain, TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmPkgSpecRevHisDomain> domains, List<TmPkgSpecRevHisCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmPkgSpecRevHisDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public int delete(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public int deleteByCondition(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecRevHisDao.deleteByCondition(criteria);
    }

}
