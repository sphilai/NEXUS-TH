/*
 * PROJECT：eca0027
 * 
 * TtShippingAct の検索条件Domainクラス
 * テーブル概要：TT_SHIPPING_ACT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/07/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

/**
 * TtShippingAct の検索条件Domainクラスです。<BR>
 * テーブル概要：TT_SHIPPING_ACT<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/07/11 19:07:48<BR>
 * 
 * テーブル定義から2016/07/11に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class TtShippingActCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPING_ACT_NO
     */
    private String shippingActNo;

    /**
     * BILLD_NO
     */
    private String billdNo;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * CONSIGNEE_CD
     */
    private String consigneeCd;

    /**
     * SHIP_TO_COMP_CD
     */
    private String shipToCompCd;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * NO_OF_INVOICE
     */
    private BigDecimal noOfInvoice;

    /**
     * NO_OF_CONTAINER
     */
    private BigDecimal noOfContainer;

    /**
     * PKG_QTY
     */
    private BigDecimal pkgQty;

    /**
     * SHIPPING_ACT_STATUS
     */
    private String shippingActStatus;

    /**
     * FREIGHT_RESPONSIBLE_CD
     */
    private String freightResponsibleCd;

    /**
     * AUTO_INVOICE_REGISTER_FLG
     */
    private String autoInvoiceRegisterFlg;

    /**
     * REGISTER_DT
     */
    private Date registerDt;

    /**
     * ATD
     */
    private Date atd;

    /**
     * ETA
     */
    private Date eta;

    /**
     * CARRIER_COMP_CD
     */
    private String carrierCompCd;

    /**
     * VESSEL
     */
    private String vessel;

    /**
     * CLP_GROUP
     */
    private String clpGroup;

    /**
     * NEED_OTHER_DOC_FLG
     */
    private String needOtherDocFlg;

    /**
     * BILLD_FILE_ID
     */
    private String billdFileId;

    /**
     * CLP_FILE_ID
     */
    private String clpFileId;

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
     * SHIPPING_ACT_NO（大なり）
     */
    private String shippingActNoGreaterThan;

    /**
     * SHIPPING_ACT_NO（大なりイコール）
     */
    private String shippingActNoGreaterThanEqual;

    /**
     * SHIPPING_ACT_NO（小なり）
     */
    private String shippingActNoLessThan;

    /**
     * SHIPPING_ACT_NO（小なりイコール）
     */
    private String shippingActNoLessThanEqual;

    /**
     * SHIPPING_ACT_NO（前方一致）
     */
    private String shippingActNoLikeFront;

    /**
     * BILLD_NO（大なり）
     */
    private String billdNoGreaterThan;

    /**
     * BILLD_NO（大なりイコール）
     */
    private String billdNoGreaterThanEqual;

    /**
     * BILLD_NO（小なり）
     */
    private String billdNoLessThan;

    /**
     * BILLD_NO（小なりイコール）
     */
    private String billdNoLessThanEqual;

    /**
     * BILLD_NO（前方一致）
     */
    private String billdNoLikeFront;

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
     * CONSIGNEE_CD（大なり）
     */
    private String consigneeCdGreaterThan;

    /**
     * CONSIGNEE_CD（大なりイコール）
     */
    private String consigneeCdGreaterThanEqual;

    /**
     * CONSIGNEE_CD（小なり）
     */
    private String consigneeCdLessThan;

    /**
     * CONSIGNEE_CD（小なりイコール）
     */
    private String consigneeCdLessThanEqual;

    /**
     * CONSIGNEE_CD（前方一致）
     */
    private String consigneeCdLikeFront;

    /**
     * SHIP_TO_COMP_CD（大なり）
     */
    private String shipToCompCdGreaterThan;

    /**
     * SHIP_TO_COMP_CD（大なりイコール）
     */
    private String shipToCompCdGreaterThanEqual;

    /**
     * SHIP_TO_COMP_CD（小なり）
     */
    private String shipToCompCdLessThan;

    /**
     * SHIP_TO_COMP_CD（小なりイコール）
     */
    private String shipToCompCdLessThanEqual;

    /**
     * SHIP_TO_COMP_CD（前方一致）
     */
    private String shipToCompCdLikeFront;

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
     * FREIGHT_RESPONSIBLE_CD（大なり）
     */
    private String freightResponsibleCdGreaterThan;

    /**
     * FREIGHT_RESPONSIBLE_CD（大なりイコール）
     */
    private String freightResponsibleCdGreaterThanEqual;

    /**
     * FREIGHT_RESPONSIBLE_CD（小なり）
     */
    private String freightResponsibleCdLessThan;

    /**
     * FREIGHT_RESPONSIBLE_CD（小なりイコール）
     */
    private String freightResponsibleCdLessThanEqual;

    /**
     * FREIGHT_RESPONSIBLE_CD（前方一致）
     */
    private String freightResponsibleCdLikeFront;

    /**
     * AUTO_INVOICE_REGISTER_FLG（大なり）
     */
    private String autoInvoiceRegisterFlgGreaterThan;

    /**
     * AUTO_INVOICE_REGISTER_FLG（大なりイコール）
     */
    private String autoInvoiceRegisterFlgGreaterThanEqual;

    /**
     * AUTO_INVOICE_REGISTER_FLG（小なり）
     */
    private String autoInvoiceRegisterFlgLessThan;

    /**
     * AUTO_INVOICE_REGISTER_FLG（小なりイコール）
     */
    private String autoInvoiceRegisterFlgLessThanEqual;

    /**
     * AUTO_INVOICE_REGISTER_FLG（前方一致）
     */
    private String autoInvoiceRegisterFlgLikeFront;

    /**
     * REGISTER_DT（大なりイコール）
     */
    private Date registerDtGreaterThanEqual;

    /**
     * REGISTER_DT（小なりイコール）
     */
    private Date registerDtLessThanEqual;

    /**
     * ATD（大なりイコール）
     */
    private Date atdGreaterThanEqual;

    /**
     * ATD（小なりイコール）
     */
    private Date atdLessThanEqual;

    /**
     * ETA（大なりイコール）
     */
    private Date etaGreaterThanEqual;

    /**
     * ETA（小なりイコール）
     */
    private Date etaLessThanEqual;

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
     * CLP_GROUP（大なり）
     */
    private String clpGroupGreaterThan;

    /**
     * CLP_GROUP（大なりイコール）
     */
    private String clpGroupGreaterThanEqual;

    /**
     * CLP_GROUP（小なり）
     */
    private String clpGroupLessThan;

    /**
     * CLP_GROUP（小なりイコール）
     */
    private String clpGroupLessThanEqual;

    /**
     * CLP_GROUP（前方一致）
     */
    private String clpGroupLikeFront;

    /**
     * NEED_OTHER_DOC_FLG（大なり）
     */
    private String needOtherDocFlgGreaterThan;

    /**
     * NEED_OTHER_DOC_FLG（大なりイコール）
     */
    private String needOtherDocFlgGreaterThanEqual;

    /**
     * NEED_OTHER_DOC_FLG（小なり）
     */
    private String needOtherDocFlgLessThan;

    /**
     * NEED_OTHER_DOC_FLG（小なりイコール）
     */
    private String needOtherDocFlgLessThanEqual;

    /**
     * NEED_OTHER_DOC_FLG（前方一致）
     */
    private String needOtherDocFlgLikeFront;

    /**
     * BILLD_FILE_ID（大なり）
     */
    private String billdFileIdGreaterThan;

    /**
     * BILLD_FILE_ID（大なりイコール）
     */
    private String billdFileIdGreaterThanEqual;

    /**
     * BILLD_FILE_ID（小なり）
     */
    private String billdFileIdLessThan;

    /**
     * BILLD_FILE_ID（小なりイコール）
     */
    private String billdFileIdLessThanEqual;

    /**
     * BILLD_FILE_ID（前方一致）
     */
    private String billdFileIdLikeFront;

    /**
     * CLP_FILE_ID（大なり）
     */
    private String clpFileIdGreaterThan;

    /**
     * CLP_FILE_ID（大なりイコール）
     */
    private String clpFileIdGreaterThanEqual;

    /**
     * CLP_FILE_ID（小なり）
     */
    private String clpFileIdLessThan;

    /**
     * CLP_FILE_ID（小なりイコール）
     */
    private String clpFileIdLessThanEqual;

    /**
     * CLP_FILE_ID（前方一致）
     */
    private String clpFileIdLikeFront;

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
    public TtShippingActCriteriaDomain() {
    }

    /**
     * shippingActNo のゲッターメソッドです。
     * 
     * @return the shippingActNo
     */
    public String getShippingActNo() {
        return shippingActNo;
    }

    /**
     * shippingActNo のセッターメソッドです。
     * 
     * @param shippingActNo shippingActNo に設定する
     */
    public void setShippingActNo(String shippingActNo) {
        this.shippingActNo = shippingActNo;
    }

    /**
     * billdNo のゲッターメソッドです。
     * 
     * @return the billdNo
     */
    public String getBilldNo() {
        return billdNo;
    }

    /**
     * billdNo のセッターメソッドです。
     * 
     * @param billdNo billdNo に設定する
     */
    public void setBilldNo(String billdNo) {
        this.billdNo = billdNo;
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
     * consigneeCd のゲッターメソッドです。
     * 
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * consigneeCd のセッターメソッドです。
     * 
     * @param consigneeCd consigneeCd に設定する
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
    }

    /**
     * shipToCompCd のゲッターメソッドです。
     * 
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * shipToCompCd のセッターメソッドです。
     * 
     * @param shipToCompCd shipToCompCd に設定する
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
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
     * noOfInvoice のゲッターメソッドです。
     * 
     * @return the noOfInvoice
     */
    public BigDecimal getNoOfInvoice() {
        return noOfInvoice;
    }

    /**
     * noOfInvoice のセッターメソッドです。
     * 
     * @param noOfInvoice noOfInvoice に設定する
     */
    public void setNoOfInvoice(BigDecimal noOfInvoice) {
        this.noOfInvoice = noOfInvoice;
    }

    /**
     * noOfContainer のゲッターメソッドです。
     * 
     * @return the noOfContainer
     */
    public BigDecimal getNoOfContainer() {
        return noOfContainer;
    }

    /**
     * noOfContainer のセッターメソッドです。
     * 
     * @param noOfContainer noOfContainer に設定する
     */
    public void setNoOfContainer(BigDecimal noOfContainer) {
        this.noOfContainer = noOfContainer;
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
     * freightResponsibleCd のゲッターメソッドです。
     * 
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * freightResponsibleCd のセッターメソッドです。
     * 
     * @param freightResponsibleCd freightResponsibleCd に設定する
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
    }

    /**
     * autoInvoiceRegisterFlg のゲッターメソッドです。
     * 
     * @return the autoInvoiceRegisterFlg
     */
    public String getAutoInvoiceRegisterFlg() {
        return autoInvoiceRegisterFlg;
    }

    /**
     * autoInvoiceRegisterFlg のセッターメソッドです。
     * 
     * @param autoInvoiceRegisterFlg autoInvoiceRegisterFlg に設定する
     */
    public void setAutoInvoiceRegisterFlg(String autoInvoiceRegisterFlg) {
        this.autoInvoiceRegisterFlg = autoInvoiceRegisterFlg;
    }

    /**
     * registerDt のゲッターメソッドです。
     * 
     * @return the registerDt
     */
    public Date getRegisterDt() {
        return registerDt;
    }

    /**
     * registerDt のセッターメソッドです。
     * 
     * @param registerDt registerDt に設定する
     */
    public void setRegisterDt(Date registerDt) {
        this.registerDt = registerDt;
    }

    /**
     * atd のゲッターメソッドです。
     * 
     * @return the atd
     */
    public Date getAtd() {
        return atd;
    }

    /**
     * atd のセッターメソッドです。
     * 
     * @param atd atd に設定する
     */
    public void setAtd(Date atd) {
        this.atd = atd;
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
     * clpGroup のゲッターメソッドです。
     * 
     * @return the clpGroup
     */
    public String getClpGroup() {
        return clpGroup;
    }

    /**
     * clpGroup のセッターメソッドです。
     * 
     * @param clpGroup clpGroup に設定する
     */
    public void setClpGroup(String clpGroup) {
        this.clpGroup = clpGroup;
    }

    /**
     * needOtherDocFlg のゲッターメソッドです。
     * 
     * @return the needOtherDocFlg
     */
    public String getNeedOtherDocFlg() {
        return needOtherDocFlg;
    }

    /**
     * needOtherDocFlg のセッターメソッドです。
     * 
     * @param needOtherDocFlg needOtherDocFlg に設定する
     */
    public void setNeedOtherDocFlg(String needOtherDocFlg) {
        this.needOtherDocFlg = needOtherDocFlg;
    }

    /**
     * billdFileId のゲッターメソッドです。
     * 
     * @return the billdFileId
     */
    public String getBilldFileId() {
        return billdFileId;
    }

    /**
     * billdFileId のセッターメソッドです。
     * 
     * @param billdFileId billdFileId に設定する
     */
    public void setBilldFileId(String billdFileId) {
        this.billdFileId = billdFileId;
    }

    /**
     * clpFileId のゲッターメソッドです。
     * 
     * @return the clpFileId
     */
    public String getClpFileId() {
        return clpFileId;
    }

    /**
     * clpFileId のセッターメソッドです。
     * 
     * @param clpFileId clpFileId に設定する
     */
    public void setClpFileId(String clpFileId) {
        this.clpFileId = clpFileId;
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
     * shippingActNoGreaterThan のゲッターメソッドです。
     * 
     * @return the shippingActNoGreaterThan
     */
    public String getShippingActNoGreaterThan() {
        return shippingActNoGreaterThan;
    }

    /**
     * shippingActNoGreaterThan のセッターメソッドです。
     * 
     * @param shippingActNoGreaterThan shippingActNoGreaterThan に設定する
     */
    public void setShippingActNoGreaterThan(String shippingActNoGreaterThan) {
        this.shippingActNoGreaterThan = shippingActNoGreaterThan;
    }

    /**
     * shippingActNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippingActNoGreaterThanEqual
     */
    public String getShippingActNoGreaterThanEqual() {
        return shippingActNoGreaterThanEqual;
    }

    /**
     * shippingActNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippingActNoGreaterThanEqual shippingActNoGreaterThanEqual に設定する
     */
    public void setShippingActNoGreaterThanEqual(String shippingActNoGreaterThanEqual) {
        this.shippingActNoGreaterThanEqual = shippingActNoGreaterThanEqual;
    }

    /**
     * shippingActNoLessThan のゲッターメソッドです。
     * 
     * @return the shippingActNoLessThan
     */
    public String getShippingActNoLessThan() {
        return shippingActNoLessThan;
    }

    /**
     * shippingActNoLessThan のセッターメソッドです。
     * 
     * @param shippingActNoLessThan shippingActNoLessThan に設定する
     */
    public void setShippingActNoLessThan(String shippingActNoLessThan) {
        this.shippingActNoLessThan = shippingActNoLessThan;
    }

    /**
     * shippingActNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippingActNoLessThanEqual
     */
    public String getShippingActNoLessThanEqual() {
        return shippingActNoLessThanEqual;
    }

    /**
     * shippingActNoLessThanEqual のセッターメソッドです。
     * 
     * @param shippingActNoLessThanEqual shippingActNoLessThanEqual に設定する
     */
    public void setShippingActNoLessThanEqual(String shippingActNoLessThanEqual) {
        this.shippingActNoLessThanEqual = shippingActNoLessThanEqual;
    }

    /**
     * shippingActNoLikeFront のゲッターメソッドです。
     * 
     * @return the shippingActNoLikeFront
     */
    public String getShippingActNoLikeFront() {
        return shippingActNoLikeFront;
    }

    /**
     * shippingActNoLikeFront のセッターメソッドです。
     * 
     * @param shippingActNoLikeFront shippingActNoLikeFront に設定する
     */
    public void setShippingActNoLikeFront(String shippingActNoLikeFront) {
        this.shippingActNoLikeFront = shippingActNoLikeFront;
    }

    /**
     * billdNoGreaterThan のゲッターメソッドです。
     * 
     * @return the billdNoGreaterThan
     */
    public String getBilldNoGreaterThan() {
        return billdNoGreaterThan;
    }

    /**
     * billdNoGreaterThan のセッターメソッドです。
     * 
     * @param billdNoGreaterThan billdNoGreaterThan に設定する
     */
    public void setBilldNoGreaterThan(String billdNoGreaterThan) {
        this.billdNoGreaterThan = billdNoGreaterThan;
    }

    /**
     * billdNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the billdNoGreaterThanEqual
     */
    public String getBilldNoGreaterThanEqual() {
        return billdNoGreaterThanEqual;
    }

    /**
     * billdNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param billdNoGreaterThanEqual billdNoGreaterThanEqual に設定する
     */
    public void setBilldNoGreaterThanEqual(String billdNoGreaterThanEqual) {
        this.billdNoGreaterThanEqual = billdNoGreaterThanEqual;
    }

    /**
     * billdNoLessThan のゲッターメソッドです。
     * 
     * @return the billdNoLessThan
     */
    public String getBilldNoLessThan() {
        return billdNoLessThan;
    }

    /**
     * billdNoLessThan のセッターメソッドです。
     * 
     * @param billdNoLessThan billdNoLessThan に設定する
     */
    public void setBilldNoLessThan(String billdNoLessThan) {
        this.billdNoLessThan = billdNoLessThan;
    }

    /**
     * billdNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the billdNoLessThanEqual
     */
    public String getBilldNoLessThanEqual() {
        return billdNoLessThanEqual;
    }

    /**
     * billdNoLessThanEqual のセッターメソッドです。
     * 
     * @param billdNoLessThanEqual billdNoLessThanEqual に設定する
     */
    public void setBilldNoLessThanEqual(String billdNoLessThanEqual) {
        this.billdNoLessThanEqual = billdNoLessThanEqual;
    }

    /**
     * billdNoLikeFront のゲッターメソッドです。
     * 
     * @return the billdNoLikeFront
     */
    public String getBilldNoLikeFront() {
        return billdNoLikeFront;
    }

    /**
     * billdNoLikeFront のセッターメソッドです。
     * 
     * @param billdNoLikeFront billdNoLikeFront に設定する
     */
    public void setBilldNoLikeFront(String billdNoLikeFront) {
        this.billdNoLikeFront = billdNoLikeFront;
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
     * consigneeCdGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCdGreaterThan
     */
    public String getConsigneeCdGreaterThan() {
        return consigneeCdGreaterThan;
    }

    /**
     * consigneeCdGreaterThan のセッターメソッドです。
     * 
     * @param consigneeCdGreaterThan consigneeCdGreaterThan に設定する
     */
    public void setConsigneeCdGreaterThan(String consigneeCdGreaterThan) {
        this.consigneeCdGreaterThan = consigneeCdGreaterThan;
    }

    /**
     * consigneeCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCdGreaterThanEqual
     */
    public String getConsigneeCdGreaterThanEqual() {
        return consigneeCdGreaterThanEqual;
    }

    /**
     * consigneeCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCdGreaterThanEqual consigneeCdGreaterThanEqual に設定する
     */
    public void setConsigneeCdGreaterThanEqual(String consigneeCdGreaterThanEqual) {
        this.consigneeCdGreaterThanEqual = consigneeCdGreaterThanEqual;
    }

    /**
     * consigneeCdLessThan のゲッターメソッドです。
     * 
     * @return the consigneeCdLessThan
     */
    public String getConsigneeCdLessThan() {
        return consigneeCdLessThan;
    }

    /**
     * consigneeCdLessThan のセッターメソッドです。
     * 
     * @param consigneeCdLessThan consigneeCdLessThan に設定する
     */
    public void setConsigneeCdLessThan(String consigneeCdLessThan) {
        this.consigneeCdLessThan = consigneeCdLessThan;
    }

    /**
     * consigneeCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCdLessThanEqual
     */
    public String getConsigneeCdLessThanEqual() {
        return consigneeCdLessThanEqual;
    }

    /**
     * consigneeCdLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCdLessThanEqual consigneeCdLessThanEqual に設定する
     */
    public void setConsigneeCdLessThanEqual(String consigneeCdLessThanEqual) {
        this.consigneeCdLessThanEqual = consigneeCdLessThanEqual;
    }

    /**
     * consigneeCdLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCdLikeFront
     */
    public String getConsigneeCdLikeFront() {
        return consigneeCdLikeFront;
    }

    /**
     * consigneeCdLikeFront のセッターメソッドです。
     * 
     * @param consigneeCdLikeFront consigneeCdLikeFront に設定する
     */
    public void setConsigneeCdLikeFront(String consigneeCdLikeFront) {
        this.consigneeCdLikeFront = consigneeCdLikeFront;
    }

    /**
     * shipToCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCompCdGreaterThan
     */
    public String getShipToCompCdGreaterThan() {
        return shipToCompCdGreaterThan;
    }

    /**
     * shipToCompCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCompCdGreaterThan shipToCompCdGreaterThan に設定する
     */
    public void setShipToCompCdGreaterThan(String shipToCompCdGreaterThan) {
        this.shipToCompCdGreaterThan = shipToCompCdGreaterThan;
    }

    /**
     * shipToCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompCdGreaterThanEqual
     */
    public String getShipToCompCdGreaterThanEqual() {
        return shipToCompCdGreaterThanEqual;
    }

    /**
     * shipToCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCompCdGreaterThanEqual shipToCompCdGreaterThanEqual に設定する
     */
    public void setShipToCompCdGreaterThanEqual(String shipToCompCdGreaterThanEqual) {
        this.shipToCompCdGreaterThanEqual = shipToCompCdGreaterThanEqual;
    }

    /**
     * shipToCompCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCompCdLessThan
     */
    public String getShipToCompCdLessThan() {
        return shipToCompCdLessThan;
    }

    /**
     * shipToCompCdLessThan のセッターメソッドです。
     * 
     * @param shipToCompCdLessThan shipToCompCdLessThan に設定する
     */
    public void setShipToCompCdLessThan(String shipToCompCdLessThan) {
        this.shipToCompCdLessThan = shipToCompCdLessThan;
    }

    /**
     * shipToCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompCdLessThanEqual
     */
    public String getShipToCompCdLessThanEqual() {
        return shipToCompCdLessThanEqual;
    }

    /**
     * shipToCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCompCdLessThanEqual shipToCompCdLessThanEqual に設定する
     */
    public void setShipToCompCdLessThanEqual(String shipToCompCdLessThanEqual) {
        this.shipToCompCdLessThanEqual = shipToCompCdLessThanEqual;
    }

    /**
     * shipToCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCompCdLikeFront
     */
    public String getShipToCompCdLikeFront() {
        return shipToCompCdLikeFront;
    }

    /**
     * shipToCompCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCompCdLikeFront shipToCompCdLikeFront に設定する
     */
    public void setShipToCompCdLikeFront(String shipToCompCdLikeFront) {
        this.shipToCompCdLikeFront = shipToCompCdLikeFront;
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
     * freightResponsibleCdGreaterThan のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdGreaterThan
     */
    public String getFreightResponsibleCdGreaterThan() {
        return freightResponsibleCdGreaterThan;
    }

    /**
     * freightResponsibleCdGreaterThan のセッターメソッドです。
     * 
     * @param freightResponsibleCdGreaterThan freightResponsibleCdGreaterThan に設定する
     */
    public void setFreightResponsibleCdGreaterThan(String freightResponsibleCdGreaterThan) {
        this.freightResponsibleCdGreaterThan = freightResponsibleCdGreaterThan;
    }

    /**
     * freightResponsibleCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdGreaterThanEqual
     */
    public String getFreightResponsibleCdGreaterThanEqual() {
        return freightResponsibleCdGreaterThanEqual;
    }

    /**
     * freightResponsibleCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param freightResponsibleCdGreaterThanEqual freightResponsibleCdGreaterThanEqual に設定する
     */
    public void setFreightResponsibleCdGreaterThanEqual(String freightResponsibleCdGreaterThanEqual) {
        this.freightResponsibleCdGreaterThanEqual = freightResponsibleCdGreaterThanEqual;
    }

    /**
     * freightResponsibleCdLessThan のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdLessThan
     */
    public String getFreightResponsibleCdLessThan() {
        return freightResponsibleCdLessThan;
    }

    /**
     * freightResponsibleCdLessThan のセッターメソッドです。
     * 
     * @param freightResponsibleCdLessThan freightResponsibleCdLessThan に設定する
     */
    public void setFreightResponsibleCdLessThan(String freightResponsibleCdLessThan) {
        this.freightResponsibleCdLessThan = freightResponsibleCdLessThan;
    }

    /**
     * freightResponsibleCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdLessThanEqual
     */
    public String getFreightResponsibleCdLessThanEqual() {
        return freightResponsibleCdLessThanEqual;
    }

    /**
     * freightResponsibleCdLessThanEqual のセッターメソッドです。
     * 
     * @param freightResponsibleCdLessThanEqual freightResponsibleCdLessThanEqual に設定する
     */
    public void setFreightResponsibleCdLessThanEqual(String freightResponsibleCdLessThanEqual) {
        this.freightResponsibleCdLessThanEqual = freightResponsibleCdLessThanEqual;
    }

    /**
     * freightResponsibleCdLikeFront のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdLikeFront
     */
    public String getFreightResponsibleCdLikeFront() {
        return freightResponsibleCdLikeFront;
    }

    /**
     * freightResponsibleCdLikeFront のセッターメソッドです。
     * 
     * @param freightResponsibleCdLikeFront freightResponsibleCdLikeFront に設定する
     */
    public void setFreightResponsibleCdLikeFront(String freightResponsibleCdLikeFront) {
        this.freightResponsibleCdLikeFront = freightResponsibleCdLikeFront;
    }

    /**
     * autoInvoiceRegisterFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the autoInvoiceRegisterFlgGreaterThan
     */
    public String getAutoInvoiceRegisterFlgGreaterThan() {
        return autoInvoiceRegisterFlgGreaterThan;
    }

    /**
     * autoInvoiceRegisterFlgGreaterThan のセッターメソッドです。
     * 
     * @param autoInvoiceRegisterFlgGreaterThan autoInvoiceRegisterFlgGreaterThan に設定する
     */
    public void setAutoInvoiceRegisterFlgGreaterThan(String autoInvoiceRegisterFlgGreaterThan) {
        this.autoInvoiceRegisterFlgGreaterThan = autoInvoiceRegisterFlgGreaterThan;
    }

    /**
     * autoInvoiceRegisterFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the autoInvoiceRegisterFlgGreaterThanEqual
     */
    public String getAutoInvoiceRegisterFlgGreaterThanEqual() {
        return autoInvoiceRegisterFlgGreaterThanEqual;
    }

    /**
     * autoInvoiceRegisterFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param autoInvoiceRegisterFlgGreaterThanEqual autoInvoiceRegisterFlgGreaterThanEqual に設定する
     */
    public void setAutoInvoiceRegisterFlgGreaterThanEqual(String autoInvoiceRegisterFlgGreaterThanEqual) {
        this.autoInvoiceRegisterFlgGreaterThanEqual = autoInvoiceRegisterFlgGreaterThanEqual;
    }

    /**
     * autoInvoiceRegisterFlgLessThan のゲッターメソッドです。
     * 
     * @return the autoInvoiceRegisterFlgLessThan
     */
    public String getAutoInvoiceRegisterFlgLessThan() {
        return autoInvoiceRegisterFlgLessThan;
    }

    /**
     * autoInvoiceRegisterFlgLessThan のセッターメソッドです。
     * 
     * @param autoInvoiceRegisterFlgLessThan autoInvoiceRegisterFlgLessThan に設定する
     */
    public void setAutoInvoiceRegisterFlgLessThan(String autoInvoiceRegisterFlgLessThan) {
        this.autoInvoiceRegisterFlgLessThan = autoInvoiceRegisterFlgLessThan;
    }

    /**
     * autoInvoiceRegisterFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the autoInvoiceRegisterFlgLessThanEqual
     */
    public String getAutoInvoiceRegisterFlgLessThanEqual() {
        return autoInvoiceRegisterFlgLessThanEqual;
    }

    /**
     * autoInvoiceRegisterFlgLessThanEqual のセッターメソッドです。
     * 
     * @param autoInvoiceRegisterFlgLessThanEqual autoInvoiceRegisterFlgLessThanEqual に設定する
     */
    public void setAutoInvoiceRegisterFlgLessThanEqual(String autoInvoiceRegisterFlgLessThanEqual) {
        this.autoInvoiceRegisterFlgLessThanEqual = autoInvoiceRegisterFlgLessThanEqual;
    }

    /**
     * autoInvoiceRegisterFlgLikeFront のゲッターメソッドです。
     * 
     * @return the autoInvoiceRegisterFlgLikeFront
     */
    public String getAutoInvoiceRegisterFlgLikeFront() {
        return autoInvoiceRegisterFlgLikeFront;
    }

    /**
     * autoInvoiceRegisterFlgLikeFront のセッターメソッドです。
     * 
     * @param autoInvoiceRegisterFlgLikeFront autoInvoiceRegisterFlgLikeFront に設定する
     */
    public void setAutoInvoiceRegisterFlgLikeFront(String autoInvoiceRegisterFlgLikeFront) {
        this.autoInvoiceRegisterFlgLikeFront = autoInvoiceRegisterFlgLikeFront;
    }

    /**
     * registerDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the registerDtGreaterThanEqual
     */
    public Date getRegisterDtGreaterThanEqual() {
        return registerDtGreaterThanEqual;
    }

    /**
     * registerDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param registerDtGreaterThanEqual registerDtGreaterThanEqual に設定する
     */
    public void setRegisterDtGreaterThanEqual(Date registerDtGreaterThanEqual) {
        this.registerDtGreaterThanEqual = registerDtGreaterThanEqual;
    }

    /**
     * registerDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the registerDtLessThanEqual
     */
    public Date getRegisterDtLessThanEqual() {
        return registerDtLessThanEqual;
    }

    /**
     * registerDtLessThanEqual のセッターメソッドです。
     * 
     * @param registerDtLessThanEqual registerDtLessThanEqual に設定する
     */
    public void setRegisterDtLessThanEqual(Date registerDtLessThanEqual) {
        this.registerDtLessThanEqual = registerDtLessThanEqual;
    }

    /**
     * atdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the atdGreaterThanEqual
     */
    public Date getAtdGreaterThanEqual() {
        return atdGreaterThanEqual;
    }

    /**
     * atdGreaterThanEqual のセッターメソッドです。
     * 
     * @param atdGreaterThanEqual atdGreaterThanEqual に設定する
     */
    public void setAtdGreaterThanEqual(Date atdGreaterThanEqual) {
        this.atdGreaterThanEqual = atdGreaterThanEqual;
    }

    /**
     * atdLessThanEqual のゲッターメソッドです。
     * 
     * @return the atdLessThanEqual
     */
    public Date getAtdLessThanEqual() {
        return atdLessThanEqual;
    }

    /**
     * atdLessThanEqual のセッターメソッドです。
     * 
     * @param atdLessThanEqual atdLessThanEqual に設定する
     */
    public void setAtdLessThanEqual(Date atdLessThanEqual) {
        this.atdLessThanEqual = atdLessThanEqual;
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
     * clpGroupGreaterThan のゲッターメソッドです。
     * 
     * @return the clpGroupGreaterThan
     */
    public String getClpGroupGreaterThan() {
        return clpGroupGreaterThan;
    }

    /**
     * clpGroupGreaterThan のセッターメソッドです。
     * 
     * @param clpGroupGreaterThan clpGroupGreaterThan に設定する
     */
    public void setClpGroupGreaterThan(String clpGroupGreaterThan) {
        this.clpGroupGreaterThan = clpGroupGreaterThan;
    }

    /**
     * clpGroupGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the clpGroupGreaterThanEqual
     */
    public String getClpGroupGreaterThanEqual() {
        return clpGroupGreaterThanEqual;
    }

    /**
     * clpGroupGreaterThanEqual のセッターメソッドです。
     * 
     * @param clpGroupGreaterThanEqual clpGroupGreaterThanEqual に設定する
     */
    public void setClpGroupGreaterThanEqual(String clpGroupGreaterThanEqual) {
        this.clpGroupGreaterThanEqual = clpGroupGreaterThanEqual;
    }

    /**
     * clpGroupLessThan のゲッターメソッドです。
     * 
     * @return the clpGroupLessThan
     */
    public String getClpGroupLessThan() {
        return clpGroupLessThan;
    }

    /**
     * clpGroupLessThan のセッターメソッドです。
     * 
     * @param clpGroupLessThan clpGroupLessThan に設定する
     */
    public void setClpGroupLessThan(String clpGroupLessThan) {
        this.clpGroupLessThan = clpGroupLessThan;
    }

    /**
     * clpGroupLessThanEqual のゲッターメソッドです。
     * 
     * @return the clpGroupLessThanEqual
     */
    public String getClpGroupLessThanEqual() {
        return clpGroupLessThanEqual;
    }

    /**
     * clpGroupLessThanEqual のセッターメソッドです。
     * 
     * @param clpGroupLessThanEqual clpGroupLessThanEqual に設定する
     */
    public void setClpGroupLessThanEqual(String clpGroupLessThanEqual) {
        this.clpGroupLessThanEqual = clpGroupLessThanEqual;
    }

    /**
     * clpGroupLikeFront のゲッターメソッドです。
     * 
     * @return the clpGroupLikeFront
     */
    public String getClpGroupLikeFront() {
        return clpGroupLikeFront;
    }

    /**
     * clpGroupLikeFront のセッターメソッドです。
     * 
     * @param clpGroupLikeFront clpGroupLikeFront に設定する
     */
    public void setClpGroupLikeFront(String clpGroupLikeFront) {
        this.clpGroupLikeFront = clpGroupLikeFront;
    }

    /**
     * needOtherDocFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the needOtherDocFlgGreaterThan
     */
    public String getNeedOtherDocFlgGreaterThan() {
        return needOtherDocFlgGreaterThan;
    }

    /**
     * needOtherDocFlgGreaterThan のセッターメソッドです。
     * 
     * @param needOtherDocFlgGreaterThan needOtherDocFlgGreaterThan に設定する
     */
    public void setNeedOtherDocFlgGreaterThan(String needOtherDocFlgGreaterThan) {
        this.needOtherDocFlgGreaterThan = needOtherDocFlgGreaterThan;
    }

    /**
     * needOtherDocFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the needOtherDocFlgGreaterThanEqual
     */
    public String getNeedOtherDocFlgGreaterThanEqual() {
        return needOtherDocFlgGreaterThanEqual;
    }

    /**
     * needOtherDocFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param needOtherDocFlgGreaterThanEqual needOtherDocFlgGreaterThanEqual に設定する
     */
    public void setNeedOtherDocFlgGreaterThanEqual(String needOtherDocFlgGreaterThanEqual) {
        this.needOtherDocFlgGreaterThanEqual = needOtherDocFlgGreaterThanEqual;
    }

    /**
     * needOtherDocFlgLessThan のゲッターメソッドです。
     * 
     * @return the needOtherDocFlgLessThan
     */
    public String getNeedOtherDocFlgLessThan() {
        return needOtherDocFlgLessThan;
    }

    /**
     * needOtherDocFlgLessThan のセッターメソッドです。
     * 
     * @param needOtherDocFlgLessThan needOtherDocFlgLessThan に設定する
     */
    public void setNeedOtherDocFlgLessThan(String needOtherDocFlgLessThan) {
        this.needOtherDocFlgLessThan = needOtherDocFlgLessThan;
    }

    /**
     * needOtherDocFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the needOtherDocFlgLessThanEqual
     */
    public String getNeedOtherDocFlgLessThanEqual() {
        return needOtherDocFlgLessThanEqual;
    }

    /**
     * needOtherDocFlgLessThanEqual のセッターメソッドです。
     * 
     * @param needOtherDocFlgLessThanEqual needOtherDocFlgLessThanEqual に設定する
     */
    public void setNeedOtherDocFlgLessThanEqual(String needOtherDocFlgLessThanEqual) {
        this.needOtherDocFlgLessThanEqual = needOtherDocFlgLessThanEqual;
    }

    /**
     * needOtherDocFlgLikeFront のゲッターメソッドです。
     * 
     * @return the needOtherDocFlgLikeFront
     */
    public String getNeedOtherDocFlgLikeFront() {
        return needOtherDocFlgLikeFront;
    }

    /**
     * needOtherDocFlgLikeFront のセッターメソッドです。
     * 
     * @param needOtherDocFlgLikeFront needOtherDocFlgLikeFront に設定する
     */
    public void setNeedOtherDocFlgLikeFront(String needOtherDocFlgLikeFront) {
        this.needOtherDocFlgLikeFront = needOtherDocFlgLikeFront;
    }

    /**
     * billdFileIdGreaterThan のゲッターメソッドです。
     * 
     * @return the billdFileIdGreaterThan
     */
    public String getBilldFileIdGreaterThan() {
        return billdFileIdGreaterThan;
    }

    /**
     * billdFileIdGreaterThan のセッターメソッドです。
     * 
     * @param billdFileIdGreaterThan billdFileIdGreaterThan に設定する
     */
    public void setBilldFileIdGreaterThan(String billdFileIdGreaterThan) {
        this.billdFileIdGreaterThan = billdFileIdGreaterThan;
    }

    /**
     * billdFileIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the billdFileIdGreaterThanEqual
     */
    public String getBilldFileIdGreaterThanEqual() {
        return billdFileIdGreaterThanEqual;
    }

    /**
     * billdFileIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param billdFileIdGreaterThanEqual billdFileIdGreaterThanEqual に設定する
     */
    public void setBilldFileIdGreaterThanEqual(String billdFileIdGreaterThanEqual) {
        this.billdFileIdGreaterThanEqual = billdFileIdGreaterThanEqual;
    }

    /**
     * billdFileIdLessThan のゲッターメソッドです。
     * 
     * @return the billdFileIdLessThan
     */
    public String getBilldFileIdLessThan() {
        return billdFileIdLessThan;
    }

    /**
     * billdFileIdLessThan のセッターメソッドです。
     * 
     * @param billdFileIdLessThan billdFileIdLessThan に設定する
     */
    public void setBilldFileIdLessThan(String billdFileIdLessThan) {
        this.billdFileIdLessThan = billdFileIdLessThan;
    }

    /**
     * billdFileIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the billdFileIdLessThanEqual
     */
    public String getBilldFileIdLessThanEqual() {
        return billdFileIdLessThanEqual;
    }

    /**
     * billdFileIdLessThanEqual のセッターメソッドです。
     * 
     * @param billdFileIdLessThanEqual billdFileIdLessThanEqual に設定する
     */
    public void setBilldFileIdLessThanEqual(String billdFileIdLessThanEqual) {
        this.billdFileIdLessThanEqual = billdFileIdLessThanEqual;
    }

    /**
     * billdFileIdLikeFront のゲッターメソッドです。
     * 
     * @return the billdFileIdLikeFront
     */
    public String getBilldFileIdLikeFront() {
        return billdFileIdLikeFront;
    }

    /**
     * billdFileIdLikeFront のセッターメソッドです。
     * 
     * @param billdFileIdLikeFront billdFileIdLikeFront に設定する
     */
    public void setBilldFileIdLikeFront(String billdFileIdLikeFront) {
        this.billdFileIdLikeFront = billdFileIdLikeFront;
    }

    /**
     * clpFileIdGreaterThan のゲッターメソッドです。
     * 
     * @return the clpFileIdGreaterThan
     */
    public String getClpFileIdGreaterThan() {
        return clpFileIdGreaterThan;
    }

    /**
     * clpFileIdGreaterThan のセッターメソッドです。
     * 
     * @param clpFileIdGreaterThan clpFileIdGreaterThan に設定する
     */
    public void setClpFileIdGreaterThan(String clpFileIdGreaterThan) {
        this.clpFileIdGreaterThan = clpFileIdGreaterThan;
    }

    /**
     * clpFileIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the clpFileIdGreaterThanEqual
     */
    public String getClpFileIdGreaterThanEqual() {
        return clpFileIdGreaterThanEqual;
    }

    /**
     * clpFileIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param clpFileIdGreaterThanEqual clpFileIdGreaterThanEqual に設定する
     */
    public void setClpFileIdGreaterThanEqual(String clpFileIdGreaterThanEqual) {
        this.clpFileIdGreaterThanEqual = clpFileIdGreaterThanEqual;
    }

    /**
     * clpFileIdLessThan のゲッターメソッドです。
     * 
     * @return the clpFileIdLessThan
     */
    public String getClpFileIdLessThan() {
        return clpFileIdLessThan;
    }

    /**
     * clpFileIdLessThan のセッターメソッドです。
     * 
     * @param clpFileIdLessThan clpFileIdLessThan に設定する
     */
    public void setClpFileIdLessThan(String clpFileIdLessThan) {
        this.clpFileIdLessThan = clpFileIdLessThan;
    }

    /**
     * clpFileIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the clpFileIdLessThanEqual
     */
    public String getClpFileIdLessThanEqual() {
        return clpFileIdLessThanEqual;
    }

    /**
     * clpFileIdLessThanEqual のセッターメソッドです。
     * 
     * @param clpFileIdLessThanEqual clpFileIdLessThanEqual に設定する
     */
    public void setClpFileIdLessThanEqual(String clpFileIdLessThanEqual) {
        this.clpFileIdLessThanEqual = clpFileIdLessThanEqual;
    }

    /**
     * clpFileIdLikeFront のゲッターメソッドです。
     * 
     * @return the clpFileIdLikeFront
     */
    public String getClpFileIdLikeFront() {
        return clpFileIdLikeFront;
    }

    /**
     * clpFileIdLikeFront のセッターメソッドです。
     * 
     * @param clpFileIdLikeFront clpFileIdLikeFront に設定する
     */
    public void setClpFileIdLikeFront(String clpFileIdLikeFront) {
        this.clpFileIdLikeFront = clpFileIdLikeFront;
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

