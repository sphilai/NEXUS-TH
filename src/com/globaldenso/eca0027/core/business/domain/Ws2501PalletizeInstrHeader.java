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

/**
 * The Palletize-Instruction header result domain of ECA0027_WS_2507.
 * <br />ECA0027_WS_2507の梱包指示ヘッダー結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2501PalletizeInstrHeader {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    @XmlElement(name = "legacyCustomerCd")
    private String customerCd;
    
    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    @XmlElement(name = "legacyShipToCd")
    private String lgcyShipTo;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    @XmlElement(name = "trnsWayCd")
    private String trnsCd;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    @XmlElement(name = "legacyPlantCd")
    private String plntCd;
    
    /**
     * LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    @XmlElement(name = "legacyWHCd")
    private String lgcyWhCd;
    
    /**
     * COLLATE METHOD TYPE
     * <br />照合方式区分
     */
    private String collateMethTyp;
    
    /**
     * The list of packed up data list item result domains
     * <br />梱包済みデータリスト項目結果ドメインのリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "registerDataListItem")
    private List<? extends Ws2501RegisterDataListItem> registerDataList;
    
    /**
     * The list of unpacked up data list item result domains
     * <br />未梱包データリスト項目結果ドメインのリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "unregisterDataListItem")
    private List<? extends Ws2501UnregisterDataListItem> unregisterDataList;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2501PalletizeInstrHeader() {
        super();
    }

    /**
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for customerCd.
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * Getter method for lgcyShipTo.
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for lgcyWhCd.
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * Setter method for lgcyWhCd.
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * Getter method for collateMethTyp.
     *
     * @return the collateMethTyp
     */
    public String getCollateMethTyp() {
        return collateMethTyp;
    }

    /**
     * Setter method for collateMethTyp.
     *
     * @param collateMethTyp Set for collateMethTyp
     */
    public void setCollateMethTyp(String collateMethTyp) {
        this.collateMethTyp = collateMethTyp;
    }

    /**
     * Getter method for registerDataList.
     *
     * @return the registerDataList
     */
    public List<? extends Ws2501RegisterDataListItem> getRegisterDataList() {
        return registerDataList;
    }

    /**
     * Setter method for registerDataList.
     *
     * @param registerDataList Set for registerDataList
     */
    public void setRegisterDataList(
        List<? extends Ws2501RegisterDataListItem> registerDataList) {
        this.registerDataList = registerDataList;
    }

    /**
     * Getter method for unregisterDataList.
     *
     * @return the unregisterDataList
     */
    public List<? extends Ws2501UnregisterDataListItem> getUnregisterDataList() {
        return unregisterDataList;
    }

    /**
     * Setter method for unregisterDataList.
     *
     * @param unregisterDataList Set for unregisterDataList
     */
    public void setUnregisterDataList(
        List<? extends Ws2501UnregisterDataListItem> unregisterDataList) {
        this.unregisterDataList = unregisterDataList;
    }
}
