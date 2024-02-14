/*
 * PROJECT：eca0027
 * 
 * VmGetQrCheck のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VmGetQrCheckDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmGetQrCheckDomain;


/**
 * VmGetQrCheck のService実装クラスです。<BR>
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
public class VmGetQrCheckServiceImpl implements VmGetQrCheckService {

    /**
     * vmGetQrCheckのDAO
     */
    private VmGetQrCheckDao vmGetQrCheckDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VmGetQrCheckServiceImpl() {
    }

    /**
     * vmGetQrCheckのDAOを設定します。
     * 
     * @param vmGetQrCheckDao vmGetQrCheckのDao
     */
    public void setVmGetQrCheckDao(VmGetQrCheckDao vmGetQrCheckDao) {
        this.vmGetQrCheckDao = vmGetQrCheckDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmGetQrCheckService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain)
     */
    public List<VmGetQrCheckDomain> searchByCondition(VmGetQrCheckCriteriaDomain criteria) throws ApplicationException {
        return vmGetQrCheckDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmGetQrCheckService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain)
     */
    public List<VmGetQrCheckDomain> searchByConditionForPaging(VmGetQrCheckCriteriaDomain criteria) throws ApplicationException {
        return vmGetQrCheckDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmGetQrCheckService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain)
     */
    public int searchCount(VmGetQrCheckCriteriaDomain criteria) throws ApplicationException {
        return vmGetQrCheckDao.searchCount(criteria);
    }


}
