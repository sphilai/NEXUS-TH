/*
 * PROJECT：eca0027
 * 
 * TmCigmaWhXref の検索条件Domainクラス
 * テーブル概要：TM_CIGMA_WH_XREF
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmCigmaWhXref の検索条件Domainクラスです。<BR>
 * テーブル概要：TM_CIGMA_WH_XREF<BR>
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
public class TmCigmaWhXrefCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * LGCY_LIB_COMP_CD
     */
    private String lgcyLibCompCd;

    /**
     * LGCY_WH_CD
     */
    private String lgcyWhCd;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * WH_CD
     */
    private String whCd;

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
     * LGCY_LIB_COMP_CD（大なり）
     */
    private String lgcyLibCompCdGreaterThan;

    /**
     * LGCY_LIB_COMP_CD（大なりイコール）
     */
    private String lgcyLibCompCdGreaterThanEqual;

    /**
     * LGCY_LIB_COMP_CD（小なり）
     */
    private String lgcyLibCompCdLessThan;

    /**
     * LGCY_LIB_COMP_CD（小なりイコール）
     */
    private String lgcyLibCompCdLessThanEqual;

    /**
     * LGCY_LIB_COMP_CD（前方一致）
     */
    private String lgcyLibCompCdLikeFront;

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
    public TmCigmaWhXrefCriteriaDomain() {
    }

    /**
     * lgcyLibCompCd のゲッターメソッドです。
     * 
     * @return the lgcyLibCompCd
     */
    public String getLgcyLibCompCd() {
        return lgcyLibCompCd;
    }

    /**
     * lgcyLibCompCd のセッターメソッドです。
     * 
     * @param lgcyLibCompCd lgcyLibCompCd に設定する
     */
    public void setLgcyLibCompCd(String lgcyLibCompCd) {
        this.lgcyLibCompCd = lgcyLibCompCd;
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
     * lgcyLibCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the lgcyLibCompCdGreaterThan
     */
    public String getLgcyLibCompCdGreaterThan() {
        return lgcyLibCompCdGreaterThan;
    }

    /**
     * lgcyLibCompCdGreaterThan のセッターメソッドです。
     * 
     * @param lgcyLibCompCdGreaterThan lgcyLibCompCdGreaterThan に設定する
     */
    public void setLgcyLibCompCdGreaterThan(String lgcyLibCompCdGreaterThan) {
        this.lgcyLibCompCdGreaterThan = lgcyLibCompCdGreaterThan;
    }

    /**
     * lgcyLibCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyLibCompCdGreaterThanEqual
     */
    public String getLgcyLibCompCdGreaterThanEqual() {
        return lgcyLibCompCdGreaterThanEqual;
    }

    /**
     * lgcyLibCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param lgcyLibCompCdGreaterThanEqual lgcyLibCompCdGreaterThanEqual に設定する
     */
    public void setLgcyLibCompCdGreaterThanEqual(String lgcyLibCompCdGreaterThanEqual) {
        this.lgcyLibCompCdGreaterThanEqual = lgcyLibCompCdGreaterThanEqual;
    }

    /**
     * lgcyLibCompCdLessThan のゲッターメソッドです。
     * 
     * @return the lgcyLibCompCdLessThan
     */
    public String getLgcyLibCompCdLessThan() {
        return lgcyLibCompCdLessThan;
    }

    /**
     * lgcyLibCompCdLessThan のセッターメソッドです。
     * 
     * @param lgcyLibCompCdLessThan lgcyLibCompCdLessThan に設定する
     */
    public void setLgcyLibCompCdLessThan(String lgcyLibCompCdLessThan) {
        this.lgcyLibCompCdLessThan = lgcyLibCompCdLessThan;
    }

    /**
     * lgcyLibCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyLibCompCdLessThanEqual
     */
    public String getLgcyLibCompCdLessThanEqual() {
        return lgcyLibCompCdLessThanEqual;
    }

    /**
     * lgcyLibCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param lgcyLibCompCdLessThanEqual lgcyLibCompCdLessThanEqual に設定する
     */
    public void setLgcyLibCompCdLessThanEqual(String lgcyLibCompCdLessThanEqual) {
        this.lgcyLibCompCdLessThanEqual = lgcyLibCompCdLessThanEqual;
    }

    /**
     * lgcyLibCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the lgcyLibCompCdLikeFront
     */
    public String getLgcyLibCompCdLikeFront() {
        return lgcyLibCompCdLikeFront;
    }

    /**
     * lgcyLibCompCdLikeFront のセッターメソッドです。
     * 
     * @param lgcyLibCompCdLikeFront lgcyLibCompCdLikeFront に設定する
     */
    public void setLgcyLibCompCdLikeFront(String lgcyLibCompCdLikeFront) {
        this.lgcyLibCompCdLikeFront = lgcyLibCompCdLikeFront;
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

