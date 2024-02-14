/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The domain class that contains the request parameters of WsB005.
 * <br />WsB005のリクエストパラメータを格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class WsB005ParamDomain {

    /**
     * Customer No. Legacy
     */
    @XmlElement(name = "customerNoLegacy")
    private String customerNoLegacy;
    
    /**
     * Ship to No. Legacy
     */
    @XmlElement(name = "shipToNoLegacy")
    private String shipToNoLegacy;
    
    /**
     * SHIPPING DATE
     * <br />出荷予定日
     */
    @XmlElement(name = "shippingDate")
    private String shippingDate;
    
    /**
     * Detailed data
     * <br />明細データ
     */
    @XmlElementWrapper(name = "lastDigitChangeDetailList")
    @XmlElement(name = "lastDigitChangeDetailItem")
    private List<? extends WsB005ParamItemDomain> lastDigitChangeDetailList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB005ParamDomain() {
        super();
    }

    /**
     * Getter method for customerNoLegacy.
     *
     * @return the customerNoLegacy
     */
    public String getCustomerNoLegacy() {
        return customerNoLegacy;
    }

    /**
     * Setter method for customerNoLegacy.
     *
     * @param customerNoLegacy Set for customerNoLegacy
     */
    public void setCustomerNoLegacy(String customerNoLegacy) {
        this.customerNoLegacy = customerNoLegacy;
    }

    /**
     * Getter method for shipToNoLegacy.
     *
     * @return the shipToNoLegacy
     */
    public String getShipToNoLegacy() {
        return shipToNoLegacy;
    }

    /**
     * Setter method for shipToNoLegacy.
     *
     * @param shipToNoLegacy Set for shipToNoLegacy
     */
    public void setShipToNoLegacy(String shipToNoLegacy) {
        this.shipToNoLegacy = shipToNoLegacy;
    }

    /**
     * Getter method for shippingDate.
     *
     * @return the shippingDate
     */
    public String getShippingDate() {
        return shippingDate;
    }

    /**
     * Setter method for shippingDate.
     *
     * @param shippingDate Set for shippingDate
     */
    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    /**
     * Getter method for lastDigitChangeDetailList.
     *
     * @return the lastDigitChangeDetailList
     */
    public List<? extends WsB005ParamItemDomain> getLastDigitChangeDetailList() {
        return lastDigitChangeDetailList;
    }

    /**
     * Setter method for lastDigitChangeDetailList.
     *
     * @param lastDigitChangeDetailList Set for lastDigitChangeDetailList
     */
    public void setLastDigitChangeDetailList(
        List<? extends WsB005ParamItemDomain> lastDigitChangeDetailList) {
        this.lastDigitChangeDetailList = lastDigitChangeDetailList;
    }
}
