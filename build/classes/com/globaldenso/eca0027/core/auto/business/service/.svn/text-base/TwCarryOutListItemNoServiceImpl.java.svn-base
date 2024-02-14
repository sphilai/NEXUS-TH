/*
 * PROJECT：eca0027
 * 
 * TwCarryOutListItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/23  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListItemNoDomain;


/**
 * TwCarryOutListItemNo のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/23 11:08:03<BR>
 * 
 * テーブル定義から2014/06/23に自動生成したモジュールです。
 * 
 * @author $Author: 100011638841 $
 * @version $Revision: 8158 $
 */
public class TwCarryOutListItemNoServiceImpl implements TwCarryOutListItemNoService {

    /**
     * twCarryOutListItemNoのDAO
     */
    private TwCarryOutListItemNoDao twCarryOutListItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwCarryOutListItemNoServiceImpl() {
    }

    /**
     * twCarryOutListItemNoのDAOを設定します。
     * 
     * @param twCarryOutListItemNoDao twCarryOutListItemNoのDao
     */
    public void setTwCarryOutListItemNoDao(TwCarryOutListItemNoDao twCarryOutListItemNoDao) {
        this.twCarryOutListItemNoDao = twCarryOutListItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public TwCarryOutListItemNoDomain searchByKey(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public List<TwCarryOutListItemNoDomain> searchByCondition(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public List<TwCarryOutListItemNoDomain> searchByConditionForPaging(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public int searchCount(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public TwCarryOutListItemNoDomain searchByKeyForChange(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public TwCarryOutListItemNoDomain lockByKey(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public TwCarryOutListItemNoDomain lockByKeyNoWait(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListItemNoDomain)
     */
    public void create(TwCarryOutListItemNoDomain domain) throws ApplicationException {
        twCarryOutListItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#create(java.util.List)
     */
    public void create(List<TwCarryOutListItemNoDomain> domains) throws ApplicationException {
        for(TwCarryOutListItemNoDomain domain : domains) {
            twCarryOutListItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#update(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListItemNoDomain)
     */
    public int update(TwCarryOutListItemNoDomain domain) throws ApplicationException {
        return twCarryOutListItemNoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#update(java.util.List)
     */
    public int update(List<TwCarryOutListItemNoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwCarryOutListItemNoDomain domain : domains) {
            updateCount += twCarryOutListItemNoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public int updateByCondition(TwCarryOutListItemNoDomain domain, TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwCarryOutListItemNoDomain> domains, List<TwCarryOutListItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twCarryOutListItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public int delete(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public int deleteByCondition(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListItemNoDao.deleteByCondition(criteria);
    }

}
