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
 * The domain class that contains the request parameters of Ws6004.
 * <br />Ws6004のリクエストパラメータを格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws6004ParamDomain {

    /**
     * Customer No. Legacy
     */
    @XmlElement(name = "customerNoLegacy")
    private String customerNoLegacy;
    
    /**
     * Date Shipped
     */
    @XmlElement(name = "dateShipped")
    private String dateShipped;
    
    /**
     * Part No.
     */
    @XmlElementWrapper(name = "partNoList")
    @XmlElement(name = "partNo")
    private List<String> partNoList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws6004ParamDomain() {
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
     * Getter method for dateShipped.
     *
     * @return the dateShipped
     */
    public String getDateShipped() {
        return dateShipped;
    }

    /**
     * Setter method for dateShipped.
     *
     * @param dateShipped Set for dateShipped
     */
    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    /**
     * Getter method for partNoList.
     *
     * @return the partNoList
     */
    public List<String> getPartNoList() {
        return partNoList;
    }

    /**
     * Setter method for partNoList.
     *
     * @param partNoList Set for partNoList
     */
    public void setPartNoList(List<String> partNoList) {
        this.partNoList = partNoList;
    }
}
