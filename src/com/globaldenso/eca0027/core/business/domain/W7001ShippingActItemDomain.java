/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of holds for the information of Palletize Item.
 * <br />パレタイズ対象品の情報を保持するドメインです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001ShippingActItemDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
    * SHIPPING LOT<br />
     * 出荷ロット
    */
    private BigDecimal shippingLot;
    
    /**
     * ALLOC QUANTITY<br />
     * 引当数量
     */
    private BigDecimal allocQty;

    /**
     * ITEM NO<br />
     * 品目番号
     */
    private String itemNo;

    /**
     * PACKAGE CODE<br />
     * 包装区分
     */
    private String pkgCd;

    /**
     * ETD DUE DATE<br />
     * 船積期限
     */
    private Date etdDueDt;

    /**
     * CUSTOMER PO NO<br />
     * 得意先PO NO
     */
    private String customerPoNo;

    /**
     * CUSTOMER ITEM NO<br />
     * 得意先品目番号
     */
    private String customerItemNo;

    /**
     * CUSTOMER ITEM NO ORIGINAL<br />
     * 得意先品目番号オリジナル
     */
    private String customerItemNoOrg;

    /**
     * ORDER CONTROL NO<br />
     * オーダーコントロールNO
     */
    private BigDecimal odrCtrlNo;

    /**
     * SALES COMPANY PO NO<br />
     * 販売会社PO NO
     */
    private String salesCompPoNo;

    /**
     * CARTON QUANTITY<br />
     * カートン数
     */
    private BigDecimal cartonQty;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ShippingActItemDomain() {
        super();
    }

    /**
     * Getter method for shippingLot.
     *
     * @return the shippingLot
     */
    public BigDecimal getShippingLot() {
        return shippingLot;
    }

    /**
     * Setter method for shippingLot.
     *
     * @param shippingLot Set for shippingLot
     */
    public void setShippingLot(BigDecimal shippingLot) {
        this.shippingLot = shippingLot;
    }

    /**
     * Getter method for allocQty.
     *
     * @return the allocQty
     */
    public BigDecimal getAllocQty() {
        return allocQty;
    }

    /**
     * Setter method for allocQty.
     *
     * @param allocQty Set for allocQty
     */
    public void setAllocQty(BigDecimal allocQty) {
        this.allocQty = allocQty;
    }

    /**
     * Getter method for itemNo.
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Setter method for itemNo.
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * Getter method for pkgCd.
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * Setter method for pkgCd.
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * Getter method for etdDueDt.
     *
     * @return the etdDueDt
     */
    public Date getEtdDueDt() {
        return etdDueDt;
    }

    /**
     * Setter method for etdDueDt.
     *
     * @param etdDueDt Set for etdDueDt
     */
    public void setEtdDueDt(Date etdDueDt) {
        this.etdDueDt = etdDueDt;
    }

    /**
     * Getter method for customerPoNo.
     *
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * Setter method for customerPoNo.
     *
     * @param customerPoNo Set for customerPoNo
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }

    /**
     * Getter method for customerItemNo.
     *
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * Setter method for customerItemNo.
     *
     * @param customerItemNo Set for customerItemNo
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * Getter method for customerItemNoOrg.
     *
     * @return the customerItemNoOrg
     */
    public String getCustomerItemNoOrg() {
        return customerItemNoOrg;
    }

    /**
     * Setter method for customerItemNoOrg.
     *
     * @param customerItemNoOrg Set for customerItemNoOrg
     */
    public void setCustomerItemNoOrg(String customerItemNoOrg) {
        this.customerItemNoOrg = customerItemNoOrg;
    }

    /**
     * Getter method for odrCtrlNo.
     *
     * @return the odrCtrlNo
     */
    public BigDecimal getOdrCtrlNo() {
        return odrCtrlNo;
    }

    /**
     * Setter method for odrCtrlNo.
     *
     * @param odrCtrlNo Set for odrCtrlNo
     */
    public void setOdrCtrlNo(BigDecimal odrCtrlNo) {
        this.odrCtrlNo = odrCtrlNo;
    }

    /**
     * Getter method for salesCompPoNo.
     *
     * @return the salesCompPoNo
     */
    public String getSalesCompPoNo() {
        return salesCompPoNo;
    }

    /**
     * Setter method for salesCompPoNo.
     *
     * @param salesCompPoNo Set for salesCompPoNo
     */
    public void setSalesCompPoNo(String salesCompPoNo) {
        this.salesCompPoNo = salesCompPoNo;
    }

    /**
     * Getter method for cartonQty.
     *
     * @return the cartonQty
     */
    public BigDecimal getCartonQty() {
        return cartonQty;
    }

    /**
     * Setter method for cartonQty.
     *
     * @param cartonQty Set for cartonQty
     */
    public void setCartonQty(BigDecimal cartonQty) {
        this.cartonQty = cartonQty;
    }
}
