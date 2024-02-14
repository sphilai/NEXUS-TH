/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Domain that contains the shipTo information.
 * <br />送荷先情報を格納するドメインです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7884 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws9004ResultItemDomain")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ws9004ResultItemDomain {

    /**
     * SERIAL VERSION / シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Customer No. / 得意先番号
     */
    private String customer;

    /**
     * Ship to / 送荷先情報
     */
    private String shipTo;

    /**
     * Default constructor./デフォルトコンストラクタ。
     *
     */
    public Ws9004ResultItemDomain() {
        super();
    }

    /**
     * Getter method for customer.
     *
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Setter method for customer.
     *
     * @param customer Set for customer
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * Getter method for shipTo.
     *
     * @return the shipTo
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * Setter method for shipTo.
     *
     * @param shipTo Set for shipTo
     */
    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

}
