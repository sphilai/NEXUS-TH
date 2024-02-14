/*
 * PROJECT：eca0027
 * 
 * TwOdrUploadUpd のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadUpdDomain;


/**
 * TwOdrUploadUpd のDAO実装クラスです。<BR>
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
public class TwOdrUploadUpdDaoImpl extends SqlMapClientDaoSupport implements TwOdrUploadUpdDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwOdrUploadUpdDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public TwOdrUploadUpdDomain searchByKey(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return (TwOdrUploadUpdDomain)getSqlMapClientTemplate()
                    .queryForObject("TwOdrUploadUpd.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwOdrUploadUpdDomain> searchByCondition(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return (List<TwOdrUploadUpdDomain>)getSqlMapClientTemplate()
                    .queryForList("TwOdrUploadUpd.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwOdrUploadUpdDomain> searchByConditionForPaging(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return (List<TwOdrUploadUpdDomain>)getSqlMapClientTemplate()
                    .queryForList("TwOdrUploadUpd.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public int searchCount(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwOdrUploadUpd.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public TwOdrUploadUpdDomain searchByKeyForChange(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return (TwOdrUploadUpdDomain)getSqlMapClientTemplate()
                    .queryForObject("TwOdrUploadUpd.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public TwOdrUploadUpdDomain lockByKey(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return (TwOdrUploadUpdDomain)getSqlMapClientTemplate()
                    .queryForObject("TwOdrUploadUpd.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public TwOdrUploadUpdDomain lockByKeyNoWait(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return (TwOdrUploadUpdDomain)getSqlMapClientTemplate()
                .queryForObject("TwOdrUploadUpd.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadUpdDomain)
     */
    public void create(TwOdrUploadUpdDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwOdrUploadUpd.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadUpdDomain)
     */
    public int update(TwOdrUploadUpdDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwOdrUploadUpd.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadUpdDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public int updateByCondition(TwOdrUploadUpdDomain domain, TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwOdrUploadUpd.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public int delete(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwOdrUploadUpd.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwOdrUploadUpdDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain)
     */
    public int deleteByCondition(TwOdrUploadUpdCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwOdrUploadUpd.DeleteByCondition", criteria);
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
