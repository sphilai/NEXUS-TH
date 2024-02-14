/*
 * PROJECT：eca0027
 * 
 * VtRpPackHdrForMain のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForMainDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForMainCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackHdrForMainDomain;


/**
 * VtRpPackHdrForMain のService実装クラスです。<BR>
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
public class VtRpPackHdrForMainServiceImpl implements VtRpPackHdrForMainService {

    /**
     * vtRpPackHdrForMainのDAO
     */
    private VtRpPackHdrForMainDao vtRpPackHdrForMainDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackHdrForMainServiceImpl() {
    }

    /**
     * vtRpPackHdrForMainのDAOを設定します。
     * 
     * @param vtRpPackHdrForMainDao vtRpPackHdrForMainのDao
     */
    public void setVtRpPackHdrForMainDao(VtRpPackHdrForMainDao vtRpPackHdrForMainDao) {
        this.vtRpPackHdrForMainDao = vtRpPackHdrForMainDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackHdrForMainService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForMainCriteriaDomain)
     */
    public List<VtRpPackHdrForMainDomain> searchByCondition(VtRpPackHdrForMainCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackHdrForMainDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackHdrForMainService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForMainCriteriaDomain)
     */
    public List<VtRpPackHdrForMainDomain> searchByConditionForPaging(VtRpPackHdrForMainCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackHdrForMainDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackHdrForMainService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForMainCriteriaDomain)
     */
    public int searchCount(VtRpPackHdrForMainCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackHdrForMainDao.searchCount(criteria);
    }


}
