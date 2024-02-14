/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_I;

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
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvAtchedForMainDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpInvAtchedForMainService;
import com.globaldenso.eca0027.core.business.dao.RpDocDao;
import com.globaldenso.eca0027.core.business.domain.L6003TtInvoiceAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6004ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L6004ReportDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6004 [Invoice Attached (MAIN)].<br />
 * L6004【 Invoice Attached(MAIN)  】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11913 $
 */
public class L6004ReportServiceImpl extends AbstractReportServiceImpl implements L6004ReportService {
    
    
    /**
     * TM_INV_TPL Service
     */
    protected TmInvTplService tmInvTplService;
    
    /**
     * RpDocDAO
     */
    protected RpDocDao rpDocDao;
    
    /**
     * VtRpInvAtchedForMainService
     */
    protected VtRpInvAtchedForMainService vtRpInvAtchedForMainService;
    
    /**
     * Instance variable in the file manager<br />
     * ファイルマネージャのインスタンス変数
     */
    protected FileManagementService fileManagerServiceForStream;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6004ReportServiceImpl() {
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
     * Setter method for vtRpInvAtchedForMainService.
     *
     * @param vtRpInvAtchedForMainService Set for vtRpInvAtchedForMainService
     */
    public void setVtRpInvAtchedForMainService(
        VtRpInvAtchedForMainService vtRpInvAtchedForMainService) {
        this.vtRpInvAtchedForMainService = vtRpInvAtchedForMainService;
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
     * @see com.globaldenso.eca0027.core.business.service.L6004ReportService#searchInvAtchedForMain(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String charCd)
     */
    public File searchInvAtchedForMain(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String charCd) 
        throws ApplicationException {

        L6004ReportDomain reportDomain = new L6004ReportDomain();

        // Get target list.
        // 対象データの取得
        List<? extends VtRpInvAtchedForMainDomain> headList = getDetail(shipper, invoiceNo, invoiceIssueDt);
        if (headList.size() == 0) {
            // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
//            throw new GscmApplicationException(GSCM_E0_0010);
            return null;
            // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
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
        VtRpInvAtchedForMainDomain headDomain = headList.get(0);
        reportDomain.setInvoiceNo(headDomain.getInvoiceNo());
        
        // Set detail data.
        // 明細情報のセット
        // 2015/3/11 DNJP.Kawamura UT203&UT198&記述内容統一 START >>>>>
        List<L6004ReportDetailDomain> detailList = new ArrayList<L6004ReportDetailDomain>();
        for (VtRpInvAtchedForMainDomain vtDomain : headList) {
            L6004ReportDetailDomain detailDomain = new L6004ReportDetailDomain();
            // KIT品の子品番以外（CIGMA品,箱、KIT品の親品番）の場合
            if (FLAG_Y.equals(vtDomain.getParFlg())) {
                detailDomain.setCustomerOrderNo(vtDomain.getCustomerPoNo());
                detailDomain.setCustomerPartNo(vtDomain.getCustomerItemNo());
                detailDomain.setDescription1(getCutStr(vtDomain.getItemDescription(), 0, 50));
                detailDomain.setDescription2(getCutStr(vtDomain.getItemDescription(), 50, 100));
                if (vtDomain.getLineNo().compareTo(BigDecimal.ZERO) != 0) {
                    detailDomain.setLineNo(StringUtil.convertIntegerStr(vtDomain.getLineNo()));
                } else {
                    detailDomain.setLineNo("");
                }
                reportDomain.setFree1Nm(vtDomain.getFree1ColNm());
                reportDomain.setFree2Nm(vtDomain.getFree2ColNm());
                reportDomain.setFree3Nm(vtDomain.getFree3ColNm());
                reportDomain.setFree4Nm(vtDomain.getFree4ColNm()); // UT258 ADD
                detailDomain.setFree1(getCutStr(vtDomain.getFree1Dtl(), 0, 20));
                detailDomain.setFree2(getCutStr(vtDomain.getFree2Dtl(), 0, 20));
                detailDomain.setFree3(getCutStr(vtDomain.getFree3Dtl(), 0, 20));
                detailDomain.setCountryOfOrigin(getCutStr(vtDomain.getOriginCntryNm(), 0, 30));
                detailDomain.setPartNo(vtDomain.getItemNo());
                detailDomain.setPkg(vtDomain.getPkgCd());
                detailDomain.setUnit(vtDomain.getQtyUnit());
                if (vtDomain.getQty() != null) {
                    detailDomain.setQty(NumberUtil.format(vtDomain.getQty(), "#,##0"));
                }
                detailDomain.setHsCode(vtDomain.getHsCd());
                detailDomain.setCur(vtDomain.getUnitPriceCurrCd());
                if (vtDomain.getUnitPrice() != null) {
                    detailDomain.setUnitPrice(NumberUtil.format(vtDomain.getUnitPrice(), "#,##0.000000"));
                }
                if (vtDomain.getAmount() != null) {
                    detailDomain.setAmount(NumberUtil.format(vtDomain.getAmount(), "#,##0.000000"));
                }
            // KIT品の子品番の場合
            } else {
                detailDomain.setCustomerOrderNo("(");
                detailDomain.setDescription1(getCutStr(vtDomain.getItemDescription(), 0, 50));
                detailDomain.setDescription2(getCutStr(vtDomain.getItemDescription(), 50, 100));
                if (vtDomain.getKitBrch().compareTo(BigDecimal.ZERO) != 0 ) {
                    detailDomain.setLineNo(StringUtil.convertIntegerStr(vtDomain.getKitBrch()));
                } else {
                    detailDomain.setLineNo("");
                }
                detailDomain.setCountryOfOrigin(getCutStr(vtDomain.getOriginCntryNm(), 0, 30));
                detailDomain.setUnit(vtDomain.getQtyUnit());
                if (vtDomain.getQty() != null) {
                    detailDomain.setQty(NumberUtil.format(vtDomain.getQty(), "#,##0"));
                }
                detailDomain.setCur(vtDomain.getUnitPriceCurrCd());
                if (vtDomain.getUnitPrice() != null) {
                    detailDomain.setUnitPrice(NumberUtil.format(vtDomain.getUnitPrice(), "#,##0.000000"));
                }
                if (vtDomain.getAmount() != null) {
                    detailDomain.setAmount(NumberUtil.format(vtDomain.getAmount(), "#,##0.000000") + ")");
                }
            }
            
            // KIT品の親品番の場合
            if (FLAG_Y.equals(vtDomain.getKitFlg()) && FLAG_Y.equals(vtDomain.getParFlg())){
                // intangible品の場合
                if (INVOICE_CTGRY_I.equals(vtDomain.getInvoiceCtgry())) {
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
        return createReport(REPORT_ID_L6004, reportDomain);
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
     * Get the Invoice Attached data to be set to print specification.<br />
     * 印刷明細にセットするインボイスアタッチデータを取得します。
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
    protected List<? extends VtRpInvAtchedForMainDomain> getDetail(String shipper, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {
        VtRpInvAtchedForMainCriteriaDomain criteria = new VtRpInvAtchedForMainCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<VtRpInvAtchedForMainDomain> detailList 
            = vtRpInvAtchedForMainService.searchByCondition(criteria);
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
