/*
 * PROJECT：eca0027
 * 
 * TwInv のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwInvDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain;


/**
 * TwInv のDAO実装クラスです。<BR>
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
public class TwInvDaoImpl extends SqlMapClientDaoSupport implements TwInvDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwInvDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwInvDomain> searchByCondition(TwInvCriteriaDomain criteria) throws ApplicationException {
        return (List<TwInvDomain>)getSqlMapClientTemplate()
                    .queryForList("TwInv.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwInvDomain> searchByConditionForPaging(TwInvCriteriaDomain criteria) throws ApplicationException {
        return (List<TwInvDomain>)getSqlMapClientTemplate()
                    .queryForList("TwInv.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    public int searchCount(TwInvCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwInv.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain)
     */
    public void create(TwInvDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwInv.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    public int updateByCondition(TwInvDomain domain, TwInvCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwInv.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    public int deleteByCondition(TwInvCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwInv.DeleteByCondition", criteria);
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
