/*
 * PROJECT：eca0027
 * 
 * TtOdrUploadReqMgt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/26  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain;


/**
 * TtOdrUploadReqMgt のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/01/26 19:15:00<BR>
 * 
 * テーブル定義から2017/01/26に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13533 $
 */
public class TtOdrUploadReqMgtServiceImpl implements TtOdrUploadReqMgtService {

    /**
     * ttOdrUploadReqMgtのDAO
     */
    private TtOdrUploadReqMgtDao ttOdrUploadReqMgtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtOdrUploadReqMgtServiceImpl() {
    }

    /**
     * ttOdrUploadReqMgtのDAOを設定します。
     * 
     * @param ttOdrUploadReqMgtDao ttOdrUploadReqMgtのDao
     */
    public void setTtOdrUploadReqMgtDao(TtOdrUploadReqMgtDao ttOdrUploadReqMgtDao) {
        this.ttOdrUploadReqMgtDao = ttOdrUploadReqMgtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public TtOdrUploadReqMgtDomain searchByKey(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public List<TtOdrUploadReqMgtDomain> searchByCondition(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public List<TtOdrUploadReqMgtDomain> searchByConditionForPaging(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public int searchCount(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public TtOdrUploadReqMgtDomain searchByKeyForChange(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public TtOdrUploadReqMgtDomain lockByKey(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public TtOdrUploadReqMgtDomain lockByKeyNoWait(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#create(com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain)
     */
    public void create(TtOdrUploadReqMgtDomain domain) throws ApplicationException {
        ttOdrUploadReqMgtDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#create(java.util.List)
     */
    public void create(List<TtOdrUploadReqMgtDomain> domains) throws ApplicationException {
        for(TtOdrUploadReqMgtDomain domain : domains) {
            ttOdrUploadReqMgtDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#update(com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain)
     */
    public int update(TtOdrUploadReqMgtDomain domain) throws ApplicationException {
        return ttOdrUploadReqMgtDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#update(java.util.List)
     */
    public int update(List<TtOdrUploadReqMgtDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtOdrUploadReqMgtDomain domain : domains) {
            updateCount += ttOdrUploadReqMgtDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public int updateByCondition(TtOdrUploadReqMgtDomain domain, TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtOdrUploadReqMgtDomain> domains, List<TtOdrUploadReqMgtCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttOdrUploadReqMgtDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public int delete(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public int deleteByCondition(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return ttOdrUploadReqMgtDao.deleteByCondition(criteria);
    }

}
