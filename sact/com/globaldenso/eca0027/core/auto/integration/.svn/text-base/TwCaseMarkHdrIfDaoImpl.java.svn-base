/*
 * PROJECT：eca0027
 * 
 * TwCaseMarkHdrIf のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/07/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain;


/**
 * TwCaseMarkHdrIf のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/07/20 13:57:18<BR>
 * 
 * テーブル定義から2015/07/20に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11750 $
 */
public class TwCaseMarkHdrIfDaoImpl extends SqlMapClientDaoSupport implements TwCaseMarkHdrIfDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwCaseMarkHdrIfDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public TwCaseMarkHdrIfDomain searchByKey(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return (TwCaseMarkHdrIfDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCaseMarkHdrIf.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCaseMarkHdrIfDomain> searchByCondition(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCaseMarkHdrIfDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCaseMarkHdrIf.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCaseMarkHdrIfDomain> searchByConditionForPaging(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCaseMarkHdrIfDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCaseMarkHdrIf.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public int searchCount(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwCaseMarkHdrIf.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public TwCaseMarkHdrIfDomain searchByKeyForChange(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return (TwCaseMarkHdrIfDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCaseMarkHdrIf.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public TwCaseMarkHdrIfDomain lockByKey(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return (TwCaseMarkHdrIfDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCaseMarkHdrIf.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public TwCaseMarkHdrIfDomain lockByKeyNoWait(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return (TwCaseMarkHdrIfDomain)getSqlMapClientTemplate()
                .queryForObject("TwCaseMarkHdrIf.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain)
     */
    public void create(TwCaseMarkHdrIfDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwCaseMarkHdrIf.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain)
     */
    public int update(TwCaseMarkHdrIfDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwCaseMarkHdrIf.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public int updateByCondition(TwCaseMarkHdrIfDomain domain, TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwCaseMarkHdrIf.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public int delete(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCaseMarkHdrIf.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkHdrIfDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain)
     */
    public int deleteByCondition(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCaseMarkHdrIf.DeleteByCondition", criteria);
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
