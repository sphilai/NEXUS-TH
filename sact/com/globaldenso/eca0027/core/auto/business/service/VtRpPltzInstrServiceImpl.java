/*
 * PROJECT：eca0027
 * 
 * VtRpPltzInstr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/04/12  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpPltzInstrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPltzInstrDomain;


/**
 * VtRpPltzInstr のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/04/12 13:45:52<BR>
 * 
 * テーブル定義から2017/04/12に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 14083 $
 */
public class VtRpPltzInstrServiceImpl implements VtRpPltzInstrService {

    /**
     * vtRpPltzInstrのDAO
     */
    private VtRpPltzInstrDao vtRpPltzInstrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPltzInstrServiceImpl() {
    }

    /**
     * vtRpPltzInstrのDAOを設定します。
     * 
     * @param vtRpPltzInstrDao vtRpPltzInstrのDao
     */
    public void setVtRpPltzInstrDao(VtRpPltzInstrDao vtRpPltzInstrDao) {
        this.vtRpPltzInstrDao = vtRpPltzInstrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPltzInstrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain)
     */
    public List<VtRpPltzInstrDomain> searchByCondition(VtRpPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return vtRpPltzInstrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPltzInstrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain)
     */
    public List<VtRpPltzInstrDomain> searchByConditionForPaging(VtRpPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return vtRpPltzInstrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPltzInstrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain)
     */
    public int searchCount(VtRpPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return vtRpPltzInstrDao.searchCount(criteria);
    }


}
