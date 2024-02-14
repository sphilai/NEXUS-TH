/*
 * PROJECT：eca0027
 * 
 * TtDownloadLog のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtDownloadLogDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtDownloadLogDomain;


/**
 * TtDownloadLog のService実装クラスです。<BR>
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
public class TtDownloadLogServiceImpl implements TtDownloadLogService {

    /**
     * ttDownloadLogのDAO
     */
    private TtDownloadLogDao ttDownloadLogDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtDownloadLogServiceImpl() {
    }

    /**
     * ttDownloadLogのDAOを設定します。
     * 
     * @param ttDownloadLogDao ttDownloadLogのDao
     */
    public void setTtDownloadLogDao(TtDownloadLogDao ttDownloadLogDao) {
        this.ttDownloadLogDao = ttDownloadLogDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtDownloadLogService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    public List<TtDownloadLogDomain> searchByCondition(TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        return ttDownloadLogDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtDownloadLogService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    public List<TtDownloadLogDomain> searchByConditionForPaging(TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        return ttDownloadLogDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtDownloadLogService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    public int searchCount(TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        return ttDownloadLogDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtDownloadLogService#create(com.globaldenso.eca0027.core.auto.business.domain.TtDownloadLogDomain)
     */
    public void create(TtDownloadLogDomain domain) throws ApplicationException {
        ttDownloadLogDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtDownloadLogService#create(java.util.List)
     */
    public void create(List<TtDownloadLogDomain> domains) throws ApplicationException {
        for(TtDownloadLogDomain domain : domains) {
            ttDownloadLogDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtDownloadLogService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtDownloadLogDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    public int updateByCondition(TtDownloadLogDomain domain, TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        return ttDownloadLogDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtDownloadLogService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtDownloadLogDomain> domains, List<TtDownloadLogCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttDownloadLogDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtDownloadLogService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    public int deleteByCondition(TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        return ttDownloadLogDao.deleteByCondition(criteria);
    }

}
