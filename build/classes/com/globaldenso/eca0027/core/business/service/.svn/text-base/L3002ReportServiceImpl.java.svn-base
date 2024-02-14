/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PRINT_REPORT_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_DETAIL_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L3002;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L3002ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L3002ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The class for generate L3002 report.
 * 
 * @author Chonthicha.A
 * @version 1.00
 */
public class L3002ReportServiceImpl extends AbstractReportServiceImpl implements L3002ReportService {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * W3TransferService service.
     */
    protected W3TransferCarryOutListService w3TransferCarryOutListService;

    /**
     * Default Constructor.
     */
    public L3002ReportServiceImpl() {
    }

    // ------------------- Setter of dependent services -------------------
    /**
     * Setter method for commonService.
     * 
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for w3TransferService.
     * 
     * @param w3TransferCarryOutListService Set for
     *            W3TransferCarryOutListService
     */
    public void setW3TransferCarryOutListService(
        W3TransferCarryOutListService w3TransferCarryOutListService) {
        this.w3TransferCarryOutListService = w3TransferCarryOutListService;
    }

    // ---------------------------- Search methods -----------------------------
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.L3002ReportService#searchCarryOutListItemNo(
     *      com.globaldenso.eca0027.core.business.domain.L3002ReportDomain)
     */
    public File searchCarryOutListItemNo(L3002ReportDomain criteria) throws ApplicationException {
        W3TransferCarryOutListCriteriaDomain w3TransferCarryOutListCriteriaDomain = new W3TransferCarryOutListCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(w3TransferCarryOutListCriteriaDomain, criteria,
            REPORT_DETAIL_DATE_FORMAT);

        // Search Data
        List<? extends W3TransferDomain> resultW3TransferDomainList = w3TransferCarryOutListService
            .searchPrintCarryOutListByItemNo(w3TransferCarryOutListCriteriaDomain);

        // Get first record for Header of report.
        W3TransferDomain resultFirstW3TransferDomain = resultW3TransferDomainList.get(0);

        // Domain transfer
        // Time zone conversion date of Shipper
        Date sysdate = DateUtil.convertTime(new Date(), commonService
            .searchTimezone(resultFirstW3TransferDomain.getShipperCd()));
        String formatedSysdate = DateUtil.formatDate(sysdate, PRINT_REPORT_DATE_FORMAT);

        // Result domain -> document domain transfer
        L3002ReportDomain l3002ReportDomain = new L3002ReportDomain();
        CommonUtil.copyPropertiesDomainToDomain(l3002ReportDomain,
            resultW3TransferDomainList.get(0), REPORT_DETAIL_DATE_FORMAT);
        l3002ReportDomain.setPrintDt(formatedSysdate);
        l3002ReportDomain.setCarryOutCompCd(criteria.getCarryOutCompCd());
        l3002ReportDomain.setCarryOutWhCd(criteria.getCarryOutWhCd());
        List<L3002ReportDetailDomain> l3002ReportDetailDomainList = new ArrayList<L3002ReportDetailDomain>();
        for (W3TransferDomain w3TransferDomain : resultW3TransferDomainList) {
            // SACT domain -> document domain transfer
            L3002ReportDetailDomain l3002ReportDetailDomain = new L3002ReportDetailDomain();
            CommonUtil.copyPropertiesDomainToDomain(l3002ReportDetailDomain,
                w3TransferDomain, REPORT_DETAIL_DATE_FORMAT);
            l3002ReportDetailDomainList.add(l3002ReportDetailDomain);
        }
        l3002ReportDomain.setDetailDomainList(l3002ReportDetailDomainList);

        // PDF file generation
        File resultFile = super.createReport(REPORT_ID_L3002, l3002ReportDomain);

        return resultFile;
    }
}
