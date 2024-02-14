/*
 * PROJECT：eca0027
 * 
 * TmInvTpl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;


/**
 * TmInvTpl のService実装クラスです。<BR>
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
public class TmInvTplServiceImpl implements TmInvTplService {

    /**
     * tmInvTplのDAO
     */
    private TmInvTplDao tmInvTplDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvTplServiceImpl() {
    }

    /**
     * tmInvTplのDAOを設定します。
     * 
     * @param tmInvTplDao tmInvTplのDao
     */
    public void setTmInvTplDao(TmInvTplDao tmInvTplDao) {
        this.tmInvTplDao = tmInvTplDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public TmInvTplDomain searchByKey(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public List<TmInvTplDomain> searchByCondition(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public List<TmInvTplDomain> searchByConditionForPaging(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public int searchCount(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public TmInvTplDomain searchByKeyForChange(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public TmInvTplDomain lockByKey(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public TmInvTplDomain lockByKeyNoWait(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain)
     */
    public void create(TmInvTplDomain domain) throws ApplicationException {
        tmInvTplDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#create(java.util.List)
     */
    public void create(List<TmInvTplDomain> domains) throws ApplicationException {
        for(TmInvTplDomain domain : domains) {
            tmInvTplDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain)
     */
    public int update(TmInvTplDomain domain) throws ApplicationException {
        return tmInvTplDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#update(java.util.List)
     */
    public int update(List<TmInvTplDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmInvTplDomain domain : domains) {
            updateCount += tmInvTplDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public int updateByCondition(TmInvTplDomain domain, TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmInvTplDomain> domains, List<TmInvTplCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmInvTplDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public int delete(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvTplService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public int deleteByCondition(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return tmInvTplDao.deleteByCondition(criteria);
    }

}
