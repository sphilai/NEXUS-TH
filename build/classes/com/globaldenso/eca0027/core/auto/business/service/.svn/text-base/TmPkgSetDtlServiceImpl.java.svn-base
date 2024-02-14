/*
 * PROJECT：eca0027
 * 
 * TmPkgSetDtl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetDtlDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetDtlDomain;


/**
 * TmPkgSetDtl のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/05/15 10:10:46<BR>
 * 
 * テーブル定義から2015/05/15に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11315 $
 */
public class TmPkgSetDtlServiceImpl implements TmPkgSetDtlService {

    /**
     * tmPkgSetDtlのDAO
     */
    private TmPkgSetDtlDao tmPkgSetDtlDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSetDtlServiceImpl() {
    }

    /**
     * tmPkgSetDtlのDAOを設定します。
     * 
     * @param tmPkgSetDtlDao tmPkgSetDtlのDao
     */
    public void setTmPkgSetDtlDao(TmPkgSetDtlDao tmPkgSetDtlDao) {
        this.tmPkgSetDtlDao = tmPkgSetDtlDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSetDtlService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain)
     */
    public TmPkgSetDtlDomain searchByKey(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSetDtlDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSetDtlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain)
     */
    public List<TmPkgSetDtlDomain> searchByCondition(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSetDtlDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSetDtlService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain)
     */
    public List<TmPkgSetDtlDomain> searchByConditionForPaging(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSetDtlDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSetDtlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain)
     */
    public int searchCount(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSetDtlDao.searchCount(criteria);
    }


}
