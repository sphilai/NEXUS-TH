/*
 * PROJECT：eca0027
 * 
 * VmServerInfo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VmServerInfoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmServerInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmServerInfoDomain;


/**
 * VmServerInfo のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/20 19:19:06<BR>
 * 
 * テーブル定義から2014/02/20に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmServerInfoServiceImpl implements VmServerInfoService {

    /**
     * vmServerInfoのDAO
     */
    private VmServerInfoDao vmServerInfoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VmServerInfoServiceImpl() {
    }

    /**
     * vmServerInfoのDAOを設定します。
     * 
     * @param vmServerInfoDao vmServerInfoのDao
     */
    public void setVmServerInfoDao(VmServerInfoDao vmServerInfoDao) {
        this.vmServerInfoDao = vmServerInfoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmServerInfoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmServerInfoCriteriaDomain)
     */
    public List<VmServerInfoDomain> searchByCondition(VmServerInfoCriteriaDomain criteria) throws ApplicationException {
        return vmServerInfoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmServerInfoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmServerInfoCriteriaDomain)
     */
    public List<VmServerInfoDomain> searchByConditionForPaging(VmServerInfoCriteriaDomain criteria) throws ApplicationException {
        return vmServerInfoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmServerInfoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmServerInfoCriteriaDomain)
     */
    public int searchCount(VmServerInfoCriteriaDomain criteria) throws ApplicationException {
        return vmServerInfoDao.searchCount(criteria);
    }


}
