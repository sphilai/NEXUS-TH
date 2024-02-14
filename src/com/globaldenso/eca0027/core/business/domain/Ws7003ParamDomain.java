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
 * The domain class that contains the request parameters of Ws7003.
 * <br />Ws7003のリクエストパラメータを格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws7003ParamDomain {

    /**
     * Vessel Name
     */
    @XmlElement(name = "vesselName")
    private String vesselName;

    /**
     * ATD
     */
    @XmlElement(name = "atd")
    private String atd;

    /**
     * ETA
     */
    @XmlElement(name = "eta")
    private String eta;

    /**
     * Status Flg
     */
    @XmlElement(name = "statusFlg")
    private String statusFlg;

    /**
     * Updated Invoice array
     * <br />更新対象インボイス配列
     */
    @XmlElementWrapper(name = "updateInvoiceList")
    @XmlElement(name = "updateInvoiceItem")
    private List<? extends Ws7003ParamItemDomain> updateInvoiceList;
    
    /**
     * Deleted Invoice array
     * <br />削除対象インボイス配列
     */
    @XmlElementWrapper(name = "deleteInvoiceList")
    @XmlElement(name = "deleteInvoiceItem")
    private List<? extends Ws7003ParamItemDomain> deleteInvoiceList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws7003ParamDomain() {
        super();
    }

    /**
     * Getter method for vesselName.
     *
     * @return the vesselName
     */
    public String getVesselName() {
        return vesselName;
    }

    /**
     * Setter method for vesselName.
     *
     * @param vesselName Set for vesselName
     */
    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    /**
     * Getter method for atd.
     *
     * @return the atd
     */
    public String getAtd() {
        return atd;
    }

    /**
     * Setter method for atd.
     *
     * @param atd Set for atd
     */
    public void setAtd(String atd) {
        this.atd = atd;
    }

    /**
     * Getter method for eta.
     *
     * @return the eta
     */
    public String getEta() {
        return eta;
    }

    /**
     * Setter method for eta.
     *
     * @param eta Set for eta
     */
    public void setEta(String eta) {
        this.eta = eta;
    }

    /**
     * Getter method for statusFlg.
     *
     * @return the statusFlg
     */
    public String getStatusFlg() {
        return statusFlg;
    }

    /**
     * Setter method for statusFlg.
     *
     * @param statusFlg Set for statusFlg
     */
    public void setStatusFlg(String statusFlg) {
        this.statusFlg = statusFlg;
    }

    /**
     * Getter method for updateInvoiceList.
     *
     * @return the updateInvoiceList
     */
    public List<? extends Ws7003ParamItemDomain> getUpdateInvoiceList() {
        return updateInvoiceList;
    }

    /**
     * Setter method for updateInvoiceList.
     *
     * @param updateInvoiceList Set for updateInvoiceList
     */
    public void setUpdateInvoiceList(
        List<? extends Ws7003ParamItemDomain> updateInvoiceList) {
        this.updateInvoiceList = updateInvoiceList;
    }

    /**
     * Getter method for deleteInvoiceList.
     *
     * @return the deleteInvoiceList
     */
    public List<? extends Ws7003ParamItemDomain> getDeleteInvoiceList() {
        return deleteInvoiceList;
    }

    /**
     * Setter method for deleteInvoiceList.
     *
     * @param deleteInvoiceList Set for deleteInvoiceList
     */
    public void setDeleteInvoiceList(
        List<? extends Ws7003ParamItemDomain> deleteInvoiceList) {
        this.deleteInvoiceList = deleteInvoiceList;
    }
}
