/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L6007;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackHdrForFrtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpPackHdrForFrtService;
import com.globaldenso.eca0027.core.business.domain.L6007ReportDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service L6007 [Packing Header (FRT)].<br />
 * L6007【 Packing Header(FRT) 】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public class L6007ReportServiceImpl extends AbstractReportServiceImpl implements L6007ReportService {
    
    
    /**
     * TM_INV_TPL Service
     */
    protected TmInvTplService tmInvTplService;
    
    /**
     * VtRpPackHdrForFrtService
     */
    protected VtRpPackHdrForFrtService vtRpPackHdrForFrtService;
    
    /**
     * Instance variable in the file manager<br />
     * ファイルマネージャのインスタンス変数
     */
    protected FileManagementService fileManagerServiceForStream;

    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L6007ReportServiceImpl() {
    }

    /**
     * Setter method for vtRpPackHdrForFrtService.
     *
     * @param vtRpPackHdrForFrtService Set for vtRpPackHdrForFrtService
     */
    public void setVtRpPackHdrForFrtService(
        VtRpPackHdrForFrtService vtRpPackHdrForFrtService) {
        this.vtRpPackHdrForFrtService = vtRpPackHdrForFrtService;
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
     * @see com.globaldenso.eca0027.core.business.service.L6007ReportService#searchPackHdrForFrt(String, String, Date, String, String)
     */
    public File searchPackHdrForFrt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String formatDate)
        throws ApplicationException {

        L6007ReportDomain reportDomain = new L6007ReportDomain();
         
        // Get target list.
        // 対象データの取得
        List<? extends VtRpPackHdrForFrtDomain> detailList = getPackingHeader(shipper, invoiceNo, invoiceIssueDt);
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
                if(!CheckUtil.isBlankOrNull(tmInvTplDomain.getMaster6())){
                    getFileDomain(tmInvTplDomain.getMaster6(), output);
                    reportDomain.setMaster6(new ByteArrayInputStream(output.toByteArray()));
                    output.reset();
                }
                reportDomain.setMaster2(tmInvTplDomain.getMaster2());
                reportDomain.setMaster10(tmInvTplDomain.getMaster10());
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
        VtRpPackHdrForFrtDomain vtDomain = detailList.get(0);
        reportDomain.setCompNmInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm1()));
        reportDomain.setCompNmInv2(StringUtil.getEmptyToBlank(vtDomain.getShipperCompNm2()));
        reportDomain.setShipperTaxIdNo(vtDomain.getShipperTaxIdNo());
        reportDomain.setShipperCompAddrInv1(StringUtil.getEmptyToBlank(vtDomain.getShipperCompAddr1()) 
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
        reportDomain.setConsigneeCompNm1(vtDomain.getConsigneeCompNm1());
        reportDomain.setConsigneeCompNm2(vtDomain.getConsigneeCompNm2());
        reportDomain.setConsigneeCompAddr1(vtDomain.getConsigneeCompAddr1());
        reportDomain.setConsigneeCompAddr2(vtDomain.getConsigneeCompAddr2());
        reportDomain.setConsigneeCompAddr3(vtDomain.getConsigneeCompAddr3());
        reportDomain.setConsigneeCompAddr4(vtDomain.getConsigneeCompAddr4());
        reportDomain.setConsigneeAttn(vtDomain.getConsigneeAttn());
        reportDomain.setShipToNm1(vtDomain.getShipToNm1());
        reportDomain.setShipToNm2(vtDomain.getShipToNm2());
        reportDomain.setShipToAddr1(vtDomain.getShipToAddr1());
        reportDomain.setShipToAddr2(vtDomain.getShipToAddr2());
        reportDomain.setShipToAddr3(vtDomain.getShipToAddr3());
        reportDomain.setShipToAddr4(vtDomain.getShipToAddr4());
        reportDomain.setShipperCompNmAbb(vtDomain.getShipperCompNmAbb());
        // Set ReInvoiceNo1 and ReInvoiceNo2
        // 帳票定義書_ECA0027_L6007_Packing Header(FRT).xls「機能仕様3.3 項目(30),(31) 設定内容」より
        // 項目(30),(31)の条件分岐は CANCEL_TYP = "N", "C" のみとなる
        if ("N".equals(vtDomain.getCancelTyp())) {
            reportDomain.setDocumentsType("NORMAL");
            reportDomain.setReInvoiceNo1(vtDomain.getParInvoiceNo());
            reportDomain.setReInvoiceNo2("");
        } else {
            reportDomain.setDocumentsType("CANCEL");
            reportDomain.setReInvoiceNo1(vtDomain.getCancelInvoiceNo());
            reportDomain.setReInvoiceNo2("");
        }
        reportDomain.setInvoiceNo(vtDomain.getInvoiceNo());
        reportDomain.setInvoiceCtgryNm(vtDomain.getInvoiceCtgryNm());
        reportDomain.setInvoiceIssueDt(DateUtil.formatDate(vtDomain.getManualInvoiceIssueDt(), formatDate));
        reportDomain.setShippedDt(DateUtil.formatDate(vtDomain.getShippedDt(), formatDate));
        reportDomain.setEtd(DateUtil.formatDate(vtDomain.getEtd(), formatDate));
        reportDomain.setEta(DateUtil.formatDate(vtDomain.getEta(), formatDate));
        reportDomain.setTrnsNm(vtDomain.getTrnsNm());
        reportDomain.setLoadingPortNm(vtDomain.getLoadingPortNm());
        reportDomain.setDischargePortNm(vtDomain.getDischargePortNm());
        reportDomain.setDlivPoint(vtDomain.getDlivPoint());
        reportDomain.setCarrierCompNmAbb(vtDomain.getCarrierCompNmAbb());
        reportDomain.setVessel(vtDomain.getVessel());
        reportDomain.setBookingNo(vtDomain.getBookingNo());
        String containerNo = "";
        if (CheckUtil.isBlankOrNull(vtDomain.getContainerNo2())) {
            containerNo = StringUtil.getEmptyToBlank(vtDomain.getContainerNo1());
        } else if(!(CheckUtil.isBlankOrNull(vtDomain.getContainerNo2())) 
            && CheckUtil.isBlankOrNull(vtDomain.getContainerNo3())) {
            containerNo = StringUtil.getEmptyToBlank(vtDomain.getContainerNo1()) + "," + StringUtil.getEmptyToBlank(vtDomain.getContainerNo2());
        } else {
            containerNo = StringUtil.getEmptyToBlank(vtDomain.getContainerNo1()) + "," + StringUtil.getEmptyToBlank(vtDomain.getContainerNo2())
                + "," + StringUtil.getEmptyToBlank(vtDomain.getContainerNo3());
        }
        reportDomain.setContainerNo(containerNo);
        if (vtDomain.getTotalNetWeight() != null) {
            reportDomain.setTotalNetWeight(NumberUtil.format(vtDomain.getTotalNetWeight(), "#,##0.000"));
        }
        reportDomain.setTotalNetWeightUnit(StringUtil.getEmptyToBlank(vtDomain.getTotalNetWeightUnit()));
        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L6007, reportDomain);
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
     * List<? extends VtRpPackHdrForFrtDomain> パッキングヘッダデータ
     * @throws ApplicationException If can not get a Packing Header data<br />
     * パッキングヘッダデータを取得できなかった場合
     */
    protected List<? extends VtRpPackHdrForFrtDomain> getPackingHeader(String shipper, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {
        VtRpPackHdrForFrtCriteriaDomain criteria = new VtRpPackHdrForFrtCriteriaDomain();
        criteria.setShipperCd(shipper);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        List<VtRpPackHdrForFrtDomain> detailList 
            = vtRpPackHdrForFrtService.searchByCondition(criteria);
        return detailList;
    }

    /**
     * From the master template, Derive a fixed image.<br />
     * テンプレートマスタより、固定イメージを導出します。
     *
     * @param shipper SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceTemplateNo INVOICE TEMPLATE NO<br />
     * インボイステンプレートNO
     * @return TmInvTplDomain fixed image<br />
     * TmInvTplDomain 固定イメージ
     * @throws ApplicationException If can not get a fixed image<br />
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
