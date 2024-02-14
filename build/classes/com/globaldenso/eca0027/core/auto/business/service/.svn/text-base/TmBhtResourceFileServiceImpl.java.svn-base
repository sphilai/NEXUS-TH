/*
 * PROJECT：eca0027
 * 
 * TmBhtResourceFile のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtResourceFileDomain;


/**
 * TmBhtResourceFile のService実装クラスです。<BR>
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
public class TmBhtResourceFileServiceImpl implements TmBhtResourceFileService {

    /**
     * tmBhtResourceFileのDAO
     */
    private TmBhtResourceFileDao tmBhtResourceFileDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmBhtResourceFileServiceImpl() {
    }

    /**
     * tmBhtResourceFileのDAOを設定します。
     * 
     * @param tmBhtResourceFileDao tmBhtResourceFileのDao
     */
    public void setTmBhtResourceFileDao(TmBhtResourceFileDao tmBhtResourceFileDao) {
        this.tmBhtResourceFileDao = tmBhtResourceFileDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public TmBhtResourceFileDomain searchByKey(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public List<TmBhtResourceFileDomain> searchByCondition(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public List<TmBhtResourceFileDomain> searchByConditionForPaging(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public int searchCount(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public TmBhtResourceFileDomain searchByKeyForChange(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public TmBhtResourceFileDomain lockByKey(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public TmBhtResourceFileDomain lockByKeyNoWait(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#create(com.globaldenso.eca0027.core.auto.business.domain.TmBhtResourceFileDomain)
     */
    public void create(TmBhtResourceFileDomain domain) throws ApplicationException {
        tmBhtResourceFileDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#create(java.util.List)
     */
    public void create(List<TmBhtResourceFileDomain> domains) throws ApplicationException {
        for(TmBhtResourceFileDomain domain : domains) {
            tmBhtResourceFileDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#update(com.globaldenso.eca0027.core.auto.business.domain.TmBhtResourceFileDomain)
     */
    public int update(TmBhtResourceFileDomain domain) throws ApplicationException {
        return tmBhtResourceFileDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#update(java.util.List)
     */
    public int update(List<TmBhtResourceFileDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmBhtResourceFileDomain domain : domains) {
            updateCount += tmBhtResourceFileDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmBhtResourceFileDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public int updateByCondition(TmBhtResourceFileDomain domain, TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmBhtResourceFileDomain> domains, List<TmBhtResourceFileCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmBhtResourceFileDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public int delete(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public int deleteByCondition(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return tmBhtResourceFileDao.deleteByCondition(criteria);
    }

}
