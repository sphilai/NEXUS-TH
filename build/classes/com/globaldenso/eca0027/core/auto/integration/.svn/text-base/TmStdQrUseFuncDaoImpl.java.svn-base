/*
 * PROJECT：eca0027
 * 
 * TmStdQrUseFunc のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmStdQrUseFuncDomain;


/**
 * TmStdQrUseFunc のDAO実装クラスです。<BR>
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
public class TmStdQrUseFuncDaoImpl extends SqlMapClientDaoSupport implements TmStdQrUseFuncDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmStdQrUseFuncDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public TmStdQrUseFuncDomain searchByKey(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrUseFuncDomain)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrUseFunc.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmStdQrUseFuncDomain> searchByCondition(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return (List<TmStdQrUseFuncDomain>)getSqlMapClientTemplate()
                    .queryForList("TmStdQrUseFunc.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmStdQrUseFuncDomain> searchByConditionForPaging(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return (List<TmStdQrUseFuncDomain>)getSqlMapClientTemplate()
                    .queryForList("TmStdQrUseFunc.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public int searchCount(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrUseFunc.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public TmStdQrUseFuncDomain searchByKeyForChange(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrUseFuncDomain)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrUseFunc.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public TmStdQrUseFuncDomain lockByKey(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrUseFuncDomain)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrUseFunc.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public TmStdQrUseFuncDomain lockByKeyNoWait(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrUseFuncDomain)getSqlMapClientTemplate()
                .queryForObject("TmStdQrUseFunc.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrUseFuncDomain)
     */
    public void create(TmStdQrUseFuncDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmStdQrUseFunc.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrUseFuncDomain)
     */
    public int update(TmStdQrUseFuncDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmStdQrUseFunc.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrUseFuncDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public int updateByCondition(TmStdQrUseFuncDomain domain, TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmStdQrUseFunc.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public int delete(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmStdQrUseFunc.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrUseFuncDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrUseFuncCriteriaDomain)
     */
    public int deleteByCondition(TmStdQrUseFuncCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmStdQrUseFunc.DeleteByCondition", criteria);
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
