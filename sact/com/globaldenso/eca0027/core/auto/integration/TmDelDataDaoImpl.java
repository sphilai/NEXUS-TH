/*
 * PROJECT：eca0027
 * 
 * TmDelData のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmDelDataDomain;


/**
 * TmDelData のDAO実装クラスです。<BR>
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
public class TmDelDataDaoImpl extends SqlMapClientDaoSupport implements TmDelDataDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmDelDataDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public TmDelDataDomain searchByKey(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return (TmDelDataDomain)getSqlMapClientTemplate()
                    .queryForObject("TmDelData.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmDelDataDomain> searchByCondition(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return (List<TmDelDataDomain>)getSqlMapClientTemplate()
                    .queryForList("TmDelData.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmDelDataDomain> searchByConditionForPaging(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return (List<TmDelDataDomain>)getSqlMapClientTemplate()
                    .queryForList("TmDelData.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public int searchCount(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmDelData.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public TmDelDataDomain searchByKeyForChange(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return (TmDelDataDomain)getSqlMapClientTemplate()
                    .queryForObject("TmDelData.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public TmDelDataDomain lockByKey(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return (TmDelDataDomain)getSqlMapClientTemplate()
                    .queryForObject("TmDelData.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public TmDelDataDomain lockByKeyNoWait(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return (TmDelDataDomain)getSqlMapClientTemplate()
                .queryForObject("TmDelData.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmDelDataDomain)
     */
    public void create(TmDelDataDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmDelData.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmDelDataDomain)
     */
    public int update(TmDelDataDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmDelData.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmDelDataDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public int updateByCondition(TmDelDataDomain domain, TmDelDataCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmDelData.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public int delete(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmDelData.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmDelDataDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmDelDataCriteriaDomain)
     */
    public int deleteByCondition(TmDelDataCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmDelData.DeleteByCondition", criteria);
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
