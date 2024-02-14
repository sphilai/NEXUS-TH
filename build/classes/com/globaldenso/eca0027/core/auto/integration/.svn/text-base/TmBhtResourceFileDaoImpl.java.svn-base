/*
 * PROJECT：eca0027
 * 
 * TmBhtResourceFile のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtResourceFileDomain;


/**
 * TmBhtResourceFile のDAO実装クラスです。<BR>
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
public class TmBhtResourceFileDaoImpl extends SqlMapClientDaoSupport implements TmBhtResourceFileDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmBhtResourceFileDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public TmBhtResourceFileDomain searchByKey(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtResourceFileDomain)getSqlMapClientTemplate()
                    .queryForObject("TmBhtResourceFile.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmBhtResourceFileDomain> searchByCondition(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return (List<TmBhtResourceFileDomain>)getSqlMapClientTemplate()
                    .queryForList("TmBhtResourceFile.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmBhtResourceFileDomain> searchByConditionForPaging(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return (List<TmBhtResourceFileDomain>)getSqlMapClientTemplate()
                    .queryForList("TmBhtResourceFile.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public int searchCount(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmBhtResourceFile.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public TmBhtResourceFileDomain searchByKeyForChange(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtResourceFileDomain)getSqlMapClientTemplate()
                    .queryForObject("TmBhtResourceFile.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public TmBhtResourceFileDomain lockByKey(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtResourceFileDomain)getSqlMapClientTemplate()
                    .queryForObject("TmBhtResourceFile.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public TmBhtResourceFileDomain lockByKeyNoWait(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtResourceFileDomain)getSqlMapClientTemplate()
                .queryForObject("TmBhtResourceFile.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmBhtResourceFileDomain)
     */
    public void create(TmBhtResourceFileDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmBhtResourceFile.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmBhtResourceFileDomain)
     */
    public int update(TmBhtResourceFileDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmBhtResourceFile.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmBhtResourceFileDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public int updateByCondition(TmBhtResourceFileDomain domain, TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmBhtResourceFile.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public int delete(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmBhtResourceFile.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtResourceFileDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain)
     */
    public int deleteByCondition(TmBhtResourceFileCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmBhtResourceFile.DeleteByCondition", criteria);
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
