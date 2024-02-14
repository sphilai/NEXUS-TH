/*
 * PROJECT：eca0027
 * 
 * TtBhtWorkMixTag のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkMixTagDomain;


/**
 * TtBhtWorkMixTag のService実装クラスです。<BR>
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
public class TtBhtWorkMixTagServiceImpl implements TtBhtWorkMixTagService {

    /**
     * ttBhtWorkMixTagのDAO
     */
    private TtBhtWorkMixTagDao ttBhtWorkMixTagDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtBhtWorkMixTagServiceImpl() {
    }

    /**
     * ttBhtWorkMixTagのDAOを設定します。
     * 
     * @param ttBhtWorkMixTagDao ttBhtWorkMixTagのDao
     */
    public void setTtBhtWorkMixTagDao(TtBhtWorkMixTagDao ttBhtWorkMixTagDao) {
        this.ttBhtWorkMixTagDao = ttBhtWorkMixTagDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public TtBhtWorkMixTagDomain searchByKey(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public List<TtBhtWorkMixTagDomain> searchByCondition(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public List<TtBhtWorkMixTagDomain> searchByConditionForPaging(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public int searchCount(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public TtBhtWorkMixTagDomain searchByKeyForChange(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public TtBhtWorkMixTagDomain lockByKey(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public TtBhtWorkMixTagDomain lockByKeyNoWait(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#create(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkMixTagDomain)
     */
    public void create(TtBhtWorkMixTagDomain domain) throws ApplicationException {
        ttBhtWorkMixTagDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#create(java.util.List)
     */
    public void create(List<TtBhtWorkMixTagDomain> domains) throws ApplicationException {
        for(TtBhtWorkMixTagDomain domain : domains) {
            ttBhtWorkMixTagDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#update(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkMixTagDomain)
     */
    public int update(TtBhtWorkMixTagDomain domain) throws ApplicationException {
        return ttBhtWorkMixTagDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#update(java.util.List)
     */
    public int update(List<TtBhtWorkMixTagDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtBhtWorkMixTagDomain domain : domains) {
            updateCount += ttBhtWorkMixTagDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkMixTagDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public int updateByCondition(TtBhtWorkMixTagDomain domain, TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtBhtWorkMixTagDomain> domains, List<TtBhtWorkMixTagCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttBhtWorkMixTagDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public int delete(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public int deleteByCondition(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return ttBhtWorkMixTagDao.deleteByCondition(criteria);
    }

}
