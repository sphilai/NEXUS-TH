/*
 * PROJECT：eca0027
 * 
 * TmStdQrPatternDtl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternDtlDomain;


/**
 * TmStdQrPatternDtl のService実装クラスです。<BR>
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
public class TmStdQrPatternDtlServiceImpl implements TmStdQrPatternDtlService {

    /**
     * tmStdQrPatternDtlのDAO
     */
    private TmStdQrPatternDtlDao tmStdQrPatternDtlDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmStdQrPatternDtlServiceImpl() {
    }

    /**
     * tmStdQrPatternDtlのDAOを設定します。
     * 
     * @param tmStdQrPatternDtlDao tmStdQrPatternDtlのDao
     */
    public void setTmStdQrPatternDtlDao(TmStdQrPatternDtlDao tmStdQrPatternDtlDao) {
        this.tmStdQrPatternDtlDao = tmStdQrPatternDtlDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public TmStdQrPatternDtlDomain searchByKey(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public List<TmStdQrPatternDtlDomain> searchByCondition(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public List<TmStdQrPatternDtlDomain> searchByConditionForPaging(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public int searchCount(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public TmStdQrPatternDtlDomain searchByKeyForChange(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public TmStdQrPatternDtlDomain lockByKey(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public TmStdQrPatternDtlDomain lockByKeyNoWait(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#create(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternDtlDomain)
     */
    public void create(TmStdQrPatternDtlDomain domain) throws ApplicationException {
        tmStdQrPatternDtlDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#create(java.util.List)
     */
    public void create(List<TmStdQrPatternDtlDomain> domains) throws ApplicationException {
        for(TmStdQrPatternDtlDomain domain : domains) {
            tmStdQrPatternDtlDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#update(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternDtlDomain)
     */
    public int update(TmStdQrPatternDtlDomain domain) throws ApplicationException {
        return tmStdQrPatternDtlDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#update(java.util.List)
     */
    public int update(List<TmStdQrPatternDtlDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmStdQrPatternDtlDomain domain : domains) {
            updateCount += tmStdQrPatternDtlDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternDtlDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public int updateByCondition(TmStdQrPatternDtlDomain domain, TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmStdQrPatternDtlDomain> domains, List<TmStdQrPatternDtlCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmStdQrPatternDtlDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public int delete(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternDtlService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public int deleteByCondition(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternDtlDao.deleteByCondition(criteria);
    }

}
