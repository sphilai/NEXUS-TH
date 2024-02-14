/*
 * PROJECT：GSCM 共通機能群
 * 
 * TtWorkDate のDAO実装クラス
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

import com.globaldenso.gscm.framework.business.dao.TtWorkDateDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain;


/**
 * TtWorkDate のDAO実装クラスです。<BR>
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
public class TtWorkDateDaoImpl extends SqlMapClientDaoSupport implements TtWorkDateDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtWorkDateDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public TtWorkDateDomain searchByKey(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return (TtWorkDateDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTtWorkDate.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtWorkDateDomain> searchByCondition(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return (List<TtWorkDateDomain>)getSqlMapClientTemplate()
                    .queryForList("GscmTtWorkDate.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtWorkDateDomain> searchByConditionForPaging(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return (List<TtWorkDateDomain>)getSqlMapClientTemplate()
                    .queryForList("GscmTtWorkDate.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public int searchCount(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("GscmTtWorkDate.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public TtWorkDateDomain searchByKeyForChange(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return (TtWorkDateDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTtWorkDate.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public TtWorkDateDomain lockByKey(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return (TtWorkDateDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTtWorkDate.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public TtWorkDateDomain lockByKeyNoWait(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return (TtWorkDateDomain)getSqlMapClientTemplate()
                .queryForObject("GscmTtWorkDate.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#create(com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain)
     */
    public void create(TtWorkDateDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("GscmTtWorkDate.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#update(com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain)
     */
    public int update(TtWorkDateDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("GscmTtWorkDate.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#updateByCondition(com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain, com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public int updateByCondition(TtWorkDateDomain domain, TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("GscmTtWorkDate.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#delete(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public int delete(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("GscmTtWorkDate.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TtWorkDateDao#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain)
     */
    public int deleteByCondition(TtWorkDateCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("GscmTtWorkDate.DeleteByCondition", criteria);
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
