/*
 * PROJECT：eca0027
 * 
 * TwInvPltz のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain;


/**
 * TwInvPltz のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 10:26:05<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TwInvPltzDaoImpl extends SqlMapClientDaoSupport implements TwInvPltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwInvPltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public TwInvPltzDomain searchByKey(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwInvPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwInvPltz.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwInvPltzDomain> searchByCondition(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TwInvPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TwInvPltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwInvPltzDomain> searchByConditionForPaging(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TwInvPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TwInvPltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public int searchCount(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwInvPltz.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public TwInvPltzDomain searchByKeyForChange(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwInvPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwInvPltz.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public TwInvPltzDomain lockByKey(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwInvPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwInvPltz.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public TwInvPltzDomain lockByKeyNoWait(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwInvPltzDomain)getSqlMapClientTemplate()
                .queryForObject("TwInvPltz.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain)
     */
    public void create(TwInvPltzDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwInvPltz.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain)
     */
    public int update(TwInvPltzDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwInvPltz.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public int updateByCondition(TwInvPltzDomain domain, TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwInvPltz.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public int delete(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwInvPltz.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvPltzDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain)
     */
    public int deleteByCondition(TwInvPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwInvPltz.DeleteByCondition", criteria);
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
