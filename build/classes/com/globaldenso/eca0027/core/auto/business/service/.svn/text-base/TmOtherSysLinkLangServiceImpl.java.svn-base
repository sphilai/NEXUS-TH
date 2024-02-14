/*
 * PROJECT：eca0027
 * 
 * TmOtherSysLinkLang のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/02/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkLangDomain;


/**
 * TmOtherSysLinkLang のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/02/11 14:36:46<BR>
 * 
 * テーブル定義から2015/02/11に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10644 $
 */
public class TmOtherSysLinkLangServiceImpl implements TmOtherSysLinkLangService {

    /**
     * tmOtherSysLinkLangのDAO
     */
    private TmOtherSysLinkLangDao tmOtherSysLinkLangDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmOtherSysLinkLangServiceImpl() {
    }

    /**
     * tmOtherSysLinkLangのDAOを設定します。
     * 
     * @param tmOtherSysLinkLangDao tmOtherSysLinkLangのDao
     */
    public void setTmOtherSysLinkLangDao(TmOtherSysLinkLangDao tmOtherSysLinkLangDao) {
        this.tmOtherSysLinkLangDao = tmOtherSysLinkLangDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public TmOtherSysLinkLangDomain searchByKey(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public List<TmOtherSysLinkLangDomain> searchByCondition(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public List<TmOtherSysLinkLangDomain> searchByConditionForPaging(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public int searchCount(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public TmOtherSysLinkLangDomain searchByKeyForChange(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public TmOtherSysLinkLangDomain lockByKey(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public TmOtherSysLinkLangDomain lockByKeyNoWait(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#create(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkLangDomain)
     */
    public void create(TmOtherSysLinkLangDomain domain) throws ApplicationException {
        tmOtherSysLinkLangDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#create(java.util.List)
     */
    public void create(List<TmOtherSysLinkLangDomain> domains) throws ApplicationException {
        for(TmOtherSysLinkLangDomain domain : domains) {
            tmOtherSysLinkLangDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#update(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkLangDomain)
     */
    public int update(TmOtherSysLinkLangDomain domain) throws ApplicationException {
        return tmOtherSysLinkLangDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#update(java.util.List)
     */
    public int update(List<TmOtherSysLinkLangDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmOtherSysLinkLangDomain domain : domains) {
            updateCount += tmOtherSysLinkLangDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkLangDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public int updateByCondition(TmOtherSysLinkLangDomain domain, TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmOtherSysLinkLangDomain> domains, List<TmOtherSysLinkLangCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmOtherSysLinkLangDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public int delete(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmOtherSysLinkLangService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public int deleteByCondition(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return tmOtherSysLinkLangDao.deleteByCondition(criteria);
    }

}
