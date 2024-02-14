/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * <p>W3006CriteriaDomain.</p>
 *
 * @author SNT ku
 * @version 1.00
 */
public class W3006CriteriaDomain extends AbstractDomain{

    /**
     * Serial version ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Fr) W/H Com CD
     */
    private String carryOutCompCd;

    /**
     * Fr) W/H CD
     */
    private String carryOutWhCd;

    /**
     * To) W/H Com CD
     */
    private String carryInCompCd;

    /**
     * To) W/H CD
     */
    private String carryInWhCd;

    /**
     * Shipper
     */
    private String shipperCd;

    /**
     * Total CML
     */
    private String totalCml;

    /**
     * Issuer
     */
    private String trIssuerNm;

    /**
     * Issue Date
     */
    private String trIssueDt;

    /**
     * TR No.
     */
    private String trNo;

    /**
     * Edit Flg
     */
    private String editFlg;

    /**
     * Status
     */
    private String trStatus;

    /**
     * TR KIND
     */
    private String trItemTyp;

    /**
     * Activate Method
     */
    private String trActvMethTyp;

    /**
     * Activate Date
     */
    private String trActvDt;
    
    /**
     * EDIT_CNT
     */
    private String editCnt;

    /**
     * Weight unit display.
     */
    private String weightUnitDisp;
    
    /**
     * PageInfoCreator object
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * date format (screen)
     */
    private String screenDateFormat;
    
    /**
     * date format (report)
     */
    private String reportDateFormat;
    
    /** sql flg */
    private boolean sqlInitCheck;
    
    /** w3001 transfer flg */
    private boolean sessionFlg;
    
    /**
     * User function use authority
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * Default Constructor
     */
    public W3006CriteriaDomain() {
    }

    /**
     * <p>
     * Getter method for pageInfoCreator.
     * </p>
     * 
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * <p>
     * Setter method for pageInfoCreator.
     * </p>
     * 
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

    /**
     * <p>Getter method for screenDateFormat.</p>
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * <p>Setter method for screenDateFormat.</p>
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * <p>
     * Getter method for reportDateFormat.
     * </p>
     * 
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * <p>
     * Setter method for reportDateFormat.
     * </p>
     * 
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
    }

    /**
     * <p>Getter method for userAuthList.</p>
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * <p>Setter method for userAuthList.</p>
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * <p>
     * Getter method for carryOutCompCd.
     * </p>
     * 
     * @return the carryOutCompCd
     */
    public String getCarryOutCompCd() {
        return carryOutCompCd;
    }

    /**
     * <p>
     * Setter method for carryOutCompCd.
     * </p>
     * 
     * @param carryOutCompCd Set for carryOutCompCd
     */
    public void setCarryOutCompCd(String carryOutCompCd) {
        this.carryOutCompCd = carryOutCompCd;
    }

    /**
     * <p>
     * Getter method for carryOutWhCd.
     * </p>
     * 
     * @return the carryOutWhCd
     */
    public String getCarryOutWhCd() {
        return carryOutWhCd;
    }

    /**
     * <p>
     * Setter method for carryOutWhCd.
     * </p>
     * 
     * @param carryOutWhCd Set for carryOutWhCd
     */
    public void setCarryOutWhCd(String carryOutWhCd) {
        this.carryOutWhCd = carryOutWhCd;
    }

    /**
     * <p>
     * Getter method for carryInCompCd.
     * </p>
     * 
     * @return the carryInCompCd
     */
    public String getCarryInCompCd() {
        return carryInCompCd;
    }

    /**
     * <p>
     * Setter method for carryInCompCd.
     * </p>
     * 
     * @param carryInCompCd Set for carryInCompCd
     */
    public void setCarryInCompCd(String carryInCompCd) {
        this.carryInCompCd = carryInCompCd;
    }

    /**
     * <p>
     * Getter method for carryInWhCd.
     * </p>
     * 
     * @return the carryInWhCd
     */
    public String getCarryInWhCd() {
        return carryInWhCd;
    }

    /**
     * <p>
     * Setter method for carryInWhCd.
     * </p>
     * 
     * @param carryInWhCd Set for carryInWhCd
     */
    public void setCarryInWhCd(String carryInWhCd) {
        this.carryInWhCd = carryInWhCd;
    }

    /**
     * <p>
     * Getter method for shipperCd.
     * </p>
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * <p>
     * Setter method for shipperCd.
     * </p>
     * 
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * <p>
     * Getter method for totalCml.
     * </p>
     * 
     * @return the totalCml
     */
    public String getTotalCml() {
        return totalCml;
    }

    /**
     * <p>
     * Setter method for totalCml.
     * </p>
     * 
     * @param totalCml Set for totalCml
     */
    public void setTotalCml(String totalCml) {
        this.totalCml = totalCml;
    }

    /**
     * <p>
     * Getter method for trIssuerNm.
     * </p>
     * 
     * @return the trIssuerNm
     */
    public String getTrIssuerNm() {
        return trIssuerNm;
    }

    /**
     * <p>
     * Setter method for trIssuerNm.
     * </p>
     * 
     * @param trIssuerNm Set for trIssuerNm
     */
    public void setTrIssuerNm(String trIssuerNm) {
        this.trIssuerNm = trIssuerNm;
    }

    /**
     * <p>
     * Getter method for trIssueDt.
     * </p>
     * 
     * @return the trIssueDt
     */
    public String getTrIssueDt() {
        return trIssueDt;
    }

    /**
     * <p>
     * Setter method for trIssueDt.
     * </p>
     * 
     * @param trIssueDt Set for trIssueDt
     */
    public void setTrIssueDt(String trIssueDt) {
        this.trIssueDt = trIssueDt;
    }

    /**
     * <p>
     * Getter method for trNo.
     * </p>
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * <p>
     * Setter method for trNo.
     * </p>
     * 
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * <p>
     * Getter method for editFlg.
     * </p>
     * 
     * @return the editFlg
     */
    public String getEditFlg() {
        return editFlg;
    }

    /**
     * <p>
     * Setter method for editFlg.
     * </p>
     * 
     * @param editFlg Set for editFlg
     */
    public void setEditFlg(String editFlg) {
        this.editFlg = editFlg;
    }

    /**
     * <p>
     * Getter method for trStatus.
     * </p>
     * 
     * @return the trStatus
     */
    public String getTrStatus() {
        return trStatus;
    }

    /**
     * <p>
     * Setter method for trStatus.
     * </p>
     * 
     * @param trStatus Set for trStatus
     */
    public void setTrStatus(String trStatus) {
        this.trStatus = trStatus;
    }

    /**
     * <p>
     * Getter method for trItemTyp.
     * </p>
     * 
     * @return the trItemTyp
     */
    public String getTrItemTyp() {
        return trItemTyp;
    }

    /**
     * <p>
     * Setter method for trItemTyp.
     * </p>
     * 
     * @param trItemTyp Set for trItemTyp
     */
    public void setTrItemTyp(String trItemTyp) {
        this.trItemTyp = trItemTyp;
    }

    /**
     * <p>
     * Getter method for trActvMethTyp.
     * </p>
     * 
     * @return the trActvMethTyp
     */
    public String getTrActvMethTyp() {
        return trActvMethTyp;
    }

    /**
     * <p>
     * Setter method for trActvMethTyp.
     * </p>
     * 
     * @param trActvMethTyp Set for trActvMethTyp
     */
    public void setTrActvMethTyp(String trActvMethTyp) {
        this.trActvMethTyp = trActvMethTyp;
    }

    /**
     * <p>
     * Getter method for trActvDt.
     * </p>
     * 
     * @return the trActvDt
     */
    public String getTrActvDt() {
        return trActvDt;
    }

    /**
     * <p>
     * Setter method for trActvDt.
     * </p>
     * 
     * @param trActvDt Set for trActvDt
     */
    public void setTrActvDt(String trActvDt) {
        this.trActvDt = trActvDt;
    }
    
    /**
     * <p>
     * Getter method for editCnt.
     * </p>
     * 
     * @return the editCnt
     */
    public String getEditCnt() {
        return editCnt;
    }

    /**
     * <p>
     * Setter method for editCnt.
     * </p>
     * 
     * @param editCnt Set for editCnt
     */
    public void setEditCnt(String editCnt) {
        this.editCnt = editCnt;
    }
    
    /**
     * <p>
     * Getter method for sqlInitCheck.
     * </p>
     * 
     * @return the sqlInitCheck
     */
    public boolean isSqlInitCheck() {
        return sqlInitCheck;
    }

    /**
     * <p>
     * Setter method for sqlInitCheck.
     * </p>
     * 
     * @param sqlInitCheck Set for sqlInitCheck
     */
    public void setSqlInitCheck(boolean sqlInitCheck) {
        this.sqlInitCheck = sqlInitCheck;
    }
    
    /**
     * <p>
     * Getter method for sessionFlg.
     * </p>
     * 
     * @return the sessionFlg
     */
    public boolean isSessionFlg() {
        return sessionFlg;
    }

    /**
     * <p>
     * Setter method for sessionFlg.
     * </p>
     * 
     * @param sessionFlg Set for sessionFlg
     */
    public void setSessionFlg(boolean sessionFlg) {
        this.sessionFlg = sessionFlg;
    }

    /**
     * 
     * <p>Getter method for weightUnitDisp.</p>
     *
     * @return weightUnitDisp
     */
    public String getWeightUnitDisp() {
        return weightUnitDisp;
    }

    /**
     * 
     * <p>Setter method for weightUnitDisp.</p>
     *
     * @param weightUnitDisp unit for Gross Weight
     */
    public void setWeightUnitDisp(String weightUnitDisp) {
        this.weightUnitDisp = weightUnitDisp;
    }

}
