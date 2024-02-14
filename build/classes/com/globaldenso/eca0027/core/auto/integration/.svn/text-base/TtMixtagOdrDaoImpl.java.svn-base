/*
 * PROJECT：eca0027
 * 
 * TtMixtagOdr のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain;


/**
 * TtMixtagOdr のDAO実装クラスです。<BR>
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
public class TtMixtagOdrDaoImpl extends SqlMapClientDaoSupport implements TtMixtagOdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixtagOdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public TtMixtagOdrDomain searchByKey(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagOdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixtagOdrDomain> searchByCondition(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixtagOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixtagOdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixtagOdrDomain> searchByConditionForPaging(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixtagOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixtagOdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public int searchCount(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagOdr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public TtMixtagOdrDomain searchByKeyForChange(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagOdr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public TtMixtagOdrDomain lockByKey(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagOdr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public TtMixtagOdrDomain lockByKeyNoWait(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagOdrDomain)getSqlMapClientTemplate()
                .queryForObject("TtMixtagOdr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain)
     */
    public void create(TtMixtagOdrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtMixtagOdr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain)
     */
    public int update(TtMixtagOdrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtMixtagOdr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public int updateByCondition(TtMixtagOdrDomain domain, TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtMixtagOdr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public int delete(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixtagOdr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagOdrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain)
     */
    public int deleteByCondition(TtMixtagOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixtagOdr.DeleteByCondition", criteria);
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
