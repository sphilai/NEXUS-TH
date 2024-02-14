/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the information of Export Transfer Report(By Case Mark)
 * 
 * @author $Author: chonthicha.a@denso.co.th $
 * @version $Revision: XXXX $
 */
public class L3003ReportDomain extends AbstractDomain {

    /**
     * Serial version. 
     */
    private static final long serialVersionUID = 1L;

    /** 
     * Company name 
    */
    private String compNm;

    /** 
     * Print date. 
    */
    private String printDt;

    /** 
     * Transfer Report No. 
     */
    private String trNo;

    /** 
     * EDIT COUNT 
    */
    private String editCnt;

    /** 
     * TRANSFER REPORT ISSUE DATE 
     */
    private String trIssueDt;

    /** 
     * CARRY OUT COMPANY CODE 
     */
    private String carryOutCompCd;

    /** 
     * CARRY IN COMPANY CODE 
     */
    private String carryInCompCd;

    /** 
     * CARRY OUT WAREHOUSE CODE 
     */
    private String carryOutWhCd;

    /** 
     * CARRY IN WAREHOUSE CODE 
     */
    private String carryInWhCd;

    /** 
     * Total Case Mark 
     */
    private String countMainMark;

    /** 
     * Issuer 
     */
    private String issuer;

    /** 
     * QR code stream. 
     */
    private InputStream qrCdStream;

    /**
     * Detail domain list.
     */
    private List<? extends L3003ReportDetailDomain> detailDomainList;

    /**
     * Constructor.
     */
    public L3003ReportDomain() {
    }

    /**
     * Getter method for printDt.
     * 
     * @return the printDt
     */
    public String getPrintDt() {
        return printDt;
    }

    /**
     * Setter method for printDt.
     * 
     * @param printDt Set for printDt
     */
    public void setPrintDt(String printDt) {
        this.printDt = printDt;
    }

    /**
     * Getter method for serialVersionUID.
     * 
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter method for compNm.
     * 
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * Setter method for compNm.
     * 
     * @param compNm Set for compNm
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * Getter method for TrNo.
     * 
     * @return the TrNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * Setter method for TrNo.
     * 
     * @param trNo Set for TrNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * Getter method for editCnt.
     * 
     * @return the EditCnt
     */
    public String getEditCnt() {
        return editCnt;
    }

    /**
     * Setter method for EditCnt.
     * 
     * @param editCnt Set for editCnt
     */
    public void setEditCnt(String editCnt) {
        this.editCnt = editCnt;
    }

    /**
     * Getter method for trIssueDt.
     * 
     * @return the trIssueDt
     */
    public String getTrIssueDt() {
        return trIssueDt;
    }

    /**
     * Setter method for trIssueDt.
     * 
     * @param trIssueDt Set for trIssueDt
     */
    public void setTrIssueDt(String trIssueDt) {
        this.trIssueDt = trIssueDt;
    }

    /**
     * Getter method for carryOutCompCd.
     * 
     * @return the CarryOutCompCd
     */
    public String getCarryOutCompCd() {
        return carryOutCompCd;
    }

    /**
     * Setter method for carryOutCompCd.
     * 
     * @param carryOutCompCd Set for carryOutCompCd
     */
    public void setCarryOutCompCd(String carryOutCompCd) {
        this.carryOutCompCd = carryOutCompCd;
    }

    /**
     * Getter method for carryInCompCd.
     * 
     * @return the carryInCompCd
     */
    public String getCarryInCompCd() {
        return carryInCompCd;
    }

    /**
     * Setter method for carryInCompCd.
     * 
     * @param carryInCompCd Set for carryInCompCd
     */
    public void setCarryInCompCd(String carryInCompCd) {
        this.carryInCompCd = carryInCompCd;
    }

    /**
     * Getter method for CarryOutWhCd.
     * 
     * @return the CarryOutWhCd
     */
    public String getCarryOutWhCd() {
        return carryOutWhCd;
    }

    /**
     * Setter method for carryOutWhCd.
     * 
     * @param carryOutWhCd Set for carryOutWhCd
     */
    public void setCarryOutWhCd(String carryOutWhCd) {
        this.carryOutWhCd = carryOutWhCd;
    }

    /**
     * Getter method for carryInWhCd.
     * 
     * @return the carryInWhCd
     */
    public String getCarryInWhCd() {
        return carryInWhCd;
    }

    /**
     * Setter method for carryInWhCd.
     * 
     * @param carryInWhCd Set for carryInWhCd
     */
    public void setCarryInWhCd(String carryInWhCd) {
        this.carryInWhCd = carryInWhCd;
    }

    /**
     * Getter method for countMainMark.
     * 
     * @return the countMainMark
     */
    public String getCountMainMark() {
        return countMainMark;
    }

    /**
     * Setter method for countMainMark.
     * 
     * @param countMainMark Set for countMainMark
     */
    public void setCountMainMark(String countMainMark) {
        this.countMainMark = countMainMark;
    }

    /**
     * Getter method for qrCdStream.
     * 
     * @return the qrCdStream
     */
    public InputStream getQrCdStream() {
        return qrCdStream;
    }

    /**
     * Setter method for qrCdStream.
     * 
     * @param qrCdStream Set for qrCdStream
     */
    public void setQrCdStream(InputStream qrCdStream) {
        this.qrCdStream = qrCdStream;
    }

    /**
     * Getter method for detailDomainList.
     * 
     * @return the detailDomainList
     */
    public List<? extends L3003ReportDetailDomain> getDetailDomainList() {
        return detailDomainList;
    }

    /**
     * Setter method for detailDomainList.
     * 
     * @param detailDomainList Set for detailDomainList
     */
    public void setDetailDomainList(List<? extends L3003ReportDetailDomain> detailDomainList) {
        this.detailDomainList = detailDomainList;
    }

    /**
     * Getter method for issuer.
     * 
     * @return the issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Setter method for issuer.
     * 
     * @param issuer Set for issuer
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
