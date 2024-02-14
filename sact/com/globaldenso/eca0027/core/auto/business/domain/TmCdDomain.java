/*
 * PROJECT：eca0027
 * 
 * TmCd のDomainクラス
 * テーブル概要：TM_CD
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
 * TmCd のDomainクラスです。<BR>
 * テーブル概要：TM_CD<BR>
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
public class TmCdDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * CD_TYP
     */
    private String cdTyp;

    /**
     * LNG_CD
     */
    private String lngCd;

    /**
     * CD
     */
    private String cd;

    /**
     * SORT_ODR
     */
    private BigDecimal sortOdr;

    /**
     * VALUE
     */
    private String value;

    /**
     * REMARKS
     */
    private String remarks;

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
    public TmCdDomain() {
    }

    /**
     * cdTyp のゲッターメソッドです。
     * 
     * @return the cdTyp
     */
    public String getCdTyp() {
        return cdTyp;
    }

    /**
     * cdTyp のセッターメソッドです。
     * 
     * @param cdTyp cdTyp に設定する
     */
    public void setCdTyp(String cdTyp) {
        this.cdTyp = cdTyp;
    }

    /**
     * lngCd のゲッターメソッドです。
     * 
     * @return the lngCd
     */
    public String getLngCd() {
        return lngCd;
    }

    /**
     * lngCd のセッターメソッドです。
     * 
     * @param lngCd lngCd に設定する
     */
    public void setLngCd(String lngCd) {
        this.lngCd = lngCd;
    }

    /**
     * cd のゲッターメソッドです。
     * 
     * @return the cd
     */
    public String getCd() {
        return cd;
    }

    /**
     * cd のセッターメソッドです。
     * 
     * @param cd cd に設定する
     */
    public void setCd(String cd) {
        this.cd = cd;
    }

    /**
     * sortOdr のゲッターメソッドです。
     * 
     * @return the sortOdr
     */
    public BigDecimal getSortOdr() {
        return sortOdr;
    }

    /**
     * sortOdr のセッターメソッドです。
     * 
     * @param sortOdr sortOdr に設定する
     */
    public void setSortOdr(BigDecimal sortOdr) {
        this.sortOdr = sortOdr;
    }

    /**
     * value のゲッターメソッドです。
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * value のセッターメソッドです。
     * 
     * @param value value に設定する
     */
    public void setValue(String value) {
        this.value = value;
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
