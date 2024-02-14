/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_FULL_RT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5065;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_SHIPPING_FIRM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_SHIPPING_FIRM_DCT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L5001_1;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L5001_2;

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

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.qrcodegenerate.QrcodeGenerator;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpShippingFirmDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpShippingFirmService;
import com.globaldenso.eca0027.core.business.dao.RpShippingFirmDao;
import com.globaldenso.eca0027.core.business.domain.L5001InvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.L5001ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L5001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Interface of the service that outputs a shipping confirmation form
 * <br />出荷確認帳票を出力するサービスのインターフェースです。
 *
 * @author $Author: 400616000407 $
 * @version $Revision: 12983 $
 */
public class L5001ReportServiceImpl extends AbstractReportServiceImpl implements L5001ReportService {

    /**
     * common service.
     */
    protected CommonService commonService;

    /**
     * VtRpShippingFirmService Service.
     */
    protected VtRpShippingFirmService vtRpShippingFirmService;

    /**
     * RpShippingFirmDao Service.
     */
    protected RpShippingFirmDao rpShippingFirmDao;

    /**
     * service of Code Master <br />
     * コード原単位サービス
     */
    protected TmCdService tmCdService;

    /**
     * constructor.
     */
    public L5001ReportServiceImpl() {
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
     * Setter method for vtRpShippingFirmService.
     *
     * @param vtRpShippingFirmService Set for vtRpShippingFirmService
     */
    public void setVtRpShippingFirmService(
        VtRpShippingFirmService vtRpShippingFirmService) {
        this.vtRpShippingFirmService = vtRpShippingFirmService;
    }

    /**
     * Setter method for rpShippingFirmDao.
     *
     * @param rpShippingFirmDao Set for rpShippingFirmDao
     */
    public void setRpShippingFirmDao(RpShippingFirmDao rpShippingFirmDao) {
        this.rpShippingFirmDao = rpShippingFirmDao;
    }

    /**
     * Setter method for tmCdService.
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }

    //--------------------------------- Search methods ----------------------------------
    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L5001ReportService#searchTtShippingFirm(W5001ShippingFirmDomain shippingFirmCriteriaDomain)
     */
    public File searchTtShippingFirm(W5001ShippingFirmDomain shippingFirmCriteriaDomain, String reportDateFormat)
        throws ApplicationException
    {
        // Search for information to be output to the document
        // 帳票へ出力する情報を検索

        // Search shipping confirmation
        // 出荷確認を検索
        VtRpShippingFirmCriteriaDomain vtRpShippingFirmCriteriaDomain = new VtRpShippingFirmCriteriaDomain();
        vtRpShippingFirmCriteriaDomain.setShippingFirmNo(shippingFirmCriteriaDomain.getShippingFirmNo());
        List<VtRpShippingFirmDomain> vtRpShippingFirmResultDomainList
            = vtRpShippingFirmService.searchByCondition(vtRpShippingFirmCriteriaDomain);
        if (vtRpShippingFirmResultDomainList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        VtRpShippingFirmDomain vtRpShippingFirmResultDomain = vtRpShippingFirmResultDomainList.get(0);

        // Search transportation name
        // 輸送手段名の検索
        TmCdCriteriaDomain tmCdCriteriaDomain = new TmCdCriteriaDomain();
        tmCdCriteriaDomain.setCdTyp(CD_TYPE_TRANS_CD);
        tmCdCriteriaDomain.setLngCd(shippingFirmCriteriaDomain.getLanguageCd());
        tmCdCriteriaDomain.setCd(vtRpShippingFirmResultDomain.getTrnsCd());
        TmCdDomain resultTmCdDomain = tmCdService.searchByKey(tmCdCriteriaDomain);
        if (resultTmCdDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Search staging instruction No. list or staging actuality No.
        // If transportation is Air then staging actuality No. else then staging instruction No.
        // 荷揃え指示No.または山作り実績No.を検索
        // 輸送手段がAirの場合、山作り実績No.。そうでない場合、荷揃え指示No.が検索される。
        List<String> resultStgNoList
            = rpShippingFirmDao.searchStgNoByShiipingFirmNo(shippingFirmCriteriaDomain.getShippingFirmNo());
        if (resultStgNoList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Search invoice unit detail list.
        // インボイス単位の明細を検索。
        List<? extends L5001InvoiceDomain> invoiceResultDomainList
            = rpShippingFirmDao.searchInvoiceByShiipingFirmNo(shippingFirmCriteriaDomain.getShippingFirmNo());
        // Conversion to a login user's unit and total Calculation.
        // Convert and total for each invoice, and set to the detail-total and header.
        // If no invoice No.(create invoice after van packed) are converted to what is set in TT_SHIPPING_FIRM, it is set to header.
        // ログイン者の単位への換算、合計計算
        // インボイスごとに換算・積み上げし、明細の合計およびヘッダに設定する。
        // インボイスNo.が紐づいていない場合（バン詰後通関）は、出荷確認に設定されているものを換算し、ヘッダに設定する。
        BigDecimal totalGrossWeight = BigDecimal.ZERO;
        BigDecimal totalVolume = BigDecimal.ZERO;
        if (0 < invoiceResultDomainList.size()) {
            totalGrossWeight = covertWeightUnitInvoiceList(invoiceResultDomainList,
                shippingFirmCriteriaDomain.getWeightUnit(), shippingFirmCriteriaDomain.getLocale());
            totalVolume = covertVolumeUnitInvoiceList(invoiceResultDomainList,
                shippingFirmCriteriaDomain.getVolumeUnit(), shippingFirmCriteriaDomain.getLocale());
        } else {
            totalGrossWeight = covertWeightUnit(vtRpShippingFirmResultDomain.getGrossWeight(),
                vtRpShippingFirmResultDomain.getWeightUnit(), shippingFirmCriteriaDomain.getWeightUnit(),
                    shippingFirmCriteriaDomain.getLocale());
        }

        // Domain transfer
        // ドメイン移送

        // Time zone conversion date of login user
        // ログイン者のタイムゾーン変換日付
        Date localDate = DateUtil.convertTime(new Date(), shippingFirmCriteriaDomain.getTimeZone());
        String formatedLocalDate = DateUtil.formatDate(localDate, reportDateFormat);

        // Header
        // ヘッダ
        L5001ReportDomain l5001ReportDomain = new L5001ReportDomain();
        l5001ReportDomain.setPrintDt(formatedLocalDate);
        l5001ReportDomain.setIssueDt(
            DateUtil.formatDate(vtRpShippingFirmResultDomain.getShippingFirmDt(), reportDateFormat)
        );
        l5001ReportDomain.setIssuerNm(StringUtils.left(vtRpShippingFirmResultDomain.getShippingFirmIssuerNm(), 30));
        l5001ReportDomain.setQrCdStream(getQrCdStream(shippingFirmCriteriaDomain.getShippingFirmNo()));
        l5001ReportDomain.setShippingFirmNo(shippingFirmCriteriaDomain.getShippingFirmNo());
        l5001ReportDomain.setContainerSortingKey(vtRpShippingFirmResultDomain.getContainerSortingKey());
        l5001ReportDomain.setTrnsTypNm(vtRpShippingFirmResultDomain.getTrnsTypNm());
        l5001ReportDomain.setTrnsNm(StringUtils.left(resultTmCdDomain.getValue(), 25));
        for (int i = 0; i < Math.min(resultStgNoList.size(), 8); i++) {
            try {
                PropertyUtils.setProperty(l5001ReportDomain, "stgNo" + (i + 1), resultStgNoList.get(i));
            } catch (Exception e) {
                throw new SystemException(e);
            }
        }
        if (8 < resultStgNoList.size()) {
            l5001ReportDomain.setMore("<More>");
        }
        l5001ReportDomain.setTotalPkgQty(vtRpShippingFirmResultDomain.getPkgQty().toPlainString());
        l5001ReportDomain.setCarrierCompCd(vtRpShippingFirmResultDomain.getCarrierCompCd());
        l5001ReportDomain.setEtd(DateUtil.formatDate(vtRpShippingFirmResultDomain.getEtd(), reportDateFormat));
        l5001ReportDomain.setTotalGrossWeight(totalGrossWeight.toPlainString());
        l5001ReportDomain.setLoginUserWeightUnitDisp(shippingFirmCriteriaDomain.getWeightUnitDisp());
        l5001ReportDomain.setLoginUserVolumeUnitDisp(shippingFirmCriteriaDomain.getVolumeUnitDisp());
        l5001ReportDomain.setContainerNo(vtRpShippingFirmResultDomain.getContainerNo());
        l5001ReportDomain.setTotalVolume(totalVolume.toPlainString());
        l5001ReportDomain.setDetailCount(String.valueOf(invoiceResultDomainList.size()));
        // Detail
        // 明細
        List<L5001ReportDetailDomain> l5001ReportDetailDomainList = new ArrayList<L5001ReportDetailDomain>();
        for (L5001InvoiceDomain invoiceResultDomain : invoiceResultDomainList) {
            L5001ReportDetailDomain l5001ReportDetailDomain = new L5001ReportDetailDomain();
            CommonUtil.copyPropertiesDomainToDomain(l5001ReportDetailDomain, invoiceResultDomain, reportDateFormat);
            if (INVOICE_CLASS_FULL_RT.equals(invoiceResultDomain.getInvoiceClass())) {
                l5001ReportDetailDomain.setPkgQty("(FRT)");
            }
            l5001ReportDetailDomainList.add(l5001ReportDetailDomain);
        }
        l5001ReportDomain.setDetailDomainList(l5001ReportDetailDomainList);

        // PDF file generation
        // PDFファイル生成

        // To combine to create the header and item from another Template.
        // ヘッダと明細を別々の定義体から作成し連結する。
        File headerFile = super.createReport(REPORT_ID_L5001_1, l5001ReportDomain);
        File resultFile = headerFile;
        if (0 < invoiceResultDomainList.size()) {
            File detailFile = super.createReport(REPORT_ID_L5001_2, l5001ReportDomain);
            resultFile = commonService.mergePdf("PDFTEMP", headerFile, detailFile);
        }

        return resultFile;
    }

    //--------------------------------- Below, protected method  ----------------------------------
    //--------------------------------- 以下、protected メソッド ----------------------------------

    /**
     * Make the weight unit conversion to target a list of L5001InvoiceDomain
     * <br />L5001InvoiceDomainのリストを対象に重量単位換算を行います。
     *
     * @param invoiceDomainList updated domain list
     * @param dstUnit unit after conversion
     * @param locale locale
     * @return total gross weight
     * @throws ApplicationException business exception
     */
    protected BigDecimal covertWeightUnitInvoiceList(List<? extends L5001InvoiceDomain> invoiceDomainList, String dstUnit, Locale locale)
        throws ApplicationException
    {
        BigDecimal totalGrossWeight = BigDecimal.ZERO;

        for (L5001InvoiceDomain invoiceDomain : invoiceDomainList) {

            if (INVOICE_CLASS_FULL_RT.equals(invoiceDomain.getInvoiceClass())) {
                continue;
            }

            BigDecimal workGrossWeight = invoiceDomain.getOriginalGrossWeight();
            // If the weight of the unit domain is different from the unit specified
            // ドメインの重量単位が指定の単位と異なる場合
            if (!dstUnit.equals(invoiceDomain.getOriginalWeightUnit())) {
                workGrossWeight
                    = commonService.convertWeightUnit(workGrossWeight, invoiceDomain.getOriginalWeightUnit(), dstUnit);
                if (workGrossWeight == null) { // overflow
                    Object[] params = {
                        commonService.getResource(locale, "label.grossWeight")
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
            }
            invoiceDomain.setGrossWeight(workGrossWeight.setScale(MAX_SCALE_WEIGHT_UNIT, RoundingMode.UP));
            totalGrossWeight = totalGrossWeight.add(invoiceDomain.getGrossWeight());
            if (commonService.isWeightOverflow(totalGrossWeight)) { // overflow
                Object[] params = {
                    commonService.getResource(locale, "label.grossWeight")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
        }

        return totalGrossWeight;
    }

    /**
     * Make the volume unit conversion to target a list of L5001InvoiceDomain
     * <br />L5001InvoiceDomainのリストを対象に容積単位換算を行います。
     *
     * @param invoiceDomainList updated domain list
     * @param dstUnit unit after conversion
     * @param locale locale
     * @return total volume
     * @throws ApplicationException business exception
     */
    protected BigDecimal covertVolumeUnitInvoiceList(List<? extends L5001InvoiceDomain> invoiceDomainList, String dstUnit, Locale locale)
        throws ApplicationException
    {
        BigDecimal totalVolume = BigDecimal.ZERO;

        for (L5001InvoiceDomain invoiceDomain : invoiceDomainList) {

            if (INVOICE_CLASS_FULL_RT.equals(invoiceDomain.getInvoiceClass())) {
                continue;
            }

            BigDecimal workVolume = invoiceDomain.getOriginalVolume();
            // If the volume of the unit domain is different from the unit specified
            // ドメインの容積単位が指定の単位と異なる場合
            if (!dstUnit.equals(invoiceDomain.getOriginalVolumeUnit())) {
                workVolume
                    = commonService.convertVolumeUnit(workVolume, invoiceDomain.getOriginalVolumeUnit(), dstUnit);
                if (workVolume == null) { // overflow
                    Object[] params = {
                        commonService.getResource(locale, "label.volume")
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
            }
            invoiceDomain.setVolume(workVolume.setScale(MAX_SCALE_VOLUME_UNIT, RoundingMode.UP));
            totalVolume = totalVolume.add(invoiceDomain.getVolume());
            if (commonService.isVolumeOverflow(totalVolume)) { // overflow
                Object[] params = {
                    commonService.getResource(locale, "label.volume")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
        }

        return totalVolume;
    }

    /**
     * Make the weight unit conversion
     * <br />重量単位換算を行います。
     *
     * @param weight before weight
     * @param srcUnit unit before conversion
     * @param dstUnit unit after conversion
     * @param locale locale
     * @return converted weight
     * @throws ApplicationException business exception
     */
    protected BigDecimal covertWeightUnit(BigDecimal weight, String srcUnit, String dstUnit, Locale locale)
        throws ApplicationException
    {
        BigDecimal workGrossWeight = weight;
        // If the weight of the unit domain is different from the unit specified
        // ドメインの重量単位が指定の単位と異なる場合
        if (!dstUnit.equals(srcUnit)) {
            workGrossWeight = commonService.convertWeightUnit(workGrossWeight, srcUnit, dstUnit);
            if (workGrossWeight == null) { // overflow
                Object[] params = {
                    commonService.getResource(locale, "label.grossWeight")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
        }
        workGrossWeight = workGrossWeight.setScale(MAX_SCALE_WEIGHT_UNIT, RoundingMode.UP);

        return workGrossWeight;
    }

    /**
     * Generates a (Shipping confirmation) QR code, get a data stream
     * <br />QRコード(出荷確認)を生成し、ストリームデータを取得します。
     *
     * @param shippingFirmNo Shipping confirmation No.
     * @return QR code stream data
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected InputStream getQrCdStream(String shippingFirmNo) throws ApplicationException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        StringBuffer qrCdData = new StringBuffer();
        qrCdData.append(QR_HEAD_SHIPPING_FIRM);
        qrCdData.append(QR_HEAD_SHIPPING_FIRM_DCT);
        qrCdData.append(StringUtil.rPad(StringUtil.getEmptyToBlank(shippingFirmNo), 14));
        try {
            // Call of the QR code generation parts
            // QRコード生成部品の呼び出し
            QrcodeGenerator.generateQrcode(
                qrCdData.toString(), ERR_CORRECTION_LV_M, CHAR_SET_UTF8, 130, outputStream
            );
        } catch (QrcodeGenerateException e) {
            throw new GscmApplicationException(NXS_E1_5065, e);
        } finally {
            try {
                outputStream.close();
            } catch(Exception e) {
                throw new SystemException(e);
            }
        }

        return new ByteArrayInputStream(outputStream.toByteArray());
    }
}
