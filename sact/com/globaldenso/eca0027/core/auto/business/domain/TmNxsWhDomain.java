/*
 * PROJECT：eca0027
 * 
 * TmNxsWh のDomainクラス
 * テーブル概要：TM_NXS_WH
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
 * TmNxsWh のDomainクラスです。<BR>
 * テーブル概要：TM_NXS_WH<BR>
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
public class TmNxsWhDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * WH_CD
     */
    private String whCd;

    /**
     * WH_NM
     */
    private String whNm;

    /**
     * WH_ADDR
     */
    private String whAddr;

    /**
     * REMARKS
     */
    private String remarks;

    /**
     * ODR_CONFIRM_FLG
     */
    private String odrConfirmFlg;

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
    public TmNxsWhDomain() {
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
     * whCd のゲッターメソッドです。
     * 
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * whCd のセッターメソッドです。
     * 
     * @param whCd whCd に設定する
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    /**
     * whNm のゲッターメソッドです。
     * 
     * @return the whNm
     */
    public String getWhNm() {
        return whNm;
    }

    /**
     * whNm のセッターメソッドです。
     * 
     * @param whNm whNm に設定する
     */
    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

    /**
     * whAddr のゲッターメソッドです。
     * 
     * @return the whAddr
     */
    public String getWhAddr() {
        return whAddr;
    }

    /**
     * whAddr のセッターメソッドです。
     * 
     * @param whAddr whAddr に設定する
     */
    public void setWhAddr(String whAddr) {
        this.whAddr = whAddr;
    }

    /**
     * remarks のゲッターメソッドです。
     * 
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * remarks のセッターメソッドです。
     * 
     * @param remarks remarks に設定する
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * odrConfirmFlg のゲッターメソッドです。
     * 
     * @return the odrConfirmFlg
     */
    public String getOdrConfirmFlg() {
        return odrConfirmFlg;
    }

    /**
     * odrConfirmFlg のセッターメソッドです。
     * 
     * @param odrConfirmFlg odrConfirmFlg に設定する
     */
    public void setOdrConfirmFlg(String odrConfirmFlg) {
        this.odrConfirmFlg = odrConfirmFlg;
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
