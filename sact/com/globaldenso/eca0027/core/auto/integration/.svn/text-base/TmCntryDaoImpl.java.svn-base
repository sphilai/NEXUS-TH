/*
 * PROJECT：eca0027
 * 
 * TmCntry のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain;


/**
 * TmCntry のDAO実装クラスです。<BR>
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
public class TmCntryDaoImpl extends SqlMapClientDaoSupport implements TmCntryDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCntryDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public TmCntryDomain searchByKey(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return (TmCntryDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCntry.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCntryDomain> searchByCondition(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCntryDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCntry.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCntryDomain> searchByConditionForPaging(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCntryDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCntry.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public int searchCount(TmCntryCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCntry.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public TmCntryDomain searchByKeyForChange(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return (TmCntryDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCntry.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public TmCntryDomain lockByKey(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return (TmCntryDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCntry.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public TmCntryDomain lockByKeyNoWait(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return (TmCntryDomain)getSqlMapClientTemplate()
                .queryForObject("TmCntry.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain)
     */
    public void create(TmCntryDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCntry.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain)
     */
    public int update(TmCntryDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCntry.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public int updateByCondition(TmCntryDomain domain, TmCntryCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCntry.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public int delete(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCntry.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCntryDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain)
     */
    public int deleteByCondition(TmCntryCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCntry.DeleteByCondition", criteria);
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
