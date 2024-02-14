/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.LB001TtEdiRcvOdrReportByDetailDomain;
import com.globaldenso.eca0027.core.business.domain.LB001VtRpOdrRcvErrReportByHdrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LB001TtEdiRcvOdrReportByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LB001VtRpOdrRcvErrReportByHdrCriteriaDomain;

/**
 * The DAO interface when creating a form of LB001 series.
 * <br />LB001の帳票を作成するときに使用するDAOのインターフェースです。
 * <pre>
 * bean id:rpOdrRcvDao
 * </pre>
 * 
 * @author $Author: tosinori $
 * @version $Revision: 8890 $
 */
public interface RpOdrRcvDao {

    /**
     * Get the detail information from Edi Receive Order Error Report.
     * <br />EDI受注エラーレポートT(ヘッダ)から明細情報を取得します。
     * <pre>
     * - Search Edi Receive Order Error Report
     *   an argument criteriaDomain, call the searchVtRpOdrRcvErrReportHdr(LB001VtRpOdrRcvErrReportByHdrCriteriaDomain)
     * 
     * - To return the data retrieved
     * </pre>
     * <pre>
     * - EDI受注エラーレポートT(ヘッダ)を検索
     *     criteriaDomainを引数に、{@link RpOdrRcvDao#searchVtRpOdrRcvErrReportHdr(LB001VtRpOdrRcvErrReportByHdrCriteriaDomain)}を呼び出します。
     *     
     * - 取得したデータを返却
     * </pre>
     *
     * @param criteria LB001VtRpOdrRcvErrReportByHdrCriteriaDomain 
     * @return LB001VtRpOdrRcvErrReportByHdrDomain
     * @throws ApplicationException application exception
     */
    List<LB001VtRpOdrRcvErrReportByHdrDomain> searchVtRpOdrRcvErrReportHdr(LB001VtRpOdrRcvErrReportByHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * Get the detail information from Edi Receive Order Error Report.
     * <br />EDI受注エラーレポートT(明細)から明細情報を取得します。
     * <pre>
     * - Search Edi Receive Order Error Report
     *   an argument criteriaDomain, call the searchTtEdiRcvOdrReportByDetail(LB001TtEdiRcvOdrReportByDetailCriteriaDomain)
     * 
     * - To return the data retrieved
     * </pre>
     * <pre>
     * - EDI受注エラーレポートT(明細)を検索
     *     criteriaDomainを引数に、{@link RpOdrRcvDao#searchTtEdiRcvOdrReportByDetail(LB001TtEdiRcvOdrReportByDetailCriteriaDomain)}を呼び出します。
     *     
     * - 取得したデータを返却
     * </pre>
     *
     * @param criteria LB001TtEdiRcvOdrReportByDetailCriteriaDomain 
     * @return LB001TtEdiRcvOdrReportByDetailDomain
     * @throws ApplicationException application exception
     */
    List<LB001TtEdiRcvOdrReportByDetailDomain> searchTtEdiRcvOdrReportByDetail(LB001TtEdiRcvOdrReportByDetailCriteriaDomain criteria) throws ApplicationException;

}
