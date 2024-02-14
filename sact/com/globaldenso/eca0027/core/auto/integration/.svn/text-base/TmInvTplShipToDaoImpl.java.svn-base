/*
 * PROJECT：eca0027
 * 
 * TmInvTplShipTo のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain;


/**
 * TmInvTplShipTo のDAO実装クラスです。<BR>
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
public class TmInvTplShipToDaoImpl extends SqlMapClientDaoSupport implements TmInvTplShipToDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvTplShipToDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public TmInvTplShipToDomain searchByKey(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return (TmInvTplShipToDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvTplShipTo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvTplShipToDomain> searchByCondition(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvTplShipToDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvTplShipTo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvTplShipToDomain> searchByConditionForPaging(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvTplShipToDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvTplShipTo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public int searchCount(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmInvTplShipTo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public TmInvTplShipToDomain searchByKeyForChange(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return (TmInvTplShipToDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvTplShipTo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public TmInvTplShipToDomain lockByKey(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return (TmInvTplShipToDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvTplShipTo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public TmInvTplShipToDomain lockByKeyNoWait(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return (TmInvTplShipToDomain)getSqlMapClientTemplate()
                .queryForObject("TmInvTplShipTo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain)
     */
    public void create(TmInvTplShipToDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmInvTplShipTo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain)
     */
    public int update(TmInvTplShipToDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmInvTplShipTo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public int updateByCondition(TmInvTplShipToDomain domain, TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmInvTplShipTo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public int delete(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvTplShipTo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplShipToDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain)
     */
    public int deleteByCondition(TmInvTplShipToCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvTplShipTo.DeleteByCondition", criteria);
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
