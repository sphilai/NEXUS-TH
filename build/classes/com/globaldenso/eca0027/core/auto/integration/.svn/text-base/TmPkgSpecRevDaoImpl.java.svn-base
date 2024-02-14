/*
 * PROJECT：eca0027
 * 
 * TmPkgSpecRev のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain;


/**
 * TmPkgSpecRev のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/05 17:39:47<BR>
 * 
 * テーブル定義から2014/11/05に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TmPkgSpecRevDaoImpl extends SqlMapClientDaoSupport implements TmPkgSpecRevDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSpecRevDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public TmPkgSpecRevDomain searchByKey(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecRevDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecRev.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSpecRevDomain> searchByCondition(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSpecRevDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSpecRev.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSpecRevDomain> searchByConditionForPaging(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSpecRevDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSpecRev.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public int searchCount(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecRev.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public TmPkgSpecRevDomain searchByKeyForChange(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecRevDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecRev.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public TmPkgSpecRevDomain lockByKey(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecRevDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecRev.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public TmPkgSpecRevDomain lockByKeyNoWait(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecRevDomain)getSqlMapClientTemplate()
                .queryForObject("TmPkgSpecRev.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain)
     */
    public void create(TmPkgSpecRevDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmPkgSpecRev.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain)
     */
    public int update(TmPkgSpecRevDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmPkgSpecRev.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public int updateByCondition(TmPkgSpecRevDomain domain, TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmPkgSpecRev.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public int delete(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPkgSpecRev.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain)
     */
    public int deleteByCondition(TmPkgSpecRevCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPkgSpecRev.DeleteByCondition", criteria);
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
