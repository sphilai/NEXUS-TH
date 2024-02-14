/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_SUB_QR_TITLE_EIS_QR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_SUB_QR_TITLE_SINGLE_PLTZ_QR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_SINGLE_PLTZ_QR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_TYPE_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_TYPE_SINGLE_PLTZ_QR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L2003;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import net.sf.jasperreports.engine.JasperPrint;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.time.DateUtils;

import net.sf.jasperreports.engine.JasperPrint;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.qrcodegenerate.QrcodeGenerator;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpCmlHdrMixedPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpCmlHdrMixedPltzService;
import com.globaldenso.eca0027.core.business.dao.RpEisProductDao;
import com.globaldenso.eca0027.core.business.domain.L2003ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L2003ReportDomain;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzBySingleDomain;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzItemByDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzItemByItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzBySingleCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * The implementation class of the form creation service [CML (EIS Parts)] of L2003.
 * <br/>L2003【 CML(EIS Parts) 】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15448 $
 */
public class L2003ReportServiceImpl extends AbstractReportServiceImpl implements L2003ReportService {
    
    /**
     * Palletize Instruction DAO<br />
     * 梱包指示DAO
     */
    protected RpEisProductDao rpEisProductDao;
    
    /**
     * Palletize Service<br />
     * パレタイズService
     */
    protected TtPltzService ttPltzService;
    
    /**
     * VT_RP_CML_HDR_MIXED_PLTZ Service
     */
    protected VtRpCmlHdrMixedPltzService vtRpCmlHdrMixedPltzService;
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;

    /**
     * Type in the functional overview of the constructor.
     *
     */
    public L2003ReportServiceImpl() {
    }
    
    /**
     * Setter method for commonService
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for rpEisProductDao.
     *
     * @param rpEisProductDao Set for rpEisProductDao
     */
    public void setRpEisProductDao(RpEisProductDao rpEisProductDao) {
        this.rpEisProductDao = rpEisProductDao;
    }

    /**
     * Setter method for vtRpCmlHdrMixedPltzService.
     *
     * @param vtRpCmlHdrMixedPltzService Set for vtRpCmlHdrMixedPltzService
     */
    public void setVtRpCmlHdrMixedPltzService(
        VtRpCmlHdrMixedPltzService vtRpCmlHdrMixedPltzService) {
        this.vtRpCmlHdrMixedPltzService = vtRpCmlHdrMixedPltzService;
    }

    /**
     * Setter method for ttPltzService.
     *
     * @param ttPltzService Set for ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L2003ReportService#searchCml(String, String, String)
     */
    public File searchCml(String pltzInstrNo, String cmlNo, String dateFormat) throws ApplicationException {

        List<JasperPrint> reportList = new ArrayList<JasperPrint>();
        
        // Get target main mark. 
        // 印刷対象ケースマークの取得
        List<? extends L2003TtPltzItemByItemNoDomain> mainList = getMainMark(pltzInstrNo, cmlNo);

        if (mainList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        for (L2003TtPltzItemByItemNoDomain domain : mainList) {

            L2003ReportDomain reportDomain = new L2003ReportDomain();
            
            Date timezoneDateDt = getTimeZoneDt(domain);
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            try {
                if (Integer.parseInt(domain.getCountPltzItemNo()) > 1) {
                    // Palletized plural pallet.
                    // 多品
                    VtRpCmlHdrMixedPltzDomain headDm = getHeadInfoManyType(domain);
                    setManyHeadInfoToReportDomain(reportDomain, timezoneDateDt, baos, headDm, dateFormat);
                    // NL012 DEL START
                    //// To get total number of box for CML report
                    //L2003TtPltzItemByDetailCriteriaDomain criteria = new L2003TtPltzItemByDetailCriteriaDomain();
                    //criteria.setMainMark(cmlNo);
                    //// NL009 MERGE START
                    //if(headDm.getPkgFormTyp().equals(PKG_FORM_TYP_MANUAL_REG)){
                    //    reportDomain.setSumNoOfBox(Integer.toString(rpEisProductDao.searchTtPltzItemForTotalNoOfBoxOfManualRegist(criteria)));
                    //} else {
                    //    reportDomain.setSumNoOfBox(Integer.toString(rpEisProductDao.searchTtPltzItemForTotalNoOfBox(criteria)));
                    //}
                    //// NL009 MERGE END
                    // NL012 DEL END
                } else {
                    // Palletized single pallet.
                    // 単品
                    L2003TtPltzBySingleDomain headDm = getHeadInfoSingle(domain, timezoneDateDt);
                    setSingleHeadInfoToReportDomain(reportDomain, timezoneDateDt, baos, headDm, dateFormat);
                    // NL012 DEL START
                    //// In case of single, set total number of box for CML report as '-'
                    //reportDomain.setSumNoOfBox("-");
                    // NL012 DEL END
                }

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
            List<? extends L2003TtPltzItemByDetailDomain> ttPltzItemDetailList = getDetailInfo(domain, timezoneDateDt);
            setDetailInfoToReportDomain(reportDomain, ttPltzItemDetailList);

            // NL012 ADD START
            // Total Box is obtained by summing the number of small boxes of each records.
            // 明細の小箱数を足しあげてTotal Boxを求める。
            int sumNoOfBox = 0;
            for (L2003TtPltzItemByDetailDomain ttPltzItemDetaiDomain : ttPltzItemDetailList) {
                if (NumberUtils.isNumber(ttPltzItemDetaiDomain.getTagQty())) {
                    sumNoOfBox += Integer.parseInt(ttPltzItemDetaiDomain.getTagQty());
                }
            }
            reportDomain.setSumNoOfBox("-");
            if (0 < sumNoOfBox) {
                reportDomain.setSumNoOfBox(String.valueOf(sumNoOfBox));
            }
            // NL012 ADD END

            reportList.add(createJasperPrint(REPORT_ID_L2003, reportDomain));
        }

        return createReport(REPORT_ID_L2003, reportList);
    }

    /**
     * Get the time zone conversion date and time from the MAIN MARK.<br />
     * メインマークからタイムゾーン変換日時を取得します。
     *
     * @param domain MAIN MARK domain<br />
     * メインマークドメイン
     * @return Time zone conversion date and time<br />
     * タイムゾーン変換日時
     * @throws ApplicationException If can not time zone conversion then ApplicationException<br />
     * タイムゾーン変換できなかった場合
     */
    protected Date getTimeZoneDt(L2003TtPltzItemByItemNoDomain domain) throws ApplicationException {
        
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setMainMark(domain.getMainMark());
        String shipperCd = ttPltzService.searchByKey(ttPltzCriteria).getShipperCd();

        String timezoneId = commonService.searchTimezone(shipperCd);
        Date timezoneDateDt = getTimeZoneDtVal(timezoneId);
        return timezoneDateDt;

    }

    /**
     * Type in the functional overview of the method.
     *
     * @param timezoneId TIMEZONE ID<br />
     * タイムゾーンID
     * @return Time zone conversion date and time<br />
     * タイムゾーン変換日時
     */
    protected Date getTimeZoneDtVal(String timezoneId) {
        return DateUtil.convertTime(new Date(), timezoneId);
    }

    /**
     * Set a single item domain header to form domain.<br />
     * 単品ヘッダ情報を帳票ドメインへ設定します。
     *
     * @param reportDomain document domain<br />
     * 帳票ドメイン
     * @param timezoneDateDt time zone conversion date<br />
     * タイムゾーン変換日付
     * @param baos QR CD Stream<br />
     * QRコードStream
     * @param headDm single item header information<br />
     * 単品ヘッダ情報
     * @param dateFormat Format
     * @throws GscmApplicationException 
     * @throws QrcodeGenerateException If it's not possible to create the QR CD then QrcodeGenerateException<br />
     * QRコードが作成できなかった場合
     * @throws IOException If it's not possible to create the QR CD<br />
     * QRコードが作成できなかった場合
     */
    protected void setSingleHeadInfoToReportDomain(L2003ReportDomain reportDomain, Date timezoneDateDt
        , ByteArrayOutputStream baos, L2003TtPltzBySingleDomain headDm, String dateFormat)
        throws IOException, QrcodeGenerateException {

        reportDomain.setCmlNo(StringUtil.getEmptyToBlank(headDm.getMainMark()));
        reportDomain.setContSortKey(headDm.getContainerSortingKey());
        reportDomain.setDueDate(DateUtil.formatDate(headDm.getDueDt(), dateFormat));
        reportDomain.setPalletNo(headDm.getPalletNo());
        String gw = "";
        if (headDm.getGrossWeight() != null) {
            gw = NumberUtil.format(headDm.getGrossWeight(), FORMAT_WEIGHT);
        }
        reportDomain.setGw(gw + " " + StringUtil.getEmptyToBlank(headDm.getPltzUnitDisp()));

        reportDomain.setCmlType(headDm.getCmlTyp());
        reportDomain.setLdCd(headDm.getLoadingCd());
        reportDomain.setItemNo(headDm.getPltzItemNo());
        reportDomain.setQty(headDm.getSumQty());
        reportDomain.setMeasureUnit(headDm.getPltzItemUnitDisp());
        reportDomain.setShipToAbbr(getCutStr(StringUtil.getEmptyToBlank(headDm.getShipToNmAbb()), 20));
        reportDomain.setSingleFlg(true);
        reportDomain.setPrintedDate(DateUtil.formatDate(timezoneDateDt, dateFormat));
        
        // Set BrokenFlg
        // BrokenFlg "*" の判定
        String pkgFormTyp = headDm.getPkgFormTyp();
        int shippingLot = StringUtil.parseInteger(headDm.getShippingLot());
        int SumQty = StringUtil.parseInteger(headDm.getSumQty());
        int tagQty = StringUtil.parseInteger(headDm.getTagQty());
        if ("S".equals(pkgFormTyp) && shippingLot > SumQty) {
            reportDomain.setBrokenFlg(true);
        } else if ("M".equals(pkgFormTyp) && tagQty != 0 ){
            if(shippingLot > ( SumQty / tagQty)){
                reportDomain.setBrokenFlg(true);
            }
        }
        
        // Set Instr lebel data.
        // "Instr."ラベル判定
        if ("Y".equals(headDm.getStgInstrItemFlg())) {
            reportDomain.setInstr(true);
        }
        
        // Set AIR label data.
        // "AIR"ラベル判定
        if ("A".equals(headDm.getTrnsCd())) {
            reportDomain.setAirFlg(true);
        }
        
        // Break line at 30th letter and cut strings by 60 letters.
        // 30文字で改行、60文字でカット【shipTo】
        String shipTo = getCutBrStr(headDm.getShipCompNm(), 30, 60);
        reportDomain.setShipTo(shipTo);
        
        String issuer = getCutBrStr(headDm.getExpPackingIssuerNm(), 10, 20);
        reportDomain.setIssuer(issuer);
        
        String description = getCutBrStr(headDm.getItemDescription(), 20, 40);
        reportDomain.setDescription(description);
        
        reportDomain.setRemarks(StringUtil.getEmptyToBlank(headDm.getCasemarkNotation()));
        
        // Cut strings by 60 letters.
        // 60文字でカット
        reportDomain.setShipper(getCutStr(StringUtil.getEmptyToBlank(headDm.getPltzCompNm()), 60));
        
        reportDomain.setCustomerItemNo(getCutStr(StringUtil.getEmptyToBlank(headDm.getCustomerItemNo()), 20));

        String nw = "";
        if (headDm.getNetWeight() != null) {
            nw = NumberUtil.format(headDm.getNetWeight(), FORMAT_WEIGHT);
        }
        String vl = "";
        if (headDm.getVolume() != null) {
            vl = NumberUtil.format(headDm.getVolume(), FORMAT_VOLUME);
        }
    
        // Set Nexus QR code data
        // QRコードNexus
        StringBuffer qrCodeNexus = new StringBuffer();
        qrCodeNexus.append(getQrHeader(headDm.getShipperCd(), QR_HEAD_TYPE_CML, "0", "0", "01", "018"));
        qrCodeNexus.append(QR_HEAD_CML);
        qrCodeNexus.append("04");
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getMainMark()), 17));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getContainerSortingKey()), 8));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getTrnsCd()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getCompCd()), 5));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getCmlTyp()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getLoadingCd()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getDngrItemFlg()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getPkgFormTyp()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getWeightUnit()), 2));
        qrCodeNexus.append(StringUtil.lPad(nw, 11, '0'));
        qrCodeNexus.append(StringUtil.lPad(gw, 11, '0'));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getVolumeUnit()), 2));
        qrCodeNexus.append(StringUtil.lPad(vl, 16, '0'));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getStgInstrItemFlg()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getContainerLooseTyp()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getCustomTimingTyp()), 1));
        qrCodeNexus.append(StringUtil.rPad("", 37));
        reportDomain.setQrCdNexus(createQrCode(qrCodeNexus.toString(), 130, baos));
        baos.reset();
        
        reportDomain.setMigrationFlg(headDm.getMigrationFlg());
        reportDomain.setSinglePltzQrFlg(headDm.getSinglePltzQrFlg()); // NL047 ADD
        
         // Set Els QR code data
        // QRコードEls
        if ("Y".equals(headDm.getMigrationFlg())) {
            StringBuffer qrCodeEis = new StringBuffer();
            // NL030 MOD START
            //qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getCustomerCd()), 8));
            qrCodeEis.append(StringUtils.leftPad(StringUtil.getEmptyToBlank(headDm.getCustomerCd()), 8, "0"));
            // NL030 MOD END
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getLgcyShipTo()), 2));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getTrnsCd()), 1));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getOldQrMixTyp()), 1));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getOldQrContainerGrpCd()), 1));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getPlntCd()), 2));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getLgcyWhCd()), 1));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getMainMark()), 20));
            BigDecimal grossWeight = headDm.getGrossWeight().setScale(0, BigDecimal.ROUND_UP);
            qrCodeEis.append(StringUtil.lPad(grossWeight.toString(), 9, '0'));
            reportDomain.setQrCdEls(createQrCode(qrCodeEis.toString(), 100, baos));
            reportDomain.setSubQrTitle(CML_SUB_QR_TITLE_EIS_QR); // NL047 ADD
        }
        // NL047 ADD START
        else {
            // When SINGLE PLTZ QR FLAG is "Y"
            // 単品パレタイズQRフラグが"Y"の場合
            if ("Y".equals(headDm.getSinglePltzQrFlg())) {
                StringBuffer qrCodeEis = new StringBuffer();
                qrCodeEis.append(getQrHeader(headDm.getShipperCd(), QR_HEAD_TYPE_SINGLE_PLTZ_QR, "0", "0", "01", "005"));
                qrCodeEis.append(QR_HEAD_SINGLE_PLTZ_QR);
                qrCodeEis.append("06");
                qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getMainMark()), 17));
                qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getCustomerItemNo()), 27));
                qrCodeEis.append(StringUtil.lPad(headDm.getSumQty(), 7, '0'));
                qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getPltzItemNo()), 27));
                reportDomain.setQrCdEls(createQrCode(qrCodeEis.toString(), 130, baos));
                reportDomain.setSubQrTitle(CML_SUB_QR_TITLE_SINGLE_PLTZ_QR); // NL047 ADD
            }
        }
        // NL047 ADD END
    }

    /**
     * Set the multi item header to form domain.<br />
     * 多品ヘッダ情報を帳票ドメインへ設定します。
     *
     * @param reportDomain document domain<br />
     * 帳票ドメイン
     * @param timezoneDateDt time zone conversion date<br />
     * タイムゾーン変換日付
     * @param baos QR CD Stream<br />
     * QRコードStream
     * @param headDm multi item header<br />
     * 多品ヘッダ情報
     * @param dateFormat Format
     * @throws QrcodeGenerateException If it is not possible to create the QR CD then QrcodeGenerateException<br />
     * QRコードが作成できなかった場合
     * @throws IOException If it is not possible to create the QR CD then IOException<br />
     * QRコードが作成できなかった場合
     */
    protected void setManyHeadInfoToReportDomain(L2003ReportDomain reportDomain, Date timezoneDateDt
        , ByteArrayOutputStream baos, VtRpCmlHdrMixedPltzDomain headDm, String dateFormat)
        throws IOException, QrcodeGenerateException {
        
        reportDomain.setCmlNo(StringUtil.getEmptyToBlank(headDm.getMainMark()));
        reportDomain.setContSortKey(headDm.getContainerSortingKey());
        reportDomain.setPalletNo(headDm.getPalletNo());
        reportDomain.setCmlType(headDm.getCmlTyp());
        
        String gw = "";
        if (headDm.getGrossWeight() != null) {
            gw = NumberUtil.format(headDm.getGrossWeight(), FORMAT_WEIGHT);
        }
        reportDomain.setGw(gw + " " + StringUtil.getEmptyToBlank(headDm.getUnitDisp()));

        String nw = "";
        if (headDm.getNetWeight() != null) {
            nw = NumberUtil.format(headDm.getNetWeight(), FORMAT_WEIGHT);
        }
        
        String vl = "";
        if (headDm.getVolume() != null) {
            vl = NumberUtil.format(headDm.getVolume(), FORMAT_VOLUME);
        }

        reportDomain.setLdCd(headDm.getLoadingCd());
        reportDomain.setShipToAbbr(getCutStr(StringUtil.getEmptyToBlank(headDm.getShipToNmAbb()), 20));
        reportDomain.setCustomerItemNo("");
        reportDomain.setQty("");
        reportDomain.setItemNo("");
        reportDomain.setDueDate(DateUtil.formatDate(headDm.getDueDt(), dateFormat));
        reportDomain.setRemarks("");
        reportDomain.setPrintedDate(DateUtil.formatDate(timezoneDateDt, dateFormat));
        
        if ("Y".equals(headDm.getStgInstrItemFlg())) {
            reportDomain.setInstr(true);
        }
        
        if ("A".equals(headDm.getTrnsCd())) {
            reportDomain.setAirFlg(true);
        }
        
        String shipTo = getCutBrStr(headDm.getCompNm1(), 30, 60);
        reportDomain.setShipTo(shipTo);
        
        String issuer = getCutBrStr(headDm.getExpPackingIssuerNm(), 10, 20);
        reportDomain.setIssuer(issuer);
        
        reportDomain.setShipper(getCutStr(StringUtil.getEmptyToBlank(headDm.getCompNm()), 60));
        
        // Set Nexus QR code data
        // QRコードNexus
        StringBuffer qrCodeNexus = new StringBuffer();
        qrCodeNexus.append(getQrHeader(headDm.getShipperCd(), QR_HEAD_TYPE_CML, "0", "0", "01", "018"));
        qrCodeNexus.append(QR_HEAD_CML);
        qrCodeNexus.append("04");
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getMainMark()), 17));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getContainerSortingKey()), 8));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getTrnsCd()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getCompCd()), 5));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getCmlTyp()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getLoadingCd()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getDngrItemFlg()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getPkgFormTyp()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getWeightUnit()), 2));
        // Set net weight.
        qrCodeNexus.append(StringUtil.lPad(nw, 11, '0'));                                                             // NET重量
        // Set gross weight
        qrCodeNexus.append(StringUtil.lPad(gw, 11, '0'));                                                             // GROSS重量
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getVolumeUnit()), 2));
        // Set volume
        qrCodeNexus.append(StringUtil.lPad(vl, 16, '0'));                                                             // 容積
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getStgInstrItemFlg()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getContainerLooseTyp()), 1));
        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getCustomTimingTyp()), 1));
        qrCodeNexus.append(StringUtil.rPad("", 37));
        reportDomain.setQrCdNexus(createQrCode(qrCodeNexus.toString(), 130, baos));
        baos.reset();
        
        reportDomain.setMigrationFlg(headDm.getMigrationFlg());

        // Set Els QR code.
        // QRコードEls
        if ("Y".equals(headDm.getMigrationFlg())) {
            StringBuffer qrCodeEis = new StringBuffer();
            // NL030 MOD START
            //qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getCustomerCd()), 8));
            qrCodeEis.append(StringUtils.leftPad(StringUtil.getEmptyToBlank(headDm.getCustomerCd()), 8, "0"));
            // NL030 MOD END
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getLgcyShipTo()), 2));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getTrnsCd()), 1));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getOldQrMixTyp()), 1));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getOldQrContainerGrpCd()), 1));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getPlntCd()), 2));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getLgcyWhCd()), 1));
            qrCodeEis.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getMainMark()), 20));
            String totalgw = "";
            if (headDm.getGrossWeight() != null) {
                totalgw = headDm.getGrossWeight().setScale(0, BigDecimal.ROUND_UP).toString();
            }
            qrCodeEis.append(StringUtil.lPad(totalgw, 9, '0'));
            reportDomain.setQrCdEls(createQrCode(qrCodeEis.toString(), 100, baos));
            reportDomain.setSubQrTitle(CML_SUB_QR_TITLE_EIS_QR); // NL047 ADD
        }
    }

    /**
     * Get the MAIN MARK list.<br />
     * メインマークリストを取得します。
     *
     * @param pltzInstrNo Search condition<br />
     * 検索条件
     * @param cmlNo Search condition<br />
     * 検索条件
     * @throws ApplicationException If it is not possible to take the MAIN MARK list then ApplicationException <br />
     * メインマークリストが取得できなかった場合
     * @return MAIN MARK list<br />
     * メインマークリスト
     */
    protected List<? extends L2003TtPltzItemByItemNoDomain> getMainMark(String pltzInstrNo, String cmlNo) 
        throws ApplicationException {

        L2003TtPltzItemByItemNoCriteriaDomain criteria = new L2003TtPltzItemByItemNoCriteriaDomain();
        
        if (CheckUtil.isBlankOrNull(pltzInstrNo)) {
            criteria.setCmlNo(cmlNo);
        } else {
            criteria.setPalletizeInstrNo(pltzInstrNo);
        }
        List<L2003TtPltzItemByItemNoDomain> pltzInstrNoList = rpEisProductDao.searchTtPltzItemByItemNo(criteria);
        return pltzInstrNoList;
    }

    /**
     * Get header information (single).<br />
     * ヘッダ情報(単品)を取得します。
     *
     * @param domain MAIN MARK domain<br />
     * メインマークドメイン
     * @param timezoneDateDt time zone conversion date<br />
     * タイムゾーン変換日付
     * @return Header domain<br />
     * ヘッダドメイン
     * @throws ApplicationException If the header information can not be obtained then ApplicationException<br />
     * ヘッダ情報が取得できなかった場合
     */
    protected L2003TtPltzBySingleDomain getHeadInfoSingle( L2003TtPltzItemByItemNoDomain domain, Date timezoneDateDt) throws ApplicationException {
        
        L2003TtPltzBySingleCriteriaDomain criteria = new L2003TtPltzBySingleCriteriaDomain();
        criteria.setMainMark(domain.getMainMark());
        criteria.setAplyStrtDt(DateUtil.formatDate(timezoneDateDt, "yyyy/MM/dd"));
        List<L2003TtPltzBySingleDomain> singleList = rpEisProductDao.searchTtPltzBySingle(criteria);
        L2003TtPltzBySingleDomain headDm = new L2003TtPltzBySingleDomain();
        int sumQty = 0;
        if (null != singleList) {
            if(singleList.size() > 0){
                headDm = singleList.get(0);
                // Count up the total of QTY.
                // QTYの合計を求める
                for (int i = 0; i < singleList.size(); i++) {
                    if (!CheckUtil.isBlankOrNull(singleList.get(i).getSumQty())) {
                        int iQty = Integer.valueOf(singleList.get(i).getSumQty());
                        sumQty = sumQty + iQty;
                    }
                }
                headDm.setSumQty(String.valueOf(sumQty));
                if (1 < singleList.size()) {
                    headDm.setCustomerItemNo("");
                }
                
                // NL047 ADD START
                // Search Export Ship To Shipping MA
                // 輸出送荷先出荷原単位検索
                TmExpShipToShippingCriteriaDomain tmExpShipToShippingCriteriaDomain = new TmExpShipToShippingCriteriaDomain();
                tmExpShipToShippingCriteriaDomain.setCompCd(headDm.getShipperCd());
                tmExpShipToShippingCriteriaDomain.setShipToCd(headDm.getShipToCd());
                tmExpShipToShippingCriteriaDomain.setAplyStrtDt(DateUtils.truncate(timezoneDateDt, Calendar.DAY_OF_MONTH));
                TmExpShipToShippingDomain tmExpShipToShippingResultDomain
                    = rpEisProductDao.searchExpShipToShippingMa(tmExpShipToShippingCriteriaDomain);
                if (tmExpShipToShippingResultDomain != null) {
                    headDm.setSinglePltzQrFlg(tmExpShipToShippingResultDomain.getSinglePltzQrFlg());
                }
                // NL047 ADD END
            }
        }
        return headDm;
    }

    /**
     * Get header information (multi-product).<br />
     * ヘッダ情報(多品)を取得します。
     *
     * @param domain MAIN MARK domain<br />
     * メインマークドメイン
     * @return Header domain<br />
     * ヘッダドメイン
     * @throws ApplicationException If the header information can not be obtained then ApplicationException<br />
     * ヘッダ情報が取得できなかった場合
     */
    protected VtRpCmlHdrMixedPltzDomain getHeadInfoManyType(L2003TtPltzItemByItemNoDomain domain)
        throws ApplicationException {
        
        VtRpCmlHdrMixedPltzCriteriaDomain critria = new VtRpCmlHdrMixedPltzCriteriaDomain();
        critria.setMainMark(domain.getMainMark());
        List<VtRpCmlHdrMixedPltzDomain> vtRpCmlHdrMixedPltzList = vtRpCmlHdrMixedPltzService.searchByCondition(critria);
        if (null != vtRpCmlHdrMixedPltzList && vtRpCmlHdrMixedPltzList.size() > 0) {
            return vtRpCmlHdrMixedPltzList.get(0);
        } else {
            return new VtRpCmlHdrMixedPltzDomain();
        }
    }

    /**
     * Generate a QR CD InputStream.<br />
     * QRコードInputStreamを生成します。
     * 
     * @param insStr String embedded QR CD<br />
     * QRコード埋め込み文字列
     * @param px Pixel<br />
     * ピクセル
     * @param baos storage Stream<br />
     * 格納用Stream
     * @throws IOException It is thrown when an I / O error has occurred then IOException.<br />
     * 入出力エラーが発生した場合にスローされます。
     * @throws QrcodeGenerateException If a eneration of QR CD can not be then QrcodeGenerateException.<br />
     * QRコードの生成ができない場合にスローされます。
     * @return InputStream QR CD object<br />
     * InputStream QRコードオブジェクト
     */
    protected InputStream createQrCode(String insStr, int px, ByteArrayOutputStream baos) throws IOException, QrcodeGenerateException {

        QrcodeGenerator.generateQrcode(insStr, ERR_CORRECTION_LV_M, CHAR_SET_UTF8, px, baos);
        return new ByteArrayInputStream(baos.toByteArray());
    }
    
    /**
     * Get the detail information.<br />
     * 明細情報を取得します。
     *
     * @param domain MAIN MARK domain<br />
     * メインマークドメイン
     * @param timezoneDateDt time zone conversion date<br />
     * タイムゾーン変換日付
     * @return Specification information list<br />
     * 明細情報リスト
     * @throws ApplicationException If the specification information can not be acquired then ApplicationException<br />
     * 明細情報が取得できなかった場合
     */
    protected List<? extends L2003TtPltzItemByDetailDomain> getDetailInfo(L2003TtPltzItemByItemNoDomain domain, Date timezoneDateDt) 
        throws ApplicationException {
        
        L2003TtPltzItemByDetailCriteriaDomain criteria = new L2003TtPltzItemByDetailCriteriaDomain();
        criteria.setMainMark(domain.getMainMark());
        criteria.setAplyStrtDt(DateUtil.formatDate(timezoneDateDt, "yyyy/MM/dd"));
        List<L2003TtPltzItemByDetailDomain> ttPltzItemDetailList = rpEisProductDao.searchTtPltzItemByDetail(criteria);

        return ttPltzItemDetailList;
    }

    /**
     * Set a detail informatiion to the form domain.<br />
     * 明細情報を帳票ドメインへ設定します。
     *
     * @param reportDomain document domain<br />
     * 帳票ドメイン
     * @param ttPltzItemDetailList detail information<br />
     * 明細情報
     */
    protected void setDetailInfoToReportDomain(L2003ReportDomain reportDomain, List<? extends L2003TtPltzItemByDetailDomain> ttPltzItemDetailList) {
        
        List<L2003ReportDetailDomain> detailList = new ArrayList<L2003ReportDetailDomain>();
        // NL012 DEL START
        //String itemNo = "";
        //String customerItemNo = ttPltzItemDetailList.get(0).getCustomerItemNo();
        // NL012 DEL END
        for (L2003TtPltzItemByDetailDomain detailDm : ttPltzItemDetailList) {
            L2003ReportDetailDomain detailDomain = new L2003ReportDetailDomain();
            if ("Y".equals(detailDm.getRtFlg())) {
                detailDomain.setRtOrMixTag(detailDm.getRtFlg());
            } else {
                detailDomain.setRtOrMixTag(detailDm.getMixFlg());
            }
            // Break lines at 30th letter and cut strings by 60 letters.
            // ItemDescriptionは 30文字で改行、60文字でカット
            String description = getCutBrStr(detailDm.getItemDescription(), 30, 60);
            detailDomain.setDescription(description);
            
            if (detailDm.getCasemarkNotation() != null) {
                if (detailDm.getCasemarkNotation().length() <= 25) {
                    detailDomain.setRemarks1(StringUtil.getEmptyToBlank(
                        detailDm.getCasemarkNotation().substring(0, detailDm.getCasemarkNotation().length())));
                }
                if (detailDm.getCasemarkNotation().length() >= 26) {
                    detailDomain.setRemarks1(StringUtil.getEmptyToBlank(
                        detailDm.getCasemarkNotation().substring(0, 25)));
                    detailDomain.setRemarks2(StringUtil.getEmptyToBlank(
                        detailDm.getCasemarkNotation().substring(25, detailDm.getCasemarkNotation().length())));
                }
            }
            if ("N".equals(detailDm.getRtFlg())) {
                detailDomain.setCustItemNoOrModItemNo(detailDm.getCustomerItemNo());
            } else if("Y".equals(detailDm.getRtFlg())){
                detailDomain.setCustItemNoOrModItemNo(detailDm.getModelCd());
            }
            detailDomain.setItemNo(detailDm.getPltzItemNo());
            detailDomain.setQty(detailDm.getSumQty());
            detailDomain.setPkg(detailDm.getPkgCd());
            detailDomain.setShippingLot(detailDm.getShippingLot());
            detailDomain.setNoOfBox(detailDm.getTagQty()); // NL012 ADD
            
            // NL012 DEL START
            //// 同一品番である場合は、箱数を先頭行のみ表示する
            //if(itemNo.equals(detailDm.getPltzItemNo()) && !customerItemNo.equals(detailDm.getCustomerItemNo())) {
            //    detailDomain.setNoOfBox("");
            //} else {
            //    detailDomain.setNoOfBox(detailDm.getTagQty());
            //}
            //itemNo = detailDm.getPltzItemNo();
            //customerItemNo = detailDm.getCustomerItemNo();
            // NL012 DEL END
            
            detailDomain.setCmlNo(detailDm.getMainMark());
            detailList.add(detailDomain);
        }
        reportDomain.setDetailList(detailList);
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
        if (cutIssuer.length() > cut) {
            cutStr = cutIssuer.substring(0, cut);
        } else {
            cutStr = cutIssuer;
        }
        return cutStr;
    }
}