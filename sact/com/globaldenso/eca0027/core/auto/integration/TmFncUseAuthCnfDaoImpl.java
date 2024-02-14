/*
 * PROJECT：eca0027
 * 
 * TmFncUseAuthCnf のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmFncUseAuthCnfDomain;


/**
 * TmFncUseAuthCnf のDAO実装クラスです。<BR>
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
public class TmFncUseAuthCnfDaoImpl extends SqlMapClientDaoSupport implements TmFncUseAuthCnfDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmFncUseAuthCnfDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public TmFncUseAuthCnfDomain searchByKey(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return (TmFncUseAuthCnfDomain)getSqlMapClientTemplate()
                    .queryForObject("TmFncUseAuthCnf.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmFncUseAuthCnfDomain> searchByCondition(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return (List<TmFncUseAuthCnfDomain>)getSqlMapClientTemplate()
                    .queryForList("TmFncUseAuthCnf.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmFncUseAuthCnfDomain> searchByConditionForPaging(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return (List<TmFncUseAuthCnfDomain>)getSqlMapClientTemplate()
                    .queryForList("TmFncUseAuthCnf.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public int searchCount(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmFncUseAuthCnf.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public TmFncUseAuthCnfDomain searchByKeyForChange(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return (TmFncUseAuthCnfDomain)getSqlMapClientTemplate()
                    .queryForObject("TmFncUseAuthCnf.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public TmFncUseAuthCnfDomain lockByKey(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return (TmFncUseAuthCnfDomain)getSqlMapClientTemplate()
                    .queryForObject("TmFncUseAuthCnf.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public TmFncUseAuthCnfDomain lockByKeyNoWait(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return (TmFncUseAuthCnfDomain)getSqlMapClientTemplate()
                .queryForObject("TmFncUseAuthCnf.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmFncUseAuthCnfDomain)
     */
    public void create(TmFncUseAuthCnfDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmFncUseAuthCnf.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmFncUseAuthCnfDomain)
     */
    public int update(TmFncUseAuthCnfDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmFncUseAuthCnf.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmFncUseAuthCnfDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public int updateByCondition(TmFncUseAuthCnfDomain domain, TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmFncUseAuthCnf.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public int delete(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmFncUseAuthCnf.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmFncUseAuthCnfDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmFncUseAuthCnfCriteriaDomain)
     */
    public int deleteByCondition(TmFncUseAuthCnfCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmFncUseAuthCnf.DeleteByCondition", criteria);
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
