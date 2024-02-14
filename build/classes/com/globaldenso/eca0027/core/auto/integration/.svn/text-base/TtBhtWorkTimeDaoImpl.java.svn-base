/*
 * PROJECT：eca0027
 * 
 * TtBhtWorkTime のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/14  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain;


/**
 * TtBhtWorkTime のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/14 11:34:01<BR>
 * 
 * テーブル定義から2014/06/14に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtBhtWorkTimeDaoImpl extends SqlMapClientDaoSupport implements TtBhtWorkTimeDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtBhtWorkTimeDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public TtBhtWorkTimeDomain searchByKey(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkTimeDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkTime.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBhtWorkTimeDomain> searchByCondition(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBhtWorkTimeDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBhtWorkTime.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBhtWorkTimeDomain> searchByConditionForPaging(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBhtWorkTimeDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBhtWorkTime.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public int searchCount(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkTime.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public TtBhtWorkTimeDomain searchByKeyForChange(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkTimeDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkTime.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public TtBhtWorkTimeDomain lockByKey(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkTimeDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkTime.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public TtBhtWorkTimeDomain lockByKeyNoWait(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkTimeDomain)getSqlMapClientTemplate()
                .queryForObject("TtBhtWorkTime.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain)
     */
    public void create(TtBhtWorkTimeDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtBhtWorkTime.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain)
     */
    public int update(TtBhtWorkTimeDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtBhtWorkTime.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public int updateByCondition(TtBhtWorkTimeDomain domain, TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtBhtWorkTime.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public int delete(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBhtWorkTime.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkTimeDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain)
     */
    public int deleteByCondition(TtBhtWorkTimeCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBhtWorkTime.DeleteByCondition", criteria);
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
