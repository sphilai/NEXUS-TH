/*
 * PROJECT：eca0027
 * 
 * TmSailingSchedule のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSailingScheduleDomain;


/**
 * TmSailingSchedule のDAO実装クラスです。<BR>
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
public class TmSailingScheduleDaoImpl extends SqlMapClientDaoSupport implements TmSailingScheduleDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmSailingScheduleDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public TmSailingScheduleDomain searchByKey(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return (TmSailingScheduleDomain)getSqlMapClientTemplate()
                    .queryForObject("TmSailingSchedule.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmSailingScheduleDomain> searchByCondition(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return (List<TmSailingScheduleDomain>)getSqlMapClientTemplate()
                    .queryForList("TmSailingSchedule.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmSailingScheduleDomain> searchByConditionForPaging(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return (List<TmSailingScheduleDomain>)getSqlMapClientTemplate()
                    .queryForList("TmSailingSchedule.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public int searchCount(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmSailingSchedule.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public TmSailingScheduleDomain searchByKeyForChange(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return (TmSailingScheduleDomain)getSqlMapClientTemplate()
                    .queryForObject("TmSailingSchedule.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public TmSailingScheduleDomain lockByKey(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return (TmSailingScheduleDomain)getSqlMapClientTemplate()
                    .queryForObject("TmSailingSchedule.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public TmSailingScheduleDomain lockByKeyNoWait(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return (TmSailingScheduleDomain)getSqlMapClientTemplate()
                .queryForObject("TmSailingSchedule.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmSailingScheduleDomain)
     */
    public void create(TmSailingScheduleDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmSailingSchedule.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmSailingScheduleDomain)
     */
    public int update(TmSailingScheduleDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmSailingSchedule.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmSailingScheduleDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public int updateByCondition(TmSailingScheduleDomain domain, TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmSailingSchedule.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public int delete(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmSailingSchedule.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSailingScheduleDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSailingScheduleCriteriaDomain)
     */
    public int deleteByCondition(TmSailingScheduleCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmSailingSchedule.DeleteByCondition", criteria);
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
