/*
 * PROJECT：eca0027
 * 
 * TmCustomerQrPatternHdr のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternHdrDomain;


/**
 * TmCustomerQrPatternHdr のDAO実装クラスです。<BR>
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
public class TmCustomerQrPatternHdrDaoImpl extends SqlMapClientDaoSupport implements TmCustomerQrPatternHdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCustomerQrPatternHdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public TmCustomerQrPatternHdrDomain searchByKey(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmCustomerQrPatternHdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCustomerQrPatternHdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCustomerQrPatternHdrDomain> searchByCondition(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCustomerQrPatternHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCustomerQrPatternHdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCustomerQrPatternHdrDomain> searchByConditionForPaging(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCustomerQrPatternHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCustomerQrPatternHdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public int searchCount(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCustomerQrPatternHdr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public TmCustomerQrPatternHdrDomain searchByKeyForChange(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmCustomerQrPatternHdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCustomerQrPatternHdr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public TmCustomerQrPatternHdrDomain lockByKey(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmCustomerQrPatternHdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCustomerQrPatternHdr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public TmCustomerQrPatternHdrDomain lockByKeyNoWait(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmCustomerQrPatternHdrDomain)getSqlMapClientTemplate()
                .queryForObject("TmCustomerQrPatternHdr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternHdrDomain)
     */
    public void create(TmCustomerQrPatternHdrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCustomerQrPatternHdr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternHdrDomain)
     */
    public int update(TmCustomerQrPatternHdrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCustomerQrPatternHdr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternHdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public int updateByCondition(TmCustomerQrPatternHdrDomain domain, TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCustomerQrPatternHdr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public int delete(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCustomerQrPatternHdr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCustomerQrPatternHdrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)
     */
    public int deleteByCondition(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCustomerQrPatternHdr.DeleteByCondition", criteria);
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
