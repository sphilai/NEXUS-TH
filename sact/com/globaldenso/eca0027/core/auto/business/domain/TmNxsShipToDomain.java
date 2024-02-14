/*
 * PROJECT：eca0027
 * 
 * TmNxsShipTo のDomainクラス
 * テーブル概要：TM_NXS_SHIP_TO
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/04/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmNxsShipTo のDomainクラスです。<BR>
 * テーブル概要：TM_NXS_SHIP_TO<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/04/20 16:39:30<BR>
 * 
 * テーブル定義から2016/04/20に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 13082 $
 */
public class TmNxsShipToDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIP_TO_CD
     */
    private String shipToCd;

    /**
     * SHIP_TO_NM
     */
    private String shipToNm;

    /**
     * SHIP_TO_NM_ABB
     */
    private String shipToNmAbb;

    /**
     * CNTRY_CD
     */
    private String cntryCd;

    /**
     * SHIP_TO_ADDR
     */
    private String shipToAddr;

    /**
     * SHIP_TO_TEL
     */
    private String shipToTel;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * PRINT_SHIP_TO_NM_1
     */
    private String printShipToNm1;

    /**
     * PRINT_SHIP_TO_NM_2
     */
    private String printShipToNm2;

    /**
     * PRINT_SHIP_TO_ADDR_1
     */
    private String printShipToAddr1;

    /**
     * PRINT_SHIP_TO_ADDR_2
     */
    private String printShipToAddr2;

    /**
     * PRINT_SHIP_TO_ADDR_3
     */
    private String printShipToAddr3;

    /**
     * PRINT_SHIP_TO_ADDR_4
     */
    private String printShipToAddr4;

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
    public TmNxsShipToDomain() {
    }

    /**
     * shipToCd のゲッターメソッドです。
     * 
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * shipToCd のセッターメソッドです。
     * 
     * @param shipToCd shipToCd に設定する
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * shipToNm のゲッターメソッドです。
     * 
     * @return the shipToNm
     */
    public String getShipToNm() {
        return shipToNm;
    }

    /**
     * shipToNm のセッターメソッドです。
     * 
     * @param shipToNm shipToNm に設定する
     */
    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
    }

    /**
     * shipToNmAbb のゲッターメソッドです。
     * 
     * @return the shipToNmAbb
     */
    public String getShipToNmAbb() {
        return shipToNmAbb;
    }

    /**
     * shipToNmAbb のセッターメソッドです。
     * 
     * @param shipToNmAbb shipToNmAbb に設定する
     */
    public void setShipToNmAbb(String shipToNmAbb) {
        this.shipToNmAbb = shipToNmAbb;
    }

    /**
     * cntryCd のゲッターメソッドです。
     * 
     * @return the cntryCd
     */
    public String getCntryCd() {
        return cntryCd;
    }

    /**
     * cntryCd のセッターメソッドです。
     * 
     * @param cntryCd cntryCd に設定する
     */
    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    /**
     * shipToAddr のゲッターメソッドです。
     * 
     * @return the shipToAddr
     */
    public String getShipToAddr() {
        return shipToAddr;
    }

    /**
     * shipToAddr のセッターメソッドです。
     * 
     * @param shipToAddr shipToAddr に設定する
     */
    public void setShipToAddr(String shipToAddr) {
        this.shipToAddr = shipToAddr;
    }

    /**
     * shipToTel のゲッターメソッドです。
     * 
     * @return the shipToTel
     */
    public String getShipToTel() {
        return shipToTel;
    }

    /**
     * shipToTel のセッターメソッドです。
     * 
     * @param shipToTel shipToTel に設定する
     */
    public void setShipToTel(String shipToTel) {
        this.shipToTel = shipToTel;
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
     * printShipToNm1 のゲッターメソッドです。
     * 
     * @return the printShipToNm1
     */
    public String getPrintShipToNm1() {
        return printShipToNm1;
    }

    /**
     * printShipToNm1 のセッターメソッドです。
     * 
     * @param printShipToNm1 printShipToNm1 に設定する
     */
    public void setPrintShipToNm1(String printShipToNm1) {
        this.printShipToNm1 = printShipToNm1;
    }

    /**
     * printShipToNm2 のゲッターメソッドです。
     * 
     * @return the printShipToNm2
     */
    public String getPrintShipToNm2() {
        return printShipToNm2;
    }

    /**
     * printShipToNm2 のセッターメソッドです。
     * 
     * @param printShipToNm2 printShipToNm2 に設定する
     */
    public void setPrintShipToNm2(String printShipToNm2) {
        this.printShipToNm2 = printShipToNm2;
    }

    /**
     * printShipToAddr1 のゲッターメソッドです。
     * 
     * @return the printShipToAddr1
     */
    public String getPrintShipToAddr1() {
        return printShipToAddr1;
    }

    /**
     * printShipToAddr1 のセッターメソッドです。
     * 
     * @param printShipToAddr1 printShipToAddr1 に設定する
     */
    public void setPrintShipToAddr1(String printShipToAddr1) {
        this.printShipToAddr1 = printShipToAddr1;
    }

    /**
     * printShipToAddr2 のゲッターメソッドです。
     * 
     * @return the printShipToAddr2
     */
    public String getPrintShipToAddr2() {
        return printShipToAddr2;
    }

    /**
     * printShipToAddr2 のセッターメソッドです。
     * 
     * @param printShipToAddr2 printShipToAddr2 に設定する
     */
    public void setPrintShipToAddr2(String printShipToAddr2) {
        this.printShipToAddr2 = printShipToAddr2;
    }

    /**
     * printShipToAddr3 のゲッターメソッドです。
     * 
     * @return the printShipToAddr3
     */
    public String getPrintShipToAddr3() {
        return printShipToAddr3;
    }

    /**
     * printShipToAddr3 のセッターメソッドです。
     * 
     * @param printShipToAddr3 printShipToAddr3 に設定する
     */
    public void setPrintShipToAddr3(String printShipToAddr3) {
        this.printShipToAddr3 = printShipToAddr3;
    }

    /**
     * printShipToAddr4 のゲッターメソッドです。
     * 
     * @return the printShipToAddr4
     */
    public String getPrintShipToAddr4() {
        return printShipToAddr4;
    }

    /**
     * printShipToAddr4 のセッターメソッドです。
     * 
     * @param printShipToAddr4 printShipToAddr4 に設定する
     */
    public void setPrintShipToAddr4(String printShipToAddr4) {
        this.printShipToAddr4 = printShipToAddr4;
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
