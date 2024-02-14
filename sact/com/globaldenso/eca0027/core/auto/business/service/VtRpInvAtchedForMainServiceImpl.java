/*
 * PROJECT：eca0027
 * 
 * VtRpInvAtchedForMain のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/08/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForMainDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvAtchedForMainDomain;


/**
 * VtRpInvAtchedForMain のService実装クラスです。<BR>
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
public class VtRpInvAtchedForMainServiceImpl implements VtRpInvAtchedForMainService {

    /**
     * vtRpInvAtchedForMainのDAO
     */
    private VtRpInvAtchedForMainDao vtRpInvAtchedForMainDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvAtchedForMainServiceImpl() {
    }

    /**
     * vtRpInvAtchedForMainのDAOを設定します。
     * 
     * @param vtRpInvAtchedForMainDao vtRpInvAtchedForMainのDao
     */
    public void setVtRpInvAtchedForMainDao(VtRpInvAtchedForMainDao vtRpInvAtchedForMainDao) {
        this.vtRpInvAtchedForMainDao = vtRpInvAtchedForMainDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvAtchedForMainService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain)
     */
    public List<VtRpInvAtchedForMainDomain> searchByCondition(VtRpInvAtchedForMainCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvAtchedForMainDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvAtchedForMainService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain)
     */
    public List<VtRpInvAtchedForMainDomain> searchByConditionForPaging(VtRpInvAtchedForMainCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvAtchedForMainDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvAtchedForMainService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain)
     */
    public int searchCount(VtRpInvAtchedForMainCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvAtchedForMainDao.searchCount(criteria);
    }


}
