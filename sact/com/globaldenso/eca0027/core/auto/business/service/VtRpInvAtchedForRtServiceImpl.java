/*
 * PROJECT：eca0027
 * 
 * VtRpInvAtchedForRt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/08/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForRtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvAtchedForRtDomain;


/**
 * VtRpInvAtchedForRt のService実装クラスです。<BR>
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
public class VtRpInvAtchedForRtServiceImpl implements VtRpInvAtchedForRtService {

    /**
     * vtRpInvAtchedForRtのDAO
     */
    private VtRpInvAtchedForRtDao vtRpInvAtchedForRtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvAtchedForRtServiceImpl() {
    }

    /**
     * vtRpInvAtchedForRtのDAOを設定します。
     * 
     * @param vtRpInvAtchedForRtDao vtRpInvAtchedForRtのDao
     */
    public void setVtRpInvAtchedForRtDao(VtRpInvAtchedForRtDao vtRpInvAtchedForRtDao) {
        this.vtRpInvAtchedForRtDao = vtRpInvAtchedForRtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvAtchedForRtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForRtCriteriaDomain)
     */
    public List<VtRpInvAtchedForRtDomain> searchByCondition(VtRpInvAtchedForRtCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvAtchedForRtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvAtchedForRtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForRtCriteriaDomain)
     */
    public List<VtRpInvAtchedForRtDomain> searchByConditionForPaging(VtRpInvAtchedForRtCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvAtchedForRtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvAtchedForRtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForRtCriteriaDomain)
     */
    public int searchCount(VtRpInvAtchedForRtCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvAtchedForRtDao.searchCount(criteria);
    }


}
