/*
 * PROJECT：eca0027
 * 
 * TtTransferItemItemNo のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/07/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain;


/**
 * TtTransferItemItemNo のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/07/07 18:21:05<BR>
 * 
 * テーブル定義から2014/07/07に自動生成したモジュールです。
 * 
 * @author $Author: 100011638841 $
 * @version $Revision: 8158 $
 */
public class TtTransferItemItemNoDaoImpl extends SqlMapClientDaoSupport implements TtTransferItemItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferItemItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public TtTransferItemItemNoDomain searchByKey(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemItemNo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferItemItemNoDomain> searchByCondition(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferItemItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransferItemItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtTransferItemItemNoDomain> searchByConditionForPaging(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtTransferItemItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtTransferItemItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public int searchCount(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemItemNo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public TtTransferItemItemNoDomain searchByKeyForChange(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemItemNo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public TtTransferItemItemNoDomain lockByKey(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtTransferItemItemNo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public TtTransferItemItemNoDomain lockByKeyNoWait(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtTransferItemItemNoDomain)getSqlMapClientTemplate()
                .queryForObject("TtTransferItemItemNo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain)
     */
    public void create(TtTransferItemItemNoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtTransferItemItemNo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain)
     */
    public int update(TtTransferItemItemNoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtTransferItemItemNo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public int updateByCondition(TtTransferItemItemNoDomain domain, TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtTransferItemItemNo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public int delete(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransferItemItemNo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtTransferItemItemNoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain)
     */
    public int deleteByCondition(TtTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtTransferItemItemNo.DeleteByCondition", criteria);
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
