/*
 * PROJECT：eca0027
 * 
 * TtScHeader のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain;


/**
 * TtScHeader のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 14:43:17<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TtScHeaderDaoImpl extends SqlMapClientDaoSupport implements TtScHeaderDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtScHeaderDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public TtScHeaderDomain searchByKey(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtScHeaderDomain)getSqlMapClientTemplate()
                    .queryForObject("TtScHeader.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtScHeaderDomain> searchByCondition(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<TtScHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("TtScHeader.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtScHeaderDomain> searchByConditionForPaging(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<TtScHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("TtScHeader.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public int searchCount(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtScHeader.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public TtScHeaderDomain searchByKeyForChange(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtScHeaderDomain)getSqlMapClientTemplate()
                    .queryForObject("TtScHeader.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public TtScHeaderDomain lockByKey(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtScHeaderDomain)getSqlMapClientTemplate()
                    .queryForObject("TtScHeader.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public TtScHeaderDomain lockByKeyNoWait(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtScHeaderDomain)getSqlMapClientTemplate()
                .queryForObject("TtScHeader.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain)
     */
    public void create(TtScHeaderDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtScHeader.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain)
     */
    public int update(TtScHeaderDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtScHeader.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public int updateByCondition(TtScHeaderDomain domain, TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtScHeader.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public int delete(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtScHeader.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScHeaderDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain)
     */
    public int deleteByCondition(TtScHeaderCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtScHeader.DeleteByCondition", criteria);
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
