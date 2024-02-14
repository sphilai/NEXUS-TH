/*
 * PROJECT：eca0027
 * 
 * VmTimeDiffInfo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VmTimeDiffInfoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmTimeDiffInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmTimeDiffInfoDomain;


/**
 * VmTimeDiffInfo のService実装クラスです。<BR>
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
public class VmTimeDiffInfoServiceImpl implements VmTimeDiffInfoService {

    /**
     * vmTimeDiffInfoのDAO
     */
    private VmTimeDiffInfoDao vmTimeDiffInfoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VmTimeDiffInfoServiceImpl() {
    }

    /**
     * vmTimeDiffInfoのDAOを設定します。
     * 
     * @param vmTimeDiffInfoDao vmTimeDiffInfoのDao
     */
    public void setVmTimeDiffInfoDao(VmTimeDiffInfoDao vmTimeDiffInfoDao) {
        this.vmTimeDiffInfoDao = vmTimeDiffInfoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmTimeDiffInfoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmTimeDiffInfoCriteriaDomain)
     */
    public List<VmTimeDiffInfoDomain> searchByCondition(VmTimeDiffInfoCriteriaDomain criteria) throws ApplicationException {
        return vmTimeDiffInfoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmTimeDiffInfoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmTimeDiffInfoCriteriaDomain)
     */
    public List<VmTimeDiffInfoDomain> searchByConditionForPaging(VmTimeDiffInfoCriteriaDomain criteria) throws ApplicationException {
        return vmTimeDiffInfoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmTimeDiffInfoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmTimeDiffInfoCriteriaDomain)
     */
    public int searchCount(VmTimeDiffInfoCriteriaDomain criteria) throws ApplicationException {
        return vmTimeDiffInfoDao.searchCount(criteria);
    }


}
