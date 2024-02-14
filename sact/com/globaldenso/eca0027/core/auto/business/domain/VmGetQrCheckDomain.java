/*
 * PROJECT：eca0027
 * 
 * VmGetQrCheck のDomainクラス
 * テーブル概要：VM_GET_QR_CHECK
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;

/**
 * VmGetQrCheck のDomainクラスです。<BR>
 * テーブル概要：VM_GET_QR_CHECK<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/07 14:20:24<BR>
 * 
 * テーブル定義から2014/03/07に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmGetQrCheckDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * FUNC_ID
     */
    private String funcId;

    /**
     * QR_TYP_CD
     */
    private String qrTypCd;

    /**
     * QR_LENGTH
     */
    private BigDecimal qrLength;

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
     * デフォルトコンストラクタ。
     */
    public VmGetQrCheckDomain() {
    }

    /**
     * funcId のゲッターメソッドです。
     * 
     * @return the funcId
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * funcId のセッターメソッドです。
     * 
     * @param funcId funcId に設定する
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    /**
     * qrTypCd のゲッターメソッドです。
     * 
     * @return the qrTypCd
     */
    public String getQrTypCd() {
        return qrTypCd;
    }

    /**
     * qrTypCd のセッターメソッドです。
     * 
     * @param qrTypCd qrTypCd に設定する
     */
    public void setQrTypCd(String qrTypCd) {
        this.qrTypCd = qrTypCd;
    }

    /**
     * qrLength のゲッターメソッドです。
     * 
     * @return the qrLength
     */
    public BigDecimal getQrLength() {
        return qrLength;
    }

    /**
     * qrLength のセッターメソッドです。
     * 
     * @param qrLength qrLength に設定する
     */
    public void setQrLength(BigDecimal qrLength) {
        this.qrLength = qrLength;
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

}
