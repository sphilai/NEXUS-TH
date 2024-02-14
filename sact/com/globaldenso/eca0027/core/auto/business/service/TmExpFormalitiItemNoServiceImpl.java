/*
 * PROJECT：eca0027
 * 
 * TmExpFormalitiItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;


/**
 * TmExpFormalitiItemNo のService実装クラスです。<BR>
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
public class TmExpFormalitiItemNoServiceImpl implements TmExpFormalitiItemNoService {

    /**
     * tmExpFormalitiItemNoのDAO
     */
    private TmExpFormalitiItemNoDao tmExpFormalitiItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpFormalitiItemNoServiceImpl() {
    }

    /**
     * tmExpFormalitiItemNoのDAOを設定します。
     * 
     * @param tmExpFormalitiItemNoDao tmExpFormalitiItemNoのDao
     */
    public void setTmExpFormalitiItemNoDao(TmExpFormalitiItemNoDao tmExpFormalitiItemNoDao) {
        this.tmExpFormalitiItemNoDao = tmExpFormalitiItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public TmExpFormalitiItemNoDomain searchByKey(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public List<TmExpFormalitiItemNoDomain> searchByCondition(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public List<TmExpFormalitiItemNoDomain> searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public int searchCount(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public TmExpFormalitiItemNoDomain searchByKeyForChange(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public TmExpFormalitiItemNoDomain lockByKey(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public TmExpFormalitiItemNoDomain lockByKeyNoWait(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain)
     */
    public void create(TmExpFormalitiItemNoDomain domain) throws ApplicationException {
        tmExpFormalitiItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#create(java.util.List)
     */
    public void create(List<TmExpFormalitiItemNoDomain> domains) throws ApplicationException {
        for(TmExpFormalitiItemNoDomain domain : domains) {
            tmExpFormalitiItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#update(com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain)
     */
    public int update(TmExpFormalitiItemNoDomain domain) throws ApplicationException {
        return tmExpFormalitiItemNoDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#update(java.util.List)
     */
    public int update(List<TmExpFormalitiItemNoDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmExpFormalitiItemNoDomain domain : domains) {
            updateCount += tmExpFormalitiItemNoDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public int updateByCondition(TmExpFormalitiItemNoDomain domain, TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmExpFormalitiItemNoDomain> domains, List<TmExpFormalitiItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmExpFormalitiItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public int delete(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public int deleteByCondition(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpFormalitiItemNoDao.deleteByCondition(criteria);
    }

}
