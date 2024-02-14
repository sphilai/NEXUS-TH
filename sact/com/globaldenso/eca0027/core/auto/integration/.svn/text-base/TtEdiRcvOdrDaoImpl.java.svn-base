/*
 * PROJECT：eca0027
 * 
 * TtEdiRcvOdr のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/08/06  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrDomain;


/**
 * TtEdiRcvOdr のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/06 12:17:14<BR>
 * 
 * テーブル定義から2014/08/06に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TtEdiRcvOdrDaoImpl extends SqlMapClientDaoSupport implements TtEdiRcvOdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtEdiRcvOdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public TtEdiRcvOdrDomain searchByKey(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtEdiRcvOdrDomain> searchByCondition(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtEdiRcvOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtEdiRcvOdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtEdiRcvOdrDomain> searchByConditionForPaging(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtEdiRcvOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtEdiRcvOdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public int searchCount(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public TtEdiRcvOdrDomain searchByKeyForChange(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public TtEdiRcvOdrDomain lockByKey(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public TtEdiRcvOdrDomain lockByKeyNoWait(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrDomain)getSqlMapClientTemplate()
                .queryForObject("TtEdiRcvOdr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrDomain)
     */
    public void create(TtEdiRcvOdrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtEdiRcvOdr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrDomain)
     */
    public int update(TtEdiRcvOdrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtEdiRcvOdr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public int updateByCondition(TtEdiRcvOdrDomain domain, TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtEdiRcvOdr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public int delete(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtEdiRcvOdr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain)
     */
    public int deleteByCondition(TtEdiRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtEdiRcvOdr.DeleteByCondition", criteria);
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
