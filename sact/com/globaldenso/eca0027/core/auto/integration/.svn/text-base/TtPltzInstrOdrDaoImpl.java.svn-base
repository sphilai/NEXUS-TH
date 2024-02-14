/*
 * PROJECT：eca0027
 * 
 * TtPltzInstrOdr のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;


/**
 * TtPltzInstrOdr のDAO実装クラスです。<BR>
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
public class TtPltzInstrOdrDaoImpl extends SqlMapClientDaoSupport implements TtPltzInstrOdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzInstrOdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public TtPltzInstrOdrDomain searchByKey(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstrOdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzInstrOdrDomain> searchByCondition(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzInstrOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzInstrOdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzInstrOdrDomain> searchByConditionForPaging(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzInstrOdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzInstrOdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public int searchCount(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstrOdr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public TtPltzInstrOdrDomain searchByKeyForChange(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstrOdr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public TtPltzInstrOdrDomain lockByKey(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrOdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstrOdr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public TtPltzInstrOdrDomain lockByKeyNoWait(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrOdrDomain)getSqlMapClientTemplate()
                .queryForObject("TtPltzInstrOdr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain)
     */
    public void create(TtPltzInstrOdrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPltzInstrOdr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain)
     */
    public int update(TtPltzInstrOdrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPltzInstrOdr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public int updateByCondition(TtPltzInstrOdrDomain domain, TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPltzInstrOdr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public int delete(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzInstrOdr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrOdrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    public int deleteByCondition(TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzInstrOdr.DeleteByCondition", criteria);
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
