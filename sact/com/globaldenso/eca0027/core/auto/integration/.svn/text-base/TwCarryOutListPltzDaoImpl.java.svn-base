/*
 * PROJECT：eca0027
 * 
 * TwCarryOutListPltz のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain;


/**
 * TwCarryOutListPltz のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TwCarryOutListPltzDaoImpl extends SqlMapClientDaoSupport implements TwCarryOutListPltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwCarryOutListPltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public TwCarryOutListPltzDomain searchByKey(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListPltz.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCarryOutListPltzDomain> searchByCondition(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCarryOutListPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCarryOutListPltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCarryOutListPltzDomain> searchByConditionForPaging(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCarryOutListPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCarryOutListPltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public int searchCount(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListPltz.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public TwCarryOutListPltzDomain searchByKeyForChange(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListPltz.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public TwCarryOutListPltzDomain lockByKey(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListPltz.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public TwCarryOutListPltzDomain lockByKeyNoWait(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListPltzDomain)getSqlMapClientTemplate()
                .queryForObject("TwCarryOutListPltz.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain)
     */
    public void create(TwCarryOutListPltzDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwCarryOutListPltz.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain)
     */
    public int update(TwCarryOutListPltzDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwCarryOutListPltz.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public int updateByCondition(TwCarryOutListPltzDomain domain, TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwCarryOutListPltz.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public int delete(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCarryOutListPltz.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListPltzDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     */
    public int deleteByCondition(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCarryOutListPltz.DeleteByCondition", criteria);
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
