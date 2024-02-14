/*
 * PROJECT：eca0027
 * 
 * TtShippingAct のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain;


/**
 * TtShippingAct のDAO実装クラスです。<BR>
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
public class TtShippingActDaoImpl extends SqlMapClientDaoSupport implements TtShippingActDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtShippingActDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public TtShippingActDomain searchByKey(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingActDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingAct.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtShippingActDomain> searchByCondition(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return (List<TtShippingActDomain>)getSqlMapClientTemplate()
                    .queryForList("TtShippingAct.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtShippingActDomain> searchByConditionForPaging(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return (List<TtShippingActDomain>)getSqlMapClientTemplate()
                    .queryForList("TtShippingAct.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public int searchCount(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtShippingAct.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public TtShippingActDomain searchByKeyForChange(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingActDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingAct.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public TtShippingActDomain lockByKey(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingActDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingAct.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public TtShippingActDomain lockByKeyNoWait(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingActDomain)getSqlMapClientTemplate()
                .queryForObject("TtShippingAct.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain)
     */
    public void create(TtShippingActDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtShippingAct.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain)
     */
    public int update(TtShippingActDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtShippingAct.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public int updateByCondition(TtShippingActDomain domain, TtShippingActCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtShippingAct.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public int delete(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtShippingAct.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain)
     */
    public int deleteByCondition(TtShippingActCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtShippingAct.DeleteByCondition", criteria);
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
