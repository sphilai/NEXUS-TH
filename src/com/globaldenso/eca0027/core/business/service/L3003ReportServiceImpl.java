/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PRINT_REPORT_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_TRANSFER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_TRANSFER_DCT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L3003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIXED_PART_FLG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIXED_PART_DESC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_DETAIL_DATE_FORMAT;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.qrcodegenerate.QrcodeGenerator;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpTransferPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpTransferPltzService;
import com.globaldenso.eca0027.core.business.domain.L3003ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L3003ReportDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * The class for generate L3003 report.
 * 
 * @author $Author: chonthicha.a@denso.co.th $
 * @version $Revision: $
 */
public class L3003ReportServiceImpl extends AbstractReportServiceImpl implements L3003ReportService {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * VtRpTransferPltzService service.
     */
    protected VtRpTransferPltzService vtRpTransferPltzService;

    /**
     * Default Constructor.
     */
    public L3003ReportServiceImpl() {
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
     * Setter method for vtRpTransferPltzService.
     * 
     * @param vtRpTransferPltzService Set for vtRpTransferPltzService
     */
    public void setVtRpTransferPltzService(VtRpTransferPltzService vtRpTransferPltzService) {
        this.vtRpTransferPltzService = vtRpTransferPltzService;
    }

    // ---------------------------- Search methods -----------------------------

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.L3003ReportService#searchTransferReportCml(java.lang.String)
     */
    public File searchTransferReportCml(String trNo) throws ApplicationException {
        VtRpTransferPltzCriteriaDomain vtRpTransferPltzCriteriaDomain = new VtRpTransferPltzCriteriaDomain();
        vtRpTransferPltzCriteriaDomain.setTrNo(trNo);

        // Validate count data. In case count 0 will be error by AOP.
        vtRpTransferPltzCriteriaDomain.setSearchCountCheckFlg(false);
        vtRpTransferPltzService.searchCount(vtRpTransferPltzCriteriaDomain);

        // Search Data from View with SACT sources.
        List<VtRpTransferPltzDomain> resultVtRpTransferPltzDomainList = vtRpTransferPltzService
            .searchByCondition(vtRpTransferPltzCriteriaDomain);

        // Get first record for Header of report.
        VtRpTransferPltzDomain resultFirstVtRpTransferPltzDomain = resultVtRpTransferPltzDomainList
            .get(0);

        // Domain transfer

        // Time zone conversion date of Shipper
        Date sysdate = DateUtil.convertTime(new Date(), commonService
            .searchTimezone(resultFirstVtRpTransferPltzDomain.getShipperCd()));
        String formatedSysdate = DateUtil.formatDate(sysdate, PRINT_REPORT_DATE_FORMAT);

        // QR code generation
        InputStream qrCdStream = getQrCdStream(resultFirstVtRpTransferPltzDomain);

        // SACT domain -> document domain transfer
        L3003ReportDomain l3003ReportDomain = new L3003ReportDomain();
        CommonUtil.copyPropertiesDomainToDomain(l3003ReportDomain, resultVtRpTransferPltzDomainList
            .get(0), REPORT_DETAIL_DATE_FORMAT);
        l3003ReportDomain.setPrintDt(formatedSysdate);
        l3003ReportDomain.setCountMainMark(resultFirstVtRpTransferPltzDomain.getTotal().toString());
        l3003ReportDomain.setIssuer(resultFirstVtRpTransferPltzDomain.getTrIssuerNm());
        l3003ReportDomain.setQrCdStream(qrCdStream);

        List<L3003ReportDetailDomain> l3003ReportDetailDomainList = new ArrayList<L3003ReportDetailDomain>();
        for (VtRpTransferPltzDomain vtRpTransferPltzDomain : resultVtRpTransferPltzDomainList) {
            // SACT domain -> document domain transfer
            L3003ReportDetailDomain l3003ReportDetailDomain = new L3003ReportDetailDomain();
            CommonUtil.copyPropertiesDomainToDomain(l3003ReportDetailDomain,
                vtRpTransferPltzDomain, REPORT_DETAIL_DATE_FORMAT);
            // If CML contains more than one item number, show item number as mixed pltz on the report.
            if (vtRpTransferPltzDomain.getCntItemNo().compareTo(BigDecimal.ONE) > 0) {
                l3003ReportDetailDomain.setPltzItemNo(MIXED_PART_DESC);
            }
            l3003ReportDetailDomainList.add(l3003ReportDetailDomain);
        }
        l3003ReportDomain.setDetailDomainList(l3003ReportDetailDomainList);

        // PDF file generation

        File resultFile = super.createReport(REPORT_ID_L3003, l3003ReportDomain);

        return resultFile;
    }

    /**
     * Generates a (Transfer Report) QR code, get a data stream
     * 
     * @param transferPltzDomain Transfer report domain
     * @return QR code stream data
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected InputStream getQrCdStream(VtRpTransferPltzDomain transferPltzDomain)
        throws ApplicationException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        StringBuffer qrCdData = new StringBuffer();
        qrCdData.append(QR_HEAD_TRANSFER);
        qrCdData.append(QR_HEAD_TRANSFER_DCT);
        qrCdData.append(StringUtil.rPad(StringUtil.getEmptyToBlank(transferPltzDomain.getTrNo()),
            15));
        qrCdData.append(transferPltzDomain.getTrItemTyp());
        qrCdData.append(transferPltzDomain.getEditCnt());
        try {
            // Call of the QR code generation parts
            QrcodeGenerator.generateQrcode(qrCdData.toString(), ERR_CORRECTION_LV_M, CHAR_SET_UTF8,
                130, outputStream);

        } catch (QrcodeGenerateException e) {
            throw new GscmApplicationException("NXS-E1-5065", e);
        } finally {
            try {
                outputStream.close();
            } catch (Exception e) {
                throw new SystemException(e);
            }
        }

        return new ByteArrayInputStream(outputStream.toByteArray());
    }
}