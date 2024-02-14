/*
 * PROJECT：eca0027
 * 
 * TtMixtagItemNo のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain;


/**
 * TtMixtagItemNo のDAO実装クラスです。<BR>
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
public class TtMixtagItemNoDaoImpl extends SqlMapClientDaoSupport implements TtMixtagItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixtagItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public TtMixtagItemNoDomain searchByKey(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagItemNo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixtagItemNoDomain> searchByCondition(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixtagItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixtagItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixtagItemNoDomain> searchByConditionForPaging(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixtagItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixtagItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public int searchCount(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagItemNo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public TtMixtagItemNoDomain searchByKeyForChange(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagItemNo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public TtMixtagItemNoDomain lockByKey(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtagItemNo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public TtMixtagItemNoDomain lockByKeyNoWait(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagItemNoDomain)getSqlMapClientTemplate()
                .queryForObject("TtMixtagItemNo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain)
     */
    public void create(TtMixtagItemNoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtMixtagItemNo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain)
     */
    public int update(TtMixtagItemNoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtMixtagItemNo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public int updateByCondition(TtMixtagItemNoDomain domain, TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtMixtagItemNo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public int delete(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixtagItemNo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagItemNoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain)
     */
    public int deleteByCondition(TtMixtagItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixtagItemNo.DeleteByCondition", criteria);
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
