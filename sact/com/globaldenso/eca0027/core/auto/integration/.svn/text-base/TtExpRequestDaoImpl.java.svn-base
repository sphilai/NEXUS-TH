/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain;


/**
 * TtExpRequest のDAO実装クラスです。<BR>
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
public class TtExpRequestDaoImpl extends SqlMapClientDaoSupport implements TtExpRequestDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public TtExpRequestDomain searchByKey(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequest.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDomain> searchByCondition(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequest.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDomain> searchByConditionForPaging(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequest.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public int searchCount(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequest.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public TtExpRequestDomain searchByKeyForChange(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequest.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public TtExpRequestDomain lockByKey(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequest.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public TtExpRequestDomain lockByKeyNoWait(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDomain)getSqlMapClientTemplate()
                .queryForObject("TtExpRequest.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain)
     */
    public void create(TtExpRequestDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtExpRequest.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain)
     */
    public int update(TtExpRequestDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtExpRequest.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestDomain domain, TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtExpRequest.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public int delete(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequest.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequest.DeleteByCondition", criteria);
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
