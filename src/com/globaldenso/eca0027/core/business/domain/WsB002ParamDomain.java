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
 * The domain class that contains the request parameters of WsB002.
 * <br />WsB002のリクエストパラメータを格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class WsB002ParamDomain {

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
     * Part No.
     */
    @XmlElement(name = "partNo")
    private String partNo;
    
    /**
     * PKG Code
     */
    @XmlElement(name = "pkgCode")
    private String pkgCode;
    
    /**
     * Transportation Code
     */
    @XmlElement(name = "transportationCode")
    private String transportationCode;
    
    /**
     * Detailed data
     * <br />明細データ
     */
    @XmlElementWrapper(name = "detailList")
    @XmlElement(name = "detailItem")
    private List<? extends WsB002ParamItemDomain> detailList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB002ParamDomain() {
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
     * Getter method for partNo.
     *
     * @return the partNo
     */
    public String getPartNo() {
        return partNo;
    }

    /**
     * Setter method for partNo.
     *
     * @param partNo Set for partNo
     */
    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    /**
     * Getter method for pkgCode.
     *
     * @return the pkgCode
     */
    public String getPkgCode() {
        return pkgCode;
    }

    /**
     * Setter method for pkgCode.
     *
     * @param pkgCode Set for pkgCode
     */
    public void setPkgCode(String pkgCode) {
        this.pkgCode = pkgCode;
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
     * Getter method for detailList.
     *
     * @return the detailList
     */
    public List<? extends WsB002ParamItemDomain> getDetailList() {
        return detailList;
    }

    /**
     * Setter method for detailList.
     *
     * @param detailList Set for detailList
     */
    public void setDetailList(List<? extends WsB002ParamItemDomain> detailList) {
        this.detailList = detailList;
    }
}
