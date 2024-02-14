/*
 * PROJECT：eca0027
 * 
 * TmOtherSysLink のDomainクラス
 * テーブル概要：Other System Link Master/他システムリンク原単位  Master that defines the other system link information/他システムのリンク情報を保持するMaster
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/02/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmOtherSysLink のDomainクラスです。<BR>
 * テーブル概要：Other System Link Master/他システムリンク原単位  Master that defines the other system link information/他システムのリンク情報を保持するMaster<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/02/11 14:36:46<BR>
 * 
 * テーブル定義から2015/02/11に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10644 $
 */
public class TmOtherSysLinkDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SYSTEM ID/システムID
     */
    private String sysId;

    /**
     * COMPANY CODE/会社コード
     */
    private String compCd;

    /**
     * SORT ORDER/並び順
     */
    private BigDecimal sortOdr;

    /**
     * URL/URL
     */
    private String url;

    /**
     * UPDATE FUNCTION ID/更新機能ID
     */
    private String comUpdateFuncId;

    /**
     * UPDATE USER ID/更新者
     */
    private String comUpdateUserId;

    /**
     * UPDATE TIMESTAMP更新日時
     */
    private Timestamp comUpdateTimestamp;

    /**
     * CREATE FUNCTION ID/作成機能ID
     */
    private String comCreateFuncId;

    /**
     * CREATE USER ID/作成者
     */
    private String comCreateUserId;

    /**
     * CREATE TIMESTAMP/作成日時
     */
    private Timestamp comCreateTimestamp;

    /**
     * デフォルトコンストラクタ。
     */
    public TmOtherSysLinkDomain() {
    }

    /**
     * sysId のゲッターメソッドです。
     * 
     * @return the sysId
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * sysId のセッターメソッドです。
     * 
     * @param sysId sysId に設定する
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
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
     * url のゲッターメソッドです。
     * 
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * url のセッターメソッドです。
     * 
     * @param url url に設定する
     */
    public void setUrl(String url) {
        this.url = url;
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
