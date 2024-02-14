/*
 * Project : NEXUS_CIGMA/NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The domain that contains the request parameters of Ws6011.
 * <br />Ws6011のリクエストパラメータを格納するドメインです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 13073 $
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "data")
public class Ws6011ParamDomain {

    /**
     * Customer code
     */
    @XmlElement(name = "customerCd")
    private String cusno;

    /**
     * Reference date
     * 基準日
     */
    @XmlElement(name = "refDt")
    private String refDt;

    /**
     * Customer item No. list
     */
    @XmlElementWrapper(name = "customerItemNoList")
    @XmlElement(name = "customerItemNo")
    private List<String> customerItemNoList;

    /**
     * Library name
     */
    private String lib;

    /**
     * Constructor.
     */
    public Ws6011ParamDomain() {
        super();
    }

    /**
     * Getter method for cusno.
     *
     * @return the cusno
     */
    public String getCusno() {
        return cusno;
    }

    /**
     * Setter method for cusno.
     *
     * @param cusno Set for cusno
     */
    public void setCusno(String cusno) {
        this.cusno = cusno;
    }

    /**
     * Getter method for refDt.
     *
     * @return the refDt
     */
    public String getRefDt() {
        return refDt;
    }

    /**
     * Setter method for refDt.
     *
     * @param refDt Set for refDt
     */
    public void setRefDt(String refDt) {
        this.refDt = refDt;
    }

    /**
     * Getter method for customerItemNoList.
     *
     * @return the customerItemNoList
     */
    public List<String> getCustomerItemNoList() {
        return customerItemNoList;
    }

    /**
     * Setter method for customerItemNoList.
     *
     * @param customerItemNoList Set for customerItemNoList
     */
    public void setCustomerItemNoList(List<String> customerItemNoList) {
        this.customerItemNoList = customerItemNoList;
    }

    /**
     * Getter method for lib.
     *
     * @return the lib
     */
    public String getLib() {
        return lib;
    }

    /**
     * Setter method for lib.
     *
     * @param lib Set for lib
     */
    public void setLib(String lib) {
        this.lib = lib;
    }
}
