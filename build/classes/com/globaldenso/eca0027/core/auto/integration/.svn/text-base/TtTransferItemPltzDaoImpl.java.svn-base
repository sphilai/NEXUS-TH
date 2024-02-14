/*
 * PROJECT：eca0027
 * 
 * TtTransferItemPltz のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain;


/**
 * TtTransferItemPltz のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TtTransferItemPltzDaoImpl extends SqlMapClientDaoSupport implements TtTransferItemPltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferItemPltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public TtTransferItemPltzDomain searchByKey(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemPltz.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferItemPltzDomain> searchByCondition(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferItemPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransferItemPltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferItemPltzDomain> searchByConditionForPaging(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferItemPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransferItemPltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public int searchCount(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemPltz.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public TtTransferItemPltzDomain searchByKeyForChange(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemPltz.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public TtTransferItemPltzDomain lockByKey(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemPltz.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public TtTransferItemPltzDomain lockByKeyNoWait(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemPltzDomain)getSqlMapClientTemplate()
                .queryForObject("TtTransferItemPltz.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain)
     */
    public void create(TtTransferItemPltzDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtTransferItemPltz.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain)
     */
    public int update(TtTransferItemPltzDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtTransferItemPltz.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public int updateByCondition(TtTransferItemPltzDomain domain, TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtTransferItemPltz.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public int delete(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransferItemPltz.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemPltzDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain)
     */
    public int deleteByCondition(TtTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransferItemPltz.DeleteByCondition", criteria);
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
