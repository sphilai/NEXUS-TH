/*
 * PROJECT：eca0027
 * 
 * TtPltzInstrOdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;


/**
 * TtPltzInstrOdr のService実装クラスです。<BR>
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
public class TtPltzInstrOdrServiceImpl implements TtPltzInstrOdrService {

    /**
     * ttPltzInstrOdrのDAO
     */
    private TtPltzInstrOdrDao ttPltzInstrOdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzInstrOdrServiceImpl() {
    }

    /**
     * ttPltzInstrOdrのDAOを設定します。
     * 
     * @param ttPltzInstrOdrDao ttPltzInstrOdrのDao
     */
    public void setTtPltzInstrOdrDao(TtPltzInstrOdrDao ttPltzInstrOdrDao) {
        this.ttPltzInstrOdrDao = ttPltzInstrOdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public TtPltzInstrOdrDomain searchByKey(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public List<TtPltzInstrOdrDomain> searchByCondition(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public List<TtPltzInstrOdrDomain> searchByConditionForPaging(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public int searchCount(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public TtPltzInstrOdrDomain searchByKeyForChange(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public TtPltzInstrOdrDomain lockByKey(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public TtPltzInstrOdrDomain lockByKeyNoWait(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain)
     */
    public void create(TtPltzInstrOdrDomain domain) throws ApplicationException {
        ttPltzInstrOdrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#create(java.util.List)
     */
    public void create(List<TtPltzInstrOdrDomain> domains) throws ApplicationException {
        for(TtPltzInstrOdrDomain domain : domains) {
            ttPltzInstrOdrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain)
     */
    public int update(TtPltzInstrOdrDomain domain) throws ApplicationException {
        return ttPltzInstrOdrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#update(java.util.List)
     */
    public int update(List<TtPltzInstrOdrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPltzInstrOdrDomain domain : domains) {
            updateCount += ttPltzInstrOdrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public int updateByCondition(TtPltzInstrOdrDomain domain, TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPltzInstrOdrDomain> domains, List<TtPltzInstrOdrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPltzInstrOdrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public int delete(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public int deleteByCondition(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrOdrDao.deleteByCondition(criteria);
    }

}
