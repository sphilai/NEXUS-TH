/*
 * PROJECT：eca0027
 * 
 * TtUserAuthMgt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain;


/**
 * TtUserAuthMgt のService実装クラスです。<BR>
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
public class TtUserAuthMgtServiceImpl implements TtUserAuthMgtService {

    /**
     * ttUserAuthMgtのDAO
     */
    private TtUserAuthMgtDao ttUserAuthMgtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtUserAuthMgtServiceImpl() {
    }

    /**
     * ttUserAuthMgtのDAOを設定します。
     * 
     * @param ttUserAuthMgtDao ttUserAuthMgtのDao
     */
    public void setTtUserAuthMgtDao(TtUserAuthMgtDao ttUserAuthMgtDao) {
        this.ttUserAuthMgtDao = ttUserAuthMgtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public TtUserAuthMgtDomain searchByKey(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public List<TtUserAuthMgtDomain> searchByCondition(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public List<TtUserAuthMgtDomain> searchByConditionForPaging(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public int searchCount(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public TtUserAuthMgtDomain searchByKeyForChange(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public TtUserAuthMgtDomain lockByKey(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public TtUserAuthMgtDomain lockByKeyNoWait(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#create(com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain)
     */
    public void create(TtUserAuthMgtDomain domain) throws ApplicationException {
        ttUserAuthMgtDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#create(java.util.List)
     */
    public void create(List<TtUserAuthMgtDomain> domains) throws ApplicationException {
        for(TtUserAuthMgtDomain domain : domains) {
            ttUserAuthMgtDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#update(com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain)
     */
    public int update(TtUserAuthMgtDomain domain) throws ApplicationException {
        return ttUserAuthMgtDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#update(java.util.List)
     */
    public int update(List<TtUserAuthMgtDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtUserAuthMgtDomain domain : domains) {
            updateCount += ttUserAuthMgtDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public int updateByCondition(TtUserAuthMgtDomain domain, TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtUserAuthMgtDomain> domains, List<TtUserAuthMgtCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttUserAuthMgtDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public int delete(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public int deleteByCondition(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return ttUserAuthMgtDao.deleteByCondition(criteria);
    }

}
