/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.ph.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_I;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6008_PH;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.asia.business.domain.L6008ReportAsiaDetailDomain;
import com.globaldenso.eca0027.asia.business.domain.L6008ReportAsiaDomain;
import com.globaldenso.eca0027.asia.business.domain.L6008TtPackingAttachedByHeaderAndAsiaDetailDomain;
import com.globaldenso.eca0027.asia.business.service.L6008ReportAsiaServiceImpl;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6008 [Packing Header (FRT)]].<br />
 * 
 * @author $Author: DCS $
 */
public class L6008ReportPhServiceImpl extends L6008ReportAsiaServiceImpl {

    /**
     * The default constructor.<br />
     */
    public L6008ReportPhServiceImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L6008ReportService#searchPackAtchedForMain(String, String, Date, String, String, String)
     */
    public File searchPackAtchedForMain(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo
        , String formatDate, String charCd) 
        throws ApplicationException {

        L6008ReportAsiaDomain reportDomain = new L6008ReportAsiaDomain();

        // Get target list.
        List<? extends L6008TtPackingAttachedByHeaderAndAsiaDetailDomain> headList 
            = getDetail(shipper, invoiceNo, invoiceIssueDt, formatDate);
        if (headList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Get image data.
        TmInvTplDomain tmInvTplDomain = getImage(shipper, invoiceTemplateNo);

        if (tmInvTplDomain != null) {
            ByteArrayOutputStream output = getOutputStream();
            try {
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster1())){
                    getFileDomain(tmInvTplDomain.getMaster1(), output);
                    reportDomain.setAutoText1(new ByteArrayInputStream(output.toByteArray()));
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new SystemException(NXS_91_0001, e);
            } finally {
                if(output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new SystemException(NXS_91_0001, e);
                    }
                }
            }
        }

        // Set header data.
        L6008TtPackingAttachedByHeaderAndAsiaDetailDomain ttDomain = headList.get(0);
        reportDomain.setInvoiceNo(ttDomain.getInvoiceNo());

        // Set detail data.
        List<L6008ReportAsiaDetailDomain> detailList = new ArrayList<L6008ReportAsiaDetailDomain>();
        for (L6008TtPackingAttachedByHeaderAndAsiaDetailDomain headDomain : headList) {
            L6008ReportAsiaDetailDomain detailDomain = new L6008ReportAsiaDetailDomain();
            if ("0".equals(headDomain.getRecordTyp())) {
                detailDomain.setCmlNo(headDomain.getMainMark());
                detailDomain.setVolume("");
                detailDomain.setNetWeight("");
                detailDomain.setGrossWeight("");
                if (headDomain.getVolume() != null) {
                    detailDomain.setVolume(NumberUtil.format(headDomain.getVolume(), "#,##0.000"));
                }
                if (headDomain.getNetWeight() != null) {
                    detailDomain.setNetWeight(NumberUtil.format(headDomain.getNetWeight(), "#,##0.000"));
                }
                if (headDomain.getGrossWeight() != null) {
                    detailDomain.setGrossWeight(NumberUtil.format(headDomain.getGrossWeight(), "#,##0.000"));
                }
                detailDomain.setCustomerOrderNo("");
                detailDomain.setCustomerPartNo("");
                detailDomain.setPartNo("");
                detailDomain.setDescription("");
                detailDomain.setPkg("");
                detailDomain.setUnitPkg("");
                detailDomain.setQty("");
                detailDomain.setTotalNw("");
                detailDomain.setKitPnComment("");
                detailDomain.setType("1");
            } else {
                detailDomain.setCmlNo("");
                detailDomain.setVolume("");
                detailDomain.setNetWeight("");
                detailDomain.setGrossWeight("");
                if (FLAG_Y.equals(headDomain.getParFlg())) {
                    detailDomain.setCustomerOrderNo(headDomain.getCustomerPoNo());
                    detailDomain.setCustomerPartNo(headDomain.getCustomerItemNo());
                } else {
                    detailDomain.setCustomerOrderNo("(");
                }
                detailDomain.setPartNo(headDomain.getItemNo());
                if (FLAG_Y.equals(headDomain.getParFlg())) {
                    detailDomain.setDescription(getCutStr(headDomain.getItemDescription(), 0, 100));
                } else {
                    detailDomain.setDescription(getCutStr(headDomain.getItemDescription(), 0, 99) + ")");
                }
                detailDomain.setPkg(headDomain.getPkgCd());
                detailDomain.setUnitPkg(headDomain.getQtyUnit());
                detailDomain.setNoOfCartons(headDomain.getNoOfCartons());
                if (headDomain.getQty() != null) {
                    detailDomain.setQty(NumberUtil.format(headDomain.getQty(), "#,##0"));
                }
                if ((FLAG_Y.equals(headDomain.getKitFlg()) && FLAG_N.equals(headDomain.getParFlg()))
                    || (FLAG_N.equals(headDomain.getKitFlg()) && FLAG_Y.equals(headDomain.getParFlg()))
                    ) {
                    if (headDomain.getTotalNetWeight() != null) {
                        detailDomain.setTotalNw(NumberUtil.format(headDomain.getTotalNetWeight(), "#,##0.000"));
                        reportDomain.setTotalNwUnit(headDomain.getTotalNwUnit());
                    }
                }
                
                if (FLAG_Y.equals(headDomain.getKitFlg()) && FLAG_Y.equals(headDomain.getParFlg())) {
                    if (INVOICE_CTGRY_I.equals(headDomain.getInvoiceCtgry())) {
                        detailDomain.setKitPnComment("MAIN BODY:");
                    } else {
                        detailDomain.setKitPnComment("CONSIST OF:");
                    }
                }
                detailDomain.setType("2");
            }
            detailList.add(detailDomain);
        }
        reportDomain.setDetailList(detailList);

        if ("0".equals(ttDomain.getRecordTyp())) {
            reportDomain.setVolumeUnit(StringUtil.getEmptyToBlank(ttDomain.getVolumeUnit()));
            reportDomain.setNetWeightUnit(StringUtil.getEmptyToBlank(ttDomain.getNetWeightUnit()));
            reportDomain.setGrossWeightUnit(StringUtil.getEmptyToBlank(ttDomain.getGrossWeightUnit()));
        }
        reportDomain.setTotalPackage(NumberUtil.format(ttDomain.getTotalPackage(), "#,##0"));
        reportDomain.setTotalVolume(NumberUtil.format(ttDomain.getTotalVolume(), "#,##0.000"));
        reportDomain.setTotalNetWeight(NumberUtil.format(ttDomain.getTotalNetWeightHead(), "#,##0.000"));
        reportDomain.setTotalGrossWeight(NumberUtil.format(ttDomain.getTotalGrossWeight(), "#,##0.000"));

        // Create report.
        return createReport(REPORT_ID_L6008_PH, reportDomain);
    }
}
