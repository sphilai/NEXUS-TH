/*
 * PROJECT：eca0027
 * 
 * VtBhtLockuser のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtBhtLockuserDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtBhtLockuserCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtBhtLockuserDomain;


/**
 * VtBhtLockuser のService実装クラスです。<BR>
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
public class VtBhtLockuserServiceImpl implements VtBhtLockuserService {

    /**
     * vtBhtLockuserのDAO
     */
    private VtBhtLockuserDao vtBhtLockuserDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtBhtLockuserServiceImpl() {
    }

    /**
     * vtBhtLockuserのDAOを設定します。
     * 
     * @param vtBhtLockuserDao vtBhtLockuserのDao
     */
    public void setVtBhtLockuserDao(VtBhtLockuserDao vtBhtLockuserDao) {
        this.vtBhtLockuserDao = vtBhtLockuserDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtBhtLockuserService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtBhtLockuserCriteriaDomain)
     */
    public List<VtBhtLockuserDomain> searchByCondition(VtBhtLockuserCriteriaDomain criteria) throws ApplicationException {
        return vtBhtLockuserDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtBhtLockuserService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtBhtLockuserCriteriaDomain)
     */
    public List<VtBhtLockuserDomain> searchByConditionForPaging(VtBhtLockuserCriteriaDomain criteria) throws ApplicationException {
        return vtBhtLockuserDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtBhtLockuserService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtBhtLockuserCriteriaDomain)
     */
    public int searchCount(VtBhtLockuserCriteriaDomain criteria) throws ApplicationException {
        return vtBhtLockuserDao.searchCount(criteria);
    }


}
