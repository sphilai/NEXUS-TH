/*
 * PROJECT：eca0027
 * 
 * TtShippingFirm の検索条件Domainクラス
 * テーブル概要：TT_SHIPPING_FIRM
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
import java.sql.Timestamp;

/**
 * TtShippingFirm の検索条件Domainクラスです。<BR>
 * テーブル概要：TT_SHIPPING_FIRM<BR>
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
public class TtShippingFirmCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPING_FIRM_NO
     */
    private String shippingFirmNo;

    /**
     * STG_ACT_NO
     */
    private String stgActNo;

    /**
     * STG_INSTR_NO
     */
    private String stgInstrNo;

    /**
     * WH_COMP_CD
     */
    private String whCompCd;

    /**
     * WH_CD
     */
    private String whCd;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * TRNS_TYP_CD
     */
    private String trnsTypCd;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * SHIPPING_FIRM_STATUS
     */
    private String shippingFirmStatus;

    /**
     * ETD
     */
    private Date etd;

    /**
     * CARRIER_COMP_CD
     */
    private String carrierCompCd;

    /**
     * CONTAINER_NO
     */
    private String containerNo;

    /**
     * PKG_QTY
     */
    private BigDecimal pkgQty;

    /**
     * GROSS_WEIGHT
     */
    private BigDecimal grossWeight;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * VOLUME
     */
    private BigDecimal volume;

    /**
     * VOLUME_UNIT
     */
    private String volumeUnit;

    /**
     * SHIPPING_FIRM_DT
     */
    private Date shippingFirmDt;

    /**
     * SHIPPING_FIRM_ISSUER_ID
     */
    private String shippingFirmIssuerId;

    /**
     * SHIPPING_FIRM_ISSUER_NM
     */
    private String shippingFirmIssuerNm;

    /**
     * WORKED_DT
     */
    private Date workedDt;

    /**
     * WORKED_ISSUER_ID
     */
    private String workedIssuerId;

    /**
     * WORKED_ISSUER_NM
     */
    private String workedIssuerNm;

    /**
     * WORKED_METH_TYP
     */
    private String workedMethTyp;

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
     * SHIPPING_FIRM_NO（大なり）
     */
    private String shippingFirmNoGreaterThan;

    /**
     * SHIPPING_FIRM_NO（大なりイコール）
     */
    private String shippingFirmNoGreaterThanEqual;

    /**
     * SHIPPING_FIRM_NO（小なり）
     */
    private String shippingFirmNoLessThan;

    /**
     * SHIPPING_FIRM_NO（小なりイコール）
     */
    private String shippingFirmNoLessThanEqual;

    /**
     * SHIPPING_FIRM_NO（前方一致）
     */
    private String shippingFirmNoLikeFront;

    /**
     * STG_ACT_NO（大なり）
     */
    private String stgActNoGreaterThan;

    /**
     * STG_ACT_NO（大なりイコール）
     */
    private String stgActNoGreaterThanEqual;

    /**
     * STG_ACT_NO（小なり）
     */
    private String stgActNoLessThan;

    /**
     * STG_ACT_NO（小なりイコール）
     */
    private String stgActNoLessThanEqual;

    /**
     * STG_ACT_NO（前方一致）
     */
    private String stgActNoLikeFront;

    /**
     * STG_INSTR_NO（大なり）
     */
    private String stgInstrNoGreaterThan;

    /**
     * STG_INSTR_NO（大なりイコール）
     */
    private String stgInstrNoGreaterThanEqual;

    /**
     * STG_INSTR_NO（小なり）
     */
    private String stgInstrNoLessThan;

    /**
     * STG_INSTR_NO（小なりイコール）
     */
    private String stgInstrNoLessThanEqual;

    /**
     * STG_INSTR_NO（前方一致）
     */
    private String stgInstrNoLikeFront;

    /**
     * WH_COMP_CD（大なり）
     */
    private String whCompCdGreaterThan;

    /**
     * WH_COMP_CD（大なりイコール）
     */
    private String whCompCdGreaterThanEqual;

    /**
     * WH_COMP_CD（小なり）
     */
    private String whCompCdLessThan;

    /**
     * WH_COMP_CD（小なりイコール）
     */
    private String whCompCdLessThanEqual;

    /**
     * WH_COMP_CD（前方一致）
     */
    private String whCompCdLikeFront;

    /**
     * WH_CD（大なり）
     */
    private String whCdGreaterThan;

    /**
     * WH_CD（大なりイコール）
     */
    private String whCdGreaterThanEqual;

    /**
     * WH_CD（小なり）
     */
    private String whCdLessThan;

    /**
     * WH_CD（小なりイコール）
     */
    private String whCdLessThanEqual;

    /**
     * WH_CD（前方一致）
     */
    private String whCdLikeFront;

    /**
     * TRNS_CD（大なり）
     */
    private String trnsCdGreaterThan;

    /**
     * TRNS_CD（大なりイコール）
     */
    private String trnsCdGreaterThanEqual;

    /**
     * TRNS_CD（小なり）
     */
    private String trnsCdLessThan;

    /**
     * TRNS_CD（小なりイコール）
     */
    private String trnsCdLessThanEqual;

    /**
     * TRNS_CD（前方一致）
     */
    private String trnsCdLikeFront;

    /**
     * TRNS_TYP_CD（大なり）
     */
    private String trnsTypCdGreaterThan;

    /**
     * TRNS_TYP_CD（大なりイコール）
     */
    private String trnsTypCdGreaterThanEqual;

    /**
     * TRNS_TYP_CD（小なり）
     */
    private String trnsTypCdLessThan;

    /**
     * TRNS_TYP_CD（小なりイコール）
     */
    private String trnsTypCdLessThanEqual;

    /**
     * TRNS_TYP_CD（前方一致）
     */
    private String trnsTypCdLikeFront;

    /**
     * CONTAINER_SORTING_KEY（大なり）
     */
    private String containerSortingKeyGreaterThan;

    /**
     * CONTAINER_SORTING_KEY（大なりイコール）
     */
    private String containerSortingKeyGreaterThanEqual;

    /**
     * CONTAINER_SORTING_KEY（小なり）
     */
    private String containerSortingKeyLessThan;

    /**
     * CONTAINER_SORTING_KEY（小なりイコール）
     */
    private String containerSortingKeyLessThanEqual;

    /**
     * CONTAINER_SORTING_KEY（前方一致）
     */
    private String containerSortingKeyLikeFront;

    /**
     * CONTAINER_LOOSE_TYP（大なり）
     */
    private String containerLooseTypGreaterThan;

    /**
     * CONTAINER_LOOSE_TYP（大なりイコール）
     */
    private String containerLooseTypGreaterThanEqual;

    /**
     * CONTAINER_LOOSE_TYP（小なり）
     */
    private String containerLooseTypLessThan;

    /**
     * CONTAINER_LOOSE_TYP（小なりイコール）
     */
    private String containerLooseTypLessThanEqual;

    /**
     * CONTAINER_LOOSE_TYP（前方一致）
     */
    private String containerLooseTypLikeFront;

    /**
     * SHIPPING_FIRM_STATUS（大なり）
     */
    private String shippingFirmStatusGreaterThan;

    /**
     * SHIPPING_FIRM_STATUS（大なりイコール）
     */
    private String shippingFirmStatusGreaterThanEqual;

    /**
     * SHIPPING_FIRM_STATUS（小なり）
     */
    private String shippingFirmStatusLessThan;

    /**
     * SHIPPING_FIRM_STATUS（小なりイコール）
     */
    private String shippingFirmStatusLessThanEqual;

    /**
     * SHIPPING_FIRM_STATUS（前方一致）
     */
    private String shippingFirmStatusLikeFront;

    /**
     * ETD（大なりイコール）
     */
    private Date etdGreaterThanEqual;

    /**
     * ETD（小なりイコール）
     */
    private Date etdLessThanEqual;

    /**
     * CARRIER_COMP_CD（大なり）
     */
    private String carrierCompCdGreaterThan;

    /**
     * CARRIER_COMP_CD（大なりイコール）
     */
    private String carrierCompCdGreaterThanEqual;

    /**
     * CARRIER_COMP_CD（小なり）
     */
    private String carrierCompCdLessThan;

    /**
     * CARRIER_COMP_CD（小なりイコール）
     */
    private String carrierCompCdLessThanEqual;

    /**
     * CARRIER_COMP_CD（前方一致）
     */
    private String carrierCompCdLikeFront;

    /**
     * CONTAINER_NO（大なり）
     */
    private String containerNoGreaterThan;

    /**
     * CONTAINER_NO（大なりイコール）
     */
    private String containerNoGreaterThanEqual;

    /**
     * CONTAINER_NO（小なり）
     */
    private String containerNoLessThan;

    /**
     * CONTAINER_NO（小なりイコール）
     */
    private String containerNoLessThanEqual;

    /**
     * CONTAINER_NO（前方一致）
     */
    private String containerNoLikeFront;

    /**
     * WEIGHT_UNIT（大なり）
     */
    private String weightUnitGreaterThan;

    /**
     * WEIGHT_UNIT（大なりイコール）
     */
    private String weightUnitGreaterThanEqual;

    /**
     * WEIGHT_UNIT（小なり）
     */
    private String weightUnitLessThan;

    /**
     * WEIGHT_UNIT（小なりイコール）
     */
    private String weightUnitLessThanEqual;

    /**
     * WEIGHT_UNIT（前方一致）
     */
    private String weightUnitLikeFront;

    /**
     * VOLUME_UNIT（大なり）
     */
    private String volumeUnitGreaterThan;

    /**
     * VOLUME_UNIT（大なりイコール）
     */
    private String volumeUnitGreaterThanEqual;

    /**
     * VOLUME_UNIT（小なり）
     */
    private String volumeUnitLessThan;

    /**
     * VOLUME_UNIT（小なりイコール）
     */
    private String volumeUnitLessThanEqual;

    /**
     * VOLUME_UNIT（前方一致）
     */
    private String volumeUnitLikeFront;

    /**
     * SHIPPING_FIRM_DT（大なりイコール）
     */
    private Date shippingFirmDtGreaterThanEqual;

    /**
     * SHIPPING_FIRM_DT（小なりイコール）
     */
    private Date shippingFirmDtLessThanEqual;

    /**
     * SHIPPING_FIRM_ISSUER_ID（大なり）
     */
    private String shippingFirmIssuerIdGreaterThan;

    /**
     * SHIPPING_FIRM_ISSUER_ID（大なりイコール）
     */
    private String shippingFirmIssuerIdGreaterThanEqual;

    /**
     * SHIPPING_FIRM_ISSUER_ID（小なり）
     */
    private String shippingFirmIssuerIdLessThan;

    /**
     * SHIPPING_FIRM_ISSUER_ID（小なりイコール）
     */
    private String shippingFirmIssuerIdLessThanEqual;

    /**
     * SHIPPING_FIRM_ISSUER_ID（前方一致）
     */
    private String shippingFirmIssuerIdLikeFront;

    /**
     * SHIPPING_FIRM_ISSUER_NM（大なり）
     */
    private String shippingFirmIssuerNmGreaterThan;

    /**
     * SHIPPING_FIRM_ISSUER_NM（大なりイコール）
     */
    private String shippingFirmIssuerNmGreaterThanEqual;

    /**
     * SHIPPING_FIRM_ISSUER_NM（小なり）
     */
    private String shippingFirmIssuerNmLessThan;

    /**
     * SHIPPING_FIRM_ISSUER_NM（小なりイコール）
     */
    private String shippingFirmIssuerNmLessThanEqual;

    /**
     * SHIPPING_FIRM_ISSUER_NM（前方一致）
     */
    private String shippingFirmIssuerNmLikeFront;

    /**
     * WORKED_DT（大なりイコール）
     */
    private Date workedDtGreaterThanEqual;

    /**
     * WORKED_DT（小なりイコール）
     */
    private Date workedDtLessThanEqual;

    /**
     * WORKED_ISSUER_ID（大なり）
     */
    private String workedIssuerIdGreaterThan;

    /**
     * WORKED_ISSUER_ID（大なりイコール）
     */
    private String workedIssuerIdGreaterThanEqual;

    /**
     * WORKED_ISSUER_ID（小なり）
     */
    private String workedIssuerIdLessThan;

    /**
     * WORKED_ISSUER_ID（小なりイコール）
     */
    private String workedIssuerIdLessThanEqual;

    /**
     * WORKED_ISSUER_ID（前方一致）
     */
    private String workedIssuerIdLikeFront;

    /**
     * WORKED_ISSUER_NM（大なり）
     */
    private String workedIssuerNmGreaterThan;

    /**
     * WORKED_ISSUER_NM（大なりイコール）
     */
    private String workedIssuerNmGreaterThanEqual;

    /**
     * WORKED_ISSUER_NM（小なり）
     */
    private String workedIssuerNmLessThan;

    /**
     * WORKED_ISSUER_NM（小なりイコール）
     */
    private String workedIssuerNmLessThanEqual;

    /**
     * WORKED_ISSUER_NM（前方一致）
     */
    private String workedIssuerNmLikeFront;

    /**
     * WORKED_METH_TYP（大なり）
     */
    private String workedMethTypGreaterThan;

    /**
     * WORKED_METH_TYP（大なりイコール）
     */
    private String workedMethTypGreaterThanEqual;

    /**
     * WORKED_METH_TYP（小なり）
     */
    private String workedMethTypLessThan;

    /**
     * WORKED_METH_TYP（小なりイコール）
     */
    private String workedMethTypLessThanEqual;

    /**
     * WORKED_METH_TYP（前方一致）
     */
    private String workedMethTypLikeFront;

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
    public TtShippingFirmCriteriaDomain() {
    }

    /**
     * shippingFirmNo のゲッターメソッドです。
     * 
     * @return the shippingFirmNo
     */
    public String getShippingFirmNo() {
        return shippingFirmNo;
    }

    /**
     * shippingFirmNo のセッターメソッドです。
     * 
     * @param shippingFirmNo shippingFirmNo に設定する
     */
    public void setShippingFirmNo(String shippingFirmNo) {
        this.shippingFirmNo = shippingFirmNo;
    }

    /**
     * stgActNo のゲッターメソッドです。
     * 
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * stgActNo のセッターメソッドです。
     * 
     * @param stgActNo stgActNo に設定する
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }

    /**
     * stgInstrNo のゲッターメソッドです。
     * 
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * stgInstrNo のセッターメソッドです。
     * 
     * @param stgInstrNo stgInstrNo に設定する
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * whCompCd のゲッターメソッドです。
     * 
     * @return the whCompCd
     */
    public String getWhCompCd() {
        return whCompCd;
    }

    /**
     * whCompCd のセッターメソッドです。
     * 
     * @param whCompCd whCompCd に設定する
     */
    public void setWhCompCd(String whCompCd) {
        this.whCompCd = whCompCd;
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
     * trnsCd のゲッターメソッドです。
     * 
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * trnsCd のセッターメソッドです。
     * 
     * @param trnsCd trnsCd に設定する
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * trnsTypCd のゲッターメソッドです。
     * 
     * @return the trnsTypCd
     */
    public String getTrnsTypCd() {
        return trnsTypCd;
    }

    /**
     * trnsTypCd のセッターメソッドです。
     * 
     * @param trnsTypCd trnsTypCd に設定する
     */
    public void setTrnsTypCd(String trnsTypCd) {
        this.trnsTypCd = trnsTypCd;
    }

    /**
     * containerSortingKey のゲッターメソッドです。
     * 
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * containerSortingKey のセッターメソッドです。
     * 
     * @param containerSortingKey containerSortingKey に設定する
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * containerLooseTyp のゲッターメソッドです。
     * 
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * containerLooseTyp のセッターメソッドです。
     * 
     * @param containerLooseTyp containerLooseTyp に設定する
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * shippingFirmStatus のゲッターメソッドです。
     * 
     * @return the shippingFirmStatus
     */
    public String getShippingFirmStatus() {
        return shippingFirmStatus;
    }

    /**
     * shippingFirmStatus のセッターメソッドです。
     * 
     * @param shippingFirmStatus shippingFirmStatus に設定する
     */
    public void setShippingFirmStatus(String shippingFirmStatus) {
        this.shippingFirmStatus = shippingFirmStatus;
    }

    /**
     * etd のゲッターメソッドです。
     * 
     * @return the etd
     */
    public Date getEtd() {
        return etd;
    }

    /**
     * etd のセッターメソッドです。
     * 
     * @param etd etd に設定する
     */
    public void setEtd(Date etd) {
        this.etd = etd;
    }

    /**
     * carrierCompCd のゲッターメソッドです。
     * 
     * @return the carrierCompCd
     */
    public String getCarrierCompCd() {
        return carrierCompCd;
    }

    /**
     * carrierCompCd のセッターメソッドです。
     * 
     * @param carrierCompCd carrierCompCd に設定する
     */
    public void setCarrierCompCd(String carrierCompCd) {
        this.carrierCompCd = carrierCompCd;
    }

    /**
     * containerNo のゲッターメソッドです。
     * 
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }

    /**
     * containerNo のセッターメソッドです。
     * 
     * @param containerNo containerNo に設定する
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    /**
     * pkgQty のゲッターメソッドです。
     * 
     * @return the pkgQty
     */
    public BigDecimal getPkgQty() {
        return pkgQty;
    }

    /**
     * pkgQty のセッターメソッドです。
     * 
     * @param pkgQty pkgQty に設定する
     */
    public void setPkgQty(BigDecimal pkgQty) {
        this.pkgQty = pkgQty;
    }

    /**
     * grossWeight のゲッターメソッドです。
     * 
     * @return the grossWeight
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * grossWeight のセッターメソッドです。
     * 
     * @param grossWeight grossWeight に設定する
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * weightUnit のゲッターメソッドです。
     * 
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * weightUnit のセッターメソッドです。
     * 
     * @param weightUnit weightUnit に設定する
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * volume のゲッターメソッドです。
     * 
     * @return the volume
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * volume のセッターメソッドです。
     * 
     * @param volume volume に設定する
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * volumeUnit のゲッターメソッドです。
     * 
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * volumeUnit のセッターメソッドです。
     * 
     * @param volumeUnit volumeUnit に設定する
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    /**
     * shippingFirmDt のゲッターメソッドです。
     * 
     * @return the shippingFirmDt
     */
    public Date getShippingFirmDt() {
        return shippingFirmDt;
    }

    /**
     * shippingFirmDt のセッターメソッドです。
     * 
     * @param shippingFirmDt shippingFirmDt に設定する
     */
    public void setShippingFirmDt(Date shippingFirmDt) {
        this.shippingFirmDt = shippingFirmDt;
    }

    /**
     * shippingFirmIssuerId のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerId
     */
    public String getShippingFirmIssuerId() {
        return shippingFirmIssuerId;
    }

    /**
     * shippingFirmIssuerId のセッターメソッドです。
     * 
     * @param shippingFirmIssuerId shippingFirmIssuerId に設定する
     */
    public void setShippingFirmIssuerId(String shippingFirmIssuerId) {
        this.shippingFirmIssuerId = shippingFirmIssuerId;
    }

    /**
     * shippingFirmIssuerNm のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerNm
     */
    public String getShippingFirmIssuerNm() {
        return shippingFirmIssuerNm;
    }

    /**
     * shippingFirmIssuerNm のセッターメソッドです。
     * 
     * @param shippingFirmIssuerNm shippingFirmIssuerNm に設定する
     */
    public void setShippingFirmIssuerNm(String shippingFirmIssuerNm) {
        this.shippingFirmIssuerNm = shippingFirmIssuerNm;
    }

    /**
     * workedDt のゲッターメソッドです。
     * 
     * @return the workedDt
     */
    public Date getWorkedDt() {
        return workedDt;
    }

    /**
     * workedDt のセッターメソッドです。
     * 
     * @param workedDt workedDt に設定する
     */
    public void setWorkedDt(Date workedDt) {
        this.workedDt = workedDt;
    }

    /**
     * workedIssuerId のゲッターメソッドです。
     * 
     * @return the workedIssuerId
     */
    public String getWorkedIssuerId() {
        return workedIssuerId;
    }

    /**
     * workedIssuerId のセッターメソッドです。
     * 
     * @param workedIssuerId workedIssuerId に設定する
     */
    public void setWorkedIssuerId(String workedIssuerId) {
        this.workedIssuerId = workedIssuerId;
    }

    /**
     * workedIssuerNm のゲッターメソッドです。
     * 
     * @return the workedIssuerNm
     */
    public String getWorkedIssuerNm() {
        return workedIssuerNm;
    }

    /**
     * workedIssuerNm のセッターメソッドです。
     * 
     * @param workedIssuerNm workedIssuerNm に設定する
     */
    public void setWorkedIssuerNm(String workedIssuerNm) {
        this.workedIssuerNm = workedIssuerNm;
    }

    /**
     * workedMethTyp のゲッターメソッドです。
     * 
     * @return the workedMethTyp
     */
    public String getWorkedMethTyp() {
        return workedMethTyp;
    }

    /**
     * workedMethTyp のセッターメソッドです。
     * 
     * @param workedMethTyp workedMethTyp に設定する
     */
    public void setWorkedMethTyp(String workedMethTyp) {
        this.workedMethTyp = workedMethTyp;
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
     * shippingFirmNoGreaterThan のゲッターメソッドです。
     * 
     * @return the shippingFirmNoGreaterThan
     */
    public String getShippingFirmNoGreaterThan() {
        return shippingFirmNoGreaterThan;
    }

    /**
     * shippingFirmNoGreaterThan のセッターメソッドです。
     * 
     * @param shippingFirmNoGreaterThan shippingFirmNoGreaterThan に設定する
     */
    public void setShippingFirmNoGreaterThan(String shippingFirmNoGreaterThan) {
        this.shippingFirmNoGreaterThan = shippingFirmNoGreaterThan;
    }

    /**
     * shippingFirmNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmNoGreaterThanEqual
     */
    public String getShippingFirmNoGreaterThanEqual() {
        return shippingFirmNoGreaterThanEqual;
    }

    /**
     * shippingFirmNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmNoGreaterThanEqual shippingFirmNoGreaterThanEqual に設定する
     */
    public void setShippingFirmNoGreaterThanEqual(String shippingFirmNoGreaterThanEqual) {
        this.shippingFirmNoGreaterThanEqual = shippingFirmNoGreaterThanEqual;
    }

    /**
     * shippingFirmNoLessThan のゲッターメソッドです。
     * 
     * @return the shippingFirmNoLessThan
     */
    public String getShippingFirmNoLessThan() {
        return shippingFirmNoLessThan;
    }

    /**
     * shippingFirmNoLessThan のセッターメソッドです。
     * 
     * @param shippingFirmNoLessThan shippingFirmNoLessThan に設定する
     */
    public void setShippingFirmNoLessThan(String shippingFirmNoLessThan) {
        this.shippingFirmNoLessThan = shippingFirmNoLessThan;
    }

    /**
     * shippingFirmNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmNoLessThanEqual
     */
    public String getShippingFirmNoLessThanEqual() {
        return shippingFirmNoLessThanEqual;
    }

    /**
     * shippingFirmNoLessThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmNoLessThanEqual shippingFirmNoLessThanEqual に設定する
     */
    public void setShippingFirmNoLessThanEqual(String shippingFirmNoLessThanEqual) {
        this.shippingFirmNoLessThanEqual = shippingFirmNoLessThanEqual;
    }

    /**
     * shippingFirmNoLikeFront のゲッターメソッドです。
     * 
     * @return the shippingFirmNoLikeFront
     */
    public String getShippingFirmNoLikeFront() {
        return shippingFirmNoLikeFront;
    }

    /**
     * shippingFirmNoLikeFront のセッターメソッドです。
     * 
     * @param shippingFirmNoLikeFront shippingFirmNoLikeFront に設定する
     */
    public void setShippingFirmNoLikeFront(String shippingFirmNoLikeFront) {
        this.shippingFirmNoLikeFront = shippingFirmNoLikeFront;
    }

    /**
     * stgActNoGreaterThan のゲッターメソッドです。
     * 
     * @return the stgActNoGreaterThan
     */
    public String getStgActNoGreaterThan() {
        return stgActNoGreaterThan;
    }

    /**
     * stgActNoGreaterThan のセッターメソッドです。
     * 
     * @param stgActNoGreaterThan stgActNoGreaterThan に設定する
     */
    public void setStgActNoGreaterThan(String stgActNoGreaterThan) {
        this.stgActNoGreaterThan = stgActNoGreaterThan;
    }

    /**
     * stgActNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgActNoGreaterThanEqual
     */
    public String getStgActNoGreaterThanEqual() {
        return stgActNoGreaterThanEqual;
    }

    /**
     * stgActNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgActNoGreaterThanEqual stgActNoGreaterThanEqual に設定する
     */
    public void setStgActNoGreaterThanEqual(String stgActNoGreaterThanEqual) {
        this.stgActNoGreaterThanEqual = stgActNoGreaterThanEqual;
    }

    /**
     * stgActNoLessThan のゲッターメソッドです。
     * 
     * @return the stgActNoLessThan
     */
    public String getStgActNoLessThan() {
        return stgActNoLessThan;
    }

    /**
     * stgActNoLessThan のセッターメソッドです。
     * 
     * @param stgActNoLessThan stgActNoLessThan に設定する
     */
    public void setStgActNoLessThan(String stgActNoLessThan) {
        this.stgActNoLessThan = stgActNoLessThan;
    }

    /**
     * stgActNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgActNoLessThanEqual
     */
    public String getStgActNoLessThanEqual() {
        return stgActNoLessThanEqual;
    }

    /**
     * stgActNoLessThanEqual のセッターメソッドです。
     * 
     * @param stgActNoLessThanEqual stgActNoLessThanEqual に設定する
     */
    public void setStgActNoLessThanEqual(String stgActNoLessThanEqual) {
        this.stgActNoLessThanEqual = stgActNoLessThanEqual;
    }

    /**
     * stgActNoLikeFront のゲッターメソッドです。
     * 
     * @return the stgActNoLikeFront
     */
    public String getStgActNoLikeFront() {
        return stgActNoLikeFront;
    }

    /**
     * stgActNoLikeFront のセッターメソッドです。
     * 
     * @param stgActNoLikeFront stgActNoLikeFront に設定する
     */
    public void setStgActNoLikeFront(String stgActNoLikeFront) {
        this.stgActNoLikeFront = stgActNoLikeFront;
    }

    /**
     * stgInstrNoGreaterThan のゲッターメソッドです。
     * 
     * @return the stgInstrNoGreaterThan
     */
    public String getStgInstrNoGreaterThan() {
        return stgInstrNoGreaterThan;
    }

    /**
     * stgInstrNoGreaterThan のセッターメソッドです。
     * 
     * @param stgInstrNoGreaterThan stgInstrNoGreaterThan に設定する
     */
    public void setStgInstrNoGreaterThan(String stgInstrNoGreaterThan) {
        this.stgInstrNoGreaterThan = stgInstrNoGreaterThan;
    }

    /**
     * stgInstrNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrNoGreaterThanEqual
     */
    public String getStgInstrNoGreaterThanEqual() {
        return stgInstrNoGreaterThanEqual;
    }

    /**
     * stgInstrNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgInstrNoGreaterThanEqual stgInstrNoGreaterThanEqual に設定する
     */
    public void setStgInstrNoGreaterThanEqual(String stgInstrNoGreaterThanEqual) {
        this.stgInstrNoGreaterThanEqual = stgInstrNoGreaterThanEqual;
    }

    /**
     * stgInstrNoLessThan のゲッターメソッドです。
     * 
     * @return the stgInstrNoLessThan
     */
    public String getStgInstrNoLessThan() {
        return stgInstrNoLessThan;
    }

    /**
     * stgInstrNoLessThan のセッターメソッドです。
     * 
     * @param stgInstrNoLessThan stgInstrNoLessThan に設定する
     */
    public void setStgInstrNoLessThan(String stgInstrNoLessThan) {
        this.stgInstrNoLessThan = stgInstrNoLessThan;
    }

    /**
     * stgInstrNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrNoLessThanEqual
     */
    public String getStgInstrNoLessThanEqual() {
        return stgInstrNoLessThanEqual;
    }

    /**
     * stgInstrNoLessThanEqual のセッターメソッドです。
     * 
     * @param stgInstrNoLessThanEqual stgInstrNoLessThanEqual に設定する
     */
    public void setStgInstrNoLessThanEqual(String stgInstrNoLessThanEqual) {
        this.stgInstrNoLessThanEqual = stgInstrNoLessThanEqual;
    }

    /**
     * stgInstrNoLikeFront のゲッターメソッドです。
     * 
     * @return the stgInstrNoLikeFront
     */
    public String getStgInstrNoLikeFront() {
        return stgInstrNoLikeFront;
    }

    /**
     * stgInstrNoLikeFront のセッターメソッドです。
     * 
     * @param stgInstrNoLikeFront stgInstrNoLikeFront に設定する
     */
    public void setStgInstrNoLikeFront(String stgInstrNoLikeFront) {
        this.stgInstrNoLikeFront = stgInstrNoLikeFront;
    }

    /**
     * whCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the whCompCdGreaterThan
     */
    public String getWhCompCdGreaterThan() {
        return whCompCdGreaterThan;
    }

    /**
     * whCompCdGreaterThan のセッターメソッドです。
     * 
     * @param whCompCdGreaterThan whCompCdGreaterThan に設定する
     */
    public void setWhCompCdGreaterThan(String whCompCdGreaterThan) {
        this.whCompCdGreaterThan = whCompCdGreaterThan;
    }

    /**
     * whCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the whCompCdGreaterThanEqual
     */
    public String getWhCompCdGreaterThanEqual() {
        return whCompCdGreaterThanEqual;
    }

    /**
     * whCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param whCompCdGreaterThanEqual whCompCdGreaterThanEqual に設定する
     */
    public void setWhCompCdGreaterThanEqual(String whCompCdGreaterThanEqual) {
        this.whCompCdGreaterThanEqual = whCompCdGreaterThanEqual;
    }

    /**
     * whCompCdLessThan のゲッターメソッドです。
     * 
     * @return the whCompCdLessThan
     */
    public String getWhCompCdLessThan() {
        return whCompCdLessThan;
    }

    /**
     * whCompCdLessThan のセッターメソッドです。
     * 
     * @param whCompCdLessThan whCompCdLessThan に設定する
     */
    public void setWhCompCdLessThan(String whCompCdLessThan) {
        this.whCompCdLessThan = whCompCdLessThan;
    }

    /**
     * whCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the whCompCdLessThanEqual
     */
    public String getWhCompCdLessThanEqual() {
        return whCompCdLessThanEqual;
    }

    /**
     * whCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param whCompCdLessThanEqual whCompCdLessThanEqual に設定する
     */
    public void setWhCompCdLessThanEqual(String whCompCdLessThanEqual) {
        this.whCompCdLessThanEqual = whCompCdLessThanEqual;
    }

    /**
     * whCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the whCompCdLikeFront
     */
    public String getWhCompCdLikeFront() {
        return whCompCdLikeFront;
    }

    /**
     * whCompCdLikeFront のセッターメソッドです。
     * 
     * @param whCompCdLikeFront whCompCdLikeFront に設定する
     */
    public void setWhCompCdLikeFront(String whCompCdLikeFront) {
        this.whCompCdLikeFront = whCompCdLikeFront;
    }

    /**
     * whCdGreaterThan のゲッターメソッドです。
     * 
     * @return the whCdGreaterThan
     */
    public String getWhCdGreaterThan() {
        return whCdGreaterThan;
    }

    /**
     * whCdGreaterThan のセッターメソッドです。
     * 
     * @param whCdGreaterThan whCdGreaterThan に設定する
     */
    public void setWhCdGreaterThan(String whCdGreaterThan) {
        this.whCdGreaterThan = whCdGreaterThan;
    }

    /**
     * whCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the whCdGreaterThanEqual
     */
    public String getWhCdGreaterThanEqual() {
        return whCdGreaterThanEqual;
    }

    /**
     * whCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param whCdGreaterThanEqual whCdGreaterThanEqual に設定する
     */
    public void setWhCdGreaterThanEqual(String whCdGreaterThanEqual) {
        this.whCdGreaterThanEqual = whCdGreaterThanEqual;
    }

    /**
     * whCdLessThan のゲッターメソッドです。
     * 
     * @return the whCdLessThan
     */
    public String getWhCdLessThan() {
        return whCdLessThan;
    }

    /**
     * whCdLessThan のセッターメソッドです。
     * 
     * @param whCdLessThan whCdLessThan に設定する
     */
    public void setWhCdLessThan(String whCdLessThan) {
        this.whCdLessThan = whCdLessThan;
    }

    /**
     * whCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the whCdLessThanEqual
     */
    public String getWhCdLessThanEqual() {
        return whCdLessThanEqual;
    }

    /**
     * whCdLessThanEqual のセッターメソッドです。
     * 
     * @param whCdLessThanEqual whCdLessThanEqual に設定する
     */
    public void setWhCdLessThanEqual(String whCdLessThanEqual) {
        this.whCdLessThanEqual = whCdLessThanEqual;
    }

    /**
     * whCdLikeFront のゲッターメソッドです。
     * 
     * @return the whCdLikeFront
     */
    public String getWhCdLikeFront() {
        return whCdLikeFront;
    }

    /**
     * whCdLikeFront のセッターメソッドです。
     * 
     * @param whCdLikeFront whCdLikeFront に設定する
     */
    public void setWhCdLikeFront(String whCdLikeFront) {
        this.whCdLikeFront = whCdLikeFront;
    }

    /**
     * trnsCdGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThan
     */
    public String getTrnsCdGreaterThan() {
        return trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThan のセッターメソッドです。
     * 
     * @param trnsCdGreaterThan trnsCdGreaterThan に設定する
     */
    public void setTrnsCdGreaterThan(String trnsCdGreaterThan) {
        this.trnsCdGreaterThan = trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThanEqual
     */
    public String getTrnsCdGreaterThanEqual() {
        return trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsCdGreaterThanEqual trnsCdGreaterThanEqual に設定する
     */
    public void setTrnsCdGreaterThanEqual(String trnsCdGreaterThanEqual) {
        this.trnsCdGreaterThanEqual = trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdLessThan のゲッターメソッドです。
     * 
     * @return the trnsCdLessThan
     */
    public String getTrnsCdLessThan() {
        return trnsCdLessThan;
    }

    /**
     * trnsCdLessThan のセッターメソッドです。
     * 
     * @param trnsCdLessThan trnsCdLessThan に設定する
     */
    public void setTrnsCdLessThan(String trnsCdLessThan) {
        this.trnsCdLessThan = trnsCdLessThan;
    }

    /**
     * trnsCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdLessThanEqual
     */
    public String getTrnsCdLessThanEqual() {
        return trnsCdLessThanEqual;
    }

    /**
     * trnsCdLessThanEqual のセッターメソッドです。
     * 
     * @param trnsCdLessThanEqual trnsCdLessThanEqual に設定する
     */
    public void setTrnsCdLessThanEqual(String trnsCdLessThanEqual) {
        this.trnsCdLessThanEqual = trnsCdLessThanEqual;
    }

    /**
     * trnsCdLikeFront のゲッターメソッドです。
     * 
     * @return the trnsCdLikeFront
     */
    public String getTrnsCdLikeFront() {
        return trnsCdLikeFront;
    }

    /**
     * trnsCdLikeFront のセッターメソッドです。
     * 
     * @param trnsCdLikeFront trnsCdLikeFront に設定する
     */
    public void setTrnsCdLikeFront(String trnsCdLikeFront) {
        this.trnsCdLikeFront = trnsCdLikeFront;
    }

    /**
     * trnsTypCdGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsTypCdGreaterThan
     */
    public String getTrnsTypCdGreaterThan() {
        return trnsTypCdGreaterThan;
    }

    /**
     * trnsTypCdGreaterThan のセッターメソッドです。
     * 
     * @param trnsTypCdGreaterThan trnsTypCdGreaterThan に設定する
     */
    public void setTrnsTypCdGreaterThan(String trnsTypCdGreaterThan) {
        this.trnsTypCdGreaterThan = trnsTypCdGreaterThan;
    }

    /**
     * trnsTypCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsTypCdGreaterThanEqual
     */
    public String getTrnsTypCdGreaterThanEqual() {
        return trnsTypCdGreaterThanEqual;
    }

    /**
     * trnsTypCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsTypCdGreaterThanEqual trnsTypCdGreaterThanEqual に設定する
     */
    public void setTrnsTypCdGreaterThanEqual(String trnsTypCdGreaterThanEqual) {
        this.trnsTypCdGreaterThanEqual = trnsTypCdGreaterThanEqual;
    }

    /**
     * trnsTypCdLessThan のゲッターメソッドです。
     * 
     * @return the trnsTypCdLessThan
     */
    public String getTrnsTypCdLessThan() {
        return trnsTypCdLessThan;
    }

    /**
     * trnsTypCdLessThan のセッターメソッドです。
     * 
     * @param trnsTypCdLessThan trnsTypCdLessThan に設定する
     */
    public void setTrnsTypCdLessThan(String trnsTypCdLessThan) {
        this.trnsTypCdLessThan = trnsTypCdLessThan;
    }

    /**
     * trnsTypCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsTypCdLessThanEqual
     */
    public String getTrnsTypCdLessThanEqual() {
        return trnsTypCdLessThanEqual;
    }

    /**
     * trnsTypCdLessThanEqual のセッターメソッドです。
     * 
     * @param trnsTypCdLessThanEqual trnsTypCdLessThanEqual に設定する
     */
    public void setTrnsTypCdLessThanEqual(String trnsTypCdLessThanEqual) {
        this.trnsTypCdLessThanEqual = trnsTypCdLessThanEqual;
    }

    /**
     * trnsTypCdLikeFront のゲッターメソッドです。
     * 
     * @return the trnsTypCdLikeFront
     */
    public String getTrnsTypCdLikeFront() {
        return trnsTypCdLikeFront;
    }

    /**
     * trnsTypCdLikeFront のセッターメソッドです。
     * 
     * @param trnsTypCdLikeFront trnsTypCdLikeFront に設定する
     */
    public void setTrnsTypCdLikeFront(String trnsTypCdLikeFront) {
        this.trnsTypCdLikeFront = trnsTypCdLikeFront;
    }

    /**
     * containerSortingKeyGreaterThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThan
     */
    public String getContainerSortingKeyGreaterThan() {
        return containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThan のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThan containerSortingKeyGreaterThan に設定する
     */
    public void setContainerSortingKeyGreaterThan(String containerSortingKeyGreaterThan) {
        this.containerSortingKeyGreaterThan = containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThanEqual
     */
    public String getContainerSortingKeyGreaterThanEqual() {
        return containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThanEqual containerSortingKeyGreaterThanEqual に設定する
     */
    public void setContainerSortingKeyGreaterThanEqual(String containerSortingKeyGreaterThanEqual) {
        this.containerSortingKeyGreaterThanEqual = containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyLessThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThan
     */
    public String getContainerSortingKeyLessThan() {
        return containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThan のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThan containerSortingKeyLessThan に設定する
     */
    public void setContainerSortingKeyLessThan(String containerSortingKeyLessThan) {
        this.containerSortingKeyLessThan = containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThanEqual
     */
    public String getContainerSortingKeyLessThanEqual() {
        return containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLessThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThanEqual containerSortingKeyLessThanEqual に設定する
     */
    public void setContainerSortingKeyLessThanEqual(String containerSortingKeyLessThanEqual) {
        this.containerSortingKeyLessThanEqual = containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLikeFront のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLikeFront
     */
    public String getContainerSortingKeyLikeFront() {
        return containerSortingKeyLikeFront;
    }

    /**
     * containerSortingKeyLikeFront のセッターメソッドです。
     * 
     * @param containerSortingKeyLikeFront containerSortingKeyLikeFront に設定する
     */
    public void setContainerSortingKeyLikeFront(String containerSortingKeyLikeFront) {
        this.containerSortingKeyLikeFront = containerSortingKeyLikeFront;
    }

    /**
     * containerLooseTypGreaterThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThan
     */
    public String getContainerLooseTypGreaterThan() {
        return containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThan のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThan containerLooseTypGreaterThan に設定する
     */
    public void setContainerLooseTypGreaterThan(String containerLooseTypGreaterThan) {
        this.containerLooseTypGreaterThan = containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThanEqual
     */
    public String getContainerLooseTypGreaterThanEqual() {
        return containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThanEqual containerLooseTypGreaterThanEqual に設定する
     */
    public void setContainerLooseTypGreaterThanEqual(String containerLooseTypGreaterThanEqual) {
        this.containerLooseTypGreaterThanEqual = containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypLessThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThan
     */
    public String getContainerLooseTypLessThan() {
        return containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThan のセッターメソッドです。
     * 
     * @param containerLooseTypLessThan containerLooseTypLessThan に設定する
     */
    public void setContainerLooseTypLessThan(String containerLooseTypLessThan) {
        this.containerLooseTypLessThan = containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThanEqual
     */
    public String getContainerLooseTypLessThanEqual() {
        return containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLessThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypLessThanEqual containerLooseTypLessThanEqual に設定する
     */
    public void setContainerLooseTypLessThanEqual(String containerLooseTypLessThanEqual) {
        this.containerLooseTypLessThanEqual = containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLikeFront のゲッターメソッドです。
     * 
     * @return the containerLooseTypLikeFront
     */
    public String getContainerLooseTypLikeFront() {
        return containerLooseTypLikeFront;
    }

    /**
     * containerLooseTypLikeFront のセッターメソッドです。
     * 
     * @param containerLooseTypLikeFront containerLooseTypLikeFront に設定する
     */
    public void setContainerLooseTypLikeFront(String containerLooseTypLikeFront) {
        this.containerLooseTypLikeFront = containerLooseTypLikeFront;
    }

    /**
     * shippingFirmStatusGreaterThan のゲッターメソッドです。
     * 
     * @return the shippingFirmStatusGreaterThan
     */
    public String getShippingFirmStatusGreaterThan() {
        return shippingFirmStatusGreaterThan;
    }

    /**
     * shippingFirmStatusGreaterThan のセッターメソッドです。
     * 
     * @param shippingFirmStatusGreaterThan shippingFirmStatusGreaterThan に設定する
     */
    public void setShippingFirmStatusGreaterThan(String shippingFirmStatusGreaterThan) {
        this.shippingFirmStatusGreaterThan = shippingFirmStatusGreaterThan;
    }

    /**
     * shippingFirmStatusGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmStatusGreaterThanEqual
     */
    public String getShippingFirmStatusGreaterThanEqual() {
        return shippingFirmStatusGreaterThanEqual;
    }

    /**
     * shippingFirmStatusGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmStatusGreaterThanEqual shippingFirmStatusGreaterThanEqual に設定する
     */
    public void setShippingFirmStatusGreaterThanEqual(String shippingFirmStatusGreaterThanEqual) {
        this.shippingFirmStatusGreaterThanEqual = shippingFirmStatusGreaterThanEqual;
    }

    /**
     * shippingFirmStatusLessThan のゲッターメソッドです。
     * 
     * @return the shippingFirmStatusLessThan
     */
    public String getShippingFirmStatusLessThan() {
        return shippingFirmStatusLessThan;
    }

    /**
     * shippingFirmStatusLessThan のセッターメソッドです。
     * 
     * @param shippingFirmStatusLessThan shippingFirmStatusLessThan に設定する
     */
    public void setShippingFirmStatusLessThan(String shippingFirmStatusLessThan) {
        this.shippingFirmStatusLessThan = shippingFirmStatusLessThan;
    }

    /**
     * shippingFirmStatusLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmStatusLessThanEqual
     */
    public String getShippingFirmStatusLessThanEqual() {
        return shippingFirmStatusLessThanEqual;
    }

    /**
     * shippingFirmStatusLessThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmStatusLessThanEqual shippingFirmStatusLessThanEqual に設定する
     */
    public void setShippingFirmStatusLessThanEqual(String shippingFirmStatusLessThanEqual) {
        this.shippingFirmStatusLessThanEqual = shippingFirmStatusLessThanEqual;
    }

    /**
     * shippingFirmStatusLikeFront のゲッターメソッドです。
     * 
     * @return the shippingFirmStatusLikeFront
     */
    public String getShippingFirmStatusLikeFront() {
        return shippingFirmStatusLikeFront;
    }

    /**
     * shippingFirmStatusLikeFront のセッターメソッドです。
     * 
     * @param shippingFirmStatusLikeFront shippingFirmStatusLikeFront に設定する
     */
    public void setShippingFirmStatusLikeFront(String shippingFirmStatusLikeFront) {
        this.shippingFirmStatusLikeFront = shippingFirmStatusLikeFront;
    }

    /**
     * etdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the etdGreaterThanEqual
     */
    public Date getEtdGreaterThanEqual() {
        return etdGreaterThanEqual;
    }

    /**
     * etdGreaterThanEqual のセッターメソッドです。
     * 
     * @param etdGreaterThanEqual etdGreaterThanEqual に設定する
     */
    public void setEtdGreaterThanEqual(Date etdGreaterThanEqual) {
        this.etdGreaterThanEqual = etdGreaterThanEqual;
    }

    /**
     * etdLessThanEqual のゲッターメソッドです。
     * 
     * @return the etdLessThanEqual
     */
    public Date getEtdLessThanEqual() {
        return etdLessThanEqual;
    }

    /**
     * etdLessThanEqual のセッターメソッドです。
     * 
     * @param etdLessThanEqual etdLessThanEqual に設定する
     */
    public void setEtdLessThanEqual(Date etdLessThanEqual) {
        this.etdLessThanEqual = etdLessThanEqual;
    }

    /**
     * carrierCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the carrierCompCdGreaterThan
     */
    public String getCarrierCompCdGreaterThan() {
        return carrierCompCdGreaterThan;
    }

    /**
     * carrierCompCdGreaterThan のセッターメソッドです。
     * 
     * @param carrierCompCdGreaterThan carrierCompCdGreaterThan に設定する
     */
    public void setCarrierCompCdGreaterThan(String carrierCompCdGreaterThan) {
        this.carrierCompCdGreaterThan = carrierCompCdGreaterThan;
    }

    /**
     * carrierCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompCdGreaterThanEqual
     */
    public String getCarrierCompCdGreaterThanEqual() {
        return carrierCompCdGreaterThanEqual;
    }

    /**
     * carrierCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param carrierCompCdGreaterThanEqual carrierCompCdGreaterThanEqual に設定する
     */
    public void setCarrierCompCdGreaterThanEqual(String carrierCompCdGreaterThanEqual) {
        this.carrierCompCdGreaterThanEqual = carrierCompCdGreaterThanEqual;
    }

    /**
     * carrierCompCdLessThan のゲッターメソッドです。
     * 
     * @return the carrierCompCdLessThan
     */
    public String getCarrierCompCdLessThan() {
        return carrierCompCdLessThan;
    }

    /**
     * carrierCompCdLessThan のセッターメソッドです。
     * 
     * @param carrierCompCdLessThan carrierCompCdLessThan に設定する
     */
    public void setCarrierCompCdLessThan(String carrierCompCdLessThan) {
        this.carrierCompCdLessThan = carrierCompCdLessThan;
    }

    /**
     * carrierCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompCdLessThanEqual
     */
    public String getCarrierCompCdLessThanEqual() {
        return carrierCompCdLessThanEqual;
    }

    /**
     * carrierCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param carrierCompCdLessThanEqual carrierCompCdLessThanEqual に設定する
     */
    public void setCarrierCompCdLessThanEqual(String carrierCompCdLessThanEqual) {
        this.carrierCompCdLessThanEqual = carrierCompCdLessThanEqual;
    }

    /**
     * carrierCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the carrierCompCdLikeFront
     */
    public String getCarrierCompCdLikeFront() {
        return carrierCompCdLikeFront;
    }

    /**
     * carrierCompCdLikeFront のセッターメソッドです。
     * 
     * @param carrierCompCdLikeFront carrierCompCdLikeFront に設定する
     */
    public void setCarrierCompCdLikeFront(String carrierCompCdLikeFront) {
        this.carrierCompCdLikeFront = carrierCompCdLikeFront;
    }

    /**
     * containerNoGreaterThan のゲッターメソッドです。
     * 
     * @return the containerNoGreaterThan
     */
    public String getContainerNoGreaterThan() {
        return containerNoGreaterThan;
    }

    /**
     * containerNoGreaterThan のセッターメソッドです。
     * 
     * @param containerNoGreaterThan containerNoGreaterThan に設定する
     */
    public void setContainerNoGreaterThan(String containerNoGreaterThan) {
        this.containerNoGreaterThan = containerNoGreaterThan;
    }

    /**
     * containerNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerNoGreaterThanEqual
     */
    public String getContainerNoGreaterThanEqual() {
        return containerNoGreaterThanEqual;
    }

    /**
     * containerNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerNoGreaterThanEqual containerNoGreaterThanEqual に設定する
     */
    public void setContainerNoGreaterThanEqual(String containerNoGreaterThanEqual) {
        this.containerNoGreaterThanEqual = containerNoGreaterThanEqual;
    }

    /**
     * containerNoLessThan のゲッターメソッドです。
     * 
     * @return the containerNoLessThan
     */
    public String getContainerNoLessThan() {
        return containerNoLessThan;
    }

    /**
     * containerNoLessThan のセッターメソッドです。
     * 
     * @param containerNoLessThan containerNoLessThan に設定する
     */
    public void setContainerNoLessThan(String containerNoLessThan) {
        this.containerNoLessThan = containerNoLessThan;
    }

    /**
     * containerNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerNoLessThanEqual
     */
    public String getContainerNoLessThanEqual() {
        return containerNoLessThanEqual;
    }

    /**
     * containerNoLessThanEqual のセッターメソッドです。
     * 
     * @param containerNoLessThanEqual containerNoLessThanEqual に設定する
     */
    public void setContainerNoLessThanEqual(String containerNoLessThanEqual) {
        this.containerNoLessThanEqual = containerNoLessThanEqual;
    }

    /**
     * containerNoLikeFront のゲッターメソッドです。
     * 
     * @return the containerNoLikeFront
     */
    public String getContainerNoLikeFront() {
        return containerNoLikeFront;
    }

    /**
     * containerNoLikeFront のセッターメソッドです。
     * 
     * @param containerNoLikeFront containerNoLikeFront に設定する
     */
    public void setContainerNoLikeFront(String containerNoLikeFront) {
        this.containerNoLikeFront = containerNoLikeFront;
    }

    /**
     * weightUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the weightUnitGreaterThan
     */
    public String getWeightUnitGreaterThan() {
        return weightUnitGreaterThan;
    }

    /**
     * weightUnitGreaterThan のセッターメソッドです。
     * 
     * @param weightUnitGreaterThan weightUnitGreaterThan に設定する
     */
    public void setWeightUnitGreaterThan(String weightUnitGreaterThan) {
        this.weightUnitGreaterThan = weightUnitGreaterThan;
    }

    /**
     * weightUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitGreaterThanEqual
     */
    public String getWeightUnitGreaterThanEqual() {
        return weightUnitGreaterThanEqual;
    }

    /**
     * weightUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param weightUnitGreaterThanEqual weightUnitGreaterThanEqual に設定する
     */
    public void setWeightUnitGreaterThanEqual(String weightUnitGreaterThanEqual) {
        this.weightUnitGreaterThanEqual = weightUnitGreaterThanEqual;
    }

    /**
     * weightUnitLessThan のゲッターメソッドです。
     * 
     * @return the weightUnitLessThan
     */
    public String getWeightUnitLessThan() {
        return weightUnitLessThan;
    }

    /**
     * weightUnitLessThan のセッターメソッドです。
     * 
     * @param weightUnitLessThan weightUnitLessThan に設定する
     */
    public void setWeightUnitLessThan(String weightUnitLessThan) {
        this.weightUnitLessThan = weightUnitLessThan;
    }

    /**
     * weightUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitLessThanEqual
     */
    public String getWeightUnitLessThanEqual() {
        return weightUnitLessThanEqual;
    }

    /**
     * weightUnitLessThanEqual のセッターメソッドです。
     * 
     * @param weightUnitLessThanEqual weightUnitLessThanEqual に設定する
     */
    public void setWeightUnitLessThanEqual(String weightUnitLessThanEqual) {
        this.weightUnitLessThanEqual = weightUnitLessThanEqual;
    }

    /**
     * weightUnitLikeFront のゲッターメソッドです。
     * 
     * @return the weightUnitLikeFront
     */
    public String getWeightUnitLikeFront() {
        return weightUnitLikeFront;
    }

    /**
     * weightUnitLikeFront のセッターメソッドです。
     * 
     * @param weightUnitLikeFront weightUnitLikeFront に設定する
     */
    public void setWeightUnitLikeFront(String weightUnitLikeFront) {
        this.weightUnitLikeFront = weightUnitLikeFront;
    }

    /**
     * volumeUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the volumeUnitGreaterThan
     */
    public String getVolumeUnitGreaterThan() {
        return volumeUnitGreaterThan;
    }

    /**
     * volumeUnitGreaterThan のセッターメソッドです。
     * 
     * @param volumeUnitGreaterThan volumeUnitGreaterThan に設定する
     */
    public void setVolumeUnitGreaterThan(String volumeUnitGreaterThan) {
        this.volumeUnitGreaterThan = volumeUnitGreaterThan;
    }

    /**
     * volumeUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the volumeUnitGreaterThanEqual
     */
    public String getVolumeUnitGreaterThanEqual() {
        return volumeUnitGreaterThanEqual;
    }

    /**
     * volumeUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param volumeUnitGreaterThanEqual volumeUnitGreaterThanEqual に設定する
     */
    public void setVolumeUnitGreaterThanEqual(String volumeUnitGreaterThanEqual) {
        this.volumeUnitGreaterThanEqual = volumeUnitGreaterThanEqual;
    }

    /**
     * volumeUnitLessThan のゲッターメソッドです。
     * 
     * @return the volumeUnitLessThan
     */
    public String getVolumeUnitLessThan() {
        return volumeUnitLessThan;
    }

    /**
     * volumeUnitLessThan のセッターメソッドです。
     * 
     * @param volumeUnitLessThan volumeUnitLessThan に設定する
     */
    public void setVolumeUnitLessThan(String volumeUnitLessThan) {
        this.volumeUnitLessThan = volumeUnitLessThan;
    }

    /**
     * volumeUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the volumeUnitLessThanEqual
     */
    public String getVolumeUnitLessThanEqual() {
        return volumeUnitLessThanEqual;
    }

    /**
     * volumeUnitLessThanEqual のセッターメソッドです。
     * 
     * @param volumeUnitLessThanEqual volumeUnitLessThanEqual に設定する
     */
    public void setVolumeUnitLessThanEqual(String volumeUnitLessThanEqual) {
        this.volumeUnitLessThanEqual = volumeUnitLessThanEqual;
    }

    /**
     * volumeUnitLikeFront のゲッターメソッドです。
     * 
     * @return the volumeUnitLikeFront
     */
    public String getVolumeUnitLikeFront() {
        return volumeUnitLikeFront;
    }

    /**
     * volumeUnitLikeFront のセッターメソッドです。
     * 
     * @param volumeUnitLikeFront volumeUnitLikeFront に設定する
     */
    public void setVolumeUnitLikeFront(String volumeUnitLikeFront) {
        this.volumeUnitLikeFront = volumeUnitLikeFront;
    }

    /**
     * shippingFirmDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmDtGreaterThanEqual
     */
    public Date getShippingFirmDtGreaterThanEqual() {
        return shippingFirmDtGreaterThanEqual;
    }

    /**
     * shippingFirmDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmDtGreaterThanEqual shippingFirmDtGreaterThanEqual に設定する
     */
    public void setShippingFirmDtGreaterThanEqual(Date shippingFirmDtGreaterThanEqual) {
        this.shippingFirmDtGreaterThanEqual = shippingFirmDtGreaterThanEqual;
    }

    /**
     * shippingFirmDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmDtLessThanEqual
     */
    public Date getShippingFirmDtLessThanEqual() {
        return shippingFirmDtLessThanEqual;
    }

    /**
     * shippingFirmDtLessThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmDtLessThanEqual shippingFirmDtLessThanEqual に設定する
     */
    public void setShippingFirmDtLessThanEqual(Date shippingFirmDtLessThanEqual) {
        this.shippingFirmDtLessThanEqual = shippingFirmDtLessThanEqual;
    }

    /**
     * shippingFirmIssuerIdGreaterThan のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerIdGreaterThan
     */
    public String getShippingFirmIssuerIdGreaterThan() {
        return shippingFirmIssuerIdGreaterThan;
    }

    /**
     * shippingFirmIssuerIdGreaterThan のセッターメソッドです。
     * 
     * @param shippingFirmIssuerIdGreaterThan shippingFirmIssuerIdGreaterThan に設定する
     */
    public void setShippingFirmIssuerIdGreaterThan(String shippingFirmIssuerIdGreaterThan) {
        this.shippingFirmIssuerIdGreaterThan = shippingFirmIssuerIdGreaterThan;
    }

    /**
     * shippingFirmIssuerIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerIdGreaterThanEqual
     */
    public String getShippingFirmIssuerIdGreaterThanEqual() {
        return shippingFirmIssuerIdGreaterThanEqual;
    }

    /**
     * shippingFirmIssuerIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmIssuerIdGreaterThanEqual shippingFirmIssuerIdGreaterThanEqual に設定する
     */
    public void setShippingFirmIssuerIdGreaterThanEqual(String shippingFirmIssuerIdGreaterThanEqual) {
        this.shippingFirmIssuerIdGreaterThanEqual = shippingFirmIssuerIdGreaterThanEqual;
    }

    /**
     * shippingFirmIssuerIdLessThan のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerIdLessThan
     */
    public String getShippingFirmIssuerIdLessThan() {
        return shippingFirmIssuerIdLessThan;
    }

    /**
     * shippingFirmIssuerIdLessThan のセッターメソッドです。
     * 
     * @param shippingFirmIssuerIdLessThan shippingFirmIssuerIdLessThan に設定する
     */
    public void setShippingFirmIssuerIdLessThan(String shippingFirmIssuerIdLessThan) {
        this.shippingFirmIssuerIdLessThan = shippingFirmIssuerIdLessThan;
    }

    /**
     * shippingFirmIssuerIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerIdLessThanEqual
     */
    public String getShippingFirmIssuerIdLessThanEqual() {
        return shippingFirmIssuerIdLessThanEqual;
    }

    /**
     * shippingFirmIssuerIdLessThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmIssuerIdLessThanEqual shippingFirmIssuerIdLessThanEqual に設定する
     */
    public void setShippingFirmIssuerIdLessThanEqual(String shippingFirmIssuerIdLessThanEqual) {
        this.shippingFirmIssuerIdLessThanEqual = shippingFirmIssuerIdLessThanEqual;
    }

    /**
     * shippingFirmIssuerIdLikeFront のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerIdLikeFront
     */
    public String getShippingFirmIssuerIdLikeFront() {
        return shippingFirmIssuerIdLikeFront;
    }

    /**
     * shippingFirmIssuerIdLikeFront のセッターメソッドです。
     * 
     * @param shippingFirmIssuerIdLikeFront shippingFirmIssuerIdLikeFront に設定する
     */
    public void setShippingFirmIssuerIdLikeFront(String shippingFirmIssuerIdLikeFront) {
        this.shippingFirmIssuerIdLikeFront = shippingFirmIssuerIdLikeFront;
    }

    /**
     * shippingFirmIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerNmGreaterThan
     */
    public String getShippingFirmIssuerNmGreaterThan() {
        return shippingFirmIssuerNmGreaterThan;
    }

    /**
     * shippingFirmIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param shippingFirmIssuerNmGreaterThan shippingFirmIssuerNmGreaterThan に設定する
     */
    public void setShippingFirmIssuerNmGreaterThan(String shippingFirmIssuerNmGreaterThan) {
        this.shippingFirmIssuerNmGreaterThan = shippingFirmIssuerNmGreaterThan;
    }

    /**
     * shippingFirmIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerNmGreaterThanEqual
     */
    public String getShippingFirmIssuerNmGreaterThanEqual() {
        return shippingFirmIssuerNmGreaterThanEqual;
    }

    /**
     * shippingFirmIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmIssuerNmGreaterThanEqual shippingFirmIssuerNmGreaterThanEqual に設定する
     */
    public void setShippingFirmIssuerNmGreaterThanEqual(String shippingFirmIssuerNmGreaterThanEqual) {
        this.shippingFirmIssuerNmGreaterThanEqual = shippingFirmIssuerNmGreaterThanEqual;
    }

    /**
     * shippingFirmIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerNmLessThan
     */
    public String getShippingFirmIssuerNmLessThan() {
        return shippingFirmIssuerNmLessThan;
    }

    /**
     * shippingFirmIssuerNmLessThan のセッターメソッドです。
     * 
     * @param shippingFirmIssuerNmLessThan shippingFirmIssuerNmLessThan に設定する
     */
    public void setShippingFirmIssuerNmLessThan(String shippingFirmIssuerNmLessThan) {
        this.shippingFirmIssuerNmLessThan = shippingFirmIssuerNmLessThan;
    }

    /**
     * shippingFirmIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerNmLessThanEqual
     */
    public String getShippingFirmIssuerNmLessThanEqual() {
        return shippingFirmIssuerNmLessThanEqual;
    }

    /**
     * shippingFirmIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param shippingFirmIssuerNmLessThanEqual shippingFirmIssuerNmLessThanEqual に設定する
     */
    public void setShippingFirmIssuerNmLessThanEqual(String shippingFirmIssuerNmLessThanEqual) {
        this.shippingFirmIssuerNmLessThanEqual = shippingFirmIssuerNmLessThanEqual;
    }

    /**
     * shippingFirmIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the shippingFirmIssuerNmLikeFront
     */
    public String getShippingFirmIssuerNmLikeFront() {
        return shippingFirmIssuerNmLikeFront;
    }

    /**
     * shippingFirmIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param shippingFirmIssuerNmLikeFront shippingFirmIssuerNmLikeFront に設定する
     */
    public void setShippingFirmIssuerNmLikeFront(String shippingFirmIssuerNmLikeFront) {
        this.shippingFirmIssuerNmLikeFront = shippingFirmIssuerNmLikeFront;
    }

    /**
     * workedDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the workedDtGreaterThanEqual
     */
    public Date getWorkedDtGreaterThanEqual() {
        return workedDtGreaterThanEqual;
    }

    /**
     * workedDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param workedDtGreaterThanEqual workedDtGreaterThanEqual に設定する
     */
    public void setWorkedDtGreaterThanEqual(Date workedDtGreaterThanEqual) {
        this.workedDtGreaterThanEqual = workedDtGreaterThanEqual;
    }

    /**
     * workedDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the workedDtLessThanEqual
     */
    public Date getWorkedDtLessThanEqual() {
        return workedDtLessThanEqual;
    }

    /**
     * workedDtLessThanEqual のセッターメソッドです。
     * 
     * @param workedDtLessThanEqual workedDtLessThanEqual に設定する
     */
    public void setWorkedDtLessThanEqual(Date workedDtLessThanEqual) {
        this.workedDtLessThanEqual = workedDtLessThanEqual;
    }

    /**
     * workedIssuerIdGreaterThan のゲッターメソッドです。
     * 
     * @return the workedIssuerIdGreaterThan
     */
    public String getWorkedIssuerIdGreaterThan() {
        return workedIssuerIdGreaterThan;
    }

    /**
     * workedIssuerIdGreaterThan のセッターメソッドです。
     * 
     * @param workedIssuerIdGreaterThan workedIssuerIdGreaterThan に設定する
     */
    public void setWorkedIssuerIdGreaterThan(String workedIssuerIdGreaterThan) {
        this.workedIssuerIdGreaterThan = workedIssuerIdGreaterThan;
    }

    /**
     * workedIssuerIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the workedIssuerIdGreaterThanEqual
     */
    public String getWorkedIssuerIdGreaterThanEqual() {
        return workedIssuerIdGreaterThanEqual;
    }

    /**
     * workedIssuerIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param workedIssuerIdGreaterThanEqual workedIssuerIdGreaterThanEqual に設定する
     */
    public void setWorkedIssuerIdGreaterThanEqual(String workedIssuerIdGreaterThanEqual) {
        this.workedIssuerIdGreaterThanEqual = workedIssuerIdGreaterThanEqual;
    }

    /**
     * workedIssuerIdLessThan のゲッターメソッドです。
     * 
     * @return the workedIssuerIdLessThan
     */
    public String getWorkedIssuerIdLessThan() {
        return workedIssuerIdLessThan;
    }

    /**
     * workedIssuerIdLessThan のセッターメソッドです。
     * 
     * @param workedIssuerIdLessThan workedIssuerIdLessThan に設定する
     */
    public void setWorkedIssuerIdLessThan(String workedIssuerIdLessThan) {
        this.workedIssuerIdLessThan = workedIssuerIdLessThan;
    }

    /**
     * workedIssuerIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the workedIssuerIdLessThanEqual
     */
    public String getWorkedIssuerIdLessThanEqual() {
        return workedIssuerIdLessThanEqual;
    }

    /**
     * workedIssuerIdLessThanEqual のセッターメソッドです。
     * 
     * @param workedIssuerIdLessThanEqual workedIssuerIdLessThanEqual に設定する
     */
    public void setWorkedIssuerIdLessThanEqual(String workedIssuerIdLessThanEqual) {
        this.workedIssuerIdLessThanEqual = workedIssuerIdLessThanEqual;
    }

    /**
     * workedIssuerIdLikeFront のゲッターメソッドです。
     * 
     * @return the workedIssuerIdLikeFront
     */
    public String getWorkedIssuerIdLikeFront() {
        return workedIssuerIdLikeFront;
    }

    /**
     * workedIssuerIdLikeFront のセッターメソッドです。
     * 
     * @param workedIssuerIdLikeFront workedIssuerIdLikeFront に設定する
     */
    public void setWorkedIssuerIdLikeFront(String workedIssuerIdLikeFront) {
        this.workedIssuerIdLikeFront = workedIssuerIdLikeFront;
    }

    /**
     * workedIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the workedIssuerNmGreaterThan
     */
    public String getWorkedIssuerNmGreaterThan() {
        return workedIssuerNmGreaterThan;
    }

    /**
     * workedIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param workedIssuerNmGreaterThan workedIssuerNmGreaterThan に設定する
     */
    public void setWorkedIssuerNmGreaterThan(String workedIssuerNmGreaterThan) {
        this.workedIssuerNmGreaterThan = workedIssuerNmGreaterThan;
    }

    /**
     * workedIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the workedIssuerNmGreaterThanEqual
     */
    public String getWorkedIssuerNmGreaterThanEqual() {
        return workedIssuerNmGreaterThanEqual;
    }

    /**
     * workedIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param workedIssuerNmGreaterThanEqual workedIssuerNmGreaterThanEqual に設定する
     */
    public void setWorkedIssuerNmGreaterThanEqual(String workedIssuerNmGreaterThanEqual) {
        this.workedIssuerNmGreaterThanEqual = workedIssuerNmGreaterThanEqual;
    }

    /**
     * workedIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the workedIssuerNmLessThan
     */
    public String getWorkedIssuerNmLessThan() {
        return workedIssuerNmLessThan;
    }

    /**
     * workedIssuerNmLessThan のセッターメソッドです。
     * 
     * @param workedIssuerNmLessThan workedIssuerNmLessThan に設定する
     */
    public void setWorkedIssuerNmLessThan(String workedIssuerNmLessThan) {
        this.workedIssuerNmLessThan = workedIssuerNmLessThan;
    }

    /**
     * workedIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the workedIssuerNmLessThanEqual
     */
    public String getWorkedIssuerNmLessThanEqual() {
        return workedIssuerNmLessThanEqual;
    }

    /**
     * workedIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param workedIssuerNmLessThanEqual workedIssuerNmLessThanEqual に設定する
     */
    public void setWorkedIssuerNmLessThanEqual(String workedIssuerNmLessThanEqual) {
        this.workedIssuerNmLessThanEqual = workedIssuerNmLessThanEqual;
    }

    /**
     * workedIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the workedIssuerNmLikeFront
     */
    public String getWorkedIssuerNmLikeFront() {
        return workedIssuerNmLikeFront;
    }

    /**
     * workedIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param workedIssuerNmLikeFront workedIssuerNmLikeFront に設定する
     */
    public void setWorkedIssuerNmLikeFront(String workedIssuerNmLikeFront) {
        this.workedIssuerNmLikeFront = workedIssuerNmLikeFront;
    }

    /**
     * workedMethTypGreaterThan のゲッターメソッドです。
     * 
     * @return the workedMethTypGreaterThan
     */
    public String getWorkedMethTypGreaterThan() {
        return workedMethTypGreaterThan;
    }

    /**
     * workedMethTypGreaterThan のセッターメソッドです。
     * 
     * @param workedMethTypGreaterThan workedMethTypGreaterThan に設定する
     */
    public void setWorkedMethTypGreaterThan(String workedMethTypGreaterThan) {
        this.workedMethTypGreaterThan = workedMethTypGreaterThan;
    }

    /**
     * workedMethTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the workedMethTypGreaterThanEqual
     */
    public String getWorkedMethTypGreaterThanEqual() {
        return workedMethTypGreaterThanEqual;
    }

    /**
     * workedMethTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param workedMethTypGreaterThanEqual workedMethTypGreaterThanEqual に設定する
     */
    public void setWorkedMethTypGreaterThanEqual(String workedMethTypGreaterThanEqual) {
        this.workedMethTypGreaterThanEqual = workedMethTypGreaterThanEqual;
    }

    /**
     * workedMethTypLessThan のゲッターメソッドです。
     * 
     * @return the workedMethTypLessThan
     */
    public String getWorkedMethTypLessThan() {
        return workedMethTypLessThan;
    }

    /**
     * workedMethTypLessThan のセッターメソッドです。
     * 
     * @param workedMethTypLessThan workedMethTypLessThan に設定する
     */
    public void setWorkedMethTypLessThan(String workedMethTypLessThan) {
        this.workedMethTypLessThan = workedMethTypLessThan;
    }

    /**
     * workedMethTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the workedMethTypLessThanEqual
     */
    public String getWorkedMethTypLessThanEqual() {
        return workedMethTypLessThanEqual;
    }

    /**
     * workedMethTypLessThanEqual のセッターメソッドです。
     * 
     * @param workedMethTypLessThanEqual workedMethTypLessThanEqual に設定する
     */
    public void setWorkedMethTypLessThanEqual(String workedMethTypLessThanEqual) {
        this.workedMethTypLessThanEqual = workedMethTypLessThanEqual;
    }

    /**
     * workedMethTypLikeFront のゲッターメソッドです。
     * 
     * @return the workedMethTypLikeFront
     */
    public String getWorkedMethTypLikeFront() {
        return workedMethTypLikeFront;
    }

    /**
     * workedMethTypLikeFront のセッターメソッドです。
     * 
     * @param workedMethTypLikeFront workedMethTypLikeFront に設定する
     */
    public void setWorkedMethTypLikeFront(String workedMethTypLikeFront) {
        this.workedMethTypLikeFront = workedMethTypLikeFront;
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

