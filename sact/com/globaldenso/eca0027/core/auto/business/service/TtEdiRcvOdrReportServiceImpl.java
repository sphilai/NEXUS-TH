/*
 * PROJECT：eca0027
 * 
 * TtEdiRcvOdrReport のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain;


/**
 * TtEdiRcvOdrReport のService実装クラスです。<BR>
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
public class TtEdiRcvOdrReportServiceImpl implements TtEdiRcvOdrReportService {

    /**
     * ttEdiRcvOdrReportのDAO
     */
    private TtEdiRcvOdrReportDao ttEdiRcvOdrReportDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtEdiRcvOdrReportServiceImpl() {
    }

    /**
     * ttEdiRcvOdrReportのDAOを設定します。
     * 
     * @param ttEdiRcvOdrReportDao ttEdiRcvOdrReportのDao
     */
    public void setTtEdiRcvOdrReportDao(TtEdiRcvOdrReportDao ttEdiRcvOdrReportDao) {
        this.ttEdiRcvOdrReportDao = ttEdiRcvOdrReportDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public TtEdiRcvOdrReportDomain searchByKey(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public List<TtEdiRcvOdrReportDomain> searchByCondition(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public List<TtEdiRcvOdrReportDomain> searchByConditionForPaging(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public int searchCount(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public TtEdiRcvOdrReportDomain searchByKeyForChange(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public TtEdiRcvOdrReportDomain lockByKey(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public TtEdiRcvOdrReportDomain lockByKeyNoWait(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#create(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain)
     */
    public void create(TtEdiRcvOdrReportDomain domain) throws ApplicationException {
        ttEdiRcvOdrReportDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#create(java.util.List)
     */
    public void create(List<TtEdiRcvOdrReportDomain> domains) throws ApplicationException {
        for(TtEdiRcvOdrReportDomain domain : domains) {
            ttEdiRcvOdrReportDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#update(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain)
     */
    public int update(TtEdiRcvOdrReportDomain domain) throws ApplicationException {
        return ttEdiRcvOdrReportDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#update(java.util.List)
     */
    public int update(List<TtEdiRcvOdrReportDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtEdiRcvOdrReportDomain domain : domains) {
            updateCount += ttEdiRcvOdrReportDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public int updateByCondition(TtEdiRcvOdrReportDomain domain, TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtEdiRcvOdrReportDomain> domains, List<TtEdiRcvOdrReportCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttEdiRcvOdrReportDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public int delete(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public int deleteByCondition(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return ttEdiRcvOdrReportDao.deleteByCondition(criteria);
    }

}
