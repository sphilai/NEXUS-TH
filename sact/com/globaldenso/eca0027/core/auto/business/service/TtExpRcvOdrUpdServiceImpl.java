/*
 * PROJECT：eca0027
 * 
 * TtExpRcvOdrUpd のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrUpdDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrUpdDomain;


/**
 * TtExpRcvOdrUpd のService実装クラスです。<BR>
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
public class TtExpRcvOdrUpdServiceImpl implements TtExpRcvOdrUpdService {

    /**
     * ttExpRcvOdrUpdのDAO
     */
    private TtExpRcvOdrUpdDao ttExpRcvOdrUpdDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRcvOdrUpdServiceImpl() {
    }

    /**
     * ttExpRcvOdrUpdのDAOを設定します。
     * 
     * @param ttExpRcvOdrUpdDao ttExpRcvOdrUpdのDao
     */
    public void setTtExpRcvOdrUpdDao(TtExpRcvOdrUpdDao ttExpRcvOdrUpdDao) {
        this.ttExpRcvOdrUpdDao = ttExpRcvOdrUpdDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    public List<TtExpRcvOdrUpdDomain> searchByCondition(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrUpdDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    public List<TtExpRcvOdrUpdDomain> searchByConditionForPaging(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrUpdDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    public int searchCount(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrUpdDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdService#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrUpdDomain)
     */
    public void create(TtExpRcvOdrUpdDomain domain) throws ApplicationException {
        ttExpRcvOdrUpdDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdService#create(java.util.List)
     */
    public void create(List<TtExpRcvOdrUpdDomain> domains) throws ApplicationException {
        for(TtExpRcvOdrUpdDomain domain : domains) {
            ttExpRcvOdrUpdDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrUpdDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    public int updateByCondition(TtExpRcvOdrUpdDomain domain, TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrUpdDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtExpRcvOdrUpdDomain> domains, List<TtExpRcvOdrUpdCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttExpRcvOdrUpdDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    public int deleteByCondition(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        return ttExpRcvOdrUpdDao.deleteByCondition(criteria);
    }

}
