/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.ph.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6013_PH;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSalesCntrctHdrForFrtDomain;
import com.globaldenso.eca0027.core.business.domain.L6003TtScAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6013ReportDomain;
import com.globaldenso.eca0027.core.business.service.L6013ReportServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6013 [Packing Attached (FRT)].<br />
 * L6013【 Packing Attached(FRT)  】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public class L6013ReportPhServiceImpl extends L6013ReportServiceImpl {

    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6013ReportPhServiceImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L6013ReportService#searchSalesCntrctHdrForFrt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String formatDate, String charCd)
     */
    public File searchSalesCntrctHdrForFrt(String shipper, String invoiceNo, Date invoiceIssueDt
        , String invoiceTemplateNo, String formatDate, String charCd)
        throws ApplicationException {

        L6013ReportDomain reportDomain = new L6013ReportDomain();

        // Get target list.
        // 対象データの取得
        List<? extends VtRpSalesCntrctHdrForFrtDomain> vtList = getDetail(shipper, invoiceNo, invoiceIssueDt);
        if (vtList.size() == 0) {
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
        VtRpSalesCntrctHdrForFrtDomain vtDomain = vtList.get(0);
        reportDomain.setCompNmInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm1()));
        reportDomain.setCompNmInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm2()));
        reportDomain.setShipperTaxIdNo(vtDomain.getShipperTaxIdNo());
        reportDomain.setShipperCompAddrInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr1()) 
            + StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr2()));
        reportDomain.setShipperCompAddrInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr3()) 
            + StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr4()));
        reportDomain.setShipperCompTel(vtDomain.getShipperCompTel());
        reportDomain.setShipperCompFax(vtDomain.getShipperCompFax());
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
        // Set ReInvoiceNo1 
        // 帳票定義書_ECA0027_L6013_Sales Contract Header(FRT).xls「機能仕様3.4 項目(30),(31) 設定内容」より
        // 項目(30),(31)の条件分岐は CANCEL_TYP = "N", "C" のみとなる
        if ("N".equals(vtDomain.getCancelTyp())) {
            reportDomain.setDocumentsType("NORMAL");
            reportDomain.setReInvoiceNo1(vtDomain.getParInvoiceNo());
        } else {
            reportDomain.setDocumentsType("CANCEL");
            reportDomain.setReInvoiceNo1(vtDomain.getCancelInvoiceNo());
        }
        reportDomain.setInvoiceNo(vtDomain.getInvoiceNo());
        reportDomain.setReInvoiceNo2("");
        reportDomain.setInvoiceCategoryNm(vtDomain.getInvoiceCtgryNm());
        reportDomain.setIssuedDate(DateUtil.formatDate(vtDomain.getManualInvoiceIssueDt(), formatDate));
        reportDomain.setShippedDate(DateUtil.formatDate(vtDomain.getShippedDt(), formatDate));
        reportDomain.setEtd(DateUtil.formatDate(vtDomain.getEtd(), formatDate));
        reportDomain.setEta(DateUtil.formatDate(vtDomain.getEta(), formatDate));
        reportDomain.setTrnsWayNm(vtDomain.getTrnsNm());
        reportDomain.setLoadingPortNm(vtDomain.getLoadingPortNm());
        reportDomain.setDischargePortNm(vtDomain.getDischargePortNm());
        reportDomain.setDeliveryPoint(getCutStr(vtDomain.getDlivPoint(), 0, 15));
        reportDomain.setCarrierCompNmAbb(getCutStr(vtDomain.getCarrierCompNmAbb(), 0, 15));
        reportDomain.setVessel(vtDomain.getVessel());
        reportDomain.setBookingNo(getCutStr(vtDomain.getBookingNo(), 0, 15));
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

        // Count up the total QTYs as an attached list.
        // 総合計欄のセット
        // 数量単位と数量の取得
        List<? extends L6003TtScAttachedBySumQtyDomain> attachedList = getAttached(shipper, invoiceNo, invoiceIssueDt, formatDate);
        
        String totalQtyUnit3 = "";
        String totalQty3 = "";
        BigDecimal sumTotalQty3 = new BigDecimal("0.000");
        for(int i = 0; i < attachedList.size(); i++) {
            L6003TtScAttachedBySumQtyDomain attachDomain = attachedList.get(i);
            if (0 == i) {
                reportDomain.setTotalQty1Unit(attachDomain.getQtyUnit());
                if (attachDomain.getSumQty() != null) {
                    reportDomain.setTotalQty1(NumberUtil.formatNumber(attachDomain.getSumQty(), "#", "#,##0"));
                }
            }
            if (2 <= attachedList.size() && 1 == i) {
                reportDomain.setTotalQty2Unit(attachDomain.getQtyUnit());
                if (attachDomain.getSumQty() != null) {
                    reportDomain.setTotalQty2(NumberUtil.formatNumber(attachDomain.getSumQty(), "#", "#,##0"));
                }
            }
            if (3 == attachedList.size() && 2 == i) {
                totalQtyUnit3 = attachDomain.getQtyUnit();
                if (attachDomain.getSumQty() != null) {
                    totalQty3 = NumberUtil.formatNumber(attachDomain.getSumQty(), "#", "#,##0");
                }
            }
            if (3 < attachedList.size() && 2 <= i) {
                totalQtyUnit3 = "OTHERS";
                sumTotalQty3 = sumTotalQty3.add(StringUtil.parseBigDecimal(attachDomain.getSumQty()));
                if (attachDomain.getSumQty() != null) {
                    totalQty3 = NumberUtil.format(sumTotalQty3, "#,##0");
                }
            }
        }
        reportDomain.setTotalQty3Unit(totalQtyUnit3);
        reportDomain.setTotalQty3(totalQty3);
        if (vtDomain.getTotalNetWeight() != null) {
            reportDomain.setTotalWeight(NumberUtil.format(vtDomain.getTotalNetWeight(), "#,##0.000"));
        }
        reportDomain.setTotalWeightUnit(StringUtil.getEmptyToBlank(vtDomain.getTotalNetWeightUnit()));
        reportDomain.setPriceTermNm(vtDomain.getPriceTerms());
        if (vtDomain.getTotalInvoiceAmount() != null) {
            reportDomain.setCostTotalInvoiceAmount(NumberUtil.format(vtDomain.getTotalInvoiceAmount(), "#,##0.00"));
        }
        reportDomain.setTotalInvoiceAmountCurrCd(vtDomain.getTotalInvoiceAmountCurrCd());

        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6013_PH, reportDomain);
    }
}
