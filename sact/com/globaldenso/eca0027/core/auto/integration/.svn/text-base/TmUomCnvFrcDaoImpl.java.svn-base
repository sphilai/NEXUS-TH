/*
 * PROJECT：eca0027
 * 
 * TmUomCnvFrc のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvFrcDomain;


/**
 * TmUomCnvFrc のDAO実装クラスです。<BR>
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
public class TmUomCnvFrcDaoImpl extends SqlMapClientDaoSupport implements TmUomCnvFrcDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmUomCnvFrcDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public TmUomCnvFrcDomain searchByKey(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return (TmUomCnvFrcDomain)getSqlMapClientTemplate()
                    .queryForObject("TmUomCnvFrc.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmUomCnvFrcDomain> searchByCondition(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return (List<TmUomCnvFrcDomain>)getSqlMapClientTemplate()
                    .queryForList("TmUomCnvFrc.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmUomCnvFrcDomain> searchByConditionForPaging(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return (List<TmUomCnvFrcDomain>)getSqlMapClientTemplate()
                    .queryForList("TmUomCnvFrc.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public int searchCount(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmUomCnvFrc.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public TmUomCnvFrcDomain searchByKeyForChange(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return (TmUomCnvFrcDomain)getSqlMapClientTemplate()
                    .queryForObject("TmUomCnvFrc.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public TmUomCnvFrcDomain lockByKey(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return (TmUomCnvFrcDomain)getSqlMapClientTemplate()
                    .queryForObject("TmUomCnvFrc.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public TmUomCnvFrcDomain lockByKeyNoWait(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return (TmUomCnvFrcDomain)getSqlMapClientTemplate()
                .queryForObject("TmUomCnvFrc.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvFrcDomain)
     */
    public void create(TmUomCnvFrcDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmUomCnvFrc.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvFrcDomain)
     */
    public int update(TmUomCnvFrcDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmUomCnvFrc.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvFrcDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public int updateByCondition(TmUomCnvFrcDomain domain, TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmUomCnvFrc.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public int delete(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmUomCnvFrc.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvFrcDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvFrcCriteriaDomain)
     */
    public int deleteByCondition(TmUomCnvFrcCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmUomCnvFrc.DeleteByCondition", criteria);
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
