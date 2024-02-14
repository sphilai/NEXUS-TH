/*
 * PROJECT：eca0027
 * 
 * VtRpCmlMixtagErrRep のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/10  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlMixtagErrRepDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpCmlMixtagErrRepDomain;


/**
 * VtRpCmlMixtagErrRep のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/10 11:06:48<BR>
 * 
 * テーブル定義から2014/06/10に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpCmlMixtagErrRepServiceImpl implements VtRpCmlMixtagErrRepService {

    /**
     * vtRpCmlMixtagErrRepのDAO
     */
    private VtRpCmlMixtagErrRepDao vtRpCmlMixtagErrRepDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpCmlMixtagErrRepServiceImpl() {
    }

    /**
     * vtRpCmlMixtagErrRepのDAOを設定します。
     * 
     * @param vtRpCmlMixtagErrRepDao vtRpCmlMixtagErrRepのDao
     */
    public void setVtRpCmlMixtagErrRepDao(VtRpCmlMixtagErrRepDao vtRpCmlMixtagErrRepDao) {
        this.vtRpCmlMixtagErrRepDao = vtRpCmlMixtagErrRepDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpCmlMixtagErrRepService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain)
     */
    public List<VtRpCmlMixtagErrRepDomain> searchByCondition(VtRpCmlMixtagErrRepCriteriaDomain criteria) throws ApplicationException {
        return vtRpCmlMixtagErrRepDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpCmlMixtagErrRepService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain)
     */
    public List<VtRpCmlMixtagErrRepDomain> searchByConditionForPaging(VtRpCmlMixtagErrRepCriteriaDomain criteria) throws ApplicationException {
        return vtRpCmlMixtagErrRepDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpCmlMixtagErrRepService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain)
     */
    public int searchCount(VtRpCmlMixtagErrRepCriteriaDomain criteria) throws ApplicationException {
        return vtRpCmlMixtagErrRepDao.searchCount(criteria);
    }


}
