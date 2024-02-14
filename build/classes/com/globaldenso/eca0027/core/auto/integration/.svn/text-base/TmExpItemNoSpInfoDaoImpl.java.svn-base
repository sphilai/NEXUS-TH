/*
 * PROJECT：eca0027
 * 
 * TmExpItemNoSpInfo のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;


/**
 * TmExpItemNoSpInfo のDAO実装クラスです。<BR>
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
public class TmExpItemNoSpInfoDaoImpl extends SqlMapClientDaoSupport implements TmExpItemNoSpInfoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpItemNoSpInfoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public TmExpItemNoSpInfoDomain searchByKey(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return (TmExpItemNoSpInfoDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpItemNoSpInfo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpItemNoSpInfoDomain> searchByCondition(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpItemNoSpInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpItemNoSpInfo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpItemNoSpInfoDomain> searchByConditionForPaging(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpItemNoSpInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpItemNoSpInfo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public int searchCount(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmExpItemNoSpInfo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public TmExpItemNoSpInfoDomain searchByKeyForChange(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return (TmExpItemNoSpInfoDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpItemNoSpInfo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public TmExpItemNoSpInfoDomain lockByKey(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return (TmExpItemNoSpInfoDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpItemNoSpInfo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public TmExpItemNoSpInfoDomain lockByKeyNoWait(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return (TmExpItemNoSpInfoDomain)getSqlMapClientTemplate()
                .queryForObject("TmExpItemNoSpInfo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain)
     */
    public void create(TmExpItemNoSpInfoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmExpItemNoSpInfo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain)
     */
    public int update(TmExpItemNoSpInfoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmExpItemNoSpInfo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public int updateByCondition(TmExpItemNoSpInfoDomain domain, TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmExpItemNoSpInfo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public int delete(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmExpItemNoSpInfo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpItemNoSpInfoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain)
     */
    public int deleteByCondition(TmExpItemNoSpInfoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmExpItemNoSpInfo.DeleteByCondition", criteria);
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
