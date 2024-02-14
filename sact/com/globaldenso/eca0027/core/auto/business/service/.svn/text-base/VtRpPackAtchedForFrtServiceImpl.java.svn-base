/*
 * PROJECT：eca0027
 * 
 * VtRpPackAtchedForFrt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpPackAtchedForFrtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackAtchedForFrtDomain;


/**
 * VtRpPackAtchedForFrt のService実装クラスです。<BR>
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
public class VtRpPackAtchedForFrtServiceImpl implements VtRpPackAtchedForFrtService {

    /**
     * vtRpPackAtchedForFrtのDAO
     */
    private VtRpPackAtchedForFrtDao vtRpPackAtchedForFrtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackAtchedForFrtServiceImpl() {
    }

    /**
     * vtRpPackAtchedForFrtのDAOを設定します。
     * 
     * @param vtRpPackAtchedForFrtDao vtRpPackAtchedForFrtのDao
     */
    public void setVtRpPackAtchedForFrtDao(VtRpPackAtchedForFrtDao vtRpPackAtchedForFrtDao) {
        this.vtRpPackAtchedForFrtDao = vtRpPackAtchedForFrtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackAtchedForFrtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForFrtCriteriaDomain)
     */
    public List<VtRpPackAtchedForFrtDomain> searchByCondition(VtRpPackAtchedForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackAtchedForFrtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackAtchedForFrtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForFrtCriteriaDomain)
     */
    public List<VtRpPackAtchedForFrtDomain> searchByConditionForPaging(VtRpPackAtchedForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackAtchedForFrtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackAtchedForFrtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForFrtCriteriaDomain)
     */
    public int searchCount(VtRpPackAtchedForFrtCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackAtchedForFrtDao.searchCount(criteria);
    }


}
