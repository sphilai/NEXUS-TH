/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the information of Export Receive Order.
 * <br />輸出受注の情報を保持するドメインです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2001PltzInstrItemDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * ITEM NO
     * <br />品目番号
     */
    private String itemNo;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCd;

    /**
     * SHIPPING LOT
     * <br />出荷ロット
     */
    private BigDecimal shippingLot;
    
    /**
     * BOX QUANTITY
     * <br />箱数
     */
    private BigDecimal boxQty;
    
    /**
     * INSTRUCTION QUANTITY
     * <br />梱包指示数量
     */
    private BigDecimal instrQty;

    /**
     * PACKED QUANTITY
     * <br />梱包済数量
     */
    private BigDecimal packedQty;
    
    /**
     * TOTAL NET WEIGHT
     * <br />ネット総重量
     */
    private BigDecimal totalNetWeight;
    
    /**
     * BOX LOT QUANTITY
     * <br />小箱ロット数量
     */
    private BigDecimal boxLotQty;
    
    /**
     * PACKAGE FORM TYPE
     * <br />梱包形態区分
     */
    private String pkgFormTyp;
    
    // ------------- 梱包指示Createで使用 ---------------
    
    /**
     * 2 operating-days previous QUANTITY sum total
     * <br />2稼働日以前の数量合計
     */
    private BigDecimal sumQtyBefore2;
    
    /**
     * The QUANTITY sum total before 1 operating days
     * <br />1稼働日前の数量合計
     */
    private BigDecimal sumQtyBefore1;
    
    /**
     * The QUANTITY sum total of a date of record
     * <br />基準日の数量合計
     */
    private BigDecimal sumQty;
    
    /**
     * The QUANTITY sum total after 1 operating days
     * <br />1稼働日後の数量合計
     */
    private BigDecimal sumQtyAfter1;
    
    /**
     * The QUANTITY sum total after 2 operating days
     * <br />2稼働日後の数量合計
     */
    private BigDecimal sumQtyAfter2;
    
    /**
     * The QUANTITY sum total after 3 operating days
     * <br />3稼働日後の数量合計
     */
    private BigDecimal sumQtyAfter3;
    
    /**
     * The QUANTITY sum total after 4 operating days
     * <br />4稼働日以降の数量合計
     */
    private BigDecimal sumQtyAfter4;
    
    /**
     * Operating days
     * <br />稼働日
     */
    private List<Date> workingDayList;
    
    /**
     * ITEM DESCRIPTION
     * <br />品目名称
     */
    private String itemDescription;
    
    /**
     * Palletize-Instruction-Item-No-Work existence flag
     * <br />梱包指示品目番号ワーク存在フラグ
     */
    private String disabledFlg;
    
    /**
     * NET WEIGHT A
     * <br />実測ネット重量
     */
    private String netWeightA;
    
    /**
     * WAREHOUSE STOCK LOCATION
     * <br />倉庫保管場所
     */
    private String whStkLocation;
    
    /**
     * COLLATE METHOD TYPE
     * <br />照合方式区分
     */
    private String collateMethTyp;
    
    /**
     * WEIGHT UNIT
     * <br />重量単位
     */
    private String weightUnit;
    
    /** 
     * TMP QTY
     * <br />仮在庫数
     */
    private BigDecimal tmpQty;
    
    /**
     * ON HAND QTY
     * <br />在庫数
     */
    private BigDecimal onHandQty;
    
    // ------------- 梱包指示Registerで使用 ---------------
    
    /**
     * Palletize-Instruction-Receive-Order list
     * <br />梱包指示品目番号受注情報リスト
     */
    private List<? extends W2001PltzInstrOdrDomain> pltzInstrOdrList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2001PltzInstrItemDomain() {
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
     * Getter method for boxQty.
     *
     * @return the boxQty
     */
    public BigDecimal getBoxQty() {
        return boxQty;
    }

    /**
     * Setter method for boxQty.
     *
     * @param boxQty Set for boxQty
     */
    public void setBoxQty(BigDecimal boxQty) {
        this.boxQty = boxQty;
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
     * Getter method for packedQty.
     *
     * @return the packedQty
     */
    public BigDecimal getPackedQty() {
        return packedQty;
    }

    /**
     * Setter method for packedQty.
     *
     * @param packedQty Set for packedQty
     */
    public void setPackedQty(BigDecimal packedQty) {
        this.packedQty = packedQty;
    }

    /**
     * Getter method for totalNetWeight.
     *
     * @return the totalNetWeight
     */
    public BigDecimal getTotalNetWeight() {
        return totalNetWeight;
    }

    /**
     * Setter method for totalNetWeight.
     *
     * @param totalNetWeight Set for totalNetWeight
     */
    public void setTotalNetWeight(BigDecimal totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }

    /**
     * Getter method for boxLotQty.
     *
     * @return the boxLotQty
     */
    public BigDecimal getBoxLotQty() {
        return boxLotQty;
    }

    /**
     * Setter method for boxLotQty.
     *
     * @param boxLotQty Set for boxLotQty
     */
    public void setBoxLotQty(BigDecimal boxLotQty) {
        this.boxLotQty = boxLotQty;
    }

    /**
     * Getter method for sumQtyBefore2.
     *
     * @return the sumQtyBefore2
     */
    public BigDecimal getSumQtyBefore2() {
        return sumQtyBefore2;
    }

    /**
     * Setter method for sumQtyBefore2.
     *
     * @param sumQtyBefore2 Set for sumQtyBefore2
     */
    public void setSumQtyBefore2(BigDecimal sumQtyBefore2) {
        this.sumQtyBefore2 = sumQtyBefore2;
    }

    /**
     * Getter method for sumQtyBefore1.
     *
     * @return the sumQtyBefore1
     */
    public BigDecimal getSumQtyBefore1() {
        return sumQtyBefore1;
    }

    /**
     * Setter method for sumQtyBefore1.
     *
     * @param sumQtyBefore1 Set for sumQtyBefore1
     */
    public void setSumQtyBefore1(BigDecimal sumQtyBefore1) {
        this.sumQtyBefore1 = sumQtyBefore1;
    }

    /**
     * Getter method for sumQty.
     *
     * @return the sumQty
     */
    public BigDecimal getSumQty() {
        return sumQty;
    }

    /**
     * Setter method for sumQty.
     *
     * @param sumQty Set for sumQty
     */
    public void setSumQty(BigDecimal sumQty) {
        this.sumQty = sumQty;
    }

    /**
     * Getter method for sumQtyAfter1.
     *
     * @return the sumQtyAfter1
     */
    public BigDecimal getSumQtyAfter1() {
        return sumQtyAfter1;
    }

    /**
     * Setter method for sumQtyAfter1.
     *
     * @param sumQtyAfter1 Set for sumQtyAfter1
     */
    public void setSumQtyAfter1(BigDecimal sumQtyAfter1) {
        this.sumQtyAfter1 = sumQtyAfter1;
    }

    /**
     * Getter method for sumQtyAfter2.
     *
     * @return the sumQtyAfter2
     */
    public BigDecimal getSumQtyAfter2() {
        return sumQtyAfter2;
    }

    /**
     * Setter method for sumQtyAfter2.
     *
     * @param sumQtyAfter2 Set for sumQtyAfter2
     */
    public void setSumQtyAfter2(BigDecimal sumQtyAfter2) {
        this.sumQtyAfter2 = sumQtyAfter2;
    }

    /**
     * Getter method for sumQtyAfter3.
     *
     * @return the sumQtyAfter3
     */
    public BigDecimal getSumQtyAfter3() {
        return sumQtyAfter3;
    }

    /**
     * Setter method for sumQtyAfter3.
     *
     * @param sumQtyAfter3 Set for sumQtyAfter3
     */
    public void setSumQtyAfter3(BigDecimal sumQtyAfter3) {
        this.sumQtyAfter3 = sumQtyAfter3;
    }

    /**
     * Getter method for sumQtyAfter4.
     *
     * @return the sumQtyAfter4
     */
    public BigDecimal getSumQtyAfter4() {
        return sumQtyAfter4;
    }

    /**
     * Setter method for sumQtyAfter4.
     *
     * @param sumQtyAfter4 Set for sumQtyAfter4
     */
    public void setSumQtyAfter4(BigDecimal sumQtyAfter4) {
        this.sumQtyAfter4 = sumQtyAfter4;
    }

    /**
     * Getter method for workingDayList.
     *
     * @return the workingDayList
     */
    public List<Date> getWorkingDayList() {
        return workingDayList;
    }

    /**
     * Setter method for workingDayList.
     *
     * @param workingDayList Set for workingDayList
     */
    public void setWorkingDayList(List<Date> workingDayList) {
        this.workingDayList = workingDayList;
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
     * Getter method for disabledFlg.
     *
     * @return the disabledFlg
     */
    public String getDisabledFlg() {
        return disabledFlg;
    }

    /**
     * Setter method for disabledFlg.
     *
     * @param disabledFlg Set for disabledFlg
     */
    public void setDisabledFlg(String disabledFlg) {
        this.disabledFlg = disabledFlg;
    }

    /**
     * Getter method for netWeightA.
     *
     * @return the netWeightA
     */
    public String getNetWeightA() {
        return netWeightA;
    }

    /**
     * Setter method for netWeightA.
     *
     * @param netWeightA Set for netWeightA
     */
    public void setNetWeightA(String netWeightA) {
        this.netWeightA = netWeightA;
    }

    /**
     * Getter method for whStkLocation.
     *
     * @return the whStkLocation
     */
    public String getWhStkLocation() {
        return whStkLocation;
    }

    /**
     * Setter method for whStkLocation.
     *
     * @param whStkLocation Set for whStkLocation
     */
    public void setWhStkLocation(String whStkLocation) {
        this.whStkLocation = whStkLocation;
    }

    /**
     * Getter method for collateMethTyp.
     *
     * @return the collateMethTyp
     */
    public String getCollateMethTyp() {
        return collateMethTyp;
    }

    /**
     * Setter method for collateMethTyp.
     *
     * @param collateMethTyp Set for collateMethTyp
     */
    public void setCollateMethTyp(String collateMethTyp) {
        this.collateMethTyp = collateMethTyp;
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
     * Getter method for pltzInstrOdrList.
     *
     * @return the pltzInstrOdrList
     */
    public List<? extends W2001PltzInstrOdrDomain> getPltzInstrOdrList() {
        return pltzInstrOdrList;
    }

    /**
     * Setter method for pltzInstrOdrList.
     *
     * @param pltzInstrOdrList Set for pltzInstrOdrList
     */
    public void setPltzInstrOdrList(
        List<? extends W2001PltzInstrOdrDomain> pltzInstrOdrList) {
        this.pltzInstrOdrList = pltzInstrOdrList;
    }

    /**
     * <p>tmpQty のゲッターメソッドです。</p>
     *
     * @return the tmpQty
     */
    public BigDecimal getTmpQty() {
        return tmpQty;
    }

    /**
     * <p>tmpQty のセッターメソッドです。</p>
     *
     * @param tmpQty tmpQty に設定する
     */
    public void setTmpQty(BigDecimal tmpQty) {
        this.tmpQty = tmpQty;
    }

    /**
     * <p>onHandQty のゲッターメソッドです。</p>
     *
     * @return the onHandQty
     */
    public BigDecimal getOnHandQty() {
        return onHandQty;
    }

    /**
     * <p>onHandQty のセッターメソッドです。</p>
     *
     * @param onHandQty onHandQty に設定する
     */
    public void setOnHandQty(BigDecimal onHandQty) {
        this.onHandQty = onHandQty;
    }

    /**
     * <p>pkgFormTyp のゲッターメソッドです。</p>
     *
     * @return the pkgFormTyp
     */
    public String getPkgFormTyp() {
        return pkgFormTyp;
    }

    /**
     * <p>pkgFormTyp のセッターメソッドです。</p>
     *
     * @param pkgFormTyp pkgFormTyp に設定する
     */
    public void setPkgFormTyp(String pkgFormTyp) {
        this.pkgFormTyp = pkgFormTyp;
    }

}
