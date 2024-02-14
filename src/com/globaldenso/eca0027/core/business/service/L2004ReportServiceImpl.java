/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_TYPE_XCML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_XCML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L2004;

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
import com.globaldenso.eca0027.core.auto.business.domain.VtRpXtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpXtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpXtagService;
import com.globaldenso.eca0027.core.business.domain.L2004ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L2004ReportDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * The implementation class of the creating form service of L2004【 CML(X) 】.<br />
 * L2004【 CML(X) 】の帳票作成サービスの実装クラスです。
 * 
 * @version $Revision: 9972 $
 */
public class L2004ReportServiceImpl extends AbstractReportServiceImpl implements L2004ReportService {
    

    /**
     * VtRpXtagService
     */
    protected VtRpXtagService vtRpXtagService;
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;

    /**
     * Type in the functional overview of the constructor.
     *
     */
    public L2004ReportServiceImpl() {
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
     * Setter method for vtRpXtagService.
     *
     * @param vtRpXtagService Set for vtRpXtagService
     */
    public void setVtRpXtagService(VtRpXtagService vtRpXtagService) {
        this.vtRpXtagService = vtRpXtagService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L2004ReportService#searchXtag(String xTagNo, String compCd, String formatDate)
     */
    public File searchXtag(String xTagNo, String compCd, String formatDate) throws ApplicationException {

        L2004ReportDomain reportDomain = new L2004ReportDomain();
        
        // Get report data.
        // 帳票情報取得
        List<? extends VtRpXtagDomain> xtagList = getVtPtXtag(xTagNo, compCd);
        if (xtagList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        setRpHead(reportDomain, xtagList.size(), xtagList.get(0), formatDate, compCd);
        setRpDetail(reportDomain, xtagList);
        return createReport(REPORT_ID_L2004, reportDomain);
    }

    /**
     * Set the form specification items.<br />
     * 帳票明細項目の設定を行います。
     *
     * @param reportDomain Form domain<br />
     * 帳票ドメイン
     * @param xtagList Check list<br />
     * 明細リスト
     */
    protected void setRpDetail(L2004ReportDomain reportDomain, List<? extends VtRpXtagDomain> xtagList) {
        
        List<L2004ReportDetailDomain> detailList = new ArrayList<L2004ReportDetailDomain>();
        L2004ReportDetailDomain dtlDmain = new L2004ReportDetailDomain();
        for (int i = 0; xtagList.size() > i; i++) {
            VtRpXtagDomain listDomain = xtagList.get(i);
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
                    dtlDmain.setShipper2(listDomain.getShipperCd());
                    dtlDmain.setCmlNo2(listDomain.getMainMark());
                } else if ("5".equals(hasu)) {
                    // Set 3 when fraction is 0.5.
                    // 端数が0.5は３
                    dtlDmain.setShipper3(listDomain.getShipperCd());
                    dtlDmain.setCmlNo3(listDomain.getMainMark());
                } else if ("75".equals(hasu)) {
                    // Set 4 when fraction is 0.75.
                    // 端数が0.75は４
                    dtlDmain.setShipper4(listDomain.getShipperCd());
                    dtlDmain.setCmlNo4(listDomain.getMainMark());
                    addFlg = true;
                }
            } else {
                // Set 1 when no fractions.
                // 端数なしは１
                dtlDmain.setShipper1(listDomain.getShipperCd());
                dtlDmain.setCmlNo1(listDomain.getMainMark());
            }
            // Add detail list when the record is last.
            // レコードのラスト もしくは 項目のラスト(No4) だと明細レコードに追加
            if (i + 1 == xtagList.size() || addFlg) {
                detailList.add(dtlDmain);
                addFlg = false;
                dtlDmain = new L2004ReportDetailDomain();
            }
        }
        reportDomain.setDetailList(detailList);
    }


    /**
     * Set the form header item.<br />
     * 帳票ヘッダ項目の設定を行います。
     *
     * @param reportDomain Form domain<br />
     * 帳票ドメイン
     * @param rcCnt Number of records<br />
     * レコード件数
     * @param xtagDomain header information<br />
     * ヘッダ情報
     * @param formatDate date format<br />
     * 日付フォーマット
     * @param lgnCompCd login company code
     * 
     * @throws ApplicationException If the acquisition of the WEIGHT UNIT · capacity can not be gotten then ApplicationException<br />
     * 重量単位・容量の取得ができなかった場合
     * @throws GscmApplicationException If the QR CD can not be produced then GscmApplicationException<br />
     * QRコードが生成できなかった場合
     */
    protected void setRpHead(L2004ReportDomain reportDomain, int rcCnt, VtRpXtagDomain xtagDomain
        , String formatDate, String lgnCompCd) 
        throws ApplicationException, GscmApplicationException {
        
        reportDomain.setContainerSortingKey(xtagDomain.getContainerSortingKey());
        reportDomain.setLdCd(xtagDomain.getLoadingCd());
        reportDomain.setPalletNo(xtagDomain.getPalletNo());
        reportDomain.setCmlNo(xtagDomain.getXmainMark());
        
        // Break line at 30th letter and cut strings by 60 letters.
        // ShipToは 30文字で改行、60文字でカット
        String shipTo = getCutBrStr(xtagDomain.getCompNm(), 30, 60);
        reportDomain.setShipTo(shipTo);

        if (xtagDomain.getTotalShipper() != null) {
            String totalShipper = StringUtil.convertIntegerStr(xtagDomain.getTotalShipper());
            reportDomain.setTotalShipper(totalShipper);
        }
        reportDomain.setCmlType("1");
        String weightUnit = commonService.searchWeightUnit(lgnCompCd);
        String gw = "";
        if (xtagDomain.getGrossWeight() != null) {
            BigDecimal convertGw = commonService.convertWeightUnit(xtagDomain.getGrossWeight(), xtagDomain.getWeightUnit(), weightUnit);
            if (convertGw == null) {
                Object[] params = { 
                    commonService.getResource(reportDomain.getLocale(), "label.totalGrossWeight") 
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            gw = NumberUtil.format(convertGw, FORMAT_WEIGHT);
        }
        reportDomain.setGw(gw);
        String issueDate = DateUtil.formatDate(xtagDomain.getXtagPackingDt(), formatDate);
        reportDomain.setIssueDate(issueDate);

        String issuer = getCutBrStr(xtagDomain.getXtagPackingIssuerNm(), 10, 20);
        reportDomain.setIssuer(issuer);

        reportDomain.setGwUnit(commonService.searchMeasureUnitDisp(weightUnit));
        
        String volumeUnit = commonService.searchVolumeUnit(lgnCompCd);
        
        // Set QR code data
        // QRコードの設定
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            StringBuffer qrCode = new StringBuffer();
            qrCode.append(getQrHeader(xtagDomain.getShipperCd(), QR_HEAD_TYPE_XCML, "0", "0", "01", "014"));
            qrCode.append(QR_HEAD_XCML);
            qrCode.append("05");
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(xtagDomain.getXmainMark()), 17));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(xtagDomain.getContainerSortingKey()), 8));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(xtagDomain.getTrnsCd()), 1));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(xtagDomain.getShipToCompCd()), 5));
            qrCode.append("C");
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(xtagDomain.getLoadingCd()), 1));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(xtagDomain.getCustomTimingTyp()), 1));
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(xtagDomain.getDngrItemFlg()), 1));
            qrCode.append(StringUtil.rPad(weightUnit, 2));
            String nw = "";
            if (xtagDomain.getNetWeight() != null) {
                BigDecimal convertNw = commonService.convertWeightUnit(xtagDomain.getNetWeight(), xtagDomain.getWeightUnit(), weightUnit);
                if (convertNw == null) {
                    Object[] params = { 
                        commonService.getResource(reportDomain.getLocale(), "label.totalNetWeight") 
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                nw = NumberUtil.format(convertNw, FORMAT_WEIGHT);
            }
            qrCode.append(StringUtil.lPad(nw, 11, '0'));
            qrCode.append(StringUtil.lPad(gw, 11, '0'));
            qrCode.append(StringUtil.rPad(volumeUnit, 2));
            String vl = "";
            if (xtagDomain.getVolume() != null) {
                BigDecimal convertVl = commonService.convertVolumeUnit(xtagDomain.getVolume(), xtagDomain.getVolumeUnit(), volumeUnit);
                if (convertVl == null) {
                    Object[] params = { 
                        commonService.getResource(reportDomain.getLocale(), "label.totalVol") 
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                vl = NumberUtil.format(convertVl, FORMAT_VOLUME);
            }
            qrCode.append(StringUtil.lPad(vl, 16, '0'));
            qrCode.append(StringUtil.lPad(String.valueOf(rcCnt) , 3, '0'));
            reportDomain.setQrCd(createQrCode(qrCode.toString(), 130, baos));
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
     * Get form data(header, item).<br />
     * 帳票データ(ヘッダ、明細)を取得します。
     *
     * @param xTagNo Search conditions (X-TagNo) <br />
     * 検索条件(X-TagNo)
     * @param compCd Search conditions (COMPANY CODE)<br />
     * 検索条件(会社コード)
     * @return form data(Header, item)<br />
     * 帳票データ(ヘッダ、明細)情報
     * @throws ApplicationException If the form data can not be obtained then ApplicationException.<br />
     * 帳票データが取得できない場合にスローされます。
     */
    protected List<? extends VtRpXtagDomain> getVtPtXtag(String xTagNo, String compCd) throws ApplicationException {
        // Get target XTag report data.
        // 対象データの取得
        VtRpXtagCriteriaDomain vtRpXtagCriteria = new VtRpXtagCriteriaDomain();
        vtRpXtagCriteria.setXmainMark(xTagNo);
        vtRpXtagCriteria.setPreferredOrder("SHIPPER_CD,MAIN_MARK");
        List<VtRpXtagDomain> xtagList = vtRpXtagService.searchByCondition(vtRpXtagCriteria);
        return xtagList;
    }

    /**
     * Generate a QR CD InputStream.<br />
     * QRコードInputStreamを生成します。
     * 
     * @param insStr String embedded QR CD<br />
     * QRコード埋め込み文字列
     * @param px Pixel<br />
     * ピクセル
     * @param baos Storage Stream<br />
     * 格納用Stream
     * @throws IOException If I / O error has occurred then IOException.<br />
     * 入出力エラーが発生した場合にスローされます。
     * @throws QrcodeGenerateException If a generation of QR CD can not be then QrcodeGenerateException.<br />
     * QRコードの生成ができない場合にスローされます。
     * @return InputStream QR CD object<br />
     * InputStream QRコードオブジェクト
     */
    protected InputStream createQrCode(String insStr, int px, ByteArrayOutputStream baos) throws IOException, QrcodeGenerateException {

        QrcodeGenerator.generateQrcode(insStr, ERR_CORRECTION_LV_M, CHAR_SET_UTF8, px, baos);
        return new ByteArrayInputStream(baos.toByteArray());
    }
}
