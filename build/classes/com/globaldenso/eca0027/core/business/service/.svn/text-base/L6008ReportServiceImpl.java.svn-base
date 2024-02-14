/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_I;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6008;

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
import com.globaldenso.eca0027.core.business.domain.L6008ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L6008ReportDomain;
import com.globaldenso.eca0027.core.business.domain.L6008TtPackingAttachedByHeaderAndDetailDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6008 [Packing Header (FRT)]].<br />
 * L6008【 Packing Header(FRT) 】】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12983 $
 */
public class L6008ReportServiceImpl extends AbstractReportServiceImpl implements L6008ReportService {

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
    public L6008ReportServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.service.L6008ReportService#searchPackAtchedForMain(String, String, Date, String, String, String)
     */
    public File searchPackAtchedForMain(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo
        , String formatDate, String charCd) 
        throws ApplicationException {

        L6008ReportDomain reportDomain = new L6008ReportDomain();

        // Get target list.
        // 対象データの取得
        List<? extends L6008TtPackingAttachedByHeaderAndDetailDomain> headList 
            = getDetail(shipper, invoiceNo, invoiceIssueDt, formatDate);
        if (headList.size() == 0) {
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
        L6008TtPackingAttachedByHeaderAndDetailDomain ttDomain = headList.get(0);
        reportDomain.setInvoiceNo(ttDomain.getInvoiceNo());

        // Set detail data.
        // 明細情報取得
        List<L6008ReportDetailDomain> detailList = new ArrayList<L6008ReportDetailDomain>();
        // 2015/3/11 DNJP.Kawamura UT203&記述内容統一 START >>>>>
        for (L6008TtPackingAttachedByHeaderAndDetailDomain headDomain : headList) {
            L6008ReportDetailDomain detailDomain = new L6008ReportDetailDomain();
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
                // KIT品の子品番以外（CIGMA品,箱、KIT品の親品番）の場合
                if (FLAG_Y.equals(headDomain.getParFlg())) {
                    detailDomain.setCustomerOrderNo(headDomain.getCustomerPoNo());
                    detailDomain.setCustomerPartNo(headDomain.getCustomerItemNo());
                // KIT品の子品番の場合
                } else {
                    detailDomain.setCustomerOrderNo("(");
                }
                detailDomain.setPartNo(headDomain.getItemNo());
                // KIT品の子品番以外（CIGMA品,箱、KIT品の親品番）の場合
                if (FLAG_Y.equals(headDomain.getParFlg())) {
                    detailDomain.setDescription(getCutStr(headDomain.getItemDescription(), 0, 100));
                // KIT品の子品番の場合
                } else {
                    detailDomain.setDescription(getCutStr(headDomain.getItemDescription(), 0, 99) + ")");
                }
                detailDomain.setPkg(headDomain.getPkgCd());
                detailDomain.setUnitPkg(headDomain.getQtyUnit());
                if (headDomain.getQty() != null) {
                    detailDomain.setQty(NumberUtil.format(headDomain.getQty(), "#,##0"));
                }
                // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 START >>>>>
//                // KIT品の子品番以外（CIGMA品,箱、KIT品の親品番）の場合
//                if (FLAG_Y.equals(headDomain.getParFlg())) {
//                    if (headDomain.getTotalNetWeight() != null) {
//                        detailDomain.setTotalNw(NumberUtil.format(headDomain.getTotalNetWeight(), "#,##0.000"));
//                        reportDomain.setTotalNwUnit(headDomain.getTotalNwUnit());
//                    }
//                }                
                // KIT品の親品番以外（CIGMA品,箱、KIT品の子品番）の場合
                if ((FLAG_Y.equals(headDomain.getKitFlg()) && FLAG_N.equals(headDomain.getParFlg()))
                    || (FLAG_N.equals(headDomain.getKitFlg()) && FLAG_Y.equals(headDomain.getParFlg()))
                    ) {
                    if (headDomain.getTotalNetWeight() != null) {
                        detailDomain.setTotalNw(NumberUtil.format(headDomain.getTotalNetWeight(), "#,##0.000"));
                        reportDomain.setTotalNwUnit(headDomain.getTotalNwUnit());
                    }
                }
                // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 END <<<<<
                
                // KIT品の親品番の場合
                if (FLAG_Y.equals(headDomain.getKitFlg()) && FLAG_Y.equals(headDomain.getParFlg())) {
                    // intangible品の場合
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
        // 2015/3/11 DNJP.Kawamura UT203&記述内容統一 END <<<<<

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
        // 帳票生成
        return createReport(REPORT_ID_L6008, reportDomain);
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
     * Get the acquisition of Invoice Attached data to be printed.<br />
     * 印刷対象のインボイスアタッチデータの取得を取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param formatDate format DATE<br />
     * @return List Invoice Attached data<br />
     * List<? extends L6003TtInvoiceAttachedBySumQtyDomain> インボイスアタッチデータ
     * @throws ApplicationException Failed to get Invoice Attached data<br />
     * インボイスアタッチデータの取得に失敗した場合
     */
    protected List<? extends L6008TtPackingAttachedByHeaderAndDetailDomain> getDetail(String shipper
        , String invoiceNo, Date invoiceIssueDt, String formatDate) 
        throws ApplicationException {
        
        L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain criteria 
            = new L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<L6008TtPackingAttachedByHeaderAndDetailDomain> detailList
            = rpDocDao.searchPackAtchedForMain(criteria);
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
    
    /**
     * Cut the string<br />
     * 指定文字列をカットします。
     *
     * @param str Target string<br />対象文字列
     * @param staIdx Begin Index<br />開始位置
     * @param length Cut length<br />文字数
     * @return After cutting the string<br />カット後文字列
     */
    protected String getCutStr(String str, int staIdx, int length) {
        if (str == null || str.length() < staIdx) {
            return "";
        } else {
            if (str.length() > (staIdx + length)) {
                return str.substring(staIdx, staIdx + length);
            } else {
                return str.substring(staIdx);
            }
        }
    }
}
