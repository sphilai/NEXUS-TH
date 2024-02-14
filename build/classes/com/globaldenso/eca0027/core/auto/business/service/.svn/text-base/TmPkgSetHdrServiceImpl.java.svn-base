/*
 * PROJECT：eca0027
 * 
 * TmPkgSetHdr のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetHdrDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;


/**
 * TmPkgSetHdr のService実装クラスです。<BR>
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
public class TmPkgSetHdrServiceImpl implements TmPkgSetHdrService {

    /**
     * tmPkgSetHdrのDAO
     */
    private TmPkgSetHdrDao tmPkgSetHdrDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSetHdrServiceImpl() {
    }

    /**
     * tmPkgSetHdrのDAOを設定します。
     * 
     * @param tmPkgSetHdrDao tmPkgSetHdrのDao
     */
    public void setTmPkgSetHdrDao(TmPkgSetHdrDao tmPkgSetHdrDao) {
        this.tmPkgSetHdrDao = tmPkgSetHdrDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain)
     */
    public TmPkgSetHdrDomain searchByKey(TmPkgSetHdrCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSetHdrDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain)
     */
    public List<TmPkgSetHdrDomain> searchByCondition(TmPkgSetHdrCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSetHdrDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain)
     */
    public List<TmPkgSetHdrDomain> searchByConditionForPaging(TmPkgSetHdrCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSetHdrDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain)
     */
    public int searchCount(TmPkgSetHdrCriteriaDomain criteria) throws ApplicationException {
        return tmPkgSetHdrDao.searchCount(criteria);
    }


}
