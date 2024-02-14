/*
 * PROJECT：eca0027
 * 
 * TtMixKanban のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain;


/**
 * TtMixKanban のDAO実装クラスです。<BR>
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
public class TtMixKanbanDaoImpl extends SqlMapClientDaoSupport implements TtMixKanbanDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixKanbanDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public TtMixKanbanDomain searchByKey(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtMixKanbanDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixKanban.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixKanbanDomain> searchByCondition(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixKanbanDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixKanban.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixKanbanDomain> searchByConditionForPaging(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixKanbanDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixKanban.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public int searchCount(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtMixKanban.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public TtMixKanbanDomain searchByKeyForChange(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtMixKanbanDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixKanban.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public TtMixKanbanDomain lockByKey(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtMixKanbanDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixKanban.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public TtMixKanbanDomain lockByKeyNoWait(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtMixKanbanDomain)getSqlMapClientTemplate()
                .queryForObject("TtMixKanban.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain)
     */
    public void create(TtMixKanbanDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtMixKanban.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain)
     */
    public int update(TtMixKanbanDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtMixKanban.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public int updateByCondition(TtMixKanbanDomain domain, TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtMixKanban.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public int delete(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixKanban.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixKanbanDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain)
     */
    public int deleteByCondition(TtMixKanbanCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixKanban.DeleteByCondition", criteria);
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
