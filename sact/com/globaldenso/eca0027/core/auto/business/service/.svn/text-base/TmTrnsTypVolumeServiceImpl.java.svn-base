/*
 * PROJECT：eca0027
 * 
 * TmTrnsTypVolume のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypVolumeDomain;


/**
 * TmTrnsTypVolume のService実装クラスです。<BR>
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
public class TmTrnsTypVolumeServiceImpl implements TmTrnsTypVolumeService {

    /**
     * tmTrnsTypVolumeのDAO
     */
    private TmTrnsTypVolumeDao tmTrnsTypVolumeDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmTrnsTypVolumeServiceImpl() {
    }

    /**
     * tmTrnsTypVolumeのDAOを設定します。
     * 
     * @param tmTrnsTypVolumeDao tmTrnsTypVolumeのDao
     */
    public void setTmTrnsTypVolumeDao(TmTrnsTypVolumeDao tmTrnsTypVolumeDao) {
        this.tmTrnsTypVolumeDao = tmTrnsTypVolumeDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public TmTrnsTypVolumeDomain searchByKey(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public List<TmTrnsTypVolumeDomain> searchByCondition(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public List<TmTrnsTypVolumeDomain> searchByConditionForPaging(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public int searchCount(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public TmTrnsTypVolumeDomain searchByKeyForChange(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public TmTrnsTypVolumeDomain lockByKey(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public TmTrnsTypVolumeDomain lockByKeyNoWait(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#create(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypVolumeDomain)
     */
    public void create(TmTrnsTypVolumeDomain domain) throws ApplicationException {
        tmTrnsTypVolumeDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#create(java.util.List)
     */
    public void create(List<TmTrnsTypVolumeDomain> domains) throws ApplicationException {
        for(TmTrnsTypVolumeDomain domain : domains) {
            tmTrnsTypVolumeDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#update(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypVolumeDomain)
     */
    public int update(TmTrnsTypVolumeDomain domain) throws ApplicationException {
        return tmTrnsTypVolumeDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#update(java.util.List)
     */
    public int update(List<TmTrnsTypVolumeDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TmTrnsTypVolumeDomain domain : domains) {
            updateCount += tmTrnsTypVolumeDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypVolumeDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public int updateByCondition(TmTrnsTypVolumeDomain domain, TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmTrnsTypVolumeDomain> domains, List<TmTrnsTypVolumeCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmTrnsTypVolumeDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public int delete(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public int deleteByCondition(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return tmTrnsTypVolumeDao.deleteByCondition(criteria);
    }

}
