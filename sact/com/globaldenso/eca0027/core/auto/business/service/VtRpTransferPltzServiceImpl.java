/*
 * PROJECT：eca0027
 * 
 * VtRpTransferPltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/10/16  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferPltzDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpTransferPltzDomain;


/**
 * VtRpTransferPltz のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/10/16 17:05:03<BR>
 * 
 * テーブル定義から2015/10/16に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class VtRpTransferPltzServiceImpl implements VtRpTransferPltzService {

    /**
     * vtRpTransferPltzのDAO
     */
    private VtRpTransferPltzDao vtRpTransferPltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpTransferPltzServiceImpl() {
    }

    /**
     * vtRpTransferPltzのDAOを設定します。
     * 
     * @param vtRpTransferPltzDao vtRpTransferPltzのDao
     */
    public void setVtRpTransferPltzDao(VtRpTransferPltzDao vtRpTransferPltzDao) {
        this.vtRpTransferPltzDao = vtRpTransferPltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpTransferPltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferPltzCriteriaDomain)
     */
    public List<VtRpTransferPltzDomain> searchByCondition(VtRpTransferPltzCriteriaDomain criteria) throws ApplicationException {
        return vtRpTransferPltzDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpTransferPltzService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferPltzCriteriaDomain)
     */
    public List<VtRpTransferPltzDomain> searchByConditionForPaging(VtRpTransferPltzCriteriaDomain criteria) throws ApplicationException {
        return vtRpTransferPltzDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpTransferPltzService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferPltzCriteriaDomain)
     */
    public int searchCount(VtRpTransferPltzCriteriaDomain criteria) throws ApplicationException {
        return vtRpTransferPltzDao.searchCount(criteria);
    }


}
