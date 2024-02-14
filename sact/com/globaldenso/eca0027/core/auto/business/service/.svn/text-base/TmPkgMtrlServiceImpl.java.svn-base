/*
 * PROJECT：eca0027
 * 
 * TmPkgMtrl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPkgMtrlDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;


/**
 * TmPkgMtrl のService実装クラスです。<BR>
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
public class TmPkgMtrlServiceImpl implements TmPkgMtrlService {

    /**
     * tmPkgMtrlのDAO
     */
    private TmPkgMtrlDao tmPkgMtrlDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgMtrlServiceImpl() {
    }

    /**
     * tmPkgMtrlのDAOを設定します。
     * 
     * @param tmPkgMtrlDao tmPkgMtrlのDao
     */
    public void setTmPkgMtrlDao(TmPkgMtrlDao tmPkgMtrlDao) {
        this.tmPkgMtrlDao = tmPkgMtrlDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain)
     */
    public TmPkgMtrlDomain searchByKey(TmPkgMtrlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgMtrlDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain)
     */
    public List<TmPkgMtrlDomain> searchByCondition(TmPkgMtrlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgMtrlDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain)
     */
    public List<TmPkgMtrlDomain> searchByConditionForPaging(TmPkgMtrlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgMtrlDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain)
     */
    public int searchCount(TmPkgMtrlCriteriaDomain criteria) throws ApplicationException {
        return tmPkgMtrlDao.searchCount(criteria);
    }


}
