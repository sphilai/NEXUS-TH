/*
 * PROJECT：eca0027
 * 
 * TtShippingActOdr のDomainクラス
 * テーブル概要：TT_SHIPPING_ACT_ODR
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/11  DNITS  新規作成
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
 * TtShippingActOdr のDomainクラスです。<BR>
 * テーブル概要：TT_SHIPPING_ACT_ODR<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/11 15:12:22<BR>
 * 
 * テーブル定義から2014/06/11に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtShippingActOdrDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPING_ACT_NO
     */
    private String shippingActNo;

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
     * CONTAINER_NO
     */
    private String containerNo;

    /**
     * MAIN_MARK
     */
    private String mainMark;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * CUSTOMER_ITEM_NO
     */
    private String customerItemNo;

    /**
     * CUSTOMER_PO_NO
     */
    private String customerPoNo;

    /**
     * ETD_DUE_DT
     */
    private Date etdDueDt;

    /**
     * CUSTOMER_ITEM_NO_ORG
     */
    private String customerItemNoOrg;

    /**
     * ODR_CTRL_NO
     */
    private BigDecimal odrCtrlNo;

    /**
     * SHIPPED_QTY
     */
    private BigDecimal shippedQty;

    /**
     * SALES_COMP_PO_NO
     */
    private String salesCompPoNo;

    /**
     * SHIPPING_LOT
     */
    private BigDecimal shippingLot;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * CARTON_QTY
     */
    private BigDecimal cartonQty;

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
     * デフォルトコンストラクタ。
     */
    public TtShippingActOdrDomain() {
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
     * containerNo のゲッターメソッドです。
     * 
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }

    /**
     * containerNo のセッターメソッドです。
     * 
     * @param containerNo containerNo に設定する
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    /**
     * mainMark のゲッターメソッドです。
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * mainMark のセッターメソッドです。
     * 
     * @param mainMark mainMark に設定する
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
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
     * customerItemNo のゲッターメソッドです。
     * 
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * customerItemNo のセッターメソッドです。
     * 
     * @param customerItemNo customerItemNo に設定する
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * customerPoNo のゲッターメソッドです。
     * 
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * customerPoNo のセッターメソッドです。
     * 
     * @param customerPoNo customerPoNo に設定する
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }

    /**
     * etdDueDt のゲッターメソッドです。
     * 
     * @return the etdDueDt
     */
    public Date getEtdDueDt() {
        return etdDueDt;
    }

    /**
     * etdDueDt のセッターメソッドです。
     * 
     * @param etdDueDt etdDueDt に設定する
     */
    public void setEtdDueDt(Date etdDueDt) {
        this.etdDueDt = etdDueDt;
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
     * shippingLot のゲッターメソッドです。
     * 
     * @return the shippingLot
     */
    public BigDecimal getShippingLot() {
        return shippingLot;
    }

    /**
     * shippingLot のセッターメソッドです。
     * 
     * @param shippingLot shippingLot に設定する
     */
    public void setShippingLot(BigDecimal shippingLot) {
        this.shippingLot = shippingLot;
    }

    /**
     * plntCd のゲッターメソッドです。
     * 
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * plntCd のセッターメソッドです。
     * 
     * @param plntCd plntCd に設定する
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * cartonQty のゲッターメソッドです。
     * 
     * @return the cartonQty
     */
    public BigDecimal getCartonQty() {
        return cartonQty;
    }

    /**
     * cartonQty のセッターメソッドです。
     * 
     * @param cartonQty cartonQty に設定する
     */
    public void setCartonQty(BigDecimal cartonQty) {
        this.cartonQty = cartonQty;
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

}
