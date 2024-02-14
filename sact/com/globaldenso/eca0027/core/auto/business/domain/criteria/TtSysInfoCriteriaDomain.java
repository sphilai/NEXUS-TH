/*
 * PROJECT：eca0027
 * 
 * TtSysInfo の検索条件Domainクラス
 * テーブル概要：TT_SYS_INFO
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
import java.sql.Timestamp;

/**
 * TtSysInfo の検索条件Domainクラスです。<BR>
 * テーブル概要：TT_SYS_INFO<BR>
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
public class TtSysInfoCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * TT_SYS_INFO_SEQ
     */
    private String ttSysInfoSeq;

    /**
     * INFO_TRGT_CTGRY
     */
    private String infoTrgtCtgry;

    /**
     * INFO_TRGT
     */
    private String infoTrgt;

    /**
     * PUB_STRT_DT
     */
    private Date pubStrtDt;

    /**
     * PUB_END_DT
     */
    private Date pubEndDt;

    /**
     * INFO_TYP
     */
    private String infoTyp;

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
     * TT_SYS_INFO_SEQ（大なり）
     */
    private String ttSysInfoSeqGreaterThan;

    /**
     * TT_SYS_INFO_SEQ（大なりイコール）
     */
    private String ttSysInfoSeqGreaterThanEqual;

    /**
     * TT_SYS_INFO_SEQ（小なり）
     */
    private String ttSysInfoSeqLessThan;

    /**
     * TT_SYS_INFO_SEQ（小なりイコール）
     */
    private String ttSysInfoSeqLessThanEqual;

    /**
     * TT_SYS_INFO_SEQ（前方一致）
     */
    private String ttSysInfoSeqLikeFront;

    /**
     * INFO_TRGT_CTGRY（大なり）
     */
    private String infoTrgtCtgryGreaterThan;

    /**
     * INFO_TRGT_CTGRY（大なりイコール）
     */
    private String infoTrgtCtgryGreaterThanEqual;

    /**
     * INFO_TRGT_CTGRY（小なり）
     */
    private String infoTrgtCtgryLessThan;

    /**
     * INFO_TRGT_CTGRY（小なりイコール）
     */
    private String infoTrgtCtgryLessThanEqual;

    /**
     * INFO_TRGT_CTGRY（前方一致）
     */
    private String infoTrgtCtgryLikeFront;

    /**
     * INFO_TRGT（大なり）
     */
    private String infoTrgtGreaterThan;

    /**
     * INFO_TRGT（大なりイコール）
     */
    private String infoTrgtGreaterThanEqual;

    /**
     * INFO_TRGT（小なり）
     */
    private String infoTrgtLessThan;

    /**
     * INFO_TRGT（小なりイコール）
     */
    private String infoTrgtLessThanEqual;

    /**
     * INFO_TRGT（前方一致）
     */
    private String infoTrgtLikeFront;

    /**
     * PUB_STRT_DT（大なりイコール）
     */
    private Date pubStrtDtGreaterThanEqual;

    /**
     * PUB_STRT_DT（小なりイコール）
     */
    private Date pubStrtDtLessThanEqual;

    /**
     * PUB_END_DT（大なりイコール）
     */
    private Date pubEndDtGreaterThanEqual;

    /**
     * PUB_END_DT（小なりイコール）
     */
    private Date pubEndDtLessThanEqual;

    /**
     * INFO_TYP（大なり）
     */
    private String infoTypGreaterThan;

    /**
     * INFO_TYP（大なりイコール）
     */
    private String infoTypGreaterThanEqual;

    /**
     * INFO_TYP（小なり）
     */
    private String infoTypLessThan;

    /**
     * INFO_TYP（小なりイコール）
     */
    private String infoTypLessThanEqual;

    /**
     * INFO_TYP（前方一致）
     */
    private String infoTypLikeFront;

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
    public TtSysInfoCriteriaDomain() {
    }

    /**
     * ttSysInfoSeq のゲッターメソッドです。
     * 
     * @return the ttSysInfoSeq
     */
    public String getTtSysInfoSeq() {
        return ttSysInfoSeq;
    }

    /**
     * ttSysInfoSeq のセッターメソッドです。
     * 
     * @param ttSysInfoSeq ttSysInfoSeq に設定する
     */
    public void setTtSysInfoSeq(String ttSysInfoSeq) {
        this.ttSysInfoSeq = ttSysInfoSeq;
    }

    /**
     * infoTrgtCtgry のゲッターメソッドです。
     * 
     * @return the infoTrgtCtgry
     */
    public String getInfoTrgtCtgry() {
        return infoTrgtCtgry;
    }

    /**
     * infoTrgtCtgry のセッターメソッドです。
     * 
     * @param infoTrgtCtgry infoTrgtCtgry に設定する
     */
    public void setInfoTrgtCtgry(String infoTrgtCtgry) {
        this.infoTrgtCtgry = infoTrgtCtgry;
    }

    /**
     * infoTrgt のゲッターメソッドです。
     * 
     * @return the infoTrgt
     */
    public String getInfoTrgt() {
        return infoTrgt;
    }

    /**
     * infoTrgt のセッターメソッドです。
     * 
     * @param infoTrgt infoTrgt に設定する
     */
    public void setInfoTrgt(String infoTrgt) {
        this.infoTrgt = infoTrgt;
    }

    /**
     * pubStrtDt のゲッターメソッドです。
     * 
     * @return the pubStrtDt
     */
    public Date getPubStrtDt() {
        return pubStrtDt;
    }

    /**
     * pubStrtDt のセッターメソッドです。
     * 
     * @param pubStrtDt pubStrtDt に設定する
     */
    public void setPubStrtDt(Date pubStrtDt) {
        this.pubStrtDt = pubStrtDt;
    }

    /**
     * pubEndDt のゲッターメソッドです。
     * 
     * @return the pubEndDt
     */
    public Date getPubEndDt() {
        return pubEndDt;
    }

    /**
     * pubEndDt のセッターメソッドです。
     * 
     * @param pubEndDt pubEndDt に設定する
     */
    public void setPubEndDt(Date pubEndDt) {
        this.pubEndDt = pubEndDt;
    }

    /**
     * infoTyp のゲッターメソッドです。
     * 
     * @return the infoTyp
     */
    public String getInfoTyp() {
        return infoTyp;
    }

    /**
     * infoTyp のセッターメソッドです。
     * 
     * @param infoTyp infoTyp に設定する
     */
    public void setInfoTyp(String infoTyp) {
        this.infoTyp = infoTyp;
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
     * ttSysInfoSeqGreaterThan のゲッターメソッドです。
     * 
     * @return the ttSysInfoSeqGreaterThan
     */
    public String getTtSysInfoSeqGreaterThan() {
        return ttSysInfoSeqGreaterThan;
    }

    /**
     * ttSysInfoSeqGreaterThan のセッターメソッドです。
     * 
     * @param ttSysInfoSeqGreaterThan ttSysInfoSeqGreaterThan に設定する
     */
    public void setTtSysInfoSeqGreaterThan(String ttSysInfoSeqGreaterThan) {
        this.ttSysInfoSeqGreaterThan = ttSysInfoSeqGreaterThan;
    }

    /**
     * ttSysInfoSeqGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the ttSysInfoSeqGreaterThanEqual
     */
    public String getTtSysInfoSeqGreaterThanEqual() {
        return ttSysInfoSeqGreaterThanEqual;
    }

    /**
     * ttSysInfoSeqGreaterThanEqual のセッターメソッドです。
     * 
     * @param ttSysInfoSeqGreaterThanEqual ttSysInfoSeqGreaterThanEqual に設定する
     */
    public void setTtSysInfoSeqGreaterThanEqual(String ttSysInfoSeqGreaterThanEqual) {
        this.ttSysInfoSeqGreaterThanEqual = ttSysInfoSeqGreaterThanEqual;
    }

    /**
     * ttSysInfoSeqLessThan のゲッターメソッドです。
     * 
     * @return the ttSysInfoSeqLessThan
     */
    public String getTtSysInfoSeqLessThan() {
        return ttSysInfoSeqLessThan;
    }

    /**
     * ttSysInfoSeqLessThan のセッターメソッドです。
     * 
     * @param ttSysInfoSeqLessThan ttSysInfoSeqLessThan に設定する
     */
    public void setTtSysInfoSeqLessThan(String ttSysInfoSeqLessThan) {
        this.ttSysInfoSeqLessThan = ttSysInfoSeqLessThan;
    }

    /**
     * ttSysInfoSeqLessThanEqual のゲッターメソッドです。
     * 
     * @return the ttSysInfoSeqLessThanEqual
     */
    public String getTtSysInfoSeqLessThanEqual() {
        return ttSysInfoSeqLessThanEqual;
    }

    /**
     * ttSysInfoSeqLessThanEqual のセッターメソッドです。
     * 
     * @param ttSysInfoSeqLessThanEqual ttSysInfoSeqLessThanEqual に設定する
     */
    public void setTtSysInfoSeqLessThanEqual(String ttSysInfoSeqLessThanEqual) {
        this.ttSysInfoSeqLessThanEqual = ttSysInfoSeqLessThanEqual;
    }

    /**
     * ttSysInfoSeqLikeFront のゲッターメソッドです。
     * 
     * @return the ttSysInfoSeqLikeFront
     */
    public String getTtSysInfoSeqLikeFront() {
        return ttSysInfoSeqLikeFront;
    }

    /**
     * ttSysInfoSeqLikeFront のセッターメソッドです。
     * 
     * @param ttSysInfoSeqLikeFront ttSysInfoSeqLikeFront に設定する
     */
    public void setTtSysInfoSeqLikeFront(String ttSysInfoSeqLikeFront) {
        this.ttSysInfoSeqLikeFront = ttSysInfoSeqLikeFront;
    }

    /**
     * infoTrgtCtgryGreaterThan のゲッターメソッドです。
     * 
     * @return the infoTrgtCtgryGreaterThan
     */
    public String getInfoTrgtCtgryGreaterThan() {
        return infoTrgtCtgryGreaterThan;
    }

    /**
     * infoTrgtCtgryGreaterThan のセッターメソッドです。
     * 
     * @param infoTrgtCtgryGreaterThan infoTrgtCtgryGreaterThan に設定する
     */
    public void setInfoTrgtCtgryGreaterThan(String infoTrgtCtgryGreaterThan) {
        this.infoTrgtCtgryGreaterThan = infoTrgtCtgryGreaterThan;
    }

    /**
     * infoTrgtCtgryGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the infoTrgtCtgryGreaterThanEqual
     */
    public String getInfoTrgtCtgryGreaterThanEqual() {
        return infoTrgtCtgryGreaterThanEqual;
    }

    /**
     * infoTrgtCtgryGreaterThanEqual のセッターメソッドです。
     * 
     * @param infoTrgtCtgryGreaterThanEqual infoTrgtCtgryGreaterThanEqual に設定する
     */
    public void setInfoTrgtCtgryGreaterThanEqual(String infoTrgtCtgryGreaterThanEqual) {
        this.infoTrgtCtgryGreaterThanEqual = infoTrgtCtgryGreaterThanEqual;
    }

    /**
     * infoTrgtCtgryLessThan のゲッターメソッドです。
     * 
     * @return the infoTrgtCtgryLessThan
     */
    public String getInfoTrgtCtgryLessThan() {
        return infoTrgtCtgryLessThan;
    }

    /**
     * infoTrgtCtgryLessThan のセッターメソッドです。
     * 
     * @param infoTrgtCtgryLessThan infoTrgtCtgryLessThan に設定する
     */
    public void setInfoTrgtCtgryLessThan(String infoTrgtCtgryLessThan) {
        this.infoTrgtCtgryLessThan = infoTrgtCtgryLessThan;
    }

    /**
     * infoTrgtCtgryLessThanEqual のゲッターメソッドです。
     * 
     * @return the infoTrgtCtgryLessThanEqual
     */
    public String getInfoTrgtCtgryLessThanEqual() {
        return infoTrgtCtgryLessThanEqual;
    }

    /**
     * infoTrgtCtgryLessThanEqual のセッターメソッドです。
     * 
     * @param infoTrgtCtgryLessThanEqual infoTrgtCtgryLessThanEqual に設定する
     */
    public void setInfoTrgtCtgryLessThanEqual(String infoTrgtCtgryLessThanEqual) {
        this.infoTrgtCtgryLessThanEqual = infoTrgtCtgryLessThanEqual;
    }

    /**
     * infoTrgtCtgryLikeFront のゲッターメソッドです。
     * 
     * @return the infoTrgtCtgryLikeFront
     */
    public String getInfoTrgtCtgryLikeFront() {
        return infoTrgtCtgryLikeFront;
    }

    /**
     * infoTrgtCtgryLikeFront のセッターメソッドです。
     * 
     * @param infoTrgtCtgryLikeFront infoTrgtCtgryLikeFront に設定する
     */
    public void setInfoTrgtCtgryLikeFront(String infoTrgtCtgryLikeFront) {
        this.infoTrgtCtgryLikeFront = infoTrgtCtgryLikeFront;
    }

    /**
     * infoTrgtGreaterThan のゲッターメソッドです。
     * 
     * @return the infoTrgtGreaterThan
     */
    public String getInfoTrgtGreaterThan() {
        return infoTrgtGreaterThan;
    }

    /**
     * infoTrgtGreaterThan のセッターメソッドです。
     * 
     * @param infoTrgtGreaterThan infoTrgtGreaterThan に設定する
     */
    public void setInfoTrgtGreaterThan(String infoTrgtGreaterThan) {
        this.infoTrgtGreaterThan = infoTrgtGreaterThan;
    }

    /**
     * infoTrgtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the infoTrgtGreaterThanEqual
     */
    public String getInfoTrgtGreaterThanEqual() {
        return infoTrgtGreaterThanEqual;
    }

    /**
     * infoTrgtGreaterThanEqual のセッターメソッドです。
     * 
     * @param infoTrgtGreaterThanEqual infoTrgtGreaterThanEqual に設定する
     */
    public void setInfoTrgtGreaterThanEqual(String infoTrgtGreaterThanEqual) {
        this.infoTrgtGreaterThanEqual = infoTrgtGreaterThanEqual;
    }

    /**
     * infoTrgtLessThan のゲッターメソッドです。
     * 
     * @return the infoTrgtLessThan
     */
    public String getInfoTrgtLessThan() {
        return infoTrgtLessThan;
    }

    /**
     * infoTrgtLessThan のセッターメソッドです。
     * 
     * @param infoTrgtLessThan infoTrgtLessThan に設定する
     */
    public void setInfoTrgtLessThan(String infoTrgtLessThan) {
        this.infoTrgtLessThan = infoTrgtLessThan;
    }

    /**
     * infoTrgtLessThanEqual のゲッターメソッドです。
     * 
     * @return the infoTrgtLessThanEqual
     */
    public String getInfoTrgtLessThanEqual() {
        return infoTrgtLessThanEqual;
    }

    /**
     * infoTrgtLessThanEqual のセッターメソッドです。
     * 
     * @param infoTrgtLessThanEqual infoTrgtLessThanEqual に設定する
     */
    public void setInfoTrgtLessThanEqual(String infoTrgtLessThanEqual) {
        this.infoTrgtLessThanEqual = infoTrgtLessThanEqual;
    }

    /**
     * infoTrgtLikeFront のゲッターメソッドです。
     * 
     * @return the infoTrgtLikeFront
     */
    public String getInfoTrgtLikeFront() {
        return infoTrgtLikeFront;
    }

    /**
     * infoTrgtLikeFront のセッターメソッドです。
     * 
     * @param infoTrgtLikeFront infoTrgtLikeFront に設定する
     */
    public void setInfoTrgtLikeFront(String infoTrgtLikeFront) {
        this.infoTrgtLikeFront = infoTrgtLikeFront;
    }

    /**
     * pubStrtDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pubStrtDtGreaterThanEqual
     */
    public Date getPubStrtDtGreaterThanEqual() {
        return pubStrtDtGreaterThanEqual;
    }

    /**
     * pubStrtDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param pubStrtDtGreaterThanEqual pubStrtDtGreaterThanEqual に設定する
     */
    public void setPubStrtDtGreaterThanEqual(Date pubStrtDtGreaterThanEqual) {
        this.pubStrtDtGreaterThanEqual = pubStrtDtGreaterThanEqual;
    }

    /**
     * pubStrtDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the pubStrtDtLessThanEqual
     */
    public Date getPubStrtDtLessThanEqual() {
        return pubStrtDtLessThanEqual;
    }

    /**
     * pubStrtDtLessThanEqual のセッターメソッドです。
     * 
     * @param pubStrtDtLessThanEqual pubStrtDtLessThanEqual に設定する
     */
    public void setPubStrtDtLessThanEqual(Date pubStrtDtLessThanEqual) {
        this.pubStrtDtLessThanEqual = pubStrtDtLessThanEqual;
    }

    /**
     * pubEndDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pubEndDtGreaterThanEqual
     */
    public Date getPubEndDtGreaterThanEqual() {
        return pubEndDtGreaterThanEqual;
    }

    /**
     * pubEndDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param pubEndDtGreaterThanEqual pubEndDtGreaterThanEqual に設定する
     */
    public void setPubEndDtGreaterThanEqual(Date pubEndDtGreaterThanEqual) {
        this.pubEndDtGreaterThanEqual = pubEndDtGreaterThanEqual;
    }

    /**
     * pubEndDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the pubEndDtLessThanEqual
     */
    public Date getPubEndDtLessThanEqual() {
        return pubEndDtLessThanEqual;
    }

    /**
     * pubEndDtLessThanEqual のセッターメソッドです。
     * 
     * @param pubEndDtLessThanEqual pubEndDtLessThanEqual に設定する
     */
    public void setPubEndDtLessThanEqual(Date pubEndDtLessThanEqual) {
        this.pubEndDtLessThanEqual = pubEndDtLessThanEqual;
    }

    /**
     * infoTypGreaterThan のゲッターメソッドです。
     * 
     * @return the infoTypGreaterThan
     */
    public String getInfoTypGreaterThan() {
        return infoTypGreaterThan;
    }

    /**
     * infoTypGreaterThan のセッターメソッドです。
     * 
     * @param infoTypGreaterThan infoTypGreaterThan に設定する
     */
    public void setInfoTypGreaterThan(String infoTypGreaterThan) {
        this.infoTypGreaterThan = infoTypGreaterThan;
    }

    /**
     * infoTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the infoTypGreaterThanEqual
     */
    public String getInfoTypGreaterThanEqual() {
        return infoTypGreaterThanEqual;
    }

    /**
     * infoTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param infoTypGreaterThanEqual infoTypGreaterThanEqual に設定する
     */
    public void setInfoTypGreaterThanEqual(String infoTypGreaterThanEqual) {
        this.infoTypGreaterThanEqual = infoTypGreaterThanEqual;
    }

    /**
     * infoTypLessThan のゲッターメソッドです。
     * 
     * @return the infoTypLessThan
     */
    public String getInfoTypLessThan() {
        return infoTypLessThan;
    }

    /**
     * infoTypLessThan のセッターメソッドです。
     * 
     * @param infoTypLessThan infoTypLessThan に設定する
     */
    public void setInfoTypLessThan(String infoTypLessThan) {
        this.infoTypLessThan = infoTypLessThan;
    }

    /**
     * infoTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the infoTypLessThanEqual
     */
    public String getInfoTypLessThanEqual() {
        return infoTypLessThanEqual;
    }

    /**
     * infoTypLessThanEqual のセッターメソッドです。
     * 
     * @param infoTypLessThanEqual infoTypLessThanEqual に設定する
     */
    public void setInfoTypLessThanEqual(String infoTypLessThanEqual) {
        this.infoTypLessThanEqual = infoTypLessThanEqual;
    }

    /**
     * infoTypLikeFront のゲッターメソッドです。
     * 
     * @return the infoTypLikeFront
     */
    public String getInfoTypLikeFront() {
        return infoTypLikeFront;
    }

    /**
     * infoTypLikeFront のセッターメソッドです。
     * 
     * @param infoTypLikeFront infoTypLikeFront に設定する
     */
    public void setInfoTypLikeFront(String infoTypLikeFront) {
        this.infoTypLikeFront = infoTypLikeFront;
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

