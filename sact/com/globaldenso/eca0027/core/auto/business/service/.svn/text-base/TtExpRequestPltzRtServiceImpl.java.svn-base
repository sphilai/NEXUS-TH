/*
 * PROJECT：eca0027
 * 
 * TtExpRequestPltzRt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestPltzRtDomain;


/**
 * TtExpRequestPltzRt のService実装クラスです。<BR>
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
public class TtExpRequestPltzRtServiceImpl implements TtExpRequestPltzRtService {

    /**
     * ttExpRequestPltzRtのDAO
     */
    private TtExpRequestPltzRtDao ttExpRequestPltzRtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestPltzRtServiceImpl() {
    }

    /**
     * ttExpRequestPltzRtのDAOを設定します。
     * 
     * @param ttExpRequestPltzRtDao ttExpRequestPltzRtのDao
     */
    public void setTtExpRequestPltzRtDao(TtExpRequestPltzRtDao ttExpRequestPltzRtDao) {
        this.ttExpRequestPltzRtDao = ttExpRequestPltzRtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public TtExpRequestPltzRtDomain searchByKey(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public List<TtExpRequestPltzRtDomain> searchByCondition(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public List<TtExpRequestPltzRtDomain> searchByConditionForPaging(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public int searchCount(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public TtExpRequestPltzRtDomain searchByKeyForChange(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public TtExpRequestPltzRtDomain lockByKey(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public TtExpRequestPltzRtDomain lockByKeyNoWait(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestPltzRtDomain)
     */
    public void create(TtExpRequestPltzRtDomain domain) throws ApplicationException {
        ttExpRequestPltzRtDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#create(java.util.List)
     */
    public void create(List<TtExpRequestPltzRtDomain> domains) throws ApplicationException {
        for(TtExpRequestPltzRtDomain domain : domains) {
            ttExpRequestPltzRtDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestPltzRtDomain)
     */
    public int update(TtExpRequestPltzRtDomain domain) throws ApplicationException {
        return ttExpRequestPltzRtDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#update(java.util.List)
     */
    public int update(List<TtExpRequestPltzRtDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtExpRequestPltzRtDomain domain : domains) {
            updateCount += ttExpRequestPltzRtDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestPltzRtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestPltzRtDomain domain, TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtExpRequestPltzRtDomain> domains, List<TtExpRequestPltzRtCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttExpRequestPltzRtDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public int delete(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtExpRequestPltzRtService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return ttExpRequestPltzRtDao.deleteByCondition(criteria);
    }

}
