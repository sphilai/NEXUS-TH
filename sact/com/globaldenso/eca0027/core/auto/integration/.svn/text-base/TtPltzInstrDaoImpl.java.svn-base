/*
 * PROJECT：eca0027
 * 
 * TtPltzInstr のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;


/**
 * TtPltzInstr のDAO実装クラスです。<BR>
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
public class TtPltzInstrDaoImpl extends SqlMapClientDaoSupport implements TtPltzInstrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzInstrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public TtPltzInstrDomain searchByKey(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzInstrDomain> searchByCondition(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzInstr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzInstrDomain> searchByConditionForPaging(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzInstr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public int searchCount(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public TtPltzInstrDomain searchByKeyForChange(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public TtPltzInstrDomain lockByKey(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public TtPltzInstrDomain lockByKeyNoWait(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrDomain)getSqlMapClientTemplate()
                .queryForObject("TtPltzInstr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain)
     */
    public void create(TtPltzInstrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPltzInstr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain)
     */
    public int update(TtPltzInstrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPltzInstr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public int updateByCondition(TtPltzInstrDomain domain, TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPltzInstr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public int delete(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzInstr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain)
     */
    public int deleteByCondition(TtPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzInstr.DeleteByCondition", criteria);
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
