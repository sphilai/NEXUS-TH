/*
 * PROJECT：eca0027
 * 
 * VtRpInvHdrForNonCmrcl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForNonCmrclDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForNonCmrclCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvHdrForNonCmrclDomain;


/**
 * VtRpInvHdrForNonCmrcl のService実装クラスです。<BR>
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
public class VtRpInvHdrForNonCmrclServiceImpl implements VtRpInvHdrForNonCmrclService {

    /**
     * vtRpInvHdrForNonCmrclのDAO
     */
    private VtRpInvHdrForNonCmrclDao vtRpInvHdrForNonCmrclDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvHdrForNonCmrclServiceImpl() {
    }

    /**
     * vtRpInvHdrForNonCmrclのDAOを設定します。
     * 
     * @param vtRpInvHdrForNonCmrclDao vtRpInvHdrForNonCmrclのDao
     */
    public void setVtRpInvHdrForNonCmrclDao(VtRpInvHdrForNonCmrclDao vtRpInvHdrForNonCmrclDao) {
        this.vtRpInvHdrForNonCmrclDao = vtRpInvHdrForNonCmrclDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForNonCmrclService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForNonCmrclCriteriaDomain)
     */
    public List<VtRpInvHdrForNonCmrclDomain> searchByCondition(VtRpInvHdrForNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvHdrForNonCmrclDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForNonCmrclService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForNonCmrclCriteriaDomain)
     */
    public List<VtRpInvHdrForNonCmrclDomain> searchByConditionForPaging(VtRpInvHdrForNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvHdrForNonCmrclDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForNonCmrclService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForNonCmrclCriteriaDomain)
     */
    public int searchCount(VtRpInvHdrForNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvHdrForNonCmrclDao.searchCount(criteria);
    }


}
