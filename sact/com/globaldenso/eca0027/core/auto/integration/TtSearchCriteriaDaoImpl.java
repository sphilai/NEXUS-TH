/*
 * PROJECT：eca0027
 * 
 * TtSearchCriteria のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtSearchCriteriaDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtSearchCriteriaDomain;


/**
 * TtSearchCriteria のDAO実装クラスです。<BR>
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
public class TtSearchCriteriaDaoImpl extends SqlMapClientDaoSupport implements TtSearchCriteriaDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtSearchCriteriaDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSearchCriteriaDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtSearchCriteriaDomain> searchByCondition(TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        return (List<TtSearchCriteriaDomain>)getSqlMapClientTemplate()
                    .queryForList("TtSearchCriteria.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSearchCriteriaDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtSearchCriteriaDomain> searchByConditionForPaging(TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        return (List<TtSearchCriteriaDomain>)getSqlMapClientTemplate()
                    .queryForList("TtSearchCriteria.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSearchCriteriaDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    public int searchCount(TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtSearchCriteria.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSearchCriteriaDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtSearchCriteriaDomain)
     */
    public void create(TtSearchCriteriaDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtSearchCriteria.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSearchCriteriaDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtSearchCriteriaDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    public int updateByCondition(TtSearchCriteriaDomain domain, TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtSearchCriteria.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSearchCriteriaDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSearchCriteriaCriteriaDomain)
     */
    public int deleteByCondition(TtSearchCriteriaCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtSearchCriteria.DeleteByCondition", criteria);
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
