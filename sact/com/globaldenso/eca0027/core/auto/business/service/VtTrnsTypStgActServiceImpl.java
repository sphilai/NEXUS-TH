/*
 * PROJECT：eca0027
 * 
 * VtTrnsTypStgAct のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtTrnsTypStgActDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtTrnsTypStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtTrnsTypStgActDomain;


/**
 * VtTrnsTypStgAct のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/05 10:41:01<BR>
 * 
 * テーブル定義から2014/03/05に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtTrnsTypStgActServiceImpl implements VtTrnsTypStgActService {

    /**
     * vtTrnsTypStgActのDAO
     */
    private VtTrnsTypStgActDao vtTrnsTypStgActDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtTrnsTypStgActServiceImpl() {
    }

    /**
     * vtTrnsTypStgActのDAOを設定します。
     * 
     * @param vtTrnsTypStgActDao vtTrnsTypStgActのDao
     */
    public void setVtTrnsTypStgActDao(VtTrnsTypStgActDao vtTrnsTypStgActDao) {
        this.vtTrnsTypStgActDao = vtTrnsTypStgActDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtTrnsTypStgActService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtTrnsTypStgActCriteriaDomain)
     */
    public List<VtTrnsTypStgActDomain> searchByCondition(VtTrnsTypStgActCriteriaDomain criteria) throws ApplicationException {
        return vtTrnsTypStgActDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtTrnsTypStgActService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtTrnsTypStgActCriteriaDomain)
     */
    public List<VtTrnsTypStgActDomain> searchByConditionForPaging(VtTrnsTypStgActCriteriaDomain criteria) throws ApplicationException {
        return vtTrnsTypStgActDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtTrnsTypStgActService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtTrnsTypStgActCriteriaDomain)
     */
    public int searchCount(VtTrnsTypStgActCriteriaDomain criteria) throws ApplicationException {
        return vtTrnsTypStgActDao.searchCount(criteria);
    }


}
