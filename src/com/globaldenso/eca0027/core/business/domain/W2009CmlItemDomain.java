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
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2009CmlItemDomain extends AbstractDomain {

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
     * PACKAGE FORM TYPE
     * <br />梱包形態区分
     */
    private String pkgFormTyp;
    
    /**
     * INVOICE KEY
     * <br />インボイスキー
     */
    private String invoiceKey;
    
    /**
     * CONTAINER SORTING KEY
     * <br />コンテナ層別キー
     */
    private String containerSortingKey;
    
    /**
     * CONTAINER LOOSE TYPE
     * <br />コンテナルーズ区分
     */
    private String containerLooseTyp;
    
    /**
     * STAGING INSTRUCTION ITEM FLAG
     * <br />荷揃指示品フラグ
     */
    private String stgInstrItemFlg;
    
    /**
     * LOADING CODE
     * <br />荷積位置コード
     */
    private String loadingCd;
    
    /**
     * CUSTOM TIMING TYPE
     * <br />通関タイミング区分
     */
    private String customTimingTyp;
    
    /**
     * CO FLG
     * <br />結合包装仕様MAXリビジョン
     */
    private String coFlg;
    
    /**
     * ORDER QTY
     * <br />輸出受注オーダー数
     */
    private BigDecimal orderQty;
    
    /**
     * ON HAND QTY
     * <br />在庫数
     */
    private BigDecimal onHandQty;
    
    /**
     * INSTR PKGeD QTY
     * <br />梱包済数
     */
    private BigDecimal instrPkgedQty;
    
    /**
     * B/O QTY
     * <br />輸出受注BO数
     */
    private BigDecimal boQty;
    
    /**
     * INSTR QTY
     * <br />梱包指示数
     */
    private BigDecimal instrQty;
    
    /**
     * PKG FORM TYPE
     * <br />梱包形態区分(hidden)
     */
    private String pkgFormTypHidden;
    
    /**
     * MIX TAG FLG
     * <br />MixTagフラグ
     */
    private String mixTagFlg;
    
    /**
     * DISABLE FLG
     * <br />利用不可フラグ
     */
    private String disableFlg;
    
    /**
     * WARMING FLG
     * <br />ワーニングフラグ
     */
    private String warningFlg;
    
    /**
     * INPUT METHOD
     * <br />PKG登録手法
     */
    private String inputMethod;
    
    /**
     * TOTAL QTY
     * <br />PKG合計数量
     */
    private BigDecimal totalQty;
    
    /**
     * PKG TYPE
     * <br />包装材種別(hidden)
     */
    private String pkgTypHidden;
    
    /**
     * LGCY UNIT CD
     * <br />LEGACY単位コード
     */
    private String lgcyUnitCd;
    
    /**
     * ON HAND TOTAL QTY
     * <br />在庫総数
     */
    private BigDecimal onHandTotalQty;
    
    /**
     * CURRENCY CD
     * <br />通貨コード
     */
    private String currencyCD;
    
    /** 
     * TMP QTY
     * <br />仮在庫数
     */
    private BigDecimal tmpQty;
    
    /**
     * USE QUANTITY
     * <br />使用数
     */
    private BigDecimal useQty;
    
    /**
     * PACKAGE LOT SIZE
     * <br />収容数
     */
    private BigDecimal lotSize;
    
    /** 
     * PACKAGE ITEM NO
     * <br />包装材品目番号
     */
    private String pkgItemNo;
    
    /** 
     * RT TYPE
     * <br />再使用区分
     */
    private String rtTyp;
    
    /**
     * PACKAGE WEIGHT
     * <br />包装材重量
     */
    private BigDecimal pkgWeight;
    
    /**
     * PACKAGE NAME
     * <br />包装材名称
     */
    private String pkgNm;
    
    /** 
     * ITEM NO MIXタグ
     * <br />品目番号
     */
    private String itemNo;
    
    /** 
     * INNER OUTER TYPE
     * <br />内外装区分
     */
    private String innerOuterTyp;
    
    /**
     * NO
     * <br /> 画面表示上の連番
     */
    private int no;
    
    /**
     * AUTH FLG
     * <br />権限区分
     */
    private String authFlg;

    // UT304 MULTI LABEL ADD START
    /**
     * ITEM WEIGHT(Original)
     * <br />製品重量（オリジナル）
     */
    private BigDecimal originalItemWeight;

    /**
     * ITEM WEIGHT UNIT(Original)
     * <br />製品重量単位（オリジナル）
     */
    private String originalItemWeightUnit;
    // UT304 MULTI LABEL ADD END

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2009CmlItemDomain() {
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

    /**
     * Getter method for pkgFormTyp.
     *
     * @return the pkgFormTyp
     */
    public String getPkgFormTyp() {
        return pkgFormTyp;
    }

    /**
     * Setter method for pkgFormTyp.
     *
     * @param pkgFormTyp Set for pkgFormTyp
     */
    public void setPkgFormTyp(String pkgFormTyp) {
        this.pkgFormTyp = pkgFormTyp;
    }

    /**
     * Getter method for invoiceKey.
     *
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * Setter method for invoiceKey.
     *
     * @param invoiceKey Set for invoiceKey
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method for stgInstrItemFlg.
     *
     * @return the stgInstrItemFlg
     */
    public String getStgInstrItemFlg() {
        return stgInstrItemFlg;
    }

    /**
     * Setter method for stgInstrItemFlg.
     *
     * @param stgInstrItemFlg Set for stgInstrItemFlg
     */
    public void setStgInstrItemFlg(String stgInstrItemFlg) {
        this.stgInstrItemFlg = stgInstrItemFlg;
    }

    /**
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * Getter method for coFlg.
     *
     * @return the coFlg
     */
    public String getCoFlg() {
        return coFlg;
    }

    /**
     * Setter method for coFlg.
     *
     * @param coFlg Set for coFlg
     */
    public void setCoFlg(String coFlg) {
        this.coFlg = coFlg;
    }

    /**
     * Getter method for orderQty.
     *
     * @return the orderQty
     */
    public BigDecimal getOrderQty() {
        return orderQty;
    }

    /**
     * Setter method for orderQty.
     *
     * @param orderQty Set for orderQty
     */
    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * Getter method for onHandQty.
     *
     * @return the onHandQty
     */
    public BigDecimal getOnHandQty() {
        return onHandQty;
    }

    /**
     * Setter method for onHandQty.
     *
     * @param onHandQty Set for onHandQty
     */
    public void setOnHandQty(BigDecimal onHandQty) {
        this.onHandQty = onHandQty;
    }

    /**
     * Getter method for instrPkgedQty.
     *
     * @return the instrPkgedQty
     */
    public BigDecimal getInstrPkgedQty() {
        return instrPkgedQty;
    }

    /**
     * Setter method for instrPkgedQty.
     *
     * @param instrPkgedQty Set for instrPkgedQty
     */
    public void setInstrPkgedQty(BigDecimal instrPkgedQty) {
        this.instrPkgedQty = instrPkgedQty;
    }

    /**
     * Getter method for boQty.
     *
     * @return the boQty
     */
    public BigDecimal getBoQty() {
        return boQty;
    }

    /**
     * Setter method for boQty.
     *
     * @param boQty Set for boQty
     */
    public void setBoQty(BigDecimal boQty) {
        this.boQty = boQty;
    }

    /**
     * Getter method for instrQty.
     *
     * @return the instrQty
     */
    public BigDecimal getInstrQty() {
        return instrQty;
    }

    /**
     * Setter method for instrQty.
     *
     * @param instrQty Set for instrQty
     */
    public void setInstrQty(BigDecimal instrQty) {
        this.instrQty = instrQty;
    }

    /**
     * Getter method for pkgFormTypHidden.
     *
     * @return the pkgFormTypHidden
     */
    public String getPkgFormTypHidden() {
        return pkgFormTypHidden;
    }

    /**
     * Setter method for pkgFormTypHidden.
     *
     * @param pkgFormTypHidden Set for pkgFormTypHidden
     */
    public void setPkgFormTypHidden(String pkgFormTypHidden) {
        this.pkgFormTypHidden = pkgFormTypHidden;
    }

    /**
     * Getter method for mixTagFlg.
     *
     * @return the mixTagFlg
     */
    public String getMixTagFlg() {
        return mixTagFlg;
    }

    /**
     * Setter method for mixTagFlg.
     *
     * @param mixTagFlg Set for mixTagFlg
     */
    public void setMixTagFlg(String mixTagFlg) {
        this.mixTagFlg = mixTagFlg;
    }

    /**
     * Getter method for disableFlg.
     *
     * @return the disableFlg
     */
    public String getDisableFlg() {
        return disableFlg;
    }

    /**
     * Setter method for disableFlg.
     *
     * @param disableFlg Set for disableFlg
     */
    public void setDisableFlg(String disableFlg) {
        this.disableFlg = disableFlg;
    }

    /**
     * Getter method for warningFlg.
     *
     * @return the warningFlg
     */
    public String getWarningFlg() {
        return warningFlg;
    }

    /**
     * Setter method for warningFlg.
     *
     * @param warningFlg Set for warningFlg
     */
    public void setWarningFlg(String warningFlg) {
        this.warningFlg = warningFlg;
    }



    /**
     * Getter method for totalQty.
     *
     * @return the totalQty
     */
    public BigDecimal getTotalQty() {
        return totalQty;
    }

    /**
     * Setter method for totalQty.
     *
     * @param totalQty Set for totalQty
     */
    public void setTotalQty(BigDecimal totalQty) {
        this.totalQty = totalQty;
    }

    /**
     * Getter method for pkgTypHidden.
     *
     * @return the pkgTypHidden
     */
    public String getPkgTypHidden() {
        return pkgTypHidden;
    }

    /**
     * Setter method for pkgTypHidden.
     *
     * @param pkgTypHidden Set for pkgTypHidden
     */
    public void setPkgTypHidden(String pkgTypHidden) {
        this.pkgTypHidden = pkgTypHidden;
    }

    /**
     * Getter method for lgcyUnitCd.
     *
     * @return the lgcyUnitCd
     */
    public String getLgcyUnitCd() {
        return lgcyUnitCd;
    }

    /**
     * Setter method for lgcyUnitCd.
     *
     * @param lgcyUnitCd Set for lgcyUnitCd
     */
    public void setLgcyUnitCd(String lgcyUnitCd) {
        this.lgcyUnitCd = lgcyUnitCd;
    }

    /**
     * Getter method for onHandTotalQty.
     *
     * @return the onHandTotalQty
     */
    public BigDecimal getOnHandTotalQty() {
        return onHandTotalQty;
    }

    /**
     * Setter method for onHandTotalQty.
     *
     * @param onHandTotalQty Set for onHandTotalQty
     */
    public void setOnHandTotalQty(BigDecimal onHandTotalQty) {
        this.onHandTotalQty = onHandTotalQty;
    }

    /**
     * Getter method for currencyCD.
     *
     * @return the currencyCD
     */
    public String getCurrencyCD() {
        return currencyCD;
    }

    /**
     * Setter method for currencyCD.
     *
     * @param currencyCD Set for currencyCD
     */
    public void setCurrencyCD(String currencyCD) {
        this.currencyCD = currencyCD;
    }
    
    /**
     * Getter method for tmpQty.
     *
     * @return the tmpQty
     */
    public BigDecimal getTmpQty() {
        return tmpQty;
    }

    /**
     * Setter method for tmpQty.
     *
     * @param tmpQty Set for tmpQty
     */
    public void setTmpQty(BigDecimal tmpQty) {
        this.tmpQty = tmpQty;
    }

    /**
     * Getter method for useQty.
     *
     * @return the useQty
     */
    public BigDecimal getUseQty() {
        return useQty;
    }

    /**
     * Setter method for useQty.
     *
     * @param useQty Set for useQty
     */
    public void setUseQty(BigDecimal useQty) {
        this.useQty = useQty;
    }

    /**
     * Getter method for lotSize.
     *
     * @return the lotSize
     */
    public BigDecimal getLotSize() {
        return lotSize;
    }

    /**
     * Setter method for lotSize.
     *
     * @param lotSize Set for lotSize
     */
    public void setLotSize(BigDecimal lotSize) {
        this.lotSize = lotSize;
    }

    /**
     * Getter method for pkgItemNo.
     *
     * @return the pkgItemNo
     */
    public String getPkgItemNo() {
        return pkgItemNo;
    }

    /**
     * Setter method for pkgItemNo.
     *
     * @param pkgItemNo Set for pkgItemNo
     */
    public void setPkgItemNo(String pkgItemNo) {
        this.pkgItemNo = pkgItemNo;
    }

    /**
     * Getter method for rtTyp.
     *
     * @return the rtTyp
     */
    public String getRtTyp() {
        return rtTyp;
    }

    /**
     * Setter method for rtTyp.
     *
     * @param rtTyp Set for rtTyp
     */
    public void setRtTyp(String rtTyp) {
        this.rtTyp = rtTyp;
    }

    /**
     * Getter method for pkgWeight.
     *
     * @return the pkgWeight
     */
    public BigDecimal getPkgWeight() {
        return pkgWeight;
    }

    /**
     * Setter method for pkgWeight.
     *
     * @param pkgWeight Set for pkgWeight
     */
    public void setPkgWeight(BigDecimal pkgWeight) {
        this.pkgWeight = pkgWeight;
    }

    /**
     * Getter method for pkgNm.
     *
     * @return the pkgNm
     */
    public String getPkgNm() {
        return pkgNm;
    }

    /**
     * Setter method for pkgNm.
     *
     * @param pkgNm Set for pkgNm
     */
    public void setPkgNm(String pkgNm) {
        this.pkgNm = pkgNm;
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
     * Getter method for innerOuterTyp.
     *
     * @return the innerOuterTyp
     */
    public String getInnerOuterTyp() {
        return innerOuterTyp;
    }

    /**
     * Setter method for innerOuterTyp.
     *
     * @param innerOuterTyp Set for innerOuterTyp
     */
    public void setInnerOuterTyp(String innerOuterTyp) {
        this.innerOuterTyp = innerOuterTyp;
    }

    /**
     * Getter method for inputMethod.
     *
     * @return the inputMethod
     */
    public String getInputMethod() {
        return inputMethod;
    }

    /**
     * Setter method for inputMethod.
     *
     * @param inputMethod Set for inputMethod
     */
    public void setInputMethod(String inputMethod) {
        this.inputMethod = inputMethod;
    }
    
    
    /**
     * Getter method for no.
     *
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * Setter method for no.
     *
     * @param no Set for no
     */
    public void setNo(int no) {
        this.no = no;
    }

    /**
     * Getter method for authFlg.
     *
     * @return the authFlg
     */
    public String getAuthFlg() {
        return authFlg;
    }

    /**
     * Setter method for authFlg.
     *
     * @param authFlg Set for authFlg
     */
    public void setAuthFlg(String authFlg) {
        this.authFlg = authFlg;
    }

    /**
     * Getter method for originalItemWeight.
     *
     * @return the originalItemWeight
     */
    public BigDecimal getOriginalItemWeight() {
        return originalItemWeight;
    }

    /**
     * Setter method for originalItemWeight.
     *
     * @param originalItemWeight Set for originalItemWeight
     */
    public void setOriginalItemWeight(BigDecimal originalItemWeight) {
        this.originalItemWeight = originalItemWeight;
    }

    /**
     * Getter method for originalItemWeightUnit.
     *
     * @return the originalItemWeightUnit
     */
    public String getOriginalItemWeightUnit() {
        return originalItemWeightUnit;
    }

    /**
     * Setter method for originalItemWeightUnit.
     *
     * @param originalItemWeightUnit Set for originalItemWeightUnit
     */
    public void setOriginalItemWeightUnit(String originalItemWeightUnit) {
        this.originalItemWeightUnit = originalItemWeightUnit;
    }
}
