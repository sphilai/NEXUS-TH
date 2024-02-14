/*
 * PROJECT：GSCM 共通機能群
 * 
 * TmUser のDAO実装クラス
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

import com.globaldenso.gscm.framework.business.dao.TmUserDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;


/**
 * TmUser のDAO実装クラスです。<BR>
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
public class TmUserDaoImpl extends SqlMapClientDaoSupport implements TmUserDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmUserDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public TmUserDomain searchByKey(TmUserCriteriaDomain criteria) throws ApplicationException {
        return (TmUserDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTmUser.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmUserDomain> searchByCondition(TmUserCriteriaDomain criteria) throws ApplicationException {
        return (List<TmUserDomain>)getSqlMapClientTemplate()
                    .queryForList("GscmTmUser.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmUserDomain> searchByConditionForPaging(TmUserCriteriaDomain criteria) throws ApplicationException {
        return (List<TmUserDomain>)getSqlMapClientTemplate()
                    .queryForList("GscmTmUser.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public int searchCount(TmUserCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("GscmTmUser.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public TmUserDomain searchByKeyForChange(TmUserCriteriaDomain criteria) throws ApplicationException {
        return (TmUserDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTmUser.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public TmUserDomain lockByKey(TmUserCriteriaDomain criteria) throws ApplicationException {
        return (TmUserDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTmUser.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public TmUserDomain lockByKeyNoWait(TmUserCriteriaDomain criteria) throws ApplicationException {
        return (TmUserDomain)getSqlMapClientTemplate()
                .queryForObject("GscmTmUser.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#create(com.globaldenso.gscm.framework.business.domain.TmUserDomain)
     */
    public void create(TmUserDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("GscmTmUser.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#update(com.globaldenso.gscm.framework.business.domain.TmUserDomain)
     */
    public int update(TmUserDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("GscmTmUser.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#updateByCondition(com.globaldenso.gscm.framework.business.domain.TmUserDomain, com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public int updateByCondition(TmUserDomain domain, TmUserCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("GscmTmUser.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#delete(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public int delete(TmUserCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("GscmTmUser.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmUserDao#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain)
     */
    public int deleteByCondition(TmUserCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("GscmTmUser.DeleteByCondition", criteria);
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
