/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the detail information form of [LB001].
 * <br />帳票【LB001】の明細情報を保持するドメインクラスです。
 *
 * @author $Author: tosinori $
 * @version $Revision: 8005 $
 */
public class LB001VtRpOdrRcvErrReportByHdrDomain extends AbstractDomain {

    /**
     * serial version ID<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * RCV_ODR_COMP_CD
     */
    private String rcvOdrCompCd;

    /**
     * CUSTOMER_SUBSIDIARY_CD
     */
    private String customerSubsidiaryCd;

    /**
     * TRANSMISSION_DT
     */
    private Date transmissionDt;

    /**
     * CUSTOMER_CD
     */
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * COUNT
     */
    private BigDecimal count;

    /**
     * SHIP_TO_NM
     */
    private String shipToNm;


    /**
     * Default Constructor
     */
    public LB001VtRpOdrRcvErrReportByHdrDomain() {
    }


    /**
     * Getter method for rcvOdrCompCd.
     *
     * @return the rcvOdrCompCd
     */
    public String getRcvOdrCompCd() {
        return rcvOdrCompCd;
    }

    /**
     * Setter method for rcvOdrCompCd.
     *
     * @param rcvOdrCompCd Set for rcvOdrCompCd
     */
    public void setRcvOdrCompCd(String rcvOdrCompCd) {
        this.rcvOdrCompCd = rcvOdrCompCd;
    }

    /**
     * Getter method for customerSubsidiaryCd.
     *
     * @return the customerSubsidiaryCd
     */
    public String getCustomerSubsidiaryCd() {
        return customerSubsidiaryCd;
    }

    /**
     * Setter method for customerSubsidiaryCd.
     *
     * @param customerSubsidiaryCd Set for customerSubsidiaryCd
     */
    public void setCustomerSubsidiaryCd(String customerSubsidiaryCd) {
        this.customerSubsidiaryCd = customerSubsidiaryCd;
    }

    /**
     * Getter method for transmissionDt.
     *
     * @return the transmissionDt
     */
    public Date getTransmissionDt() {
        return transmissionDt;
    }

    /**
     * Setter method for transmissionDt.
     *
     * @param transmissionDt Set for transmissionDt
     */
    public void setTransmissionDt(Date transmissionDt) {
        this.transmissionDt = transmissionDt;
    }

    /**
     * Getter method for customerCd.
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * Getter method for lgcyShipTo.
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for count.
     *
     * @return the count
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
     * Setter method for count.
     *
     * @param count Set for count
     */
    public void setCount(BigDecimal count) {
        this.count = count;
    }

    /**
     * Getter method for shipToNm.
     *
     * @return the shipToNm
     */
    public String getShipToNm() {
        return shipToNm;
    }

    /**
     * Setter method for shipToNm.
     *
     * @param shipToNm Set for shipToNm
     */
    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
    }

}
