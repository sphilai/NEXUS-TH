/*
 * PROJECT：eca0027
 * 
 * TmExpFormalitiItemNo のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;


/**
 * TmExpFormalitiItemNo のDAO実装クラスです。<BR>
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
public class TmExpFormalitiItemNoDaoImpl extends SqlMapClientDaoSupport implements TmExpFormalitiItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpFormalitiItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public TmExpFormalitiItemNoDomain searchByKey(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TmExpFormalitiItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpFormalitiItemNo.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpFormalitiItemNoDomain> searchByCondition(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpFormalitiItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpFormalitiItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpFormalitiItemNoDomain> searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpFormalitiItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpFormalitiItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public int searchCount(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmExpFormalitiItemNo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public TmExpFormalitiItemNoDomain searchByKeyForChange(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TmExpFormalitiItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpFormalitiItemNo.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public TmExpFormalitiItemNoDomain lockByKey(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TmExpFormalitiItemNoDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpFormalitiItemNo.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public TmExpFormalitiItemNoDomain lockByKeyNoWait(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return (TmExpFormalitiItemNoDomain)getSqlMapClientTemplate()
                .queryForObject("TmExpFormalitiItemNo.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain)
     */
    public void create(TmExpFormalitiItemNoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmExpFormalitiItemNo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain)
     */
    public int update(TmExpFormalitiItemNoDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmExpFormalitiItemNo.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public int updateByCondition(TmExpFormalitiItemNoDomain domain, TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmExpFormalitiItemNo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public int delete(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmExpFormalitiItemNo.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpFormalitiItemNoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain)
     */
    public int deleteByCondition(TmExpFormalitiItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmExpFormalitiItemNo.DeleteByCondition", criteria);
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
