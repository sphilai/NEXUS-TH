/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIXED_PART_DESC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIXED_PART_FLG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PRINT_REPORT_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_DETAIL_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L3001;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L3001ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L3001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The class for generate L3001 report.
 * 
 * @author Chonthicha A.
 * @version 1.00
 */
public class L3001ReportServiceImpl extends AbstractReportServiceImpl implements
    L3001ReportService {

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
    public L3001ReportServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.service.L3001ReportService#searchPrintCarryOutListByCml(
     *      com.globaldenso.eca0027.core.business.domain.L3001ReportDomain)
     */
    public File searchPrintCarryOutListByCml(L3001ReportDomain criteria)
        throws ApplicationException {
        W3TransferCarryOutListCriteriaDomain w3TransferCarryOutListCriteriaDomain = new W3TransferCarryOutListCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(
            w3TransferCarryOutListCriteriaDomain, criteria,
            REPORT_DETAIL_DATE_FORMAT);
        w3TransferCarryOutListCriteriaDomain.setFmCmlIssueDate(DateUtil
            .parseDate(criteria.getFmCmlIssueDate(), "dd/MM/yy"));
        w3TransferCarryOutListCriteriaDomain.setToCmlIssueDate(DateUtil
            .parseDate(criteria.getToCmlIssueDate(), "dd/MM/yy"));

        // Validate count data. In case count 0 will be error by AOP.
        w3TransferCarryOutListCriteriaDomain.setSearchCountCheckFlg(false);
        w3TransferCarryOutListService
            .searchCountCarryOutListByCml(w3TransferCarryOutListCriteriaDomain);

        // Search Data
        List<? extends W3TransferDomain> resultW3TransferDomainList = w3TransferCarryOutListService
            .searchPrintCarryOutListByCml(w3TransferCarryOutListCriteriaDomain);

        // Get first record for Header of report.
        W3TransferDomain resultFirstW3TransferDomain = resultW3TransferDomainList
            .get(0);

        // Domain transfer

        // Time zone conversion date of Shipper
        Date sysdate = DateUtil.convertTime(new Date(), commonService
            .searchTimezone(resultFirstW3TransferDomain.getShipperCd()));
        String formatedSysdate = DateUtil.formatDate(sysdate,
            PRINT_REPORT_DATE_FORMAT);

        // Result domain -> document domain transfer
        L3001ReportDomain l3001ReportDomain = new L3001ReportDomain();
        CommonUtil.copyPropertiesDomainToDomain(l3001ReportDomain,
            resultW3TransferDomainList.get(0), REPORT_DETAIL_DATE_FORMAT);
        l3001ReportDomain.setPrintDt(formatedSysdate);

        List<L3001ReportDetailDomain> l3001ReportDetailDomainList = new ArrayList<L3001ReportDetailDomain>();
        for (W3TransferDomain w3TransferDomain : resultW3TransferDomainList) {
            // SACT domain -> document domain transfer
            L3001ReportDetailDomain l3001ReportDetailDomain = new L3001ReportDetailDomain();
            CommonUtil.copyPropertiesDomainToDomain(l3001ReportDetailDomain,
                w3TransferDomain, REPORT_DETAIL_DATE_FORMAT);
            if (w3TransferDomain.getPkgFormTyp().equals(MIXED_PART_FLG)) {
                l3001ReportDetailDomain.setPltzItemNo(MIXED_PART_DESC);
            }
            l3001ReportDetailDomainList.add(l3001ReportDetailDomain);
        }
        l3001ReportDomain.setDetailDomainList(l3001ReportDetailDomainList);

        // PDF file generation

        File resultFile = super
            .createReport(REPORT_ID_L3001, l3001ReportDomain);

        return resultFile;
    }
}
