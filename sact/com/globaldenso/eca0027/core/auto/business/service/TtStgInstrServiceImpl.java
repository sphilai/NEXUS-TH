/*
 * PROJECT：eca0027
 * 
 * TtStgInstr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain;


/**
 * TtStgInstr のService実装クラスです。<BR>
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
public class TtStgInstrServiceImpl implements TtStgInstrService {

    /**
     * ttStgInstrのDAO
     */
    private TtStgInstrDao ttStgInstrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtStgInstrServiceImpl() {
    }

    /**
     * ttStgInstrのDAOを設定します。
     * 
     * @param ttStgInstrDao ttStgInstrのDao
     */
    public void setTtStgInstrDao(TtStgInstrDao ttStgInstrDao) {
        this.ttStgInstrDao = ttStgInstrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public TtStgInstrDomain searchByKey(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public List<TtStgInstrDomain> searchByCondition(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public List<TtStgInstrDomain> searchByConditionForPaging(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public int searchCount(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public TtStgInstrDomain searchByKeyForChange(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public TtStgInstrDomain lockByKey(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public TtStgInstrDomain lockByKeyNoWait(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#create(com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain)
     */
    public void create(TtStgInstrDomain domain) throws ApplicationException {
        ttStgInstrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#create(java.util.List)
     */
    public void create(List<TtStgInstrDomain> domains) throws ApplicationException {
        for(TtStgInstrDomain domain : domains) {
            ttStgInstrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain)
     */
    public int update(TtStgInstrDomain domain) throws ApplicationException {
        return ttStgInstrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#update(java.util.List)
     */
    public int update(List<TtStgInstrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtStgInstrDomain domain : domains) {
            updateCount += ttStgInstrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public int updateByCondition(TtStgInstrDomain domain, TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtStgInstrDomain> domains, List<TtStgInstrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttStgInstrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public int delete(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public int deleteByCondition(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return ttStgInstrDao.deleteByCondition(criteria);
    }

}
