/*
 * PROJECT：eca0027
 * 
 * TtExpRequestPltzRt のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestPltzRtDomain;


/**
 * TtExpRequestPltzRt のDAO実装クラスです。<BR>
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
public class TtExpRequestPltzRtDaoImpl extends SqlMapClientDaoSupport implements TtExpRequestPltzRtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestPltzRtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public TtExpRequestPltzRtDomain searchByKey(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestPltzRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestPltzRt.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestPltzRtDomain> searchByCondition(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestPltzRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequestPltzRt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestPltzRtDomain> searchByConditionForPaging(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestPltzRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequestPltzRt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public int searchCount(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestPltzRt.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public TtExpRequestPltzRtDomain searchByKeyForChange(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestPltzRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestPltzRt.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public TtExpRequestPltzRtDomain lockByKey(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestPltzRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestPltzRt.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public TtExpRequestPltzRtDomain lockByKeyNoWait(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestPltzRtDomain)getSqlMapClientTemplate()
                .queryForObject("TtExpRequestPltzRt.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestPltzRtDomain)
     */
    public void create(TtExpRequestPltzRtDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtExpRequestPltzRt.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestPltzRtDomain)
     */
    public int update(TtExpRequestPltzRtDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtExpRequestPltzRt.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestPltzRtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestPltzRtDomain domain, TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtExpRequestPltzRt.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public int delete(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequestPltzRt.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestPltzRtDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestPltzRtCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestPltzRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequestPltzRt.DeleteByCondition", criteria);
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
