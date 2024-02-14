/*
 * PROJECT：eca0027
 * 
 * VtRpMixtag のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpMixtagDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpMixtagDomain;


/**
 * VtRpMixtag のService実装クラスです。<BR>
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
public class VtRpMixtagServiceImpl implements VtRpMixtagService {

    /**
     * vtRpMixtagのDAO
     */
    private VtRpMixtagDao vtRpMixtagDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpMixtagServiceImpl() {
    }

    /**
     * vtRpMixtagのDAOを設定します。
     * 
     * @param vtRpMixtagDao vtRpMixtagのDao
     */
    public void setVtRpMixtagDao(VtRpMixtagDao vtRpMixtagDao) {
        this.vtRpMixtagDao = vtRpMixtagDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpMixtagService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain)
     */
    public List<VtRpMixtagDomain> searchByCondition(VtRpMixtagCriteriaDomain criteria) throws ApplicationException {
        return vtRpMixtagDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpMixtagService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain)
     */
    public List<VtRpMixtagDomain> searchByConditionForPaging(VtRpMixtagCriteriaDomain criteria) throws ApplicationException {
        return vtRpMixtagDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpMixtagService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain)
     */
    public int searchCount(VtRpMixtagCriteriaDomain criteria) throws ApplicationException {
        return vtRpMixtagDao.searchCount(criteria);
    }


}
