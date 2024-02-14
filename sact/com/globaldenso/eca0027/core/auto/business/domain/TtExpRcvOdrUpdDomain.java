/*
 * PROJECT：eca0027
 * 
 * TtExpRcvOdrUpd のDomainクラス
 * テーブル概要：TT_EXP_RCV_ODR_UPD
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TtExpRcvOdrUpd のDomainクラスです。<BR>
 * テーブル概要：TT_EXP_RCV_ODR_UPD<BR>
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
public class TtExpRcvOdrUpdDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * RCV_ODR_COMP_CD
     */
    private String rcvOdrCompCd;

    /**
     * CUSTOMER_SUBSIDIARY_CD
     */
    private String customerSubsidiaryCd;

    /**
     * TRANSMISSION_DT
     */
    private Date transmissionDt;

    /**
     * ODR_TYP
     */
    private String odrTyp;

    /**
     * SERIAL_NO
     */
    private BigDecimal serialNo;

    /**
     * CUSTOMER_CD
     */
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;

    /**
     * CUSTOMER_ITEM_NO_ORG
     */
    private String customerItemNoOrg;

    /**
     * ODR_CTRL_NO
     */
    private BigDecimal odrCtrlNo;

    /**
     * REVISION_NO
     */
    private BigDecimal revisionNo;

    /**
     * REVISION_NO_EIS
     */
    private BigDecimal revisionNoEis;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * SHIPPING_DT
     */
    private Date shippingDt;

    /**
     * PLTZ_ALLOC_QTY
     */
    private BigDecimal pltzAllocQty;

    /**
     * SHIPPED_QTY
     */
    private BigDecimal shippedQty;

    /**
     * PARTIAL_DELIV_CNT
     */
    private BigDecimal partialDelivCnt;

    /**
     * ODR_QTY_ORG
     */
    private BigDecimal odrQtyOrg;

    /**
     * SALES_COMP_PO_NO
     */
    private String salesCompPoNo;

    /**
     * UPDATE_TYP
     */
    private String updateTyp;

    /**
     * OLD_CUSTOMER_DUE_DT
     */
    private Date oldCustomerDueDt;

    /**
     * OLD_ETD_DUE_DT
     */
    private Date oldEtdDueDt;

    /**
     * OLD_ODR_QTY
     */
    private BigDecimal oldOdrQty;

    /**
     * OLD_TRNS_CD
     */
    private String oldTrnsCd;

    /**
     * OLD_CUSTOMER_PO_NO
     */
    private String oldCustomerPoNo;

    /**
     * OLD_ODR_FIRM_FLG
     */
    private String oldOdrFirmFlg;

    /**
     * OLD_CUSTOMER_ITEM_NO
     */
    private String oldCustomerItemNo;

    /**
     * NEW_CUSTOMER_DUE_DT
     */
    private Date newCustomerDueDt;

    /**
     * NEW_ETD_DUE_DT
     */
    private Date newEtdDueDt;

    /**
     * NEW_ODR_QTY
     */
    private BigDecimal newOdrQty;

    /**
     * NEW_TRNS_CD
     */
    private String newTrnsCd;

    /**
     * NEW_CUSTOMER_PO_NO
     */
    private String newCustomerPoNo;

    /**
     * NEW_ODR_FIRM_FLG
     */
    private String newOdrFirmFlg;

    /**
     * NEW_CUSTOMER_ITEM_NO
     */
    private String newCustomerItemNo;

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
    public TtExpRcvOdrUpdDomain() {
    }

    /**
     * rcvOdrCompCd のゲッターメソッドです。
     * 
     * @return the rcvOdrCompCd
     */
    public String getRcvOdrCompCd() {
        return rcvOdrCompCd;
    }

    /**
     * rcvOdrCompCd のセッターメソッドです。
     * 
     * @param rcvOdrCompCd rcvOdrCompCd に設定する
     */
    public void setRcvOdrCompCd(String rcvOdrCompCd) {
        this.rcvOdrCompCd = rcvOdrCompCd;
    }

    /**
     * customerSubsidiaryCd のゲッターメソッドです。
     * 
     * @return the customerSubsidiaryCd
     */
    public String getCustomerSubsidiaryCd() {
        return customerSubsidiaryCd;
    }

    /**
     * customerSubsidiaryCd のセッターメソッドです。
     * 
     * @param customerSubsidiaryCd customerSubsidiaryCd に設定する
     */
    public void setCustomerSubsidiaryCd(String customerSubsidiaryCd) {
        this.customerSubsidiaryCd = customerSubsidiaryCd;
    }

    /**
     * transmissionDt のゲッターメソッドです。
     * 
     * @return the transmissionDt
     */
    public Date getTransmissionDt() {
        return transmissionDt;
    }

    /**
     * transmissionDt のセッターメソッドです。
     * 
     * @param transmissionDt transmissionDt に設定する
     */
    public void setTransmissionDt(Date transmissionDt) {
        this.transmissionDt = transmissionDt;
    }

    /**
     * odrTyp のゲッターメソッドです。
     * 
     * @return the odrTyp
     */
    public String getOdrTyp() {
        return odrTyp;
    }

    /**
     * odrTyp のセッターメソッドです。
     * 
     * @param odrTyp odrTyp に設定する
     */
    public void setOdrTyp(String odrTyp) {
        this.odrTyp = odrTyp;
    }

    /**
     * serialNo のゲッターメソッドです。
     * 
     * @return the serialNo
     */
    public BigDecimal getSerialNo() {
        return serialNo;
    }

    /**
     * serialNo のセッターメソッドです。
     * 
     * @param serialNo serialNo に設定する
     */
    public void setSerialNo(BigDecimal serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * customerCd のゲッターメソッドです。
     * 
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * customerCd のセッターメソッドです。
     * 
     * @param customerCd customerCd に設定する
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * lgcyShipTo のゲッターメソッドです。
     * 
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * lgcyShipTo のセッターメソッドです。
     * 
     * @param lgcyShipTo lgcyShipTo に設定する
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * customerItemNoOrg のゲッターメソッドです。
     * 
     * @return the customerItemNoOrg
     */
    public String getCustomerItemNoOrg() {
        return customerItemNoOrg;
    }

    /**
     * customerItemNoOrg のセッターメソッドです。
     * 
     * @param customerItemNoOrg customerItemNoOrg に設定する
     */
    public void setCustomerItemNoOrg(String customerItemNoOrg) {
        this.customerItemNoOrg = customerItemNoOrg;
    }

    /**
     * odrCtrlNo のゲッターメソッドです。
     * 
     * @return the odrCtrlNo
     */
    public BigDecimal getOdrCtrlNo() {
        return odrCtrlNo;
    }

    /**
     * odrCtrlNo のセッターメソッドです。
     * 
     * @param odrCtrlNo odrCtrlNo に設定する
     */
    public void setOdrCtrlNo(BigDecimal odrCtrlNo) {
        this.odrCtrlNo = odrCtrlNo;
    }

    /**
     * revisionNo のゲッターメソッドです。
     * 
     * @return the revisionNo
     */
    public BigDecimal getRevisionNo() {
        return revisionNo;
    }

    /**
     * revisionNo のセッターメソッドです。
     * 
     * @param revisionNo revisionNo に設定する
     */
    public void setRevisionNo(BigDecimal revisionNo) {
        this.revisionNo = revisionNo;
    }

    /**
     * revisionNoEis のゲッターメソッドです。
     * 
     * @return the revisionNoEis
     */
    public BigDecimal getRevisionNoEis() {
        return revisionNoEis;
    }

    /**
     * revisionNoEis のセッターメソッドです。
     * 
     * @param revisionNoEis revisionNoEis に設定する
     */
    public void setRevisionNoEis(BigDecimal revisionNoEis) {
        this.revisionNoEis = revisionNoEis;
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
     * shippingDt のゲッターメソッドです。
     * 
     * @return the shippingDt
     */
    public Date getShippingDt() {
        return shippingDt;
    }

    /**
     * shippingDt のセッターメソッドです。
     * 
     * @param shippingDt shippingDt に設定する
     */
    public void setShippingDt(Date shippingDt) {
        this.shippingDt = shippingDt;
    }

    /**
     * pltzAllocQty のゲッターメソッドです。
     * 
     * @return the pltzAllocQty
     */
    public BigDecimal getPltzAllocQty() {
        return pltzAllocQty;
    }

    /**
     * pltzAllocQty のセッターメソッドです。
     * 
     * @param pltzAllocQty pltzAllocQty に設定する
     */
    public void setPltzAllocQty(BigDecimal pltzAllocQty) {
        this.pltzAllocQty = pltzAllocQty;
    }

    /**
     * shippedQty のゲッターメソッドです。
     * 
     * @return the shippedQty
     */
    public BigDecimal getShippedQty() {
        return shippedQty;
    }

    /**
     * shippedQty のセッターメソッドです。
     * 
     * @param shippedQty shippedQty に設定する
     */
    public void setShippedQty(BigDecimal shippedQty) {
        this.shippedQty = shippedQty;
    }

    /**
     * partialDelivCnt のゲッターメソッドです。
     * 
     * @return the partialDelivCnt
     */
    public BigDecimal getPartialDelivCnt() {
        return partialDelivCnt;
    }

    /**
     * partialDelivCnt のセッターメソッドです。
     * 
     * @param partialDelivCnt partialDelivCnt に設定する
     */
    public void setPartialDelivCnt(BigDecimal partialDelivCnt) {
        this.partialDelivCnt = partialDelivCnt;
    }

    /**
     * odrQtyOrg のゲッターメソッドです。
     * 
     * @return the odrQtyOrg
     */
    public BigDecimal getOdrQtyOrg() {
        return odrQtyOrg;
    }

    /**
     * odrQtyOrg のセッターメソッドです。
     * 
     * @param odrQtyOrg odrQtyOrg に設定する
     */
    public void setOdrQtyOrg(BigDecimal odrQtyOrg) {
        this.odrQtyOrg = odrQtyOrg;
    }

    /**
     * salesCompPoNo のゲッターメソッドです。
     * 
     * @return the salesCompPoNo
     */
    public String getSalesCompPoNo() {
        return salesCompPoNo;
    }

    /**
     * salesCompPoNo のセッターメソッドです。
     * 
     * @param salesCompPoNo salesCompPoNo に設定する
     */
    public void setSalesCompPoNo(String salesCompPoNo) {
        this.salesCompPoNo = salesCompPoNo;
    }

    /**
     * updateTyp のゲッターメソッドです。
     * 
     * @return the updateTyp
     */
    public String getUpdateTyp() {
        return updateTyp;
    }

    /**
     * updateTyp のセッターメソッドです。
     * 
     * @param updateTyp updateTyp に設定する
     */
    public void setUpdateTyp(String updateTyp) {
        this.updateTyp = updateTyp;
    }

    /**
     * oldCustomerDueDt のゲッターメソッドです。
     * 
     * @return the oldCustomerDueDt
     */
    public Date getOldCustomerDueDt() {
        return oldCustomerDueDt;
    }

    /**
     * oldCustomerDueDt のセッターメソッドです。
     * 
     * @param oldCustomerDueDt oldCustomerDueDt に設定する
     */
    public void setOldCustomerDueDt(Date oldCustomerDueDt) {
        this.oldCustomerDueDt = oldCustomerDueDt;
    }

    /**
     * oldEtdDueDt のゲッターメソッドです。
     * 
     * @return the oldEtdDueDt
     */
    public Date getOldEtdDueDt() {
        return oldEtdDueDt;
    }

    /**
     * oldEtdDueDt のセッターメソッドです。
     * 
     * @param oldEtdDueDt oldEtdDueDt に設定する
     */
    public void setOldEtdDueDt(Date oldEtdDueDt) {
        this.oldEtdDueDt = oldEtdDueDt;
    }

    /**
     * oldOdrQty のゲッターメソッドです。
     * 
     * @return the oldOdrQty
     */
    public BigDecimal getOldOdrQty() {
        return oldOdrQty;
    }

    /**
     * oldOdrQty のセッターメソッドです。
     * 
     * @param oldOdrQty oldOdrQty に設定する
     */
    public void setOldOdrQty(BigDecimal oldOdrQty) {
        this.oldOdrQty = oldOdrQty;
    }

    /**
     * oldTrnsCd のゲッターメソッドです。
     * 
     * @return the oldTrnsCd
     */
    public String getOldTrnsCd() {
        return oldTrnsCd;
    }

    /**
     * oldTrnsCd のセッターメソッドです。
     * 
     * @param oldTrnsCd oldTrnsCd に設定する
     */
    public void setOldTrnsCd(String oldTrnsCd) {
        this.oldTrnsCd = oldTrnsCd;
    }

    /**
     * oldCustomerPoNo のゲッターメソッドです。
     * 
     * @return the oldCustomerPoNo
     */
    public String getOldCustomerPoNo() {
        return oldCustomerPoNo;
    }

    /**
     * oldCustomerPoNo のセッターメソッドです。
     * 
     * @param oldCustomerPoNo oldCustomerPoNo に設定する
     */
    public void setOldCustomerPoNo(String oldCustomerPoNo) {
        this.oldCustomerPoNo = oldCustomerPoNo;
    }

    /**
     * oldOdrFirmFlg のゲッターメソッドです。
     * 
     * @return the oldOdrFirmFlg
     */
    public String getOldOdrFirmFlg() {
        return oldOdrFirmFlg;
    }

    /**
     * oldOdrFirmFlg のセッターメソッドです。
     * 
     * @param oldOdrFirmFlg oldOdrFirmFlg に設定する
     */
    public void setOldOdrFirmFlg(String oldOdrFirmFlg) {
        this.oldOdrFirmFlg = oldOdrFirmFlg;
    }

    /**
     * oldCustomerItemNo のゲッターメソッドです。
     * 
     * @return the oldCustomerItemNo
     */
    public String getOldCustomerItemNo() {
        return oldCustomerItemNo;
    }

    /**
     * oldCustomerItemNo のセッターメソッドです。
     * 
     * @param oldCustomerItemNo oldCustomerItemNo に設定する
     */
    public void setOldCustomerItemNo(String oldCustomerItemNo) {
        this.oldCustomerItemNo = oldCustomerItemNo;
    }

    /**
     * newCustomerDueDt のゲッターメソッドです。
     * 
     * @return the newCustomerDueDt
     */
    public Date getNewCustomerDueDt() {
        return newCustomerDueDt;
    }

    /**
     * newCustomerDueDt のセッターメソッドです。
     * 
     * @param newCustomerDueDt newCustomerDueDt に設定する
     */
    public void setNewCustomerDueDt(Date newCustomerDueDt) {
        this.newCustomerDueDt = newCustomerDueDt;
    }

    /**
     * newEtdDueDt のゲッターメソッドです。
     * 
     * @return the newEtdDueDt
     */
    public Date getNewEtdDueDt() {
        return newEtdDueDt;
    }

    /**
     * newEtdDueDt のセッターメソッドです。
     * 
     * @param newEtdDueDt newEtdDueDt に設定する
     */
    public void setNewEtdDueDt(Date newEtdDueDt) {
        this.newEtdDueDt = newEtdDueDt;
    }

    /**
     * newOdrQty のゲッターメソッドです。
     * 
     * @return the newOdrQty
     */
    public BigDecimal getNewOdrQty() {
        return newOdrQty;
    }

    /**
     * newOdrQty のセッターメソッドです。
     * 
     * @param newOdrQty newOdrQty に設定する
     */
    public void setNewOdrQty(BigDecimal newOdrQty) {
        this.newOdrQty = newOdrQty;
    }

    /**
     * newTrnsCd のゲッターメソッドです。
     * 
     * @return the newTrnsCd
     */
    public String getNewTrnsCd() {
        return newTrnsCd;
    }

    /**
     * newTrnsCd のセッターメソッドです。
     * 
     * @param newTrnsCd newTrnsCd に設定する
     */
    public void setNewTrnsCd(String newTrnsCd) {
        this.newTrnsCd = newTrnsCd;
    }

    /**
     * newCustomerPoNo のゲッターメソッドです。
     * 
     * @return the newCustomerPoNo
     */
    public String getNewCustomerPoNo() {
        return newCustomerPoNo;
    }

    /**
     * newCustomerPoNo のセッターメソッドです。
     * 
     * @param newCustomerPoNo newCustomerPoNo に設定する
     */
    public void setNewCustomerPoNo(String newCustomerPoNo) {
        this.newCustomerPoNo = newCustomerPoNo;
    }

    /**
     * newOdrFirmFlg のゲッターメソッドです。
     * 
     * @return the newOdrFirmFlg
     */
    public String getNewOdrFirmFlg() {
        return newOdrFirmFlg;
    }

    /**
     * newOdrFirmFlg のセッターメソッドです。
     * 
     * @param newOdrFirmFlg newOdrFirmFlg に設定する
     */
    public void setNewOdrFirmFlg(String newOdrFirmFlg) {
        this.newOdrFirmFlg = newOdrFirmFlg;
    }

    /**
     * newCustomerItemNo のゲッターメソッドです。
     * 
     * @return the newCustomerItemNo
     */
    public String getNewCustomerItemNo() {
        return newCustomerItemNo;
    }

    /**
     * newCustomerItemNo のセッターメソッドです。
     * 
     * @param newCustomerItemNo newCustomerItemNo に設定する
     */
    public void setNewCustomerItemNo(String newCustomerItemNo) {
        this.newCustomerItemNo = newCustomerItemNo;
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
