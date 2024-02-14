/*
 * PROJECT：eca0027
 * 
 * TmStdQrPatternHdr のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternHdrDomain;


/**
 * TmStdQrPatternHdr のDAO実装クラスです。<BR>
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
public class TmStdQrPatternHdrDaoImpl extends SqlMapClientDaoSupport implements TmStdQrPatternHdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmStdQrPatternHdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public TmStdQrPatternHdrDomain searchByKey(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrPatternHdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrPatternHdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmStdQrPatternHdrDomain> searchByCondition(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TmStdQrPatternHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TmStdQrPatternHdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmStdQrPatternHdrDomain> searchByConditionForPaging(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TmStdQrPatternHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TmStdQrPatternHdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public int searchCount(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrPatternHdr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public TmStdQrPatternHdrDomain searchByKeyForChange(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrPatternHdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrPatternHdr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public TmStdQrPatternHdrDomain lockByKey(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrPatternHdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TmStdQrPatternHdr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public TmStdQrPatternHdrDomain lockByKeyNoWait(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmStdQrPatternHdrDomain)getSqlMapClientTemplate()
                .queryForObject("TmStdQrPatternHdr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternHdrDomain)
     */
    public void create(TmStdQrPatternHdrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmStdQrPatternHdr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternHdrDomain)
     */
    public int update(TmStdQrPatternHdrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmStdQrPatternHdr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmStdQrPatternHdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public int updateByCondition(TmStdQrPatternHdrDomain domain, TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmStdQrPatternHdr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public int delete(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmStdQrPatternHdr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmStdQrPatternHdrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmStdQrPatternHdrCriteriaDomain)
     */
    public int deleteByCondition(TmStdQrPatternHdrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmStdQrPatternHdr.DeleteByCondition", criteria);
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
