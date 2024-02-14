/*
 * PROJECT：eca0027
 * 
 * VtRpSalesCntrctHdrForFrt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpSalesCntrctHdrForFrtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSalesCntrctHdrForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSalesCntrctHdrForFrtDomain;


/**
 * VtRpSalesCntrctHdrForFrt のService実装クラスです。<BR>
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
public class VtRpSalesCntrctHdrForFrtServiceImpl implements VtRpSalesCntrctHdrForFrtService {

    /**
     * vtRpSalesCntrctHdrForFrtのDAO
     */
    private VtRpSalesCntrctHdrForFrtDao vtRpSalesCntrctHdrForFrtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSalesCntrctHdrForFrtServiceImpl() {
    }

    /**
     * vtRpSalesCntrctHdrForFrtのDAOを設定します。
     * 
     * @param vtRpSalesCntrctHdrForFrtDao vtRpSalesCntrctHdrForFrtのDao
     */
    public void setVtRpSalesCntrctHdrForFrtDao(VtRpSalesCntrctHdrForFrtDao vtRpSalesCntrctHdrForFrtDao) {
        this.vtRpSalesCntrctHdrForFrtDao = vtRpSalesCntrctHdrForFrtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSalesCntrctHdrForFrtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSalesCntrctHdrForFrtCriteriaDomain)
     */
    public List<VtRpSalesCntrctHdrForFrtDomain> searchByCondition(VtRpSalesCntrctHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpSalesCntrctHdrForFrtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSalesCntrctHdrForFrtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSalesCntrctHdrForFrtCriteriaDomain)
     */
    public List<VtRpSalesCntrctHdrForFrtDomain> searchByConditionForPaging(VtRpSalesCntrctHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpSalesCntrctHdrForFrtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSalesCntrctHdrForFrtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSalesCntrctHdrForFrtCriteriaDomain)
     */
    public int searchCount(VtRpSalesCntrctHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpSalesCntrctHdrForFrtDao.searchCount(criteria);
    }


}
