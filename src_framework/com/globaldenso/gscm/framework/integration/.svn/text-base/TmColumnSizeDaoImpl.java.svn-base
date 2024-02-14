/*
 * PROJECT：GSCM 共通機能群
 * 
 * TmColumnSize のDAO実装クラス
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

import com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain;


/**
 * TmColumnSize のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 15:46:53<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public class TmColumnSizeDaoImpl extends SqlMapClientDaoSupport implements TmColumnSizeDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmColumnSizeDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public TmColumnSizeDomain searchByKey(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return (TmColumnSizeDomain)getSqlMapClientTemplate()
                    .queryForObject("TmColumnSize.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmColumnSizeDomain> searchByCondition(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return (List<TmColumnSizeDomain>)getSqlMapClientTemplate()
                    .queryForList("TmColumnSize.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmColumnSizeDomain> searchByConditionForPaging(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return (List<TmColumnSizeDomain>)getSqlMapClientTemplate()
                    .queryForList("TmColumnSize.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public int searchCount(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmColumnSize.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public TmColumnSizeDomain searchByKeyForChange(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return (TmColumnSizeDomain)getSqlMapClientTemplate()
                    .queryForObject("TmColumnSize.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public TmColumnSizeDomain lockByKey(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return (TmColumnSizeDomain)getSqlMapClientTemplate()
                    .queryForObject("TmColumnSize.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public TmColumnSizeDomain lockByKeyNoWait(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return (TmColumnSizeDomain)getSqlMapClientTemplate()
                .queryForObject("TmColumnSize.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#create(com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain)
     */
    public void create(TmColumnSizeDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmColumnSize.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#update(com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain)
     */
    public int update(TmColumnSizeDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmColumnSize.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#updateByCondition(com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain, com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public int updateByCondition(TmColumnSizeDomain domain, TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmColumnSize.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#delete(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public int delete(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmColumnSize.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmColumnSizeDao#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain)
     */
    public int deleteByCondition(TmColumnSizeCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmColumnSize.DeleteByCondition", criteria);
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
