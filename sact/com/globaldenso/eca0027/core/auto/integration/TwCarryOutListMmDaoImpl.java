/*
 * PROJECT：eca0027
 * 
 * TwCarryOutListMm のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListMmDomain;


/**
 * TwCarryOutListMm のDAO実装クラスです。<BR>
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
public class TwCarryOutListMmDaoImpl extends SqlMapClientDaoSupport implements TwCarryOutListMmDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwCarryOutListMmDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public TwCarryOutListMmDomain searchByKey(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListMmDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListMm.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCarryOutListMmDomain> searchByCondition(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCarryOutListMmDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCarryOutListMm.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCarryOutListMmDomain> searchByConditionForPaging(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCarryOutListMmDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCarryOutListMm.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public int searchCount(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListMm.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public TwCarryOutListMmDomain searchByKeyForChange(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListMmDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListMm.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public TwCarryOutListMmDomain lockByKey(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListMmDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListMm.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public TwCarryOutListMmDomain lockByKeyNoWait(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListMmDomain)getSqlMapClientTemplate()
                .queryForObject("TwCarryOutListMm.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListMmDomain)
     */
    public void create(TwCarryOutListMmDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwCarryOutListMm.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListMmDomain)
     */
    public int update(TwCarryOutListMmDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwCarryOutListMm.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListMmDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public int updateByCondition(TwCarryOutListMmDomain domain, TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwCarryOutListMm.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public int delete(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCarryOutListMm.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListMmDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListMmCriteriaDomain)
     */
    public int deleteByCondition(TwCarryOutListMmCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCarryOutListMm.DeleteByCondition", criteria);
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
