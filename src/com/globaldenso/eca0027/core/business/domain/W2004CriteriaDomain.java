/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the search condition on Palletize-Instruction Register screen.
 * <br />梱包指示Register画面の検索条件ドメインです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2004CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Changing agency screen
     * <br />遷移元画面
     */
    private String callScreenId;
    
    /* from Main screen */
    /* Main画面からの遷移 */
    
    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;
    
    /* from Create screen */
    /* Create画面からの遷移 */
    
    /**
     * SHIPPER CD
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    private String lgcyWhCd;
    
    /**
     * PALLETIZE INSTRUCTION DATE
     * <br />梱包指示日
     */
    private String pltzInstrDt;
    
    /**
     * PALLETIZE INSTRUCTION STATUS
     * <br />梱包指示ステータス
     */
    private String pltzInstrStatus;
    
    /**
     * CML PRINT OUT DATE
     * <br />CML出力日
     */
    private String cmlPrintOutDt;
    
    /**
     * COLLATE METHOD TYPE
     * <br />照合方式区分
     */
    private String collateMethTyp;
    
    /**
     * PALLETIZE INSTRUCTION ISSUER ID
     * <br />梱包指示者ID
     */
    private String pltzInstrIssuerId;
    
    /**
     * PALLETIZE INSTRUCTION NAME
     * <br />梱包指示者名
     */
    private String pltzInstrNm;
    
    /**
     * WEIGHT UNIT
     * <br />重量単位
     */
    private String weightUnit;
    
    /**
     * Date format (for screen display)
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * Date format (for document outputs)
     * <br />日付フォーマット (帳票出力用)
     */
    private String reportDateFormat;
    
    /**
     * CUSTOMER PO NO
     * <br />得意先PO NO
     */
    private String customerPoNo;
    
    /**
     * P/O Due Date(From)
     * <br />船積期限日(From)
     */
    private String poDueDtFrom;
    
    /**
     * P/O Due Date(To)
     * <br />船積期限日(To)
     */
    private String poDueDtTo;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2004CriteriaDomain() {
    }

    /**
     * Getter method for callScreenId.
     *
     * @return the callScreenId
     */
    public String getCallScreenId() {
        return callScreenId;
    }

    /**
     * Setter method for callScreenId.
     *
     * @param callScreenId Set for callScreenId
     */
    public void setCallScreenId(String callScreenId) {
        this.callScreenId = callScreenId;
    }

    /**
     * Getter method for pltzInstrNo.
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo.
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for customerCd.
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * Getter method for lgcyShipTo.
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for lgcyWhCd.
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * Setter method for lgcyWhCd.
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * Getter method for pltzInstrDt.
     *
     * @return the pltzInstrDt
     */
    public String getPltzInstrDt() {
        return pltzInstrDt;
    }

    /**
     * Setter method for pltzInstrDt.
     *
     * @param pltzInstrDt Set for pltzInstrDt
     */
    public void setPltzInstrDt(String pltzInstrDt) {
        this.pltzInstrDt = pltzInstrDt;
    }

    /**
     * Getter method for pltzInstrStatus.
     *
     * @return the pltzInstrStatus
     */
    public String getPltzInstrStatus() {
        return pltzInstrStatus;
    }

    /**
     * Setter method for pltzInstrStatus.
     *
     * @param pltzInstrStatus Set for pltzInstrStatus
     */
    public void setPltzInstrStatus(String pltzInstrStatus) {
        this.pltzInstrStatus = pltzInstrStatus;
    }

    /**
     * Getter method for cmlPrintOutDt.
     *
     * @return the cmlPrintOutDt
     */
    public String getCmlPrintOutDt() {
        return cmlPrintOutDt;
    }

    /**
     * Setter method for cmlPrintOutDt.
     *
     * @param cmlPrintOutDt Set for cmlPrintOutDt
     */
    public void setCmlPrintOutDt(String cmlPrintOutDt) {
        this.cmlPrintOutDt = cmlPrintOutDt;
    }

    /**
     * Getter method for pltzInstrIssuerId.
     *
     * @return the pltzInstrIssuerId
     */
    public String getPltzInstrIssuerId() {
        return pltzInstrIssuerId;
    }

    /**
     * Setter method for pltzInstrIssuerId.
     *
     * @param pltzInstrIssuerId Set for pltzInstrIssuerId
     */
    public void setPltzInstrIssuerId(String pltzInstrIssuerId) {
        this.pltzInstrIssuerId = pltzInstrIssuerId;
    }

    /**
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * Getter method for reportDateFormat.
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * Setter method for reportDateFormat.
     *
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
    }

    /**
     * Getter method for collateMethTyp.
     *
     * @return the collateMethTyp
     */
    public String getCollateMethTyp() {
        return collateMethTyp;
    }

    /**
     * Setter method for collateMethTyp.
     *
     * @param collateMethTyp Set for collateMethTyp
     */
    public void setCollateMethTyp(String collateMethTyp) {
        this.collateMethTyp = collateMethTyp;
    }

    /**
     * Getter method for pltzInstrNm.
     *
     * @return the pltzInstrNm
     */
    public String getPltzInstrNm() {
        return pltzInstrNm;
    }

    /**
     * Setter method for pltzInstrNm.
     *
     * @param pltzInstrNm Set for pltzInstrNm
     */
    public void setPltzInstrNm(String pltzInstrNm) {
        this.pltzInstrNm = pltzInstrNm;
    }

    /**
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * <p>customerPoNo のゲッターメソッドです。</p>
     *
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * <p>customerPoNo のセッターメソッドです。</p>
     *
     * @param customerPoNo customerPoNo に設定する
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }

    /**
     * <p>poDueDtFrom のゲッターメソッドです。</p>
     *
     * @return the poDueDtFrom
     */
    public String getPoDueDtFrom() {
        return poDueDtFrom;
    }

    /**
     * <p>poDueDtFrom のセッターメソッドです。</p>
     *
     * @param poDueDtFrom poDueDtFrom に設定する
     */
    public void setPoDueDtFrom(String poDueDtFrom) {
        this.poDueDtFrom = poDueDtFrom;
    }

    /**
     * <p>poDueDtTo のゲッターメソッドです。</p>
     *
     * @return the poDueDtTo
     */
    public String getPoDueDtTo() {
        return poDueDtTo;
    }

    /**
     * <p>poDueDtTo のセッターメソッドです。</p>
     *
     * @param poDueDtTo poDueDtTo に設定する
     */
    public void setPoDueDtTo(String poDueDtTo) {
        this.poDueDtTo = poDueDtTo;
    }

}
