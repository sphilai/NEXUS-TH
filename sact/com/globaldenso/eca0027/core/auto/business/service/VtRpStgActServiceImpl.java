/*
 * PROJECT：eca0027
 * 
 * VtRpStgAct のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/02  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpStgActDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpStgActDomain;


/**
 * VtRpStgAct のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/02 14:14:58<BR>
 * 
 * テーブル定義から2014/04/02に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpStgActServiceImpl implements VtRpStgActService {

    /**
     * vtRpStgActのDAO
     */
    private VtRpStgActDao vtRpStgActDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpStgActServiceImpl() {
    }

    /**
     * vtRpStgActのDAOを設定します。
     * 
     * @param vtRpStgActDao vtRpStgActのDao
     */
    public void setVtRpStgActDao(VtRpStgActDao vtRpStgActDao) {
        this.vtRpStgActDao = vtRpStgActDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpStgActService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgActCriteriaDomain)
     */
    public List<VtRpStgActDomain> searchByCondition(VtRpStgActCriteriaDomain criteria) throws ApplicationException {
        return vtRpStgActDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpStgActService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgActCriteriaDomain)
     */
    public List<VtRpStgActDomain> searchByConditionForPaging(VtRpStgActCriteriaDomain criteria) throws ApplicationException {
        return vtRpStgActDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpStgActService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgActCriteriaDomain)
     */
    public int searchCount(VtRpStgActCriteriaDomain criteria) throws ApplicationException {
        return vtRpStgActDao.searchCount(criteria);
    }


}
