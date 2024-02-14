/*
 * PROJECT：eca0027
 * 
 * TwInvItem のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain;


/**
 * TwInvItem のDAO実装クラスです。<BR>
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
public class TwInvItemDaoImpl extends SqlMapClientDaoSupport implements TwInvItemDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwInvItemDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public TwInvItemDomain searchByKey(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return (TwInvItemDomain)getSqlMapClientTemplate()
                    .queryForObject("TwInvItem.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwInvItemDomain> searchByCondition(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return (List<TwInvItemDomain>)getSqlMapClientTemplate()
                    .queryForList("TwInvItem.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwInvItemDomain> searchByConditionForPaging(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return (List<TwInvItemDomain>)getSqlMapClientTemplate()
                    .queryForList("TwInvItem.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public int searchCount(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwInvItem.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public TwInvItemDomain searchByKeyForChange(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return (TwInvItemDomain)getSqlMapClientTemplate()
                    .queryForObject("TwInvItem.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public TwInvItemDomain lockByKey(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return (TwInvItemDomain)getSqlMapClientTemplate()
                    .queryForObject("TwInvItem.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public TwInvItemDomain lockByKeyNoWait(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return (TwInvItemDomain)getSqlMapClientTemplate()
                .queryForObject("TwInvItem.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain)
     */
    public void create(TwInvItemDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwInvItem.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain)
     */
    public int update(TwInvItemDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwInvItem.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public int updateByCondition(TwInvItemDomain domain, TwInvItemCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwInvItem.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public int delete(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwInvItem.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvItemDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain)
     */
    public int deleteByCondition(TwInvItemCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwInvItem.DeleteByCondition", criteria);
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
