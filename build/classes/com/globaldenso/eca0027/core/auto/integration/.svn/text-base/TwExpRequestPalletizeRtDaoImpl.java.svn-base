/*
 * PROJECT：eca0027
 * 
 * TwExpRequestPalletizeRt のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/06/08  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwExpRequestPalletizeRtDomain;


/**
 * TwExpRequestPalletizeRt のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/06/08 15:34:03<BR>
 * 
 * テーブル定義から2015/06/08に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TwExpRequestPalletizeRtDaoImpl extends SqlMapClientDaoSupport implements TwExpRequestPalletizeRtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwExpRequestPalletizeRtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public TwExpRequestPalletizeRtDomain searchByKey(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return (TwExpRequestPalletizeRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TwExpRequestPalletizeRt.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwExpRequestPalletizeRtDomain> searchByCondition(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TwExpRequestPalletizeRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TwExpRequestPalletizeRt.SearchByCondition", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#searchPkgSetMaterialsNxsCompNm(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwExpRequestPalletizeRtDomain> searchPkgSetMaterialsNxsCompNm(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TwExpRequestPalletizeRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TwExpRequestPalletizeRt.SearchPkgSetMaterialsNxsCompNm", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwExpRequestPalletizeRtDomain> searchByConditionForPaging(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TwExpRequestPalletizeRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TwExpRequestPalletizeRt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public int searchCount(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwExpRequestPalletizeRt.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public TwExpRequestPalletizeRtDomain searchByKeyForChange(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return (TwExpRequestPalletizeRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TwExpRequestPalletizeRt.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public TwExpRequestPalletizeRtDomain lockByKey(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return (TwExpRequestPalletizeRtDomain)getSqlMapClientTemplate()
                    .queryForObject("TwExpRequestPalletizeRt.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public TwExpRequestPalletizeRtDomain lockByKeyNoWait(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return (TwExpRequestPalletizeRtDomain)getSqlMapClientTemplate()
                .queryForObject("TwExpRequestPalletizeRt.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwExpRequestPalletizeRtDomain)
     */
    public void create(TwExpRequestPalletizeRtDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwExpRequestPalletizeRt.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwExpRequestPalletizeRtDomain)
     */
    public int update(TwExpRequestPalletizeRtDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwExpRequestPalletizeRt.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwExpRequestPalletizeRtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public int updateByCondition(TwExpRequestPalletizeRtDomain domain, TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwExpRequestPalletizeRt.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public int delete(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwExpRequestPalletizeRt.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public int deleteByCondition(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwExpRequestPalletizeRt.DeleteByCondition", criteria);
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
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao#searchJoinPackageMaterialByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwExpRequestPalletizeRtDomain> searchJoinPackageMaterialByCondition(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return (List<TwExpRequestPalletizeRtDomain>)getSqlMapClientTemplate()
                    .queryForList("TwExpRequestPalletizeRt.SearchJoinPackageMaterialByCondition", criteria);
    }
}
