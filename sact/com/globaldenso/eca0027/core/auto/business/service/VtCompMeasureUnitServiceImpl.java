/*
 * PROJECT：eca0027
 * 
 * VtCompMeasureUnit のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtCompMeasureUnitDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtCompMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;


/**
 * VtCompMeasureUnit のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/20 19:22:34<BR>
 * 
 * テーブル定義から2014/03/20に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtCompMeasureUnitServiceImpl implements VtCompMeasureUnitService {

    /**
     * vtCompMeasureUnitのDAO
     */
    private VtCompMeasureUnitDao vtCompMeasureUnitDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtCompMeasureUnitServiceImpl() {
    }

    /**
     * vtCompMeasureUnitのDAOを設定します。
     * 
     * @param vtCompMeasureUnitDao vtCompMeasureUnitのDao
     */
    public void setVtCompMeasureUnitDao(VtCompMeasureUnitDao vtCompMeasureUnitDao) {
        this.vtCompMeasureUnitDao = vtCompMeasureUnitDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtCompMeasureUnitService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtCompMeasureUnitCriteriaDomain)
     */
    public List<VtCompMeasureUnitDomain> searchByCondition(VtCompMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return vtCompMeasureUnitDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtCompMeasureUnitService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtCompMeasureUnitCriteriaDomain)
     */
    public List<VtCompMeasureUnitDomain> searchByConditionForPaging(VtCompMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return vtCompMeasureUnitDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtCompMeasureUnitService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtCompMeasureUnitCriteriaDomain)
     */
    public int searchCount(VtCompMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return vtCompMeasureUnitDao.searchCount(criteria);
    }


}