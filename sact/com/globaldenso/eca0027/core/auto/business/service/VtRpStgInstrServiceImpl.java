/*
 * PROJECT：eca0027
 * 
 * VtRpStgInstr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/25  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpStgInstrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpStgInstrDomain;


/**
 * VtRpStgInstr のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/25 13:55:48<BR>
 * 
 * テーブル定義から2014/03/25に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpStgInstrServiceImpl implements VtRpStgInstrService {

    /**
     * vtRpStgInstrのDAO
     */
    private VtRpStgInstrDao vtRpStgInstrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpStgInstrServiceImpl() {
    }

    /**
     * vtRpStgInstrのDAOを設定します。
     * 
     * @param vtRpStgInstrDao vtRpStgInstrのDao
     */
    public void setVtRpStgInstrDao(VtRpStgInstrDao vtRpStgInstrDao) {
        this.vtRpStgInstrDao = vtRpStgInstrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpStgInstrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgInstrCriteriaDomain)
     */
    public List<VtRpStgInstrDomain> searchByCondition(VtRpStgInstrCriteriaDomain criteria) throws ApplicationException {
        return vtRpStgInstrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpStgInstrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgInstrCriteriaDomain)
     */
    public List<VtRpStgInstrDomain> searchByConditionForPaging(VtRpStgInstrCriteriaDomain criteria) throws ApplicationException {
        return vtRpStgInstrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpStgInstrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgInstrCriteriaDomain)
     */
    public int searchCount(VtRpStgInstrCriteriaDomain criteria) throws ApplicationException {
        return vtRpStgInstrDao.searchCount(criteria);
    }


}
