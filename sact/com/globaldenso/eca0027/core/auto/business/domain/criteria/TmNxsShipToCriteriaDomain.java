/*
 * PROJECT：eca0027
 * 
 * TmNxsShipTo の検索条件Domainクラス
 * テーブル概要：TM_NXS_SHIP_TO
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/04/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmNxsShipTo の検索条件Domainクラスです。<BR>
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
public class TmNxsShipToCriteriaDomain extends AbstractDomain implements Serializable {

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
     * SHIP_TO_CD（大なり）
     */
    private String shipToCdGreaterThan;

    /**
     * SHIP_TO_CD（大なりイコール）
     */
    private String shipToCdGreaterThanEqual;

    /**
     * SHIP_TO_CD（小なり）
     */
    private String shipToCdLessThan;

    /**
     * SHIP_TO_CD（小なりイコール）
     */
    private String shipToCdLessThanEqual;

    /**
     * SHIP_TO_CD（前方一致）
     */
    private String shipToCdLikeFront;

    /**
     * SHIP_TO_NM（大なり）
     */
    private String shipToNmGreaterThan;

    /**
     * SHIP_TO_NM（大なりイコール）
     */
    private String shipToNmGreaterThanEqual;

    /**
     * SHIP_TO_NM（小なり）
     */
    private String shipToNmLessThan;

    /**
     * SHIP_TO_NM（小なりイコール）
     */
    private String shipToNmLessThanEqual;

    /**
     * SHIP_TO_NM（前方一致）
     */
    private String shipToNmLikeFront;

    /**
     * SHIP_TO_NM_ABB（大なり）
     */
    private String shipToNmAbbGreaterThan;

    /**
     * SHIP_TO_NM_ABB（大なりイコール）
     */
    private String shipToNmAbbGreaterThanEqual;

    /**
     * SHIP_TO_NM_ABB（小なり）
     */
    private String shipToNmAbbLessThan;

    /**
     * SHIP_TO_NM_ABB（小なりイコール）
     */
    private String shipToNmAbbLessThanEqual;

    /**
     * SHIP_TO_NM_ABB（前方一致）
     */
    private String shipToNmAbbLikeFront;

    /**
     * CNTRY_CD（大なり）
     */
    private String cntryCdGreaterThan;

    /**
     * CNTRY_CD（大なりイコール）
     */
    private String cntryCdGreaterThanEqual;

    /**
     * CNTRY_CD（小なり）
     */
    private String cntryCdLessThan;

    /**
     * CNTRY_CD（小なりイコール）
     */
    private String cntryCdLessThanEqual;

    /**
     * CNTRY_CD（前方一致）
     */
    private String cntryCdLikeFront;

    /**
     * SHIP_TO_ADDR（大なり）
     */
    private String shipToAddrGreaterThan;

    /**
     * SHIP_TO_ADDR（大なりイコール）
     */
    private String shipToAddrGreaterThanEqual;

    /**
     * SHIP_TO_ADDR（小なり）
     */
    private String shipToAddrLessThan;

    /**
     * SHIP_TO_ADDR（小なりイコール）
     */
    private String shipToAddrLessThanEqual;

    /**
     * SHIP_TO_ADDR（前方一致）
     */
    private String shipToAddrLikeFront;

    /**
     * SHIP_TO_TEL（大なり）
     */
    private String shipToTelGreaterThan;

    /**
     * SHIP_TO_TEL（大なりイコール）
     */
    private String shipToTelGreaterThanEqual;

    /**
     * SHIP_TO_TEL（小なり）
     */
    private String shipToTelLessThan;

    /**
     * SHIP_TO_TEL（小なりイコール）
     */
    private String shipToTelLessThanEqual;

    /**
     * SHIP_TO_TEL（前方一致）
     */
    private String shipToTelLikeFront;

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
     * PRINT_SHIP_TO_NM_1（大なり）
     */
    private String printShipToNm1GreaterThan;

    /**
     * PRINT_SHIP_TO_NM_1（大なりイコール）
     */
    private String printShipToNm1GreaterThanEqual;

    /**
     * PRINT_SHIP_TO_NM_1（小なり）
     */
    private String printShipToNm1LessThan;

    /**
     * PRINT_SHIP_TO_NM_1（小なりイコール）
     */
    private String printShipToNm1LessThanEqual;

    /**
     * PRINT_SHIP_TO_NM_1（前方一致）
     */
    private String printShipToNm1LikeFront;

    /**
     * PRINT_SHIP_TO_NM_2（大なり）
     */
    private String printShipToNm2GreaterThan;

    /**
     * PRINT_SHIP_TO_NM_2（大なりイコール）
     */
    private String printShipToNm2GreaterThanEqual;

    /**
     * PRINT_SHIP_TO_NM_2（小なり）
     */
    private String printShipToNm2LessThan;

    /**
     * PRINT_SHIP_TO_NM_2（小なりイコール）
     */
    private String printShipToNm2LessThanEqual;

    /**
     * PRINT_SHIP_TO_NM_2（前方一致）
     */
    private String printShipToNm2LikeFront;

    /**
     * PRINT_SHIP_TO_ADDR_1（大なり）
     */
    private String printShipToAddr1GreaterThan;

    /**
     * PRINT_SHIP_TO_ADDR_1（大なりイコール）
     */
    private String printShipToAddr1GreaterThanEqual;

    /**
     * PRINT_SHIP_TO_ADDR_1（小なり）
     */
    private String printShipToAddr1LessThan;

    /**
     * PRINT_SHIP_TO_ADDR_1（小なりイコール）
     */
    private String printShipToAddr1LessThanEqual;

    /**
     * PRINT_SHIP_TO_ADDR_1（前方一致）
     */
    private String printShipToAddr1LikeFront;

    /**
     * PRINT_SHIP_TO_ADDR_2（大なり）
     */
    private String printShipToAddr2GreaterThan;

    /**
     * PRINT_SHIP_TO_ADDR_2（大なりイコール）
     */
    private String printShipToAddr2GreaterThanEqual;

    /**
     * PRINT_SHIP_TO_ADDR_2（小なり）
     */
    private String printShipToAddr2LessThan;

    /**
     * PRINT_SHIP_TO_ADDR_2（小なりイコール）
     */
    private String printShipToAddr2LessThanEqual;

    /**
     * PRINT_SHIP_TO_ADDR_2（前方一致）
     */
    private String printShipToAddr2LikeFront;

    /**
     * PRINT_SHIP_TO_ADDR_3（大なり）
     */
    private String printShipToAddr3GreaterThan;

    /**
     * PRINT_SHIP_TO_ADDR_3（大なりイコール）
     */
    private String printShipToAddr3GreaterThanEqual;

    /**
     * PRINT_SHIP_TO_ADDR_3（小なり）
     */
    private String printShipToAddr3LessThan;

    /**
     * PRINT_SHIP_TO_ADDR_3（小なりイコール）
     */
    private String printShipToAddr3LessThanEqual;

    /**
     * PRINT_SHIP_TO_ADDR_3（前方一致）
     */
    private String printShipToAddr3LikeFront;

    /**
     * PRINT_SHIP_TO_ADDR_4（大なり）
     */
    private String printShipToAddr4GreaterThan;

    /**
     * PRINT_SHIP_TO_ADDR_4（大なりイコール）
     */
    private String printShipToAddr4GreaterThanEqual;

    /**
     * PRINT_SHIP_TO_ADDR_4（小なり）
     */
    private String printShipToAddr4LessThan;

    /**
     * PRINT_SHIP_TO_ADDR_4（小なりイコール）
     */
    private String printShipToAddr4LessThanEqual;

    /**
     * PRINT_SHIP_TO_ADDR_4（前方一致）
     */
    private String printShipToAddr4LikeFront;

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
    public TmNxsShipToCriteriaDomain() {
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

    /**
     * shipToCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThan
     */
    public String getShipToCdGreaterThan() {
        return shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCdGreaterThan shipToCdGreaterThan に設定する
     */
    public void setShipToCdGreaterThan(String shipToCdGreaterThan) {
        this.shipToCdGreaterThan = shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThanEqual
     */
    public String getShipToCdGreaterThanEqual() {
        return shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCdGreaterThanEqual shipToCdGreaterThanEqual に設定する
     */
    public void setShipToCdGreaterThanEqual(String shipToCdGreaterThanEqual) {
        this.shipToCdGreaterThanEqual = shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCdLessThan
     */
    public String getShipToCdLessThan() {
        return shipToCdLessThan;
    }

    /**
     * shipToCdLessThan のセッターメソッドです。
     * 
     * @param shipToCdLessThan shipToCdLessThan に設定する
     */
    public void setShipToCdLessThan(String shipToCdLessThan) {
        this.shipToCdLessThan = shipToCdLessThan;
    }

    /**
     * shipToCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdLessThanEqual
     */
    public String getShipToCdLessThanEqual() {
        return shipToCdLessThanEqual;
    }

    /**
     * shipToCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCdLessThanEqual shipToCdLessThanEqual に設定する
     */
    public void setShipToCdLessThanEqual(String shipToCdLessThanEqual) {
        this.shipToCdLessThanEqual = shipToCdLessThanEqual;
    }

    /**
     * shipToCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCdLikeFront
     */
    public String getShipToCdLikeFront() {
        return shipToCdLikeFront;
    }

    /**
     * shipToCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCdLikeFront shipToCdLikeFront に設定する
     */
    public void setShipToCdLikeFront(String shipToCdLikeFront) {
        this.shipToCdLikeFront = shipToCdLikeFront;
    }

    /**
     * shipToNmGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToNmGreaterThan
     */
    public String getShipToNmGreaterThan() {
        return shipToNmGreaterThan;
    }

    /**
     * shipToNmGreaterThan のセッターメソッドです。
     * 
     * @param shipToNmGreaterThan shipToNmGreaterThan に設定する
     */
    public void setShipToNmGreaterThan(String shipToNmGreaterThan) {
        this.shipToNmGreaterThan = shipToNmGreaterThan;
    }

    /**
     * shipToNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToNmGreaterThanEqual
     */
    public String getShipToNmGreaterThanEqual() {
        return shipToNmGreaterThanEqual;
    }

    /**
     * shipToNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToNmGreaterThanEqual shipToNmGreaterThanEqual に設定する
     */
    public void setShipToNmGreaterThanEqual(String shipToNmGreaterThanEqual) {
        this.shipToNmGreaterThanEqual = shipToNmGreaterThanEqual;
    }

    /**
     * shipToNmLessThan のゲッターメソッドです。
     * 
     * @return the shipToNmLessThan
     */
    public String getShipToNmLessThan() {
        return shipToNmLessThan;
    }

    /**
     * shipToNmLessThan のセッターメソッドです。
     * 
     * @param shipToNmLessThan shipToNmLessThan に設定する
     */
    public void setShipToNmLessThan(String shipToNmLessThan) {
        this.shipToNmLessThan = shipToNmLessThan;
    }

    /**
     * shipToNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToNmLessThanEqual
     */
    public String getShipToNmLessThanEqual() {
        return shipToNmLessThanEqual;
    }

    /**
     * shipToNmLessThanEqual のセッターメソッドです。
     * 
     * @param shipToNmLessThanEqual shipToNmLessThanEqual に設定する
     */
    public void setShipToNmLessThanEqual(String shipToNmLessThanEqual) {
        this.shipToNmLessThanEqual = shipToNmLessThanEqual;
    }

    /**
     * shipToNmLikeFront のゲッターメソッドです。
     * 
     * @return the shipToNmLikeFront
     */
    public String getShipToNmLikeFront() {
        return shipToNmLikeFront;
    }

    /**
     * shipToNmLikeFront のセッターメソッドです。
     * 
     * @param shipToNmLikeFront shipToNmLikeFront に設定する
     */
    public void setShipToNmLikeFront(String shipToNmLikeFront) {
        this.shipToNmLikeFront = shipToNmLikeFront;
    }

    /**
     * shipToNmAbbGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToNmAbbGreaterThan
     */
    public String getShipToNmAbbGreaterThan() {
        return shipToNmAbbGreaterThan;
    }

    /**
     * shipToNmAbbGreaterThan のセッターメソッドです。
     * 
     * @param shipToNmAbbGreaterThan shipToNmAbbGreaterThan に設定する
     */
    public void setShipToNmAbbGreaterThan(String shipToNmAbbGreaterThan) {
        this.shipToNmAbbGreaterThan = shipToNmAbbGreaterThan;
    }

    /**
     * shipToNmAbbGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToNmAbbGreaterThanEqual
     */
    public String getShipToNmAbbGreaterThanEqual() {
        return shipToNmAbbGreaterThanEqual;
    }

    /**
     * shipToNmAbbGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToNmAbbGreaterThanEqual shipToNmAbbGreaterThanEqual に設定する
     */
    public void setShipToNmAbbGreaterThanEqual(String shipToNmAbbGreaterThanEqual) {
        this.shipToNmAbbGreaterThanEqual = shipToNmAbbGreaterThanEqual;
    }

    /**
     * shipToNmAbbLessThan のゲッターメソッドです。
     * 
     * @return the shipToNmAbbLessThan
     */
    public String getShipToNmAbbLessThan() {
        return shipToNmAbbLessThan;
    }

    /**
     * shipToNmAbbLessThan のセッターメソッドです。
     * 
     * @param shipToNmAbbLessThan shipToNmAbbLessThan に設定する
     */
    public void setShipToNmAbbLessThan(String shipToNmAbbLessThan) {
        this.shipToNmAbbLessThan = shipToNmAbbLessThan;
    }

    /**
     * shipToNmAbbLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToNmAbbLessThanEqual
     */
    public String getShipToNmAbbLessThanEqual() {
        return shipToNmAbbLessThanEqual;
    }

    /**
     * shipToNmAbbLessThanEqual のセッターメソッドです。
     * 
     * @param shipToNmAbbLessThanEqual shipToNmAbbLessThanEqual に設定する
     */
    public void setShipToNmAbbLessThanEqual(String shipToNmAbbLessThanEqual) {
        this.shipToNmAbbLessThanEqual = shipToNmAbbLessThanEqual;
    }

    /**
     * shipToNmAbbLikeFront のゲッターメソッドです。
     * 
     * @return the shipToNmAbbLikeFront
     */
    public String getShipToNmAbbLikeFront() {
        return shipToNmAbbLikeFront;
    }

    /**
     * shipToNmAbbLikeFront のセッターメソッドです。
     * 
     * @param shipToNmAbbLikeFront shipToNmAbbLikeFront に設定する
     */
    public void setShipToNmAbbLikeFront(String shipToNmAbbLikeFront) {
        this.shipToNmAbbLikeFront = shipToNmAbbLikeFront;
    }

    /**
     * cntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the cntryCdGreaterThan
     */
    public String getCntryCdGreaterThan() {
        return cntryCdGreaterThan;
    }

    /**
     * cntryCdGreaterThan のセッターメソッドです。
     * 
     * @param cntryCdGreaterThan cntryCdGreaterThan に設定する
     */
    public void setCntryCdGreaterThan(String cntryCdGreaterThan) {
        this.cntryCdGreaterThan = cntryCdGreaterThan;
    }

    /**
     * cntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cntryCdGreaterThanEqual
     */
    public String getCntryCdGreaterThanEqual() {
        return cntryCdGreaterThanEqual;
    }

    /**
     * cntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param cntryCdGreaterThanEqual cntryCdGreaterThanEqual に設定する
     */
    public void setCntryCdGreaterThanEqual(String cntryCdGreaterThanEqual) {
        this.cntryCdGreaterThanEqual = cntryCdGreaterThanEqual;
    }

    /**
     * cntryCdLessThan のゲッターメソッドです。
     * 
     * @return the cntryCdLessThan
     */
    public String getCntryCdLessThan() {
        return cntryCdLessThan;
    }

    /**
     * cntryCdLessThan のセッターメソッドです。
     * 
     * @param cntryCdLessThan cntryCdLessThan に設定する
     */
    public void setCntryCdLessThan(String cntryCdLessThan) {
        this.cntryCdLessThan = cntryCdLessThan;
    }

    /**
     * cntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the cntryCdLessThanEqual
     */
    public String getCntryCdLessThanEqual() {
        return cntryCdLessThanEqual;
    }

    /**
     * cntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param cntryCdLessThanEqual cntryCdLessThanEqual に設定する
     */
    public void setCntryCdLessThanEqual(String cntryCdLessThanEqual) {
        this.cntryCdLessThanEqual = cntryCdLessThanEqual;
    }

    /**
     * cntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the cntryCdLikeFront
     */
    public String getCntryCdLikeFront() {
        return cntryCdLikeFront;
    }

    /**
     * cntryCdLikeFront のセッターメソッドです。
     * 
     * @param cntryCdLikeFront cntryCdLikeFront に設定する
     */
    public void setCntryCdLikeFront(String cntryCdLikeFront) {
        this.cntryCdLikeFront = cntryCdLikeFront;
    }

    /**
     * shipToAddrGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToAddrGreaterThan
     */
    public String getShipToAddrGreaterThan() {
        return shipToAddrGreaterThan;
    }

    /**
     * shipToAddrGreaterThan のセッターメソッドです。
     * 
     * @param shipToAddrGreaterThan shipToAddrGreaterThan に設定する
     */
    public void setShipToAddrGreaterThan(String shipToAddrGreaterThan) {
        this.shipToAddrGreaterThan = shipToAddrGreaterThan;
    }

    /**
     * shipToAddrGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddrGreaterThanEqual
     */
    public String getShipToAddrGreaterThanEqual() {
        return shipToAddrGreaterThanEqual;
    }

    /**
     * shipToAddrGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToAddrGreaterThanEqual shipToAddrGreaterThanEqual に設定する
     */
    public void setShipToAddrGreaterThanEqual(String shipToAddrGreaterThanEqual) {
        this.shipToAddrGreaterThanEqual = shipToAddrGreaterThanEqual;
    }

    /**
     * shipToAddrLessThan のゲッターメソッドです。
     * 
     * @return the shipToAddrLessThan
     */
    public String getShipToAddrLessThan() {
        return shipToAddrLessThan;
    }

    /**
     * shipToAddrLessThan のセッターメソッドです。
     * 
     * @param shipToAddrLessThan shipToAddrLessThan に設定する
     */
    public void setShipToAddrLessThan(String shipToAddrLessThan) {
        this.shipToAddrLessThan = shipToAddrLessThan;
    }

    /**
     * shipToAddrLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddrLessThanEqual
     */
    public String getShipToAddrLessThanEqual() {
        return shipToAddrLessThanEqual;
    }

    /**
     * shipToAddrLessThanEqual のセッターメソッドです。
     * 
     * @param shipToAddrLessThanEqual shipToAddrLessThanEqual に設定する
     */
    public void setShipToAddrLessThanEqual(String shipToAddrLessThanEqual) {
        this.shipToAddrLessThanEqual = shipToAddrLessThanEqual;
    }

    /**
     * shipToAddrLikeFront のゲッターメソッドです。
     * 
     * @return the shipToAddrLikeFront
     */
    public String getShipToAddrLikeFront() {
        return shipToAddrLikeFront;
    }

    /**
     * shipToAddrLikeFront のセッターメソッドです。
     * 
     * @param shipToAddrLikeFront shipToAddrLikeFront に設定する
     */
    public void setShipToAddrLikeFront(String shipToAddrLikeFront) {
        this.shipToAddrLikeFront = shipToAddrLikeFront;
    }

    /**
     * shipToTelGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToTelGreaterThan
     */
    public String getShipToTelGreaterThan() {
        return shipToTelGreaterThan;
    }

    /**
     * shipToTelGreaterThan のセッターメソッドです。
     * 
     * @param shipToTelGreaterThan shipToTelGreaterThan に設定する
     */
    public void setShipToTelGreaterThan(String shipToTelGreaterThan) {
        this.shipToTelGreaterThan = shipToTelGreaterThan;
    }

    /**
     * shipToTelGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToTelGreaterThanEqual
     */
    public String getShipToTelGreaterThanEqual() {
        return shipToTelGreaterThanEqual;
    }

    /**
     * shipToTelGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToTelGreaterThanEqual shipToTelGreaterThanEqual に設定する
     */
    public void setShipToTelGreaterThanEqual(String shipToTelGreaterThanEqual) {
        this.shipToTelGreaterThanEqual = shipToTelGreaterThanEqual;
    }

    /**
     * shipToTelLessThan のゲッターメソッドです。
     * 
     * @return the shipToTelLessThan
     */
    public String getShipToTelLessThan() {
        return shipToTelLessThan;
    }

    /**
     * shipToTelLessThan のセッターメソッドです。
     * 
     * @param shipToTelLessThan shipToTelLessThan に設定する
     */
    public void setShipToTelLessThan(String shipToTelLessThan) {
        this.shipToTelLessThan = shipToTelLessThan;
    }

    /**
     * shipToTelLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToTelLessThanEqual
     */
    public String getShipToTelLessThanEqual() {
        return shipToTelLessThanEqual;
    }

    /**
     * shipToTelLessThanEqual のセッターメソッドです。
     * 
     * @param shipToTelLessThanEqual shipToTelLessThanEqual に設定する
     */
    public void setShipToTelLessThanEqual(String shipToTelLessThanEqual) {
        this.shipToTelLessThanEqual = shipToTelLessThanEqual;
    }

    /**
     * shipToTelLikeFront のゲッターメソッドです。
     * 
     * @return the shipToTelLikeFront
     */
    public String getShipToTelLikeFront() {
        return shipToTelLikeFront;
    }

    /**
     * shipToTelLikeFront のセッターメソッドです。
     * 
     * @param shipToTelLikeFront shipToTelLikeFront に設定する
     */
    public void setShipToTelLikeFront(String shipToTelLikeFront) {
        this.shipToTelLikeFront = shipToTelLikeFront;
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
     * printShipToNm1GreaterThan のゲッターメソッドです。
     * 
     * @return the printShipToNm1GreaterThan
     */
    public String getPrintShipToNm1GreaterThan() {
        return printShipToNm1GreaterThan;
    }

    /**
     * printShipToNm1GreaterThan のセッターメソッドです。
     * 
     * @param printShipToNm1GreaterThan printShipToNm1GreaterThan に設定する
     */
    public void setPrintShipToNm1GreaterThan(String printShipToNm1GreaterThan) {
        this.printShipToNm1GreaterThan = printShipToNm1GreaterThan;
    }

    /**
     * printShipToNm1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToNm1GreaterThanEqual
     */
    public String getPrintShipToNm1GreaterThanEqual() {
        return printShipToNm1GreaterThanEqual;
    }

    /**
     * printShipToNm1GreaterThanEqual のセッターメソッドです。
     * 
     * @param printShipToNm1GreaterThanEqual printShipToNm1GreaterThanEqual に設定する
     */
    public void setPrintShipToNm1GreaterThanEqual(String printShipToNm1GreaterThanEqual) {
        this.printShipToNm1GreaterThanEqual = printShipToNm1GreaterThanEqual;
    }

    /**
     * printShipToNm1LessThan のゲッターメソッドです。
     * 
     * @return the printShipToNm1LessThan
     */
    public String getPrintShipToNm1LessThan() {
        return printShipToNm1LessThan;
    }

    /**
     * printShipToNm1LessThan のセッターメソッドです。
     * 
     * @param printShipToNm1LessThan printShipToNm1LessThan に設定する
     */
    public void setPrintShipToNm1LessThan(String printShipToNm1LessThan) {
        this.printShipToNm1LessThan = printShipToNm1LessThan;
    }

    /**
     * printShipToNm1LessThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToNm1LessThanEqual
     */
    public String getPrintShipToNm1LessThanEqual() {
        return printShipToNm1LessThanEqual;
    }

    /**
     * printShipToNm1LessThanEqual のセッターメソッドです。
     * 
     * @param printShipToNm1LessThanEqual printShipToNm1LessThanEqual に設定する
     */
    public void setPrintShipToNm1LessThanEqual(String printShipToNm1LessThanEqual) {
        this.printShipToNm1LessThanEqual = printShipToNm1LessThanEqual;
    }

    /**
     * printShipToNm1LikeFront のゲッターメソッドです。
     * 
     * @return the printShipToNm1LikeFront
     */
    public String getPrintShipToNm1LikeFront() {
        return printShipToNm1LikeFront;
    }

    /**
     * printShipToNm1LikeFront のセッターメソッドです。
     * 
     * @param printShipToNm1LikeFront printShipToNm1LikeFront に設定する
     */
    public void setPrintShipToNm1LikeFront(String printShipToNm1LikeFront) {
        this.printShipToNm1LikeFront = printShipToNm1LikeFront;
    }

    /**
     * printShipToNm2GreaterThan のゲッターメソッドです。
     * 
     * @return the printShipToNm2GreaterThan
     */
    public String getPrintShipToNm2GreaterThan() {
        return printShipToNm2GreaterThan;
    }

    /**
     * printShipToNm2GreaterThan のセッターメソッドです。
     * 
     * @param printShipToNm2GreaterThan printShipToNm2GreaterThan に設定する
     */
    public void setPrintShipToNm2GreaterThan(String printShipToNm2GreaterThan) {
        this.printShipToNm2GreaterThan = printShipToNm2GreaterThan;
    }

    /**
     * printShipToNm2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToNm2GreaterThanEqual
     */
    public String getPrintShipToNm2GreaterThanEqual() {
        return printShipToNm2GreaterThanEqual;
    }

    /**
     * printShipToNm2GreaterThanEqual のセッターメソッドです。
     * 
     * @param printShipToNm2GreaterThanEqual printShipToNm2GreaterThanEqual に設定する
     */
    public void setPrintShipToNm2GreaterThanEqual(String printShipToNm2GreaterThanEqual) {
        this.printShipToNm2GreaterThanEqual = printShipToNm2GreaterThanEqual;
    }

    /**
     * printShipToNm2LessThan のゲッターメソッドです。
     * 
     * @return the printShipToNm2LessThan
     */
    public String getPrintShipToNm2LessThan() {
        return printShipToNm2LessThan;
    }

    /**
     * printShipToNm2LessThan のセッターメソッドです。
     * 
     * @param printShipToNm2LessThan printShipToNm2LessThan に設定する
     */
    public void setPrintShipToNm2LessThan(String printShipToNm2LessThan) {
        this.printShipToNm2LessThan = printShipToNm2LessThan;
    }

    /**
     * printShipToNm2LessThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToNm2LessThanEqual
     */
    public String getPrintShipToNm2LessThanEqual() {
        return printShipToNm2LessThanEqual;
    }

    /**
     * printShipToNm2LessThanEqual のセッターメソッドです。
     * 
     * @param printShipToNm2LessThanEqual printShipToNm2LessThanEqual に設定する
     */
    public void setPrintShipToNm2LessThanEqual(String printShipToNm2LessThanEqual) {
        this.printShipToNm2LessThanEqual = printShipToNm2LessThanEqual;
    }

    /**
     * printShipToNm2LikeFront のゲッターメソッドです。
     * 
     * @return the printShipToNm2LikeFront
     */
    public String getPrintShipToNm2LikeFront() {
        return printShipToNm2LikeFront;
    }

    /**
     * printShipToNm2LikeFront のセッターメソッドです。
     * 
     * @param printShipToNm2LikeFront printShipToNm2LikeFront に設定する
     */
    public void setPrintShipToNm2LikeFront(String printShipToNm2LikeFront) {
        this.printShipToNm2LikeFront = printShipToNm2LikeFront;
    }

    /**
     * printShipToAddr1GreaterThan のゲッターメソッドです。
     * 
     * @return the printShipToAddr1GreaterThan
     */
    public String getPrintShipToAddr1GreaterThan() {
        return printShipToAddr1GreaterThan;
    }

    /**
     * printShipToAddr1GreaterThan のセッターメソッドです。
     * 
     * @param printShipToAddr1GreaterThan printShipToAddr1GreaterThan に設定する
     */
    public void setPrintShipToAddr1GreaterThan(String printShipToAddr1GreaterThan) {
        this.printShipToAddr1GreaterThan = printShipToAddr1GreaterThan;
    }

    /**
     * printShipToAddr1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToAddr1GreaterThanEqual
     */
    public String getPrintShipToAddr1GreaterThanEqual() {
        return printShipToAddr1GreaterThanEqual;
    }

    /**
     * printShipToAddr1GreaterThanEqual のセッターメソッドです。
     * 
     * @param printShipToAddr1GreaterThanEqual printShipToAddr1GreaterThanEqual に設定する
     */
    public void setPrintShipToAddr1GreaterThanEqual(String printShipToAddr1GreaterThanEqual) {
        this.printShipToAddr1GreaterThanEqual = printShipToAddr1GreaterThanEqual;
    }

    /**
     * printShipToAddr1LessThan のゲッターメソッドです。
     * 
     * @return the printShipToAddr1LessThan
     */
    public String getPrintShipToAddr1LessThan() {
        return printShipToAddr1LessThan;
    }

    /**
     * printShipToAddr1LessThan のセッターメソッドです。
     * 
     * @param printShipToAddr1LessThan printShipToAddr1LessThan に設定する
     */
    public void setPrintShipToAddr1LessThan(String printShipToAddr1LessThan) {
        this.printShipToAddr1LessThan = printShipToAddr1LessThan;
    }

    /**
     * printShipToAddr1LessThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToAddr1LessThanEqual
     */
    public String getPrintShipToAddr1LessThanEqual() {
        return printShipToAddr1LessThanEqual;
    }

    /**
     * printShipToAddr1LessThanEqual のセッターメソッドです。
     * 
     * @param printShipToAddr1LessThanEqual printShipToAddr1LessThanEqual に設定する
     */
    public void setPrintShipToAddr1LessThanEqual(String printShipToAddr1LessThanEqual) {
        this.printShipToAddr1LessThanEqual = printShipToAddr1LessThanEqual;
    }

    /**
     * printShipToAddr1LikeFront のゲッターメソッドです。
     * 
     * @return the printShipToAddr1LikeFront
     */
    public String getPrintShipToAddr1LikeFront() {
        return printShipToAddr1LikeFront;
    }

    /**
     * printShipToAddr1LikeFront のセッターメソッドです。
     * 
     * @param printShipToAddr1LikeFront printShipToAddr1LikeFront に設定する
     */
    public void setPrintShipToAddr1LikeFront(String printShipToAddr1LikeFront) {
        this.printShipToAddr1LikeFront = printShipToAddr1LikeFront;
    }

    /**
     * printShipToAddr2GreaterThan のゲッターメソッドです。
     * 
     * @return the printShipToAddr2GreaterThan
     */
    public String getPrintShipToAddr2GreaterThan() {
        return printShipToAddr2GreaterThan;
    }

    /**
     * printShipToAddr2GreaterThan のセッターメソッドです。
     * 
     * @param printShipToAddr2GreaterThan printShipToAddr2GreaterThan に設定する
     */
    public void setPrintShipToAddr2GreaterThan(String printShipToAddr2GreaterThan) {
        this.printShipToAddr2GreaterThan = printShipToAddr2GreaterThan;
    }

    /**
     * printShipToAddr2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToAddr2GreaterThanEqual
     */
    public String getPrintShipToAddr2GreaterThanEqual() {
        return printShipToAddr2GreaterThanEqual;
    }

    /**
     * printShipToAddr2GreaterThanEqual のセッターメソッドです。
     * 
     * @param printShipToAddr2GreaterThanEqual printShipToAddr2GreaterThanEqual に設定する
     */
    public void setPrintShipToAddr2GreaterThanEqual(String printShipToAddr2GreaterThanEqual) {
        this.printShipToAddr2GreaterThanEqual = printShipToAddr2GreaterThanEqual;
    }

    /**
     * printShipToAddr2LessThan のゲッターメソッドです。
     * 
     * @return the printShipToAddr2LessThan
     */
    public String getPrintShipToAddr2LessThan() {
        return printShipToAddr2LessThan;
    }

    /**
     * printShipToAddr2LessThan のセッターメソッドです。
     * 
     * @param printShipToAddr2LessThan printShipToAddr2LessThan に設定する
     */
    public void setPrintShipToAddr2LessThan(String printShipToAddr2LessThan) {
        this.printShipToAddr2LessThan = printShipToAddr2LessThan;
    }

    /**
     * printShipToAddr2LessThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToAddr2LessThanEqual
     */
    public String getPrintShipToAddr2LessThanEqual() {
        return printShipToAddr2LessThanEqual;
    }

    /**
     * printShipToAddr2LessThanEqual のセッターメソッドです。
     * 
     * @param printShipToAddr2LessThanEqual printShipToAddr2LessThanEqual に設定する
     */
    public void setPrintShipToAddr2LessThanEqual(String printShipToAddr2LessThanEqual) {
        this.printShipToAddr2LessThanEqual = printShipToAddr2LessThanEqual;
    }

    /**
     * printShipToAddr2LikeFront のゲッターメソッドです。
     * 
     * @return the printShipToAddr2LikeFront
     */
    public String getPrintShipToAddr2LikeFront() {
        return printShipToAddr2LikeFront;
    }

    /**
     * printShipToAddr2LikeFront のセッターメソッドです。
     * 
     * @param printShipToAddr2LikeFront printShipToAddr2LikeFront に設定する
     */
    public void setPrintShipToAddr2LikeFront(String printShipToAddr2LikeFront) {
        this.printShipToAddr2LikeFront = printShipToAddr2LikeFront;
    }

    /**
     * printShipToAddr3GreaterThan のゲッターメソッドです。
     * 
     * @return the printShipToAddr3GreaterThan
     */
    public String getPrintShipToAddr3GreaterThan() {
        return printShipToAddr3GreaterThan;
    }

    /**
     * printShipToAddr3GreaterThan のセッターメソッドです。
     * 
     * @param printShipToAddr3GreaterThan printShipToAddr3GreaterThan に設定する
     */
    public void setPrintShipToAddr3GreaterThan(String printShipToAddr3GreaterThan) {
        this.printShipToAddr3GreaterThan = printShipToAddr3GreaterThan;
    }

    /**
     * printShipToAddr3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToAddr3GreaterThanEqual
     */
    public String getPrintShipToAddr3GreaterThanEqual() {
        return printShipToAddr3GreaterThanEqual;
    }

    /**
     * printShipToAddr3GreaterThanEqual のセッターメソッドです。
     * 
     * @param printShipToAddr3GreaterThanEqual printShipToAddr3GreaterThanEqual に設定する
     */
    public void setPrintShipToAddr3GreaterThanEqual(String printShipToAddr3GreaterThanEqual) {
        this.printShipToAddr3GreaterThanEqual = printShipToAddr3GreaterThanEqual;
    }

    /**
     * printShipToAddr3LessThan のゲッターメソッドです。
     * 
     * @return the printShipToAddr3LessThan
     */
    public String getPrintShipToAddr3LessThan() {
        return printShipToAddr3LessThan;
    }

    /**
     * printShipToAddr3LessThan のセッターメソッドです。
     * 
     * @param printShipToAddr3LessThan printShipToAddr3LessThan に設定する
     */
    public void setPrintShipToAddr3LessThan(String printShipToAddr3LessThan) {
        this.printShipToAddr3LessThan = printShipToAddr3LessThan;
    }

    /**
     * printShipToAddr3LessThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToAddr3LessThanEqual
     */
    public String getPrintShipToAddr3LessThanEqual() {
        return printShipToAddr3LessThanEqual;
    }

    /**
     * printShipToAddr3LessThanEqual のセッターメソッドです。
     * 
     * @param printShipToAddr3LessThanEqual printShipToAddr3LessThanEqual に設定する
     */
    public void setPrintShipToAddr3LessThanEqual(String printShipToAddr3LessThanEqual) {
        this.printShipToAddr3LessThanEqual = printShipToAddr3LessThanEqual;
    }

    /**
     * printShipToAddr3LikeFront のゲッターメソッドです。
     * 
     * @return the printShipToAddr3LikeFront
     */
    public String getPrintShipToAddr3LikeFront() {
        return printShipToAddr3LikeFront;
    }

    /**
     * printShipToAddr3LikeFront のセッターメソッドです。
     * 
     * @param printShipToAddr3LikeFront printShipToAddr3LikeFront に設定する
     */
    public void setPrintShipToAddr3LikeFront(String printShipToAddr3LikeFront) {
        this.printShipToAddr3LikeFront = printShipToAddr3LikeFront;
    }

    /**
     * printShipToAddr4GreaterThan のゲッターメソッドです。
     * 
     * @return the printShipToAddr4GreaterThan
     */
    public String getPrintShipToAddr4GreaterThan() {
        return printShipToAddr4GreaterThan;
    }

    /**
     * printShipToAddr4GreaterThan のセッターメソッドです。
     * 
     * @param printShipToAddr4GreaterThan printShipToAddr4GreaterThan に設定する
     */
    public void setPrintShipToAddr4GreaterThan(String printShipToAddr4GreaterThan) {
        this.printShipToAddr4GreaterThan = printShipToAddr4GreaterThan;
    }

    /**
     * printShipToAddr4GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToAddr4GreaterThanEqual
     */
    public String getPrintShipToAddr4GreaterThanEqual() {
        return printShipToAddr4GreaterThanEqual;
    }

    /**
     * printShipToAddr4GreaterThanEqual のセッターメソッドです。
     * 
     * @param printShipToAddr4GreaterThanEqual printShipToAddr4GreaterThanEqual に設定する
     */
    public void setPrintShipToAddr4GreaterThanEqual(String printShipToAddr4GreaterThanEqual) {
        this.printShipToAddr4GreaterThanEqual = printShipToAddr4GreaterThanEqual;
    }

    /**
     * printShipToAddr4LessThan のゲッターメソッドです。
     * 
     * @return the printShipToAddr4LessThan
     */
    public String getPrintShipToAddr4LessThan() {
        return printShipToAddr4LessThan;
    }

    /**
     * printShipToAddr4LessThan のセッターメソッドです。
     * 
     * @param printShipToAddr4LessThan printShipToAddr4LessThan に設定する
     */
    public void setPrintShipToAddr4LessThan(String printShipToAddr4LessThan) {
        this.printShipToAddr4LessThan = printShipToAddr4LessThan;
    }

    /**
     * printShipToAddr4LessThanEqual のゲッターメソッドです。
     * 
     * @return the printShipToAddr4LessThanEqual
     */
    public String getPrintShipToAddr4LessThanEqual() {
        return printShipToAddr4LessThanEqual;
    }

    /**
     * printShipToAddr4LessThanEqual のセッターメソッドです。
     * 
     * @param printShipToAddr4LessThanEqual printShipToAddr4LessThanEqual に設定する
     */
    public void setPrintShipToAddr4LessThanEqual(String printShipToAddr4LessThanEqual) {
        this.printShipToAddr4LessThanEqual = printShipToAddr4LessThanEqual;
    }

    /**
     * printShipToAddr4LikeFront のゲッターメソッドです。
     * 
     * @return the printShipToAddr4LikeFront
     */
    public String getPrintShipToAddr4LikeFront() {
        return printShipToAddr4LikeFront;
    }

    /**
     * printShipToAddr4LikeFront のセッターメソッドです。
     * 
     * @param printShipToAddr4LikeFront printShipToAddr4LikeFront に設定する
     */
    public void setPrintShipToAddr4LikeFront(String printShipToAddr4LikeFront) {
        this.printShipToAddr4LikeFront = printShipToAddr4LikeFront;
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

