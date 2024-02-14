/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6015;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.ROUND_DOWN;

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
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctAtchedRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctAtchedRtService;
import com.globaldenso.eca0027.core.business.dao.RpDocDao;
import com.globaldenso.eca0027.core.business.domain.L6003TtScAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6015ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L6015ReportDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtScAttachedBySumQtyCriteriaDomain;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6015 [Sales Contract Attached (RT)].<br />
 * L6015【 Sales Contract Attached(RT) 】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class L6015ReportServiceImpl extends AbstractReportServiceImpl implements L6015ReportService {
    
    /**
     * TM_INV_TPL Service
     */
    protected TmInvTplService tmInvTplService;
    
    /**
     * VT_RP_SLS_CNTRCT_ATCHED_RT Service
     */
    protected VtRpSlsCntrctAtchedRtService vtRpSlsCntrctAtchedRtService;
    
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
    public L6015ReportServiceImpl() {
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
     * Setter method for vtRpSlsCntrctAtchedRtService.
     *
     * @param vtRpSlsCntrctAtchedRtService Set for vtRpSlsCntrctAtchedRtService
     */
    public void setVtRpSlsCntrctAtchedRtService(
        VtRpSlsCntrctAtchedRtService vtRpSlsCntrctAtchedRtService) {
        this.vtRpSlsCntrctAtchedRtService = vtRpSlsCntrctAtchedRtService;
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
     * @see com.globaldenso.eca0027.core.business.service.L6015ReportService#searchSalesCntrctAtchedForRt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String charCd, String formatDate)
     */
    public File searchSalesCntrctAtchedForRt(String shipper, String invoiceNo, Date invoiceIssueDt
        , String invoiceTemplateNo, String charCd, String formatDate) 
        throws ApplicationException {

        L6015ReportDomain reportDomain = new L6015ReportDomain();

        // Get target list.
        // 対象データの取得
        List<? extends VtRpSlsCntrctAtchedRtDomain> vtList = getDetail(shipper, invoiceNo, invoiceIssueDt);
        if (vtList.size() == 0) {
            // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
//            throw new GscmApplicationException(GSCM_E0_0010);
            return null;
            // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
        }

        // Set header data.
        // ヘッダ情報のセット
        VtRpSlsCntrctAtchedRtDomain vtDomain = vtList.get(0);
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
        List<L6015ReportDetailDomain> detailList = new ArrayList<L6015ReportDetailDomain>();
        for (VtRpSlsCntrctAtchedRtDomain dm : vtList) {
            L6015ReportDetailDomain detailDomain = new L6015ReportDetailDomain();
            detailDomain.setModel(dm.getModelCd());
            detailDomain.setDescription1(getCutStr(dm.getItemDescription(), 0, 50));
            detailDomain.setDescription2(getCutStr(dm.getItemDescription(), 50, 100));
            reportDomain.setFree1Nm(dm.getFree1ColNm());
            detailDomain.setFree1(getCutStr(dm.getFree1Dtl(), 0, 20));
            reportDomain.setFree2Nm(dm.getFree2ColNm());
            detailDomain.setFree2(getCutStr(dm.getFree2Dtl(), 0, 20));
            reportDomain.setFree3Nm(dm.getFree3ColNm());
            detailDomain.setFree3(getCutStr(dm.getFree3Dtl(), 0, 20));
            detailDomain.setCountryOfOrigin(getCutStr(dm.getOriginCntryNm(), 0, 20));
            //detailDomain.setPartNo(dm.getItemNo());
            detailDomain.setPartNo(null); // UT416 MOD
            detailDomain.setPkg(dm.getPkgCd());
            detailDomain.setUnit(dm.getQtyUnit());
            if (dm.getQty() != null) {
                detailDomain.setQty(StringUtil.cnvIntStrToComma(dm.getQty()));
            }
            reportDomain.setFree4Nm(dm.getFree4ColNm()); // UT258 ADD
            detailDomain.setHsCode(dm.getHsCd());
            detailDomain.setCur(dm.getUnitPriceCurrCd());
            if (dm.getUnitPrice() != null) {
                detailDomain.setUnitPrice(NumberUtil.format(dm.getUnitPrice(), "#,##0.000000"));
            }
            if (dm.getAmount() != null) {
                detailDomain.setAmount(NumberUtil.format(dm.getAmount(), "#,##0.000000"));
            }
            // UT287 ADD START
            String lwh = "("
                + ONE.max(dm.getLength().setScale(0, ROUND_DOWN)).toPlainString() + "x"
                + ONE.max(dm.getWidth().setScale(0, ROUND_DOWN)).toPlainString() + "x"
                + ONE.max(dm.getHeight().setScale(0, ROUND_DOWN)).toPlainString()
                + dm.getLengthUnit()
                + ")";
            detailDomain.setLwh(lwh);
            // UT287 ADD END
            
            detailList.add(detailDomain);
        }
        reportDomain.setDetailList(detailList);

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
        return createReport(REPORT_ID_L6015, reportDomain);
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
     * Get a Sales Contract Attached data to be printed.<br />
     * 印刷対象のセールスコントラクトアタッチデータを取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Fail to get the Sales Contract Attached data<br />
     * セールスコントラクトアタッチデータの取得に失敗した場合
     * @return List Sales Contract Attached data<br />
     * List<? extends VtRpSlsCntrctAtchedMainDomain> セールスコントラクトアタッチデータ
     */
    protected List<? extends VtRpSlsCntrctAtchedRtDomain> getDetail(String shipper, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {
        List<VtRpSlsCntrctAtchedRtDomain> detailList = new ArrayList<VtRpSlsCntrctAtchedRtDomain>();
        VtRpSlsCntrctAtchedRtCriteriaDomain criteria =  new VtRpSlsCntrctAtchedRtCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        detailList = vtRpSlsCntrctAtchedRtService.searchByCondition(criteria);
        return detailList;
    }
    
    /**
     * Get Sales Contract Attached data of QUANTITY and QUANTITY UNIT.<br />
     * セールスコントラクトアタッチデータ(数量単位と数量)を取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param formatDate Date format<br />
     * 日付フォーマット
     * @throws ApplicationException Fail to get the Sales Contract Attached data<br />
     * セールスコントラクトアタッチデータの取得に失敗した場合
     * @return List Sales Contract Attached data (QUANTITY and QUANTITY UNIT)<br />
     * List<? extends L6003TtScAttachedBySumQtyDomain> セールスコントラクトアタッチデータ(数量単位と数量)
     */
    protected List<? extends L6003TtScAttachedBySumQtyDomain> getAttached(String shipper, String invoiceNo
        , Date invoiceIssueDt, String formatDate)
        throws ApplicationException {
        
        L6003TtScAttachedBySumQtyCriteriaDomain criteria = new L6003TtScAttachedBySumQtyCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<L6003TtScAttachedBySumQtyDomain> sumQtyList = rpDocDao.searchTtScAttachedBySumQty(criteria);
        return sumQtyList;
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
