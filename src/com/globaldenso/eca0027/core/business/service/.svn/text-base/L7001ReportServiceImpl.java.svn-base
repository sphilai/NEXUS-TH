/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_E_RT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L7001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L7002;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import net.sf.jasperreports.engine.JasperPrint;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.dao.RpShippingActDao;
import com.globaldenso.eca0027.core.business.domain.L7001ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L7001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.L7001TtPltzByHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.L7001TtPltzByImporterDomain;
import com.globaldenso.eca0027.core.business.domain.L7001TtShippingActByHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.L7001TtShippingFirmByHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.L7002ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L7002ReportDomain;
import com.globaldenso.eca0027.core.business.domain.L7002TtShippingFirmByDetailDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByImporterCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByNoOfInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtShippingActByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtShippingFirmByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7002TtShippingFirmByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * An implementation class of form creation service of L7001 [Container Loading Plan].
 * <br />L7001【 Container Loading Plan 】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000160 $
 * @version $Revision: 13005 $
 */
public class L7001ReportServiceImpl extends AbstractReportServiceImpl implements L7001ReportService {

    /**
     * Bl No.(for display)
     */
    protected final String  BL_NO_NONE = "**********";
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;

    /**
     * L700XDao
     */
    protected RpShippingActDao rpShippingActDao;

    /**
     * Palletize Dao<br />
     * パレタイズDao
     */
    protected TtPltzService ttPltzService;

    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L7001ReportServiceImpl() {
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
     * Setter method for rpShippingActDao.
     *
     * @param rpShippingActDao Set for rpShippingActDao
     */
    public void setRpShippingActDao(RpShippingActDao rpShippingActDao) {
        this.rpShippingActDao = rpShippingActDao;
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
     * @see com.globaldenso.eca0027.core.business.service.L7001ReportService#searchShippingAct(String, String, String)
     */
    public File searchShippingAct(String shippingActNo, String shipper, String fmt) throws ApplicationException {

        L7001ReportDomain l7001RpDomain = new L7001ReportDomain();
        
        // Get header data
        // ヘッダー情報(共通の項目)の取得
        List<? extends L7001TtShippingActByHeaderDomain> headHeadList = getHeadInfo(shippingActNo);
        if (headHeadList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Get shipping confirm numbers as a search key list.
        // 検索条件(出荷確認No)リスト生成
        List<String> firmNoList = new ArrayList<String>();
        for (L7001TtShippingActByHeaderDomain domain : headHeadList) {
            if (!CheckUtil.isBlankOrNull(domain.getShippingFirmNo())) {
                if (!firmNoList.contains(domain.getShippingFirmNo())) { // ADD if 2016/3/30
                    firmNoList.add(domain.getShippingFirmNo());
                }
            }
        }
        
        List<? extends L7001TtPltzByHeaderDomain> exportList = getExportCntList(firmNoList);
        
        List<? extends L7001TtPltzByImporterDomain> importList = getImportCntList(firmNoList);
        
        int noOfInvoiceCnt = getNoOfInvoiceCnt(firmNoList);

        String baseVlmUnit = commonService.searchVolumeUnit(shipper);
        String vlmUnitDisp = commonService.searchMeasureUnitDisp(baseVlmUnit);

        // Header Page: file Header.
        // Headerページ: ヘッダの設定
        setRp7001Head(l7001RpDomain, exportList, importList, noOfInvoiceCnt, headHeadList.get(0), fmt, vlmUnitDisp, shipper);

        // Header page: List. 
        // Headerページ: 一覧部分の設定
        setRp7001Detail(shippingActNo, l7001RpDomain, firmNoList, baseVlmUnit);
        
        List<JasperPrint> reportList = new ArrayList<JasperPrint>();
        
        reportList.add(createJasperPrint(REPORT_ID_L7001, l7001RpDomain));
        
        //Before FirmNo Initial
        String beforeContainerNo =  "";
        String containerNo = "";
        // Get Report information
        L7002TtShippingFirmByDetailCriteriaDomain condition = new L7002TtShippingFirmByDetailCriteriaDomain();
        condition.setFirmNoList(firmNoList);
        List<L7002TtShippingFirmByDetailDomain> detailList = rpShippingActDao.searchTtShippingFirmByDetail(condition);
        if (null == detailList || detailList.isEmpty()){
            // Make Pdf Report
            return createReport(REPORT_ID_L7001, reportList);
        }
        // Set detail data.
        // 【Detail帳票】
        int cntOfPkg = 0;
        int i = 0;
        int j = 0;
        for ( i = 0; i < detailList.size(); i++){
            L7002TtShippingFirmByDetailDomain detail = detailList.get(i);
            containerNo = detail.getContainerNo();
            if(!beforeContainerNo.equals(containerNo)){
                cntOfPkg = 0;
                beforeContainerNo = containerNo;
                // Set header
                L7002ReportDomain l7002RpDomain = new L7002ReportDomain();
                l7002RpDomain.setContainerNo(detail.getContainerNo());
                l7002RpDomain.setUnit(vlmUnitDisp);
                
                // Evacuation Data 
                String beforExporter = "";
                String beforImporter = "";
                String beforBlNo = "";
                String beforInvoiceNo = "";
                
                // Set Detail
                List<L7002ReportDetailDomain> dlist = new ArrayList<L7002ReportDetailDomain>();
                for ( j = i; j < detailList.size(); j++, i++){
                    cntOfPkg++;
                    L7002TtShippingFirmByDetailDomain detailInfo = detailList.get(j);
                    L7002ReportDetailDomain detailInfoDomain = new L7002ReportDetailDomain();
    
                    // Print Exporter・Importer・B/LNo. 
                    // Exporter・Importer・B/LNo. の表示
                    if (CheckUtil.isBlankOrNull(detailInfo.getBilldNo())) {
                        // B/L No. == NULL => Display 3 Item
    
                        // Exporter
                        // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                        detailInfoDomain.setExporter(detailInfo.getShipperCd());
                        detailInfoDomain.setExporter(detailInfo.getShipperNmAbb());
                        // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
                        // Importer
                        // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                        detailInfoDomain.setImporter(detailInfo.getCompCd());
                        detailInfoDomain.setImporter(detailInfo.getShipToCompNmAbb());
                        // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
                        // B/L No.
                        detailInfoDomain.setBlNo("**********");

                    // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                    } else if (!beforExporter.equals(detailInfo.getShipperCd())
//                        || !beforImporter.equals(detailInfo.getCompCd())
//                        || !beforBlNo.equals(detailInfo.getBilldNo())) {
                    } else if (!beforExporter.equals(detailInfo.getShipperCd())
                        || !beforImporter.equals(detailInfo.getShipToCompCd())
                        || !beforBlNo.equals(detailInfo.getBilldNo())) {
                    // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<

                        // Container no. == before data  and
                        // (Exporter != before data or 
                        //  Importer != before data or 
                        //  B/L No.  != before data  => Display
    
                        // Exporter
                        // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                        detailInfoDomain.setExporter(detailInfo.getShipperCd());
                        detailInfoDomain.setExporter(detailInfo.getShipperNmAbb());
                        // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
                        // Importer
                        // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                        detailInfoDomain.setImporter(detailInfo.getCompCd());
                        detailInfoDomain.setImporter(detailInfo.getShipToCompNmAbb());
                        // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
                        // B/L No.
                        detailInfoDomain.setBlNo(detailInfo.getBilldNo());
                    }
    
                    if (!beforInvoiceNo.equals(detailInfo.getInvoiceNo())) {
                        // Invoice No.
                        detailInfoDomain.setInvoiceNo(detailInfo.getInvoiceNo());
                    }
                    
                    // CML
                    detailInfoDomain.setCml(detailInfo.getMainMark());
                    
                    // Vol.(単位)
                    if (detailInfo.getVolume() != null) {
                        // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                        BigDecimal convertVl = commonService.convertVolumeUnit(detailInfo.getVolume(), detailInfo.getVolumeUnit(), baseVlmUnit);
//                        if (convertVl == null) {
//                            Object[] params = {
//                                commonService.getResource(l7001RpDomain.getLocale(), "label.vol") 
//                            }; 
//                            throw new GscmApplicationException(NXS_E7_0157, params); 
//                        }
//                        detailInfoDomain.setM3(NumberUtil.format(convertVl, FORMAT_VOLUME));                        
                        detailInfoDomain.setM3(calculateVolume(detailInfo.getVolume(), detailInfo.getVolumeUnit(), baseVlmUnit, l7001RpDomain.getLocale()));
                        // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
                    }
                    
                    // Site
                    detailInfoDomain.setSite(detailInfo.getSiteTyp());
    
                    // Evacuation Before Data
                    beforExporter  = StringUtil.getEmptyToBlank(detailInfo.getShipperCd());
                    // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                    beforImporter  = StringUtil.getEmptyToBlank(detailInfo.getCompCd());
                    beforImporter  = StringUtil.getEmptyToBlank(detailInfo.getShipToCompCd());
                    // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
                    beforBlNo      = StringUtil.getEmptyToBlank(detailInfo.getBilldNo());
                    beforInvoiceNo = StringUtil.getEmptyToBlank(detailInfo.getInvoiceNo());
                    
                    dlist.add(detailInfoDomain);
                    if (j + 1 < detailList.size()){
                        containerNo = detailList.get(j + 1).getContainerNo();
                        if(!beforeContainerNo.equals(containerNo)){
                            break;
                        }
                    }
                }
                l7002RpDomain.setDetailList(dlist);
                l7002RpDomain.setNoOfPkg(String.valueOf(cntOfPkg));
                
                reportList.add(createJasperPrint(REPORT_ID_L7002, l7002RpDomain));
            }
        }
        
        // Make Pdf Report
        return createReport(REPORT_ID_L7001, reportList);
    }

    /**
     * Set the specification of the form Head.<br />
     * Head帳票の明細を設定します。
     *
     * @param shippingActNo Takeover VALUE. Shipping Actuality No<br />
     * 引継値.Shipping Actuality No
     * @param l7001RpDomain Takeover VALUE. Shipping Actuality No<br />
     * Head帳票ドメイン
     * @param firmNoList Shipping Confirmation No list<br />
     * 出荷確認Noリスト
     * @param baseVlmUnit VOLUME UNIT<br />
     * 容積単位
     * @throws ApplicationException If each information can not be obtained<br />
     * 各情報が取得できない場合
     */
    protected void setRp7001Detail(String shippingActNo, L7001ReportDomain l7001RpDomain
        , List<String> firmNoList, String baseVlmUnit) 
        throws ApplicationException {
        
        String lastContainer = "";
        String lastShipperCd = "";
        String lastShipToCompCd = "";
        String lastBlNo = "";
        
        // ReportHead detail List
        List<L7001ReportDetailDomain> headRpDetailList = new ArrayList<L7001ReportDetailDomain>();
        
        // Get List data for Header page.
        List<? extends L7001TtShippingFirmByHeaderDomain> headDetailList = getHeadDetailList(firmNoList, shippingActNo);
        
        // Setting print information.
        for (L7001TtShippingFirmByHeaderDomain headDetailDomain : headDetailList) {
            L7001ReportDetailDomain detailDomain = new L7001ReportDetailDomain();
            
            // Container No, Size
            if (lastContainer.equals(StringUtil.getEmptyToBlank(headDetailDomain.getContainerNo()))) {
                detailDomain.setContainerNo("");
                detailDomain.setSize("");
                
                // set Exporter, Importer and B/L No.
                boolean viewFlag = lastShipperCd.equals(StringUtil.getEmptyToBlank(headDetailDomain.getShipperCd())) 
                    && lastShipToCompCd.equals(StringUtil.getEmptyToBlank(headDetailDomain.getShipToCompCd())) 
                    && lastBlNo.equals(StringUtil.getEmptyToBlank(headDetailDomain.getBilldNo()));
                // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                setHeaderDetailDomain(detailDomain, viewFlag, headDetailDomain.getShipperCd(), headDetailDomain.getShipToCompCd(), headDetailDomain.getBilldNo());
                setHeaderDetailDomain(detailDomain, viewFlag, headDetailDomain.getShipperNmAbb(), headDetailDomain.getShipToCompNmAbb(), headDetailDomain.getBilldNo());
                // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
            } else {
                detailDomain.setContainerNo(headDetailDomain.getContainerNo());
                detailDomain.setSize(headDetailDomain.getTrnsTypNm());
                
                // set Exporter, Importer and B/L No.
                // 2015/2/24 DNJP.Kawamura UT112&不具合対応 START >>>>>
//                setHeaderDetailDomain(detailDomain, true, headDetailDomain.getShipperCd(), headDetailDomain.getShipToCompCd(), headDetailDomain.getBilldNo());
                setHeaderDetailDomain(detailDomain, false, headDetailDomain.getShipperNmAbb(), headDetailDomain.getShipToCompNmAbb(), headDetailDomain.getBilldNo());
                // 2015/2/24 DNJP.Kawamura UT112&不具合対応 END <<<<<
            }
            lastContainer = StringUtil.getEmptyToBlank(headDetailDomain.getContainerNo());
            lastShipperCd = StringUtil.getEmptyToBlank(headDetailDomain.getShipperCd());
            lastShipToCompCd = StringUtil.getEmptyToBlank(headDetailDomain.getShipToCompCd());
            lastBlNo = StringUtil.getEmptyToBlank(headDetailDomain.getBilldNo());
            
            // Invoice No
            detailDomain.setInvoiceNo(headDetailDomain.getInvoiceNo());
            
            // F-RT
            if ("0".equals(headDetailDomain.getCountInvoiceNo())) {
                detailDomain.setFrtFlg("");
            } else {
                detailDomain.setFrtFlg(headDetailDomain.getCountInvoiceNo());
            }
            
            // E-RT
            if (INVOICE_CLASS_E_RT.equals(headDetailDomain.getInvoiceClass())) {
                detailDomain.setErtFlg(FLAG_Y);
            } else {
                detailDomain.setErtFlg("");
            }
            
            // PKG QTY
            detailDomain.setPkg(headDetailDomain.getCountMainMark());
            
            // Vol Unit
            detailDomain.setUnit(baseVlmUnit);
            // Vol
            // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//            detailDomain.setM3(calculateVolume(headDetailDomain.getShippingFirmNo(), headDetailDomain.getShipperCd()
//                , headDetailDomain.getInvoiceNo(), headDetailDomain.getInvoiceIssueDt(), baseVlmUnit, l7001RpDomain.getLocale()));
            detailDomain.setM3(calculateVolume(headDetailDomain.getVolume(), headDetailDomain.getVolumeUnit(), baseVlmUnit, l7001RpDomain.getLocale()));
            // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
            
            headRpDetailList.add(detailDomain);
        }
        l7001RpDomain.setDetailList(headRpDetailList);
    }
    
    /**
     * Set header detail list data(for Exporter, Importer and B/L No.)
     * <br />headerページの一覧表示データを設定します(Exporter、Importer、B/L Noのみ)
     * 
     * @param detailDomain header page detail domain for setting.
     * @param viewFlag true is setting display data
     * @param shipperNmAbb shipper name abb(Exporter)
     * @param shipToCompNmAbb ship to comp name abb(Importer)
     * @param blNo B/L No.
     */
    // 2015/2/24 DNJP.Kawamura UT112&不具合対応 START >>>>>
//    protected void setHeaderDetailDomain(L7001ReportDetailDomain detailDomain, boolean viewFlag, String shipperCd
//        , String shipToCompCd, String blNo) {
//        if (viewFlag || CheckUtil.isBlankOrNull(blNo)) {
//            detailDomain.setExporter(shipperCd);
//            detailDomain.setImporter(shipToCompCd);
//            if (CheckUtil.isBlankOrNull(blNo)) {
//                detailDomain.setBlNo(BL_NO_NONE);
//            } else {
//                detailDomain.setBlNo(blNo);
//            }
//        } else {
//            detailDomain.setExporter("");
//            detailDomain.setImporter("");
//            detailDomain.setBlNo("");
//        }    
//    }
    protected void setHeaderDetailDomain(L7001ReportDetailDomain detailDomain, boolean viewFlag, String shipperNmAbb
        , String shipToCompNmAbb, String blNo) {

        // if shipper,shipToComp,blNo "not" equal with front data -> display
        // if shipper,shipToComp,blNo equal front with data -> not display
        // if blNo is blank or null -> display
        if (!viewFlag || CheckUtil.isBlankOrNull(blNo)) {
            detailDomain.setExporter(shipperNmAbb);
            detailDomain.setImporter(shipToCompNmAbb);
            if (CheckUtil.isBlankOrNull(blNo)) {
                detailDomain.setBlNo(BL_NO_NONE);
            } else {
                detailDomain.setBlNo(blNo);
            }
        } else {
            detailDomain.setExporter("");
            detailDomain.setImporter("");
            detailDomain.setBlNo("");
        }
    }
    // 2015/2/24 DNJP.Kawamura UT112&不具合対応 END <<<<<
    
    /**
     * 
     * Get Volume.
     * 
     * @param volume volume
     * @param volumeUnit shipper volume unit
     * @param baseVlmUnit shipper(CLP) volume unit
     * @param locale locale
     * @return volume, null is overflow check is performed
     * @throws ApplicationException ApplicationException
     */
    // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//    protected String calculateVolume(String shippingFirmNo, String shipperCd, String invoiceNo, Date invoiceIssueDt, String volumUnit, Locale locale) 
//        throws ApplicationException {
//        
//        // Get Volume.
//        TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
//        criteria.setShippingFirmNo(shippingFirmNo);
//        criteria.setShipperCd(shipperCd);
//        criteria.setInvoiceNo(invoiceNo);
//        criteria.setInvoiceIssueDt(invoiceIssueDt);
//        List<? extends TtPltzDomain> ttPltzList = ttPltzService.searchByCondition(criteria);
//
//        // Calculate Volume.
//        BigDecimal allVolume = BigDecimal.ZERO;
//        for (TtPltzDomain ttPltzDomain : ttPltzList) {
//            BigDecimal volume = commonService.convertVolumeUnit(ttPltzDomain.getVolume(), ttPltzDomain.getVolumeUnit(), volumUnit);
//            if (volume == null) {
//                Object[] params = {commonService.getResource(locale, "label.vol")}; 
//                throw new GscmApplicationException(NXS_E7_0157, params); 
//            }
//            allVolume = allVolume.add(volume);
//        }
//        return NumberUtil.format(allVolume, FORMAT_VOLUME);
//    }
    protected String calculateVolume(BigDecimal volume, String volumeUnit, String baseVlmUnit, Locale locale)
        throws ApplicationException {

        BigDecimal afterVolume = commonService.convertVolumeUnit(volume, volumeUnit, baseVlmUnit);
        if (volume == null) {
            Object[] params = {commonService.getResource(locale, "label.vol")}; 
            throw new GscmApplicationException(NXS_E7_0157, params); 
        }
        return NumberUtil.format(afterVolume, FORMAT_VOLUME);
    }    
    // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
    
    /**
     * Header information setting of Head form<br />
     * Head帳票のヘッダ情報設定
     *
     * @param l7001RpDomain Head form domain<br />
     * Head帳票ドメイン
     * @param exportList Export information list<br />
     * Export情報リスト
     * @param importList Import information list<br />
     * Import情報リスト
     * @param noOfInvoiceCnt NoOfInvoice information number<br />
     * NoOfInvoice情報件数
     * @param headHeadDomain Header information<br />
     * ヘッダ情報
     * @param fmt Date format<br />
     * 日付フォーマット
     * @param baseVlmUnit VOLUME UNIT<br />
     * 容積単位
     * @param shipper Screen takeover VALUE<br />
     * 画面引継値
     * @throws ApplicationException If the time zone conversion date can not be obtained<br />
     * タイムゾーン変換日付が取得できない場合
     */
    protected void setRp7001Head(L7001ReportDomain l7001RpDomain, List<? extends L7001TtPltzByHeaderDomain> exportList
        , List<? extends L7001TtPltzByImporterDomain> importList, int noOfInvoiceCnt
        , L7001TtShippingActByHeaderDomain headHeadDomain, String fmt, String baseVlmUnit, String shipper) 
        throws ApplicationException {
        
        // Vessel Name
        l7001RpDomain.setVesselName(headHeadDomain.getVessel());
        
        // Printed date
        String timezoneId = commonService.searchTimezone(shipper);
        Date sysdate = DateUtil.convertTime(new Date(), timezoneId);
        l7001RpDomain.setPrintedDate(DateUtil.formatDate(sysdate, fmt));
        
        // Shipper
        // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//        l7001RpDomain.setShipper(headHeadDomain.getShipperCd());
        l7001RpDomain.setShipper(headHeadDomain.getShipperNmAbb());
        // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
        
        // Port of Loading
        l7001RpDomain.setPortOfLoading(StringUtil.getEmptyToBlank(headHeadDomain.getLoadingPortCd()) + "," + StringUtil.getEmptyToBlank(headHeadDomain.getLPortCntryCd()));
        
        // Port of Discharge
        l7001RpDomain.setPortOfDischarge(StringUtil.getEmptyToBlank(headHeadDomain.getDischargePortCd()) + "," + StringUtil.getEmptyToBlank(headHeadDomain.getDPortCntryCd()));
        
        // ATD
        l7001RpDomain.setAtd(DateUtil.formatDate(headHeadDomain.getAtd(), fmt));
        
        // ETA
        l7001RpDomain.setEta(DateUtil.formatDate(headHeadDomain.getEta(), fmt));
        
        // No. of Container
        l7001RpDomain.setNoOfContainer(headHeadDomain.getNoOfContainer());
        
        // Exporter
        l7001RpDomain.setExporterNum(String.valueOf(exportList.size()));
        
        // Exporter (List)
        StringBuffer exporterListSb = new StringBuffer();
        for (int i = 0; i < exportList.size(); i++) {
            if (i > 0) {
                exporterListSb.append("\n");
            }
            if (i == 4) {
                if (exportList.size() > 5) {
                    exporterListSb.append("Others");
                } else {
                    // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                    exporterListSb.append(StringUtil.getEmptyToBlank(getCutStr(exportList.get(i).getShipperCd(), 5)));
                    exporterListSb.append(StringUtil.getEmptyToBlank(getCutStr(exportList.get(i).getShipperNmAbb(), 20)));
                    // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
                }
                break;
            } else {
                // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                exporterListSb.append(StringUtil.getEmptyToBlank(getCutStr(exportList.get(i).getShipperCd(), 5)));
                exporterListSb.append(StringUtil.getEmptyToBlank(getCutStr(exportList.get(i).getShipperNmAbb(), 20)));
                // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
            }
        }
        l7001RpDomain.setExporterNm(StringUtil.getEmptyToBlank(exporterListSb.toString()));
        
        // Importer
        l7001RpDomain.setImpoterNum(String.valueOf(importList.size()));
        
        // Importer (List)
        StringBuffer importerListSb = new StringBuffer();
        for (int i = 0; i < importList.size(); i++) {
            if (i > 0) {
                importerListSb.append("\n");
            }
            if (i == 4) {
                if (importList.size() > 5) {
                    importerListSb.append("Others");
                } else {
                    // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                    importerListSb.append(StringUtil.getEmptyToBlank(getCutStr(importList.get(i).getCompCd(), 5)));
                    importerListSb.append(StringUtil.getEmptyToBlank(getCutStr(importList.get(i).getShipToCompNmAbb(), 20)));
                    // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
                }
                break;
            } else {
                // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//                importerListSb.append(StringUtil.getEmptyToBlank(getCutStr(importList.get(i).getCompCd(), 5)));
                importerListSb.append(StringUtil.getEmptyToBlank(getCutStr(importList.get(i).getShipToCompNmAbb(), 20)));
                // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<

            }
        }
        l7001RpDomain.setImpoterNm(StringUtil.getEmptyToBlank(importerListSb.toString()));

        // No. of Invoice
        l7001RpDomain.setNoOfInvoice(String.valueOf(noOfInvoiceCnt));
        
        // unit
        l7001RpDomain.setUnit(baseVlmUnit);
    }

    /**
     * Get header information of item of common.<br />
     * ヘッダー情報(共通の項目)を取得します。
     *
     * @param shippingActNo ShippingActualityNo
     * @throws ApplicationException If the header information can not be acquired<br />
     * ヘッダー情報が取得できなかった場合
     * @return Header information Domain<br />
     * ヘッダ情報Domain
     */
    protected List<? extends L7001TtShippingActByHeaderDomain> getHeadInfo(String shippingActNo)
        throws ApplicationException {
        
        L7001TtShippingActByHeaderCriteriaDomain condition = new L7001TtShippingActByHeaderCriteriaDomain();
        condition.setShippingActNo(shippingActNo);
        return rpShippingActDao.searchTtShippingActByHeader(condition);
    }

    /**
     * Get the Export list number.<br />
     * Export件数リストを取得します。
     *
     * @param firmNoList Search condition<br />
     * 検索条件
     * @return Export number list<br />
     * Export件数リスト
     * @throws ApplicationException If the Export number can not be acquired<br />
     * Export件数が取得できなかった場合
     */
    protected List<? extends L7001TtPltzByHeaderDomain> getExportCntList(List<String> firmNoList) 
        throws ApplicationException {
        
        L7001TtPltzByHeaderCriteriaDomain condition = new L7001TtPltzByHeaderCriteriaDomain();
        condition.setFirmNoList(firmNoList);
        return rpShippingActDao.searchTtPltzByHeader(condition);
    }

    /**
     * Get the Import list number.<br />
     * Import件数リストを取得します。
     *
     * @param firmNoList Search condition<br />
     * 検索条件
     * @return Import number list<br />
     * Import件数リスト
     * @throws ApplicationException If the Import number can not be acquired<br />
     * Import件数が取得できなかった場合
     */
    protected List<? extends L7001TtPltzByImporterDomain> getImportCntList(List<String> firmNoList) 
        throws ApplicationException {
        L7001TtPltzByImporterCriteriaDomain condition = new L7001TtPltzByImporterCriteriaDomain();
        condition.setFirmNoList(firmNoList);
        return rpShippingActDao.searchTtPltzByImporter(condition);
    }

    /**
     * Get the number of No of Invoice information.<br />
     * No of Invoice情報の件数を取得します。
     *
     * @param firmNoList Search condition<br />
     * 検索条件
     * @return NoOfInvoice number<br />
     * NoOfInvoice件数
     * @throws ApplicationException If NoOfInvoice number can not be acquired<br />
     * NoOfInvoice件数が取得できなかった場合
     */
    protected int getNoOfInvoiceCnt(List<String> firmNoList) throws ApplicationException {
        L7001TtPltzByNoOfInvoiceCriteriaDomain condition = new L7001TtPltzByNoOfInvoiceCriteriaDomain();
        condition.setFirmNoList(firmNoList);
        return rpShippingActDao.searchTtPltzByNoOfInvoice(condition);
    }

    /**
     * Get a list of specifications as Head form.<br />
     * Head帳票の明細リストを取得します。
     *
     * @param firmNoList Shipping firm no list
     * @param shippingActNo Shipping actuality no
     * @return detail list for header page<br />
     * 明細リスト
     * @throws ApplicationException If it is not possible to take the specification list<br />
     * 明細リストが取得できなかった場合
     */
    protected List<? extends L7001TtShippingFirmByHeaderDomain> getHeadDetailList(List<String> firmNoList, String shippingActNo)
        throws ApplicationException {
        L7001TtShippingFirmByHeaderCriteriaDomain condition = new L7001TtShippingFirmByHeaderCriteriaDomain();
        condition.setShippingFirmNoList(firmNoList);
        // 2015/2/24 DNJP.Kawamura 不具合対応（不要な絞り込み条件を削除） START >>>>>
//        condition.setShippingActualityNo(shippingActNo);
        // 2015/2/24 DNJP.Kawamura 不具合対応（不要な絞り込み条件を削除） END <<<<<
        return rpShippingActDao.searchTtShippingFirmByHeader(condition);
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
