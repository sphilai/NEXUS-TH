/*
 * PROJECT：eca0027
 * 
 * TtTransfer の検索条件Domainクラス
 * テーブル概要：Warehouse Transfer/倉庫移動  Table to hold the header information of the warehouse move/倉庫移動のヘッダ情報とを保持するテーブル
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TtTransfer の検索条件Domainクラスです。<BR>
 * テーブル概要：Warehouse Transfer/倉庫移動  Table to hold the header information of the warehouse move/倉庫移動のヘッダ情報とを保持するテーブル<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class TtTransferCriteriaDomain extends AbstractDomain implements Serializable {

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
     * TRANSFER REPORT NO/送荷書NO（大なり）
     */
    private String trNoGreaterThan;

    /**
     * TRANSFER REPORT NO/送荷書NO（大なりイコール）
     */
    private String trNoGreaterThanEqual;

    /**
     * TRANSFER REPORT NO/送荷書NO（小なり）
     */
    private String trNoLessThan;

    /**
     * TRANSFER REPORT NO/送荷書NO（小なりイコール）
     */
    private String trNoLessThanEqual;

    /**
     * TRANSFER REPORT NO/送荷書NO（前方一致）
     */
    private String trNoLikeFront;

    /**
     * CARRY OUT CO CODE/搬出元会社コード（大なり）
     */
    private String carryOutCompCdGreaterThan;

    /**
     * CARRY OUT CO CODE/搬出元会社コード（大なりイコール）
     */
    private String carryOutCompCdGreaterThanEqual;

    /**
     * CARRY OUT CO CODE/搬出元会社コード（小なり）
     */
    private String carryOutCompCdLessThan;

    /**
     * CARRY OUT CO CODE/搬出元会社コード（小なりイコール）
     */
    private String carryOutCompCdLessThanEqual;

    /**
     * CARRY OUT CO CODE/搬出元会社コード（前方一致）
     */
    private String carryOutCompCdLikeFront;

    /**
     * 搬出元倉庫コード（大なり）
     */
    private String carryOutWhCdGreaterThan;

    /**
     * 搬出元倉庫コード（大なりイコール）
     */
    private String carryOutWhCdGreaterThanEqual;

    /**
     * 搬出元倉庫コード（小なり）
     */
    private String carryOutWhCdLessThan;

    /**
     * 搬出元倉庫コード（小なりイコール）
     */
    private String carryOutWhCdLessThanEqual;

    /**
     * 搬出元倉庫コード（前方一致）
     */
    private String carryOutWhCdLikeFront;

    /**
     * CARRY IN COMPANY CODE/搬出先会社コード（大なり）
     */
    private String carryInCompCdGreaterThan;

    /**
     * CARRY IN COMPANY CODE/搬出先会社コード（大なりイコール）
     */
    private String carryInCompCdGreaterThanEqual;

    /**
     * CARRY IN COMPANY CODE/搬出先会社コード（小なり）
     */
    private String carryInCompCdLessThan;

    /**
     * CARRY IN COMPANY CODE/搬出先会社コード（小なりイコール）
     */
    private String carryInCompCdLessThanEqual;

    /**
     * CARRY IN COMPANY CODE/搬出先会社コード（前方一致）
     */
    private String carryInCompCdLikeFront;

    /**
     * CARRY IN WAREHOUSE CODE/搬出先倉庫コード（大なり）
     */
    private String carryInWhCdGreaterThan;

    /**
     * CARRY IN WAREHOUSE CODE/搬出先倉庫コード（大なりイコール）
     */
    private String carryInWhCdGreaterThanEqual;

    /**
     * CARRY IN WAREHOUSE CODE/搬出先倉庫コード（小なり）
     */
    private String carryInWhCdLessThan;

    /**
     * CARRY IN WAREHOUSE CODE/搬出先倉庫コード（小なりイコール）
     */
    private String carryInWhCdLessThanEqual;

    /**
     * CARRY IN WAREHOUSE CODE/搬出先倉庫コード（前方一致）
     */
    private String carryInWhCdLikeFront;

    /**
     * SHIPPER CODE/荷主コード（大なり）
     */
    private String shipperCdGreaterThan;

    /**
     * SHIPPER CODE/荷主コード（大なりイコール）
     */
    private String shipperCdGreaterThanEqual;

    /**
     * SHIPPER CODE/荷主コード（小なり）
     */
    private String shipperCdLessThan;

    /**
     * SHIPPER CODE/荷主コード（小なりイコール）
     */
    private String shipperCdLessThanEqual;

    /**
     * SHIPPER CODE/荷主コード（前方一致）
     */
    private String shipperCdLikeFront;

    /**
     * TRANSFER STATUS/搬出入ステータス  10:Blank,
20:Issue TR,
30:Activate TR,
40:Received at To,
90:Cancel TR,（大なり）
     */
    private String trStatusGreaterThan;

    /**
     * TRANSFER STATUS/搬出入ステータス  10:Blank,
20:Issue TR,
30:Activate TR,
40:Received at To,
90:Cancel TR,（大なりイコール）
     */
    private String trStatusGreaterThanEqual;

    /**
     * TRANSFER STATUS/搬出入ステータス  10:Blank,
20:Issue TR,
30:Activate TR,
40:Received at To,
90:Cancel TR,（小なり）
     */
    private String trStatusLessThan;

    /**
     * TRANSFER STATUS/搬出入ステータス  10:Blank,
20:Issue TR,
30:Activate TR,
40:Received at To,
90:Cancel TR,（小なりイコール）
     */
    private String trStatusLessThanEqual;

    /**
     * TRANSFER STATUS/搬出入ステータス  10:Blank,
20:Issue TR,
30:Activate TR,
40:Received at To,
90:Cancel TR,（前方一致）
     */
    private String trStatusLikeFront;

    /**
     * TRANSFER ITEM TYPE/搬出品種別  P:Item No, C:CML（大なり）
     */
    private String trItemTypGreaterThan;

    /**
     * TRANSFER ITEM TYPE/搬出品種別  P:Item No, C:CML（大なりイコール）
     */
    private String trItemTypGreaterThanEqual;

    /**
     * TRANSFER ITEM TYPE/搬出品種別  P:Item No, C:CML（小なり）
     */
    private String trItemTypLessThan;

    /**
     * TRANSFER ITEM TYPE/搬出品種別  P:Item No, C:CML（小なりイコール）
     */
    private String trItemTypLessThanEqual;

    /**
     * TRANSFER ITEM TYPE/搬出品種別  P:Item No, C:CML（前方一致）
     */
    private String trItemTypLikeFront;

    /**
     * TRANSFER REPORT ISSUER ID/送荷書出力者DSCID（大なり）
     */
    private String trIssuerIdGreaterThan;

    /**
     * TRANSFER REPORT ISSUER ID/送荷書出力者DSCID（大なりイコール）
     */
    private String trIssuerIdGreaterThanEqual;

    /**
     * TRANSFER REPORT ISSUER ID/送荷書出力者DSCID（小なり）
     */
    private String trIssuerIdLessThan;

    /**
     * TRANSFER REPORT ISSUER ID/送荷書出力者DSCID（小なりイコール）
     */
    private String trIssuerIdLessThanEqual;

    /**
     * TRANSFER REPORT ISSUER ID/送荷書出力者DSCID（前方一致）
     */
    private String trIssuerIdLikeFront;

    /**
     * TRANSFER REPORT ISSUER NAME/送荷書出力者名（大なり）
     */
    private String trIssuerNmGreaterThan;

    /**
     * TRANSFER REPORT ISSUER NAME/送荷書出力者名（大なりイコール）
     */
    private String trIssuerNmGreaterThanEqual;

    /**
     * TRANSFER REPORT ISSUER NAME/送荷書出力者名（小なり）
     */
    private String trIssuerNmLessThan;

    /**
     * TRANSFER REPORT ISSUER NAME/送荷書出力者名（小なりイコール）
     */
    private String trIssuerNmLessThanEqual;

    /**
     * TRANSFER REPORT ISSUER NAME/送荷書出力者名（前方一致）
     */
    private String trIssuerNmLikeFront;

    /**
     * TRANSFER REPORT ISSUE DATE/送荷書出力日（大なりイコール）
     */
    private Date trIssueDtGreaterThanEqual;

    /**
     * TRANSFER REPORT ISSUE DATE/送荷書出力日（小なりイコール）
     */
    private Date trIssueDtLessThanEqual;

    /**
     * TRANSFER REPORT ACTIVATE DSC-ID/送荷書アクティベイト者DSCID（大なり）
     */
    private String trActvDscIdGreaterThan;

    /**
     * TRANSFER REPORT ACTIVATE DSC-ID/送荷書アクティベイト者DSCID（大なりイコール）
     */
    private String trActvDscIdGreaterThanEqual;

    /**
     * TRANSFER REPORT ACTIVATE DSC-ID/送荷書アクティベイト者DSCID（小なり）
     */
    private String trActvDscIdLessThan;

    /**
     * TRANSFER REPORT ACTIVATE DSC-ID/送荷書アクティベイト者DSCID（小なりイコール）
     */
    private String trActvDscIdLessThanEqual;

    /**
     * TRANSFER REPORT ACTIVATE DSC-ID/送荷書アクティベイト者DSCID（前方一致）
     */
    private String trActvDscIdLikeFront;

    /**
     * TRANSFER REPORT ACTIVATE NAME/送荷書アクティベイト者名（大なり）
     */
    private String trActvNmGreaterThan;

    /**
     * TRANSFER REPORT ACTIVATE NAME/送荷書アクティベイト者名（大なりイコール）
     */
    private String trActvNmGreaterThanEqual;

    /**
     * TRANSFER REPORT ACTIVATE NAME/送荷書アクティベイト者名（小なり）
     */
    private String trActvNmLessThan;

    /**
     * TRANSFER REPORT ACTIVATE NAME/送荷書アクティベイト者名（小なりイコール）
     */
    private String trActvNmLessThanEqual;

    /**
     * TRANSFER REPORT ACTIVATE NAME/送荷書アクティベイト者名（前方一致）
     */
    private String trActvNmLikeFront;

    /**
     * TRANSFER REPORT ACTIVATE DATE/送荷書アクティベイト日（大なりイコール）
     */
    private Date trActvDtGreaterThanEqual;

    /**
     * TRANSFER REPORT ACTIVATE DATE/送荷書アクティベイト日（小なりイコール）
     */
    private Date trActvDtLessThanEqual;

    /**
     * TRANSFER REPORT ACTIVATE METHOD/送荷書アクティベイト手段  1:TR.,2:Tags（大なり）
     */
    private String trActvMethTypGreaterThan;

    /**
     * TRANSFER REPORT ACTIVATE METHOD/送荷書アクティベイト手段  1:TR.,2:Tags（大なりイコール）
     */
    private String trActvMethTypGreaterThanEqual;

    /**
     * TRANSFER REPORT ACTIVATE METHOD/送荷書アクティベイト手段  1:TR.,2:Tags（小なり）
     */
    private String trActvMethTypLessThan;

    /**
     * TRANSFER REPORT ACTIVATE METHOD/送荷書アクティベイト手段  1:TR.,2:Tags（小なりイコール）
     */
    private String trActvMethTypLessThanEqual;

    /**
     * TRANSFER REPORT ACTIVATE METHOD/送荷書アクティベイト手段  1:TR.,2:Tags（前方一致）
     */
    private String trActvMethTypLikeFront;

    /**
     * TRANSFER REPORT RECEIVE DSC-ID/送荷書受入者DSCID（大なり）
     */
    private String trRcvDscIdGreaterThan;

    /**
     * TRANSFER REPORT RECEIVE DSC-ID/送荷書受入者DSCID（大なりイコール）
     */
    private String trRcvDscIdGreaterThanEqual;

    /**
     * TRANSFER REPORT RECEIVE DSC-ID/送荷書受入者DSCID（小なり）
     */
    private String trRcvDscIdLessThan;

    /**
     * TRANSFER REPORT RECEIVE DSC-ID/送荷書受入者DSCID（小なりイコール）
     */
    private String trRcvDscIdLessThanEqual;

    /**
     * TRANSFER REPORT RECEIVE DSC-ID/送荷書受入者DSCID（前方一致）
     */
    private String trRcvDscIdLikeFront;

    /**
     * TRANSFER REPORT RECEIVE NAME/送荷書受入者名（大なり）
     */
    private String trRcvNmGreaterThan;

    /**
     * TRANSFER REPORT RECEIVE NAME/送荷書受入者名（大なりイコール）
     */
    private String trRcvNmGreaterThanEqual;

    /**
     * TRANSFER REPORT RECEIVE NAME/送荷書受入者名（小なり）
     */
    private String trRcvNmLessThan;

    /**
     * TRANSFER REPORT RECEIVE NAME/送荷書受入者名（小なりイコール）
     */
    private String trRcvNmLessThanEqual;

    /**
     * TRANSFER REPORT RECEIVE NAME/送荷書受入者名（前方一致）
     */
    private String trRcvNmLikeFront;

    /**
     * TRANSFER REPORT RECEIVE DATE/送荷書受入日（大なりイコール）
     */
    private Date trRcvDtGreaterThanEqual;

    /**
     * TRANSFER REPORT RECEIVE DATE/送荷書受入日（小なりイコール）
     */
    private Date trRcvDtLessThanEqual;

    /**
     * TRANSFER REPORT RECEIVE METHOD/送荷書受け入れ手段  1:TR.,2:Tags（大なり）
     */
    private String trRcvMethTypGreaterThan;

    /**
     * TRANSFER REPORT RECEIVE METHOD/送荷書受け入れ手段  1:TR.,2:Tags（大なりイコール）
     */
    private String trRcvMethTypGreaterThanEqual;

    /**
     * TRANSFER REPORT RECEIVE METHOD/送荷書受け入れ手段  1:TR.,2:Tags（小なり）
     */
    private String trRcvMethTypLessThan;

    /**
     * TRANSFER REPORT RECEIVE METHOD/送荷書受け入れ手段  1:TR.,2:Tags（小なりイコール）
     */
    private String trRcvMethTypLessThanEqual;

    /**
     * TRANSFER REPORT RECEIVE METHOD/送荷書受け入れ手段  1:TR.,2:Tags（前方一致）
     */
    private String trRcvMethTypLikeFront;

    /**
     * FINAL EDIT DSC-ID/最終明細編集者DSCID（大なり）
     */
    private String finalEditDscIdGreaterThan;

    /**
     * FINAL EDIT DSC-ID/最終明細編集者DSCID（大なりイコール）
     */
    private String finalEditDscIdGreaterThanEqual;

    /**
     * FINAL EDIT DSC-ID/最終明細編集者DSCID（小なり）
     */
    private String finalEditDscIdLessThan;

    /**
     * FINAL EDIT DSC-ID/最終明細編集者DSCID（小なりイコール）
     */
    private String finalEditDscIdLessThanEqual;

    /**
     * FINAL EDIT DSC-ID/最終明細編集者DSCID（前方一致）
     */
    private String finalEditDscIdLikeFront;

    /**
     * FINAL EDIT NAME/最終明細編集者名（大なり）
     */
    private String finalEditNmGreaterThan;

    /**
     * FINAL EDIT NAME/最終明細編集者名（大なりイコール）
     */
    private String finalEditNmGreaterThanEqual;

    /**
     * FINAL EDIT NAME/最終明細編集者名（小なり）
     */
    private String finalEditNmLessThan;

    /**
     * FINAL EDIT NAME/最終明細編集者名（小なりイコール）
     */
    private String finalEditNmLessThanEqual;

    /**
     * FINAL EDIT NAME/最終明細編集者名（前方一致）
     */
    private String finalEditNmLikeFront;

    /**
     * FINAL EDIT DATE/最終明細編集日（大なりイコール）
     */
    private Date finalEditDtGreaterThanEqual;

    /**
     * FINAL EDIT DATE/最終明細編集日（小なりイコール）
     */
    private Date finalEditDtLessThanEqual;

    /**
     * UPDATE FUNCTION ID/更新機能ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * UPDATE FUNCTION ID/更新機能ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * UPDATE FUNCTION ID/更新機能ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * UPDATE FUNCTION ID/更新機能ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * UPDATE FUNCTION ID/更新機能ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * UPDATE USER ID/更新者（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * UPDATE USER ID/更新者（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * UPDATE USER ID/更新者（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * UPDATE USER ID/更新者（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * UPDATE USER ID/更新者（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * CREATE FUNCTION ID/作成機能ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * CREATE FUNCTION ID/作成機能ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * CREATE FUNCTION ID/作成機能ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * CREATE FUNCTION ID/作成機能ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * CREATE FUNCTION ID/作成機能ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * CREATE USER ID/作成者（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * CREATE USER ID/作成者（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * CREATE USER ID/作成者（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * CREATE USER ID/作成者（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * CREATE USER ID/作成者（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferCriteriaDomain() {
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

    /**
     * trNoGreaterThan のゲッターメソッドです。
     * 
     * @return the trNoGreaterThan
     */
    public String getTrNoGreaterThan() {
        return trNoGreaterThan;
    }

    /**
     * trNoGreaterThan のセッターメソッドです。
     * 
     * @param trNoGreaterThan trNoGreaterThan に設定する
     */
    public void setTrNoGreaterThan(String trNoGreaterThan) {
        this.trNoGreaterThan = trNoGreaterThan;
    }

    /**
     * trNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trNoGreaterThanEqual
     */
    public String getTrNoGreaterThanEqual() {
        return trNoGreaterThanEqual;
    }

    /**
     * trNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param trNoGreaterThanEqual trNoGreaterThanEqual に設定する
     */
    public void setTrNoGreaterThanEqual(String trNoGreaterThanEqual) {
        this.trNoGreaterThanEqual = trNoGreaterThanEqual;
    }

    /**
     * trNoLessThan のゲッターメソッドです。
     * 
     * @return the trNoLessThan
     */
    public String getTrNoLessThan() {
        return trNoLessThan;
    }

    /**
     * trNoLessThan のセッターメソッドです。
     * 
     * @param trNoLessThan trNoLessThan に設定する
     */
    public void setTrNoLessThan(String trNoLessThan) {
        this.trNoLessThan = trNoLessThan;
    }

    /**
     * trNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the trNoLessThanEqual
     */
    public String getTrNoLessThanEqual() {
        return trNoLessThanEqual;
    }

    /**
     * trNoLessThanEqual のセッターメソッドです。
     * 
     * @param trNoLessThanEqual trNoLessThanEqual に設定する
     */
    public void setTrNoLessThanEqual(String trNoLessThanEqual) {
        this.trNoLessThanEqual = trNoLessThanEqual;
    }

    /**
     * trNoLikeFront のゲッターメソッドです。
     * 
     * @return the trNoLikeFront
     */
    public String getTrNoLikeFront() {
        return trNoLikeFront;
    }

    /**
     * trNoLikeFront のセッターメソッドです。
     * 
     * @param trNoLikeFront trNoLikeFront に設定する
     */
    public void setTrNoLikeFront(String trNoLikeFront) {
        this.trNoLikeFront = trNoLikeFront;
    }

    /**
     * carryOutCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the carryOutCompCdGreaterThan
     */
    public String getCarryOutCompCdGreaterThan() {
        return carryOutCompCdGreaterThan;
    }

    /**
     * carryOutCompCdGreaterThan のセッターメソッドです。
     * 
     * @param carryOutCompCdGreaterThan carryOutCompCdGreaterThan に設定する
     */
    public void setCarryOutCompCdGreaterThan(String carryOutCompCdGreaterThan) {
        this.carryOutCompCdGreaterThan = carryOutCompCdGreaterThan;
    }

    /**
     * carryOutCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carryOutCompCdGreaterThanEqual
     */
    public String getCarryOutCompCdGreaterThanEqual() {
        return carryOutCompCdGreaterThanEqual;
    }

    /**
     * carryOutCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param carryOutCompCdGreaterThanEqual carryOutCompCdGreaterThanEqual に設定する
     */
    public void setCarryOutCompCdGreaterThanEqual(String carryOutCompCdGreaterThanEqual) {
        this.carryOutCompCdGreaterThanEqual = carryOutCompCdGreaterThanEqual;
    }

    /**
     * carryOutCompCdLessThan のゲッターメソッドです。
     * 
     * @return the carryOutCompCdLessThan
     */
    public String getCarryOutCompCdLessThan() {
        return carryOutCompCdLessThan;
    }

    /**
     * carryOutCompCdLessThan のセッターメソッドです。
     * 
     * @param carryOutCompCdLessThan carryOutCompCdLessThan に設定する
     */
    public void setCarryOutCompCdLessThan(String carryOutCompCdLessThan) {
        this.carryOutCompCdLessThan = carryOutCompCdLessThan;
    }

    /**
     * carryOutCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the carryOutCompCdLessThanEqual
     */
    public String getCarryOutCompCdLessThanEqual() {
        return carryOutCompCdLessThanEqual;
    }

    /**
     * carryOutCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param carryOutCompCdLessThanEqual carryOutCompCdLessThanEqual に設定する
     */
    public void setCarryOutCompCdLessThanEqual(String carryOutCompCdLessThanEqual) {
        this.carryOutCompCdLessThanEqual = carryOutCompCdLessThanEqual;
    }

    /**
     * carryOutCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the carryOutCompCdLikeFront
     */
    public String getCarryOutCompCdLikeFront() {
        return carryOutCompCdLikeFront;
    }

    /**
     * carryOutCompCdLikeFront のセッターメソッドです。
     * 
     * @param carryOutCompCdLikeFront carryOutCompCdLikeFront に設定する
     */
    public void setCarryOutCompCdLikeFront(String carryOutCompCdLikeFront) {
        this.carryOutCompCdLikeFront = carryOutCompCdLikeFront;
    }

    /**
     * carryOutWhCdGreaterThan のゲッターメソッドです。
     * 
     * @return the carryOutWhCdGreaterThan
     */
    public String getCarryOutWhCdGreaterThan() {
        return carryOutWhCdGreaterThan;
    }

    /**
     * carryOutWhCdGreaterThan のセッターメソッドです。
     * 
     * @param carryOutWhCdGreaterThan carryOutWhCdGreaterThan に設定する
     */
    public void setCarryOutWhCdGreaterThan(String carryOutWhCdGreaterThan) {
        this.carryOutWhCdGreaterThan = carryOutWhCdGreaterThan;
    }

    /**
     * carryOutWhCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carryOutWhCdGreaterThanEqual
     */
    public String getCarryOutWhCdGreaterThanEqual() {
        return carryOutWhCdGreaterThanEqual;
    }

    /**
     * carryOutWhCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param carryOutWhCdGreaterThanEqual carryOutWhCdGreaterThanEqual に設定する
     */
    public void setCarryOutWhCdGreaterThanEqual(String carryOutWhCdGreaterThanEqual) {
        this.carryOutWhCdGreaterThanEqual = carryOutWhCdGreaterThanEqual;
    }

    /**
     * carryOutWhCdLessThan のゲッターメソッドです。
     * 
     * @return the carryOutWhCdLessThan
     */
    public String getCarryOutWhCdLessThan() {
        return carryOutWhCdLessThan;
    }

    /**
     * carryOutWhCdLessThan のセッターメソッドです。
     * 
     * @param carryOutWhCdLessThan carryOutWhCdLessThan に設定する
     */
    public void setCarryOutWhCdLessThan(String carryOutWhCdLessThan) {
        this.carryOutWhCdLessThan = carryOutWhCdLessThan;
    }

    /**
     * carryOutWhCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the carryOutWhCdLessThanEqual
     */
    public String getCarryOutWhCdLessThanEqual() {
        return carryOutWhCdLessThanEqual;
    }

    /**
     * carryOutWhCdLessThanEqual のセッターメソッドです。
     * 
     * @param carryOutWhCdLessThanEqual carryOutWhCdLessThanEqual に設定する
     */
    public void setCarryOutWhCdLessThanEqual(String carryOutWhCdLessThanEqual) {
        this.carryOutWhCdLessThanEqual = carryOutWhCdLessThanEqual;
    }

    /**
     * carryOutWhCdLikeFront のゲッターメソッドです。
     * 
     * @return the carryOutWhCdLikeFront
     */
    public String getCarryOutWhCdLikeFront() {
        return carryOutWhCdLikeFront;
    }

    /**
     * carryOutWhCdLikeFront のセッターメソッドです。
     * 
     * @param carryOutWhCdLikeFront carryOutWhCdLikeFront に設定する
     */
    public void setCarryOutWhCdLikeFront(String carryOutWhCdLikeFront) {
        this.carryOutWhCdLikeFront = carryOutWhCdLikeFront;
    }

    /**
     * carryInCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the carryInCompCdGreaterThan
     */
    public String getCarryInCompCdGreaterThan() {
        return carryInCompCdGreaterThan;
    }

    /**
     * carryInCompCdGreaterThan のセッターメソッドです。
     * 
     * @param carryInCompCdGreaterThan carryInCompCdGreaterThan に設定する
     */
    public void setCarryInCompCdGreaterThan(String carryInCompCdGreaterThan) {
        this.carryInCompCdGreaterThan = carryInCompCdGreaterThan;
    }

    /**
     * carryInCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carryInCompCdGreaterThanEqual
     */
    public String getCarryInCompCdGreaterThanEqual() {
        return carryInCompCdGreaterThanEqual;
    }

    /**
     * carryInCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param carryInCompCdGreaterThanEqual carryInCompCdGreaterThanEqual に設定する
     */
    public void setCarryInCompCdGreaterThanEqual(String carryInCompCdGreaterThanEqual) {
        this.carryInCompCdGreaterThanEqual = carryInCompCdGreaterThanEqual;
    }

    /**
     * carryInCompCdLessThan のゲッターメソッドです。
     * 
     * @return the carryInCompCdLessThan
     */
    public String getCarryInCompCdLessThan() {
        return carryInCompCdLessThan;
    }

    /**
     * carryInCompCdLessThan のセッターメソッドです。
     * 
     * @param carryInCompCdLessThan carryInCompCdLessThan に設定する
     */
    public void setCarryInCompCdLessThan(String carryInCompCdLessThan) {
        this.carryInCompCdLessThan = carryInCompCdLessThan;
    }

    /**
     * carryInCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the carryInCompCdLessThanEqual
     */
    public String getCarryInCompCdLessThanEqual() {
        return carryInCompCdLessThanEqual;
    }

    /**
     * carryInCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param carryInCompCdLessThanEqual carryInCompCdLessThanEqual に設定する
     */
    public void setCarryInCompCdLessThanEqual(String carryInCompCdLessThanEqual) {
        this.carryInCompCdLessThanEqual = carryInCompCdLessThanEqual;
    }

    /**
     * carryInCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the carryInCompCdLikeFront
     */
    public String getCarryInCompCdLikeFront() {
        return carryInCompCdLikeFront;
    }

    /**
     * carryInCompCdLikeFront のセッターメソッドです。
     * 
     * @param carryInCompCdLikeFront carryInCompCdLikeFront に設定する
     */
    public void setCarryInCompCdLikeFront(String carryInCompCdLikeFront) {
        this.carryInCompCdLikeFront = carryInCompCdLikeFront;
    }

    /**
     * carryInWhCdGreaterThan のゲッターメソッドです。
     * 
     * @return the carryInWhCdGreaterThan
     */
    public String getCarryInWhCdGreaterThan() {
        return carryInWhCdGreaterThan;
    }

    /**
     * carryInWhCdGreaterThan のセッターメソッドです。
     * 
     * @param carryInWhCdGreaterThan carryInWhCdGreaterThan に設定する
     */
    public void setCarryInWhCdGreaterThan(String carryInWhCdGreaterThan) {
        this.carryInWhCdGreaterThan = carryInWhCdGreaterThan;
    }

    /**
     * carryInWhCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carryInWhCdGreaterThanEqual
     */
    public String getCarryInWhCdGreaterThanEqual() {
        return carryInWhCdGreaterThanEqual;
    }

    /**
     * carryInWhCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param carryInWhCdGreaterThanEqual carryInWhCdGreaterThanEqual に設定する
     */
    public void setCarryInWhCdGreaterThanEqual(String carryInWhCdGreaterThanEqual) {
        this.carryInWhCdGreaterThanEqual = carryInWhCdGreaterThanEqual;
    }

    /**
     * carryInWhCdLessThan のゲッターメソッドです。
     * 
     * @return the carryInWhCdLessThan
     */
    public String getCarryInWhCdLessThan() {
        return carryInWhCdLessThan;
    }

    /**
     * carryInWhCdLessThan のセッターメソッドです。
     * 
     * @param carryInWhCdLessThan carryInWhCdLessThan に設定する
     */
    public void setCarryInWhCdLessThan(String carryInWhCdLessThan) {
        this.carryInWhCdLessThan = carryInWhCdLessThan;
    }

    /**
     * carryInWhCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the carryInWhCdLessThanEqual
     */
    public String getCarryInWhCdLessThanEqual() {
        return carryInWhCdLessThanEqual;
    }

    /**
     * carryInWhCdLessThanEqual のセッターメソッドです。
     * 
     * @param carryInWhCdLessThanEqual carryInWhCdLessThanEqual に設定する
     */
    public void setCarryInWhCdLessThanEqual(String carryInWhCdLessThanEqual) {
        this.carryInWhCdLessThanEqual = carryInWhCdLessThanEqual;
    }

    /**
     * carryInWhCdLikeFront のゲッターメソッドです。
     * 
     * @return the carryInWhCdLikeFront
     */
    public String getCarryInWhCdLikeFront() {
        return carryInWhCdLikeFront;
    }

    /**
     * carryInWhCdLikeFront のセッターメソッドです。
     * 
     * @param carryInWhCdLikeFront carryInWhCdLikeFront に設定する
     */
    public void setCarryInWhCdLikeFront(String carryInWhCdLikeFront) {
        this.carryInWhCdLikeFront = carryInWhCdLikeFront;
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
     * trStatusGreaterThan のゲッターメソッドです。
     * 
     * @return the trStatusGreaterThan
     */
    public String getTrStatusGreaterThan() {
        return trStatusGreaterThan;
    }

    /**
     * trStatusGreaterThan のセッターメソッドです。
     * 
     * @param trStatusGreaterThan trStatusGreaterThan に設定する
     */
    public void setTrStatusGreaterThan(String trStatusGreaterThan) {
        this.trStatusGreaterThan = trStatusGreaterThan;
    }

    /**
     * trStatusGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trStatusGreaterThanEqual
     */
    public String getTrStatusGreaterThanEqual() {
        return trStatusGreaterThanEqual;
    }

    /**
     * trStatusGreaterThanEqual のセッターメソッドです。
     * 
     * @param trStatusGreaterThanEqual trStatusGreaterThanEqual に設定する
     */
    public void setTrStatusGreaterThanEqual(String trStatusGreaterThanEqual) {
        this.trStatusGreaterThanEqual = trStatusGreaterThanEqual;
    }

    /**
     * trStatusLessThan のゲッターメソッドです。
     * 
     * @return the trStatusLessThan
     */
    public String getTrStatusLessThan() {
        return trStatusLessThan;
    }

    /**
     * trStatusLessThan のセッターメソッドです。
     * 
     * @param trStatusLessThan trStatusLessThan に設定する
     */
    public void setTrStatusLessThan(String trStatusLessThan) {
        this.trStatusLessThan = trStatusLessThan;
    }

    /**
     * trStatusLessThanEqual のゲッターメソッドです。
     * 
     * @return the trStatusLessThanEqual
     */
    public String getTrStatusLessThanEqual() {
        return trStatusLessThanEqual;
    }

    /**
     * trStatusLessThanEqual のセッターメソッドです。
     * 
     * @param trStatusLessThanEqual trStatusLessThanEqual に設定する
     */
    public void setTrStatusLessThanEqual(String trStatusLessThanEqual) {
        this.trStatusLessThanEqual = trStatusLessThanEqual;
    }

    /**
     * trStatusLikeFront のゲッターメソッドです。
     * 
     * @return the trStatusLikeFront
     */
    public String getTrStatusLikeFront() {
        return trStatusLikeFront;
    }

    /**
     * trStatusLikeFront のセッターメソッドです。
     * 
     * @param trStatusLikeFront trStatusLikeFront に設定する
     */
    public void setTrStatusLikeFront(String trStatusLikeFront) {
        this.trStatusLikeFront = trStatusLikeFront;
    }

    /**
     * trItemTypGreaterThan のゲッターメソッドです。
     * 
     * @return the trItemTypGreaterThan
     */
    public String getTrItemTypGreaterThan() {
        return trItemTypGreaterThan;
    }

    /**
     * trItemTypGreaterThan のセッターメソッドです。
     * 
     * @param trItemTypGreaterThan trItemTypGreaterThan に設定する
     */
    public void setTrItemTypGreaterThan(String trItemTypGreaterThan) {
        this.trItemTypGreaterThan = trItemTypGreaterThan;
    }

    /**
     * trItemTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trItemTypGreaterThanEqual
     */
    public String getTrItemTypGreaterThanEqual() {
        return trItemTypGreaterThanEqual;
    }

    /**
     * trItemTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param trItemTypGreaterThanEqual trItemTypGreaterThanEqual に設定する
     */
    public void setTrItemTypGreaterThanEqual(String trItemTypGreaterThanEqual) {
        this.trItemTypGreaterThanEqual = trItemTypGreaterThanEqual;
    }

    /**
     * trItemTypLessThan のゲッターメソッドです。
     * 
     * @return the trItemTypLessThan
     */
    public String getTrItemTypLessThan() {
        return trItemTypLessThan;
    }

    /**
     * trItemTypLessThan のセッターメソッドです。
     * 
     * @param trItemTypLessThan trItemTypLessThan に設定する
     */
    public void setTrItemTypLessThan(String trItemTypLessThan) {
        this.trItemTypLessThan = trItemTypLessThan;
    }

    /**
     * trItemTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the trItemTypLessThanEqual
     */
    public String getTrItemTypLessThanEqual() {
        return trItemTypLessThanEqual;
    }

    /**
     * trItemTypLessThanEqual のセッターメソッドです。
     * 
     * @param trItemTypLessThanEqual trItemTypLessThanEqual に設定する
     */
    public void setTrItemTypLessThanEqual(String trItemTypLessThanEqual) {
        this.trItemTypLessThanEqual = trItemTypLessThanEqual;
    }

    /**
     * trItemTypLikeFront のゲッターメソッドです。
     * 
     * @return the trItemTypLikeFront
     */
    public String getTrItemTypLikeFront() {
        return trItemTypLikeFront;
    }

    /**
     * trItemTypLikeFront のセッターメソッドです。
     * 
     * @param trItemTypLikeFront trItemTypLikeFront に設定する
     */
    public void setTrItemTypLikeFront(String trItemTypLikeFront) {
        this.trItemTypLikeFront = trItemTypLikeFront;
    }

    /**
     * trIssuerIdGreaterThan のゲッターメソッドです。
     * 
     * @return the trIssuerIdGreaterThan
     */
    public String getTrIssuerIdGreaterThan() {
        return trIssuerIdGreaterThan;
    }

    /**
     * trIssuerIdGreaterThan のセッターメソッドです。
     * 
     * @param trIssuerIdGreaterThan trIssuerIdGreaterThan に設定する
     */
    public void setTrIssuerIdGreaterThan(String trIssuerIdGreaterThan) {
        this.trIssuerIdGreaterThan = trIssuerIdGreaterThan;
    }

    /**
     * trIssuerIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trIssuerIdGreaterThanEqual
     */
    public String getTrIssuerIdGreaterThanEqual() {
        return trIssuerIdGreaterThanEqual;
    }

    /**
     * trIssuerIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trIssuerIdGreaterThanEqual trIssuerIdGreaterThanEqual に設定する
     */
    public void setTrIssuerIdGreaterThanEqual(String trIssuerIdGreaterThanEqual) {
        this.trIssuerIdGreaterThanEqual = trIssuerIdGreaterThanEqual;
    }

    /**
     * trIssuerIdLessThan のゲッターメソッドです。
     * 
     * @return the trIssuerIdLessThan
     */
    public String getTrIssuerIdLessThan() {
        return trIssuerIdLessThan;
    }

    /**
     * trIssuerIdLessThan のセッターメソッドです。
     * 
     * @param trIssuerIdLessThan trIssuerIdLessThan に設定する
     */
    public void setTrIssuerIdLessThan(String trIssuerIdLessThan) {
        this.trIssuerIdLessThan = trIssuerIdLessThan;
    }

    /**
     * trIssuerIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trIssuerIdLessThanEqual
     */
    public String getTrIssuerIdLessThanEqual() {
        return trIssuerIdLessThanEqual;
    }

    /**
     * trIssuerIdLessThanEqual のセッターメソッドです。
     * 
     * @param trIssuerIdLessThanEqual trIssuerIdLessThanEqual に設定する
     */
    public void setTrIssuerIdLessThanEqual(String trIssuerIdLessThanEqual) {
        this.trIssuerIdLessThanEqual = trIssuerIdLessThanEqual;
    }

    /**
     * trIssuerIdLikeFront のゲッターメソッドです。
     * 
     * @return the trIssuerIdLikeFront
     */
    public String getTrIssuerIdLikeFront() {
        return trIssuerIdLikeFront;
    }

    /**
     * trIssuerIdLikeFront のセッターメソッドです。
     * 
     * @param trIssuerIdLikeFront trIssuerIdLikeFront に設定する
     */
    public void setTrIssuerIdLikeFront(String trIssuerIdLikeFront) {
        this.trIssuerIdLikeFront = trIssuerIdLikeFront;
    }

    /**
     * trIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the trIssuerNmGreaterThan
     */
    public String getTrIssuerNmGreaterThan() {
        return trIssuerNmGreaterThan;
    }

    /**
     * trIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param trIssuerNmGreaterThan trIssuerNmGreaterThan に設定する
     */
    public void setTrIssuerNmGreaterThan(String trIssuerNmGreaterThan) {
        this.trIssuerNmGreaterThan = trIssuerNmGreaterThan;
    }

    /**
     * trIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trIssuerNmGreaterThanEqual
     */
    public String getTrIssuerNmGreaterThanEqual() {
        return trIssuerNmGreaterThanEqual;
    }

    /**
     * trIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param trIssuerNmGreaterThanEqual trIssuerNmGreaterThanEqual に設定する
     */
    public void setTrIssuerNmGreaterThanEqual(String trIssuerNmGreaterThanEqual) {
        this.trIssuerNmGreaterThanEqual = trIssuerNmGreaterThanEqual;
    }

    /**
     * trIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the trIssuerNmLessThan
     */
    public String getTrIssuerNmLessThan() {
        return trIssuerNmLessThan;
    }

    /**
     * trIssuerNmLessThan のセッターメソッドです。
     * 
     * @param trIssuerNmLessThan trIssuerNmLessThan に設定する
     */
    public void setTrIssuerNmLessThan(String trIssuerNmLessThan) {
        this.trIssuerNmLessThan = trIssuerNmLessThan;
    }

    /**
     * trIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the trIssuerNmLessThanEqual
     */
    public String getTrIssuerNmLessThanEqual() {
        return trIssuerNmLessThanEqual;
    }

    /**
     * trIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param trIssuerNmLessThanEqual trIssuerNmLessThanEqual に設定する
     */
    public void setTrIssuerNmLessThanEqual(String trIssuerNmLessThanEqual) {
        this.trIssuerNmLessThanEqual = trIssuerNmLessThanEqual;
    }

    /**
     * trIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the trIssuerNmLikeFront
     */
    public String getTrIssuerNmLikeFront() {
        return trIssuerNmLikeFront;
    }

    /**
     * trIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param trIssuerNmLikeFront trIssuerNmLikeFront に設定する
     */
    public void setTrIssuerNmLikeFront(String trIssuerNmLikeFront) {
        this.trIssuerNmLikeFront = trIssuerNmLikeFront;
    }

    /**
     * trIssueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trIssueDtGreaterThanEqual
     */
    public Date getTrIssueDtGreaterThanEqual() {
        return trIssueDtGreaterThanEqual;
    }

    /**
     * trIssueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param trIssueDtGreaterThanEqual trIssueDtGreaterThanEqual に設定する
     */
    public void setTrIssueDtGreaterThanEqual(Date trIssueDtGreaterThanEqual) {
        this.trIssueDtGreaterThanEqual = trIssueDtGreaterThanEqual;
    }

    /**
     * trIssueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the trIssueDtLessThanEqual
     */
    public Date getTrIssueDtLessThanEqual() {
        return trIssueDtLessThanEqual;
    }

    /**
     * trIssueDtLessThanEqual のセッターメソッドです。
     * 
     * @param trIssueDtLessThanEqual trIssueDtLessThanEqual に設定する
     */
    public void setTrIssueDtLessThanEqual(Date trIssueDtLessThanEqual) {
        this.trIssueDtLessThanEqual = trIssueDtLessThanEqual;
    }

    /**
     * trActvDscIdGreaterThan のゲッターメソッドです。
     * 
     * @return the trActvDscIdGreaterThan
     */
    public String getTrActvDscIdGreaterThan() {
        return trActvDscIdGreaterThan;
    }

    /**
     * trActvDscIdGreaterThan のセッターメソッドです。
     * 
     * @param trActvDscIdGreaterThan trActvDscIdGreaterThan に設定する
     */
    public void setTrActvDscIdGreaterThan(String trActvDscIdGreaterThan) {
        this.trActvDscIdGreaterThan = trActvDscIdGreaterThan;
    }

    /**
     * trActvDscIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trActvDscIdGreaterThanEqual
     */
    public String getTrActvDscIdGreaterThanEqual() {
        return trActvDscIdGreaterThanEqual;
    }

    /**
     * trActvDscIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trActvDscIdGreaterThanEqual trActvDscIdGreaterThanEqual に設定する
     */
    public void setTrActvDscIdGreaterThanEqual(String trActvDscIdGreaterThanEqual) {
        this.trActvDscIdGreaterThanEqual = trActvDscIdGreaterThanEqual;
    }

    /**
     * trActvDscIdLessThan のゲッターメソッドです。
     * 
     * @return the trActvDscIdLessThan
     */
    public String getTrActvDscIdLessThan() {
        return trActvDscIdLessThan;
    }

    /**
     * trActvDscIdLessThan のセッターメソッドです。
     * 
     * @param trActvDscIdLessThan trActvDscIdLessThan に設定する
     */
    public void setTrActvDscIdLessThan(String trActvDscIdLessThan) {
        this.trActvDscIdLessThan = trActvDscIdLessThan;
    }

    /**
     * trActvDscIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trActvDscIdLessThanEqual
     */
    public String getTrActvDscIdLessThanEqual() {
        return trActvDscIdLessThanEqual;
    }

    /**
     * trActvDscIdLessThanEqual のセッターメソッドです。
     * 
     * @param trActvDscIdLessThanEqual trActvDscIdLessThanEqual に設定する
     */
    public void setTrActvDscIdLessThanEqual(String trActvDscIdLessThanEqual) {
        this.trActvDscIdLessThanEqual = trActvDscIdLessThanEqual;
    }

    /**
     * trActvDscIdLikeFront のゲッターメソッドです。
     * 
     * @return the trActvDscIdLikeFront
     */
    public String getTrActvDscIdLikeFront() {
        return trActvDscIdLikeFront;
    }

    /**
     * trActvDscIdLikeFront のセッターメソッドです。
     * 
     * @param trActvDscIdLikeFront trActvDscIdLikeFront に設定する
     */
    public void setTrActvDscIdLikeFront(String trActvDscIdLikeFront) {
        this.trActvDscIdLikeFront = trActvDscIdLikeFront;
    }

    /**
     * trActvNmGreaterThan のゲッターメソッドです。
     * 
     * @return the trActvNmGreaterThan
     */
    public String getTrActvNmGreaterThan() {
        return trActvNmGreaterThan;
    }

    /**
     * trActvNmGreaterThan のセッターメソッドです。
     * 
     * @param trActvNmGreaterThan trActvNmGreaterThan に設定する
     */
    public void setTrActvNmGreaterThan(String trActvNmGreaterThan) {
        this.trActvNmGreaterThan = trActvNmGreaterThan;
    }

    /**
     * trActvNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trActvNmGreaterThanEqual
     */
    public String getTrActvNmGreaterThanEqual() {
        return trActvNmGreaterThanEqual;
    }

    /**
     * trActvNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param trActvNmGreaterThanEqual trActvNmGreaterThanEqual に設定する
     */
    public void setTrActvNmGreaterThanEqual(String trActvNmGreaterThanEqual) {
        this.trActvNmGreaterThanEqual = trActvNmGreaterThanEqual;
    }

    /**
     * trActvNmLessThan のゲッターメソッドです。
     * 
     * @return the trActvNmLessThan
     */
    public String getTrActvNmLessThan() {
        return trActvNmLessThan;
    }

    /**
     * trActvNmLessThan のセッターメソッドです。
     * 
     * @param trActvNmLessThan trActvNmLessThan に設定する
     */
    public void setTrActvNmLessThan(String trActvNmLessThan) {
        this.trActvNmLessThan = trActvNmLessThan;
    }

    /**
     * trActvNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the trActvNmLessThanEqual
     */
    public String getTrActvNmLessThanEqual() {
        return trActvNmLessThanEqual;
    }

    /**
     * trActvNmLessThanEqual のセッターメソッドです。
     * 
     * @param trActvNmLessThanEqual trActvNmLessThanEqual に設定する
     */
    public void setTrActvNmLessThanEqual(String trActvNmLessThanEqual) {
        this.trActvNmLessThanEqual = trActvNmLessThanEqual;
    }

    /**
     * trActvNmLikeFront のゲッターメソッドです。
     * 
     * @return the trActvNmLikeFront
     */
    public String getTrActvNmLikeFront() {
        return trActvNmLikeFront;
    }

    /**
     * trActvNmLikeFront のセッターメソッドです。
     * 
     * @param trActvNmLikeFront trActvNmLikeFront に設定する
     */
    public void setTrActvNmLikeFront(String trActvNmLikeFront) {
        this.trActvNmLikeFront = trActvNmLikeFront;
    }

    /**
     * trActvDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trActvDtGreaterThanEqual
     */
    public Date getTrActvDtGreaterThanEqual() {
        return trActvDtGreaterThanEqual;
    }

    /**
     * trActvDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param trActvDtGreaterThanEqual trActvDtGreaterThanEqual に設定する
     */
    public void setTrActvDtGreaterThanEqual(Date trActvDtGreaterThanEqual) {
        this.trActvDtGreaterThanEqual = trActvDtGreaterThanEqual;
    }

    /**
     * trActvDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the trActvDtLessThanEqual
     */
    public Date getTrActvDtLessThanEqual() {
        return trActvDtLessThanEqual;
    }

    /**
     * trActvDtLessThanEqual のセッターメソッドです。
     * 
     * @param trActvDtLessThanEqual trActvDtLessThanEqual に設定する
     */
    public void setTrActvDtLessThanEqual(Date trActvDtLessThanEqual) {
        this.trActvDtLessThanEqual = trActvDtLessThanEqual;
    }

    /**
     * trActvMethTypGreaterThan のゲッターメソッドです。
     * 
     * @return the trActvMethTypGreaterThan
     */
    public String getTrActvMethTypGreaterThan() {
        return trActvMethTypGreaterThan;
    }

    /**
     * trActvMethTypGreaterThan のセッターメソッドです。
     * 
     * @param trActvMethTypGreaterThan trActvMethTypGreaterThan に設定する
     */
    public void setTrActvMethTypGreaterThan(String trActvMethTypGreaterThan) {
        this.trActvMethTypGreaterThan = trActvMethTypGreaterThan;
    }

    /**
     * trActvMethTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trActvMethTypGreaterThanEqual
     */
    public String getTrActvMethTypGreaterThanEqual() {
        return trActvMethTypGreaterThanEqual;
    }

    /**
     * trActvMethTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param trActvMethTypGreaterThanEqual trActvMethTypGreaterThanEqual に設定する
     */
    public void setTrActvMethTypGreaterThanEqual(String trActvMethTypGreaterThanEqual) {
        this.trActvMethTypGreaterThanEqual = trActvMethTypGreaterThanEqual;
    }

    /**
     * trActvMethTypLessThan のゲッターメソッドです。
     * 
     * @return the trActvMethTypLessThan
     */
    public String getTrActvMethTypLessThan() {
        return trActvMethTypLessThan;
    }

    /**
     * trActvMethTypLessThan のセッターメソッドです。
     * 
     * @param trActvMethTypLessThan trActvMethTypLessThan に設定する
     */
    public void setTrActvMethTypLessThan(String trActvMethTypLessThan) {
        this.trActvMethTypLessThan = trActvMethTypLessThan;
    }

    /**
     * trActvMethTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the trActvMethTypLessThanEqual
     */
    public String getTrActvMethTypLessThanEqual() {
        return trActvMethTypLessThanEqual;
    }

    /**
     * trActvMethTypLessThanEqual のセッターメソッドです。
     * 
     * @param trActvMethTypLessThanEqual trActvMethTypLessThanEqual に設定する
     */
    public void setTrActvMethTypLessThanEqual(String trActvMethTypLessThanEqual) {
        this.trActvMethTypLessThanEqual = trActvMethTypLessThanEqual;
    }

    /**
     * trActvMethTypLikeFront のゲッターメソッドです。
     * 
     * @return the trActvMethTypLikeFront
     */
    public String getTrActvMethTypLikeFront() {
        return trActvMethTypLikeFront;
    }

    /**
     * trActvMethTypLikeFront のセッターメソッドです。
     * 
     * @param trActvMethTypLikeFront trActvMethTypLikeFront に設定する
     */
    public void setTrActvMethTypLikeFront(String trActvMethTypLikeFront) {
        this.trActvMethTypLikeFront = trActvMethTypLikeFront;
    }

    /**
     * trRcvDscIdGreaterThan のゲッターメソッドです。
     * 
     * @return the trRcvDscIdGreaterThan
     */
    public String getTrRcvDscIdGreaterThan() {
        return trRcvDscIdGreaterThan;
    }

    /**
     * trRcvDscIdGreaterThan のセッターメソッドです。
     * 
     * @param trRcvDscIdGreaterThan trRcvDscIdGreaterThan に設定する
     */
    public void setTrRcvDscIdGreaterThan(String trRcvDscIdGreaterThan) {
        this.trRcvDscIdGreaterThan = trRcvDscIdGreaterThan;
    }

    /**
     * trRcvDscIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trRcvDscIdGreaterThanEqual
     */
    public String getTrRcvDscIdGreaterThanEqual() {
        return trRcvDscIdGreaterThanEqual;
    }

    /**
     * trRcvDscIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trRcvDscIdGreaterThanEqual trRcvDscIdGreaterThanEqual に設定する
     */
    public void setTrRcvDscIdGreaterThanEqual(String trRcvDscIdGreaterThanEqual) {
        this.trRcvDscIdGreaterThanEqual = trRcvDscIdGreaterThanEqual;
    }

    /**
     * trRcvDscIdLessThan のゲッターメソッドです。
     * 
     * @return the trRcvDscIdLessThan
     */
    public String getTrRcvDscIdLessThan() {
        return trRcvDscIdLessThan;
    }

    /**
     * trRcvDscIdLessThan のセッターメソッドです。
     * 
     * @param trRcvDscIdLessThan trRcvDscIdLessThan に設定する
     */
    public void setTrRcvDscIdLessThan(String trRcvDscIdLessThan) {
        this.trRcvDscIdLessThan = trRcvDscIdLessThan;
    }

    /**
     * trRcvDscIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trRcvDscIdLessThanEqual
     */
    public String getTrRcvDscIdLessThanEqual() {
        return trRcvDscIdLessThanEqual;
    }

    /**
     * trRcvDscIdLessThanEqual のセッターメソッドです。
     * 
     * @param trRcvDscIdLessThanEqual trRcvDscIdLessThanEqual に設定する
     */
    public void setTrRcvDscIdLessThanEqual(String trRcvDscIdLessThanEqual) {
        this.trRcvDscIdLessThanEqual = trRcvDscIdLessThanEqual;
    }

    /**
     * trRcvDscIdLikeFront のゲッターメソッドです。
     * 
     * @return the trRcvDscIdLikeFront
     */
    public String getTrRcvDscIdLikeFront() {
        return trRcvDscIdLikeFront;
    }

    /**
     * trRcvDscIdLikeFront のセッターメソッドです。
     * 
     * @param trRcvDscIdLikeFront trRcvDscIdLikeFront に設定する
     */
    public void setTrRcvDscIdLikeFront(String trRcvDscIdLikeFront) {
        this.trRcvDscIdLikeFront = trRcvDscIdLikeFront;
    }

    /**
     * trRcvNmGreaterThan のゲッターメソッドです。
     * 
     * @return the trRcvNmGreaterThan
     */
    public String getTrRcvNmGreaterThan() {
        return trRcvNmGreaterThan;
    }

    /**
     * trRcvNmGreaterThan のセッターメソッドです。
     * 
     * @param trRcvNmGreaterThan trRcvNmGreaterThan に設定する
     */
    public void setTrRcvNmGreaterThan(String trRcvNmGreaterThan) {
        this.trRcvNmGreaterThan = trRcvNmGreaterThan;
    }

    /**
     * trRcvNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trRcvNmGreaterThanEqual
     */
    public String getTrRcvNmGreaterThanEqual() {
        return trRcvNmGreaterThanEqual;
    }

    /**
     * trRcvNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param trRcvNmGreaterThanEqual trRcvNmGreaterThanEqual に設定する
     */
    public void setTrRcvNmGreaterThanEqual(String trRcvNmGreaterThanEqual) {
        this.trRcvNmGreaterThanEqual = trRcvNmGreaterThanEqual;
    }

    /**
     * trRcvNmLessThan のゲッターメソッドです。
     * 
     * @return the trRcvNmLessThan
     */
    public String getTrRcvNmLessThan() {
        return trRcvNmLessThan;
    }

    /**
     * trRcvNmLessThan のセッターメソッドです。
     * 
     * @param trRcvNmLessThan trRcvNmLessThan に設定する
     */
    public void setTrRcvNmLessThan(String trRcvNmLessThan) {
        this.trRcvNmLessThan = trRcvNmLessThan;
    }

    /**
     * trRcvNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the trRcvNmLessThanEqual
     */
    public String getTrRcvNmLessThanEqual() {
        return trRcvNmLessThanEqual;
    }

    /**
     * trRcvNmLessThanEqual のセッターメソッドです。
     * 
     * @param trRcvNmLessThanEqual trRcvNmLessThanEqual に設定する
     */
    public void setTrRcvNmLessThanEqual(String trRcvNmLessThanEqual) {
        this.trRcvNmLessThanEqual = trRcvNmLessThanEqual;
    }

    /**
     * trRcvNmLikeFront のゲッターメソッドです。
     * 
     * @return the trRcvNmLikeFront
     */
    public String getTrRcvNmLikeFront() {
        return trRcvNmLikeFront;
    }

    /**
     * trRcvNmLikeFront のセッターメソッドです。
     * 
     * @param trRcvNmLikeFront trRcvNmLikeFront に設定する
     */
    public void setTrRcvNmLikeFront(String trRcvNmLikeFront) {
        this.trRcvNmLikeFront = trRcvNmLikeFront;
    }

    /**
     * trRcvDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trRcvDtGreaterThanEqual
     */
    public Date getTrRcvDtGreaterThanEqual() {
        return trRcvDtGreaterThanEqual;
    }

    /**
     * trRcvDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param trRcvDtGreaterThanEqual trRcvDtGreaterThanEqual に設定する
     */
    public void setTrRcvDtGreaterThanEqual(Date trRcvDtGreaterThanEqual) {
        this.trRcvDtGreaterThanEqual = trRcvDtGreaterThanEqual;
    }

    /**
     * trRcvDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the trRcvDtLessThanEqual
     */
    public Date getTrRcvDtLessThanEqual() {
        return trRcvDtLessThanEqual;
    }

    /**
     * trRcvDtLessThanEqual のセッターメソッドです。
     * 
     * @param trRcvDtLessThanEqual trRcvDtLessThanEqual に設定する
     */
    public void setTrRcvDtLessThanEqual(Date trRcvDtLessThanEqual) {
        this.trRcvDtLessThanEqual = trRcvDtLessThanEqual;
    }

    /**
     * trRcvMethTypGreaterThan のゲッターメソッドです。
     * 
     * @return the trRcvMethTypGreaterThan
     */
    public String getTrRcvMethTypGreaterThan() {
        return trRcvMethTypGreaterThan;
    }

    /**
     * trRcvMethTypGreaterThan のセッターメソッドです。
     * 
     * @param trRcvMethTypGreaterThan trRcvMethTypGreaterThan に設定する
     */
    public void setTrRcvMethTypGreaterThan(String trRcvMethTypGreaterThan) {
        this.trRcvMethTypGreaterThan = trRcvMethTypGreaterThan;
    }

    /**
     * trRcvMethTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trRcvMethTypGreaterThanEqual
     */
    public String getTrRcvMethTypGreaterThanEqual() {
        return trRcvMethTypGreaterThanEqual;
    }

    /**
     * trRcvMethTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param trRcvMethTypGreaterThanEqual trRcvMethTypGreaterThanEqual に設定する
     */
    public void setTrRcvMethTypGreaterThanEqual(String trRcvMethTypGreaterThanEqual) {
        this.trRcvMethTypGreaterThanEqual = trRcvMethTypGreaterThanEqual;
    }

    /**
     * trRcvMethTypLessThan のゲッターメソッドです。
     * 
     * @return the trRcvMethTypLessThan
     */
    public String getTrRcvMethTypLessThan() {
        return trRcvMethTypLessThan;
    }

    /**
     * trRcvMethTypLessThan のセッターメソッドです。
     * 
     * @param trRcvMethTypLessThan trRcvMethTypLessThan に設定する
     */
    public void setTrRcvMethTypLessThan(String trRcvMethTypLessThan) {
        this.trRcvMethTypLessThan = trRcvMethTypLessThan;
    }

    /**
     * trRcvMethTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the trRcvMethTypLessThanEqual
     */
    public String getTrRcvMethTypLessThanEqual() {
        return trRcvMethTypLessThanEqual;
    }

    /**
     * trRcvMethTypLessThanEqual のセッターメソッドです。
     * 
     * @param trRcvMethTypLessThanEqual trRcvMethTypLessThanEqual に設定する
     */
    public void setTrRcvMethTypLessThanEqual(String trRcvMethTypLessThanEqual) {
        this.trRcvMethTypLessThanEqual = trRcvMethTypLessThanEqual;
    }

    /**
     * trRcvMethTypLikeFront のゲッターメソッドです。
     * 
     * @return the trRcvMethTypLikeFront
     */
    public String getTrRcvMethTypLikeFront() {
        return trRcvMethTypLikeFront;
    }

    /**
     * trRcvMethTypLikeFront のセッターメソッドです。
     * 
     * @param trRcvMethTypLikeFront trRcvMethTypLikeFront に設定する
     */
    public void setTrRcvMethTypLikeFront(String trRcvMethTypLikeFront) {
        this.trRcvMethTypLikeFront = trRcvMethTypLikeFront;
    }

    /**
     * finalEditDscIdGreaterThan のゲッターメソッドです。
     * 
     * @return the finalEditDscIdGreaterThan
     */
    public String getFinalEditDscIdGreaterThan() {
        return finalEditDscIdGreaterThan;
    }

    /**
     * finalEditDscIdGreaterThan のセッターメソッドです。
     * 
     * @param finalEditDscIdGreaterThan finalEditDscIdGreaterThan に設定する
     */
    public void setFinalEditDscIdGreaterThan(String finalEditDscIdGreaterThan) {
        this.finalEditDscIdGreaterThan = finalEditDscIdGreaterThan;
    }

    /**
     * finalEditDscIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the finalEditDscIdGreaterThanEqual
     */
    public String getFinalEditDscIdGreaterThanEqual() {
        return finalEditDscIdGreaterThanEqual;
    }

    /**
     * finalEditDscIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param finalEditDscIdGreaterThanEqual finalEditDscIdGreaterThanEqual に設定する
     */
    public void setFinalEditDscIdGreaterThanEqual(String finalEditDscIdGreaterThanEqual) {
        this.finalEditDscIdGreaterThanEqual = finalEditDscIdGreaterThanEqual;
    }

    /**
     * finalEditDscIdLessThan のゲッターメソッドです。
     * 
     * @return the finalEditDscIdLessThan
     */
    public String getFinalEditDscIdLessThan() {
        return finalEditDscIdLessThan;
    }

    /**
     * finalEditDscIdLessThan のセッターメソッドです。
     * 
     * @param finalEditDscIdLessThan finalEditDscIdLessThan に設定する
     */
    public void setFinalEditDscIdLessThan(String finalEditDscIdLessThan) {
        this.finalEditDscIdLessThan = finalEditDscIdLessThan;
    }

    /**
     * finalEditDscIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the finalEditDscIdLessThanEqual
     */
    public String getFinalEditDscIdLessThanEqual() {
        return finalEditDscIdLessThanEqual;
    }

    /**
     * finalEditDscIdLessThanEqual のセッターメソッドです。
     * 
     * @param finalEditDscIdLessThanEqual finalEditDscIdLessThanEqual に設定する
     */
    public void setFinalEditDscIdLessThanEqual(String finalEditDscIdLessThanEqual) {
        this.finalEditDscIdLessThanEqual = finalEditDscIdLessThanEqual;
    }

    /**
     * finalEditDscIdLikeFront のゲッターメソッドです。
     * 
     * @return the finalEditDscIdLikeFront
     */
    public String getFinalEditDscIdLikeFront() {
        return finalEditDscIdLikeFront;
    }

    /**
     * finalEditDscIdLikeFront のセッターメソッドです。
     * 
     * @param finalEditDscIdLikeFront finalEditDscIdLikeFront に設定する
     */
    public void setFinalEditDscIdLikeFront(String finalEditDscIdLikeFront) {
        this.finalEditDscIdLikeFront = finalEditDscIdLikeFront;
    }

    /**
     * finalEditNmGreaterThan のゲッターメソッドです。
     * 
     * @return the finalEditNmGreaterThan
     */
    public String getFinalEditNmGreaterThan() {
        return finalEditNmGreaterThan;
    }

    /**
     * finalEditNmGreaterThan のセッターメソッドです。
     * 
     * @param finalEditNmGreaterThan finalEditNmGreaterThan に設定する
     */
    public void setFinalEditNmGreaterThan(String finalEditNmGreaterThan) {
        this.finalEditNmGreaterThan = finalEditNmGreaterThan;
    }

    /**
     * finalEditNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the finalEditNmGreaterThanEqual
     */
    public String getFinalEditNmGreaterThanEqual() {
        return finalEditNmGreaterThanEqual;
    }

    /**
     * finalEditNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param finalEditNmGreaterThanEqual finalEditNmGreaterThanEqual に設定する
     */
    public void setFinalEditNmGreaterThanEqual(String finalEditNmGreaterThanEqual) {
        this.finalEditNmGreaterThanEqual = finalEditNmGreaterThanEqual;
    }

    /**
     * finalEditNmLessThan のゲッターメソッドです。
     * 
     * @return the finalEditNmLessThan
     */
    public String getFinalEditNmLessThan() {
        return finalEditNmLessThan;
    }

    /**
     * finalEditNmLessThan のセッターメソッドです。
     * 
     * @param finalEditNmLessThan finalEditNmLessThan に設定する
     */
    public void setFinalEditNmLessThan(String finalEditNmLessThan) {
        this.finalEditNmLessThan = finalEditNmLessThan;
    }

    /**
     * finalEditNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the finalEditNmLessThanEqual
     */
    public String getFinalEditNmLessThanEqual() {
        return finalEditNmLessThanEqual;
    }

    /**
     * finalEditNmLessThanEqual のセッターメソッドです。
     * 
     * @param finalEditNmLessThanEqual finalEditNmLessThanEqual に設定する
     */
    public void setFinalEditNmLessThanEqual(String finalEditNmLessThanEqual) {
        this.finalEditNmLessThanEqual = finalEditNmLessThanEqual;
    }

    /**
     * finalEditNmLikeFront のゲッターメソッドです。
     * 
     * @return the finalEditNmLikeFront
     */
    public String getFinalEditNmLikeFront() {
        return finalEditNmLikeFront;
    }

    /**
     * finalEditNmLikeFront のセッターメソッドです。
     * 
     * @param finalEditNmLikeFront finalEditNmLikeFront に設定する
     */
    public void setFinalEditNmLikeFront(String finalEditNmLikeFront) {
        this.finalEditNmLikeFront = finalEditNmLikeFront;
    }

    /**
     * finalEditDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the finalEditDtGreaterThanEqual
     */
    public Date getFinalEditDtGreaterThanEqual() {
        return finalEditDtGreaterThanEqual;
    }

    /**
     * finalEditDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param finalEditDtGreaterThanEqual finalEditDtGreaterThanEqual に設定する
     */
    public void setFinalEditDtGreaterThanEqual(Date finalEditDtGreaterThanEqual) {
        this.finalEditDtGreaterThanEqual = finalEditDtGreaterThanEqual;
    }

    /**
     * finalEditDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the finalEditDtLessThanEqual
     */
    public Date getFinalEditDtLessThanEqual() {
        return finalEditDtLessThanEqual;
    }

    /**
     * finalEditDtLessThanEqual のセッターメソッドです。
     * 
     * @param finalEditDtLessThanEqual finalEditDtLessThanEqual に設定する
     */
    public void setFinalEditDtLessThanEqual(Date finalEditDtLessThanEqual) {
        this.finalEditDtLessThanEqual = finalEditDtLessThanEqual;
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

