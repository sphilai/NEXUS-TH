/*
 * PROJECT：eca0027
 * 
 * TtBhtWorkErr のDomainクラス
 * テーブル概要：TT_BHT_WORK_ERR
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/14  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

/**
 * TtBhtWorkErr のDomainクラスです。<BR>
 * テーブル概要：TT_BHT_WORK_ERR<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/14 15:07:43<BR>
 * 
 * テーブル定義から2014/06/14に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtBhtWorkErrDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * WORK_TIME_NO
     */
    private BigDecimal workTimeNo;

    /**
     * BRCH
     */
    private BigDecimal brch;

    /**
     * SCREEN_ID
     */
    private String screenId;

    /**
     * MSG_ID
     */
    private String msgId;

    /**
     * LOCK_FLG
     */
    private String lockFlg;

    /**
     * WORK_TIME_STRT
     */
    private Date workTimeStrt;

    /**
     * WORK_TIME_END
     */
    private Date workTimeEnd;

    /**
     * WORK_TIME
     */
    private BigDecimal workTime;

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
    public TtBhtWorkErrDomain() {
    }

    /**
     * workTimeNo のゲッターメソッドです。
     * 
     * @return the workTimeNo
     */
    public BigDecimal getWorkTimeNo() {
        return workTimeNo;
    }

    /**
     * workTimeNo のセッターメソッドです。
     * 
     * @param workTimeNo workTimeNo に設定する
     */
    public void setWorkTimeNo(BigDecimal workTimeNo) {
        this.workTimeNo = workTimeNo;
    }

    /**
     * brch のゲッターメソッドです。
     * 
     * @return the brch
     */
    public BigDecimal getBrch() {
        return brch;
    }

    /**
     * brch のセッターメソッドです。
     * 
     * @param brch brch に設定する
     */
    public void setBrch(BigDecimal brch) {
        this.brch = brch;
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
     * lockFlg のゲッターメソッドです。
     * 
     * @return the lockFlg
     */
    public String getLockFlg() {
        return lockFlg;
    }

    /**
     * lockFlg のセッターメソッドです。
     * 
     * @param lockFlg lockFlg に設定する
     */
    public void setLockFlg(String lockFlg) {
        this.lockFlg = lockFlg;
    }

    /**
     * workTimeStrt のゲッターメソッドです。
     * 
     * @return the workTimeStrt
     */
    public Date getWorkTimeStrt() {
        return workTimeStrt;
    }

    /**
     * workTimeStrt のセッターメソッドです。
     * 
     * @param workTimeStrt workTimeStrt に設定する
     */
    public void setWorkTimeStrt(Date workTimeStrt) {
        this.workTimeStrt = workTimeStrt;
    }

    /**
     * workTimeEnd のゲッターメソッドです。
     * 
     * @return the workTimeEnd
     */
    public Date getWorkTimeEnd() {
        return workTimeEnd;
    }

    /**
     * workTimeEnd のセッターメソッドです。
     * 
     * @param workTimeEnd workTimeEnd に設定する
     */
    public void setWorkTimeEnd(Date workTimeEnd) {
        this.workTimeEnd = workTimeEnd;
    }

    /**
     * workTime のゲッターメソッドです。
     * 
     * @return the workTime
     */
    public BigDecimal getWorkTime() {
        return workTime;
    }

    /**
     * workTime のセッターメソッドです。
     * 
     * @param workTime workTime に設定する
     */
    public void setWorkTime(BigDecimal workTime) {
        this.workTime = workTime;
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
