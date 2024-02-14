/*
 * PROJECT：eca0027
 * 
 * VtRpSlsCntrctAtchedMain のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/08/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedMainDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedMainCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctAtchedMainDomain;


/**
 * VtRpSlsCntrctAtchedMain のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/08/18 17:18:16<BR>
 * 
 * テーブル定義から2015/08/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11913 $
 */
public class VtRpSlsCntrctAtchedMainServiceImpl implements VtRpSlsCntrctAtchedMainService {

    /**
     * vtRpSlsCntrctAtchedMainのDAO
     */
    private VtRpSlsCntrctAtchedMainDao vtRpSlsCntrctAtchedMainDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSlsCntrctAtchedMainServiceImpl() {
    }

    /**
     * vtRpSlsCntrctAtchedMainのDAOを設定します。
     * 
     * @param vtRpSlsCntrctAtchedMainDao vtRpSlsCntrctAtchedMainのDao
     */
    public void setVtRpSlsCntrctAtchedMainDao(VtRpSlsCntrctAtchedMainDao vtRpSlsCntrctAtchedMainDao) {
        this.vtRpSlsCntrctAtchedMainDao = vtRpSlsCntrctAtchedMainDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctAtchedMainService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedMainCriteriaDomain)
     */
    public List<VtRpSlsCntrctAtchedMainDomain> searchByCondition(VtRpSlsCntrctAtchedMainCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctAtchedMainDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctAtchedMainService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedMainCriteriaDomain)
     */
    public List<VtRpSlsCntrctAtchedMainDomain> searchByConditionForPaging(VtRpSlsCntrctAtchedMainCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctAtchedMainDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctAtchedMainService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedMainCriteriaDomain)
     */
    public int searchCount(VtRpSlsCntrctAtchedMainCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctAtchedMainDao.searchCount(criteria);
    }


}
