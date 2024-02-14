/*
 * PROJECT：eca0027
 * 
 * TmPkgSpecHdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecHdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecHdrDomain;


/**
 * TmPkgSpecHdr のService実装クラスです。<BR>
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
public class TmPkgSpecHdrServiceImpl implements TmPkgSpecHdrService {

    /**
     * tmPkgSpecHdrのDAO
     */
    private TmPkgSpecHdrDao tmPkgSpecHdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSpecHdrServiceImpl() {
    }

    /**
     * tmPkgSpecHdrのDAOを設定します。
     * 
     * @param tmPkgSpecHdrDao tmPkgSpecHdrのDao
     */
    public void setTmPkgSpecHdrDao(TmPkgSpecHdrDao tmPkgSpecHdrDao) {
        this.tmPkgSpecHdrDao = tmPkgSpecHdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecHdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain)
     */
    public TmPkgSpecHdrDomain searchByKey(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecHdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecHdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain)
     */
    public List<TmPkgSpecHdrDomain> searchByCondition(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecHdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecHdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain)
     */
    public List<TmPkgSpecHdrDomain> searchByConditionForPaging(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecHdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecHdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain)
     */
    public int searchCount(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSpecHdrDao.searchCount(criteria);
    }


}
