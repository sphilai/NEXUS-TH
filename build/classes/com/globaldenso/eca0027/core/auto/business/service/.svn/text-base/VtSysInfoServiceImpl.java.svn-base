/*
 * PROJECT：eca0027
 * 
 * VtSysInfo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/01/19  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtSysInfoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtSysInfoDomain;


/**
 * VtSysInfo のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/01/19 16:51:32<BR>
 * 
 * テーブル定義から2015/01/19に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 10410 $
 */
public class VtSysInfoServiceImpl implements VtSysInfoService {

    /**
     * vtSysInfoのDAO
     */
    private VtSysInfoDao vtSysInfoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtSysInfoServiceImpl() {
    }

    /**
     * vtSysInfoのDAOを設定します。
     * 
     * @param vtSysInfoDao vtSysInfoのDao
     */
    public void setVtSysInfoDao(VtSysInfoDao vtSysInfoDao) {
        this.vtSysInfoDao = vtSysInfoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtSysInfoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain)
     */
    public List<VtSysInfoDomain> searchByCondition(VtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return vtSysInfoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtSysInfoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain)
     */
    public List<VtSysInfoDomain> searchByConditionForPaging(VtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return vtSysInfoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtSysInfoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain)
     */
    public int searchCount(VtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return vtSysInfoDao.searchCount(criteria);
    }


}
