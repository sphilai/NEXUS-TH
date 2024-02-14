/*
 * PROJECT：eca0027
 * 
 * TtMixKanban のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain;


/**
 * TtMixKanban のService実装クラスです。<BR>
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
public class TtMixKanbanServiceImpl implements TtMixKanbanService {

    /**
     * ttMixKanbanのDAO
     */
    private TtMixKanbanDao ttMixKanbanDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixKanbanServiceImpl() {
    }

    /**
     * ttMixKanbanのDAOを設定します。
     * 
     * @param ttMixKanbanDao ttMixKanbanのDao
     */
    public void setTtMixKanbanDao(TtMixKanbanDao ttMixKanbanDao) {
        this.ttMixKanbanDao = ttMixKanbanDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public TtMixKanbanDomain searchByKey(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public List<TtMixKanbanDomain> searchByCondition(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public List<TtMixKanbanDomain> searchByConditionForPaging(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public int searchCount(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public TtMixKanbanDomain searchByKeyForChange(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public TtMixKanbanDomain lockByKey(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public TtMixKanbanDomain lockByKeyNoWait(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain)
     */
    public void create(TtMixKanbanDomain domain) throws ApplicationException {
        ttMixKanbanDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#create(java.util.List)
     */
    public void create(List<TtMixKanbanDomain> domains) throws ApplicationException {
        for(TtMixKanbanDomain domain : domains) {
            ttMixKanbanDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain)
     */
    public int update(TtMixKanbanDomain domain) throws ApplicationException {
        return ttMixKanbanDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#update(java.util.List)
     */
    public int update(List<TtMixKanbanDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtMixKanbanDomain domain : domains) {
            updateCount += ttMixKanbanDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public int updateByCondition(TtMixKanbanDomain domain, TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtMixKanbanDomain> domains, List<TtMixKanbanCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttMixKanbanDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public int delete(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public int deleteByCondition(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttMixKanbanDao.deleteByCondition(criteria);
    }

}
