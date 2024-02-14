/*
 * PROJECT：eca0027
 * 
 * TwCaseMarkHdrIf のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/07/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain;


/**
 * TwCaseMarkHdrIf のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/07/20 13:57:18<BR>
 * 
 * テーブル定義から2015/07/20に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11748 $
 */
public class TwCaseMarkHdrIfServiceImpl implements TwCaseMarkHdrIfService {

    /**
     * twCaseMarkHdrIfのDAO
     */
    private TwCaseMarkHdrIfDao twCaseMarkHdrIfDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwCaseMarkHdrIfServiceImpl() {
    }

    /**
     * twCaseMarkHdrIfのDAOを設定します。
     * 
     * @param twCaseMarkHdrIfDao twCaseMarkHdrIfのDao
     */
    public void setTwCaseMarkHdrIfDao(TwCaseMarkHdrIfDao twCaseMarkHdrIfDao) {
        this.twCaseMarkHdrIfDao = twCaseMarkHdrIfDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public TwCaseMarkHdrIfDomain searchByKey(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public List<TwCaseMarkHdrIfDomain> searchByCondition(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public List<TwCaseMarkHdrIfDomain> searchByConditionForPaging(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public int searchCount(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public TwCaseMarkHdrIfDomain searchByKeyForChange(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public TwCaseMarkHdrIfDomain lockByKey(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public TwCaseMarkHdrIfDomain lockByKeyNoWait(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#create(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain)
     */
    public void create(TwCaseMarkHdrIfDomain domain) throws ApplicationException {
        twCaseMarkHdrIfDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#create(java.util.List)
     */
    public void create(List<TwCaseMarkHdrIfDomain> domains) throws ApplicationException {
        for(TwCaseMarkHdrIfDomain domain : domains) {
            twCaseMarkHdrIfDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#update(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain)
     */
    public int update(TwCaseMarkHdrIfDomain domain) throws ApplicationException {
        return twCaseMarkHdrIfDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#update(java.util.List)
     */
    public int update(List<TwCaseMarkHdrIfDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwCaseMarkHdrIfDomain domain : domains) {
            updateCount += twCaseMarkHdrIfDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public int updateByCondition(TwCaseMarkHdrIfDomain domain, TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwCaseMarkHdrIfDomain> domains, List<TwCaseMarkHdrIfCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twCaseMarkHdrIfDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public int delete(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public int deleteByCondition(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkHdrIfDao.deleteByCondition(criteria);
    }

}
