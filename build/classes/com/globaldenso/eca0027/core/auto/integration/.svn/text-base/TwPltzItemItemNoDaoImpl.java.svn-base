/*
 * PROJECT：eca0027
 * 
 * TwPltzItemItemNo のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemItemNoDomain;


/**
 * TwPltzItemItemNo のDAO実装クラスです。<BR>
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
public class TwPltzItemItemNoDaoImpl extends SqlMapClientDaoSupport implements TwPltzItemItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwPltzItemItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public TwPltzItemItemNoDomain searchByKey(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwPltzItemItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TwPltzItemItemNo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwPltzItemItemNoDomain> searchByCondition(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TwPltzItemItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TwPltzItemItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwPltzItemItemNoDomain> searchByConditionForPaging(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TwPltzItemItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TwPltzItemItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public int searchCount(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwPltzItemItemNo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public TwPltzItemItemNoDomain searchByKeyForChange(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwPltzItemItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TwPltzItemItemNo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public TwPltzItemItemNoDomain lockByKey(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwPltzItemItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TwPltzItemItemNo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public TwPltzItemItemNoDomain lockByKeyNoWait(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwPltzItemItemNoDomain)getSqlMapClientTemplate()
                .queryForObject("TwPltzItemItemNo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemItemNoDomain)
     */
    public void create(TwPltzItemItemNoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwPltzItemItemNo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemItemNoDomain)
     */
    public int update(TwPltzItemItemNoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwPltzItemItemNo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public int updateByCondition(TwPltzItemItemNoDomain domain, TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwPltzItemItemNo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public int delete(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwPltzItemItemNo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemItemNoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain)
     */
    public int deleteByCondition(TwPltzItemItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwPltzItemItemNo.DeleteByCondition", criteria);
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
