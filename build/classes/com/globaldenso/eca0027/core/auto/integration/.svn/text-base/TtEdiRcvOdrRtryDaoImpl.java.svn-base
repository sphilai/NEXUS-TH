/*
 * PROJECT：eca0027
 * 
 * TtEdiRcvOdrRtry のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain;


/**
 * TtEdiRcvOdrRtry のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/06 12:17:14<BR>
 * 
 * テーブル定義から2014/08/06に自動生成したモジュールです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7336 $
 */
public class TtEdiRcvOdrRtryDaoImpl extends SqlMapClientDaoSupport implements TtEdiRcvOdrRtryDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtEdiRcvOdrRtryDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public TtEdiRcvOdrRtryDomain searchByKey(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrRtryDomain)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdrRtry.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtEdiRcvOdrRtryDomain> searchByCondition(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return (List<TtEdiRcvOdrRtryDomain>)getSqlMapClientTemplate()
                    .queryForList("TtEdiRcvOdrRtry.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtEdiRcvOdrRtryDomain> searchByConditionForPaging(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return (List<TtEdiRcvOdrRtryDomain>)getSqlMapClientTemplate()
                    .queryForList("TtEdiRcvOdrRtry.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public int searchCount(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdrRtry.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public TtEdiRcvOdrRtryDomain searchByKeyForChange(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrRtryDomain)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdrRtry.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public TtEdiRcvOdrRtryDomain lockByKey(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrRtryDomain)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdrRtry.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public TtEdiRcvOdrRtryDomain lockByKeyNoWait(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrRtryDomain)getSqlMapClientTemplate()
                .queryForObject("TtEdiRcvOdrRtry.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain)
     */
    public void create(TtEdiRcvOdrRtryDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtEdiRcvOdrRtry.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain)
     */
    public int update(TtEdiRcvOdrRtryDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtEdiRcvOdrRtry.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public int updateByCondition(TtEdiRcvOdrRtryDomain domain, TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtEdiRcvOdrRtry.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public int delete(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtEdiRcvOdrRtry.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrRtryDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain)
     */
    public int deleteByCondition(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtEdiRcvOdrRtry.DeleteByCondition", criteria);
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
