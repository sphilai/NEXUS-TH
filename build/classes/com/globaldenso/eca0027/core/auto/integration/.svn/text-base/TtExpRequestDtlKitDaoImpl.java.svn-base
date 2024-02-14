/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtlKit のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain;


/**
 * TtExpRequestDtlKit のDAO実装クラスです。<BR>
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
public class TtExpRequestDtlKitDaoImpl extends SqlMapClientDaoSupport implements TtExpRequestDtlKitDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestDtlKitDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public TtExpRequestDtlKitDomain searchByKey(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlKitDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtlKit.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDtlKitDomain> searchByCondition(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDtlKitDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequestDtlKit.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDtlKitDomain> searchByConditionForPaging(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDtlKitDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequestDtlKit.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public int searchCount(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtlKit.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public TtExpRequestDtlKitDomain searchByKeyForChange(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlKitDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtlKit.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public TtExpRequestDtlKitDomain lockByKey(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlKitDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtlKit.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public TtExpRequestDtlKitDomain lockByKeyNoWait(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlKitDomain)getSqlMapClientTemplate()
                .queryForObject("TtExpRequestDtlKit.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain)
     */
    public void create(TtExpRequestDtlKitDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtExpRequestDtlKit.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain)
     */
    public int update(TtExpRequestDtlKitDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtExpRequestDtlKit.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestDtlKitDomain domain, TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtExpRequestDtlKit.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public int delete(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequestDtlKit.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlKitDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequestDtlKit.DeleteByCondition", criteria);
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
