/*
 * PROJECT：eca0027
 * 
 * TmNxsShipTo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/04/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;


/**
 * TmNxsShipTo のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/04/20 16:39:30<BR>
 * 
 * テーブル定義から2016/04/20に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 13082 $
 */
public class TmNxsShipToServiceImpl implements TmNxsShipToService {

    /**
     * tmNxsShipToのDAO
     */
    private TmNxsShipToDao tmNxsShipToDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmNxsShipToServiceImpl() {
    }

    /**
     * tmNxsShipToのDAOを設定します。
     * 
     * @param tmNxsShipToDao tmNxsShipToのDao
     */
    public void setTmNxsShipToDao(TmNxsShipToDao tmNxsShipToDao) {
        this.tmNxsShipToDao = tmNxsShipToDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public TmNxsShipToDomain searchByKey(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public List<TmNxsShipToDomain> searchByCondition(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public List<TmNxsShipToDomain> searchByConditionForPaging(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public int searchCount(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public TmNxsShipToDomain searchByKeyForChange(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public TmNxsShipToDomain lockByKey(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public TmNxsShipToDomain lockByKeyNoWait(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#create(com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain)
     */
    public void create(TmNxsShipToDomain domain) throws ApplicationException {
        tmNxsShipToDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#create(java.util.List)
     */
    public void create(List<TmNxsShipToDomain> domains) throws ApplicationException {
        for(TmNxsShipToDomain domain : domains) {
            tmNxsShipToDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#update(com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain)
     */
    public int update(TmNxsShipToDomain domain) throws ApplicationException {
        return tmNxsShipToDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#update(java.util.List)
     */
    public int update(List<TmNxsShipToDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmNxsShipToDomain domain : domains) {
            updateCount += tmNxsShipToDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public int updateByCondition(TmNxsShipToDomain domain, TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmNxsShipToDomain> domains, List<TmNxsShipToCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmNxsShipToDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public int delete(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public int deleteByCondition(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return tmNxsShipToDao.deleteByCondition(criteria);
    }

}
