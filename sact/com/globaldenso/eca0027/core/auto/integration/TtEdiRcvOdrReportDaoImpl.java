/*
 * PROJECT：eca0027
 * 
 * TtEdiRcvOdrReport のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain;


/**
 * TtEdiRcvOdrReport のDAO実装クラスです。<BR>
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
public class TtEdiRcvOdrReportDaoImpl extends SqlMapClientDaoSupport implements TtEdiRcvOdrReportDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtEdiRcvOdrReportDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public TtEdiRcvOdrReportDomain searchByKey(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrReportDomain)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdrReport.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtEdiRcvOdrReportDomain> searchByCondition(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return (List<TtEdiRcvOdrReportDomain>)getSqlMapClientTemplate()
                    .queryForList("TtEdiRcvOdrReport.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtEdiRcvOdrReportDomain> searchByConditionForPaging(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return (List<TtEdiRcvOdrReportDomain>)getSqlMapClientTemplate()
                    .queryForList("TtEdiRcvOdrReport.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public int searchCount(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdrReport.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public TtEdiRcvOdrReportDomain searchByKeyForChange(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrReportDomain)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdrReport.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public TtEdiRcvOdrReportDomain lockByKey(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrReportDomain)getSqlMapClientTemplate()
                    .queryForObject("TtEdiRcvOdrReport.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public TtEdiRcvOdrReportDomain lockByKeyNoWait(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return (TtEdiRcvOdrReportDomain)getSqlMapClientTemplate()
                .queryForObject("TtEdiRcvOdrReport.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain)
     */
    public void create(TtEdiRcvOdrReportDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtEdiRcvOdrReport.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain)
     */
    public int update(TtEdiRcvOdrReportDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtEdiRcvOdrReport.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public int updateByCondition(TtEdiRcvOdrReportDomain domain, TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtEdiRcvOdrReport.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public int delete(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtEdiRcvOdrReport.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtEdiRcvOdrReportDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    public int deleteByCondition(TtEdiRcvOdrReportCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtEdiRcvOdrReport.DeleteByCondition", criteria);
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
