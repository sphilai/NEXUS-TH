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
public class W1009ListDomain extends AbstractDomain {

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
     * PALLET NO/????NO
     */
    private String palletNo;

    /**
     * EXP_REQUEST_RT_ITEM_ID
     */
    private String expRequestRtItemId;

    /**
     * PACKAGE ITEM NO/???????
     */
    private String pkgItemNo;

    /**
     * DESCRIPTION/??
     */
    private String description;

    /**
     * QUANTITY UNIT/????
     */
    private String qtyUnit;

    /**
     * QUANTITY/??
     */
    private String qty;

    /**
     * LENGTH UNIT/????
     */
    private String lengthUnit;

    /**
     * LENGTH/?
     */
    private String length;

    /**
     * WIDTH/?
     */
    private String width;

    /**
     * HEIGHT/??
     */
    private String height;

    /**
     * WEIGHT UNIT/????
     */
    private String weightUnit;
    /**
     * Net WEIGHT UNIT/????
     */
    private String netWeightUnit; 

    /**
     * NET WEIGHT/?????
     */
    private String netWeight;

    /**
     * ORIGIN COUNTRY CODE/??????
     */
    private String originCntryCd;

    /**
     * CURRENCY CODE/?????
     */
    private String currCd;

    /**
     * UNIT PRICE/??
     */
    private String unitPrice;

    /**
     * MODEL CODE/?????
     */
    private String modelCd;

    /**
     * Select Package Description
     */
    private String selectPkgFlg;

    /**
     * LENGTH_UNIT
     */
    private String selectLengthUnit;
    
    /**
     * ORIGIN_CNTRY_CD
     */
    private String selectOriginCntryCd;
    
    /**
     * CURR_CD
     */
    private String selectCurrCd;
    /**
     * UNIT_NET_WEIGHT
     */
    private String selectUnitNetWeight;
    /**
     * QTY_UNIT
     */
    private String selectQtyUnit;
    /**
     * Outer CODE/?????
     */
    private String outerCode;
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1009ListDomain() {
    }

    /**
     * <p>Getter method for outerCode.</p>
     *
     * @return the outerCode
     */
    public String getOuterCode() {
        return outerCode;
    }

    /**
     * <p>Setter method for outerCode.</p>
     *
     * @param outerCode Set for outerCode
     */
    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    /**
     * <p>Getter method for selectUnitNetWeight.</p>
     *
     * @return the selectUnitNetWeight
     */
    public String getSelectUnitNetWeight() {
        return selectUnitNetWeight;
    }

    /**
     * <p>Setter method for selectUnitNetWeight.</p>
     *
     * @param selectUnitNetWeight Set for selectUnitNetWeight
     */
    public void setSelectUnitNetWeight(String selectUnitNetWeight) {
        this.selectUnitNetWeight = selectUnitNetWeight;
    }

    /**
     * <p>Getter method for selectQtyUnit.</p>
     *
     * @return the selectQtyUnit
     */
    public String getSelectQtyUnit() {
        return selectQtyUnit;
    }

    /**
     * <p>Setter method for selectQtyUnit.</p>
     *
     * @param selectQtyUnit Set for selectQtyUnit
     */
    public void setSelectQtyUnit(String selectQtyUnit) {
        this.selectQtyUnit = selectQtyUnit;
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
     * palletNo のゲッターメソッドです。
     * 
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * palletNo のセッターメソッドです。
     * 
     * @param palletNo palletNo に設定する
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * expRequestRtItemId のゲッターメソッドです。
     * 
     * @return the expRequestRtItemId
     */
    public String getExpRequestRtItemId() {
        return expRequestRtItemId;
    }

    /**
     * expRequestRtItemId のセッターメソッドです。
     * 
     * @param expRequestRtItemId expRequestRtItemId に設定する
     */
    public void setExpRequestRtItemId(String expRequestRtItemId) {
        this.expRequestRtItemId = expRequestRtItemId;
    }

    /**
     * pkgItemNo のゲッターメソッドです。
     * 
     * @return the pkgItemNo
     */
    public String getPkgItemNo() {
        return pkgItemNo;
    }

    /**
     * pkgItemNo のセッターメソッドです。
     * 
     * @param pkgItemNo pkgItemNo に設定する
     */
    public void setPkgItemNo(String pkgItemNo) {
        this.pkgItemNo = pkgItemNo;
    }

    /**
     * description のゲッターメソッドです。
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * description のセッターメソッドです。
     * 
     * @param description description に設定する
     */
    public void setDescription(String description) {
        this.description = description;
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
     * lengthUnit のゲッターメソッドです。
     * 
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * lengthUnit のセッターメソッドです。
     * 
     * @param lengthUnit lengthUnit に設定する
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
        this.selectLengthUnit = lengthUnit;
    }

    /**
     * length のゲッターメソッドです。
     * 
     * @return the length
     */
    public String getLength() {
        return length;
    }

    /**
     * length のセッターメソッドです。
     * 
     * @param length length に設定する
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * width のゲッターメソッドです。
     * 
     * @return the width
     */
    public String getWidth() {
        return width;
    }

    /**
     * width のセッターメソッドです。
     * 
     * @param width width に設定する
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * height のゲッターメソッドです。
     * 
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * height のセッターメソッドです。
     * 
     * @param height height に設定する
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * weightUnit のゲッターメソッドです。
     * 
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * weightUnit のセッターメソッドです。
     * 
     * @param weightUnit weightUnit に設定する
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * netWeight のゲッターメソッドです。
     * 
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }

    /**
     * netWeight のセッターメソッドです。
     * 
     * @param netWeight netWeight に設定する
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
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
        this.selectOriginCntryCd = originCntryCd;
    }

    /**
     * currCd のゲッターメソッドです。
     * 
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * currCd のセッターメソッドです。
     * 
     * @param currCd currCd に設定する
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
        this.selectCurrCd = currCd;
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
     * modelCd のゲッターメソッドです。
     * 
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }

    /**
     * modelCd のセッターメソッドです。
     * 
     * @param modelCd modelCd に設定する
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
    }

    /**
     * selectPkgFlg のゲッターメソッドです。
     * 
     * @return the selectPkgFlg
     */
    public String getSelectPkgFlg() {
        return selectPkgFlg;
    }

    /**
     * selectPkgFlg のセッターメソッドです。
     * 
     * @param selectPkgFlg selectPkgFlg に設定する
     */
    public void setSelectPkgFlg(String selectPkgFlg) {
        this.selectPkgFlg = selectPkgFlg;
    }

    /**
     * selectLengthUnit のゲッターメソッドです。
     * 
     * @return the selectLengthUnit
     */
    public String getSelectLengthUnit() {
        return selectLengthUnit;
    }

    /**
     * selectLengthUnit のセッターメソッドです。
     * 
     * @param selectLengthUnit selectLengthUnit に設定する
     */
    public void setSelectLengthUnit(String selectLengthUnit) {
        this.selectLengthUnit = selectLengthUnit;
    }

    /**
     * selectOriginCntryCd のゲッターメソッドです。
     * 
     * @return the selectOriginCntryCd
     */
    public String getSelectOriginCntryCd() {
        return selectOriginCntryCd;
    }

    /**
     * selectOriginCntryCd のセッターメソッドです。
     * 
     * @param selectOriginCntryCd selectOriginCntryCd に設定する
     */
    public void setSelectOriginCntryCd(String selectOriginCntryCd) {
        this.selectOriginCntryCd = selectOriginCntryCd;
    }

    /**
     * selectCurrCd のゲッターメソッドです。
     * 
     * @return the selectCurrCd
     */
    public String getSelectCurrCd() {
        return selectCurrCd;
    }

    /**
     * selectCurrCd のセッターメソッドです。
     * 
     * @param selectCurrCd selectCurrCd に設定する
     */
    public void setSelectCurrCd(String selectCurrCd) {
        this.selectCurrCd = selectCurrCd;
    }

    /**
     * <p>Getter method for netWeightUnit.</p>
     *
     * @return the netWeightUnit
     */
    public String getNetWeightUnit() {
        return netWeightUnit;
    }

    /**
     * <p>Setter method for netWeightUnit.</p>
     *
     * @param netWeightUnit Set for netWeightUnit
     */
    public void setNetWeightUnit(String netWeightUnit) {
        this.netWeightUnit = netWeightUnit;
    }
    
    

}
