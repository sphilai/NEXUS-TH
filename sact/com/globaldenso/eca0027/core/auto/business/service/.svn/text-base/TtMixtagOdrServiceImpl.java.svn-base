/*
 * PROJECT：eca0027
 * 
 * TtMixtagOdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain;


/**
 * TtMixtagOdr のService実装クラスです。<BR>
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
public class TtMixtagOdrServiceImpl implements TtMixtagOdrService {

    /**
     * ttMixtagOdrのDAO
     */
    private TtMixtagOdrDao ttMixtagOdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixtagOdrServiceImpl() {
    }

    /**
     * ttMixtagOdrのDAOを設定します。
     * 
     * @param ttMixtagOdrDao ttMixtagOdrのDao
     */
    public void setTtMixtagOdrDao(TtMixtagOdrDao ttMixtagOdrDao) {
        this.ttMixtagOdrDao = ttMixtagOdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public TtMixtagOdrDomain searchByKey(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public List<TtMixtagOdrDomain> searchByCondition(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public List<TtMixtagOdrDomain> searchByConditionForPaging(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public int searchCount(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public TtMixtagOdrDomain searchByKeyForChange(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public TtMixtagOdrDomain lockByKey(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public TtMixtagOdrDomain lockByKeyNoWait(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain)
     */
    public void create(TtMixtagOdrDomain domain) throws ApplicationException {
        ttMixtagOdrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#create(java.util.List)
     */
    public void create(List<TtMixtagOdrDomain> domains) throws ApplicationException {
        for(TtMixtagOdrDomain domain : domains) {
            ttMixtagOdrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain)
     */
    public int update(TtMixtagOdrDomain domain) throws ApplicationException {
        return ttMixtagOdrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#update(java.util.List)
     */
    public int update(List<TtMixtagOdrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtMixtagOdrDomain domain : domains) {
            updateCount += ttMixtagOdrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public int updateByCondition(TtMixtagOdrDomain domain, TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtMixtagOdrDomain> domains, List<TtMixtagOdrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttMixtagOdrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public int delete(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public int deleteByCondition(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagOdrDao.deleteByCondition(criteria);
    }

}
