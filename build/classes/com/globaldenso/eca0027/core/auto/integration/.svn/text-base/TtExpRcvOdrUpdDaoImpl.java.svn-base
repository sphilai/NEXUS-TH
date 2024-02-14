/*
 * PROJECT：eca0027
 * 
 * TtExpRcvOdrUpd のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrUpdDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrUpdDomain;


/**
 * TtExpRcvOdrUpd のDAO実装クラスです。<BR>
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
public class TtExpRcvOdrUpdDaoImpl extends SqlMapClientDaoSupport implements TtExpRcvOdrUpdDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRcvOdrUpdDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrUpdDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRcvOdrUpdDomain> searchByCondition(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRcvOdrUpdDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRcvOdrUpd.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrUpdDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRcvOdrUpdDomain> searchByConditionForPaging(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRcvOdrUpdDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRcvOdrUpd.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrUpdDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    public int searchCount(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtExpRcvOdrUpd.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrUpdDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrUpdDomain)
     */
    public void create(TtExpRcvOdrUpdDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtExpRcvOdrUpd.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrUpdDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrUpdDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    public int updateByCondition(TtExpRcvOdrUpdDomain domain, TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtExpRcvOdrUpd.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrUpdDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain)
     */
    public int deleteByCondition(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRcvOdrUpd.DeleteByCondition", criteria);
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
