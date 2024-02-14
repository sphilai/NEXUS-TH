/*
 * PROJECT：eca0027
 * 
 * VtRpPackAtchedForErt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpPackAtchedForErtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForErtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackAtchedForErtDomain;


/**
 * VtRpPackAtchedForErt のService実装クラスです。<BR>
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
public class VtRpPackAtchedForErtServiceImpl implements VtRpPackAtchedForErtService {

    /**
     * vtRpPackAtchedForErtのDAO
     */
    private VtRpPackAtchedForErtDao vtRpPackAtchedForErtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackAtchedForErtServiceImpl() {
    }

    /**
     * vtRpPackAtchedForErtのDAOを設定します。
     * 
     * @param vtRpPackAtchedForErtDao vtRpPackAtchedForErtのDao
     */
    public void setVtRpPackAtchedForErtDao(VtRpPackAtchedForErtDao vtRpPackAtchedForErtDao) {
        this.vtRpPackAtchedForErtDao = vtRpPackAtchedForErtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackAtchedForErtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForErtCriteriaDomain)
     */
    public List<VtRpPackAtchedForErtDomain> searchByCondition(VtRpPackAtchedForErtCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackAtchedForErtDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackAtchedForErtService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForErtCriteriaDomain)
     */
    public List<VtRpPackAtchedForErtDomain> searchByConditionForPaging(VtRpPackAtchedForErtCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackAtchedForErtDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpPackAtchedForErtService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForErtCriteriaDomain)
     */
    public int searchCount(VtRpPackAtchedForErtCriteriaDomain criteria) throws ApplicationException {
        return vtRpPackAtchedForErtDao.searchCount(criteria);
    }


}
