/*
 * PROJECT：eca0027
 * 
 * TtTransferKanban のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferKanbanDomain;


/**
 * TtTransferKanban のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author: 100011638841 $
 * @version $Revision: 8158 $
 */
public class TtTransferKanbanDaoImpl extends SqlMapClientDaoSupport implements TtTransferKanbanDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferKanbanDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public TtTransferKanbanDomain searchByKey(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferKanbanDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferKanban.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferKanbanDomain> searchByCondition(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferKanbanDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransferKanban.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferKanbanDomain> searchByConditionForPaging(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferKanbanDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransferKanban.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public int searchCount(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtTransferKanban.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public TtTransferKanbanDomain searchByKeyForChange(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferKanbanDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferKanban.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public TtTransferKanbanDomain lockByKey(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferKanbanDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferKanban.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public TtTransferKanbanDomain lockByKeyNoWait(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferKanbanDomain)getSqlMapClientTemplate()
                .queryForObject("TtTransferKanban.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferKanbanDomain)
     */
    public void create(TtTransferKanbanDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtTransferKanban.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferKanbanDomain)
     */
    public int update(TtTransferKanbanDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtTransferKanban.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferKanbanDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public int updateByCondition(TtTransferKanbanDomain domain, TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtTransferKanban.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public int delete(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransferKanban.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferKanbanDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain)
     */
    public int deleteByCondition(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransferKanban.DeleteByCondition", criteria);
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
