/*
 * PROJECT：eca0027
 * 
 * TmSupplierWhXref のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/04/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain;


/**
 * TmSupplierWhXref のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/04/11 17:40:10<BR>
 * 
 * テーブル定義から2016/04/11に自動生成したモジュールです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 13073 $
 */
public class TmSupplierWhXrefDaoImpl extends SqlMapClientDaoSupport implements TmSupplierWhXrefDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmSupplierWhXrefDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public TmSupplierWhXrefDomain searchByKey(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmSupplierWhXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmSupplierWhXref.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmSupplierWhXrefDomain> searchByCondition(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmSupplierWhXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmSupplierWhXref.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmSupplierWhXrefDomain> searchByConditionForPaging(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmSupplierWhXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmSupplierWhXref.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public int searchCount(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmSupplierWhXref.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public TmSupplierWhXrefDomain searchByKeyForChange(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmSupplierWhXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmSupplierWhXref.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public TmSupplierWhXrefDomain lockByKey(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmSupplierWhXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmSupplierWhXref.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public TmSupplierWhXrefDomain lockByKeyNoWait(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmSupplierWhXrefDomain)getSqlMapClientTemplate()
                .queryForObject("TmSupplierWhXref.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain)
     */
    public void create(TmSupplierWhXrefDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmSupplierWhXref.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain)
     */
    public int update(TmSupplierWhXrefDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmSupplierWhXref.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public int updateByCondition(TmSupplierWhXrefDomain domain, TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmSupplierWhXref.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public int delete(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmSupplierWhXref.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSupplierWhXrefDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     */
    public int deleteByCondition(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmSupplierWhXref.DeleteByCondition", criteria);
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
