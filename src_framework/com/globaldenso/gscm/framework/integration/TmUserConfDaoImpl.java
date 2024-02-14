/*
 * PROJECT：GSCM 共通機能群
 * 
 * TmUserConf のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.gscm.framework.business.dao.TmUserConfDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;


/**
 * TmUserConf のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 17:23:18<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public class TmUserConfDaoImpl extends SqlMapClientDaoSupport implements TmUserConfDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmUserConfDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public TmUserConfDomain searchByKey(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return (TmUserConfDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTmUserConf.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmUserConfDomain> searchByCondition(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return (List<TmUserConfDomain>)getSqlMapClientTemplate()
                    .queryForList("GscmTmUserConf.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmUserConfDomain> searchByConditionForPaging(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return (List<TmUserConfDomain>)getSqlMapClientTemplate()
                    .queryForList("GscmTmUserConf.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public int searchCount(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("GscmTmUserConf.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public TmUserConfDomain searchByKeyForChange(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return (TmUserConfDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTmUserConf.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public TmUserConfDomain lockByKey(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return (TmUserConfDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTmUserConf.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public TmUserConfDomain lockByKeyNoWait(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return (TmUserConfDomain)getSqlMapClientTemplate()
                .queryForObject("GscmTmUserConf.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#create(com.globaldenso.gscm.framework.business.domain.TmUserConfDomain)
     */
    public void create(TmUserConfDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("GscmTmUserConf.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#update(com.globaldenso.gscm.framework.business.domain.TmUserConfDomain)
     */
    public int update(TmUserConfDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("GscmTmUserConf.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#updateByCondition(com.globaldenso.gscm.framework.business.domain.TmUserConfDomain, com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public int updateByCondition(TmUserConfDomain domain, TmUserConfCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("GscmTmUserConf.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#delete(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public int delete(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("GscmTmUserConf.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserConfDao#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain)
     */
    public int deleteByCondition(TmUserConfCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("GscmTmUserConf.DeleteByCondition", criteria);
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
