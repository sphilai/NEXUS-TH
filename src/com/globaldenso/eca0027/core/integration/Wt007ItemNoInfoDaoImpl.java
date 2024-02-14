/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List; 

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt007ItemNoInfoDao;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt007ItemNoInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt007ItemNoInfoDomain;


/**
 * The search dao implementation class of Item No Information Sub Screen.
 * <br />
 * 品番表示子画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt007ItemNoInfoDaoImpl extends SqlMapClientDaoSupport implements
    Wt007ItemNoInfoDao {

    /**
     * Default constructor.
     */
    public Wt007ItemNoInfoDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the item No. information.
     * Search table(TT_PLTZ_ITEM).
     * 品番情報の検索結果を取得するSqlMapを呼び出します。
     * TT_PLTZ_ITEMテーブルを検索します。
     * </pre>
     */
    @SuppressWarnings("unchecked")
    public List<Wt007ItemNoInfoDomain> searchByConditionTtPltzItem(
        Wt007ItemNoInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt007ItemNoInfoDomain>)getSqlMapClientTemplate()
            .queryForList("Wt007ItemNoInfo.SearchByConditionTtPltzItem", criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the item No. information.
     * Search table(TT_MIXTAG_ITEM_NO).
     * 品番情報の検索結果を取得するSqlMapを呼び出します。
     * TT_MIXTAG_ITEM_NOテーブルを検索します。
     * </pre>
     */
    @SuppressWarnings("unchecked")
    public List<Wt007ItemNoInfoDomain> searchByConditionTtMixtagItemNo(
        Wt007ItemNoInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt007ItemNoInfoDomain>)getSqlMapClientTemplate()
            .queryForList("Wt007ItemNoInfo.SearchByConditionTtMixtagItemNo", criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the item No. information.
     * Search table(TT_PLTZ_ITEM).
     * 品番情報の検索結果件数を取得するSqlMapを呼び出します。
     * TT_PLTZ_ITEMテーブルを検索します。
     * </pre>
     */
    public int searchCountTtPltzItem(Wt007ItemNoInfoCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "Wt007ItemNoInfo.SearchCountTtPltzItem", criteria);
        return cnt;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the item No. information.
     * Search table(TT_MIXTAG_ITEM_NO).
     * 品番情報の検索結果件数を取得するSqlMapを呼び出します。
     * TT_MIXTAG_ITEM_NOテーブルを検索します。
     * </pre>
     */
    public int searchCountTtMixtagItemNo(Wt007ItemNoInfoCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "Wt007ItemNoInfo.SearchCountTtMixtagItemNo", criteria);
        return cnt;
    }

}
