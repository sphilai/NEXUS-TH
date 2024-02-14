/*
 * PROJECT：eca0027
 * 
 * TmExpRequestItemNo のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmExpRequestItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpRequestItemNoDomain;


/**
 * TmExpRequestItemNo のDAO実装クラスです。<BR>
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
public class TmExpRequestItemNoDaoImpl extends SqlMapClientDaoSupport implements TmExpRequestItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpRequestItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRequestItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpRequestItemNoDomain> searchByCondition(TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpRequestItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpRequestItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRequestItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpRequestItemNoDomain> searchByConditionForPaging(TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpRequestItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpRequestItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRequestItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    public int searchCount(TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmExpRequestItemNo.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRequestItemNoDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpRequestItemNoDomain)
     */
    public void create(TmExpRequestItemNoDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmExpRequestItemNo.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRequestItemNoDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpRequestItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    public int updateByCondition(TmExpRequestItemNoDomain domain, TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmExpRequestItemNo.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpRequestItemNoDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    public int deleteByCondition(TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmExpRequestItemNo.DeleteByCondition", criteria);
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
