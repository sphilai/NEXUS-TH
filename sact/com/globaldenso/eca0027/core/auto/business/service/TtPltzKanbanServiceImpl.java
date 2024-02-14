/*
 * PROJECT：eca0027
 * 
 * TtPltzKanban のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain;


/**
 * TtPltzKanban のService実装クラスです。<BR>
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
public class TtPltzKanbanServiceImpl implements TtPltzKanbanService {

    /**
     * ttPltzKanbanのDAO
     */
    private TtPltzKanbanDao ttPltzKanbanDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzKanbanServiceImpl() {
    }

    /**
     * ttPltzKanbanのDAOを設定します。
     * 
     * @param ttPltzKanbanDao ttPltzKanbanのDao
     */
    public void setTtPltzKanbanDao(TtPltzKanbanDao ttPltzKanbanDao) {
        this.ttPltzKanbanDao = ttPltzKanbanDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public TtPltzKanbanDomain searchByKey(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public List<TtPltzKanbanDomain> searchByCondition(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public List<TtPltzKanbanDomain> searchByConditionForPaging(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public int searchCount(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public TtPltzKanbanDomain searchByKeyForChange(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public TtPltzKanbanDomain lockByKey(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public TtPltzKanbanDomain lockByKeyNoWait(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain)
     */
    public void create(TtPltzKanbanDomain domain) throws ApplicationException {
        ttPltzKanbanDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#create(java.util.List)
     */
    public void create(List<TtPltzKanbanDomain> domains) throws ApplicationException {
        for(TtPltzKanbanDomain domain : domains) {
            ttPltzKanbanDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain)
     */
    public int update(TtPltzKanbanDomain domain) throws ApplicationException {
        return ttPltzKanbanDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#update(java.util.List)
     */
    public int update(List<TtPltzKanbanDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPltzKanbanDomain domain : domains) {
            updateCount += ttPltzKanbanDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public int updateByCondition(TtPltzKanbanDomain domain, TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPltzKanbanDomain> domains, List<TtPltzKanbanCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPltzKanbanDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public int delete(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public int deleteByCondition(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanDao.deleteByCondition(criteria);
    }

}
