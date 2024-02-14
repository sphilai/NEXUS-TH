/*
 * PROJECT：eca0027
 * 
 * TmNxsComp のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/13  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;


/**
 * TmNxsComp のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/13 09:56:51<BR>
 * 
 * テーブル定義から2014/11/13に自動生成したモジュールです。
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 9705 $
 */
public class TmNxsCompServiceImpl implements TmNxsCompService {

    /**
     * tmNxsCompのDAO
     */
    private TmNxsCompDao tmNxsCompDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmNxsCompServiceImpl() {
    }

    /**
     * tmNxsCompのDAOを設定します。
     * 
     * @param tmNxsCompDao tmNxsCompのDao
     */
    public void setTmNxsCompDao(TmNxsCompDao tmNxsCompDao) {
        this.tmNxsCompDao = tmNxsCompDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public TmNxsCompDomain searchByKey(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public List<TmNxsCompDomain> searchByCondition(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public List<TmNxsCompDomain> searchByConditionForPaging(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public int searchCount(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public TmNxsCompDomain searchByKeyForChange(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public TmNxsCompDomain lockByKey(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public TmNxsCompDomain lockByKeyNoWait(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#create(com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain)
     */
    public void create(TmNxsCompDomain domain) throws ApplicationException {
        tmNxsCompDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#create(java.util.List)
     */
    public void create(List<TmNxsCompDomain> domains) throws ApplicationException {
        for(TmNxsCompDomain domain : domains) {
            tmNxsCompDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#update(com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain)
     */
    public int update(TmNxsCompDomain domain) throws ApplicationException {
        return tmNxsCompDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#update(java.util.List)
     */
    public int update(List<TmNxsCompDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmNxsCompDomain domain : domains) {
            updateCount += tmNxsCompDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public int updateByCondition(TmNxsCompDomain domain, TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmNxsCompDomain> domains, List<TmNxsCompCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmNxsCompDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public int delete(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public int deleteByCondition(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return tmNxsCompDao.deleteByCondition(criteria);
    }

}
