/*
 * PROJECT：eca0027
 * 
 * VtRpPackingSummary のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/12/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpPackingSummaryDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackingSummaryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackingSummaryDomain;


/**
 * VtRpPackingSummary のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/12/18 16:26:47<BR>
 * 
 * テーブル定義から2017/12/18に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13587 $
 */
public class VtRpPackingSummaryDaoImpl extends SqlMapClientDaoSupport implements VtRpPackingSummaryDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackingSummaryDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackingSummaryDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackingSummaryCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPackingSummaryDomain> searchByCondition(VtRpPackingSummaryCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPackingSummaryDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPackingSummary.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackingSummaryDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackingSummaryCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPackingSummaryDomain> searchByConditionForPaging(VtRpPackingSummaryCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPackingSummaryDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPackingSummary.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackingSummaryDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackingSummaryCriteriaDomain)
     */
    public int searchCount(VtRpPackingSummaryCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpPackingSummary.SearchCount", criteria);
        return cnt;
    }


}
