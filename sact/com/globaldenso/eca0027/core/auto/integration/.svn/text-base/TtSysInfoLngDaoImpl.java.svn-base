/*
 * PROJECT：eca0027
 * 
 * TtSysInfoLng のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoLngDomain;


/**
 * TtSysInfoLng のDAO実装クラスです。<BR>
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
public class TtSysInfoLngDaoImpl extends SqlMapClientDaoSupport implements TtSysInfoLngDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtSysInfoLngDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public TtSysInfoLngDomain searchByKey(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return (TtSysInfoLngDomain)getSqlMapClientTemplate()
                    .queryForObject("TtSysInfoLng.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtSysInfoLngDomain> searchByCondition(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return (List<TtSysInfoLngDomain>)getSqlMapClientTemplate()
                    .queryForList("TtSysInfoLng.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtSysInfoLngDomain> searchByConditionForPaging(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return (List<TtSysInfoLngDomain>)getSqlMapClientTemplate()
                    .queryForList("TtSysInfoLng.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public int searchCount(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtSysInfoLng.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public TtSysInfoLngDomain searchByKeyForChange(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return (TtSysInfoLngDomain)getSqlMapClientTemplate()
                    .queryForObject("TtSysInfoLng.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public TtSysInfoLngDomain lockByKey(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return (TtSysInfoLngDomain)getSqlMapClientTemplate()
                    .queryForObject("TtSysInfoLng.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public TtSysInfoLngDomain lockByKeyNoWait(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return (TtSysInfoLngDomain)getSqlMapClientTemplate()
                .queryForObject("TtSysInfoLng.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoLngDomain)
     */
    public void create(TtSysInfoLngDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtSysInfoLng.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoLngDomain)
     */
    public int update(TtSysInfoLngDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtSysInfoLng.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoLngDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public int updateByCondition(TtSysInfoLngDomain domain, TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtSysInfoLng.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public int delete(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtSysInfoLng.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoLngDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoLngCriteriaDomain)
     */
    public int deleteByCondition(TtSysInfoLngCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtSysInfoLng.DeleteByCondition", criteria);
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
