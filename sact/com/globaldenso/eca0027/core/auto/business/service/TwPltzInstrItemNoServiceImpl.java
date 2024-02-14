/*
 * PROJECT：eca0027
 * 
 * TwPltzInstrItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwPltzInstrItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzInstrItemNoDomain;


/**
 * TwPltzInstrItemNo のService実装クラスです。<BR>
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
public class TwPltzInstrItemNoServiceImpl implements TwPltzInstrItemNoService {

    /**
     * twPltzInstrItemNoのDAO
     */
    private TwPltzInstrItemNoDao twPltzInstrItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwPltzInstrItemNoServiceImpl() {
    }

    /**
     * twPltzInstrItemNoのDAOを設定します。
     * 
     * @param twPltzInstrItemNoDao twPltzInstrItemNoのDao
     */
    public void setTwPltzInstrItemNoDao(TwPltzInstrItemNoDao twPltzInstrItemNoDao) {
        this.twPltzInstrItemNoDao = twPltzInstrItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public TwPltzInstrItemNoDomain searchByKey(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public List<TwPltzInstrItemNoDomain> searchByCondition(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public List<TwPltzInstrItemNoDomain> searchByConditionForPaging(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public int searchCount(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public TwPltzInstrItemNoDomain searchByKeyForChange(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public TwPltzInstrItemNoDomain lockByKey(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public TwPltzInstrItemNoDomain lockByKeyNoWait(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TwPltzInstrItemNoDomain)
     */
    public void create(TwPltzInstrItemNoDomain domain) throws ApplicationException {
        twPltzInstrItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#create(java.util.List)
     */
    public void create(List<TwPltzInstrItemNoDomain> domains) throws ApplicationException {
        for(TwPltzInstrItemNoDomain domain : domains) {
            twPltzInstrItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#update(com.globaldenso.eca0027.core.auto.business.domain.TwPltzInstrItemNoDomain)
     */
    public int update(TwPltzInstrItemNoDomain domain) throws ApplicationException {
        return twPltzInstrItemNoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#update(java.util.List)
     */
    public int update(List<TwPltzInstrItemNoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwPltzInstrItemNoDomain domain : domains) {
            updateCount += twPltzInstrItemNoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwPltzInstrItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public int updateByCondition(TwPltzInstrItemNoDomain domain, TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwPltzInstrItemNoDomain> domains, List<TwPltzInstrItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twPltzInstrItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public int delete(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain)
     */
    public int deleteByCondition(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzInstrItemNoDao.deleteByCondition(criteria);
    }

}
