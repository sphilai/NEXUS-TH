/*
 * PROJECT：eca0027
 * 
 * TtPltzItemOdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain;


/**
 * TtPltzItemOdr のService実装クラスです。<BR>
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
public class TtPltzItemOdrServiceImpl implements TtPltzItemOdrService {

    /**
     * ttPltzItemOdrのDAO
     */
    private TtPltzItemOdrDao ttPltzItemOdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzItemOdrServiceImpl() {
    }

    /**
     * ttPltzItemOdrのDAOを設定します。
     * 
     * @param ttPltzItemOdrDao ttPltzItemOdrのDao
     */
    public void setTtPltzItemOdrDao(TtPltzItemOdrDao ttPltzItemOdrDao) {
        this.ttPltzItemOdrDao = ttPltzItemOdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public TtPltzItemOdrDomain searchByKey(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public List<TtPltzItemOdrDomain> searchByCondition(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public List<TtPltzItemOdrDomain> searchByConditionForPaging(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public int searchCount(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public TtPltzItemOdrDomain searchByKeyForChange(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public TtPltzItemOdrDomain lockByKey(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public TtPltzItemOdrDomain lockByKeyNoWait(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain)
     */
    public void create(TtPltzItemOdrDomain domain) throws ApplicationException {
        ttPltzItemOdrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#create(java.util.List)
     */
    public void create(List<TtPltzItemOdrDomain> domains) throws ApplicationException {
        for(TtPltzItemOdrDomain domain : domains) {
            ttPltzItemOdrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain)
     */
    public int update(TtPltzItemOdrDomain domain) throws ApplicationException {
        return ttPltzItemOdrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#update(java.util.List)
     */
    public int update(List<TtPltzItemOdrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPltzItemOdrDomain domain : domains) {
            updateCount += ttPltzItemOdrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public int updateByCondition(TtPltzItemOdrDomain domain, TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPltzItemOdrDomain> domains, List<TtPltzItemOdrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPltzItemOdrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public int delete(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public int deleteByCondition(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemOdrDao.deleteByCondition(criteria);
    }

}
