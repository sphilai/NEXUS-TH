/*
 * PROJECT：eca0027
 * 
 * TtOdrUploadReqMgt の検索条件Domainクラス
 * テーブル概要：Order Upload Request Management/受注アップロードリクエスト管理  Manage the request information of the order upload./受注アップロードのリクエスト情報を管理する。
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/26  DNITS  新規作成
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
 * TtOdrUploadReqMgt の検索条件Domainクラスです。<BR>
 * テーブル概要：Order Upload Request Management/受注アップロードリクエスト管理  Manage the request information of the order upload./受注アップロードのリクエスト情報を管理する。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/01/26 19:15:00<BR>
 * 
 * テーブル定義から2017/01/26に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13533 $
 */
public class TtOdrUploadReqMgtCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * REQUEST ID/リクエストID
     */
    private String requestId;

    /**
     * REQUEST DATE/リクエスト日時
     */
    private Date requestDt;

    /**
     * UPLOAD FILE ID/アップロードファイルID
     */
    private String uploadFileId;

    /**
     * UPLOAD FILE NAME/アップロードファイル名
     */
    private String uploadFileNm;

    /**
     * UPLOAD FILE LINE COUNT/アップロードファイル行数
     */
    private BigDecimal uploadFileLineCnt;

    /**
     * UPLOAD USER ID/アップロードユーザーID
     */
    private String uploadUserId;

    /**
     * STATUS/ステータス
     */
    private String status;

    /**
     * ERROR FILE ID/エラーファイルID
     */
    private String errFileId;

    /**
     * ERROR FILE NAME/エラーファイル名
     */
    private String errFileNm;

    /**
     * FORECAST REPLACE FLAG/内示洗い替えフラグ
     */
    private String fcstReplaceFlg;

    /**
     * RECEIVE ORDER COMPANY CODE/受注会社コード
     */
    private String rcvOdrCompCd;

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
     * REQUEST ID/リクエストID（大なり）
     */
    private String requestIdGreaterThan;

    /**
     * REQUEST ID/リクエストID（大なりイコール）
     */
    private String requestIdGreaterThanEqual;

    /**
     * REQUEST ID/リクエストID（小なり）
     */
    private String requestIdLessThan;

    /**
     * REQUEST ID/リクエストID（小なりイコール）
     */
    private String requestIdLessThanEqual;

    /**
     * REQUEST ID/リクエストID（前方一致）
     */
    private String requestIdLikeFront;

    /**
     * REQUEST DATE/リクエスト日時（大なりイコール）
     */
    private Date requestDtGreaterThanEqual;

    /**
     * REQUEST DATE/リクエスト日時（小なりイコール）
     */
    private Date requestDtLessThanEqual;

    /**
     * UPLOAD FILE ID/アップロードファイルID（大なり）
     */
    private String uploadFileIdGreaterThan;

    /**
     * UPLOAD FILE ID/アップロードファイルID（大なりイコール）
     */
    private String uploadFileIdGreaterThanEqual;

    /**
     * UPLOAD FILE ID/アップロードファイルID（小なり）
     */
    private String uploadFileIdLessThan;

    /**
     * UPLOAD FILE ID/アップロードファイルID（小なりイコール）
     */
    private String uploadFileIdLessThanEqual;

    /**
     * UPLOAD FILE ID/アップロードファイルID（前方一致）
     */
    private String uploadFileIdLikeFront;

    /**
     * UPLOAD FILE NAME/アップロードファイル名（大なり）
     */
    private String uploadFileNmGreaterThan;

    /**
     * UPLOAD FILE NAME/アップロードファイル名（大なりイコール）
     */
    private String uploadFileNmGreaterThanEqual;

    /**
     * UPLOAD FILE NAME/アップロードファイル名（小なり）
     */
    private String uploadFileNmLessThan;

    /**
     * UPLOAD FILE NAME/アップロードファイル名（小なりイコール）
     */
    private String uploadFileNmLessThanEqual;

    /**
     * UPLOAD FILE NAME/アップロードファイル名（前方一致）
     */
    private String uploadFileNmLikeFront;

    /**
     * UPLOAD USER ID/アップロードユーザーID（大なり）
     */
    private String uploadUserIdGreaterThan;

    /**
     * UPLOAD USER ID/アップロードユーザーID（大なりイコール）
     */
    private String uploadUserIdGreaterThanEqual;

    /**
     * UPLOAD USER ID/アップロードユーザーID（小なり）
     */
    private String uploadUserIdLessThan;

    /**
     * UPLOAD USER ID/アップロードユーザーID（小なりイコール）
     */
    private String uploadUserIdLessThanEqual;

    /**
     * UPLOAD USER ID/アップロードユーザーID（前方一致）
     */
    private String uploadUserIdLikeFront;

    /**
     * STATUS/ステータス（大なり）
     */
    private String statusGreaterThan;

    /**
     * STATUS/ステータス（大なりイコール）
     */
    private String statusGreaterThanEqual;

    /**
     * STATUS/ステータス（小なり）
     */
    private String statusLessThan;

    /**
     * STATUS/ステータス（小なりイコール）
     */
    private String statusLessThanEqual;

    /**
     * STATUS/ステータス（前方一致）
     */
    private String statusLikeFront;

    /**
     * ERROR FILE ID/エラーファイルID（大なり）
     */
    private String errFileIdGreaterThan;

    /**
     * ERROR FILE ID/エラーファイルID（大なりイコール）
     */
    private String errFileIdGreaterThanEqual;

    /**
     * ERROR FILE ID/エラーファイルID（小なり）
     */
    private String errFileIdLessThan;

    /**
     * ERROR FILE ID/エラーファイルID（小なりイコール）
     */
    private String errFileIdLessThanEqual;

    /**
     * ERROR FILE ID/エラーファイルID（前方一致）
     */
    private String errFileIdLikeFront;

    /**
     * ERROR FILE NAME/エラーファイル名（大なり）
     */
    private String errFileNmGreaterThan;

    /**
     * ERROR FILE NAME/エラーファイル名（大なりイコール）
     */
    private String errFileNmGreaterThanEqual;

    /**
     * ERROR FILE NAME/エラーファイル名（小なり）
     */
    private String errFileNmLessThan;

    /**
     * ERROR FILE NAME/エラーファイル名（小なりイコール）
     */
    private String errFileNmLessThanEqual;

    /**
     * ERROR FILE NAME/エラーファイル名（前方一致）
     */
    private String errFileNmLikeFront;

    /**
     * FORECAST REPLACE FLAG/内示洗い替えフラグ（大なり）
     */
    private String fcstReplaceFlgGreaterThan;

    /**
     * FORECAST REPLACE FLAG/内示洗い替えフラグ（大なりイコール）
     */
    private String fcstReplaceFlgGreaterThanEqual;

    /**
     * FORECAST REPLACE FLAG/内示洗い替えフラグ（小なり）
     */
    private String fcstReplaceFlgLessThan;

    /**
     * FORECAST REPLACE FLAG/内示洗い替えフラグ（小なりイコール）
     */
    private String fcstReplaceFlgLessThanEqual;

    /**
     * FORECAST REPLACE FLAG/内示洗い替えフラグ（前方一致）
     */
    private String fcstReplaceFlgLikeFront;

    /**
     * RECEIVE ORDER COMPANY CODE/受注会社コード（大なり）
     */
    private String rcvOdrCompCdGreaterThan;

    /**
     * RECEIVE ORDER COMPANY CODE/受注会社コード（大なりイコール）
     */
    private String rcvOdrCompCdGreaterThanEqual;

    /**
     * RECEIVE ORDER COMPANY CODE/受注会社コード（小なり）
     */
    private String rcvOdrCompCdLessThan;

    /**
     * RECEIVE ORDER COMPANY CODE/受注会社コード（小なりイコール）
     */
    private String rcvOdrCompCdLessThanEqual;

    /**
     * RECEIVE ORDER COMPANY CODE/受注会社コード（前方一致）
     */
    private String rcvOdrCompCdLikeFront;

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
    public TtOdrUploadReqMgtCriteriaDomain() {
    }

    /**
     * requestId のゲッターメソッドです。
     * 
     * @return the requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * requestId のセッターメソッドです。
     * 
     * @param requestId requestId に設定する
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * requestDt のゲッターメソッドです。
     * 
     * @return the requestDt
     */
    public Date getRequestDt() {
        return requestDt;
    }

    /**
     * requestDt のセッターメソッドです。
     * 
     * @param requestDt requestDt に設定する
     */
    public void setRequestDt(Date requestDt) {
        this.requestDt = requestDt;
    }

    /**
     * uploadFileId のゲッターメソッドです。
     * 
     * @return the uploadFileId
     */
    public String getUploadFileId() {
        return uploadFileId;
    }

    /**
     * uploadFileId のセッターメソッドです。
     * 
     * @param uploadFileId uploadFileId に設定する
     */
    public void setUploadFileId(String uploadFileId) {
        this.uploadFileId = uploadFileId;
    }

    /**
     * uploadFileNm のゲッターメソッドです。
     * 
     * @return the uploadFileNm
     */
    public String getUploadFileNm() {
        return uploadFileNm;
    }

    /**
     * uploadFileNm のセッターメソッドです。
     * 
     * @param uploadFileNm uploadFileNm に設定する
     */
    public void setUploadFileNm(String uploadFileNm) {
        this.uploadFileNm = uploadFileNm;
    }

    /**
     * uploadFileLineCnt のゲッターメソッドです。
     * 
     * @return the uploadFileLineCnt
     */
    public BigDecimal getUploadFileLineCnt() {
        return uploadFileLineCnt;
    }

    /**
     * uploadFileLineCnt のセッターメソッドです。
     * 
     * @param uploadFileLineCnt uploadFileLineCnt に設定する
     */
    public void setUploadFileLineCnt(BigDecimal uploadFileLineCnt) {
        this.uploadFileLineCnt = uploadFileLineCnt;
    }

    /**
     * uploadUserId のゲッターメソッドです。
     * 
     * @return the uploadUserId
     */
    public String getUploadUserId() {
        return uploadUserId;
    }

    /**
     * uploadUserId のセッターメソッドです。
     * 
     * @param uploadUserId uploadUserId に設定する
     */
    public void setUploadUserId(String uploadUserId) {
        this.uploadUserId = uploadUserId;
    }

    /**
     * status のゲッターメソッドです。
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * status のセッターメソッドです。
     * 
     * @param status status に設定する
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * errFileId のゲッターメソッドです。
     * 
     * @return the errFileId
     */
    public String getErrFileId() {
        return errFileId;
    }

    /**
     * errFileId のセッターメソッドです。
     * 
     * @param errFileId errFileId に設定する
     */
    public void setErrFileId(String errFileId) {
        this.errFileId = errFileId;
    }

    /**
     * errFileNm のゲッターメソッドです。
     * 
     * @return the errFileNm
     */
    public String getErrFileNm() {
        return errFileNm;
    }

    /**
     * errFileNm のセッターメソッドです。
     * 
     * @param errFileNm errFileNm に設定する
     */
    public void setErrFileNm(String errFileNm) {
        this.errFileNm = errFileNm;
    }

    /**
     * fcstReplaceFlg のゲッターメソッドです。
     * 
     * @return the fcstReplaceFlg
     */
    public String getFcstReplaceFlg() {
        return fcstReplaceFlg;
    }

    /**
     * fcstReplaceFlg のセッターメソッドです。
     * 
     * @param fcstReplaceFlg fcstReplaceFlg に設定する
     */
    public void setFcstReplaceFlg(String fcstReplaceFlg) {
        this.fcstReplaceFlg = fcstReplaceFlg;
    }

    /**
     * rcvOdrCompCd のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCd
     */
    public String getRcvOdrCompCd() {
        return rcvOdrCompCd;
    }

    /**
     * rcvOdrCompCd のセッターメソッドです。
     * 
     * @param rcvOdrCompCd rcvOdrCompCd に設定する
     */
    public void setRcvOdrCompCd(String rcvOdrCompCd) {
        this.rcvOdrCompCd = rcvOdrCompCd;
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
     * requestIdGreaterThan のゲッターメソッドです。
     * 
     * @return the requestIdGreaterThan
     */
    public String getRequestIdGreaterThan() {
        return requestIdGreaterThan;
    }

    /**
     * requestIdGreaterThan のセッターメソッドです。
     * 
     * @param requestIdGreaterThan requestIdGreaterThan に設定する
     */
    public void setRequestIdGreaterThan(String requestIdGreaterThan) {
        this.requestIdGreaterThan = requestIdGreaterThan;
    }

    /**
     * requestIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestIdGreaterThanEqual
     */
    public String getRequestIdGreaterThanEqual() {
        return requestIdGreaterThanEqual;
    }

    /**
     * requestIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestIdGreaterThanEqual requestIdGreaterThanEqual に設定する
     */
    public void setRequestIdGreaterThanEqual(String requestIdGreaterThanEqual) {
        this.requestIdGreaterThanEqual = requestIdGreaterThanEqual;
    }

    /**
     * requestIdLessThan のゲッターメソッドです。
     * 
     * @return the requestIdLessThan
     */
    public String getRequestIdLessThan() {
        return requestIdLessThan;
    }

    /**
     * requestIdLessThan のセッターメソッドです。
     * 
     * @param requestIdLessThan requestIdLessThan に設定する
     */
    public void setRequestIdLessThan(String requestIdLessThan) {
        this.requestIdLessThan = requestIdLessThan;
    }

    /**
     * requestIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestIdLessThanEqual
     */
    public String getRequestIdLessThanEqual() {
        return requestIdLessThanEqual;
    }

    /**
     * requestIdLessThanEqual のセッターメソッドです。
     * 
     * @param requestIdLessThanEqual requestIdLessThanEqual に設定する
     */
    public void setRequestIdLessThanEqual(String requestIdLessThanEqual) {
        this.requestIdLessThanEqual = requestIdLessThanEqual;
    }

    /**
     * requestIdLikeFront のゲッターメソッドです。
     * 
     * @return the requestIdLikeFront
     */
    public String getRequestIdLikeFront() {
        return requestIdLikeFront;
    }

    /**
     * requestIdLikeFront のセッターメソッドです。
     * 
     * @param requestIdLikeFront requestIdLikeFront に設定する
     */
    public void setRequestIdLikeFront(String requestIdLikeFront) {
        this.requestIdLikeFront = requestIdLikeFront;
    }

    /**
     * requestDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestDtGreaterThanEqual
     */
    public Date getRequestDtGreaterThanEqual() {
        return requestDtGreaterThanEqual;
    }

    /**
     * requestDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestDtGreaterThanEqual requestDtGreaterThanEqual に設定する
     */
    public void setRequestDtGreaterThanEqual(Date requestDtGreaterThanEqual) {
        this.requestDtGreaterThanEqual = requestDtGreaterThanEqual;
    }

    /**
     * requestDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestDtLessThanEqual
     */
    public Date getRequestDtLessThanEqual() {
        return requestDtLessThanEqual;
    }

    /**
     * requestDtLessThanEqual のセッターメソッドです。
     * 
     * @param requestDtLessThanEqual requestDtLessThanEqual に設定する
     */
    public void setRequestDtLessThanEqual(Date requestDtLessThanEqual) {
        this.requestDtLessThanEqual = requestDtLessThanEqual;
    }

    /**
     * uploadFileIdGreaterThan のゲッターメソッドです。
     * 
     * @return the uploadFileIdGreaterThan
     */
    public String getUploadFileIdGreaterThan() {
        return uploadFileIdGreaterThan;
    }

    /**
     * uploadFileIdGreaterThan のセッターメソッドです。
     * 
     * @param uploadFileIdGreaterThan uploadFileIdGreaterThan に設定する
     */
    public void setUploadFileIdGreaterThan(String uploadFileIdGreaterThan) {
        this.uploadFileIdGreaterThan = uploadFileIdGreaterThan;
    }

    /**
     * uploadFileIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the uploadFileIdGreaterThanEqual
     */
    public String getUploadFileIdGreaterThanEqual() {
        return uploadFileIdGreaterThanEqual;
    }

    /**
     * uploadFileIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param uploadFileIdGreaterThanEqual uploadFileIdGreaterThanEqual に設定する
     */
    public void setUploadFileIdGreaterThanEqual(String uploadFileIdGreaterThanEqual) {
        this.uploadFileIdGreaterThanEqual = uploadFileIdGreaterThanEqual;
    }

    /**
     * uploadFileIdLessThan のゲッターメソッドです。
     * 
     * @return the uploadFileIdLessThan
     */
    public String getUploadFileIdLessThan() {
        return uploadFileIdLessThan;
    }

    /**
     * uploadFileIdLessThan のセッターメソッドです。
     * 
     * @param uploadFileIdLessThan uploadFileIdLessThan に設定する
     */
    public void setUploadFileIdLessThan(String uploadFileIdLessThan) {
        this.uploadFileIdLessThan = uploadFileIdLessThan;
    }

    /**
     * uploadFileIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the uploadFileIdLessThanEqual
     */
    public String getUploadFileIdLessThanEqual() {
        return uploadFileIdLessThanEqual;
    }

    /**
     * uploadFileIdLessThanEqual のセッターメソッドです。
     * 
     * @param uploadFileIdLessThanEqual uploadFileIdLessThanEqual に設定する
     */
    public void setUploadFileIdLessThanEqual(String uploadFileIdLessThanEqual) {
        this.uploadFileIdLessThanEqual = uploadFileIdLessThanEqual;
    }

    /**
     * uploadFileIdLikeFront のゲッターメソッドです。
     * 
     * @return the uploadFileIdLikeFront
     */
    public String getUploadFileIdLikeFront() {
        return uploadFileIdLikeFront;
    }

    /**
     * uploadFileIdLikeFront のセッターメソッドです。
     * 
     * @param uploadFileIdLikeFront uploadFileIdLikeFront に設定する
     */
    public void setUploadFileIdLikeFront(String uploadFileIdLikeFront) {
        this.uploadFileIdLikeFront = uploadFileIdLikeFront;
    }

    /**
     * uploadFileNmGreaterThan のゲッターメソッドです。
     * 
     * @return the uploadFileNmGreaterThan
     */
    public String getUploadFileNmGreaterThan() {
        return uploadFileNmGreaterThan;
    }

    /**
     * uploadFileNmGreaterThan のセッターメソッドです。
     * 
     * @param uploadFileNmGreaterThan uploadFileNmGreaterThan に設定する
     */
    public void setUploadFileNmGreaterThan(String uploadFileNmGreaterThan) {
        this.uploadFileNmGreaterThan = uploadFileNmGreaterThan;
    }

    /**
     * uploadFileNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the uploadFileNmGreaterThanEqual
     */
    public String getUploadFileNmGreaterThanEqual() {
        return uploadFileNmGreaterThanEqual;
    }

    /**
     * uploadFileNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param uploadFileNmGreaterThanEqual uploadFileNmGreaterThanEqual に設定する
     */
    public void setUploadFileNmGreaterThanEqual(String uploadFileNmGreaterThanEqual) {
        this.uploadFileNmGreaterThanEqual = uploadFileNmGreaterThanEqual;
    }

    /**
     * uploadFileNmLessThan のゲッターメソッドです。
     * 
     * @return the uploadFileNmLessThan
     */
    public String getUploadFileNmLessThan() {
        return uploadFileNmLessThan;
    }

    /**
     * uploadFileNmLessThan のセッターメソッドです。
     * 
     * @param uploadFileNmLessThan uploadFileNmLessThan に設定する
     */
    public void setUploadFileNmLessThan(String uploadFileNmLessThan) {
        this.uploadFileNmLessThan = uploadFileNmLessThan;
    }

    /**
     * uploadFileNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the uploadFileNmLessThanEqual
     */
    public String getUploadFileNmLessThanEqual() {
        return uploadFileNmLessThanEqual;
    }

    /**
     * uploadFileNmLessThanEqual のセッターメソッドです。
     * 
     * @param uploadFileNmLessThanEqual uploadFileNmLessThanEqual に設定する
     */
    public void setUploadFileNmLessThanEqual(String uploadFileNmLessThanEqual) {
        this.uploadFileNmLessThanEqual = uploadFileNmLessThanEqual;
    }

    /**
     * uploadFileNmLikeFront のゲッターメソッドです。
     * 
     * @return the uploadFileNmLikeFront
     */
    public String getUploadFileNmLikeFront() {
        return uploadFileNmLikeFront;
    }

    /**
     * uploadFileNmLikeFront のセッターメソッドです。
     * 
     * @param uploadFileNmLikeFront uploadFileNmLikeFront に設定する
     */
    public void setUploadFileNmLikeFront(String uploadFileNmLikeFront) {
        this.uploadFileNmLikeFront = uploadFileNmLikeFront;
    }

    /**
     * uploadUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the uploadUserIdGreaterThan
     */
    public String getUploadUserIdGreaterThan() {
        return uploadUserIdGreaterThan;
    }

    /**
     * uploadUserIdGreaterThan のセッターメソッドです。
     * 
     * @param uploadUserIdGreaterThan uploadUserIdGreaterThan に設定する
     */
    public void setUploadUserIdGreaterThan(String uploadUserIdGreaterThan) {
        this.uploadUserIdGreaterThan = uploadUserIdGreaterThan;
    }

    /**
     * uploadUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the uploadUserIdGreaterThanEqual
     */
    public String getUploadUserIdGreaterThanEqual() {
        return uploadUserIdGreaterThanEqual;
    }

    /**
     * uploadUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param uploadUserIdGreaterThanEqual uploadUserIdGreaterThanEqual に設定する
     */
    public void setUploadUserIdGreaterThanEqual(String uploadUserIdGreaterThanEqual) {
        this.uploadUserIdGreaterThanEqual = uploadUserIdGreaterThanEqual;
    }

    /**
     * uploadUserIdLessThan のゲッターメソッドです。
     * 
     * @return the uploadUserIdLessThan
     */
    public String getUploadUserIdLessThan() {
        return uploadUserIdLessThan;
    }

    /**
     * uploadUserIdLessThan のセッターメソッドです。
     * 
     * @param uploadUserIdLessThan uploadUserIdLessThan に設定する
     */
    public void setUploadUserIdLessThan(String uploadUserIdLessThan) {
        this.uploadUserIdLessThan = uploadUserIdLessThan;
    }

    /**
     * uploadUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the uploadUserIdLessThanEqual
     */
    public String getUploadUserIdLessThanEqual() {
        return uploadUserIdLessThanEqual;
    }

    /**
     * uploadUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param uploadUserIdLessThanEqual uploadUserIdLessThanEqual に設定する
     */
    public void setUploadUserIdLessThanEqual(String uploadUserIdLessThanEqual) {
        this.uploadUserIdLessThanEqual = uploadUserIdLessThanEqual;
    }

    /**
     * uploadUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the uploadUserIdLikeFront
     */
    public String getUploadUserIdLikeFront() {
        return uploadUserIdLikeFront;
    }

    /**
     * uploadUserIdLikeFront のセッターメソッドです。
     * 
     * @param uploadUserIdLikeFront uploadUserIdLikeFront に設定する
     */
    public void setUploadUserIdLikeFront(String uploadUserIdLikeFront) {
        this.uploadUserIdLikeFront = uploadUserIdLikeFront;
    }

    /**
     * statusGreaterThan のゲッターメソッドです。
     * 
     * @return the statusGreaterThan
     */
    public String getStatusGreaterThan() {
        return statusGreaterThan;
    }

    /**
     * statusGreaterThan のセッターメソッドです。
     * 
     * @param statusGreaterThan statusGreaterThan に設定する
     */
    public void setStatusGreaterThan(String statusGreaterThan) {
        this.statusGreaterThan = statusGreaterThan;
    }

    /**
     * statusGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the statusGreaterThanEqual
     */
    public String getStatusGreaterThanEqual() {
        return statusGreaterThanEqual;
    }

    /**
     * statusGreaterThanEqual のセッターメソッドです。
     * 
     * @param statusGreaterThanEqual statusGreaterThanEqual に設定する
     */
    public void setStatusGreaterThanEqual(String statusGreaterThanEqual) {
        this.statusGreaterThanEqual = statusGreaterThanEqual;
    }

    /**
     * statusLessThan のゲッターメソッドです。
     * 
     * @return the statusLessThan
     */
    public String getStatusLessThan() {
        return statusLessThan;
    }

    /**
     * statusLessThan のセッターメソッドです。
     * 
     * @param statusLessThan statusLessThan に設定する
     */
    public void setStatusLessThan(String statusLessThan) {
        this.statusLessThan = statusLessThan;
    }

    /**
     * statusLessThanEqual のゲッターメソッドです。
     * 
     * @return the statusLessThanEqual
     */
    public String getStatusLessThanEqual() {
        return statusLessThanEqual;
    }

    /**
     * statusLessThanEqual のセッターメソッドです。
     * 
     * @param statusLessThanEqual statusLessThanEqual に設定する
     */
    public void setStatusLessThanEqual(String statusLessThanEqual) {
        this.statusLessThanEqual = statusLessThanEqual;
    }

    /**
     * statusLikeFront のゲッターメソッドです。
     * 
     * @return the statusLikeFront
     */
    public String getStatusLikeFront() {
        return statusLikeFront;
    }

    /**
     * statusLikeFront のセッターメソッドです。
     * 
     * @param statusLikeFront statusLikeFront に設定する
     */
    public void setStatusLikeFront(String statusLikeFront) {
        this.statusLikeFront = statusLikeFront;
    }

    /**
     * errFileIdGreaterThan のゲッターメソッドです。
     * 
     * @return the errFileIdGreaterThan
     */
    public String getErrFileIdGreaterThan() {
        return errFileIdGreaterThan;
    }

    /**
     * errFileIdGreaterThan のセッターメソッドです。
     * 
     * @param errFileIdGreaterThan errFileIdGreaterThan に設定する
     */
    public void setErrFileIdGreaterThan(String errFileIdGreaterThan) {
        this.errFileIdGreaterThan = errFileIdGreaterThan;
    }

    /**
     * errFileIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the errFileIdGreaterThanEqual
     */
    public String getErrFileIdGreaterThanEqual() {
        return errFileIdGreaterThanEqual;
    }

    /**
     * errFileIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param errFileIdGreaterThanEqual errFileIdGreaterThanEqual に設定する
     */
    public void setErrFileIdGreaterThanEqual(String errFileIdGreaterThanEqual) {
        this.errFileIdGreaterThanEqual = errFileIdGreaterThanEqual;
    }

    /**
     * errFileIdLessThan のゲッターメソッドです。
     * 
     * @return the errFileIdLessThan
     */
    public String getErrFileIdLessThan() {
        return errFileIdLessThan;
    }

    /**
     * errFileIdLessThan のセッターメソッドです。
     * 
     * @param errFileIdLessThan errFileIdLessThan に設定する
     */
    public void setErrFileIdLessThan(String errFileIdLessThan) {
        this.errFileIdLessThan = errFileIdLessThan;
    }

    /**
     * errFileIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the errFileIdLessThanEqual
     */
    public String getErrFileIdLessThanEqual() {
        return errFileIdLessThanEqual;
    }

    /**
     * errFileIdLessThanEqual のセッターメソッドです。
     * 
     * @param errFileIdLessThanEqual errFileIdLessThanEqual に設定する
     */
    public void setErrFileIdLessThanEqual(String errFileIdLessThanEqual) {
        this.errFileIdLessThanEqual = errFileIdLessThanEqual;
    }

    /**
     * errFileIdLikeFront のゲッターメソッドです。
     * 
     * @return the errFileIdLikeFront
     */
    public String getErrFileIdLikeFront() {
        return errFileIdLikeFront;
    }

    /**
     * errFileIdLikeFront のセッターメソッドです。
     * 
     * @param errFileIdLikeFront errFileIdLikeFront に設定する
     */
    public void setErrFileIdLikeFront(String errFileIdLikeFront) {
        this.errFileIdLikeFront = errFileIdLikeFront;
    }

    /**
     * errFileNmGreaterThan のゲッターメソッドです。
     * 
     * @return the errFileNmGreaterThan
     */
    public String getErrFileNmGreaterThan() {
        return errFileNmGreaterThan;
    }

    /**
     * errFileNmGreaterThan のセッターメソッドです。
     * 
     * @param errFileNmGreaterThan errFileNmGreaterThan に設定する
     */
    public void setErrFileNmGreaterThan(String errFileNmGreaterThan) {
        this.errFileNmGreaterThan = errFileNmGreaterThan;
    }

    /**
     * errFileNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the errFileNmGreaterThanEqual
     */
    public String getErrFileNmGreaterThanEqual() {
        return errFileNmGreaterThanEqual;
    }

    /**
     * errFileNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param errFileNmGreaterThanEqual errFileNmGreaterThanEqual に設定する
     */
    public void setErrFileNmGreaterThanEqual(String errFileNmGreaterThanEqual) {
        this.errFileNmGreaterThanEqual = errFileNmGreaterThanEqual;
    }

    /**
     * errFileNmLessThan のゲッターメソッドです。
     * 
     * @return the errFileNmLessThan
     */
    public String getErrFileNmLessThan() {
        return errFileNmLessThan;
    }

    /**
     * errFileNmLessThan のセッターメソッドです。
     * 
     * @param errFileNmLessThan errFileNmLessThan に設定する
     */
    public void setErrFileNmLessThan(String errFileNmLessThan) {
        this.errFileNmLessThan = errFileNmLessThan;
    }

    /**
     * errFileNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the errFileNmLessThanEqual
     */
    public String getErrFileNmLessThanEqual() {
        return errFileNmLessThanEqual;
    }

    /**
     * errFileNmLessThanEqual のセッターメソッドです。
     * 
     * @param errFileNmLessThanEqual errFileNmLessThanEqual に設定する
     */
    public void setErrFileNmLessThanEqual(String errFileNmLessThanEqual) {
        this.errFileNmLessThanEqual = errFileNmLessThanEqual;
    }

    /**
     * errFileNmLikeFront のゲッターメソッドです。
     * 
     * @return the errFileNmLikeFront
     */
    public String getErrFileNmLikeFront() {
        return errFileNmLikeFront;
    }

    /**
     * errFileNmLikeFront のセッターメソッドです。
     * 
     * @param errFileNmLikeFront errFileNmLikeFront に設定する
     */
    public void setErrFileNmLikeFront(String errFileNmLikeFront) {
        this.errFileNmLikeFront = errFileNmLikeFront;
    }

    /**
     * fcstReplaceFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the fcstReplaceFlgGreaterThan
     */
    public String getFcstReplaceFlgGreaterThan() {
        return fcstReplaceFlgGreaterThan;
    }

    /**
     * fcstReplaceFlgGreaterThan のセッターメソッドです。
     * 
     * @param fcstReplaceFlgGreaterThan fcstReplaceFlgGreaterThan に設定する
     */
    public void setFcstReplaceFlgGreaterThan(String fcstReplaceFlgGreaterThan) {
        this.fcstReplaceFlgGreaterThan = fcstReplaceFlgGreaterThan;
    }

    /**
     * fcstReplaceFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the fcstReplaceFlgGreaterThanEqual
     */
    public String getFcstReplaceFlgGreaterThanEqual() {
        return fcstReplaceFlgGreaterThanEqual;
    }

    /**
     * fcstReplaceFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param fcstReplaceFlgGreaterThanEqual fcstReplaceFlgGreaterThanEqual に設定する
     */
    public void setFcstReplaceFlgGreaterThanEqual(String fcstReplaceFlgGreaterThanEqual) {
        this.fcstReplaceFlgGreaterThanEqual = fcstReplaceFlgGreaterThanEqual;
    }

    /**
     * fcstReplaceFlgLessThan のゲッターメソッドです。
     * 
     * @return the fcstReplaceFlgLessThan
     */
    public String getFcstReplaceFlgLessThan() {
        return fcstReplaceFlgLessThan;
    }

    /**
     * fcstReplaceFlgLessThan のセッターメソッドです。
     * 
     * @param fcstReplaceFlgLessThan fcstReplaceFlgLessThan に設定する
     */
    public void setFcstReplaceFlgLessThan(String fcstReplaceFlgLessThan) {
        this.fcstReplaceFlgLessThan = fcstReplaceFlgLessThan;
    }

    /**
     * fcstReplaceFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the fcstReplaceFlgLessThanEqual
     */
    public String getFcstReplaceFlgLessThanEqual() {
        return fcstReplaceFlgLessThanEqual;
    }

    /**
     * fcstReplaceFlgLessThanEqual のセッターメソッドです。
     * 
     * @param fcstReplaceFlgLessThanEqual fcstReplaceFlgLessThanEqual に設定する
     */
    public void setFcstReplaceFlgLessThanEqual(String fcstReplaceFlgLessThanEqual) {
        this.fcstReplaceFlgLessThanEqual = fcstReplaceFlgLessThanEqual;
    }

    /**
     * fcstReplaceFlgLikeFront のゲッターメソッドです。
     * 
     * @return the fcstReplaceFlgLikeFront
     */
    public String getFcstReplaceFlgLikeFront() {
        return fcstReplaceFlgLikeFront;
    }

    /**
     * fcstReplaceFlgLikeFront のセッターメソッドです。
     * 
     * @param fcstReplaceFlgLikeFront fcstReplaceFlgLikeFront に設定する
     */
    public void setFcstReplaceFlgLikeFront(String fcstReplaceFlgLikeFront) {
        this.fcstReplaceFlgLikeFront = fcstReplaceFlgLikeFront;
    }

    /**
     * rcvOdrCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdGreaterThan
     */
    public String getRcvOdrCompCdGreaterThan() {
        return rcvOdrCompCdGreaterThan;
    }

    /**
     * rcvOdrCompCdGreaterThan のセッターメソッドです。
     * 
     * @param rcvOdrCompCdGreaterThan rcvOdrCompCdGreaterThan に設定する
     */
    public void setRcvOdrCompCdGreaterThan(String rcvOdrCompCdGreaterThan) {
        this.rcvOdrCompCdGreaterThan = rcvOdrCompCdGreaterThan;
    }

    /**
     * rcvOdrCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdGreaterThanEqual
     */
    public String getRcvOdrCompCdGreaterThanEqual() {
        return rcvOdrCompCdGreaterThanEqual;
    }

    /**
     * rcvOdrCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param rcvOdrCompCdGreaterThanEqual rcvOdrCompCdGreaterThanEqual に設定する
     */
    public void setRcvOdrCompCdGreaterThanEqual(String rcvOdrCompCdGreaterThanEqual) {
        this.rcvOdrCompCdGreaterThanEqual = rcvOdrCompCdGreaterThanEqual;
    }

    /**
     * rcvOdrCompCdLessThan のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdLessThan
     */
    public String getRcvOdrCompCdLessThan() {
        return rcvOdrCompCdLessThan;
    }

    /**
     * rcvOdrCompCdLessThan のセッターメソッドです。
     * 
     * @param rcvOdrCompCdLessThan rcvOdrCompCdLessThan に設定する
     */
    public void setRcvOdrCompCdLessThan(String rcvOdrCompCdLessThan) {
        this.rcvOdrCompCdLessThan = rcvOdrCompCdLessThan;
    }

    /**
     * rcvOdrCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdLessThanEqual
     */
    public String getRcvOdrCompCdLessThanEqual() {
        return rcvOdrCompCdLessThanEqual;
    }

    /**
     * rcvOdrCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param rcvOdrCompCdLessThanEqual rcvOdrCompCdLessThanEqual に設定する
     */
    public void setRcvOdrCompCdLessThanEqual(String rcvOdrCompCdLessThanEqual) {
        this.rcvOdrCompCdLessThanEqual = rcvOdrCompCdLessThanEqual;
    }

    /**
     * rcvOdrCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdLikeFront
     */
    public String getRcvOdrCompCdLikeFront() {
        return rcvOdrCompCdLikeFront;
    }

    /**
     * rcvOdrCompCdLikeFront のセッターメソッドです。
     * 
     * @param rcvOdrCompCdLikeFront rcvOdrCompCdLikeFront に設定する
     */
    public void setRcvOdrCompCdLikeFront(String rcvOdrCompCdLikeFront) {
        this.rcvOdrCompCdLikeFront = rcvOdrCompCdLikeFront;
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

