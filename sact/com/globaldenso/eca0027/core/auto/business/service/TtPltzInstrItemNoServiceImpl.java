/*
 * PROJECT：eca0027
 * 
 * TtPltzInstrItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;


/**
 * TtPltzInstrItemNo のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/01/17 15:54:04<BR>
 * 
 * テーブル定義から2017/01/17に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class TtPltzInstrItemNoServiceImpl implements TtPltzInstrItemNoService {

    /**
     * ttPltzInstrItemNoのDAO
     */
    private TtPltzInstrItemNoDao ttPltzInstrItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzInstrItemNoServiceImpl() {
    }

    /**
     * ttPltzInstrItemNoのDAOを設定します。
     * 
     * @param ttPltzInstrItemNoDao ttPltzInstrItemNoのDao
     */
    public void setTtPltzInstrItemNoDao(TtPltzInstrItemNoDao ttPltzInstrItemNoDao) {
        this.ttPltzInstrItemNoDao = ttPltzInstrItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public TtPltzInstrItemNoDomain searchByKey(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public List<TtPltzInstrItemNoDomain> searchByCondition(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public List<TtPltzInstrItemNoDomain> searchByConditionForPaging(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public int searchCount(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public TtPltzInstrItemNoDomain searchByKeyForChange(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public TtPltzInstrItemNoDomain lockByKey(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public TtPltzInstrItemNoDomain lockByKeyNoWait(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain)
     */
    public void create(TtPltzInstrItemNoDomain domain) throws ApplicationException {
        ttPltzInstrItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#create(java.util.List)
     */
    public void create(List<TtPltzInstrItemNoDomain> domains) throws ApplicationException {
        for(TtPltzInstrItemNoDomain domain : domains) {
            ttPltzInstrItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain)
     */
    public int update(TtPltzInstrItemNoDomain domain) throws ApplicationException {
        return ttPltzInstrItemNoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#update(java.util.List)
     */
    public int update(List<TtPltzInstrItemNoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPltzInstrItemNoDomain domain : domains) {
            updateCount += ttPltzInstrItemNoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public int updateByCondition(TtPltzInstrItemNoDomain domain, TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPltzInstrItemNoDomain> domains, List<TtPltzInstrItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPltzInstrItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public int delete(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public int deleteByCondition(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPltzInstrItemNoDao.deleteByCondition(criteria);
    }

}
