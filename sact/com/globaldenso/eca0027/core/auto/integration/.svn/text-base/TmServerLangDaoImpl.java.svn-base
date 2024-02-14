/*
 * PROJECT：eca0027
 * 
 * TmServerLang のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmServerLangDomain;


/**
 * TmServerLang のDAO実装クラスです。<BR>
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
public class TmServerLangDaoImpl extends SqlMapClientDaoSupport implements TmServerLangDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmServerLangDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public TmServerLangDomain searchByKey(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return (TmServerLangDomain)getSqlMapClientTemplate()
                    .queryForObject("TmServerLang.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmServerLangDomain> searchByCondition(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return (List<TmServerLangDomain>)getSqlMapClientTemplate()
                    .queryForList("TmServerLang.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmServerLangDomain> searchByConditionForPaging(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return (List<TmServerLangDomain>)getSqlMapClientTemplate()
                    .queryForList("TmServerLang.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public int searchCount(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmServerLang.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public TmServerLangDomain searchByKeyForChange(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return (TmServerLangDomain)getSqlMapClientTemplate()
                    .queryForObject("TmServerLang.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public TmServerLangDomain lockByKey(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return (TmServerLangDomain)getSqlMapClientTemplate()
                    .queryForObject("TmServerLang.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public TmServerLangDomain lockByKeyNoWait(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return (TmServerLangDomain)getSqlMapClientTemplate()
                .queryForObject("TmServerLang.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmServerLangDomain)
     */
    public void create(TmServerLangDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmServerLang.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmServerLangDomain)
     */
    public int update(TmServerLangDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmServerLang.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmServerLangDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public int updateByCondition(TmServerLangDomain domain, TmServerLangCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmServerLang.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public int delete(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmServerLang.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerLangDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain)
     */
    public int deleteByCondition(TmServerLangCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmServerLang.DeleteByCondition", criteria);
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
