/*
 * PROJECT：eca0027
 * 
 * TwStgInstr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain;


/**
 * TwStgInstr のService実装クラスです。<BR>
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
public class TwStgInstrServiceImpl implements TwStgInstrService {

    /**
     * twStgInstrのDAO
     */
    private TwStgInstrDao twStgInstrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwStgInstrServiceImpl() {
    }

    /**
     * twStgInstrのDAOを設定します。
     * 
     * @param twStgInstrDao twStgInstrのDao
     */
    public void setTwStgInstrDao(TwStgInstrDao twStgInstrDao) {
        this.twStgInstrDao = twStgInstrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public TwStgInstrDomain searchByKey(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public List<TwStgInstrDomain> searchByCondition(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public List<TwStgInstrDomain> searchByConditionForPaging(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public int searchCount(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public TwStgInstrDomain searchByKeyForChange(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public TwStgInstrDomain lockByKey(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public TwStgInstrDomain lockByKeyNoWait(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#create(com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain)
     */
    public void create(TwStgInstrDomain domain) throws ApplicationException {
        twStgInstrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#create(java.util.List)
     */
    public void create(List<TwStgInstrDomain> domains) throws ApplicationException {
        for(TwStgInstrDomain domain : domains) {
            twStgInstrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#update(com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain)
     */
    public int update(TwStgInstrDomain domain) throws ApplicationException {
        return twStgInstrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#update(java.util.List)
     */
    public int update(List<TwStgInstrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwStgInstrDomain domain : domains) {
            updateCount += twStgInstrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public int updateByCondition(TwStgInstrDomain domain, TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwStgInstrDomain> domains, List<TwStgInstrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twStgInstrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public int delete(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public int deleteByCondition(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return twStgInstrDao.deleteByCondition(criteria);
    }

}
