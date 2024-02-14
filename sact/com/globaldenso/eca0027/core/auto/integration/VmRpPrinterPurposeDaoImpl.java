/*
 * PROJECT：eca0027
 * 
 * VmRpPrinterPurpose のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/24  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VmRpPrinterPurposeDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpPrinterPurposeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmRpPrinterPurposeDomain;


/**
 * VmRpPrinterPurpose のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/24 17:56:36<BR>
 * 
 * テーブル定義から2014/02/24に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmRpPrinterPurposeDaoImpl extends SqlMapClientDaoSupport implements VmRpPrinterPurposeDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpPrinterPurposeDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpPrinterPurposeDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpPrinterPurposeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmRpPrinterPurposeDomain> searchByCondition(VmRpPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return (List<VmRpPrinterPurposeDomain>)getSqlMapClientTemplate()
                    .queryForList("VmRpPrinterPurpose.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpPrinterPurposeDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpPrinterPurposeCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmRpPrinterPurposeDomain> searchByConditionForPaging(VmRpPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        return (List<VmRpPrinterPurposeDomain>)getSqlMapClientTemplate()
                    .queryForList("VmRpPrinterPurpose.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpPrinterPurposeDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpPrinterPurposeCriteriaDomain)
     */
    public int searchCount(VmRpPrinterPurposeCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VmRpPrinterPurpose.SearchCount", criteria);
        return cnt;
    }


}
