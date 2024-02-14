/*
 * PROJECT：eca0027
 * 
 * TtPackAtchItemNo のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain;


/**
 * TtPackAtchItemNo のDAO実装クラスです。<BR>
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
public class TtPackAtchItemNoDaoImpl extends SqlMapClientDaoSupport implements TtPackAtchItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPackAtchItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public TtPackAtchItemNoDomain searchByKey(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtPackAtchItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPackAtchItemNo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPackAtchItemNoDomain> searchByCondition(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPackAtchItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPackAtchItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPackAtchItemNoDomain> searchByConditionForPaging(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPackAtchItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPackAtchItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public int searchCount(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPackAtchItemNo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public TtPackAtchItemNoDomain searchByKeyForChange(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtPackAtchItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPackAtchItemNo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public TtPackAtchItemNoDomain lockByKey(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtPackAtchItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPackAtchItemNo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public TtPackAtchItemNoDomain lockByKeyNoWait(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TtPackAtchItemNoDomain)getSqlMapClientTemplate()
                .queryForObject("TtPackAtchItemNo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain)
     */
    public void create(TtPackAtchItemNoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPackAtchItemNo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain)
     */
    public int update(TtPackAtchItemNoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPackAtchItemNo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public int updateByCondition(TtPackAtchItemNoDomain domain, TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPackAtchItemNo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public int delete(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPackAtchItemNo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackAtchItemNoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain)
     */
    public int deleteByCondition(TtPackAtchItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPackAtchItemNo.DeleteByCondition", criteria);
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
