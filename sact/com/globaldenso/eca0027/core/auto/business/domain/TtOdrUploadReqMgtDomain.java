/*
 * PROJECT：eca0027
 * 
 * TtOdrUploadReqMgt のDomainクラス
 * テーブル概要：Order Upload Request Management/受注アップロードリクエスト管理  Manage the request information of the order upload./受注アップロードのリクエスト情報を管理する。
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/26  DNITS  新規作成
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
 * TtOdrUploadReqMgt のDomainクラスです。<BR>
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
public class TtOdrUploadReqMgtDomain extends AbstractDomain implements Serializable {

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
     * RECEIVE ORDER COMPANY NAME/受注会社名称
     */
    private String rcvOdrCompNm;

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
    public TtOdrUploadReqMgtDomain() {
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
     * Getter method for rcvOdrCompNm.
     *
     * @return the rcvOdrCompNm
     */
    public String getRcvOdrCompNm() {
        return rcvOdrCompNm;
    }

    /**
     * Setter method for rcvOdrCompNm.
     *
     * @param rcvOdrCompNm Set for rcvOdrCompNm
     */
    public void setRcvOdrCompNm(String rcvOdrCompNm) {
        this.rcvOdrCompNm = rcvOdrCompNm;
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
