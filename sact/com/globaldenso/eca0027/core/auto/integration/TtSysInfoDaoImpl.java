/*
 * PROJECT：eca0027
 * 
 * TtSysInfo のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoDomain;


/**
 * TtSysInfo のDAO実装クラスです。<BR>
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
public class TtSysInfoDaoImpl extends SqlMapClientDaoSupport implements TtSysInfoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtSysInfoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public TtSysInfoDomain searchByKey(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return (TtSysInfoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtSysInfo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtSysInfoDomain> searchByCondition(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtSysInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtSysInfo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtSysInfoDomain> searchByConditionForPaging(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtSysInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtSysInfo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public int searchCount(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtSysInfo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public TtSysInfoDomain searchByKeyForChange(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return (TtSysInfoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtSysInfo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public TtSysInfoDomain lockByKey(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return (TtSysInfoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtSysInfo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public TtSysInfoDomain lockByKeyNoWait(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return (TtSysInfoDomain)getSqlMapClientTemplate()
                .queryForObject("TtSysInfo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoDomain)
     */
    public void create(TtSysInfoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtSysInfo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoDomain)
     */
    public int update(TtSysInfoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtSysInfo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtSysInfoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public int updateByCondition(TtSysInfoDomain domain, TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtSysInfo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public int delete(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtSysInfo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtSysInfoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtSysInfoCriteriaDomain)
     */
    public int deleteByCondition(TtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtSysInfo.DeleteByCondition", criteria);
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
