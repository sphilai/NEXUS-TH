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
 * 
 * Domain class of WebService(WS3001)
 *
 * @author $Author: TIS Tanaka $
 * @version $Revision:  $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws3001ParamDomain{
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
    private List<? extends Ws3001ParamItemDomain> inventoryTransactionList;
    /**
     * Constructor
     */
    public Ws3001ParamDomain() {
        super();
    }
    /**
     * <p>libPgm のゲッターメソッドです。</p>
     *
     * @return the libPgm
     */
    public String getLibPgm() {
        return libPgm;
    }
    /**
     * <p>libPgm のセッターメソッドです。</p>
     *
     * @param libPgm libPgm に設定する
     */
    public void setLibPgm(String libPgm) {
        this.libPgm = libPgm;
    }
    /**
     * <p>jobDesc のゲッターメソッドです。</p>
     *
     * @return the jobDesc
     */
    public String getJobDesc() {
        return jobDesc;
    }
    /**
     * <p>jobDesc のセッターメソッドです。</p>
     *
     * @param jobDesc jobDesc に設定する
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
     * <p>inventoryTransactionList のゲッターメソッドです。</p>
     *
     * @return the inventoryTransactionList
     */
    public List<? extends Ws3001ParamItemDomain> getInventoryTransactionList() {
        return inventoryTransactionList;
    }
    /**
     * <p>inventoryTransactionList のセッターメソッドです。</p>
     *
     * @param inventoryTransactionList inventoryTransactionList に設定する
     */
    public void setInventoryTransactionList(
        List<? extends Ws3001ParamItemDomain> inventoryTransactionList) {
        this.inventoryTransactionList = inventoryTransactionList;
    }

}
