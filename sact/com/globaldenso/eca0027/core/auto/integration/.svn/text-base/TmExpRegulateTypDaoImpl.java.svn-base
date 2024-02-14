/*
 * PROJECT：eca0027
 * 
 * TmExpRegulateTyp のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpRegulateTypDomain;


/**
 * TmExpRegulateTyp のDAO実装クラスです。<BR>
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
public class TmExpRegulateTypDaoImpl extends SqlMapClientDaoSupport implements TmExpRegulateTypDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpRegulateTypDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public TmExpRegulateTypDomain searchByKey(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return (TmExpRegulateTypDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpRegulateTyp.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpRegulateTypDomain> searchByCondition(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpRegulateTypDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpRegulateTyp.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpRegulateTypDomain> searchByConditionForPaging(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpRegulateTypDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpRegulateTyp.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public int searchCount(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmExpRegulateTyp.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public TmExpRegulateTypDomain searchByKeyForChange(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return (TmExpRegulateTypDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpRegulateTyp.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public TmExpRegulateTypDomain lockByKey(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return (TmExpRegulateTypDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpRegulateTyp.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public TmExpRegulateTypDomain lockByKeyNoWait(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return (TmExpRegulateTypDomain)getSqlMapClientTemplate()
                .queryForObject("TmExpRegulateTyp.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpRegulateTypDomain)
     */
    public void create(TmExpRegulateTypDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmExpRegulateTyp.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmExpRegulateTypDomain)
     */
    public int update(TmExpRegulateTypDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmExpRegulateTyp.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpRegulateTypDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public int updateByCondition(TmExpRegulateTypDomain domain, TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmExpRegulateTyp.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public int delete(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmExpRegulateTyp.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRegulateTypDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain)
     */
    public int deleteByCondition(TmExpRegulateTypCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmExpRegulateTyp.DeleteByCondition", criteria);
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
