/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the detail information of
 * CML Trans. PKG Revise Screen
 * List section
 * <br />CML輸送手段付替え画面一覧部の明細情報を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2019ListDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * NET WEIGHT
     * <br />ネット重量
     */
    private String netWeight;
    
    /**
     * GROSS WEIGHT
     * <br />グロス重量
     */
    private String grossWeight;
    
    /**
     * LENGTH UNIT
     * <br />長さ単位
     */
    private String lengthUnit;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCd;
    
    /**
     * ITEM DESCRIPTION
     * <br />品目名称
     */
    private String itemDescription;
    
    /**
     * QUANTITY
     * <br />数量
     */
    private String qty;
    
    /**
     * TAG QUANTITY
     * <br />タグ数
     */
    private String tagQty;
    
    /**
     * SHIPPING LOT
     * <br />出荷ロット
     */
    private String shippingLot;
    
    /**
     * PLTZ ITEM NO
     * <br />パレタイズ対象品No
     */
    private String pltzItemNo;
    
    /**
     * INSTR QTY
     * <br />梱包指示数
     */
    private String instrQty;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2019ListDomain() {
    }

    /**
     * Getter method for netWeight.
     *
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }

    /**
     * Setter method for netWeight.
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * Getter method for grossWeight.
     *
     * @return the grossWeight
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /**
     * Setter method for grossWeight.
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * Getter method for lengthUnit.
     *
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * Setter method for lengthUnit.
     *
     * @param lengthUnit Set for lengthUnit
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
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
     * Getter method for itemDescription.
     *
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Setter method for itemDescription.
     *
     * @param itemDescription Set for itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * Getter method for qty.
     *
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * Setter method for qty.
     *
     * @param qty Set for qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * Getter method for tagQty.
     *
     * @return the tagQty
     */
    public String getTagQty() {
        return tagQty;
    }

    /**
     * Setter method for tagQty.
     *
     * @param tagQty Set for tagQty
     */
    public void setTagQty(String tagQty) {
        this.tagQty = tagQty;
    }

    /**
     * Getter method for shippingLot.
     *
     * @return the shippingLot
     */
    public String getShippingLot() {
        return shippingLot;
    }

    /**
     * Setter method for shippingLot.
     *
     * @param shippingLot Set for shippingLot
     */
    public void setShippingLot(String shippingLot) {
        this.shippingLot = shippingLot;
    }

    /**
     * Getter method for instrQty.
     *
     * @return the instrQty
     */
    public String getInstrQty() {
        return instrQty;
    }

    /**
     * Setter method for instrQty.
     *
     * @param instrQty Set for instrQty
     */
    public void setInstrQty(String instrQty) {
        this.instrQty = instrQty;
    }

    /**
     * Getter method for pltzItemNo.
     *
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * Setter method for pltzItemNo.
     *
     * @param pltzItemNo Set for pltzItemNo
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }
}
