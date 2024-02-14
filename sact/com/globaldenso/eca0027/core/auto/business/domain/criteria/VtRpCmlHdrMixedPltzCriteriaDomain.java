/*
 * PROJECT：eca0027
 * 
 * VtRpCmlHdrMixedPltz の検索条件Domainクラス
 * テーブル概要：VT_RP_CML_HDR_MIXED_PLTZ
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/08/02  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * VtRpCmlHdrMixedPltz の検索条件Domainクラスです。<BR>
 * テーブル概要：VT_RP_CML_HDR_MIXED_PLTZ<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/02 15:47:26<BR>
 * 
 * テーブル定義から2014/08/02に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class VtRpCmlHdrMixedPltzCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MAIN_MARK
     */
    private String mainMark;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * EXP_PACKING_ISSUER_NM
     */
    private String expPackingIssuerNm;

    /**
     * PALLET_NO
     */
    private String palletNo;

    /**
     * CML_TYP
     */
    private String cmlTyp;

    /**
     * PKG_FORM_TYP
     */
    private String pkgFormTyp;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * NET_WEIGHT
     */
    private BigDecimal netWeight;

    /**
     * GROSS_WEIGHT
     */
    private BigDecimal grossWeight;

    /**
     * VOLUME
     */
    private BigDecimal volume;

    /**
     * VOLUME_UNIT
     */
    private String volumeUnit;

    /**
     * LOADING_CD
     */
    private String loadingCd;

    /**
     * DNGR_ITEM_FLG
     */
    private String dngrItemFlg;

    /**
     * CUSTOM_TIMING_TYP
     */
    private String customTimingTyp;

    /**
     * STG_INSTR_ITEM_FLG
     */
    private String stgInstrItemFlg;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * DUE_DT
     */
    private Date dueDt;

    /**
     * MIGRATION_FLG
     */
    private String migrationFlg;

    /**
     * OLD_QR_MIX_TYP
     */
    private String oldQrMixTyp;

    /**
     * OLD_QR_CONTAINER_GRP_CD
     */
    private String oldQrContainerGrpCd;

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
     * LGCY_WH_CD
     */
    private String lgcyWhCd;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * SHIP_TO_NM_ABB
     */
    private String shipToNmAbb;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * UNIT_DISP
     */
    private String unitDisp;

    /**
     * COMP_NM
     */
    private String compNm;

    /**
     * COMP_NM_1
     */
    private String compNm1;

    /**
     * MAIN_MARK（大なり）
     */
    private String mainMarkGreaterThan;

    /**
     * MAIN_MARK（大なりイコール）
     */
    private String mainMarkGreaterThanEqual;

    /**
     * MAIN_MARK（小なり）
     */
    private String mainMarkLessThan;

    /**
     * MAIN_MARK（小なりイコール）
     */
    private String mainMarkLessThanEqual;

    /**
     * MAIN_MARK（前方一致）
     */
    private String mainMarkLikeFront;

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
     * EXP_PACKING_ISSUER_NM（大なり）
     */
    private String expPackingIssuerNmGreaterThan;

    /**
     * EXP_PACKING_ISSUER_NM（大なりイコール）
     */
    private String expPackingIssuerNmGreaterThanEqual;

    /**
     * EXP_PACKING_ISSUER_NM（小なり）
     */
    private String expPackingIssuerNmLessThan;

    /**
     * EXP_PACKING_ISSUER_NM（小なりイコール）
     */
    private String expPackingIssuerNmLessThanEqual;

    /**
     * EXP_PACKING_ISSUER_NM（前方一致）
     */
    private String expPackingIssuerNmLikeFront;

    /**
     * PALLET_NO（大なり）
     */
    private String palletNoGreaterThan;

    /**
     * PALLET_NO（大なりイコール）
     */
    private String palletNoGreaterThanEqual;

    /**
     * PALLET_NO（小なり）
     */
    private String palletNoLessThan;

    /**
     * PALLET_NO（小なりイコール）
     */
    private String palletNoLessThanEqual;

    /**
     * PALLET_NO（前方一致）
     */
    private String palletNoLikeFront;

    /**
     * CML_TYP（大なり）
     */
    private String cmlTypGreaterThan;

    /**
     * CML_TYP（大なりイコール）
     */
    private String cmlTypGreaterThanEqual;

    /**
     * CML_TYP（小なり）
     */
    private String cmlTypLessThan;

    /**
     * CML_TYP（小なりイコール）
     */
    private String cmlTypLessThanEqual;

    /**
     * CML_TYP（前方一致）
     */
    private String cmlTypLikeFront;

    /**
     * PKG_FORM_TYP（大なり）
     */
    private String pkgFormTypGreaterThan;

    /**
     * PKG_FORM_TYP（大なりイコール）
     */
    private String pkgFormTypGreaterThanEqual;

    /**
     * PKG_FORM_TYP（小なり）
     */
    private String pkgFormTypLessThan;

    /**
     * PKG_FORM_TYP（小なりイコール）
     */
    private String pkgFormTypLessThanEqual;

    /**
     * PKG_FORM_TYP（前方一致）
     */
    private String pkgFormTypLikeFront;

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
     * LOADING_CD（大なり）
     */
    private String loadingCdGreaterThan;

    /**
     * LOADING_CD（大なりイコール）
     */
    private String loadingCdGreaterThanEqual;

    /**
     * LOADING_CD（小なり）
     */
    private String loadingCdLessThan;

    /**
     * LOADING_CD（小なりイコール）
     */
    private String loadingCdLessThanEqual;

    /**
     * LOADING_CD（前方一致）
     */
    private String loadingCdLikeFront;

    /**
     * DNGR_ITEM_FLG（大なり）
     */
    private String dngrItemFlgGreaterThan;

    /**
     * DNGR_ITEM_FLG（大なりイコール）
     */
    private String dngrItemFlgGreaterThanEqual;

    /**
     * DNGR_ITEM_FLG（小なり）
     */
    private String dngrItemFlgLessThan;

    /**
     * DNGR_ITEM_FLG（小なりイコール）
     */
    private String dngrItemFlgLessThanEqual;

    /**
     * DNGR_ITEM_FLG（前方一致）
     */
    private String dngrItemFlgLikeFront;

    /**
     * CUSTOM_TIMING_TYP（大なり）
     */
    private String customTimingTypGreaterThan;

    /**
     * CUSTOM_TIMING_TYP（大なりイコール）
     */
    private String customTimingTypGreaterThanEqual;

    /**
     * CUSTOM_TIMING_TYP（小なり）
     */
    private String customTimingTypLessThan;

    /**
     * CUSTOM_TIMING_TYP（小なりイコール）
     */
    private String customTimingTypLessThanEqual;

    /**
     * CUSTOM_TIMING_TYP（前方一致）
     */
    private String customTimingTypLikeFront;

    /**
     * STG_INSTR_ITEM_FLG（大なり）
     */
    private String stgInstrItemFlgGreaterThan;

    /**
     * STG_INSTR_ITEM_FLG（大なりイコール）
     */
    private String stgInstrItemFlgGreaterThanEqual;

    /**
     * STG_INSTR_ITEM_FLG（小なり）
     */
    private String stgInstrItemFlgLessThan;

    /**
     * STG_INSTR_ITEM_FLG（小なりイコール）
     */
    private String stgInstrItemFlgLessThanEqual;

    /**
     * STG_INSTR_ITEM_FLG（前方一致）
     */
    private String stgInstrItemFlgLikeFront;

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
     * DUE_DT（大なりイコール）
     */
    private Date dueDtGreaterThanEqual;

    /**
     * DUE_DT（小なりイコール）
     */
    private Date dueDtLessThanEqual;

    /**
     * MIGRATION_FLG（大なり）
     */
    private String migrationFlgGreaterThan;

    /**
     * MIGRATION_FLG（大なりイコール）
     */
    private String migrationFlgGreaterThanEqual;

    /**
     * MIGRATION_FLG（小なり）
     */
    private String migrationFlgLessThan;

    /**
     * MIGRATION_FLG（小なりイコール）
     */
    private String migrationFlgLessThanEqual;

    /**
     * MIGRATION_FLG（前方一致）
     */
    private String migrationFlgLikeFront;

    /**
     * OLD_QR_MIX_TYP（大なり）
     */
    private String oldQrMixTypGreaterThan;

    /**
     * OLD_QR_MIX_TYP（大なりイコール）
     */
    private String oldQrMixTypGreaterThanEqual;

    /**
     * OLD_QR_MIX_TYP（小なり）
     */
    private String oldQrMixTypLessThan;

    /**
     * OLD_QR_MIX_TYP（小なりイコール）
     */
    private String oldQrMixTypLessThanEqual;

    /**
     * OLD_QR_MIX_TYP（前方一致）
     */
    private String oldQrMixTypLikeFront;

    /**
     * OLD_QR_CONTAINER_GRP_CD（大なり）
     */
    private String oldQrContainerGrpCdGreaterThan;

    /**
     * OLD_QR_CONTAINER_GRP_CD（大なりイコール）
     */
    private String oldQrContainerGrpCdGreaterThanEqual;

    /**
     * OLD_QR_CONTAINER_GRP_CD（小なり）
     */
    private String oldQrContainerGrpCdLessThan;

    /**
     * OLD_QR_CONTAINER_GRP_CD（小なりイコール）
     */
    private String oldQrContainerGrpCdLessThanEqual;

    /**
     * OLD_QR_CONTAINER_GRP_CD（前方一致）
     */
    private String oldQrContainerGrpCdLikeFront;

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
     * LGCY_WH_CD（大なり）
     */
    private String lgcyWhCdGreaterThan;

    /**
     * LGCY_WH_CD（大なりイコール）
     */
    private String lgcyWhCdGreaterThanEqual;

    /**
     * LGCY_WH_CD（小なり）
     */
    private String lgcyWhCdLessThan;

    /**
     * LGCY_WH_CD（小なりイコール）
     */
    private String lgcyWhCdLessThanEqual;

    /**
     * LGCY_WH_CD（前方一致）
     */
    private String lgcyWhCdLikeFront;

    /**
     * SHIPPER_CD（大なり）
     */
    private String shipperCdGreaterThan;

    /**
     * SHIPPER_CD（大なりイコール）
     */
    private String shipperCdGreaterThanEqual;

    /**
     * SHIPPER_CD（小なり）
     */
    private String shipperCdLessThan;

    /**
     * SHIPPER_CD（小なりイコール）
     */
    private String shipperCdLessThanEqual;

    /**
     * SHIPPER_CD（前方一致）
     */
    private String shipperCdLikeFront;

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
     * UNIT_DISP（大なり）
     */
    private String unitDispGreaterThan;

    /**
     * UNIT_DISP（大なりイコール）
     */
    private String unitDispGreaterThanEqual;

    /**
     * UNIT_DISP（小なり）
     */
    private String unitDispLessThan;

    /**
     * UNIT_DISP（小なりイコール）
     */
    private String unitDispLessThanEqual;

    /**
     * UNIT_DISP（前方一致）
     */
    private String unitDispLikeFront;

    /**
     * COMP_NM（大なり）
     */
    private String compNmGreaterThan;

    /**
     * COMP_NM（大なりイコール）
     */
    private String compNmGreaterThanEqual;

    /**
     * COMP_NM（小なり）
     */
    private String compNmLessThan;

    /**
     * COMP_NM（小なりイコール）
     */
    private String compNmLessThanEqual;

    /**
     * COMP_NM（前方一致）
     */
    private String compNmLikeFront;

    /**
     * COMP_NM_1（大なり）
     */
    private String compNm1GreaterThan;

    /**
     * COMP_NM_1（大なりイコール）
     */
    private String compNm1GreaterThanEqual;

    /**
     * COMP_NM_1（小なり）
     */
    private String compNm1LessThan;

    /**
     * COMP_NM_1（小なりイコール）
     */
    private String compNm1LessThanEqual;

    /**
     * COMP_NM_1（前方一致）
     */
    private String compNm1LikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpCmlHdrMixedPltzCriteriaDomain() {
    }

    /**
     * mainMark のゲッターメソッドです。
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * mainMark のセッターメソッドです。
     * 
     * @param mainMark mainMark に設定する
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
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
     * expPackingIssuerNm のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNm
     */
    public String getExpPackingIssuerNm() {
        return expPackingIssuerNm;
    }

    /**
     * expPackingIssuerNm のセッターメソッドです。
     * 
     * @param expPackingIssuerNm expPackingIssuerNm に設定する
     */
    public void setExpPackingIssuerNm(String expPackingIssuerNm) {
        this.expPackingIssuerNm = expPackingIssuerNm;
    }

    /**
     * palletNo のゲッターメソッドです。
     * 
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * palletNo のセッターメソッドです。
     * 
     * @param palletNo palletNo に設定する
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * cmlTyp のゲッターメソッドです。
     * 
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * cmlTyp のセッターメソッドです。
     * 
     * @param cmlTyp cmlTyp に設定する
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * pkgFormTyp のゲッターメソッドです。
     * 
     * @return the pkgFormTyp
     */
    public String getPkgFormTyp() {
        return pkgFormTyp;
    }

    /**
     * pkgFormTyp のセッターメソッドです。
     * 
     * @param pkgFormTyp pkgFormTyp に設定する
     */
    public void setPkgFormTyp(String pkgFormTyp) {
        this.pkgFormTyp = pkgFormTyp;
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
     * netWeight のゲッターメソッドです。
     * 
     * @return the netWeight
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * netWeight のセッターメソッドです。
     * 
     * @param netWeight netWeight に設定する
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
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
     * loadingCd のゲッターメソッドです。
     * 
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * loadingCd のセッターメソッドです。
     * 
     * @param loadingCd loadingCd に設定する
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * dngrItemFlg のゲッターメソッドです。
     * 
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * dngrItemFlg のセッターメソッドです。
     * 
     * @param dngrItemFlg dngrItemFlg に設定する
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * customTimingTyp のゲッターメソッドです。
     * 
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * customTimingTyp のセッターメソッドです。
     * 
     * @param customTimingTyp customTimingTyp に設定する
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * stgInstrItemFlg のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlg
     */
    public String getStgInstrItemFlg() {
        return stgInstrItemFlg;
    }

    /**
     * stgInstrItemFlg のセッターメソッドです。
     * 
     * @param stgInstrItemFlg stgInstrItemFlg に設定する
     */
    public void setStgInstrItemFlg(String stgInstrItemFlg) {
        this.stgInstrItemFlg = stgInstrItemFlg;
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
     * dueDt のゲッターメソッドです。
     * 
     * @return the dueDt
     */
    public Date getDueDt() {
        return dueDt;
    }

    /**
     * dueDt のセッターメソッドです。
     * 
     * @param dueDt dueDt に設定する
     */
    public void setDueDt(Date dueDt) {
        this.dueDt = dueDt;
    }

    /**
     * migrationFlg のゲッターメソッドです。
     * 
     * @return the migrationFlg
     */
    public String getMigrationFlg() {
        return migrationFlg;
    }

    /**
     * migrationFlg のセッターメソッドです。
     * 
     * @param migrationFlg migrationFlg に設定する
     */
    public void setMigrationFlg(String migrationFlg) {
        this.migrationFlg = migrationFlg;
    }

    /**
     * oldQrMixTyp のゲッターメソッドです。
     * 
     * @return the oldQrMixTyp
     */
    public String getOldQrMixTyp() {
        return oldQrMixTyp;
    }

    /**
     * oldQrMixTyp のセッターメソッドです。
     * 
     * @param oldQrMixTyp oldQrMixTyp に設定する
     */
    public void setOldQrMixTyp(String oldQrMixTyp) {
        this.oldQrMixTyp = oldQrMixTyp;
    }

    /**
     * oldQrContainerGrpCd のゲッターメソッドです。
     * 
     * @return the oldQrContainerGrpCd
     */
    public String getOldQrContainerGrpCd() {
        return oldQrContainerGrpCd;
    }

    /**
     * oldQrContainerGrpCd のセッターメソッドです。
     * 
     * @param oldQrContainerGrpCd oldQrContainerGrpCd に設定する
     */
    public void setOldQrContainerGrpCd(String oldQrContainerGrpCd) {
        this.oldQrContainerGrpCd = oldQrContainerGrpCd;
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
     * lgcyWhCd のゲッターメソッドです。
     * 
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * lgcyWhCd のセッターメソッドです。
     * 
     * @param lgcyWhCd lgcyWhCd に設定する
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * shipperCd のゲッターメソッドです。
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * shipperCd のセッターメソッドです。
     * 
     * @param shipperCd shipperCd に設定する
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
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
     * unitDisp のゲッターメソッドです。
     * 
     * @return the unitDisp
     */
    public String getUnitDisp() {
        return unitDisp;
    }

    /**
     * unitDisp のセッターメソッドです。
     * 
     * @param unitDisp unitDisp に設定する
     */
    public void setUnitDisp(String unitDisp) {
        this.unitDisp = unitDisp;
    }

    /**
     * compNm のゲッターメソッドです。
     * 
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * compNm のセッターメソッドです。
     * 
     * @param compNm compNm に設定する
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * compNm1 のゲッターメソッドです。
     * 
     * @return the compNm1
     */
    public String getCompNm1() {
        return compNm1;
    }

    /**
     * compNm1 のセッターメソッドです。
     * 
     * @param compNm1 compNm1 に設定する
     */
    public void setCompNm1(String compNm1) {
        this.compNm1 = compNm1;
    }

    /**
     * mainMarkGreaterThan のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThan
     */
    public String getMainMarkGreaterThan() {
        return mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThan のセッターメソッドです。
     * 
     * @param mainMarkGreaterThan mainMarkGreaterThan に設定する
     */
    public void setMainMarkGreaterThan(String mainMarkGreaterThan) {
        this.mainMarkGreaterThan = mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThanEqual
     */
    public String getMainMarkGreaterThanEqual() {
        return mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkGreaterThanEqual のセッターメソッドです。
     * 
     * @param mainMarkGreaterThanEqual mainMarkGreaterThanEqual に設定する
     */
    public void setMainMarkGreaterThanEqual(String mainMarkGreaterThanEqual) {
        this.mainMarkGreaterThanEqual = mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkLessThan のゲッターメソッドです。
     * 
     * @return the mainMarkLessThan
     */
    public String getMainMarkLessThan() {
        return mainMarkLessThan;
    }

    /**
     * mainMarkLessThan のセッターメソッドです。
     * 
     * @param mainMarkLessThan mainMarkLessThan に設定する
     */
    public void setMainMarkLessThan(String mainMarkLessThan) {
        this.mainMarkLessThan = mainMarkLessThan;
    }

    /**
     * mainMarkLessThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkLessThanEqual
     */
    public String getMainMarkLessThanEqual() {
        return mainMarkLessThanEqual;
    }

    /**
     * mainMarkLessThanEqual のセッターメソッドです。
     * 
     * @param mainMarkLessThanEqual mainMarkLessThanEqual に設定する
     */
    public void setMainMarkLessThanEqual(String mainMarkLessThanEqual) {
        this.mainMarkLessThanEqual = mainMarkLessThanEqual;
    }

    /**
     * mainMarkLikeFront のゲッターメソッドです。
     * 
     * @return the mainMarkLikeFront
     */
    public String getMainMarkLikeFront() {
        return mainMarkLikeFront;
    }

    /**
     * mainMarkLikeFront のセッターメソッドです。
     * 
     * @param mainMarkLikeFront mainMarkLikeFront に設定する
     */
    public void setMainMarkLikeFront(String mainMarkLikeFront) {
        this.mainMarkLikeFront = mainMarkLikeFront;
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
     * expPackingIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmGreaterThan
     */
    public String getExpPackingIssuerNmGreaterThan() {
        return expPackingIssuerNmGreaterThan;
    }

    /**
     * expPackingIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param expPackingIssuerNmGreaterThan expPackingIssuerNmGreaterThan に設定する
     */
    public void setExpPackingIssuerNmGreaterThan(String expPackingIssuerNmGreaterThan) {
        this.expPackingIssuerNmGreaterThan = expPackingIssuerNmGreaterThan;
    }

    /**
     * expPackingIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmGreaterThanEqual
     */
    public String getExpPackingIssuerNmGreaterThanEqual() {
        return expPackingIssuerNmGreaterThanEqual;
    }

    /**
     * expPackingIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param expPackingIssuerNmGreaterThanEqual expPackingIssuerNmGreaterThanEqual に設定する
     */
    public void setExpPackingIssuerNmGreaterThanEqual(String expPackingIssuerNmGreaterThanEqual) {
        this.expPackingIssuerNmGreaterThanEqual = expPackingIssuerNmGreaterThanEqual;
    }

    /**
     * expPackingIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmLessThan
     */
    public String getExpPackingIssuerNmLessThan() {
        return expPackingIssuerNmLessThan;
    }

    /**
     * expPackingIssuerNmLessThan のセッターメソッドです。
     * 
     * @param expPackingIssuerNmLessThan expPackingIssuerNmLessThan に設定する
     */
    public void setExpPackingIssuerNmLessThan(String expPackingIssuerNmLessThan) {
        this.expPackingIssuerNmLessThan = expPackingIssuerNmLessThan;
    }

    /**
     * expPackingIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmLessThanEqual
     */
    public String getExpPackingIssuerNmLessThanEqual() {
        return expPackingIssuerNmLessThanEqual;
    }

    /**
     * expPackingIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param expPackingIssuerNmLessThanEqual expPackingIssuerNmLessThanEqual に設定する
     */
    public void setExpPackingIssuerNmLessThanEqual(String expPackingIssuerNmLessThanEqual) {
        this.expPackingIssuerNmLessThanEqual = expPackingIssuerNmLessThanEqual;
    }

    /**
     * expPackingIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmLikeFront
     */
    public String getExpPackingIssuerNmLikeFront() {
        return expPackingIssuerNmLikeFront;
    }

    /**
     * expPackingIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param expPackingIssuerNmLikeFront expPackingIssuerNmLikeFront に設定する
     */
    public void setExpPackingIssuerNmLikeFront(String expPackingIssuerNmLikeFront) {
        this.expPackingIssuerNmLikeFront = expPackingIssuerNmLikeFront;
    }

    /**
     * palletNoGreaterThan のゲッターメソッドです。
     * 
     * @return the palletNoGreaterThan
     */
    public String getPalletNoGreaterThan() {
        return palletNoGreaterThan;
    }

    /**
     * palletNoGreaterThan のセッターメソッドです。
     * 
     * @param palletNoGreaterThan palletNoGreaterThan に設定する
     */
    public void setPalletNoGreaterThan(String palletNoGreaterThan) {
        this.palletNoGreaterThan = palletNoGreaterThan;
    }

    /**
     * palletNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the palletNoGreaterThanEqual
     */
    public String getPalletNoGreaterThanEqual() {
        return palletNoGreaterThanEqual;
    }

    /**
     * palletNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param palletNoGreaterThanEqual palletNoGreaterThanEqual に設定する
     */
    public void setPalletNoGreaterThanEqual(String palletNoGreaterThanEqual) {
        this.palletNoGreaterThanEqual = palletNoGreaterThanEqual;
    }

    /**
     * palletNoLessThan のゲッターメソッドです。
     * 
     * @return the palletNoLessThan
     */
    public String getPalletNoLessThan() {
        return palletNoLessThan;
    }

    /**
     * palletNoLessThan のセッターメソッドです。
     * 
     * @param palletNoLessThan palletNoLessThan に設定する
     */
    public void setPalletNoLessThan(String palletNoLessThan) {
        this.palletNoLessThan = palletNoLessThan;
    }

    /**
     * palletNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the palletNoLessThanEqual
     */
    public String getPalletNoLessThanEqual() {
        return palletNoLessThanEqual;
    }

    /**
     * palletNoLessThanEqual のセッターメソッドです。
     * 
     * @param palletNoLessThanEqual palletNoLessThanEqual に設定する
     */
    public void setPalletNoLessThanEqual(String palletNoLessThanEqual) {
        this.palletNoLessThanEqual = palletNoLessThanEqual;
    }

    /**
     * palletNoLikeFront のゲッターメソッドです。
     * 
     * @return the palletNoLikeFront
     */
    public String getPalletNoLikeFront() {
        return palletNoLikeFront;
    }

    /**
     * palletNoLikeFront のセッターメソッドです。
     * 
     * @param palletNoLikeFront palletNoLikeFront に設定する
     */
    public void setPalletNoLikeFront(String palletNoLikeFront) {
        this.palletNoLikeFront = palletNoLikeFront;
    }

    /**
     * cmlTypGreaterThan のゲッターメソッドです。
     * 
     * @return the cmlTypGreaterThan
     */
    public String getCmlTypGreaterThan() {
        return cmlTypGreaterThan;
    }

    /**
     * cmlTypGreaterThan のセッターメソッドです。
     * 
     * @param cmlTypGreaterThan cmlTypGreaterThan に設定する
     */
    public void setCmlTypGreaterThan(String cmlTypGreaterThan) {
        this.cmlTypGreaterThan = cmlTypGreaterThan;
    }

    /**
     * cmlTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cmlTypGreaterThanEqual
     */
    public String getCmlTypGreaterThanEqual() {
        return cmlTypGreaterThanEqual;
    }

    /**
     * cmlTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param cmlTypGreaterThanEqual cmlTypGreaterThanEqual に設定する
     */
    public void setCmlTypGreaterThanEqual(String cmlTypGreaterThanEqual) {
        this.cmlTypGreaterThanEqual = cmlTypGreaterThanEqual;
    }

    /**
     * cmlTypLessThan のゲッターメソッドです。
     * 
     * @return the cmlTypLessThan
     */
    public String getCmlTypLessThan() {
        return cmlTypLessThan;
    }

    /**
     * cmlTypLessThan のセッターメソッドです。
     * 
     * @param cmlTypLessThan cmlTypLessThan に設定する
     */
    public void setCmlTypLessThan(String cmlTypLessThan) {
        this.cmlTypLessThan = cmlTypLessThan;
    }

    /**
     * cmlTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the cmlTypLessThanEqual
     */
    public String getCmlTypLessThanEqual() {
        return cmlTypLessThanEqual;
    }

    /**
     * cmlTypLessThanEqual のセッターメソッドです。
     * 
     * @param cmlTypLessThanEqual cmlTypLessThanEqual に設定する
     */
    public void setCmlTypLessThanEqual(String cmlTypLessThanEqual) {
        this.cmlTypLessThanEqual = cmlTypLessThanEqual;
    }

    /**
     * cmlTypLikeFront のゲッターメソッドです。
     * 
     * @return the cmlTypLikeFront
     */
    public String getCmlTypLikeFront() {
        return cmlTypLikeFront;
    }

    /**
     * cmlTypLikeFront のセッターメソッドです。
     * 
     * @param cmlTypLikeFront cmlTypLikeFront に設定する
     */
    public void setCmlTypLikeFront(String cmlTypLikeFront) {
        this.cmlTypLikeFront = cmlTypLikeFront;
    }

    /**
     * pkgFormTypGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgFormTypGreaterThan
     */
    public String getPkgFormTypGreaterThan() {
        return pkgFormTypGreaterThan;
    }

    /**
     * pkgFormTypGreaterThan のセッターメソッドです。
     * 
     * @param pkgFormTypGreaterThan pkgFormTypGreaterThan に設定する
     */
    public void setPkgFormTypGreaterThan(String pkgFormTypGreaterThan) {
        this.pkgFormTypGreaterThan = pkgFormTypGreaterThan;
    }

    /**
     * pkgFormTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgFormTypGreaterThanEqual
     */
    public String getPkgFormTypGreaterThanEqual() {
        return pkgFormTypGreaterThanEqual;
    }

    /**
     * pkgFormTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgFormTypGreaterThanEqual pkgFormTypGreaterThanEqual に設定する
     */
    public void setPkgFormTypGreaterThanEqual(String pkgFormTypGreaterThanEqual) {
        this.pkgFormTypGreaterThanEqual = pkgFormTypGreaterThanEqual;
    }

    /**
     * pkgFormTypLessThan のゲッターメソッドです。
     * 
     * @return the pkgFormTypLessThan
     */
    public String getPkgFormTypLessThan() {
        return pkgFormTypLessThan;
    }

    /**
     * pkgFormTypLessThan のセッターメソッドです。
     * 
     * @param pkgFormTypLessThan pkgFormTypLessThan に設定する
     */
    public void setPkgFormTypLessThan(String pkgFormTypLessThan) {
        this.pkgFormTypLessThan = pkgFormTypLessThan;
    }

    /**
     * pkgFormTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgFormTypLessThanEqual
     */
    public String getPkgFormTypLessThanEqual() {
        return pkgFormTypLessThanEqual;
    }

    /**
     * pkgFormTypLessThanEqual のセッターメソッドです。
     * 
     * @param pkgFormTypLessThanEqual pkgFormTypLessThanEqual に設定する
     */
    public void setPkgFormTypLessThanEqual(String pkgFormTypLessThanEqual) {
        this.pkgFormTypLessThanEqual = pkgFormTypLessThanEqual;
    }

    /**
     * pkgFormTypLikeFront のゲッターメソッドです。
     * 
     * @return the pkgFormTypLikeFront
     */
    public String getPkgFormTypLikeFront() {
        return pkgFormTypLikeFront;
    }

    /**
     * pkgFormTypLikeFront のセッターメソッドです。
     * 
     * @param pkgFormTypLikeFront pkgFormTypLikeFront に設定する
     */
    public void setPkgFormTypLikeFront(String pkgFormTypLikeFront) {
        this.pkgFormTypLikeFront = pkgFormTypLikeFront;
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
     * loadingCdGreaterThan のゲッターメソッドです。
     * 
     * @return the loadingCdGreaterThan
     */
    public String getLoadingCdGreaterThan() {
        return loadingCdGreaterThan;
    }

    /**
     * loadingCdGreaterThan のセッターメソッドです。
     * 
     * @param loadingCdGreaterThan loadingCdGreaterThan に設定する
     */
    public void setLoadingCdGreaterThan(String loadingCdGreaterThan) {
        this.loadingCdGreaterThan = loadingCdGreaterThan;
    }

    /**
     * loadingCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the loadingCdGreaterThanEqual
     */
    public String getLoadingCdGreaterThanEqual() {
        return loadingCdGreaterThanEqual;
    }

    /**
     * loadingCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param loadingCdGreaterThanEqual loadingCdGreaterThanEqual に設定する
     */
    public void setLoadingCdGreaterThanEqual(String loadingCdGreaterThanEqual) {
        this.loadingCdGreaterThanEqual = loadingCdGreaterThanEqual;
    }

    /**
     * loadingCdLessThan のゲッターメソッドです。
     * 
     * @return the loadingCdLessThan
     */
    public String getLoadingCdLessThan() {
        return loadingCdLessThan;
    }

    /**
     * loadingCdLessThan のセッターメソッドです。
     * 
     * @param loadingCdLessThan loadingCdLessThan に設定する
     */
    public void setLoadingCdLessThan(String loadingCdLessThan) {
        this.loadingCdLessThan = loadingCdLessThan;
    }

    /**
     * loadingCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the loadingCdLessThanEqual
     */
    public String getLoadingCdLessThanEqual() {
        return loadingCdLessThanEqual;
    }

    /**
     * loadingCdLessThanEqual のセッターメソッドです。
     * 
     * @param loadingCdLessThanEqual loadingCdLessThanEqual に設定する
     */
    public void setLoadingCdLessThanEqual(String loadingCdLessThanEqual) {
        this.loadingCdLessThanEqual = loadingCdLessThanEqual;
    }

    /**
     * loadingCdLikeFront のゲッターメソッドです。
     * 
     * @return the loadingCdLikeFront
     */
    public String getLoadingCdLikeFront() {
        return loadingCdLikeFront;
    }

    /**
     * loadingCdLikeFront のセッターメソッドです。
     * 
     * @param loadingCdLikeFront loadingCdLikeFront に設定する
     */
    public void setLoadingCdLikeFront(String loadingCdLikeFront) {
        this.loadingCdLikeFront = loadingCdLikeFront;
    }

    /**
     * dngrItemFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the dngrItemFlgGreaterThan
     */
    public String getDngrItemFlgGreaterThan() {
        return dngrItemFlgGreaterThan;
    }

    /**
     * dngrItemFlgGreaterThan のセッターメソッドです。
     * 
     * @param dngrItemFlgGreaterThan dngrItemFlgGreaterThan に設定する
     */
    public void setDngrItemFlgGreaterThan(String dngrItemFlgGreaterThan) {
        this.dngrItemFlgGreaterThan = dngrItemFlgGreaterThan;
    }

    /**
     * dngrItemFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dngrItemFlgGreaterThanEqual
     */
    public String getDngrItemFlgGreaterThanEqual() {
        return dngrItemFlgGreaterThanEqual;
    }

    /**
     * dngrItemFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param dngrItemFlgGreaterThanEqual dngrItemFlgGreaterThanEqual に設定する
     */
    public void setDngrItemFlgGreaterThanEqual(String dngrItemFlgGreaterThanEqual) {
        this.dngrItemFlgGreaterThanEqual = dngrItemFlgGreaterThanEqual;
    }

    /**
     * dngrItemFlgLessThan のゲッターメソッドです。
     * 
     * @return the dngrItemFlgLessThan
     */
    public String getDngrItemFlgLessThan() {
        return dngrItemFlgLessThan;
    }

    /**
     * dngrItemFlgLessThan のセッターメソッドです。
     * 
     * @param dngrItemFlgLessThan dngrItemFlgLessThan に設定する
     */
    public void setDngrItemFlgLessThan(String dngrItemFlgLessThan) {
        this.dngrItemFlgLessThan = dngrItemFlgLessThan;
    }

    /**
     * dngrItemFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the dngrItemFlgLessThanEqual
     */
    public String getDngrItemFlgLessThanEqual() {
        return dngrItemFlgLessThanEqual;
    }

    /**
     * dngrItemFlgLessThanEqual のセッターメソッドです。
     * 
     * @param dngrItemFlgLessThanEqual dngrItemFlgLessThanEqual に設定する
     */
    public void setDngrItemFlgLessThanEqual(String dngrItemFlgLessThanEqual) {
        this.dngrItemFlgLessThanEqual = dngrItemFlgLessThanEqual;
    }

    /**
     * dngrItemFlgLikeFront のゲッターメソッドです。
     * 
     * @return the dngrItemFlgLikeFront
     */
    public String getDngrItemFlgLikeFront() {
        return dngrItemFlgLikeFront;
    }

    /**
     * dngrItemFlgLikeFront のセッターメソッドです。
     * 
     * @param dngrItemFlgLikeFront dngrItemFlgLikeFront に設定する
     */
    public void setDngrItemFlgLikeFront(String dngrItemFlgLikeFront) {
        this.dngrItemFlgLikeFront = dngrItemFlgLikeFront;
    }

    /**
     * customTimingTypGreaterThan のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThan
     */
    public String getCustomTimingTypGreaterThan() {
        return customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThan のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThan customTimingTypGreaterThan に設定する
     */
    public void setCustomTimingTypGreaterThan(String customTimingTypGreaterThan) {
        this.customTimingTypGreaterThan = customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThanEqual
     */
    public String getCustomTimingTypGreaterThanEqual() {
        return customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThanEqual customTimingTypGreaterThanEqual に設定する
     */
    public void setCustomTimingTypGreaterThanEqual(String customTimingTypGreaterThanEqual) {
        this.customTimingTypGreaterThanEqual = customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypLessThan のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThan
     */
    public String getCustomTimingTypLessThan() {
        return customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThan のセッターメソッドです。
     * 
     * @param customTimingTypLessThan customTimingTypLessThan に設定する
     */
    public void setCustomTimingTypLessThan(String customTimingTypLessThan) {
        this.customTimingTypLessThan = customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThanEqual
     */
    public String getCustomTimingTypLessThanEqual() {
        return customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLessThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypLessThanEqual customTimingTypLessThanEqual に設定する
     */
    public void setCustomTimingTypLessThanEqual(String customTimingTypLessThanEqual) {
        this.customTimingTypLessThanEqual = customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLikeFront のゲッターメソッドです。
     * 
     * @return the customTimingTypLikeFront
     */
    public String getCustomTimingTypLikeFront() {
        return customTimingTypLikeFront;
    }

    /**
     * customTimingTypLikeFront のセッターメソッドです。
     * 
     * @param customTimingTypLikeFront customTimingTypLikeFront に設定する
     */
    public void setCustomTimingTypLikeFront(String customTimingTypLikeFront) {
        this.customTimingTypLikeFront = customTimingTypLikeFront;
    }

    /**
     * stgInstrItemFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgGreaterThan
     */
    public String getStgInstrItemFlgGreaterThan() {
        return stgInstrItemFlgGreaterThan;
    }

    /**
     * stgInstrItemFlgGreaterThan のセッターメソッドです。
     * 
     * @param stgInstrItemFlgGreaterThan stgInstrItemFlgGreaterThan に設定する
     */
    public void setStgInstrItemFlgGreaterThan(String stgInstrItemFlgGreaterThan) {
        this.stgInstrItemFlgGreaterThan = stgInstrItemFlgGreaterThan;
    }

    /**
     * stgInstrItemFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgGreaterThanEqual
     */
    public String getStgInstrItemFlgGreaterThanEqual() {
        return stgInstrItemFlgGreaterThanEqual;
    }

    /**
     * stgInstrItemFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgInstrItemFlgGreaterThanEqual stgInstrItemFlgGreaterThanEqual に設定する
     */
    public void setStgInstrItemFlgGreaterThanEqual(String stgInstrItemFlgGreaterThanEqual) {
        this.stgInstrItemFlgGreaterThanEqual = stgInstrItemFlgGreaterThanEqual;
    }

    /**
     * stgInstrItemFlgLessThan のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgLessThan
     */
    public String getStgInstrItemFlgLessThan() {
        return stgInstrItemFlgLessThan;
    }

    /**
     * stgInstrItemFlgLessThan のセッターメソッドです。
     * 
     * @param stgInstrItemFlgLessThan stgInstrItemFlgLessThan に設定する
     */
    public void setStgInstrItemFlgLessThan(String stgInstrItemFlgLessThan) {
        this.stgInstrItemFlgLessThan = stgInstrItemFlgLessThan;
    }

    /**
     * stgInstrItemFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgLessThanEqual
     */
    public String getStgInstrItemFlgLessThanEqual() {
        return stgInstrItemFlgLessThanEqual;
    }

    /**
     * stgInstrItemFlgLessThanEqual のセッターメソッドです。
     * 
     * @param stgInstrItemFlgLessThanEqual stgInstrItemFlgLessThanEqual に設定する
     */
    public void setStgInstrItemFlgLessThanEqual(String stgInstrItemFlgLessThanEqual) {
        this.stgInstrItemFlgLessThanEqual = stgInstrItemFlgLessThanEqual;
    }

    /**
     * stgInstrItemFlgLikeFront のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgLikeFront
     */
    public String getStgInstrItemFlgLikeFront() {
        return stgInstrItemFlgLikeFront;
    }

    /**
     * stgInstrItemFlgLikeFront のセッターメソッドです。
     * 
     * @param stgInstrItemFlgLikeFront stgInstrItemFlgLikeFront に設定する
     */
    public void setStgInstrItemFlgLikeFront(String stgInstrItemFlgLikeFront) {
        this.stgInstrItemFlgLikeFront = stgInstrItemFlgLikeFront;
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
     * dueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dueDtGreaterThanEqual
     */
    public Date getDueDtGreaterThanEqual() {
        return dueDtGreaterThanEqual;
    }

    /**
     * dueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param dueDtGreaterThanEqual dueDtGreaterThanEqual に設定する
     */
    public void setDueDtGreaterThanEqual(Date dueDtGreaterThanEqual) {
        this.dueDtGreaterThanEqual = dueDtGreaterThanEqual;
    }

    /**
     * dueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the dueDtLessThanEqual
     */
    public Date getDueDtLessThanEqual() {
        return dueDtLessThanEqual;
    }

    /**
     * dueDtLessThanEqual のセッターメソッドです。
     * 
     * @param dueDtLessThanEqual dueDtLessThanEqual に設定する
     */
    public void setDueDtLessThanEqual(Date dueDtLessThanEqual) {
        this.dueDtLessThanEqual = dueDtLessThanEqual;
    }

    /**
     * migrationFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the migrationFlgGreaterThan
     */
    public String getMigrationFlgGreaterThan() {
        return migrationFlgGreaterThan;
    }

    /**
     * migrationFlgGreaterThan のセッターメソッドです。
     * 
     * @param migrationFlgGreaterThan migrationFlgGreaterThan に設定する
     */
    public void setMigrationFlgGreaterThan(String migrationFlgGreaterThan) {
        this.migrationFlgGreaterThan = migrationFlgGreaterThan;
    }

    /**
     * migrationFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the migrationFlgGreaterThanEqual
     */
    public String getMigrationFlgGreaterThanEqual() {
        return migrationFlgGreaterThanEqual;
    }

    /**
     * migrationFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param migrationFlgGreaterThanEqual migrationFlgGreaterThanEqual に設定する
     */
    public void setMigrationFlgGreaterThanEqual(String migrationFlgGreaterThanEqual) {
        this.migrationFlgGreaterThanEqual = migrationFlgGreaterThanEqual;
    }

    /**
     * migrationFlgLessThan のゲッターメソッドです。
     * 
     * @return the migrationFlgLessThan
     */
    public String getMigrationFlgLessThan() {
        return migrationFlgLessThan;
    }

    /**
     * migrationFlgLessThan のセッターメソッドです。
     * 
     * @param migrationFlgLessThan migrationFlgLessThan に設定する
     */
    public void setMigrationFlgLessThan(String migrationFlgLessThan) {
        this.migrationFlgLessThan = migrationFlgLessThan;
    }

    /**
     * migrationFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the migrationFlgLessThanEqual
     */
    public String getMigrationFlgLessThanEqual() {
        return migrationFlgLessThanEqual;
    }

    /**
     * migrationFlgLessThanEqual のセッターメソッドです。
     * 
     * @param migrationFlgLessThanEqual migrationFlgLessThanEqual に設定する
     */
    public void setMigrationFlgLessThanEqual(String migrationFlgLessThanEqual) {
        this.migrationFlgLessThanEqual = migrationFlgLessThanEqual;
    }

    /**
     * migrationFlgLikeFront のゲッターメソッドです。
     * 
     * @return the migrationFlgLikeFront
     */
    public String getMigrationFlgLikeFront() {
        return migrationFlgLikeFront;
    }

    /**
     * migrationFlgLikeFront のセッターメソッドです。
     * 
     * @param migrationFlgLikeFront migrationFlgLikeFront に設定する
     */
    public void setMigrationFlgLikeFront(String migrationFlgLikeFront) {
        this.migrationFlgLikeFront = migrationFlgLikeFront;
    }

    /**
     * oldQrMixTypGreaterThan のゲッターメソッドです。
     * 
     * @return the oldQrMixTypGreaterThan
     */
    public String getOldQrMixTypGreaterThan() {
        return oldQrMixTypGreaterThan;
    }

    /**
     * oldQrMixTypGreaterThan のセッターメソッドです。
     * 
     * @param oldQrMixTypGreaterThan oldQrMixTypGreaterThan に設定する
     */
    public void setOldQrMixTypGreaterThan(String oldQrMixTypGreaterThan) {
        this.oldQrMixTypGreaterThan = oldQrMixTypGreaterThan;
    }

    /**
     * oldQrMixTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the oldQrMixTypGreaterThanEqual
     */
    public String getOldQrMixTypGreaterThanEqual() {
        return oldQrMixTypGreaterThanEqual;
    }

    /**
     * oldQrMixTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param oldQrMixTypGreaterThanEqual oldQrMixTypGreaterThanEqual に設定する
     */
    public void setOldQrMixTypGreaterThanEqual(String oldQrMixTypGreaterThanEqual) {
        this.oldQrMixTypGreaterThanEqual = oldQrMixTypGreaterThanEqual;
    }

    /**
     * oldQrMixTypLessThan のゲッターメソッドです。
     * 
     * @return the oldQrMixTypLessThan
     */
    public String getOldQrMixTypLessThan() {
        return oldQrMixTypLessThan;
    }

    /**
     * oldQrMixTypLessThan のセッターメソッドです。
     * 
     * @param oldQrMixTypLessThan oldQrMixTypLessThan に設定する
     */
    public void setOldQrMixTypLessThan(String oldQrMixTypLessThan) {
        this.oldQrMixTypLessThan = oldQrMixTypLessThan;
    }

    /**
     * oldQrMixTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the oldQrMixTypLessThanEqual
     */
    public String getOldQrMixTypLessThanEqual() {
        return oldQrMixTypLessThanEqual;
    }

    /**
     * oldQrMixTypLessThanEqual のセッターメソッドです。
     * 
     * @param oldQrMixTypLessThanEqual oldQrMixTypLessThanEqual に設定する
     */
    public void setOldQrMixTypLessThanEqual(String oldQrMixTypLessThanEqual) {
        this.oldQrMixTypLessThanEqual = oldQrMixTypLessThanEqual;
    }

    /**
     * oldQrMixTypLikeFront のゲッターメソッドです。
     * 
     * @return the oldQrMixTypLikeFront
     */
    public String getOldQrMixTypLikeFront() {
        return oldQrMixTypLikeFront;
    }

    /**
     * oldQrMixTypLikeFront のセッターメソッドです。
     * 
     * @param oldQrMixTypLikeFront oldQrMixTypLikeFront に設定する
     */
    public void setOldQrMixTypLikeFront(String oldQrMixTypLikeFront) {
        this.oldQrMixTypLikeFront = oldQrMixTypLikeFront;
    }

    /**
     * oldQrContainerGrpCdGreaterThan のゲッターメソッドです。
     * 
     * @return the oldQrContainerGrpCdGreaterThan
     */
    public String getOldQrContainerGrpCdGreaterThan() {
        return oldQrContainerGrpCdGreaterThan;
    }

    /**
     * oldQrContainerGrpCdGreaterThan のセッターメソッドです。
     * 
     * @param oldQrContainerGrpCdGreaterThan oldQrContainerGrpCdGreaterThan に設定する
     */
    public void setOldQrContainerGrpCdGreaterThan(String oldQrContainerGrpCdGreaterThan) {
        this.oldQrContainerGrpCdGreaterThan = oldQrContainerGrpCdGreaterThan;
    }

    /**
     * oldQrContainerGrpCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the oldQrContainerGrpCdGreaterThanEqual
     */
    public String getOldQrContainerGrpCdGreaterThanEqual() {
        return oldQrContainerGrpCdGreaterThanEqual;
    }

    /**
     * oldQrContainerGrpCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param oldQrContainerGrpCdGreaterThanEqual oldQrContainerGrpCdGreaterThanEqual に設定する
     */
    public void setOldQrContainerGrpCdGreaterThanEqual(String oldQrContainerGrpCdGreaterThanEqual) {
        this.oldQrContainerGrpCdGreaterThanEqual = oldQrContainerGrpCdGreaterThanEqual;
    }

    /**
     * oldQrContainerGrpCdLessThan のゲッターメソッドです。
     * 
     * @return the oldQrContainerGrpCdLessThan
     */
    public String getOldQrContainerGrpCdLessThan() {
        return oldQrContainerGrpCdLessThan;
    }

    /**
     * oldQrContainerGrpCdLessThan のセッターメソッドです。
     * 
     * @param oldQrContainerGrpCdLessThan oldQrContainerGrpCdLessThan に設定する
     */
    public void setOldQrContainerGrpCdLessThan(String oldQrContainerGrpCdLessThan) {
        this.oldQrContainerGrpCdLessThan = oldQrContainerGrpCdLessThan;
    }

    /**
     * oldQrContainerGrpCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the oldQrContainerGrpCdLessThanEqual
     */
    public String getOldQrContainerGrpCdLessThanEqual() {
        return oldQrContainerGrpCdLessThanEqual;
    }

    /**
     * oldQrContainerGrpCdLessThanEqual のセッターメソッドです。
     * 
     * @param oldQrContainerGrpCdLessThanEqual oldQrContainerGrpCdLessThanEqual に設定する
     */
    public void setOldQrContainerGrpCdLessThanEqual(String oldQrContainerGrpCdLessThanEqual) {
        this.oldQrContainerGrpCdLessThanEqual = oldQrContainerGrpCdLessThanEqual;
    }

    /**
     * oldQrContainerGrpCdLikeFront のゲッターメソッドです。
     * 
     * @return the oldQrContainerGrpCdLikeFront
     */
    public String getOldQrContainerGrpCdLikeFront() {
        return oldQrContainerGrpCdLikeFront;
    }

    /**
     * oldQrContainerGrpCdLikeFront のセッターメソッドです。
     * 
     * @param oldQrContainerGrpCdLikeFront oldQrContainerGrpCdLikeFront に設定する
     */
    public void setOldQrContainerGrpCdLikeFront(String oldQrContainerGrpCdLikeFront) {
        this.oldQrContainerGrpCdLikeFront = oldQrContainerGrpCdLikeFront;
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
     * lgcyWhCdGreaterThan のゲッターメソッドです。
     * 
     * @return the lgcyWhCdGreaterThan
     */
    public String getLgcyWhCdGreaterThan() {
        return lgcyWhCdGreaterThan;
    }

    /**
     * lgcyWhCdGreaterThan のセッターメソッドです。
     * 
     * @param lgcyWhCdGreaterThan lgcyWhCdGreaterThan に設定する
     */
    public void setLgcyWhCdGreaterThan(String lgcyWhCdGreaterThan) {
        this.lgcyWhCdGreaterThan = lgcyWhCdGreaterThan;
    }

    /**
     * lgcyWhCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyWhCdGreaterThanEqual
     */
    public String getLgcyWhCdGreaterThanEqual() {
        return lgcyWhCdGreaterThanEqual;
    }

    /**
     * lgcyWhCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param lgcyWhCdGreaterThanEqual lgcyWhCdGreaterThanEqual に設定する
     */
    public void setLgcyWhCdGreaterThanEqual(String lgcyWhCdGreaterThanEqual) {
        this.lgcyWhCdGreaterThanEqual = lgcyWhCdGreaterThanEqual;
    }

    /**
     * lgcyWhCdLessThan のゲッターメソッドです。
     * 
     * @return the lgcyWhCdLessThan
     */
    public String getLgcyWhCdLessThan() {
        return lgcyWhCdLessThan;
    }

    /**
     * lgcyWhCdLessThan のセッターメソッドです。
     * 
     * @param lgcyWhCdLessThan lgcyWhCdLessThan に設定する
     */
    public void setLgcyWhCdLessThan(String lgcyWhCdLessThan) {
        this.lgcyWhCdLessThan = lgcyWhCdLessThan;
    }

    /**
     * lgcyWhCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyWhCdLessThanEqual
     */
    public String getLgcyWhCdLessThanEqual() {
        return lgcyWhCdLessThanEqual;
    }

    /**
     * lgcyWhCdLessThanEqual のセッターメソッドです。
     * 
     * @param lgcyWhCdLessThanEqual lgcyWhCdLessThanEqual に設定する
     */
    public void setLgcyWhCdLessThanEqual(String lgcyWhCdLessThanEqual) {
        this.lgcyWhCdLessThanEqual = lgcyWhCdLessThanEqual;
    }

    /**
     * lgcyWhCdLikeFront のゲッターメソッドです。
     * 
     * @return the lgcyWhCdLikeFront
     */
    public String getLgcyWhCdLikeFront() {
        return lgcyWhCdLikeFront;
    }

    /**
     * lgcyWhCdLikeFront のセッターメソッドです。
     * 
     * @param lgcyWhCdLikeFront lgcyWhCdLikeFront に設定する
     */
    public void setLgcyWhCdLikeFront(String lgcyWhCdLikeFront) {
        this.lgcyWhCdLikeFront = lgcyWhCdLikeFront;
    }

    /**
     * shipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThan
     */
    public String getShipperCdGreaterThan() {
        return shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThan のセッターメソッドです。
     * 
     * @param shipperCdGreaterThan shipperCdGreaterThan に設定する
     */
    public void setShipperCdGreaterThan(String shipperCdGreaterThan) {
        this.shipperCdGreaterThan = shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThanEqual
     */
    public String getShipperCdGreaterThanEqual() {
        return shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCdGreaterThanEqual shipperCdGreaterThanEqual に設定する
     */
    public void setShipperCdGreaterThanEqual(String shipperCdGreaterThanEqual) {
        this.shipperCdGreaterThanEqual = shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdLessThan のゲッターメソッドです。
     * 
     * @return the shipperCdLessThan
     */
    public String getShipperCdLessThan() {
        return shipperCdLessThan;
    }

    /**
     * shipperCdLessThan のセッターメソッドです。
     * 
     * @param shipperCdLessThan shipperCdLessThan に設定する
     */
    public void setShipperCdLessThan(String shipperCdLessThan) {
        this.shipperCdLessThan = shipperCdLessThan;
    }

    /**
     * shipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdLessThanEqual
     */
    public String getShipperCdLessThanEqual() {
        return shipperCdLessThanEqual;
    }

    /**
     * shipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipperCdLessThanEqual shipperCdLessThanEqual に設定する
     */
    public void setShipperCdLessThanEqual(String shipperCdLessThanEqual) {
        this.shipperCdLessThanEqual = shipperCdLessThanEqual;
    }

    /**
     * shipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipperCdLikeFront
     */
    public String getShipperCdLikeFront() {
        return shipperCdLikeFront;
    }

    /**
     * shipperCdLikeFront のセッターメソッドです。
     * 
     * @param shipperCdLikeFront shipperCdLikeFront に設定する
     */
    public void setShipperCdLikeFront(String shipperCdLikeFront) {
        this.shipperCdLikeFront = shipperCdLikeFront;
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
     * unitDispGreaterThan のゲッターメソッドです。
     * 
     * @return the unitDispGreaterThan
     */
    public String getUnitDispGreaterThan() {
        return unitDispGreaterThan;
    }

    /**
     * unitDispGreaterThan のセッターメソッドです。
     * 
     * @param unitDispGreaterThan unitDispGreaterThan に設定する
     */
    public void setUnitDispGreaterThan(String unitDispGreaterThan) {
        this.unitDispGreaterThan = unitDispGreaterThan;
    }

    /**
     * unitDispGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the unitDispGreaterThanEqual
     */
    public String getUnitDispGreaterThanEqual() {
        return unitDispGreaterThanEqual;
    }

    /**
     * unitDispGreaterThanEqual のセッターメソッドです。
     * 
     * @param unitDispGreaterThanEqual unitDispGreaterThanEqual に設定する
     */
    public void setUnitDispGreaterThanEqual(String unitDispGreaterThanEqual) {
        this.unitDispGreaterThanEqual = unitDispGreaterThanEqual;
    }

    /**
     * unitDispLessThan のゲッターメソッドです。
     * 
     * @return the unitDispLessThan
     */
    public String getUnitDispLessThan() {
        return unitDispLessThan;
    }

    /**
     * unitDispLessThan のセッターメソッドです。
     * 
     * @param unitDispLessThan unitDispLessThan に設定する
     */
    public void setUnitDispLessThan(String unitDispLessThan) {
        this.unitDispLessThan = unitDispLessThan;
    }

    /**
     * unitDispLessThanEqual のゲッターメソッドです。
     * 
     * @return the unitDispLessThanEqual
     */
    public String getUnitDispLessThanEqual() {
        return unitDispLessThanEqual;
    }

    /**
     * unitDispLessThanEqual のセッターメソッドです。
     * 
     * @param unitDispLessThanEqual unitDispLessThanEqual に設定する
     */
    public void setUnitDispLessThanEqual(String unitDispLessThanEqual) {
        this.unitDispLessThanEqual = unitDispLessThanEqual;
    }

    /**
     * unitDispLikeFront のゲッターメソッドです。
     * 
     * @return the unitDispLikeFront
     */
    public String getUnitDispLikeFront() {
        return unitDispLikeFront;
    }

    /**
     * unitDispLikeFront のセッターメソッドです。
     * 
     * @param unitDispLikeFront unitDispLikeFront に設定する
     */
    public void setUnitDispLikeFront(String unitDispLikeFront) {
        this.unitDispLikeFront = unitDispLikeFront;
    }

    /**
     * compNmGreaterThan のゲッターメソッドです。
     * 
     * @return the compNmGreaterThan
     */
    public String getCompNmGreaterThan() {
        return compNmGreaterThan;
    }

    /**
     * compNmGreaterThan のセッターメソッドです。
     * 
     * @param compNmGreaterThan compNmGreaterThan に設定する
     */
    public void setCompNmGreaterThan(String compNmGreaterThan) {
        this.compNmGreaterThan = compNmGreaterThan;
    }

    /**
     * compNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compNmGreaterThanEqual
     */
    public String getCompNmGreaterThanEqual() {
        return compNmGreaterThanEqual;
    }

    /**
     * compNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param compNmGreaterThanEqual compNmGreaterThanEqual に設定する
     */
    public void setCompNmGreaterThanEqual(String compNmGreaterThanEqual) {
        this.compNmGreaterThanEqual = compNmGreaterThanEqual;
    }

    /**
     * compNmLessThan のゲッターメソッドです。
     * 
     * @return the compNmLessThan
     */
    public String getCompNmLessThan() {
        return compNmLessThan;
    }

    /**
     * compNmLessThan のセッターメソッドです。
     * 
     * @param compNmLessThan compNmLessThan に設定する
     */
    public void setCompNmLessThan(String compNmLessThan) {
        this.compNmLessThan = compNmLessThan;
    }

    /**
     * compNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the compNmLessThanEqual
     */
    public String getCompNmLessThanEqual() {
        return compNmLessThanEqual;
    }

    /**
     * compNmLessThanEqual のセッターメソッドです。
     * 
     * @param compNmLessThanEqual compNmLessThanEqual に設定する
     */
    public void setCompNmLessThanEqual(String compNmLessThanEqual) {
        this.compNmLessThanEqual = compNmLessThanEqual;
    }

    /**
     * compNmLikeFront のゲッターメソッドです。
     * 
     * @return the compNmLikeFront
     */
    public String getCompNmLikeFront() {
        return compNmLikeFront;
    }

    /**
     * compNmLikeFront のセッターメソッドです。
     * 
     * @param compNmLikeFront compNmLikeFront に設定する
     */
    public void setCompNmLikeFront(String compNmLikeFront) {
        this.compNmLikeFront = compNmLikeFront;
    }

    /**
     * compNm1GreaterThan のゲッターメソッドです。
     * 
     * @return the compNm1GreaterThan
     */
    public String getCompNm1GreaterThan() {
        return compNm1GreaterThan;
    }

    /**
     * compNm1GreaterThan のセッターメソッドです。
     * 
     * @param compNm1GreaterThan compNm1GreaterThan に設定する
     */
    public void setCompNm1GreaterThan(String compNm1GreaterThan) {
        this.compNm1GreaterThan = compNm1GreaterThan;
    }

    /**
     * compNm1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compNm1GreaterThanEqual
     */
    public String getCompNm1GreaterThanEqual() {
        return compNm1GreaterThanEqual;
    }

    /**
     * compNm1GreaterThanEqual のセッターメソッドです。
     * 
     * @param compNm1GreaterThanEqual compNm1GreaterThanEqual に設定する
     */
    public void setCompNm1GreaterThanEqual(String compNm1GreaterThanEqual) {
        this.compNm1GreaterThanEqual = compNm1GreaterThanEqual;
    }

    /**
     * compNm1LessThan のゲッターメソッドです。
     * 
     * @return the compNm1LessThan
     */
    public String getCompNm1LessThan() {
        return compNm1LessThan;
    }

    /**
     * compNm1LessThan のセッターメソッドです。
     * 
     * @param compNm1LessThan compNm1LessThan に設定する
     */
    public void setCompNm1LessThan(String compNm1LessThan) {
        this.compNm1LessThan = compNm1LessThan;
    }

    /**
     * compNm1LessThanEqual のゲッターメソッドです。
     * 
     * @return the compNm1LessThanEqual
     */
    public String getCompNm1LessThanEqual() {
        return compNm1LessThanEqual;
    }

    /**
     * compNm1LessThanEqual のセッターメソッドです。
     * 
     * @param compNm1LessThanEqual compNm1LessThanEqual に設定する
     */
    public void setCompNm1LessThanEqual(String compNm1LessThanEqual) {
        this.compNm1LessThanEqual = compNm1LessThanEqual;
    }

    /**
     * compNm1LikeFront のゲッターメソッドです。
     * 
     * @return the compNm1LikeFront
     */
    public String getCompNm1LikeFront() {
        return compNm1LikeFront;
    }

    /**
     * compNm1LikeFront のセッターメソッドです。
     * 
     * @param compNm1LikeFront compNm1LikeFront に設定する
     */
    public void setCompNm1LikeFront(String compNm1LikeFront) {
        this.compNm1LikeFront = compNm1LikeFront;
    }

}

