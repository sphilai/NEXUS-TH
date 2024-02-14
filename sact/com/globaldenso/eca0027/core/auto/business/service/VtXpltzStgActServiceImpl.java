/*
 * PROJECT：eca0027
 * 
 * VtXpltzStgAct のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VtXpltzStgActDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtXpltzStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtXpltzStgActDomain;


/**
 * VtXpltzStgAct のService実装クラスです。<BR>
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
public class VtXpltzStgActServiceImpl implements VtXpltzStgActService {

    /**
     * vtXpltzStgActのDAO
     */
    private VtXpltzStgActDao vtXpltzStgActDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VtXpltzStgActServiceImpl() {
    }

    /**
     * vtXpltzStgActのDAOを設定します。
     * 
     * @param vtXpltzStgActDao vtXpltzStgActのDao
     */
    public void setVtXpltzStgActDao(VtXpltzStgActDao vtXpltzStgActDao) {
        this.vtXpltzStgActDao = vtXpltzStgActDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtXpltzStgActService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtXpltzStgActCriteriaDomain)
     */
    public List<VtXpltzStgActDomain> searchByCondition(VtXpltzStgActCriteriaDomain criteria) throws ApplicationException {
        return vtXpltzStgActDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtXpltzStgActService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtXpltzStgActCriteriaDomain)
     */
    public List<VtXpltzStgActDomain> searchByConditionForPaging(VtXpltzStgActCriteriaDomain criteria) throws ApplicationException {
        return vtXpltzStgActDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VtXpltzStgActService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtXpltzStgActCriteriaDomain)
     */
    public int searchCount(VtXpltzStgActCriteriaDomain criteria) throws ApplicationException {
        return vtXpltzStgActDao.searchCount(criteria);
    }


}
