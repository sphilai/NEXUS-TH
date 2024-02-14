/*
 * PROJECT：eca0027
 * 
 * TwOdrUploadUpd のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/02/14  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadUpdDomain;


/**
 * TwOdrUploadUpd のService実装クラスです。<BR>
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
public class TwOdrUploadUpdServiceImpl implements TwOdrUploadUpdService {

    /**
     * twOdrUploadUpdのDAO
     */
    private TwOdrUploadUpdDao twOdrUploadUpdDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwOdrUploadUpdServiceImpl() {
    }

    /**
     * twOdrUploadUpdのDAOを設定します。
     * 
     * @param twOdrUploadUpdDao twOdrUploadUpdのDao
     */
    public void setTwOdrUploadUpdDao(TwOdrUploadUpdDao twOdrUploadUpdDao) {
        this.twOdrUploadUpdDao = twOdrUploadUpdDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public TwOdrUploadUpdDomain searchByKey(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public List<TwOdrUploadUpdDomain> searchByCondition(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public List<TwOdrUploadUpdDomain> searchByConditionForPaging(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public int searchCount(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public TwOdrUploadUpdDomain searchByKeyForChange(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public TwOdrUploadUpdDomain lockByKey(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public TwOdrUploadUpdDomain lockByKeyNoWait(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#create(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadUpdDomain)
     */
    public void create(TwOdrUploadUpdDomain domain) throws ApplicationException {
        twOdrUploadUpdDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#create(java.util.List)
     */
    public void create(List<TwOdrUploadUpdDomain> domains) throws ApplicationException {
        for(TwOdrUploadUpdDomain domain : domains) {
            twOdrUploadUpdDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#update(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadUpdDomain)
     */
    public int update(TwOdrUploadUpdDomain domain) throws ApplicationException {
        return twOdrUploadUpdDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#update(java.util.List)
     */
    public int update(List<TwOdrUploadUpdDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwOdrUploadUpdDomain domain : domains) {
            updateCount += twOdrUploadUpdDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadUpdDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public int updateByCondition(TwOdrUploadUpdDomain domain, TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwOdrUploadUpdDomain> domains, List<TwOdrUploadUpdCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twOdrUploadUpdDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public int delete(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public int deleteByCondition(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return twOdrUploadUpdDao.deleteByCondition(criteria);
    }

}
