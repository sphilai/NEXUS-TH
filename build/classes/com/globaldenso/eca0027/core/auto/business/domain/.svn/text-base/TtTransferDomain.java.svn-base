/*
 * PROJECT：eca0027
 * 
 * TtTransfer のDomainクラス
 * テーブル概要：Warehouse Transfer/倉庫移動  Table to hold the header information of the warehouse move/倉庫移動のヘッダ情報とを保持するテーブル
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TtTransfer のDomainクラスです。<BR>
 * テーブル概要：Warehouse Transfer/倉庫移動  Table to hold the header information of the warehouse move/倉庫移動のヘッダ情報とを保持するテーブル<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TtTransferDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * TRANSFER REPORT NO/送荷書NO
     */
    private String trNo;

    /**
     * CARRY OUT CO CODE/搬出元会社コード
     */
    private String carryOutCompCd;

    /**
     * 搬出元倉庫コード
     */
    private String carryOutWhCd;

    /**
     * CARRY IN COMPANY CODE/搬出先会社コード
     */
    private String carryInCompCd;

    /**
     * CARRY IN WAREHOUSE CODE/搬出先倉庫コード
     */
    private String carryInWhCd;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
     * TRANSFER STATUS/搬出入ステータス  10:Blank,
20:Issue TR,
30:Activate TR,
40:Received at To,
90:Cancel TR,
     */
    private String trStatus;

    /**
     * TRANSFER ITEM TYPE/搬出品種別  P:Item No, C:CML
     */
    private String trItemTyp;

    /**
     * TRANSFER REPORT ISSUER ID/送荷書出力者DSCID
     */
    private String trIssuerId;

    /**
     * TRANSFER REPORT ISSUER NAME/送荷書出力者名
     */
    private String trIssuerNm;

    /**
     * TRANSFER REPORT ISSUE DATE/送荷書出力日
     */
    private Date trIssueDt;

    /**
     * TRANSFER REPORT ACTIVATE DSC-ID/送荷書アクティベイト者DSCID
     */
    private String trActvDscId;

    /**
     * TRANSFER REPORT ACTIVATE NAME/送荷書アクティベイト者名
     */
    private String trActvNm;

    /**
     * TRANSFER REPORT ACTIVATE DATE/送荷書アクティベイト日
     */
    private Date trActvDt;

    /**
     * TRANSFER REPORT ACTIVATE METHOD/送荷書アクティベイト手段  1:TR.,2:Tags
     */
    private String trActvMethTyp;

    /**
     * TRANSFER REPORT RECEIVE DSC-ID/送荷書受入者DSCID
     */
    private String trRcvDscId;

    /**
     * TRANSFER REPORT RECEIVE NAME/送荷書受入者名
     */
    private String trRcvNm;

    /**
     * TRANSFER REPORT RECEIVE DATE/送荷書受入日
     */
    private Date trRcvDt;

    /**
     * TRANSFER REPORT RECEIVE METHOD/送荷書受け入れ手段  1:TR.,2:Tags
     */
    private String trRcvMethTyp;

    /**
     * EDIT COUNT/編集回数
     */
    private BigDecimal editCnt;

    /**
     * FINAL EDIT DSC-ID/最終明細編集者DSCID
     */
    private String finalEditDscId;

    /**
     * FINAL EDIT NAME/最終明細編集者名
     */
    private String finalEditNm;

    /**
     * FINAL EDIT DATE/最終明細編集日
     */
    private Date finalEditDt;

    /**
     * UPDATE FUNCTION ID/更新機能ID
     */
    private String comUpdateFuncId;

    /**
     * UPDATE USER ID/更新者
     */
    private String comUpdateUserId;

    /**
     * UPDATE TIMESTAMP更新日時
     */
    private Timestamp comUpdateTimestamp;

    /**
     * CREATE FUNCTION ID/作成機能ID
     */
    private String comCreateFuncId;

    /**
     * CREATE USER ID/作成者
     */
    private String comCreateUserId;

    /**
     * CREATE TIMESTAMP/作成日時
     */
    private Timestamp comCreateTimestamp;

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferDomain() {
    }

    /**
     * trNo のゲッターメソッドです。
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * trNo のセッターメソッドです。
     * 
     * @param trNo trNo に設定する
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * carryOutCompCd のゲッターメソッドです。
     * 
     * @return the carryOutCompCd
     */
    public String getCarryOutCompCd() {
        return carryOutCompCd;
    }

    /**
     * carryOutCompCd のセッターメソッドです。
     * 
     * @param carryOutCompCd carryOutCompCd に設定する
     */
    public void setCarryOutCompCd(String carryOutCompCd) {
        this.carryOutCompCd = carryOutCompCd;
    }

    /**
     * carryOutWhCd のゲッターメソッドです。
     * 
     * @return the carryOutWhCd
     */
    public String getCarryOutWhCd() {
        return carryOutWhCd;
    }

    /**
     * carryOutWhCd のセッターメソッドです。
     * 
     * @param carryOutWhCd carryOutWhCd に設定する
     */
    public void setCarryOutWhCd(String carryOutWhCd) {
        this.carryOutWhCd = carryOutWhCd;
    }

    /**
     * carryInCompCd のゲッターメソッドです。
     * 
     * @return the carryInCompCd
     */
    public String getCarryInCompCd() {
        return carryInCompCd;
    }

    /**
     * carryInCompCd のセッターメソッドです。
     * 
     * @param carryInCompCd carryInCompCd に設定する
     */
    public void setCarryInCompCd(String carryInCompCd) {
        this.carryInCompCd = carryInCompCd;
    }

    /**
     * carryInWhCd のゲッターメソッドです。
     * 
     * @return the carryInWhCd
     */
    public String getCarryInWhCd() {
        return carryInWhCd;
    }

    /**
     * carryInWhCd のセッターメソッドです。
     * 
     * @param carryInWhCd carryInWhCd に設定する
     */
    public void setCarryInWhCd(String carryInWhCd) {
        this.carryInWhCd = carryInWhCd;
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
     * trStatus のゲッターメソッドです。
     * 
     * @return the trStatus
     */
    public String getTrStatus() {
        return trStatus;
    }

    /**
     * trStatus のセッターメソッドです。
     * 
     * @param trStatus trStatus に設定する
     */
    public void setTrStatus(String trStatus) {
        this.trStatus = trStatus;
    }

    /**
     * trItemTyp のゲッターメソッドです。
     * 
     * @return the trItemTyp
     */
    public String getTrItemTyp() {
        return trItemTyp;
    }

    /**
     * trItemTyp のセッターメソッドです。
     * 
     * @param trItemTyp trItemTyp に設定する
     */
    public void setTrItemTyp(String trItemTyp) {
        this.trItemTyp = trItemTyp;
    }

    /**
     * trIssuerId のゲッターメソッドです。
     * 
     * @return the trIssuerId
     */
    public String getTrIssuerId() {
        return trIssuerId;
    }

    /**
     * trIssuerId のセッターメソッドです。
     * 
     * @param trIssuerId trIssuerId に設定する
     */
    public void setTrIssuerId(String trIssuerId) {
        this.trIssuerId = trIssuerId;
    }

    /**
     * trIssuerNm のゲッターメソッドです。
     * 
     * @return the trIssuerNm
     */
    public String getTrIssuerNm() {
        return trIssuerNm;
    }

    /**
     * trIssuerNm のセッターメソッドです。
     * 
     * @param trIssuerNm trIssuerNm に設定する
     */
    public void setTrIssuerNm(String trIssuerNm) {
        this.trIssuerNm = trIssuerNm;
    }

    /**
     * trIssueDt のゲッターメソッドです。
     * 
     * @return the trIssueDt
     */
    public Date getTrIssueDt() {
        return trIssueDt;
    }

    /**
     * trIssueDt のセッターメソッドです。
     * 
     * @param trIssueDt trIssueDt に設定する
     */
    public void setTrIssueDt(Date trIssueDt) {
        this.trIssueDt = trIssueDt;
    }

    /**
     * trActvDscId のゲッターメソッドです。
     * 
     * @return the trActvDscId
     */
    public String getTrActvDscId() {
        return trActvDscId;
    }

    /**
     * trActvDscId のセッターメソッドです。
     * 
     * @param trActvDscId trActvDscId に設定する
     */
    public void setTrActvDscId(String trActvDscId) {
        this.trActvDscId = trActvDscId;
    }

    /**
     * trActvNm のゲッターメソッドです。
     * 
     * @return the trActvNm
     */
    public String getTrActvNm() {
        return trActvNm;
    }

    /**
     * trActvNm のセッターメソッドです。
     * 
     * @param trActvNm trActvNm に設定する
     */
    public void setTrActvNm(String trActvNm) {
        this.trActvNm = trActvNm;
    }

    /**
     * trActvDt のゲッターメソッドです。
     * 
     * @return the trActvDt
     */
    public Date getTrActvDt() {
        return trActvDt;
    }

    /**
     * trActvDt のセッターメソッドです。
     * 
     * @param trActvDt trActvDt に設定する
     */
    public void setTrActvDt(Date trActvDt) {
        this.trActvDt = trActvDt;
    }

    /**
     * trActvMethTyp のゲッターメソッドです。
     * 
     * @return the trActvMethTyp
     */
    public String getTrActvMethTyp() {
        return trActvMethTyp;
    }

    /**
     * trActvMethTyp のセッターメソッドです。
     * 
     * @param trActvMethTyp trActvMethTyp に設定する
     */
    public void setTrActvMethTyp(String trActvMethTyp) {
        this.trActvMethTyp = trActvMethTyp;
    }

    /**
     * trRcvDscId のゲッターメソッドです。
     * 
     * @return the trRcvDscId
     */
    public String getTrRcvDscId() {
        return trRcvDscId;
    }

    /**
     * trRcvDscId のセッターメソッドです。
     * 
     * @param trRcvDscId trRcvDscId に設定する
     */
    public void setTrRcvDscId(String trRcvDscId) {
        this.trRcvDscId = trRcvDscId;
    }

    /**
     * trRcvNm のゲッターメソッドです。
     * 
     * @return the trRcvNm
     */
    public String getTrRcvNm() {
        return trRcvNm;
    }

    /**
     * trRcvNm のセッターメソッドです。
     * 
     * @param trRcvNm trRcvNm に設定する
     */
    public void setTrRcvNm(String trRcvNm) {
        this.trRcvNm = trRcvNm;
    }

    /**
     * trRcvDt のゲッターメソッドです。
     * 
     * @return the trRcvDt
     */
    public Date getTrRcvDt() {
        return trRcvDt;
    }

    /**
     * trRcvDt のセッターメソッドです。
     * 
     * @param trRcvDt trRcvDt に設定する
     */
    public void setTrRcvDt(Date trRcvDt) {
        this.trRcvDt = trRcvDt;
    }

    /**
     * trRcvMethTyp のゲッターメソッドです。
     * 
     * @return the trRcvMethTyp
     */
    public String getTrRcvMethTyp() {
        return trRcvMethTyp;
    }

    /**
     * trRcvMethTyp のセッターメソッドです。
     * 
     * @param trRcvMethTyp trRcvMethTyp に設定する
     */
    public void setTrRcvMethTyp(String trRcvMethTyp) {
        this.trRcvMethTyp = trRcvMethTyp;
    }

    /**
     * editCnt のゲッターメソッドです。
     * 
     * @return the editCnt
     */
    public BigDecimal getEditCnt() {
        return editCnt;
    }

    /**
     * editCnt のセッターメソッドです。
     * 
     * @param editCnt editCnt に設定する
     */
    public void setEditCnt(BigDecimal editCnt) {
        this.editCnt = editCnt;
    }

    /**
     * finalEditDscId のゲッターメソッドです。
     * 
     * @return the finalEditDscId
     */
    public String getFinalEditDscId() {
        return finalEditDscId;
    }

    /**
     * finalEditDscId のセッターメソッドです。
     * 
     * @param finalEditDscId finalEditDscId に設定する
     */
    public void setFinalEditDscId(String finalEditDscId) {
        this.finalEditDscId = finalEditDscId;
    }

    /**
     * finalEditNm のゲッターメソッドです。
     * 
     * @return the finalEditNm
     */
    public String getFinalEditNm() {
        return finalEditNm;
    }

    /**
     * finalEditNm のセッターメソッドです。
     * 
     * @param finalEditNm finalEditNm に設定する
     */
    public void setFinalEditNm(String finalEditNm) {
        this.finalEditNm = finalEditNm;
    }

    /**
     * finalEditDt のゲッターメソッドです。
     * 
     * @return the finalEditDt
     */
    public Date getFinalEditDt() {
        return finalEditDt;
    }

    /**
     * finalEditDt のセッターメソッドです。
     * 
     * @param finalEditDt finalEditDt に設定する
     */
    public void setFinalEditDt(Date finalEditDt) {
        this.finalEditDt = finalEditDt;
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
