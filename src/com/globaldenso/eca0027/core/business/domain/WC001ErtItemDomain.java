/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * 
 * This is a domain class holding a Palletize Item.
 * <br />パレタイズ対象品を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WC001ErtItemDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * MAIN MARK
     * <br />メインマーク
     */
    private String mainMark;
    
    /**
     * BRANCH
     * <br />枝番
     */
    private BigDecimal brch;
    
    /**
     * PALLETIZE ITEM NO
     * <br />パレタイズ品目番号
     */
    private String pltzItemNo;
    
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
    private BigDecimal qty;
    
    /**
     * QUANTITY UNIT
     * <br />数量単位
     */
    private String qtyUnit;
    
    /**
     * TAG QUANTITY
     * <br />タグ数
     */
    private BigDecimal tagQty;
    
    /**
     * ITEM TYPE
     * <br />品目区分
     */
    private String itemTyp;
    
    /**
     * NET WEIGHT
     * <br />ネット重量
     */
    private BigDecimal netWeight;
    
    /**
     * ITEM WEIGHT
     * <br />製品重量
     */
    private BigDecimal itemWeight;
    
    /**
     * WEIGHT UNIT
     * <br />重量単位
     */
    private String weightUnit;
    
    /**
     * SHIPPING LOT
     * <br />出荷ロット
     */
    private BigDecimal shippingLot;
    
    /**
     * PACKAGE TYPE
     * <br />包装材種別
     */
    private String pkgTyp;
    
    /**
     * MODEL CODE
     * <br />型式コード
     */
    private String modelCd;
    
    /**
     * EXPORT LIMIT TYPE
     * <br />輸出規制区分
     */
    private String expLimitTyp;
    
    /**
     * DENGER ITEM FLAG
     * <br />危険品フラグ
     */
    private String dngrItemFlg;
    
    /**
     * ORIGIN COUNTRY CODE
     * <br />原産国コード
     */
    private String originCntryCd;
    
    /**
     * CURRENCY CODE
     * <br />通貨コード
     */
    private String currCd;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * RT FLAG
     * <br />RT材フラグ
     */
    private String rtFlg;
    
    /**
     * KIT FLAG
     * <br />KIT品フラグ
     */
    private String kitFlg;
    
    /**
     * EXPORT REQUEST NO
     * <br />輸出依頼NO
     */
    private String expRequestNo;
    
    /**
     * LINE NO
     * <br />ライン番号
     */
    private BigDecimal lineNo;
    
    /**
     * KIT BRANCH
     * <br />KIT品枝番
     */
    private BigDecimal kitBrch;
    
    /**
     * MIX TAG NO
     * <br />MIXタグNO
     */
    private String mixTagNo;
    
    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;
    
    /**
     * PARENT FLAG
     * <br />親フラグ
     */
    private String parFlg;
    
    /**
     * KIT PARENT ITEM NO
     * <br />親KIT品目番号
     */
    private String kitParItemNo;
    
    /**
     * CUSTOMER PO NO
     * <br />得意先PO NO
     */
    private String customerPoNo;
    
    /**
     * CUSTOMER ITEM NO
     * <br />得意先品目番号
     */
    private String customerItemNo;
    
    /**
     * UNIT PRICE
     * <br />単価
     */
    private BigDecimal unitPrice;
    
    /**
     * HS CODE
     * <br />HSコード
     */
    private String hsCd;
    
    /**
     * INPUT METHOD TYPE
     * <br />入力手段区分
     */
    private String inputMethTyp;    
    
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WC001ErtItemDomain() {
        super();
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
     * Getter method for brch.
     *
     * @return the brch
     */
    public BigDecimal getBrch() {
        return brch;
    }

    /**
     * Setter method for brch.
     *
     * @param brch Set for brch
     */
    public void setBrch(BigDecimal brch) {
        this.brch = brch;
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
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Setter method for qty.
     *
     * @param qty Set for qty
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    /**
     * Getter method for qtyUnit.
     *
     * @return the qtyUnit
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * Setter method for qtyUnit.
     *
     * @param qtyUnit Set for qtyUnit
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    /**
     * Getter method for tagQty.
     *
     * @return the tagQty
     */
    public BigDecimal getTagQty() {
        return tagQty;
    }

    /**
     * Setter method for tagQty.
     *
     * @param tagQty Set for tagQty
     */
    public void setTagQty(BigDecimal tagQty) {
        this.tagQty = tagQty;
    }

    /**
     * Getter method for itemTyp.
     *
     * @return the itemTyp
     */
    public String getItemTyp() {
        return itemTyp;
    }

    /**
     * Setter method for itemTyp.
     *
     * @param itemTyp Set for itemTyp
     */
    public void setItemTyp(String itemTyp) {
        this.itemTyp = itemTyp;
    }

    /**
     * Getter method for netWeight.
     *
     * @return the netWeight
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * Setter method for netWeight.
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * Getter method for itemWeight.
     *
     * @return the itemWeight
     */
    public BigDecimal getItemWeight() {
        return itemWeight;
    }

    /**
     * Setter method for itemWeight.
     *
     * @param itemWeight Set for itemWeight
     */
    public void setItemWeight(BigDecimal itemWeight) {
        this.itemWeight = itemWeight;
    }

    /**
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
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
     * Getter method for pkgTyp.
     *
     * @return the pkgTyp
     */
    public String getPkgTyp() {
        return pkgTyp;
    }

    /**
     * Setter method for pkgTyp.
     *
     * @param pkgTyp Set for pkgTyp
     */
    public void setPkgTyp(String pkgTyp) {
        this.pkgTyp = pkgTyp;
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
     * @param modelCd Set for modelCd
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
    }

    /**
     * Getter method for expLimitTyp.
     *
     * @return the expLimitTyp
     */
    public String getExpLimitTyp() {
        return expLimitTyp;
    }

    /**
     * Setter method for expLimitTyp.
     *
     * @param expLimitTyp Set for expLimitTyp
     */
    public void setExpLimitTyp(String expLimitTyp) {
        this.expLimitTyp = expLimitTyp;
    }

    /**
     * Getter method for dngrItemFlg.
     *
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * Setter method for dngrItemFlg.
     *
     * @param dngrItemFlg Set for dngrItemFlg
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * Getter method for originCntryCd.
     *
     * @return the originCntryCd
     */
    public String getOriginCntryCd() {
        return originCntryCd;
    }

    /**
     * Setter method for originCntryCd.
     *
     * @param originCntryCd Set for originCntryCd
     */
    public void setOriginCntryCd(String originCntryCd) {
        this.originCntryCd = originCntryCd;
    }

    /**
     * Getter method for currCd.
     *
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * Setter method for currCd.
     *
     * @param currCd Set for currCd
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
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
     * @param rtFlg Set for rtFlg
     */
    public void setRtFlg(String rtFlg) {
        this.rtFlg = rtFlg;
    }

    /**
     * Getter method for kitFlg.
     *
     * @return the kitFlg
     */
    public String getKitFlg() {
        return kitFlg;
    }

    /**
     * Setter method for kitFlg.
     *
     * @param kitFlg Set for kitFlg
     */
    public void setKitFlg(String kitFlg) {
        this.kitFlg = kitFlg;
    }

    /**
     * Getter method for expRequestNo.
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * Setter method for expRequestNo.
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * Getter method for lineNo.
     *
     * @return the lineNo
     */
    public BigDecimal getLineNo() {
        return lineNo;
    }

    /**
     * Setter method for lineNo.
     *
     * @param lineNo Set for lineNo
     */
    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    /**
     * Getter method for kitBrch.
     *
     * @return the kitBrch
     */
    public BigDecimal getKitBrch() {
        return kitBrch;
    }

    /**
     * Setter method for kitBrch.
     *
     * @param kitBrch Set for kitBrch
     */
    public void setKitBrch(BigDecimal kitBrch) {
        this.kitBrch = kitBrch;
    }

    /**
     * Getter method for mixTagNo.
     *
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * Setter method for mixTagNo.
     *
     * @param mixTagNo Set for mixTagNo
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
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
     * Getter method for parFlg.
     *
     * @return the parFlg
     */
    public String getParFlg() {
        return parFlg;
    }

    /**
     * Setter method for parFlg.
     *
     * @param parFlg Set for parFlg
     */
    public void setParFlg(String parFlg) {
        this.parFlg = parFlg;
    }

    /**
     * Getter method for kitParItemNo.
     *
     * @return the kitParItemNo
     */
    public String getKitParItemNo() {
        return kitParItemNo;
    }

    /**
     * Setter method for kitParItemNo.
     *
     * @param kitParItemNo Set for kitParItemNo
     */
    public void setKitParItemNo(String kitParItemNo) {
        this.kitParItemNo = kitParItemNo;
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
     * Getter method for unitPrice.
     *
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter method for unitPrice.
     *
     * @param unitPrice Set for unitPrice
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Getter method for hsCd.
     *
     * @return the hsCd
     */
    public String getHsCd() {
        return hsCd;
    }

    /**
     * Setter method for hsCd.
     *
     * @param hsCd Set for hsCd
     */
    public void setHsCd(String hsCd) {
        this.hsCd = hsCd;
    }

    /**
     * Getter method for inputMethTyp.
     *
     * @return the inputMethTyp
     */
    public String getInputMethTyp() {
        return inputMethTyp;
    }

    /**
     * Setter method for inputMethTyp.
     *
     * @param inputMethTyp Set for inputMethTyp
     */
    public void setInputMethTyp(String inputMethTyp) {
        this.inputMethTyp = inputMethTyp;
    }

    
}
