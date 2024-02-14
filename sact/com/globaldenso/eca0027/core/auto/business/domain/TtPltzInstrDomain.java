/*
 * PROJECT：eca0027
 * 
 * TtPltzInstr のDomainクラス
 * テーブル概要：TT_PLTZ_INSTR
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
import java.sql.Timestamp;

/**
 * TtPltzInstr のDomainクラスです。<BR>
 * テーブル概要：TT_PLTZ_INSTR<BR>
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
public class TtPltzInstrDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * PLTZ_INSTR_NO
     */
    private String pltzInstrNo;

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
     * PLTZ_INSTR_STATUS
     */
    private String pltzInstrStatus;

    /**
     * PLTZ_INSTR_DT
     */
    private Date pltzInstrDt;

    /**
     * PLTZ_INSTR_ISSUER_ID
     */
    private String pltzInstrIssuerId;

    /**
     * PLTZ_INSTR_NM
     */
    private String pltzInstrNm;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * CML_PRINT_OUT_DT
     */
    private Date cmlPrintOutDt;

    /**
     * COLLATE_METH_TYP
     */
    private String collateMethTyp;

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
    public TtPltzInstrDomain() {
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
     * pltzInstrStatus のゲッターメソッドです。
     * 
     * @return the pltzInstrStatus
     */
    public String getPltzInstrStatus() {
        return pltzInstrStatus;
    }

    /**
     * pltzInstrStatus のセッターメソッドです。
     * 
     * @param pltzInstrStatus pltzInstrStatus に設定する
     */
    public void setPltzInstrStatus(String pltzInstrStatus) {
        this.pltzInstrStatus = pltzInstrStatus;
    }

    /**
     * pltzInstrDt のゲッターメソッドです。
     * 
     * @return the pltzInstrDt
     */
    public Date getPltzInstrDt() {
        return pltzInstrDt;
    }

    /**
     * pltzInstrDt のセッターメソッドです。
     * 
     * @param pltzInstrDt pltzInstrDt に設定する
     */
    public void setPltzInstrDt(Date pltzInstrDt) {
        this.pltzInstrDt = pltzInstrDt;
    }

    /**
     * pltzInstrIssuerId のゲッターメソッドです。
     * 
     * @return the pltzInstrIssuerId
     */
    public String getPltzInstrIssuerId() {
        return pltzInstrIssuerId;
    }

    /**
     * pltzInstrIssuerId のセッターメソッドです。
     * 
     * @param pltzInstrIssuerId pltzInstrIssuerId に設定する
     */
    public void setPltzInstrIssuerId(String pltzInstrIssuerId) {
        this.pltzInstrIssuerId = pltzInstrIssuerId;
    }

    /**
     * pltzInstrNm のゲッターメソッドです。
     * 
     * @return the pltzInstrNm
     */
    public String getPltzInstrNm() {
        return pltzInstrNm;
    }

    /**
     * pltzInstrNm のセッターメソッドです。
     * 
     * @param pltzInstrNm pltzInstrNm に設定する
     */
    public void setPltzInstrNm(String pltzInstrNm) {
        this.pltzInstrNm = pltzInstrNm;
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
     * cmlPrintOutDt のゲッターメソッドです。
     * 
     * @return the cmlPrintOutDt
     */
    public Date getCmlPrintOutDt() {
        return cmlPrintOutDt;
    }

    /**
     * cmlPrintOutDt のセッターメソッドです。
     * 
     * @param cmlPrintOutDt cmlPrintOutDt に設定する
     */
    public void setCmlPrintOutDt(Date cmlPrintOutDt) {
        this.cmlPrintOutDt = cmlPrintOutDt;
    }

    /**
     * collateMethTyp のゲッターメソッドです。
     * 
     * @return the collateMethTyp
     */
    public String getCollateMethTyp() {
        return collateMethTyp;
    }

    /**
     * collateMethTyp のセッターメソッドです。
     * 
     * @param collateMethTyp collateMethTyp に設定する
     */
    public void setCollateMethTyp(String collateMethTyp) {
        this.collateMethTyp = collateMethTyp;
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
