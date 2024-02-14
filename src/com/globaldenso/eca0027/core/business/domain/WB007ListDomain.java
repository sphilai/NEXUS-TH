/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a List domain of the Last Digit Change Register Screen.
 * <br />品番末尾変更登録画面のListドメインです。
 *
 * @version $Revision: 6761 $
 */
public class WB007ListDomain extends AbstractDomain {

    /**
     * serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * ITEM NO
     * <br />品目番号
     */
    private String itemNo;
    
    /**
     * ETD DUE DATE
     * <br />船積期限
     */
    private String etdDueDt;
    
    /**
     * CUSTOMER ITEM NO
     * <br />得意先品目番号
     */
    private String customerItemNo;

    /**
     * CUSTOMER ITEM NO
     * <br />得意先品目番号
     */
    private String customerItemNoHidden;
    
    /**
     * CUSTOMER ITEM NO ORIGINAL
     * <br />得意先品目番号オリジナル
     */
    private String customerItemNoOrg;
    
    /**
     * ORDER CONTROL NO
     * <br />オーダーコントロールNO
     */
    private String odrCtrlNo;
    
    /**
     * REVISION NO
     * <br />履歴NO
     */
    private String revisionNo;
    
    /**
     * REVISION NO FOR EIS
     * <br />履歴NO(拠点間) 
     */
    private String revisionNoEis;
    
    /**
     * CUSTOMER DUE DATE
     * <br />顧客納期
     */
    private String customerDueDt;
    
    /**
     * ORDER QUANTITY
     * <br />注文数量
     */
    private String odrQty;
    
    /**
     * ALLOC QUANTITY
     * <br />引当数量
     */
    private String pltzAllocQty;
    
    /**
     * SALES COMPANY PO NO
     * <br />販売会社PO NO
     */
    private String salesCompPoNo;
    
    /**
     * SUPPLIER CODE
     * <br />仕入先コード
     */
    private String supplierCd;
    
    /**
     * SHIPPING LOT
     * <br />出荷ロット
     */
    private String shippingLot;
    
    /**
     * ITEM NO
     * <br />品目番号
     */
    private String partItem;
    
    /**
     * INDEX
     * <br />インデックス
     */
    private String index;
    
    /**
     * CUSTOMER PO NO
     * <br />得意先PO NO
     */
    private String customerPoNo;
    
    /**
     * ORDER QUANTITY
     * <br />注文数量
     */
    private String odrQtyHidden;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCdHidden;

    /**
     * UPDATE TIMESTAMP
     * <br />更新日時
     */
    private String updateTimestamp;

    /**
     * ITEM DESCRIPTION
     * <br />品目名称
     */
    private String partName;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * Warning Flg (Order Qty)
     * <br />ワーニングフラグ(Order Qty)
     */
    private String warningFlgOdrQty;
    
    /**
     * Warning Flg (Item No)
     * <br />ワーニングフラグ(Item No)
     */
    private String warningFlgItemNo;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public WB007ListDomain() {
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
     * Getter method for etdDueDt.
     *
     * @return the etdDueDt
     */
    public String getEtdDueDt() {
        return etdDueDt;
    }

    /**
     * Setter method for etdDueDt.
     *
     * @param etdDueDt Set for etdDueDt
     */
    public void setEtdDueDt(String etdDueDt) {
        this.etdDueDt = etdDueDt;
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
     * Getter method for customerItemNoHidden.
     *
     * @return the customerItemNoHidden
     */
    public String getCustomerItemNoHidden() {
        return customerItemNoHidden;
    }

    /**
     * Setter method for customerItemNoHidden.
     *
     * @param customerItemNoHidden Set for customerItemNoHidden
     */
    public void setCustomerItemNoHidden(String customerItemNoHidden) {
        this.customerItemNoHidden = customerItemNoHidden;
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
    public String getOdrCtrlNo() {
        return odrCtrlNo;
    }

    /**
     * Setter method for odrCtrlNo.
     *
     * @param odrCtrlNo Set for odrCtrlNo
     */
    public void setOdrCtrlNo(String odrCtrlNo) {
        this.odrCtrlNo = odrCtrlNo;
    }

    /**
     * Getter method for revisionNo.
     *
     * @return the revisionNo
     */
    public String getRevisionNo() {
        return revisionNo;
    }

    /**
     * Setter method for revisionNo.
     *
     * @param revisionNo Set for revisionNo
     */
    public void setRevisionNo(String revisionNo) {
        this.revisionNo = revisionNo;
    }

    /**
     * Getter method for revisionNoEis.
     *
     * @return the revisionNoEis
     */
    public String getRevisionNoEis() {
        return revisionNoEis;
    }

    /**
     * Setter method for revisionNoEis.
     *
     * @param revisionNoEis Set for revisionNoEis
     */
    public void setRevisionNoEis(String revisionNoEis) {
        this.revisionNoEis = revisionNoEis;
    }

    /**
     * Getter method for customerDueDt.
     *
     * @return the customerDueDt
     */
    public String getCustomerDueDt() {
        return customerDueDt;
    }

    /**
     * Setter method for customerDueDt.
     *
     * @param customerDueDt Set for customerDueDt
     */
    public void setCustomerDueDt(String customerDueDt) {
        this.customerDueDt = customerDueDt;
    }

    /**
     * Getter method for odrQty.
     *
     * @return the odrQty
     */
    public String getOdrQty() {
        return odrQty;
    }

    /**
     * Setter method for odrQty.
     *
     * @param odrQty Set for odrQty
     */
    public void setOdrQty(String odrQty) {
        this.odrQty = odrQty;
    }

    /**
     * Getter method for pltzAllocQty.
     *
     * @return the pltzAllocQty
     */
    public String getPltzAllocQty() {
        return pltzAllocQty;
    }

    /**
     * Setter method for pltzAllocQty.
     *
     * @param pltzAllocQty Set for pltzAllocQty
     */
    public void setPltzAllocQty(String pltzAllocQty) {
        this.pltzAllocQty = pltzAllocQty;
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
     * Getter method for supplierCd.
     *
     * @return the supplierCd
     */
    public String getSupplierCd() {
        return supplierCd;
    }

    /**
     * Setter method for supplierCd.
     *
     * @param supplierCd Set for supplierCd
     */
    public void setSupplierCd(String supplierCd) {
        this.supplierCd = supplierCd;
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
     * Getter method for partItem.
     *
     * @return the partItem
     */
    public String getPartItem() {
        return partItem;
    }

    /**
     * Setter method for partItem.
     *
     * @param partItem Set for partItem
     */
    public void setPartItem(String partItem) {
        this.partItem = partItem;
    }

    /**
     * Getter method for index.
     *
     * @return the index
     */
    public String getIndex() {
        return index;
    }

    /**
     * Setter method for index.
     *
     * @param index Set for index
     */
    public void setIndex(String index) {
        this.index = index;
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
     * Getter method for odrQtyHidden.
     *
     * @return the odrQtyHidden
     */
    public String getOdrQtyHidden() {
        return odrQtyHidden;
    }

    /**
     * Setter method for odrQtyHidden.
     *
     * @param odrQtyHidden Set for odrQtyHidden
     */
    public void setOdrQtyHidden(String odrQtyHidden) {
        this.odrQtyHidden = odrQtyHidden;
    }

    /**
     * Getter method for pkgCdHidden.
     *
     * @return the pkgCdHidden
     */
    public String getPkgCdHidden() {
        return pkgCdHidden;
    }

    /**
     * Setter method for pkgCdHidden.
     *
     * @param pkgCdHidden Set for pkgCdHidden
     */
    public void setPkgCdHidden(String pkgCdHidden) {
        this.pkgCdHidden = pkgCdHidden;
    }

    /**
     * Getter method for updateTimestamp.
     *
     * @return the updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * Setter method for updateTimestamp.
     *
     * @param updateTimestamp Set for updateTimestamp
     */
    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * Getter method for partName.
     *
     * @return the partName
     */
    public String getPartName() {
        return partName;
    }

    /**
     * Setter method for partName.
     *
     * @param partName Set for partName
     */
    public void setPartName(String partName) {
        this.partName = partName;
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
     * Getter method for warningFlgOdrQty.
     *
     * @return the warningFlgOdrQty
     */
    public String getWarningFlgOdrQty() {
        return warningFlgOdrQty;
    }

    /**
     * Setter method for warningFlgOdrQty.
     *
     * @param warningFlgOdrQty Set for warningFlgOdrQty
     */
    public void setWarningFlgOdrQty(String warningFlgOdrQty) {
        this.warningFlgOdrQty = warningFlgOdrQty;
    }

    /**
     * Getter method for warningFlgItemNo.
     *
     * @return the warningFlgItemNo
     */
    public String getWarningFlgItemNo() {
        return warningFlgItemNo;
    }

    /**
     * Setter method for warningFlgItemNo.
     *
     * @param warningFlgItemNo Set for warningFlgItemNo
     */
    public void setWarningFlgItemNo(String warningFlgItemNo) {
        this.warningFlgItemNo = warningFlgItemNo;
    }
}
