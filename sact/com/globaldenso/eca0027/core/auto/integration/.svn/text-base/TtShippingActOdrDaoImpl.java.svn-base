/*
 * PROJECT：eca0027
 * 
 * TtShippingActOdr のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain;


/**
 * TtShippingActOdr のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/11 19:00:07<BR>
 * 
 * テーブル定義から2014/06/11に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtShippingActOdrDaoImpl extends SqlMapClientDaoSupport implements TtShippingActOdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtShippingActOdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public TtShippingActOdrDomain searchByKey(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingActOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingActOdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtShippingActOdrDomain> searchByCondition(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtShippingActOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtShippingActOdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtShippingActOdrDomain> searchByConditionForPaging(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtShippingActOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtShippingActOdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public int searchCount(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtShippingActOdr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public TtShippingActOdrDomain searchByKeyForChange(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingActOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingActOdr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public TtShippingActOdrDomain lockByKey(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingActOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingActOdr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public TtShippingActOdrDomain lockByKeyNoWait(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingActOdrDomain)getSqlMapClientTemplate()
                .queryForObject("TtShippingActOdr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain)
     */
    public void create(TtShippingActOdrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtShippingActOdr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain)
     */
    public int update(TtShippingActOdrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtShippingActOdr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public int updateByCondition(TtShippingActOdrDomain domain, TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtShippingActOdr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public int delete(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtShippingActOdr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingActOdrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain)
     */
    public int deleteByCondition(TtShippingActOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtShippingActOdr.DeleteByCondition", criteria);
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
