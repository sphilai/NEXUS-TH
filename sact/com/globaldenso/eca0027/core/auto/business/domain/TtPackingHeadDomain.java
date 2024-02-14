/*
 * PROJECT：eca0027
 * 
 * TtPackingHead のDomainクラス
 * テーブル概要：TT_PACKING_HEAD
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/17  DNITS  新規作成
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
 * TtPackingHead のDomainクラスです。<BR>
 * テーブル概要：TT_PACKING_HEAD<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/17 15:44:47<BR>
 * 
 * テーブル定義から2014/11/17に自動生成したモジュールです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class TtPackingHeadDomain extends AbstractDomain implements Serializable {

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
     * MANUAL_FLG
     */
    private String manualFlg;

    /**
     * MANUAL_TYP
     */
    private String manualTyp;

    /**
     * INVOICE_CLASS
     */
    private String invoiceClass;

    /**
     * CANCEL_TYP
     */
    private String cancelTyp;

    /**
     * CANCEL_INVOICE_NO
     */
    private String cancelInvoiceNo;

    /**
     * CANCEL_INVOICE_ISSUE_DT
     */
    private Date cancelInvoiceIssueDt;

    /**
     * SHIPPER_COMP_NM_1
     */
    private String shipperCompNm1;

    /**
     * SHIPPER_COMP_NM_2
     */
    private String shipperCompNm2;

    /**
     * SHIPPER_COMP_ADDR_1
     */
    private String shipperCompAddr1;

    /**
     * SHIPPER_COMP_ADDR_2
     */
    private String shipperCompAddr2;

    /**
     * SHIPPER_COMP_ADDR_3
     */
    private String shipperCompAddr3;

    /**
     * SHIPPER_COMP_ADDR_4
     */
    private String shipperCompAddr4;

    /**
     * SHIPPER_COMP_TEL
     */
    private String shipperCompTel;

    /**
     * SHIPPER_COMP_FAX
     */
    private String shipperCompFax;

    /**
     * SHIPPER_TAX_ID_NO
     */
    private String shipperTaxIdNo;

    /**
     * CONSIGNEE_CD
     */
    private String consigneeCd;

    /**
     * CONSIGNEE_COMP_NM_1
     */
    private String consigneeCompNm1;

    /**
     * CONSIGNEE_COMP_NM_2
     */
    private String consigneeCompNm2;

    /**
     * CONSIGNEE_COMP_ADDR_1
     */
    private String consigneeCompAddr1;

    /**
     * CONSIGNEE_COMP_ADDR_2
     */
    private String consigneeCompAddr2;

    /**
     * CONSIGNEE_COMP_ADDR_3
     */
    private String consigneeCompAddr3;

    /**
     * CONSIGNEE_COMP_ADDR_4
     */
    private String consigneeCompAddr4;

    /**
     * CONSIGNEE_COMP_TEL
     */
    private String consigneeCompTel;

    /**
     * CONSIGNEE_COMP_FAX
     */
    private String consigneeCompFax;

    /**
     * CONSIGNEE_TAX_ID_NO
     */
    private String consigneeTaxIdNo;

    /**
     * CONSIGNEE_ATTN
     */
    private String consigneeAttn;

    /**
     * SHIP_TO_CD
     */
    private String shipToCd;

    /**
     * SHIP_TO_NM_1
     */
    private String shipToNm1;

    /**
     * SHIP_TO_NM_2
     */
    private String shipToNm2;

    /**
     * SHIP_TO_ADDR_1
     */
    private String shipToAddr1;

    /**
     * SHIP_TO_ADDR_2
     */
    private String shipToAddr2;

    /**
     * SHIP_TO_ADDR_3
     */
    private String shipToAddr3;

    /**
     * SHIP_TO_ADDR_4
     */
    private String shipToAddr4;

    /**
     * SHIPPER_COMP_NM_ABB
     */
    private String shipperCompNmAbb;

    /**
     * INVOICE_CTGRY
     */
    private String invoiceCtgry;

    /**
     * INVOICE_CTGRY_NM
     */
    private String invoiceCtgryNm;

    /**
     * SHIPPED_DT
     */
    private Date shippedDt;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * TRNS_NM
     */
    private String trnsNm;

    /**
     * ETD
     */
    private Date etd;

    /**
     * ETA
     */
    private Date eta;

    /**
     * L_PORT_CNTRY_CD
     */
    private String lPortCntryCd;

    /**
     * LOADING_PORT_CD
     */
    private String loadingPortCd;

    /**
     * LOADING_PORT_NM
     */
    private String loadingPortNm;

    /**
     * D_PORT_CNTRY_CD
     */
    private String dPortCntryCd;

    /**
     * DISCHARGE_PORT_CD
     */
    private String dischargePortCd;

    /**
     * DISCHARGE_PORT_NM
     */
    private String dischargePortNm;

    /**
     * DLIV_POINT
     */
    private String dlivPoint;

    /**
     * CARRIER_COMP_CD
     */
    private String carrierCompCd;

    /**
     * CARRIER_COMP_NM_ABB
     */
    private String carrierCompNmAbb;

    /**
     * VESSEL
     */
    private String vessel;

    /**
     * BOOKING_NO
     */
    private String bookingNo;

    /**
     * CONTAINER_NO_1
     */
    private String containerNo1;

    /**
     * CONTAINER_NO_2
     */
    private String containerNo2;

    /**
     * CONTAINER_NO_3
     */
    private String containerNo3;

    /**
     * PLTZ_ITEM_QTY
     */
    private BigDecimal pltzItemQty;

    /**
     * TOTAL_NET_WEIGHT
     */
    private BigDecimal totalNetWeight;

    /**
     * TOTAL_NET_WEIGHT_UNIT
     */
    private String totalNetWeightUnit;

    /**
     * TOTAL_GROSS_WEIGHT
     */
    private BigDecimal totalGrossWeight;

    /**
     * TOTAL_GROSS_WEIGHT_UNIT
     */
    private String totalGrossWeightUnit;

    /**
     * TOTAL_VOLUME
     */
    private BigDecimal totalVolume;

    /**
     * TOTAL_VOLUME_UNIT
     */
    private String totalVolumeUnit;

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
     * デフォルトコンストラクタ。
     */
    public TtPackingHeadDomain() {
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
     * manualFlg のゲッターメソッドです。
     * 
     * @return the manualFlg
     */
    public String getManualFlg() {
        return manualFlg;
    }

    /**
     * manualFlg のセッターメソッドです。
     * 
     * @param manualFlg manualFlg に設定する
     */
    public void setManualFlg(String manualFlg) {
        this.manualFlg = manualFlg;
    }

    /**
     * manualTyp のゲッターメソッドです。
     * 
     * @return the manualTyp
     */
    public String getManualTyp() {
        return manualTyp;
    }

    /**
     * manualTyp のセッターメソッドです。
     * 
     * @param manualTyp manualTyp に設定する
     */
    public void setManualTyp(String manualTyp) {
        this.manualTyp = manualTyp;
    }

    /**
     * invoiceClass のゲッターメソッドです。
     * 
     * @return the invoiceClass
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * invoiceClass のセッターメソッドです。
     * 
     * @param invoiceClass invoiceClass に設定する
     */
    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
    }

    /**
     * cancelTyp のゲッターメソッドです。
     * 
     * @return the cancelTyp
     */
    public String getCancelTyp() {
        return cancelTyp;
    }

    /**
     * cancelTyp のセッターメソッドです。
     * 
     * @param cancelTyp cancelTyp に設定する
     */
    public void setCancelTyp(String cancelTyp) {
        this.cancelTyp = cancelTyp;
    }

    /**
     * cancelInvoiceNo のゲッターメソッドです。
     * 
     * @return the cancelInvoiceNo
     */
    public String getCancelInvoiceNo() {
        return cancelInvoiceNo;
    }

    /**
     * cancelInvoiceNo のセッターメソッドです。
     * 
     * @param cancelInvoiceNo cancelInvoiceNo に設定する
     */
    public void setCancelInvoiceNo(String cancelInvoiceNo) {
        this.cancelInvoiceNo = cancelInvoiceNo;
    }

    /**
     * cancelInvoiceIssueDt のゲッターメソッドです。
     * 
     * @return the cancelInvoiceIssueDt
     */
    public Date getCancelInvoiceIssueDt() {
        return cancelInvoiceIssueDt;
    }

    /**
     * cancelInvoiceIssueDt のセッターメソッドです。
     * 
     * @param cancelInvoiceIssueDt cancelInvoiceIssueDt に設定する
     */
    public void setCancelInvoiceIssueDt(Date cancelInvoiceIssueDt) {
        this.cancelInvoiceIssueDt = cancelInvoiceIssueDt;
    }

    /**
     * shipperCompNm1 のゲッターメソッドです。
     * 
     * @return the shipperCompNm1
     */
    public String getShipperCompNm1() {
        return shipperCompNm1;
    }

    /**
     * shipperCompNm1 のセッターメソッドです。
     * 
     * @param shipperCompNm1 shipperCompNm1 に設定する
     */
    public void setShipperCompNm1(String shipperCompNm1) {
        this.shipperCompNm1 = shipperCompNm1;
    }

    /**
     * shipperCompNm2 のゲッターメソッドです。
     * 
     * @return the shipperCompNm2
     */
    public String getShipperCompNm2() {
        return shipperCompNm2;
    }

    /**
     * shipperCompNm2 のセッターメソッドです。
     * 
     * @param shipperCompNm2 shipperCompNm2 に設定する
     */
    public void setShipperCompNm2(String shipperCompNm2) {
        this.shipperCompNm2 = shipperCompNm2;
    }

    /**
     * shipperCompAddr1 のゲッターメソッドです。
     * 
     * @return the shipperCompAddr1
     */
    public String getShipperCompAddr1() {
        return shipperCompAddr1;
    }

    /**
     * shipperCompAddr1 のセッターメソッドです。
     * 
     * @param shipperCompAddr1 shipperCompAddr1 に設定する
     */
    public void setShipperCompAddr1(String shipperCompAddr1) {
        this.shipperCompAddr1 = shipperCompAddr1;
    }

    /**
     * shipperCompAddr2 のゲッターメソッドです。
     * 
     * @return the shipperCompAddr2
     */
    public String getShipperCompAddr2() {
        return shipperCompAddr2;
    }

    /**
     * shipperCompAddr2 のセッターメソッドです。
     * 
     * @param shipperCompAddr2 shipperCompAddr2 に設定する
     */
    public void setShipperCompAddr2(String shipperCompAddr2) {
        this.shipperCompAddr2 = shipperCompAddr2;
    }

    /**
     * shipperCompAddr3 のゲッターメソッドです。
     * 
     * @return the shipperCompAddr3
     */
    public String getShipperCompAddr3() {
        return shipperCompAddr3;
    }

    /**
     * shipperCompAddr3 のセッターメソッドです。
     * 
     * @param shipperCompAddr3 shipperCompAddr3 に設定する
     */
    public void setShipperCompAddr3(String shipperCompAddr3) {
        this.shipperCompAddr3 = shipperCompAddr3;
    }

    /**
     * shipperCompAddr4 のゲッターメソッドです。
     * 
     * @return the shipperCompAddr4
     */
    public String getShipperCompAddr4() {
        return shipperCompAddr4;
    }

    /**
     * shipperCompAddr4 のセッターメソッドです。
     * 
     * @param shipperCompAddr4 shipperCompAddr4 に設定する
     */
    public void setShipperCompAddr4(String shipperCompAddr4) {
        this.shipperCompAddr4 = shipperCompAddr4;
    }

    /**
     * shipperCompTel のゲッターメソッドです。
     * 
     * @return the shipperCompTel
     */
    public String getShipperCompTel() {
        return shipperCompTel;
    }

    /**
     * shipperCompTel のセッターメソッドです。
     * 
     * @param shipperCompTel shipperCompTel に設定する
     */
    public void setShipperCompTel(String shipperCompTel) {
        this.shipperCompTel = shipperCompTel;
    }

    /**
     * shipperCompFax のゲッターメソッドです。
     * 
     * @return the shipperCompFax
     */
    public String getShipperCompFax() {
        return shipperCompFax;
    }

    /**
     * shipperCompFax のセッターメソッドです。
     * 
     * @param shipperCompFax shipperCompFax に設定する
     */
    public void setShipperCompFax(String shipperCompFax) {
        this.shipperCompFax = shipperCompFax;
    }

    /**
     * shipperTaxIdNo のゲッターメソッドです。
     * 
     * @return the shipperTaxIdNo
     */
    public String getShipperTaxIdNo() {
        return shipperTaxIdNo;
    }

    /**
     * shipperTaxIdNo のセッターメソッドです。
     * 
     * @param shipperTaxIdNo shipperTaxIdNo に設定する
     */
    public void setShipperTaxIdNo(String shipperTaxIdNo) {
        this.shipperTaxIdNo = shipperTaxIdNo;
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
     * consigneeCompNm1 のゲッターメソッドです。
     * 
     * @return the consigneeCompNm1
     */
    public String getConsigneeCompNm1() {
        return consigneeCompNm1;
    }

    /**
     * consigneeCompNm1 のセッターメソッドです。
     * 
     * @param consigneeCompNm1 consigneeCompNm1 に設定する
     */
    public void setConsigneeCompNm1(String consigneeCompNm1) {
        this.consigneeCompNm1 = consigneeCompNm1;
    }

    /**
     * consigneeCompNm2 のゲッターメソッドです。
     * 
     * @return the consigneeCompNm2
     */
    public String getConsigneeCompNm2() {
        return consigneeCompNm2;
    }

    /**
     * consigneeCompNm2 のセッターメソッドです。
     * 
     * @param consigneeCompNm2 consigneeCompNm2 に設定する
     */
    public void setConsigneeCompNm2(String consigneeCompNm2) {
        this.consigneeCompNm2 = consigneeCompNm2;
    }

    /**
     * consigneeCompAddr1 のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr1
     */
    public String getConsigneeCompAddr1() {
        return consigneeCompAddr1;
    }

    /**
     * consigneeCompAddr1 のセッターメソッドです。
     * 
     * @param consigneeCompAddr1 consigneeCompAddr1 に設定する
     */
    public void setConsigneeCompAddr1(String consigneeCompAddr1) {
        this.consigneeCompAddr1 = consigneeCompAddr1;
    }

    /**
     * consigneeCompAddr2 のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr2
     */
    public String getConsigneeCompAddr2() {
        return consigneeCompAddr2;
    }

    /**
     * consigneeCompAddr2 のセッターメソッドです。
     * 
     * @param consigneeCompAddr2 consigneeCompAddr2 に設定する
     */
    public void setConsigneeCompAddr2(String consigneeCompAddr2) {
        this.consigneeCompAddr2 = consigneeCompAddr2;
    }

    /**
     * consigneeCompAddr3 のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr3
     */
    public String getConsigneeCompAddr3() {
        return consigneeCompAddr3;
    }

    /**
     * consigneeCompAddr3 のセッターメソッドです。
     * 
     * @param consigneeCompAddr3 consigneeCompAddr3 に設定する
     */
    public void setConsigneeCompAddr3(String consigneeCompAddr3) {
        this.consigneeCompAddr3 = consigneeCompAddr3;
    }

    /**
     * consigneeCompAddr4 のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr4
     */
    public String getConsigneeCompAddr4() {
        return consigneeCompAddr4;
    }

    /**
     * consigneeCompAddr4 のセッターメソッドです。
     * 
     * @param consigneeCompAddr4 consigneeCompAddr4 に設定する
     */
    public void setConsigneeCompAddr4(String consigneeCompAddr4) {
        this.consigneeCompAddr4 = consigneeCompAddr4;
    }

    /**
     * consigneeCompTel のゲッターメソッドです。
     * 
     * @return the consigneeCompTel
     */
    public String getConsigneeCompTel() {
        return consigneeCompTel;
    }

    /**
     * consigneeCompTel のセッターメソッドです。
     * 
     * @param consigneeCompTel consigneeCompTel に設定する
     */
    public void setConsigneeCompTel(String consigneeCompTel) {
        this.consigneeCompTel = consigneeCompTel;
    }

    /**
     * consigneeCompFax のゲッターメソッドです。
     * 
     * @return the consigneeCompFax
     */
    public String getConsigneeCompFax() {
        return consigneeCompFax;
    }

    /**
     * consigneeCompFax のセッターメソッドです。
     * 
     * @param consigneeCompFax consigneeCompFax に設定する
     */
    public void setConsigneeCompFax(String consigneeCompFax) {
        this.consigneeCompFax = consigneeCompFax;
    }

    /**
     * consigneeTaxIdNo のゲッターメソッドです。
     * 
     * @return the consigneeTaxIdNo
     */
    public String getConsigneeTaxIdNo() {
        return consigneeTaxIdNo;
    }

    /**
     * consigneeTaxIdNo のセッターメソッドです。
     * 
     * @param consigneeTaxIdNo consigneeTaxIdNo に設定する
     */
    public void setConsigneeTaxIdNo(String consigneeTaxIdNo) {
        this.consigneeTaxIdNo = consigneeTaxIdNo;
    }

    /**
     * consigneeAttn のゲッターメソッドです。
     * 
     * @return the consigneeAttn
     */
    public String getConsigneeAttn() {
        return consigneeAttn;
    }

    /**
     * consigneeAttn のセッターメソッドです。
     * 
     * @param consigneeAttn consigneeAttn に設定する
     */
    public void setConsigneeAttn(String consigneeAttn) {
        this.consigneeAttn = consigneeAttn;
    }

    /**
     * shipToCd のゲッターメソッドです。
     * 
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * shipToCd のセッターメソッドです。
     * 
     * @param shipToCd shipToCd に設定する
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * shipToNm1 のゲッターメソッドです。
     * 
     * @return the shipToNm1
     */
    public String getShipToNm1() {
        return shipToNm1;
    }

    /**
     * shipToNm1 のセッターメソッドです。
     * 
     * @param shipToNm1 shipToNm1 に設定する
     */
    public void setShipToNm1(String shipToNm1) {
        this.shipToNm1 = shipToNm1;
    }

    /**
     * shipToNm2 のゲッターメソッドです。
     * 
     * @return the shipToNm2
     */
    public String getShipToNm2() {
        return shipToNm2;
    }

    /**
     * shipToNm2 のセッターメソッドです。
     * 
     * @param shipToNm2 shipToNm2 に設定する
     */
    public void setShipToNm2(String shipToNm2) {
        this.shipToNm2 = shipToNm2;
    }

    /**
     * shipToAddr1 のゲッターメソッドです。
     * 
     * @return the shipToAddr1
     */
    public String getShipToAddr1() {
        return shipToAddr1;
    }

    /**
     * shipToAddr1 のセッターメソッドです。
     * 
     * @param shipToAddr1 shipToAddr1 に設定する
     */
    public void setShipToAddr1(String shipToAddr1) {
        this.shipToAddr1 = shipToAddr1;
    }

    /**
     * shipToAddr2 のゲッターメソッドです。
     * 
     * @return the shipToAddr2
     */
    public String getShipToAddr2() {
        return shipToAddr2;
    }

    /**
     * shipToAddr2 のセッターメソッドです。
     * 
     * @param shipToAddr2 shipToAddr2 に設定する
     */
    public void setShipToAddr2(String shipToAddr2) {
        this.shipToAddr2 = shipToAddr2;
    }

    /**
     * shipToAddr3 のゲッターメソッドです。
     * 
     * @return the shipToAddr3
     */
    public String getShipToAddr3() {
        return shipToAddr3;
    }

    /**
     * shipToAddr3 のセッターメソッドです。
     * 
     * @param shipToAddr3 shipToAddr3 に設定する
     */
    public void setShipToAddr3(String shipToAddr3) {
        this.shipToAddr3 = shipToAddr3;
    }

    /**
     * shipToAddr4 のゲッターメソッドです。
     * 
     * @return the shipToAddr4
     */
    public String getShipToAddr4() {
        return shipToAddr4;
    }

    /**
     * shipToAddr4 のセッターメソッドです。
     * 
     * @param shipToAddr4 shipToAddr4 に設定する
     */
    public void setShipToAddr4(String shipToAddr4) {
        this.shipToAddr4 = shipToAddr4;
    }

    /**
     * shipperCompNmAbb のゲッターメソッドです。
     * 
     * @return the shipperCompNmAbb
     */
    public String getShipperCompNmAbb() {
        return shipperCompNmAbb;
    }

    /**
     * shipperCompNmAbb のセッターメソッドです。
     * 
     * @param shipperCompNmAbb shipperCompNmAbb に設定する
     */
    public void setShipperCompNmAbb(String shipperCompNmAbb) {
        this.shipperCompNmAbb = shipperCompNmAbb;
    }

    /**
     * invoiceCtgry のゲッターメソッドです。
     * 
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * invoiceCtgry のセッターメソッドです。
     * 
     * @param invoiceCtgry invoiceCtgry に設定する
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * invoiceCtgryNm のゲッターメソッドです。
     * 
     * @return the invoiceCtgryNm
     */
    public String getInvoiceCtgryNm() {
        return invoiceCtgryNm;
    }

    /**
     * invoiceCtgryNm のセッターメソッドです。
     * 
     * @param invoiceCtgryNm invoiceCtgryNm に設定する
     */
    public void setInvoiceCtgryNm(String invoiceCtgryNm) {
        this.invoiceCtgryNm = invoiceCtgryNm;
    }

    /**
     * shippedDt のゲッターメソッドです。
     * 
     * @return the shippedDt
     */
    public Date getShippedDt() {
        return shippedDt;
    }

    /**
     * shippedDt のセッターメソッドです。
     * 
     * @param shippedDt shippedDt に設定する
     */
    public void setShippedDt(Date shippedDt) {
        this.shippedDt = shippedDt;
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
     * trnsNm のゲッターメソッドです。
     * 
     * @return the trnsNm
     */
    public String getTrnsNm() {
        return trnsNm;
    }

    /**
     * trnsNm のセッターメソッドです。
     * 
     * @param trnsNm trnsNm に設定する
     */
    public void setTrnsNm(String trnsNm) {
        this.trnsNm = trnsNm;
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
     * lPortCntryCd のゲッターメソッドです。
     * 
     * @return the lPortCntryCd
     */
    public String getLPortCntryCd() {
        return lPortCntryCd;
    }

    /**
     * lPortCntryCd のセッターメソッドです。
     * 
     * @param lPortCntryCd lPortCntryCd に設定する
     */
    public void setLPortCntryCd(String lPortCntryCd) {
        this.lPortCntryCd = lPortCntryCd;
    }

    /**
     * loadingPortCd のゲッターメソッドです。
     * 
     * @return the loadingPortCd
     */
    public String getLoadingPortCd() {
        return loadingPortCd;
    }

    /**
     * loadingPortCd のセッターメソッドです。
     * 
     * @param loadingPortCd loadingPortCd に設定する
     */
    public void setLoadingPortCd(String loadingPortCd) {
        this.loadingPortCd = loadingPortCd;
    }

    /**
     * loadingPortNm のゲッターメソッドです。
     * 
     * @return the loadingPortNm
     */
    public String getLoadingPortNm() {
        return loadingPortNm;
    }

    /**
     * loadingPortNm のセッターメソッドです。
     * 
     * @param loadingPortNm loadingPortNm に設定する
     */
    public void setLoadingPortNm(String loadingPortNm) {
        this.loadingPortNm = loadingPortNm;
    }

    /**
     * dPortCntryCd のゲッターメソッドです。
     * 
     * @return the dPortCntryCd
     */
    public String getDPortCntryCd() {
        return dPortCntryCd;
    }

    /**
     * dPortCntryCd のセッターメソッドです。
     * 
     * @param dPortCntryCd dPortCntryCd に設定する
     */
    public void setDPortCntryCd(String dPortCntryCd) {
        this.dPortCntryCd = dPortCntryCd;
    }

    /**
     * dischargePortCd のゲッターメソッドです。
     * 
     * @return the dischargePortCd
     */
    public String getDischargePortCd() {
        return dischargePortCd;
    }

    /**
     * dischargePortCd のセッターメソッドです。
     * 
     * @param dischargePortCd dischargePortCd に設定する
     */
    public void setDischargePortCd(String dischargePortCd) {
        this.dischargePortCd = dischargePortCd;
    }

    /**
     * dischargePortNm のゲッターメソッドです。
     * 
     * @return the dischargePortNm
     */
    public String getDischargePortNm() {
        return dischargePortNm;
    }

    /**
     * dischargePortNm のセッターメソッドです。
     * 
     * @param dischargePortNm dischargePortNm に設定する
     */
    public void setDischargePortNm(String dischargePortNm) {
        this.dischargePortNm = dischargePortNm;
    }

    /**
     * dlivPoint のゲッターメソッドです。
     * 
     * @return the dlivPoint
     */
    public String getDlivPoint() {
        return dlivPoint;
    }

    /**
     * dlivPoint のセッターメソッドです。
     * 
     * @param dlivPoint dlivPoint に設定する
     */
    public void setDlivPoint(String dlivPoint) {
        this.dlivPoint = dlivPoint;
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
     * carrierCompNmAbb のゲッターメソッドです。
     * 
     * @return the carrierCompNmAbb
     */
    public String getCarrierCompNmAbb() {
        return carrierCompNmAbb;
    }

    /**
     * carrierCompNmAbb のセッターメソッドです。
     * 
     * @param carrierCompNmAbb carrierCompNmAbb に設定する
     */
    public void setCarrierCompNmAbb(String carrierCompNmAbb) {
        this.carrierCompNmAbb = carrierCompNmAbb;
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
     * bookingNo のゲッターメソッドです。
     * 
     * @return the bookingNo
     */
    public String getBookingNo() {
        return bookingNo;
    }

    /**
     * bookingNo のセッターメソッドです。
     * 
     * @param bookingNo bookingNo に設定する
     */
    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }

    /**
     * containerNo1 のゲッターメソッドです。
     * 
     * @return the containerNo1
     */
    public String getContainerNo1() {
        return containerNo1;
    }

    /**
     * containerNo1 のセッターメソッドです。
     * 
     * @param containerNo1 containerNo1 に設定する
     */
    public void setContainerNo1(String containerNo1) {
        this.containerNo1 = containerNo1;
    }

    /**
     * containerNo2 のゲッターメソッドです。
     * 
     * @return the containerNo2
     */
    public String getContainerNo2() {
        return containerNo2;
    }

    /**
     * containerNo2 のセッターメソッドです。
     * 
     * @param containerNo2 containerNo2 に設定する
     */
    public void setContainerNo2(String containerNo2) {
        this.containerNo2 = containerNo2;
    }

    /**
     * containerNo3 のゲッターメソッドです。
     * 
     * @return the containerNo3
     */
    public String getContainerNo3() {
        return containerNo3;
    }

    /**
     * containerNo3 のセッターメソッドです。
     * 
     * @param containerNo3 containerNo3 に設定する
     */
    public void setContainerNo3(String containerNo3) {
        this.containerNo3 = containerNo3;
    }

    /**
     * pltzItemQty のゲッターメソッドです。
     * 
     * @return the pltzItemQty
     */
    public BigDecimal getPltzItemQty() {
        return pltzItemQty;
    }

    /**
     * pltzItemQty のセッターメソッドです。
     * 
     * @param pltzItemQty pltzItemQty に設定する
     */
    public void setPltzItemQty(BigDecimal pltzItemQty) {
        this.pltzItemQty = pltzItemQty;
    }

    /**
     * totalNetWeight のゲッターメソッドです。
     * 
     * @return the totalNetWeight
     */
    public BigDecimal getTotalNetWeight() {
        return totalNetWeight;
    }

    /**
     * totalNetWeight のセッターメソッドです。
     * 
     * @param totalNetWeight totalNetWeight に設定する
     */
    public void setTotalNetWeight(BigDecimal totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }

    /**
     * totalNetWeightUnit のゲッターメソッドです。
     * 
     * @return the totalNetWeightUnit
     */
    public String getTotalNetWeightUnit() {
        return totalNetWeightUnit;
    }

    /**
     * totalNetWeightUnit のセッターメソッドです。
     * 
     * @param totalNetWeightUnit totalNetWeightUnit に設定する
     */
    public void setTotalNetWeightUnit(String totalNetWeightUnit) {
        this.totalNetWeightUnit = totalNetWeightUnit;
    }

    /**
     * totalGrossWeight のゲッターメソッドです。
     * 
     * @return the totalGrossWeight
     */
    public BigDecimal getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /**
     * totalGrossWeight のセッターメソッドです。
     * 
     * @param totalGrossWeight totalGrossWeight に設定する
     */
    public void setTotalGrossWeight(BigDecimal totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    /**
     * totalGrossWeightUnit のゲッターメソッドです。
     * 
     * @return the totalGrossWeightUnit
     */
    public String getTotalGrossWeightUnit() {
        return totalGrossWeightUnit;
    }

    /**
     * totalGrossWeightUnit のセッターメソッドです。
     * 
     * @param totalGrossWeightUnit totalGrossWeightUnit に設定する
     */
    public void setTotalGrossWeightUnit(String totalGrossWeightUnit) {
        this.totalGrossWeightUnit = totalGrossWeightUnit;
    }

    /**
     * totalVolume のゲッターメソッドです。
     * 
     * @return the totalVolume
     */
    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    /**
     * totalVolume のセッターメソッドです。
     * 
     * @param totalVolume totalVolume に設定する
     */
    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    /**
     * totalVolumeUnit のゲッターメソッドです。
     * 
     * @return the totalVolumeUnit
     */
    public String getTotalVolumeUnit() {
        return totalVolumeUnit;
    }

    /**
     * totalVolumeUnit のセッターメソッドです。
     * 
     * @param totalVolumeUnit totalVolumeUnit に設定する
     */
    public void setTotalVolumeUnit(String totalVolumeUnit) {
        this.totalVolumeUnit = totalVolumeUnit;
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

}
