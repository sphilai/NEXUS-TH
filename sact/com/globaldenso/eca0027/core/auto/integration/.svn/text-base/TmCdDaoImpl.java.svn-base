/*
 * PROJECT：eca0027
 * 
 * TmCd のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmCdDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain;


/**
 * TmCd のDAO実装クラスです。<BR>
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
public class TmCdDaoImpl extends SqlMapClientDaoSupport implements TmCdDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCdDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public TmCdDomain searchByKey(TmCdCriteriaDomain criteria) throws ApplicationException {
        return (TmCdDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCd.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCdDomain> searchByCondition(TmCdCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCdDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCd.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCdDomain> searchByConditionForPaging(TmCdCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCdDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCd.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public int searchCount(TmCdCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCd.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public TmCdDomain searchByKeyForChange(TmCdCriteriaDomain criteria) throws ApplicationException {
        return (TmCdDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCd.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public TmCdDomain lockByKey(TmCdCriteriaDomain criteria) throws ApplicationException {
        return (TmCdDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCd.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public TmCdDomain lockByKeyNoWait(TmCdCriteriaDomain criteria) throws ApplicationException {
        return (TmCdDomain)getSqlMapClientTemplate()
                .queryForObject("TmCd.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain)
     */
    public void create(TmCdDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCd.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain)
     */
    public int update(TmCdDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCd.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public int updateByCondition(TmCdDomain domain, TmCdCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCd.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public int delete(TmCdCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCd.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCdDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain)
     */
    public int deleteByCondition(TmCdCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCd.DeleteByCondition", criteria);
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
