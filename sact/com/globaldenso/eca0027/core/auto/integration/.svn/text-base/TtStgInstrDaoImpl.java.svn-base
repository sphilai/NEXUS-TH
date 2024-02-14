/*
 * PROJECT：eca0027
 * 
 * TtStgInstr のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain;


/**
 * TtStgInstr のDAO実装クラスです。<BR>
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
public class TtStgInstrDaoImpl extends SqlMapClientDaoSupport implements TtStgInstrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtStgInstrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public TtStgInstrDomain searchByKey(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (TtStgInstrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtStgInstr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtStgInstrDomain> searchByCondition(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtStgInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtStgInstr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtStgInstrDomain> searchByConditionForPaging(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtStgInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtStgInstr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public int searchCount(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtStgInstr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public TtStgInstrDomain searchByKeyForChange(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (TtStgInstrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtStgInstr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public TtStgInstrDomain lockByKey(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (TtStgInstrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtStgInstr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public TtStgInstrDomain lockByKeyNoWait(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (TtStgInstrDomain)getSqlMapClientTemplate()
                .queryForObject("TtStgInstr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain)
     */
    public void create(TtStgInstrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtStgInstr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain)
     */
    public int update(TtStgInstrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtStgInstr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public int updateByCondition(TtStgInstrDomain domain, TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtStgInstr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public int delete(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtStgInstr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgInstrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public int deleteByCondition(TtStgInstrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtStgInstr.DeleteByCondition", criteria);
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
