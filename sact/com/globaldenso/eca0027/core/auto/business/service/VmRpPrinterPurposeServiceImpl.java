/*
 * PROJECT：eca0027
 * 
 * VmRpPrinterPurpose のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/24  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VmRpPrinterPurposeDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpPrinterPurposeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmRpPrinterPurposeDomain;


/**
 * VmRpPrinterPurpose のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/24 17:56:36<BR>
 * 
 * テーブル定義から2014/02/24に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmRpPrinterPurposeServiceImpl implements VmRpPrinterPurposeService {

    /**
     * vmRpPrinterPurposeのDAO
     */
    private VmRpPrinterPurposeDao vmRpPrinterPurposeDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpPrinterPurposeServiceImpl() {
    }

    /**
     * vmRpPrinterPurposeのDAOを設定します。
     * 
     * @param vmRpPrinterPurposeDao vmRpPrinterPurposeのDao
     */
    public void setVmRpPrinterPurposeDao(VmRpPrinterPurposeDao vmRpPrinterPurposeDao) {
        this.vmRpPrinterPurposeDao = vmRpPrinterPurposeDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpPrinterPurposeService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpPrinterPurposeCriteriaDomain)
     */
    public List<VmRpPrinterPurposeDomain> searchByCondition(VmRpPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return vmRpPrinterPurposeDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpPrinterPurposeService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpPrinterPurposeCriteriaDomain)
     */
    public List<VmRpPrinterPurposeDomain> searchByConditionForPaging(VmRpPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return vmRpPrinterPurposeDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpPrinterPurposeService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpPrinterPurposeCriteriaDomain)
     */
    public int searchCount(VmRpPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return vmRpPrinterPurposeDao.searchCount(criteria);
    }


}
