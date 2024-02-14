/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * W3006Listdomain<BR>
 * 
 * @author SNT ku
 * @version v.1.0
 */
public class W3006ListDomain extends AbstractDomain implements Serializable {

    /**
     * Serial Version
     */
    private static final long serialVersionUID = 1L;

    /**
     * CHK
     */
    private String chk;

    /**
     * CML No.
     */
    private String mainMark;

    /**
     * CML Type
     */
    private String cmlTyp;

    /**
     * Trans CD
     */
    private String trnsCd;

    /**
     * Cont. Sort CD
     */
    private String containerSortingKey;

    /**
     * G/W
     */
    private String grossWeight;

    /**
     * CML Issue Date
     */
    private String expPackingDt;

    /**
     * Export Request no
     */
    private String expRequestNo;

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
     * EDIT_CNT
     */
    private BigDecimal editCnt;

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
     * User name
     */
    private String userName;

    /**
     * Auth
     */
    private String auth;

    /**
     * Flag of mask target.
     */
    private String maskFlg;

    /**
     * constructor method
     */
    public W3006ListDomain() {
    }

    /**
     * <p>
     * Getter method for chk.
     * </p>
     * 
     * @return the chk
     */
    public String getChk() {
        return chk;
    }

    /**
     * <p>
     * Setter method for chk.
     * </p>
     * 
     * @param chk Set for chk
     */
    public void setChk(String chk) {
        this.chk = chk;
    }

    /**
     * <p>
     * Getter method for mainMark.
     * </p>
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * <p>
     * Setter method for mainMark.
     * </p>
     * 
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * <p>
     * Getter method for cmlTyp.
     * </p>
     * 
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * <p>
     * Setter method for cmlTyp.
     * </p>
     * 
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * <p>
     * Getter method for trnsCd.
     * </p>
     * 
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * <p>
     * Setter method for trnsCd.
     * </p>
     * 
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * <p>
     * Getter method for containerSortingKey.
     * </p>
     * 
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * <p>
     * Setter method for containerSortingKey.
     * </p>
     * 
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * <p>
     * Getter method for grossWeight.
     * </p>
     * 
     * @return the grossWeight
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /**
     * <p>
     * Setter method for grossWeight.
     * </p>
     * 
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * <p>
     * Getter method for expPackingDt.
     * </p>
     * 
     * @return the expPackingDt
     */
    public String getExpPackingDt() {
        return expPackingDt;
    }

    /**
     * <p>
     * Setter method for expPackingDt.
     * </p>
     * 
     * @param expPackingDt Set for expPackingDt
     */
    public void setExpPackingDt(String expPackingDt) {
        this.expPackingDt = expPackingDt;
    }

    /**
     * <p>
     * Getter method for expRequestNo.
     * </p>
     * 
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * <p>
     * Setter method for expRequestNo.
     * </p>
     * 
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
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
     * Getter method for userName.
     * </p>
     * 
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * Setter method for userName.
     * </p>
     * 
     * @param userName Set for userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Getter method for auth.
     * </p>
     * 
     * @return the auth
     */
    public String getAuth() {
        return auth;
    }

    /**
     * <p>
     * Setter method for auth.
     * </p>
     * 
     * @param auth Set for auth
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }

    /**
     * <p>
     * Getter method for maskFlg.
     * </p>
     * 
     * @return the maskFlg
     */
    public String getMaskFlg() {
        return maskFlg;
    }

    /**
     * <p>
     * Setter method for maskFlg.
     * </p>
     * 
     * @param maskFlg Set for maskFlg
     */
    public void setMaskFlg(String maskFlg) {
        this.maskFlg = maskFlg;
    }

}
