/*
 * PROJECT：eca0027
 * 
 * TmCancelInvSeqTyp のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain;


/**
 * TmCancelInvSeqTyp のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/17 23:10:14<BR>
 * 
 * テーブル定義から2014/04/17に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmCancelInvSeqTypDaoImpl extends SqlMapClientDaoSupport implements TmCancelInvSeqTypDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCancelInvSeqTypDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public TmCancelInvSeqTypDomain searchByKey(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return (TmCancelInvSeqTypDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCancelInvSeqTyp.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCancelInvSeqTypDomain> searchByCondition(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCancelInvSeqTypDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCancelInvSeqTyp.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCancelInvSeqTypDomain> searchByConditionForPaging(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCancelInvSeqTypDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCancelInvSeqTyp.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public int searchCount(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCancelInvSeqTyp.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public TmCancelInvSeqTypDomain searchByKeyForChange(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return (TmCancelInvSeqTypDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCancelInvSeqTyp.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public TmCancelInvSeqTypDomain lockByKey(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return (TmCancelInvSeqTypDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCancelInvSeqTyp.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public TmCancelInvSeqTypDomain lockByKeyNoWait(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return (TmCancelInvSeqTypDomain)getSqlMapClientTemplate()
                .queryForObject("TmCancelInvSeqTyp.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain)
     */
    public void create(TmCancelInvSeqTypDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCancelInvSeqTyp.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain)
     */
    public int update(TmCancelInvSeqTypDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCancelInvSeqTyp.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public int updateByCondition(TmCancelInvSeqTypDomain domain, TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCancelInvSeqTyp.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public int delete(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCancelInvSeqTyp.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCancelInvSeqTypDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain)
     */
    public int deleteByCondition(TmCancelInvSeqTypCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCancelInvSeqTyp.DeleteByCondition", criteria);
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
