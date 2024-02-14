/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the detail information of
 * CML PKG Info Detail Screen
 * List section
 * <br />CML包装材登録画面一覧部の明細情報を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1004KitListDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;

    /**
     * EXPORT REQUEST ITEM ID/??????ID
     */
    private String expRequestItemId;

    /**
     * EXPORT REQUEST KIT ID/????KIT ID
     */
    private String expRequestKitId;

    /**
     * KIT BRANCH/KIT???  ????Item
     */
    private String kitBrch;

    /**
     * RT USE FLAG/RT??????
     */
    private String rtUseFlg;

    /**
     * KIT COMPONENT ITEM NAME/KIT???????
     */
    private String kitComponentItemNm;

    /**
     * DENGER GOODS IMPORT EXPORT CTRL/????????
     */
    private String dngrGoodsImpExpCtrl;

    /**
     * KIT COMPONENT ITEM NO/KIT???????
     */
    private String kitComponentItemNo;
    /**
     * CUSTOMER ITEM NO/KIT???????
     */
    private String kitCustomerItemNo;
    /**
     * ORIGIN COUNTRY CODE/??????
     */
    private String originCntryCd;

    /**
     * QUANTITY UNIT/????
     */
    private String qtyUnit;
    /**
     * NET WEIGHT/?????
     */
    private String netWeight;
    /**
     * TOTAL NET WEIGHT/?????
     */
    private String totalNetWeight;
    /**
     * QUANTITY/??
     */
    private String qty;

    /**
     * UNIT PRICE/??
     */
    private String unitPrice;

    /**
     * COMMERCIAL FLAG/?????  Y:Commercial, N:Not
     */
    private String commercialFlg;

    /**
     * PACKING STATUS/???????
     */
    private String packingStatus;
    
    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not
     */
    private String reExpGoodsFlg;
    
    /**
     * CURRENCY CODE
     */
    private String currency;
   
    /**
     * DESCRIPTION
     */
    private String description;
    /**
     * ITEM NO/????
     */
    private String itemNo;
    /**
     * ITEM /????
     */
    private String item;
    
    /**
     * デフォルトコンストラクタ。
     */
    public W1004KitListDomain() {
    }

    /**
     * expRequestNo のゲッターメソッドです。
     * 
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * expRequestNo のセッターメソッドです。
     * 
     * @param expRequestNo expRequestNo に設定する
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * expRequestItemId のゲッターメソッドです。
     * 
     * @return the expRequestItemId
     */
    public String getExpRequestItemId() {
        return expRequestItemId;
    }

    /**
     * expRequestItemId のセッターメソッドです。
     * 
     * @param expRequestItemId expRequestItemId に設定する
     */
    public void setExpRequestItemId(String expRequestItemId) {
        this.expRequestItemId = expRequestItemId;
    }

    /**
     * expRequestKitId のゲッターメソッドです。
     * 
     * @return the expRequestKitId
     */
    public String getExpRequestKitId() {
        return expRequestKitId;
    }

    /**
     * expRequestKitId のセッターメソッドです。
     * 
     * @param expRequestKitId expRequestKitId に設定する
     */
    public void setExpRequestKitId(String expRequestKitId) {
        this.expRequestKitId = expRequestKitId;
    }

    /**
     * kitBrch のゲッターメソッドです。
     * 
     * @return the kitBrch
     */
    public String getKitBrch() {
        return kitBrch;
    }

    /**
     * kitBrch のセッターメソッドです。
     * 
     * @param kitBrch kitBrch に設定する
     */
    public void setKitBrch(String kitBrch) {
        this.kitBrch = String.format("%03d", Integer.parseInt(kitBrch));
    }

    /**
     * rtUseFlg のゲッターメソッドです。
     * 
     * @return the rtUseFlg
     */
    public String getRtUseFlg() {
        return rtUseFlg;
    }

    /**
     * rtUseFlg のセッターメソッドです。
     * 
     * @param rtUseFlg rtUseFlg に設定する
     */
    public void setRtUseFlg(String rtUseFlg) {
        this.rtUseFlg = rtUseFlg;
    }

    /**
     * kitComponentItemNm のゲッターメソッドです。
     * 
     * @return the kitComponentItemNm
     */
    public String getKitComponentItemNm() {
        return kitComponentItemNm;
    }

    /**
     * kitComponentItemNm のセッターメソッドです。
     * 
     * @param kitComponentItemNm kitComponentItemNm に設定する
     */
    public void setKitComponentItemNm(String kitComponentItemNm) {
        this.kitComponentItemNm = kitComponentItemNm;
    }

    /**
     * dngrGoodsImpExpCtrl のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrl
     */
    public String getDngrGoodsImpExpCtrl() {
        return dngrGoodsImpExpCtrl;
    }

    /**
     * dngrGoodsImpExpCtrl のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrl dngrGoodsImpExpCtrl に設定する
     */
    public void setDngrGoodsImpExpCtrl(String dngrGoodsImpExpCtrl) {
        this.dngrGoodsImpExpCtrl = dngrGoodsImpExpCtrl;
    }

    /**
     * kitComponentItemNo のゲッターメソッドです。
     * 
     * @return the kitComponentItemNo
     */
    public String getKitComponentItemNo() {
        return kitComponentItemNo;
    }

    /**
     * kitComponentItemNo のセッターメソッドです。
     * 
     * @param kitComponentItemNo kitComponentItemNo に設定する
     */
    public void setKitComponentItemNo(String kitComponentItemNo) {
        this.kitComponentItemNo = kitComponentItemNo;
    }

    /**
     * originCntryCd のゲッターメソッドです。
     * 
     * @return the originCntryCd
     */
    public String getOriginCntryCd() {
        return originCntryCd;
    }

    /**
     * originCntryCd のセッターメソッドです。
     * 
     * @param originCntryCd originCntryCd に設定する
     */
    public void setOriginCntryCd(String originCntryCd) {
        this.originCntryCd = originCntryCd;
    }

    /**
     * qtyUnit のゲッターメソッドです。
     * 
     * @return the qtyUnit
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * qtyUnit のセッターメソッドです。
     * 
     * @param qtyUnit qtyUnit に設定する
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    /**
     * qty のゲッターメソッドです。
     * 
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * qty のセッターメソッドです。
     * 
     * @param qty qty に設定する
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * unitPrice のゲッターメソッドです。
     * 
     * @return the unitPrice
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * unitPrice のセッターメソッドです。
     * 
     * @param unitPrice unitPrice に設定する
     */
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * commercialFlg のゲッターメソッドです。
     * 
     * @return the commercialFlg
     */
    public String getCommercialFlg() {
        return commercialFlg;
    }

    /**
     * commercialFlg のセッターメソッドです。
     * 
     * @param commercialFlg commercialFlg に設定する
     */
    public void setCommercialFlg(String commercialFlg) {
        this.commercialFlg = commercialFlg;
    }

    /**
     * packingStatus のゲッターメソッドです。
     * 
     * @return the packingStatus
     */
    public String getPackingStatus() {
        return packingStatus;
    }

    /**
     * packingStatus のセッターメソッドです。
     * 
     * @param packingStatus packingStatus に設定する
     */
    public void setPackingStatus(String packingStatus) {
        this.packingStatus = packingStatus;
    }

    /**
     * <p>Getter method for kitCustomerItemNo.</p>
     *
     * @return the kitCustomerItemNo
     */
    public String getKitCustomerItemNo() {
        return kitCustomerItemNo;
    }

    /**
     * <p>Setter method for kitCustomerItemNo.</p>
     *
     * @param kitCustomerItemNo Set for kitCustomerItemNo
     */
    public void setKitCustomerItemNo(String kitCustomerItemNo) {
        this.kitCustomerItemNo = kitCustomerItemNo;
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
     * <p>Getter method for netWeight.</p>
     *
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }

    /**
     * <p>Setter method for netWeight.</p>
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
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
     * <p>Getter method for reExpGoodsFlg.</p>
     *
     * @return the reExpGoodsFlg
     */
    public String getReExpGoodsFlg() {
        return reExpGoodsFlg;
    }

    /**
     * <p>Setter method for reExpGoodsFlg.</p>
     *
     * @param reExpGoodsFlg Set for reExpGoodsFlg
     */
    public void setReExpGoodsFlg(String reExpGoodsFlg) {
        this.reExpGoodsFlg = reExpGoodsFlg;
    }

    /**
     * currency のゲッターメソッドです。
     * 
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency のセッターメソッドです。
     * 
     * @param currency currency に設定する
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * totalNetWeight のゲッターメソッドです。
     * 
     * @return the totalNetWeight
     */
    public String getTotalNetWeight() {
        return totalNetWeight;
    }

    /**
     * totalNetWeight のセッターメソッドです。
     * 
     * @param totalNetWeight totalNetWeight に設定する
     */
    public void setTotalNetWeight(String totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }


}
