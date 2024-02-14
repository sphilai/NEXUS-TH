/*
 * PROJECT：eca0027
 * 
 * TtShippingDocument の検索条件Domainクラス
 * テーブル概要：TT_SHIPPING_DOCUMENT
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
 * TtShippingDocument の検索条件Domainクラスです。<BR>
 * テーブル概要：TT_SHIPPING_DOCUMENT<BR>
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
public class TtShippingDocumentCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * INVOICE_NO
     */
    private String invoiceNo;

    /**
     * INVOICE_ISSUE_DT
     */
    private Date invoiceIssueDt;

    /**
     * DOC_TYP
     */
    private String docTyp;

    /**
     * BRCH
     */
    private BigDecimal brch;

    /**
     * FILE_ID
     */
    private String fileId;

    /**
     * DELETE_FLG
     */
    private String deleteFlg;

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
     * INVOICE_NO（大なり）
     */
    private String invoiceNoGreaterThan;

    /**
     * INVOICE_NO（大なりイコール）
     */
    private String invoiceNoGreaterThanEqual;

    /**
     * INVOICE_NO（小なり）
     */
    private String invoiceNoLessThan;

    /**
     * INVOICE_NO（小なりイコール）
     */
    private String invoiceNoLessThanEqual;

    /**
     * INVOICE_NO（前方一致）
     */
    private String invoiceNoLikeFront;

    /**
     * INVOICE_ISSUE_DT（大なりイコール）
     */
    private Date invoiceIssueDtGreaterThanEqual;

    /**
     * INVOICE_ISSUE_DT（小なりイコール）
     */
    private Date invoiceIssueDtLessThanEqual;

    /**
     * DOC_TYP（大なり）
     */
    private String docTypGreaterThan;

    /**
     * DOC_TYP（大なりイコール）
     */
    private String docTypGreaterThanEqual;

    /**
     * DOC_TYP（小なり）
     */
    private String docTypLessThan;

    /**
     * DOC_TYP（小なりイコール）
     */
    private String docTypLessThanEqual;

    /**
     * DOC_TYP（前方一致）
     */
    private String docTypLikeFront;

    /**
     * FILE_ID（大なり）
     */
    private String fileIdGreaterThan;

    /**
     * FILE_ID（大なりイコール）
     */
    private String fileIdGreaterThanEqual;

    /**
     * FILE_ID（小なり）
     */
    private String fileIdLessThan;

    /**
     * FILE_ID（小なりイコール）
     */
    private String fileIdLessThanEqual;

    /**
     * FILE_ID（前方一致）
     */
    private String fileIdLikeFront;

    /**
     * DELETE_FLG（大なり）
     */
    private String deleteFlgGreaterThan;

    /**
     * DELETE_FLG（大なりイコール）
     */
    private String deleteFlgGreaterThanEqual;

    /**
     * DELETE_FLG（小なり）
     */
    private String deleteFlgLessThan;

    /**
     * DELETE_FLG（小なりイコール）
     */
    private String deleteFlgLessThanEqual;

    /**
     * DELETE_FLG（前方一致）
     */
    private String deleteFlgLikeFront;

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
    public TtShippingDocumentCriteriaDomain() {
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
     * invoiceNo のゲッターメソッドです。
     * 
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * invoiceNo のセッターメソッドです。
     * 
     * @param invoiceNo invoiceNo に設定する
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * invoiceIssueDt のゲッターメソッドです。
     * 
     * @return the invoiceIssueDt
     */
    public Date getInvoiceIssueDt() {
        return invoiceIssueDt;
    }

    /**
     * invoiceIssueDt のセッターメソッドです。
     * 
     * @param invoiceIssueDt invoiceIssueDt に設定する
     */
    public void setInvoiceIssueDt(Date invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
    }

    /**
     * docTyp のゲッターメソッドです。
     * 
     * @return the docTyp
     */
    public String getDocTyp() {
        return docTyp;
    }

    /**
     * docTyp のセッターメソッドです。
     * 
     * @param docTyp docTyp に設定する
     */
    public void setDocTyp(String docTyp) {
        this.docTyp = docTyp;
    }

    /**
     * brch のゲッターメソッドです。
     * 
     * @return the brch
     */
    public BigDecimal getBrch() {
        return brch;
    }

    /**
     * brch のセッターメソッドです。
     * 
     * @param brch brch に設定する
     */
    public void setBrch(BigDecimal brch) {
        this.brch = brch;
    }

    /**
     * fileId のゲッターメソッドです。
     * 
     * @return the fileId
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * fileId のセッターメソッドです。
     * 
     * @param fileId fileId に設定する
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * deleteFlg のゲッターメソッドです。
     * 
     * @return the deleteFlg
     */
    public String getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * deleteFlg のセッターメソッドです。
     * 
     * @param deleteFlg deleteFlg に設定する
     */
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
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
     * invoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceNoGreaterThan
     */
    public String getInvoiceNoGreaterThan() {
        return invoiceNoGreaterThan;
    }

    /**
     * invoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param invoiceNoGreaterThan invoiceNoGreaterThan に設定する
     */
    public void setInvoiceNoGreaterThan(String invoiceNoGreaterThan) {
        this.invoiceNoGreaterThan = invoiceNoGreaterThan;
    }

    /**
     * invoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceNoGreaterThanEqual
     */
    public String getInvoiceNoGreaterThanEqual() {
        return invoiceNoGreaterThanEqual;
    }

    /**
     * invoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceNoGreaterThanEqual invoiceNoGreaterThanEqual に設定する
     */
    public void setInvoiceNoGreaterThanEqual(String invoiceNoGreaterThanEqual) {
        this.invoiceNoGreaterThanEqual = invoiceNoGreaterThanEqual;
    }

    /**
     * invoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the invoiceNoLessThan
     */
    public String getInvoiceNoLessThan() {
        return invoiceNoLessThan;
    }

    /**
     * invoiceNoLessThan のセッターメソッドです。
     * 
     * @param invoiceNoLessThan invoiceNoLessThan に設定する
     */
    public void setInvoiceNoLessThan(String invoiceNoLessThan) {
        this.invoiceNoLessThan = invoiceNoLessThan;
    }

    /**
     * invoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceNoLessThanEqual
     */
    public String getInvoiceNoLessThanEqual() {
        return invoiceNoLessThanEqual;
    }

    /**
     * invoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceNoLessThanEqual invoiceNoLessThanEqual に設定する
     */
    public void setInvoiceNoLessThanEqual(String invoiceNoLessThanEqual) {
        this.invoiceNoLessThanEqual = invoiceNoLessThanEqual;
    }

    /**
     * invoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceNoLikeFront
     */
    public String getInvoiceNoLikeFront() {
        return invoiceNoLikeFront;
    }

    /**
     * invoiceNoLikeFront のセッターメソッドです。
     * 
     * @param invoiceNoLikeFront invoiceNoLikeFront に設定する
     */
    public void setInvoiceNoLikeFront(String invoiceNoLikeFront) {
        this.invoiceNoLikeFront = invoiceNoLikeFront;
    }

    /**
     * invoiceIssueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssueDtGreaterThanEqual
     */
    public Date getInvoiceIssueDtGreaterThanEqual() {
        return invoiceIssueDtGreaterThanEqual;
    }

    /**
     * invoiceIssueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssueDtGreaterThanEqual invoiceIssueDtGreaterThanEqual に設定する
     */
    public void setInvoiceIssueDtGreaterThanEqual(Date invoiceIssueDtGreaterThanEqual) {
        this.invoiceIssueDtGreaterThanEqual = invoiceIssueDtGreaterThanEqual;
    }

    /**
     * invoiceIssueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssueDtLessThanEqual
     */
    public Date getInvoiceIssueDtLessThanEqual() {
        return invoiceIssueDtLessThanEqual;
    }

    /**
     * invoiceIssueDtLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssueDtLessThanEqual invoiceIssueDtLessThanEqual に設定する
     */
    public void setInvoiceIssueDtLessThanEqual(Date invoiceIssueDtLessThanEqual) {
        this.invoiceIssueDtLessThanEqual = invoiceIssueDtLessThanEqual;
    }

    /**
     * docTypGreaterThan のゲッターメソッドです。
     * 
     * @return the docTypGreaterThan
     */
    public String getDocTypGreaterThan() {
        return docTypGreaterThan;
    }

    /**
     * docTypGreaterThan のセッターメソッドです。
     * 
     * @param docTypGreaterThan docTypGreaterThan に設定する
     */
    public void setDocTypGreaterThan(String docTypGreaterThan) {
        this.docTypGreaterThan = docTypGreaterThan;
    }

    /**
     * docTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the docTypGreaterThanEqual
     */
    public String getDocTypGreaterThanEqual() {
        return docTypGreaterThanEqual;
    }

    /**
     * docTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param docTypGreaterThanEqual docTypGreaterThanEqual に設定する
     */
    public void setDocTypGreaterThanEqual(String docTypGreaterThanEqual) {
        this.docTypGreaterThanEqual = docTypGreaterThanEqual;
    }

    /**
     * docTypLessThan のゲッターメソッドです。
     * 
     * @return the docTypLessThan
     */
    public String getDocTypLessThan() {
        return docTypLessThan;
    }

    /**
     * docTypLessThan のセッターメソッドです。
     * 
     * @param docTypLessThan docTypLessThan に設定する
     */
    public void setDocTypLessThan(String docTypLessThan) {
        this.docTypLessThan = docTypLessThan;
    }

    /**
     * docTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the docTypLessThanEqual
     */
    public String getDocTypLessThanEqual() {
        return docTypLessThanEqual;
    }

    /**
     * docTypLessThanEqual のセッターメソッドです。
     * 
     * @param docTypLessThanEqual docTypLessThanEqual に設定する
     */
    public void setDocTypLessThanEqual(String docTypLessThanEqual) {
        this.docTypLessThanEqual = docTypLessThanEqual;
    }

    /**
     * docTypLikeFront のゲッターメソッドです。
     * 
     * @return the docTypLikeFront
     */
    public String getDocTypLikeFront() {
        return docTypLikeFront;
    }

    /**
     * docTypLikeFront のセッターメソッドです。
     * 
     * @param docTypLikeFront docTypLikeFront に設定する
     */
    public void setDocTypLikeFront(String docTypLikeFront) {
        this.docTypLikeFront = docTypLikeFront;
    }

    /**
     * fileIdGreaterThan のゲッターメソッドです。
     * 
     * @return the fileIdGreaterThan
     */
    public String getFileIdGreaterThan() {
        return fileIdGreaterThan;
    }

    /**
     * fileIdGreaterThan のセッターメソッドです。
     * 
     * @param fileIdGreaterThan fileIdGreaterThan に設定する
     */
    public void setFileIdGreaterThan(String fileIdGreaterThan) {
        this.fileIdGreaterThan = fileIdGreaterThan;
    }

    /**
     * fileIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the fileIdGreaterThanEqual
     */
    public String getFileIdGreaterThanEqual() {
        return fileIdGreaterThanEqual;
    }

    /**
     * fileIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param fileIdGreaterThanEqual fileIdGreaterThanEqual に設定する
     */
    public void setFileIdGreaterThanEqual(String fileIdGreaterThanEqual) {
        this.fileIdGreaterThanEqual = fileIdGreaterThanEqual;
    }

    /**
     * fileIdLessThan のゲッターメソッドです。
     * 
     * @return the fileIdLessThan
     */
    public String getFileIdLessThan() {
        return fileIdLessThan;
    }

    /**
     * fileIdLessThan のセッターメソッドです。
     * 
     * @param fileIdLessThan fileIdLessThan に設定する
     */
    public void setFileIdLessThan(String fileIdLessThan) {
        this.fileIdLessThan = fileIdLessThan;
    }

    /**
     * fileIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the fileIdLessThanEqual
     */
    public String getFileIdLessThanEqual() {
        return fileIdLessThanEqual;
    }

    /**
     * fileIdLessThanEqual のセッターメソッドです。
     * 
     * @param fileIdLessThanEqual fileIdLessThanEqual に設定する
     */
    public void setFileIdLessThanEqual(String fileIdLessThanEqual) {
        this.fileIdLessThanEqual = fileIdLessThanEqual;
    }

    /**
     * fileIdLikeFront のゲッターメソッドです。
     * 
     * @return the fileIdLikeFront
     */
    public String getFileIdLikeFront() {
        return fileIdLikeFront;
    }

    /**
     * fileIdLikeFront のセッターメソッドです。
     * 
     * @param fileIdLikeFront fileIdLikeFront に設定する
     */
    public void setFileIdLikeFront(String fileIdLikeFront) {
        this.fileIdLikeFront = fileIdLikeFront;
    }

    /**
     * deleteFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the deleteFlgGreaterThan
     */
    public String getDeleteFlgGreaterThan() {
        return deleteFlgGreaterThan;
    }

    /**
     * deleteFlgGreaterThan のセッターメソッドです。
     * 
     * @param deleteFlgGreaterThan deleteFlgGreaterThan に設定する
     */
    public void setDeleteFlgGreaterThan(String deleteFlgGreaterThan) {
        this.deleteFlgGreaterThan = deleteFlgGreaterThan;
    }

    /**
     * deleteFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the deleteFlgGreaterThanEqual
     */
    public String getDeleteFlgGreaterThanEqual() {
        return deleteFlgGreaterThanEqual;
    }

    /**
     * deleteFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param deleteFlgGreaterThanEqual deleteFlgGreaterThanEqual に設定する
     */
    public void setDeleteFlgGreaterThanEqual(String deleteFlgGreaterThanEqual) {
        this.deleteFlgGreaterThanEqual = deleteFlgGreaterThanEqual;
    }

    /**
     * deleteFlgLessThan のゲッターメソッドです。
     * 
     * @return the deleteFlgLessThan
     */
    public String getDeleteFlgLessThan() {
        return deleteFlgLessThan;
    }

    /**
     * deleteFlgLessThan のセッターメソッドです。
     * 
     * @param deleteFlgLessThan deleteFlgLessThan に設定する
     */
    public void setDeleteFlgLessThan(String deleteFlgLessThan) {
        this.deleteFlgLessThan = deleteFlgLessThan;
    }

    /**
     * deleteFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the deleteFlgLessThanEqual
     */
    public String getDeleteFlgLessThanEqual() {
        return deleteFlgLessThanEqual;
    }

    /**
     * deleteFlgLessThanEqual のセッターメソッドです。
     * 
     * @param deleteFlgLessThanEqual deleteFlgLessThanEqual に設定する
     */
    public void setDeleteFlgLessThanEqual(String deleteFlgLessThanEqual) {
        this.deleteFlgLessThanEqual = deleteFlgLessThanEqual;
    }

    /**
     * deleteFlgLikeFront のゲッターメソッドです。
     * 
     * @return the deleteFlgLikeFront
     */
    public String getDeleteFlgLikeFront() {
        return deleteFlgLikeFront;
    }

    /**
     * deleteFlgLikeFront のセッターメソッドです。
     * 
     * @param deleteFlgLikeFront deleteFlgLikeFront に設定する
     */
    public void setDeleteFlgLikeFront(String deleteFlgLikeFront) {
        this.deleteFlgLikeFront = deleteFlgLikeFront;
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

