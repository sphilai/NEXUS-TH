/*
 * PROJECT：eca0027
 * 
 * TmPrinter のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain;


/**
 * TmPrinter のDAO実装クラスです。<BR>
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
public class TmPrinterDaoImpl extends SqlMapClientDaoSupport implements TmPrinterDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPrinterDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public TmPrinterDomain searchByKey(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return (TmPrinterDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPrinter.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPrinterDomain> searchByCondition(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPrinterDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPrinter.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPrinterDomain> searchByConditionForPaging(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPrinterDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPrinter.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public int searchCount(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPrinter.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public TmPrinterDomain searchByKeyForChange(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return (TmPrinterDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPrinter.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public TmPrinterDomain lockByKey(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return (TmPrinterDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPrinter.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public TmPrinterDomain lockByKeyNoWait(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return (TmPrinterDomain)getSqlMapClientTemplate()
                .queryForObject("TmPrinter.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain)
     */
    public void create(TmPrinterDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmPrinter.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain)
     */
    public int update(TmPrinterDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmPrinter.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public int updateByCondition(TmPrinterDomain domain, TmPrinterCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmPrinter.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public int delete(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPrinter.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPrinterDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain)
     */
    public int deleteByCondition(TmPrinterCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmPrinter.DeleteByCondition", criteria);
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
