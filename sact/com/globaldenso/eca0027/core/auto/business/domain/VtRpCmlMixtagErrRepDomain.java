/*
 * PROJECT：eca0027
 * 
 * VtRpCmlMixtagErrRep のDomainクラス
 * テーブル概要：VT_RP_CML_MIXTAG_ERR_REP
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/10  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 * VtRpCmlMixtagErrRep のDomainクラスです。<BR>
 * テーブル概要：VT_RP_CML_MIXTAG_ERR_REP<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/10 11:06:48<BR>
 * 
 * テーブル定義から2014/06/10に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpCmlMixtagErrRepDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;

    /**
     * PALLET_NO
     */
    private String palletNo;

    /**
     * EXP_PACKING_ISSUER_NM
     */
    private String expPackingIssuerNm;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * PLTZ_INSTR_NO
     */
    private String pltzInstrNo;

    /**
     * CUSTOMER_CD
     */
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;

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
     * WH_COMP_CD
     */
    private String whCompCd;

    /**
     * WH_CD
     */
    private String whCd;

    /**
     * CHK_RESULT_A
     */
    private String chkResultA;

    /**
     * CHK_RESULT_B
     */
    private String chkResultB;

    /**
     * CHK_RESULT_C
     */
    private String chkResultC;

    /**
     * CHK_RESULT_D
     */
    private String chkResultD;

    /**
     * CHK_RESULT_E
     */
    private String chkResultE;

    /**
     * CHK_RESULT_F
     */
    private String chkResultF;

    /**
     * CHK_RESULT_G
     */
    private String chkResultG;

    /**
     * CHK_RESULT_H
     */
    private String chkResultH;

    /**
     * CHK_RESULT_I
     */
    private String chkResultI;

    /**
     * CHK_RESULT_J
     */
    private String chkResultJ;

    /**
     * CHK_RESULT_K
     */
    private String chkResultK;

    /**
     * CHK_RESULT_L
     */
    private String chkResultL;

    /**
     * CHK_RESULT_M
     */
    private String chkResultM;

    /**
     * CHK_RESULT_N
     */
    private String chkResultN;

    /**
     * CHK_RESULT_O
     */
    private String chkResultO;

    /**
     * CHK_RESULT_P
     */
    private String chkResultP;

    /**
     * CHK_RESULT_Q
     */
    private String chkResultQ;

    /**
     * CHK_RESULT_R
     */
    private String chkResultR;

    /**
     * CHK_RESULT_S
     */
    private String chkResultS;

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
     * MIX_TAG_FLG
     */
    private String mixTagFlg;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpCmlMixtagErrRepDomain() {
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
     * expPackingIssuerNm のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNm
     */
    public String getExpPackingIssuerNm() {
        return expPackingIssuerNm;
    }

    /**
     * expPackingIssuerNm のセッターメソッドです。
     * 
     * @param expPackingIssuerNm expPackingIssuerNm に設定する
     */
    public void setExpPackingIssuerNm(String expPackingIssuerNm) {
        this.expPackingIssuerNm = expPackingIssuerNm;
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
     * whCompCd のゲッターメソッドです。
     * 
     * @return the whCompCd
     */
    public String getWhCompCd() {
        return whCompCd;
    }

    /**
     * whCompCd のセッターメソッドです。
     * 
     * @param whCompCd whCompCd に設定する
     */
    public void setWhCompCd(String whCompCd) {
        this.whCompCd = whCompCd;
    }

    /**
     * whCd のゲッターメソッドです。
     * 
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * whCd のセッターメソッドです。
     * 
     * @param whCd whCd に設定する
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    /**
     * chkResultA のゲッターメソッドです。
     * 
     * @return the chkResultA
     */
    public String getChkResultA() {
        return chkResultA;
    }

    /**
     * chkResultA のセッターメソッドです。
     * 
     * @param chkResultA chkResultA に設定する
     */
    public void setChkResultA(String chkResultA) {
        this.chkResultA = chkResultA;
    }

    /**
     * chkResultB のゲッターメソッドです。
     * 
     * @return the chkResultB
     */
    public String getChkResultB() {
        return chkResultB;
    }

    /**
     * chkResultB のセッターメソッドです。
     * 
     * @param chkResultB chkResultB に設定する
     */
    public void setChkResultB(String chkResultB) {
        this.chkResultB = chkResultB;
    }

    /**
     * chkResultC のゲッターメソッドです。
     * 
     * @return the chkResultC
     */
    public String getChkResultC() {
        return chkResultC;
    }

    /**
     * chkResultC のセッターメソッドです。
     * 
     * @param chkResultC chkResultC に設定する
     */
    public void setChkResultC(String chkResultC) {
        this.chkResultC = chkResultC;
    }

    /**
     * chkResultD のゲッターメソッドです。
     * 
     * @return the chkResultD
     */
    public String getChkResultD() {
        return chkResultD;
    }

    /**
     * chkResultD のセッターメソッドです。
     * 
     * @param chkResultD chkResultD に設定する
     */
    public void setChkResultD(String chkResultD) {
        this.chkResultD = chkResultD;
    }

    /**
     * chkResultE のゲッターメソッドです。
     * 
     * @return the chkResultE
     */
    public String getChkResultE() {
        return chkResultE;
    }

    /**
     * chkResultE のセッターメソッドです。
     * 
     * @param chkResultE chkResultE に設定する
     */
    public void setChkResultE(String chkResultE) {
        this.chkResultE = chkResultE;
    }

    /**
     * chkResultF のゲッターメソッドです。
     * 
     * @return the chkResultF
     */
    public String getChkResultF() {
        return chkResultF;
    }

    /**
     * chkResultF のセッターメソッドです。
     * 
     * @param chkResultF chkResultF に設定する
     */
    public void setChkResultF(String chkResultF) {
        this.chkResultF = chkResultF;
    }

    /**
     * chkResultG のゲッターメソッドです。
     * 
     * @return the chkResultG
     */
    public String getChkResultG() {
        return chkResultG;
    }

    /**
     * chkResultG のセッターメソッドです。
     * 
     * @param chkResultG chkResultG に設定する
     */
    public void setChkResultG(String chkResultG) {
        this.chkResultG = chkResultG;
    }

    /**
     * chkResultH のゲッターメソッドです。
     * 
     * @return the chkResultH
     */
    public String getChkResultH() {
        return chkResultH;
    }

    /**
     * chkResultH のセッターメソッドです。
     * 
     * @param chkResultH chkResultH に設定する
     */
    public void setChkResultH(String chkResultH) {
        this.chkResultH = chkResultH;
    }

    /**
     * chkResultI のゲッターメソッドです。
     * 
     * @return the chkResultI
     */
    public String getChkResultI() {
        return chkResultI;
    }

    /**
     * chkResultI のセッターメソッドです。
     * 
     * @param chkResultI chkResultI に設定する
     */
    public void setChkResultI(String chkResultI) {
        this.chkResultI = chkResultI;
    }

    /**
     * chkResultJ のゲッターメソッドです。
     * 
     * @return the chkResultJ
     */
    public String getChkResultJ() {
        return chkResultJ;
    }

    /**
     * chkResultJ のセッターメソッドです。
     * 
     * @param chkResultJ chkResultJ に設定する
     */
    public void setChkResultJ(String chkResultJ) {
        this.chkResultJ = chkResultJ;
    }

    /**
     * chkResultK のゲッターメソッドです。
     * 
     * @return the chkResultK
     */
    public String getChkResultK() {
        return chkResultK;
    }

    /**
     * chkResultK のセッターメソッドです。
     * 
     * @param chkResultK chkResultK に設定する
     */
    public void setChkResultK(String chkResultK) {
        this.chkResultK = chkResultK;
    }

    /**
     * chkResultL のゲッターメソッドです。
     * 
     * @return the chkResultL
     */
    public String getChkResultL() {
        return chkResultL;
    }

    /**
     * chkResultL のセッターメソッドです。
     * 
     * @param chkResultL chkResultL に設定する
     */
    public void setChkResultL(String chkResultL) {
        this.chkResultL = chkResultL;
    }

    /**
     * chkResultM のゲッターメソッドです。
     * 
     * @return the chkResultM
     */
    public String getChkResultM() {
        return chkResultM;
    }

    /**
     * chkResultM のセッターメソッドです。
     * 
     * @param chkResultM chkResultM に設定する
     */
    public void setChkResultM(String chkResultM) {
        this.chkResultM = chkResultM;
    }

    /**
     * chkResultN のゲッターメソッドです。
     * 
     * @return the chkResultN
     */
    public String getChkResultN() {
        return chkResultN;
    }

    /**
     * chkResultN のセッターメソッドです。
     * 
     * @param chkResultN chkResultN に設定する
     */
    public void setChkResultN(String chkResultN) {
        this.chkResultN = chkResultN;
    }

    /**
     * chkResultO のゲッターメソッドです。
     * 
     * @return the chkResultO
     */
    public String getChkResultO() {
        return chkResultO;
    }

    /**
     * chkResultO のセッターメソッドです。
     * 
     * @param chkResultO chkResultO に設定する
     */
    public void setChkResultO(String chkResultO) {
        this.chkResultO = chkResultO;
    }

    /**
     * chkResultP のゲッターメソッドです。
     * 
     * @return the chkResultP
     */
    public String getChkResultP() {
        return chkResultP;
    }

    /**
     * chkResultP のセッターメソッドです。
     * 
     * @param chkResultP chkResultP に設定する
     */
    public void setChkResultP(String chkResultP) {
        this.chkResultP = chkResultP;
    }

    /**
     * chkResultQ のゲッターメソッドです。
     * 
     * @return the chkResultQ
     */
    public String getChkResultQ() {
        return chkResultQ;
    }

    /**
     * chkResultQ のセッターメソッドです。
     * 
     * @param chkResultQ chkResultQ に設定する
     */
    public void setChkResultQ(String chkResultQ) {
        this.chkResultQ = chkResultQ;
    }

    /**
     * chkResultR のゲッターメソッドです。
     * 
     * @return the chkResultR
     */
    public String getChkResultR() {
        return chkResultR;
    }

    /**
     * chkResultR のセッターメソッドです。
     * 
     * @param chkResultR chkResultR に設定する
     */
    public void setChkResultR(String chkResultR) {
        this.chkResultR = chkResultR;
    }

    /**
     * chkResultS のゲッターメソッドです。
     * 
     * @return the chkResultS
     */
    public String getChkResultS() {
        return chkResultS;
    }

    /**
     * chkResultS のセッターメソッドです。
     * 
     * @param chkResultS chkResultS に設定する
     */
    public void setChkResultS(String chkResultS) {
        this.chkResultS = chkResultS;
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

}
