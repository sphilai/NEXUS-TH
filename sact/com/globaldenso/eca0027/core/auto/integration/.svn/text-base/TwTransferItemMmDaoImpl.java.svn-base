/*
 * PROJECT：eca0027
 * 
 * TwTransferItemMm のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemMmDomain;


/**
 * TwTransferItemMm のDAO実装クラスです。<BR>
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
public class TwTransferItemMmDaoImpl extends SqlMapClientDaoSupport implements TwTransferItemMmDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwTransferItemMmDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public TwTransferItemMmDomain searchByKey(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemMmDomain)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemMm.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwTransferItemMmDomain> searchByCondition(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (List<TwTransferItemMmDomain>)getSqlMapClientTemplate()
                    .queryForList("TwTransferItemMm.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwTransferItemMmDomain> searchByConditionForPaging(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (List<TwTransferItemMmDomain>)getSqlMapClientTemplate()
                    .queryForList("TwTransferItemMm.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public int searchCount(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemMm.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public TwTransferItemMmDomain searchByKeyForChange(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemMmDomain)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemMm.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public TwTransferItemMmDomain lockByKey(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemMmDomain)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemMm.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public TwTransferItemMmDomain lockByKeyNoWait(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemMmDomain)getSqlMapClientTemplate()
                .queryForObject("TwTransferItemMm.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemMmDomain)
     */
    public void create(TwTransferItemMmDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwTransferItemMm.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemMmDomain)
     */
    public int update(TwTransferItemMmDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwTransferItemMm.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemMmDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public int updateByCondition(TwTransferItemMmDomain domain, TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwTransferItemMm.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public int delete(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwTransferItemMm.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemMmDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemMmCriteriaDomain)
     */
    public int deleteByCondition(TwTransferItemMmCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwTransferItemMm.DeleteByCondition", criteria);
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
