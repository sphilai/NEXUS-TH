/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_STGACT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_STGACT_DCT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L4002;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.qrcodegenerate.QrcodeGenerator;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpStgActDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpStgActService;
import com.globaldenso.eca0027.core.business.dao.RpStgActDao;
import com.globaldenso.eca0027.core.business.domain.L4002ReportDomain;
import com.globaldenso.eca0027.core.business.domain.L4002TtPltzByPalletCartonTypDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L4002TtPltzByPalletCartonTypCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of service that outputs the Staging Actuality form
 * <br />Staging Actuality帳票を出力するサービスの実装クラスです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12983 $
 */
public class L4002ReportServiceImpl extends AbstractReportServiceImpl implements L4002ReportService {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * VtRpStgActService service.
     */
    protected VtRpStgActService vtRpStgActService;
    
    /**
     * RpStgActDao dao.
     */
    protected RpStgActDao rpStgActDao;

    /**
     * Constructor.
     */
    public L4002ReportServiceImpl() {
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
     * Setter method for vtRpStgActService.
     *
     * @param vtRpStgActService Set for vtRpStgActService
     */
    public void setVtRpStgActService(VtRpStgActService vtRpStgActService) {
        this.vtRpStgActService = vtRpStgActService;
    }
    
    /**
     * <p>rpStgActDao のセッターメソッドです。</p>
     *
     * @param rpStgActDao rpStgActDao に設定する
     */
    public void setRpStgActDao(RpStgActDao rpStgActDao) {
        this.rpStgActDao = rpStgActDao;
    }

    //--------------------------------- Search methods ----------------------------------
    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L4002ReportService#searchTtStgAct(com.globaldenso.eca0027.core.business.domain.L4002ReportDomain)
     */
    public File searchTtStgAct(L4002ReportDomain l4002ReportCriteriaDomain)
        throws ApplicationException {

        // Search for information to be output to the document
        // 帳票へ出力する情報を検索

        // SACT domain transfer
        // SACTドメイン移送
        VtRpStgActCriteriaDomain vtRpStgActCriteriaDomain = new VtRpStgActCriteriaDomain();
        vtRpStgActCriteriaDomain.setStgActNo(l4002ReportCriteriaDomain.getStgActNo());
        vtRpStgActCriteriaDomain.setLanguageCd(l4002ReportCriteriaDomain.getLanguageCd());
        // search
        // 検索
        List<VtRpStgActDomain> resultVtRpStgActDomainList
            = vtRpStgActService.searchByCondition(vtRpStgActCriteriaDomain);
        if (resultVtRpStgActDomainList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        VtRpStgActDomain resultVtRpStgActDomain = resultVtRpStgActDomainList.get(0);
        // パレット/カートン区分取得
        L4002TtPltzByPalletCartonTypCriteriaDomain criteriaDomain = new L4002TtPltzByPalletCartonTypCriteriaDomain();
        criteriaDomain.setStgActNo(resultVtRpStgActDomain.getStgActNo());
        List<L4002TtPltzByPalletCartonTypDomain> resultDomain = rpStgActDao.searchTtPltzByPalletCartonTyp(criteriaDomain);
        String pkgList1 = "";
        String pkgList2 = "";
        String pkgList3 = "";
        if(resultDomain.size() > 0) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            String pkgTyp;
            for (L4002TtPltzByPalletCartonTypDomain domain : resultDomain) {
                pkgTyp = domain.getPalletCartonTyp();
                if(pkgTyp == null) {
                    continue;
                }
                if(map.containsKey(pkgTyp)) {
                    map.put(pkgTyp, map.get(pkgTyp).intValue() + 1);
                } else {
                    map.put(pkgTyp, 1);
                }
            }
            Iterator<String> iterator = map.keySet().iterator();
            pkgTyp = "";
            int count = 1;
            while (iterator.hasNext()) {
                String key = iterator.next();
                Integer value = map.get(key);
                pkgTyp = value + " " + key;
                if (pkgTyp.length() > 20) {
                    pkgTyp = pkgTyp.substring(0, 20);
                }
                if (4 >= count && count >= 1) {
                    pkgList1 += "<p>" + pkgTyp + "</p>";
                } else if (9 >= count && count >= 5) {
                    pkgList2 += "<p>" + pkgTyp + "</p>";
                } else if (14 >= count && count >= 10) {
                    pkgList3 += "<p>" + pkgTyp + "</p>";
                } else {
                    break;
                }
                count++ ;
            }
        }

        // Conversion to a login's unit
        // ログイン者単位への換算
        covertWeightUnitStgActRp(resultVtRpStgActDomain,
            l4002ReportCriteriaDomain.getWeightUnit(), l4002ReportCriteriaDomain.getLocale());
        covertVolumeUnitStgActRp(resultVtRpStgActDomain,
            l4002ReportCriteriaDomain.getVolumeUnit(), l4002ReportCriteriaDomain.getLocale());

        // Domain transfer
        // ドメイン移送

        // Time zone conversion date of login user
        // ログイン者のタイムゾーン変換日付
        Date localDate = DateUtil.convertTime(new Date(), l4002ReportCriteriaDomain.getTimeZone());
        String formatedLocalDate = DateUtil.formatDate(localDate, l4002ReportCriteriaDomain.getReportDateFormat());

        // QR code generation
        // QRコード生成
        InputStream qrCdStream = getQrCdStream(l4002ReportCriteriaDomain.getStgActNo());

        // SACT domain -> document domain transfer 
        // SACTドメイン→帳票ドメイン移送
        L4002ReportDomain l4002ReportDomain = new L4002ReportDomain();
        CommonUtil.copyPropertiesDomainToDomain(l4002ReportDomain,
            resultVtRpStgActDomainList.get(0), l4002ReportCriteriaDomain.getReportDateFormat());
        l4002ReportDomain.setPrintDt(formatedLocalDate);
        l4002ReportDomain.setStgActIssuerNm(trunc(l4002ReportDomain.getStgActIssuerNm(), 20));
        l4002ReportDomain.setWeightUnitDisp(l4002ReportCriteriaDomain.getWeightUnitDisp());
        l4002ReportDomain.setVolumeUnitDisp(l4002ReportCriteriaDomain.getVolumeUnitDisp());
        l4002ReportDomain.setQrCdStream(qrCdStream);
        l4002ReportDomain.setPkgList1(pkgList1);
        l4002ReportDomain.setPkgList2(pkgList2);
        l4002ReportDomain.setPkgList3(pkgList3);
        
        // PDF file generation
        // PDFファイル生成
        File resultFile = super.createReport(REPORT_ID_L4002, l4002ReportDomain);

        return resultFile;
    }

    //--------------------------------- Below, protected method  ----------------------------------
    //--------------------------------- 以下、protected メソッド ----------------------------------

    /**
     * Make the weight unit conversion to the target staging actuality report domain
     * <br />山作り実績帳票ドメインを対象に重量単位換算を行います。
     *
     * @param vtRpStgActDomain Updated domain
     * @param dstUnit Unit after conversion
     * @param locale Locale
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected void covertWeightUnitStgActRp(VtRpStgActDomain vtRpStgActDomain, String dstUnit, Locale locale)
        throws ApplicationException {

        BigDecimal weight = vtRpStgActDomain.getGrossWeight();
        // If the weight of the unit staging instruction is different from the unit specified
        // 山作り実績の重量単位が指定の単位と異なる場合
        if (!dstUnit.equals(vtRpStgActDomain.getWeightUnit())) {
            weight = commonService.convertWeightUnit(weight, vtRpStgActDomain.getWeightUnit(), dstUnit);
            // In the case of overflow the integer part
            // 整数部桁あふれの場合
            if (weight == null) {
                Object[] params = {
                    commonService.getResource(locale, "label.totalGrossWeight")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
        }
        // Number format
        // 数値フォーマット
        vtRpStgActDomain.setGrossWeight(weight.setScale(MAX_SCALE_WEIGHT_UNIT, RoundingMode.UP));
        vtRpStgActDomain.setWeightUnit(dstUnit);
    }

    /**
     * Make the volume unit conversion to the target staging actuality report domain
     * <br />山作り実績帳票ドメインを対象に容積単位換算を行います。
     *
     * @param vtRpStgActDomain Updated domain
     * @param dstUnit Unit after conversion
     * @param locale Locale
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected void covertVolumeUnitStgActRp(VtRpStgActDomain vtRpStgActDomain, String dstUnit, Locale locale)
        throws ApplicationException {

        BigDecimal volume = vtRpStgActDomain.getVolume();
        // If the volume of the unit staging instruction is different from the unit specified
        // 山作り実績の容積単位が指定の単位と異なる場合
        if (!dstUnit.equals(vtRpStgActDomain.getVolumeUnit())) {
            volume = commonService.convertVolumeUnit(volume, vtRpStgActDomain.getVolumeUnit(), dstUnit);
            // In the case of overflow the integer part
            // 整数部桁あふれの場合
            if (volume == null) {
                Object[] params = {
                    commonService.getResource(locale, "label.totalVolume")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
        }
        // Number format
        // 数値フォーマット
        vtRpStgActDomain.setVolume(volume.setScale(MAX_SCALE_VOLUME_UNIT, RoundingMode.UP));
        vtRpStgActDomain.setVolumeUnit(dstUnit);
    }

    /**
     * Generates a (staging actuality) QR code, get a data stream
     * <br />QRコード(山作り実績)を生成し、ストリームデータを取得します。
     *
     * @param stgActNo Staging actuality no.
     * @return QR code stream data
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected InputStream getQrCdStream(String stgActNo) throws ApplicationException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        StringBuffer qrCdData = new StringBuffer();
        qrCdData.append(QR_HEAD_STGACT);
        qrCdData.append(QR_HEAD_STGACT_DCT); 
        qrCdData.append(StringUtil.rPad(StringUtil.getEmptyToBlank(stgActNo), 19));
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
