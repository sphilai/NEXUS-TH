/*
 * PROJECT：eca0027
 * 
 * TmBhtLockMsgMgt の検索条件Domainクラス
 * テーブル概要：TM_BHT_LOCK_MSG_MGT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmBhtLockMsgMgt の検索条件Domainクラスです。<BR>
 * テーブル概要：TM_BHT_LOCK_MSG_MGT<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 10985 $
 */
public class TmBhtLockMsgMgtCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * SCREEN_ID
     */
    private String screenId;

    /**
     * MSG_ID
     */
    private String msgId;

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
     * COMP_CD（大なり）
     */
    private String compCdGreaterThan;

    /**
     * COMP_CD（大なりイコール）
     */
    private String compCdGreaterThanEqual;

    /**
     * COMP_CD（小なり）
     */
    private String compCdLessThan;

    /**
     * COMP_CD（小なりイコール）
     */
    private String compCdLessThanEqual;

    /**
     * COMP_CD（前方一致）
     */
    private String compCdLikeFront;

    /**
     * SCREEN_ID（大なり）
     */
    private String screenIdGreaterThan;

    /**
     * SCREEN_ID（大なりイコール）
     */
    private String screenIdGreaterThanEqual;

    /**
     * SCREEN_ID（小なり）
     */
    private String screenIdLessThan;

    /**
     * SCREEN_ID（小なりイコール）
     */
    private String screenIdLessThanEqual;

    /**
     * SCREEN_ID（前方一致）
     */
    private String screenIdLikeFront;

    /**
     * MSG_ID（大なり）
     */
    private String msgIdGreaterThan;

    /**
     * MSG_ID（大なりイコール）
     */
    private String msgIdGreaterThanEqual;

    /**
     * MSG_ID（小なり）
     */
    private String msgIdLessThan;

    /**
     * MSG_ID（小なりイコール）
     */
    private String msgIdLessThanEqual;

    /**
     * MSG_ID（前方一致）
     */
    private String msgIdLikeFront;

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
    public TmBhtLockMsgMgtCriteriaDomain() {
    }

    /**
     * compCd のゲッターメソッドです。
     * 
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * compCd のセッターメソッドです。
     * 
     * @param compCd compCd に設定する
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * screenId のゲッターメソッドです。
     * 
     * @return the screenId
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * screenId のセッターメソッドです。
     * 
     * @param screenId screenId に設定する
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * msgId のゲッターメソッドです。
     * 
     * @return the msgId
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * msgId のセッターメソッドです。
     * 
     * @param msgId msgId に設定する
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId;
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
     * compCdGreaterThan のゲッターメソッドです。
     * 
     * @return the compCdGreaterThan
     */
    public String getCompCdGreaterThan() {
        return compCdGreaterThan;
    }

    /**
     * compCdGreaterThan のセッターメソッドです。
     * 
     * @param compCdGreaterThan compCdGreaterThan に設定する
     */
    public void setCompCdGreaterThan(String compCdGreaterThan) {
        this.compCdGreaterThan = compCdGreaterThan;
    }

    /**
     * compCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compCdGreaterThanEqual
     */
    public String getCompCdGreaterThanEqual() {
        return compCdGreaterThanEqual;
    }

    /**
     * compCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param compCdGreaterThanEqual compCdGreaterThanEqual に設定する
     */
    public void setCompCdGreaterThanEqual(String compCdGreaterThanEqual) {
        this.compCdGreaterThanEqual = compCdGreaterThanEqual;
    }

    /**
     * compCdLessThan のゲッターメソッドです。
     * 
     * @return the compCdLessThan
     */
    public String getCompCdLessThan() {
        return compCdLessThan;
    }

    /**
     * compCdLessThan のセッターメソッドです。
     * 
     * @param compCdLessThan compCdLessThan に設定する
     */
    public void setCompCdLessThan(String compCdLessThan) {
        this.compCdLessThan = compCdLessThan;
    }

    /**
     * compCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the compCdLessThanEqual
     */
    public String getCompCdLessThanEqual() {
        return compCdLessThanEqual;
    }

    /**
     * compCdLessThanEqual のセッターメソッドです。
     * 
     * @param compCdLessThanEqual compCdLessThanEqual に設定する
     */
    public void setCompCdLessThanEqual(String compCdLessThanEqual) {
        this.compCdLessThanEqual = compCdLessThanEqual;
    }

    /**
     * compCdLikeFront のゲッターメソッドです。
     * 
     * @return the compCdLikeFront
     */
    public String getCompCdLikeFront() {
        return compCdLikeFront;
    }

    /**
     * compCdLikeFront のセッターメソッドです。
     * 
     * @param compCdLikeFront compCdLikeFront に設定する
     */
    public void setCompCdLikeFront(String compCdLikeFront) {
        this.compCdLikeFront = compCdLikeFront;
    }

    /**
     * screenIdGreaterThan のゲッターメソッドです。
     * 
     * @return the screenIdGreaterThan
     */
    public String getScreenIdGreaterThan() {
        return screenIdGreaterThan;
    }

    /**
     * screenIdGreaterThan のセッターメソッドです。
     * 
     * @param screenIdGreaterThan screenIdGreaterThan に設定する
     */
    public void setScreenIdGreaterThan(String screenIdGreaterThan) {
        this.screenIdGreaterThan = screenIdGreaterThan;
    }

    /**
     * screenIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the screenIdGreaterThanEqual
     */
    public String getScreenIdGreaterThanEqual() {
        return screenIdGreaterThanEqual;
    }

    /**
     * screenIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param screenIdGreaterThanEqual screenIdGreaterThanEqual に設定する
     */
    public void setScreenIdGreaterThanEqual(String screenIdGreaterThanEqual) {
        this.screenIdGreaterThanEqual = screenIdGreaterThanEqual;
    }

    /**
     * screenIdLessThan のゲッターメソッドです。
     * 
     * @return the screenIdLessThan
     */
    public String getScreenIdLessThan() {
        return screenIdLessThan;
    }

    /**
     * screenIdLessThan のセッターメソッドです。
     * 
     * @param screenIdLessThan screenIdLessThan に設定する
     */
    public void setScreenIdLessThan(String screenIdLessThan) {
        this.screenIdLessThan = screenIdLessThan;
    }

    /**
     * screenIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the screenIdLessThanEqual
     */
    public String getScreenIdLessThanEqual() {
        return screenIdLessThanEqual;
    }

    /**
     * screenIdLessThanEqual のセッターメソッドです。
     * 
     * @param screenIdLessThanEqual screenIdLessThanEqual に設定する
     */
    public void setScreenIdLessThanEqual(String screenIdLessThanEqual) {
        this.screenIdLessThanEqual = screenIdLessThanEqual;
    }

    /**
     * screenIdLikeFront のゲッターメソッドです。
     * 
     * @return the screenIdLikeFront
     */
    public String getScreenIdLikeFront() {
        return screenIdLikeFront;
    }

    /**
     * screenIdLikeFront のセッターメソッドです。
     * 
     * @param screenIdLikeFront screenIdLikeFront に設定する
     */
    public void setScreenIdLikeFront(String screenIdLikeFront) {
        this.screenIdLikeFront = screenIdLikeFront;
    }

    /**
     * msgIdGreaterThan のゲッターメソッドです。
     * 
     * @return the msgIdGreaterThan
     */
    public String getMsgIdGreaterThan() {
        return msgIdGreaterThan;
    }

    /**
     * msgIdGreaterThan のセッターメソッドです。
     * 
     * @param msgIdGreaterThan msgIdGreaterThan に設定する
     */
    public void setMsgIdGreaterThan(String msgIdGreaterThan) {
        this.msgIdGreaterThan = msgIdGreaterThan;
    }

    /**
     * msgIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the msgIdGreaterThanEqual
     */
    public String getMsgIdGreaterThanEqual() {
        return msgIdGreaterThanEqual;
    }

    /**
     * msgIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param msgIdGreaterThanEqual msgIdGreaterThanEqual に設定する
     */
    public void setMsgIdGreaterThanEqual(String msgIdGreaterThanEqual) {
        this.msgIdGreaterThanEqual = msgIdGreaterThanEqual;
    }

    /**
     * msgIdLessThan のゲッターメソッドです。
     * 
     * @return the msgIdLessThan
     */
    public String getMsgIdLessThan() {
        return msgIdLessThan;
    }

    /**
     * msgIdLessThan のセッターメソッドです。
     * 
     * @param msgIdLessThan msgIdLessThan に設定する
     */
    public void setMsgIdLessThan(String msgIdLessThan) {
        this.msgIdLessThan = msgIdLessThan;
    }

    /**
     * msgIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the msgIdLessThanEqual
     */
    public String getMsgIdLessThanEqual() {
        return msgIdLessThanEqual;
    }

    /**
     * msgIdLessThanEqual のセッターメソッドです。
     * 
     * @param msgIdLessThanEqual msgIdLessThanEqual に設定する
     */
    public void setMsgIdLessThanEqual(String msgIdLessThanEqual) {
        this.msgIdLessThanEqual = msgIdLessThanEqual;
    }

    /**
     * msgIdLikeFront のゲッターメソッドです。
     * 
     * @return the msgIdLikeFront
     */
    public String getMsgIdLikeFront() {
        return msgIdLikeFront;
    }

    /**
     * msgIdLikeFront のセッターメソッドです。
     * 
     * @param msgIdLikeFront msgIdLikeFront に設定する
     */
    public void setMsgIdLikeFront(String msgIdLikeFront) {
        this.msgIdLikeFront = msgIdLikeFront;
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

