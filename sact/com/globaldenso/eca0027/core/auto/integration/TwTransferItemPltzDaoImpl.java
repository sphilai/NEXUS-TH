/*
 * PROJECT：eca0027
 * 
 * TwTransferItemPltz のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/06  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain;


/**
 * TwTransferItemPltz のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/06 09:19:02<BR>
 * 
 * テーブル定義から2014/06/06に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TwTransferItemPltzDaoImpl extends SqlMapClientDaoSupport implements TwTransferItemPltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwTransferItemPltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public TwTransferItemPltzDomain searchByKey(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemPltz.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwTransferItemPltzDomain> searchByCondition(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TwTransferItemPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TwTransferItemPltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwTransferItemPltzDomain> searchByConditionForPaging(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TwTransferItemPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TwTransferItemPltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public int searchCount(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemPltz.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public TwTransferItemPltzDomain searchByKeyForChange(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemPltz.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public TwTransferItemPltzDomain lockByKey(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemPltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemPltz.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public TwTransferItemPltzDomain lockByKeyNoWait(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemPltzDomain)getSqlMapClientTemplate()
                .queryForObject("TwTransferItemPltz.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain)
     */
    public void create(TwTransferItemPltzDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwTransferItemPltz.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain)
     */
    public int update(TwTransferItemPltzDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwTransferItemPltz.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public int updateByCondition(TwTransferItemPltzDomain domain, TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwTransferItemPltz.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public int delete(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwTransferItemPltz.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemPltzDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     */
    public int deleteByCondition(TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwTransferItemPltz.DeleteByCondition", criteria);
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
