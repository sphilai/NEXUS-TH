/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtlRt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlRtDomain;


/**
 * TtExpRequestDtlRt のService実装クラスです。<BR>
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
public class TtExpRequestDtlRtServiceImpl implements TtExpRequestDtlRtService {

    /**
     * ttExpRequestDtlRtのDAO
     */
    private TtExpRequestDtlRtDao ttExpRequestDtlRtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestDtlRtServiceImpl() {
    }

    /**
     * ttExpRequestDtlRtのDAOを設定します。
     * 
     * @param ttExpRequestDtlRtDao ttExpRequestDtlRtのDao
     */
    public void setTtExpRequestDtlRtDao(TtExpRequestDtlRtDao ttExpRequestDtlRtDao) {
        this.ttExpRequestDtlRtDao = ttExpRequestDtlRtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public TtExpRequestDtlRtDomain searchByKey(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public List<TtExpRequestDtlRtDomain> searchByCondition(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public List<TtExpRequestDtlRtDomain> searchByConditionForPaging(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public int searchCount(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public TtExpRequestDtlRtDomain searchByKeyForChange(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public TtExpRequestDtlRtDomain lockByKey(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public TtExpRequestDtlRtDomain lockByKeyNoWait(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlRtDomain)
     */
    public void create(TtExpRequestDtlRtDomain domain) throws ApplicationException {
        ttExpRequestDtlRtDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#create(java.util.List)
     */
    public void create(List<TtExpRequestDtlRtDomain> domains) throws ApplicationException {
        for(TtExpRequestDtlRtDomain domain : domains) {
            ttExpRequestDtlRtDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlRtDomain)
     */
    public int update(TtExpRequestDtlRtDomain domain) throws ApplicationException {
        return ttExpRequestDtlRtDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#update(java.util.List)
     */
    public int update(List<TtExpRequestDtlRtDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtExpRequestDtlRtDomain domain : domains) {
            updateCount += ttExpRequestDtlRtDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlRtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestDtlRtDomain domain, TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtExpRequestDtlRtDomain> domains, List<TtExpRequestDtlRtCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttExpRequestDtlRtDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public int delete(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlRtService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestDtlRtDao.deleteByCondition(criteria);
    }

}
