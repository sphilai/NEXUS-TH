/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.ph.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6011_PH;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctHdrCmrclDomain;
import com.globaldenso.eca0027.core.business.domain.L6011ReportDomain;
import com.globaldenso.eca0027.core.business.service.L6011ReportServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation of the service that provides the output function form [(Comercial_Intangible) Sales Contract Header].
 * <br/>帳票【 Sales Contract Header(Comercial_Intangible) 】出力機能を提供するサービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public class L6011ReportPhServiceImpl extends L6011ReportServiceImpl {

    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6011ReportPhServiceImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L6011ReportService#searchSalesCntrctHdrForCmrclIntang(String, String, Date, String, String, String)
     */
    public File searchSalesCntrctHdrForCmrclIntang(String shipper, String invoiceNo, Date invoiceIssueDt
        , String invoiceTemplateNo, String formatDate, String charCd)
        throws ApplicationException {

        L6011ReportDomain reportDomain = new L6011ReportDomain();
        
        // Get target list.
        // 対象データの取得
        List<? extends VtRpSlsCntrctHdrCmrclDomain> detailList = getDetail(shipper, invoiceNo, invoiceIssueDt);
        if (detailList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Get image data.
        // 固定イメージの取得
        TmInvTplDomain tmInvTplDomain = getImage(shipper, invoiceTemplateNo);

        if (tmInvTplDomain != null) {
            ByteArrayOutputStream output = getOutputStream();
            try {
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster1())){
                    getFileDomain(tmInvTplDomain.getMaster1(), output);
                    reportDomain.setMaster1(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster9())){
                    getFileDomain(tmInvTplDomain.getMaster9(), output);
                    reportDomain.setMaster9(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster12())){
                    getFileDomain(tmInvTplDomain.getMaster12(), output);
                    reportDomain.setMaster12(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster13())){
                    getFileDomain(tmInvTplDomain.getMaster13(), output);
                    reportDomain.setMaster13(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                reportDomain.setMaster2(tmInvTplDomain.getMaster2());
                reportDomain.setMaster3(tmInvTplDomain.getMaster3());
                reportDomain.setMaster7(tmInvTplDomain.getMaster7());
                reportDomain.setMaster8(tmInvTplDomain.getMaster8());
                reportDomain.setMaster11(tmInvTplDomain.getMaster11());
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
        // ヘッダ情報のセット
        VtRpSlsCntrctHdrCmrclDomain vtDomain = detailList.get(0);
        reportDomain.setCompNmInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm1()));
        reportDomain.setCompNmInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm2()));
        reportDomain.setShipperTaxIdNo(vtDomain.getShipperTaxIdNo());
        reportDomain.setShipperCompAddrInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr1())
            + StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr2()));
        reportDomain.setShipperCompAddrInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr3()) 
            + StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr4()));
        reportDomain.setShipperCompFax(vtDomain.getShipperCompFax());
        reportDomain.setShipperCompTel(vtDomain.getShipperCompTel());
        if ("N".equals(vtDomain.getInvoiceCtgry())) {
            reportDomain.setConsigneeBlockName("Consignee");
        } else {
            reportDomain.setConsigneeBlockName("Sold to");
        }
        reportDomain.setConsigneeCompNmInv1(vtDomain.getConsigneeCompNm1());
        reportDomain.setConsigneeCompNmInv2(vtDomain.getConsigneeCompNm2());
        reportDomain.setConsigneeCompAddrInv1(vtDomain.getConsigneeCompAddr1());
        reportDomain.setConsigneeCompAddrInv2(vtDomain.getConsigneeCompAddr2());
        reportDomain.setConsigneeCompAddrInv3(vtDomain.getConsigneeCompAddr3());
        reportDomain.setConsigneeCompAddrInv4(vtDomain.getConsigneeCompAddr4());
        reportDomain.setConsigneeAttn(vtDomain.getConsigneeAttn());
        reportDomain.setShipToNmInv1(vtDomain.getShipToNm1());
        reportDomain.setShipToNmInv2(vtDomain.getShipToNm2());
        reportDomain.setShipToAddrInv1(vtDomain.getShipToAddr1());
        reportDomain.setShipToAddrInv2(vtDomain.getShipToAddr2());
        reportDomain.setShipToAddrInv3(vtDomain.getShipToAddr3());
        reportDomain.setShipToAddrInv4(vtDomain.getShipToAddr4());
        reportDomain.setShipToCompNmAbb(vtDomain.getShipperCompNmAbb());
        if ("N".equals(vtDomain.getCancelTyp())) {
            reportDomain.setDocumentsType("NORMAL");
        } else {
            reportDomain.setDocumentsType("CANCEL");
        }
        reportDomain.setInvoiceNo(vtDomain.getInvoiceNo());
        // Set ReInvoiceNo1 and ReInvoiceNo2
        // 帳票定義書_ECA0027_L6011_Sales Contract Header(Comercial_Intangible).xls「機能仕様3.3. 項目(30) 設定内容」より
        // 項目(30)(31)の条件分岐は CANCEL_TYP = "N", "C" のみとなる
        if ("N".equals(vtDomain.getCancelTyp())) {
            reportDomain.setReInvoiceNo1(vtDomain.getRelateInvoiceNo());
            reportDomain.setReInvoiceNo2("");
        } else {
            reportDomain.setReInvoiceNo1(vtDomain.getCancelInvoiceNo());
            reportDomain.setReInvoiceNo2(vtDomain.getRelateInvoiceNo());
        }
        reportDomain.setInvoiceCategoryNm(vtDomain.getInvoiceCtgryNm());
        reportDomain.setIssuedDate(DateUtil.formatDate(vtDomain.getManualInvoiceIssueDt(), formatDate));
        reportDomain.setShippedDate(DateUtil.formatDate(vtDomain.getShippedDt(), formatDate));
        reportDomain.setEtd(DateUtil.formatDate(vtDomain.getEtd(), formatDate));
        reportDomain.setEta(DateUtil.formatDate(vtDomain.getEta(), formatDate));
        reportDomain.setTrnsWayNm(vtDomain.getTrnsNm());
        reportDomain.setLoadingPortNm(vtDomain.getLoadingPortNm());
        reportDomain.setDischargePortNm(vtDomain.getDischargePortNm());
        reportDomain.setDeliveryPoint(vtDomain.getDlivPoint());
        reportDomain.setCarrierCompNmAbb(vtDomain.getCarrierCompNmAbb());
        reportDomain.setVessel(vtDomain.getVessel());
        reportDomain.setBookingNo(vtDomain.getBookingNo());
        String containerNo = "";
        if (CheckUtil.isBlankOrNull(vtDomain.getContainerNo2())) {
            containerNo = StringUtil.getEmptyToBlank(vtDomain.getContainerNo1());
        } else if(!(CheckUtil.isBlankOrNull(vtDomain.getContainerNo2())) 
            && CheckUtil.isBlankOrNull(vtDomain.getContainerNo3())) {
            containerNo = StringUtil.getEmptyToBlank(vtDomain.getContainerNo1()) 
                + "," + StringUtil.getEmptyToBlank(vtDomain.getContainerNo2());
        } else {
            containerNo = StringUtil.getEmptyToBlank(vtDomain.getContainerNo1()) 
                + "," + StringUtil.getEmptyToBlank(vtDomain.getContainerNo2())
                + "," + StringUtil.getEmptyToBlank(vtDomain.getContainerNo3());
        }
        reportDomain.setContainerNo(containerNo);
        if (vtDomain.getPltzItemQty() != null) {
            reportDomain.setNoOfPkg(NumberUtil.format(vtDomain.getPltzItemQty(), "#,##0"));
        }
        if (vtDomain.getTotalNetWeight() != null) {
            reportDomain.setTotalNetWeight(NumberUtil.format(vtDomain.getTotalNetWeight(), "#,##0.000"));
        }
        reportDomain.setTotalNetWeightUnit(StringUtil.getEmptyToBlank(vtDomain.getTotalNetWeightUnit()));
        if (vtDomain.getTotalGrossWeight() != null) {
            reportDomain.setTotalGrossWeight(NumberUtil.format(vtDomain.getTotalGrossWeight(), "#,##0.000"));
        }
        reportDomain.setTotalGrossWeghtUnit(StringUtil.getEmptyToBlank(vtDomain.getTotalGrossWeightUnit()));
        if (vtDomain.getTotalVolume() != null) {
            reportDomain.setTotalVolume(NumberUtil.format(vtDomain.getTotalVolume(), "#,##0.000"));
        }
        reportDomain.setTotalVolumeUnit(StringUtil.getEmptyToBlank(vtDomain.getTotalVolumeUnit()));
        reportDomain.setFreightStatusNm(getCutStr(vtDomain.getFreightResponsibleNm(), 0, 12));  
        reportDomain.setPriceTermNm(getCutStr(vtDomain.getPriceTerms(), 0, 12));
        reportDomain.setTradeTermsNm(getCutStr(vtDomain.getTradeTerms(), 0, 20));
        reportDomain.setPaymentMethod(vtDomain.getPayMeth());
        reportDomain.setPaymentTerms(vtDomain.getPayTerms());
        if ("R".equals(vtDomain.getRemLcTyp())) {
            reportDomain.setPaymentMessage("Please Send All Remittance to Our Account");
            reportDomain.setRemittanceBank(vtDomain.getRemBankNm());
            reportDomain.setRemittanceBankAddress1(vtDomain.getRemBankAddress1());
            reportDomain.setRemittanceBankAddress2(vtDomain.getRemBankAddress2());
            reportDomain.setRemittanceBankAddress3(vtDomain.getRemBankAddress3());
            reportDomain.setRemittanceAccount(vtDomain.getRemBankAccountNo());
        }
        if ("L".equals(vtDomain.getRemLcTyp())) {
            reportDomain.setLcNoDisplay("L/C No.");
            reportDomain.setLcNo(vtDomain.getLcNo());
            reportDomain.setLcDateDisplay("L/C Date");
            reportDomain.setLcDate(DateUtil.formatDate(vtDomain.getLcDt(), formatDate));
            reportDomain.setLcBank1Display("Issuing");
            reportDomain.setLcBank1(vtDomain.getLcBankNm1());
            reportDomain.setLcBank2Display("Bank");
            reportDomain.setLcBank2(vtDomain.getLcBankNm2());
        }
        reportDomain.setSpecialInformation(vtDomain.getSpInfo());
        if (vtDomain.getNetAmount() != null) {
            reportDomain.setCostNetAmount(NumberUtil.format(vtDomain.getNetAmount(), "#,##0.00"));
        }
        reportDomain.setNetAmountCurrCd(vtDomain.getNetAmountCurrCd());
        
        if (vtDomain.getFreight() != null) {
            reportDomain.setCostFreight(NumberUtil.format(vtDomain.getFreight(), "#,##0.00"));
        }
        reportDomain.setFreightCurrCd(vtDomain.getFreightCurrCd());
        if (vtDomain.getInsurance() != null) {
            reportDomain.setCostInsurance(NumberUtil.format(vtDomain.getInsurance(), "#,##0.00"));
        }
        reportDomain.setInsuranceCurrCd(vtDomain.getInsuranceCurrCd());
        if (vtDomain.getSubTotal() != null) {
            reportDomain.setCostSubTotal(NumberUtil.format(vtDomain.getSubTotal(), "#,##0.00"));
        }
        reportDomain.setSubTotalCurrCd(vtDomain.getSubTotalCurrCd());
        if (!("0".equals(vtDomain.getVat().toString()))) {
            reportDomain.setVatDisplay1("VAT(");
            if (vtDomain.getVatRatio() != null) {
                reportDomain.setVatPercentage(NumberUtil.format(vtDomain.getVatRatio(), "#,##0.00"));
            }
            reportDomain.setVatDisplay2(")%");
            if (vtDomain.getVat() != null) {
                reportDomain.setCostVat(NumberUtil.format(vtDomain.getVat(), "#,##0.00"));
            }
            reportDomain.setVatCurrCd(vtDomain.getVatCurrCd());
        }
        if (!("0".equals(vtDomain.getHandlingCharge().toString()))) {
            reportDomain.setHandlingChargeDisplay("Handling Charge");
            if (vtDomain.getHandlingCharge() != null) {
                reportDomain.setCostHandlingCharge(NumberUtil.format(vtDomain.getHandlingCharge(), "#,##0.00"));
            }
            reportDomain.setHandlingChargeCurrCd(vtDomain.getHandlingChargeCurrCd());
        }
        if (!("0".equals(vtDomain.getAdditionalCharge().toString()))) {
            reportDomain.setFreeAdditionalChargeNm(vtDomain.getAdditionalChargeNm());
            if (vtDomain.getAdditionalCharge() != null) {
                reportDomain.setCostAdditionalCharge(NumberUtil.format(vtDomain.getAdditionalCharge(), "#,##0.00"));
            }
            reportDomain.setFreeAdditionalChargeCurrCd(vtDomain.getFreightCurrCd());
        }
        if (vtDomain.getTotalInvoiceAmount() != null) {
            reportDomain.setCostTotalInvoiceAmount(NumberUtil.format(vtDomain.getTotalInvoiceAmount(), "#,##0.00"));
        }
        reportDomain.setTotalInvoiceAmountCurrCd(vtDomain.getTotalInvoiceAmountCurrCd());
        if ("I".equals(vtDomain.getInvoiceCtgry())) {
            reportDomain.setCostNoChargeDisplay("(No Charge)");
            if (vtDomain.getNoCharge() != null) {
                reportDomain.setCostNoChargeAmount(NumberUtil.format(vtDomain.getNoCharge(), "#,##0.00"));
            }
            reportDomain.setNoChargeCurr(vtDomain.getNoChargeCurrCd());
        }
        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6011_PH, reportDomain);
    }
}
