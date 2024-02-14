/*
 * PROJECT：eca0027
 * 
 * TtBhtWorkMixTag のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkMixTagDomain;


/**
 * TtBhtWorkMixTag のDAO実装クラスです。<BR>
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
public class TtBhtWorkMixTagDaoImpl extends SqlMapClientDaoSupport implements TtBhtWorkMixTagDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtBhtWorkMixTagDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public TtBhtWorkMixTagDomain searchByKey(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkMixTagDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkMixTag.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBhtWorkMixTagDomain> searchByCondition(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBhtWorkMixTagDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBhtWorkMixTag.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBhtWorkMixTagDomain> searchByConditionForPaging(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBhtWorkMixTagDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBhtWorkMixTag.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public int searchCount(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkMixTag.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public TtBhtWorkMixTagDomain searchByKeyForChange(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkMixTagDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkMixTag.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public TtBhtWorkMixTagDomain lockByKey(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkMixTagDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkMixTag.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public TtBhtWorkMixTagDomain lockByKeyNoWait(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkMixTagDomain)getSqlMapClientTemplate()
                .queryForObject("TtBhtWorkMixTag.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkMixTagDomain)
     */
    public void create(TtBhtWorkMixTagDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtBhtWorkMixTag.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkMixTagDomain)
     */
    public int update(TtBhtWorkMixTagDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtBhtWorkMixTag.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkMixTagDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public int updateByCondition(TtBhtWorkMixTagDomain domain, TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtBhtWorkMixTag.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public int delete(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBhtWorkMixTag.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkMixTagDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain)
     */
    public int deleteByCondition(TtBhtWorkMixTagCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBhtWorkMixTag.DeleteByCondition", criteria);
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
