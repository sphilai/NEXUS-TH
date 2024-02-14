/*
 * PROJECT：eca0027
 * 
 * TmStdQrPatternHdr の検索条件Domainクラス
 * テーブル概要：TM_STD_QR_PATTERN_HDR
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmStdQrPatternHdr の検索条件Domainクラスです。<BR>
 * テーブル概要：TM_STD_QR_PATTERN_HDR<BR>
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
public class TmStdQrPatternHdrCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * QR_TYP_CD
     */
    private String qrTypCd;

    /**
     * QR_LENGTH
     */
    private BigDecimal qrLength;

    /**
     * QR_DESCRIPTION
     */
    private String qrDescription;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_FUNC_ID
     */
    private String comCreateFuncId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_FUNC_ID
     */
    private String comUpdateFuncId;

    /**
     * QR_TYP_CD（大なり）
     */
    private String qrTypCdGreaterThan;

    /**
     * QR_TYP_CD（大なりイコール）
     */
    private String qrTypCdGreaterThanEqual;

    /**
     * QR_TYP_CD（小なり）
     */
    private String qrTypCdLessThan;

    /**
     * QR_TYP_CD（小なりイコール）
     */
    private String qrTypCdLessThanEqual;

    /**
     * QR_TYP_CD（前方一致）
     */
    private String qrTypCdLikeFront;

    /**
     * QR_DESCRIPTION（大なり）
     */
    private String qrDescriptionGreaterThan;

    /**
     * QR_DESCRIPTION（大なりイコール）
     */
    private String qrDescriptionGreaterThanEqual;

    /**
     * QR_DESCRIPTION（小なり）
     */
    private String qrDescriptionLessThan;

    /**
     * QR_DESCRIPTION（小なりイコール）
     */
    private String qrDescriptionLessThanEqual;

    /**
     * QR_DESCRIPTION（前方一致）
     */
    private String qrDescriptionLikeFront;

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
     * デフォルトコンストラクタ。
     */
    public TmStdQrPatternHdrCriteriaDomain() {
    }

    /**
     * qrTypCd のゲッターメソッドです。
     * 
     * @return the qrTypCd
     */
    public String getQrTypCd() {
        return qrTypCd;
    }

    /**
     * qrTypCd のセッターメソッドです。
     * 
     * @param qrTypCd qrTypCd に設定する
     */
    public void setQrTypCd(String qrTypCd) {
        this.qrTypCd = qrTypCd;
    }

    /**
     * qrLength のゲッターメソッドです。
     * 
     * @return the qrLength
     */
    public BigDecimal getQrLength() {
        return qrLength;
    }

    /**
     * qrLength のセッターメソッドです。
     * 
     * @param qrLength qrLength に設定する
     */
    public void setQrLength(BigDecimal qrLength) {
        this.qrLength = qrLength;
    }

    /**
     * qrDescription のゲッターメソッドです。
     * 
     * @return the qrDescription
     */
    public String getQrDescription() {
        return qrDescription;
    }

    /**
     * qrDescription のセッターメソッドです。
     * 
     * @param qrDescription qrDescription に設定する
     */
    public void setQrDescription(String qrDescription) {
        this.qrDescription = qrDescription;
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
     * qrTypCdGreaterThan のゲッターメソッドです。
     * 
     * @return the qrTypCdGreaterThan
     */
    public String getQrTypCdGreaterThan() {
        return qrTypCdGreaterThan;
    }

    /**
     * qrTypCdGreaterThan のセッターメソッドです。
     * 
     * @param qrTypCdGreaterThan qrTypCdGreaterThan に設定する
     */
    public void setQrTypCdGreaterThan(String qrTypCdGreaterThan) {
        this.qrTypCdGreaterThan = qrTypCdGreaterThan;
    }

    /**
     * qrTypCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the qrTypCdGreaterThanEqual
     */
    public String getQrTypCdGreaterThanEqual() {
        return qrTypCdGreaterThanEqual;
    }

    /**
     * qrTypCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param qrTypCdGreaterThanEqual qrTypCdGreaterThanEqual に設定する
     */
    public void setQrTypCdGreaterThanEqual(String qrTypCdGreaterThanEqual) {
        this.qrTypCdGreaterThanEqual = qrTypCdGreaterThanEqual;
    }

    /**
     * qrTypCdLessThan のゲッターメソッドです。
     * 
     * @return the qrTypCdLessThan
     */
    public String getQrTypCdLessThan() {
        return qrTypCdLessThan;
    }

    /**
     * qrTypCdLessThan のセッターメソッドです。
     * 
     * @param qrTypCdLessThan qrTypCdLessThan に設定する
     */
    public void setQrTypCdLessThan(String qrTypCdLessThan) {
        this.qrTypCdLessThan = qrTypCdLessThan;
    }

    /**
     * qrTypCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the qrTypCdLessThanEqual
     */
    public String getQrTypCdLessThanEqual() {
        return qrTypCdLessThanEqual;
    }

    /**
     * qrTypCdLessThanEqual のセッターメソッドです。
     * 
     * @param qrTypCdLessThanEqual qrTypCdLessThanEqual に設定する
     */
    public void setQrTypCdLessThanEqual(String qrTypCdLessThanEqual) {
        this.qrTypCdLessThanEqual = qrTypCdLessThanEqual;
    }

    /**
     * qrTypCdLikeFront のゲッターメソッドです。
     * 
     * @return the qrTypCdLikeFront
     */
    public String getQrTypCdLikeFront() {
        return qrTypCdLikeFront;
    }

    /**
     * qrTypCdLikeFront のセッターメソッドです。
     * 
     * @param qrTypCdLikeFront qrTypCdLikeFront に設定する
     */
    public void setQrTypCdLikeFront(String qrTypCdLikeFront) {
        this.qrTypCdLikeFront = qrTypCdLikeFront;
    }

    /**
     * qrDescriptionGreaterThan のゲッターメソッドです。
     * 
     * @return the qrDescriptionGreaterThan
     */
    public String getQrDescriptionGreaterThan() {
        return qrDescriptionGreaterThan;
    }

    /**
     * qrDescriptionGreaterThan のセッターメソッドです。
     * 
     * @param qrDescriptionGreaterThan qrDescriptionGreaterThan に設定する
     */
    public void setQrDescriptionGreaterThan(String qrDescriptionGreaterThan) {
        this.qrDescriptionGreaterThan = qrDescriptionGreaterThan;
    }

    /**
     * qrDescriptionGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the qrDescriptionGreaterThanEqual
     */
    public String getQrDescriptionGreaterThanEqual() {
        return qrDescriptionGreaterThanEqual;
    }

    /**
     * qrDescriptionGreaterThanEqual のセッターメソッドです。
     * 
     * @param qrDescriptionGreaterThanEqual qrDescriptionGreaterThanEqual に設定する
     */
    public void setQrDescriptionGreaterThanEqual(String qrDescriptionGreaterThanEqual) {
        this.qrDescriptionGreaterThanEqual = qrDescriptionGreaterThanEqual;
    }

    /**
     * qrDescriptionLessThan のゲッターメソッドです。
     * 
     * @return the qrDescriptionLessThan
     */
    public String getQrDescriptionLessThan() {
        return qrDescriptionLessThan;
    }

    /**
     * qrDescriptionLessThan のセッターメソッドです。
     * 
     * @param qrDescriptionLessThan qrDescriptionLessThan に設定する
     */
    public void setQrDescriptionLessThan(String qrDescriptionLessThan) {
        this.qrDescriptionLessThan = qrDescriptionLessThan;
    }

    /**
     * qrDescriptionLessThanEqual のゲッターメソッドです。
     * 
     * @return the qrDescriptionLessThanEqual
     */
    public String getQrDescriptionLessThanEqual() {
        return qrDescriptionLessThanEqual;
    }

    /**
     * qrDescriptionLessThanEqual のセッターメソッドです。
     * 
     * @param qrDescriptionLessThanEqual qrDescriptionLessThanEqual に設定する
     */
    public void setQrDescriptionLessThanEqual(String qrDescriptionLessThanEqual) {
        this.qrDescriptionLessThanEqual = qrDescriptionLessThanEqual;
    }

    /**
     * qrDescriptionLikeFront のゲッターメソッドです。
     * 
     * @return the qrDescriptionLikeFront
     */
    public String getQrDescriptionLikeFront() {
        return qrDescriptionLikeFront;
    }

    /**
     * qrDescriptionLikeFront のセッターメソッドです。
     * 
     * @param qrDescriptionLikeFront qrDescriptionLikeFront に設定する
     */
    public void setQrDescriptionLikeFront(String qrDescriptionLikeFront) {
        this.qrDescriptionLikeFront = qrDescriptionLikeFront;
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

}
