/*
 * PROJECT：eca0027
 * 
 * TtBhtWorkPltz のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain;


/**
 * TtBhtWorkPltz のDAO実装クラスです。<BR>
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
public class TtBhtWorkPltzDaoImpl extends SqlMapClientDaoSupport implements TtBhtWorkPltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtBhtWorkPltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public TtBhtWorkPltzDomain searchByKey(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkPltz.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBhtWorkPltzDomain> searchByCondition(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBhtWorkPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBhtWorkPltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBhtWorkPltzDomain> searchByConditionForPaging(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBhtWorkPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBhtWorkPltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public int searchCount(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkPltz.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public TtBhtWorkPltzDomain searchByKeyForChange(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkPltz.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public TtBhtWorkPltzDomain lockByKey(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkPltz.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public TtBhtWorkPltzDomain lockByKeyNoWait(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkPltzDomain)getSqlMapClientTemplate()
                .queryForObject("TtBhtWorkPltz.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain)
     */
    public void create(TtBhtWorkPltzDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtBhtWorkPltz.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain)
     */
    public int update(TtBhtWorkPltzDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtBhtWorkPltz.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public int updateByCondition(TtBhtWorkPltzDomain domain, TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtBhtWorkPltz.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public int delete(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBhtWorkPltz.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkPltzDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain)
     */
    public int deleteByCondition(TtBhtWorkPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBhtWorkPltz.DeleteByCondition", criteria);
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
