/*
 * PROJECT：eca0027
 * 
 * TtPltzKanban のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain;


/**
 * TtPltzKanban のDAO実装クラスです。<BR>
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
public class TtPltzKanbanDaoImpl extends SqlMapClientDaoSupport implements TtPltzKanbanDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzKanbanDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public TtPltzKanbanDomain searchByKey(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzKanbanDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzKanban.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzKanbanDomain> searchByCondition(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzKanbanDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzKanban.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzKanbanDomain> searchByConditionForPaging(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzKanbanDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzKanban.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public int searchCount(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPltzKanban.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public TtPltzKanbanDomain searchByKeyForChange(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzKanbanDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzKanban.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public TtPltzKanbanDomain lockByKey(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzKanbanDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzKanban.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public TtPltzKanbanDomain lockByKeyNoWait(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzKanbanDomain)getSqlMapClientTemplate()
                .queryForObject("TtPltzKanban.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain)
     */
    public void create(TtPltzKanbanDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPltzKanban.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain)
     */
    public int update(TtPltzKanbanDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPltzKanban.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public int updateByCondition(TtPltzKanbanDomain domain, TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPltzKanban.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public int delete(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzKanban.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain)
     */
    public int deleteByCondition(TtPltzKanbanCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzKanban.DeleteByCondition", criteria);
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
