/*
 * PROJECT：eca0027
 * 
 * TmPrinterPurpose のDomainクラス
 * テーブル概要：TM_PRINTER_PURPOSE
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmPrinterPurpose のDomainクラスです。<BR>
 * テーブル概要：TM_PRINTER_PURPOSE<BR>
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
public class TmPrinterPurposeDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * PRINTER_ID
     */
    private String printerId;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * ODR_ERR_PRINTER_FLG
     */
    private String odrErrPrinterFlg;

    /**
     * ODR_ERR_DEF_PRITNTER_FLG
     */
    private String odrErrDefPritnterFlg;

    /**
     * MIGRATION_PRINTER_FLG
     */
    private String migrationPrinterFlg;

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
    public TmPrinterPurposeDomain() {
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
     * printerId のゲッターメソッドです。
     * 
     * @return the printerId
     */
    public String getPrinterId() {
        return printerId;
    }

    /**
     * printerId のセッターメソッドです。
     * 
     * @param printerId printerId に設定する
     */
    public void setPrinterId(String printerId) {
        this.printerId = printerId;
    }

    /**
     * plntCd のゲッターメソッドです。
     * 
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * plntCd のセッターメソッドです。
     * 
     * @param plntCd plntCd に設定する
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * odrErrPrinterFlg のゲッターメソッドです。
     * 
     * @return the odrErrPrinterFlg
     */
    public String getOdrErrPrinterFlg() {
        return odrErrPrinterFlg;
    }

    /**
     * odrErrPrinterFlg のセッターメソッドです。
     * 
     * @param odrErrPrinterFlg odrErrPrinterFlg に設定する
     */
    public void setOdrErrPrinterFlg(String odrErrPrinterFlg) {
        this.odrErrPrinterFlg = odrErrPrinterFlg;
    }

    /**
     * odrErrDefPritnterFlg のゲッターメソッドです。
     * 
     * @return the odrErrDefPritnterFlg
     */
    public String getOdrErrDefPritnterFlg() {
        return odrErrDefPritnterFlg;
    }

    /**
     * odrErrDefPritnterFlg のセッターメソッドです。
     * 
     * @param odrErrDefPritnterFlg odrErrDefPritnterFlg に設定する
     */
    public void setOdrErrDefPritnterFlg(String odrErrDefPritnterFlg) {
        this.odrErrDefPritnterFlg = odrErrDefPritnterFlg;
    }

    /**
     * migrationPrinterFlg のゲッターメソッドです。
     * 
     * @return the migrationPrinterFlg
     */
    public String getMigrationPrinterFlg() {
        return migrationPrinterFlg;
    }

    /**
     * migrationPrinterFlg のセッターメソッドです。
     * 
     * @param migrationPrinterFlg migrationPrinterFlg に設定する
     */
    public void setMigrationPrinterFlg(String migrationPrinterFlg) {
        this.migrationPrinterFlg = migrationPrinterFlg;
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
