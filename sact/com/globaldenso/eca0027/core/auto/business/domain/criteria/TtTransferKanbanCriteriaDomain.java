/*
 * PROJECT：eca0027
 * 
 * TtTransferKanban の検索条件Domainクラス
 * テーブル概要：Warehouse Transfer Detail KANBAN/倉庫移動明細かんばん情報  Table that holds the sign information associated with their warehouse move line and enable them to follow-up after/後の追跡が可能となるように倉庫移動明細に紐付くかんばん情報を保持するテーブル
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TtTransferKanban の検索条件Domainクラスです。<BR>
 * テーブル概要：Warehouse Transfer Detail KANBAN/倉庫移動明細かんばん情報  Table that holds the sign information associated with their warehouse move line and enable them to follow-up after/後の追跡が可能となるように倉庫移動明細に紐付くかんばん情報を保持するテーブル<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class TtTransferKanbanCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * TRANSFER REPORT NO/送荷書NO
     */
    private String trNo;

    /**
     * ITEM NO/品目番号
     */
    private String itemNo;

    /**
     * PACKAGE CODE/包装区分
     */
    private String pkgCd;

    /**
     * KANBAN SEQUENCE NO/かんばん連番
     */
    private BigDecimal kanbanSeqNo;

    /**
     * EXPORT INDUSTRIAL TYPE CODE/輸出側産業別コード
     */
    private String expIndusTypCd;

    /**
     * EXPORT KANBAN TYPE/輸出側かんばん種別
     */
    private String expKanbanTyp;

    /**
     * EXPORT REGULATE NO/輸出側整理NO
     */
    private BigDecimal expRegulateNo;

    /**
     * EXPORT CUSTOMER REGULATE NO/輸出側得意先整理NO
     */
    private String expCustomerRegulateNo;

    /**
     * QUANTITY/数量
     */
    private BigDecimal qty;

    /**
     * IMPORT INDUSTRIAL TYPE CODE/輸入側産業別コード
     */
    private String impIndusTypCd;

    /**
     * IMPORT KANBAN TYPE/輸入側かんばん種別
     */
    private String impKanbanTyp;

    /**
     * IMPORT REGULATE NO/輸入側整理NO
     */
    private BigDecimal impRegulateNo;

    /**
     * IMPORT CUSTOMER REGULATE NO/輸入側得意先整理NO
     */
    private String impCustomerRegulateNo;

    /**
     * UPDATE FUNCTION ID/更新機能ID
     */
    private String comUpdateFuncId;

    /**
     * UPDATE USER ID/更新者
     */
    private String comUpdateUserId;

    /**
     * UPDATE TIMESTAMP更新日時
     */
    private Timestamp comUpdateTimestamp;

    /**
     * CREATE FUNCTION ID/作成機能ID
     */
    private String comCreateFuncId;

    /**
     * CREATE USER ID/作成者
     */
    private String comCreateUserId;

    /**
     * CREATE TIMESTAMP/作成日時
     */
    private Timestamp comCreateTimestamp;

    /**
     * TRANSFER REPORT NO/送荷書NO（大なり）
     */
    private String trNoGreaterThan;

    /**
     * TRANSFER REPORT NO/送荷書NO（大なりイコール）
     */
    private String trNoGreaterThanEqual;

    /**
     * TRANSFER REPORT NO/送荷書NO（小なり）
     */
    private String trNoLessThan;

    /**
     * TRANSFER REPORT NO/送荷書NO（小なりイコール）
     */
    private String trNoLessThanEqual;

    /**
     * TRANSFER REPORT NO/送荷書NO（前方一致）
     */
    private String trNoLikeFront;

    /**
     * ITEM NO/品目番号（大なり）
     */
    private String itemNoGreaterThan;

    /**
     * ITEM NO/品目番号（大なりイコール）
     */
    private String itemNoGreaterThanEqual;

    /**
     * ITEM NO/品目番号（小なり）
     */
    private String itemNoLessThan;

    /**
     * ITEM NO/品目番号（小なりイコール）
     */
    private String itemNoLessThanEqual;

    /**
     * ITEM NO/品目番号（前方一致）
     */
    private String itemNoLikeFront;

    /**
     * PACKAGE CODE/包装区分（大なり）
     */
    private String pkgCdGreaterThan;

    /**
     * PACKAGE CODE/包装区分（大なりイコール）
     */
    private String pkgCdGreaterThanEqual;

    /**
     * PACKAGE CODE/包装区分（小なり）
     */
    private String pkgCdLessThan;

    /**
     * PACKAGE CODE/包装区分（小なりイコール）
     */
    private String pkgCdLessThanEqual;

    /**
     * PACKAGE CODE/包装区分（前方一致）
     */
    private String pkgCdLikeFront;

    /**
     * EXPORT INDUSTRIAL TYPE CODE/輸出側産業別コード（大なり）
     */
    private String expIndusTypCdGreaterThan;

    /**
     * EXPORT INDUSTRIAL TYPE CODE/輸出側産業別コード（大なりイコール）
     */
    private String expIndusTypCdGreaterThanEqual;

    /**
     * EXPORT INDUSTRIAL TYPE CODE/輸出側産業別コード（小なり）
     */
    private String expIndusTypCdLessThan;

    /**
     * EXPORT INDUSTRIAL TYPE CODE/輸出側産業別コード（小なりイコール）
     */
    private String expIndusTypCdLessThanEqual;

    /**
     * EXPORT INDUSTRIAL TYPE CODE/輸出側産業別コード（前方一致）
     */
    private String expIndusTypCdLikeFront;

    /**
     * EXPORT KANBAN TYPE/輸出側かんばん種別（大なり）
     */
    private String expKanbanTypGreaterThan;

    /**
     * EXPORT KANBAN TYPE/輸出側かんばん種別（大なりイコール）
     */
    private String expKanbanTypGreaterThanEqual;

    /**
     * EXPORT KANBAN TYPE/輸出側かんばん種別（小なり）
     */
    private String expKanbanTypLessThan;

    /**
     * EXPORT KANBAN TYPE/輸出側かんばん種別（小なりイコール）
     */
    private String expKanbanTypLessThanEqual;

    /**
     * EXPORT KANBAN TYPE/輸出側かんばん種別（前方一致）
     */
    private String expKanbanTypLikeFront;

    /**
     * EXPORT CUSTOMER REGULATE NO/輸出側得意先整理NO（大なり）
     */
    private String expCustomerRegulateNoGreaterThan;

    /**
     * EXPORT CUSTOMER REGULATE NO/輸出側得意先整理NO（大なりイコール）
     */
    private String expCustomerRegulateNoGreaterThanEqual;

    /**
     * EXPORT CUSTOMER REGULATE NO/輸出側得意先整理NO（小なり）
     */
    private String expCustomerRegulateNoLessThan;

    /**
     * EXPORT CUSTOMER REGULATE NO/輸出側得意先整理NO（小なりイコール）
     */
    private String expCustomerRegulateNoLessThanEqual;

    /**
     * EXPORT CUSTOMER REGULATE NO/輸出側得意先整理NO（前方一致）
     */
    private String expCustomerRegulateNoLikeFront;

    /**
     * IMPORT INDUSTRIAL TYPE CODE/輸入側産業別コード（大なり）
     */
    private String impIndusTypCdGreaterThan;

    /**
     * IMPORT INDUSTRIAL TYPE CODE/輸入側産業別コード（大なりイコール）
     */
    private String impIndusTypCdGreaterThanEqual;

    /**
     * IMPORT INDUSTRIAL TYPE CODE/輸入側産業別コード（小なり）
     */
    private String impIndusTypCdLessThan;

    /**
     * IMPORT INDUSTRIAL TYPE CODE/輸入側産業別コード（小なりイコール）
     */
    private String impIndusTypCdLessThanEqual;

    /**
     * IMPORT INDUSTRIAL TYPE CODE/輸入側産業別コード（前方一致）
     */
    private String impIndusTypCdLikeFront;

    /**
     * IMPORT KANBAN TYPE/輸入側かんばん種別（大なり）
     */
    private String impKanbanTypGreaterThan;

    /**
     * IMPORT KANBAN TYPE/輸入側かんばん種別（大なりイコール）
     */
    private String impKanbanTypGreaterThanEqual;

    /**
     * IMPORT KANBAN TYPE/輸入側かんばん種別（小なり）
     */
    private String impKanbanTypLessThan;

    /**
     * IMPORT KANBAN TYPE/輸入側かんばん種別（小なりイコール）
     */
    private String impKanbanTypLessThanEqual;

    /**
     * IMPORT KANBAN TYPE/輸入側かんばん種別（前方一致）
     */
    private String impKanbanTypLikeFront;

    /**
     * IMPORT CUSTOMER REGULATE NO/輸入側得意先整理NO（大なり）
     */
    private String impCustomerRegulateNoGreaterThan;

    /**
     * IMPORT CUSTOMER REGULATE NO/輸入側得意先整理NO（大なりイコール）
     */
    private String impCustomerRegulateNoGreaterThanEqual;

    /**
     * IMPORT CUSTOMER REGULATE NO/輸入側得意先整理NO（小なり）
     */
    private String impCustomerRegulateNoLessThan;

    /**
     * IMPORT CUSTOMER REGULATE NO/輸入側得意先整理NO（小なりイコール）
     */
    private String impCustomerRegulateNoLessThanEqual;

    /**
     * IMPORT CUSTOMER REGULATE NO/輸入側得意先整理NO（前方一致）
     */
    private String impCustomerRegulateNoLikeFront;

    /**
     * UPDATE FUNCTION ID/更新機能ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * UPDATE FUNCTION ID/更新機能ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * UPDATE FUNCTION ID/更新機能ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * UPDATE FUNCTION ID/更新機能ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * UPDATE FUNCTION ID/更新機能ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * UPDATE USER ID/更新者（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * UPDATE USER ID/更新者（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * UPDATE USER ID/更新者（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * UPDATE USER ID/更新者（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * UPDATE USER ID/更新者（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * CREATE FUNCTION ID/作成機能ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * CREATE FUNCTION ID/作成機能ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * CREATE FUNCTION ID/作成機能ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * CREATE FUNCTION ID/作成機能ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * CREATE FUNCTION ID/作成機能ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * CREATE USER ID/作成者（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * CREATE USER ID/作成者（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * CREATE USER ID/作成者（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * CREATE USER ID/作成者（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * CREATE USER ID/作成者（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public TtTransferKanbanCriteriaDomain() {
    }

    /**
     * trNo のゲッターメソッドです。
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * trNo のセッターメソッドです。
     * 
     * @param trNo trNo に設定する
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
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

    /**
     * trNoGreaterThan のゲッターメソッドです。
     * 
     * @return the trNoGreaterThan
     */
    public String getTrNoGreaterThan() {
        return trNoGreaterThan;
    }

    /**
     * trNoGreaterThan のセッターメソッドです。
     * 
     * @param trNoGreaterThan trNoGreaterThan に設定する
     */
    public void setTrNoGreaterThan(String trNoGreaterThan) {
        this.trNoGreaterThan = trNoGreaterThan;
    }

    /**
     * trNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trNoGreaterThanEqual
     */
    public String getTrNoGreaterThanEqual() {
        return trNoGreaterThanEqual;
    }

    /**
     * trNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param trNoGreaterThanEqual trNoGreaterThanEqual に設定する
     */
    public void setTrNoGreaterThanEqual(String trNoGreaterThanEqual) {
        this.trNoGreaterThanEqual = trNoGreaterThanEqual;
    }

    /**
     * trNoLessThan のゲッターメソッドです。
     * 
     * @return the trNoLessThan
     */
    public String getTrNoLessThan() {
        return trNoLessThan;
    }

    /**
     * trNoLessThan のセッターメソッドです。
     * 
     * @param trNoLessThan trNoLessThan に設定する
     */
    public void setTrNoLessThan(String trNoLessThan) {
        this.trNoLessThan = trNoLessThan;
    }

    /**
     * trNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the trNoLessThanEqual
     */
    public String getTrNoLessThanEqual() {
        return trNoLessThanEqual;
    }

    /**
     * trNoLessThanEqual のセッターメソッドです。
     * 
     * @param trNoLessThanEqual trNoLessThanEqual に設定する
     */
    public void setTrNoLessThanEqual(String trNoLessThanEqual) {
        this.trNoLessThanEqual = trNoLessThanEqual;
    }

    /**
     * trNoLikeFront のゲッターメソッドです。
     * 
     * @return the trNoLikeFront
     */
    public String getTrNoLikeFront() {
        return trNoLikeFront;
    }

    /**
     * trNoLikeFront のセッターメソッドです。
     * 
     * @param trNoLikeFront trNoLikeFront に設定する
     */
    public void setTrNoLikeFront(String trNoLikeFront) {
        this.trNoLikeFront = trNoLikeFront;
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
     * expIndusTypCdGreaterThan のゲッターメソッドです。
     * 
     * @return the expIndusTypCdGreaterThan
     */
    public String getExpIndusTypCdGreaterThan() {
        return expIndusTypCdGreaterThan;
    }

    /**
     * expIndusTypCdGreaterThan のセッターメソッドです。
     * 
     * @param expIndusTypCdGreaterThan expIndusTypCdGreaterThan に設定する
     */
    public void setExpIndusTypCdGreaterThan(String expIndusTypCdGreaterThan) {
        this.expIndusTypCdGreaterThan = expIndusTypCdGreaterThan;
    }

    /**
     * expIndusTypCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expIndusTypCdGreaterThanEqual
     */
    public String getExpIndusTypCdGreaterThanEqual() {
        return expIndusTypCdGreaterThanEqual;
    }

    /**
     * expIndusTypCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param expIndusTypCdGreaterThanEqual expIndusTypCdGreaterThanEqual に設定する
     */
    public void setExpIndusTypCdGreaterThanEqual(String expIndusTypCdGreaterThanEqual) {
        this.expIndusTypCdGreaterThanEqual = expIndusTypCdGreaterThanEqual;
    }

    /**
     * expIndusTypCdLessThan のゲッターメソッドです。
     * 
     * @return the expIndusTypCdLessThan
     */
    public String getExpIndusTypCdLessThan() {
        return expIndusTypCdLessThan;
    }

    /**
     * expIndusTypCdLessThan のセッターメソッドです。
     * 
     * @param expIndusTypCdLessThan expIndusTypCdLessThan に設定する
     */
    public void setExpIndusTypCdLessThan(String expIndusTypCdLessThan) {
        this.expIndusTypCdLessThan = expIndusTypCdLessThan;
    }

    /**
     * expIndusTypCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the expIndusTypCdLessThanEqual
     */
    public String getExpIndusTypCdLessThanEqual() {
        return expIndusTypCdLessThanEqual;
    }

    /**
     * expIndusTypCdLessThanEqual のセッターメソッドです。
     * 
     * @param expIndusTypCdLessThanEqual expIndusTypCdLessThanEqual に設定する
     */
    public void setExpIndusTypCdLessThanEqual(String expIndusTypCdLessThanEqual) {
        this.expIndusTypCdLessThanEqual = expIndusTypCdLessThanEqual;
    }

    /**
     * expIndusTypCdLikeFront のゲッターメソッドです。
     * 
     * @return the expIndusTypCdLikeFront
     */
    public String getExpIndusTypCdLikeFront() {
        return expIndusTypCdLikeFront;
    }

    /**
     * expIndusTypCdLikeFront のセッターメソッドです。
     * 
     * @param expIndusTypCdLikeFront expIndusTypCdLikeFront に設定する
     */
    public void setExpIndusTypCdLikeFront(String expIndusTypCdLikeFront) {
        this.expIndusTypCdLikeFront = expIndusTypCdLikeFront;
    }

    /**
     * expKanbanTypGreaterThan のゲッターメソッドです。
     * 
     * @return the expKanbanTypGreaterThan
     */
    public String getExpKanbanTypGreaterThan() {
        return expKanbanTypGreaterThan;
    }

    /**
     * expKanbanTypGreaterThan のセッターメソッドです。
     * 
     * @param expKanbanTypGreaterThan expKanbanTypGreaterThan に設定する
     */
    public void setExpKanbanTypGreaterThan(String expKanbanTypGreaterThan) {
        this.expKanbanTypGreaterThan = expKanbanTypGreaterThan;
    }

    /**
     * expKanbanTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expKanbanTypGreaterThanEqual
     */
    public String getExpKanbanTypGreaterThanEqual() {
        return expKanbanTypGreaterThanEqual;
    }

    /**
     * expKanbanTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param expKanbanTypGreaterThanEqual expKanbanTypGreaterThanEqual に設定する
     */
    public void setExpKanbanTypGreaterThanEqual(String expKanbanTypGreaterThanEqual) {
        this.expKanbanTypGreaterThanEqual = expKanbanTypGreaterThanEqual;
    }

    /**
     * expKanbanTypLessThan のゲッターメソッドです。
     * 
     * @return the expKanbanTypLessThan
     */
    public String getExpKanbanTypLessThan() {
        return expKanbanTypLessThan;
    }

    /**
     * expKanbanTypLessThan のセッターメソッドです。
     * 
     * @param expKanbanTypLessThan expKanbanTypLessThan に設定する
     */
    public void setExpKanbanTypLessThan(String expKanbanTypLessThan) {
        this.expKanbanTypLessThan = expKanbanTypLessThan;
    }

    /**
     * expKanbanTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the expKanbanTypLessThanEqual
     */
    public String getExpKanbanTypLessThanEqual() {
        return expKanbanTypLessThanEqual;
    }

    /**
     * expKanbanTypLessThanEqual のセッターメソッドです。
     * 
     * @param expKanbanTypLessThanEqual expKanbanTypLessThanEqual に設定する
     */
    public void setExpKanbanTypLessThanEqual(String expKanbanTypLessThanEqual) {
        this.expKanbanTypLessThanEqual = expKanbanTypLessThanEqual;
    }

    /**
     * expKanbanTypLikeFront のゲッターメソッドです。
     * 
     * @return the expKanbanTypLikeFront
     */
    public String getExpKanbanTypLikeFront() {
        return expKanbanTypLikeFront;
    }

    /**
     * expKanbanTypLikeFront のセッターメソッドです。
     * 
     * @param expKanbanTypLikeFront expKanbanTypLikeFront に設定する
     */
    public void setExpKanbanTypLikeFront(String expKanbanTypLikeFront) {
        this.expKanbanTypLikeFront = expKanbanTypLikeFront;
    }

    /**
     * expCustomerRegulateNoGreaterThan のゲッターメソッドです。
     * 
     * @return the expCustomerRegulateNoGreaterThan
     */
    public String getExpCustomerRegulateNoGreaterThan() {
        return expCustomerRegulateNoGreaterThan;
    }

    /**
     * expCustomerRegulateNoGreaterThan のセッターメソッドです。
     * 
     * @param expCustomerRegulateNoGreaterThan expCustomerRegulateNoGreaterThan に設定する
     */
    public void setExpCustomerRegulateNoGreaterThan(String expCustomerRegulateNoGreaterThan) {
        this.expCustomerRegulateNoGreaterThan = expCustomerRegulateNoGreaterThan;
    }

    /**
     * expCustomerRegulateNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expCustomerRegulateNoGreaterThanEqual
     */
    public String getExpCustomerRegulateNoGreaterThanEqual() {
        return expCustomerRegulateNoGreaterThanEqual;
    }

    /**
     * expCustomerRegulateNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param expCustomerRegulateNoGreaterThanEqual expCustomerRegulateNoGreaterThanEqual に設定する
     */
    public void setExpCustomerRegulateNoGreaterThanEqual(String expCustomerRegulateNoGreaterThanEqual) {
        this.expCustomerRegulateNoGreaterThanEqual = expCustomerRegulateNoGreaterThanEqual;
    }

    /**
     * expCustomerRegulateNoLessThan のゲッターメソッドです。
     * 
     * @return the expCustomerRegulateNoLessThan
     */
    public String getExpCustomerRegulateNoLessThan() {
        return expCustomerRegulateNoLessThan;
    }

    /**
     * expCustomerRegulateNoLessThan のセッターメソッドです。
     * 
     * @param expCustomerRegulateNoLessThan expCustomerRegulateNoLessThan に設定する
     */
    public void setExpCustomerRegulateNoLessThan(String expCustomerRegulateNoLessThan) {
        this.expCustomerRegulateNoLessThan = expCustomerRegulateNoLessThan;
    }

    /**
     * expCustomerRegulateNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the expCustomerRegulateNoLessThanEqual
     */
    public String getExpCustomerRegulateNoLessThanEqual() {
        return expCustomerRegulateNoLessThanEqual;
    }

    /**
     * expCustomerRegulateNoLessThanEqual のセッターメソッドです。
     * 
     * @param expCustomerRegulateNoLessThanEqual expCustomerRegulateNoLessThanEqual に設定する
     */
    public void setExpCustomerRegulateNoLessThanEqual(String expCustomerRegulateNoLessThanEqual) {
        this.expCustomerRegulateNoLessThanEqual = expCustomerRegulateNoLessThanEqual;
    }

    /**
     * expCustomerRegulateNoLikeFront のゲッターメソッドです。
     * 
     * @return the expCustomerRegulateNoLikeFront
     */
    public String getExpCustomerRegulateNoLikeFront() {
        return expCustomerRegulateNoLikeFront;
    }

    /**
     * expCustomerRegulateNoLikeFront のセッターメソッドです。
     * 
     * @param expCustomerRegulateNoLikeFront expCustomerRegulateNoLikeFront に設定する
     */
    public void setExpCustomerRegulateNoLikeFront(String expCustomerRegulateNoLikeFront) {
        this.expCustomerRegulateNoLikeFront = expCustomerRegulateNoLikeFront;
    }

    /**
     * impIndusTypCdGreaterThan のゲッターメソッドです。
     * 
     * @return the impIndusTypCdGreaterThan
     */
    public String getImpIndusTypCdGreaterThan() {
        return impIndusTypCdGreaterThan;
    }

    /**
     * impIndusTypCdGreaterThan のセッターメソッドです。
     * 
     * @param impIndusTypCdGreaterThan impIndusTypCdGreaterThan に設定する
     */
    public void setImpIndusTypCdGreaterThan(String impIndusTypCdGreaterThan) {
        this.impIndusTypCdGreaterThan = impIndusTypCdGreaterThan;
    }

    /**
     * impIndusTypCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the impIndusTypCdGreaterThanEqual
     */
    public String getImpIndusTypCdGreaterThanEqual() {
        return impIndusTypCdGreaterThanEqual;
    }

    /**
     * impIndusTypCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param impIndusTypCdGreaterThanEqual impIndusTypCdGreaterThanEqual に設定する
     */
    public void setImpIndusTypCdGreaterThanEqual(String impIndusTypCdGreaterThanEqual) {
        this.impIndusTypCdGreaterThanEqual = impIndusTypCdGreaterThanEqual;
    }

    /**
     * impIndusTypCdLessThan のゲッターメソッドです。
     * 
     * @return the impIndusTypCdLessThan
     */
    public String getImpIndusTypCdLessThan() {
        return impIndusTypCdLessThan;
    }

    /**
     * impIndusTypCdLessThan のセッターメソッドです。
     * 
     * @param impIndusTypCdLessThan impIndusTypCdLessThan に設定する
     */
    public void setImpIndusTypCdLessThan(String impIndusTypCdLessThan) {
        this.impIndusTypCdLessThan = impIndusTypCdLessThan;
    }

    /**
     * impIndusTypCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the impIndusTypCdLessThanEqual
     */
    public String getImpIndusTypCdLessThanEqual() {
        return impIndusTypCdLessThanEqual;
    }

    /**
     * impIndusTypCdLessThanEqual のセッターメソッドです。
     * 
     * @param impIndusTypCdLessThanEqual impIndusTypCdLessThanEqual に設定する
     */
    public void setImpIndusTypCdLessThanEqual(String impIndusTypCdLessThanEqual) {
        this.impIndusTypCdLessThanEqual = impIndusTypCdLessThanEqual;
    }

    /**
     * impIndusTypCdLikeFront のゲッターメソッドです。
     * 
     * @return the impIndusTypCdLikeFront
     */
    public String getImpIndusTypCdLikeFront() {
        return impIndusTypCdLikeFront;
    }

    /**
     * impIndusTypCdLikeFront のセッターメソッドです。
     * 
     * @param impIndusTypCdLikeFront impIndusTypCdLikeFront に設定する
     */
    public void setImpIndusTypCdLikeFront(String impIndusTypCdLikeFront) {
        this.impIndusTypCdLikeFront = impIndusTypCdLikeFront;
    }

    /**
     * impKanbanTypGreaterThan のゲッターメソッドです。
     * 
     * @return the impKanbanTypGreaterThan
     */
    public String getImpKanbanTypGreaterThan() {
        return impKanbanTypGreaterThan;
    }

    /**
     * impKanbanTypGreaterThan のセッターメソッドです。
     * 
     * @param impKanbanTypGreaterThan impKanbanTypGreaterThan に設定する
     */
    public void setImpKanbanTypGreaterThan(String impKanbanTypGreaterThan) {
        this.impKanbanTypGreaterThan = impKanbanTypGreaterThan;
    }

    /**
     * impKanbanTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the impKanbanTypGreaterThanEqual
     */
    public String getImpKanbanTypGreaterThanEqual() {
        return impKanbanTypGreaterThanEqual;
    }

    /**
     * impKanbanTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param impKanbanTypGreaterThanEqual impKanbanTypGreaterThanEqual に設定する
     */
    public void setImpKanbanTypGreaterThanEqual(String impKanbanTypGreaterThanEqual) {
        this.impKanbanTypGreaterThanEqual = impKanbanTypGreaterThanEqual;
    }

    /**
     * impKanbanTypLessThan のゲッターメソッドです。
     * 
     * @return the impKanbanTypLessThan
     */
    public String getImpKanbanTypLessThan() {
        return impKanbanTypLessThan;
    }

    /**
     * impKanbanTypLessThan のセッターメソッドです。
     * 
     * @param impKanbanTypLessThan impKanbanTypLessThan に設定する
     */
    public void setImpKanbanTypLessThan(String impKanbanTypLessThan) {
        this.impKanbanTypLessThan = impKanbanTypLessThan;
    }

    /**
     * impKanbanTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the impKanbanTypLessThanEqual
     */
    public String getImpKanbanTypLessThanEqual() {
        return impKanbanTypLessThanEqual;
    }

    /**
     * impKanbanTypLessThanEqual のセッターメソッドです。
     * 
     * @param impKanbanTypLessThanEqual impKanbanTypLessThanEqual に設定する
     */
    public void setImpKanbanTypLessThanEqual(String impKanbanTypLessThanEqual) {
        this.impKanbanTypLessThanEqual = impKanbanTypLessThanEqual;
    }

    /**
     * impKanbanTypLikeFront のゲッターメソッドです。
     * 
     * @return the impKanbanTypLikeFront
     */
    public String getImpKanbanTypLikeFront() {
        return impKanbanTypLikeFront;
    }

    /**
     * impKanbanTypLikeFront のセッターメソッドです。
     * 
     * @param impKanbanTypLikeFront impKanbanTypLikeFront に設定する
     */
    public void setImpKanbanTypLikeFront(String impKanbanTypLikeFront) {
        this.impKanbanTypLikeFront = impKanbanTypLikeFront;
    }

    /**
     * impCustomerRegulateNoGreaterThan のゲッターメソッドです。
     * 
     * @return the impCustomerRegulateNoGreaterThan
     */
    public String getImpCustomerRegulateNoGreaterThan() {
        return impCustomerRegulateNoGreaterThan;
    }

    /**
     * impCustomerRegulateNoGreaterThan のセッターメソッドです。
     * 
     * @param impCustomerRegulateNoGreaterThan impCustomerRegulateNoGreaterThan に設定する
     */
    public void setImpCustomerRegulateNoGreaterThan(String impCustomerRegulateNoGreaterThan) {
        this.impCustomerRegulateNoGreaterThan = impCustomerRegulateNoGreaterThan;
    }

    /**
     * impCustomerRegulateNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the impCustomerRegulateNoGreaterThanEqual
     */
    public String getImpCustomerRegulateNoGreaterThanEqual() {
        return impCustomerRegulateNoGreaterThanEqual;
    }

    /**
     * impCustomerRegulateNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param impCustomerRegulateNoGreaterThanEqual impCustomerRegulateNoGreaterThanEqual に設定する
     */
    public void setImpCustomerRegulateNoGreaterThanEqual(String impCustomerRegulateNoGreaterThanEqual) {
        this.impCustomerRegulateNoGreaterThanEqual = impCustomerRegulateNoGreaterThanEqual;
    }

    /**
     * impCustomerRegulateNoLessThan のゲッターメソッドです。
     * 
     * @return the impCustomerRegulateNoLessThan
     */
    public String getImpCustomerRegulateNoLessThan() {
        return impCustomerRegulateNoLessThan;
    }

    /**
     * impCustomerRegulateNoLessThan のセッターメソッドです。
     * 
     * @param impCustomerRegulateNoLessThan impCustomerRegulateNoLessThan に設定する
     */
    public void setImpCustomerRegulateNoLessThan(String impCustomerRegulateNoLessThan) {
        this.impCustomerRegulateNoLessThan = impCustomerRegulateNoLessThan;
    }

    /**
     * impCustomerRegulateNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the impCustomerRegulateNoLessThanEqual
     */
    public String getImpCustomerRegulateNoLessThanEqual() {
        return impCustomerRegulateNoLessThanEqual;
    }

    /**
     * impCustomerRegulateNoLessThanEqual のセッターメソッドです。
     * 
     * @param impCustomerRegulateNoLessThanEqual impCustomerRegulateNoLessThanEqual に設定する
     */
    public void setImpCustomerRegulateNoLessThanEqual(String impCustomerRegulateNoLessThanEqual) {
        this.impCustomerRegulateNoLessThanEqual = impCustomerRegulateNoLessThanEqual;
    }

    /**
     * impCustomerRegulateNoLikeFront のゲッターメソッドです。
     * 
     * @return the impCustomerRegulateNoLikeFront
     */
    public String getImpCustomerRegulateNoLikeFront() {
        return impCustomerRegulateNoLikeFront;
    }

    /**
     * impCustomerRegulateNoLikeFront のセッターメソッドです。
     * 
     * @param impCustomerRegulateNoLikeFront impCustomerRegulateNoLikeFront に設定する
     */
    public void setImpCustomerRegulateNoLikeFront(String impCustomerRegulateNoLikeFront) {
        this.impCustomerRegulateNoLikeFront = impCustomerRegulateNoLikeFront;
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

