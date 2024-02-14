/*
 * PROJECT：eca0027
 * 
 * TwOdrUpload のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/02/14  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadDomain;


/**
 * TwOdrUpload のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/02/14 09:12:40<BR>
 * 
 * テーブル定義から2017/02/14に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13624 $
 */
public class TwOdrUploadDaoImpl extends SqlMapClientDaoSupport implements TwOdrUploadDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwOdrUploadDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public TwOdrUploadDomain searchByKey(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return (TwOdrUploadDomain)getSqlMapClientTemplate()
                    .queryForObject("TwOdrUpload.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwOdrUploadDomain> searchByCondition(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return (List<TwOdrUploadDomain>)getSqlMapClientTemplate()
                    .queryForList("TwOdrUpload.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwOdrUploadDomain> searchByConditionForPaging(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return (List<TwOdrUploadDomain>)getSqlMapClientTemplate()
                    .queryForList("TwOdrUpload.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public int searchCount(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwOdrUpload.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public TwOdrUploadDomain searchByKeyForChange(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return (TwOdrUploadDomain)getSqlMapClientTemplate()
                    .queryForObject("TwOdrUpload.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public TwOdrUploadDomain lockByKey(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return (TwOdrUploadDomain)getSqlMapClientTemplate()
                    .queryForObject("TwOdrUpload.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public TwOdrUploadDomain lockByKeyNoWait(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return (TwOdrUploadDomain)getSqlMapClientTemplate()
                .queryForObject("TwOdrUpload.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadDomain)
     */
    public void create(TwOdrUploadDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwOdrUpload.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadDomain)
     */
    public int update(TwOdrUploadDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwOdrUpload.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public int updateByCondition(TwOdrUploadDomain domain, TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwOdrUpload.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public int delete(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwOdrUpload.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain)
     */
    public int deleteByCondition(TwOdrUploadCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwOdrUpload.DeleteByCondition", criteria);
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
