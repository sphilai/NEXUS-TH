/*
 * PROJECT：eca0027
 * 
 * VtRpOdrRcvErrReportHdr のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpOdrRcvErrReportHdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpOdrRcvErrReportHdrDomain;


/**
 * VtRpOdrRcvErrReportHdr のDAO実装クラスです。<BR>
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
public class VtRpOdrRcvErrReportHdrDaoImpl extends SqlMapClientDaoSupport implements VtRpOdrRcvErrReportHdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpOdrRcvErrReportHdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpOdrRcvErrReportHdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpOdrRcvErrReportHdrDomain> searchByCondition(VtRpOdrRcvErrReportHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpOdrRcvErrReportHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpOdrRcvErrReportHdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpOdrRcvErrReportHdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpOdrRcvErrReportHdrDomain> searchByConditionForPaging(VtRpOdrRcvErrReportHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpOdrRcvErrReportHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpOdrRcvErrReportHdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpOdrRcvErrReportHdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain)
     */
    public int searchCount(VtRpOdrRcvErrReportHdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpOdrRcvErrReportHdr.SearchCount", criteria);
        return cnt;
    }


}
