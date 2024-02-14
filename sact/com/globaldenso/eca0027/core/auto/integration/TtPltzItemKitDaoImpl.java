/*
 * PROJECT：eca0027
 * 
 * TtPltzItemKit のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemKitDomain;


/**
 * TtPltzItemKit のDAO実装クラスです。<BR>
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
public class TtPltzItemKitDaoImpl extends SqlMapClientDaoSupport implements TtPltzItemKitDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzItemKitDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public TtPltzItemKitDomain searchByKey(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemKitDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItemKit.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzItemKitDomain> searchByCondition(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzItemKitDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzItemKit.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzItemKitDomain> searchByConditionForPaging(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzItemKitDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzItemKit.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public int searchCount(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItemKit.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public TtPltzItemKitDomain searchByKeyForChange(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemKitDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItemKit.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public TtPltzItemKitDomain lockByKey(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemKitDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItemKit.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public TtPltzItemKitDomain lockByKeyNoWait(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemKitDomain)getSqlMapClientTemplate()
                .queryForObject("TtPltzItemKit.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemKitDomain)
     */
    public void create(TtPltzItemKitDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPltzItemKit.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemKitDomain)
     */
    public int update(TtPltzItemKitDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPltzItemKit.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemKitDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public int updateByCondition(TtPltzItemKitDomain domain, TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPltzItemKit.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public int delete(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzItemKit.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemKitDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemKitCriteriaDomain)
     */
    public int deleteByCondition(TtPltzItemKitCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzItemKit.DeleteByCondition", criteria);
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
