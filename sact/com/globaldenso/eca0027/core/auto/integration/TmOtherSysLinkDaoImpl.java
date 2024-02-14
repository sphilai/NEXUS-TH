/*
 * PROJECT：eca0027
 * 
 * TmOtherSysLink のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/02/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkDomain;


/**
 * TmOtherSysLink のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/02/11 14:36:46<BR>
 * 
 * テーブル定義から2015/02/11に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10644 $
 */
public class TmOtherSysLinkDaoImpl extends SqlMapClientDaoSupport implements TmOtherSysLinkDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmOtherSysLinkDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public TmOtherSysLinkDomain searchByKey(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return (TmOtherSysLinkDomain)getSqlMapClientTemplate()
                    .queryForObject("TmOtherSysLink.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmOtherSysLinkDomain> searchByCondition(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return (List<TmOtherSysLinkDomain>)getSqlMapClientTemplate()
                    .queryForList("TmOtherSysLink.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmOtherSysLinkDomain> searchByConditionForPaging(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return (List<TmOtherSysLinkDomain>)getSqlMapClientTemplate()
                    .queryForList("TmOtherSysLink.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public int searchCount(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmOtherSysLink.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public TmOtherSysLinkDomain searchByKeyForChange(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return (TmOtherSysLinkDomain)getSqlMapClientTemplate()
                    .queryForObject("TmOtherSysLink.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public TmOtherSysLinkDomain lockByKey(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return (TmOtherSysLinkDomain)getSqlMapClientTemplate()
                    .queryForObject("TmOtherSysLink.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public TmOtherSysLinkDomain lockByKeyNoWait(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return (TmOtherSysLinkDomain)getSqlMapClientTemplate()
                .queryForObject("TmOtherSysLink.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkDomain)
     */
    public void create(TmOtherSysLinkDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmOtherSysLink.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkDomain)
     */
    public int update(TmOtherSysLinkDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmOtherSysLink.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public int updateByCondition(TmOtherSysLinkDomain domain, TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmOtherSysLink.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public int delete(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmOtherSysLink.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain)
     */
    public int deleteByCondition(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmOtherSysLink.DeleteByCondition", criteria);
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
