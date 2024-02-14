/*
 * PROJECT：eca0027
 * 
 * TtPltzKanbanExtra のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/02/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain;


/**
 * TtPltzKanbanExtra のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/02/07 17:12:52<BR>
 * 
 * テーブル定義から2017/02/07に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TtPltzKanbanExtraDaoImpl extends SqlMapClientDaoSupport implements TtPltzKanbanExtraDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzKanbanExtraDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public TtPltzKanbanExtraDomain searchByKey(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzKanbanExtraDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzKanbanExtra.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzKanbanExtraDomain> searchByCondition(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzKanbanExtraDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzKanbanExtra.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPltzKanbanExtraDomain> searchByConditionForPaging(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzKanbanExtraDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPltzKanbanExtra.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public int searchCount(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPltzKanbanExtra.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public TtPltzKanbanExtraDomain searchByKeyForChange(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzKanbanExtraDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzKanbanExtra.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public TtPltzKanbanExtraDomain lockByKey(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzKanbanExtraDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPltzKanbanExtra.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public TtPltzKanbanExtraDomain lockByKeyNoWait(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return (TtPltzKanbanExtraDomain)getSqlMapClientTemplate()
                .queryForObject("TtPltzKanbanExtra.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain)
     */
    public void create(TtPltzKanbanExtraDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPltzKanbanExtra.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain)
     */
    public int update(TtPltzKanbanExtraDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPltzKanbanExtra.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public int updateByCondition(TtPltzKanbanExtraDomain domain, TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPltzKanbanExtra.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public int delete(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzKanbanExtra.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public int deleteByCondition(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPltzKanbanExtra.DeleteByCondition", criteria);
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
