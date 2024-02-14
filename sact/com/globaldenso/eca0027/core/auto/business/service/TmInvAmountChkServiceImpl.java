/*
 * PROJECT：eca0027
 * 
 * TmInvAmountChk のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/16  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain;


/**
 * TmInvAmountChk のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/16 10:50:51<BR>
 * 
 * テーブル定義から2014/04/16に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmInvAmountChkServiceImpl implements TmInvAmountChkService {

    /**
     * tmInvAmountChkのDAO
     */
    private TmInvAmountChkDao tmInvAmountChkDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvAmountChkServiceImpl() {
    }

    /**
     * tmInvAmountChkのDAOを設定します。
     * 
     * @param tmInvAmountChkDao tmInvAmountChkのDao
     */
    public void setTmInvAmountChkDao(TmInvAmountChkDao tmInvAmountChkDao) {
        this.tmInvAmountChkDao = tmInvAmountChkDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public TmInvAmountChkDomain searchByKey(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public List<TmInvAmountChkDomain> searchByCondition(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public List<TmInvAmountChkDomain> searchByConditionForPaging(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public int searchCount(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public TmInvAmountChkDomain searchByKeyForChange(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public TmInvAmountChkDomain lockByKey(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public TmInvAmountChkDomain lockByKeyNoWait(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain)
     */
    public void create(TmInvAmountChkDomain domain) throws ApplicationException {
        tmInvAmountChkDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#create(java.util.List)
     */
    public void create(List<TmInvAmountChkDomain> domains) throws ApplicationException {
        for(TmInvAmountChkDomain domain : domains) {
            tmInvAmountChkDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain)
     */
    public int update(TmInvAmountChkDomain domain) throws ApplicationException {
        return tmInvAmountChkDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#update(java.util.List)
     */
    public int update(List<TmInvAmountChkDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmInvAmountChkDomain domain : domains) {
            updateCount += tmInvAmountChkDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public int updateByCondition(TmInvAmountChkDomain domain, TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmInvAmountChkDomain> domains, List<TmInvAmountChkCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmInvAmountChkDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public int delete(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public int deleteByCondition(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return tmInvAmountChkDao.deleteByCondition(criteria);
    }

}
