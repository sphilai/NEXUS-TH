/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * The Palletize-Instruction header result domain of ECA0027_WS_2502.
 * <br />ECA0027_WS_2502の梱包指示ヘッダ結果ドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2502PalletizeInstrHeaderDomain implements Serializable {

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
     * PALLET NO
     * <br />パレットNO
     */
    @XmlElement(name = "legacyWHCd")
    private String lgcyWhCd;
    
    /**
     * NUMBER OF PRINT
     * <br />印刷部数
     */
    @XmlElement(name = "cmlPrintNum")
    private int cmlPrintNum;
    
    /**
     * The registration data list item result domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502の登録データリスト項目結果ドメイン
     */
    @XmlElementWrapper
    @XmlElement(name = "registerDataListItem")
    private List<? extends Ws2502RegisterDataListItemDomain> registerDataList;
    
    /**
     * The unregistered data list item result domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502の未登録データリスト項目結果ドメイン
     */
    @XmlElementWrapper
    @XmlElement(name = "unregisterDataListItem")
    private List<? extends Ws2502UnregisterDataListItemDomain> unregisterDataList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2502PalletizeInstrHeaderDomain() {
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
     * <p>cmlPrintNum のゲッターメソッドです。</p>
     *
     * @return the cmlPrintNum
     */
    public int getCmlPrintNum() {
        return cmlPrintNum;
    }

    /**
     * <p>cmlPrintNum のセッターメソッドです。</p>
     *
     * @param cmlPrintNum cmlPrintNum に設定する
     */
    public void setCmlPrintNum(int cmlPrintNum) {
        this.cmlPrintNum = cmlPrintNum;
    }

    /**
     * Getter method for registerDataList.
     *
     * @return the registerDataList
     */
    public List<? extends Ws2502RegisterDataListItemDomain> getRegisterDataList() {
        return registerDataList;
    }

    /**
     * Setter method for registerDataList.
     *
     * @param registerDataList Set for registerDataList
     */
    public void setRegisterDataList(
        List<? extends Ws2502RegisterDataListItemDomain> registerDataList) {
        this.registerDataList = registerDataList;
    }

    /**
     * Getter method for unregisterDataList.
     *
     * @return the unregisterDataList
     */
    public List<? extends Ws2502UnregisterDataListItemDomain> getUnregisterDataList() {
        return unregisterDataList;
    }

    /**
     * Setter method for unregisterDataList.
     *
     * @param unregisterDataList Set for unregisterDataList
     */
    public void setUnregisterDataList(
        List<? extends Ws2502UnregisterDataListItemDomain> unregisterDataList) {
        this.unregisterDataList = unregisterDataList;
    }
}
