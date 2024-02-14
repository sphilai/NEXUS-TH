/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Domain class of WebService(WS6007)
 *
 * @author $Author: A.Chonthicha $
 * @version $Revision:  $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws6007AsiaParamDomain{
    /**
     * Library for AS/400 job
     */
    @XmlElement(name = "libPgm")
    private String libPgm;

    /**
     * Re-invoice Job name
     */
    @XmlElement(name = "jobDesc")
    private String jobDesc;

    /**
     * Job host for AS/400 job
     */
    @XmlElement(name = "jobHost")
    private String jobHost;

    /**
     * AS/400 Job user
     */
    @XmlElement(name = "jobUser")
    private String jobUser;

    /**
     * AS/400 Job password
     */
    @XmlElement(name = "jobPassword")
    private String jobPassword;

    /**
     * invoice number for excise tax registration
     */
    @XmlElement(name = "invoiceNo")
    private String invoiceNo;

    /**
     * Default Constructor
     */
    public Ws6007AsiaParamDomain() {
        super();
    }

    /**
     * <p>Getter method for libPgm</p>
     *
     * @return the libPgm
     */
    public String getLibPgm() {
        return libPgm;
    }

    /**
     * <p>Setter method for libPgm</p>
     *
     * @param libPgm Set for libPgm
     */
    public void setLibPgm(String libPgm) {
        this.libPgm = libPgm;
    }

    /**
     * <p>Getter method for jobDesc</p>
     *
     * @return the jobDesc
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * <p>Setter method for jobDesc</p>
     *
     * @param jobDesc Set for jobDesc
     */
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    /**
     * <p>Getter method for jobHost.</p>
     *
     * @return the jobHost
     */
    public String getJobHost() {
        return jobHost;
    }

    /**
     * <p>Setter method for jobHost.</p>
     *
     * @param jobHost Set for jobHost
     */
    public void setJobHost(String jobHost) {
        this.jobHost = jobHost;
    }

    /**
     * <p>Getter method for jobUser.</p>
     *
     * @return the jobUser
     */
    public String getJobUser() {
        return jobUser;
    }

    /**
     * <p>Setter method for jobUser.</p>
     *
     * @param jobUser Set for jobUser
     */
    public void setJobUser(String jobUser) {
        this.jobUser = jobUser;
    }

    /**
     * <p>Getter method for jobPassword.</p>
     *
     * @return the jobPassword
     */
    public String getJobPassword() {
        return jobPassword;
    }

    /**
     * <p>Setter method for jobPassword.</p>
     *
     * @param jobPassword Set for jobPassword
     */
    public void setJobPassword(String jobPassword) {
        this.jobPassword = jobPassword;
    }

    /**
     * <p>Getter method for invoiceNo.</p>
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * <p>Setter method for invoiceNo.</p>
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

}
