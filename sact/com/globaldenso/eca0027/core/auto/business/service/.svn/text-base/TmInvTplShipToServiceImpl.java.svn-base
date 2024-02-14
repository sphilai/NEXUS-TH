/*
 * PROJECT：eca0027
 * 
 * TmInvTplShipTo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain;


/**
 * TmInvTplShipTo のService実装クラスです。<BR>
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
public class TmInvTplShipToServiceImpl implements TmInvTplShipToService {

    /**
     * tmInvTplShipToのDAO
     */
    private TmInvTplShipToDao tmInvTplShipToDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvTplShipToServiceImpl() {
    }

    /**
     * tmInvTplShipToのDAOを設定します。
     * 
     * @param tmInvTplShipToDao tmInvTplShipToのDao
     */
    public void setTmInvTplShipToDao(TmInvTplShipToDao tmInvTplShipToDao) {
        this.tmInvTplShipToDao = tmInvTplShipToDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public TmInvTplShipToDomain searchByKey(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public List<TmInvTplShipToDomain> searchByCondition(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public List<TmInvTplShipToDomain> searchByConditionForPaging(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public int searchCount(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public TmInvTplShipToDomain searchByKeyForChange(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public TmInvTplShipToDomain lockByKey(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public TmInvTplShipToDomain lockByKeyNoWait(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain)
     */
    public void create(TmInvTplShipToDomain domain) throws ApplicationException {
        tmInvTplShipToDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#create(java.util.List)
     */
    public void create(List<TmInvTplShipToDomain> domains) throws ApplicationException {
        for(TmInvTplShipToDomain domain : domains) {
            tmInvTplShipToDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain)
     */
    public int update(TmInvTplShipToDomain domain) throws ApplicationException {
        return tmInvTplShipToDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#update(java.util.List)
     */
    public int update(List<TmInvTplShipToDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmInvTplShipToDomain domain : domains) {
            updateCount += tmInvTplShipToDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public int updateByCondition(TmInvTplShipToDomain domain, TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmInvTplShipToDomain> domains, List<TmInvTplShipToCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmInvTplShipToDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public int delete(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public int deleteByCondition(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplShipToDao.deleteByCondition(criteria);
    }

}
