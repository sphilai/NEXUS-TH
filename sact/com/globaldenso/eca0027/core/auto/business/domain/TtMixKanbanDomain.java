/*
 * PROJECT：eca0027
 * 
 * TtMixKanban のDomainクラス
 * テーブル概要：TT_MIX_KANBAN
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
 * TtMixKanban のDomainクラスです。<BR>
 * テーブル概要：TT_MIX_KANBAN<BR>
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
public class TtMixKanbanDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MIX_TAG_NO
     */
    private String mixTagNo;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * KANBAN_SEQ_NO
     */
    private BigDecimal kanbanSeqNo;

    /**
     * EXP_INDUS_TYP_CD
     */
    private String expIndusTypCd;

    /**
     * EXP_KANBAN_TYP
     */
    private String expKanbanTyp;

    /**
     * EXP_REGULATE_NO
     */
    private BigDecimal expRegulateNo;

    /**
     * EXP_CUSTOMER_REGULATE_NO
     */
    private String expCustomerRegulateNo;

    /**
     * QTY
     */
    private BigDecimal qty;

    /**
     * IMP_INDUS_TYP_CD
     */
    private String impIndusTypCd;

    /**
     * IMP_KANBAN_TYP
     */
    private String impKanbanTyp;

    /**
     * IMP_REGULATE_NO
     */
    private BigDecimal impRegulateNo;

    /**
     * IMP_CUSTOMER_REGULATE_NO
     */
    private String impCustomerRegulateNo;

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
     * デフォルトコンストラクタ。
     */
    public TtMixKanbanDomain() {
    }

    /**
     * mixTagNo のゲッターメソッドです。
     * 
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * mixTagNo のセッターメソッドです。
     * 
     * @param mixTagNo mixTagNo に設定する
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
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
     * kanbanSeqNo のゲッターメソッドです。
     * 
     * @return the kanbanSeqNo
     */
    public BigDecimal getKanbanSeqNo() {
        return kanbanSeqNo;
    }

    /**
     * kanbanSeqNo のセッターメソッドです。
     * 
     * @param kanbanSeqNo kanbanSeqNo に設定する
     */
    public void setKanbanSeqNo(BigDecimal kanbanSeqNo) {
        this.kanbanSeqNo = kanbanSeqNo;
    }

    /**
     * expIndusTypCd のゲッターメソッドです。
     * 
     * @return the expIndusTypCd
     */
    public String getExpIndusTypCd() {
        return expIndusTypCd;
    }

    /**
     * expIndusTypCd のセッターメソッドです。
     * 
     * @param expIndusTypCd expIndusTypCd に設定する
     */
    public void setExpIndusTypCd(String expIndusTypCd) {
        this.expIndusTypCd = expIndusTypCd;
    }

    /**
     * expKanbanTyp のゲッターメソッドです。
     * 
     * @return the expKanbanTyp
     */
    public String getExpKanbanTyp() {
        return expKanbanTyp;
    }

    /**
     * expKanbanTyp のセッターメソッドです。
     * 
     * @param expKanbanTyp expKanbanTyp に設定する
     */
    public void setExpKanbanTyp(String expKanbanTyp) {
        this.expKanbanTyp = expKanbanTyp;
    }

    /**
     * expRegulateNo のゲッターメソッドです。
     * 
     * @return the expRegulateNo
     */
    public BigDecimal getExpRegulateNo() {
        return expRegulateNo;
    }

    /**
     * expRegulateNo のセッターメソッドです。
     * 
     * @param expRegulateNo expRegulateNo に設定する
     */
    public void setExpRegulateNo(BigDecimal expRegulateNo) {
        this.expRegulateNo = expRegulateNo;
    }

    /**
     * expCustomerRegulateNo のゲッターメソッドです。
     * 
     * @return the expCustomerRegulateNo
     */
    public String getExpCustomerRegulateNo() {
        return expCustomerRegulateNo;
    }

    /**
     * expCustomerRegulateNo のセッターメソッドです。
     * 
     * @param expCustomerRegulateNo expCustomerRegulateNo に設定する
     */
    public void setExpCustomerRegulateNo(String expCustomerRegulateNo) {
        this.expCustomerRegulateNo = expCustomerRegulateNo;
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
     * impIndusTypCd のゲッターメソッドです。
     * 
     * @return the impIndusTypCd
     */
    public String getImpIndusTypCd() {
        return impIndusTypCd;
    }

    /**
     * impIndusTypCd のセッターメソッドです。
     * 
     * @param impIndusTypCd impIndusTypCd に設定する
     */
    public void setImpIndusTypCd(String impIndusTypCd) {
        this.impIndusTypCd = impIndusTypCd;
    }

    /**
     * impKanbanTyp のゲッターメソッドです。
     * 
     * @return the impKanbanTyp
     */
    public String getImpKanbanTyp() {
        return impKanbanTyp;
    }

    /**
     * impKanbanTyp のセッターメソッドです。
     * 
     * @param impKanbanTyp impKanbanTyp に設定する
     */
    public void setImpKanbanTyp(String impKanbanTyp) {
        this.impKanbanTyp = impKanbanTyp;
    }

    /**
     * impRegulateNo のゲッターメソッドです。
     * 
     * @return the impRegulateNo
     */
    public BigDecimal getImpRegulateNo() {
        return impRegulateNo;
    }

    /**
     * impRegulateNo のセッターメソッドです。
     * 
     * @param impRegulateNo impRegulateNo に設定する
     */
    public void setImpRegulateNo(BigDecimal impRegulateNo) {
        this.impRegulateNo = impRegulateNo;
    }

    /**
     * impCustomerRegulateNo のゲッターメソッドです。
     * 
     * @return the impCustomerRegulateNo
     */
    public String getImpCustomerRegulateNo() {
        return impCustomerRegulateNo;
    }

    /**
     * impCustomerRegulateNo のセッターメソッドです。
     * 
     * @param impCustomerRegulateNo impCustomerRegulateNo に設定する
     */
    public void setImpCustomerRegulateNo(String impCustomerRegulateNo) {
        this.impCustomerRegulateNo = impCustomerRegulateNo;
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

}
