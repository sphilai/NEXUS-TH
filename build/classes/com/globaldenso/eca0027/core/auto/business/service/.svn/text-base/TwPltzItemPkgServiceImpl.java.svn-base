/*
 * PROJECT：eca0027
 * 
 * TwPltzItemPkg のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemPkgDomain;


/**
 * TwPltzItemPkg のService実装クラスです。<BR>
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
public class TwPltzItemPkgServiceImpl implements TwPltzItemPkgService {

    /**
     * twPltzItemPkgのDAO
     */
    private TwPltzItemPkgDao twPltzItemPkgDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwPltzItemPkgServiceImpl() {
    }

    /**
     * twPltzItemPkgのDAOを設定します。
     * 
     * @param twPltzItemPkgDao twPltzItemPkgのDao
     */
    public void setTwPltzItemPkgDao(TwPltzItemPkgDao twPltzItemPkgDao) {
        this.twPltzItemPkgDao = twPltzItemPkgDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public TwPltzItemPkgDomain searchByKey(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public List<TwPltzItemPkgDomain> searchByCondition(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public List<TwPltzItemPkgDomain> searchByConditionForPaging(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public int searchCount(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public TwPltzItemPkgDomain searchByKeyForChange(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public TwPltzItemPkgDomain lockByKey(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public TwPltzItemPkgDomain lockByKeyNoWait(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#create(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemPkgDomain)
     */
    public void create(TwPltzItemPkgDomain domain) throws ApplicationException {
        twPltzItemPkgDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#create(java.util.List)
     */
    public void create(List<TwPltzItemPkgDomain> domains) throws ApplicationException {
        for(TwPltzItemPkgDomain domain : domains) {
            twPltzItemPkgDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#update(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemPkgDomain)
     */
    public int update(TwPltzItemPkgDomain domain) throws ApplicationException {
        return twPltzItemPkgDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#update(java.util.List)
     */
    public int update(List<TwPltzItemPkgDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwPltzItemPkgDomain domain : domains) {
            updateCount += twPltzItemPkgDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemPkgDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public int updateByCondition(TwPltzItemPkgDomain domain, TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwPltzItemPkgDomain> domains, List<TwPltzItemPkgCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twPltzItemPkgDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public int delete(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public int deleteByCondition(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemPkgDao.deleteByCondition(criteria);
    }

}
