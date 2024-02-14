/*
 * PROJECT：eca0027
 * 
 * TwTransferItemItemNo のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/23  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain;


/**
 * TwTransferItemItemNo のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/23 11:08:03<BR>
 * 
 * テーブル定義から2014/06/23に自動生成したモジュールです。
 * 
 * @author $Author: 100011638841 $
 * @version $Revision: 8158 $
 */
public class TwTransferItemItemNoDaoImpl extends SqlMapClientDaoSupport implements TwTransferItemItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwTransferItemItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public TwTransferItemItemNoDomain searchByKey(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemItemNo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwTransferItemItemNoDomain> searchByCondition(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TwTransferItemItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TwTransferItemItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwTransferItemItemNoDomain> searchByConditionForPaging(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TwTransferItemItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TwTransferItemItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public int searchCount(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemItemNo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public TwTransferItemItemNoDomain searchByKeyForChange(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemItemNo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public TwTransferItemItemNoDomain lockByKey(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TwTransferItemItemNo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public TwTransferItemItemNoDomain lockByKeyNoWait(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwTransferItemItemNoDomain)getSqlMapClientTemplate()
                .queryForObject("TwTransferItemItemNo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain)
     */
    public void create(TwTransferItemItemNoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwTransferItemItemNo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain)
     */
    public int update(TwTransferItemItemNoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwTransferItemItemNo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public int updateByCondition(TwTransferItemItemNoDomain domain, TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwTransferItemItemNo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public int delete(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwTransferItemItemNo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwTransferItemItemNoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     */
    public int deleteByCondition(TwTransferItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwTransferItemItemNo.DeleteByCondition", criteria);
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
