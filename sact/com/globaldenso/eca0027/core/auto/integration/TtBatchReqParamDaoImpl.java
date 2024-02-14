/*
 * PROJECT：eca0027
 * 
 * TtBatchReqParam のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain;


/**
 * TtBatchReqParam のDAO実装クラスです。<BR>
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
public class TtBatchReqParamDaoImpl extends SqlMapClientDaoSupport implements TtBatchReqParamDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtBatchReqParamDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public TtBatchReqParamDomain searchByKey(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return (TtBatchReqParamDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBatchReqParam.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBatchReqParamDomain> searchByCondition(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBatchReqParamDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBatchReqParam.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBatchReqParamDomain> searchByConditionForPaging(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBatchReqParamDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBatchReqParam.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public int searchCount(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtBatchReqParam.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public TtBatchReqParamDomain searchByKeyForChange(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return (TtBatchReqParamDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBatchReqParam.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public TtBatchReqParamDomain lockByKey(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return (TtBatchReqParamDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBatchReqParam.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public TtBatchReqParamDomain lockByKeyNoWait(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return (TtBatchReqParamDomain)getSqlMapClientTemplate()
                .queryForObject("TtBatchReqParam.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain)
     */
    public void create(TtBatchReqParamDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtBatchReqParam.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain)
     */
    public int update(TtBatchReqParamDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtBatchReqParam.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public int updateByCondition(TtBatchReqParamDomain domain, TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtBatchReqParam.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public int delete(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBatchReqParam.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBatchReqParamDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain)
     */
    public int deleteByCondition(TtBatchReqParamCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBatchReqParam.DeleteByCondition", criteria);
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
