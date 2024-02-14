/*
 * PROJECT：eca0027
 * 
 * TmPort のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmPortDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain;


/**
 * TmPort のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/17 15:44:47<BR>
 * 
 * テーブル定義から2014/11/17に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TmPortDaoImpl extends SqlMapClientDaoSupport implements TmPortDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPortDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public TmPortDomain searchByKey(TmPortCriteriaDomain criteria) throws ApplicationException {
        return (TmPortDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPort.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPortDomain> searchByCondition(TmPortCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPortDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPort.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPortDomain> searchByConditionForPaging(TmPortCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPortDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPort.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public int searchCount(TmPortCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPort.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public TmPortDomain searchByKeyForChange(TmPortCriteriaDomain criteria) throws ApplicationException {
        return (TmPortDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPort.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public TmPortDomain lockByKey(TmPortCriteriaDomain criteria) throws ApplicationException {
        return (TmPortDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPort.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public TmPortDomain lockByKeyNoWait(TmPortCriteriaDomain criteria) throws ApplicationException {
        return (TmPortDomain)getSqlMapClientTemplate()
                .queryForObject("TmPort.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain)
     */
    public void create(TmPortDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmPort.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain)
     */
    public int update(TmPortDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmPort.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public int updateByCondition(TmPortDomain domain, TmPortCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmPort.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public int delete(TmPortCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPort.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPortDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain)
     */
    public int deleteByCondition(TmPortCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPort.DeleteByCondition", criteria);
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
