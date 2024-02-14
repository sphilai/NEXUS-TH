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
 * The domain class that contains the request parameters of Ws7001.
 * <br />Ws7001のリクエストパラメータを格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws7001ParamDomain {

    /**
     * Vessel_Name
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
     * Status_Flg
     */
    @XmlElement(name = "statusFlg")
    private String statusFlg;

    /**
     * Register invoice array
     * <br />登録対象インボイス配列
     */
    @XmlElementWrapper(name = "invoiceDetailList")
    @XmlElement(name = "invoiceDetailItem")
    private List<? extends Ws7001ParamItemDomain> invoiceDetailList;
    
    /**
     * Register Shipping Confirm. Array
     * <br />登録対象出荷確認配列
     */
    @XmlElementWrapper(name = "shippingFirmDetailList")
    @XmlElement(name = "shippingFirmDetailItem")
    private List<? extends Ws7001ParamItemDomain> shippingFirmDetailList;
    
    /**
     * Part registration target array
     * <br />登録対象品番配列
     */
    @XmlElementWrapper(name = "itemNoDetailList")
    @XmlElement(name = "itemNoDetailItem")
    private List<? extends Ws7001ParamItemDomain> itemNoDetailList;
        
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws7001ParamDomain() {
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
     * Getter method for invoiceDetailList.
     *
     * @return the invoiceDetailList
     */
    public List<? extends Ws7001ParamItemDomain> getInvoiceDetailList() {
        return invoiceDetailList;
    }

    /**
     * Setter method for invoiceDetailList.
     *
     * @param invoiceDetailList Set for invoiceDetailList
     */
    public void setInvoiceDetailList(
        List<? extends Ws7001ParamItemDomain> invoiceDetailList) {
        this.invoiceDetailList = invoiceDetailList;
    }

    /**
     * Getter method for shippingFirmDetailList.
     *
     * @return the shippingFirmDetailList
     */
    public List<? extends Ws7001ParamItemDomain> getShippingFirmDetailList() {
        return shippingFirmDetailList;
    }

    /**
     * Setter method for shippingFirmDetailList.
     *
     * @param shippingFirmDetailList Set for shippingFirmDetailList
     */
    public void setShippingFirmDetailList(
        List<? extends Ws7001ParamItemDomain> shippingFirmDetailList) {
        this.shippingFirmDetailList = shippingFirmDetailList;
    }

    /**
     * Getter method for itemNoDetailList.
     *
     * @return the itemNoDetailList
     */
    public List<? extends Ws7001ParamItemDomain> getItemNoDetailList() {
        return itemNoDetailList;
    }

    /**
     * Setter method for itemNoDetailList.
     *
     * @param itemNoDetailList Set for itemNoDetailList
     */
    public void setItemNoDetailList(
        List<? extends Ws7001ParamItemDomain> itemNoDetailList) {
        this.itemNoDetailList = itemNoDetailList;
    }
}
