/*
 * PROJECT：eca0027
 * 
 * TtPltz のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/01/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;


/**
 * TtPltz のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/01/07 10:53:16<BR>
 * 
 * テーブル定義から2016/01/07に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class TtPltzDaoImpl extends SqlMapClientDaoSupport implements TtPltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public TtPltzDomain searchByKey(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltz.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzDomain> searchByCondition(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzDomain> searchByConditionForPaging(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public int searchCount(TtPltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPltz.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public TtPltzDomain searchByKeyForChange(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltz.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public TtPltzDomain lockByKey(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltz.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public TtPltzDomain lockByKeyNoWait(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzDomain)getSqlMapClientTemplate()
                .queryForObject("TtPltz.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain)
     */
    public void create(TtPltzDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPltz.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain)
     */
    public int update(TtPltzDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPltz.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public int updateByCondition(TtPltzDomain domain, TtPltzCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPltz.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public int delete(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltz.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public int deleteByCondition(TtPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltz.DeleteByCondition", criteria);
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
