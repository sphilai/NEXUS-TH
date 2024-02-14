/*
 * PROJECT：eca0027
 * 
 * TmMeasureUnit のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/12/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;


/**
 * TmMeasureUnit のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/12/05 16:41:35<BR>
 * 
 * テーブル定義から2014/12/05に自動生成したモジュールです。
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 10146 $
 */
public class TmMeasureUnitDaoImpl extends SqlMapClientDaoSupport implements TmMeasureUnitDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmMeasureUnitDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public TmMeasureUnitDomain searchByKey(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return (TmMeasureUnitDomain)getSqlMapClientTemplate()
                    .queryForObject("TmMeasureUnit.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmMeasureUnitDomain> searchByCondition(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return (List<TmMeasureUnitDomain>)getSqlMapClientTemplate()
                    .queryForList("TmMeasureUnit.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmMeasureUnitDomain> searchByConditionForPaging(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return (List<TmMeasureUnitDomain>)getSqlMapClientTemplate()
                    .queryForList("TmMeasureUnit.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public int searchCount(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmMeasureUnit.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public TmMeasureUnitDomain searchByKeyForChange(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return (TmMeasureUnitDomain)getSqlMapClientTemplate()
                    .queryForObject("TmMeasureUnit.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public TmMeasureUnitDomain lockByKey(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return (TmMeasureUnitDomain)getSqlMapClientTemplate()
                    .queryForObject("TmMeasureUnit.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public TmMeasureUnitDomain lockByKeyNoWait(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return (TmMeasureUnitDomain)getSqlMapClientTemplate()
                .queryForObject("TmMeasureUnit.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain)
     */
    public void create(TmMeasureUnitDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmMeasureUnit.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain)
     */
    public int update(TmMeasureUnitDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmMeasureUnit.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public int updateByCondition(TmMeasureUnitDomain domain, TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmMeasureUnit.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public int delete(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmMeasureUnit.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmMeasureUnitDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain)
     */
    public int deleteByCondition(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmMeasureUnit.DeleteByCondition", criteria);
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
