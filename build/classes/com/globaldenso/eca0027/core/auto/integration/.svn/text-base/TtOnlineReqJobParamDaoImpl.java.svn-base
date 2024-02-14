/*
 * PROJECT：eca0027
 * 
 * TtOnlineReqJobParam のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/07/06  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain;


/**
 * TtOnlineReqJobParam のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/07/06 18:42:21<BR>
 * 
 * テーブル定義から2016/07/06に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13160 $
 */
public class TtOnlineReqJobParamDaoImpl extends SqlMapClientDaoSupport implements TtOnlineReqJobParamDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtOnlineReqJobParamDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public TtOnlineReqJobParamDomain searchByKey(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return (TtOnlineReqJobParamDomain)getSqlMapClientTemplate()
                    .queryForObject("TtOnlineReqJobParam.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtOnlineReqJobParamDomain> searchByCondition(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return (List<TtOnlineReqJobParamDomain>)getSqlMapClientTemplate()
                    .queryForList("TtOnlineReqJobParam.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtOnlineReqJobParamDomain> searchByConditionForPaging(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return (List<TtOnlineReqJobParamDomain>)getSqlMapClientTemplate()
                    .queryForList("TtOnlineReqJobParam.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public int searchCount(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtOnlineReqJobParam.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public TtOnlineReqJobParamDomain searchByKeyForChange(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return (TtOnlineReqJobParamDomain)getSqlMapClientTemplate()
                    .queryForObject("TtOnlineReqJobParam.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public TtOnlineReqJobParamDomain lockByKey(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return (TtOnlineReqJobParamDomain)getSqlMapClientTemplate()
                    .queryForObject("TtOnlineReqJobParam.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public TtOnlineReqJobParamDomain lockByKeyNoWait(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return (TtOnlineReqJobParamDomain)getSqlMapClientTemplate()
                .queryForObject("TtOnlineReqJobParam.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain)
     */
    public void create(TtOnlineReqJobParamDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtOnlineReqJobParam.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain)
     */
    public int update(TtOnlineReqJobParamDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtOnlineReqJobParam.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public int updateByCondition(TtOnlineReqJobParamDomain domain, TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtOnlineReqJobParam.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public int delete(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtOnlineReqJobParam.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOnlineReqJobParamDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain)
     */
    public int deleteByCondition(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtOnlineReqJobParam.DeleteByCondition", criteria);
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
