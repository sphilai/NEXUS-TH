/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of Export Ship to Shipping MA Edit screen.
 * <br />Export Ship to Shipping MA Edit画面のドメインです。
 *
 * @version $Revision: 15229 $
 */
public class W9008CriteriaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     *  シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Shipper
     */
    private String shipperCd;

    /**
     * NEXUS Ship to
     */
    private String shipToCompCd;

    /**
     * Apply Start Date
     */
    private String aplyStrtDt;

    /**
     * Calendar
     */
    private String calendar;

    /**
     * Cont Sort Key
     */
    private String containerSortingKey;

    /**
     * LD CD
     */
    private String loadingCd;

    /**
     * Label Print Num
     */
    private String labelPrintNum;

    /**
     * C/L
     */
    private String containerLooseTyp;

    /**
     * Single Pltz Qr Flg.
     * NL047 ADD
     */
    private String singlePltzQrFlg;
    
    /**
     * C/C TYPE
     */
    private String customTimingTyp;

    /**
     * Packing Summary Atch Flg.
     * NL023 ADD
     */
    private String packingSummaryAtchFlg;

    /**
     * Invoice Template
     */
    private String docNo;

    /**
     * CML Type
     */
    private String cmlTyp;

    /**
     * Inv Category
     */
    private String invoiceCategory;

    /**
     * LAST UPDATE DATE<br />
     * 最終更新日時
     */
    private Timestamp comUpdateTimestamp;
    
    /**
     * Processing mode<br />
     * 処理モード
     */
    private String procMode;
    
    /**
     * Date format (for screen)<br />
     * 日付フォーマット (画面用)
     */
    private String screenDateFormat;

    /**
     * FREE 1 COLUMN NAME<br />
     * フリー1項目名称
     */
    private String free1TitleNm;

    /**
     * FREE 2 COLUMN NAME<br />
     * フリー2項目名称
     */
    private String free2TitleNm;

    /**
     * FREE 3 COLUMN NAME<br />
     * フリー3項目名称
     */
    private String free3TitleNm;

    /**
     * User auth for shipper code
     */
    private String userAuthForComp;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9008CriteriaDomain() {
    }

    /**
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for shipToCompCd.
     *
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * Setter method for shipToCompCd.
     *
     * @param shipToCompCd Set for shipToCompCd
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
    }

    /**
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public String getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(String aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * Getter method for calendar.
     *
     * @return the calendar
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * Setter method for calendar.
     *
     * @param calendar Set for calendar
     */
    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for labelPrintNum.
     *
     * @return the labelPrintNum
     */
    public String getLabelPrintNum() {
        return labelPrintNum;
    }

    /**
     * Setter method for labelPrintNum.
     *
     * @param labelPrintNum Set for labelPrintNum
     */
    public void setLabelPrintNum(String labelPrintNum) {
        this.labelPrintNum = labelPrintNum;
    }

    /**
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method for singlePltzQrFlg.
     * 
     * @return the singlePltzQrFlg
     */
    public String getSinglePltzQrFlg(){
        return singlePltzQrFlg;
    }
    
    /**
     * Setter method for singlePltzQrFlg.
     * 
     * @param singlePltzQrFlg Set for singlePltzQrFlg
     */
    public void setSinglePltzQrFlg(String singlePltzQrFlg){
        this.singlePltzQrFlg = singlePltzQrFlg;
    }
    
    /**
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * Getter method of packingSummaryAtchFlg.
     *
     * @return the packingSummaryAtchFlg.
     */
    public String getPackingSummaryAtchFlg() {
        return packingSummaryAtchFlg;
    }

    /**
     * Setter method of packingSummaryAtchFlg.
     *
     * @param packingSummaryAtchFlg Value to be stored in packingSummaryAtchFlg.
     */
    public void setPackingSummaryAtchFlg(String packingSummaryAtchFlg) {
        this.packingSummaryAtchFlg = packingSummaryAtchFlg;
    }

    /**
     * Getter method for docNo.
     *
     * @return the docNo
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * Setter method for docNo.
     *
     * @param docNo Set for docNo
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    /**
     * Getter method for cmlTyp.
     *
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * Setter method for cmlTyp.
     *
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * Getter method for invoiceCategory.
     *
     * @return the invoiceCategory
     */
    public String getInvoiceCategory() {
        return invoiceCategory;
    }

    /**
     * Setter method for invoiceCategory.
     *
     * @param invoiceCategory Set for invoiceCategory
     */
    public void setInvoiceCategory(String invoiceCategory) {
        this.invoiceCategory = invoiceCategory;
    }

    /**
     * Getter method for comUpdateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * Getter method for procMode.
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * Setter method for procMode.
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
    }

    /**
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * Getter method for free1TitleNm.
     *
     * @return the free1TitleNm
     */
    public String getFree1TitleNm() {
        return free1TitleNm;
    }

    /**
     * Setter method for free1TitleNm.
     *
     * @param free1TitleNm Set for free1TitleNm
     */
    public void setFree1TitleNm(String free1TitleNm) {
        this.free1TitleNm = free1TitleNm;
    }

    /**
     * Getter method for free2TitleNm.
     *
     * @return the free2TitleNm
     */
    public String getFree2TitleNm() {
        return free2TitleNm;
    }

    /**
     * Setter method for free2TitleNm.
     *
     * @param free2TitleNm Set for free2TitleNm
     */
    public void setFree2TitleNm(String free2TitleNm) {
        this.free2TitleNm = free2TitleNm;
    }

    /**
     * Getter method for free3TitleNm.
     *
     * @return the free3TitleNm
     */
    public String getFree3TitleNm() {
        return free3TitleNm;
    }

    /**
     * Setter method for free3TitleNm.
     *
     * @param free3TitleNm Set for free3TitleNm
     */
    public void setFree3TitleNm(String free3TitleNm) {
        this.free3TitleNm = free3TitleNm;
    }

    /**
     * Getter method for userAuthForComp.
     *
     * @return the userAuthForComp
     */
    public String getUserAuthForComp() {
        return userAuthForComp;
    }

    /**
     * Setter method for userAuthForComp.
     *
     * @param userAuthForComp Set for userAuthForComp
     */
    public void setUserAuthForComp(String userAuthForComp) {
        this.userAuthForComp = userAuthForComp;
    }
}