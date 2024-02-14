/*
 * PROJECT：eca0027
 * 
 * TmExpRegulateTyp のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpRegulateTypDomain;


/**
 * TmExpRegulateTyp のService実装クラスです。<BR>
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
public class TmExpRegulateTypServiceImpl implements TmExpRegulateTypService {

    /**
     * tmExpRegulateTypのDAO
     */
    private TmExpRegulateTypDao tmExpRegulateTypDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpRegulateTypServiceImpl() {
    }

    /**
     * tmExpRegulateTypのDAOを設定します。
     * 
     * @param tmExpRegulateTypDao tmExpRegulateTypのDao
     */
    public void setTmExpRegulateTypDao(TmExpRegulateTypDao tmExpRegulateTypDao) {
        this.tmExpRegulateTypDao = tmExpRegulateTypDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public TmExpRegulateTypDomain searchByKey(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public List<TmExpRegulateTypDomain> searchByCondition(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public List<TmExpRegulateTypDomain> searchByConditionForPaging(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public int searchCount(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public TmExpRegulateTypDomain searchByKeyForChange(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public TmExpRegulateTypDomain lockByKey(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public TmExpRegulateTypDomain lockByKeyNoWait(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpRegulateTypDomain)
     */
    public void create(TmExpRegulateTypDomain domain) throws ApplicationException {
        tmExpRegulateTypDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#create(java.util.List)
     */
    public void create(List<TmExpRegulateTypDomain> domains) throws ApplicationException {
        for(TmExpRegulateTypDomain domain : domains) {
            tmExpRegulateTypDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#update(com.globaldenso.eca0027.core.auto.business.domain.TmExpRegulateTypDomain)
     */
    public int update(TmExpRegulateTypDomain domain) throws ApplicationException {
        return tmExpRegulateTypDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#update(java.util.List)
     */
    public int update(List<TmExpRegulateTypDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmExpRegulateTypDomain domain : domains) {
            updateCount += tmExpRegulateTypDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpRegulateTypDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public int updateByCondition(TmExpRegulateTypDomain domain, TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmExpRegulateTypDomain> domains, List<TmExpRegulateTypCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmExpRegulateTypDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public int delete(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public int deleteByCondition(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return tmExpRegulateTypDao.deleteByCondition(criteria);
    }

}
