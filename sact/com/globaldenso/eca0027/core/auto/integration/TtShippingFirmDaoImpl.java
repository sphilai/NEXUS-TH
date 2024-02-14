/*
 * PROJECT：eca0027
 * 
 * TtShippingFirm のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain;


/**
 * TtShippingFirm のDAO実装クラスです。<BR>
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
public class TtShippingFirmDaoImpl extends SqlMapClientDaoSupport implements TtShippingFirmDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtShippingFirmDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public TtShippingFirmDomain searchByKey(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingFirmDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingFirm.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtShippingFirmDomain> searchByCondition(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (List<TtShippingFirmDomain>)getSqlMapClientTemplate()
                    .queryForList("TtShippingFirm.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtShippingFirmDomain> searchByConditionForPaging(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (List<TtShippingFirmDomain>)getSqlMapClientTemplate()
                    .queryForList("TtShippingFirm.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public int searchCount(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtShippingFirm.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public TtShippingFirmDomain searchByKeyForChange(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingFirmDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingFirm.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public TtShippingFirmDomain lockByKey(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingFirmDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingFirm.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public TtShippingFirmDomain lockByKeyNoWait(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingFirmDomain)getSqlMapClientTemplate()
                .queryForObject("TtShippingFirm.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain)
     */
    public void create(TtShippingFirmDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtShippingFirm.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain)
     */
    public int update(TtShippingFirmDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtShippingFirm.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public int updateByCondition(TtShippingFirmDomain domain, TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtShippingFirm.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public int delete(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtShippingFirm.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain)
     */
    public int deleteByCondition(TtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtShippingFirm.DeleteByCondition", criteria);
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
