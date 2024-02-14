/*
 * PROJECT：eca0027
 * 
 * TtPltzItemOdr のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain;


/**
 * TtPltzItemOdr のDAO実装クラスです。<BR>
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
public class TtPltzItemOdrDaoImpl extends SqlMapClientDaoSupport implements TtPltzItemOdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzItemOdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public TtPltzItemOdrDomain searchByKey(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItemOdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzItemOdrDomain> searchByCondition(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzItemOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzItemOdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzItemOdrDomain> searchByConditionForPaging(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzItemOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzItemOdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public int searchCount(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItemOdr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public TtPltzItemOdrDomain searchByKeyForChange(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItemOdr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public TtPltzItemOdrDomain lockByKey(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzItemOdr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public TtPltzItemOdrDomain lockByKeyNoWait(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzItemOdrDomain)getSqlMapClientTemplate()
                .queryForObject("TtPltzItemOdr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain)
     */
    public void create(TtPltzItemOdrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPltzItemOdr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain)
     */
    public int update(TtPltzItemOdrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPltzItemOdr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public int updateByCondition(TtPltzItemOdrDomain domain, TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPltzItemOdr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public int delete(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzItemOdr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzItemOdrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain)
     */
    public int deleteByCondition(TtPltzItemOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzItemOdr.DeleteByCondition", criteria);
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
