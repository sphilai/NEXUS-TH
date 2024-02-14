/*
 * PROJECT：eca0027
 * 
 * TwOdrUpload のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/02/14  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadDomain;


/**
 * TwOdrUpload のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/02/14 09:12:40<BR>
 * 
 * テーブル定義から2017/02/14に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13624 $
 */
public class TwOdrUploadServiceImpl implements TwOdrUploadService {

    /**
     * twOdrUploadのDAO
     */
    private TwOdrUploadDao twOdrUploadDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwOdrUploadServiceImpl() {
    }

    /**
     * twOdrUploadのDAOを設定します。
     * 
     * @param twOdrUploadDao twOdrUploadのDao
     */
    public void setTwOdrUploadDao(TwOdrUploadDao twOdrUploadDao) {
        this.twOdrUploadDao = twOdrUploadDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public TwOdrUploadDomain searchByKey(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public List<TwOdrUploadDomain> searchByCondition(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public List<TwOdrUploadDomain> searchByConditionForPaging(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public int searchCount(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public TwOdrUploadDomain searchByKeyForChange(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public TwOdrUploadDomain lockByKey(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public TwOdrUploadDomain lockByKeyNoWait(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#create(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadDomain)
     */
    public void create(TwOdrUploadDomain domain) throws ApplicationException {
        twOdrUploadDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#create(java.util.List)
     */
    public void create(List<TwOdrUploadDomain> domains) throws ApplicationException {
        for(TwOdrUploadDomain domain : domains) {
            twOdrUploadDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#update(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadDomain)
     */
    public int update(TwOdrUploadDomain domain) throws ApplicationException {
        return twOdrUploadDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#update(java.util.List)
     */
    public int update(List<TwOdrUploadDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwOdrUploadDomain domain : domains) {
            updateCount += twOdrUploadDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public int updateByCondition(TwOdrUploadDomain domain, TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwOdrUploadDomain> domains, List<TwOdrUploadCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twOdrUploadDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public int delete(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public int deleteByCondition(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadDao.deleteByCondition(criteria);
    }

}
