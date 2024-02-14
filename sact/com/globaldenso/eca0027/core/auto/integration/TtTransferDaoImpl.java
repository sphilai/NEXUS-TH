/*
 * PROJECT：eca0027
 * 
 * TtTransfer のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;


/**
 * TtTransfer のDAO実装クラスです。<BR>
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
public class TtTransferDaoImpl extends SqlMapClientDaoSupport implements TtTransferDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public TtTransferDomain searchByKey(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransfer.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferDomain> searchByCondition(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransfer.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferDomain> searchByConditionForPaging(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransfer.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int searchCount(TtTransferCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtTransfer.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public TtTransferDomain searchByKeyForChange(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransfer.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public TtTransferDomain lockByKey(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransfer.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public TtTransferDomain lockByKeyNoWait(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferDomain)getSqlMapClientTemplate()
                .queryForObject("TtTransfer.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain)
     */
    public void create(TtTransferDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtTransfer.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain)
     */
    public int update(TtTransferDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtTransfer.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int updateByCondition(TtTransferDomain domain, TtTransferCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtTransfer.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int delete(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransfer.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int deleteByCondition(TtTransferCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransfer.DeleteByCondition", criteria);
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
