/*
 * PROJECT：eca0027
 * 
 * TtPltzInstr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;


/**
 * TtPltzInstr のService実装クラスです。<BR>
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
public class TtPltzInstrServiceImpl implements TtPltzInstrService {

    /**
     * ttPltzInstrのDAO
     */
    private TtPltzInstrDao ttPltzInstrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzInstrServiceImpl() {
    }

    /**
     * ttPltzInstrのDAOを設定します。
     * 
     * @param ttPltzInstrDao ttPltzInstrのDao
     */
    public void setTtPltzInstrDao(TtPltzInstrDao ttPltzInstrDao) {
        this.ttPltzInstrDao = ttPltzInstrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public TtPltzInstrDomain searchByKey(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public List<TtPltzInstrDomain> searchByCondition(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public List<TtPltzInstrDomain> searchByConditionForPaging(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public int searchCount(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public TtPltzInstrDomain searchByKeyForChange(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public TtPltzInstrDomain lockByKey(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public TtPltzInstrDomain lockByKeyNoWait(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain)
     */
    public void create(TtPltzInstrDomain domain) throws ApplicationException {
        ttPltzInstrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#create(java.util.List)
     */
    public void create(List<TtPltzInstrDomain> domains) throws ApplicationException {
        for(TtPltzInstrDomain domain : domains) {
            ttPltzInstrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain)
     */
    public int update(TtPltzInstrDomain domain) throws ApplicationException {
        return ttPltzInstrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#update(java.util.List)
     */
    public int update(List<TtPltzInstrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPltzInstrDomain domain : domains) {
            updateCount += ttPltzInstrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public int updateByCondition(TtPltzInstrDomain domain, TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPltzInstrDomain> domains, List<TtPltzInstrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPltzInstrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public int delete(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public int deleteByCondition(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrDao.deleteByCondition(criteria);
    }

}
