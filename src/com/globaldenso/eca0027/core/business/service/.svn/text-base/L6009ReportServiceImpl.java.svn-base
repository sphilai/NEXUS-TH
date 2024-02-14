/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6009;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackAtchedForFrtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpPackAtchedForFrtService;
import com.globaldenso.eca0027.core.business.dao.RpDocDao;
import com.globaldenso.eca0027.core.business.domain.L6003TtInvoiceAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6009ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L6009ReportDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6009 [Packing Attached (FRT)].<br />
 * L6009【 Packing Attached(FRT)  】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class L6009ReportServiceImpl extends AbstractReportServiceImpl implements L6009ReportService {
    
    
    /**
     * TM_INV_TPL Service
     */
    protected TmInvTplService tmInvTplService;
    
    /**
     * RpDocDAO
     */
    protected RpDocDao rpDocDao;
    
    /**
     * VtRpPackAtchedForFrtService
     */
    protected VtRpPackAtchedForFrtService vtRpPackAtchedForFrtService;
    
    /**
     * Instance variable in the file manager<br />
     * ファイルマネージャのインスタンス変数
     */
    protected FileManagementService fileManagerServiceForStream;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6009ReportServiceImpl() {
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
     * Setter method for tmInvTplService.
     *
     * @param tmInvTplService Set for tmInvTplService
     */
    public void setTmInvTplService(TmInvTplService tmInvTplService) {
        this.tmInvTplService = tmInvTplService;
    }

    /**
     * Setter method for vtRpPackAtchedForFrtService.
     *
     * @param vtRpPackAtchedForFrtService Set for vtRpPackAtchedForFrtService
     */
    public void setVtRpPackAtchedForFrtService(
        VtRpPackAtchedForFrtService vtRpPackAtchedForFrtService) {
        this.vtRpPackAtchedForFrtService = vtRpPackAtchedForFrtService;
    }
    
    /**
     * Setter method for fileManagerServiceForStream.
     *
     * @param fileManagerServiceForStream Set for fileManagerServiceForStream
     */
    public void setFileManagerServiceForStream(
        FileManagementService fileManagerServiceForStream) {
        this.fileManagerServiceForStream = fileManagerServiceForStream;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L6009ReportService#searchPackAtchedForFrt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo)
     */
    public File searchPackAtchedForFrt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo)
        throws ApplicationException {

        L6009ReportDomain reportDomain = new L6009ReportDomain();

        // Get target list.
        // 対象データの取得
        List<? extends VtRpPackAtchedForFrtDomain> vtList = getDetail(shipper, invoiceNo, invoiceIssueDt);
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
        VtRpPackAtchedForFrtDomain vtDomain = vtList.get(0);
        reportDomain.setInvoiceNo(vtDomain.getInvoiceNo());
        reportDomain.setNwUnit(StringUtil.getEmptyToBlank(vtDomain.getNetWeightUnit()));
        reportDomain.setTotalNwUnit(StringUtil.getEmptyToBlank(vtDomain.getTotalNetWeightUnit()));
        
        // Set detail data.
        // 明細情報のセット
        List<L6009ReportDetailDomain> detailList = new ArrayList<L6009ReportDetailDomain>();
        BigDecimal totalTotalNetWeight = new BigDecimal("0");
        for (VtRpPackAtchedForFrtDomain detailDm : vtList) {
            L6009ReportDetailDomain detailDomain = new L6009ReportDetailDomain();
            detailDomain.setModel(detailDm.getModelCd());
            detailDomain.setDescription(detailDm.getItemDescription());
            //detailDomain.setPartNo(detailDm.getItemNo());
            detailDomain.setPartNo(null); // UT416 MOD
            detailDomain.setUnitPkg(detailDm.getQtyUnit());
            if (detailDm.getQty() != null) {
                detailDomain.setQty(NumberUtil.format(detailDm.getQty(), "#,##0"));
            }
            if (detailDm.getNetWeight() != null) {
                detailDomain.setNetWeight(NumberUtil.format(detailDm.getNetWeight(), "#,##0.000"));
            }
            if (detailDm.getTotalNetWeight() != null) {
                detailDomain.setTotalNetWeight(NumberUtil.format(detailDm.getTotalNetWeight(), "#,##0.000"));
            }
            detailDomain.setType("1");
            totalTotalNetWeight = totalTotalNetWeight.add(detailDm.getTotalNetWeight());
            detailList.add(detailDomain);
        }

        if (totalTotalNetWeight != null) {
            reportDomain.setTotalTotalNetWeight(NumberUtil.format(totalTotalNetWeight, "#,##0.000"));
        }
        reportDomain.setDetailList(detailList);
        
        // Count up the total QTYs as an attached list.
        // 総合計欄のセット
        // 数量単位と数量の取得
        List<? extends L6003TtInvoiceAttachedBySumQtyDomain> attachedList = getAttached(shipper, invoiceNo, invoiceIssueDt);
        
        String totalQtyUnit3 = "";
        String totalQty3 = "";
        BigDecimal sumTotalQty3 = new BigDecimal("0.000");
        for(int i = 0; i < attachedList.size(); i++) {
            L6003TtInvoiceAttachedBySumQtyDomain attachDomain = attachedList.get(i);
            if (0 == i) {
                reportDomain.setUnitTotalQty1(attachDomain.getQtyUnit());
                if (attachDomain.getSumQty() != null) {
                    reportDomain.setTotalQty1(NumberUtil.formatNumber(attachDomain.getSumQty(), "#", "#,##0"));
                }
            }
            if (2 <= attachedList.size() && 1 == i) {
                reportDomain.setUnitTotalQty2(attachDomain.getQtyUnit());
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
        reportDomain.setUnitTotalQty3(totalQtyUnit3);
        reportDomain.setTotalQty3(totalQty3);

        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6009, reportDomain);
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
     * Get Invoice Attached data of QUANTITY and QUANTITY UNIT.<br />
     * インボイスアタッチデータ(数量単位と数量)を取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return List Invoice Attached data<br />
     * List<? extends L6003TtInvoiceAttachedBySumQtyDomain> インボイスアタッチデータ
     * @throws ApplicationException Failed to get Invoice Attached data<br />
     * インボイスアタッチデータの取得に失敗した場合
     */
    protected List<? extends L6003TtInvoiceAttachedBySumQtyDomain> getAttached(String shipper, String invoiceNo, Date invoiceIssueDt) throws ApplicationException {
        L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria = new L6003TtInvoiceAttachedBySumQtyCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<L6003TtInvoiceAttachedBySumQtyDomain> sumQtyList = rpDocDao.searchTtInvoiceAttachedBySumQty(criteria);
        return sumQtyList;
    }


    /**
     * Get the acquisition of Invoice Attached data to be printed.<br />
     * 印刷対象のインボイスアタッチデータの取得を取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return List Invoice Attached data<br />
     * List<? extends VtRpInvAtchedForMainDomain> インボイスアタッチデータ
     * @throws ApplicationException Can not get the Invoice Attached data<br />
     * インボイスアタッチデータを取得できなかった場合
     */
    protected List<? extends VtRpPackAtchedForFrtDomain> getDetail( String shipper, String invoiceNo, Date invoiceIssueDt) throws ApplicationException {
        VtRpPackAtchedForFrtCriteriaDomain criteria = new VtRpPackAtchedForFrtCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<VtRpPackAtchedForFrtDomain> detailList
            = vtRpPackAtchedForFrtService.searchByCondition(criteria);
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
    protected TmInvTplDomain getImage(String shipper, String invoiceTemplateNo) throws ApplicationException {
        TmInvTplCriteriaDomain tmInvTplCriteriaDomain = new TmInvTplCriteriaDomain();
        tmInvTplCriteriaDomain.setCompCd(shipper);
        tmInvTplCriteriaDomain.setDocNo(invoiceTemplateNo);
        TmInvTplDomain tmInvTplDomain = tmInvTplService.searchByKey(tmInvTplCriteriaDomain);
        return tmInvTplDomain;
    }

}
