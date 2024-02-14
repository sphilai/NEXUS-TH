/*
 * PROJECT：eca0027
 * 
 * TmOtherSysLink のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/02/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkDomain;


/**
 * TmOtherSysLink のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/02/11 14:36:46<BR>
 * 
 * テーブル定義から2015/02/11に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10644 $
 */
public class TmOtherSysLinkServiceImpl implements TmOtherSysLinkService {

    /**
     * tmOtherSysLinkのDAO
     */
    private TmOtherSysLinkDao tmOtherSysLinkDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmOtherSysLinkServiceImpl() {
    }

    /**
     * tmOtherSysLinkのDAOを設定します。
     * 
     * @param tmOtherSysLinkDao tmOtherSysLinkのDao
     */
    public void setTmOtherSysLinkDao(TmOtherSysLinkDao tmOtherSysLinkDao) {
        this.tmOtherSysLinkDao = tmOtherSysLinkDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public TmOtherSysLinkDomain searchByKey(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public List<TmOtherSysLinkDomain> searchByCondition(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public List<TmOtherSysLinkDomain> searchByConditionForPaging(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public int searchCount(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public TmOtherSysLinkDomain searchByKeyForChange(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public TmOtherSysLinkDomain lockByKey(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public TmOtherSysLinkDomain lockByKeyNoWait(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#create(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkDomain)
     */
    public void create(TmOtherSysLinkDomain domain) throws ApplicationException {
        tmOtherSysLinkDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#create(java.util.List)
     */
    public void create(List<TmOtherSysLinkDomain> domains) throws ApplicationException {
        for(TmOtherSysLinkDomain domain : domains) {
            tmOtherSysLinkDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#update(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkDomain)
     */
    public int update(TmOtherSysLinkDomain domain) throws ApplicationException {
        return tmOtherSysLinkDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#update(java.util.List)
     */
    public int update(List<TmOtherSysLinkDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmOtherSysLinkDomain domain : domains) {
            updateCount += tmOtherSysLinkDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public int updateByCondition(TmOtherSysLinkDomain domain, TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmOtherSysLinkDomain> domains, List<TmOtherSysLinkCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmOtherSysLinkDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public int delete(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public int deleteByCondition(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkDao.deleteByCondition(criteria);
    }

}
