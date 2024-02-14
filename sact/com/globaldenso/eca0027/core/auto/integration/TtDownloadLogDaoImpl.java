/*
 * PROJECT：eca0027
 * 
 * TtDownloadLog のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtDownloadLogDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtDownloadLogDomain;


/**
 * TtDownloadLog のDAO実装クラスです。<BR>
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
public class TtDownloadLogDaoImpl extends SqlMapClientDaoSupport implements TtDownloadLogDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtDownloadLogDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtDownloadLogDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtDownloadLogDomain> searchByCondition(TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        return (List<TtDownloadLogDomain>)getSqlMapClientTemplate()
                    .queryForList("TtDownloadLog.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtDownloadLogDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtDownloadLogDomain> searchByConditionForPaging(TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        return (List<TtDownloadLogDomain>)getSqlMapClientTemplate()
                    .queryForList("TtDownloadLog.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtDownloadLogDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    public int searchCount(TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtDownloadLog.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtDownloadLogDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtDownloadLogDomain)
     */
    public void create(TtDownloadLogDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtDownloadLog.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtDownloadLogDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtDownloadLogDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    public int updateByCondition(TtDownloadLogDomain domain, TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtDownloadLog.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtDownloadLogDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtDownloadLogCriteriaDomain)
     */
    public int deleteByCondition(TtDownloadLogCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtDownloadLog.DeleteByCondition", criteria);
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
