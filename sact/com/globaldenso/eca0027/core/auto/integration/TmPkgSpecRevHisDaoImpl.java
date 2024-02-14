/*
 * PROJECT：eca0027
 * 
 * TmPkgSpecRevHis のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain;


/**
 * TmPkgSpecRevHis のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/05 17:39:47<BR>
 * 
 * テーブル定義から2014/11/05に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TmPkgSpecRevHisDaoImpl extends SqlMapClientDaoSupport implements TmPkgSpecRevHisDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSpecRevHisDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public TmPkgSpecRevHisDomain searchByKey(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecRevHisDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecRevHis.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSpecRevHisDomain> searchByCondition(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSpecRevHisDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSpecRevHis.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSpecRevHisDomain> searchByConditionForPaging(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSpecRevHisDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSpecRevHis.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public int searchCount(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecRevHis.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public TmPkgSpecRevHisDomain searchByKeyForChange(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecRevHisDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecRevHis.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public TmPkgSpecRevHisDomain lockByKey(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecRevHisDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecRevHis.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public TmPkgSpecRevHisDomain lockByKeyNoWait(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecRevHisDomain)getSqlMapClientTemplate()
                .queryForObject("TmPkgSpecRevHis.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain)
     */
    public void create(TmPkgSpecRevHisDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmPkgSpecRevHis.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain)
     */
    public int update(TmPkgSpecRevHisDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmPkgSpecRevHis.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public int updateByCondition(TmPkgSpecRevHisDomain domain, TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmPkgSpecRevHis.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public int delete(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPkgSpecRevHis.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecRevHisDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevHisCriteriaDomain)
     */
    public int deleteByCondition(TmPkgSpecRevHisCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPkgSpecRevHis.DeleteByCondition", criteria);
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
