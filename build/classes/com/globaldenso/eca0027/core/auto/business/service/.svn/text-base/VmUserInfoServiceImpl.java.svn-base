/*
 * PROJECT：eca0027
 * 
 * VmUserInfo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VmUserInfoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;


/**
 * VmUserInfo のService実装クラスです。<BR>
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
public class VmUserInfoServiceImpl implements VmUserInfoService {

    /**
     * vmUserInfoのDAO
     */
    private VmUserInfoDao vmUserInfoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VmUserInfoServiceImpl() {
    }

    /**
     * vmUserInfoのDAOを設定します。
     * 
     * @param vmUserInfoDao vmUserInfoのDao
     */
    public void setVmUserInfoDao(VmUserInfoDao vmUserInfoDao) {
        this.vmUserInfoDao = vmUserInfoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain)
     */
    public List<VmUserInfoDomain> searchByCondition(VmUserInfoCriteriaDomain criteria) throws ApplicationException {
        return vmUserInfoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain)
     */
    public List<VmUserInfoDomain> searchByConditionForPaging(VmUserInfoCriteriaDomain criteria) throws ApplicationException {
        return vmUserInfoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain)
     */
    public int searchCount(VmUserInfoCriteriaDomain criteria) throws ApplicationException {
        return vmUserInfoDao.searchCount(criteria);
    }


}
