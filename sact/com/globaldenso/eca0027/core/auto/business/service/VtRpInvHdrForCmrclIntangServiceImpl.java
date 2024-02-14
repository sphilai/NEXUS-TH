/*
 * PROJECT：eca0027
 * 
 * VtRpInvHdrForCmrclIntang のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForCmrclIntangDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForCmrclIntangCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvHdrForCmrclIntangDomain;


/**
 * VtRpInvHdrForCmrclIntang のService実装クラスです。<BR>
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
public class VtRpInvHdrForCmrclIntangServiceImpl implements VtRpInvHdrForCmrclIntangService {

    /**
     * vtRpInvHdrForCmrclIntangのDAO
     */
    private VtRpInvHdrForCmrclIntangDao vtRpInvHdrForCmrclIntangDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvHdrForCmrclIntangServiceImpl() {
    }

    /**
     * vtRpInvHdrForCmrclIntangのDAOを設定します。
     * 
     * @param vtRpInvHdrForCmrclIntangDao vtRpInvHdrForCmrclIntangのDao
     */
    public void setVtRpInvHdrForCmrclIntangDao(VtRpInvHdrForCmrclIntangDao vtRpInvHdrForCmrclIntangDao) {
        this.vtRpInvHdrForCmrclIntangDao = vtRpInvHdrForCmrclIntangDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForCmrclIntangService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForCmrclIntangCriteriaDomain)
     */
    public List<VtRpInvHdrForCmrclIntangDomain> searchByCondition(VtRpInvHdrForCmrclIntangCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvHdrForCmrclIntangDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForCmrclIntangService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForCmrclIntangCriteriaDomain)
     */
    public List<VtRpInvHdrForCmrclIntangDomain> searchByConditionForPaging(VtRpInvHdrForCmrclIntangCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvHdrForCmrclIntangDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForCmrclIntangService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForCmrclIntangCriteriaDomain)
     */
    public int searchCount(VtRpInvHdrForCmrclIntangCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvHdrForCmrclIntangDao.searchCount(criteria);
    }


}
