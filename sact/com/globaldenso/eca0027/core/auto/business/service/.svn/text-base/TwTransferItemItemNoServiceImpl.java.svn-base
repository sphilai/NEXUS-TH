/*
 * PROJECT：eca0027
 * 
 * TwTransferItemItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/23  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain;


/**
 * TwTransferItemItemNo のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/23 11:08:03<BR>
 * 
 * テーブル定義から2014/06/23に自動生成したモジュールです。
 * 
 * @author $Author: 100011638841 $
 * @version $Revision: 8158 $
 */
public class TwTransferItemItemNoServiceImpl implements TwTransferItemItemNoService {

    /**
     * twTransferItemItemNoのDAO
     */
    private TwTransferItemItemNoDao twTransferItemItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwTransferItemItemNoServiceImpl() {
    }

    /**
     * twTransferItemItemNoのDAOを設定します。
     * 
     * @param twTransferItemItemNoDao twTransferItemItemNoのDao
     */
    public void setTwTransferItemItemNoDao(TwTransferItemItemNoDao twTransferItemItemNoDao) {
        this.twTransferItemItemNoDao = twTransferItemItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public TwTransferItemItemNoDomain searchByKey(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public List<TwTransferItemItemNoDomain> searchByCondition(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public List<TwTransferItemItemNoDomain> searchByConditionForPaging(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public int searchCount(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public TwTransferItemItemNoDomain searchByKeyForChange(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public TwTransferItemItemNoDomain lockByKey(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public TwTransferItemItemNoDomain lockByKeyNoWait(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain)
     */
    public void create(TwTransferItemItemNoDomain domain) throws ApplicationException {
        twTransferItemItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#create(java.util.List)
     */
    public void create(List<TwTransferItemItemNoDomain> domains) throws ApplicationException {
        for(TwTransferItemItemNoDomain domain : domains) {
            twTransferItemItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#update(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain)
     */
    public int update(TwTransferItemItemNoDomain domain) throws ApplicationException {
        return twTransferItemItemNoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#update(java.util.List)
     */
    public int update(List<TwTransferItemItemNoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwTransferItemItemNoDomain domain : domains) {
            updateCount += twTransferItemItemNoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public int updateByCondition(TwTransferItemItemNoDomain domain, TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwTransferItemItemNoDomain> domains, List<TwTransferItemItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twTransferItemItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public int delete(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public int deleteByCondition(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemItemNoDao.deleteByCondition(criteria);
    }

}
