/*
 * PROJECT：eca0027
 * 
 * TtTransferItemItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/07/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain;


/**
 * TtTransferItemItemNo のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/07/07 18:21:05<BR>
 * 
 * テーブル定義から2014/07/07に自動生成したモジュールです。
 * 
 * @author $Author: 100011638841 $
 * @version $Revision: 8158 $
 */
public class TtTransferItemItemNoServiceImpl implements TtTransferItemItemNoService {

    /**
     * ttTransferItemItemNoのDAO
     */
    private TtTransferItemItemNoDao ttTransferItemItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferItemItemNoServiceImpl() {
    }

    /**
     * ttTransferItemItemNoのDAOを設定します。
     * 
     * @param ttTransferItemItemNoDao ttTransferItemItemNoのDao
     */
    public void setTtTransferItemItemNoDao(TtTransferItemItemNoDao ttTransferItemItemNoDao) {
        this.ttTransferItemItemNoDao = ttTransferItemItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public TtTransferItemItemNoDomain searchByKey(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public List<TtTransferItemItemNoDomain> searchByCondition(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public List<TtTransferItemItemNoDomain> searchByConditionForPaging(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public int searchCount(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public TtTransferItemItemNoDomain searchByKeyForChange(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public TtTransferItemItemNoDomain lockByKey(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public TtTransferItemItemNoDomain lockByKeyNoWait(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain)
     */
    public void create(TtTransferItemItemNoDomain domain) throws ApplicationException {
        ttTransferItemItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#create(java.util.List)
     */
    public void create(List<TtTransferItemItemNoDomain> domains) throws ApplicationException {
        for(TtTransferItemItemNoDomain domain : domains) {
            ttTransferItemItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain)
     */
    public int update(TtTransferItemItemNoDomain domain) throws ApplicationException {
        return ttTransferItemItemNoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#update(java.util.List)
     */
    public int update(List<TtTransferItemItemNoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtTransferItemItemNoDomain domain : domains) {
            updateCount += ttTransferItemItemNoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public int updateByCondition(TtTransferItemItemNoDomain domain, TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtTransferItemItemNoDomain> domains, List<TtTransferItemItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttTransferItemItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public int delete(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public int deleteByCondition(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttTransferItemItemNoDao.deleteByCondition(criteria);
    }

}
