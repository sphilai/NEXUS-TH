/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6003;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvHdrForFrtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpInvHdrForFrtService;
import com.globaldenso.eca0027.core.business.dao.RpDocDao;
import com.globaldenso.eca0027.core.business.domain.L6003ReportDomain;
import com.globaldenso.eca0027.core.business.domain.L6003TtInvoiceAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6003 [Invoice Header (FRT)].<br />
 * L6003【 Invoice Header(FRT) 】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15068 $
 */
public class L6003ReportServiceImpl extends AbstractReportServiceImpl implements L6003ReportService {
    
    
    /**
     * TM_INV_TPL Service
     */
    protected TmInvTplService tmInvTplService;
    
    /**
     * RpDocDAO
     */
    protected RpDocDao rpDocDao;
    
    /**
     * VtRpInvHdrForFrtService
     */
    protected VtRpInvHdrForFrtService vtRpInvHdrForFrtService;

    /**
     * File Manager<br />
     * ファイルマネージャ
     */
    protected FileManagementService fileManagerServiceForStream;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6003ReportServiceImpl() {
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
     * Setter method for vtRpInvHdrForFrtService.
     *
     * @param vtRpInvHdrForFrtService Set for vtRpInvHdrForFrtService
     */
    public void setVtRpInvHdrForFrtService(
        VtRpInvHdrForFrtService vtRpInvHdrForFrtService) {
        this.vtRpInvHdrForFrtService = vtRpInvHdrForFrtService;
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
    public void setFileManagerServiceForStream(FileManagementService fileManagerServiceForStream) {
        this.fileManagerServiceForStream = fileManagerServiceForStream;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L6003ReportService#searchIvnHdrForFrt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String formatDate, String charCd)
     */
    public File searchIvnHdrForFrt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo
        , String formatDate, String charCd)
        throws ApplicationException {

        L6003ReportDomain reportDomain = new L6003ReportDomain();

        // Get target list.
        // 対象データの取得
        List<? extends VtRpInvHdrForFrtDomain> detailList = getHeader(shipper, invoiceNo, invoiceIssueDt);
        if (detailList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Get image data.
        // 固定イメージの取得
        TmInvTplDomain tmInvTplDomain = getImage(shipper, invoiceTemplateNo);

        ByteArrayOutputStream output = getOutputStream();
        
        if (tmInvTplDomain != null) {
            try {
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster1())){
                    getFileDomain(tmInvTplDomain.getMaster1(), output);
                    reportDomain.setAutoText1(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster5())){
                    getFileDomain(tmInvTplDomain.getMaster5(), output);
                    reportDomain.setAutoText5(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster6())){
                    getFileDomain(tmInvTplDomain.getMaster6(), output);
                    reportDomain.setAutoText6(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster9())){
                    getFileDomain(tmInvTplDomain.getMaster9(), output);
                    reportDomain.setAutoText9(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                reportDomain.setMaster2(tmInvTplDomain.getMaster2());                  
                reportDomain.setMaster3(tmInvTplDomain.getMaster3());                  
                reportDomain.setSpecialInformation2Value(tmInvTplDomain.getMaster4());  
                reportDomain.setMaster7(tmInvTplDomain.getMaster7());                   
                reportDomain.setMaster8(tmInvTplDomain.getMaster8());                  
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
        VtRpInvHdrForFrtDomain vtDomain = detailList.get(0);
        reportDomain.setCompNmInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm1()));
        reportDomain.setCompNmInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm2()));
        reportDomain.setShipperTaxIdNo(vtDomain.getShipperTaxIdNo());
        reportDomain.setShipperCompAddrInv(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr1()) 
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
        if ("N".equals(vtDomain.getCancelTyp())) {
            reportDomain.setDocumentsType("NORMAL");
        } else {
            reportDomain.setDocumentsType("CANCEL");
        }
        reportDomain.setInvoiceNo(vtDomain.getInvoiceNo());
        // Set ReInvoiceNo1 data.
        // 帳票定義書_ECA0027_L6003_Invoice Header(FRT).xls「機能仕様3.4 項目(30) 設定内容」より
        // 項目(30)の条件分岐は CANCEL_TYP = "N", "C" のみとなる
        if ("N".equals(vtDomain.getCancelTyp())) {
            reportDomain.setReInvoiceNo1(vtDomain.getParInvoiceNo());
        } else {
            reportDomain.setReInvoiceNo1(vtDomain.getCancelInvoiceNo());
        }
        // Set ReInvoiceNo2 data.
        // 帳票定義書_ECA0027_L6003_Invoice Header(FRT).xls「機能仕様3.3. 項目(31) 設定内容」より
        // 項目(31)の条件分岐は CANCEL_TYP = "N", "C" のみとなる
        reportDomain.setReInvoiceNo2("");
        reportDomain.setInvoiceCategoryNm(vtDomain.getInvoiceCtgryNm());
        reportDomain.setIssuedDate(DateUtil.formatDate(vtDomain.getManualInvoiceIssueDt(), formatDate));
        reportDomain.setShippedDate(DateUtil.formatDate(vtDomain.getShippedDt(), formatDate));
        reportDomain.setEtd(DateUtil.formatDate(vtDomain.getEtd(), formatDate));
        reportDomain.setEta(DateUtil.formatDate(vtDomain.getEta(), formatDate));
        reportDomain.setTrnsWayNm(vtDomain.getTrnsNm());
        reportDomain.setLoadingPortNm(vtDomain.getLoadingPortNm());
        reportDomain.setDischargePortNm(vtDomain.getDischargePortNm());

        reportDomain.setDeliveryPoint(getCutStr(vtDomain.getDlivPoint(), 15));

        reportDomain.setCarrierCompNmAbb(getCutStr(vtDomain.getCarrierCompNmAbb(), 15));
        reportDomain.setVessel(vtDomain.getVessel());

        reportDomain.setBookingNo(getCutStr(vtDomain.getBookingNo(), 15));
        if (CheckUtil.isBlankOrNull(vtDomain.getContainerNo2())) {
            reportDomain.setContainerNo(StringUtil.getEmptyToBlank(vtDomain.getContainerNo1()));
        } else if(!(CheckUtil.isBlankOrNull(vtDomain.getContainerNo2())) && CheckUtil.isBlankOrNull(vtDomain.getContainerNo3())) {
            reportDomain.setContainerNo(StringUtil.getEmptyToBlank(vtDomain.getContainerNo1()) 
                + "," + StringUtil.getEmptyToBlank(vtDomain.getContainerNo2()));
        } else {
            reportDomain.setContainerNo(StringUtil.getEmptyToBlank(vtDomain.getContainerNo1()) 
                + "," + StringUtil.getEmptyToBlank(vtDomain.getContainerNo2())
                + "," + StringUtil.getEmptyToBlank(vtDomain.getContainerNo3()));
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
        reportDomain.setSpecialInformation1Value(vtDomain.getSpInfo()); // NL020 ADD

        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6003, reportDomain);
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
     * @throws IOException Failed to image acquisitions<br />
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
     * @throws ApplicationException Can not get the Invoice Attached data<br />
     * インボイスアタッチデータを取得できなかった場合
     * @return Domain result<br />
     * 結果ドメイン
     */
    protected List<? extends L6003TtInvoiceAttachedBySumQtyDomain> getAttached(String shipper, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {
        L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria = new L6003TtInvoiceAttachedBySumQtyCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<L6003TtInvoiceAttachedBySumQtyDomain> sumQtyList = rpDocDao.searchTtInvoiceAttachedBySumQty(criteria);
        return sumQtyList;
    }

    /**
     * Get the header information of Invoice Header data to be printed.<br />
     * ヘッダー情報(印刷対象のインボイスヘッダデータ)を取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return List header information<br />
     * List<? extends VtRpInvHdrForFrtDomain> ヘッダー情報
     * @throws ApplicationException Can not get the header information<br />
     * ヘッダー情報を取得できなかった場合
     */
    protected List<? extends VtRpInvHdrForFrtDomain> getHeader(String shipper, String invoiceNo, Date invoiceIssueDt) throws ApplicationException {
        VtRpInvHdrForFrtCriteriaDomain criteria = new VtRpInvHdrForFrtCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<VtRpInvHdrForFrtDomain> detailList 
            = vtRpInvHdrForFrtService.searchByCondition(criteria);
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
     * 先頭から指定文字列をカットします。
     *
     * @param str Target string<br />対象文字列
     * @param length Cut length<br />文字数
     * @return After cutting the string<br />カット後文字列
     */
    protected String getCutStr(String str, int length) {
        return getCutStr(str, 0, length);
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
