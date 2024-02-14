/*
 * PROJECT：eca0027
 * 
 * TmDelData のDomainクラス
 * テーブル概要：TM_DEL_DATA
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmDelData のDomainクラスです。<BR>
 * テーブル概要：TM_DEL_DATA<BR>
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
public class TmDelDataDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * CYCLE_DIV
     */
    private BigDecimal cycleDiv;

    /**
     * TARGET_TABLE
     */
    private String targetTable;

    /**
     * DEL_CON
     */
    private String delCon;

    /**
     * SAVE_DATE
     */
    private BigDecimal saveDate;

    /**
     * SAVE_TERM
     */
    private String saveTerm;

    /**
     * DEL_DATE
     */
    private String delDate;

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
     * デフォルトコンストラクタ。
     */
    public TmDelDataDomain() {
    }

    /**
     * cycleDiv のゲッターメソッドです。
     * 
     * @return the cycleDiv
     */
    public BigDecimal getCycleDiv() {
        return cycleDiv;
    }

    /**
     * cycleDiv のセッターメソッドです。
     * 
     * @param cycleDiv cycleDiv に設定する
     */
    public void setCycleDiv(BigDecimal cycleDiv) {
        this.cycleDiv = cycleDiv;
    }

    /**
     * targetTable のゲッターメソッドです。
     * 
     * @return the targetTable
     */
    public String getTargetTable() {
        return targetTable;
    }

    /**
     * targetTable のセッターメソッドです。
     * 
     * @param targetTable targetTable に設定する
     */
    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable;
    }

    /**
     * delCon のゲッターメソッドです。
     * 
     * @return the delCon
     */
    public String getDelCon() {
        return delCon;
    }

    /**
     * delCon のセッターメソッドです。
     * 
     * @param delCon delCon に設定する
     */
    public void setDelCon(String delCon) {
        this.delCon = delCon;
    }

    /**
     * saveDate のゲッターメソッドです。
     * 
     * @return the saveDate
     */
    public BigDecimal getSaveDate() {
        return saveDate;
    }

    /**
     * saveDate のセッターメソッドです。
     * 
     * @param saveDate saveDate に設定する
     */
    public void setSaveDate(BigDecimal saveDate) {
        this.saveDate = saveDate;
    }

    /**
     * saveTerm のゲッターメソッドです。
     * 
     * @return the saveTerm
     */
    public String getSaveTerm() {
        return saveTerm;
    }

    /**
     * saveTerm のセッターメソッドです。
     * 
     * @param saveTerm saveTerm に設定する
     */
    public void setSaveTerm(String saveTerm) {
        this.saveTerm = saveTerm;
    }

    /**
     * delDate のゲッターメソッドです。
     * 
     * @return the delDate
     */
    public String getDelDate() {
        return delDate;
    }

    /**
     * delDate のセッターメソッドです。
     * 
     * @param delDate delDate に設定する
     */
    public void setDelDate(String delDate) {
        this.delDate = delDate;
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

}
