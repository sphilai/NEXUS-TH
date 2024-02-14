/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.RpOdrRcvDao;
import com.globaldenso.eca0027.core.business.domain.LB001TtEdiRcvOdrReportByDetailDomain;
import com.globaldenso.eca0027.core.business.domain.LB001VtRpOdrRcvErrReportByHdrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LB001TtEdiRcvOdrReportByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LB001VtRpOdrRcvErrReportByHdrCriteriaDomain;


/**
 * The DAO implementation class to use for creating the form of LB001 series.<br />
 * LB001の帳票作成時に使用するDAO実装クラスです。
 *
 * @version $Revision: 1397 $
 */
public class RpOdrRcvDaoImpl extends SqlMapClientDaoSupport implements RpOdrRcvDao {

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public RpOdrRcvDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpOdrRcvDao#searchVtRpOdrRcvErrReportHdr(com.globaldenso.eca0027.core.business.domain.criteria.LB001VtRpOdrRcvErrReportByHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<LB001VtRpOdrRcvErrReportByHdrDomain> searchVtRpOdrRcvErrReportHdr(LB001VtRpOdrRcvErrReportByHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<LB001VtRpOdrRcvErrReportByHdrDomain>) getSqlMapClientTemplate().queryForList("RpOdrRcv.SearchVtRpOdrRcvErrReportHdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpOdrRcvDao#searchTtEdiRcvOdrReportByDetail(com.globaldenso.eca0027.core.business.domain.criteria.LB001TtEdiRcvOdrReportByDetailCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<LB001TtEdiRcvOdrReportByDetailDomain> searchTtEdiRcvOdrReportByDetail(LB001TtEdiRcvOdrReportByDetailCriteriaDomain criteria) throws ApplicationException {
        return (List<LB001TtEdiRcvOdrReportByDetailDomain>) getSqlMapClientTemplate().queryForList("RpOdrRcv.SearchTtEdiRcvOdrReportByDetail", criteria);
    }
}
