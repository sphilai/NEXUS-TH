/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtlRt のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlRtDomain;


/**
 * TtExpRequestDtlRt のDAO実装クラスです。<BR>
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
public class TtExpRequestDtlRtDaoImpl extends SqlMapClientDaoSupport implements TtExpRequestDtlRtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestDtlRtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public TtExpRequestDtlRtDomain searchByKey(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtlRt.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDtlRtDomain> searchByCondition(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDtlRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequestDtlRt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDtlRtDomain> searchByConditionForPaging(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDtlRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequestDtlRt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public int searchCount(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtlRt.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public TtExpRequestDtlRtDomain searchByKeyForChange(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtlRt.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public TtExpRequestDtlRtDomain lockByKey(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtlRt.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public TtExpRequestDtlRtDomain lockByKeyNoWait(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlRtDomain)getSqlMapClientTemplate()
                .queryForObject("TtExpRequestDtlRt.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlRtDomain)
     */
    public void create(TtExpRequestDtlRtDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtExpRequestDtlRt.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlRtDomain)
     */
    public int update(TtExpRequestDtlRtDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtExpRequestDtlRt.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlRtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestDtlRtDomain domain, TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtExpRequestDtlRt.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public int delete(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequestDtlRt.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlRtDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlRtCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestDtlRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequestDtlRt.DeleteByCondition", criteria);
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
