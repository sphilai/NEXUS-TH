/*
 * PROJECT：eca0027
 * 
 * TwCarryOutListItemNo のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListItemNoDomain;


/**
 * TwCarryOutListItemNo のDAO実装クラスです。<BR>
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
public class TwCarryOutListItemNoDaoImpl extends SqlMapClientDaoSupport implements TwCarryOutListItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwCarryOutListItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public TwCarryOutListItemNoDomain searchByKey(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListItemNo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCarryOutListItemNoDomain> searchByCondition(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCarryOutListItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCarryOutListItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCarryOutListItemNoDomain> searchByConditionForPaging(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCarryOutListItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCarryOutListItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public int searchCount(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListItemNo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public TwCarryOutListItemNoDomain searchByKeyForChange(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListItemNo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public TwCarryOutListItemNoDomain lockByKey(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCarryOutListItemNo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public TwCarryOutListItemNoDomain lockByKeyNoWait(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TwCarryOutListItemNoDomain)getSqlMapClientTemplate()
                .queryForObject("TwCarryOutListItemNo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListItemNoDomain)
     */
    public void create(TwCarryOutListItemNoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwCarryOutListItemNo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListItemNoDomain)
     */
    public int update(TwCarryOutListItemNoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwCarryOutListItemNo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public int updateByCondition(TwCarryOutListItemNoDomain domain, TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwCarryOutListItemNo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public int delete(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCarryOutListItemNo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCarryOutListItemNoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     */
    public int deleteByCondition(TwCarryOutListItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCarryOutListItemNo.DeleteByCondition", criteria);
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
