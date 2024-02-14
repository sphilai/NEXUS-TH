/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_TYPE_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_LC001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.jasperreports.engine.JasperPrint;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.qrcodegenerate.QrcodeGenerator;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.dao.RpErtDao;
import com.globaldenso.eca0027.core.business.domain.LC001ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.LC001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.LC001TtPltzByHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.LC001TtPltzItemByDetailErtDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzItemByDetailErtCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service [CML (E-RT)] of the LC001.<br />
 * LC001【 CML(E-RT) 】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12983 $
 */
public class LC001ReportServiceImpl extends AbstractReportServiceImpl implements LC001ReportService {
    
    /**
     * RpErtDao
     */
    protected RpErtDao rpErtDao;

    /**
     * CommonService
     */
    protected CommonService commonService;

    /**
     * TtPltzService
     */
    protected TtPltzService ttPltzService;
    
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public LC001ReportServiceImpl() {
    }

    /**
     * Setter method for rpErtDao.
     *
     * @param rpErtDao Set for rpErtDao
     */
    public void setRpErtDao(RpErtDao rpErtDao) {
        this.rpErtDao = rpErtDao;
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
     * Setter method for ttPltzService.
     *
     * @param ttPltzService Set for ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.LC001ReportService#searchErt(String cmlNoFrom, String cmlNoTo, String formatDate)
     */
    public File searchErt(String cmlNoFrom, String cmlNoTo, String formatDate) throws ApplicationException, GscmApplicationException {
        
        List<JasperPrint> reportList = new ArrayList<JasperPrint>();
        
        TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
        if (CheckUtil.isBlankOrNull(cmlNoTo)) {
            criteria.setMainMark(cmlNoFrom);
        } else {
            criteria.setMainMarkGreaterThanEqual(cmlNoFrom);
            criteria.setMainMarkLessThanEqual(cmlNoTo);
        }
        List<TtPltzDomain> domainList = ttPltzService.searchByCondition(criteria);
        
        for (TtPltzDomain domain : domainList) {
            
            LC001ReportDomain reportDomain = new LC001ReportDomain();
            
            // Get header data.
            // ヘッダー情報の取得
            List<? extends LC001TtPltzByHeaderDomain> headerList = getHeader(String.valueOf(domain.getMainMark()));
            if (headerList.size() == 0) {
                continue;
            }
            setHeader(reportDomain, headerList, formatDate);
            
            // Get detail data.
            // 明細情報の取得
            List<? extends LC001TtPltzItemByDetailErtDomain> ttList = getDetail(String.valueOf(domain.getMainMark()));
            setDetail(reportDomain, ttList);
            
            reportList.add(createJasperPrint(REPORT_ID_LC001, reportDomain));
        }
        
        if (reportList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_LC001, reportList);
    }
    
    /**
     * Set to form the domain specification information.<br />
     * 明細情報を帳票ドメインへ設定します。
     *
     * @param reportDomain Form domain<br />
     * 帳票ドメイン
     * @param ttList Description information<br />
     * 明細情報
     */
    protected void setDetail(LC001ReportDomain reportDomain,
        List<? extends LC001TtPltzItemByDetailErtDomain> ttList) {
        List<LC001ReportDetailDomain> detailList = new ArrayList<LC001ReportDetailDomain>();
        for (LC001TtPltzItemByDetailErtDomain detailDm : ttList) {
            LC001ReportDetailDomain detailDomain = new LC001ReportDetailDomain();
            String dscription = getCutBrStr(detailDm.getItemNm(), 30, 60);
            detailDomain.setDescription(dscription);
            detailDomain.setModelCd(detailDm.getModelCd());
            detailDomain.setPkgPartNumber(detailDm.getPalletizeItemNo());
            detailDomain.setQty(detailDm.getSumQty());
            detailList.add(detailDomain);
        }
        reportDomain.setDetailList(detailList);
    }

    /**
     * Set to form the domain header information.<br />
     * ヘッダ情報を帳票ドメインへ設定します。
     *
     * @param reportDomain Form domain<br />
     * 帳票ドメイン
     * @param headerList Header information<br />
     * ヘッダ情報
     * @param formatDate Date format<br />
     * 日付フォーマット
     * @throws ApplicationException Fail to time zone conversion<br />
     * タイムゾーン変換に失敗した場合
     * @throws GscmApplicationException If it was not possible to create the QR CD<br />
     * QRコードが作成できなかった場合
     * @throws SystemException In the case of failure of generation QR CD<br />
     * QRコードの生成失敗の場合
     */ 
    protected void setHeader(LC001ReportDomain reportDomain, List<? extends LC001TtPltzByHeaderDomain> headerList, String formatDate) throws ApplicationException, GscmApplicationException, SystemException {
        
        LC001TtPltzByHeaderDomain headerDomain = headerList.get(0);
        reportDomain.setContSortKey(headerDomain.getContainersortingKey());
        reportDomain.setLdCd(headerDomain.getLoadingCd());
        
        // UT444 delete
        //if ("Y".equals(headerDomain.getInstrFlg())) {
        //    reportDomain.setInstrFlg("Instr.");
        //}
        //if ("A".equals(headerDomain.getTrnsWayCd())) {
        //    reportDomain.setAirFlg("AIR");
        //}
        reportDomain.setCmlNo(headerDomain.getMainMark());
        
        if(null != headerDomain.getShipToNmAbb() && 20 < headerDomain.getShipToNmAbb().length()) {
            reportDomain.setShipToAbbr(headerDomain.getShipToNmAbb().substring(0, 20));
        } else {
            reportDomain.setShipToAbbr(headerDomain.getShipToNmAbb());
        }
        
        // Break line at 30th letter and cut strings by 60 letters.
        // 30文字で改行、60文字でカット
        String shipToCompName = getCutBrStr(headerDomain.getCompNmNxs(), 30, 60);
        reportDomain.setShipToCompName(shipToCompName);
        
        // Break line at 20th letter
        // 20文字で改行
        String returnStyleCd = getCutBrStr(headerDomain.getReturnStyleCd(), 20, 0);
        reportDomain.setReturnStyleCd(returnStyleCd);
        
        reportDomain.setCmlType(headerDomain.getCmlTyp());
        
        String gw = "";
        if (headerDomain.getGrossWeight() != null) {
            gw = NumberUtil.format(headerDomain.getGrossWeight(), FORMAT_WEIGHT);
        }
        reportDomain.setGw(gw + " " + StringUtil.getEmptyToBlank(headerDomain.getUnitDisp()));
        reportDomain.setDueDate(DateUtil.formatDate(headerDomain.getDueDt(), formatDate));
        // Get time zone.
        // タイムゾーン変換日付取得
        Date timezoneDateDt = getTimeZoneDt(headerDomain);
        // Set local time on the time zone.
        // システム日付をロケール変換
        reportDomain.setPrintedDate(DateUtil.formatDate(timezoneDateDt, formatDate));
        
        if(headerDomain.getPrintCompNm1() == null) {
            headerDomain.setPrintCompNm1("");
        }
        if(headerDomain.getPrintCompNm2() == null) {
            headerDomain.setPrintCompNm2("");
        }
        reportDomain.setShipper(headerDomain.getPrintCompNm1() + "\n" + headerDomain.getPrintCompNm2());
        
        // Break line at 20th letter and cut strings by 20 letters.
        // 20文字で改行、20文字でカット
        String issuer = getCutBrStr(headerDomain.getExpPackingIssuerNm(), 20, 20);
        reportDomain.setIssuer(issuer);
        
        String nw = "";
        if (headerDomain.getNetWeight() != null) {
            nw = NumberUtil.format(headerDomain.getNetWeight(), FORMAT_WEIGHT);
        }
        String vl = "";
        if (headerDomain.getVolume() != null) {
            vl = NumberUtil.format(headerDomain.getVolume(), FORMAT_VOLUME);
        }
        // Set Nexus QR code data.
        // QRコード(NEXUS)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            StringBuffer qrCodeNexus = new StringBuffer();
            qrCodeNexus.append(getQrHeader(headerDomain.getShipperCd(), QR_HEAD_TYPE_CML, "0", "0", "01", "018"));
            qrCodeNexus.append(QR_HEAD_CML);
            qrCodeNexus.append("04");               
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getMainMark(), 17));           
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getContainersortingKey(), 8));   
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getTrnsWayCd(), 1));         
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getNxsCompCd(), 5));         
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getCmlTyp(), 1));           
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getLoadingCd(), 1));        
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getDngrItemFlg(), 1));         
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getMultiItemNoFlg(), 1));     
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getWeightUnit(), 2));           
            qrCodeNexus.append(StringUtil.lPad(nw, 11, '0'));           
            qrCodeNexus.append(StringUtil.lPad(gw, 11, '0'));         
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getVolumeUnit(), 2));            
            qrCodeNexus.append(StringUtil.lPad(vl, 16, '0'));                
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getInstrFlg(), 1));               
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getContainerLooseTyp(), 1));      
            qrCodeNexus.append(StringUtil.rPad(headerDomain.getCustomTimingTyp(), 1));        
            qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headerDomain.getReturnStyleCd()), 37));       
            reportDomain.setQrCd(createQrCode(qrCodeNexus.toString(), 130, baos));
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
     * Get the time zone conversion date and time from the MAIN MARK.<br />
     * メインマークからタイムゾーン変換日時を取得します。
     *
     * @param domain MAIN MARK domain<br />
     * メインマークドメイン
     * @return タイムゾーン変換日時
     * @throws ApplicationException Time zone conversion date and time<br />
     * タイムゾーン変換できなかった場合
     */
    protected Date getTimeZoneDt(LC001TtPltzByHeaderDomain domain) throws ApplicationException {
        String timezoneId = commonService.searchTimezone(domain.getShipperCd());
        Date timezoneDateDt = DateUtil.convertTime(new Date(), timezoneId);
        timezoneDateDt = new Date();
        return timezoneDateDt;
    }

    /**
     * Than Palletize, Get the header information.<br />
     * パレタイズより、ヘッダー情報を取得します。
     *
     * @param cmlNo Search condition<br />
     * 検索条件
     * @throws ApplicationException Can not get the header information<br />
     * ヘッダー情報を取得できなかった場合
     * @return Search result<br />
     * 検索結果
     */
    protected List<? extends LC001TtPltzByHeaderDomain> getHeader(String cmlNo) throws ApplicationException {
        LC001TtPltzByHeaderCriteriaDomain criteria = new LC001TtPltzByHeaderCriteriaDomain();
        criteria.setCmlNo(cmlNo);
        List<LC001TtPltzByHeaderDomain> ttPltzByHeaderDomain = rpErtDao.searchTtPltzByHeader(criteria);
        return ttPltzByHeaderDomain;
    }
    
    /**
     * Than Palletize, Get the detail information. <br />
     * パレタイズより、明細情報を取得します。
     *
     * @param cmlNo Search condition<br />検索条件
     * @throws ApplicationException Can not get the detail information<br />
     * 明細情報を取得できなかった場合
     * @return Search result<br />
     * 検索結果
     */
    protected List<? extends LC001TtPltzItemByDetailErtDomain> getDetail(String cmlNo) throws ApplicationException {
        LC001TtPltzItemByDetailErtCriteriaDomain criteria = new LC001TtPltzItemByDetailErtCriteriaDomain();
        criteria.setCmlNo(cmlNo);
        List<LC001TtPltzItemByDetailErtDomain> ttPltzItemByDetailErtDomain = rpErtDao.searchTtPltzItemByDetailErt(criteria);
        return ttPltzItemByDetailErtDomain;
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
     * @throws IOException Thrown when an I / O error has occurred. <br />
     * 入出力エラーが発生した場合にスローされます。
     * @throws QrcodeGenerateException Thrown when a generation of QR CD can not be.<br />
     * QRコードの生成ができない場合にスローされます。
     * @return InputStream QR CD object<br />
     * InputStream QRコードオブジェクト
     */
    protected InputStream createQrCode(String insStr, int px, ByteArrayOutputStream baos) throws IOException, QrcodeGenerateException {

        QrcodeGenerator.generateQrcode(
            insStr,
            ERR_CORRECTION_LV_M,
            CHAR_SET_UTF8,
            px,
            baos);

        return new ByteArrayInputStream(baos.toByteArray());
    }
}
