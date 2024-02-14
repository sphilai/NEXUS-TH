/*
 * PROJECT：eca0027
 * 
 * TtPltzInstr の検索条件Domainクラス
 * テーブル概要：TT_PLTZ_INSTR
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.sql.Timestamp;

/**
 * TtPltzInstr の検索条件Domainクラスです。<BR>
 * テーブル概要：TT_PLTZ_INSTR<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class TtPltzInstrCriteriaDomain extends AbstractDomain implements Serializable {

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
     * PLTZ_INSTR_NO（大なり）
     */
    private String pltzInstrNoGreaterThan;

    /**
     * PLTZ_INSTR_NO（大なりイコール）
     */
    private String pltzInstrNoGreaterThanEqual;

    /**
     * PLTZ_INSTR_NO（小なり）
     */
    private String pltzInstrNoLessThan;

    /**
     * PLTZ_INSTR_NO（小なりイコール）
     */
    private String pltzInstrNoLessThanEqual;

    /**
     * PLTZ_INSTR_NO（前方一致）
     */
    private String pltzInstrNoLikeFront;

    /**
     * SHIPPER_CD（大なり）
     */
    private String shipperCdGreaterThan;

    /**
     * SHIPPER_CD（大なりイコール）
     */
    private String shipperCdGreaterThanEqual;

    /**
     * SHIPPER_CD（小なり）
     */
    private String shipperCdLessThan;

    /**
     * SHIPPER_CD（小なりイコール）
     */
    private String shipperCdLessThanEqual;

    /**
     * SHIPPER_CD（前方一致）
     */
    private String shipperCdLikeFront;

    /**
     * CUSTOMER_CD（大なり）
     */
    private String customerCdGreaterThan;

    /**
     * CUSTOMER_CD（大なりイコール）
     */
    private String customerCdGreaterThanEqual;

    /**
     * CUSTOMER_CD（小なり）
     */
    private String customerCdLessThan;

    /**
     * CUSTOMER_CD（小なりイコール）
     */
    private String customerCdLessThanEqual;

    /**
     * CUSTOMER_CD（前方一致）
     */
    private String customerCdLikeFront;

    /**
     * LGCY_SHIP_TO（大なり）
     */
    private String lgcyShipToGreaterThan;

    /**
     * LGCY_SHIP_TO（大なりイコール）
     */
    private String lgcyShipToGreaterThanEqual;

    /**
     * LGCY_SHIP_TO（小なり）
     */
    private String lgcyShipToLessThan;

    /**
     * LGCY_SHIP_TO（小なりイコール）
     */
    private String lgcyShipToLessThanEqual;

    /**
     * LGCY_SHIP_TO（前方一致）
     */
    private String lgcyShipToLikeFront;

    /**
     * TRNS_CD（大なり）
     */
    private String trnsCdGreaterThan;

    /**
     * TRNS_CD（大なりイコール）
     */
    private String trnsCdGreaterThanEqual;

    /**
     * TRNS_CD（小なり）
     */
    private String trnsCdLessThan;

    /**
     * TRNS_CD（小なりイコール）
     */
    private String trnsCdLessThanEqual;

    /**
     * TRNS_CD（前方一致）
     */
    private String trnsCdLikeFront;

    /**
     * PLNT_CD（大なり）
     */
    private String plntCdGreaterThan;

    /**
     * PLNT_CD（大なりイコール）
     */
    private String plntCdGreaterThanEqual;

    /**
     * PLNT_CD（小なり）
     */
    private String plntCdLessThan;

    /**
     * PLNT_CD（小なりイコール）
     */
    private String plntCdLessThanEqual;

    /**
     * PLNT_CD（前方一致）
     */
    private String plntCdLikeFront;

    /**
     * LGCY_WH_CD（大なり）
     */
    private String lgcyWhCdGreaterThan;

    /**
     * LGCY_WH_CD（大なりイコール）
     */
    private String lgcyWhCdGreaterThanEqual;

    /**
     * LGCY_WH_CD（小なり）
     */
    private String lgcyWhCdLessThan;

    /**
     * LGCY_WH_CD（小なりイコール）
     */
    private String lgcyWhCdLessThanEqual;

    /**
     * LGCY_WH_CD（前方一致）
     */
    private String lgcyWhCdLikeFront;

    /**
     * PLTZ_INSTR_STATUS（大なり）
     */
    private String pltzInstrStatusGreaterThan;

    /**
     * PLTZ_INSTR_STATUS（大なりイコール）
     */
    private String pltzInstrStatusGreaterThanEqual;

    /**
     * PLTZ_INSTR_STATUS（小なり）
     */
    private String pltzInstrStatusLessThan;

    /**
     * PLTZ_INSTR_STATUS（小なりイコール）
     */
    private String pltzInstrStatusLessThanEqual;

    /**
     * PLTZ_INSTR_STATUS（前方一致）
     */
    private String pltzInstrStatusLikeFront;

    /**
     * PLTZ_INSTR_DT（大なりイコール）
     */
    private Date pltzInstrDtGreaterThanEqual;

    /**
     * PLTZ_INSTR_DT（小なりイコール）
     */
    private Date pltzInstrDtLessThanEqual;

    /**
     * PLTZ_INSTR_ISSUER_ID（大なり）
     */
    private String pltzInstrIssuerIdGreaterThan;

    /**
     * PLTZ_INSTR_ISSUER_ID（大なりイコール）
     */
    private String pltzInstrIssuerIdGreaterThanEqual;

    /**
     * PLTZ_INSTR_ISSUER_ID（小なり）
     */
    private String pltzInstrIssuerIdLessThan;

    /**
     * PLTZ_INSTR_ISSUER_ID（小なりイコール）
     */
    private String pltzInstrIssuerIdLessThanEqual;

    /**
     * PLTZ_INSTR_ISSUER_ID（前方一致）
     */
    private String pltzInstrIssuerIdLikeFront;

    /**
     * PLTZ_INSTR_NM（大なり）
     */
    private String pltzInstrNmGreaterThan;

    /**
     * PLTZ_INSTR_NM（大なりイコール）
     */
    private String pltzInstrNmGreaterThanEqual;

    /**
     * PLTZ_INSTR_NM（小なり）
     */
    private String pltzInstrNmLessThan;

    /**
     * PLTZ_INSTR_NM（小なりイコール）
     */
    private String pltzInstrNmLessThanEqual;

    /**
     * PLTZ_INSTR_NM（前方一致）
     */
    private String pltzInstrNmLikeFront;

    /**
     * WEIGHT_UNIT（大なり）
     */
    private String weightUnitGreaterThan;

    /**
     * WEIGHT_UNIT（大なりイコール）
     */
    private String weightUnitGreaterThanEqual;

    /**
     * WEIGHT_UNIT（小なり）
     */
    private String weightUnitLessThan;

    /**
     * WEIGHT_UNIT（小なりイコール）
     */
    private String weightUnitLessThanEqual;

    /**
     * WEIGHT_UNIT（前方一致）
     */
    private String weightUnitLikeFront;

    /**
     * CML_PRINT_OUT_DT（大なりイコール）
     */
    private Date cmlPrintOutDtGreaterThanEqual;

    /**
     * CML_PRINT_OUT_DT（小なりイコール）
     */
    private Date cmlPrintOutDtLessThanEqual;

    /**
     * COLLATE_METH_TYP（大なり）
     */
    private String collateMethTypGreaterThan;

    /**
     * COLLATE_METH_TYP（大なりイコール）
     */
    private String collateMethTypGreaterThanEqual;

    /**
     * COLLATE_METH_TYP（小なり）
     */
    private String collateMethTypLessThan;

    /**
     * COLLATE_METH_TYP（小なりイコール）
     */
    private String collateMethTypLessThanEqual;

    /**
     * COLLATE_METH_TYP（前方一致）
     */
    private String collateMethTypLikeFront;

    /**
     * COM_UPDATE_FUNC_ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * COM_UPDATE_FUNC_ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * COM_UPDATE_FUNC_ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * COM_UPDATE_USER_ID（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * COM_UPDATE_USER_ID（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * COM_UPDATE_USER_ID（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * COM_UPDATE_USER_ID（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * COM_UPDATE_USER_ID（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * COM_CREATE_FUNC_ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * COM_CREATE_FUNC_ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * COM_CREATE_FUNC_ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * COM_CREATE_FUNC_ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * COM_CREATE_FUNC_ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * COM_CREATE_USER_ID（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * COM_CREATE_USER_ID（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * COM_CREATE_USER_ID（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * COM_CREATE_USER_ID（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * COM_CREATE_USER_ID（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzInstrCriteriaDomain() {
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

    /**
     * pltzInstrNoGreaterThan のゲッターメソッドです。
     * 
     * @return the pltzInstrNoGreaterThan
     */
    public String getPltzInstrNoGreaterThan() {
        return pltzInstrNoGreaterThan;
    }

    /**
     * pltzInstrNoGreaterThan のセッターメソッドです。
     * 
     * @param pltzInstrNoGreaterThan pltzInstrNoGreaterThan に設定する
     */
    public void setPltzInstrNoGreaterThan(String pltzInstrNoGreaterThan) {
        this.pltzInstrNoGreaterThan = pltzInstrNoGreaterThan;
    }

    /**
     * pltzInstrNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrNoGreaterThanEqual
     */
    public String getPltzInstrNoGreaterThanEqual() {
        return pltzInstrNoGreaterThanEqual;
    }

    /**
     * pltzInstrNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrNoGreaterThanEqual pltzInstrNoGreaterThanEqual に設定する
     */
    public void setPltzInstrNoGreaterThanEqual(String pltzInstrNoGreaterThanEqual) {
        this.pltzInstrNoGreaterThanEqual = pltzInstrNoGreaterThanEqual;
    }

    /**
     * pltzInstrNoLessThan のゲッターメソッドです。
     * 
     * @return the pltzInstrNoLessThan
     */
    public String getPltzInstrNoLessThan() {
        return pltzInstrNoLessThan;
    }

    /**
     * pltzInstrNoLessThan のセッターメソッドです。
     * 
     * @param pltzInstrNoLessThan pltzInstrNoLessThan に設定する
     */
    public void setPltzInstrNoLessThan(String pltzInstrNoLessThan) {
        this.pltzInstrNoLessThan = pltzInstrNoLessThan;
    }

    /**
     * pltzInstrNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrNoLessThanEqual
     */
    public String getPltzInstrNoLessThanEqual() {
        return pltzInstrNoLessThanEqual;
    }

    /**
     * pltzInstrNoLessThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrNoLessThanEqual pltzInstrNoLessThanEqual に設定する
     */
    public void setPltzInstrNoLessThanEqual(String pltzInstrNoLessThanEqual) {
        this.pltzInstrNoLessThanEqual = pltzInstrNoLessThanEqual;
    }

    /**
     * pltzInstrNoLikeFront のゲッターメソッドです。
     * 
     * @return the pltzInstrNoLikeFront
     */
    public String getPltzInstrNoLikeFront() {
        return pltzInstrNoLikeFront;
    }

    /**
     * pltzInstrNoLikeFront のセッターメソッドです。
     * 
     * @param pltzInstrNoLikeFront pltzInstrNoLikeFront に設定する
     */
    public void setPltzInstrNoLikeFront(String pltzInstrNoLikeFront) {
        this.pltzInstrNoLikeFront = pltzInstrNoLikeFront;
    }

    /**
     * shipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThan
     */
    public String getShipperCdGreaterThan() {
        return shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThan のセッターメソッドです。
     * 
     * @param shipperCdGreaterThan shipperCdGreaterThan に設定する
     */
    public void setShipperCdGreaterThan(String shipperCdGreaterThan) {
        this.shipperCdGreaterThan = shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThanEqual
     */
    public String getShipperCdGreaterThanEqual() {
        return shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCdGreaterThanEqual shipperCdGreaterThanEqual に設定する
     */
    public void setShipperCdGreaterThanEqual(String shipperCdGreaterThanEqual) {
        this.shipperCdGreaterThanEqual = shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdLessThan のゲッターメソッドです。
     * 
     * @return the shipperCdLessThan
     */
    public String getShipperCdLessThan() {
        return shipperCdLessThan;
    }

    /**
     * shipperCdLessThan のセッターメソッドです。
     * 
     * @param shipperCdLessThan shipperCdLessThan に設定する
     */
    public void setShipperCdLessThan(String shipperCdLessThan) {
        this.shipperCdLessThan = shipperCdLessThan;
    }

    /**
     * shipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdLessThanEqual
     */
    public String getShipperCdLessThanEqual() {
        return shipperCdLessThanEqual;
    }

    /**
     * shipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipperCdLessThanEqual shipperCdLessThanEqual に設定する
     */
    public void setShipperCdLessThanEqual(String shipperCdLessThanEqual) {
        this.shipperCdLessThanEqual = shipperCdLessThanEqual;
    }

    /**
     * shipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipperCdLikeFront
     */
    public String getShipperCdLikeFront() {
        return shipperCdLikeFront;
    }

    /**
     * shipperCdLikeFront のセッターメソッドです。
     * 
     * @param shipperCdLikeFront shipperCdLikeFront に設定する
     */
    public void setShipperCdLikeFront(String shipperCdLikeFront) {
        this.shipperCdLikeFront = shipperCdLikeFront;
    }

    /**
     * customerCdGreaterThan のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThan
     */
    public String getCustomerCdGreaterThan() {
        return customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThan のセッターメソッドです。
     * 
     * @param customerCdGreaterThan customerCdGreaterThan に設定する
     */
    public void setCustomerCdGreaterThan(String customerCdGreaterThan) {
        this.customerCdGreaterThan = customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThanEqual
     */
    public String getCustomerCdGreaterThanEqual() {
        return customerCdGreaterThanEqual;
    }

    /**
     * customerCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerCdGreaterThanEqual customerCdGreaterThanEqual に設定する
     */
    public void setCustomerCdGreaterThanEqual(String customerCdGreaterThanEqual) {
        this.customerCdGreaterThanEqual = customerCdGreaterThanEqual;
    }

    /**
     * customerCdLessThan のゲッターメソッドです。
     * 
     * @return the customerCdLessThan
     */
    public String getCustomerCdLessThan() {
        return customerCdLessThan;
    }

    /**
     * customerCdLessThan のセッターメソッドです。
     * 
     * @param customerCdLessThan customerCdLessThan に設定する
     */
    public void setCustomerCdLessThan(String customerCdLessThan) {
        this.customerCdLessThan = customerCdLessThan;
    }

    /**
     * customerCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdLessThanEqual
     */
    public String getCustomerCdLessThanEqual() {
        return customerCdLessThanEqual;
    }

    /**
     * customerCdLessThanEqual のセッターメソッドです。
     * 
     * @param customerCdLessThanEqual customerCdLessThanEqual に設定する
     */
    public void setCustomerCdLessThanEqual(String customerCdLessThanEqual) {
        this.customerCdLessThanEqual = customerCdLessThanEqual;
    }

    /**
     * customerCdLikeFront のゲッターメソッドです。
     * 
     * @return the customerCdLikeFront
     */
    public String getCustomerCdLikeFront() {
        return customerCdLikeFront;
    }

    /**
     * customerCdLikeFront のセッターメソッドです。
     * 
     * @param customerCdLikeFront customerCdLikeFront に設定する
     */
    public void setCustomerCdLikeFront(String customerCdLikeFront) {
        this.customerCdLikeFront = customerCdLikeFront;
    }

    /**
     * lgcyShipToGreaterThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThan
     */
    public String getLgcyShipToGreaterThan() {
        return lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThan のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThan lgcyShipToGreaterThan に設定する
     */
    public void setLgcyShipToGreaterThan(String lgcyShipToGreaterThan) {
        this.lgcyShipToGreaterThan = lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThanEqual
     */
    public String getLgcyShipToGreaterThanEqual() {
        return lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToGreaterThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThanEqual lgcyShipToGreaterThanEqual に設定する
     */
    public void setLgcyShipToGreaterThanEqual(String lgcyShipToGreaterThanEqual) {
        this.lgcyShipToGreaterThanEqual = lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToLessThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThan
     */
    public String getLgcyShipToLessThan() {
        return lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThan のセッターメソッドです。
     * 
     * @param lgcyShipToLessThan lgcyShipToLessThan に設定する
     */
    public void setLgcyShipToLessThan(String lgcyShipToLessThan) {
        this.lgcyShipToLessThan = lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThanEqual
     */
    public String getLgcyShipToLessThanEqual() {
        return lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLessThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToLessThanEqual lgcyShipToLessThanEqual に設定する
     */
    public void setLgcyShipToLessThanEqual(String lgcyShipToLessThanEqual) {
        this.lgcyShipToLessThanEqual = lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLikeFront のゲッターメソッドです。
     * 
     * @return the lgcyShipToLikeFront
     */
    public String getLgcyShipToLikeFront() {
        return lgcyShipToLikeFront;
    }

    /**
     * lgcyShipToLikeFront のセッターメソッドです。
     * 
     * @param lgcyShipToLikeFront lgcyShipToLikeFront に設定する
     */
    public void setLgcyShipToLikeFront(String lgcyShipToLikeFront) {
        this.lgcyShipToLikeFront = lgcyShipToLikeFront;
    }

    /**
     * trnsCdGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThan
     */
    public String getTrnsCdGreaterThan() {
        return trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThan のセッターメソッドです。
     * 
     * @param trnsCdGreaterThan trnsCdGreaterThan に設定する
     */
    public void setTrnsCdGreaterThan(String trnsCdGreaterThan) {
        this.trnsCdGreaterThan = trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThanEqual
     */
    public String getTrnsCdGreaterThanEqual() {
        return trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsCdGreaterThanEqual trnsCdGreaterThanEqual に設定する
     */
    public void setTrnsCdGreaterThanEqual(String trnsCdGreaterThanEqual) {
        this.trnsCdGreaterThanEqual = trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdLessThan のゲッターメソッドです。
     * 
     * @return the trnsCdLessThan
     */
    public String getTrnsCdLessThan() {
        return trnsCdLessThan;
    }

    /**
     * trnsCdLessThan のセッターメソッドです。
     * 
     * @param trnsCdLessThan trnsCdLessThan に設定する
     */
    public void setTrnsCdLessThan(String trnsCdLessThan) {
        this.trnsCdLessThan = trnsCdLessThan;
    }

    /**
     * trnsCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdLessThanEqual
     */
    public String getTrnsCdLessThanEqual() {
        return trnsCdLessThanEqual;
    }

    /**
     * trnsCdLessThanEqual のセッターメソッドです。
     * 
     * @param trnsCdLessThanEqual trnsCdLessThanEqual に設定する
     */
    public void setTrnsCdLessThanEqual(String trnsCdLessThanEqual) {
        this.trnsCdLessThanEqual = trnsCdLessThanEqual;
    }

    /**
     * trnsCdLikeFront のゲッターメソッドです。
     * 
     * @return the trnsCdLikeFront
     */
    public String getTrnsCdLikeFront() {
        return trnsCdLikeFront;
    }

    /**
     * trnsCdLikeFront のセッターメソッドです。
     * 
     * @param trnsCdLikeFront trnsCdLikeFront に設定する
     */
    public void setTrnsCdLikeFront(String trnsCdLikeFront) {
        this.trnsCdLikeFront = trnsCdLikeFront;
    }

    /**
     * plntCdGreaterThan のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThan
     */
    public String getPlntCdGreaterThan() {
        return plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThan のセッターメソッドです。
     * 
     * @param plntCdGreaterThan plntCdGreaterThan に設定する
     */
    public void setPlntCdGreaterThan(String plntCdGreaterThan) {
        this.plntCdGreaterThan = plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThanEqual
     */
    public String getPlntCdGreaterThanEqual() {
        return plntCdGreaterThanEqual;
    }

    /**
     * plntCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param plntCdGreaterThanEqual plntCdGreaterThanEqual に設定する
     */
    public void setPlntCdGreaterThanEqual(String plntCdGreaterThanEqual) {
        this.plntCdGreaterThanEqual = plntCdGreaterThanEqual;
    }

    /**
     * plntCdLessThan のゲッターメソッドです。
     * 
     * @return the plntCdLessThan
     */
    public String getPlntCdLessThan() {
        return plntCdLessThan;
    }

    /**
     * plntCdLessThan のセッターメソッドです。
     * 
     * @param plntCdLessThan plntCdLessThan に設定する
     */
    public void setPlntCdLessThan(String plntCdLessThan) {
        this.plntCdLessThan = plntCdLessThan;
    }

    /**
     * plntCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdLessThanEqual
     */
    public String getPlntCdLessThanEqual() {
        return plntCdLessThanEqual;
    }

    /**
     * plntCdLessThanEqual のセッターメソッドです。
     * 
     * @param plntCdLessThanEqual plntCdLessThanEqual に設定する
     */
    public void setPlntCdLessThanEqual(String plntCdLessThanEqual) {
        this.plntCdLessThanEqual = plntCdLessThanEqual;
    }

    /**
     * plntCdLikeFront のゲッターメソッドです。
     * 
     * @return the plntCdLikeFront
     */
    public String getPlntCdLikeFront() {
        return plntCdLikeFront;
    }

    /**
     * plntCdLikeFront のセッターメソッドです。
     * 
     * @param plntCdLikeFront plntCdLikeFront に設定する
     */
    public void setPlntCdLikeFront(String plntCdLikeFront) {
        this.plntCdLikeFront = plntCdLikeFront;
    }

    /**
     * lgcyWhCdGreaterThan のゲッターメソッドです。
     * 
     * @return the lgcyWhCdGreaterThan
     */
    public String getLgcyWhCdGreaterThan() {
        return lgcyWhCdGreaterThan;
    }

    /**
     * lgcyWhCdGreaterThan のセッターメソッドです。
     * 
     * @param lgcyWhCdGreaterThan lgcyWhCdGreaterThan に設定する
     */
    public void setLgcyWhCdGreaterThan(String lgcyWhCdGreaterThan) {
        this.lgcyWhCdGreaterThan = lgcyWhCdGreaterThan;
    }

    /**
     * lgcyWhCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyWhCdGreaterThanEqual
     */
    public String getLgcyWhCdGreaterThanEqual() {
        return lgcyWhCdGreaterThanEqual;
    }

    /**
     * lgcyWhCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param lgcyWhCdGreaterThanEqual lgcyWhCdGreaterThanEqual に設定する
     */
    public void setLgcyWhCdGreaterThanEqual(String lgcyWhCdGreaterThanEqual) {
        this.lgcyWhCdGreaterThanEqual = lgcyWhCdGreaterThanEqual;
    }

    /**
     * lgcyWhCdLessThan のゲッターメソッドです。
     * 
     * @return the lgcyWhCdLessThan
     */
    public String getLgcyWhCdLessThan() {
        return lgcyWhCdLessThan;
    }

    /**
     * lgcyWhCdLessThan のセッターメソッドです。
     * 
     * @param lgcyWhCdLessThan lgcyWhCdLessThan に設定する
     */
    public void setLgcyWhCdLessThan(String lgcyWhCdLessThan) {
        this.lgcyWhCdLessThan = lgcyWhCdLessThan;
    }

    /**
     * lgcyWhCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyWhCdLessThanEqual
     */
    public String getLgcyWhCdLessThanEqual() {
        return lgcyWhCdLessThanEqual;
    }

    /**
     * lgcyWhCdLessThanEqual のセッターメソッドです。
     * 
     * @param lgcyWhCdLessThanEqual lgcyWhCdLessThanEqual に設定する
     */
    public void setLgcyWhCdLessThanEqual(String lgcyWhCdLessThanEqual) {
        this.lgcyWhCdLessThanEqual = lgcyWhCdLessThanEqual;
    }

    /**
     * lgcyWhCdLikeFront のゲッターメソッドです。
     * 
     * @return the lgcyWhCdLikeFront
     */
    public String getLgcyWhCdLikeFront() {
        return lgcyWhCdLikeFront;
    }

    /**
     * lgcyWhCdLikeFront のセッターメソッドです。
     * 
     * @param lgcyWhCdLikeFront lgcyWhCdLikeFront に設定する
     */
    public void setLgcyWhCdLikeFront(String lgcyWhCdLikeFront) {
        this.lgcyWhCdLikeFront = lgcyWhCdLikeFront;
    }

    /**
     * pltzInstrStatusGreaterThan のゲッターメソッドです。
     * 
     * @return the pltzInstrStatusGreaterThan
     */
    public String getPltzInstrStatusGreaterThan() {
        return pltzInstrStatusGreaterThan;
    }

    /**
     * pltzInstrStatusGreaterThan のセッターメソッドです。
     * 
     * @param pltzInstrStatusGreaterThan pltzInstrStatusGreaterThan に設定する
     */
    public void setPltzInstrStatusGreaterThan(String pltzInstrStatusGreaterThan) {
        this.pltzInstrStatusGreaterThan = pltzInstrStatusGreaterThan;
    }

    /**
     * pltzInstrStatusGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrStatusGreaterThanEqual
     */
    public String getPltzInstrStatusGreaterThanEqual() {
        return pltzInstrStatusGreaterThanEqual;
    }

    /**
     * pltzInstrStatusGreaterThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrStatusGreaterThanEqual pltzInstrStatusGreaterThanEqual に設定する
     */
    public void setPltzInstrStatusGreaterThanEqual(String pltzInstrStatusGreaterThanEqual) {
        this.pltzInstrStatusGreaterThanEqual = pltzInstrStatusGreaterThanEqual;
    }

    /**
     * pltzInstrStatusLessThan のゲッターメソッドです。
     * 
     * @return the pltzInstrStatusLessThan
     */
    public String getPltzInstrStatusLessThan() {
        return pltzInstrStatusLessThan;
    }

    /**
     * pltzInstrStatusLessThan のセッターメソッドです。
     * 
     * @param pltzInstrStatusLessThan pltzInstrStatusLessThan に設定する
     */
    public void setPltzInstrStatusLessThan(String pltzInstrStatusLessThan) {
        this.pltzInstrStatusLessThan = pltzInstrStatusLessThan;
    }

    /**
     * pltzInstrStatusLessThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrStatusLessThanEqual
     */
    public String getPltzInstrStatusLessThanEqual() {
        return pltzInstrStatusLessThanEqual;
    }

    /**
     * pltzInstrStatusLessThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrStatusLessThanEqual pltzInstrStatusLessThanEqual に設定する
     */
    public void setPltzInstrStatusLessThanEqual(String pltzInstrStatusLessThanEqual) {
        this.pltzInstrStatusLessThanEqual = pltzInstrStatusLessThanEqual;
    }

    /**
     * pltzInstrStatusLikeFront のゲッターメソッドです。
     * 
     * @return the pltzInstrStatusLikeFront
     */
    public String getPltzInstrStatusLikeFront() {
        return pltzInstrStatusLikeFront;
    }

    /**
     * pltzInstrStatusLikeFront のセッターメソッドです。
     * 
     * @param pltzInstrStatusLikeFront pltzInstrStatusLikeFront に設定する
     */
    public void setPltzInstrStatusLikeFront(String pltzInstrStatusLikeFront) {
        this.pltzInstrStatusLikeFront = pltzInstrStatusLikeFront;
    }

    /**
     * pltzInstrDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrDtGreaterThanEqual
     */
    public Date getPltzInstrDtGreaterThanEqual() {
        return pltzInstrDtGreaterThanEqual;
    }

    /**
     * pltzInstrDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrDtGreaterThanEqual pltzInstrDtGreaterThanEqual に設定する
     */
    public void setPltzInstrDtGreaterThanEqual(Date pltzInstrDtGreaterThanEqual) {
        this.pltzInstrDtGreaterThanEqual = pltzInstrDtGreaterThanEqual;
    }

    /**
     * pltzInstrDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrDtLessThanEqual
     */
    public Date getPltzInstrDtLessThanEqual() {
        return pltzInstrDtLessThanEqual;
    }

    /**
     * pltzInstrDtLessThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrDtLessThanEqual pltzInstrDtLessThanEqual に設定する
     */
    public void setPltzInstrDtLessThanEqual(Date pltzInstrDtLessThanEqual) {
        this.pltzInstrDtLessThanEqual = pltzInstrDtLessThanEqual;
    }

    /**
     * pltzInstrIssuerIdGreaterThan のゲッターメソッドです。
     * 
     * @return the pltzInstrIssuerIdGreaterThan
     */
    public String getPltzInstrIssuerIdGreaterThan() {
        return pltzInstrIssuerIdGreaterThan;
    }

    /**
     * pltzInstrIssuerIdGreaterThan のセッターメソッドです。
     * 
     * @param pltzInstrIssuerIdGreaterThan pltzInstrIssuerIdGreaterThan に設定する
     */
    public void setPltzInstrIssuerIdGreaterThan(String pltzInstrIssuerIdGreaterThan) {
        this.pltzInstrIssuerIdGreaterThan = pltzInstrIssuerIdGreaterThan;
    }

    /**
     * pltzInstrIssuerIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrIssuerIdGreaterThanEqual
     */
    public String getPltzInstrIssuerIdGreaterThanEqual() {
        return pltzInstrIssuerIdGreaterThanEqual;
    }

    /**
     * pltzInstrIssuerIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrIssuerIdGreaterThanEqual pltzInstrIssuerIdGreaterThanEqual に設定する
     */
    public void setPltzInstrIssuerIdGreaterThanEqual(String pltzInstrIssuerIdGreaterThanEqual) {
        this.pltzInstrIssuerIdGreaterThanEqual = pltzInstrIssuerIdGreaterThanEqual;
    }

    /**
     * pltzInstrIssuerIdLessThan のゲッターメソッドです。
     * 
     * @return the pltzInstrIssuerIdLessThan
     */
    public String getPltzInstrIssuerIdLessThan() {
        return pltzInstrIssuerIdLessThan;
    }

    /**
     * pltzInstrIssuerIdLessThan のセッターメソッドです。
     * 
     * @param pltzInstrIssuerIdLessThan pltzInstrIssuerIdLessThan に設定する
     */
    public void setPltzInstrIssuerIdLessThan(String pltzInstrIssuerIdLessThan) {
        this.pltzInstrIssuerIdLessThan = pltzInstrIssuerIdLessThan;
    }

    /**
     * pltzInstrIssuerIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrIssuerIdLessThanEqual
     */
    public String getPltzInstrIssuerIdLessThanEqual() {
        return pltzInstrIssuerIdLessThanEqual;
    }

    /**
     * pltzInstrIssuerIdLessThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrIssuerIdLessThanEqual pltzInstrIssuerIdLessThanEqual に設定する
     */
    public void setPltzInstrIssuerIdLessThanEqual(String pltzInstrIssuerIdLessThanEqual) {
        this.pltzInstrIssuerIdLessThanEqual = pltzInstrIssuerIdLessThanEqual;
    }

    /**
     * pltzInstrIssuerIdLikeFront のゲッターメソッドです。
     * 
     * @return the pltzInstrIssuerIdLikeFront
     */
    public String getPltzInstrIssuerIdLikeFront() {
        return pltzInstrIssuerIdLikeFront;
    }

    /**
     * pltzInstrIssuerIdLikeFront のセッターメソッドです。
     * 
     * @param pltzInstrIssuerIdLikeFront pltzInstrIssuerIdLikeFront に設定する
     */
    public void setPltzInstrIssuerIdLikeFront(String pltzInstrIssuerIdLikeFront) {
        this.pltzInstrIssuerIdLikeFront = pltzInstrIssuerIdLikeFront;
    }

    /**
     * pltzInstrNmGreaterThan のゲッターメソッドです。
     * 
     * @return the pltzInstrNmGreaterThan
     */
    public String getPltzInstrNmGreaterThan() {
        return pltzInstrNmGreaterThan;
    }

    /**
     * pltzInstrNmGreaterThan のセッターメソッドです。
     * 
     * @param pltzInstrNmGreaterThan pltzInstrNmGreaterThan に設定する
     */
    public void setPltzInstrNmGreaterThan(String pltzInstrNmGreaterThan) {
        this.pltzInstrNmGreaterThan = pltzInstrNmGreaterThan;
    }

    /**
     * pltzInstrNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrNmGreaterThanEqual
     */
    public String getPltzInstrNmGreaterThanEqual() {
        return pltzInstrNmGreaterThanEqual;
    }

    /**
     * pltzInstrNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrNmGreaterThanEqual pltzInstrNmGreaterThanEqual に設定する
     */
    public void setPltzInstrNmGreaterThanEqual(String pltzInstrNmGreaterThanEqual) {
        this.pltzInstrNmGreaterThanEqual = pltzInstrNmGreaterThanEqual;
    }

    /**
     * pltzInstrNmLessThan のゲッターメソッドです。
     * 
     * @return the pltzInstrNmLessThan
     */
    public String getPltzInstrNmLessThan() {
        return pltzInstrNmLessThan;
    }

    /**
     * pltzInstrNmLessThan のセッターメソッドです。
     * 
     * @param pltzInstrNmLessThan pltzInstrNmLessThan に設定する
     */
    public void setPltzInstrNmLessThan(String pltzInstrNmLessThan) {
        this.pltzInstrNmLessThan = pltzInstrNmLessThan;
    }

    /**
     * pltzInstrNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrNmLessThanEqual
     */
    public String getPltzInstrNmLessThanEqual() {
        return pltzInstrNmLessThanEqual;
    }

    /**
     * pltzInstrNmLessThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrNmLessThanEqual pltzInstrNmLessThanEqual に設定する
     */
    public void setPltzInstrNmLessThanEqual(String pltzInstrNmLessThanEqual) {
        this.pltzInstrNmLessThanEqual = pltzInstrNmLessThanEqual;
    }

    /**
     * pltzInstrNmLikeFront のゲッターメソッドです。
     * 
     * @return the pltzInstrNmLikeFront
     */
    public String getPltzInstrNmLikeFront() {
        return pltzInstrNmLikeFront;
    }

    /**
     * pltzInstrNmLikeFront のセッターメソッドです。
     * 
     * @param pltzInstrNmLikeFront pltzInstrNmLikeFront に設定する
     */
    public void setPltzInstrNmLikeFront(String pltzInstrNmLikeFront) {
        this.pltzInstrNmLikeFront = pltzInstrNmLikeFront;
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
     * cmlPrintOutDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cmlPrintOutDtGreaterThanEqual
     */
    public Date getCmlPrintOutDtGreaterThanEqual() {
        return cmlPrintOutDtGreaterThanEqual;
    }

    /**
     * cmlPrintOutDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param cmlPrintOutDtGreaterThanEqual cmlPrintOutDtGreaterThanEqual に設定する
     */
    public void setCmlPrintOutDtGreaterThanEqual(Date cmlPrintOutDtGreaterThanEqual) {
        this.cmlPrintOutDtGreaterThanEqual = cmlPrintOutDtGreaterThanEqual;
    }

    /**
     * cmlPrintOutDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the cmlPrintOutDtLessThanEqual
     */
    public Date getCmlPrintOutDtLessThanEqual() {
        return cmlPrintOutDtLessThanEqual;
    }

    /**
     * cmlPrintOutDtLessThanEqual のセッターメソッドです。
     * 
     * @param cmlPrintOutDtLessThanEqual cmlPrintOutDtLessThanEqual に設定する
     */
    public void setCmlPrintOutDtLessThanEqual(Date cmlPrintOutDtLessThanEqual) {
        this.cmlPrintOutDtLessThanEqual = cmlPrintOutDtLessThanEqual;
    }

    /**
     * collateMethTypGreaterThan のゲッターメソッドです。
     * 
     * @return the collateMethTypGreaterThan
     */
    public String getCollateMethTypGreaterThan() {
        return collateMethTypGreaterThan;
    }

    /**
     * collateMethTypGreaterThan のセッターメソッドです。
     * 
     * @param collateMethTypGreaterThan collateMethTypGreaterThan に設定する
     */
    public void setCollateMethTypGreaterThan(String collateMethTypGreaterThan) {
        this.collateMethTypGreaterThan = collateMethTypGreaterThan;
    }

    /**
     * collateMethTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the collateMethTypGreaterThanEqual
     */
    public String getCollateMethTypGreaterThanEqual() {
        return collateMethTypGreaterThanEqual;
    }

    /**
     * collateMethTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param collateMethTypGreaterThanEqual collateMethTypGreaterThanEqual に設定する
     */
    public void setCollateMethTypGreaterThanEqual(String collateMethTypGreaterThanEqual) {
        this.collateMethTypGreaterThanEqual = collateMethTypGreaterThanEqual;
    }

    /**
     * collateMethTypLessThan のゲッターメソッドです。
     * 
     * @return the collateMethTypLessThan
     */
    public String getCollateMethTypLessThan() {
        return collateMethTypLessThan;
    }

    /**
     * collateMethTypLessThan のセッターメソッドです。
     * 
     * @param collateMethTypLessThan collateMethTypLessThan に設定する
     */
    public void setCollateMethTypLessThan(String collateMethTypLessThan) {
        this.collateMethTypLessThan = collateMethTypLessThan;
    }

    /**
     * collateMethTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the collateMethTypLessThanEqual
     */
    public String getCollateMethTypLessThanEqual() {
        return collateMethTypLessThanEqual;
    }

    /**
     * collateMethTypLessThanEqual のセッターメソッドです。
     * 
     * @param collateMethTypLessThanEqual collateMethTypLessThanEqual に設定する
     */
    public void setCollateMethTypLessThanEqual(String collateMethTypLessThanEqual) {
        this.collateMethTypLessThanEqual = collateMethTypLessThanEqual;
    }

    /**
     * collateMethTypLikeFront のゲッターメソッドです。
     * 
     * @return the collateMethTypLikeFront
     */
    public String getCollateMethTypLikeFront() {
        return collateMethTypLikeFront;
    }

    /**
     * collateMethTypLikeFront のセッターメソッドです。
     * 
     * @param collateMethTypLikeFront collateMethTypLikeFront に設定する
     */
    public void setCollateMethTypLikeFront(String collateMethTypLikeFront) {
        this.collateMethTypLikeFront = collateMethTypLikeFront;
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

}

