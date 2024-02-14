/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6012;

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
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctHdrNonCmrclDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrNonCmrclCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpSlsCntrctHdrNonCmrclService;
import com.globaldenso.eca0027.core.business.domain.L6012ReportDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Interface of the service that provides the output function form [Sales Contract Header(NonComercial)].
 * <br/>帳票【 Sales Contract Header(NonComercial) 】出力機能を提供するサービスのインターフェースです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public class L6012ReportServiceImpl extends AbstractReportServiceImpl implements L6012ReportService {
    
    
    /**
     * TM_INV_TPL Service
     */
    protected TmInvTplService tmInvTplService;
    
    /**
     * VT_RP_SLS_CNTRCT_HDR_NON_CMRCL Service
     */
    protected VtRpSlsCntrctHdrNonCmrclService vtRpSlsCntrctHdrNonCmrclService;
    
    /**
     * Instance variable in the file manager<br />
     * ファイルマネージャのインスタンス変数
     */
    protected FileManagementService fileManagerServiceForStream;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6012ReportServiceImpl() {
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
     * Setter method for vtRpSlsCntrctHdrNonCmrclService.
     *
     * @param vtRpSlsCntrctHdrNonCmrclService Set for vtRpSlsCntrctHdrNonCmrclService
     */
    public void setVtRpSlsCntrctHdrNonCmrclService(
        VtRpSlsCntrctHdrNonCmrclService vtRpSlsCntrctHdrNonCmrclService) {
        this.vtRpSlsCntrctHdrNonCmrclService = vtRpSlsCntrctHdrNonCmrclService;
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
     * @see com.globaldenso.eca0027.core.business.service.L6012ReportService#searchSalesCntrctHdrForNonCmrcl(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String formatDate, String charCd)
     */
    public File searchSalesCntrctHdrForNonCmrcl(String shipper, String invoiceNo, Date invoiceIssueDt
        , String invoiceTemplateNo, String formatDate, String charCd)
        throws ApplicationException {

        L6012ReportDomain reportDomain = new L6012ReportDomain();

        // Get target list.
        // 対象データの取得
        List<? extends VtRpSlsCntrctHdrNonCmrclDomain> detailList = getDetail(shipper, invoiceNo, invoiceIssueDt);
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
        VtRpSlsCntrctHdrNonCmrclDomain vtDomain = detailList.get(0);
        reportDomain.setCompNmInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm1()));
        reportDomain.setCompNmInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm2()));
        reportDomain.setShipperTaxIdNo(vtDomain.getShipperTaxIdNo());
        reportDomain.setShipperCompAddrInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr1()) 
            + StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr2()));
        reportDomain.setShipperCompAddrInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr3()) 
            + StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr4()));
        reportDomain.setShipperCompFax(vtDomain.getShipperCompFax());
        reportDomain.setShipperCompTel(vtDomain.getShipperCompTel());
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
        // Set ReInvoiceNo1 and ReInvoiceNo2
        // 帳票定義書_ECA0027_L6012_Sales Contract Header(NonComercial).xls「機能仕様3.3. 項目(30) 設定内容」より
        // 項目(30)(31)の条件分岐は CANCEL_TYP = "N", "C" のみとなる
        if ("N".equals(vtDomain.getCancelTyp())) {
            reportDomain.setReInvoiceNo1(vtDomain.getRelateInvoiceNo());
            reportDomain.setReInvoiceNo2("");
        } else {
            reportDomain.setReInvoiceNo1(vtDomain.getCancelInvoiceNo());
            reportDomain.setReInvoiceNo2(vtDomain.getRelateInvoiceNo());
        }
        reportDomain.setInvoiceCategoryNm(vtDomain.getInvoiceCtgryNm());
        reportDomain.setIssuedDate(DateUtil.formatDate(vtDomain.getManualInvoiceIssueDt(), formatDate));
        reportDomain.setShippedDate(DateUtil.formatDate(vtDomain.getShippedDt(), formatDate));
        reportDomain.setEtd(DateUtil.formatDate(vtDomain.getEtd(), formatDate));
        reportDomain.setEta(DateUtil.formatDate(vtDomain.getEta(), formatDate));
        reportDomain.setTrnsWayNm(vtDomain.getTrnsNm());
        reportDomain.setLoadingPortNm(vtDomain.getLoadingPortNm());
        reportDomain.setDischargePortNm(vtDomain.getDischargePortNm());
        reportDomain.setDeliveryPoint(vtDomain.getDlivPoint());
        reportDomain.setCarrierCompNmAbb(vtDomain.getCarrierCompNmAbb());
        reportDomain.setVessel(vtDomain.getVessel());
        reportDomain.setBookingNo(vtDomain.getBookingNo());
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
        reportDomain.setNoOfPkg(NumberUtil.format(vtDomain.getPltzItemQty(), "#,##0"));
        if (vtDomain.getTotalNetWeight() != null) {
            reportDomain.setTotalNetWeight(NumberUtil.format(vtDomain.getTotalNetWeight(), "#,##0.000"));
        }
        reportDomain.setTotalNetWeightUnit(StringUtil.getEmptyToBlank(vtDomain.getTotalNetWeightUnit()));
        if (vtDomain.getTotalGrossWeight() != null) {
            reportDomain.setTotalGrossWeight(NumberUtil.format(vtDomain.getTotalGrossWeight(), "#,##0.000"));
        }
        reportDomain.setTotalGrossWeghtUnit(StringUtil.getEmptyToBlank(vtDomain.getTotalGrossWeightUnit()));
        if (vtDomain.getTotalVolume() != null) {
            reportDomain.setTotalVolume(NumberUtil.format(vtDomain.getTotalVolume(), "#,##0.000"));
        }
        reportDomain.setTotalVolumeUnit(StringUtil.getEmptyToBlank(vtDomain.getTotalVolumeUnit()));
        reportDomain.setFreightStatusNm(getCutStr(vtDomain.getFreightResponsibleNm(), 0, 12));
        reportDomain.setPriceTermNm(getCutStr(vtDomain.getPriceTerms(), 0, 12));
        reportDomain.setSpecialInformation(vtDomain.getSpInfo());
        if (vtDomain.getNetAmount() != null) {
            reportDomain.setCostNetAmount(NumberUtil.format(vtDomain.getNetAmount(), "#,##0.00"));
        }
        reportDomain.setNetAmountCurrCd(vtDomain.getNetAmountCurrCd());
        if (vtDomain.getFreight() != null) {
            reportDomain.setCostFreight(NumberUtil.format(vtDomain.getFreight(), "#,##0.00"));
        }
        reportDomain.setFreightCurrCd(vtDomain.getFreightCurrCd());
        if (vtDomain.getFreight() != null) {
            reportDomain.setCostFreight(NumberUtil.format(vtDomain.getFreight(), "#,##0.00"));
        }
        if (vtDomain.getInsurance() != null) {
            reportDomain.setCostInsurance(NumberUtil.format(vtDomain.getInsurance(), "#,##0.00"));
        }
        reportDomain.setInsuranceCurrCd(vtDomain.getInsuranceCurrCd());
        if (vtDomain.getSubTotal() != null) {
            reportDomain.setCostSubTotal(NumberUtil.format(vtDomain.getSubTotal(), "#,##0.00"));
        }
        reportDomain.setSubTotalCurrCd(vtDomain.getSubTotalCurrCd());
        if (!("0".equals(vtDomain.getVat().toString()))) {
            reportDomain.setVatDisplay1("VAT(");
            if (vtDomain.getVatRatio() != null) {
                reportDomain.setVatPercentage(NumberUtil.format(vtDomain.getVatRatio(), "#,##0.00"));
            }
            reportDomain.setVatDisplay2(")%");
            if (vtDomain.getVat() != null) {
                reportDomain.setCostVat(NumberUtil.format(vtDomain.getVat(), "#,##0.00"));
            }
            reportDomain.setVatCurrCd(vtDomain.getVatCurrCd());
        }
        if (!("0".equals(vtDomain.getHandlingCharge().toString()))) {
            reportDomain.setHandlingChargeDisplay("Handling Charge");
            if (vtDomain.getHandlingCharge() != null) {
                reportDomain.setCostHandlingCharge(NumberUtil.format(vtDomain.getHandlingCharge(), "#,##0.00"));
            }
            reportDomain.setHandlingChargeCurrCd(vtDomain.getHandlingChargeCurrCd());
        }
        if (!("0".equals(vtDomain.getAdditionalCharge().toString()))) {
            reportDomain.setFreeAdditionalChargeNm(vtDomain.getAdditionalChargeNm());
            if (vtDomain.getAdditionalCharge() != null) {
                reportDomain.setCostAdditionalCharge(NumberUtil.format(vtDomain.getAdditionalCharge(), "#,##0.00"));
            }
            reportDomain.setFreeAdditionalChargeCurrCd(vtDomain.getFreightCurrCd());
        }
        if (vtDomain.getTotalInvoiceAmount() != null) {
            reportDomain.setCostTotalInvoiceAmount(NumberUtil.format(vtDomain.getTotalInvoiceAmount(), "#,##0.00"));
        }
        reportDomain.setTotalInvoiceAmountCurrCd(vtDomain.getTotalInvoiceAmountCurrCd());
        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6012, reportDomain);
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
     * Get a Sales Contract Header data to be printed.<br />
     * 印刷対象のセールスコントラクトヘッダデータを取得します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo INVOICE NO<br />
     * インボイスNO
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Fail to Sales Contract Header data acquisition<br />
     * セールスコントラクトヘッダデータ取得に失敗した場合
     * @return List Sales Contract Header data<br />
     * List<? extends VtRpSlsCntrctHdrNonCmrclDomain> セールスコントラクトヘッダデータ
     */
    protected List<? extends VtRpSlsCntrctHdrNonCmrclDomain> getDetail(String shipper, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {
        List<VtRpSlsCntrctHdrNonCmrclDomain> detailList = new ArrayList<VtRpSlsCntrctHdrNonCmrclDomain>();
        VtRpSlsCntrctHdrNonCmrclCriteriaDomain criteria =  new VtRpSlsCntrctHdrNonCmrclCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        detailList = vtRpSlsCntrctHdrNonCmrclService.searchByCondition(criteria);
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
