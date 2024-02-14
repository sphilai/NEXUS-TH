/*
 * PROJECT：eca0027
 * 
 * TmInvAmountChk のDomainクラス
 * テーブル概要：Invoice Amount Check Master/インボイス金額エラーチェック原単位
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/16  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmInvAmountChk のDomainクラスです。<BR>
 * テーブル概要：Invoice Amount Check Master/インボイス金額エラーチェック原単位<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/16 10:50:51<BR>
 * 
 * テーブル定義から2014/04/16に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmInvAmountChkDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMPANY CODE/会社コード
     */
    private String compCd;

    /**
     * PRICE TERMS/建値区分
     */
    private String priceTerms;

    /**
     * TRADE TERMS/契約条件
     */
    private String tradeTerms;

    /**
     * FREIGHT RESPONSIBLE CODE/運賃支払いコード
     */
    private String freightResponsibleCd;

    /**
     * FREIGHT_ERR/運賃エラー  0：金額が0の場合エラー、1:金額が0以外の場合エラー
     */
    private String freightErr;

    /**
     * INSURANCE_ERR/保険金額エラー  0：金額が0の場合エラー、1:金額が0以外の場合エラー
     */
    private String insuranceErr;

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
    public TmInvAmountChkDomain() {
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
     * priceTerms のゲッターメソッドです。
     * 
     * @return the priceTerms
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * priceTerms のセッターメソッドです。
     * 
     * @param priceTerms priceTerms に設定する
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms;
    }

    /**
     * tradeTerms のゲッターメソッドです。
     * 
     * @return the tradeTerms
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * tradeTerms のセッターメソッドです。
     * 
     * @param tradeTerms tradeTerms に設定する
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    /**
     * freightResponsibleCd のゲッターメソッドです。
     * 
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * freightResponsibleCd のセッターメソッドです。
     * 
     * @param freightResponsibleCd freightResponsibleCd に設定する
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
    }

    /**
     * freightErr のゲッターメソッドです。
     * 
     * @return the freightErr
     */
    public String getFreightErr() {
        return freightErr;
    }

    /**
     * freightErr のセッターメソッドです。
     * 
     * @param freightErr freightErr に設定する
     */
    public void setFreightErr(String freightErr) {
        this.freightErr = freightErr;
    }

    /**
     * insuranceErr のゲッターメソッドです。
     * 
     * @return the insuranceErr
     */
    public String getInsuranceErr() {
        return insuranceErr;
    }

    /**
     * insuranceErr のセッターメソッドです。
     * 
     * @param insuranceErr insuranceErr に設定する
     */
    public void setInsuranceErr(String insuranceErr) {
        this.insuranceErr = insuranceErr;
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
