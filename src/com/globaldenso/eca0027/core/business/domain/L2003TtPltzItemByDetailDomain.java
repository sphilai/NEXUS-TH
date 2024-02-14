/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of form [L2003] that output for domain form (specification).
 * <br/>帳票【L2003】の帳票出力用ドメイン（明細）です。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10064 $
 */
public class L2003TtPltzItemByDetailDomain extends AbstractDomain {

    /**
     * Serial Version ID.<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Palletize ． MAIN MARK<br />
     * パレタイズ．メインマーク
     */
    private String mainMark = null;
    /**
     * Palletize ． SHIPPER CODE<br />
     * パレタイズ．荷主コード
     */
    private String shipperCd = null;
    /**
     * Palletize Item ． PALLETIZE ITEM NO<br />
     * パレタイズ対象品．パレタイズ品目番号
     */
    private String pltzItemNo = null;
    /**
     * Palletize Item ． PACKAGE CODE<br />
     * パレタイズ対象品．包装区分
     */
    private String pkgCd = null;
    /**
     * Palletize Item ． ITEM DESCRIPTION<br />
     * パレタイズ対象品．品目名称
     */
    private String itemDescription = null;
    /**
     * Palletize Item ． MODEL CODE<br />
     * パレタイズ対象品．型式コード
     */
    private String modelCd = null;
    /**
     * Palletize Item ． RT FLAG<br />
     * パレタイズ対象品．RT材フラグ
     */
    private String rtFlg = null;
    /**
     * Palletize Item. QUANTITY (total)<br />
     * パレタイズ対象品．数量(合計)
     */
    private String sumQty = null;
    /**
     * Palletize Item ． MIX TAG NO<br />
     * パレタイズ対象品．MIXタグNO
     */
    private String mixFlg = null;
    /**
     * Palletize Item Receive Order ． CUSTOMER ITEM NO<br />
     * パレタイズ対象品受注情報．得意先品目番号
     */
    private String customerItemNo = null;
    /**
     * Palletize Item Receive Order ． BRANCH<br />
     * パレタイズ対象品受注情報．枝番
     */
    private String brch = null;
    /**
     * Export Shipping Item No Special Information Master ． CASEMARK NOTATION<br />
     * 輸出出荷品目番号原単位．ケースマーク注意書き
     */
    private String casemarkNotation = null;
    /**
     * Shipping Lot ． SHIPPING LOT<br />
     * パレタイズ対象品．出荷ロット
     */
    private String shippingLot = null;
    /**
     * Tag Quantity ． TAG QTY<br />
     * パレタイズ対象品．タグ数
     */
    private String tagQty = null;
    
    /**
     * Default Constructor
     */
    public L2003TtPltzItemByDetailDomain() {
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
     * @param mainMark Set for mainMark.
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
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
     * @param shipperCd Set for shipperCd.
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
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
     * @param pltzItemNo Set for pltzItemNo.
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
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
     * @param pkgCd Set for pkgCd.
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
     * @param itemDescription Set for itemDescription.
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    /**
     * Getter method for modelCd.
     *
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }
    /**
     * Setter method for modelCd.
     *
     * @param modelCd Set for modelCd.
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
    }
    /**
     * Getter method for rtFlg.
     *
     * @return the rtFlg
     */
    public String getRtFlg() {
        return rtFlg;
    }
    /**
     * Setter method for rtFlg.
     *
     * @param rtFlg Set for rtFlg.
     */
    public void setRtFlg(String rtFlg) {
        this.rtFlg = rtFlg;
    }
    /**
     * Getter method for sumQty.
     *
     * @return the sumQty
     */
    public String getSumQty() {
        return sumQty;
    }
    /**
     * Setter method for sumQty.
     *
     * @param sumQty Set for sumQty.
     */
    public void setSumQty(String sumQty) {
        this.sumQty = sumQty;
    }
    /**
     * Getter method for mixFlg.
     *
     * @return the mixFlg
     */
    public String getMixFlg() {
        return mixFlg;
    }
    /**
     * Setter method for mixFlg.
     *
     * @param mixFlg Set for mixFlg.
     */
    public void setMixFlg(String mixFlg) {
        this.mixFlg = mixFlg;
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
     * @param customerItemNo Set for customerItemNo.
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }
    /**
     * Getter method for brch.
     *
     * @return the brch
     */
    public String getBrch() {
        return brch;
    }
    /**
     * Setter method for brch.
     *
     * @param brch Set for brch.
     */
    public void setBrch(String brch) {
        this.brch = brch;
    }
    /**
     * Getter method for casemarkNotation.
     *
     * @return the casemarkNotation
     */
    public String getCasemarkNotation() {
        return casemarkNotation;
    }
    /**
     * Setter method for casemarkNotation.
     *
     * @param casemarkNotation Set for casemarkNotation.
     */
    public void setCasemarkNotation(String casemarkNotation) {
        this.casemarkNotation = casemarkNotation;
    }

    /**
     * <p>Getter method for shippingLot.</p>
     *
     * @return the shippingLot
     */
    public String getShippingLot() {
        return shippingLot;
    }

    /**
     * <p>Setter method for shippingLot.</p>
     *
     * @param shippingLot Set for shippingLot
     */
    public void setShippingLot(String shippingLot) {
        this.shippingLot = shippingLot;
    }

    /**
     * <p>Getter method for tagQty.</p>
     *
     * @return the tagQty
     */
    public String getTagQty() {
        return tagQty;
    }

    /**
     * <p>Setter method for tagQty.</p>
     *
     * @param tagQty Set for tagQty
     */
    public void setTagQty(String tagQty) {
        this.tagQty = tagQty;
    }

}
