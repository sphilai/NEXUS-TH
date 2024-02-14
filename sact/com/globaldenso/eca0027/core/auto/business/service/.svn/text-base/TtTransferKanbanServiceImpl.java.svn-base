/*
 * PROJECT：eca0027
 * 
 * TtTransferKanban のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferKanbanDomain;


/**
 * TtTransferKanban のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author: 100011638841 $
 * @version $Revision: 8158 $
 */
public class TtTransferKanbanServiceImpl implements TtTransferKanbanService {

    /**
     * ttTransferKanbanのDAO
     */
    private TtTransferKanbanDao ttTransferKanbanDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferKanbanServiceImpl() {
    }

    /**
     * ttTransferKanbanのDAOを設定します。
     * 
     * @param ttTransferKanbanDao ttTransferKanbanのDao
     */
    public void setTtTransferKanbanDao(TtTransferKanbanDao ttTransferKanbanDao) {
        this.ttTransferKanbanDao = ttTransferKanbanDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public TtTransferKanbanDomain searchByKey(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public List<TtTransferKanbanDomain> searchByCondition(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public List<TtTransferKanbanDomain> searchByConditionForPaging(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public int searchCount(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public TtTransferKanbanDomain searchByKeyForChange(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public TtTransferKanbanDomain lockByKey(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public TtTransferKanbanDomain lockByKeyNoWait(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferKanbanDomain)
     */
    public void create(TtTransferKanbanDomain domain) throws ApplicationException {
        ttTransferKanbanDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#create(java.util.List)
     */
    public void create(List<TtTransferKanbanDomain> domains) throws ApplicationException {
        for(TtTransferKanbanDomain domain : domains) {
            ttTransferKanbanDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferKanbanDomain)
     */
    public int update(TtTransferKanbanDomain domain) throws ApplicationException {
        return ttTransferKanbanDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#update(java.util.List)
     */
    public int update(List<TtTransferKanbanDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtTransferKanbanDomain domain : domains) {
            updateCount += ttTransferKanbanDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferKanbanDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public int updateByCondition(TtTransferKanbanDomain domain, TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtTransferKanbanDomain> domains, List<TtTransferKanbanCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttTransferKanbanDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public int delete(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferKanbanService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public int deleteByCondition(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return ttTransferKanbanDao.deleteByCondition(criteria);
    }

}
