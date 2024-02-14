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
 * The domain class that contains the updated Invoice information of the request parameter of WsB001.
 * <br />WsB001のリクエストパラメータの更新対象インボイス情報を格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WsB002ParamItemDomain {

    /**
     * Detail line index
     * <br />明細行index
     */
    @XmlElement
    private String index;
    
    /**
     * ETD
     */
    @XmlElement(name = "etd")
    private String etd;
    
    /**
     * Customer Part No.
     */
    @XmlElement(name = "customerPartNo")
    private String customerPartNo;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB002ParamItemDomain() {
        super();
    }

    /**
     * Getter method for index.
     *
     * @return the index
     */
    public String getIndex() {
        return index;
    }

    /**
     * Setter method for index.
     *
     * @param index Set for index
     */
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * Getter method for etd.
     *
     * @return the etd
     */
    public String getEtd() {
        return etd;
    }

    /**
     * Setter method for etd.
     *
     * @param etd Set for etd
     */
    public void setEtd(String etd) {
        this.etd = etd;
    }

    /**
     * Getter method for customerPartNo.
     *
     * @return the customerPartNo
     */
    public String getCustomerPartNo() {
        return customerPartNo;
    }

    /**
     * Setter method for customerPartNo.
     *
     * @param customerPartNo Set for customerPartNo
     */
    public void setCustomerPartNo(String customerPartNo) {
        this.customerPartNo = customerPartNo;
    }
}