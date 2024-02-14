/*
 * PROJECT：eca0027
 * 
 * TmPkgSpecDtl の検索条件Domainクラス
 * テーブル概要：TM_PKG_SPEC_DTL
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmPkgSpecDtl の検索条件Domainクラスです。<BR>
 * テーブル概要：TM_PKG_SPEC_DTL<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/05/15 10:10:46<BR>
 * 
 * テーブル定義から2015/05/15に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TmPkgSpecDtlCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * OWNER_COMP
     */
    private String ownerComp;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * N_PROC
     */
    private String nProc;

    /**
     * REV
     */
    private BigDecimal rev;

    /**
     * PKG_ITEM_NO
     */
    private String pkgItemNo;

    /**
     * ITEM_NO_GRP
     */
    private String itemNoGrp;

    /**
     * LVL
     */
    private BigDecimal lvl;

    /**
     * LOT_SIZE
     */
    private BigDecimal lotSize;

    /**
     * QTY
     */
    private BigDecimal qty;

    /**
     * TOTAL_QTY
     */
    private BigDecimal totalQty;

    /**
     * ODR_DEPT_TYP
     */
    private String odrDeptTyp;

    /**
     * LOADING_CALCULATION_FLG
     */
    private String loadingCalculationFlg;

    /**
     * RT_TYP
     */
    private String rtTyp;

    /**
     * INNER_OUTER_TYP
     */
    private String innerOuterTyp;

    /**
     * LABEL_CD
     */
    private String labelCd;

    /**
     * SELECTIVE_USE_TYP
     */
    private String selectiveUseTyp;

    /**
     * ROW_NO
     */
    private BigDecimal rowNo;

    /**
     * PKG_MTRL_NM
     */
    private String pkgMtrlNm;

    /**
     * LENGTH_UNIT
     */
    private String lengthUnit;

    /**
     * LENGTH_OUT
     */
    private BigDecimal lengthOut;

    /**
     * WIDTH_OUT
     */
    private BigDecimal widthOut;

    /**
     * HEIGHT_OUT
     */
    private BigDecimal heightOut;

    /**
     * SUPPLIER_CD
     */
    private String supplierCd;

    /**
     * PKG_SPEC_DETAIL_SEQ
     */
    private String pkgSpecDetailSeq;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_FUNC_ID
     */
    private String comCreateFuncId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_FUNC_ID
     */
    private String comUpdateFuncId;

    /**
     * OWNER_COMP（大なり）
     */
    private String ownerCompGreaterThan;

    /**
     * OWNER_COMP（大なりイコール）
     */
    private String ownerCompGreaterThanEqual;

    /**
     * OWNER_COMP（小なり）
     */
    private String ownerCompLessThan;

    /**
     * OWNER_COMP（小なりイコール）
     */
    private String ownerCompLessThanEqual;

    /**
     * OWNER_COMP（前方一致）
     */
    private String ownerCompLikeFront;

    /**
     * ITEM_NO（大なり）
     */
    private String itemNoGreaterThan;

    /**
     * ITEM_NO（大なりイコール）
     */
    private String itemNoGreaterThanEqual;

    /**
     * ITEM_NO（小なり）
     */
    private String itemNoLessThan;

    /**
     * ITEM_NO（小なりイコール）
     */
    private String itemNoLessThanEqual;

    /**
     * ITEM_NO（前方一致）
     */
    private String itemNoLikeFront;

    /**
     * PKG_CD（大なり）
     */
    private String pkgCdGreaterThan;

    /**
     * PKG_CD（大なりイコール）
     */
    private String pkgCdGreaterThanEqual;

    /**
     * PKG_CD（小なり）
     */
    private String pkgCdLessThan;

    /**
     * PKG_CD（小なりイコール）
     */
    private String pkgCdLessThanEqual;

    /**
     * PKG_CD（前方一致）
     */
    private String pkgCdLikeFront;

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
     * N_PROC（大なり）
     */
    private String nProcGreaterThan;

    /**
     * N_PROC（大なりイコール）
     */
    private String nProcGreaterThanEqual;

    /**
     * N_PROC（小なり）
     */
    private String nProcLessThan;

    /**
     * N_PROC（小なりイコール）
     */
    private String nProcLessThanEqual;

    /**
     * N_PROC（前方一致）
     */
    private String nProcLikeFront;

    /**
     * PKG_ITEM_NO（大なり）
     */
    private String pkgItemNoGreaterThan;

    /**
     * PKG_ITEM_NO（大なりイコール）
     */
    private String pkgItemNoGreaterThanEqual;

    /**
     * PKG_ITEM_NO（小なり）
     */
    private String pkgItemNoLessThan;

    /**
     * PKG_ITEM_NO（小なりイコール）
     */
    private String pkgItemNoLessThanEqual;

    /**
     * PKG_ITEM_NO（前方一致）
     */
    private String pkgItemNoLikeFront;

    /**
     * ITEM_NO_GRP（大なり）
     */
    private String itemNoGrpGreaterThan;

    /**
     * ITEM_NO_GRP（大なりイコール）
     */
    private String itemNoGrpGreaterThanEqual;

    /**
     * ITEM_NO_GRP（小なり）
     */
    private String itemNoGrpLessThan;

    /**
     * ITEM_NO_GRP（小なりイコール）
     */
    private String itemNoGrpLessThanEqual;

    /**
     * ITEM_NO_GRP（前方一致）
     */
    private String itemNoGrpLikeFront;

    /**
     * ODR_DEPT_TYP（大なり）
     */
    private String odrDeptTypGreaterThan;

    /**
     * ODR_DEPT_TYP（大なりイコール）
     */
    private String odrDeptTypGreaterThanEqual;

    /**
     * ODR_DEPT_TYP（小なり）
     */
    private String odrDeptTypLessThan;

    /**
     * ODR_DEPT_TYP（小なりイコール）
     */
    private String odrDeptTypLessThanEqual;

    /**
     * ODR_DEPT_TYP（前方一致）
     */
    private String odrDeptTypLikeFront;

    /**
     * LOADING_CALCULATION_FLG（大なり）
     */
    private String loadingCalculationFlgGreaterThan;

    /**
     * LOADING_CALCULATION_FLG（大なりイコール）
     */
    private String loadingCalculationFlgGreaterThanEqual;

    /**
     * LOADING_CALCULATION_FLG（小なり）
     */
    private String loadingCalculationFlgLessThan;

    /**
     * LOADING_CALCULATION_FLG（小なりイコール）
     */
    private String loadingCalculationFlgLessThanEqual;

    /**
     * LOADING_CALCULATION_FLG（前方一致）
     */
    private String loadingCalculationFlgLikeFront;

    /**
     * RT_TYP（大なり）
     */
    private String rtTypGreaterThan;

    /**
     * RT_TYP（大なりイコール）
     */
    private String rtTypGreaterThanEqual;

    /**
     * RT_TYP（小なり）
     */
    private String rtTypLessThan;

    /**
     * RT_TYP（小なりイコール）
     */
    private String rtTypLessThanEqual;

    /**
     * RT_TYP（前方一致）
     */
    private String rtTypLikeFront;

    /**
     * INNER_OUTER_TYP（大なり）
     */
    private String innerOuterTypGreaterThan;

    /**
     * INNER_OUTER_TYP（大なりイコール）
     */
    private String innerOuterTypGreaterThanEqual;

    /**
     * INNER_OUTER_TYP（小なり）
     */
    private String innerOuterTypLessThan;

    /**
     * INNER_OUTER_TYP（小なりイコール）
     */
    private String innerOuterTypLessThanEqual;

    /**
     * INNER_OUTER_TYP（前方一致）
     */
    private String innerOuterTypLikeFront;

    /**
     * LABEL_CD（大なり）
     */
    private String labelCdGreaterThan;

    /**
     * LABEL_CD（大なりイコール）
     */
    private String labelCdGreaterThanEqual;

    /**
     * LABEL_CD（小なり）
     */
    private String labelCdLessThan;

    /**
     * LABEL_CD（小なりイコール）
     */
    private String labelCdLessThanEqual;

    /**
     * LABEL_CD（前方一致）
     */
    private String labelCdLikeFront;

    /**
     * SELECTIVE_USE_TYP（大なり）
     */
    private String selectiveUseTypGreaterThan;

    /**
     * SELECTIVE_USE_TYP（大なりイコール）
     */
    private String selectiveUseTypGreaterThanEqual;

    /**
     * SELECTIVE_USE_TYP（小なり）
     */
    private String selectiveUseTypLessThan;

    /**
     * SELECTIVE_USE_TYP（小なりイコール）
     */
    private String selectiveUseTypLessThanEqual;

    /**
     * SELECTIVE_USE_TYP（前方一致）
     */
    private String selectiveUseTypLikeFront;

    /**
     * PKG_MTRL_NM（大なり）
     */
    private String pkgMtrlNmGreaterThan;

    /**
     * PKG_MTRL_NM（大なりイコール）
     */
    private String pkgMtrlNmGreaterThanEqual;

    /**
     * PKG_MTRL_NM（小なり）
     */
    private String pkgMtrlNmLessThan;

    /**
     * PKG_MTRL_NM（小なりイコール）
     */
    private String pkgMtrlNmLessThanEqual;

    /**
     * PKG_MTRL_NM（前方一致）
     */
    private String pkgMtrlNmLikeFront;

    /**
     * LENGTH_UNIT（大なり）
     */
    private String lengthUnitGreaterThan;

    /**
     * LENGTH_UNIT（大なりイコール）
     */
    private String lengthUnitGreaterThanEqual;

    /**
     * LENGTH_UNIT（小なり）
     */
    private String lengthUnitLessThan;

    /**
     * LENGTH_UNIT（小なりイコール）
     */
    private String lengthUnitLessThanEqual;

    /**
     * LENGTH_UNIT（前方一致）
     */
    private String lengthUnitLikeFront;

    /**
     * SUPPLIER_CD（大なり）
     */
    private String supplierCdGreaterThan;

    /**
     * SUPPLIER_CD（大なりイコール）
     */
    private String supplierCdGreaterThanEqual;

    /**
     * SUPPLIER_CD（小なり）
     */
    private String supplierCdLessThan;

    /**
     * SUPPLIER_CD（小なりイコール）
     */
    private String supplierCdLessThanEqual;

    /**
     * SUPPLIER_CD（前方一致）
     */
    private String supplierCdLikeFront;

    /**
     * PKG_SPEC_DETAIL_SEQ（大なり）
     */
    private String pkgSpecDetailSeqGreaterThan;

    /**
     * PKG_SPEC_DETAIL_SEQ（大なりイコール）
     */
    private String pkgSpecDetailSeqGreaterThanEqual;

    /**
     * PKG_SPEC_DETAIL_SEQ（小なり）
     */
    private String pkgSpecDetailSeqLessThan;

    /**
     * PKG_SPEC_DETAIL_SEQ（小なりイコール）
     */
    private String pkgSpecDetailSeqLessThanEqual;

    /**
     * PKG_SPEC_DETAIL_SEQ（前方一致）
     */
    private String pkgSpecDetailSeqLikeFront;

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
     * デフォルトコンストラクタ。
     */
    public TmPkgSpecDtlCriteriaDomain() {
    }

    /**
     * ownerComp のゲッターメソッドです。
     * 
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * ownerComp のセッターメソッドです。
     * 
     * @param ownerComp ownerComp に設定する
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * itemNo のゲッターメソッドです。
     * 
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * itemNo のセッターメソッドです。
     * 
     * @param itemNo itemNo に設定する
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * pkgCd のゲッターメソッドです。
     * 
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * pkgCd のセッターメソッドです。
     * 
     * @param pkgCd pkgCd に設定する
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
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
     * nProc のゲッターメソッドです。
     * 
     * @return the nProc
     */
    public String getNProc() {
        return nProc;
    }

    /**
     * nProc のセッターメソッドです。
     * 
     * @param nProc nProc に設定する
     */
    public void setNProc(String nProc) {
        this.nProc = nProc;
    }

    /**
     * rev のゲッターメソッドです。
     * 
     * @return the rev
     */
    public BigDecimal getRev() {
        return rev;
    }

    /**
     * rev のセッターメソッドです。
     * 
     * @param rev rev に設定する
     */
    public void setRev(BigDecimal rev) {
        this.rev = rev;
    }

    /**
     * pkgItemNo のゲッターメソッドです。
     * 
     * @return the pkgItemNo
     */
    public String getPkgItemNo() {
        return pkgItemNo;
    }

    /**
     * pkgItemNo のセッターメソッドです。
     * 
     * @param pkgItemNo pkgItemNo に設定する
     */
    public void setPkgItemNo(String pkgItemNo) {
        this.pkgItemNo = pkgItemNo;
    }

    /**
     * itemNoGrp のゲッターメソッドです。
     * 
     * @return the itemNoGrp
     */
    public String getItemNoGrp() {
        return itemNoGrp;
    }

    /**
     * itemNoGrp のセッターメソッドです。
     * 
     * @param itemNoGrp itemNoGrp に設定する
     */
    public void setItemNoGrp(String itemNoGrp) {
        this.itemNoGrp = itemNoGrp;
    }

    /**
     * lvl のゲッターメソッドです。
     * 
     * @return the lvl
     */
    public BigDecimal getLvl() {
        return lvl;
    }

    /**
     * lvl のセッターメソッドです。
     * 
     * @param lvl lvl に設定する
     */
    public void setLvl(BigDecimal lvl) {
        this.lvl = lvl;
    }

    /**
     * lotSize のゲッターメソッドです。
     * 
     * @return the lotSize
     */
    public BigDecimal getLotSize() {
        return lotSize;
    }

    /**
     * lotSize のセッターメソッドです。
     * 
     * @param lotSize lotSize に設定する
     */
    public void setLotSize(BigDecimal lotSize) {
        this.lotSize = lotSize;
    }

    /**
     * qty のゲッターメソッドです。
     * 
     * @return the qty
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * qty のセッターメソッドです。
     * 
     * @param qty qty に設定する
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    /**
     * totalQty のゲッターメソッドです。
     * 
     * @return the totalQty
     */
    public BigDecimal getTotalQty() {
        return totalQty;
    }

    /**
     * totalQty のセッターメソッドです。
     * 
     * @param totalQty totalQty に設定する
     */
    public void setTotalQty(BigDecimal totalQty) {
        this.totalQty = totalQty;
    }

    /**
     * odrDeptTyp のゲッターメソッドです。
     * 
     * @return the odrDeptTyp
     */
    public String getOdrDeptTyp() {
        return odrDeptTyp;
    }

    /**
     * odrDeptTyp のセッターメソッドです。
     * 
     * @param odrDeptTyp odrDeptTyp に設定する
     */
    public void setOdrDeptTyp(String odrDeptTyp) {
        this.odrDeptTyp = odrDeptTyp;
    }

    /**
     * loadingCalculationFlg のゲッターメソッドです。
     * 
     * @return the loadingCalculationFlg
     */
    public String getLoadingCalculationFlg() {
        return loadingCalculationFlg;
    }

    /**
     * loadingCalculationFlg のセッターメソッドです。
     * 
     * @param loadingCalculationFlg loadingCalculationFlg に設定する
     */
    public void setLoadingCalculationFlg(String loadingCalculationFlg) {
        this.loadingCalculationFlg = loadingCalculationFlg;
    }

    /**
     * rtTyp のゲッターメソッドです。
     * 
     * @return the rtTyp
     */
    public String getRtTyp() {
        return rtTyp;
    }

    /**
     * rtTyp のセッターメソッドです。
     * 
     * @param rtTyp rtTyp に設定する
     */
    public void setRtTyp(String rtTyp) {
        this.rtTyp = rtTyp;
    }

    /**
     * innerOuterTyp のゲッターメソッドです。
     * 
     * @return the innerOuterTyp
     */
    public String getInnerOuterTyp() {
        return innerOuterTyp;
    }

    /**
     * innerOuterTyp のセッターメソッドです。
     * 
     * @param innerOuterTyp innerOuterTyp に設定する
     */
    public void setInnerOuterTyp(String innerOuterTyp) {
        this.innerOuterTyp = innerOuterTyp;
    }

    /**
     * labelCd のゲッターメソッドです。
     * 
     * @return the labelCd
     */
    public String getLabelCd() {
        return labelCd;
    }

    /**
     * labelCd のセッターメソッドです。
     * 
     * @param labelCd labelCd に設定する
     */
    public void setLabelCd(String labelCd) {
        this.labelCd = labelCd;
    }

    /**
     * selectiveUseTyp のゲッターメソッドです。
     * 
     * @return the selectiveUseTyp
     */
    public String getSelectiveUseTyp() {
        return selectiveUseTyp;
    }

    /**
     * selectiveUseTyp のセッターメソッドです。
     * 
     * @param selectiveUseTyp selectiveUseTyp に設定する
     */
    public void setSelectiveUseTyp(String selectiveUseTyp) {
        this.selectiveUseTyp = selectiveUseTyp;
    }

    /**
     * rowNo のゲッターメソッドです。
     * 
     * @return the rowNo
     */
    public BigDecimal getRowNo() {
        return rowNo;
    }

    /**
     * rowNo のセッターメソッドです。
     * 
     * @param rowNo rowNo に設定する
     */
    public void setRowNo(BigDecimal rowNo) {
        this.rowNo = rowNo;
    }

    /**
     * pkgMtrlNm のゲッターメソッドです。
     * 
     * @return the pkgMtrlNm
     */
    public String getPkgMtrlNm() {
        return pkgMtrlNm;
    }

    /**
     * pkgMtrlNm のセッターメソッドです。
     * 
     * @param pkgMtrlNm pkgMtrlNm に設定する
     */
    public void setPkgMtrlNm(String pkgMtrlNm) {
        this.pkgMtrlNm = pkgMtrlNm;
    }

    /**
     * lengthUnit のゲッターメソッドです。
     * 
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * lengthUnit のセッターメソッドです。
     * 
     * @param lengthUnit lengthUnit に設定する
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
    }

    /**
     * lengthOut のゲッターメソッドです。
     * 
     * @return the lengthOut
     */
    public BigDecimal getLengthOut() {
        return lengthOut;
    }

    /**
     * lengthOut のセッターメソッドです。
     * 
     * @param lengthOut lengthOut に設定する
     */
    public void setLengthOut(BigDecimal lengthOut) {
        this.lengthOut = lengthOut;
    }

    /**
     * widthOut のゲッターメソッドです。
     * 
     * @return the widthOut
     */
    public BigDecimal getWidthOut() {
        return widthOut;
    }

    /**
     * widthOut のセッターメソッドです。
     * 
     * @param widthOut widthOut に設定する
     */
    public void setWidthOut(BigDecimal widthOut) {
        this.widthOut = widthOut;
    }

    /**
     * heightOut のゲッターメソッドです。
     * 
     * @return the heightOut
     */
    public BigDecimal getHeightOut() {
        return heightOut;
    }

    /**
     * heightOut のセッターメソッドです。
     * 
     * @param heightOut heightOut に設定する
     */
    public void setHeightOut(BigDecimal heightOut) {
        this.heightOut = heightOut;
    }

    /**
     * supplierCd のゲッターメソッドです。
     * 
     * @return the supplierCd
     */
    public String getSupplierCd() {
        return supplierCd;
    }

    /**
     * supplierCd のセッターメソッドです。
     * 
     * @param supplierCd supplierCd に設定する
     */
    public void setSupplierCd(String supplierCd) {
        this.supplierCd = supplierCd;
    }

    /**
     * pkgSpecDetailSeq のゲッターメソッドです。
     * 
     * @return the pkgSpecDetailSeq
     */
    public String getPkgSpecDetailSeq() {
        return pkgSpecDetailSeq;
    }

    /**
     * pkgSpecDetailSeq のセッターメソッドです。
     * 
     * @param pkgSpecDetailSeq pkgSpecDetailSeq に設定する
     */
    public void setPkgSpecDetailSeq(String pkgSpecDetailSeq) {
        this.pkgSpecDetailSeq = pkgSpecDetailSeq;
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
     * ownerCompGreaterThan のゲッターメソッドです。
     * 
     * @return the ownerCompGreaterThan
     */
    public String getOwnerCompGreaterThan() {
        return ownerCompGreaterThan;
    }

    /**
     * ownerCompGreaterThan のセッターメソッドです。
     * 
     * @param ownerCompGreaterThan ownerCompGreaterThan に設定する
     */
    public void setOwnerCompGreaterThan(String ownerCompGreaterThan) {
        this.ownerCompGreaterThan = ownerCompGreaterThan;
    }

    /**
     * ownerCompGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the ownerCompGreaterThanEqual
     */
    public String getOwnerCompGreaterThanEqual() {
        return ownerCompGreaterThanEqual;
    }

    /**
     * ownerCompGreaterThanEqual のセッターメソッドです。
     * 
     * @param ownerCompGreaterThanEqual ownerCompGreaterThanEqual に設定する
     */
    public void setOwnerCompGreaterThanEqual(String ownerCompGreaterThanEqual) {
        this.ownerCompGreaterThanEqual = ownerCompGreaterThanEqual;
    }

    /**
     * ownerCompLessThan のゲッターメソッドです。
     * 
     * @return the ownerCompLessThan
     */
    public String getOwnerCompLessThan() {
        return ownerCompLessThan;
    }

    /**
     * ownerCompLessThan のセッターメソッドです。
     * 
     * @param ownerCompLessThan ownerCompLessThan に設定する
     */
    public void setOwnerCompLessThan(String ownerCompLessThan) {
        this.ownerCompLessThan = ownerCompLessThan;
    }

    /**
     * ownerCompLessThanEqual のゲッターメソッドです。
     * 
     * @return the ownerCompLessThanEqual
     */
    public String getOwnerCompLessThanEqual() {
        return ownerCompLessThanEqual;
    }

    /**
     * ownerCompLessThanEqual のセッターメソッドです。
     * 
     * @param ownerCompLessThanEqual ownerCompLessThanEqual に設定する
     */
    public void setOwnerCompLessThanEqual(String ownerCompLessThanEqual) {
        this.ownerCompLessThanEqual = ownerCompLessThanEqual;
    }

    /**
     * ownerCompLikeFront のゲッターメソッドです。
     * 
     * @return the ownerCompLikeFront
     */
    public String getOwnerCompLikeFront() {
        return ownerCompLikeFront;
    }

    /**
     * ownerCompLikeFront のセッターメソッドです。
     * 
     * @param ownerCompLikeFront ownerCompLikeFront に設定する
     */
    public void setOwnerCompLikeFront(String ownerCompLikeFront) {
        this.ownerCompLikeFront = ownerCompLikeFront;
    }

    /**
     * itemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the itemNoGreaterThan
     */
    public String getItemNoGreaterThan() {
        return itemNoGreaterThan;
    }

    /**
     * itemNoGreaterThan のセッターメソッドです。
     * 
     * @param itemNoGreaterThan itemNoGreaterThan に設定する
     */
    public void setItemNoGreaterThan(String itemNoGreaterThan) {
        this.itemNoGreaterThan = itemNoGreaterThan;
    }

    /**
     * itemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoGreaterThanEqual
     */
    public String getItemNoGreaterThanEqual() {
        return itemNoGreaterThanEqual;
    }

    /**
     * itemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemNoGreaterThanEqual itemNoGreaterThanEqual に設定する
     */
    public void setItemNoGreaterThanEqual(String itemNoGreaterThanEqual) {
        this.itemNoGreaterThanEqual = itemNoGreaterThanEqual;
    }

    /**
     * itemNoLessThan のゲッターメソッドです。
     * 
     * @return the itemNoLessThan
     */
    public String getItemNoLessThan() {
        return itemNoLessThan;
    }

    /**
     * itemNoLessThan のセッターメソッドです。
     * 
     * @param itemNoLessThan itemNoLessThan に設定する
     */
    public void setItemNoLessThan(String itemNoLessThan) {
        this.itemNoLessThan = itemNoLessThan;
    }

    /**
     * itemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoLessThanEqual
     */
    public String getItemNoLessThanEqual() {
        return itemNoLessThanEqual;
    }

    /**
     * itemNoLessThanEqual のセッターメソッドです。
     * 
     * @param itemNoLessThanEqual itemNoLessThanEqual に設定する
     */
    public void setItemNoLessThanEqual(String itemNoLessThanEqual) {
        this.itemNoLessThanEqual = itemNoLessThanEqual;
    }

    /**
     * itemNoLikeFront のゲッターメソッドです。
     * 
     * @return the itemNoLikeFront
     */
    public String getItemNoLikeFront() {
        return itemNoLikeFront;
    }

    /**
     * itemNoLikeFront のセッターメソッドです。
     * 
     * @param itemNoLikeFront itemNoLikeFront に設定する
     */
    public void setItemNoLikeFront(String itemNoLikeFront) {
        this.itemNoLikeFront = itemNoLikeFront;
    }

    /**
     * pkgCdGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThan
     */
    public String getPkgCdGreaterThan() {
        return pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThan のセッターメソッドです。
     * 
     * @param pkgCdGreaterThan pkgCdGreaterThan に設定する
     */
    public void setPkgCdGreaterThan(String pkgCdGreaterThan) {
        this.pkgCdGreaterThan = pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThanEqual
     */
    public String getPkgCdGreaterThanEqual() {
        return pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgCdGreaterThanEqual pkgCdGreaterThanEqual に設定する
     */
    public void setPkgCdGreaterThanEqual(String pkgCdGreaterThanEqual) {
        this.pkgCdGreaterThanEqual = pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdLessThan のゲッターメソッドです。
     * 
     * @return the pkgCdLessThan
     */
    public String getPkgCdLessThan() {
        return pkgCdLessThan;
    }

    /**
     * pkgCdLessThan のセッターメソッドです。
     * 
     * @param pkgCdLessThan pkgCdLessThan に設定する
     */
    public void setPkgCdLessThan(String pkgCdLessThan) {
        this.pkgCdLessThan = pkgCdLessThan;
    }

    /**
     * pkgCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdLessThanEqual
     */
    public String getPkgCdLessThanEqual() {
        return pkgCdLessThanEqual;
    }

    /**
     * pkgCdLessThanEqual のセッターメソッドです。
     * 
     * @param pkgCdLessThanEqual pkgCdLessThanEqual に設定する
     */
    public void setPkgCdLessThanEqual(String pkgCdLessThanEqual) {
        this.pkgCdLessThanEqual = pkgCdLessThanEqual;
    }

    /**
     * pkgCdLikeFront のゲッターメソッドです。
     * 
     * @return the pkgCdLikeFront
     */
    public String getPkgCdLikeFront() {
        return pkgCdLikeFront;
    }

    /**
     * pkgCdLikeFront のセッターメソッドです。
     * 
     * @param pkgCdLikeFront pkgCdLikeFront に設定する
     */
    public void setPkgCdLikeFront(String pkgCdLikeFront) {
        this.pkgCdLikeFront = pkgCdLikeFront;
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
     * nProcGreaterThan のゲッターメソッドです。
     * 
     * @return the nProcGreaterThan
     */
    public String getNProcGreaterThan() {
        return nProcGreaterThan;
    }

    /**
     * nProcGreaterThan のセッターメソッドです。
     * 
     * @param nProcGreaterThan nProcGreaterThan に設定する
     */
    public void setNProcGreaterThan(String nProcGreaterThan) {
        this.nProcGreaterThan = nProcGreaterThan;
    }

    /**
     * nProcGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the nProcGreaterThanEqual
     */
    public String getNProcGreaterThanEqual() {
        return nProcGreaterThanEqual;
    }

    /**
     * nProcGreaterThanEqual のセッターメソッドです。
     * 
     * @param nProcGreaterThanEqual nProcGreaterThanEqual に設定する
     */
    public void setNProcGreaterThanEqual(String nProcGreaterThanEqual) {
        this.nProcGreaterThanEqual = nProcGreaterThanEqual;
    }

    /**
     * nProcLessThan のゲッターメソッドです。
     * 
     * @return the nProcLessThan
     */
    public String getNProcLessThan() {
        return nProcLessThan;
    }

    /**
     * nProcLessThan のセッターメソッドです。
     * 
     * @param nProcLessThan nProcLessThan に設定する
     */
    public void setNProcLessThan(String nProcLessThan) {
        this.nProcLessThan = nProcLessThan;
    }

    /**
     * nProcLessThanEqual のゲッターメソッドです。
     * 
     * @return the nProcLessThanEqual
     */
    public String getNProcLessThanEqual() {
        return nProcLessThanEqual;
    }

    /**
     * nProcLessThanEqual のセッターメソッドです。
     * 
     * @param nProcLessThanEqual nProcLessThanEqual に設定する
     */
    public void setNProcLessThanEqual(String nProcLessThanEqual) {
        this.nProcLessThanEqual = nProcLessThanEqual;
    }

    /**
     * nProcLikeFront のゲッターメソッドです。
     * 
     * @return the nProcLikeFront
     */
    public String getNProcLikeFront() {
        return nProcLikeFront;
    }

    /**
     * nProcLikeFront のセッターメソッドです。
     * 
     * @param nProcLikeFront nProcLikeFront に設定する
     */
    public void setNProcLikeFront(String nProcLikeFront) {
        this.nProcLikeFront = nProcLikeFront;
    }

    /**
     * pkgItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgItemNoGreaterThan
     */
    public String getPkgItemNoGreaterThan() {
        return pkgItemNoGreaterThan;
    }

    /**
     * pkgItemNoGreaterThan のセッターメソッドです。
     * 
     * @param pkgItemNoGreaterThan pkgItemNoGreaterThan に設定する
     */
    public void setPkgItemNoGreaterThan(String pkgItemNoGreaterThan) {
        this.pkgItemNoGreaterThan = pkgItemNoGreaterThan;
    }

    /**
     * pkgItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgItemNoGreaterThanEqual
     */
    public String getPkgItemNoGreaterThanEqual() {
        return pkgItemNoGreaterThanEqual;
    }

    /**
     * pkgItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgItemNoGreaterThanEqual pkgItemNoGreaterThanEqual に設定する
     */
    public void setPkgItemNoGreaterThanEqual(String pkgItemNoGreaterThanEqual) {
        this.pkgItemNoGreaterThanEqual = pkgItemNoGreaterThanEqual;
    }

    /**
     * pkgItemNoLessThan のゲッターメソッドです。
     * 
     * @return the pkgItemNoLessThan
     */
    public String getPkgItemNoLessThan() {
        return pkgItemNoLessThan;
    }

    /**
     * pkgItemNoLessThan のセッターメソッドです。
     * 
     * @param pkgItemNoLessThan pkgItemNoLessThan に設定する
     */
    public void setPkgItemNoLessThan(String pkgItemNoLessThan) {
        this.pkgItemNoLessThan = pkgItemNoLessThan;
    }

    /**
     * pkgItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgItemNoLessThanEqual
     */
    public String getPkgItemNoLessThanEqual() {
        return pkgItemNoLessThanEqual;
    }

    /**
     * pkgItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param pkgItemNoLessThanEqual pkgItemNoLessThanEqual に設定する
     */
    public void setPkgItemNoLessThanEqual(String pkgItemNoLessThanEqual) {
        this.pkgItemNoLessThanEqual = pkgItemNoLessThanEqual;
    }

    /**
     * pkgItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the pkgItemNoLikeFront
     */
    public String getPkgItemNoLikeFront() {
        return pkgItemNoLikeFront;
    }

    /**
     * pkgItemNoLikeFront のセッターメソッドです。
     * 
     * @param pkgItemNoLikeFront pkgItemNoLikeFront に設定する
     */
    public void setPkgItemNoLikeFront(String pkgItemNoLikeFront) {
        this.pkgItemNoLikeFront = pkgItemNoLikeFront;
    }

    /**
     * itemNoGrpGreaterThan のゲッターメソッドです。
     * 
     * @return the itemNoGrpGreaterThan
     */
    public String getItemNoGrpGreaterThan() {
        return itemNoGrpGreaterThan;
    }

    /**
     * itemNoGrpGreaterThan のセッターメソッドです。
     * 
     * @param itemNoGrpGreaterThan itemNoGrpGreaterThan に設定する
     */
    public void setItemNoGrpGreaterThan(String itemNoGrpGreaterThan) {
        this.itemNoGrpGreaterThan = itemNoGrpGreaterThan;
    }

    /**
     * itemNoGrpGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoGrpGreaterThanEqual
     */
    public String getItemNoGrpGreaterThanEqual() {
        return itemNoGrpGreaterThanEqual;
    }

    /**
     * itemNoGrpGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemNoGrpGreaterThanEqual itemNoGrpGreaterThanEqual に設定する
     */
    public void setItemNoGrpGreaterThanEqual(String itemNoGrpGreaterThanEqual) {
        this.itemNoGrpGreaterThanEqual = itemNoGrpGreaterThanEqual;
    }

    /**
     * itemNoGrpLessThan のゲッターメソッドです。
     * 
     * @return the itemNoGrpLessThan
     */
    public String getItemNoGrpLessThan() {
        return itemNoGrpLessThan;
    }

    /**
     * itemNoGrpLessThan のセッターメソッドです。
     * 
     * @param itemNoGrpLessThan itemNoGrpLessThan に設定する
     */
    public void setItemNoGrpLessThan(String itemNoGrpLessThan) {
        this.itemNoGrpLessThan = itemNoGrpLessThan;
    }

    /**
     * itemNoGrpLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoGrpLessThanEqual
     */
    public String getItemNoGrpLessThanEqual() {
        return itemNoGrpLessThanEqual;
    }

    /**
     * itemNoGrpLessThanEqual のセッターメソッドです。
     * 
     * @param itemNoGrpLessThanEqual itemNoGrpLessThanEqual に設定する
     */
    public void setItemNoGrpLessThanEqual(String itemNoGrpLessThanEqual) {
        this.itemNoGrpLessThanEqual = itemNoGrpLessThanEqual;
    }

    /**
     * itemNoGrpLikeFront のゲッターメソッドです。
     * 
     * @return the itemNoGrpLikeFront
     */
    public String getItemNoGrpLikeFront() {
        return itemNoGrpLikeFront;
    }

    /**
     * itemNoGrpLikeFront のセッターメソッドです。
     * 
     * @param itemNoGrpLikeFront itemNoGrpLikeFront に設定する
     */
    public void setItemNoGrpLikeFront(String itemNoGrpLikeFront) {
        this.itemNoGrpLikeFront = itemNoGrpLikeFront;
    }

    /**
     * odrDeptTypGreaterThan のゲッターメソッドです。
     * 
     * @return the odrDeptTypGreaterThan
     */
    public String getOdrDeptTypGreaterThan() {
        return odrDeptTypGreaterThan;
    }

    /**
     * odrDeptTypGreaterThan のセッターメソッドです。
     * 
     * @param odrDeptTypGreaterThan odrDeptTypGreaterThan に設定する
     */
    public void setOdrDeptTypGreaterThan(String odrDeptTypGreaterThan) {
        this.odrDeptTypGreaterThan = odrDeptTypGreaterThan;
    }

    /**
     * odrDeptTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the odrDeptTypGreaterThanEqual
     */
    public String getOdrDeptTypGreaterThanEqual() {
        return odrDeptTypGreaterThanEqual;
    }

    /**
     * odrDeptTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param odrDeptTypGreaterThanEqual odrDeptTypGreaterThanEqual に設定する
     */
    public void setOdrDeptTypGreaterThanEqual(String odrDeptTypGreaterThanEqual) {
        this.odrDeptTypGreaterThanEqual = odrDeptTypGreaterThanEqual;
    }

    /**
     * odrDeptTypLessThan のゲッターメソッドです。
     * 
     * @return the odrDeptTypLessThan
     */
    public String getOdrDeptTypLessThan() {
        return odrDeptTypLessThan;
    }

    /**
     * odrDeptTypLessThan のセッターメソッドです。
     * 
     * @param odrDeptTypLessThan odrDeptTypLessThan に設定する
     */
    public void setOdrDeptTypLessThan(String odrDeptTypLessThan) {
        this.odrDeptTypLessThan = odrDeptTypLessThan;
    }

    /**
     * odrDeptTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the odrDeptTypLessThanEqual
     */
    public String getOdrDeptTypLessThanEqual() {
        return odrDeptTypLessThanEqual;
    }

    /**
     * odrDeptTypLessThanEqual のセッターメソッドです。
     * 
     * @param odrDeptTypLessThanEqual odrDeptTypLessThanEqual に設定する
     */
    public void setOdrDeptTypLessThanEqual(String odrDeptTypLessThanEqual) {
        this.odrDeptTypLessThanEqual = odrDeptTypLessThanEqual;
    }

    /**
     * odrDeptTypLikeFront のゲッターメソッドです。
     * 
     * @return the odrDeptTypLikeFront
     */
    public String getOdrDeptTypLikeFront() {
        return odrDeptTypLikeFront;
    }

    /**
     * odrDeptTypLikeFront のセッターメソッドです。
     * 
     * @param odrDeptTypLikeFront odrDeptTypLikeFront に設定する
     */
    public void setOdrDeptTypLikeFront(String odrDeptTypLikeFront) {
        this.odrDeptTypLikeFront = odrDeptTypLikeFront;
    }

    /**
     * loadingCalculationFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the loadingCalculationFlgGreaterThan
     */
    public String getLoadingCalculationFlgGreaterThan() {
        return loadingCalculationFlgGreaterThan;
    }

    /**
     * loadingCalculationFlgGreaterThan のセッターメソッドです。
     * 
     * @param loadingCalculationFlgGreaterThan loadingCalculationFlgGreaterThan に設定する
     */
    public void setLoadingCalculationFlgGreaterThan(String loadingCalculationFlgGreaterThan) {
        this.loadingCalculationFlgGreaterThan = loadingCalculationFlgGreaterThan;
    }

    /**
     * loadingCalculationFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the loadingCalculationFlgGreaterThanEqual
     */
    public String getLoadingCalculationFlgGreaterThanEqual() {
        return loadingCalculationFlgGreaterThanEqual;
    }

    /**
     * loadingCalculationFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param loadingCalculationFlgGreaterThanEqual loadingCalculationFlgGreaterThanEqual に設定する
     */
    public void setLoadingCalculationFlgGreaterThanEqual(String loadingCalculationFlgGreaterThanEqual) {
        this.loadingCalculationFlgGreaterThanEqual = loadingCalculationFlgGreaterThanEqual;
    }

    /**
     * loadingCalculationFlgLessThan のゲッターメソッドです。
     * 
     * @return the loadingCalculationFlgLessThan
     */
    public String getLoadingCalculationFlgLessThan() {
        return loadingCalculationFlgLessThan;
    }

    /**
     * loadingCalculationFlgLessThan のセッターメソッドです。
     * 
     * @param loadingCalculationFlgLessThan loadingCalculationFlgLessThan に設定する
     */
    public void setLoadingCalculationFlgLessThan(String loadingCalculationFlgLessThan) {
        this.loadingCalculationFlgLessThan = loadingCalculationFlgLessThan;
    }

    /**
     * loadingCalculationFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the loadingCalculationFlgLessThanEqual
     */
    public String getLoadingCalculationFlgLessThanEqual() {
        return loadingCalculationFlgLessThanEqual;
    }

    /**
     * loadingCalculationFlgLessThanEqual のセッターメソッドです。
     * 
     * @param loadingCalculationFlgLessThanEqual loadingCalculationFlgLessThanEqual に設定する
     */
    public void setLoadingCalculationFlgLessThanEqual(String loadingCalculationFlgLessThanEqual) {
        this.loadingCalculationFlgLessThanEqual = loadingCalculationFlgLessThanEqual;
    }

    /**
     * loadingCalculationFlgLikeFront のゲッターメソッドです。
     * 
     * @return the loadingCalculationFlgLikeFront
     */
    public String getLoadingCalculationFlgLikeFront() {
        return loadingCalculationFlgLikeFront;
    }

    /**
     * loadingCalculationFlgLikeFront のセッターメソッドです。
     * 
     * @param loadingCalculationFlgLikeFront loadingCalculationFlgLikeFront に設定する
     */
    public void setLoadingCalculationFlgLikeFront(String loadingCalculationFlgLikeFront) {
        this.loadingCalculationFlgLikeFront = loadingCalculationFlgLikeFront;
    }

    /**
     * rtTypGreaterThan のゲッターメソッドです。
     * 
     * @return the rtTypGreaterThan
     */
    public String getRtTypGreaterThan() {
        return rtTypGreaterThan;
    }

    /**
     * rtTypGreaterThan のセッターメソッドです。
     * 
     * @param rtTypGreaterThan rtTypGreaterThan に設定する
     */
    public void setRtTypGreaterThan(String rtTypGreaterThan) {
        this.rtTypGreaterThan = rtTypGreaterThan;
    }

    /**
     * rtTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the rtTypGreaterThanEqual
     */
    public String getRtTypGreaterThanEqual() {
        return rtTypGreaterThanEqual;
    }

    /**
     * rtTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param rtTypGreaterThanEqual rtTypGreaterThanEqual に設定する
     */
    public void setRtTypGreaterThanEqual(String rtTypGreaterThanEqual) {
        this.rtTypGreaterThanEqual = rtTypGreaterThanEqual;
    }

    /**
     * rtTypLessThan のゲッターメソッドです。
     * 
     * @return the rtTypLessThan
     */
    public String getRtTypLessThan() {
        return rtTypLessThan;
    }

    /**
     * rtTypLessThan のセッターメソッドです。
     * 
     * @param rtTypLessThan rtTypLessThan に設定する
     */
    public void setRtTypLessThan(String rtTypLessThan) {
        this.rtTypLessThan = rtTypLessThan;
    }

    /**
     * rtTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the rtTypLessThanEqual
     */
    public String getRtTypLessThanEqual() {
        return rtTypLessThanEqual;
    }

    /**
     * rtTypLessThanEqual のセッターメソッドです。
     * 
     * @param rtTypLessThanEqual rtTypLessThanEqual に設定する
     */
    public void setRtTypLessThanEqual(String rtTypLessThanEqual) {
        this.rtTypLessThanEqual = rtTypLessThanEqual;
    }

    /**
     * rtTypLikeFront のゲッターメソッドです。
     * 
     * @return the rtTypLikeFront
     */
    public String getRtTypLikeFront() {
        return rtTypLikeFront;
    }

    /**
     * rtTypLikeFront のセッターメソッドです。
     * 
     * @param rtTypLikeFront rtTypLikeFront に設定する
     */
    public void setRtTypLikeFront(String rtTypLikeFront) {
        this.rtTypLikeFront = rtTypLikeFront;
    }

    /**
     * innerOuterTypGreaterThan のゲッターメソッドです。
     * 
     * @return the innerOuterTypGreaterThan
     */
    public String getInnerOuterTypGreaterThan() {
        return innerOuterTypGreaterThan;
    }

    /**
     * innerOuterTypGreaterThan のセッターメソッドです。
     * 
     * @param innerOuterTypGreaterThan innerOuterTypGreaterThan に設定する
     */
    public void setInnerOuterTypGreaterThan(String innerOuterTypGreaterThan) {
        this.innerOuterTypGreaterThan = innerOuterTypGreaterThan;
    }

    /**
     * innerOuterTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the innerOuterTypGreaterThanEqual
     */
    public String getInnerOuterTypGreaterThanEqual() {
        return innerOuterTypGreaterThanEqual;
    }

    /**
     * innerOuterTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param innerOuterTypGreaterThanEqual innerOuterTypGreaterThanEqual に設定する
     */
    public void setInnerOuterTypGreaterThanEqual(String innerOuterTypGreaterThanEqual) {
        this.innerOuterTypGreaterThanEqual = innerOuterTypGreaterThanEqual;
    }

    /**
     * innerOuterTypLessThan のゲッターメソッドです。
     * 
     * @return the innerOuterTypLessThan
     */
    public String getInnerOuterTypLessThan() {
        return innerOuterTypLessThan;
    }

    /**
     * innerOuterTypLessThan のセッターメソッドです。
     * 
     * @param innerOuterTypLessThan innerOuterTypLessThan に設定する
     */
    public void setInnerOuterTypLessThan(String innerOuterTypLessThan) {
        this.innerOuterTypLessThan = innerOuterTypLessThan;
    }

    /**
     * innerOuterTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the innerOuterTypLessThanEqual
     */
    public String getInnerOuterTypLessThanEqual() {
        return innerOuterTypLessThanEqual;
    }

    /**
     * innerOuterTypLessThanEqual のセッターメソッドです。
     * 
     * @param innerOuterTypLessThanEqual innerOuterTypLessThanEqual に設定する
     */
    public void setInnerOuterTypLessThanEqual(String innerOuterTypLessThanEqual) {
        this.innerOuterTypLessThanEqual = innerOuterTypLessThanEqual;
    }

    /**
     * innerOuterTypLikeFront のゲッターメソッドです。
     * 
     * @return the innerOuterTypLikeFront
     */
    public String getInnerOuterTypLikeFront() {
        return innerOuterTypLikeFront;
    }

    /**
     * innerOuterTypLikeFront のセッターメソッドです。
     * 
     * @param innerOuterTypLikeFront innerOuterTypLikeFront に設定する
     */
    public void setInnerOuterTypLikeFront(String innerOuterTypLikeFront) {
        this.innerOuterTypLikeFront = innerOuterTypLikeFront;
    }

    /**
     * labelCdGreaterThan のゲッターメソッドです。
     * 
     * @return the labelCdGreaterThan
     */
    public String getLabelCdGreaterThan() {
        return labelCdGreaterThan;
    }

    /**
     * labelCdGreaterThan のセッターメソッドです。
     * 
     * @param labelCdGreaterThan labelCdGreaterThan に設定する
     */
    public void setLabelCdGreaterThan(String labelCdGreaterThan) {
        this.labelCdGreaterThan = labelCdGreaterThan;
    }

    /**
     * labelCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the labelCdGreaterThanEqual
     */
    public String getLabelCdGreaterThanEqual() {
        return labelCdGreaterThanEqual;
    }

    /**
     * labelCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param labelCdGreaterThanEqual labelCdGreaterThanEqual に設定する
     */
    public void setLabelCdGreaterThanEqual(String labelCdGreaterThanEqual) {
        this.labelCdGreaterThanEqual = labelCdGreaterThanEqual;
    }

    /**
     * labelCdLessThan のゲッターメソッドです。
     * 
     * @return the labelCdLessThan
     */
    public String getLabelCdLessThan() {
        return labelCdLessThan;
    }

    /**
     * labelCdLessThan のセッターメソッドです。
     * 
     * @param labelCdLessThan labelCdLessThan に設定する
     */
    public void setLabelCdLessThan(String labelCdLessThan) {
        this.labelCdLessThan = labelCdLessThan;
    }

    /**
     * labelCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the labelCdLessThanEqual
     */
    public String getLabelCdLessThanEqual() {
        return labelCdLessThanEqual;
    }

    /**
     * labelCdLessThanEqual のセッターメソッドです。
     * 
     * @param labelCdLessThanEqual labelCdLessThanEqual に設定する
     */
    public void setLabelCdLessThanEqual(String labelCdLessThanEqual) {
        this.labelCdLessThanEqual = labelCdLessThanEqual;
    }

    /**
     * labelCdLikeFront のゲッターメソッドです。
     * 
     * @return the labelCdLikeFront
     */
    public String getLabelCdLikeFront() {
        return labelCdLikeFront;
    }

    /**
     * labelCdLikeFront のセッターメソッドです。
     * 
     * @param labelCdLikeFront labelCdLikeFront に設定する
     */
    public void setLabelCdLikeFront(String labelCdLikeFront) {
        this.labelCdLikeFront = labelCdLikeFront;
    }

    /**
     * selectiveUseTypGreaterThan のゲッターメソッドです。
     * 
     * @return the selectiveUseTypGreaterThan
     */
    public String getSelectiveUseTypGreaterThan() {
        return selectiveUseTypGreaterThan;
    }

    /**
     * selectiveUseTypGreaterThan のセッターメソッドです。
     * 
     * @param selectiveUseTypGreaterThan selectiveUseTypGreaterThan に設定する
     */
    public void setSelectiveUseTypGreaterThan(String selectiveUseTypGreaterThan) {
        this.selectiveUseTypGreaterThan = selectiveUseTypGreaterThan;
    }

    /**
     * selectiveUseTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the selectiveUseTypGreaterThanEqual
     */
    public String getSelectiveUseTypGreaterThanEqual() {
        return selectiveUseTypGreaterThanEqual;
    }

    /**
     * selectiveUseTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param selectiveUseTypGreaterThanEqual selectiveUseTypGreaterThanEqual に設定する
     */
    public void setSelectiveUseTypGreaterThanEqual(String selectiveUseTypGreaterThanEqual) {
        this.selectiveUseTypGreaterThanEqual = selectiveUseTypGreaterThanEqual;
    }

    /**
     * selectiveUseTypLessThan のゲッターメソッドです。
     * 
     * @return the selectiveUseTypLessThan
     */
    public String getSelectiveUseTypLessThan() {
        return selectiveUseTypLessThan;
    }

    /**
     * selectiveUseTypLessThan のセッターメソッドです。
     * 
     * @param selectiveUseTypLessThan selectiveUseTypLessThan に設定する
     */
    public void setSelectiveUseTypLessThan(String selectiveUseTypLessThan) {
        this.selectiveUseTypLessThan = selectiveUseTypLessThan;
    }

    /**
     * selectiveUseTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the selectiveUseTypLessThanEqual
     */
    public String getSelectiveUseTypLessThanEqual() {
        return selectiveUseTypLessThanEqual;
    }

    /**
     * selectiveUseTypLessThanEqual のセッターメソッドです。
     * 
     * @param selectiveUseTypLessThanEqual selectiveUseTypLessThanEqual に設定する
     */
    public void setSelectiveUseTypLessThanEqual(String selectiveUseTypLessThanEqual) {
        this.selectiveUseTypLessThanEqual = selectiveUseTypLessThanEqual;
    }

    /**
     * selectiveUseTypLikeFront のゲッターメソッドです。
     * 
     * @return the selectiveUseTypLikeFront
     */
    public String getSelectiveUseTypLikeFront() {
        return selectiveUseTypLikeFront;
    }

    /**
     * selectiveUseTypLikeFront のセッターメソッドです。
     * 
     * @param selectiveUseTypLikeFront selectiveUseTypLikeFront に設定する
     */
    public void setSelectiveUseTypLikeFront(String selectiveUseTypLikeFront) {
        this.selectiveUseTypLikeFront = selectiveUseTypLikeFront;
    }

    /**
     * pkgMtrlNmGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgMtrlNmGreaterThan
     */
    public String getPkgMtrlNmGreaterThan() {
        return pkgMtrlNmGreaterThan;
    }

    /**
     * pkgMtrlNmGreaterThan のセッターメソッドです。
     * 
     * @param pkgMtrlNmGreaterThan pkgMtrlNmGreaterThan に設定する
     */
    public void setPkgMtrlNmGreaterThan(String pkgMtrlNmGreaterThan) {
        this.pkgMtrlNmGreaterThan = pkgMtrlNmGreaterThan;
    }

    /**
     * pkgMtrlNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgMtrlNmGreaterThanEqual
     */
    public String getPkgMtrlNmGreaterThanEqual() {
        return pkgMtrlNmGreaterThanEqual;
    }

    /**
     * pkgMtrlNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgMtrlNmGreaterThanEqual pkgMtrlNmGreaterThanEqual に設定する
     */
    public void setPkgMtrlNmGreaterThanEqual(String pkgMtrlNmGreaterThanEqual) {
        this.pkgMtrlNmGreaterThanEqual = pkgMtrlNmGreaterThanEqual;
    }

    /**
     * pkgMtrlNmLessThan のゲッターメソッドです。
     * 
     * @return the pkgMtrlNmLessThan
     */
    public String getPkgMtrlNmLessThan() {
        return pkgMtrlNmLessThan;
    }

    /**
     * pkgMtrlNmLessThan のセッターメソッドです。
     * 
     * @param pkgMtrlNmLessThan pkgMtrlNmLessThan に設定する
     */
    public void setPkgMtrlNmLessThan(String pkgMtrlNmLessThan) {
        this.pkgMtrlNmLessThan = pkgMtrlNmLessThan;
    }

    /**
     * pkgMtrlNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgMtrlNmLessThanEqual
     */
    public String getPkgMtrlNmLessThanEqual() {
        return pkgMtrlNmLessThanEqual;
    }

    /**
     * pkgMtrlNmLessThanEqual のセッターメソッドです。
     * 
     * @param pkgMtrlNmLessThanEqual pkgMtrlNmLessThanEqual に設定する
     */
    public void setPkgMtrlNmLessThanEqual(String pkgMtrlNmLessThanEqual) {
        this.pkgMtrlNmLessThanEqual = pkgMtrlNmLessThanEqual;
    }

    /**
     * pkgMtrlNmLikeFront のゲッターメソッドです。
     * 
     * @return the pkgMtrlNmLikeFront
     */
    public String getPkgMtrlNmLikeFront() {
        return pkgMtrlNmLikeFront;
    }

    /**
     * pkgMtrlNmLikeFront のセッターメソッドです。
     * 
     * @param pkgMtrlNmLikeFront pkgMtrlNmLikeFront に設定する
     */
    public void setPkgMtrlNmLikeFront(String pkgMtrlNmLikeFront) {
        this.pkgMtrlNmLikeFront = pkgMtrlNmLikeFront;
    }

    /**
     * lengthUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the lengthUnitGreaterThan
     */
    public String getLengthUnitGreaterThan() {
        return lengthUnitGreaterThan;
    }

    /**
     * lengthUnitGreaterThan のセッターメソッドです。
     * 
     * @param lengthUnitGreaterThan lengthUnitGreaterThan に設定する
     */
    public void setLengthUnitGreaterThan(String lengthUnitGreaterThan) {
        this.lengthUnitGreaterThan = lengthUnitGreaterThan;
    }

    /**
     * lengthUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitGreaterThanEqual
     */
    public String getLengthUnitGreaterThanEqual() {
        return lengthUnitGreaterThanEqual;
    }

    /**
     * lengthUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitGreaterThanEqual lengthUnitGreaterThanEqual に設定する
     */
    public void setLengthUnitGreaterThanEqual(String lengthUnitGreaterThanEqual) {
        this.lengthUnitGreaterThanEqual = lengthUnitGreaterThanEqual;
    }

    /**
     * lengthUnitLessThan のゲッターメソッドです。
     * 
     * @return the lengthUnitLessThan
     */
    public String getLengthUnitLessThan() {
        return lengthUnitLessThan;
    }

    /**
     * lengthUnitLessThan のセッターメソッドです。
     * 
     * @param lengthUnitLessThan lengthUnitLessThan に設定する
     */
    public void setLengthUnitLessThan(String lengthUnitLessThan) {
        this.lengthUnitLessThan = lengthUnitLessThan;
    }

    /**
     * lengthUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitLessThanEqual
     */
    public String getLengthUnitLessThanEqual() {
        return lengthUnitLessThanEqual;
    }

    /**
     * lengthUnitLessThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitLessThanEqual lengthUnitLessThanEqual に設定する
     */
    public void setLengthUnitLessThanEqual(String lengthUnitLessThanEqual) {
        this.lengthUnitLessThanEqual = lengthUnitLessThanEqual;
    }

    /**
     * lengthUnitLikeFront のゲッターメソッドです。
     * 
     * @return the lengthUnitLikeFront
     */
    public String getLengthUnitLikeFront() {
        return lengthUnitLikeFront;
    }

    /**
     * lengthUnitLikeFront のセッターメソッドです。
     * 
     * @param lengthUnitLikeFront lengthUnitLikeFront に設定する
     */
    public void setLengthUnitLikeFront(String lengthUnitLikeFront) {
        this.lengthUnitLikeFront = lengthUnitLikeFront;
    }

    /**
     * supplierCdGreaterThan のゲッターメソッドです。
     * 
     * @return the supplierCdGreaterThan
     */
    public String getSupplierCdGreaterThan() {
        return supplierCdGreaterThan;
    }

    /**
     * supplierCdGreaterThan のセッターメソッドです。
     * 
     * @param supplierCdGreaterThan supplierCdGreaterThan に設定する
     */
    public void setSupplierCdGreaterThan(String supplierCdGreaterThan) {
        this.supplierCdGreaterThan = supplierCdGreaterThan;
    }

    /**
     * supplierCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the supplierCdGreaterThanEqual
     */
    public String getSupplierCdGreaterThanEqual() {
        return supplierCdGreaterThanEqual;
    }

    /**
     * supplierCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param supplierCdGreaterThanEqual supplierCdGreaterThanEqual に設定する
     */
    public void setSupplierCdGreaterThanEqual(String supplierCdGreaterThanEqual) {
        this.supplierCdGreaterThanEqual = supplierCdGreaterThanEqual;
    }

    /**
     * supplierCdLessThan のゲッターメソッドです。
     * 
     * @return the supplierCdLessThan
     */
    public String getSupplierCdLessThan() {
        return supplierCdLessThan;
    }

    /**
     * supplierCdLessThan のセッターメソッドです。
     * 
     * @param supplierCdLessThan supplierCdLessThan に設定する
     */
    public void setSupplierCdLessThan(String supplierCdLessThan) {
        this.supplierCdLessThan = supplierCdLessThan;
    }

    /**
     * supplierCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the supplierCdLessThanEqual
     */
    public String getSupplierCdLessThanEqual() {
        return supplierCdLessThanEqual;
    }

    /**
     * supplierCdLessThanEqual のセッターメソッドです。
     * 
     * @param supplierCdLessThanEqual supplierCdLessThanEqual に設定する
     */
    public void setSupplierCdLessThanEqual(String supplierCdLessThanEqual) {
        this.supplierCdLessThanEqual = supplierCdLessThanEqual;
    }

    /**
     * supplierCdLikeFront のゲッターメソッドです。
     * 
     * @return the supplierCdLikeFront
     */
    public String getSupplierCdLikeFront() {
        return supplierCdLikeFront;
    }

    /**
     * supplierCdLikeFront のセッターメソッドです。
     * 
     * @param supplierCdLikeFront supplierCdLikeFront に設定する
     */
    public void setSupplierCdLikeFront(String supplierCdLikeFront) {
        this.supplierCdLikeFront = supplierCdLikeFront;
    }

    /**
     * pkgSpecDetailSeqGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgSpecDetailSeqGreaterThan
     */
    public String getPkgSpecDetailSeqGreaterThan() {
        return pkgSpecDetailSeqGreaterThan;
    }

    /**
     * pkgSpecDetailSeqGreaterThan のセッターメソッドです。
     * 
     * @param pkgSpecDetailSeqGreaterThan pkgSpecDetailSeqGreaterThan に設定する
     */
    public void setPkgSpecDetailSeqGreaterThan(String pkgSpecDetailSeqGreaterThan) {
        this.pkgSpecDetailSeqGreaterThan = pkgSpecDetailSeqGreaterThan;
    }

    /**
     * pkgSpecDetailSeqGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgSpecDetailSeqGreaterThanEqual
     */
    public String getPkgSpecDetailSeqGreaterThanEqual() {
        return pkgSpecDetailSeqGreaterThanEqual;
    }

    /**
     * pkgSpecDetailSeqGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgSpecDetailSeqGreaterThanEqual pkgSpecDetailSeqGreaterThanEqual に設定する
     */
    public void setPkgSpecDetailSeqGreaterThanEqual(String pkgSpecDetailSeqGreaterThanEqual) {
        this.pkgSpecDetailSeqGreaterThanEqual = pkgSpecDetailSeqGreaterThanEqual;
    }

    /**
     * pkgSpecDetailSeqLessThan のゲッターメソッドです。
     * 
     * @return the pkgSpecDetailSeqLessThan
     */
    public String getPkgSpecDetailSeqLessThan() {
        return pkgSpecDetailSeqLessThan;
    }

    /**
     * pkgSpecDetailSeqLessThan のセッターメソッドです。
     * 
     * @param pkgSpecDetailSeqLessThan pkgSpecDetailSeqLessThan に設定する
     */
    public void setPkgSpecDetailSeqLessThan(String pkgSpecDetailSeqLessThan) {
        this.pkgSpecDetailSeqLessThan = pkgSpecDetailSeqLessThan;
    }

    /**
     * pkgSpecDetailSeqLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgSpecDetailSeqLessThanEqual
     */
    public String getPkgSpecDetailSeqLessThanEqual() {
        return pkgSpecDetailSeqLessThanEqual;
    }

    /**
     * pkgSpecDetailSeqLessThanEqual のセッターメソッドです。
     * 
     * @param pkgSpecDetailSeqLessThanEqual pkgSpecDetailSeqLessThanEqual に設定する
     */
    public void setPkgSpecDetailSeqLessThanEqual(String pkgSpecDetailSeqLessThanEqual) {
        this.pkgSpecDetailSeqLessThanEqual = pkgSpecDetailSeqLessThanEqual;
    }

    /**
     * pkgSpecDetailSeqLikeFront のゲッターメソッドです。
     * 
     * @return the pkgSpecDetailSeqLikeFront
     */
    public String getPkgSpecDetailSeqLikeFront() {
        return pkgSpecDetailSeqLikeFront;
    }

    /**
     * pkgSpecDetailSeqLikeFront のセッターメソッドです。
     * 
     * @param pkgSpecDetailSeqLikeFront pkgSpecDetailSeqLikeFront に設定する
     */
    public void setPkgSpecDetailSeqLikeFront(String pkgSpecDetailSeqLikeFront) {
        this.pkgSpecDetailSeqLikeFront = pkgSpecDetailSeqLikeFront;
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

}

