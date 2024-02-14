/*
 * PROJECT：eca0027
 * 
 * TmActualItemWeight のDomainクラス
 * テーブル概要：Actual Item Weight MA / 実測製品重量原単位  Master of the actual item weight./実測製品重量原単位
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmActualItemWeight のDomainクラスです。<BR>
 * テーブル概要：Actual Item Weight MA / 実測製品重量原単位  Master of the actual item weight./実測製品重量原単位<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/05 17:39:47<BR>
 * 
 * テーブル定義から2014/11/05に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TmActualItemWeightDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * OWNER COMPANY/責任会社
     */
    private String ownerComp;

    /**
     * ITEM NO GROUP/品目番号グループ
     */
    private String itemNoGrp;

    /**
     * ITEM NO/品目番号
     */
    private String itemNo;

    /**
     * WEIGHT UNIT/重量単位
     */
    private String weightUnit;

    /**
     * NET WEIGHT A/実測製品重量
     */
    private BigDecimal netWeightA;

    /**
     * CREATE TIMESTAMP/作成日時
     */
    private Timestamp comCreateTimestamp;

    /**
     * CREATE USER ID/作成者ID
     */
    private String comCreateUserId;

    /**
     * CREATE FUNCTION ID/登録機能ID
     */
    private String comCreateFuncId;

    /**
     * UPDATE TIMESTAMP/更新日時
     */
    private Timestamp comUpdateTimestamp;

    /**
     * UPDATE USER ID/更新者ID
     */
    private String comUpdateUserId;

    /**
     * UPDATE FUNCTION ID/更新機能ID
     */
    private String comUpdateFuncId;

    /**
     * デフォルトコンストラクタ。
     */
    public TmActualItemWeightDomain() {
    }

    /**
     * ownerComp のゲッターメソッドです。
     * 
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * ownerComp のセッターメソッドです。
     * 
     * @param ownerComp ownerComp に設定する
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * itemNoGrp のゲッターメソッドです。
     * 
     * @return the itemNoGrp
     */
    public String getItemNoGrp() {
        return itemNoGrp;
    }

    /**
     * itemNoGrp のセッターメソッドです。
     * 
     * @param itemNoGrp itemNoGrp に設定する
     */
    public void setItemNoGrp(String itemNoGrp) {
        this.itemNoGrp = itemNoGrp;
    }

    /**
     * itemNo のゲッターメソッドです。
     * 
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * itemNo のセッターメソッドです。
     * 
     * @param itemNo itemNo に設定する
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
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
     * netWeightA のゲッターメソッドです。
     * 
     * @return the netWeightA
     */
    public BigDecimal getNetWeightA() {
        return netWeightA;
    }

    /**
     * netWeightA のセッターメソッドです。
     * 
     * @param netWeightA netWeightA に設定する
     */
    public void setNetWeightA(BigDecimal netWeightA) {
        this.netWeightA = netWeightA;
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

}
