/*
 * PROJECT：eca0027
 * 
 * VtRpMixtag のDomainクラス
 * テーブル概要：VT_RP_MIXTAG
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;

/**
 * VtRpMixtag のDomainクラスです。<BR>
 * テーブル概要：VT_RP_MIXTAG<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpMixtagDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MIX_TAG_NO
     */
    private String mixTagNo;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * CUSTOMER_CD
     */
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;

    /**
     * MIX_TAG_ISSUER
     */
    private String mixTagIssuer;

    /**
     * MIX_TAG_ISSUE_DT
     */
    private Date mixTagIssueDt;

    /**
     * BOX_NO
     */
    private String boxNo;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * LGCY_WH_CD
     */
    private String lgcyWhCd;

    /**
     * NET_WEIGHT
     */
    private BigDecimal netWeight;

    /**
     * GROSS_WEIGHT
     */
    private BigDecimal grossWeight;

    /**
     * PLTZ_INSTR_NO
     */
    private String pltzInstrNo;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * QTY
     */
    private BigDecimal qty;

    /**
     * MODEL_CD
     */
    private String modelCd;

    /**
     * BOX_FLG
     */
    private String boxFlg;

    /**
     * COMP_NM
     */
    private String compNm;

    /**
     * SHIP_TO_NM_ABB
     */
    private String shipToNmAbb;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpMixtagDomain() {
    }

    /**
     * mixTagNo のゲッターメソッドです。
     * 
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * mixTagNo のセッターメソッドです。
     * 
     * @param mixTagNo mixTagNo に設定する
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
    }

    /**
     * shipperCd のゲッターメソッドです。
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * shipperCd のセッターメソッドです。
     * 
     * @param shipperCd shipperCd に設定する
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * customerCd のゲッターメソッドです。
     * 
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * customerCd のセッターメソッドです。
     * 
     * @param customerCd customerCd に設定する
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * lgcyShipTo のゲッターメソッドです。
     * 
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * lgcyShipTo のセッターメソッドです。
     * 
     * @param lgcyShipTo lgcyShipTo に設定する
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * mixTagIssuer のゲッターメソッドです。
     * 
     * @return the mixTagIssuer
     */
    public String getMixTagIssuer() {
        return mixTagIssuer;
    }

    /**
     * mixTagIssuer のセッターメソッドです。
     * 
     * @param mixTagIssuer mixTagIssuer に設定する
     */
    public void setMixTagIssuer(String mixTagIssuer) {
        this.mixTagIssuer = mixTagIssuer;
    }

    /**
     * mixTagIssueDt のゲッターメソッドです。
     * 
     * @return the mixTagIssueDt
     */
    public Date getMixTagIssueDt() {
        return mixTagIssueDt;
    }

    /**
     * mixTagIssueDt のセッターメソッドです。
     * 
     * @param mixTagIssueDt mixTagIssueDt に設定する
     */
    public void setMixTagIssueDt(Date mixTagIssueDt) {
        this.mixTagIssueDt = mixTagIssueDt;
    }

    /**
     * boxNo のゲッターメソッドです。
     * 
     * @return the boxNo
     */
    public String getBoxNo() {
        return boxNo;
    }

    /**
     * boxNo のセッターメソッドです。
     * 
     * @param boxNo boxNo に設定する
     */
    public void setBoxNo(String boxNo) {
        this.boxNo = boxNo;
    }

    /**
     * trnsCd のゲッターメソッドです。
     * 
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * trnsCd のセッターメソッドです。
     * 
     * @param trnsCd trnsCd に設定する
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * plntCd のゲッターメソッドです。
     * 
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * plntCd のセッターメソッドです。
     * 
     * @param plntCd plntCd に設定する
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * lgcyWhCd のゲッターメソッドです。
     * 
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * lgcyWhCd のセッターメソッドです。
     * 
     * @param lgcyWhCd lgcyWhCd に設定する
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
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
     * grossWeight のゲッターメソッドです。
     * 
     * @return the grossWeight
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * grossWeight のセッターメソッドです。
     * 
     * @param grossWeight grossWeight に設定する
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * pltzInstrNo のゲッターメソッドです。
     * 
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * pltzInstrNo のセッターメソッドです。
     * 
     * @param pltzInstrNo pltzInstrNo に設定する
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
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
     * boxFlg のゲッターメソッドです。
     * 
     * @return the boxFlg
     */
    public String getBoxFlg() {
        return boxFlg;
    }

    /**
     * boxFlg のセッターメソッドです。
     * 
     * @param boxFlg boxFlg に設定する
     */
    public void setBoxFlg(String boxFlg) {
        this.boxFlg = boxFlg;
    }

    /**
     * compNm のゲッターメソッドです。
     * 
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * compNm のセッターメソッドです。
     * 
     * @param compNm compNm に設定する
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * shipToNmAbb のゲッターメソッドです。
     * 
     * @return the shipToNmAbb
     */
    public String getShipToNmAbb() {
        return shipToNmAbb;
    }

    /**
     * shipToNmAbb のセッターメソッドです。
     * 
     * @param shipToNmAbb shipToNmAbb に設定する
     */
    public void setShipToNmAbb(String shipToNmAbb) {
        this.shipToNmAbb = shipToNmAbb;
    }

}
