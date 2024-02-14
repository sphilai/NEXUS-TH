/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6016;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackingSummaryDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackingSummaryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpPackingSummaryService;
import com.globaldenso.eca0027.core.business.dao.RpDocDao;
import com.globaldenso.eca0027.core.business.domain.L6003TtInvoiceAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6016ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L6016ReportDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6016 [Packing List Summary].<br />
 * L6016【 Packing List Summary】の帳票作成サービスの実装クラスです。
 * 
 * Copy diversion from L6006.
 * L6006よりコピー流用。
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13248 $
 */
public class L6016ReportServiceImpl extends AbstractReportServiceImpl implements L6016ReportService {
    
    
    /**
     * TM_INV_TPL Service
     */
    protected TmInvTplService tmInvTplService;
    
    /**
     * RpDocDAO
     */
    protected RpDocDao rpDocDao;
    
    /**
     * VtRpPackingSummaryService
     */
    protected VtRpPackingSummaryService vtRpPackingSummaryService;
    
    /**
     * Instance variable in the file manager<br />
     * ファイルマネージャのインスタンス変数
     */
    protected FileManagementService fileManagerServiceForStream;

    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6016ReportServiceImpl() {
    }

    /**
     * Setter method for rpDocDao.
     *
     * @param rpDocDao Set for rpDocDao
     */
    public void setRpDocDao(RpDocDao rpDocDao) {
        this.rpDocDao = rpDocDao;
    }

    /**
     * Setter method for vtRpPackingSummaryService.
     *
     * @param vtRpPackingSummaryService Set for vtRpPackingSummaryService
     */
    public void setVtRpPackingSummaryService(
        VtRpPackingSummaryService vtRpPackingSummaryService) {
        this.vtRpPackingSummaryService = vtRpPackingSummaryService;
    }

    /**
     * Setter method for tmInvTplService.
     *
     * @param tmInvTplService Set for tmInvTplService
     */
    public void setTmInvTplService(TmInvTplService tmInvTplService) {
        this.tmInvTplService = tmInvTplService;
    }

    /**
     * Setter method for fileManagerServiceForStream.
     *
     * @param fileManagerServiceForStream Set fot fileManagerServiceForStream
     */
    public void setFileManagerServiceForStream(
        FileManagementService fileManagerServiceForStream) {
        this.fileManagerServiceForStream = fileManagerServiceForStream;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L6016ReportService#searchPackingSummary(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String formatDate)
     */
    public File searchPackingSummary(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String formatDate) 
        throws ApplicationException {

        L6016ReportDomain reportDomain = new L6016ReportDomain();

       // Get target list.
        // 対象データの取得
        List<? extends VtRpPackingSummaryDomain> detailList = getPackingHeader(shipper, invoiceNo, invoiceIssueDt);
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
                    reportDomain.setAutoText1(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster6())){
                    getFileDomain(tmInvTplDomain.getMaster6(), output);
                    reportDomain.setMaster6(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
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

        VtRpPackingSummaryDomain vtDomain = detailList.get(0);
        reportDomain.setCompNmInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm1()));
        reportDomain.setCompNmInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm2()));
        reportDomain.setShipperTaxIdNo(vtDomain.getShipperTaxIdNo());
        reportDomain.setShipperCompAddrInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr1())
            + StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr2()));
        reportDomain.setShipperCompAddrInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr3()) 
            + StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr4()));
        reportDomain.setShipperCompTel(vtDomain.getShipperCompTel());
        reportDomain.setShipperCompFax(vtDomain.getShipperCompFax());
        reportDomain.setConsigneeCompNmInv1(vtDomain.getConsigneeCompNm1());
        reportDomain.setConsigneeCompNmInv2(vtDomain.getConsigneeCompNm2());
        reportDomain.setConsigneeCompAddrInv1(vtDomain.getConsigneeCompAddr1());
        reportDomain.setConsigneeCompAddrInv2(vtDomain.getConsigneeCompAddr2());
        reportDomain.setConsigneeCompAddrInv3(vtDomain.getConsigneeCompAddr3());
        reportDomain.setConsigneeCompAddrInv4(vtDomain.getConsigneeCompAddr4());
        reportDomain.setConsigneeAttn(StringUtil.getEmptyToBlank(vtDomain.getConsigneeAttn()));
        reportDomain.setShipToNmInv1(vtDomain.getShipToNm1());
        reportDomain.setShipToNmInv2(vtDomain.getShipToNm2());
        reportDomain.setShipToAddrInv1(vtDomain.getShipToAddr1());
        reportDomain.setShipToAddrInv2(vtDomain.getShipToAddr2());
        reportDomain.setShipToAddrInv3(vtDomain.getShipToAddr3());
        reportDomain.setShipToAddrInv4(vtDomain.getShipToAddr4());
        reportDomain.setShipToCompNmAbb(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNmAbb()));
        String documentsType = "";
        if ("N".equals(vtDomain.getCancelTyp())) {
            documentsType = "NORMAL";
        } else {
            documentsType = "CANCEL";
        }
        reportDomain.setDocumentsType(documentsType);
        reportDomain.setInvoiceNo(vtDomain.getInvoiceNo());
        // Set ReInvoiceNo1 and ReInvoiceNo2
        if ("N".equals(vtDomain.getCancelTyp())) {
            reportDomain.setRefInvoiceNo1(vtDomain.getRelateInvoiceNo());
            reportDomain.setRefInvoiceNo2("");
        } else {
            reportDomain.setRefInvoiceNo1(vtDomain.getCancelInvoiceNo());
            reportDomain.setRefInvoiceNo2(vtDomain.getRelateInvoiceNo());
        }
        reportDomain.setInvoiceCategoryNm(vtDomain.getInvoiceCtgryNm());
        reportDomain.setIssuedDate(DateUtil.formatDate(vtDomain.getManualInvoiceIssueDt(), formatDate));
        reportDomain.setShippedDate(DateUtil.formatDate(vtDomain.getShippedDt(), formatDate));
        reportDomain.setTrnsWayNm(vtDomain.getTrnsNm());
        reportDomain.setDeliveryPoint(vtDomain.getDlivPoint());
        if (vtDomain.getPltzItemQty() != null) {
            reportDomain.setNoOfPkg(NumberUtil.format(vtDomain.getPltzItemQty(), "#,##0"));
        }
        // Count up the total QTYs as an attached list.
        // 数量単位と数量の取得
        List<? extends L6003TtInvoiceAttachedBySumQtyDomain> attachedList = getAttached(shipper, invoiceNo, invoiceIssueDt);
        String totalQtyUnit3 = "";
        String totalQty3 = "";
        BigDecimal sumTotalQty3 = new BigDecimal("0.000");
        for(int i = 0; i < attachedList.size(); i++) {
            L6003TtInvoiceAttachedBySumQtyDomain attachDomain = attachedList.get(i);
            if (0 == i) {
                reportDomain.setUnitDispQty1(StringUtils.left(attachDomain.getQtyUnit(), 6));
                if (attachDomain.getSumQty() != null) {
                    reportDomain.setTotalQty1(NumberUtil.formatNumber(attachDomain.getSumQty(), "#", "#,##0"));
                }
            }
            if (2 <= attachedList.size() && 1 == i) {
                reportDomain.setUnitDispQty2(StringUtils.left(attachDomain.getQtyUnit(), 6));
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
        reportDomain.setUnitDispQty3(StringUtils.left(totalQtyUnit3, 6));
        reportDomain.setTotalQty3(totalQty3);
        
        if (vtDomain.getTotalNetWeight() != null) {
            reportDomain.setTotalNetWeight(NumberUtil.format(vtDomain.getTotalNetWeight(), "#,##0.000"));
        }
        reportDomain.setUnitDispNetWeight(StringUtil.getEmptyToBlank(StringUtils.left(vtDomain.getUnitDispNetWeight(), 4)));
        if (vtDomain.getTotalGrossWeight() != null) {
            reportDomain.setTotalGrossWeight(NumberUtil.format(vtDomain.getTotalGrossWeight(), "#,##0.000"));
        }
        reportDomain.setUnitDispGrossWeight(StringUtil.getEmptyToBlank(StringUtils.left(vtDomain.getUnitDispGrossWeight(), 4)));
        if (vtDomain.getTotalVolume() != null) {
            reportDomain.setTotalVolume(NumberUtil.format(vtDomain.getTotalVolume(), "#,##0.000"));
        }
        reportDomain.setUnitDispVolume(StringUtil.getEmptyToBlank(StringUtils.left(vtDomain.getUnitDispVolume(), 4)));

        // Set list data.
        // 一覧情報のセット
        int i = 0;
        List<L6016ReportDetailDomain> reportDetaiDomainlList = new ArrayList<L6016ReportDetailDomain>();
        for (VtRpPackingSummaryDomain detail : detailList) {
            L6016ReportDetailDomain reportDetailDomain = new L6016ReportDetailDomain();
            reportDetailDomain.setPos(String.valueOf(++i));
            reportDetailDomain.setCustomerItemNo(detail.getCustomerItemNo());
            reportDetailDomain.setItemDescription(StringUtils.left(detail.getItemDescription(), 50));
            reportDetailDomain.setUnitDispQty(StringUtils.left(detail.getUnitDispQty(), 4));
            reportDetailDomain.setQty(NumberUtil.format(detail.getQty(), "#,##0"));
            reportDetaiDomainlList.add(reportDetailDomain);
        }
        reportDomain.setDetailList(reportDetaiDomainlList);

        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6016, reportDomain);
    }

    /**
     * Initialization of OutputStream<br />
     * OutputStreamの初期化
     *
     * @return null
     */
    protected ByteArrayOutputStream getOutputStream() {
        return new ByteArrayOutputStream();
    }

    /**
     * Get the image from the file manager.<br />
     * ファイルマネージャより、画像を取得します。
     *
     * @param path FILE ID<br />
     * ファイルID 
     * @param output OutputStream
     * @return fileDate1 image<br />
     * fileDate1 画像
     * @throws IOException Failed to image acquisition<br />
     * 画像取得に失敗したとき
     */
    protected FileManagementDomain getFileDomain(String path, OutputStream output) throws IOException {
        return fileManagerServiceForStream.searchFileDownload(path, true, output);
    }
    
    /**
     * Get QUANTITY and QUANTITY UNIT.<br />
     * 数量単位と数量を取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return List Packing Attached data<br />
     * List<? extends L6003TtInvoiceAttachedBySumQtyDomain> パッキングアタッチデータ
     * @throws ApplicationException Failed to get Packing Attached data<br />
     * パッキングアタッチデータの取得に失敗した場合
     */
    protected List<? extends L6003TtInvoiceAttachedBySumQtyDomain> getAttached(String shipper, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {
        L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria = new L6003TtInvoiceAttachedBySumQtyCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<L6003TtInvoiceAttachedBySumQtyDomain> sumQtyList = rpDocDao.searchTtPackingAttachedItemBySumQty(criteria);
        return sumQtyList;
    }

    /**
     * Get Packing Header data to be printed.<br />
     * 印刷対象のパッキングヘッダデータを取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return List Packing Header data<br />
     * List<? extends VtRpPackHdrForMainDomain> パッキングヘッダデータ
     * @throws ApplicationException Can not get a Packing Header data<br />
     * パッキングヘッダデータを取得できなかった場合
     */
    protected List<? extends VtRpPackingSummaryDomain> getPackingHeader(String shipper, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {
        VtRpPackingSummaryCriteriaDomain criteria = new VtRpPackingSummaryCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        criteria.setPreferredOrder("CUSTOMER_ITEM_NO, ITEM_DESCRIPTION, UNIT_DISP_QTY");
        List<VtRpPackingSummaryDomain> detailList = vtRpPackingSummaryService.searchByCondition(criteria);
        return detailList;
    }

    /**
     * From the master template, and derive a fixed image.<br />
     * テンプレートマスタより、固定イメージを導出します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceTemplateNo INVOICE TEMPLATE NO<br />
     * インボイステンプレートNO
     * @return TmInvTplDomain fixed image<br />
     * TmInvTplDomain 固定イメージ
     * @throws ApplicationException Can not get a fixed image<br />
     * 固定イメージを取得できなかった場合
     */
    protected TmInvTplDomain getImage(String shipper, String invoiceTemplateNo)
        throws ApplicationException {
        TmInvTplCriteriaDomain tmInvTplCriteriaDomain = new TmInvTplCriteriaDomain();
        tmInvTplCriteriaDomain.setCompCd(shipper);
        tmInvTplCriteriaDomain.setDocNo(invoiceTemplateNo);
        TmInvTplDomain tmInvTplDomain = tmInvTplService.searchByKey(tmInvTplCriteriaDomain);
        return tmInvTplDomain;
    }
}
