/*
 * PROJECT：eca0027
 * 
 * TtExpRcvOdr のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;


/**
 * TtExpRcvOdr のDAO実装クラスです。<BR>
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
public class TtExpRcvOdrDaoImpl extends SqlMapClientDaoSupport implements TtExpRcvOdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRcvOdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public TtExpRcvOdrDomain searchByKey(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRcvOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRcvOdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRcvOdrDomain> searchByCondition(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRcvOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRcvOdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRcvOdrDomain> searchByConditionForPaging(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRcvOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRcvOdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public int searchCount(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtExpRcvOdr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public TtExpRcvOdrDomain searchByKeyForChange(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRcvOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRcvOdr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public TtExpRcvOdrDomain lockByKey(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRcvOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRcvOdr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public TtExpRcvOdrDomain lockByKeyNoWait(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRcvOdrDomain)getSqlMapClientTemplate()
                .queryForObject("TtExpRcvOdr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain)
     */
    public void create(TtExpRcvOdrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtExpRcvOdr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain)
     */
    public int update(TtExpRcvOdrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtExpRcvOdr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public int updateByCondition(TtExpRcvOdrDomain domain, TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtExpRcvOdr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public int delete(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRcvOdr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRcvOdrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public int deleteByCondition(TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRcvOdr.DeleteByCondition", criteria);
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
