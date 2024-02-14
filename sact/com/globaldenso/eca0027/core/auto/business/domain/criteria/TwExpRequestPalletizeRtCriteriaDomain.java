/*
 * PROJECT：eca0027
 * 
 * TwExpRequestPalletizeRt の検索条件Domainクラス
 * テーブル概要：Export Request Palletize RT/????????  Table to hold the packing information of one pallet of each export request goods/??????1???????????????????
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/06/08  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * TwExpRequestPalletizeRt の検索条件Domainクラスです。<BR>
 * テーブル概要：Export Request Palletize RT/????????  Table to hold the packing information of one pallet of each export request goods/??????1???????????????????<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/06/08 15:34:03<BR>
 * 
 * テーブル定義から2015/06/08に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TwExpRequestPalletizeRtCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
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
    private BigDecimal expRequestRtItemId;

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
    private BigDecimal qty;

    /**
     * LENGTH UNIT/????
     */
    private String lengthUnit;
    /**
     * Company Code/????
     */
    private String compCode;
    /**
     * LENGTH/?
     */
    private BigDecimal length;

    /**
     * WIDTH/?
     */
    private BigDecimal width;

    /**
     * HEIGHT/??
     */
    private BigDecimal height;

    /**
     * WEIGHT UNIT/????
     */
    private String weightUnit;

    /**
     * NET WEIGHT/?????
     */
    private BigDecimal netWeight;

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
    private BigDecimal unitPrice;

    /**
     * MODEL CODE/?????
     */
    private String modelCd;

    /**
     * Select Package Description
     */
    private String selectPkgFlg;

    /**
     * UPDATE FUNCTION ID/????ID
     */
    private String comUpdateFuncId;

    /**
     * UPDATE USER ID/???
     */
    private String comUpdateUserId;

    /**
     * UPDATE TIMESTAMP????
     */
    private Timestamp comUpdateTimestamp;

    /**
     * CREATE FUNCTION ID/????ID
     */
    private String comCreateFuncId;

    /**
     * CREATE USER ID/???
     */
    private String comCreateUserId;

    /**
     * CREATE TIMESTAMP/????
     */
    private Timestamp comCreateTimestamp;

    /**
     * EXPORT REQUEST NO/????NO（大なり）
     */
    private String expRequestNoGreaterThan;

    /**
     * EXPORT REQUEST NO/????NO（大なりイコール）
     */
    private String expRequestNoGreaterThanEqual;

    /**
     * EXPORT REQUEST NO/????NO（小なり）
     */
    private String expRequestNoLessThan;

    /**
     * EXPORT REQUEST NO/????NO（小なりイコール）
     */
    private String expRequestNoLessThanEqual;

    /**
     * EXPORT REQUEST NO/????NO（前方一致）
     */
    private String expRequestNoLikeFront;

    /**
     * PALLET NO/????NO（大なり）
     */
    private String palletNoGreaterThan;

    /**
     * PALLET NO/????NO（大なりイコール）
     */
    private String palletNoGreaterThanEqual;

    /**
     * PALLET NO/????NO（小なり）
     */
    private String palletNoLessThan;

    /**
     * PALLET NO/????NO（小なりイコール）
     */
    private String palletNoLessThanEqual;

    /**
     * PALLET NO/????NO（前方一致）
     */
    private String palletNoLikeFront;

    /**
     * PACKAGE ITEM NO/???????（大なり）
     */
    private String pkgItemNoGreaterThan;

    /**
     * PACKAGE ITEM NO/???????（大なりイコール）
     */
    private String pkgItemNoGreaterThanEqual;

    /**
     * PACKAGE ITEM NO/???????（小なり）
     */
    private String pkgItemNoLessThan;

    /**
     * PACKAGE ITEM NO/???????（小なりイコール）
     */
    private String pkgItemNoLessThanEqual;

    /**
     * PACKAGE ITEM NO/???????（前方一致）
     */
    private String pkgItemNoLikeFront;

    /**
     * DESCRIPTION/??（大なり）
     */
    private String descriptionGreaterThan;

    /**
     * DESCRIPTION/??（大なりイコール）
     */
    private String descriptionGreaterThanEqual;

    /**
     * DESCRIPTION/??（小なり）
     */
    private String descriptionLessThan;

    /**
     * DESCRIPTION/??（小なりイコール）
     */
    private String descriptionLessThanEqual;

    /**
     * DESCRIPTION/??（前方一致）
     */
    private String descriptionLikeFront;

    /**
     * QUANTITY UNIT/????（大なり）
     */
    private String qtyUnitGreaterThan;

    /**
     * QUANTITY UNIT/????（大なりイコール）
     */
    private String qtyUnitGreaterThanEqual;

    /**
     * QUANTITY UNIT/????（小なり）
     */
    private String qtyUnitLessThan;

    /**
     * QUANTITY UNIT/????（小なりイコール）
     */
    private String qtyUnitLessThanEqual;

    /**
     * QUANTITY UNIT/????（前方一致）
     */
    private String qtyUnitLikeFront;

    /**
     * LENGTH UNIT/????（大なり）
     */
    private String lengthUnitGreaterThan;

    /**
     * LENGTH UNIT/????（大なりイコール）
     */
    private String lengthUnitGreaterThanEqual;

    /**
     * LENGTH UNIT/????（小なり）
     */
    private String lengthUnitLessThan;

    /**
     * LENGTH UNIT/????（小なりイコール）
     */
    private String lengthUnitLessThanEqual;

    /**
     * LENGTH UNIT/????（前方一致）
     */
    private String lengthUnitLikeFront;

    /**
     * WEIGHT UNIT/????（大なり）
     */
    private String weightUnitGreaterThan;

    /**
     * WEIGHT UNIT/????（大なりイコール）
     */
    private String weightUnitGreaterThanEqual;

    /**
     * WEIGHT UNIT/????（小なり）
     */
    private String weightUnitLessThan;

    /**
     * WEIGHT UNIT/????（小なりイコール）
     */
    private String weightUnitLessThanEqual;

    /**
     * WEIGHT UNIT/????（前方一致）
     */
    private String weightUnitLikeFront;

    /**
     * ORIGIN COUNTRY CODE/??????（大なり）
     */
    private String originCntryCdGreaterThan;

    /**
     * ORIGIN COUNTRY CODE/??????（大なりイコール）
     */
    private String originCntryCdGreaterThanEqual;

    /**
     * ORIGIN COUNTRY CODE/??????（小なり）
     */
    private String originCntryCdLessThan;

    /**
     * ORIGIN COUNTRY CODE/??????（小なりイコール）
     */
    private String originCntryCdLessThanEqual;

    /**
     * ORIGIN COUNTRY CODE/??????（前方一致）
     */
    private String originCntryCdLikeFront;

    /**
     * CURRENCY CODE/?????（大なり）
     */
    private String currCdGreaterThan;

    /**
     * CURRENCY CODE/?????（大なりイコール）
     */
    private String currCdGreaterThanEqual;

    /**
     * CURRENCY CODE/?????（小なり）
     */
    private String currCdLessThan;

    /**
     * CURRENCY CODE/?????（小なりイコール）
     */
    private String currCdLessThanEqual;

    /**
     * CURRENCY CODE/?????（前方一致）
     */
    private String currCdLikeFront;

    /**
     * MODEL CODE/?????（大なり）
     */
    private String modelCdGreaterThan;

    /**
     * MODEL CODE/?????（大なりイコール）
     */
    private String modelCdGreaterThanEqual;

    /**
     * MODEL CODE/?????（小なり）
     */
    private String modelCdLessThan;

    /**
     * MODEL CODE/?????（小なりイコール）
     */
    private String modelCdLessThanEqual;

    /**
     * MODEL CODE/?????（前方一致）
     */
    private String modelCdLikeFront;

    /**
     * Select Package Description（大なり）
     */
    private String selectPkgFlgGreaterThan;

    /**
     * Select Package Description（大なりイコール）
     */
    private String selectPkgFlgGreaterThanEqual;

    /**
     * Select Package Description（小なり）
     */
    private String selectPkgFlgLessThan;

    /**
     * Select Package Description（小なりイコール）
     */
    private String selectPkgFlgLessThanEqual;

    /**
     * Select Package Description（前方一致）
     */
    private String selectPkgFlgLikeFront;

    /**
     * UPDATE FUNCTION ID/????ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * UPDATE FUNCTION ID/????ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * UPDATE FUNCTION ID/????ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * UPDATE FUNCTION ID/????ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * UPDATE FUNCTION ID/????ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * UPDATE USER ID/???（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * UPDATE USER ID/???（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * UPDATE USER ID/???（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * UPDATE USER ID/???（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * UPDATE USER ID/???（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * CREATE FUNCTION ID/????ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * CREATE FUNCTION ID/????ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * CREATE FUNCTION ID/????ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * CREATE FUNCTION ID/????ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * CREATE FUNCTION ID/????ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * CREATE USER ID/???（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * CREATE USER ID/???（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * CREATE USER ID/???（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * CREATE USER ID/???（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * CREATE USER ID/???（前方一致）
     */
    private String comCreateUserIdLikeFront;
    /**
     * Owner Company
     */
    private String ownerComp;
    /**
     * Outer Code
     */
    private String outerCd;
    /**
     * デフォルトコンストラクタ。
     */
    public TwExpRequestPalletizeRtCriteriaDomain() {
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
    public BigDecimal getExpRequestRtItemId() {
        return expRequestRtItemId;
    }

    /**
     * expRequestRtItemId のセッターメソッドです。
     * 
     * @param expRequestRtItemId expRequestRtItemId に設定する
     */
    public void setExpRequestRtItemId(BigDecimal expRequestRtItemId) {
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
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * qty のセッターメソッドです。
     * 
     * @param qty qty に設定する
     */
    public void setQty(BigDecimal qty) {
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
    }

    /**
     * length のゲッターメソッドです。
     * 
     * @return the length
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * length のセッターメソッドです。
     * 
     * @param length length に設定する
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * width のゲッターメソッドです。
     * 
     * @return the width
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * width のセッターメソッドです。
     * 
     * @param width width に設定する
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * height のゲッターメソッドです。
     * 
     * @return the height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * height のセッターメソッドです。
     * 
     * @param height height に設定する
     */
    public void setHeight(BigDecimal height) {
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
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * netWeight のセッターメソッドです。
     * 
     * @param netWeight netWeight に設定する
     */
    public void setNetWeight(BigDecimal netWeight) {
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
    }

    /**
     * unitPrice のゲッターメソッドです。
     * 
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * unitPrice のセッターメソッドです。
     * 
     * @param unitPrice unitPrice に設定する
     */
    public void setUnitPrice(BigDecimal unitPrice) {
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
     * comUpdateFuncId のゲッターメソッドです。
     * 
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * comUpdateFuncId のセッターメソッドです。
     * 
     * @param comUpdateFuncId comUpdateFuncId に設定する
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }

    /**
     * comUpdateUserId のゲッターメソッドです。
     * 
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * comUpdateUserId のセッターメソッドです。
     * 
     * @param comUpdateUserId comUpdateUserId に設定する
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * comUpdateTimestamp のゲッターメソッドです。
     * 
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * comUpdateTimestamp のセッターメソッドです。
     * 
     * @param comUpdateTimestamp comUpdateTimestamp に設定する
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * comCreateFuncId のゲッターメソッドです。
     * 
     * @return the comCreateFuncId
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * comCreateFuncId のセッターメソッドです。
     * 
     * @param comCreateFuncId comCreateFuncId に設定する
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * comCreateUserId のゲッターメソッドです。
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * comCreateUserId のセッターメソッドです。
     * 
     * @param comCreateUserId comCreateUserId に設定する
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * comCreateTimestamp のゲッターメソッドです。
     * 
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * comCreateTimestamp のセッターメソッドです。
     * 
     * @param comCreateTimestamp comCreateTimestamp に設定する
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

    /**
     * expRequestNoGreaterThan のゲッターメソッドです。
     * 
     * @return the expRequestNoGreaterThan
     */
    public String getExpRequestNoGreaterThan() {
        return expRequestNoGreaterThan;
    }

    /**
     * expRequestNoGreaterThan のセッターメソッドです。
     * 
     * @param expRequestNoGreaterThan expRequestNoGreaterThan に設定する
     */
    public void setExpRequestNoGreaterThan(String expRequestNoGreaterThan) {
        this.expRequestNoGreaterThan = expRequestNoGreaterThan;
    }

    /**
     * expRequestNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expRequestNoGreaterThanEqual
     */
    public String getExpRequestNoGreaterThanEqual() {
        return expRequestNoGreaterThanEqual;
    }

    /**
     * expRequestNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param expRequestNoGreaterThanEqual expRequestNoGreaterThanEqual に設定する
     */
    public void setExpRequestNoGreaterThanEqual(String expRequestNoGreaterThanEqual) {
        this.expRequestNoGreaterThanEqual = expRequestNoGreaterThanEqual;
    }

    /**
     * expRequestNoLessThan のゲッターメソッドです。
     * 
     * @return the expRequestNoLessThan
     */
    public String getExpRequestNoLessThan() {
        return expRequestNoLessThan;
    }

    /**
     * expRequestNoLessThan のセッターメソッドです。
     * 
     * @param expRequestNoLessThan expRequestNoLessThan に設定する
     */
    public void setExpRequestNoLessThan(String expRequestNoLessThan) {
        this.expRequestNoLessThan = expRequestNoLessThan;
    }

    /**
     * expRequestNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the expRequestNoLessThanEqual
     */
    public String getExpRequestNoLessThanEqual() {
        return expRequestNoLessThanEqual;
    }

    /**
     * expRequestNoLessThanEqual のセッターメソッドです。
     * 
     * @param expRequestNoLessThanEqual expRequestNoLessThanEqual に設定する
     */
    public void setExpRequestNoLessThanEqual(String expRequestNoLessThanEqual) {
        this.expRequestNoLessThanEqual = expRequestNoLessThanEqual;
    }

    /**
     * expRequestNoLikeFront のゲッターメソッドです。
     * 
     * @return the expRequestNoLikeFront
     */
    public String getExpRequestNoLikeFront() {
        return expRequestNoLikeFront;
    }

    /**
     * expRequestNoLikeFront のセッターメソッドです。
     * 
     * @param expRequestNoLikeFront expRequestNoLikeFront に設定する
     */
    public void setExpRequestNoLikeFront(String expRequestNoLikeFront) {
        this.expRequestNoLikeFront = expRequestNoLikeFront;
    }

    /**
     * palletNoGreaterThan のゲッターメソッドです。
     * 
     * @return the palletNoGreaterThan
     */
    public String getPalletNoGreaterThan() {
        return palletNoGreaterThan;
    }

    /**
     * palletNoGreaterThan のセッターメソッドです。
     * 
     * @param palletNoGreaterThan palletNoGreaterThan に設定する
     */
    public void setPalletNoGreaterThan(String palletNoGreaterThan) {
        this.palletNoGreaterThan = palletNoGreaterThan;
    }

    /**
     * palletNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the palletNoGreaterThanEqual
     */
    public String getPalletNoGreaterThanEqual() {
        return palletNoGreaterThanEqual;
    }

    /**
     * palletNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param palletNoGreaterThanEqual palletNoGreaterThanEqual に設定する
     */
    public void setPalletNoGreaterThanEqual(String palletNoGreaterThanEqual) {
        this.palletNoGreaterThanEqual = palletNoGreaterThanEqual;
    }

    /**
     * <p>Getter method for compCode.</p>
     *
     * @return the compCode
     */
    public String getCompCode() {
        return compCode;
    }

    /**
     * <p>Setter method for compCode.</p>
     *
     * @param compCode Set for compCode
     */
    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    /**
     * palletNoLessThan のゲッターメソッドです。
     * 
     * @return the palletNoLessThan
     */
    public String getPalletNoLessThan() {
        return palletNoLessThan;
    }

    /**
     * palletNoLessThan のセッターメソッドです。
     * 
     * @param palletNoLessThan palletNoLessThan に設定する
     */
    public void setPalletNoLessThan(String palletNoLessThan) {
        this.palletNoLessThan = palletNoLessThan;
    }

    /**
     * palletNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the palletNoLessThanEqual
     */
    public String getPalletNoLessThanEqual() {
        return palletNoLessThanEqual;
    }

    /**
     * palletNoLessThanEqual のセッターメソッドです。
     * 
     * @param palletNoLessThanEqual palletNoLessThanEqual に設定する
     */
    public void setPalletNoLessThanEqual(String palletNoLessThanEqual) {
        this.palletNoLessThanEqual = palletNoLessThanEqual;
    }

    /**
     * palletNoLikeFront のゲッターメソッドです。
     * 
     * @return the palletNoLikeFront
     */
    public String getPalletNoLikeFront() {
        return palletNoLikeFront;
    }

    /**
     * palletNoLikeFront のセッターメソッドです。
     * 
     * @param palletNoLikeFront palletNoLikeFront に設定する
     */
    public void setPalletNoLikeFront(String palletNoLikeFront) {
        this.palletNoLikeFront = palletNoLikeFront;
    }

    /**
     * pkgItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgItemNoGreaterThan
     */
    public String getPkgItemNoGreaterThan() {
        return pkgItemNoGreaterThan;
    }

    /**
     * pkgItemNoGreaterThan のセッターメソッドです。
     * 
     * @param pkgItemNoGreaterThan pkgItemNoGreaterThan に設定する
     */
    public void setPkgItemNoGreaterThan(String pkgItemNoGreaterThan) {
        this.pkgItemNoGreaterThan = pkgItemNoGreaterThan;
    }

    /**
     * pkgItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgItemNoGreaterThanEqual
     */
    public String getPkgItemNoGreaterThanEqual() {
        return pkgItemNoGreaterThanEqual;
    }

    /**
     * pkgItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgItemNoGreaterThanEqual pkgItemNoGreaterThanEqual に設定する
     */
    public void setPkgItemNoGreaterThanEqual(String pkgItemNoGreaterThanEqual) {
        this.pkgItemNoGreaterThanEqual = pkgItemNoGreaterThanEqual;
    }

    /**
     * pkgItemNoLessThan のゲッターメソッドです。
     * 
     * @return the pkgItemNoLessThan
     */
    public String getPkgItemNoLessThan() {
        return pkgItemNoLessThan;
    }

    /**
     * pkgItemNoLessThan のセッターメソッドです。
     * 
     * @param pkgItemNoLessThan pkgItemNoLessThan に設定する
     */
    public void setPkgItemNoLessThan(String pkgItemNoLessThan) {
        this.pkgItemNoLessThan = pkgItemNoLessThan;
    }

    /**
     * pkgItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgItemNoLessThanEqual
     */
    public String getPkgItemNoLessThanEqual() {
        return pkgItemNoLessThanEqual;
    }

    /**
     * pkgItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param pkgItemNoLessThanEqual pkgItemNoLessThanEqual に設定する
     */
    public void setPkgItemNoLessThanEqual(String pkgItemNoLessThanEqual) {
        this.pkgItemNoLessThanEqual = pkgItemNoLessThanEqual;
    }

    /**
     * pkgItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the pkgItemNoLikeFront
     */
    public String getPkgItemNoLikeFront() {
        return pkgItemNoLikeFront;
    }

    /**
     * pkgItemNoLikeFront のセッターメソッドです。
     * 
     * @param pkgItemNoLikeFront pkgItemNoLikeFront に設定する
     */
    public void setPkgItemNoLikeFront(String pkgItemNoLikeFront) {
        this.pkgItemNoLikeFront = pkgItemNoLikeFront;
    }

    /**
     * descriptionGreaterThan のゲッターメソッドです。
     * 
     * @return the descriptionGreaterThan
     */
    public String getDescriptionGreaterThan() {
        return descriptionGreaterThan;
    }

    /**
     * descriptionGreaterThan のセッターメソッドです。
     * 
     * @param descriptionGreaterThan descriptionGreaterThan に設定する
     */
    public void setDescriptionGreaterThan(String descriptionGreaterThan) {
        this.descriptionGreaterThan = descriptionGreaterThan;
    }

    /**
     * descriptionGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the descriptionGreaterThanEqual
     */
    public String getDescriptionGreaterThanEqual() {
        return descriptionGreaterThanEqual;
    }

    /**
     * descriptionGreaterThanEqual のセッターメソッドです。
     * 
     * @param descriptionGreaterThanEqual descriptionGreaterThanEqual に設定する
     */
    public void setDescriptionGreaterThanEqual(String descriptionGreaterThanEqual) {
        this.descriptionGreaterThanEqual = descriptionGreaterThanEqual;
    }

    /**
     * descriptionLessThan のゲッターメソッドです。
     * 
     * @return the descriptionLessThan
     */
    public String getDescriptionLessThan() {
        return descriptionLessThan;
    }

    /**
     * descriptionLessThan のセッターメソッドです。
     * 
     * @param descriptionLessThan descriptionLessThan に設定する
     */
    public void setDescriptionLessThan(String descriptionLessThan) {
        this.descriptionLessThan = descriptionLessThan;
    }

    /**
     * descriptionLessThanEqual のゲッターメソッドです。
     * 
     * @return the descriptionLessThanEqual
     */
    public String getDescriptionLessThanEqual() {
        return descriptionLessThanEqual;
    }

    /**
     * descriptionLessThanEqual のセッターメソッドです。
     * 
     * @param descriptionLessThanEqual descriptionLessThanEqual に設定する
     */
    public void setDescriptionLessThanEqual(String descriptionLessThanEqual) {
        this.descriptionLessThanEqual = descriptionLessThanEqual;
    }

    /**
     * descriptionLikeFront のゲッターメソッドです。
     * 
     * @return the descriptionLikeFront
     */
    public String getDescriptionLikeFront() {
        return descriptionLikeFront;
    }

    /**
     * descriptionLikeFront のセッターメソッドです。
     * 
     * @param descriptionLikeFront descriptionLikeFront に設定する
     */
    public void setDescriptionLikeFront(String descriptionLikeFront) {
        this.descriptionLikeFront = descriptionLikeFront;
    }

    /**
     * qtyUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the qtyUnitGreaterThan
     */
    public String getQtyUnitGreaterThan() {
        return qtyUnitGreaterThan;
    }

    /**
     * qtyUnitGreaterThan のセッターメソッドです。
     * 
     * @param qtyUnitGreaterThan qtyUnitGreaterThan に設定する
     */
    public void setQtyUnitGreaterThan(String qtyUnitGreaterThan) {
        this.qtyUnitGreaterThan = qtyUnitGreaterThan;
    }

    /**
     * qtyUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the qtyUnitGreaterThanEqual
     */
    public String getQtyUnitGreaterThanEqual() {
        return qtyUnitGreaterThanEqual;
    }

    /**
     * qtyUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param qtyUnitGreaterThanEqual qtyUnitGreaterThanEqual に設定する
     */
    public void setQtyUnitGreaterThanEqual(String qtyUnitGreaterThanEqual) {
        this.qtyUnitGreaterThanEqual = qtyUnitGreaterThanEqual;
    }

    /**
     * qtyUnitLessThan のゲッターメソッドです。
     * 
     * @return the qtyUnitLessThan
     */
    public String getQtyUnitLessThan() {
        return qtyUnitLessThan;
    }

    /**
     * qtyUnitLessThan のセッターメソッドです。
     * 
     * @param qtyUnitLessThan qtyUnitLessThan に設定する
     */
    public void setQtyUnitLessThan(String qtyUnitLessThan) {
        this.qtyUnitLessThan = qtyUnitLessThan;
    }

    /**
     * qtyUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the qtyUnitLessThanEqual
     */
    public String getQtyUnitLessThanEqual() {
        return qtyUnitLessThanEqual;
    }

    /**
     * qtyUnitLessThanEqual のセッターメソッドです。
     * 
     * @param qtyUnitLessThanEqual qtyUnitLessThanEqual に設定する
     */
    public void setQtyUnitLessThanEqual(String qtyUnitLessThanEqual) {
        this.qtyUnitLessThanEqual = qtyUnitLessThanEqual;
    }

    /**
     * qtyUnitLikeFront のゲッターメソッドです。
     * 
     * @return the qtyUnitLikeFront
     */
    public String getQtyUnitLikeFront() {
        return qtyUnitLikeFront;
    }

    /**
     * qtyUnitLikeFront のセッターメソッドです。
     * 
     * @param qtyUnitLikeFront qtyUnitLikeFront に設定する
     */
    public void setQtyUnitLikeFront(String qtyUnitLikeFront) {
        this.qtyUnitLikeFront = qtyUnitLikeFront;
    }

    /**
     * lengthUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the lengthUnitGreaterThan
     */
    public String getLengthUnitGreaterThan() {
        return lengthUnitGreaterThan;
    }

    /**
     * lengthUnitGreaterThan のセッターメソッドです。
     * 
     * @param lengthUnitGreaterThan lengthUnitGreaterThan に設定する
     */
    public void setLengthUnitGreaterThan(String lengthUnitGreaterThan) {
        this.lengthUnitGreaterThan = lengthUnitGreaterThan;
    }

    /**
     * lengthUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitGreaterThanEqual
     */
    public String getLengthUnitGreaterThanEqual() {
        return lengthUnitGreaterThanEqual;
    }

    /**
     * lengthUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitGreaterThanEqual lengthUnitGreaterThanEqual に設定する
     */
    public void setLengthUnitGreaterThanEqual(String lengthUnitGreaterThanEqual) {
        this.lengthUnitGreaterThanEqual = lengthUnitGreaterThanEqual;
    }

    /**
     * lengthUnitLessThan のゲッターメソッドです。
     * 
     * @return the lengthUnitLessThan
     */
    public String getLengthUnitLessThan() {
        return lengthUnitLessThan;
    }

    /**
     * lengthUnitLessThan のセッターメソッドです。
     * 
     * @param lengthUnitLessThan lengthUnitLessThan に設定する
     */
    public void setLengthUnitLessThan(String lengthUnitLessThan) {
        this.lengthUnitLessThan = lengthUnitLessThan;
    }

    /**
     * lengthUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitLessThanEqual
     */
    public String getLengthUnitLessThanEqual() {
        return lengthUnitLessThanEqual;
    }

    /**
     * lengthUnitLessThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitLessThanEqual lengthUnitLessThanEqual に設定する
     */
    public void setLengthUnitLessThanEqual(String lengthUnitLessThanEqual) {
        this.lengthUnitLessThanEqual = lengthUnitLessThanEqual;
    }

    /**
     * lengthUnitLikeFront のゲッターメソッドです。
     * 
     * @return the lengthUnitLikeFront
     */
    public String getLengthUnitLikeFront() {
        return lengthUnitLikeFront;
    }

    /**
     * lengthUnitLikeFront のセッターメソッドです。
     * 
     * @param lengthUnitLikeFront lengthUnitLikeFront に設定する
     */
    public void setLengthUnitLikeFront(String lengthUnitLikeFront) {
        this.lengthUnitLikeFront = lengthUnitLikeFront;
    }

    /**
     * weightUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the weightUnitGreaterThan
     */
    public String getWeightUnitGreaterThan() {
        return weightUnitGreaterThan;
    }

    /**
     * weightUnitGreaterThan のセッターメソッドです。
     * 
     * @param weightUnitGreaterThan weightUnitGreaterThan に設定する
     */
    public void setWeightUnitGreaterThan(String weightUnitGreaterThan) {
        this.weightUnitGreaterThan = weightUnitGreaterThan;
    }

    /**
     * weightUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitGreaterThanEqual
     */
    public String getWeightUnitGreaterThanEqual() {
        return weightUnitGreaterThanEqual;
    }

    /**
     * weightUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param weightUnitGreaterThanEqual weightUnitGreaterThanEqual に設定する
     */
    public void setWeightUnitGreaterThanEqual(String weightUnitGreaterThanEqual) {
        this.weightUnitGreaterThanEqual = weightUnitGreaterThanEqual;
    }

    /**
     * weightUnitLessThan のゲッターメソッドです。
     * 
     * @return the weightUnitLessThan
     */
    public String getWeightUnitLessThan() {
        return weightUnitLessThan;
    }

    /**
     * weightUnitLessThan のセッターメソッドです。
     * 
     * @param weightUnitLessThan weightUnitLessThan に設定する
     */
    public void setWeightUnitLessThan(String weightUnitLessThan) {
        this.weightUnitLessThan = weightUnitLessThan;
    }

    /**
     * weightUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitLessThanEqual
     */
    public String getWeightUnitLessThanEqual() {
        return weightUnitLessThanEqual;
    }

    /**
     * weightUnitLessThanEqual のセッターメソッドです。
     * 
     * @param weightUnitLessThanEqual weightUnitLessThanEqual に設定する
     */
    public void setWeightUnitLessThanEqual(String weightUnitLessThanEqual) {
        this.weightUnitLessThanEqual = weightUnitLessThanEqual;
    }

    /**
     * weightUnitLikeFront のゲッターメソッドです。
     * 
     * @return the weightUnitLikeFront
     */
    public String getWeightUnitLikeFront() {
        return weightUnitLikeFront;
    }

    /**
     * weightUnitLikeFront のセッターメソッドです。
     * 
     * @param weightUnitLikeFront weightUnitLikeFront に設定する
     */
    public void setWeightUnitLikeFront(String weightUnitLikeFront) {
        this.weightUnitLikeFront = weightUnitLikeFront;
    }

    /**
     * originCntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the originCntryCdGreaterThan
     */
    public String getOriginCntryCdGreaterThan() {
        return originCntryCdGreaterThan;
    }

    /**
     * originCntryCdGreaterThan のセッターメソッドです。
     * 
     * @param originCntryCdGreaterThan originCntryCdGreaterThan に設定する
     */
    public void setOriginCntryCdGreaterThan(String originCntryCdGreaterThan) {
        this.originCntryCdGreaterThan = originCntryCdGreaterThan;
    }

    /**
     * originCntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryCdGreaterThanEqual
     */
    public String getOriginCntryCdGreaterThanEqual() {
        return originCntryCdGreaterThanEqual;
    }

    /**
     * originCntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param originCntryCdGreaterThanEqual originCntryCdGreaterThanEqual に設定する
     */
    public void setOriginCntryCdGreaterThanEqual(String originCntryCdGreaterThanEqual) {
        this.originCntryCdGreaterThanEqual = originCntryCdGreaterThanEqual;
    }

    /**
     * originCntryCdLessThan のゲッターメソッドです。
     * 
     * @return the originCntryCdLessThan
     */
    public String getOriginCntryCdLessThan() {
        return originCntryCdLessThan;
    }

    /**
     * originCntryCdLessThan のセッターメソッドです。
     * 
     * @param originCntryCdLessThan originCntryCdLessThan に設定する
     */
    public void setOriginCntryCdLessThan(String originCntryCdLessThan) {
        this.originCntryCdLessThan = originCntryCdLessThan;
    }

    /**
     * originCntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryCdLessThanEqual
     */
    public String getOriginCntryCdLessThanEqual() {
        return originCntryCdLessThanEqual;
    }

    /**
     * originCntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param originCntryCdLessThanEqual originCntryCdLessThanEqual に設定する
     */
    public void setOriginCntryCdLessThanEqual(String originCntryCdLessThanEqual) {
        this.originCntryCdLessThanEqual = originCntryCdLessThanEqual;
    }

    /**
     * originCntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the originCntryCdLikeFront
     */
    public String getOriginCntryCdLikeFront() {
        return originCntryCdLikeFront;
    }

    /**
     * originCntryCdLikeFront のセッターメソッドです。
     * 
     * @param originCntryCdLikeFront originCntryCdLikeFront に設定する
     */
    public void setOriginCntryCdLikeFront(String originCntryCdLikeFront) {
        this.originCntryCdLikeFront = originCntryCdLikeFront;
    }

    /**
     * currCdGreaterThan のゲッターメソッドです。
     * 
     * @return the currCdGreaterThan
     */
    public String getCurrCdGreaterThan() {
        return currCdGreaterThan;
    }

    /**
     * currCdGreaterThan のセッターメソッドです。
     * 
     * @param currCdGreaterThan currCdGreaterThan に設定する
     */
    public void setCurrCdGreaterThan(String currCdGreaterThan) {
        this.currCdGreaterThan = currCdGreaterThan;
    }

    /**
     * currCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the currCdGreaterThanEqual
     */
    public String getCurrCdGreaterThanEqual() {
        return currCdGreaterThanEqual;
    }

    /**
     * currCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param currCdGreaterThanEqual currCdGreaterThanEqual に設定する
     */
    public void setCurrCdGreaterThanEqual(String currCdGreaterThanEqual) {
        this.currCdGreaterThanEqual = currCdGreaterThanEqual;
    }

    /**
     * currCdLessThan のゲッターメソッドです。
     * 
     * @return the currCdLessThan
     */
    public String getCurrCdLessThan() {
        return currCdLessThan;
    }

    /**
     * currCdLessThan のセッターメソッドです。
     * 
     * @param currCdLessThan currCdLessThan に設定する
     */
    public void setCurrCdLessThan(String currCdLessThan) {
        this.currCdLessThan = currCdLessThan;
    }

    /**
     * currCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the currCdLessThanEqual
     */
    public String getCurrCdLessThanEqual() {
        return currCdLessThanEqual;
    }

    /**
     * currCdLessThanEqual のセッターメソッドです。
     * 
     * @param currCdLessThanEqual currCdLessThanEqual に設定する
     */
    public void setCurrCdLessThanEqual(String currCdLessThanEqual) {
        this.currCdLessThanEqual = currCdLessThanEqual;
    }

    /**
     * currCdLikeFront のゲッターメソッドです。
     * 
     * @return the currCdLikeFront
     */
    public String getCurrCdLikeFront() {
        return currCdLikeFront;
    }

    /**
     * currCdLikeFront のセッターメソッドです。
     * 
     * @param currCdLikeFront currCdLikeFront に設定する
     */
    public void setCurrCdLikeFront(String currCdLikeFront) {
        this.currCdLikeFront = currCdLikeFront;
    }

    /**
     * modelCdGreaterThan のゲッターメソッドです。
     * 
     * @return the modelCdGreaterThan
     */
    public String getModelCdGreaterThan() {
        return modelCdGreaterThan;
    }

    /**
     * modelCdGreaterThan のセッターメソッドです。
     * 
     * @param modelCdGreaterThan modelCdGreaterThan に設定する
     */
    public void setModelCdGreaterThan(String modelCdGreaterThan) {
        this.modelCdGreaterThan = modelCdGreaterThan;
    }

    /**
     * modelCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the modelCdGreaterThanEqual
     */
    public String getModelCdGreaterThanEqual() {
        return modelCdGreaterThanEqual;
    }

    /**
     * modelCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param modelCdGreaterThanEqual modelCdGreaterThanEqual に設定する
     */
    public void setModelCdGreaterThanEqual(String modelCdGreaterThanEqual) {
        this.modelCdGreaterThanEqual = modelCdGreaterThanEqual;
    }

    /**
     * modelCdLessThan のゲッターメソッドです。
     * 
     * @return the modelCdLessThan
     */
    public String getModelCdLessThan() {
        return modelCdLessThan;
    }

    /**
     * modelCdLessThan のセッターメソッドです。
     * 
     * @param modelCdLessThan modelCdLessThan に設定する
     */
    public void setModelCdLessThan(String modelCdLessThan) {
        this.modelCdLessThan = modelCdLessThan;
    }

    /**
     * modelCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the modelCdLessThanEqual
     */
    public String getModelCdLessThanEqual() {
        return modelCdLessThanEqual;
    }

    /**
     * modelCdLessThanEqual のセッターメソッドです。
     * 
     * @param modelCdLessThanEqual modelCdLessThanEqual に設定する
     */
    public void setModelCdLessThanEqual(String modelCdLessThanEqual) {
        this.modelCdLessThanEqual = modelCdLessThanEqual;
    }

    /**
     * modelCdLikeFront のゲッターメソッドです。
     * 
     * @return the modelCdLikeFront
     */
    public String getModelCdLikeFront() {
        return modelCdLikeFront;
    }

    /**
     * modelCdLikeFront のセッターメソッドです。
     * 
     * @param modelCdLikeFront modelCdLikeFront に設定する
     */
    public void setModelCdLikeFront(String modelCdLikeFront) {
        this.modelCdLikeFront = modelCdLikeFront;
    }

    /**
     * selectPkgFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the selectPkgFlgGreaterThan
     */
    public String getSelectPkgFlgGreaterThan() {
        return selectPkgFlgGreaterThan;
    }

    /**
     * selectPkgFlgGreaterThan のセッターメソッドです。
     * 
     * @param selectPkgFlgGreaterThan selectPkgFlgGreaterThan に設定する
     */
    public void setSelectPkgFlgGreaterThan(String selectPkgFlgGreaterThan) {
        this.selectPkgFlgGreaterThan = selectPkgFlgGreaterThan;
    }

    /**
     * selectPkgFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the selectPkgFlgGreaterThanEqual
     */
    public String getSelectPkgFlgGreaterThanEqual() {
        return selectPkgFlgGreaterThanEqual;
    }

    /**
     * selectPkgFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param selectPkgFlgGreaterThanEqual selectPkgFlgGreaterThanEqual に設定する
     */
    public void setSelectPkgFlgGreaterThanEqual(String selectPkgFlgGreaterThanEqual) {
        this.selectPkgFlgGreaterThanEqual = selectPkgFlgGreaterThanEqual;
    }

    /**
     * selectPkgFlgLessThan のゲッターメソッドです。
     * 
     * @return the selectPkgFlgLessThan
     */
    public String getSelectPkgFlgLessThan() {
        return selectPkgFlgLessThan;
    }

    /**
     * selectPkgFlgLessThan のセッターメソッドです。
     * 
     * @param selectPkgFlgLessThan selectPkgFlgLessThan に設定する
     */
    public void setSelectPkgFlgLessThan(String selectPkgFlgLessThan) {
        this.selectPkgFlgLessThan = selectPkgFlgLessThan;
    }

    /**
     * selectPkgFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the selectPkgFlgLessThanEqual
     */
    public String getSelectPkgFlgLessThanEqual() {
        return selectPkgFlgLessThanEqual;
    }

    /**
     * selectPkgFlgLessThanEqual のセッターメソッドです。
     * 
     * @param selectPkgFlgLessThanEqual selectPkgFlgLessThanEqual に設定する
     */
    public void setSelectPkgFlgLessThanEqual(String selectPkgFlgLessThanEqual) {
        this.selectPkgFlgLessThanEqual = selectPkgFlgLessThanEqual;
    }

    /**
     * selectPkgFlgLikeFront のゲッターメソッドです。
     * 
     * @return the selectPkgFlgLikeFront
     */
    public String getSelectPkgFlgLikeFront() {
        return selectPkgFlgLikeFront;
    }

    /**
     * selectPkgFlgLikeFront のセッターメソッドです。
     * 
     * @param selectPkgFlgLikeFront selectPkgFlgLikeFront に設定する
     */
    public void setSelectPkgFlgLikeFront(String selectPkgFlgLikeFront) {
        this.selectPkgFlgLikeFront = selectPkgFlgLikeFront;
    }

    /**
     * comUpdateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThan
     */
    public String getComUpdateFuncIdGreaterThan() {
        return comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThan comUpdateFuncIdGreaterThan に設定する
     */
    public void setComUpdateFuncIdGreaterThan(String comUpdateFuncIdGreaterThan) {
        this.comUpdateFuncIdGreaterThan = comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThanEqual
     */
    public String getComUpdateFuncIdGreaterThanEqual() {
        return comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThanEqual comUpdateFuncIdGreaterThanEqual に設定する
     */
    public void setComUpdateFuncIdGreaterThanEqual(String comUpdateFuncIdGreaterThanEqual) {
        this.comUpdateFuncIdGreaterThanEqual = comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThan
     */
    public String getComUpdateFuncIdLessThan() {
        return comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThan comUpdateFuncIdLessThan に設定する
     */
    public void setComUpdateFuncIdLessThan(String comUpdateFuncIdLessThan) {
        this.comUpdateFuncIdLessThan = comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThanEqual
     */
    public String getComUpdateFuncIdLessThanEqual() {
        return comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThanEqual comUpdateFuncIdLessThanEqual に設定する
     */
    public void setComUpdateFuncIdLessThanEqual(String comUpdateFuncIdLessThanEqual) {
        this.comUpdateFuncIdLessThanEqual = comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLikeFront
     */
    public String getComUpdateFuncIdLikeFront() {
        return comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLikeFront comUpdateFuncIdLikeFront に設定する
     */
    public void setComUpdateFuncIdLikeFront(String comUpdateFuncIdLikeFront) {
        this.comUpdateFuncIdLikeFront = comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThan
     */
    public String getComUpdateUserIdGreaterThan() {
        return comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThan comUpdateUserIdGreaterThan に設定する
     */
    public void setComUpdateUserIdGreaterThan(String comUpdateUserIdGreaterThan) {
        this.comUpdateUserIdGreaterThan = comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThanEqual
     */
    public String getComUpdateUserIdGreaterThanEqual() {
        return comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThanEqual comUpdateUserIdGreaterThanEqual に設定する
     */
    public void setComUpdateUserIdGreaterThanEqual(String comUpdateUserIdGreaterThanEqual) {
        this.comUpdateUserIdGreaterThanEqual = comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThan
     */
    public String getComUpdateUserIdLessThan() {
        return comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThan comUpdateUserIdLessThan に設定する
     */
    public void setComUpdateUserIdLessThan(String comUpdateUserIdLessThan) {
        this.comUpdateUserIdLessThan = comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThanEqual
     */
    public String getComUpdateUserIdLessThanEqual() {
        return comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThanEqual comUpdateUserIdLessThanEqual に設定する
     */
    public void setComUpdateUserIdLessThanEqual(String comUpdateUserIdLessThanEqual) {
        this.comUpdateUserIdLessThanEqual = comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLikeFront
     */
    public String getComUpdateUserIdLikeFront() {
        return comUpdateUserIdLikeFront;
    }

    /**
     * comUpdateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateUserIdLikeFront comUpdateUserIdLikeFront に設定する
     */
    public void setComUpdateUserIdLikeFront(String comUpdateUserIdLikeFront) {
        this.comUpdateUserIdLikeFront = comUpdateUserIdLikeFront;
    }

    /**
     * comCreateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThan
     */
    public String getComCreateFuncIdGreaterThan() {
        return comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThan comCreateFuncIdGreaterThan に設定する
     */
    public void setComCreateFuncIdGreaterThan(String comCreateFuncIdGreaterThan) {
        this.comCreateFuncIdGreaterThan = comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThanEqual
     */
    public String getComCreateFuncIdGreaterThanEqual() {
        return comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThanEqual comCreateFuncIdGreaterThanEqual に設定する
     */
    public void setComCreateFuncIdGreaterThanEqual(String comCreateFuncIdGreaterThanEqual) {
        this.comCreateFuncIdGreaterThanEqual = comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThan
     */
    public String getComCreateFuncIdLessThan() {
        return comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThan comCreateFuncIdLessThan に設定する
     */
    public void setComCreateFuncIdLessThan(String comCreateFuncIdLessThan) {
        this.comCreateFuncIdLessThan = comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThanEqual
     */
    public String getComCreateFuncIdLessThanEqual() {
        return comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThanEqual comCreateFuncIdLessThanEqual に設定する
     */
    public void setComCreateFuncIdLessThanEqual(String comCreateFuncIdLessThanEqual) {
        this.comCreateFuncIdLessThanEqual = comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLikeFront
     */
    public String getComCreateFuncIdLikeFront() {
        return comCreateFuncIdLikeFront;
    }

    /**
     * comCreateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateFuncIdLikeFront comCreateFuncIdLikeFront に設定する
     */
    public void setComCreateFuncIdLikeFront(String comCreateFuncIdLikeFront) {
        this.comCreateFuncIdLikeFront = comCreateFuncIdLikeFront;
    }

    /**
     * comCreateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThan
     */
    public String getComCreateUserIdGreaterThan() {
        return comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThan comCreateUserIdGreaterThan に設定する
     */
    public void setComCreateUserIdGreaterThan(String comCreateUserIdGreaterThan) {
        this.comCreateUserIdGreaterThan = comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThanEqual
     */
    public String getComCreateUserIdGreaterThanEqual() {
        return comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThanEqual comCreateUserIdGreaterThanEqual に設定する
     */
    public void setComCreateUserIdGreaterThanEqual(String comCreateUserIdGreaterThanEqual) {
        this.comCreateUserIdGreaterThanEqual = comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThan
     */
    public String getComCreateUserIdLessThan() {
        return comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThan のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThan comCreateUserIdLessThan に設定する
     */
    public void setComCreateUserIdLessThan(String comCreateUserIdLessThan) {
        this.comCreateUserIdLessThan = comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThanEqual
     */
    public String getComCreateUserIdLessThanEqual() {
        return comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThanEqual comCreateUserIdLessThanEqual に設定する
     */
    public void setComCreateUserIdLessThanEqual(String comCreateUserIdLessThanEqual) {
        this.comCreateUserIdLessThanEqual = comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLikeFront
     */
    public String getComCreateUserIdLikeFront() {
        return comCreateUserIdLikeFront;
    }

    /**
     * comCreateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateUserIdLikeFront comCreateUserIdLikeFront に設定する
     */
    public void setComCreateUserIdLikeFront(String comCreateUserIdLikeFront) {
        this.comCreateUserIdLikeFront = comCreateUserIdLikeFront;
    }

    /**
     * <p>Getter method for ownerComp.</p>
     *
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * <p>Setter method for ownerComp.</p>
     *
     * @param ownerComp Set for ownerComp
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * <p>Getter method for outerCd.</p>
     *
     * @return the outerCd
     */
    public String getOuterCd() {
        return outerCd;
    }

    /**
     * <p>Setter method for outerCd.</p>
     *
     * @param outerCd Set for outerCd
     */
    public void setOuterCd(String outerCd) {
        this.outerCd = outerCd;
    }

}

