/*
 * PROJECT：eca0027
 * 
 * TwStgInstr のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain;


/**
 * TwStgInstr のDAO実装クラスです。<BR>
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
public class TwStgInstrDaoImpl extends SqlMapClientDaoSupport implements TwStgInstrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwStgInstrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public TwStgInstrDomain searchByKey(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (TwStgInstrDomain)getSqlMapClientTemplate()
                    .queryForObject("TwStgInstr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwStgInstrDomain> searchByCondition(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<TwStgInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("TwStgInstr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwStgInstrDomain> searchByConditionForPaging(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<TwStgInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("TwStgInstr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public int searchCount(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwStgInstr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public TwStgInstrDomain searchByKeyForChange(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (TwStgInstrDomain)getSqlMapClientTemplate()
                    .queryForObject("TwStgInstr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public TwStgInstrDomain lockByKey(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (TwStgInstrDomain)getSqlMapClientTemplate()
                    .queryForObject("TwStgInstr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public TwStgInstrDomain lockByKeyNoWait(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (TwStgInstrDomain)getSqlMapClientTemplate()
                .queryForObject("TwStgInstr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain)
     */
    public void create(TwStgInstrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwStgInstr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain)
     */
    public int update(TwStgInstrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwStgInstr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public int updateByCondition(TwStgInstrDomain domain, TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwStgInstr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public int delete(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwStgInstr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgInstrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain)
     */
    public int deleteByCondition(TwStgInstrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwStgInstr.DeleteByCondition", criteria);
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
