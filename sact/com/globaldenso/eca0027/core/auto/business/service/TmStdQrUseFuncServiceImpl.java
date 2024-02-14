/*
 * PROJECT：eca0027
 * 
 * TmStdQrUseFunc のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmStdQrUseFuncDomain;


/**
 * TmStdQrUseFunc のService実装クラスです。<BR>
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
public class TmStdQrUseFuncServiceImpl implements TmStdQrUseFuncService {

    /**
     * tmStdQrUseFuncのDAO
     */
    private TmStdQrUseFuncDao tmStdQrUseFuncDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmStdQrUseFuncServiceImpl() {
    }

    /**
     * tmStdQrUseFuncのDAOを設定します。
     * 
     * @param tmStdQrUseFuncDao tmStdQrUseFuncのDao
     */
    public void setTmStdQrUseFuncDao(TmStdQrUseFuncDao tmStdQrUseFuncDao) {
        this.tmStdQrUseFuncDao = tmStdQrUseFuncDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public TmStdQrUseFuncDomain searchByKey(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public List<TmStdQrUseFuncDomain> searchByCondition(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public List<TmStdQrUseFuncDomain> searchByConditionForPaging(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public int searchCount(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public TmStdQrUseFuncDomain searchByKeyForChange(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public TmStdQrUseFuncDomain lockByKey(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public TmStdQrUseFuncDomain lockByKeyNoWait(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#create(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrUseFuncDomain)
     */
    public void create(TmStdQrUseFuncDomain domain) throws ApplicationException {
        tmStdQrUseFuncDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#create(java.util.List)
     */
    public void create(List<TmStdQrUseFuncDomain> domains) throws ApplicationException {
        for(TmStdQrUseFuncDomain domain : domains) {
            tmStdQrUseFuncDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#update(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrUseFuncDomain)
     */
    public int update(TmStdQrUseFuncDomain domain) throws ApplicationException {
        return tmStdQrUseFuncDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#update(java.util.List)
     */
    public int update(List<TmStdQrUseFuncDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmStdQrUseFuncDomain domain : domains) {
            updateCount += tmStdQrUseFuncDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrUseFuncDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public int updateByCondition(TmStdQrUseFuncDomain domain, TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmStdQrUseFuncDomain> domains, List<TmStdQrUseFuncCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmStdQrUseFuncDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public int delete(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrUseFuncService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public int deleteByCondition(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrUseFuncDao.deleteByCondition(criteria);
    }

}
