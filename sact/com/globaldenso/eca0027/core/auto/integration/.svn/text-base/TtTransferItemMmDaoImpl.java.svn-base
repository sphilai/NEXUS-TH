/*
 * PROJECT：eca0027
 * 
 * TtTransferItemMm のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemMmDomain;


/**
 * TtTransferItemMm のDAO実装クラスです。<BR>
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
public class TtTransferItemMmDaoImpl extends SqlMapClientDaoSupport implements TtTransferItemMmDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferItemMmDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public TtTransferItemMmDomain searchByKey(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemMmDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemMm.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferItemMmDomain> searchByCondition(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferItemMmDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransferItemMm.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferItemMmDomain> searchByConditionForPaging(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferItemMmDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransferItemMm.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public int searchCount(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemMm.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public TtTransferItemMmDomain searchByKeyForChange(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemMmDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemMm.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public TtTransferItemMmDomain lockByKey(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemMmDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemMm.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public TtTransferItemMmDomain lockByKeyNoWait(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemMmDomain)getSqlMapClientTemplate()
                .queryForObject("TtTransferItemMm.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemMmDomain)
     */
    public void create(TtTransferItemMmDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtTransferItemMm.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemMmDomain)
     */
    public int update(TtTransferItemMmDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtTransferItemMm.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemMmDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public int updateByCondition(TtTransferItemMmDomain domain, TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtTransferItemMm.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public int delete(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransferItemMm.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemMmDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemMmCriteriaDomain)
     */
    public int deleteByCondition(TtTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransferItemMm.DeleteByCondition", criteria);
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
