/*
 * PROJECT：eca0027
 * 
 * TwShippingActInvoice の検索条件Domainクラス
 * テーブル概要：TW_SHIPPING_ACT_INVOICE
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
 * TwShippingActInvoice の検索条件Domainクラスです。<BR>
 * テーブル概要：TW_SHIPPING_ACT_INVOICE<BR>
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
public class TwShippingActInvoiceCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;

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
     * PKG_QTY
     */
    private BigDecimal pkgQty;

    /**
     * SHIPPING_ACT_STATUS
     */
    private String shippingActStatus;

    /**
     * ETD
     */
    private Date etd;

    /**
     * ETA
     */
    private Date eta;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * CARRIER_COMP_CD
     */
    private String carrierCompCd;

    /**
     * VESSEL
     */
    private String vessel;

    /**
     * DEL_FLG
     */
    private String delFlg;

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
     * DSC_ID（大なり）
     */
    private String dscIdGreaterThan;

    /**
     * DSC_ID（大なりイコール）
     */
    private String dscIdGreaterThanEqual;

    /**
     * DSC_ID（小なり）
     */
    private String dscIdLessThan;

    /**
     * DSC_ID（小なりイコール）
     */
    private String dscIdLessThanEqual;

    /**
     * DSC_ID（前方一致）
     */
    private String dscIdLikeFront;

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
     * SHIPPING_ACT_STATUS（大なり）
     */
    private String shippingActStatusGreaterThan;

    /**
     * SHIPPING_ACT_STATUS（大なりイコール）
     */
    private String shippingActStatusGreaterThanEqual;

    /**
     * SHIPPING_ACT_STATUS（小なり）
     */
    private String shippingActStatusLessThan;

    /**
     * SHIPPING_ACT_STATUS（小なりイコール）
     */
    private String shippingActStatusLessThanEqual;

    /**
     * SHIPPING_ACT_STATUS（前方一致）
     */
    private String shippingActStatusLikeFront;

    /**
     * ETD（大なりイコール）
     */
    private Date etdGreaterThanEqual;

    /**
     * ETD（小なりイコール）
     */
    private Date etdLessThanEqual;

    /**
     * ETA（大なりイコール）
     */
    private Date etaGreaterThanEqual;

    /**
     * ETA（小なりイコール）
     */
    private Date etaLessThanEqual;

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
     * CARRIER_COMP_CD（大なり）
     */
    private String carrierCompCdGreaterThan;

    /**
     * CARRIER_COMP_CD（大なりイコール）
     */
    private String carrierCompCdGreaterThanEqual;

    /**
     * CARRIER_COMP_CD（小なり）
     */
    private String carrierCompCdLessThan;

    /**
     * CARRIER_COMP_CD（小なりイコール）
     */
    private String carrierCompCdLessThanEqual;

    /**
     * CARRIER_COMP_CD（前方一致）
     */
    private String carrierCompCdLikeFront;

    /**
     * VESSEL（大なり）
     */
    private String vesselGreaterThan;

    /**
     * VESSEL（大なりイコール）
     */
    private String vesselGreaterThanEqual;

    /**
     * VESSEL（小なり）
     */
    private String vesselLessThan;

    /**
     * VESSEL（小なりイコール）
     */
    private String vesselLessThanEqual;

    /**
     * VESSEL（前方一致）
     */
    private String vesselLikeFront;

    /**
     * DEL_FLG（大なり）
     */
    private String delFlgGreaterThan;

    /**
     * DEL_FLG（大なりイコール）
     */
    private String delFlgGreaterThanEqual;

    /**
     * DEL_FLG（小なり）
     */
    private String delFlgLessThan;

    /**
     * DEL_FLG（小なりイコール）
     */
    private String delFlgLessThanEqual;

    /**
     * DEL_FLG（前方一致）
     */
    private String delFlgLikeFront;

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
    public TwShippingActInvoiceCriteriaDomain() {
    }

    /**
     * dscId のゲッターメソッドです。
     * 
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * dscId のセッターメソッドです。
     * 
     * @param dscId dscId に設定する
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
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
     * pkgQty のゲッターメソッドです。
     * 
     * @return the pkgQty
     */
    public BigDecimal getPkgQty() {
        return pkgQty;
    }

    /**
     * pkgQty のセッターメソッドです。
     * 
     * @param pkgQty pkgQty に設定する
     */
    public void setPkgQty(BigDecimal pkgQty) {
        this.pkgQty = pkgQty;
    }

    /**
     * shippingActStatus のゲッターメソッドです。
     * 
     * @return the shippingActStatus
     */
    public String getShippingActStatus() {
        return shippingActStatus;
    }

    /**
     * shippingActStatus のセッターメソッドです。
     * 
     * @param shippingActStatus shippingActStatus に設定する
     */
    public void setShippingActStatus(String shippingActStatus) {
        this.shippingActStatus = shippingActStatus;
    }

    /**
     * etd のゲッターメソッドです。
     * 
     * @return the etd
     */
    public Date getEtd() {
        return etd;
    }

    /**
     * etd のセッターメソッドです。
     * 
     * @param etd etd に設定する
     */
    public void setEtd(Date etd) {
        this.etd = etd;
    }

    /**
     * eta のゲッターメソッドです。
     * 
     * @return the eta
     */
    public Date getEta() {
        return eta;
    }

    /**
     * eta のセッターメソッドです。
     * 
     * @param eta eta に設定する
     */
    public void setEta(Date eta) {
        this.eta = eta;
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
     * carrierCompCd のゲッターメソッドです。
     * 
     * @return the carrierCompCd
     */
    public String getCarrierCompCd() {
        return carrierCompCd;
    }

    /**
     * carrierCompCd のセッターメソッドです。
     * 
     * @param carrierCompCd carrierCompCd に設定する
     */
    public void setCarrierCompCd(String carrierCompCd) {
        this.carrierCompCd = carrierCompCd;
    }

    /**
     * vessel のゲッターメソッドです。
     * 
     * @return the vessel
     */
    public String getVessel() {
        return vessel;
    }

    /**
     * vessel のセッターメソッドです。
     * 
     * @param vessel vessel に設定する
     */
    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    /**
     * delFlg のゲッターメソッドです。
     * 
     * @return the delFlg
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * delFlg のセッターメソッドです。
     * 
     * @param delFlg delFlg に設定する
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
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
     * dscIdGreaterThan のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThan
     */
    public String getDscIdGreaterThan() {
        return dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThan のセッターメソッドです。
     * 
     * @param dscIdGreaterThan dscIdGreaterThan に設定する
     */
    public void setDscIdGreaterThan(String dscIdGreaterThan) {
        this.dscIdGreaterThan = dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThanEqual
     */
    public String getDscIdGreaterThanEqual() {
        return dscIdGreaterThanEqual;
    }

    /**
     * dscIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param dscIdGreaterThanEqual dscIdGreaterThanEqual に設定する
     */
    public void setDscIdGreaterThanEqual(String dscIdGreaterThanEqual) {
        this.dscIdGreaterThanEqual = dscIdGreaterThanEqual;
    }

    /**
     * dscIdLessThan のゲッターメソッドです。
     * 
     * @return the dscIdLessThan
     */
    public String getDscIdLessThan() {
        return dscIdLessThan;
    }

    /**
     * dscIdLessThan のセッターメソッドです。
     * 
     * @param dscIdLessThan dscIdLessThan に設定する
     */
    public void setDscIdLessThan(String dscIdLessThan) {
        this.dscIdLessThan = dscIdLessThan;
    }

    /**
     * dscIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdLessThanEqual
     */
    public String getDscIdLessThanEqual() {
        return dscIdLessThanEqual;
    }

    /**
     * dscIdLessThanEqual のセッターメソッドです。
     * 
     * @param dscIdLessThanEqual dscIdLessThanEqual に設定する
     */
    public void setDscIdLessThanEqual(String dscIdLessThanEqual) {
        this.dscIdLessThanEqual = dscIdLessThanEqual;
    }

    /**
     * dscIdLikeFront のゲッターメソッドです。
     * 
     * @return the dscIdLikeFront
     */
    public String getDscIdLikeFront() {
        return dscIdLikeFront;
    }

    /**
     * dscIdLikeFront のセッターメソッドです。
     * 
     * @param dscIdLikeFront dscIdLikeFront に設定する
     */
    public void setDscIdLikeFront(String dscIdLikeFront) {
        this.dscIdLikeFront = dscIdLikeFront;
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
     * shippingActStatusGreaterThan のゲッターメソッドです。
     * 
     * @return the shippingActStatusGreaterThan
     */
    public String getShippingActStatusGreaterThan() {
        return shippingActStatusGreaterThan;
    }

    /**
     * shippingActStatusGreaterThan のセッターメソッドです。
     * 
     * @param shippingActStatusGreaterThan shippingActStatusGreaterThan に設定する
     */
    public void setShippingActStatusGreaterThan(String shippingActStatusGreaterThan) {
        this.shippingActStatusGreaterThan = shippingActStatusGreaterThan;
    }

    /**
     * shippingActStatusGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippingActStatusGreaterThanEqual
     */
    public String getShippingActStatusGreaterThanEqual() {
        return shippingActStatusGreaterThanEqual;
    }

    /**
     * shippingActStatusGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippingActStatusGreaterThanEqual shippingActStatusGreaterThanEqual に設定する
     */
    public void setShippingActStatusGreaterThanEqual(String shippingActStatusGreaterThanEqual) {
        this.shippingActStatusGreaterThanEqual = shippingActStatusGreaterThanEqual;
    }

    /**
     * shippingActStatusLessThan のゲッターメソッドです。
     * 
     * @return the shippingActStatusLessThan
     */
    public String getShippingActStatusLessThan() {
        return shippingActStatusLessThan;
    }

    /**
     * shippingActStatusLessThan のセッターメソッドです。
     * 
     * @param shippingActStatusLessThan shippingActStatusLessThan に設定する
     */
    public void setShippingActStatusLessThan(String shippingActStatusLessThan) {
        this.shippingActStatusLessThan = shippingActStatusLessThan;
    }

    /**
     * shippingActStatusLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippingActStatusLessThanEqual
     */
    public String getShippingActStatusLessThanEqual() {
        return shippingActStatusLessThanEqual;
    }

    /**
     * shippingActStatusLessThanEqual のセッターメソッドです。
     * 
     * @param shippingActStatusLessThanEqual shippingActStatusLessThanEqual に設定する
     */
    public void setShippingActStatusLessThanEqual(String shippingActStatusLessThanEqual) {
        this.shippingActStatusLessThanEqual = shippingActStatusLessThanEqual;
    }

    /**
     * shippingActStatusLikeFront のゲッターメソッドです。
     * 
     * @return the shippingActStatusLikeFront
     */
    public String getShippingActStatusLikeFront() {
        return shippingActStatusLikeFront;
    }

    /**
     * shippingActStatusLikeFront のセッターメソッドです。
     * 
     * @param shippingActStatusLikeFront shippingActStatusLikeFront に設定する
     */
    public void setShippingActStatusLikeFront(String shippingActStatusLikeFront) {
        this.shippingActStatusLikeFront = shippingActStatusLikeFront;
    }

    /**
     * etdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the etdGreaterThanEqual
     */
    public Date getEtdGreaterThanEqual() {
        return etdGreaterThanEqual;
    }

    /**
     * etdGreaterThanEqual のセッターメソッドです。
     * 
     * @param etdGreaterThanEqual etdGreaterThanEqual に設定する
     */
    public void setEtdGreaterThanEqual(Date etdGreaterThanEqual) {
        this.etdGreaterThanEqual = etdGreaterThanEqual;
    }

    /**
     * etdLessThanEqual のゲッターメソッドです。
     * 
     * @return the etdLessThanEqual
     */
    public Date getEtdLessThanEqual() {
        return etdLessThanEqual;
    }

    /**
     * etdLessThanEqual のセッターメソッドです。
     * 
     * @param etdLessThanEqual etdLessThanEqual に設定する
     */
    public void setEtdLessThanEqual(Date etdLessThanEqual) {
        this.etdLessThanEqual = etdLessThanEqual;
    }

    /**
     * etaGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the etaGreaterThanEqual
     */
    public Date getEtaGreaterThanEqual() {
        return etaGreaterThanEqual;
    }

    /**
     * etaGreaterThanEqual のセッターメソッドです。
     * 
     * @param etaGreaterThanEqual etaGreaterThanEqual に設定する
     */
    public void setEtaGreaterThanEqual(Date etaGreaterThanEqual) {
        this.etaGreaterThanEqual = etaGreaterThanEqual;
    }

    /**
     * etaLessThanEqual のゲッターメソッドです。
     * 
     * @return the etaLessThanEqual
     */
    public Date getEtaLessThanEqual() {
        return etaLessThanEqual;
    }

    /**
     * etaLessThanEqual のセッターメソッドです。
     * 
     * @param etaLessThanEqual etaLessThanEqual に設定する
     */
    public void setEtaLessThanEqual(Date etaLessThanEqual) {
        this.etaLessThanEqual = etaLessThanEqual;
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
     * carrierCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the carrierCompCdGreaterThan
     */
    public String getCarrierCompCdGreaterThan() {
        return carrierCompCdGreaterThan;
    }

    /**
     * carrierCompCdGreaterThan のセッターメソッドです。
     * 
     * @param carrierCompCdGreaterThan carrierCompCdGreaterThan に設定する
     */
    public void setCarrierCompCdGreaterThan(String carrierCompCdGreaterThan) {
        this.carrierCompCdGreaterThan = carrierCompCdGreaterThan;
    }

    /**
     * carrierCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompCdGreaterThanEqual
     */
    public String getCarrierCompCdGreaterThanEqual() {
        return carrierCompCdGreaterThanEqual;
    }

    /**
     * carrierCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param carrierCompCdGreaterThanEqual carrierCompCdGreaterThanEqual に設定する
     */
    public void setCarrierCompCdGreaterThanEqual(String carrierCompCdGreaterThanEqual) {
        this.carrierCompCdGreaterThanEqual = carrierCompCdGreaterThanEqual;
    }

    /**
     * carrierCompCdLessThan のゲッターメソッドです。
     * 
     * @return the carrierCompCdLessThan
     */
    public String getCarrierCompCdLessThan() {
        return carrierCompCdLessThan;
    }

    /**
     * carrierCompCdLessThan のセッターメソッドです。
     * 
     * @param carrierCompCdLessThan carrierCompCdLessThan に設定する
     */
    public void setCarrierCompCdLessThan(String carrierCompCdLessThan) {
        this.carrierCompCdLessThan = carrierCompCdLessThan;
    }

    /**
     * carrierCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompCdLessThanEqual
     */
    public String getCarrierCompCdLessThanEqual() {
        return carrierCompCdLessThanEqual;
    }

    /**
     * carrierCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param carrierCompCdLessThanEqual carrierCompCdLessThanEqual に設定する
     */
    public void setCarrierCompCdLessThanEqual(String carrierCompCdLessThanEqual) {
        this.carrierCompCdLessThanEqual = carrierCompCdLessThanEqual;
    }

    /**
     * carrierCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the carrierCompCdLikeFront
     */
    public String getCarrierCompCdLikeFront() {
        return carrierCompCdLikeFront;
    }

    /**
     * carrierCompCdLikeFront のセッターメソッドです。
     * 
     * @param carrierCompCdLikeFront carrierCompCdLikeFront に設定する
     */
    public void setCarrierCompCdLikeFront(String carrierCompCdLikeFront) {
        this.carrierCompCdLikeFront = carrierCompCdLikeFront;
    }

    /**
     * vesselGreaterThan のゲッターメソッドです。
     * 
     * @return the vesselGreaterThan
     */
    public String getVesselGreaterThan() {
        return vesselGreaterThan;
    }

    /**
     * vesselGreaterThan のセッターメソッドです。
     * 
     * @param vesselGreaterThan vesselGreaterThan に設定する
     */
    public void setVesselGreaterThan(String vesselGreaterThan) {
        this.vesselGreaterThan = vesselGreaterThan;
    }

    /**
     * vesselGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the vesselGreaterThanEqual
     */
    public String getVesselGreaterThanEqual() {
        return vesselGreaterThanEqual;
    }

    /**
     * vesselGreaterThanEqual のセッターメソッドです。
     * 
     * @param vesselGreaterThanEqual vesselGreaterThanEqual に設定する
     */
    public void setVesselGreaterThanEqual(String vesselGreaterThanEqual) {
        this.vesselGreaterThanEqual = vesselGreaterThanEqual;
    }

    /**
     * vesselLessThan のゲッターメソッドです。
     * 
     * @return the vesselLessThan
     */
    public String getVesselLessThan() {
        return vesselLessThan;
    }

    /**
     * vesselLessThan のセッターメソッドです。
     * 
     * @param vesselLessThan vesselLessThan に設定する
     */
    public void setVesselLessThan(String vesselLessThan) {
        this.vesselLessThan = vesselLessThan;
    }

    /**
     * vesselLessThanEqual のゲッターメソッドです。
     * 
     * @return the vesselLessThanEqual
     */
    public String getVesselLessThanEqual() {
        return vesselLessThanEqual;
    }

    /**
     * vesselLessThanEqual のセッターメソッドです。
     * 
     * @param vesselLessThanEqual vesselLessThanEqual に設定する
     */
    public void setVesselLessThanEqual(String vesselLessThanEqual) {
        this.vesselLessThanEqual = vesselLessThanEqual;
    }

    /**
     * vesselLikeFront のゲッターメソッドです。
     * 
     * @return the vesselLikeFront
     */
    public String getVesselLikeFront() {
        return vesselLikeFront;
    }

    /**
     * vesselLikeFront のセッターメソッドです。
     * 
     * @param vesselLikeFront vesselLikeFront に設定する
     */
    public void setVesselLikeFront(String vesselLikeFront) {
        this.vesselLikeFront = vesselLikeFront;
    }

    /**
     * delFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the delFlgGreaterThan
     */
    public String getDelFlgGreaterThan() {
        return delFlgGreaterThan;
    }

    /**
     * delFlgGreaterThan のセッターメソッドです。
     * 
     * @param delFlgGreaterThan delFlgGreaterThan に設定する
     */
    public void setDelFlgGreaterThan(String delFlgGreaterThan) {
        this.delFlgGreaterThan = delFlgGreaterThan;
    }

    /**
     * delFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the delFlgGreaterThanEqual
     */
    public String getDelFlgGreaterThanEqual() {
        return delFlgGreaterThanEqual;
    }

    /**
     * delFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param delFlgGreaterThanEqual delFlgGreaterThanEqual に設定する
     */
    public void setDelFlgGreaterThanEqual(String delFlgGreaterThanEqual) {
        this.delFlgGreaterThanEqual = delFlgGreaterThanEqual;
    }

    /**
     * delFlgLessThan のゲッターメソッドです。
     * 
     * @return the delFlgLessThan
     */
    public String getDelFlgLessThan() {
        return delFlgLessThan;
    }

    /**
     * delFlgLessThan のセッターメソッドです。
     * 
     * @param delFlgLessThan delFlgLessThan に設定する
     */
    public void setDelFlgLessThan(String delFlgLessThan) {
        this.delFlgLessThan = delFlgLessThan;
    }

    /**
     * delFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the delFlgLessThanEqual
     */
    public String getDelFlgLessThanEqual() {
        return delFlgLessThanEqual;
    }

    /**
     * delFlgLessThanEqual のセッターメソッドです。
     * 
     * @param delFlgLessThanEqual delFlgLessThanEqual に設定する
     */
    public void setDelFlgLessThanEqual(String delFlgLessThanEqual) {
        this.delFlgLessThanEqual = delFlgLessThanEqual;
    }

    /**
     * delFlgLikeFront のゲッターメソッドです。
     * 
     * @return the delFlgLikeFront
     */
    public String getDelFlgLikeFront() {
        return delFlgLikeFront;
    }

    /**
     * delFlgLikeFront のセッターメソッドです。
     * 
     * @param delFlgLikeFront delFlgLikeFront に設定する
     */
    public void setDelFlgLikeFront(String delFlgLikeFront) {
        this.delFlgLikeFront = delFlgLikeFront;
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

