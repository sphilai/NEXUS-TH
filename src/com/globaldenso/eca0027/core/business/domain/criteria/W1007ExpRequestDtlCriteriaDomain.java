/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtl の検索条件Domainクラス
 * テーブル概要：Export Request Detail/??????  As detail information of export requests , table to hold the information of request goods export unit/????????????????????????????????
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/28  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * TtExpRequestDtl の検索条件Domainクラスです。<BR>
 * テーブル概要：Export Request Detail/??????  As detail information of export requests , table to hold the information of request goods export unit/????????????????????????????????<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/28 16:15:38<BR>
 * 
 * テーブル定義から2558/04/28に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1007ExpRequestDtlCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;

    /**
     * EXPORT REQUEST ITEM ID/??????ID
     */
    private BigDecimal expRequestItemId;

    /**
     * LINE NO/?????
     */
    private BigDecimal lineNo;

    /**
     * CUSTOMER PO NO/???PO NO
     */
    private String customerPoNo;

    /**
     * DESCRIPTION/??
     */
    private String description;

    /**
     * DENGER GOODS IMPORT EXPORT CTRL/????????
     */
    private String dngrGoodsImpExpCtrl;

    /**
     * KIT PARENT FLAG/KIT????  Y:Parent Item, N:Child Item
     */
    private String kitParFlg;

    /**
     * RT USE FLAG/RT??????
     */
    private String rtUseFlg;

    /**
     * CUSTOMER ITEM NO/???????
     */
    private String customerItemNo;

    /**
     * ITEM NO/????
     */
    private String itemNo;

    /**
     * PACKAGE CODE/????
     */
    private String pkgCd;

    /**
     * ORIGIN COUNTRY CODE/??????
     */
    private String originCntryCd;

    /**
     * QUANTITY UNIT/????
     */
    private String qtyUnit;

    /**
     * QUANTITY/??
     */
    private BigDecimal qty;

    /**
     * CURRENCY CODE/?????
     */
    private String currCd;

    /**
     * UNIT PRICE/??
     */
    private BigDecimal unitPrice;

    /**
     * NET WEIGHT/?????
     */
    private BigDecimal netWeight;

    /**
     * COMMERCIAL FLAG/?????  Y:Commercial, N:Not
     */
    private String commercialFlg;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not
     */
    private String reExpGoodsFlg;

    /**
     * LOCATION NO/??????NO
     */
    private String locationNo;

    /**
     * CONSTRUCTION WORK NO/??NO
     */
    private String constructionWorkNo;

    /**
     * PACKING STATUS/???????
     */
    private String packingStatus;

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
     * CUSTOMER PO NO/???PO NO（大なり）
     */
    private String customerPoNoGreaterThan;

    /**
     * CUSTOMER PO NO/???PO NO（大なりイコール）
     */
    private String customerPoNoGreaterThanEqual;

    /**
     * CUSTOMER PO NO/???PO NO（小なり）
     */
    private String customerPoNoLessThan;

    /**
     * CUSTOMER PO NO/???PO NO（小なりイコール）
     */
    private String customerPoNoLessThanEqual;

    /**
     * CUSTOMER PO NO/???PO NO（前方一致）
     */
    private String customerPoNoLikeFront;

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
     * Kit
     */
    private String kit;
    /**
     * DESCRIPTION/??（小なりイコール）
     */
    private String descriptionLessThanEqual;

    /**
     * DESCRIPTION/??（前方一致）
     */
    private String descriptionLikeFront;

    /**
     * DENGER GOODS IMPORT EXPORT CTRL/????????（大なり）
     */
    private String dngrGoodsImpExpCtrlGreaterThan;

    /**
     * DENGER GOODS IMPORT EXPORT CTRL/????????（大なりイコール）
     */
    private String dngrGoodsImpExpCtrlGreaterThanEqual;

    /**
     * DENGER GOODS IMPORT EXPORT CTRL/????????（小なり）
     */
    private String dngrGoodsImpExpCtrlLessThan;

    /**
     * DENGER GOODS IMPORT EXPORT CTRL/????????（小なりイコール）
     */
    private String dngrGoodsImpExpCtrlLessThanEqual;

    /**
     * DENGER GOODS IMPORT EXPORT CTRL/????????（前方一致）
     */
    private String dngrGoodsImpExpCtrlLikeFront;

    /**
     * KIT PARENT FLAG/KIT????  Y:Parent Item, N:Child Item（大なり）
     */
    private String kitParFlgGreaterThan;

    /**
     * KIT PARENT FLAG/KIT????  Y:Parent Item, N:Child Item（大なりイコール）
     */
    private String kitParFlgGreaterThanEqual;

    /**
     * KIT PARENT FLAG/KIT????  Y:Parent Item, N:Child Item（小なり）
     */
    private String kitParFlgLessThan;

    /**
     * KIT PARENT FLAG/KIT????  Y:Parent Item, N:Child Item（小なりイコール）
     */
    private String kitParFlgLessThanEqual;

    /**
     * KIT PARENT FLAG/KIT????  Y:Parent Item, N:Child Item（前方一致）
     */
    private String kitParFlgLikeFront;

    /**
     * RT USE FLAG/RT??????（大なり）
     */
    private String rtUseFlgGreaterThan;

    /**
     * RT USE FLAG/RT??????（大なりイコール）
     */
    private String rtUseFlgGreaterThanEqual;

    /**
     * RT USE FLAG/RT??????（小なり）
     */
    private String rtUseFlgLessThan;

    /**
     * RT USE FLAG/RT??????（小なりイコール）
     */
    private String rtUseFlgLessThanEqual;

    /**
     * RT USE FLAG/RT??????（前方一致）
     */
    private String rtUseFlgLikeFront;

    /**
     * CUSTOMER ITEM NO/???????（大なり）
     */
    private String customerItemNoGreaterThan;

    /**
     * CUSTOMER ITEM NO/???????（大なりイコール）
     */
    private String customerItemNoGreaterThanEqual;

    /**
     * CUSTOMER ITEM NO/???????（小なり）
     */
    private String customerItemNoLessThan;

    /**
     * CUSTOMER ITEM NO/???????（小なりイコール）
     */
    private String customerItemNoLessThanEqual;

    /**
     * CUSTOMER ITEM NO/???????（前方一致）
     */
    private String customerItemNoLikeFront;

    /**
     * ITEM NO/????（大なり）
     */
    private String itemNoGreaterThan;

    /**
     * ITEM NO/????（大なりイコール）
     */
    private String itemNoGreaterThanEqual;

    /**
     * ITEM NO/????（小なり）
     */
    private String itemNoLessThan;

    /**
     * ITEM NO/????（小なりイコール）
     */
    private String itemNoLessThanEqual;

    /**
     * ITEM NO/????（前方一致）
     */
    private String itemNoLikeFront;

    /**
     * PACKAGE CODE/????（大なり）
     */
    private String pkgCdGreaterThan;

    /**
     * PACKAGE CODE/????（大なりイコール）
     */
    private String pkgCdGreaterThanEqual;

    /**
     * PACKAGE CODE/????（小なり）
     */
    private String pkgCdLessThan;

    /**
     * PACKAGE CODE/????（小なりイコール）
     */
    private String pkgCdLessThanEqual;

    /**
     * PACKAGE CODE/????（前方一致）
     */
    private String pkgCdLikeFront;

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
     * COMMERCIAL FLAG/?????  Y:Commercial, N:Not（大なり）
     */
    private String commercialFlgGreaterThan;

    /**
     * COMMERCIAL FLAG/?????  Y:Commercial, N:Not（大なりイコール）
     */
    private String commercialFlgGreaterThanEqual;

    /**
     * COMMERCIAL FLAG/?????  Y:Commercial, N:Not（小なり）
     */
    private String commercialFlgLessThan;

    /**
     * COMMERCIAL FLAG/?????  Y:Commercial, N:Not（小なりイコール）
     */
    private String commercialFlgLessThanEqual;

    /**
     * COMMERCIAL FLAG/?????  Y:Commercial, N:Not（前方一致）
     */
    private String commercialFlgLikeFront;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（大なり）
     */
    private String reExpGoodsFlgGreaterThan;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（大なりイコール）
     */
    private String reExpGoodsFlgGreaterThanEqual;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（小なり）
     */
    private String reExpGoodsFlgLessThan;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（小なりイコール）
     */
    private String reExpGoodsFlgLessThanEqual;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（前方一致）
     */
    private String reExpGoodsFlgLikeFront;

    /**
     * LOCATION NO/??????NO（大なり）
     */
    private String locationNoGreaterThan;

    /**
     * LOCATION NO/??????NO（大なりイコール）
     */
    private String locationNoGreaterThanEqual;

    /**
     * LOCATION NO/??????NO（小なり）
     */
    private String locationNoLessThan;

    /**
     * LOCATION NO/??????NO（小なりイコール）
     */
    private String locationNoLessThanEqual;

    /**
     * LOCATION NO/??????NO（前方一致）
     */
    private String locationNoLikeFront;

    /**
     * CONSTRUCTION WORK NO/??NO（大なり）
     */
    private String constructionWorkNoGreaterThan;

    /**
     * CONSTRUCTION WORK NO/??NO（大なりイコール）
     */
    private String constructionWorkNoGreaterThanEqual;

    /**
     * CONSTRUCTION WORK NO/??NO（小なり）
     */
    private String constructionWorkNoLessThan;

    /**
     * CONSTRUCTION WORK NO/??NO（小なりイコール）
     */
    private String constructionWorkNoLessThanEqual;

    /**
     * CONSTRUCTION WORK NO/??NO（前方一致）
     */
    private String constructionWorkNoLikeFront;

    /**
     * PACKING STATUS/???????（大なり）
     */
    private String packingStatusGreaterThan;

    /**
     * PACKING STATUS/???????（大なりイコール）
     */
    private String packingStatusGreaterThanEqual;

    /**
     * PACKING STATUS/???????（小なり）
     */
    private String packingStatusLessThan;

    /**
     * PACKING STATUS/???????（小なりイコール）
     */
    private String packingStatusLessThanEqual;

    /**
     * PACKING STATUS/???????（前方一致）
     */
    private String packingStatusLikeFront;

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
     * From Line
     */
    private String fmLine;
    /**
     * To Line
     */
    private String toLine;
    /**
     * Pallet No
     */
    private String palletNo;
    /**
     * CML No
     */
    private String cmlNo;
    /**
     * Order By
     */
    private String orderBy;
    
    /**
     * デフォルトコンストラクタ。
     */
    public W1007ExpRequestDtlCriteriaDomain() {
    }

    

    /**
     * <p>Getter method for orderBy.</p>
     *
     * @return the orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }



    /**
     * <p>Setter method for orderBy.</p>
     *
     * @param orderBy Set for orderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }



    /**
     * <p>Getter method for cmlNo.</p>
     *
     * @return the cmlNo
     */
    public String getCmlNo() {
        return cmlNo;
    }



    /**
     * <p>Setter method for cmlNo.</p>
     *
     * @param cmlNo Set for cmlNo
     */
    public void setCmlNo(String cmlNo) {
        this.cmlNo = cmlNo;
    }



    /**
     * <p>Getter method for palletNo.</p>
     *
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }



    /**
     * <p>Setter method for palletNo.</p>
     *
     * @param palletNo Set for palletNo
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }



    /**
     * <p>Getter method for fmLine.</p>
     *
     * @return the fmLine
     */
    public String getFmLine() {
        return fmLine;
    }

    /**
     * <p>Setter method for fmLine.</p>
     *
     * @param fmLine Set for fmLine
     */
    public void setFmLine(String fmLine) {
        this.fmLine = fmLine;
    }

    /**
     * <p>Getter method for toLine.</p>
     *
     * @return the toLine
     */
    public String getToLine() {
        return toLine;
    }

    /**
     * <p>Setter method for toLine.</p>
     *
     * @param toLine Set for toLine
     */
    public void setToLine(String toLine) {
        this.toLine = toLine;
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
    public BigDecimal getExpRequestItemId() {
        return expRequestItemId;
    }

    /**
     * expRequestItemId のセッターメソッドです。
     * 
     * @param expRequestItemId expRequestItemId に設定する
     */
    public void setExpRequestItemId(BigDecimal expRequestItemId) {
        this.expRequestItemId = expRequestItemId;
    }

    /**
     * lineNo のゲッターメソッドです。
     * 
     * @return the lineNo
     */
    public BigDecimal getLineNo() {
        return lineNo;
    }

    /**
     * lineNo のセッターメソッドです。
     * 
     * @param lineNo lineNo に設定する
     */
    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    /**
     * customerPoNo のゲッターメソッドです。
     * 
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * customerPoNo のセッターメソッドです。
     * 
     * @param customerPoNo customerPoNo に設定する
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
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
     * kitParFlg のゲッターメソッドです。
     * 
     * @return the kitParFlg
     */
    public String getKitParFlg() {
        return kitParFlg;
    }

    /**
     * kitParFlg のセッターメソッドです。
     * 
     * @param kitParFlg kitParFlg に設定する
     */
    public void setKitParFlg(String kitParFlg) {
        this.kitParFlg = kitParFlg;
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
     * customerItemNo のゲッターメソッドです。
     * 
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * customerItemNo のセッターメソッドです。
     * 
     * @param customerItemNo customerItemNo に設定する
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * itemNo のゲッターメソッドです。
     * 
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * itemNo のセッターメソッドです。
     * 
     * @param itemNo itemNo に設定する
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * pkgCd のゲッターメソッドです。
     * 
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * pkgCd のセッターメソッドです。
     * 
     * @param pkgCd pkgCd に設定する
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
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
     * reExpGoodsFlg のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlg
     */
    public String getReExpGoodsFlg() {
        return reExpGoodsFlg;
    }

    /**
     * reExpGoodsFlg のセッターメソッドです。
     * 
     * @param reExpGoodsFlg reExpGoodsFlg に設定する
     */
    public void setReExpGoodsFlg(String reExpGoodsFlg) {
        this.reExpGoodsFlg = reExpGoodsFlg;
    }
    
    /**
     * locationNo のゲッターメソッドです。
     * 
     * @return the locationNo
     */
    public String getLocationNo() {
        return locationNo;
    }

    /**
     * locationNo のセッターメソッドです。
     * 
     * @param locationNo locationNo に設定する
     */
    public void setLocationNo(String locationNo) {
        this.locationNo = locationNo;
    }

    /**
     * constructionWorkNo のゲッターメソッドです。
     * 
     * @return the constructionWorkNo
     */
    public String getConstructionWorkNo() {
        return constructionWorkNo;
    }

    /**
     * constructionWorkNo のセッターメソッドです。
     * 
     * @param constructionWorkNo constructionWorkNo に設定する
     */
    public void setConstructionWorkNo(String constructionWorkNo) {
        this.constructionWorkNo = constructionWorkNo;
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
     * customerPoNoGreaterThan のゲッターメソッドです。
     * 
     * @return the customerPoNoGreaterThan
     */
    public String getCustomerPoNoGreaterThan() {
        return customerPoNoGreaterThan;
    }

    /**
     * customerPoNoGreaterThan のセッターメソッドです。
     * 
     * @param customerPoNoGreaterThan customerPoNoGreaterThan に設定する
     */
    public void setCustomerPoNoGreaterThan(String customerPoNoGreaterThan) {
        this.customerPoNoGreaterThan = customerPoNoGreaterThan;
    }

    /**
     * customerPoNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerPoNoGreaterThanEqual
     */
    public String getCustomerPoNoGreaterThanEqual() {
        return customerPoNoGreaterThanEqual;
    }

    /**
     * customerPoNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerPoNoGreaterThanEqual customerPoNoGreaterThanEqual に設定する
     */
    public void setCustomerPoNoGreaterThanEqual(String customerPoNoGreaterThanEqual) {
        this.customerPoNoGreaterThanEqual = customerPoNoGreaterThanEqual;
    }

    /**
     * customerPoNoLessThan のゲッターメソッドです。
     * 
     * @return the customerPoNoLessThan
     */
    public String getCustomerPoNoLessThan() {
        return customerPoNoLessThan;
    }

    /**
     * customerPoNoLessThan のセッターメソッドです。
     * 
     * @param customerPoNoLessThan customerPoNoLessThan に設定する
     */
    public void setCustomerPoNoLessThan(String customerPoNoLessThan) {
        this.customerPoNoLessThan = customerPoNoLessThan;
    }

    /**
     * customerPoNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerPoNoLessThanEqual
     */
    public String getCustomerPoNoLessThanEqual() {
        return customerPoNoLessThanEqual;
    }

    /**
     * customerPoNoLessThanEqual のセッターメソッドです。
     * 
     * @param customerPoNoLessThanEqual customerPoNoLessThanEqual に設定する
     */
    public void setCustomerPoNoLessThanEqual(String customerPoNoLessThanEqual) {
        this.customerPoNoLessThanEqual = customerPoNoLessThanEqual;
    }

    /**
     * customerPoNoLikeFront のゲッターメソッドです。
     * 
     * @return the customerPoNoLikeFront
     */
    public String getCustomerPoNoLikeFront() {
        return customerPoNoLikeFront;
    }

    /**
     * customerPoNoLikeFront のセッターメソッドです。
     * 
     * @param customerPoNoLikeFront customerPoNoLikeFront に設定する
     */
    public void setCustomerPoNoLikeFront(String customerPoNoLikeFront) {
        this.customerPoNoLikeFront = customerPoNoLikeFront;
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
     * dngrGoodsImpExpCtrlGreaterThan のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlGreaterThan
     */
    public String getDngrGoodsImpExpCtrlGreaterThan() {
        return dngrGoodsImpExpCtrlGreaterThan;
    }

    /**
     * dngrGoodsImpExpCtrlGreaterThan のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlGreaterThan dngrGoodsImpExpCtrlGreaterThan に設定する
     */
    public void setDngrGoodsImpExpCtrlGreaterThan(String dngrGoodsImpExpCtrlGreaterThan) {
        this.dngrGoodsImpExpCtrlGreaterThan = dngrGoodsImpExpCtrlGreaterThan;
    }

    /**
     * dngrGoodsImpExpCtrlGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlGreaterThanEqual
     */
    public String getDngrGoodsImpExpCtrlGreaterThanEqual() {
        return dngrGoodsImpExpCtrlGreaterThanEqual;
    }

    /**
     * dngrGoodsImpExpCtrlGreaterThanEqual のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlGreaterThanEqual dngrGoodsImpExpCtrlGreaterThanEqual に設定する
     */
    public void setDngrGoodsImpExpCtrlGreaterThanEqual(String dngrGoodsImpExpCtrlGreaterThanEqual) {
        this.dngrGoodsImpExpCtrlGreaterThanEqual = dngrGoodsImpExpCtrlGreaterThanEqual;
    }

    /**
     * dngrGoodsImpExpCtrlLessThan のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlLessThan
     */
    public String getDngrGoodsImpExpCtrlLessThan() {
        return dngrGoodsImpExpCtrlLessThan;
    }

    /**
     * dngrGoodsImpExpCtrlLessThan のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlLessThan dngrGoodsImpExpCtrlLessThan に設定する
     */
    public void setDngrGoodsImpExpCtrlLessThan(String dngrGoodsImpExpCtrlLessThan) {
        this.dngrGoodsImpExpCtrlLessThan = dngrGoodsImpExpCtrlLessThan;
    }

    /**
     * dngrGoodsImpExpCtrlLessThanEqual のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlLessThanEqual
     */
    public String getDngrGoodsImpExpCtrlLessThanEqual() {
        return dngrGoodsImpExpCtrlLessThanEqual;
    }

    /**
     * dngrGoodsImpExpCtrlLessThanEqual のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlLessThanEqual dngrGoodsImpExpCtrlLessThanEqual に設定する
     */
    public void setDngrGoodsImpExpCtrlLessThanEqual(String dngrGoodsImpExpCtrlLessThanEqual) {
        this.dngrGoodsImpExpCtrlLessThanEqual = dngrGoodsImpExpCtrlLessThanEqual;
    }

    /**
     * dngrGoodsImpExpCtrlLikeFront のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlLikeFront
     */
    public String getDngrGoodsImpExpCtrlLikeFront() {
        return dngrGoodsImpExpCtrlLikeFront;
    }

    /**
     * dngrGoodsImpExpCtrlLikeFront のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlLikeFront dngrGoodsImpExpCtrlLikeFront に設定する
     */
    public void setDngrGoodsImpExpCtrlLikeFront(String dngrGoodsImpExpCtrlLikeFront) {
        this.dngrGoodsImpExpCtrlLikeFront = dngrGoodsImpExpCtrlLikeFront;
    }

    /**
     * kitParFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the kitParFlgGreaterThan
     */
    public String getKitParFlgGreaterThan() {
        return kitParFlgGreaterThan;
    }

    /**
     * kitParFlgGreaterThan のセッターメソッドです。
     * 
     * @param kitParFlgGreaterThan kitParFlgGreaterThan に設定する
     */
    public void setKitParFlgGreaterThan(String kitParFlgGreaterThan) {
        this.kitParFlgGreaterThan = kitParFlgGreaterThan;
    }

    /**
     * kitParFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the kitParFlgGreaterThanEqual
     */
    public String getKitParFlgGreaterThanEqual() {
        return kitParFlgGreaterThanEqual;
    }

    /**
     * kitParFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param kitParFlgGreaterThanEqual kitParFlgGreaterThanEqual に設定する
     */
    public void setKitParFlgGreaterThanEqual(String kitParFlgGreaterThanEqual) {
        this.kitParFlgGreaterThanEqual = kitParFlgGreaterThanEqual;
    }

    /**
     * kitParFlgLessThan のゲッターメソッドです。
     * 
     * @return the kitParFlgLessThan
     */
    public String getKitParFlgLessThan() {
        return kitParFlgLessThan;
    }

    /**
     * kitParFlgLessThan のセッターメソッドです。
     * 
     * @param kitParFlgLessThan kitParFlgLessThan に設定する
     */
    public void setKitParFlgLessThan(String kitParFlgLessThan) {
        this.kitParFlgLessThan = kitParFlgLessThan;
    }

    /**
     * kitParFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the kitParFlgLessThanEqual
     */
    public String getKitParFlgLessThanEqual() {
        return kitParFlgLessThanEqual;
    }

    /**
     * kitParFlgLessThanEqual のセッターメソッドです。
     * 
     * @param kitParFlgLessThanEqual kitParFlgLessThanEqual に設定する
     */
    public void setKitParFlgLessThanEqual(String kitParFlgLessThanEqual) {
        this.kitParFlgLessThanEqual = kitParFlgLessThanEqual;
    }

    /**
     * kitParFlgLikeFront のゲッターメソッドです。
     * 
     * @return the kitParFlgLikeFront
     */
    public String getKitParFlgLikeFront() {
        return kitParFlgLikeFront;
    }

    /**
     * kitParFlgLikeFront のセッターメソッドです。
     * 
     * @param kitParFlgLikeFront kitParFlgLikeFront に設定する
     */
    public void setKitParFlgLikeFront(String kitParFlgLikeFront) {
        this.kitParFlgLikeFront = kitParFlgLikeFront;
    }

    /**
     * rtUseFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the rtUseFlgGreaterThan
     */
    public String getRtUseFlgGreaterThan() {
        return rtUseFlgGreaterThan;
    }

    /**
     * rtUseFlgGreaterThan のセッターメソッドです。
     * 
     * @param rtUseFlgGreaterThan rtUseFlgGreaterThan に設定する
     */
    public void setRtUseFlgGreaterThan(String rtUseFlgGreaterThan) {
        this.rtUseFlgGreaterThan = rtUseFlgGreaterThan;
    }

    /**
     * rtUseFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the rtUseFlgGreaterThanEqual
     */
    public String getRtUseFlgGreaterThanEqual() {
        return rtUseFlgGreaterThanEqual;
    }

    /**
     * rtUseFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param rtUseFlgGreaterThanEqual rtUseFlgGreaterThanEqual に設定する
     */
    public void setRtUseFlgGreaterThanEqual(String rtUseFlgGreaterThanEqual) {
        this.rtUseFlgGreaterThanEqual = rtUseFlgGreaterThanEqual;
    }

    /**
     * rtUseFlgLessThan のゲッターメソッドです。
     * 
     * @return the rtUseFlgLessThan
     */
    public String getRtUseFlgLessThan() {
        return rtUseFlgLessThan;
    }

    /**
     * rtUseFlgLessThan のセッターメソッドです。
     * 
     * @param rtUseFlgLessThan rtUseFlgLessThan に設定する
     */
    public void setRtUseFlgLessThan(String rtUseFlgLessThan) {
        this.rtUseFlgLessThan = rtUseFlgLessThan;
    }

    /**
     * rtUseFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the rtUseFlgLessThanEqual
     */
    public String getRtUseFlgLessThanEqual() {
        return rtUseFlgLessThanEqual;
    }

    /**
     * rtUseFlgLessThanEqual のセッターメソッドです。
     * 
     * @param rtUseFlgLessThanEqual rtUseFlgLessThanEqual に設定する
     */
    public void setRtUseFlgLessThanEqual(String rtUseFlgLessThanEqual) {
        this.rtUseFlgLessThanEqual = rtUseFlgLessThanEqual;
    }

    /**
     * rtUseFlgLikeFront のゲッターメソッドです。
     * 
     * @return the rtUseFlgLikeFront
     */
    public String getRtUseFlgLikeFront() {
        return rtUseFlgLikeFront;
    }

    /**
     * rtUseFlgLikeFront のセッターメソッドです。
     * 
     * @param rtUseFlgLikeFront rtUseFlgLikeFront に設定する
     */
    public void setRtUseFlgLikeFront(String rtUseFlgLikeFront) {
        this.rtUseFlgLikeFront = rtUseFlgLikeFront;
    }

    /**
     * customerItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the customerItemNoGreaterThan
     */
    public String getCustomerItemNoGreaterThan() {
        return customerItemNoGreaterThan;
    }

    /**
     * customerItemNoGreaterThan のセッターメソッドです。
     * 
     * @param customerItemNoGreaterThan customerItemNoGreaterThan に設定する
     */
    public void setCustomerItemNoGreaterThan(String customerItemNoGreaterThan) {
        this.customerItemNoGreaterThan = customerItemNoGreaterThan;
    }

    /**
     * customerItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerItemNoGreaterThanEqual
     */
    public String getCustomerItemNoGreaterThanEqual() {
        return customerItemNoGreaterThanEqual;
    }

    /**
     * customerItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerItemNoGreaterThanEqual customerItemNoGreaterThanEqual に設定する
     */
    public void setCustomerItemNoGreaterThanEqual(String customerItemNoGreaterThanEqual) {
        this.customerItemNoGreaterThanEqual = customerItemNoGreaterThanEqual;
    }

    /**
     * customerItemNoLessThan のゲッターメソッドです。
     * 
     * @return the customerItemNoLessThan
     */
    public String getCustomerItemNoLessThan() {
        return customerItemNoLessThan;
    }

    /**
     * customerItemNoLessThan のセッターメソッドです。
     * 
     * @param customerItemNoLessThan customerItemNoLessThan に設定する
     */
    public void setCustomerItemNoLessThan(String customerItemNoLessThan) {
        this.customerItemNoLessThan = customerItemNoLessThan;
    }

    /**
     * customerItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerItemNoLessThanEqual
     */
    public String getCustomerItemNoLessThanEqual() {
        return customerItemNoLessThanEqual;
    }

    /**
     * customerItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param customerItemNoLessThanEqual customerItemNoLessThanEqual に設定する
     */
    public void setCustomerItemNoLessThanEqual(String customerItemNoLessThanEqual) {
        this.customerItemNoLessThanEqual = customerItemNoLessThanEqual;
    }

    /**
     * customerItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the customerItemNoLikeFront
     */
    public String getCustomerItemNoLikeFront() {
        return customerItemNoLikeFront;
    }

    /**
     * customerItemNoLikeFront のセッターメソッドです。
     * 
     * @param customerItemNoLikeFront customerItemNoLikeFront に設定する
     */
    public void setCustomerItemNoLikeFront(String customerItemNoLikeFront) {
        this.customerItemNoLikeFront = customerItemNoLikeFront;
    }

    /**
     * itemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the itemNoGreaterThan
     */
    public String getItemNoGreaterThan() {
        return itemNoGreaterThan;
    }

    /**
     * itemNoGreaterThan のセッターメソッドです。
     * 
     * @param itemNoGreaterThan itemNoGreaterThan に設定する
     */
    public void setItemNoGreaterThan(String itemNoGreaterThan) {
        this.itemNoGreaterThan = itemNoGreaterThan;
    }

    /**
     * itemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoGreaterThanEqual
     */
    public String getItemNoGreaterThanEqual() {
        return itemNoGreaterThanEqual;
    }

    /**
     * itemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemNoGreaterThanEqual itemNoGreaterThanEqual に設定する
     */
    public void setItemNoGreaterThanEqual(String itemNoGreaterThanEqual) {
        this.itemNoGreaterThanEqual = itemNoGreaterThanEqual;
    }

    /**
     * itemNoLessThan のゲッターメソッドです。
     * 
     * @return the itemNoLessThan
     */
    public String getItemNoLessThan() {
        return itemNoLessThan;
    }

    /**
     * itemNoLessThan のセッターメソッドです。
     * 
     * @param itemNoLessThan itemNoLessThan に設定する
     */
    public void setItemNoLessThan(String itemNoLessThan) {
        this.itemNoLessThan = itemNoLessThan;
    }

    /**
     * itemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoLessThanEqual
     */
    public String getItemNoLessThanEqual() {
        return itemNoLessThanEqual;
    }

    /**
     * itemNoLessThanEqual のセッターメソッドです。
     * 
     * @param itemNoLessThanEqual itemNoLessThanEqual に設定する
     */
    public void setItemNoLessThanEqual(String itemNoLessThanEqual) {
        this.itemNoLessThanEqual = itemNoLessThanEqual;
    }

    /**
     * itemNoLikeFront のゲッターメソッドです。
     * 
     * @return the itemNoLikeFront
     */
    public String getItemNoLikeFront() {
        return itemNoLikeFront;
    }

    /**
     * itemNoLikeFront のセッターメソッドです。
     * 
     * @param itemNoLikeFront itemNoLikeFront に設定する
     */
    public void setItemNoLikeFront(String itemNoLikeFront) {
        this.itemNoLikeFront = itemNoLikeFront;
    }

    /**
     * pkgCdGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThan
     */
    public String getPkgCdGreaterThan() {
        return pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThan のセッターメソッドです。
     * 
     * @param pkgCdGreaterThan pkgCdGreaterThan に設定する
     */
    public void setPkgCdGreaterThan(String pkgCdGreaterThan) {
        this.pkgCdGreaterThan = pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThanEqual
     */
    public String getPkgCdGreaterThanEqual() {
        return pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgCdGreaterThanEqual pkgCdGreaterThanEqual に設定する
     */
    public void setPkgCdGreaterThanEqual(String pkgCdGreaterThanEqual) {
        this.pkgCdGreaterThanEqual = pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdLessThan のゲッターメソッドです。
     * 
     * @return the pkgCdLessThan
     */
    public String getPkgCdLessThan() {
        return pkgCdLessThan;
    }

    /**
     * pkgCdLessThan のセッターメソッドです。
     * 
     * @param pkgCdLessThan pkgCdLessThan に設定する
     */
    public void setPkgCdLessThan(String pkgCdLessThan) {
        this.pkgCdLessThan = pkgCdLessThan;
    }

    /**
     * pkgCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdLessThanEqual
     */
    public String getPkgCdLessThanEqual() {
        return pkgCdLessThanEqual;
    }

    /**
     * pkgCdLessThanEqual のセッターメソッドです。
     * 
     * @param pkgCdLessThanEqual pkgCdLessThanEqual に設定する
     */
    public void setPkgCdLessThanEqual(String pkgCdLessThanEqual) {
        this.pkgCdLessThanEqual = pkgCdLessThanEqual;
    }

    /**
     * pkgCdLikeFront のゲッターメソッドです。
     * 
     * @return the pkgCdLikeFront
     */
    public String getPkgCdLikeFront() {
        return pkgCdLikeFront;
    }

    /**
     * pkgCdLikeFront のセッターメソッドです。
     * 
     * @param pkgCdLikeFront pkgCdLikeFront に設定する
     */
    public void setPkgCdLikeFront(String pkgCdLikeFront) {
        this.pkgCdLikeFront = pkgCdLikeFront;
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
     * commercialFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the commercialFlgGreaterThan
     */
    public String getCommercialFlgGreaterThan() {
        return commercialFlgGreaterThan;
    }

    /**
     * commercialFlgGreaterThan のセッターメソッドです。
     * 
     * @param commercialFlgGreaterThan commercialFlgGreaterThan に設定する
     */
    public void setCommercialFlgGreaterThan(String commercialFlgGreaterThan) {
        this.commercialFlgGreaterThan = commercialFlgGreaterThan;
    }

    /**
     * commercialFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the commercialFlgGreaterThanEqual
     */
    public String getCommercialFlgGreaterThanEqual() {
        return commercialFlgGreaterThanEqual;
    }

    /**
     * commercialFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param commercialFlgGreaterThanEqual commercialFlgGreaterThanEqual に設定する
     */
    public void setCommercialFlgGreaterThanEqual(String commercialFlgGreaterThanEqual) {
        this.commercialFlgGreaterThanEqual = commercialFlgGreaterThanEqual;
    }

    /**
     * commercialFlgLessThan のゲッターメソッドです。
     * 
     * @return the commercialFlgLessThan
     */
    public String getCommercialFlgLessThan() {
        return commercialFlgLessThan;
    }

    /**
     * commercialFlgLessThan のセッターメソッドです。
     * 
     * @param commercialFlgLessThan commercialFlgLessThan に設定する
     */
    public void setCommercialFlgLessThan(String commercialFlgLessThan) {
        this.commercialFlgLessThan = commercialFlgLessThan;
    }

    /**
     * commercialFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the commercialFlgLessThanEqual
     */
    public String getCommercialFlgLessThanEqual() {
        return commercialFlgLessThanEqual;
    }

    /**
     * commercialFlgLessThanEqual のセッターメソッドです。
     * 
     * @param commercialFlgLessThanEqual commercialFlgLessThanEqual に設定する
     */
    public void setCommercialFlgLessThanEqual(String commercialFlgLessThanEqual) {
        this.commercialFlgLessThanEqual = commercialFlgLessThanEqual;
    }

    /**
     * commercialFlgLikeFront のゲッターメソッドです。
     * 
     * @return the commercialFlgLikeFront
     */
    public String getCommercialFlgLikeFront() {
        return commercialFlgLikeFront;
    }

    /**
     * commercialFlgLikeFront のセッターメソッドです。
     * 
     * @param commercialFlgLikeFront commercialFlgLikeFront に設定する
     */
    public void setCommercialFlgLikeFront(String commercialFlgLikeFront) {
        this.commercialFlgLikeFront = commercialFlgLikeFront;
    }

    /**
     * reExpGoodsFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgGreaterThan
     */
    public String getReExpGoodsFlgGreaterThan() {
        return reExpGoodsFlgGreaterThan;
    }

    /**
     * reExpGoodsFlgGreaterThan のセッターメソッドです。
     * 
     * @param reExpGoodsFlgGreaterThan reExpGoodsFlgGreaterThan に設定する
     */
    public void setReExpGoodsFlgGreaterThan(String reExpGoodsFlgGreaterThan) {
        this.reExpGoodsFlgGreaterThan = reExpGoodsFlgGreaterThan;
    }

    /**
     * reExpGoodsFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgGreaterThanEqual
     */
    public String getReExpGoodsFlgGreaterThanEqual() {
        return reExpGoodsFlgGreaterThanEqual;
    }

    /**
     * reExpGoodsFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param reExpGoodsFlgGreaterThanEqual reExpGoodsFlgGreaterThanEqual に設定する
     */
    public void setReExpGoodsFlgGreaterThanEqual(String reExpGoodsFlgGreaterThanEqual) {
        this.reExpGoodsFlgGreaterThanEqual = reExpGoodsFlgGreaterThanEqual;
    }

    /**
     * reExpGoodsFlgLessThan のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgLessThan
     */
    public String getReExpGoodsFlgLessThan() {
        return reExpGoodsFlgLessThan;
    }

    /**
     * reExpGoodsFlgLessThan のセッターメソッドです。
     * 
     * @param reExpGoodsFlgLessThan reExpGoodsFlgLessThan に設定する
     */
    public void setReExpGoodsFlgLessThan(String reExpGoodsFlgLessThan) {
        this.reExpGoodsFlgLessThan = reExpGoodsFlgLessThan;
    }

    /**
     * reExpGoodsFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgLessThanEqual
     */
    public String getReExpGoodsFlgLessThanEqual() {
        return reExpGoodsFlgLessThanEqual;
    }

    /**
     * reExpGoodsFlgLessThanEqual のセッターメソッドです。
     * 
     * @param reExpGoodsFlgLessThanEqual reExpGoodsFlgLessThanEqual に設定する
     */
    public void setReExpGoodsFlgLessThanEqual(String reExpGoodsFlgLessThanEqual) {
        this.reExpGoodsFlgLessThanEqual = reExpGoodsFlgLessThanEqual;
    }

    /**
     * reExpGoodsFlgLikeFront のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgLikeFront
     */
    public String getReExpGoodsFlgLikeFront() {
        return reExpGoodsFlgLikeFront;
    }

    /**
     * reExpGoodsFlgLikeFront のセッターメソッドです。
     * 
     * @param reExpGoodsFlgLikeFront reExpGoodsFlgLikeFront に設定する
     */
    public void setReExpGoodsFlgLikeFront(String reExpGoodsFlgLikeFront) {
        this.reExpGoodsFlgLikeFront = reExpGoodsFlgLikeFront;
    }

    /**
     * locationNoGreaterThan のゲッターメソッドです。
     * 
     * @return the locationNoGreaterThan
     */
    public String getLocationNoGreaterThan() {
        return locationNoGreaterThan;
    }

    /**
     * locationNoGreaterThan のセッターメソッドです。
     * 
     * @param locationNoGreaterThan locationNoGreaterThan に設定する
     */
    public void setLocationNoGreaterThan(String locationNoGreaterThan) {
        this.locationNoGreaterThan = locationNoGreaterThan;
    }

    /**
     * locationNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the locationNoGreaterThanEqual
     */
    public String getLocationNoGreaterThanEqual() {
        return locationNoGreaterThanEqual;
    }

    /**
     * locationNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param locationNoGreaterThanEqual locationNoGreaterThanEqual に設定する
     */
    public void setLocationNoGreaterThanEqual(String locationNoGreaterThanEqual) {
        this.locationNoGreaterThanEqual = locationNoGreaterThanEqual;
    }

    /**
     * locationNoLessThan のゲッターメソッドです。
     * 
     * @return the locationNoLessThan
     */
    public String getLocationNoLessThan() {
        return locationNoLessThan;
    }

    /**
     * locationNoLessThan のセッターメソッドです。
     * 
     * @param locationNoLessThan locationNoLessThan に設定する
     */
    public void setLocationNoLessThan(String locationNoLessThan) {
        this.locationNoLessThan = locationNoLessThan;
    }

    /**
     * locationNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the locationNoLessThanEqual
     */
    public String getLocationNoLessThanEqual() {
        return locationNoLessThanEqual;
    }

    /**
     * locationNoLessThanEqual のセッターメソッドです。
     * 
     * @param locationNoLessThanEqual locationNoLessThanEqual に設定する
     */
    public void setLocationNoLessThanEqual(String locationNoLessThanEqual) {
        this.locationNoLessThanEqual = locationNoLessThanEqual;
    }

    /**
     * locationNoLikeFront のゲッターメソッドです。
     * 
     * @return the locationNoLikeFront
     */
    public String getLocationNoLikeFront() {
        return locationNoLikeFront;
    }

    /**
     * locationNoLikeFront のセッターメソッドです。
     * 
     * @param locationNoLikeFront locationNoLikeFront に設定する
     */
    public void setLocationNoLikeFront(String locationNoLikeFront) {
        this.locationNoLikeFront = locationNoLikeFront;
    }

    /**
     * constructionWorkNoGreaterThan のゲッターメソッドです。
     * 
     * @return the constructionWorkNoGreaterThan
     */
    public String getConstructionWorkNoGreaterThan() {
        return constructionWorkNoGreaterThan;
    }

    /**
     * constructionWorkNoGreaterThan のセッターメソッドです。
     * 
     * @param constructionWorkNoGreaterThan constructionWorkNoGreaterThan に設定する
     */
    public void setConstructionWorkNoGreaterThan(String constructionWorkNoGreaterThan) {
        this.constructionWorkNoGreaterThan = constructionWorkNoGreaterThan;
    }

    /**
     * constructionWorkNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the constructionWorkNoGreaterThanEqual
     */
    public String getConstructionWorkNoGreaterThanEqual() {
        return constructionWorkNoGreaterThanEqual;
    }

    /**
     * constructionWorkNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param constructionWorkNoGreaterThanEqual constructionWorkNoGreaterThanEqual に設定する
     */
    public void setConstructionWorkNoGreaterThanEqual(String constructionWorkNoGreaterThanEqual) {
        this.constructionWorkNoGreaterThanEqual = constructionWorkNoGreaterThanEqual;
    }

    /**
     * constructionWorkNoLessThan のゲッターメソッドです。
     * 
     * @return the constructionWorkNoLessThan
     */
    public String getConstructionWorkNoLessThan() {
        return constructionWorkNoLessThan;
    }

    /**
     * constructionWorkNoLessThan のセッターメソッドです。
     * 
     * @param constructionWorkNoLessThan constructionWorkNoLessThan に設定する
     */
    public void setConstructionWorkNoLessThan(String constructionWorkNoLessThan) {
        this.constructionWorkNoLessThan = constructionWorkNoLessThan;
    }

    /**
     * constructionWorkNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the constructionWorkNoLessThanEqual
     */
    public String getConstructionWorkNoLessThanEqual() {
        return constructionWorkNoLessThanEqual;
    }

    /**
     * constructionWorkNoLessThanEqual のセッターメソッドです。
     * 
     * @param constructionWorkNoLessThanEqual constructionWorkNoLessThanEqual に設定する
     */
    public void setConstructionWorkNoLessThanEqual(String constructionWorkNoLessThanEqual) {
        this.constructionWorkNoLessThanEqual = constructionWorkNoLessThanEqual;
    }

    /**
     * constructionWorkNoLikeFront のゲッターメソッドです。
     * 
     * @return the constructionWorkNoLikeFront
     */
    public String getConstructionWorkNoLikeFront() {
        return constructionWorkNoLikeFront;
    }

    /**
     * constructionWorkNoLikeFront のセッターメソッドです。
     * 
     * @param constructionWorkNoLikeFront constructionWorkNoLikeFront に設定する
     */
    public void setConstructionWorkNoLikeFront(String constructionWorkNoLikeFront) {
        this.constructionWorkNoLikeFront = constructionWorkNoLikeFront;
    }

    /**
     * packingStatusGreaterThan のゲッターメソッドです。
     * 
     * @return the packingStatusGreaterThan
     */
    public String getPackingStatusGreaterThan() {
        return packingStatusGreaterThan;
    }

    /**
     * packingStatusGreaterThan のセッターメソッドです。
     * 
     * @param packingStatusGreaterThan packingStatusGreaterThan に設定する
     */
    public void setPackingStatusGreaterThan(String packingStatusGreaterThan) {
        this.packingStatusGreaterThan = packingStatusGreaterThan;
    }

    /**
     * packingStatusGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the packingStatusGreaterThanEqual
     */
    public String getPackingStatusGreaterThanEqual() {
        return packingStatusGreaterThanEqual;
    }

    /**
     * packingStatusGreaterThanEqual のセッターメソッドです。
     * 
     * @param packingStatusGreaterThanEqual packingStatusGreaterThanEqual に設定する
     */
    public void setPackingStatusGreaterThanEqual(String packingStatusGreaterThanEqual) {
        this.packingStatusGreaterThanEqual = packingStatusGreaterThanEqual;
    }

    /**
     * packingStatusLessThan のゲッターメソッドです。
     * 
     * @return the packingStatusLessThan
     */
    public String getPackingStatusLessThan() {
        return packingStatusLessThan;
    }

    /**
     * packingStatusLessThan のセッターメソッドです。
     * 
     * @param packingStatusLessThan packingStatusLessThan に設定する
     */
    public void setPackingStatusLessThan(String packingStatusLessThan) {
        this.packingStatusLessThan = packingStatusLessThan;
    }

    /**
     * packingStatusLessThanEqual のゲッターメソッドです。
     * 
     * @return the packingStatusLessThanEqual
     */
    public String getPackingStatusLessThanEqual() {
        return packingStatusLessThanEqual;
    }

    /**
     * packingStatusLessThanEqual のセッターメソッドです。
     * 
     * @param packingStatusLessThanEqual packingStatusLessThanEqual に設定する
     */
    public void setPackingStatusLessThanEqual(String packingStatusLessThanEqual) {
        this.packingStatusLessThanEqual = packingStatusLessThanEqual;
    }

    /**
     * packingStatusLikeFront のゲッターメソッドです。
     * 
     * @return the packingStatusLikeFront
     */
    public String getPackingStatusLikeFront() {
        return packingStatusLikeFront;
    }

    /**
     * packingStatusLikeFront のセッターメソッドです。
     * 
     * @param packingStatusLikeFront packingStatusLikeFront に設定する
     */
    public void setPackingStatusLikeFront(String packingStatusLikeFront) {
        this.packingStatusLikeFront = packingStatusLikeFront;
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
     * <p>Getter method for kit.</p>
     *
     * @return the kit
     */
    public String getKit() {
        return kit;
    }

    /**
     * <p>Setter method for kit.</p>
     *
     * @param kit Set for kit
     */
    public void setKit(String kit) {
        this.kit = kit;
    }

}

