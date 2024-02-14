/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the form of information search [L6008].
 * <br/>帳票【L6008】の検索情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain extends AbstractDomain {

    /**
     * Serial version ID<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    /** shipperCd */
    private String shipperCd = null;
    /** invoiceNo */
    private String invoiceNo = null;
    /** invoiceIssueDt */
    private Date invoiceIssueDt = null;
    
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain() {
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
    public Date getInvoiceIssueDt() {
        return invoiceIssueDt;
    }
    /**
     * Setter method for invoiceIssueDt.
     *
     * @param invoiceIssueDt Set for invoiceIssueDt
     */
    public void setInvoiceIssueDt(Date invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
    }

}
