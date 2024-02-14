/*
 * PROJECT：eca0027
 * 
 * VtRpSlsCntrctAtchedRt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/08/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedRtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctAtchedRtDomain;


/**
 * VtRpSlsCntrctAtchedRt のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/08/18 17:18:16<BR>
 * 
 * テーブル定義から2015/08/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11913 $
 */
public class VtRpSlsCntrctAtchedRtServiceImpl implements VtRpSlsCntrctAtchedRtService {

    /**
     * vtRpSlsCntrctAtchedRtのDAO
     */
    private VtRpSlsCntrctAtchedRtDao vtRpSlsCntrctAtchedRtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSlsCntrctAtchedRtServiceImpl() {
    }

    /**
     * vtRpSlsCntrctAtchedRtのDAOを設定します。
     * 
     * @param vtRpSlsCntrctAtchedRtDao vtRpSlsCntrctAtchedRtのDao
     */
    public void setVtRpSlsCntrctAtchedRtDao(VtRpSlsCntrctAtchedRtDao vtRpSlsCntrctAtchedRtDao) {
        this.vtRpSlsCntrctAtchedRtDao = vtRpSlsCntrctAtchedRtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctAtchedRtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedRtCriteriaDomain)
     */
    public List<VtRpSlsCntrctAtchedRtDomain> searchByCondition(VtRpSlsCntrctAtchedRtCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctAtchedRtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctAtchedRtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedRtCriteriaDomain)
     */
    public List<VtRpSlsCntrctAtchedRtDomain> searchByConditionForPaging(VtRpSlsCntrctAtchedRtCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctAtchedRtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctAtchedRtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedRtCriteriaDomain)
     */
    public int searchCount(VtRpSlsCntrctAtchedRtCriteriaDomain criteria) throws ApplicationException {
        return vtRpSlsCntrctAtchedRtDao.searchCount(criteria);
    }


}
