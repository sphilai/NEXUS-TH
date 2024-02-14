/*
 * PROJECT：eca0027
 * 
 * VtRpPackHdrForFrt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForFrtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackHdrForFrtDomain;


/**
 * VtRpPackHdrForFrt のService実装クラスです。<BR>
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
public class VtRpPackHdrForFrtServiceImpl implements VtRpPackHdrForFrtService {

    /**
     * vtRpPackHdrForFrtのDAO
     */
    private VtRpPackHdrForFrtDao vtRpPackHdrForFrtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackHdrForFrtServiceImpl() {
    }

    /**
     * vtRpPackHdrForFrtのDAOを設定します。
     * 
     * @param vtRpPackHdrForFrtDao vtRpPackHdrForFrtのDao
     */
    public void setVtRpPackHdrForFrtDao(VtRpPackHdrForFrtDao vtRpPackHdrForFrtDao) {
        this.vtRpPackHdrForFrtDao = vtRpPackHdrForFrtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackHdrForFrtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForFrtCriteriaDomain)
     */
    public List<VtRpPackHdrForFrtDomain> searchByCondition(VtRpPackHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackHdrForFrtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackHdrForFrtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForFrtCriteriaDomain)
     */
    public List<VtRpPackHdrForFrtDomain> searchByConditionForPaging(VtRpPackHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackHdrForFrtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackHdrForFrtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForFrtCriteriaDomain)
     */
    public int searchCount(VtRpPackHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackHdrForFrtDao.searchCount(criteria);
    }


}
