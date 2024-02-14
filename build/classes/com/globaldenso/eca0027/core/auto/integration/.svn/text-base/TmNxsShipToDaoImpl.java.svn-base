/*
 * PROJECT：eca0027
 * 
 * TmNxsShipTo のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/04/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;


/**
 * TmNxsShipTo のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/04/20 16:39:30<BR>
 * 
 * テーブル定義から2016/04/20に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 13082 $
 */
public class TmNxsShipToDaoImpl extends SqlMapClientDaoSupport implements TmNxsShipToDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmNxsShipToDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public TmNxsShipToDomain searchByKey(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsShipToDomain)getSqlMapClientTemplate()
                    .queryForObject("TmNxsShipTo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmNxsShipToDomain> searchByCondition(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return (List<TmNxsShipToDomain>)getSqlMapClientTemplate()
                    .queryForList("TmNxsShipTo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmNxsShipToDomain> searchByConditionForPaging(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return (List<TmNxsShipToDomain>)getSqlMapClientTemplate()
                    .queryForList("TmNxsShipTo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public int searchCount(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmNxsShipTo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public TmNxsShipToDomain searchByKeyForChange(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsShipToDomain)getSqlMapClientTemplate()
                    .queryForObject("TmNxsShipTo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public TmNxsShipToDomain lockByKey(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsShipToDomain)getSqlMapClientTemplate()
                    .queryForObject("TmNxsShipTo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public TmNxsShipToDomain lockByKeyNoWait(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsShipToDomain)getSqlMapClientTemplate()
                .queryForObject("TmNxsShipTo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain)
     */
    public void create(TmNxsShipToDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmNxsShipTo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain)
     */
    public int update(TmNxsShipToDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmNxsShipTo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public int updateByCondition(TmNxsShipToDomain domain, TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmNxsShipTo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public int delete(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmNxsShipTo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain)
     */
    public int deleteByCondition(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmNxsShipTo.DeleteByCondition", criteria);
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
