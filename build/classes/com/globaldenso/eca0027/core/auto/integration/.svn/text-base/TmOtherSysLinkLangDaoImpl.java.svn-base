/*
 * PROJECT：eca0027
 * 
 * TmOtherSysLinkLang のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkLangDomain;


/**
 * TmOtherSysLinkLang のDAO実装クラスです。<BR>
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
public class TmOtherSysLinkLangDaoImpl extends SqlMapClientDaoSupport implements TmOtherSysLinkLangDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmOtherSysLinkLangDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public TmOtherSysLinkLangDomain searchByKey(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return (TmOtherSysLinkLangDomain)getSqlMapClientTemplate()
                    .queryForObject("TmOtherSysLinkLang.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmOtherSysLinkLangDomain> searchByCondition(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return (List<TmOtherSysLinkLangDomain>)getSqlMapClientTemplate()
                    .queryForList("TmOtherSysLinkLang.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmOtherSysLinkLangDomain> searchByConditionForPaging(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return (List<TmOtherSysLinkLangDomain>)getSqlMapClientTemplate()
                    .queryForList("TmOtherSysLinkLang.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public int searchCount(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmOtherSysLinkLang.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public TmOtherSysLinkLangDomain searchByKeyForChange(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return (TmOtherSysLinkLangDomain)getSqlMapClientTemplate()
                    .queryForObject("TmOtherSysLinkLang.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public TmOtherSysLinkLangDomain lockByKey(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return (TmOtherSysLinkLangDomain)getSqlMapClientTemplate()
                    .queryForObject("TmOtherSysLinkLang.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public TmOtherSysLinkLangDomain lockByKeyNoWait(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return (TmOtherSysLinkLangDomain)getSqlMapClientTemplate()
                .queryForObject("TmOtherSysLinkLang.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkLangDomain)
     */
    public void create(TmOtherSysLinkLangDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmOtherSysLinkLang.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkLangDomain)
     */
    public int update(TmOtherSysLinkLangDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmOtherSysLinkLang.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkLangDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public int updateByCondition(TmOtherSysLinkLangDomain domain, TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmOtherSysLinkLang.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public int delete(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmOtherSysLinkLang.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmOtherSysLinkLangDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain)
     */
    public int deleteByCondition(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmOtherSysLinkLang.DeleteByCondition", criteria);
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
