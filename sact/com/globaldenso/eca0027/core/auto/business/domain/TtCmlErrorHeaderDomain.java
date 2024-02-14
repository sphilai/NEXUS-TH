/*
 * PROJECT：eca0027
 * 
 * TtCmlErrorHeader のDomainクラス
 * テーブル概要：TT_CML_ERROR_HEADER
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

/**
 * TtCmlErrorHeader のDomainクラスです。<BR>
 * テーブル概要：TT_CML_ERROR_HEADER<BR>
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
public class TtCmlErrorHeaderDomain extends AbstractDomain implements Serializable {

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
    public TtCmlErrorHeaderDomain() {
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
