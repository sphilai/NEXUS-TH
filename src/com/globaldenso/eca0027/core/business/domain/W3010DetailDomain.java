/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the Detail Display of Receive CML Transfer
 * Report.
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3010DetailDomain extends AbstractDomain {

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
     * Total CML
     */
    private String totalCml;

    /**
     * Shipper
     */
    private String shipperCd;

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
     * EDIT_CNT
     */
    private BigDecimal editCnt;

    /**
     * Edit Flg
     */
    private String editFlg;

    /**
     * Status
     */
    private String trStatus;

    /**
     * TR Kind
     */
    private String trItemTyp;

    /**
     * Active Method
     */
    private String trActvMethTyp;

    /**
     * Active Date
     */
    private String trActvDt;

    /**
     * TR_RCV_DSC_ID
     */
    private String trRcvDscId;

    /**
     * Carry in method
     */
    private String trRcvMethTyp;

    /**
     * Carry in Date
     */
    private String trRcvDt;

    /**
     * Default Constructor.
     */
    public W3010DetailDomain() {
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
     * Getter method for editCnt.
     * </p>
     * 
     * @return the editCnt
     */
    public BigDecimal getEditCnt() {
        return editCnt;
    }

    /**
     * <p>
     * Setter method for editCnt.
     * </p>
     * 
     * @param editCnt Set for editCnt
     */
    public void setEditCnt(BigDecimal editCnt) {
        this.editCnt = editCnt;
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
     * @return the trActvNm
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
     * Getter method for trRcvDscId.
     * </p>
     * 
     * @return the trRcvDscId
     */
    public String getTrRcvDscId() {
        return trRcvDscId;
    }

    /**
     * <p>
     * Setter method for trRcvDscId.
     * </p>
     * 
     * @param trRcvDscId Set for trRcvDscId
     */
    public void setTrRcvDscId(String trRcvDscId) {
        this.trRcvDscId = trRcvDscId;
    }

    /**
     * <p>
     * Getter method for trRcvMethTyp.
     * </p>
     * 
     * @return the trRcvMethTyp
     */
    public String getTrRcvMethTyp() {
        return trRcvMethTyp;
    }

    /**
     * <p>
     * Setter method for trRcvMethTyp.
     * </p>
     * 
     * @param trRcvMethTyp Set for trRcvMethTyp
     */
    public void setTrRcvMethTyp(String trRcvMethTyp) {
        this.trRcvMethTyp = trRcvMethTyp;
    }

    /**
     * <p>
     * Getter method for trRcvDt.
     * </p>
     * 
     * @return the trRcvDt
     */
    public String getTrRcvDt() {
        return trRcvDt;
    }

    /**
     * <p>
     * Setter method for trRcvDt.
     * </p>
     * 
     * @param trRcvDt Set for trRcvDt
     */
    public void setTrRcvDt(String trRcvDt) {
        this.trRcvDt = trRcvDt;
    }

}
