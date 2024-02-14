/*
 * PROJECT：eca0027
 * 
 * TmPrinterPurpose の検索条件Domainクラス
 * テーブル概要：TM_PRINTER_PURPOSE
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
 * TmPrinterPurpose の検索条件Domainクラスです。<BR>
 * テーブル概要：TM_PRINTER_PURPOSE<BR>
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
public class TmPrinterPurposeCriteriaDomain extends AbstractDomain implements Serializable {

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
     * PRINTER_ID（大なり）
     */
    private String printerIdGreaterThan;

    /**
     * PRINTER_ID（大なりイコール）
     */
    private String printerIdGreaterThanEqual;

    /**
     * PRINTER_ID（小なり）
     */
    private String printerIdLessThan;

    /**
     * PRINTER_ID（小なりイコール）
     */
    private String printerIdLessThanEqual;

    /**
     * PRINTER_ID（前方一致）
     */
    private String printerIdLikeFront;

    /**
     * PLNT_CD（大なり）
     */
    private String plntCdGreaterThan;

    /**
     * PLNT_CD（大なりイコール）
     */
    private String plntCdGreaterThanEqual;

    /**
     * PLNT_CD（小なり）
     */
    private String plntCdLessThan;

    /**
     * PLNT_CD（小なりイコール）
     */
    private String plntCdLessThanEqual;

    /**
     * PLNT_CD（前方一致）
     */
    private String plntCdLikeFront;

    /**
     * ODR_ERR_PRINTER_FLG（大なり）
     */
    private String odrErrPrinterFlgGreaterThan;

    /**
     * ODR_ERR_PRINTER_FLG（大なりイコール）
     */
    private String odrErrPrinterFlgGreaterThanEqual;

    /**
     * ODR_ERR_PRINTER_FLG（小なり）
     */
    private String odrErrPrinterFlgLessThan;

    /**
     * ODR_ERR_PRINTER_FLG（小なりイコール）
     */
    private String odrErrPrinterFlgLessThanEqual;

    /**
     * ODR_ERR_PRINTER_FLG（前方一致）
     */
    private String odrErrPrinterFlgLikeFront;

    /**
     * ODR_ERR_DEF_PRITNTER_FLG（大なり）
     */
    private String odrErrDefPritnterFlgGreaterThan;

    /**
     * ODR_ERR_DEF_PRITNTER_FLG（大なりイコール）
     */
    private String odrErrDefPritnterFlgGreaterThanEqual;

    /**
     * ODR_ERR_DEF_PRITNTER_FLG（小なり）
     */
    private String odrErrDefPritnterFlgLessThan;

    /**
     * ODR_ERR_DEF_PRITNTER_FLG（小なりイコール）
     */
    private String odrErrDefPritnterFlgLessThanEqual;

    /**
     * ODR_ERR_DEF_PRITNTER_FLG（前方一致）
     */
    private String odrErrDefPritnterFlgLikeFront;

    /**
     * MIGRATION_PRINTER_FLG（大なり）
     */
    private String migrationPrinterFlgGreaterThan;

    /**
     * MIGRATION_PRINTER_FLG（大なりイコール）
     */
    private String migrationPrinterFlgGreaterThanEqual;

    /**
     * MIGRATION_PRINTER_FLG（小なり）
     */
    private String migrationPrinterFlgLessThan;

    /**
     * MIGRATION_PRINTER_FLG（小なりイコール）
     */
    private String migrationPrinterFlgLessThanEqual;

    /**
     * MIGRATION_PRINTER_FLG（前方一致）
     */
    private String migrationPrinterFlgLikeFront;

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
     * デフォルトコンストラクタ。
     */
    public TmPrinterPurposeCriteriaDomain() {
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
     * printerIdGreaterThan のゲッターメソッドです。
     * 
     * @return the printerIdGreaterThan
     */
    public String getPrinterIdGreaterThan() {
        return printerIdGreaterThan;
    }

    /**
     * printerIdGreaterThan のセッターメソッドです。
     * 
     * @param printerIdGreaterThan printerIdGreaterThan に設定する
     */
    public void setPrinterIdGreaterThan(String printerIdGreaterThan) {
        this.printerIdGreaterThan = printerIdGreaterThan;
    }

    /**
     * printerIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printerIdGreaterThanEqual
     */
    public String getPrinterIdGreaterThanEqual() {
        return printerIdGreaterThanEqual;
    }

    /**
     * printerIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param printerIdGreaterThanEqual printerIdGreaterThanEqual に設定する
     */
    public void setPrinterIdGreaterThanEqual(String printerIdGreaterThanEqual) {
        this.printerIdGreaterThanEqual = printerIdGreaterThanEqual;
    }

    /**
     * printerIdLessThan のゲッターメソッドです。
     * 
     * @return the printerIdLessThan
     */
    public String getPrinterIdLessThan() {
        return printerIdLessThan;
    }

    /**
     * printerIdLessThan のセッターメソッドです。
     * 
     * @param printerIdLessThan printerIdLessThan に設定する
     */
    public void setPrinterIdLessThan(String printerIdLessThan) {
        this.printerIdLessThan = printerIdLessThan;
    }

    /**
     * printerIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the printerIdLessThanEqual
     */
    public String getPrinterIdLessThanEqual() {
        return printerIdLessThanEqual;
    }

    /**
     * printerIdLessThanEqual のセッターメソッドです。
     * 
     * @param printerIdLessThanEqual printerIdLessThanEqual に設定する
     */
    public void setPrinterIdLessThanEqual(String printerIdLessThanEqual) {
        this.printerIdLessThanEqual = printerIdLessThanEqual;
    }

    /**
     * printerIdLikeFront のゲッターメソッドです。
     * 
     * @return the printerIdLikeFront
     */
    public String getPrinterIdLikeFront() {
        return printerIdLikeFront;
    }

    /**
     * printerIdLikeFront のセッターメソッドです。
     * 
     * @param printerIdLikeFront printerIdLikeFront に設定する
     */
    public void setPrinterIdLikeFront(String printerIdLikeFront) {
        this.printerIdLikeFront = printerIdLikeFront;
    }

    /**
     * plntCdGreaterThan のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThan
     */
    public String getPlntCdGreaterThan() {
        return plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThan のセッターメソッドです。
     * 
     * @param plntCdGreaterThan plntCdGreaterThan に設定する
     */
    public void setPlntCdGreaterThan(String plntCdGreaterThan) {
        this.plntCdGreaterThan = plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThanEqual
     */
    public String getPlntCdGreaterThanEqual() {
        return plntCdGreaterThanEqual;
    }

    /**
     * plntCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param plntCdGreaterThanEqual plntCdGreaterThanEqual に設定する
     */
    public void setPlntCdGreaterThanEqual(String plntCdGreaterThanEqual) {
        this.plntCdGreaterThanEqual = plntCdGreaterThanEqual;
    }

    /**
     * plntCdLessThan のゲッターメソッドです。
     * 
     * @return the plntCdLessThan
     */
    public String getPlntCdLessThan() {
        return plntCdLessThan;
    }

    /**
     * plntCdLessThan のセッターメソッドです。
     * 
     * @param plntCdLessThan plntCdLessThan に設定する
     */
    public void setPlntCdLessThan(String plntCdLessThan) {
        this.plntCdLessThan = plntCdLessThan;
    }

    /**
     * plntCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdLessThanEqual
     */
    public String getPlntCdLessThanEqual() {
        return plntCdLessThanEqual;
    }

    /**
     * plntCdLessThanEqual のセッターメソッドです。
     * 
     * @param plntCdLessThanEqual plntCdLessThanEqual に設定する
     */
    public void setPlntCdLessThanEqual(String plntCdLessThanEqual) {
        this.plntCdLessThanEqual = plntCdLessThanEqual;
    }

    /**
     * plntCdLikeFront のゲッターメソッドです。
     * 
     * @return the plntCdLikeFront
     */
    public String getPlntCdLikeFront() {
        return plntCdLikeFront;
    }

    /**
     * plntCdLikeFront のセッターメソッドです。
     * 
     * @param plntCdLikeFront plntCdLikeFront に設定する
     */
    public void setPlntCdLikeFront(String plntCdLikeFront) {
        this.plntCdLikeFront = plntCdLikeFront;
    }

    /**
     * odrErrPrinterFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the odrErrPrinterFlgGreaterThan
     */
    public String getOdrErrPrinterFlgGreaterThan() {
        return odrErrPrinterFlgGreaterThan;
    }

    /**
     * odrErrPrinterFlgGreaterThan のセッターメソッドです。
     * 
     * @param odrErrPrinterFlgGreaterThan odrErrPrinterFlgGreaterThan に設定する
     */
    public void setOdrErrPrinterFlgGreaterThan(String odrErrPrinterFlgGreaterThan) {
        this.odrErrPrinterFlgGreaterThan = odrErrPrinterFlgGreaterThan;
    }

    /**
     * odrErrPrinterFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the odrErrPrinterFlgGreaterThanEqual
     */
    public String getOdrErrPrinterFlgGreaterThanEqual() {
        return odrErrPrinterFlgGreaterThanEqual;
    }

    /**
     * odrErrPrinterFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param odrErrPrinterFlgGreaterThanEqual odrErrPrinterFlgGreaterThanEqual に設定する
     */
    public void setOdrErrPrinterFlgGreaterThanEqual(String odrErrPrinterFlgGreaterThanEqual) {
        this.odrErrPrinterFlgGreaterThanEqual = odrErrPrinterFlgGreaterThanEqual;
    }

    /**
     * odrErrPrinterFlgLessThan のゲッターメソッドです。
     * 
     * @return the odrErrPrinterFlgLessThan
     */
    public String getOdrErrPrinterFlgLessThan() {
        return odrErrPrinterFlgLessThan;
    }

    /**
     * odrErrPrinterFlgLessThan のセッターメソッドです。
     * 
     * @param odrErrPrinterFlgLessThan odrErrPrinterFlgLessThan に設定する
     */
    public void setOdrErrPrinterFlgLessThan(String odrErrPrinterFlgLessThan) {
        this.odrErrPrinterFlgLessThan = odrErrPrinterFlgLessThan;
    }

    /**
     * odrErrPrinterFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the odrErrPrinterFlgLessThanEqual
     */
    public String getOdrErrPrinterFlgLessThanEqual() {
        return odrErrPrinterFlgLessThanEqual;
    }

    /**
     * odrErrPrinterFlgLessThanEqual のセッターメソッドです。
     * 
     * @param odrErrPrinterFlgLessThanEqual odrErrPrinterFlgLessThanEqual に設定する
     */
    public void setOdrErrPrinterFlgLessThanEqual(String odrErrPrinterFlgLessThanEqual) {
        this.odrErrPrinterFlgLessThanEqual = odrErrPrinterFlgLessThanEqual;
    }

    /**
     * odrErrPrinterFlgLikeFront のゲッターメソッドです。
     * 
     * @return the odrErrPrinterFlgLikeFront
     */
    public String getOdrErrPrinterFlgLikeFront() {
        return odrErrPrinterFlgLikeFront;
    }

    /**
     * odrErrPrinterFlgLikeFront のセッターメソッドです。
     * 
     * @param odrErrPrinterFlgLikeFront odrErrPrinterFlgLikeFront に設定する
     */
    public void setOdrErrPrinterFlgLikeFront(String odrErrPrinterFlgLikeFront) {
        this.odrErrPrinterFlgLikeFront = odrErrPrinterFlgLikeFront;
    }

    /**
     * odrErrDefPritnterFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the odrErrDefPritnterFlgGreaterThan
     */
    public String getOdrErrDefPritnterFlgGreaterThan() {
        return odrErrDefPritnterFlgGreaterThan;
    }

    /**
     * odrErrDefPritnterFlgGreaterThan のセッターメソッドです。
     * 
     * @param odrErrDefPritnterFlgGreaterThan odrErrDefPritnterFlgGreaterThan に設定する
     */
    public void setOdrErrDefPritnterFlgGreaterThan(String odrErrDefPritnterFlgGreaterThan) {
        this.odrErrDefPritnterFlgGreaterThan = odrErrDefPritnterFlgGreaterThan;
    }

    /**
     * odrErrDefPritnterFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the odrErrDefPritnterFlgGreaterThanEqual
     */
    public String getOdrErrDefPritnterFlgGreaterThanEqual() {
        return odrErrDefPritnterFlgGreaterThanEqual;
    }

    /**
     * odrErrDefPritnterFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param odrErrDefPritnterFlgGreaterThanEqual odrErrDefPritnterFlgGreaterThanEqual に設定する
     */
    public void setOdrErrDefPritnterFlgGreaterThanEqual(String odrErrDefPritnterFlgGreaterThanEqual) {
        this.odrErrDefPritnterFlgGreaterThanEqual = odrErrDefPritnterFlgGreaterThanEqual;
    }

    /**
     * odrErrDefPritnterFlgLessThan のゲッターメソッドです。
     * 
     * @return the odrErrDefPritnterFlgLessThan
     */
    public String getOdrErrDefPritnterFlgLessThan() {
        return odrErrDefPritnterFlgLessThan;
    }

    /**
     * odrErrDefPritnterFlgLessThan のセッターメソッドです。
     * 
     * @param odrErrDefPritnterFlgLessThan odrErrDefPritnterFlgLessThan に設定する
     */
    public void setOdrErrDefPritnterFlgLessThan(String odrErrDefPritnterFlgLessThan) {
        this.odrErrDefPritnterFlgLessThan = odrErrDefPritnterFlgLessThan;
    }

    /**
     * odrErrDefPritnterFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the odrErrDefPritnterFlgLessThanEqual
     */
    public String getOdrErrDefPritnterFlgLessThanEqual() {
        return odrErrDefPritnterFlgLessThanEqual;
    }

    /**
     * odrErrDefPritnterFlgLessThanEqual のセッターメソッドです。
     * 
     * @param odrErrDefPritnterFlgLessThanEqual odrErrDefPritnterFlgLessThanEqual に設定する
     */
    public void setOdrErrDefPritnterFlgLessThanEqual(String odrErrDefPritnterFlgLessThanEqual) {
        this.odrErrDefPritnterFlgLessThanEqual = odrErrDefPritnterFlgLessThanEqual;
    }

    /**
     * odrErrDefPritnterFlgLikeFront のゲッターメソッドです。
     * 
     * @return the odrErrDefPritnterFlgLikeFront
     */
    public String getOdrErrDefPritnterFlgLikeFront() {
        return odrErrDefPritnterFlgLikeFront;
    }

    /**
     * odrErrDefPritnterFlgLikeFront のセッターメソッドです。
     * 
     * @param odrErrDefPritnterFlgLikeFront odrErrDefPritnterFlgLikeFront に設定する
     */
    public void setOdrErrDefPritnterFlgLikeFront(String odrErrDefPritnterFlgLikeFront) {
        this.odrErrDefPritnterFlgLikeFront = odrErrDefPritnterFlgLikeFront;
    }

    /**
     * migrationPrinterFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the migrationPrinterFlgGreaterThan
     */
    public String getMigrationPrinterFlgGreaterThan() {
        return migrationPrinterFlgGreaterThan;
    }

    /**
     * migrationPrinterFlgGreaterThan のセッターメソッドです。
     * 
     * @param migrationPrinterFlgGreaterThan migrationPrinterFlgGreaterThan に設定する
     */
    public void setMigrationPrinterFlgGreaterThan(String migrationPrinterFlgGreaterThan) {
        this.migrationPrinterFlgGreaterThan = migrationPrinterFlgGreaterThan;
    }

    /**
     * migrationPrinterFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the migrationPrinterFlgGreaterThanEqual
     */
    public String getMigrationPrinterFlgGreaterThanEqual() {
        return migrationPrinterFlgGreaterThanEqual;
    }

    /**
     * migrationPrinterFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param migrationPrinterFlgGreaterThanEqual migrationPrinterFlgGreaterThanEqual に設定する
     */
    public void setMigrationPrinterFlgGreaterThanEqual(String migrationPrinterFlgGreaterThanEqual) {
        this.migrationPrinterFlgGreaterThanEqual = migrationPrinterFlgGreaterThanEqual;
    }

    /**
     * migrationPrinterFlgLessThan のゲッターメソッドです。
     * 
     * @return the migrationPrinterFlgLessThan
     */
    public String getMigrationPrinterFlgLessThan() {
        return migrationPrinterFlgLessThan;
    }

    /**
     * migrationPrinterFlgLessThan のセッターメソッドです。
     * 
     * @param migrationPrinterFlgLessThan migrationPrinterFlgLessThan に設定する
     */
    public void setMigrationPrinterFlgLessThan(String migrationPrinterFlgLessThan) {
        this.migrationPrinterFlgLessThan = migrationPrinterFlgLessThan;
    }

    /**
     * migrationPrinterFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the migrationPrinterFlgLessThanEqual
     */
    public String getMigrationPrinterFlgLessThanEqual() {
        return migrationPrinterFlgLessThanEqual;
    }

    /**
     * migrationPrinterFlgLessThanEqual のセッターメソッドです。
     * 
     * @param migrationPrinterFlgLessThanEqual migrationPrinterFlgLessThanEqual に設定する
     */
    public void setMigrationPrinterFlgLessThanEqual(String migrationPrinterFlgLessThanEqual) {
        this.migrationPrinterFlgLessThanEqual = migrationPrinterFlgLessThanEqual;
    }

    /**
     * migrationPrinterFlgLikeFront のゲッターメソッドです。
     * 
     * @return the migrationPrinterFlgLikeFront
     */
    public String getMigrationPrinterFlgLikeFront() {
        return migrationPrinterFlgLikeFront;
    }

    /**
     * migrationPrinterFlgLikeFront のセッターメソッドです。
     * 
     * @param migrationPrinterFlgLikeFront migrationPrinterFlgLikeFront に設定する
     */
    public void setMigrationPrinterFlgLikeFront(String migrationPrinterFlgLikeFront) {
        this.migrationPrinterFlgLikeFront = migrationPrinterFlgLikeFront;
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

