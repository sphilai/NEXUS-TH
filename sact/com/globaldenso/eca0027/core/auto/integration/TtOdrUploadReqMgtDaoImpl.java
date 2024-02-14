/*
 * PROJECT：eca0027
 * 
 * TtOdrUploadReqMgt のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/26  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain;


/**
 * TtOdrUploadReqMgt のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/01/26 19:15:00<BR>
 * 
 * テーブル定義から2017/01/26に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13533 $
 */
public class TtOdrUploadReqMgtDaoImpl extends SqlMapClientDaoSupport implements TtOdrUploadReqMgtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtOdrUploadReqMgtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public TtOdrUploadReqMgtDomain searchByKey(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return (TtOdrUploadReqMgtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtOdrUploadReqMgt.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtOdrUploadReqMgtDomain> searchByCondition(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtOdrUploadReqMgtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtOdrUploadReqMgt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtOdrUploadReqMgtDomain> searchByConditionForPaging(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtOdrUploadReqMgtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtOdrUploadReqMgt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public int searchCount(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtOdrUploadReqMgt.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public TtOdrUploadReqMgtDomain searchByKeyForChange(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return (TtOdrUploadReqMgtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtOdrUploadReqMgt.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public TtOdrUploadReqMgtDomain lockByKey(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return (TtOdrUploadReqMgtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtOdrUploadReqMgt.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public TtOdrUploadReqMgtDomain lockByKeyNoWait(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return (TtOdrUploadReqMgtDomain)getSqlMapClientTemplate()
                .queryForObject("TtOdrUploadReqMgt.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain)
     */
    public void create(TtOdrUploadReqMgtDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtOdrUploadReqMgt.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain)
     */
    public int update(TtOdrUploadReqMgtDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtOdrUploadReqMgt.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public int updateByCondition(TtOdrUploadReqMgtDomain domain, TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtOdrUploadReqMgt.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public int delete(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtOdrUploadReqMgt.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtOdrUploadReqMgtDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain)
     */
    public int deleteByCondition(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtOdrUploadReqMgt.DeleteByCondition", criteria);
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
