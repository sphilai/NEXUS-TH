/*
 * PROJECT：eca0027
 * 
 * VmRpInvTplScHeader のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplScHeaderDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplScHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmRpInvTplScHeaderDomain;


/**
 * VmRpInvTplScHeader のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 13:29:08<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmRpInvTplScHeaderServiceImpl implements VmRpInvTplScHeaderService {

    /**
     * vmRpInvTplScHeaderのDAO
     */
    private VmRpInvTplScHeaderDao vmRpInvTplScHeaderDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplScHeaderServiceImpl() {
    }

    /**
     * vmRpInvTplScHeaderのDAOを設定します。
     * 
     * @param vmRpInvTplScHeaderDao vmRpInvTplScHeaderのDao
     */
    public void setVmRpInvTplScHeaderDao(VmRpInvTplScHeaderDao vmRpInvTplScHeaderDao) {
        this.vmRpInvTplScHeaderDao = vmRpInvTplScHeaderDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpInvTplScHeaderService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplScHeaderCriteriaDomain)
     */
    public List<VmRpInvTplScHeaderDomain> searchByCondition(VmRpInvTplScHeaderCriteriaDomain criteria) throws ApplicationException {
        return vmRpInvTplScHeaderDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpInvTplScHeaderService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplScHeaderCriteriaDomain)
     */
    public List<VmRpInvTplScHeaderDomain> searchByConditionForPaging(VmRpInvTplScHeaderCriteriaDomain criteria) throws ApplicationException {
        return vmRpInvTplScHeaderDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpInvTplScHeaderService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplScHeaderCriteriaDomain)
     */
    public int searchCount(VmRpInvTplScHeaderCriteriaDomain criteria) throws ApplicationException {
        return vmRpInvTplScHeaderDao.searchCount(criteria);
    }


}
