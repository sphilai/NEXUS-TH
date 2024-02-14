/*
 * PROJECT：eca0027
 * 
 * TtTmpStock のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;


/**
 * TtTmpStock のDAO実装クラスです。<BR>
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
public class TtTmpStockDaoImpl extends SqlMapClientDaoSupport implements TtTmpStockDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtTmpStockDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public TtTmpStockDomain searchByKey(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return (TtTmpStockDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTmpStock.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTmpStockDomain> searchByCondition(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTmpStockDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTmpStock.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTmpStockDomain> searchByConditionForPaging(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTmpStockDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTmpStock.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public int searchCount(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtTmpStock.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public TtTmpStockDomain searchByKeyForChange(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return (TtTmpStockDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTmpStock.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public TtTmpStockDomain lockByKey(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return (TtTmpStockDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTmpStock.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public TtTmpStockDomain lockByKeyNoWait(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return (TtTmpStockDomain)getSqlMapClientTemplate()
                .queryForObject("TtTmpStock.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain)
     */
    public void create(TtTmpStockDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtTmpStock.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain)
     */
    public int update(TtTmpStockDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtTmpStock.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public int updateByCondition(TtTmpStockDomain domain, TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtTmpStock.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public int delete(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTmpStock.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTmpStockDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain)
     */
    public int deleteByCondition(TtTmpStockCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTmpStock.DeleteByCondition", criteria);
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
