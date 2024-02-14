/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_STGINSTR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_STGINSTR_DCT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L4001;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.qrcodegenerate.QrcodeGenerator;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpStgInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpStgInstrService;
import com.globaldenso.eca0027.core.business.domain.L4001ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L4001ReportDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of service that outputs the Staging Instruction form
 * <br />Staging Instruction帳票を出力するサービスの実装クラスです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5517 $
 */
public class L4001ReportServiceImpl extends AbstractReportServiceImpl implements L4001ReportService {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * VtRpStgInstrService service.
     */
    protected VtRpStgInstrService vtRpStgInstrService;

    /**
     * Constructor.
     */
    public L4001ReportServiceImpl() {
    }

    // ------------------- Setter of dependent services / Dao -------------------
    // ------------------- 依存サービス・DaoのSetter -------------------

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for vtRpStgInstrService.
     *
     * @param vtRpStgInstrService Set for vtRpStgInstrService
     */
    public void setVtRpStgInstrService(VtRpStgInstrService vtRpStgInstrService) {
        this.vtRpStgInstrService = vtRpStgInstrService;
    }

    //--------------------------------- Search methods ----------------------------------
    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L4001ReportService#searchTtStgInstr(com.globaldenso.eca0027.core.business.domain.L4001ReportDomain)
     */
    public File searchTtStgInstr(L4001ReportDomain l4001ReportCriteriaDomain)
        throws ApplicationException {

        // Search for information to be output to the document
        // 帳票へ出力する情報を検索

        // SACT domain transfer
        // SACTドメイン移送
        VtRpStgInstrCriteriaDomain vtRpStgInstrCriteriaDomain = new VtRpStgInstrCriteriaDomain();
        vtRpStgInstrCriteriaDomain.setStgInstrNo(l4001ReportCriteriaDomain.getStgInstrNo());
        vtRpStgInstrCriteriaDomain.setLanguageCd(l4001ReportCriteriaDomain.getLanguageCd());
        vtRpStgInstrCriteriaDomain.setPreferredOrder("MAIN_MARK desc");
        // search
        // 検索
        List<VtRpStgInstrDomain> resultVtRpStgInstrDomainList
            = vtRpStgInstrService.searchByCondition(vtRpStgInstrCriteriaDomain);
        if (resultVtRpStgInstrDomainList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        VtRpStgInstrDomain resultFirstVtRpStgInstrDomain = resultVtRpStgInstrDomainList.get(0);

        // Conversion to a shipper unit
        // Shipper単位への換算

        VtCompMeasureUnitDomain vtCompMeasureUnitDomain
            = commonService.searchMeasureUnit(resultFirstVtRpStgInstrDomain.getShipperCd());
        covertWeightUnitPltzList(resultVtRpStgInstrDomainList,
            vtCompMeasureUnitDomain.getWeightUnit(), l4001ReportCriteriaDomain.getLocale());
        covertVolumeUnitPltzList(resultVtRpStgInstrDomainList,
            vtCompMeasureUnitDomain.getVolumeUnit(), l4001ReportCriteriaDomain.getLocale());

        // Domain transfer
        // ドメイン移送

        // Time zone conversion date of Shipper
        // Shipperのタイムゾーン変換日付
        Date localDate
            = DateUtil.convertTime(new Date(), commonService.searchTimezone(resultFirstVtRpStgInstrDomain.getShipperCd()));
        String formatedLocalDate = DateUtil.formatDate(localDate, l4001ReportCriteriaDomain.getReportDateFormat());

        // QR code generation
        // QRコード生成
        InputStream qrCdStream = getQrCdStream(l4001ReportCriteriaDomain.getStgInstrNo());

        // SACT domain -> document domain transfer 
        // SACTドメイン→帳票ドメイン移送
        L4001ReportDomain l4001ReportDomain = new L4001ReportDomain();
        CommonUtil.copyPropertiesDomainToDomain(l4001ReportDomain,
            resultVtRpStgInstrDomainList.get(0), l4001ReportCriteriaDomain.getReportDateFormat());
        l4001ReportDomain.setPrintDt(formatedLocalDate);
        l4001ReportDomain.setStgInstrIssuerNm(trunc(l4001ReportDomain.getStgInstrIssuerNm(), 20));
        l4001ReportDomain.setWeightUnitDisp(vtCompMeasureUnitDomain.getWeightUnitDisp());
        l4001ReportDomain.setVolumeUnitDisp(vtCompMeasureUnitDomain.getVolumeUnitDisp());
        l4001ReportDomain.setQrCdStream(qrCdStream);

        List<L4001ReportDetailDomain> l4001ReportDetailDomainList = new ArrayList<L4001ReportDetailDomain>();
        for (VtRpStgInstrDomain vtRpStgInstrDomain : resultVtRpStgInstrDomainList) {
            // SACT domain -> document domain transfer 
            // SACTドメイン→帳票ドメイン移送
            L4001ReportDetailDomain l4001ReportDetailDomain = new L4001ReportDetailDomain();
            CommonUtil.copyPropertiesDomainToDomain(l4001ReportDetailDomain,
                vtRpStgInstrDomain, l4001ReportCriteriaDomain.getReportDateFormat());

            // Danger item flag
            // 危険品フラグ
            if (FLAG_N.equals(l4001ReportDetailDomain.getDngrItemFlg())) {
                l4001ReportDetailDomain.setDngrItemFlg(null);
            }

            l4001ReportDetailDomainList.add(l4001ReportDetailDomain);
        }
        l4001ReportDomain.setDetailDomainList(l4001ReportDetailDomainList);

        // PDF file generation
        // PDFファイル生成

        File resultFile = super.createReport(REPORT_ID_L4001, l4001ReportDomain);

        return resultFile;
    }

    //--------------------------------- Below, protected method  ----------------------------------
    //--------------------------------- 以下、protected メソッド ----------------------------------

    /**
     * Make the weight unit conversion to target a list of VtRpStgInstrDomain
     * <br />VtRpStgInstrDomainのリストを対象に重量単位換算を行います。
     *
     * @param vtRpStgInstrDomainList Updated domain list
     * @param dstUnit Unit after conversion
     * @param locale Locale
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected void covertWeightUnitPltzList(
        List<? extends VtRpStgInstrDomain> vtRpStgInstrDomainList, String dstUnit, Locale locale)
        throws ApplicationException {

        for (VtRpStgInstrDomain vtRpStgInstrDomain : vtRpStgInstrDomainList) {
            BigDecimal pltzWeight = vtRpStgInstrDomain.getGrossWeight();
            // If the weight of the unit domain is different from the unit specified
            // ドメインの重量単位が指定の単位と異なる場合
            if (!dstUnit.equals(vtRpStgInstrDomain.getWeightUnit())) {
                pltzWeight = commonService.convertWeightUnit(pltzWeight, vtRpStgInstrDomain.getWeightUnit(), dstUnit);
                // In the case of overflow the integer part
                // 整数部桁あふれの場合
                if (pltzWeight == null) {
                    Object[] params = {
                        commonService.getResource(locale, "label.grossWeight")
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
            }
            // Number format
            // 数値フォーマット
            vtRpStgInstrDomain.setGrossWeight(pltzWeight.setScale(MAX_SCALE_WEIGHT_UNIT, RoundingMode.UP));
            vtRpStgInstrDomain.setWeightUnit(dstUnit);
        }
    }

    /**
     * Make the volume unit conversion to target a list of VtRpStgInstrDomain
     * <br />VtRpStgInstrDomainのリストを対象に容積単位換算を行います。
     *
     * @param vtRpStgInstrDomainList Updated domain list
     * @param dstUnit Unit after conversion
     * @param locale Locale
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected void covertVolumeUnitPltzList(
        List<? extends VtRpStgInstrDomain> vtRpStgInstrDomainList, String dstUnit, Locale locale)
        throws ApplicationException {

        for (VtRpStgInstrDomain vtRpStgInstrDomain : vtRpStgInstrDomainList) {
            BigDecimal pltzVolume = vtRpStgInstrDomain.getVolume();
            // If the volume of the unit domain is different from the unit specified
            // ドメインの容積単位が指定の単位と異なる場合
            if (!dstUnit.equals(vtRpStgInstrDomain.getVolumeUnit())) {
                pltzVolume = commonService.convertVolumeUnit(pltzVolume, vtRpStgInstrDomain.getVolumeUnit(), dstUnit);
                // In the case of overflow the integer part
                // 整数部桁あふれの場合
                if (pltzVolume == null) {
                    Object[] params = {
                        commonService.getResource(locale, "label.volume")
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
            }
            // Number format
            // 数値フォーマット
            vtRpStgInstrDomain.setVolume(pltzVolume.setScale(MAX_SCALE_VOLUME_UNIT, RoundingMode.UP));
            vtRpStgInstrDomain.setVolumeUnit(dstUnit);
        }
    }

    /**
     * Generates a (staging instruction) QR code, get a data stream
     * <br />QRコード(荷揃え指示)を生成し、ストリームデータを取得します。
     *
     * @param stgInstrNo Staging instruction no.
     * @return QR code stream data
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected InputStream getQrCdStream(String stgInstrNo) throws ApplicationException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        StringBuffer qrCdData = new StringBuffer();
        qrCdData.append(QR_HEAD_STGINSTR);
        qrCdData.append(QR_HEAD_STGINSTR_DCT); 
        qrCdData.append(StringUtil.rPad(StringUtil.getEmptyToBlank(stgInstrNo), 14));
        try {
            // Call of the QR code generation parts
            // QRコード生成部品の呼び出し
            QrcodeGenerator.generateQrcode(
                qrCdData.toString(), ERR_CORRECTION_LV_M, CHAR_SET_UTF8, 130, outputStream
            );

        } catch (QrcodeGenerateException e) {
            throw new GscmApplicationException("NXS-E1-5065", e);
        } finally {
            try {
                outputStream.close();
            } catch(Exception e) {
                throw new SystemException(e);
            }
        }

        return new ByteArrayInputStream(outputStream.toByteArray());
    }

    /**
     * Truncate the end in a specified number of characters.
     * <br />指定の文字数で末尾を切り捨てます。
     *
     * <pre>
     * trunc("abcde", 3) -> "abc"
     * trunc("abcde", 10) -> "abcde"
     * </pre>
     *
     * @param target Target string
     * @param length Number of characters (If you exceed the character of the subject string, and returns the target string.)
     * @return String after processing
     */
    public static String trunc(String target, int length) {

        if (target == null) {
            return target;
        }

        return target.substring(0, Math.min(target.length(), length));
    }
}
