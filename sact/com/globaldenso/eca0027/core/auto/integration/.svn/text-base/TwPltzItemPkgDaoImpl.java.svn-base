/*
 * PROJECT：eca0027
 * 
 * TwPltzItemPkg のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemPkgDomain;


/**
 * TwPltzItemPkg のDAO実装クラスです。<BR>
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
public class TwPltzItemPkgDaoImpl extends SqlMapClientDaoSupport implements TwPltzItemPkgDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwPltzItemPkgDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public TwPltzItemPkgDomain searchByKey(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return (TwPltzItemPkgDomain)getSqlMapClientTemplate()
                    .queryForObject("TwPltzItemPkg.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwPltzItemPkgDomain> searchByCondition(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return (List<TwPltzItemPkgDomain>)getSqlMapClientTemplate()
                    .queryForList("TwPltzItemPkg.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwPltzItemPkgDomain> searchByConditionForPaging(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return (List<TwPltzItemPkgDomain>)getSqlMapClientTemplate()
                    .queryForList("TwPltzItemPkg.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public int searchCount(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwPltzItemPkg.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public TwPltzItemPkgDomain searchByKeyForChange(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return (TwPltzItemPkgDomain)getSqlMapClientTemplate()
                    .queryForObject("TwPltzItemPkg.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public TwPltzItemPkgDomain lockByKey(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return (TwPltzItemPkgDomain)getSqlMapClientTemplate()
                    .queryForObject("TwPltzItemPkg.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public TwPltzItemPkgDomain lockByKeyNoWait(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return (TwPltzItemPkgDomain)getSqlMapClientTemplate()
                .queryForObject("TwPltzItemPkg.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemPkgDomain)
     */
    public void create(TwPltzItemPkgDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwPltzItemPkg.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemPkgDomain)
     */
    public int update(TwPltzItemPkgDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwPltzItemPkg.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemPkgDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public int updateByCondition(TwPltzItemPkgDomain domain, TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwPltzItemPkg.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public int delete(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwPltzItemPkg.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwPltzItemPkgDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain)
     */
    public int deleteByCondition(TwPltzItemPkgCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwPltzItemPkg.DeleteByCondition", criteria);
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
