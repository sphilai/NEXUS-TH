/*
 * PROJECT：eca0027
 * 
 * TmPkgSpecDtl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecDtlDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecDtlDomain;


/**
 * TmPkgSpecDtl のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/05/15 10:10:46<BR>
 * 
 * テーブル定義から2015/05/15に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TmPkgSpecDtlServiceImpl implements TmPkgSpecDtlService {

    /**
     * tmPkgSpecDtlのDAO
     */
    private TmPkgSpecDtlDao tmPkgSpecDtlDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSpecDtlServiceImpl() {
    }

    /**
     * tmPkgSpecDtlのDAOを設定します。
     * 
     * @param tmPkgSpecDtlDao tmPkgSpecDtlのDao
     */
    public void setTmPkgSpecDtlDao(TmPkgSpecDtlDao tmPkgSpecDtlDao) {
        this.tmPkgSpecDtlDao = tmPkgSpecDtlDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecDtlService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain)
     */
    public TmPkgSpecDtlDomain searchByKey(TmPkgSpecDtlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecDtlDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecDtlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain)
     */
    public List<TmPkgSpecDtlDomain> searchByCondition(TmPkgSpecDtlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecDtlDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecDtlService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain)
     */
    public List<TmPkgSpecDtlDomain> searchByConditionForPaging(TmPkgSpecDtlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecDtlDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecDtlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain)
     */
    public int searchCount(TmPkgSpecDtlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecDtlDao.searchCount(criteria);
    }


}
