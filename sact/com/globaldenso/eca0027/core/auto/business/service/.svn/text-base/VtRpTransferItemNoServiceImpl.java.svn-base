/*
 * PROJECT：eca0027
 * 
 * VtRpTransferItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/07/22  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpTransferItemNoDomain;


/**
 * VtRpTransferItemNo のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/07/22 13:43:05<BR>
 * 
 * テーブル定義から2014/07/22に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class VtRpTransferItemNoServiceImpl implements VtRpTransferItemNoService {

    /**
     * vtRpTransferItemNoのDAO
     */
    private VtRpTransferItemNoDao vtRpTransferItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpTransferItemNoServiceImpl() {
    }

    /**
     * vtRpTransferItemNoのDAOを設定します。
     * 
     * @param vtRpTransferItemNoDao vtRpTransferItemNoのDao
     */
    public void setVtRpTransferItemNoDao(VtRpTransferItemNoDao vtRpTransferItemNoDao) {
        this.vtRpTransferItemNoDao = vtRpTransferItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpTransferItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferItemNoCriteriaDomain)
     */
    public List<VtRpTransferItemNoDomain> searchByCondition(VtRpTransferItemNoCriteriaDomain criteria) throws ApplicationException {
        return vtRpTransferItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpTransferItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferItemNoCriteriaDomain)
     */
    public List<VtRpTransferItemNoDomain> searchByConditionForPaging(VtRpTransferItemNoCriteriaDomain criteria) throws ApplicationException {
        return vtRpTransferItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpTransferItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferItemNoCriteriaDomain)
     */
    public int searchCount(VtRpTransferItemNoCriteriaDomain criteria) throws ApplicationException {
        return vtRpTransferItemNoDao.searchCount(criteria);
    }


}
