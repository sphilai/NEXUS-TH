/*
 * PROJECT：eca0027
 * 
 * VtRpOdrRcvErrReportHdr の検索条件Domainクラス
 * テーブル概要：VT_RP_ODR_RCV_ERR_REPORT_HDR
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;

/**
 * VtRpOdrRcvErrReportHdr の検索条件Domainクラスです。<BR>
 * テーブル概要：VT_RP_ODR_RCV_ERR_REPORT_HDR<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 13:29:08<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class VtRpOdrRcvErrReportHdrCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * RCV_ODR_COMP_CD
     */
    private String rcvOdrCompCd;

    /**
     * CUSTOMER_SUBSIDIARY_CD
     */
    private String customerSubsidiaryCd;

    /**
     * TRANSMISSION_DT
     */
    private Date transmissionDt;

    /**
     * CUSTOMER_CD
     */
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * COUNT
     */
    private BigDecimal count;

    /**
     * SHIP_TO_NM
     */
    private String shipToNm;

    /**
     * RCV_ODR_COMP_CD（大なり）
     */
    private String rcvOdrCompCdGreaterThan;

    /**
     * RCV_ODR_COMP_CD（大なりイコール）
     */
    private String rcvOdrCompCdGreaterThanEqual;

    /**
     * RCV_ODR_COMP_CD（小なり）
     */
    private String rcvOdrCompCdLessThan;

    /**
     * RCV_ODR_COMP_CD（小なりイコール）
     */
    private String rcvOdrCompCdLessThanEqual;

    /**
     * RCV_ODR_COMP_CD（前方一致）
     */
    private String rcvOdrCompCdLikeFront;

    /**
     * CUSTOMER_SUBSIDIARY_CD（大なり）
     */
    private String customerSubsidiaryCdGreaterThan;

    /**
     * CUSTOMER_SUBSIDIARY_CD（大なりイコール）
     */
    private String customerSubsidiaryCdGreaterThanEqual;

    /**
     * CUSTOMER_SUBSIDIARY_CD（小なり）
     */
    private String customerSubsidiaryCdLessThan;

    /**
     * CUSTOMER_SUBSIDIARY_CD（小なりイコール）
     */
    private String customerSubsidiaryCdLessThanEqual;

    /**
     * CUSTOMER_SUBSIDIARY_CD（前方一致）
     */
    private String customerSubsidiaryCdLikeFront;

    /**
     * TRANSMISSION_DT（大なりイコール）
     */
    private Date transmissionDtGreaterThanEqual;

    /**
     * TRANSMISSION_DT（小なりイコール）
     */
    private Date transmissionDtLessThanEqual;

    /**
     * CUSTOMER_CD（大なり）
     */
    private String customerCdGreaterThan;

    /**
     * CUSTOMER_CD（大なりイコール）
     */
    private String customerCdGreaterThanEqual;

    /**
     * CUSTOMER_CD（小なり）
     */
    private String customerCdLessThan;

    /**
     * CUSTOMER_CD（小なりイコール）
     */
    private String customerCdLessThanEqual;

    /**
     * CUSTOMER_CD（前方一致）
     */
    private String customerCdLikeFront;

    /**
     * LGCY_SHIP_TO（大なり）
     */
    private String lgcyShipToGreaterThan;

    /**
     * LGCY_SHIP_TO（大なりイコール）
     */
    private String lgcyShipToGreaterThanEqual;

    /**
     * LGCY_SHIP_TO（小なり）
     */
    private String lgcyShipToLessThan;

    /**
     * LGCY_SHIP_TO（小なりイコール）
     */
    private String lgcyShipToLessThanEqual;

    /**
     * LGCY_SHIP_TO（前方一致）
     */
    private String lgcyShipToLikeFront;

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
     * デフォルトコンストラクタ。
     */
    public VtRpOdrRcvErrReportHdrCriteriaDomain() {
    }

    /**
     * rcvOdrCompCd のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCd
     */
    public String getRcvOdrCompCd() {
        return rcvOdrCompCd;
    }

    /**
     * rcvOdrCompCd のセッターメソッドです。
     * 
     * @param rcvOdrCompCd rcvOdrCompCd に設定する
     */
    public void setRcvOdrCompCd(String rcvOdrCompCd) {
        this.rcvOdrCompCd = rcvOdrCompCd;
    }

    /**
     * customerSubsidiaryCd のゲッターメソッドです。
     * 
     * @return the customerSubsidiaryCd
     */
    public String getCustomerSubsidiaryCd() {
        return customerSubsidiaryCd;
    }

    /**
     * customerSubsidiaryCd のセッターメソッドです。
     * 
     * @param customerSubsidiaryCd customerSubsidiaryCd に設定する
     */
    public void setCustomerSubsidiaryCd(String customerSubsidiaryCd) {
        this.customerSubsidiaryCd = customerSubsidiaryCd;
    }

    /**
     * transmissionDt のゲッターメソッドです。
     * 
     * @return the transmissionDt
     */
    public Date getTransmissionDt() {
        return transmissionDt;
    }

    /**
     * transmissionDt のセッターメソッドです。
     * 
     * @param transmissionDt transmissionDt に設定する
     */
    public void setTransmissionDt(Date transmissionDt) {
        this.transmissionDt = transmissionDt;
    }

    /**
     * customerCd のゲッターメソッドです。
     * 
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * customerCd のセッターメソッドです。
     * 
     * @param customerCd customerCd に設定する
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * lgcyShipTo のゲッターメソッドです。
     * 
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * lgcyShipTo のセッターメソッドです。
     * 
     * @param lgcyShipTo lgcyShipTo に設定する
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
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
     * count のゲッターメソッドです。
     * 
     * @return the count
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
     * count のセッターメソッドです。
     * 
     * @param count count に設定する
     */
    public void setCount(BigDecimal count) {
        this.count = count;
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
     * rcvOdrCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdGreaterThan
     */
    public String getRcvOdrCompCdGreaterThan() {
        return rcvOdrCompCdGreaterThan;
    }

    /**
     * rcvOdrCompCdGreaterThan のセッターメソッドです。
     * 
     * @param rcvOdrCompCdGreaterThan rcvOdrCompCdGreaterThan に設定する
     */
    public void setRcvOdrCompCdGreaterThan(String rcvOdrCompCdGreaterThan) {
        this.rcvOdrCompCdGreaterThan = rcvOdrCompCdGreaterThan;
    }

    /**
     * rcvOdrCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdGreaterThanEqual
     */
    public String getRcvOdrCompCdGreaterThanEqual() {
        return rcvOdrCompCdGreaterThanEqual;
    }

    /**
     * rcvOdrCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param rcvOdrCompCdGreaterThanEqual rcvOdrCompCdGreaterThanEqual に設定する
     */
    public void setRcvOdrCompCdGreaterThanEqual(String rcvOdrCompCdGreaterThanEqual) {
        this.rcvOdrCompCdGreaterThanEqual = rcvOdrCompCdGreaterThanEqual;
    }

    /**
     * rcvOdrCompCdLessThan のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdLessThan
     */
    public String getRcvOdrCompCdLessThan() {
        return rcvOdrCompCdLessThan;
    }

    /**
     * rcvOdrCompCdLessThan のセッターメソッドです。
     * 
     * @param rcvOdrCompCdLessThan rcvOdrCompCdLessThan に設定する
     */
    public void setRcvOdrCompCdLessThan(String rcvOdrCompCdLessThan) {
        this.rcvOdrCompCdLessThan = rcvOdrCompCdLessThan;
    }

    /**
     * rcvOdrCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdLessThanEqual
     */
    public String getRcvOdrCompCdLessThanEqual() {
        return rcvOdrCompCdLessThanEqual;
    }

    /**
     * rcvOdrCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param rcvOdrCompCdLessThanEqual rcvOdrCompCdLessThanEqual に設定する
     */
    public void setRcvOdrCompCdLessThanEqual(String rcvOdrCompCdLessThanEqual) {
        this.rcvOdrCompCdLessThanEqual = rcvOdrCompCdLessThanEqual;
    }

    /**
     * rcvOdrCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCdLikeFront
     */
    public String getRcvOdrCompCdLikeFront() {
        return rcvOdrCompCdLikeFront;
    }

    /**
     * rcvOdrCompCdLikeFront のセッターメソッドです。
     * 
     * @param rcvOdrCompCdLikeFront rcvOdrCompCdLikeFront に設定する
     */
    public void setRcvOdrCompCdLikeFront(String rcvOdrCompCdLikeFront) {
        this.rcvOdrCompCdLikeFront = rcvOdrCompCdLikeFront;
    }

    /**
     * customerSubsidiaryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the customerSubsidiaryCdGreaterThan
     */
    public String getCustomerSubsidiaryCdGreaterThan() {
        return customerSubsidiaryCdGreaterThan;
    }

    /**
     * customerSubsidiaryCdGreaterThan のセッターメソッドです。
     * 
     * @param customerSubsidiaryCdGreaterThan customerSubsidiaryCdGreaterThan に設定する
     */
    public void setCustomerSubsidiaryCdGreaterThan(String customerSubsidiaryCdGreaterThan) {
        this.customerSubsidiaryCdGreaterThan = customerSubsidiaryCdGreaterThan;
    }

    /**
     * customerSubsidiaryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerSubsidiaryCdGreaterThanEqual
     */
    public String getCustomerSubsidiaryCdGreaterThanEqual() {
        return customerSubsidiaryCdGreaterThanEqual;
    }

    /**
     * customerSubsidiaryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerSubsidiaryCdGreaterThanEqual customerSubsidiaryCdGreaterThanEqual に設定する
     */
    public void setCustomerSubsidiaryCdGreaterThanEqual(String customerSubsidiaryCdGreaterThanEqual) {
        this.customerSubsidiaryCdGreaterThanEqual = customerSubsidiaryCdGreaterThanEqual;
    }

    /**
     * customerSubsidiaryCdLessThan のゲッターメソッドです。
     * 
     * @return the customerSubsidiaryCdLessThan
     */
    public String getCustomerSubsidiaryCdLessThan() {
        return customerSubsidiaryCdLessThan;
    }

    /**
     * customerSubsidiaryCdLessThan のセッターメソッドです。
     * 
     * @param customerSubsidiaryCdLessThan customerSubsidiaryCdLessThan に設定する
     */
    public void setCustomerSubsidiaryCdLessThan(String customerSubsidiaryCdLessThan) {
        this.customerSubsidiaryCdLessThan = customerSubsidiaryCdLessThan;
    }

    /**
     * customerSubsidiaryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerSubsidiaryCdLessThanEqual
     */
    public String getCustomerSubsidiaryCdLessThanEqual() {
        return customerSubsidiaryCdLessThanEqual;
    }

    /**
     * customerSubsidiaryCdLessThanEqual のセッターメソッドです。
     * 
     * @param customerSubsidiaryCdLessThanEqual customerSubsidiaryCdLessThanEqual に設定する
     */
    public void setCustomerSubsidiaryCdLessThanEqual(String customerSubsidiaryCdLessThanEqual) {
        this.customerSubsidiaryCdLessThanEqual = customerSubsidiaryCdLessThanEqual;
    }

    /**
     * customerSubsidiaryCdLikeFront のゲッターメソッドです。
     * 
     * @return the customerSubsidiaryCdLikeFront
     */
    public String getCustomerSubsidiaryCdLikeFront() {
        return customerSubsidiaryCdLikeFront;
    }

    /**
     * customerSubsidiaryCdLikeFront のセッターメソッドです。
     * 
     * @param customerSubsidiaryCdLikeFront customerSubsidiaryCdLikeFront に設定する
     */
    public void setCustomerSubsidiaryCdLikeFront(String customerSubsidiaryCdLikeFront) {
        this.customerSubsidiaryCdLikeFront = customerSubsidiaryCdLikeFront;
    }

    /**
     * transmissionDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the transmissionDtGreaterThanEqual
     */
    public Date getTransmissionDtGreaterThanEqual() {
        return transmissionDtGreaterThanEqual;
    }

    /**
     * transmissionDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param transmissionDtGreaterThanEqual transmissionDtGreaterThanEqual に設定する
     */
    public void setTransmissionDtGreaterThanEqual(Date transmissionDtGreaterThanEqual) {
        this.transmissionDtGreaterThanEqual = transmissionDtGreaterThanEqual;
    }

    /**
     * transmissionDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the transmissionDtLessThanEqual
     */
    public Date getTransmissionDtLessThanEqual() {
        return transmissionDtLessThanEqual;
    }

    /**
     * transmissionDtLessThanEqual のセッターメソッドです。
     * 
     * @param transmissionDtLessThanEqual transmissionDtLessThanEqual に設定する
     */
    public void setTransmissionDtLessThanEqual(Date transmissionDtLessThanEqual) {
        this.transmissionDtLessThanEqual = transmissionDtLessThanEqual;
    }

    /**
     * customerCdGreaterThan のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThan
     */
    public String getCustomerCdGreaterThan() {
        return customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThan のセッターメソッドです。
     * 
     * @param customerCdGreaterThan customerCdGreaterThan に設定する
     */
    public void setCustomerCdGreaterThan(String customerCdGreaterThan) {
        this.customerCdGreaterThan = customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThanEqual
     */
    public String getCustomerCdGreaterThanEqual() {
        return customerCdGreaterThanEqual;
    }

    /**
     * customerCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerCdGreaterThanEqual customerCdGreaterThanEqual に設定する
     */
    public void setCustomerCdGreaterThanEqual(String customerCdGreaterThanEqual) {
        this.customerCdGreaterThanEqual = customerCdGreaterThanEqual;
    }

    /**
     * customerCdLessThan のゲッターメソッドです。
     * 
     * @return the customerCdLessThan
     */
    public String getCustomerCdLessThan() {
        return customerCdLessThan;
    }

    /**
     * customerCdLessThan のセッターメソッドです。
     * 
     * @param customerCdLessThan customerCdLessThan に設定する
     */
    public void setCustomerCdLessThan(String customerCdLessThan) {
        this.customerCdLessThan = customerCdLessThan;
    }

    /**
     * customerCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdLessThanEqual
     */
    public String getCustomerCdLessThanEqual() {
        return customerCdLessThanEqual;
    }

    /**
     * customerCdLessThanEqual のセッターメソッドです。
     * 
     * @param customerCdLessThanEqual customerCdLessThanEqual に設定する
     */
    public void setCustomerCdLessThanEqual(String customerCdLessThanEqual) {
        this.customerCdLessThanEqual = customerCdLessThanEqual;
    }

    /**
     * customerCdLikeFront のゲッターメソッドです。
     * 
     * @return the customerCdLikeFront
     */
    public String getCustomerCdLikeFront() {
        return customerCdLikeFront;
    }

    /**
     * customerCdLikeFront のセッターメソッドです。
     * 
     * @param customerCdLikeFront customerCdLikeFront に設定する
     */
    public void setCustomerCdLikeFront(String customerCdLikeFront) {
        this.customerCdLikeFront = customerCdLikeFront;
    }

    /**
     * lgcyShipToGreaterThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThan
     */
    public String getLgcyShipToGreaterThan() {
        return lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThan のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThan lgcyShipToGreaterThan に設定する
     */
    public void setLgcyShipToGreaterThan(String lgcyShipToGreaterThan) {
        this.lgcyShipToGreaterThan = lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThanEqual
     */
    public String getLgcyShipToGreaterThanEqual() {
        return lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToGreaterThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThanEqual lgcyShipToGreaterThanEqual に設定する
     */
    public void setLgcyShipToGreaterThanEqual(String lgcyShipToGreaterThanEqual) {
        this.lgcyShipToGreaterThanEqual = lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToLessThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThan
     */
    public String getLgcyShipToLessThan() {
        return lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThan のセッターメソッドです。
     * 
     * @param lgcyShipToLessThan lgcyShipToLessThan に設定する
     */
    public void setLgcyShipToLessThan(String lgcyShipToLessThan) {
        this.lgcyShipToLessThan = lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThanEqual
     */
    public String getLgcyShipToLessThanEqual() {
        return lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLessThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToLessThanEqual lgcyShipToLessThanEqual に設定する
     */
    public void setLgcyShipToLessThanEqual(String lgcyShipToLessThanEqual) {
        this.lgcyShipToLessThanEqual = lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLikeFront のゲッターメソッドです。
     * 
     * @return the lgcyShipToLikeFront
     */
    public String getLgcyShipToLikeFront() {
        return lgcyShipToLikeFront;
    }

    /**
     * lgcyShipToLikeFront のセッターメソッドです。
     * 
     * @param lgcyShipToLikeFront lgcyShipToLikeFront に設定する
     */
    public void setLgcyShipToLikeFront(String lgcyShipToLikeFront) {
        this.lgcyShipToLikeFront = lgcyShipToLikeFront;
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

}

