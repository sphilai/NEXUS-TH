/*
 * PROJECT：eca0027
 * 
 * TmPrinter のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain;


/**
 * TmPrinter のService実装クラスです。<BR>
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
public class TmPrinterServiceImpl implements TmPrinterService {

    /**
     * tmPrinterのDAO
     */
    private TmPrinterDao tmPrinterDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPrinterServiceImpl() {
    }

    /**
     * tmPrinterのDAOを設定します。
     * 
     * @param tmPrinterDao tmPrinterのDao
     */
    public void setTmPrinterDao(TmPrinterDao tmPrinterDao) {
        this.tmPrinterDao = tmPrinterDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public TmPrinterDomain searchByKey(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public List<TmPrinterDomain> searchByCondition(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public List<TmPrinterDomain> searchByConditionForPaging(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public int searchCount(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public TmPrinterDomain searchByKeyForChange(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public TmPrinterDomain lockByKey(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public TmPrinterDomain lockByKeyNoWait(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#create(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain)
     */
    public void create(TmPrinterDomain domain) throws ApplicationException {
        tmPrinterDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#create(java.util.List)
     */
    public void create(List<TmPrinterDomain> domains) throws ApplicationException {
        for(TmPrinterDomain domain : domains) {
            tmPrinterDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#update(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain)
     */
    public int update(TmPrinterDomain domain) throws ApplicationException {
        return tmPrinterDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#update(java.util.List)
     */
    public int update(List<TmPrinterDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmPrinterDomain domain : domains) {
            updateCount += tmPrinterDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public int updateByCondition(TmPrinterDomain domain, TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmPrinterDomain> domains, List<TmPrinterCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmPrinterDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public int delete(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPrinterService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public int deleteByCondition(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return tmPrinterDao.deleteByCondition(criteria);
    }

}
