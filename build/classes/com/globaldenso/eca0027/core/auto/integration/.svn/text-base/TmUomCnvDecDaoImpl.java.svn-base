/*
 * PROJECT：eca0027
 * 
 * TmUomCnvDec のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain;


/**
 * TmUomCnvDec のDAO実装クラスです。<BR>
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
public class TmUomCnvDecDaoImpl extends SqlMapClientDaoSupport implements TmUomCnvDecDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmUomCnvDecDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public TmUomCnvDecDomain searchByKey(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return (TmUomCnvDecDomain)getSqlMapClientTemplate()
                    .queryForObject("TmUomCnvDec.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmUomCnvDecDomain> searchByCondition(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return (List<TmUomCnvDecDomain>)getSqlMapClientTemplate()
                    .queryForList("TmUomCnvDec.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmUomCnvDecDomain> searchByConditionForPaging(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return (List<TmUomCnvDecDomain>)getSqlMapClientTemplate()
                    .queryForList("TmUomCnvDec.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public int searchCount(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmUomCnvDec.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public TmUomCnvDecDomain searchByKeyForChange(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return (TmUomCnvDecDomain)getSqlMapClientTemplate()
                    .queryForObject("TmUomCnvDec.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public TmUomCnvDecDomain lockByKey(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return (TmUomCnvDecDomain)getSqlMapClientTemplate()
                    .queryForObject("TmUomCnvDec.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public TmUomCnvDecDomain lockByKeyNoWait(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return (TmUomCnvDecDomain)getSqlMapClientTemplate()
                .queryForObject("TmUomCnvDec.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain)
     */
    public void create(TmUomCnvDecDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmUomCnvDec.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain)
     */
    public int update(TmUomCnvDecDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmUomCnvDec.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public int updateByCondition(TmUomCnvDecDomain domain, TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmUomCnvDec.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public int delete(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmUomCnvDec.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmUomCnvDecDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain)
     */
    public int deleteByCondition(TmUomCnvDecCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmUomCnvDec.DeleteByCondition", criteria);
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
