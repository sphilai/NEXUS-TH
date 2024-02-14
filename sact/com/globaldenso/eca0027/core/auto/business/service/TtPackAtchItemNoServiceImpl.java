/*
 * PROJECT：eca0027
 * 
 * TtPackAtchItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain;


/**
 * TtPackAtchItemNo のService実装クラスです。<BR>
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
public class TtPackAtchItemNoServiceImpl implements TtPackAtchItemNoService {

    /**
     * ttPackAtchItemNoのDAO
     */
    private TtPackAtchItemNoDao ttPackAtchItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPackAtchItemNoServiceImpl() {
    }

    /**
     * ttPackAtchItemNoのDAOを設定します。
     * 
     * @param ttPackAtchItemNoDao ttPackAtchItemNoのDao
     */
    public void setTtPackAtchItemNoDao(TtPackAtchItemNoDao ttPackAtchItemNoDao) {
        this.ttPackAtchItemNoDao = ttPackAtchItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public TtPackAtchItemNoDomain searchByKey(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public List<TtPackAtchItemNoDomain> searchByCondition(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public List<TtPackAtchItemNoDomain> searchByConditionForPaging(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public int searchCount(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public TtPackAtchItemNoDomain searchByKeyForChange(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public TtPackAtchItemNoDomain lockByKey(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public TtPackAtchItemNoDomain lockByKeyNoWait(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain)
     */
    public void create(TtPackAtchItemNoDomain domain) throws ApplicationException {
        ttPackAtchItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#create(java.util.List)
     */
    public void create(List<TtPackAtchItemNoDomain> domains) throws ApplicationException {
        for(TtPackAtchItemNoDomain domain : domains) {
            ttPackAtchItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain)
     */
    public int update(TtPackAtchItemNoDomain domain) throws ApplicationException {
        return ttPackAtchItemNoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#update(java.util.List)
     */
    public int update(List<TtPackAtchItemNoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPackAtchItemNoDomain domain : domains) {
            updateCount += ttPackAtchItemNoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public int updateByCondition(TtPackAtchItemNoDomain domain, TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPackAtchItemNoDomain> domains, List<TtPackAtchItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPackAtchItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public int delete(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public int deleteByCondition(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return ttPackAtchItemNoDao.deleteByCondition(criteria);
    }

}
