/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.ph.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_I;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6014_PH;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctAtchedMainDomain;
import com.globaldenso.eca0027.core.business.domain.L6003TtScAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6014ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L6014ReportDomain;
import com.globaldenso.eca0027.core.business.service.L6014ReportServiceImpl;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6014 [Packing Attached (FRT)].
 * <br/>L6014【 Packing Attached(FRT)  】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11913 $
 */
public class L6014ReportPhServiceImpl extends L6014ReportServiceImpl {

    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6014ReportPhServiceImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L6014ReportService#searchSalesCntrctAtchedForMain(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String charCd, String formatDate)
     */
    public File searchSalesCntrctAtchedForMain(String shipper, String invoiceNo, Date invoiceIssueDt
        , String invoiceTemplateNo, String charCd, String formatDate) 
        throws ApplicationException {

        L6014ReportDomain reportDomain = new L6014ReportDomain();
        
        // Get target list.
        // 対象データの取得
        List<? extends VtRpSlsCntrctAtchedMainDomain> vtList = getDetail(shipper, invoiceNo, invoiceIssueDt);
        if (vtList.size() == 0) {
            // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
//            throw new GscmApplicationException(GSCM_E0_0010);
            return null;
            // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
        }

        // Set header data.
        // ヘッダ情報のセット
        VtRpSlsCntrctAtchedMainDomain vtDomain = vtList.get(0);
        reportDomain.setInvoiceNo(vtDomain.getInvoiceNo());
        
        // Get image data.
        // 固定イメージの取得
        TmInvTplDomain tmInvTplDomain = getImage(shipper, invoiceTemplateNo);

        if (tmInvTplDomain != null) {
            ByteArrayOutputStream output = getOutputStream();
            try {
                getFileDomain(tmInvTplDomain.getMaster1(), output);
                reportDomain.setMaster1(new ByteArrayInputStream(output.toByteArray()));
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
        
        // Set detail data.
        // 明細情報のセット
        List<L6014ReportDetailDomain> detailList = new ArrayList<L6014ReportDetailDomain>();
        // 2015/3/11 DNJP.Kawamura UT203&UT198&記述内容統一 START >>>>>
        for (VtRpSlsCntrctAtchedMainDomain dm : vtList) {
            L6014ReportDetailDomain detailDomain = new L6014ReportDetailDomain();
            // KIT品の子品番以外（CIGMA品,箱、KIT品の親品番）の場合
            if (FLAG_Y.equals(dm.getParFlg())) {
                detailDomain.setCustomerOrderNo(dm.getCustomerPoNo());
                detailDomain.setCustomerPartNo(dm.getCustomerItemNo());
                detailDomain.setDescription1(getCutStr(dm.getItemDescription(), 0, 50));
                detailDomain.setDescription2(getCutStr(dm.getItemDescription(), 50, 100));
                if (dm.getLineNo().compareTo(BigDecimal.ZERO) != 0) {
                    detailDomain.setLineNo(StringUtil.convertIntegerStr(dm.getLineNo()));
                } else {
                    detailDomain.setLineNo("");
                }
                reportDomain.setFree1Nm(dm.getFree1ColNm());
                reportDomain.setFree2Nm(dm.getFree2ColNm());
                reportDomain.setFree3Nm(dm.getFree3ColNm());
                reportDomain.setFree4Nm(dm.getFree4ColNm()); // UT258 ADD
                detailDomain.setFree1(getCutStr(dm.getFree1Dtl(), 0, 20));
                detailDomain.setFree2(getCutStr(dm.getFree2Dtl(), 0, 20));
                detailDomain.setFree3(getCutStr(dm.getFree3Dtl(), 0, 20));
                detailDomain.setCountryOfOrigin(getCutStr(dm.getOriginCntryNm(), 0, 30));
                detailDomain.setPartNo(dm.getItemNo());
                detailDomain.setPkg(dm.getPkgCd());
                detailDomain.setUnit(dm.getQtyUnit());
                if (dm.getQty() != null) {
                    detailDomain.setQty(NumberUtil.format(dm.getQty(), "#,##0"));
                }
                detailDomain.setHsCode(dm.getHsCd());
                detailDomain.setCur(dm.getUnitPriceCurrCd());
                if (dm.getUnitPrice() != null) {
                    detailDomain.setUnitPrice(NumberUtil.format(dm.getUnitPrice(), "#,##0.000000"));
                }
                if (dm.getAmount() != null) {
                    detailDomain.setAmount(NumberUtil.format(dm.getAmount(), "#,##0.000000"));
                }
            // KIT品の子品番の場合
            } else {
                detailDomain.setCustomerOrderNo("(");
                detailDomain.setDescription1(getCutStr(dm.getItemDescription(), 0, 50));
                detailDomain.setDescription2(getCutStr(dm.getItemDescription(), 50, 100));
                if (dm.getKitBrch().compareTo(BigDecimal.ZERO) != 0 ) {
                    detailDomain.setLineNo(StringUtil.convertIntegerStr(dm.getKitBrch()));
                } else {
                    detailDomain.setLineNo("");
                }
                detailDomain.setCountryOfOrigin(getCutStr(dm.getOriginCntryNm(), 0, 30));
                detailDomain.setUnit(dm.getQtyUnit());
                if (dm.getQty() != null) {
                    detailDomain.setQty(NumberUtil.format(dm.getQty(), "#,##0"));
                }
                detailDomain.setCur(dm.getUnitPriceCurrCd());
                if (dm.getUnitPrice() != null) {
                    detailDomain.setUnitPrice(NumberUtil.format(dm.getUnitPrice(), "#,##0.000000"));
                }
                if (dm.getAmount() != null) {
                    detailDomain.setAmount(NumberUtil.format(dm.getAmount(), "#,##0.000000") + ")");
                }
            }

            // KIT品の親品番の場合
            if (FLAG_Y.equals(dm.getKitFlg()) && FLAG_Y.equals(dm.getParFlg())){
                // intangible品の場合
                if (INVOICE_CTGRY_I.equals(dm.getInvoiceCtgry())) {
                    detailDomain.setKitPnComment("MAIN BODY:  NO COMMERCIAL VALUE");
                } else {
                    detailDomain.setKitPnComment("CONSIST OF:");
                }
            }
            detailList.add(detailDomain);
        }
        reportDomain.setDetailList(detailList);
        // 2015/3/11 DNJP.Kawamura UT203&UT198&記述内容統一 END <<<<<

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
                reportDomain.setUnitOfTotalQuantity1(attachDomain.getQtyUnit());
                if (attachDomain.getSumQty() != null) {
                    reportDomain.setTotalQuantity1(NumberUtil.formatNumber(attachDomain.getSumQty(), "#", "#,##0"));
                }
            }
            if (2 <= attachedList.size() && 1 == i) {
                reportDomain.setUnitOfTotalQuantity2(attachDomain.getQtyUnit());
                if (attachDomain.getSumQty() != null) {
                    reportDomain.setTotalQuantity2(NumberUtil.formatNumber(attachDomain.getSumQty(), "#", "#,##0"));
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
        reportDomain.setUnitOfTotalQuantity3(totalQtyUnit3);
        reportDomain.setTotalQuantity3(totalQty3);
        
        if (vtDomain.getNetAmount() != null) {
            reportDomain.setTotalAmount(NumberUtil.format(vtDomain.getNetAmount(), "#,##0.00"));
        }
        reportDomain.setUnitOfTotalAmount(vtDomain.getNetAmountCurrCd());

        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6014_PH, reportDomain);
    }
}
