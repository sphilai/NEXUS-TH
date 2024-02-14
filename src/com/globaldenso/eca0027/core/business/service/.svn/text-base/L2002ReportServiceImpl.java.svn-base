/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_MIXTAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_TYPE_MIXTAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L2002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.qrcodegenerate.QrcodeGenerator;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpMixtagService;
import com.globaldenso.eca0027.core.business.domain.L2002ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L2002ReportDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * The implementation class of form creation service of L2002 [Mix Tag].
 * <br/>L2002【 Mix Tag 】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public class L2002ReportServiceImpl extends AbstractReportServiceImpl implements L2002ReportService {

    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;

    /**
     * VtMixtag Service<br />
     * VtMixtagサービス
     */
    protected VtRpMixtagService vtRpMixtagService;
    

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L2002ReportServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for vtRpMixtagService.
     *
     * @param vtRpMixtagService Set for vtRpMixtagService
     */
    public void setVtRpMixtagService(VtRpMixtagService vtRpMixtagService) {
        this.vtRpMixtagService = vtRpMixtagService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L2002ReportService#searchMixTag(String mixTagNo, String formatDate)
     */
    public File searchMixTag(String mixTagNo, String formatDate) throws ApplicationException {

        L2002ReportDomain reportDomain = new L2002ReportDomain();
        
        // Get header and detail data of the report.
        // 帳票データ(ヘッダ、明細)の取得
        List<? extends VtRpMixtagDomain> reportList = getReportInfo(mixTagNo);
        if (null == reportList || reportList.size() == 0) {
            throw new GscmApplicationException(NXS_E1_0010);
        }

        setRepotHead(reportDomain, reportList, formatDate);
        
        setReportDetail(reportDomain, reportList);

        return getReportFile(reportDomain);
    }

    /**
     * Set the header information of the form.<br />
     * 帳票のヘッダ情報を設定します。
     *
     * @param reportDomain document domain<br />
     * 帳票ドメイン
     * @param reportList document information<br />
     * 帳票情報
     * @param formatDate date format<br />
     * 日付フォーマット
     * @throws ApplicationException If it is not possible to take the WEIGHT UNIT then ApplicationException<br />
     * 重量単位が取得できなかった場合
     * @throws GscmApplicationException If fail to generate QR CD then GscmApplicationException<br />
     * QRコード生成に失敗した場合
     */
    protected void setRepotHead(L2002ReportDomain reportDomain, List<? extends VtRpMixtagDomain> reportList, String formatDate) throws ApplicationException, GscmApplicationException {
        
        VtRpMixtagDomain vtMixtagDomain = reportList.get(0);
        
        reportDomain.setTo(getCutStr(StringUtil.getEmptyToBlank(vtMixtagDomain.getShipToNmAbb()), 20));
        reportDomain.setIssueDate(DateUtil.formatDate(vtMixtagDomain.getMixTagIssueDt(), formatDate));
        reportDomain.setMixTagNo(vtMixtagDomain.getMixTagNo());
        
        String gwUnit = getWeightUnit(vtMixtagDomain);
        BigDecimal gw 
            = commonService.convertWeightUnit(vtMixtagDomain.getGrossWeight(), vtMixtagDomain.getWeightUnit(), gwUnit);

        if (gw == null) {
            Object[] params = { 
                commonService.getResource(reportDomain.getLocale(), "label.grossWeight") 
            };
            throw new GscmApplicationException(NXS_E7_0157, params);
        }
        
        reportDomain.setGw(NumberUtil.format(gw, FORMAT_WEIGHT));
        reportDomain.setGwUnit(commonService.searchMeasureUnitDisp(gwUnit));

        reportDomain.setInspectedDate("");
        reportDomain.setBoxNo(getCutStr(StringUtil.getEmptyToBlank(vtMixtagDomain.getBoxNo()), 15));
        reportDomain.setCuntomer(StringUtil.getEmptyToBlank(vtMixtagDomain.getCustomerCd()));
        reportDomain.setShipTo(StringUtil.getEmptyToBlank(vtMixtagDomain.getLgcyShipTo()));
        reportDomain.setPnoInside(String.valueOf(reportList.size()));
        reportDomain.setBox(getCutStr(StringUtil.getEmptyToBlank(vtMixtagDomain.getModelCd()), 15));
        reportDomain.setIssuer(getCutStr(StringUtil.getEmptyToBlank(vtMixtagDomain.getMixTagIssuer()), 20));
        reportDomain.setShipper(getCutStr(StringUtil.getEmptyToBlank(vtMixtagDomain.getCompNm()), 100));

        //  Set QR data.
        // QRコード出力ストリーム
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BigDecimal nw 
            = commonService.convertWeightUnit(vtMixtagDomain.getNetWeight(), vtMixtagDomain.getWeightUnit(), gwUnit);

        if (nw == null) {
            Object[] params = { 
                commonService.getResource(reportDomain.getLocale(), "label.netWeight") 
            };
            throw new GscmApplicationException(NXS_E7_0157, params);
        }
        
        try {
            StringBuffer qrCode = new StringBuffer();
            qrCode.append(getQrHeader(vtMixtagDomain.getShipperCd(), QR_HEAD_TYPE_MIXTAG, "0", "0", "01", "011"));
            qrCode.append(QR_HEAD_MIXTAG);
            qrCode.append("03");
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(vtMixtagDomain.getMixTagNo()), 17));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(vtMixtagDomain.getCustomerCd()), 8));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(vtMixtagDomain.getLgcyShipTo()), 2));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(vtMixtagDomain.getTrnsCd()), 1));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(vtMixtagDomain.getPlntCd()), 2));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(vtMixtagDomain.getLgcyWhCd()), 1));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(vtMixtagDomain.getPltzInstrNo()), 10));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(gwUnit), 2));
            if (vtMixtagDomain.getNetWeight() != null) {
                qrCode.append(StringUtil.lPad(NumberUtil.format(nw, FORMAT_WEIGHT), 11, '0'));
            }
            if (vtMixtagDomain.getGrossWeight() != null) {
                qrCode.append(StringUtil.lPad(NumberUtil.format(gw, FORMAT_WEIGHT), 11, '0'));
            }
            reportDomain.setQrCd(createQrCode(qrCode.toString(), baos));
        } catch (QrcodeGenerateException e) {
            e.printStackTrace();
            throw new GscmApplicationException("NXS-E1-5065");
        } catch (IOException e) {
            e.printStackTrace();
            throw new GscmApplicationException("NXS-E1-5065");
        } finally {
            try {
                baos.close();
            } catch(Exception e2) {
                e2.printStackTrace();
                throw new SystemException(NXS_91_0001);
            }
        }
    }

    /**
     * Get (header, item) form data.<br />
     * 帳票データ(ヘッダ、明細)を取得します。
     *
     * @param mixTagNo MAIN MARK<br />
     * メインマーク
     * @return (Header, specification) List document information form data<br />
     *  List<? extends VtRpMixtagDomain> 帳票情帳票データ(ヘッダ、明細)
     * @throws ApplicationException  If the document information can not be obtained then ApplicationException<br />
     * 帳票情報が取得できない場合
     */
    protected List<? extends VtRpMixtagDomain> getReportInfo(String mixTagNo) throws ApplicationException {
        
        VtRpMixtagCriteriaDomain criteriaDomain = new VtRpMixtagCriteriaDomain();
        criteriaDomain.setMixTagNo(mixTagNo);
        criteriaDomain.setBoxFlg("Y");
        List<? extends VtRpMixtagDomain> reportList = vtRpMixtagService.searchByCondition(criteriaDomain);
        return reportList;
    }

    /**
     * Get WEIGHT UNIT, the WEIGHT notation.<br />
     * 重量単位、重量表記を取得します。
     *
     * @param vtMixtagDomain form data domain<br />
     * 帳票データドメイン
     * @return WEIGHT<br />
     * 重量
     * @throws ApplicationException If a WEIGHT can not be obtained then ApplicationException.<br />
     * 重量が取得できない場合にスローされます。
     */
    protected String getWeightUnit(VtRpMixtagDomain vtMixtagDomain) throws ApplicationException {
        return commonService.searchWeightUnit(vtMixtagDomain.getShipperCd());
    }

    /**
     * Generate a QR CD InputStream.<br />
     * QRコードInputStreamを生成します。
     * 
     * @param insStr String embedded QR CD<br />
     * QRコード埋め込み文字列
     * @param baos ByteArrayOutputStream
     * @throws IOException If an I / O error has occurred then IOException. <br />
     * 入出力エラーが発生した場合にスローされます。
     * @throws QrcodeGenerateException If a generation of QR CD can not be then QrcodeGenerateException.<br />
     * QRコードの生成ができない場合にスローされます。
     * @return InputStream QR CD object<br />
     * InputStream QRコードオブジェクト
     */
    protected InputStream createQrCode(String insStr, ByteArrayOutputStream baos)
        throws IOException, QrcodeGenerateException {

        QrcodeGenerator.generateQrcode(insStr, ERR_CORRECTION_LV_M, CHAR_SET_UTF8, 130, baos);
        return new ByteArrayInputStream(baos.toByteArray());
    }

    /**
     * Set a form specification.<br />
     * 帳票明細を設定します。
     *
     * @param reportDomain document domain<br />
     * 帳票ドメイン
     * @param reportList document information<br />
     * 帳票情報
     */
    protected void setReportDetail(L2002ReportDomain reportDomain, List<? extends VtRpMixtagDomain> reportList) {
        
        List<L2002ReportDetailDomain> detailList = new ArrayList<L2002ReportDetailDomain>();
        L2002ReportDetailDomain dtlDmain = new L2002ReportDetailDomain();
        for (int i = 0; reportList.size() > i; i++) {
            VtRpMixtagDomain listDomain = reportList.get(i);
            String itemNo = getCutBrStr(listDomain.getItemNo(), 15, 27);
            BigDecimal bd = new BigDecimal(i);
            BigDecimal bdrt = bd.divide(new BigDecimal(4));
            String bdStr = bdrt.toString();
            int idx = bdStr.indexOf(".");
            boolean addFlg = false;
            if (idx > 0) {
                String hasu = bdStr.substring(idx + 1);
                if ("25".equals(hasu)) {
                    // Set 2 when fraction is 0.25.
                    // 端数が0.25は２
                    dtlDmain.setPno2(itemNo);
                    dtlDmain.setPkgCd2(listDomain.getPkgCd());
                    if (listDomain.getQty() != null) {
                        dtlDmain.setQty2(StringUtil.convertIntegerStr(listDomain.getQty()));
                    }
                } else if ("5".equals(hasu)) {
                    // Set 3 when fraction is 0.5.
                    // 端数が0.5は３
                    dtlDmain.setPno3(itemNo);
                    dtlDmain.setPkgCd3(listDomain.getPkgCd());
                    if (listDomain.getQty() != null) {
                        dtlDmain.setQty3(StringUtil.convertIntegerStr(listDomain.getQty()));
                    }
                } else if ("75".equals(hasu)) {
                    // Set 4 when fraction is 0.75.
                    // 端数が0.75は４
                    dtlDmain.setPno4(itemNo);
                    dtlDmain.setPkgCd4(listDomain.getPkgCd());
                    if (listDomain.getQty() != null) {
                        dtlDmain.setQty4(StringUtil.convertIntegerStr(listDomain.getQty()));
                    }
                    addFlg = true;
                }
            } else {
                // Set 1 when no fractions.
                // 端数なしは１
                dtlDmain.setPno1(itemNo);
                dtlDmain.setPkgCd1(listDomain.getPkgCd());
                if (listDomain.getQty() != null) {
                    dtlDmain.setQty1(StringUtil.convertIntegerStr(listDomain.getQty()));
                }
            }
            
            // Add detail list when the record is last.
            // レコードのラスト もしくは 項目のラスト(No4) だと明細レコードに追加
            if (i + 1 == reportList.size() || addFlg) {
                detailList.add(dtlDmain);
                addFlg = false;
                dtlDmain = new L2002ReportDetailDomain();
            }
        }
        reportDomain.setDetailList(detailList);
    }

    /**
     * Generate a form object.<br />
     * 帳票オブジェクトを生成します。
     *
     * @param reportDomain document domain<br />
     * 帳票ドメイン
     * @return Document object<br />
     * 帳票オブジェクト
     */
    protected File getReportFile(L2002ReportDomain reportDomain) {
        return createReport(REPORT_ID_L2002, reportDomain);
    }
    
    /**
     * Cut the string<br />
     * 指定文字列をカットします。
     *
     * @param cutIssuer Target string<br />
     * 対象文字列
     * @param cut Cut the number of characters<br />
     * カット文字数
     * @return After cutting the string<br />
     * カット後文字列
     */
    protected String getCutStr(String cutIssuer, int cut) {
        String cutStr = "";
        if (null != cutIssuer && cutIssuer.length() > cut) {
            cutStr = cutIssuer.substring(0, cut);
        } else {
            cutStr = cutIssuer;
        }
        return cutStr;
    }

}
