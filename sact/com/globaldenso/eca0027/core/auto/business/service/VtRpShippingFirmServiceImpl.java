/*
 * PROJECT：NEXUS
 * 
 * VtRpShippingFirm のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpShippingFirmDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpShippingFirmDomain;


/**
 * VtRpShippingFirm のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/27 16:15:58<BR>
 * 
 * テーブル定義から2014/02/27に自動生成したモジュールです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12982 $
 */
public class VtRpShippingFirmServiceImpl implements VtRpShippingFirmService {

    /**
     * vtRpShippingFirmのDAO
     */
    private VtRpShippingFirmDao vtRpShippingFirmDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpShippingFirmServiceImpl() {
    }

    /**
     * vtRpShippingFirmのDAOを設定します。
     * 
     * @param vtRpShippingFirmDao vtRpShippingFirmのDao
     */
    public void setVtRpShippingFirmDao(VtRpShippingFirmDao vtRpShippingFirmDao) {
        this.vtRpShippingFirmDao = vtRpShippingFirmDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpShippingFirmService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpShippingFirmCriteriaDomain)
     */
    public List<VtRpShippingFirmDomain> searchByCondition(VtRpShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return vtRpShippingFirmDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpShippingFirmService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpShippingFirmCriteriaDomain)
     */
    public List<VtRpShippingFirmDomain> searchByConditionForPaging(VtRpShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return vtRpShippingFirmDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpShippingFirmService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpShippingFirmCriteriaDomain)
     */
    public int searchCount(VtRpShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return vtRpShippingFirmDao.searchCount(criteria);
    }


}
