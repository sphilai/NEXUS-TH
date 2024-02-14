/*
 * PROJECT：eca0027
 * 
 * TmPrinterPurpose のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterPurposeDomain;


/**
 * TmPrinterPurpose のDAO実装クラスです。<BR>
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
public class TmPrinterPurposeDaoImpl extends SqlMapClientDaoSupport implements TmPrinterPurposeDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPrinterPurposeDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public TmPrinterPurposeDomain searchByKey(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return (TmPrinterPurposeDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPrinterPurpose.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPrinterPurposeDomain> searchByCondition(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPrinterPurposeDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPrinterPurpose.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPrinterPurposeDomain> searchByConditionForPaging(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPrinterPurposeDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPrinterPurpose.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public int searchCount(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPrinterPurpose.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public TmPrinterPurposeDomain searchByKeyForChange(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return (TmPrinterPurposeDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPrinterPurpose.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public TmPrinterPurposeDomain lockByKey(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return (TmPrinterPurposeDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPrinterPurpose.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public TmPrinterPurposeDomain lockByKeyNoWait(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return (TmPrinterPurposeDomain)getSqlMapClientTemplate()
                .queryForObject("TmPrinterPurpose.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterPurposeDomain)
     */
    public void create(TmPrinterPurposeDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmPrinterPurpose.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterPurposeDomain)
     */
    public int update(TmPrinterPurposeDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmPrinterPurpose.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterPurposeDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public int updateByCondition(TmPrinterPurposeDomain domain, TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmPrinterPurpose.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public int delete(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPrinterPurpose.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterPurposeDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain)
     */
    public int deleteByCondition(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPrinterPurpose.DeleteByCondition", criteria);
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
