/*
 * PROJECT：eca0027
 * 
 * TmStdQrPatternHdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternHdrDomain;


/**
 * TmStdQrPatternHdr のService実装クラスです。<BR>
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
public class TmStdQrPatternHdrServiceImpl implements TmStdQrPatternHdrService {

    /**
     * tmStdQrPatternHdrのDAO
     */
    private TmStdQrPatternHdrDao tmStdQrPatternHdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmStdQrPatternHdrServiceImpl() {
    }

    /**
     * tmStdQrPatternHdrのDAOを設定します。
     * 
     * @param tmStdQrPatternHdrDao tmStdQrPatternHdrのDao
     */
    public void setTmStdQrPatternHdrDao(TmStdQrPatternHdrDao tmStdQrPatternHdrDao) {
        this.tmStdQrPatternHdrDao = tmStdQrPatternHdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public TmStdQrPatternHdrDomain searchByKey(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public List<TmStdQrPatternHdrDomain> searchByCondition(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public List<TmStdQrPatternHdrDomain> searchByConditionForPaging(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public int searchCount(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public TmStdQrPatternHdrDomain searchByKeyForChange(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public TmStdQrPatternHdrDomain lockByKey(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public TmStdQrPatternHdrDomain lockByKeyNoWait(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#create(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternHdrDomain)
     */
    public void create(TmStdQrPatternHdrDomain domain) throws ApplicationException {
        tmStdQrPatternHdrDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#create(java.util.List)
     */
    public void create(List<TmStdQrPatternHdrDomain> domains) throws ApplicationException {
        for(TmStdQrPatternHdrDomain domain : domains) {
            tmStdQrPatternHdrDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#update(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternHdrDomain)
     */
    public int update(TmStdQrPatternHdrDomain domain) throws ApplicationException {
        return tmStdQrPatternHdrDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#update(java.util.List)
     */
    public int update(List<TmStdQrPatternHdrDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmStdQrPatternHdrDomain domain : domains) {
            updateCount += tmStdQrPatternHdrDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternHdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public int updateByCondition(TmStdQrPatternHdrDomain domain, TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmStdQrPatternHdrDomain> domains, List<TmStdQrPatternHdrCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmStdQrPatternHdrDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public int delete(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmStdQrPatternHdrService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public int deleteByCondition(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return tmStdQrPatternHdrDao.deleteByCondition(criteria);
    }

}
