/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L1003ReportDetailDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * SEQUENCE NO
     * <br />連番
     */ 
    private int no = 0;
    

    /**
     * ITEM NO/???
     */
    private String itemNo;
    

    /**
     * DESCRIPTION/??
     */
    private String description;

    /**
     * QUANTITY/??
     */
    private String qty;

    /**
     * CUSTOMER ITEM NO/???????
     */
    private String customerItemNo;

    /**
     * QUANTITY UNIT/????
     */
    private String qtyUnit;

    /**
     * ITEM/?????
     */
    private String item;
    /**
     * SHIPPER CD/????
     */
    private String shipperCd;
    /**
     * SHIP TO/????
     */
    private String shipTo;
    /**
     * QR CODE NEXUS/????
     */
    private String qrCodeNexus;
    /**
     * EXP REQUEST NO/????
     */
    private String expRequestNo;
    /**
     * FILE DATA.<br />
     * ファイルデータ
     */
    private InputStream qrCdEls;
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public L1003ReportDetailDomain() {
    }

    /**
     * <p>Getter method for qrCodeNexus.</p>
     *
     * @return the qrCodeNexus
     */
    public String getQrCodeNexus() {
        return qrCodeNexus;
    }

    /**
     * <p>Setter method for qrCodeNexus.</p>
     *
     * @param qrCodeNexus Set for qrCodeNexus
     */
    public void setQrCodeNexus(String qrCodeNexus) {
        this.qrCodeNexus = qrCodeNexus;
    }

    /**
     * <p>Getter method for expRequestNo.</p>
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * <p>Getter method for qrCdEls.</p>
     *
     * @return the qrCdEls
     */
    public InputStream getQrCdEls() {
        return qrCdEls;
    }

    /**
     * <p>Setter method for qrCdEls.</p>
     *
     * @param qrCdEls Set for qrCdEls
     */
    public void setQrCdEls(InputStream qrCdEls) {
        this.qrCdEls = qrCdEls;
    }

    /**
     * <p>Setter method for expRequestNo.</p>
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
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
     * <p>Getter method for shipTo.</p>
     *
     * @return the shipTo
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * <p>Setter method for shipTo.</p>
     *
     * @param shipTo Set for shipTo
     */
    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    /**
     * Getter method for no.
     * <br />no のゲッターメソッドです。
     *
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * Setter method for no.
     *
     * @param no Set for no.
     */
    public void setNo(int no) {
        this.no = no;
    }

    /**
     * <p>Getter method for itemNo.</p>
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * <p>Setter method for itemNo.</p>
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * <p>Getter method for description.</p>
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>Setter method for description.</p>
     *
     * @param description Set for description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>Getter method for qty.</p>
     *
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * <p>Setter method for qty.</p>
     *
     * @param qty Set for qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * <p>Getter method for customerItemNo.</p>
     *
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * <p>Setter method for customerItemNo.</p>
     *
     * @param customerItemNo Set for customerItemNo
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * <p>Getter method for qtyUnit.</p>
     *
     * @return the qtyUnit
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * <p>Setter method for qtyUnit.</p>
     *
     * @param qtyUnit Set for qtyUnit
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    /**
     * <p>Getter method for item.</p>
     *
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * <p>Setter method for item.</p>
     *
     * @param item Set for item
     */
    public void setItem(String item) {
        this.item = item;
    }

    

}
