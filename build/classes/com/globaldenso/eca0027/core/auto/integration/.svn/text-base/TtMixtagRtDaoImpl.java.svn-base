/*
 * PROJECT：eca0027
 * 
 * TtMixtagRt のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain;


/**
 * TtMixtagRt のDAO実装クラスです。<BR>
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
public class TtMixtagRtDaoImpl extends SqlMapClientDaoSupport implements TtMixtagRtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixtagRtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public TtMixtagRtDomain searchByKey(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagRt.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixtagRtDomain> searchByCondition(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixtagRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixtagRt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixtagRtDomain> searchByConditionForPaging(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixtagRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixtagRt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public int searchCount(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagRt.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public TtMixtagRtDomain searchByKeyForChange(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagRt.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public TtMixtagRtDomain lockByKey(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagRt.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public TtMixtagRtDomain lockByKeyNoWait(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagRtDomain)getSqlMapClientTemplate()
                .queryForObject("TtMixtagRt.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain)
     */
    public void create(TtMixtagRtDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtMixtagRt.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain)
     */
    public int update(TtMixtagRtDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtMixtagRt.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public int updateByCondition(TtMixtagRtDomain domain, TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtMixtagRt.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public int delete(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixtagRt.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagRtDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain)
     */
    public int deleteByCondition(TtMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixtagRt.DeleteByCondition", criteria);
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
