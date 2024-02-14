/*
 * PROJECT：eca0027
 * 
 * TmNxsComp のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/02/19  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;


/**
 * TmNxsComp のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/02/19 15:21:32<BR>
 * 
 * テーブル定義から2016/02/19に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class TmNxsCompDaoImpl extends SqlMapClientDaoSupport implements TmNxsCompDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmNxsCompDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public TmNxsCompDomain searchByKey(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsCompDomain)getSqlMapClientTemplate()
                    .queryForObject("TmNxsComp.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmNxsCompDomain> searchByCondition(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return (List<TmNxsCompDomain>)getSqlMapClientTemplate()
                    .queryForList("TmNxsComp.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmNxsCompDomain> searchByConditionForPaging(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return (List<TmNxsCompDomain>)getSqlMapClientTemplate()
                    .queryForList("TmNxsComp.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public int searchCount(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmNxsComp.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public TmNxsCompDomain searchByKeyForChange(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsCompDomain)getSqlMapClientTemplate()
                    .queryForObject("TmNxsComp.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public TmNxsCompDomain lockByKey(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsCompDomain)getSqlMapClientTemplate()
                    .queryForObject("TmNxsComp.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public TmNxsCompDomain lockByKeyNoWait(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsCompDomain)getSqlMapClientTemplate()
                .queryForObject("TmNxsComp.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain)
     */
    public void create(TmNxsCompDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmNxsComp.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain)
     */
    public int update(TmNxsCompDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmNxsComp.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public int updateByCondition(TmNxsCompDomain domain, TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmNxsComp.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public int delete(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmNxsComp.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsCompDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain)
     */
    public int deleteByCondition(TmNxsCompCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmNxsComp.DeleteByCondition", criteria);
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
