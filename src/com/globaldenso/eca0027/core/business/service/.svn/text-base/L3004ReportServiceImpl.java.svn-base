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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L3004;
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
import com.globaldenso.eca0027.core.auto.business.domain.VtRpTransferItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpTransferItemNoService;
import com.globaldenso.eca0027.core.business.domain.L3004ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L3004ReportDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * The class for generate L3004 report.
 * 
 * @author $Author: chonthicha.a@denso.co.th $
 * @version $Revision: $
 */
public class L3004ReportServiceImpl extends AbstractReportServiceImpl implements L3004ReportService {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * VtRpTransferItemNoService service.
     */
    protected VtRpTransferItemNoService vtRpTransferItemNoService;

    /**
     * Default Constructor.
     */
    public L3004ReportServiceImpl() {
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
     * Setter method for vtRpTransferItemNoService.
     * 
     * @param vtRpTransferItemNoService Set for vtRpTransferItemNoService
     */
    public void setVtRpTransferItemNoService(VtRpTransferItemNoService vtRpTransferItemNoService) {
        this.vtRpTransferItemNoService = vtRpTransferItemNoService;
    }

    // ---------------------------- Search methods -----------------------------

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.L3004ReportService#searchTransferReportItemNo(java.lang.String)
     *      trNo)
     */
    public File searchTransferReportItemNo(String trNo) throws ApplicationException {
        VtRpTransferItemNoCriteriaDomain vtRpTransferItemNoCriteriaDomain = new VtRpTransferItemNoCriteriaDomain();
        vtRpTransferItemNoCriteriaDomain.setTrNo(trNo);

        // Validate count data. In case count 0 will be error by AOP.
        vtRpTransferItemNoCriteriaDomain.setSearchCountCheckFlg(false);
        vtRpTransferItemNoService.searchCount(vtRpTransferItemNoCriteriaDomain);

        // Search Data from View with SACT sources.
        List<VtRpTransferItemNoDomain> resultVtRpTransferItemNoDomainList = vtRpTransferItemNoService
            .searchByCondition(vtRpTransferItemNoCriteriaDomain);

        // Get first record for Header of report.
        VtRpTransferItemNoDomain resultFirstVtRpTransferItemNoDomain = resultVtRpTransferItemNoDomainList
            .get(0);

        // Domain transfer

        // Time zone conversion date of Shipper
        Date sysdate = DateUtil.convertTime(new Date(), commonService
            .searchTimezone(resultFirstVtRpTransferItemNoDomain.getShipperCd()));
        String formatedSysdate = DateUtil.formatDate(sysdate, PRINT_REPORT_DATE_FORMAT);

        // QR code generation
        InputStream qrCdStream = getQrCdStream(resultFirstVtRpTransferItemNoDomain);

        // SACT domain -> document domain transfer
        L3004ReportDomain l3004ReportDomain = new L3004ReportDomain();
        CommonUtil.copyPropertiesDomainToDomain(l3004ReportDomain,
            resultVtRpTransferItemNoDomainList.get(0), REPORT_DETAIL_DATE_FORMAT);
        l3004ReportDomain.setPrintDt(formatedSysdate);
        l3004ReportDomain.setIssuer(resultFirstVtRpTransferItemNoDomain.getTrIssuerNm());
        l3004ReportDomain.setQrCdStream(qrCdStream);

        List<L3004ReportDetailDomain> l3004ReportDetailDomainList = new ArrayList<L3004ReportDetailDomain>();
        for (VtRpTransferItemNoDomain vtRpTransferItemNoDomain : resultVtRpTransferItemNoDomainList) {
            // SACT domain -> document domain transfer
            L3004ReportDetailDomain l3004ReportDetailDomain = new L3004ReportDetailDomain();
            CommonUtil.copyPropertiesDomainToDomain(l3004ReportDetailDomain,
                vtRpTransferItemNoDomain, REPORT_DETAIL_DATE_FORMAT);
            // 1/23/2016 A.Chonthicha: Showing remark sign (*) at # of box info. for partial shipping [Start]
//            BigDecimal noOfBoxWithLotSize = vtRpTransferItemNoDomain.getCarryOutQty().divide(vtRpTransferItemNoDomain.getShippingLot(), 0, BigDecimal.ROUND_UP);
//            BigDecimal noOfBoxWithLotSize = vtRpTransferItemNoDomain.getCarryOutQty().divide(vtRpTransferItemNoDomain.getShippingLot(), 5, BigDecimal.ROUND_HALF_UP);
//            int T = vtRpTransferItemNoDomain.getCarryOutQty().divide(vtRpTransferItemNoDomain.getShippingLot(), 5, BigDecimal.ROUND_HALF_UP).compareTo(vtRpTransferItemNoDomain.getCarryOutCaseQty());
            if(vtRpTransferItemNoDomain.getCarryOutQty().divide(vtRpTransferItemNoDomain.getShippingLot(), 5, BigDecimal.ROUND_HALF_UP).compareTo(vtRpTransferItemNoDomain.getCarryOutCaseQty()) != 0){
                l3004ReportDetailDomain.setCarryOutCaseQty(l3004ReportDetailDomain.getCarryOutCaseQty().concat("*"));
            }
            // 1/23/2016 A.Chonthicha: Showing remark sign (*) at # of box info. for partial shipping [End]
            l3004ReportDetailDomainList.add(l3004ReportDetailDomain);
        }
        l3004ReportDomain.setDetailDomainList(l3004ReportDetailDomainList);

        // PDF file generation

        File resultFile = super.createReport(REPORT_ID_L3004, l3004ReportDomain);

        return resultFile;
    }

    /**
     * Generates a (Transfer Report) QR code, get a data stream
     * 
     * @param transferItemNoDomain Transfer report domain
     * @return QR code stream data
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected InputStream getQrCdStream(VtRpTransferItemNoDomain transferItemNoDomain)
        throws ApplicationException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        StringBuffer qrCdData = new StringBuffer();
        qrCdData.append(QR_HEAD_TRANSFER);
        qrCdData.append(QR_HEAD_TRANSFER_DCT);
        qrCdData.append(StringUtil.rPad(StringUtil.getEmptyToBlank(transferItemNoDomain.getTrNo()),
            15));
        qrCdData.append(transferItemNoDomain.getTrItemTyp());
        qrCdData.append(transferItemNoDomain.getEditCnt());
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
