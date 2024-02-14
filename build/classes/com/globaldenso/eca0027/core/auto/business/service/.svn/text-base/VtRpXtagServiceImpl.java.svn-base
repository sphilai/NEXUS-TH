/*
 * PROJECT：eca0027
 * 
 * VtRpXtag のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtRpXtagDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpXtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpXtagDomain;


/**
 * VtRpXtag のService実装クラスです。<BR>
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
public class VtRpXtagServiceImpl implements VtRpXtagService {

    /**
     * vtRpXtagのDAO
     */
    private VtRpXtagDao vtRpXtagDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpXtagServiceImpl() {
    }

    /**
     * vtRpXtagのDAOを設定します。
     * 
     * @param vtRpXtagDao vtRpXtagのDao
     */
    public void setVtRpXtagDao(VtRpXtagDao vtRpXtagDao) {
        this.vtRpXtagDao = vtRpXtagDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpXtagService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpXtagCriteriaDomain)
     */
    public List<VtRpXtagDomain> searchByCondition(VtRpXtagCriteriaDomain criteria) throws ApplicationException {
        return vtRpXtagDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpXtagService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpXtagCriteriaDomain)
     */
    public List<VtRpXtagDomain> searchByConditionForPaging(VtRpXtagCriteriaDomain criteria) throws ApplicationException {
        return vtRpXtagDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtRpXtagService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpXtagCriteriaDomain)
     */
    public int searchCount(VtRpXtagCriteriaDomain criteria) throws ApplicationException {
        return vtRpXtagDao.searchCount(criteria);
    }


}
