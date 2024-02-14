/*
 * PROJECT：eca0027
 * 
 * TmStdQrPatternDtl のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternDtlDomain;


/**
 * TmStdQrPatternDtl のDAO実装クラスです。<BR>
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
public class TmStdQrPatternDtlDaoImpl extends SqlMapClientDaoSupport implements TmStdQrPatternDtlDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmStdQrPatternDtlDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public TmStdQrPatternDtlDomain searchByKey(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrPatternDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrPatternDtl.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmStdQrPatternDtlDomain> searchByCondition(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TmStdQrPatternDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TmStdQrPatternDtl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmStdQrPatternDtlDomain> searchByConditionForPaging(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TmStdQrPatternDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TmStdQrPatternDtl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public int searchCount(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrPatternDtl.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public TmStdQrPatternDtlDomain searchByKeyForChange(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrPatternDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrPatternDtl.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public TmStdQrPatternDtlDomain lockByKey(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrPatternDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrPatternDtl.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public TmStdQrPatternDtlDomain lockByKeyNoWait(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrPatternDtlDomain)getSqlMapClientTemplate()
                .queryForObject("TmStdQrPatternDtl.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternDtlDomain)
     */
    public void create(TmStdQrPatternDtlDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmStdQrPatternDtl.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternDtlDomain)
     */
    public int update(TmStdQrPatternDtlDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmStdQrPatternDtl.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternDtlDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public int updateByCondition(TmStdQrPatternDtlDomain domain, TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmStdQrPatternDtl.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public int delete(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmStdQrPatternDtl.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternDtlDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternDtlCriteriaDomain)
     */
    public int deleteByCondition(TmStdQrPatternDtlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmStdQrPatternDtl.DeleteByCondition", criteria);
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
