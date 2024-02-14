/*
 * PROJECT：eca0027
 * 
 * TwPltzItemItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemItemNoDomain;


/**
 * TwPltzItemItemNo のService実装クラスです。<BR>
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
public class TwPltzItemItemNoServiceImpl implements TwPltzItemItemNoService {

    /**
     * twPltzItemItemNoのDAO
     */
    private TwPltzItemItemNoDao twPltzItemItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwPltzItemItemNoServiceImpl() {
    }

    /**
     * twPltzItemItemNoのDAOを設定します。
     * 
     * @param twPltzItemItemNoDao twPltzItemItemNoのDao
     */
    public void setTwPltzItemItemNoDao(TwPltzItemItemNoDao twPltzItemItemNoDao) {
        this.twPltzItemItemNoDao = twPltzItemItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public TwPltzItemItemNoDomain searchByKey(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public List<TwPltzItemItemNoDomain> searchByCondition(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public List<TwPltzItemItemNoDomain> searchByConditionForPaging(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public int searchCount(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public TwPltzItemItemNoDomain searchByKeyForChange(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public TwPltzItemItemNoDomain lockByKey(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public TwPltzItemItemNoDomain lockByKeyNoWait(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemItemNoDomain)
     */
    public void create(TwPltzItemItemNoDomain domain) throws ApplicationException {
        twPltzItemItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#create(java.util.List)
     */
    public void create(List<TwPltzItemItemNoDomain> domains) throws ApplicationException {
        for(TwPltzItemItemNoDomain domain : domains) {
            twPltzItemItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#update(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemItemNoDomain)
     */
    public int update(TwPltzItemItemNoDomain domain) throws ApplicationException {
        return twPltzItemItemNoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#update(java.util.List)
     */
    public int update(List<TwPltzItemItemNoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwPltzItemItemNoDomain domain : domains) {
            updateCount += twPltzItemItemNoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public int updateByCondition(TwPltzItemItemNoDomain domain, TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwPltzItemItemNoDomain> domains, List<TwPltzItemItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twPltzItemItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public int delete(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public int deleteByCondition(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return twPltzItemItemNoDao.deleteByCondition(criteria);
    }

}
