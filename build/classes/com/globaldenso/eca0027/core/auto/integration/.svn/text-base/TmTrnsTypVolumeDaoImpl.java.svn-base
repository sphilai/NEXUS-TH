/*
 * PROJECT：eca0027
 * 
 * TmTrnsTypVolume のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypVolumeDomain;


/**
 * TmTrnsTypVolume のDAO実装クラスです。<BR>
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
public class TmTrnsTypVolumeDaoImpl extends SqlMapClientDaoSupport implements TmTrnsTypVolumeDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmTrnsTypVolumeDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public TmTrnsTypVolumeDomain searchByKey(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return (TmTrnsTypVolumeDomain)getSqlMapClientTemplate()
                    .queryForObject("TmTrnsTypVolume.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmTrnsTypVolumeDomain> searchByCondition(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return (List<TmTrnsTypVolumeDomain>)getSqlMapClientTemplate()
                    .queryForList("TmTrnsTypVolume.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmTrnsTypVolumeDomain> searchByConditionForPaging(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return (List<TmTrnsTypVolumeDomain>)getSqlMapClientTemplate()
                    .queryForList("TmTrnsTypVolume.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public int searchCount(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmTrnsTypVolume.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public TmTrnsTypVolumeDomain searchByKeyForChange(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return (TmTrnsTypVolumeDomain)getSqlMapClientTemplate()
                    .queryForObject("TmTrnsTypVolume.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public TmTrnsTypVolumeDomain lockByKey(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return (TmTrnsTypVolumeDomain)getSqlMapClientTemplate()
                    .queryForObject("TmTrnsTypVolume.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public TmTrnsTypVolumeDomain lockByKeyNoWait(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return (TmTrnsTypVolumeDomain)getSqlMapClientTemplate()
                .queryForObject("TmTrnsTypVolume.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypVolumeDomain)
     */
    public void create(TmTrnsTypVolumeDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmTrnsTypVolume.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypVolumeDomain)
     */
    public int update(TmTrnsTypVolumeDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmTrnsTypVolume.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypVolumeDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public int updateByCondition(TmTrnsTypVolumeDomain domain, TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmTrnsTypVolume.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public int delete(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmTrnsTypVolume.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypVolumeDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain)
     */
    public int deleteByCondition(TmTrnsTypVolumeCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmTrnsTypVolume.DeleteByCondition", criteria);
    }

    /**
     * 条件付更新パラメーターMapを生成するメソッドです。<br>
     * 
     * @param domain 更新対象Domain
     * @param criteria 更新条件Domain
     * @return 条件付更新パラメーターMap
     */
    private Map<String, Object> getUpdateByConditionMap(Object domain, Object criteria) {
        
        Map<String, Object> updateByConditionMap = new HashMap<String, Object>();
        
        // 更新項目をマップに設定する
        updateByConditionMap.put("condition", criteria);
        // 更新条件をマップに設定する
        updateByConditionMap.put("domain", domain);
        
        return updateByConditionMap;
    }

}
