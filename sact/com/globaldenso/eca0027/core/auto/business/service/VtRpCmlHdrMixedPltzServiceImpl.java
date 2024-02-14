/*
 * PROJECT：eca0027
 * 
 * VtRpCmlHdrMixedPltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/08/02  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlHdrMixedPltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpCmlHdrMixedPltzDomain;


/**
 * VtRpCmlHdrMixedPltz のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/02 15:47:26<BR>
 * 
 * テーブル定義から2014/08/02に自動生成したモジュールです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12982 $
 */
public class VtRpCmlHdrMixedPltzServiceImpl implements VtRpCmlHdrMixedPltzService {

    /**
     * vtRpCmlHdrMixedPltzのDAO
     */
    private VtRpCmlHdrMixedPltzDao vtRpCmlHdrMixedPltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpCmlHdrMixedPltzServiceImpl() {
    }

    /**
     * vtRpCmlHdrMixedPltzのDAOを設定します。
     * 
     * @param vtRpCmlHdrMixedPltzDao vtRpCmlHdrMixedPltzのDao
     */
    public void setVtRpCmlHdrMixedPltzDao(VtRpCmlHdrMixedPltzDao vtRpCmlHdrMixedPltzDao) {
        this.vtRpCmlHdrMixedPltzDao = vtRpCmlHdrMixedPltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpCmlHdrMixedPltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain)
     */
    public List<VtRpCmlHdrMixedPltzDomain> searchByCondition(VtRpCmlHdrMixedPltzCriteriaDomain criteria) throws ApplicationException {
        return vtRpCmlHdrMixedPltzDao.searchByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpCmlHdrMixedPltzService#searchL1008ByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain)
     */
    public List<VtRpCmlHdrMixedPltzDomain> searchL1008ByCondition(VtRpCmlHdrMixedPltzCriteriaDomain criteria) throws ApplicationException {
        return vtRpCmlHdrMixedPltzDao.searchL1008ByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpCmlHdrMixedPltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain)
     */
    public List<VtRpCmlHdrMixedPltzDomain> searchByConditionForPaging(VtRpCmlHdrMixedPltzCriteriaDomain criteria) throws ApplicationException {
        return vtRpCmlHdrMixedPltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpCmlHdrMixedPltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain)
     */
    public int searchCount(VtRpCmlHdrMixedPltzCriteriaDomain criteria) throws ApplicationException {
        return vtRpCmlHdrMixedPltzDao.searchCount(criteria);
    }


}
