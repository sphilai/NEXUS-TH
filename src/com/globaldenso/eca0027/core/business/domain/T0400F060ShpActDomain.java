/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;


/**
 * F060SHPACT domain of using it by Transfer to GINV Job.
 * <br />船積書類GINV送信ジョブで使用するF060SHPACTドメインです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13201 $
 */
public class T0400F060ShpActDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE
     */
    private String shipperCd;

    /**
     * INVOICE NO
     */
    private String invoiceNo;

    /**
     * INVOICE ISSUE DATE
     */
    private String invoiceIssueDt;

    /**
     * INVOICE STATUS
     */
    private String invoiceStatus;

    /**
     * B/L NO(SHIPPING ACT)
     */
    private String billdNo;

    /**
     * VESSEL(SHIPPING ACT)
     */
    private String vessel;

    /**
     * ATD(SHIPPING ACT)
     */
    private String atd;

    /**
     * ETA(SHIPPING ACT)
     */
    private String eta;

    /**
     * CARRIER COMPANY CODE(SHIPPING ACT)
     */
    private String carrierCompCd;

    /**
     * CARRIER COMPANY NAME ABBREVIATION(SHIPPING ACT)
     */
    private String carrierCompNmAbb;

    /**
     * CONTAINER LOOSE TYPE(SHIPPING ACT)
     */
    private String containerLooseTyp;

    /**
     * constructor
     * <br />コンストラクタです。
     *
     */
    public T0400F060ShpActDomain() {
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
     * Getter method for invoiceNo.
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Setter method for invoiceNo.
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Getter method for invoiceIssueDt.
     *
     * @return the invoiceIssueDt
     */
    public String getInvoiceIssueDt() {
        return invoiceIssueDt;
    }

    /**
     * Setter method for invoiceIssueDt.
     *
     * @param invoiceIssueDt Set for invoiceIssueDt
     */
    public void setInvoiceIssueDt(String invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
    }

    /**
     * Getter method for invoiceStatus.
     *
     * @return the invoiceStatus
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Setter method for invoiceStatus.
     *
     * @param invoiceStatus Set for invoiceStatus
     */
    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * Getter method for billdNo.
     *
     * @return the billdNo
     */
    public String getBilldNo() {
        return billdNo;
    }

    /**
     * Setter method for billdNo.
     *
     * @param billdNo Set for billdNo
     */
    public void setBilldNo(String billdNo) {
        this.billdNo = billdNo;
    }

    /**
     * Getter method for vessel.
     *
     * @return the vessel
     */
    public String getVessel() {
        return vessel;
    }

    /**
     * Setter method for vessel.
     *
     * @param vessel Set for vessel
     */
    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    /**
     * Getter method for atd.
     *
     * @return the atd
     */
    public String getAtd() {
        return atd;
    }

    /**
     * Setter method for atd.
     *
     * @param atd Set for atd
     */
    public void setAtd(String atd) {
        this.atd = atd;
    }

    /**
     * Getter method for eta.
     *
     * @return the eta
     */
    public String getEta() {
        return eta;
    }

    /**
     * Setter method for eta.
     *
     * @param eta Set for eta
     */
    public void setEta(String eta) {
        this.eta = eta;
    }

    /**
     * Getter method for carrierCompCd.
     *
     * @return the carrierCompCd
     */
    public String getCarrierCompCd() {
        return carrierCompCd;
    }

    /**
     * Setter method for carrierCompCd.
     *
     * @param carrierCompCd Set for carrierCompCd
     */
    public void setCarrierCompCd(String carrierCompCd) {
        this.carrierCompCd = carrierCompCd;
    }

    /**
     * Getter method for carrierCompNmAbb.
     *
     * @return the carrierCompNmAbb
     */
    public String getCarrierCompNmAbb() {
        return carrierCompNmAbb;
    }

    /**
     * Setter method for carrierCompNmAbb.
     *
     * @param carrierCompNmAbb Set for carrierCompNmAbb
     */
    public void setCarrierCompNmAbb(String carrierCompNmAbb) {
        this.carrierCompNmAbb = carrierCompNmAbb;
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

}
