/*
 * PROJECT：eca0027
 * 
 * TmInvAmountChk のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/16  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain;


/**
 * TmInvAmountChk のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/16 10:50:51<BR>
 * 
 * テーブル定義から2014/04/16に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmInvAmountChkDaoImpl extends SqlMapClientDaoSupport implements TmInvAmountChkDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvAmountChkDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public TmInvAmountChkDomain searchByKey(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return (TmInvAmountChkDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvAmountChk.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvAmountChkDomain> searchByCondition(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvAmountChkDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvAmountChk.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvAmountChkDomain> searchByConditionForPaging(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvAmountChkDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvAmountChk.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public int searchCount(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmInvAmountChk.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public TmInvAmountChkDomain searchByKeyForChange(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return (TmInvAmountChkDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvAmountChk.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public TmInvAmountChkDomain lockByKey(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return (TmInvAmountChkDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvAmountChk.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public TmInvAmountChkDomain lockByKeyNoWait(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return (TmInvAmountChkDomain)getSqlMapClientTemplate()
                .queryForObject("TmInvAmountChk.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain)
     */
    public void create(TmInvAmountChkDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmInvAmountChk.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain)
     */
    public int update(TmInvAmountChkDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmInvAmountChk.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public int updateByCondition(TmInvAmountChkDomain domain, TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmInvAmountChk.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public int delete(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvAmountChk.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvAmountChkDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain)
     */
    public int deleteByCondition(TmInvAmountChkCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvAmountChk.DeleteByCondition", criteria);
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
