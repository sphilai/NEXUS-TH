/*
 * PROJECT：eca0027
 * 
 * VmRpInvTpl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmRpInvTplDomain;


/**
 * VmRpInvTpl のService実装クラスです。<BR>
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
public class VmRpInvTplServiceImpl implements VmRpInvTplService {

    /**
     * vmRpInvTplのDAO
     */
    private VmRpInvTplDao vmRpInvTplDao;

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplServiceImpl() {
    }

    /**
     * vmRpInvTplのDAOを設定します。
     * 
     * @param vmRpInvTplDao vmRpInvTplのDao
     */
    public void setVmRpInvTplDao(VmRpInvTplDao vmRpInvTplDao) {
        this.vmRpInvTplDao = vmRpInvTplDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpInvTplService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplCriteriaDomain)
     */
    public List<VmRpInvTplDomain> searchByCondition(VmRpInvTplCriteriaDomain criteria) throws ApplicationException {
        return vmRpInvTplDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpInvTplService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplCriteriaDomain)
     */
    public List<VmRpInvTplDomain> searchByConditionForPaging(VmRpInvTplCriteriaDomain criteria) throws ApplicationException {
        return vmRpInvTplDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.VmRpInvTplService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplCriteriaDomain)
     */
    public int searchCount(VmRpInvTplCriteriaDomain criteria) throws ApplicationException {
        return vmRpInvTplDao.searchCount(criteria);
    }


}
