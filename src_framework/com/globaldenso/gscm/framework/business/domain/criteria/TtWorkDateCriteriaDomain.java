/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * TtWorkDate の検索条件Domainクラス
 * Search Condition Domain Class of TtWorkDate
 * テーブル概要：業務日付管理DB
 * Outline of Table：Work date management DB
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * Version.   Last Update Author        Detail
 * 1.0.0      March/3/2014  DNITS  Create
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TtWorkDate の検索条件Domainクラスです。<BR>
 * Search Condition Domain Class of TtWorkDate<BR>
 * テーブル概要：業務日付管理DB<BR>
 * Outline of Table：Work date management DB<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 17:23:18<BR>
 * Create date ： March/3/2014 09:43:55<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * Auto create module from the table definition on March/3/2014
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public class TtWorkDateCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 識別ID
     * ID
     */
    private String id;

    /**
     * 責任会社
     * Company
     */
    private String compCd;

    /**
     * 汎用フィールド
     * Common field
     */
    private String optId;

    /**
     * 業務日付
     * Work date
     */
    private String workDate;

    /**
     * CREATE FUNCTION ID/登録機能ID
     */
    private String comCreateFuncId;

    /**
     * CREATE USER ID/作成者ID
     */
    private String comCreateUserId;

    /**
     * CREATE TIMESTAMP/作成日時
     */
    private Timestamp comCreateTimestamp;

    /**
     * UPDATE FUNCTION ID/更新機能ID
     */
    private String comUpdateFuncId;

    /**
     * UPDATE USER ID/更新者ID
     */
    private String comUpdateUserId;

    /**
     * UPDATE TIMESTAMP/更新日時
     */
    private Timestamp comUpdateTimestamp;

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public TtWorkDateCriteriaDomain() {
    }

    /**
     * id のゲッターメソッドです。
     * Getter method for id
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * id のセッターメソッドです。
     * Setter method for id
     * 
     * @param id id に設定する
     * @param id Set to id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * compCd のゲッターメソッドです。
     * Getter method for compCd
     * 
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * compCd のセッターメソッドです。
     * Setter method for compCd
     * 
     * @param compCd compCd に設定する
     * @param compCd Set to compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * optId のゲッターメソッドです。
     * Getter method for optId
     * 
     * @return the optId
     */
    public String getOptId() {
        return optId;
    }

    /**
     * optId のセッターメソッドです。
     * Setter method for optId
     * 
     * @param optId optId に設定する
     * @param optId Set to optId
     */
    public void setOptId(String optId) {
        this.optId = optId;
    }

    /**
     * workDate のゲッターメソッドです。
     * Getter method for workDate
     * 
     * @return the workDate
     */
    public String getWorkDate() {
        return workDate;
    }

    /**
     * workDate のセッターメソッドです。
     * Setter method for workDate
     * 
     * @param workDate workDate に設定する
     * @param workDate Set to workDate
     */
    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    /**
     * comCreateFuncId のゲッターメソッドです。
     * Getter method for comCreateFuncId
     * 
     * @return the comCreateFuncId
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * comCreateFuncId のセッターメソッドです。
     * Setter method for comCreateFuncId
     * 
     * @param comCreateFuncId comCreateFuncId に設定する
     * @param comCreateFuncId Set to comCreateFuncId
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * comCreateUserId のゲッターメソッドです。
     * Getter method for comCreateUserId
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * comCreateUserId のセッターメソッドです。
     * Setter method for comCreateUserId
     * 
     * @param comCreateUserId comCreateUserId に設定する
     * @param comCreateUserId Set to comCreateUserId
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * comCreateTimestamp のゲッターメソッドです。
     * Getter method for comCreateTimestamp
     * 
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * comCreateTimestamp のセッターメソッドです。
     * Setter method for comCreateTimestamp
     * 
     * @param comCreateTimestamp comCreateTimestamp に設定する
     * @param comCreateTimestamp Set to comCreateTimestamp
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

    /**
     * comUpdateFuncId のゲッターメソッドです。
     * Getter method for comUpdateFuncId
     * 
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * comUpdateFuncId のセッターメソッドです。
     * Setter method for comUpdateFuncId
     * 
     * @param comUpdateFuncId comUpdateFuncId に設定する
     * @param comUpdateFuncId Set to comUpdateFuncId
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }

    /**
     * comUpdateUserId のゲッターメソッドです。
     * Getter method for comUpdateUserId
     * 
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * comUpdateUserId のセッターメソッドです。
     * Setter method for comUpdateUserId
     * 
     * @param comUpdateUserId comUpdateUserId に設定する
     * @param comUpdateUserId Set to comUpdateUserId
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * comUpdateTimestamp のゲッターメソッドです。
     * Getter method for comUpdateTimestamp
     * 
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * comUpdateTimestamp のセッターメソッドです。
     * Setter method for comUpdateTimestamp
     * 
     * @param comUpdateTimestamp comUpdateTimestamp に設定する
     * @param comUpdateTimestamp Set to comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

}

