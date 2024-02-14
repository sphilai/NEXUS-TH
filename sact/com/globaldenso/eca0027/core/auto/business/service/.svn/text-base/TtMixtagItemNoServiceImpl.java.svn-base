/*
 * PROJECT：eca0027
 * 
 * TtMixtagItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain;


/**
 * TtMixtagItemNo のService実装クラスです。<BR>
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
public class TtMixtagItemNoServiceImpl implements TtMixtagItemNoService {

    /**
     * ttMixtagItemNoのDAO
     */
    private TtMixtagItemNoDao ttMixtagItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixtagItemNoServiceImpl() {
    }

    /**
     * ttMixtagItemNoのDAOを設定します。
     * 
     * @param ttMixtagItemNoDao ttMixtagItemNoのDao
     */
    public void setTtMixtagItemNoDao(TtMixtagItemNoDao ttMixtagItemNoDao) {
        this.ttMixtagItemNoDao = ttMixtagItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public TtMixtagItemNoDomain searchByKey(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public List<TtMixtagItemNoDomain> searchByCondition(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public List<TtMixtagItemNoDomain> searchByConditionForPaging(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public int searchCount(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public TtMixtagItemNoDomain searchByKeyForChange(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public TtMixtagItemNoDomain lockByKey(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public TtMixtagItemNoDomain lockByKeyNoWait(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain)
     */
    public void create(TtMixtagItemNoDomain domain) throws ApplicationException {
        ttMixtagItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#create(java.util.List)
     */
    public void create(List<TtMixtagItemNoDomain> domains) throws ApplicationException {
        for(TtMixtagItemNoDomain domain : domains) {
            ttMixtagItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain)
     */
    public int update(TtMixtagItemNoDomain domain) throws ApplicationException {
        return ttMixtagItemNoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#update(java.util.List)
     */
    public int update(List<TtMixtagItemNoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtMixtagItemNoDomain domain : domains) {
            updateCount += ttMixtagItemNoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public int updateByCondition(TtMixtagItemNoDomain domain, TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtMixtagItemNoDomain> domains, List<TtMixtagItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttMixtagItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public int delete(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public int deleteByCondition(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttMixtagItemNoDao.deleteByCondition(criteria);
    }

}
