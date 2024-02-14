/*
 * PROJECT：eca0027
 * 
 * VtShippingFirm のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtShippingFirmDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtShippingFirmDomain;


/**
 * VtShippingFirm のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/07 14:20:24<BR>
 * 
 * テーブル定義から2014/03/07に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtShippingFirmServiceImpl implements VtShippingFirmService {

    /**
     * vtShippingFirmのDAO
     */
    private VtShippingFirmDao vtShippingFirmDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtShippingFirmServiceImpl() {
    }

    /**
     * vtShippingFirmのDAOを設定します。
     * 
     * @param vtShippingFirmDao vtShippingFirmのDao
     */
    public void setVtShippingFirmDao(VtShippingFirmDao vtShippingFirmDao) {
        this.vtShippingFirmDao = vtShippingFirmDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtShippingFirmService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtShippingFirmCriteriaDomain)
     */
    public List<VtShippingFirmDomain> searchByCondition(VtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return vtShippingFirmDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtShippingFirmService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtShippingFirmCriteriaDomain)
     */
    public List<VtShippingFirmDomain> searchByConditionForPaging(VtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return vtShippingFirmDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtShippingFirmService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtShippingFirmCriteriaDomain)
     */
    public int searchCount(VtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return vtShippingFirmDao.searchCount(criteria);
    }


}
