/*
 * PROJECT：eca0027
 * 
 * VtPltzStgInstr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtPltzStgInstrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtPltzStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtPltzStgInstrDomain;


/**
 * VtPltzStgInstr のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/05 10:41:01<BR>
 * 
 * テーブル定義から2014/03/05に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtPltzStgInstrServiceImpl implements VtPltzStgInstrService {

    /**
     * vtPltzStgInstrのDAO
     */
    private VtPltzStgInstrDao vtPltzStgInstrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtPltzStgInstrServiceImpl() {
    }

    /**
     * vtPltzStgInstrのDAOを設定します。
     * 
     * @param vtPltzStgInstrDao vtPltzStgInstrのDao
     */
    public void setVtPltzStgInstrDao(VtPltzStgInstrDao vtPltzStgInstrDao) {
        this.vtPltzStgInstrDao = vtPltzStgInstrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtPltzStgInstrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtPltzStgInstrCriteriaDomain)
     */
    public List<VtPltzStgInstrDomain> searchByCondition(VtPltzStgInstrCriteriaDomain criteria) throws ApplicationException {
        return vtPltzStgInstrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtPltzStgInstrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtPltzStgInstrCriteriaDomain)
     */
    public List<VtPltzStgInstrDomain> searchByConditionForPaging(VtPltzStgInstrCriteriaDomain criteria) throws ApplicationException {
        return vtPltzStgInstrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtPltzStgInstrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtPltzStgInstrCriteriaDomain)
     */
    public int searchCount(VtPltzStgInstrCriteriaDomain criteria) throws ApplicationException {
        return vtPltzStgInstrDao.searchCount(criteria);
    }


}
