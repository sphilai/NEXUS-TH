/*
 * PROJECT：eca0027
 * 
 * VmRpInvTplPkgHeader のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplPkgHeaderDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplPkgHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmRpInvTplPkgHeaderDomain;


/**
 * VmRpInvTplPkgHeader のService実装クラスです。<BR>
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
public class VmRpInvTplPkgHeaderServiceImpl implements VmRpInvTplPkgHeaderService {

    /**
     * vmRpInvTplPkgHeaderのDAO
     */
    private VmRpInvTplPkgHeaderDao vmRpInvTplPkgHeaderDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplPkgHeaderServiceImpl() {
    }

    /**
     * vmRpInvTplPkgHeaderのDAOを設定します。
     * 
     * @param vmRpInvTplPkgHeaderDao vmRpInvTplPkgHeaderのDao
     */
    public void setVmRpInvTplPkgHeaderDao(VmRpInvTplPkgHeaderDao vmRpInvTplPkgHeaderDao) {
        this.vmRpInvTplPkgHeaderDao = vmRpInvTplPkgHeaderDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpInvTplPkgHeaderService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplPkgHeaderCriteriaDomain)
     */
    public List<VmRpInvTplPkgHeaderDomain> searchByCondition(VmRpInvTplPkgHeaderCriteriaDomain criteria) throws ApplicationException {
        return vmRpInvTplPkgHeaderDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpInvTplPkgHeaderService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplPkgHeaderCriteriaDomain)
     */
    public List<VmRpInvTplPkgHeaderDomain> searchByConditionForPaging(VmRpInvTplPkgHeaderCriteriaDomain criteria) throws ApplicationException {
        return vmRpInvTplPkgHeaderDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpInvTplPkgHeaderService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplPkgHeaderCriteriaDomain)
     */
    public int searchCount(VmRpInvTplPkgHeaderCriteriaDomain criteria) throws ApplicationException {
        return vmRpInvTplPkgHeaderDao.searchCount(criteria);
    }


}
