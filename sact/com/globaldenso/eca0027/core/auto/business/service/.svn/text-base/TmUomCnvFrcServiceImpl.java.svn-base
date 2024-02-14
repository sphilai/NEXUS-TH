/*
 * PROJECT：eca0027
 * 
 * TmUomCnvFrc のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvFrcDomain;


/**
 * TmUomCnvFrc のService実装クラスです。<BR>
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
public class TmUomCnvFrcServiceImpl implements TmUomCnvFrcService {

    /**
     * tmUomCnvFrcのDAO
     */
    private TmUomCnvFrcDao tmUomCnvFrcDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmUomCnvFrcServiceImpl() {
    }

    /**
     * tmUomCnvFrcのDAOを設定します。
     * 
     * @param tmUomCnvFrcDao tmUomCnvFrcのDao
     */
    public void setTmUomCnvFrcDao(TmUomCnvFrcDao tmUomCnvFrcDao) {
        this.tmUomCnvFrcDao = tmUomCnvFrcDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public TmUomCnvFrcDomain searchByKey(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public List<TmUomCnvFrcDomain> searchByCondition(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public List<TmUomCnvFrcDomain> searchByConditionForPaging(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public int searchCount(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public TmUomCnvFrcDomain searchByKeyForChange(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public TmUomCnvFrcDomain lockByKey(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public TmUomCnvFrcDomain lockByKeyNoWait(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#create(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvFrcDomain)
     */
    public void create(TmUomCnvFrcDomain domain) throws ApplicationException {
        tmUomCnvFrcDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#create(java.util.List)
     */
    public void create(List<TmUomCnvFrcDomain> domains) throws ApplicationException {
        for(TmUomCnvFrcDomain domain : domains) {
            tmUomCnvFrcDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#update(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvFrcDomain)
     */
    public int update(TmUomCnvFrcDomain domain) throws ApplicationException {
        return tmUomCnvFrcDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#update(java.util.List)
     */
    public int update(List<TmUomCnvFrcDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmUomCnvFrcDomain domain : domains) {
            updateCount += tmUomCnvFrcDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvFrcDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public int updateByCondition(TmUomCnvFrcDomain domain, TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmUomCnvFrcDomain> domains, List<TmUomCnvFrcCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmUomCnvFrcDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public int delete(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvFrcService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public int deleteByCondition(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvFrcDao.deleteByCondition(criteria);
    }

}
