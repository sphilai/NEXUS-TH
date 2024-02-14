/*
 * PROJECT：eca0027
 * 
 * TtPltzItem のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;


/**
 * TtPltzItem のDAO実装クラスです。<BR>
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
public class TtPltzItemDaoImpl extends SqlMapClientDaoSupport implements TtPltzItemDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzItemDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public TtPltzItemDomain searchByKey(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItem.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzItemDomain> searchByCondition(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzItemDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzItem.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzItemDomain> searchByConditionForPaging(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzItemDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzItem.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public int searchCount(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItem.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public TtPltzItemDomain searchByKeyForChange(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItem.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public TtPltzItemDomain lockByKey(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItem.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public TtPltzItemDomain lockByKeyNoWait(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemDomain)getSqlMapClientTemplate()
                .queryForObject("TtPltzItem.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain)
     */
    public void create(TtPltzItemDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPltzItem.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain)
     */
    public int update(TtPltzItemDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPltzItem.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public int updateByCondition(TtPltzItemDomain domain, TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPltzItem.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public int delete(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzItem.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain)
     */
    public int deleteByCondition(TtPltzItemCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzItem.DeleteByCondition", criteria);
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
