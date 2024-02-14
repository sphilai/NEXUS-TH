/*
 * PROJECT：eca0027
 * 
 * TwMixtagRt のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain;


/**
 * TwMixtagRt のDAO実装クラスです。<BR>
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
public class TwMixtagRtDaoImpl extends SqlMapClientDaoSupport implements TwMixtagRtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwMixtagRtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public TwMixtagRtDomain searchByKey(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (TwMixtagRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TwMixtagRt.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwMixtagRtDomain> searchByCondition(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TwMixtagRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TwMixtagRt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwMixtagRtDomain> searchByConditionForPaging(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TwMixtagRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TwMixtagRt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public int searchCount(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwMixtagRt.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public TwMixtagRtDomain searchByKeyForChange(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (TwMixtagRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TwMixtagRt.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public TwMixtagRtDomain lockByKey(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (TwMixtagRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TwMixtagRt.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public TwMixtagRtDomain lockByKeyNoWait(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return (TwMixtagRtDomain)getSqlMapClientTemplate()
                .queryForObject("TwMixtagRt.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain)
     */
    public void create(TwMixtagRtDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwMixtagRt.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain)
     */
    public int update(TwMixtagRtDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwMixtagRt.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public int updateByCondition(TwMixtagRtDomain domain, TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwMixtagRt.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public int delete(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwMixtagRt.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagRtDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain)
     */
    public int deleteByCondition(TwMixtagRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwMixtagRt.DeleteByCondition", criteria);
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
