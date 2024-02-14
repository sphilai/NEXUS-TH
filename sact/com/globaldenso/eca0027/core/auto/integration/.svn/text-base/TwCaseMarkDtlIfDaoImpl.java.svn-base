/*
 * PROJECT：eca0027
 * 
 * TwCaseMarkDtlIf のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkDtlIfDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkDtlIfDomain;


/**
 * TwCaseMarkDtlIf のDAO実装クラスです。<BR>
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
public class TwCaseMarkDtlIfDaoImpl extends SqlMapClientDaoSupport implements TwCaseMarkDtlIfDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwCaseMarkDtlIfDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkDtlIfDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCaseMarkDtlIfDomain> searchByCondition(TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCaseMarkDtlIfDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCaseMarkDtlIf.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkDtlIfDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCaseMarkDtlIfDomain> searchByConditionForPaging(TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCaseMarkDtlIfDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCaseMarkDtlIf.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkDtlIfDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    public int searchCount(TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwCaseMarkDtlIf.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkDtlIfDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkDtlIfDomain)
     */
    public void create(TwCaseMarkDtlIfDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwCaseMarkDtlIf.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkDtlIfDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkDtlIfDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    public int updateByCondition(TwCaseMarkDtlIfDomain domain, TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwCaseMarkDtlIf.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkDtlIfDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain)
     */
    public int deleteByCondition(TwCaseMarkDtlIfCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCaseMarkDtlIf.DeleteByCondition", criteria);
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
