/*
 * PROJECT：eca0027
 * 
 * TmFncUseAuthCnf のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmFncUseAuthCnfDomain;


/**
 * TmFncUseAuthCnf のService実装クラスです。<BR>
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
public class TmFncUseAuthCnfServiceImpl implements TmFncUseAuthCnfService {

    /**
     * tmFncUseAuthCnfのDAO
     */
    private TmFncUseAuthCnfDao tmFncUseAuthCnfDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmFncUseAuthCnfServiceImpl() {
    }

    /**
     * tmFncUseAuthCnfのDAOを設定します。
     * 
     * @param tmFncUseAuthCnfDao tmFncUseAuthCnfのDao
     */
    public void setTmFncUseAuthCnfDao(TmFncUseAuthCnfDao tmFncUseAuthCnfDao) {
        this.tmFncUseAuthCnfDao = tmFncUseAuthCnfDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public TmFncUseAuthCnfDomain searchByKey(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public List<TmFncUseAuthCnfDomain> searchByCondition(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public List<TmFncUseAuthCnfDomain> searchByConditionForPaging(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public int searchCount(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public TmFncUseAuthCnfDomain searchByKeyForChange(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public TmFncUseAuthCnfDomain lockByKey(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public TmFncUseAuthCnfDomain lockByKeyNoWait(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#create(com.globaldenso.eca0027.core.auto.business.domain.TmFncUseAuthCnfDomain)
     */
    public void create(TmFncUseAuthCnfDomain domain) throws ApplicationException {
        tmFncUseAuthCnfDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#create(java.util.List)
     */
    public void create(List<TmFncUseAuthCnfDomain> domains) throws ApplicationException {
        for(TmFncUseAuthCnfDomain domain : domains) {
            tmFncUseAuthCnfDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#update(com.globaldenso.eca0027.core.auto.business.domain.TmFncUseAuthCnfDomain)
     */
    public int update(TmFncUseAuthCnfDomain domain) throws ApplicationException {
        return tmFncUseAuthCnfDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#update(java.util.List)
     */
    public int update(List<TmFncUseAuthCnfDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmFncUseAuthCnfDomain domain : domains) {
            updateCount += tmFncUseAuthCnfDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmFncUseAuthCnfDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public int updateByCondition(TmFncUseAuthCnfDomain domain, TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmFncUseAuthCnfDomain> domains, List<TmFncUseAuthCnfCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmFncUseAuthCnfDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public int delete(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmFncUseAuthCnfService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public int deleteByCondition(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return tmFncUseAuthCnfDao.deleteByCondition(criteria);
    }

}
