/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The PL layer domain class that holds the detail information of Shipping Actuality Warning List Sub Screen List section. 
 * <br/>船積実績ワーニングリスト子画面一覧部の明細情報を保持するPL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt017ListDomain extends AbstractDomain implements Serializable {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
     * ETD DISP/出発予定日
     */
    private String etd;

    /**
     * TRANSPORT CODE/輸送手段コード
     */
    private String trnsCd;

    /**
     * INVOICE NO/インボイスNO 連番
     */
    private String invoiceNo;

    /**
     * CML TYPE/ケースマーク区分 1:CIGMA, 2:E-RT, 3:Miscellaneous
     */
    private String cmlTyp;

    /**
     * CONSIGNEE CODE/荷受人コード
     */
    private String consigneeCd;

    /**
     * SHIP TO CODE/送荷先コード
     */
    private String shipToCd;

    /**
     * CUSTOMER CODE/得意先コード
     */
    private String customerCd;

    /**
     * LEGACY SHIP TO/LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     * Default constructor.
     */
    public Wt017ListDomain() {
    }

    /**
     * <p>Getter method for customerCd.</p>
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * <p>Getter method for shipperCd.</p>
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * <p>Setter method for shipperCd.</p>
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * <p>Getter method for etd.</p>
     *
     * @return the etd
     */
    public String getEtd() {
        return etd;
    }

    /**
     * <p>Setter method for etd.</p>
     *
     * @param etd Set for etd
     */
    public void setEtd(String etd) {
        this.etd = etd;
    }

    /**
     * <p>Getter method for trnsCd.</p>
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * <p>Setter method for trnsCd.</p>
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
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

    /**
     * <p>Getter method for cmlTyp.</p>
     *
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * <p>Setter method for cmlTyp.</p>
     *
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * <p>Getter method for consigneeCd.</p>
     *
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * <p>Setter method for consigneeCd.</p>
     *
     * @param consigneeCd Set for consigneeCd
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
    }

    /**
     * <p>Getter method for shipToCd.</p>
     *
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * <p>Setter method for shipToCd.</p>
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * <p>Getter method for lgcyShipTo.</p>
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * <p>Setter method for lgcyShipTo.</p>
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * <p>Setter method for customerCd.</p>
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

}
