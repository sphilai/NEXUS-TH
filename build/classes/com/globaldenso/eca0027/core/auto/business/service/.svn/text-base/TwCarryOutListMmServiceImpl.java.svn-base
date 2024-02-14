/*
 * PROJECT：eca0027
 * 
 * TwCarryOutListMm のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListMmDomain;


/**
 * TwCarryOutListMm のService実装クラスです。<BR>
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
public class TwCarryOutListMmServiceImpl implements TwCarryOutListMmService {

    /**
     * twCarryOutListMmのDAO
     */
    private TwCarryOutListMmDao twCarryOutListMmDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwCarryOutListMmServiceImpl() {
    }

    /**
     * twCarryOutListMmのDAOを設定します。
     * 
     * @param twCarryOutListMmDao twCarryOutListMmのDao
     */
    public void setTwCarryOutListMmDao(TwCarryOutListMmDao twCarryOutListMmDao) {
        this.twCarryOutListMmDao = twCarryOutListMmDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public TwCarryOutListMmDomain searchByKey(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public List<TwCarryOutListMmDomain> searchByCondition(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public List<TwCarryOutListMmDomain> searchByConditionForPaging(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public int searchCount(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public TwCarryOutListMmDomain searchByKeyForChange(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public TwCarryOutListMmDomain lockByKey(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public TwCarryOutListMmDomain lockByKeyNoWait(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#create(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListMmDomain)
     */
    public void create(TwCarryOutListMmDomain domain) throws ApplicationException {
        twCarryOutListMmDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#create(java.util.List)
     */
    public void create(List<TwCarryOutListMmDomain> domains) throws ApplicationException {
        for(TwCarryOutListMmDomain domain : domains) {
            twCarryOutListMmDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#update(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListMmDomain)
     */
    public int update(TwCarryOutListMmDomain domain) throws ApplicationException {
        return twCarryOutListMmDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#update(java.util.List)
     */
    public int update(List<TwCarryOutListMmDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwCarryOutListMmDomain domain : domains) {
            updateCount += twCarryOutListMmDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListMmDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public int updateByCondition(TwCarryOutListMmDomain domain, TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwCarryOutListMmDomain> domains, List<TwCarryOutListMmCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twCarryOutListMmDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public int delete(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListMmService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public int deleteByCondition(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListMmDao.deleteByCondition(criteria);
    }

}
