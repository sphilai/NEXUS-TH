/*
 * PROJECT：eca0027
 * 
 * TmCustomerQrPatternDtl のDomainクラス
 * テーブル概要：TM_CUSTOMER_QR_PATTERN_DTL
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmCustomerQrPatternDtl のDomainクラスです。<BR>
 * テーブル概要：TM_CUSTOMER_QR_PATTERN_DTL<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmCustomerQrPatternDtlDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * COLLATE_METH_TYP
     */
    private String collateMethTyp;

    /**
     * STRT_POS
     */
    private BigDecimal strtPos;

    /**
     * QR_ITEM_LENGTH
     */
    private BigDecimal qrItemLength;

    /**
     * QR_ITEM_TYP
     */
    private String qrItemTyp;

    /**
     * CHK_VALUE
     */
    private String chkValue;

    /**
     * QR_ITEM_ID
     */
    private String qrItemId;

    /**
     * REQ_FLG
     */
    private String reqFlg;

    /**
     * ATTR_TYP
     */
    private String attrTyp;

    /**
     * GRP_ID
     */
    private String grpId;

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
     * デフォルトコンストラクタ。
     */
    public TmCustomerQrPatternDtlDomain() {
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
     * collateMethTyp のゲッターメソッドです。
     * 
     * @return the collateMethTyp
     */
    public String getCollateMethTyp() {
        return collateMethTyp;
    }

    /**
     * collateMethTyp のセッターメソッドです。
     * 
     * @param collateMethTyp collateMethTyp に設定する
     */
    public void setCollateMethTyp(String collateMethTyp) {
        this.collateMethTyp = collateMethTyp;
    }

    /**
     * strtPos のゲッターメソッドです。
     * 
     * @return the strtPos
     */
    public BigDecimal getStrtPos() {
        return strtPos;
    }

    /**
     * strtPos のセッターメソッドです。
     * 
     * @param strtPos strtPos に設定する
     */
    public void setStrtPos(BigDecimal strtPos) {
        this.strtPos = strtPos;
    }

    /**
     * qrItemLength のゲッターメソッドです。
     * 
     * @return the qrItemLength
     */
    public BigDecimal getQrItemLength() {
        return qrItemLength;
    }

    /**
     * qrItemLength のセッターメソッドです。
     * 
     * @param qrItemLength qrItemLength に設定する
     */
    public void setQrItemLength(BigDecimal qrItemLength) {
        this.qrItemLength = qrItemLength;
    }

    /**
     * qrItemTyp のゲッターメソッドです。
     * 
     * @return the qrItemTyp
     */
    public String getQrItemTyp() {
        return qrItemTyp;
    }

    /**
     * qrItemTyp のセッターメソッドです。
     * 
     * @param qrItemTyp qrItemTyp に設定する
     */
    public void setQrItemTyp(String qrItemTyp) {
        this.qrItemTyp = qrItemTyp;
    }

    /**
     * chkValue のゲッターメソッドです。
     * 
     * @return the chkValue
     */
    public String getChkValue() {
        return chkValue;
    }

    /**
     * chkValue のセッターメソッドです。
     * 
     * @param chkValue chkValue に設定する
     */
    public void setChkValue(String chkValue) {
        this.chkValue = chkValue;
    }

    /**
     * qrItemId のゲッターメソッドです。
     * 
     * @return the qrItemId
     */
    public String getQrItemId() {
        return qrItemId;
    }

    /**
     * qrItemId のセッターメソッドです。
     * 
     * @param qrItemId qrItemId に設定する
     */
    public void setQrItemId(String qrItemId) {
        this.qrItemId = qrItemId;
    }

    /**
     * reqFlg のゲッターメソッドです。
     * 
     * @return the reqFlg
     */
    public String getReqFlg() {
        return reqFlg;
    }

    /**
     * reqFlg のセッターメソッドです。
     * 
     * @param reqFlg reqFlg に設定する
     */
    public void setReqFlg(String reqFlg) {
        this.reqFlg = reqFlg;
    }

    /**
     * attrTyp のゲッターメソッドです。
     * 
     * @return the attrTyp
     */
    public String getAttrTyp() {
        return attrTyp;
    }

    /**
     * attrTyp のセッターメソッドです。
     * 
     * @param attrTyp attrTyp に設定する
     */
    public void setAttrTyp(String attrTyp) {
        this.attrTyp = attrTyp;
    }

    /**
     * grpId のゲッターメソッドです。
     * 
     * @return the grpId
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * grpId のセッターメソッドです。
     * 
     * @param grpId grpId に設定する
     */
    public void setGrpId(String grpId) {
        this.grpId = grpId;
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

}
