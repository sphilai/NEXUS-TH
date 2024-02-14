/*
 * PROJECT：eca0027
 * 
 * TtPltzItemKit のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemKitDomain;


/**
 * TtPltzItemKit のService実装クラスです。<BR>
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
public class TtPltzItemKitServiceImpl implements TtPltzItemKitService {

    /**
     * ttPltzItemKitのDAO
     */
    private TtPltzItemKitDao ttPltzItemKitDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzItemKitServiceImpl() {
    }

    /**
     * ttPltzItemKitのDAOを設定します。
     * 
     * @param ttPltzItemKitDao ttPltzItemKitのDao
     */
    public void setTtPltzItemKitDao(TtPltzItemKitDao ttPltzItemKitDao) {
        this.ttPltzItemKitDao = ttPltzItemKitDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public TtPltzItemKitDomain searchByKey(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public List<TtPltzItemKitDomain> searchByCondition(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public List<TtPltzItemKitDomain> searchByConditionForPaging(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public int searchCount(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public TtPltzItemKitDomain searchByKeyForChange(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public TtPltzItemKitDomain lockByKey(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public TtPltzItemKitDomain lockByKeyNoWait(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemKitDomain)
     */
    public void create(TtPltzItemKitDomain domain) throws ApplicationException {
        ttPltzItemKitDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#create(java.util.List)
     */
    public void create(List<TtPltzItemKitDomain> domains) throws ApplicationException {
        for(TtPltzItemKitDomain domain : domains) {
            ttPltzItemKitDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemKitDomain)
     */
    public int update(TtPltzItemKitDomain domain) throws ApplicationException {
        return ttPltzItemKitDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#update(java.util.List)
     */
    public int update(List<TtPltzItemKitDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPltzItemKitDomain domain : domains) {
            updateCount += ttPltzItemKitDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemKitDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public int updateByCondition(TtPltzItemKitDomain domain, TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPltzItemKitDomain> domains, List<TtPltzItemKitCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPltzItemKitDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public int delete(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzItemKitService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public int deleteByCondition(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return ttPltzItemKitDao.deleteByCondition(criteria);
    }

}
