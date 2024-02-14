/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain holding the result of SearchItemNoNxsPltzInstNo.
 * <br />SearchItemNoNxsPltzInstNoの結果を保持するドメインです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class Ws2501ItemNoNxsPltzInstNoDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;


    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * PACKED_QTY
     */
    private String packedQty;

    /**
     * INSTR_QTY
     */
    private String instrQty;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * NET_WEIGHT_A
     */
    private String netWeightA;

    /**
     * MLT_IN_BOX_ARROW_FLG
     */
    private String mltInBoxArrowFlg;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * LOADING_CD
     */
    private String loadingCd;

    /**
     * INVOICE_KEY
     */
    private String invoiceKey;

    /**
     * STG_INSTR_ITEM_FLG
     */
    private String stgInstrItemFlg;

    /**
     * CUSTOM_TIMING_TYP
     */
    private String customTimingTyp;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * ITEM_DESCRIPTION
     */
    private String itemDescription;

    /**
     * EXP_LIMIT_TYP
     */
    private String expLimitTyp;

    /**
     * DNGR_ITEM_FLG
     */
    private String dngrItemFlg;

    /**
     * ORIGIN_CNTRY_CD
     */
    private String originCntryCd;

    /**
     * SUM_QTY
     */
    private String sumQty;

    /**
     * LOT_SIZE
     */
    private String lotSize;

    /**
     * PKG_FORM_TYP
     */
    private String pkgFormTyp;

    /**
     * QTY
     */
    private String qty;


    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501ItemNoNxsPltzInstNoDomain() {
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
     * Getter method for packedQty.
     *
     * @return the packedQty
     */
    public String getPackedQty() {
        return packedQty;
    }


    /**
     * Setter method for packedQty.
     *
     * @param packedQty Set for packedQty
     */
    public void setPackedQty(String packedQty) {
        this.packedQty = packedQty;
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
     * Getter method for mltInBoxArrowFlg.
     *
     * @return the mltInBoxArrowFlg
     */
    public String getMltInBoxArrowFlg() {
        return mltInBoxArrowFlg;
    }


    /**
     * Setter method for mltInBoxArrowFlg.
     *
     * @param mltInBoxArrowFlg Set for mltInBoxArrowFlg
     */
    public void setMltInBoxArrowFlg(String mltInBoxArrowFlg) {
        this.mltInBoxArrowFlg = mltInBoxArrowFlg;
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
     * @param sumQty Set for sumQty
     */
    public void setSumQty(String sumQty) {
        this.sumQty = sumQty;
    }


    /**
     * Getter method for lotSize.
     *
     * @return the lotSize
     */
    public String getLotSize() {
        return lotSize;
    }


    /**
     * Setter method for lotSize.
     *
     * @param lotSize Set for lotSize
     */
    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
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



}
