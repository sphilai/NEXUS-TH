/*
 * PROJECT：eca0027
 * 
 * TmInvSeq の検索条件Domainクラス
 * テーブル概要：TM_INV_SEQ
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmInvSeq の検索条件Domainクラスです。<BR>
 * テーブル概要：TM_INV_SEQ<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/17 23:10:14<BR>
 * 
 * テーブル定義から2014/04/17に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class TmInvSeqCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * INV_NUMBERING_KEY
     */
    private String invNumberingKey;

    /**
     * STAR_NO
     */
    private String starNo;

    /**
     * END_NO
     */
    private String endNo;

    /**
     * NOW_NO
     */
    private String nowNo;

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
     * INV_NUMBERING_KEY（大なり）
     */
    private String invNumberingKeyGreaterThan;

    /**
     * INV_NUMBERING_KEY（大なりイコール）
     */
    private String invNumberingKeyGreaterThanEqual;

    /**
     * INV_NUMBERING_KEY（小なり）
     */
    private String invNumberingKeyLessThan;

    /**
     * INV_NUMBERING_KEY（小なりイコール）
     */
    private String invNumberingKeyLessThanEqual;

    /**
     * INV_NUMBERING_KEY（前方一致）
     */
    private String invNumberingKeyLikeFront;

    /**
     * STAR_NO（大なり）
     */
    private String starNoGreaterThan;

    /**
     * STAR_NO（大なりイコール）
     */
    private String starNoGreaterThanEqual;

    /**
     * STAR_NO（小なり）
     */
    private String starNoLessThan;

    /**
     * STAR_NO（小なりイコール）
     */
    private String starNoLessThanEqual;

    /**
     * STAR_NO（前方一致）
     */
    private String starNoLikeFront;

    /**
     * END_NO（大なり）
     */
    private String endNoGreaterThan;

    /**
     * END_NO（大なりイコール）
     */
    private String endNoGreaterThanEqual;

    /**
     * END_NO（小なり）
     */
    private String endNoLessThan;

    /**
     * END_NO（小なりイコール）
     */
    private String endNoLessThanEqual;

    /**
     * END_NO（前方一致）
     */
    private String endNoLikeFront;

    /**
     * NOW_NO（大なり）
     */
    private String nowNoGreaterThan;

    /**
     * NOW_NO（大なりイコール）
     */
    private String nowNoGreaterThanEqual;

    /**
     * NOW_NO（小なり）
     */
    private String nowNoLessThan;

    /**
     * NOW_NO（小なりイコール）
     */
    private String nowNoLessThanEqual;

    /**
     * NOW_NO（前方一致）
     */
    private String nowNoLikeFront;

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
    public TmInvSeqCriteriaDomain() {
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
     * invNumberingKey のゲッターメソッドです。
     * 
     * @return the invNumberingKey
     */
    public String getInvNumberingKey() {
        return invNumberingKey;
    }

    /**
     * invNumberingKey のセッターメソッドです。
     * 
     * @param invNumberingKey invNumberingKey に設定する
     */
    public void setInvNumberingKey(String invNumberingKey) {
        this.invNumberingKey = invNumberingKey;
    }

    /**
     * starNo のゲッターメソッドです。
     * 
     * @return the starNo
     */
    public String getStarNo() {
        return starNo;
    }

    /**
     * starNo のセッターメソッドです。
     * 
     * @param starNo starNo に設定する
     */
    public void setStarNo(String starNo) {
        this.starNo = starNo;
    }

    /**
     * endNo のゲッターメソッドです。
     * 
     * @return the endNo
     */
    public String getEndNo() {
        return endNo;
    }

    /**
     * endNo のセッターメソッドです。
     * 
     * @param endNo endNo に設定する
     */
    public void setEndNo(String endNo) {
        this.endNo = endNo;
    }

    /**
     * nowNo のゲッターメソッドです。
     * 
     * @return the nowNo
     */
    public String getNowNo() {
        return nowNo;
    }

    /**
     * nowNo のセッターメソッドです。
     * 
     * @param nowNo nowNo に設定する
     */
    public void setNowNo(String nowNo) {
        this.nowNo = nowNo;
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
     * invNumberingKeyGreaterThan のゲッターメソッドです。
     * 
     * @return the invNumberingKeyGreaterThan
     */
    public String getInvNumberingKeyGreaterThan() {
        return invNumberingKeyGreaterThan;
    }

    /**
     * invNumberingKeyGreaterThan のセッターメソッドです。
     * 
     * @param invNumberingKeyGreaterThan invNumberingKeyGreaterThan に設定する
     */
    public void setInvNumberingKeyGreaterThan(String invNumberingKeyGreaterThan) {
        this.invNumberingKeyGreaterThan = invNumberingKeyGreaterThan;
    }

    /**
     * invNumberingKeyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invNumberingKeyGreaterThanEqual
     */
    public String getInvNumberingKeyGreaterThanEqual() {
        return invNumberingKeyGreaterThanEqual;
    }

    /**
     * invNumberingKeyGreaterThanEqual のセッターメソッドです。
     * 
     * @param invNumberingKeyGreaterThanEqual invNumberingKeyGreaterThanEqual に設定する
     */
    public void setInvNumberingKeyGreaterThanEqual(String invNumberingKeyGreaterThanEqual) {
        this.invNumberingKeyGreaterThanEqual = invNumberingKeyGreaterThanEqual;
    }

    /**
     * invNumberingKeyLessThan のゲッターメソッドです。
     * 
     * @return the invNumberingKeyLessThan
     */
    public String getInvNumberingKeyLessThan() {
        return invNumberingKeyLessThan;
    }

    /**
     * invNumberingKeyLessThan のセッターメソッドです。
     * 
     * @param invNumberingKeyLessThan invNumberingKeyLessThan に設定する
     */
    public void setInvNumberingKeyLessThan(String invNumberingKeyLessThan) {
        this.invNumberingKeyLessThan = invNumberingKeyLessThan;
    }

    /**
     * invNumberingKeyLessThanEqual のゲッターメソッドです。
     * 
     * @return the invNumberingKeyLessThanEqual
     */
    public String getInvNumberingKeyLessThanEqual() {
        return invNumberingKeyLessThanEqual;
    }

    /**
     * invNumberingKeyLessThanEqual のセッターメソッドです。
     * 
     * @param invNumberingKeyLessThanEqual invNumberingKeyLessThanEqual に設定する
     */
    public void setInvNumberingKeyLessThanEqual(String invNumberingKeyLessThanEqual) {
        this.invNumberingKeyLessThanEqual = invNumberingKeyLessThanEqual;
    }

    /**
     * invNumberingKeyLikeFront のゲッターメソッドです。
     * 
     * @return the invNumberingKeyLikeFront
     */
    public String getInvNumberingKeyLikeFront() {
        return invNumberingKeyLikeFront;
    }

    /**
     * invNumberingKeyLikeFront のセッターメソッドです。
     * 
     * @param invNumberingKeyLikeFront invNumberingKeyLikeFront に設定する
     */
    public void setInvNumberingKeyLikeFront(String invNumberingKeyLikeFront) {
        this.invNumberingKeyLikeFront = invNumberingKeyLikeFront;
    }

    /**
     * starNoGreaterThan のゲッターメソッドです。
     * 
     * @return the starNoGreaterThan
     */
    public String getStarNoGreaterThan() {
        return starNoGreaterThan;
    }

    /**
     * starNoGreaterThan のセッターメソッドです。
     * 
     * @param starNoGreaterThan starNoGreaterThan に設定する
     */
    public void setStarNoGreaterThan(String starNoGreaterThan) {
        this.starNoGreaterThan = starNoGreaterThan;
    }

    /**
     * starNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the starNoGreaterThanEqual
     */
    public String getStarNoGreaterThanEqual() {
        return starNoGreaterThanEqual;
    }

    /**
     * starNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param starNoGreaterThanEqual starNoGreaterThanEqual に設定する
     */
    public void setStarNoGreaterThanEqual(String starNoGreaterThanEqual) {
        this.starNoGreaterThanEqual = starNoGreaterThanEqual;
    }

    /**
     * starNoLessThan のゲッターメソッドです。
     * 
     * @return the starNoLessThan
     */
    public String getStarNoLessThan() {
        return starNoLessThan;
    }

    /**
     * starNoLessThan のセッターメソッドです。
     * 
     * @param starNoLessThan starNoLessThan に設定する
     */
    public void setStarNoLessThan(String starNoLessThan) {
        this.starNoLessThan = starNoLessThan;
    }

    /**
     * starNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the starNoLessThanEqual
     */
    public String getStarNoLessThanEqual() {
        return starNoLessThanEqual;
    }

    /**
     * starNoLessThanEqual のセッターメソッドです。
     * 
     * @param starNoLessThanEqual starNoLessThanEqual に設定する
     */
    public void setStarNoLessThanEqual(String starNoLessThanEqual) {
        this.starNoLessThanEqual = starNoLessThanEqual;
    }

    /**
     * starNoLikeFront のゲッターメソッドです。
     * 
     * @return the starNoLikeFront
     */
    public String getStarNoLikeFront() {
        return starNoLikeFront;
    }

    /**
     * starNoLikeFront のセッターメソッドです。
     * 
     * @param starNoLikeFront starNoLikeFront に設定する
     */
    public void setStarNoLikeFront(String starNoLikeFront) {
        this.starNoLikeFront = starNoLikeFront;
    }

    /**
     * endNoGreaterThan のゲッターメソッドです。
     * 
     * @return the endNoGreaterThan
     */
    public String getEndNoGreaterThan() {
        return endNoGreaterThan;
    }

    /**
     * endNoGreaterThan のセッターメソッドです。
     * 
     * @param endNoGreaterThan endNoGreaterThan に設定する
     */
    public void setEndNoGreaterThan(String endNoGreaterThan) {
        this.endNoGreaterThan = endNoGreaterThan;
    }

    /**
     * endNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the endNoGreaterThanEqual
     */
    public String getEndNoGreaterThanEqual() {
        return endNoGreaterThanEqual;
    }

    /**
     * endNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param endNoGreaterThanEqual endNoGreaterThanEqual に設定する
     */
    public void setEndNoGreaterThanEqual(String endNoGreaterThanEqual) {
        this.endNoGreaterThanEqual = endNoGreaterThanEqual;
    }

    /**
     * endNoLessThan のゲッターメソッドです。
     * 
     * @return the endNoLessThan
     */
    public String getEndNoLessThan() {
        return endNoLessThan;
    }

    /**
     * endNoLessThan のセッターメソッドです。
     * 
     * @param endNoLessThan endNoLessThan に設定する
     */
    public void setEndNoLessThan(String endNoLessThan) {
        this.endNoLessThan = endNoLessThan;
    }

    /**
     * endNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the endNoLessThanEqual
     */
    public String getEndNoLessThanEqual() {
        return endNoLessThanEqual;
    }

    /**
     * endNoLessThanEqual のセッターメソッドです。
     * 
     * @param endNoLessThanEqual endNoLessThanEqual に設定する
     */
    public void setEndNoLessThanEqual(String endNoLessThanEqual) {
        this.endNoLessThanEqual = endNoLessThanEqual;
    }

    /**
     * endNoLikeFront のゲッターメソッドです。
     * 
     * @return the endNoLikeFront
     */
    public String getEndNoLikeFront() {
        return endNoLikeFront;
    }

    /**
     * endNoLikeFront のセッターメソッドです。
     * 
     * @param endNoLikeFront endNoLikeFront に設定する
     */
    public void setEndNoLikeFront(String endNoLikeFront) {
        this.endNoLikeFront = endNoLikeFront;
    }

    /**
     * nowNoGreaterThan のゲッターメソッドです。
     * 
     * @return the nowNoGreaterThan
     */
    public String getNowNoGreaterThan() {
        return nowNoGreaterThan;
    }

    /**
     * nowNoGreaterThan のセッターメソッドです。
     * 
     * @param nowNoGreaterThan nowNoGreaterThan に設定する
     */
    public void setNowNoGreaterThan(String nowNoGreaterThan) {
        this.nowNoGreaterThan = nowNoGreaterThan;
    }

    /**
     * nowNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the nowNoGreaterThanEqual
     */
    public String getNowNoGreaterThanEqual() {
        return nowNoGreaterThanEqual;
    }

    /**
     * nowNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param nowNoGreaterThanEqual nowNoGreaterThanEqual に設定する
     */
    public void setNowNoGreaterThanEqual(String nowNoGreaterThanEqual) {
        this.nowNoGreaterThanEqual = nowNoGreaterThanEqual;
    }

    /**
     * nowNoLessThan のゲッターメソッドです。
     * 
     * @return the nowNoLessThan
     */
    public String getNowNoLessThan() {
        return nowNoLessThan;
    }

    /**
     * nowNoLessThan のセッターメソッドです。
     * 
     * @param nowNoLessThan nowNoLessThan に設定する
     */
    public void setNowNoLessThan(String nowNoLessThan) {
        this.nowNoLessThan = nowNoLessThan;
    }

    /**
     * nowNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the nowNoLessThanEqual
     */
    public String getNowNoLessThanEqual() {
        return nowNoLessThanEqual;
    }

    /**
     * nowNoLessThanEqual のセッターメソッドです。
     * 
     * @param nowNoLessThanEqual nowNoLessThanEqual に設定する
     */
    public void setNowNoLessThanEqual(String nowNoLessThanEqual) {
        this.nowNoLessThanEqual = nowNoLessThanEqual;
    }

    /**
     * nowNoLikeFront のゲッターメソッドです。
     * 
     * @return the nowNoLikeFront
     */
    public String getNowNoLikeFront() {
        return nowNoLikeFront;
    }

    /**
     * nowNoLikeFront のセッターメソッドです。
     * 
     * @param nowNoLikeFront nowNoLikeFront に設定する
     */
    public void setNowNoLikeFront(String nowNoLikeFront) {
        this.nowNoLikeFront = nowNoLikeFront;
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

