/*
 * PROJECT：eca0027
 * 
 * TmCigmaEnv のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/08/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;


/**
 * TmCigmaEnv のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/04 15:39:57<BR>
 * 
 * テーブル定義から2014/08/04に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TmCigmaEnvDaoImpl extends SqlMapClientDaoSupport implements TmCigmaEnvDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCigmaEnvDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public TmCigmaEnvDomain searchByKey(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaEnvDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaEnv.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCigmaEnvDomain> searchByCondition(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCigmaEnvDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCigmaEnv.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCigmaEnvDomain> searchByConditionForPaging(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCigmaEnvDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCigmaEnv.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public int searchCount(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaEnv.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public TmCigmaEnvDomain searchByKeyForChange(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaEnvDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaEnv.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public TmCigmaEnvDomain lockByKey(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaEnvDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaEnv.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public TmCigmaEnvDomain lockByKeyNoWait(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaEnvDomain)getSqlMapClientTemplate()
                .queryForObject("TmCigmaEnv.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain)
     */
    public void create(TmCigmaEnvDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCigmaEnv.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain)
     */
    public int update(TmCigmaEnvDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCigmaEnv.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public int updateByCondition(TmCigmaEnvDomain domain, TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCigmaEnv.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public int delete(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCigmaEnv.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaEnvDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain)
     */
    public int deleteByCondition(TmCigmaEnvCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCigmaEnv.DeleteByCondition", criteria);
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
