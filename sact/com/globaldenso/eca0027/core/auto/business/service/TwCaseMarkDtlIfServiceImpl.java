/*
 * PROJECT：eca0027
 * 
 * TwCaseMarkDtlIf のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkDtlIfDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkDtlIfDomain;


/**
 * TwCaseMarkDtlIf のService実装クラスです。<BR>
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
public class TwCaseMarkDtlIfServiceImpl implements TwCaseMarkDtlIfService {

    /**
     * twCaseMarkDtlIfのDAO
     */
    private TwCaseMarkDtlIfDao twCaseMarkDtlIfDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwCaseMarkDtlIfServiceImpl() {
    }

    /**
     * twCaseMarkDtlIfのDAOを設定します。
     * 
     * @param twCaseMarkDtlIfDao twCaseMarkDtlIfのDao
     */
    public void setTwCaseMarkDtlIfDao(TwCaseMarkDtlIfDao twCaseMarkDtlIfDao) {
        this.twCaseMarkDtlIfDao = twCaseMarkDtlIfDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    public List<TwCaseMarkDtlIfDomain> searchByCondition(TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkDtlIfDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    public List<TwCaseMarkDtlIfDomain> searchByConditionForPaging(TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkDtlIfDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    public int searchCount(TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkDtlIfDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService#create(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkDtlIfDomain)
     */
    public void create(TwCaseMarkDtlIfDomain domain) throws ApplicationException {
        twCaseMarkDtlIfDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService#create(java.util.List)
     */
    public void create(List<TwCaseMarkDtlIfDomain> domains) throws ApplicationException {
        for(TwCaseMarkDtlIfDomain domain : domains) {
            twCaseMarkDtlIfDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkDtlIfDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    public int updateByCondition(TwCaseMarkDtlIfDomain domain, TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkDtlIfDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwCaseMarkDtlIfDomain> domains, List<TwCaseMarkDtlIfCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twCaseMarkDtlIfDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    public int deleteByCondition(TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        return twCaseMarkDtlIfDao.deleteByCondition(criteria);
    }

}
