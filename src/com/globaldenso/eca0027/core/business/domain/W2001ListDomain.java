/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The list domain of a Palletize-Instruction Main screen.
 * <br />梱包指示Main画面のリストドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2001ListDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CD
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * LEGACY SHIP TO
     * <br />送荷先
     */
    private String lgcyShipTo;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    private String lgcyWhCd;
    
    /**
     * PALLETIZE INSTRUCTION STATUS
     * <br />梱包指示ステータス
     */
    private String pltzInstrStatus;
    
    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;
    
    /**
     * PALLETIZE INSTRUCTION DATE
     * <br />梱包指示日
     */
    private String pltzInstrDt;
    
    /**
     * PALLETIZE INSTRUCTION NAME
     * <br />梱包指示者名
     */
    private String pltzInstrNm;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public W2001ListDomain() {
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
     * Getter method for pltzInstrStatus.
     *
     * @return the pltzInstrStatus
     */
    public String getPltzInstrStatus() {
        return pltzInstrStatus;
    }

    /**
     * Setter method for pltzInstrStatus.
     *
     * @param pltzInstrStatus Set for pltzInstrStatus
     */
    public void setPltzInstrStatus(String pltzInstrStatus) {
        this.pltzInstrStatus = pltzInstrStatus;
    }

    /**
     * Getter method for pltzInstrNo.
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo.
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * Getter method for pltzInstrDt.
     *
     * @return the pltzInstrDt
     */
    public String getPltzInstrDt() {
        return pltzInstrDt;
    }

    /**
     * Setter method for pltzInstrDt.
     *
     * @param pltzInstrDt Set for pltzInstrDt
     */
    public void setPltzInstrDt(String pltzInstrDt) {
        this.pltzInstrDt = pltzInstrDt;
    }

    /**
     * Getter method for pltzInstrNm.
     *
     * @return the pltzInstrNm
     */
    public String getPltzInstrNm() {
        return pltzInstrNm;
    }

    /**
     * Setter method for pltzInstrNm.
     *
     * @param pltzInstrNm Set for pltzInstrNm
     */
    public void setPltzInstrNm(String pltzInstrNm) {
        this.pltzInstrNm = pltzInstrNm;
    }
}
