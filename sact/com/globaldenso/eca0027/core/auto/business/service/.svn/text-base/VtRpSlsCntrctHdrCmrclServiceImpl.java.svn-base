/*
 * PROJECT：eca0027
 * 
 * VtRpSlsCntrctHdrCmrcl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrCmrclDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrCmrclCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctHdrCmrclDomain;


/**
 * VtRpSlsCntrctHdrCmrcl のService実装クラスです。<BR>
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
public class VtRpSlsCntrctHdrCmrclServiceImpl implements VtRpSlsCntrctHdrCmrclService {

    /**
     * vtRpSlsCntrctHdrCmrclのDAO
     */
    private VtRpSlsCntrctHdrCmrclDao vtRpSlsCntrctHdrCmrclDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSlsCntrctHdrCmrclServiceImpl() {
    }

    /**
     * vtRpSlsCntrctHdrCmrclのDAOを設定します。
     * 
     * @param vtRpSlsCntrctHdrCmrclDao vtRpSlsCntrctHdrCmrclのDao
     */
    public void setVtRpSlsCntrctHdrCmrclDao(VtRpSlsCntrctHdrCmrclDao vtRpSlsCntrctHdrCmrclDao) {
        this.vtRpSlsCntrctHdrCmrclDao = vtRpSlsCntrctHdrCmrclDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctHdrCmrclService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrCmrclCriteriaDomain)
     */
    public List<VtRpSlsCntrctHdrCmrclDomain> searchByCondition(VtRpSlsCntrctHdrCmrclCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctHdrCmrclDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctHdrCmrclService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrCmrclCriteriaDomain)
     */
    public List<VtRpSlsCntrctHdrCmrclDomain> searchByConditionForPaging(VtRpSlsCntrctHdrCmrclCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctHdrCmrclDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctHdrCmrclService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrCmrclCriteriaDomain)
     */
    public int searchCount(VtRpSlsCntrctHdrCmrclCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctHdrCmrclDao.searchCount(criteria);
    }


}
