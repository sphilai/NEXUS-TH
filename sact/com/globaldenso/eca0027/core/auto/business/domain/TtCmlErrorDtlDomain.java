/*
 * PROJECT：eca0027
 * 
 * TtCmlErrorDtl のDomainクラス
 * テーブル概要：TT_CML_ERROR_DTL
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 * TtCmlErrorDtl のDomainクラスです。<BR>
 * テーブル概要：TT_CML_ERROR_DTL<BR>
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
public class TtCmlErrorDtlDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;

    /**
     * ERR_CREATE_TIMESTAMP
     */
    private Timestamp errCreateTimestamp;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * MIX_TAG_FLG
     */
    private String mixTagFlg;

    /**
     * PKG_FORM_TYP
     */
    private String pkgFormTyp;

    /**
     * INVOICE_KEY
     */
    private String invoiceKey;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * CURR_CD
     */
    private String currCd;

    /**
     * LOADING_CD
     */
    private String loadingCd;

    /**
     * STG_INSTR_ITEM_FLG
     */
    private String stgInstrItemFlg;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * CUSTOM_TIMING_TYP
     */
    private String customTimingTyp;

    /**
     * SHIPPING_LOT
     */
    private BigDecimal shippingLot;

    /**
     * QTY
     */
    private BigDecimal qty;

    /**
     * SCAN_QTY
     */
    private BigDecimal scanQty;

    /**
     * STK_QTY
     */
    private BigDecimal stkQty;

    /**
     * ODR_QTY
     */
    private BigDecimal odrQty;

    /**
     * LEFT_INSTR_QTY
     */
    private BigDecimal leftInstrQty;

    /**
     * OVER_INSTR_QTY
     */
    private BigDecimal overInstrQty;

    /**
     * ITEM_NO_CHK_FLG
     */
    private String itemNoChkFlg;

    /**
     * MIX_PLTZ_COMPLT_FLG
     */
    private String mixPltzCompltFlg;

    /**
     * MIX_WH_CHK_FLG
     */
    private String mixWhChkFlg;

    /**
     * MLT_IN_BOX_ALLOW_FLG
     */
    private String mltInBoxAllowFlg;

    /**
     * COM_UPDATE_FUNC_ID
     */
    private String comUpdateFuncId;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_CREATE_FUNC_ID
     */
    private String comCreateFuncId;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;

    /**
     * デフォルトコンストラクタ。
     */
    public TtCmlErrorDtlDomain() {
    }

    /**
     * dscId のゲッターメソッドです。
     * 
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * dscId のセッターメソッドです。
     * 
     * @param dscId dscId に設定する
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * errCreateTimestamp のゲッターメソッドです。
     * 
     * @return the errCreateTimestamp
     */
    public Timestamp getErrCreateTimestamp() {
        return errCreateTimestamp;
    }

    /**
     * errCreateTimestamp のセッターメソッドです。
     * 
     * @param errCreateTimestamp errCreateTimestamp に設定する
     */
    public void setErrCreateTimestamp(Timestamp errCreateTimestamp) {
        this.errCreateTimestamp = errCreateTimestamp;
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
     * mixTagFlg のゲッターメソッドです。
     * 
     * @return the mixTagFlg
     */
    public String getMixTagFlg() {
        return mixTagFlg;
    }

    /**
     * mixTagFlg のセッターメソッドです。
     * 
     * @param mixTagFlg mixTagFlg に設定する
     */
    public void setMixTagFlg(String mixTagFlg) {
        this.mixTagFlg = mixTagFlg;
    }

    /**
     * pkgFormTyp のゲッターメソッドです。
     * 
     * @return the pkgFormTyp
     */
    public String getPkgFormTyp() {
        return pkgFormTyp;
    }

    /**
     * pkgFormTyp のセッターメソッドです。
     * 
     * @param pkgFormTyp pkgFormTyp に設定する
     */
    public void setPkgFormTyp(String pkgFormTyp) {
        this.pkgFormTyp = pkgFormTyp;
    }

    /**
     * invoiceKey のゲッターメソッドです。
     * 
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * invoiceKey のセッターメソッドです。
     * 
     * @param invoiceKey invoiceKey に設定する
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    /**
     * containerSortingKey のゲッターメソッドです。
     * 
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * containerSortingKey のセッターメソッドです。
     * 
     * @param containerSortingKey containerSortingKey に設定する
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
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
     * loadingCd のゲッターメソッドです。
     * 
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * loadingCd のセッターメソッドです。
     * 
     * @param loadingCd loadingCd に設定する
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * stgInstrItemFlg のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlg
     */
    public String getStgInstrItemFlg() {
        return stgInstrItemFlg;
    }

    /**
     * stgInstrItemFlg のセッターメソッドです。
     * 
     * @param stgInstrItemFlg stgInstrItemFlg に設定する
     */
    public void setStgInstrItemFlg(String stgInstrItemFlg) {
        this.stgInstrItemFlg = stgInstrItemFlg;
    }

    /**
     * containerLooseTyp のゲッターメソッドです。
     * 
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * containerLooseTyp のセッターメソッドです。
     * 
     * @param containerLooseTyp containerLooseTyp に設定する
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * customTimingTyp のゲッターメソッドです。
     * 
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * customTimingTyp のセッターメソッドです。
     * 
     * @param customTimingTyp customTimingTyp に設定する
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * shippingLot のゲッターメソッドです。
     * 
     * @return the shippingLot
     */
    public BigDecimal getShippingLot() {
        return shippingLot;
    }

    /**
     * shippingLot のセッターメソッドです。
     * 
     * @param shippingLot shippingLot に設定する
     */
    public void setShippingLot(BigDecimal shippingLot) {
        this.shippingLot = shippingLot;
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
     * scanQty のゲッターメソッドです。
     * 
     * @return the scanQty
     */
    public BigDecimal getScanQty() {
        return scanQty;
    }

    /**
     * scanQty のセッターメソッドです。
     * 
     * @param scanQty scanQty に設定する
     */
    public void setScanQty(BigDecimal scanQty) {
        this.scanQty = scanQty;
    }

    /**
     * stkQty のゲッターメソッドです。
     * 
     * @return the stkQty
     */
    public BigDecimal getStkQty() {
        return stkQty;
    }

    /**
     * stkQty のセッターメソッドです。
     * 
     * @param stkQty stkQty に設定する
     */
    public void setStkQty(BigDecimal stkQty) {
        this.stkQty = stkQty;
    }

    /**
     * odrQty のゲッターメソッドです。
     * 
     * @return the odrQty
     */
    public BigDecimal getOdrQty() {
        return odrQty;
    }

    /**
     * odrQty のセッターメソッドです。
     * 
     * @param odrQty odrQty に設定する
     */
    public void setOdrQty(BigDecimal odrQty) {
        this.odrQty = odrQty;
    }

    /**
     * leftInstrQty のゲッターメソッドです。
     * 
     * @return the leftInstrQty
     */
    public BigDecimal getLeftInstrQty() {
        return leftInstrQty;
    }

    /**
     * leftInstrQty のセッターメソッドです。
     * 
     * @param leftInstrQty leftInstrQty に設定する
     */
    public void setLeftInstrQty(BigDecimal leftInstrQty) {
        this.leftInstrQty = leftInstrQty;
    }

    /**
     * overInstrQty のゲッターメソッドです。
     * 
     * @return the overInstrQty
     */
    public BigDecimal getOverInstrQty() {
        return overInstrQty;
    }

    /**
     * overInstrQty のセッターメソッドです。
     * 
     * @param overInstrQty overInstrQty に設定する
     */
    public void setOverInstrQty(BigDecimal overInstrQty) {
        this.overInstrQty = overInstrQty;
    }

    /**
     * itemNoChkFlg のゲッターメソッドです。
     * 
     * @return the itemNoChkFlg
     */
    public String getItemNoChkFlg() {
        return itemNoChkFlg;
    }

    /**
     * itemNoChkFlg のセッターメソッドです。
     * 
     * @param itemNoChkFlg itemNoChkFlg に設定する
     */
    public void setItemNoChkFlg(String itemNoChkFlg) {
        this.itemNoChkFlg = itemNoChkFlg;
    }

    /**
     * mixPltzCompltFlg のゲッターメソッドです。
     * 
     * @return the mixPltzCompltFlg
     */
    public String getMixPltzCompltFlg() {
        return mixPltzCompltFlg;
    }

    /**
     * mixPltzCompltFlg のセッターメソッドです。
     * 
     * @param mixPltzCompltFlg mixPltzCompltFlg に設定する
     */
    public void setMixPltzCompltFlg(String mixPltzCompltFlg) {
        this.mixPltzCompltFlg = mixPltzCompltFlg;
    }

    /**
     * mixWhChkFlg のゲッターメソッドです。
     * 
     * @return the mixWhChkFlg
     */
    public String getMixWhChkFlg() {
        return mixWhChkFlg;
    }

    /**
     * mixWhChkFlg のセッターメソッドです。
     * 
     * @param mixWhChkFlg mixWhChkFlg に設定する
     */
    public void setMixWhChkFlg(String mixWhChkFlg) {
        this.mixWhChkFlg = mixWhChkFlg;
    }

    /**
     * mltInBoxAllowFlg のゲッターメソッドです。
     * 
     * @return the mltInBoxAllowFlg
     */
    public String getMltInBoxAllowFlg() {
        return mltInBoxAllowFlg;
    }

    /**
     * mltInBoxAllowFlg のセッターメソッドです。
     * 
     * @param mltInBoxAllowFlg mltInBoxAllowFlg に設定する
     */
    public void setMltInBoxAllowFlg(String mltInBoxAllowFlg) {
        this.mltInBoxAllowFlg = mltInBoxAllowFlg;
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

}
