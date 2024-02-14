/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.Date;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of holds for the information of Palletize.
 * <br />パレタイズの情報を保持するドメインです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12404 $
 */
public class W7001ShippingActPltzDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE<br />
     * 荷主コード
     */
    private String shipperCd;

    /**
     * CONTAINER NO<br />
     * コンテナNO
     */
    private String containerNo;

    /**
     * MAIN MARK<br />
     * メインマーク
     */
    private String mainMark;

    /**
     * PLANT CODE<br />
     * 製造部工場区分
     */
    private String plntCd;
    
    /**
     * No container number<br />
     * コンテナNo件数
     */
    private String countContainerNo;

    /**
     * CUSTOMER CODE<br />
     * 得意先コード
     */
    private String customerCd;

    /**
     * LEGACY SHIP TO<br />
     * LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     * INVOICE NO<br />
     * インボイスNO
     */
    private String invoiceNo;

    /**
     * TRANSPORT CODE ORIGINAL<br />
     * 輸送手段コードオリジナル
     */
    private String trnsCdOrg;

    /**
     * Invoice Issue
     * UT380 ADD
     */
    private Date invoiceIssueDt;

    /**
     * List of palletizing goods for<br />
     * パレタイズ対象品のリスト
     */
    private List<? extends W7001ShippingActItemDomain> shippingActItemList;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ShippingActPltzDomain() {
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
     * Getter method for containerNo.
     *
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }

    /**
     * Setter method for containerNo.
     *
     * @param containerNo Set for containerNo
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
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
     * Getter method for countContainerNo.
     *
     * @return the countContainerNo
     */
    public String getCountContainerNo() {
        return countContainerNo;
    }

    /**
     * Setter method for countContainerNo.
     *
     * @param countContainerNo Set for countContainerNo
     */
    public void setCountContainerNo(String countContainerNo) {
        this.countContainerNo = countContainerNo;
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
     * Getter method for invoiceNo.
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Setter method for invoiceNo.
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Getter method for trnsCdOrg.
     *
     * @return the trnsCdOrg
     */
    public String getTrnsCdOrg() {
        return trnsCdOrg;
    }

    /**
     * Setter method for trnsCdOrg.
     *
     * @param trnsCdOrg Set for trnsCdOrg
     */
    public void setTrnsCdOrg(String trnsCdOrg) {
        this.trnsCdOrg = trnsCdOrg;
    }

    /**
     * Getter method for invoiceIssueDt.
     *
     * @return the invoiceIssueDt
     */
    public Date getInvoiceIssueDt() {
        return invoiceIssueDt;
    }

    /**
     * Setter method for invoiceIssueDt.
     *
     * @param invoiceIssueDt Set for invoiceIssueDt
     */
    public void setInvoiceIssueDt(Date invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
    }

    /**
     * Getter method for shippingActItemList.
     *
     * @return the shippingActItemList
     */
    public List<? extends W7001ShippingActItemDomain> getShippingActItemList() {
        return shippingActItemList;
    }

    /**
     * Setter method for shippingActItemList.
     *
     * @param shippingActItemList Set for shippingActItemList
     */
    public void setShippingActItemList(
        List<? extends W7001ShippingActItemDomain> shippingActItemList) {
        this.shippingActItemList = shippingActItemList;
    }
}
