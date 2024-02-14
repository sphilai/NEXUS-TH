/*
 * PROJECT：eca0027
 * 
 * TtCmlErrorHeader のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;


/**
 * TtCmlErrorHeader のDAO実装クラスです。<BR>
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
public class TtCmlErrorHeaderDaoImpl extends SqlMapClientDaoSupport implements TtCmlErrorHeaderDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtCmlErrorHeaderDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public TtCmlErrorHeaderDomain searchByKey(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtCmlErrorHeaderDomain)getSqlMapClientTemplate()
                    .queryForObject("TtCmlErrorHeader.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtCmlErrorHeaderDomain> searchByCondition(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<TtCmlErrorHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("TtCmlErrorHeader.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtCmlErrorHeaderDomain> searchByConditionForPaging(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<TtCmlErrorHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("TtCmlErrorHeader.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public int searchCount(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtCmlErrorHeader.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public TtCmlErrorHeaderDomain searchByKeyForChange(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtCmlErrorHeaderDomain)getSqlMapClientTemplate()
                    .queryForObject("TtCmlErrorHeader.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public TtCmlErrorHeaderDomain lockByKey(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtCmlErrorHeaderDomain)getSqlMapClientTemplate()
                    .queryForObject("TtCmlErrorHeader.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public TtCmlErrorHeaderDomain lockByKeyNoWait(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtCmlErrorHeaderDomain)getSqlMapClientTemplate()
                .queryForObject("TtCmlErrorHeader.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain)
     */
    public void create(TtCmlErrorHeaderDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtCmlErrorHeader.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain)
     */
    public int update(TtCmlErrorHeaderDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtCmlErrorHeader.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public int updateByCondition(TtCmlErrorHeaderDomain domain, TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtCmlErrorHeader.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public int delete(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtCmlErrorHeader.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorHeaderDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain)
     */
    public int deleteByCondition(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtCmlErrorHeader.DeleteByCondition", criteria);
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
