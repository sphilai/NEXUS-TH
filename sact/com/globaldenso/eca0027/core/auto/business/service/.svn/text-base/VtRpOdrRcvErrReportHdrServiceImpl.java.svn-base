/*
 * PROJECT：eca0027
 * 
 * VtRpOdrRcvErrReportHdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpOdrRcvErrReportHdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpOdrRcvErrReportHdrDomain;


/**
 * VtRpOdrRcvErrReportHdr のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 13:29:08<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpOdrRcvErrReportHdrServiceImpl implements VtRpOdrRcvErrReportHdrService {

    /**
     * vtRpOdrRcvErrReportHdrのDAO
     */
    private VtRpOdrRcvErrReportHdrDao vtRpOdrRcvErrReportHdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpOdrRcvErrReportHdrServiceImpl() {
    }

    /**
     * vtRpOdrRcvErrReportHdrのDAOを設定します。
     * 
     * @param vtRpOdrRcvErrReportHdrDao vtRpOdrRcvErrReportHdrのDao
     */
    public void setVtRpOdrRcvErrReportHdrDao(VtRpOdrRcvErrReportHdrDao vtRpOdrRcvErrReportHdrDao) {
        this.vtRpOdrRcvErrReportHdrDao = vtRpOdrRcvErrReportHdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpOdrRcvErrReportHdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain)
     */
    public List<VtRpOdrRcvErrReportHdrDomain> searchByCondition(VtRpOdrRcvErrReportHdrCriteriaDomain criteria) throws ApplicationException {
        return vtRpOdrRcvErrReportHdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpOdrRcvErrReportHdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain)
     */
    public List<VtRpOdrRcvErrReportHdrDomain> searchByConditionForPaging(VtRpOdrRcvErrReportHdrCriteriaDomain criteria) throws ApplicationException {
        return vtRpOdrRcvErrReportHdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpOdrRcvErrReportHdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain)
     */
    public int searchCount(VtRpOdrRcvErrReportHdrCriteriaDomain criteria) throws ApplicationException {
        return vtRpOdrRcvErrReportHdrDao.searchCount(criteria);
    }


}
