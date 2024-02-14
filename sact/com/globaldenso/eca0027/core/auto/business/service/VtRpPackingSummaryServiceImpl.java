/*
 * PROJECT：eca0027
 * 
 * VtRpPackingSummary のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/12/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpPackingSummaryDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackingSummaryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackingSummaryDomain;


/**
 * VtRpPackingSummary のService実装クラスです。<BR>
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
public class VtRpPackingSummaryServiceImpl implements VtRpPackingSummaryService {

    /**
     * vtRpPackingSummaryのDAO
     */
    private VtRpPackingSummaryDao vtRpPackingSummaryDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackingSummaryServiceImpl() {
    }

    /**
     * vtRpPackingSummaryのDAOを設定します。
     * 
     * @param vtRpPackingSummaryDao vtRpPackingSummaryのDao
     */
    public void setVtRpPackingSummaryDao(VtRpPackingSummaryDao vtRpPackingSummaryDao) {
        this.vtRpPackingSummaryDao = vtRpPackingSummaryDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackingSummaryService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackingSummaryCriteriaDomain)
     */
    public List<VtRpPackingSummaryDomain> searchByCondition(VtRpPackingSummaryCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackingSummaryDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackingSummaryService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackingSummaryCriteriaDomain)
     */
    public List<VtRpPackingSummaryDomain> searchByConditionForPaging(VtRpPackingSummaryCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackingSummaryDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackingSummaryService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackingSummaryCriteriaDomain)
     */
    public int searchCount(VtRpPackingSummaryCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackingSummaryDao.searchCount(criteria);
    }


}
