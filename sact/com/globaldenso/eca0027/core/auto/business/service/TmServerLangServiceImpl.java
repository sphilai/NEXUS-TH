/*
 * PROJECT：eca0027
 * 
 * TmServerLang のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmServerLangDomain;


/**
 * TmServerLang のService実装クラスです。<BR>
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
public class TmServerLangServiceImpl implements TmServerLangService {

    /**
     * tmServerLangのDAO
     */
    private TmServerLangDao tmServerLangDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmServerLangServiceImpl() {
    }

    /**
     * tmServerLangのDAOを設定します。
     * 
     * @param tmServerLangDao tmServerLangのDao
     */
    public void setTmServerLangDao(TmServerLangDao tmServerLangDao) {
        this.tmServerLangDao = tmServerLangDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public TmServerLangDomain searchByKey(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public List<TmServerLangDomain> searchByCondition(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public List<TmServerLangDomain> searchByConditionForPaging(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public int searchCount(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public TmServerLangDomain searchByKeyForChange(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public TmServerLangDomain lockByKey(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public TmServerLangDomain lockByKeyNoWait(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#create(com.globaldenso.eca0027.core.auto.business.domain.TmServerLangDomain)
     */
    public void create(TmServerLangDomain domain) throws ApplicationException {
        tmServerLangDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#create(java.util.List)
     */
    public void create(List<TmServerLangDomain> domains) throws ApplicationException {
        for(TmServerLangDomain domain : domains) {
            tmServerLangDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#update(com.globaldenso.eca0027.core.auto.business.domain.TmServerLangDomain)
     */
    public int update(TmServerLangDomain domain) throws ApplicationException {
        return tmServerLangDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#update(java.util.List)
     */
    public int update(List<TmServerLangDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmServerLangDomain domain : domains) {
            updateCount += tmServerLangDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmServerLangDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public int updateByCondition(TmServerLangDomain domain, TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmServerLangDomain> domains, List<TmServerLangCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmServerLangDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public int delete(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmServerLangService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public int deleteByCondition(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return tmServerLangDao.deleteByCondition(criteria);
    }

}
