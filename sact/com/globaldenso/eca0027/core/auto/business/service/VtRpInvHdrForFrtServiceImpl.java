/*
 * PROJECT：eca0027
 * 
 * VtRpInvHdrForFrt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/11/08  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForFrtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvHdrForFrtDomain;


/**
 * VtRpInvHdrForFrt のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/11/08 17:44:57<BR>
 * 
 * テーブル定義から2017/11/08に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15068 $
 */
public class VtRpInvHdrForFrtServiceImpl implements VtRpInvHdrForFrtService {

    /**
     * vtRpInvHdrForFrtのDAO
     */
    private VtRpInvHdrForFrtDao vtRpInvHdrForFrtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvHdrForFrtServiceImpl() {
    }

    /**
     * vtRpInvHdrForFrtのDAOを設定します。
     * 
     * @param vtRpInvHdrForFrtDao vtRpInvHdrForFrtのDao
     */
    public void setVtRpInvHdrForFrtDao(VtRpInvHdrForFrtDao vtRpInvHdrForFrtDao) {
        this.vtRpInvHdrForFrtDao = vtRpInvHdrForFrtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForFrtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForFrtCriteriaDomain)
     */
    public List<VtRpInvHdrForFrtDomain> searchByCondition(VtRpInvHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvHdrForFrtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForFrtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForFrtCriteriaDomain)
     */
    public List<VtRpInvHdrForFrtDomain> searchByConditionForPaging(VtRpInvHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvHdrForFrtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForFrtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForFrtCriteriaDomain)
     */
    public int searchCount(VtRpInvHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpInvHdrForFrtDao.searchCount(criteria);
    }


}
