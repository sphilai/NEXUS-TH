/*
 * PROJECT：eca0027
 * 
 * TtPltzInstrItemNo のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;


/**
 * TtPltzInstrItemNo のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/01/17 15:54:04<BR>
 * 
 * テーブル定義から2017/01/17に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class TtPltzInstrItemNoDaoImpl extends SqlMapClientDaoSupport implements TtPltzInstrItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzInstrItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public TtPltzInstrItemNoDomain searchByKey(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstrItemNo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzInstrItemNoDomain> searchByCondition(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzInstrItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzInstrItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzInstrItemNoDomain> searchByConditionForPaging(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzInstrItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzInstrItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public int searchCount(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstrItemNo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public TtPltzInstrItemNoDomain searchByKeyForChange(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstrItemNo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public TtPltzInstrItemNoDomain lockByKey(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzInstrItemNo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public TtPltzInstrItemNoDomain lockByKeyNoWait(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzInstrItemNoDomain)getSqlMapClientTemplate()
                .queryForObject("TtPltzInstrItemNo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain)
     */
    public void create(TtPltzInstrItemNoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPltzInstrItemNo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain)
     */
    public int update(TtPltzInstrItemNoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPltzInstrItemNo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public int updateByCondition(TtPltzInstrItemNoDomain domain, TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPltzInstrItemNo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public int delete(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzInstrItemNo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzInstrItemNoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain)
     */
    public int deleteByCondition(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzInstrItemNo.DeleteByCondition", criteria);
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
