/*
 * PROJECT：eca0027
 * 
 * VtRpSlsCntrctHdrNonCmrcl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrNonCmrclDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrNonCmrclCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctHdrNonCmrclDomain;


/**
 * VtRpSlsCntrctHdrNonCmrcl のService実装クラスです。<BR>
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
public class VtRpSlsCntrctHdrNonCmrclServiceImpl implements VtRpSlsCntrctHdrNonCmrclService {

    /**
     * vtRpSlsCntrctHdrNonCmrclのDAO
     */
    private VtRpSlsCntrctHdrNonCmrclDao vtRpSlsCntrctHdrNonCmrclDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSlsCntrctHdrNonCmrclServiceImpl() {
    }

    /**
     * vtRpSlsCntrctHdrNonCmrclのDAOを設定します。
     * 
     * @param vtRpSlsCntrctHdrNonCmrclDao vtRpSlsCntrctHdrNonCmrclのDao
     */
    public void setVtRpSlsCntrctHdrNonCmrclDao(VtRpSlsCntrctHdrNonCmrclDao vtRpSlsCntrctHdrNonCmrclDao) {
        this.vtRpSlsCntrctHdrNonCmrclDao = vtRpSlsCntrctHdrNonCmrclDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctHdrNonCmrclService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrNonCmrclCriteriaDomain)
     */
    public List<VtRpSlsCntrctHdrNonCmrclDomain> searchByCondition(VtRpSlsCntrctHdrNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctHdrNonCmrclDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctHdrNonCmrclService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrNonCmrclCriteriaDomain)
     */
    public List<VtRpSlsCntrctHdrNonCmrclDomain> searchByConditionForPaging(VtRpSlsCntrctHdrNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctHdrNonCmrclDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctHdrNonCmrclService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrNonCmrclCriteriaDomain)
     */
    public int searchCount(VtRpSlsCntrctHdrNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctHdrNonCmrclDao.searchCount(criteria);
    }


}
