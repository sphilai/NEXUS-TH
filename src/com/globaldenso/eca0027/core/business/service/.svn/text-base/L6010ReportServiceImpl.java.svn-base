/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6010;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.business.dao.RpDocDao;
import com.globaldenso.eca0027.core.business.domain.L6008TtPackingAttachedByHeaderAndDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L6010ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L6010ReportDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6010 [Packing Attached (ERT)].<br />
 * L6010【 Packing Attached(ERT)  】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class L6010ReportServiceImpl extends AbstractReportServiceImpl implements L6010ReportService {
    
    /**
     * TM_INV_TPL Service
     */
    protected TmInvTplService tmInvTplService;

    /**
     * RpDocDAO
     */
    protected RpDocDao rpDocDao;
    
    /**
     * Instance variable in the file manager<br />
     * ファイルマネージャのインスタンス変数
     */
    protected FileManagementService fileManagerServiceForStream;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6010ReportServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.service.L6010ReportService#searchPackAtchedForErt(String, String, Date, String, String)
     */
    public File searchPackAtchedForErt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String formatDate)
        throws ApplicationException {

        L6010ReportDomain reportDomain = new L6010ReportDomain();

        // Get target list.
        // 対象データの取得
        List<? extends L6008TtPackingAttachedByHeaderAndDetailDomain> vtList = getDetail(shipper, invoiceNo, invoiceIssueDt, formatDate);
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
                throw new SystemException(NXS_91_0001, e);
            } finally {
                if(output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        throw new SystemException(NXS_91_0001, e);
                    }
                }
            }
        }
        
        // Set header data.
        // ヘッダ情報のセット
        // 
        // (7)
        reportDomain.setVolumeUnit("");
        // (9)
        reportDomain.setNetWeightUnit("");
        // (11)
        reportDomain.setGrossWeightUnit("");
        // (19) Unit of Net Weight
        reportDomain.setNwUnit("");
        // (21) Unit of Total Net Weight
        reportDomain.setTotalNwUnit("");
        // (4) Invoice No
        reportDomain.setInvoiceNo("");
        
        L6008TtPackingAttachedByHeaderAndDetailDomain vtDomain = vtList.get(0);
        
        if(0 < vtList.size()){
            // (4) Invoice No
            reportDomain.setInvoiceNo(vtDomain.getInvoiceNo());
            // (7)
            reportDomain.setVolumeUnit(StringUtil.getEmptyToBlank(vtDomain.getVolumeUnit()));
            // (9)
            reportDomain.setNetWeightUnit(StringUtil.getEmptyToBlank(vtDomain.getNetWeightUnit()));
            // (11)
            reportDomain.setGrossWeightUnit(StringUtil.getEmptyToBlank(vtDomain.getGrossWeightUnit()));
        }
        
        if(1 < vtList.size()){
            // (19) Unit of Net Weight
            reportDomain.setNwUnit(StringUtil.getEmptyToBlank(vtList.get(1).getNetWeightUnitItem()));
            // (21) Unit of Total Net Weight
            reportDomain.setTotalNwUnit(StringUtil.getEmptyToBlank(vtList.get(1).getTotalNwUnit()));
        }
        
        // Set detail data.
        // 明細情報のセット
        List<L6010ReportDetailDomain> detailList = new ArrayList<L6010ReportDetailDomain>();
        for (L6008TtPackingAttachedByHeaderAndDetailDomain headDomain : vtList) {
            L6010ReportDetailDomain detailDomain = new L6010ReportDetailDomain();
            if ("0".equals(headDomain.getRecordTyp())) {
                
                detailDomain.setType("1");
                
                // (5) Main Mark
                detailDomain.setCmlNo(StringUtil.getEmptyToBlank(headDomain.getMainMark()));
                // 2015/3/31 DNJP.Kawamura UT206対応 START >>>>>
                // Return Style Code
                detailDomain.setReturnStyleCd(StringUtil.getEmptyToBlank(headDomain.getReturnStyleCd()));
                // 2015/3/31 DNJP.Kawamura UT206対応 END <<<<<
                // (6) CML Volume
                detailDomain.setVolume(NumberUtil.format(headDomain.getVolume(), "#,##0.000"));
                // (7) CML Net Weight
                detailDomain.setNetWeight(NumberUtil.format(headDomain.getNetWeight(), "#,##0.000"));
                // (8) CML Gross Weight
                detailDomain.setGrossWeight(NumberUtil.format(headDomain.getGrossWeight(), "#,##0.000"));
                // ゴミが残らないように
                detailDomain.setModel("");
                detailDomain.setPartNo("");
                detailDomain.setDescription("");
                detailDomain.setUnitPkg("");
                detailDomain.setQty("");
                detailDomain.setNw("");
                
            } else {
                
                detailDomain.setType("2");
                
                // (12) Model
                detailDomain.setModel(StringUtil.getEmptyToBlank(headDomain.getModelCd()));
                // (13) Part No 
                //detailDomain.setPartNo(StringUtil.getEmptyToBlank(headDomain.getItemNo()));
                detailDomain.setPartNo(null); // UT416 MOD
                // (14) Description
                detailDomain.setDescription(StringUtil.getEmptyToBlank(headDomain.getItemDescription()));
                // (16) Unit of PKG
                detailDomain.setUnitPkg(StringUtil.getEmptyToBlank(headDomain.getQtyUnit()));
                // (17) No of PKG
                detailDomain.setQty(NumberUtil.format(headDomain.getQty(), "#,##0"));
                // (18) Net Weight
                detailDomain.setNw(NumberUtil.format(headDomain.getNetWeightItem(), "#,##0.000"));
                // (20) Total N/W
                detailDomain.setTotalNw(NumberUtil.format(headDomain.getTotalNetWeight(), "#,##0.000"));
                
                detailDomain.setCmlNo("");
                // 2015/3/31 DNJP.Kawamura UT206対応 START >>>>>
                detailDomain.setReturnStyleCd("");
                // 2015/3/31 DNJP.Kawamura UT206対応 END <<<<<
                detailDomain.setVolume("");
                detailDomain.setNetWeight("");
                detailDomain.setGrossWeight("");
            }
            detailList.add(detailDomain);
        }
        reportDomain.setDetailList(detailList);
        
        // Set total data.
        // 総合計欄のセット
        // (22) Total Quantity
        reportDomain.setTotalPackage(NumberUtil.format(vtDomain.getTotalPackage(), "#,##0"));
        // (23) Total Volume
        reportDomain.setTotalVolume(NumberUtil.format(vtDomain.getTotalVolume(), "#,##0.000"));
        // (24) Total Net Weight
        reportDomain.setTotalNetWeight(NumberUtil.format(vtDomain.getTotalNetWeightHead(), "#,##0.000"));
        // (25) Total Gross Weight
        reportDomain.setTotalGrossWeight(NumberUtil.format(vtDomain.getTotalGrossWeight(), "#,##0.000"));

        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6010, reportDomain);
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
     * @throws IOException When it fails to image acquisition<br />
     * 画像取得に失敗したとき
     */
    protected FileManagementDomain getFileDomain(String path, OutputStream output) throws IOException {
        return fileManagerServiceForStream.searchFileDownload(path, true, output);
    }

    /**
     * Get Invoice Attached data to be printed.<br />
     * 印刷対象のインボイスアタッチデータを取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param formatDate format DATE<br />
     * @return List Invoice Attached data<br />
     * List<? extends VtRpInvAtchedForMainDomain> インボイスアタッチデータ
     * @throws ApplicationException Failed to get Invoice Attached data<br />
     * インボイスアタッチデータの取得に失敗した場合
     */
    protected List<? extends L6008TtPackingAttachedByHeaderAndDetailDomain> getDetail( String shipper
        , String invoiceNo, Date invoiceIssueDt, String formatDate) 
        throws ApplicationException {
        
        L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain criteria = new L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<L6008TtPackingAttachedByHeaderAndDetailDomain> detailList = rpDocDao.searchPackAtchedForMain(criteria);
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
