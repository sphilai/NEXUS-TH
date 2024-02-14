/*
 * Project : NEXUS_EXPORT
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
 * <p>Ws3002ParamDomain</p>
 *
 * @author Thalerngsak.P
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws3002ParamDomain {
    /**
     * Library - Parameters of the stock update job<br>
     * ライブラリ - 在庫更新ジョブのパラメータ
     */
    @XmlElement(name = "libPgm")
    private String libPgm;

    /**
     * Job name - Parameters of the stock update job<br>
     * ジョブ名 - 在庫更新ジョブのパラメータ
     */
    @XmlElement(name = "jobDesc")
    private String jobDesc;
    /**
     * Job host - host of the stock update job<br />
     * ホスト - 在庫更新ジョブのホスト
     */
    @XmlElement(name = "jobHost")
    private String jobHost;
    
    /**
     * Job user - user of the stock update job<br />
     * ユーザ - 在庫更新ジョブのユーザ
     */
    @XmlElement(name = "jobUser")
    private String jobUser;
    
    /**
     * Job password - password of the stock update job<br />
     * パスワード - 在庫更新ジョブのパスワード
     */
    @XmlElement(name = "jobPassword")
    private String jobPassword;
    
    /**
     * Description information<br>
     * 明細情報
     */
    @XmlElementWrapper(name = "inventoryTransactionList")
    @XmlElement(name = "inventoryTransactionList")
    private List<? extends Ws3002ParamItemDomain> inventoryTransactionList;
        
    /**
     * <p>Default constructor</p>
     *
     */
    public Ws3002ParamDomain() {
       super();
    }

    /**
     * <p>Getter method for libPgm.</p>
     *
     * @return the libPgm
     */
    public String getLibPgm() {
        return libPgm;
    }

    /**
     * <p>Setter method for libPgm.</p>
     *
     * @param libPgm Set for libPgm
     */
    public void setLibPgm(String libPgm) {
        this.libPgm = libPgm;
    }

    /**
     * <p>Getter method for jobDesc.</p>
     *
     * @return the jobDesc
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * <p>Setter method for jobDesc.</p>
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
     * <p>Getter method for inventoryTransactionList.</p>
     *
     * @return the inventoryTransactionList
     */
    public List<? extends Ws3002ParamItemDomain> getInventoryTransactionList() {
        return inventoryTransactionList;
    }

    /**
     * <p>Setter method for inventoryTransactionList.</p>
     *
     * @param inventoryTransactionList Set for inventoryTransactionList
     */
    public void setInventoryTransactionList(
        List<? extends Ws3002ParamItemDomain> inventoryTransactionList) {
        this.inventoryTransactionList = inventoryTransactionList;
    }

    
}
