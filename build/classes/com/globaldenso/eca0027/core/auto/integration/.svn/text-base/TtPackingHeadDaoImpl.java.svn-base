/*
 * PROJECT：eca0027
 * 
 * TtPackingHead のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain;


/**
 * TtPackingHead のDAO実装クラスです。<BR>
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
public class TtPackingHeadDaoImpl extends SqlMapClientDaoSupport implements TtPackingHeadDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPackingHeadDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public TtPackingHeadDomain searchByKey(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return (TtPackingHeadDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPackingHead.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPackingHeadDomain> searchByCondition(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPackingHeadDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPackingHead.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPackingHeadDomain> searchByConditionForPaging(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPackingHeadDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPackingHead.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public int searchCount(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPackingHead.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public TtPackingHeadDomain searchByKeyForChange(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return (TtPackingHeadDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPackingHead.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public TtPackingHeadDomain lockByKey(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return (TtPackingHeadDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPackingHead.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public TtPackingHeadDomain lockByKeyNoWait(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return (TtPackingHeadDomain)getSqlMapClientTemplate()
                .queryForObject("TtPackingHead.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain)
     */
    public void create(TtPackingHeadDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPackingHead.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain)
     */
    public int update(TtPackingHeadDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPackingHead.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public int updateByCondition(TtPackingHeadDomain domain, TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPackingHead.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public int delete(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPackingHead.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingHeadDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain)
     */
    public int deleteByCondition(TtPackingHeadCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPackingHead.DeleteByCondition", criteria);
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
