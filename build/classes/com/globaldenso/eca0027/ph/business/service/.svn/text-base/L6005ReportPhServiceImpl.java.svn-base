/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.ph.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6005_PH;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.ROUND_DOWN;

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
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvAtchedForRtDomain;
import com.globaldenso.eca0027.core.business.domain.L6003TtInvoiceAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6005ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L6005ReportDomain;
import com.globaldenso.eca0027.core.business.service.L6005ReportServiceImpl;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6005 [Invoice Attached (RT)] of.<br />
 * L6005【 Invoice Attached(RT) 】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class L6005ReportPhServiceImpl extends L6005ReportServiceImpl {

    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6005ReportPhServiceImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L6005ReportService#searchInvAtchedForRt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String charCd)
     */
    public File searchInvAtchedForRt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String charCd)
        throws ApplicationException {

        L6005ReportDomain reportDomain = new L6005ReportDomain();

        // Get target list.
        // 対象データの取得
        List<? extends VtRpInvAtchedForRtDomain> headList = getDetail(shipper, invoiceNo, invoiceIssueDt);
        if (headList.size() == 0) {
            // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
//            throw new GscmApplicationException(GSCM_E0_0010);
            return null;
            // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
        }

        // Get Image data.
        // 固定イメージの取得
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
        // ヘッダ情報のセット
        VtRpInvAtchedForRtDomain headDomain = headList.get(0);
        reportDomain.setInvoiceNo(headDomain.getInvoiceNo());
        reportDomain.setFree1Nm(headDomain.getFree1ColNm());
        reportDomain.setFree2Nm(headDomain.getFree2ColNm());
        reportDomain.setFree3Nm(headDomain.getFree3ColNm());
        reportDomain.setFree4Nm(headDomain.getFree4ColNm()); // UT258 ADD
        
        // Set detail data.
        // 明細情報のセット
        List<L6005ReportDetailDomain> detailList = new ArrayList<L6005ReportDetailDomain>();
        for (VtRpInvAtchedForRtDomain vtDomain : headList) {
            L6005ReportDetailDomain detailDomain = new L6005ReportDetailDomain();
            detailDomain.setModel(vtDomain.getModelCd());
            detailDomain.setDescription1(getCutStr(vtDomain.getItemDescription(), 0 , 50));
            detailDomain.setDescription2(getCutStr(vtDomain.getItemDescription(), 50, 100));
            detailDomain.setFree1(getCutStr(vtDomain.getFree1Dtl(), 0, 20));
            detailDomain.setFree2(getCutStr(vtDomain.getFree2Dtl(), 0, 20));
            detailDomain.setFree3(getCutStr(vtDomain.getFree3Dtl(), 0, 20));
            detailDomain.setCountryOfOrigin(getCutStr(vtDomain.getOriginCntryNm(), 0, 20));
            //detailDomain.setPartNo(vtDomain.getItemNo());
            detailDomain.setPartNo(null); // UT416 MOD
            detailDomain.setPkg(vtDomain.getPkgCd());
            detailDomain.setUnit(vtDomain.getQtyUnit());
            detailDomain.setPkg(vtDomain.getPkgCd());
            detailDomain.setHsCode(vtDomain.getHsCd());
            detailDomain.setCur(vtDomain.getUnitPriceCurrCd());
            if (vtDomain.getQty() != null) {
                detailDomain.setQty(StringUtil.cnvIntStrToComma(vtDomain.getQty()));
            }
            if (vtDomain.getUnitPrice() != null) {
                detailDomain.setUnitPrice(NumberUtil.format(vtDomain.getUnitPrice(), "#,##0.000000"));
            }
            if (vtDomain.getAmount() != null) {
                detailDomain.setAmount(NumberUtil.format(vtDomain.getAmount(), "#,##0.000000"));
            }
            // UT287 ADD START
            String lwh = "("
                + ONE.max(vtDomain.getLength().setScale(0, ROUND_DOWN)).toPlainString() + "x"
                + ONE.max(vtDomain.getWidth().setScale(0, ROUND_DOWN)).toPlainString() + "x"
                + ONE.max(vtDomain.getHeight().setScale(0, ROUND_DOWN)).toPlainString()
                + vtDomain.getLengthUnit()
                + ")";
            detailDomain.setLwh(lwh);
            // UT287 ADD END
            
            detailList.add(detailDomain);
        }
        reportDomain.setDetailList(detailList);
        
        // Count up the total QTYs as an attached list.
        // 数量単位と数量の取得
        List<? extends L6003TtInvoiceAttachedBySumQtyDomain> attachedList = getAttached(shipper, invoiceNo, invoiceIssueDt);
        String totalQtyUnit3 = "";
        String totalQty3 = "";
        BigDecimal sumTotalQty3 = new BigDecimal("0.000");
        for(int i = 0; i < attachedList.size(); i++) {
            L6003TtInvoiceAttachedBySumQtyDomain attachDomain = attachedList.get(i);
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
        
        if (headDomain.getNetAmount() != null) {
            reportDomain.setTotalAmount(NumberUtil.format(headDomain.getNetAmount(), "#,##0.00"));
        }
        reportDomain.setUnitOfTotalAmount(headDomain.getNetAmountCurrCd());

        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6005_PH, reportDomain);
    }
}
