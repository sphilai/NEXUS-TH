/*
 * PROJECT：eca0027
 * 
 * TmUomCnvDec のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain;


/**
 * TmUomCnvDec のService実装クラスです。<BR>
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
public class TmUomCnvDecServiceImpl implements TmUomCnvDecService {

    /**
     * tmUomCnvDecのDAO
     */
    private TmUomCnvDecDao tmUomCnvDecDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmUomCnvDecServiceImpl() {
    }

    /**
     * tmUomCnvDecのDAOを設定します。
     * 
     * @param tmUomCnvDecDao tmUomCnvDecのDao
     */
    public void setTmUomCnvDecDao(TmUomCnvDecDao tmUomCnvDecDao) {
        this.tmUomCnvDecDao = tmUomCnvDecDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public TmUomCnvDecDomain searchByKey(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public List<TmUomCnvDecDomain> searchByCondition(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public List<TmUomCnvDecDomain> searchByConditionForPaging(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public int searchCount(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public TmUomCnvDecDomain searchByKeyForChange(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public TmUomCnvDecDomain lockByKey(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public TmUomCnvDecDomain lockByKeyNoWait(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#create(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain)
     */
    public void create(TmUomCnvDecDomain domain) throws ApplicationException {
        tmUomCnvDecDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#create(java.util.List)
     */
    public void create(List<TmUomCnvDecDomain> domains) throws ApplicationException {
        for(TmUomCnvDecDomain domain : domains) {
            tmUomCnvDecDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#update(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain)
     */
    public int update(TmUomCnvDecDomain domain) throws ApplicationException {
        return tmUomCnvDecDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#update(java.util.List)
     */
    public int update(List<TmUomCnvDecDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmUomCnvDecDomain domain : domains) {
            updateCount += tmUomCnvDecDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public int updateByCondition(TmUomCnvDecDomain domain, TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmUomCnvDecDomain> domains, List<TmUomCnvDecCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmUomCnvDecDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public int delete(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public int deleteByCondition(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return tmUomCnvDecDao.deleteByCondition(criteria);
    }

}
