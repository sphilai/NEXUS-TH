/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The domain class that stores information of repeat Ws7002 request parameters.
 * <br />Ws7002リクエストパラメータの繰り返し情報を格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws7002ParamItemDomain {

    /**
     * Customer No
     */
    @XmlElement(name = "customerNo")
    private String customerNo;

    /**
     * Ship To No
     */
    @XmlElement(name = "shipToNo")
    private String shipToNo;

    /**
     * Transportation Code
     */
    @XmlElement(name = "transportationCode")
    private String transportationCode;
    
    /**
     * Invoice No Header
     */
    @XmlElement(name = "invoiceNoHeader")
    private String invoiceNoHeader;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws7002ParamItemDomain() {
        super();
    }

    /**
     * Getter method for customerNo.
     *
     * @return the customerNo
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Setter method for customerNo.
     *
     * @param customerNo Set for customerNo
     */
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    /**
     * Getter method for shipToNo.
     *
     * @return the shipToNo
     */
    public String getShipToNo() {
        return shipToNo;
    }

    /**
     * Setter method for shipToNo.
     *
     * @param shipToNo Set for shipToNo
     */
    public void setShipToNo(String shipToNo) {
        this.shipToNo = shipToNo;
    }

    /**
     * Getter method for transportationCode.
     *
     * @return the transportationCode
     */
    public String getTransportationCode() {
        return transportationCode;
    }

    /**
     * Setter method for transportationCode.
     *
     * @param transportationCode Set for transportationCode
     */
    public void setTransportationCode(String transportationCode) {
        this.transportationCode = transportationCode;
    }

    /**
     * Getter method for invoiceNoHeader.
     *
     * @return the invoiceNoHeader
     */
    public String getInvoiceNoHeader() {
        return invoiceNoHeader;
    }

    /**
     * Setter method for invoiceNoHeader.
     *
     * @param invoiceNoHeader Set for invoiceNoHeader
     */
    public void setInvoiceNoHeader(String invoiceNoHeader) {
        this.invoiceNoHeader = invoiceNoHeader;
    }
}