/*
 * PROJECT：eca0027
 * 
 * TwInvPltz のDomainクラス
 * テーブル概要：TW_INV_PLTZ
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

/**
 * TwInvPltz のDomainクラスです。<BR>
 * テーブル概要：TW_INV_PLTZ<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 10:26:05<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TwInvPltzDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;

    /**
     * MAIN_MARK
     */
    private String mainMark;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * SHIPPER_COMP_NM_ABB
     */
    private String shipperCompNmAbb;

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
     * SHIP_TO_TEL
     */
    private String shipToTel;

    /**
     * SHIP_TO_COMP_CD
     */
    private String shipToCompCd;

    /**
     * CUSTOMER_CD
     */
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;

    /**
     * PRICE_TERMS
     */
    private String priceTerms;

    /**
     * TRADE_TERMS
     */
    private String tradeTerms;

    /**
     * TERMS_POINT
     */
    private String termsPoint;

    /**
     * DLIV_POINT
     */
    private String dlivPoint;

    /**
     * FREIGHT_RESPONSIBLE_CD
     */
    private String freightResponsibleCd;

    /**
     * PAY_TERMS
     */
    private String payTerms;

    /**
     * PAY_METH
     */
    private String payMeth;

    /**
     * REM_BANK_NM
     */
    private String remBankNm;

    /**
     * REM_BANK_ADDR_1
     */
    private String remBankAddr1;

    /**
     * REM_BANK_ADDR_2
     */
    private String remBankAddr2;

    /**
     * REM_BANK_ADDR_3
     */
    private String remBankAddr3;

    /**
     * REM_BANK_ACCOUNT_NO
     */
    private String remBankAccountNo;

    /**
     * VAT_RATIO
     */
    private BigDecimal vatRatio;

    /**
     * CURR_CD
     */
    private String currCd;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * TRNS_CD_ORG
     */
    private String trnsCdOrg;

    /**
     * INVOICE_KEY
     */
    private String invoiceKey;

    /**
     * INVOICE_CTGRY
     */
    private String invoiceCtgry;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * RETURN_STYLE_CD
     */
    private String returnStyleCd;

    /**
     * CUSTOM_TIMING_TYP
     */
    private String customTimingTyp;

    /**
     * CML_TYP
     */
    private String cmlTyp;

    /**
     * DNGR_ITEM_FLG
     */
    private String dngrItemFlg;

    /**
     * EXP_LIMIT_FLG
     */
    private String expLimitFlg;

    /**
     * RE_EXP_GOODS_FLG
     */
    private String reExpGoodsFlg;

    /**
     * RT_USE_FLG
     */
    private String rtUseFlg;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * NET_WEIGHT
     */
    private BigDecimal netWeight;

    /**
     * GROSS_WEIGHT
     */
    private BigDecimal grossWeight;

    /**
     * VOLUME_UNIT
     */
    private String volumeUnit;

    /**
     * VOLUME
     */
    private BigDecimal volume;

    /**
     * CUR_WH_COMP_CD
     */
    private String curWhCompCd;

    /**
     * CUR_WH_CD
     */
    private String curWhCd;

    /**
     * STG_INSTR_NO
     */
    private String stgInstrNo;

    /**
     * STG_ACT_NO
     */
    private String stgActNo;

    /**
     * SHIPPING_FIRM_NO
     */
    private String shippingFirmNo;

    /**
     * SUPPLIER_INVOICE_NO
     */
    private String supplierInvoiceNo;

    /**
     * IMP_INVOICE_NO_1
     */
    private String impInvoiceNo1;

    /**
     * IMP_INVOICE_NO_2
     */
    private String impInvoiceNo2;

    /**
     * PLTZ_STATUS
     */
    private String pltzStatus;

    /**
     * SPLIT_SHIPPING_NG_FLG
     */
    private String splitShippingNgFlg;

    /**
     * MIGRATION_FLG
     */
    private String migrationFlg;

    /**
     * CONTAINER_NO
     */
    private String containerNo;

    /**
     * CARRIER_COMP_CD
     */
    private String carrierCompCd;

    /**
     * CARRIER_COMP_NM_ABB
     */
    private String carrierCompNmAbb;

    /**
     * FORWARDER_COMP_CD
     */
    private String forwarderCompCd;

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
     * VESSEL
     */
    private String vessel;

    /**
     * ETD
     */
    private Date etd;

    /**
     * ETA
     */
    private Date eta;

    /**
     * ARRIVAL_TIME
     */
    private String arrivalTime;

    /**
     * GRP_NO_1
     */
    private String grpNo1;

    /**
     * REMOVE_FLG
     */
    private String removeFlg;

    /**
     * DECISION_FLG
     */
    private String decisionFlg;

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
    public TwInvPltzDomain() {
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
     * shipToTel のゲッターメソッドです。
     * 
     * @return the shipToTel
     */
    public String getShipToTel() {
        return shipToTel;
    }

    /**
     * shipToTel のセッターメソッドです。
     * 
     * @param shipToTel shipToTel に設定する
     */
    public void setShipToTel(String shipToTel) {
        this.shipToTel = shipToTel;
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
     * priceTerms のゲッターメソッドです。
     * 
     * @return the priceTerms
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * priceTerms のセッターメソッドです。
     * 
     * @param priceTerms priceTerms に設定する
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms;
    }

    /**
     * tradeTerms のゲッターメソッドです。
     * 
     * @return the tradeTerms
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * tradeTerms のセッターメソッドです。
     * 
     * @param tradeTerms tradeTerms に設定する
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    /**
     * termsPoint のゲッターメソッドです。
     * 
     * @return the termsPoint
     */
    public String getTermsPoint() {
        return termsPoint;
    }

    /**
     * termsPoint のセッターメソッドです。
     * 
     * @param termsPoint termsPoint に設定する
     */
    public void setTermsPoint(String termsPoint) {
        this.termsPoint = termsPoint;
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
     * payTerms のゲッターメソッドです。
     * 
     * @return the payTerms
     */
    public String getPayTerms() {
        return payTerms;
    }

    /**
     * payTerms のセッターメソッドです。
     * 
     * @param payTerms payTerms に設定する
     */
    public void setPayTerms(String payTerms) {
        this.payTerms = payTerms;
    }

    /**
     * payMeth のゲッターメソッドです。
     * 
     * @return the payMeth
     */
    public String getPayMeth() {
        return payMeth;
    }

    /**
     * payMeth のセッターメソッドです。
     * 
     * @param payMeth payMeth に設定する
     */
    public void setPayMeth(String payMeth) {
        this.payMeth = payMeth;
    }

    /**
     * remBankNm のゲッターメソッドです。
     * 
     * @return the remBankNm
     */
    public String getRemBankNm() {
        return remBankNm;
    }

    /**
     * remBankNm のセッターメソッドです。
     * 
     * @param remBankNm remBankNm に設定する
     */
    public void setRemBankNm(String remBankNm) {
        this.remBankNm = remBankNm;
    }

    /**
     * remBankAddr1 のゲッターメソッドです。
     * 
     * @return the remBankAddr1
     */
    public String getRemBankAddr1() {
        return remBankAddr1;
    }

    /**
     * remBankAddr1 のセッターメソッドです。
     * 
     * @param remBankAddr1 remBankAddr1 に設定する
     */
    public void setRemBankAddr1(String remBankAddr1) {
        this.remBankAddr1 = remBankAddr1;
    }

    /**
     * remBankAddr2 のゲッターメソッドです。
     * 
     * @return the remBankAddr2
     */
    public String getRemBankAddr2() {
        return remBankAddr2;
    }

    /**
     * remBankAddr2 のセッターメソッドです。
     * 
     * @param remBankAddr2 remBankAddr2 に設定する
     */
    public void setRemBankAddr2(String remBankAddr2) {
        this.remBankAddr2 = remBankAddr2;
    }

    /**
     * remBankAddr3 のゲッターメソッドです。
     * 
     * @return the remBankAddr3
     */
    public String getRemBankAddr3() {
        return remBankAddr3;
    }

    /**
     * remBankAddr3 のセッターメソッドです。
     * 
     * @param remBankAddr3 remBankAddr3 に設定する
     */
    public void setRemBankAddr3(String remBankAddr3) {
        this.remBankAddr3 = remBankAddr3;
    }

    /**
     * remBankAccountNo のゲッターメソッドです。
     * 
     * @return the remBankAccountNo
     */
    public String getRemBankAccountNo() {
        return remBankAccountNo;
    }

    /**
     * remBankAccountNo のセッターメソッドです。
     * 
     * @param remBankAccountNo remBankAccountNo に設定する
     */
    public void setRemBankAccountNo(String remBankAccountNo) {
        this.remBankAccountNo = remBankAccountNo;
    }

    /**
     * vatRatio のゲッターメソッドです。
     * 
     * @return the vatRatio
     */
    public BigDecimal getVatRatio() {
        return vatRatio;
    }

    /**
     * vatRatio のセッターメソッドです。
     * 
     * @param vatRatio vatRatio に設定する
     */
    public void setVatRatio(BigDecimal vatRatio) {
        this.vatRatio = vatRatio;
    }

    /**
     * currCd のゲッターメソッドです。
     * 
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * currCd のセッターメソッドです。
     * 
     * @param currCd currCd に設定する
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
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
     * trnsCdOrg のゲッターメソッドです。
     * 
     * @return the trnsCdOrg
     */
    public String getTrnsCdOrg() {
        return trnsCdOrg;
    }

    /**
     * trnsCdOrg のセッターメソッドです。
     * 
     * @param trnsCdOrg trnsCdOrg に設定する
     */
    public void setTrnsCdOrg(String trnsCdOrg) {
        this.trnsCdOrg = trnsCdOrg;
    }

    /**
     * invoiceKey のゲッターメソッドです。
     * 
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * invoiceKey のセッターメソッドです。
     * 
     * @param invoiceKey invoiceKey に設定する
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
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
     * containerSortingKey のゲッターメソッドです。
     * 
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * containerSortingKey のセッターメソッドです。
     * 
     * @param containerSortingKey containerSortingKey に設定する
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
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
     * returnStyleCd のゲッターメソッドです。
     * 
     * @return the returnStyleCd
     */
    public String getReturnStyleCd() {
        return returnStyleCd;
    }

    /**
     * returnStyleCd のセッターメソッドです。
     * 
     * @param returnStyleCd returnStyleCd に設定する
     */
    public void setReturnStyleCd(String returnStyleCd) {
        this.returnStyleCd = returnStyleCd;
    }

    /**
     * customTimingTyp のゲッターメソッドです。
     * 
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * customTimingTyp のセッターメソッドです。
     * 
     * @param customTimingTyp customTimingTyp に設定する
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * cmlTyp のゲッターメソッドです。
     * 
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * cmlTyp のセッターメソッドです。
     * 
     * @param cmlTyp cmlTyp に設定する
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * dngrItemFlg のゲッターメソッドです。
     * 
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * dngrItemFlg のセッターメソッドです。
     * 
     * @param dngrItemFlg dngrItemFlg に設定する
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * expLimitFlg のゲッターメソッドです。
     * 
     * @return the expLimitFlg
     */
    public String getExpLimitFlg() {
        return expLimitFlg;
    }

    /**
     * expLimitFlg のセッターメソッドです。
     * 
     * @param expLimitFlg expLimitFlg に設定する
     */
    public void setExpLimitFlg(String expLimitFlg) {
        this.expLimitFlg = expLimitFlg;
    }

    /**
     * reExpGoodsFlg のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlg
     */
    public String getReExpGoodsFlg() {
        return reExpGoodsFlg;
    }

    /**
     * reExpGoodsFlg のセッターメソッドです。
     * 
     * @param reExpGoodsFlg reExpGoodsFlg に設定する
     */
    public void setReExpGoodsFlg(String reExpGoodsFlg) {
        this.reExpGoodsFlg = reExpGoodsFlg;
    }

    /**
     * rtUseFlg のゲッターメソッドです。
     * 
     * @return the rtUseFlg
     */
    public String getRtUseFlg() {
        return rtUseFlg;
    }

    /**
     * rtUseFlg のセッターメソッドです。
     * 
     * @param rtUseFlg rtUseFlg に設定する
     */
    public void setRtUseFlg(String rtUseFlg) {
        this.rtUseFlg = rtUseFlg;
    }

    /**
     * weightUnit のゲッターメソッドです。
     * 
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * weightUnit のセッターメソッドです。
     * 
     * @param weightUnit weightUnit に設定する
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * netWeight のゲッターメソッドです。
     * 
     * @return the netWeight
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * netWeight のセッターメソッドです。
     * 
     * @param netWeight netWeight に設定する
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * grossWeight のゲッターメソッドです。
     * 
     * @return the grossWeight
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * grossWeight のセッターメソッドです。
     * 
     * @param grossWeight grossWeight に設定する
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * volumeUnit のゲッターメソッドです。
     * 
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * volumeUnit のセッターメソッドです。
     * 
     * @param volumeUnit volumeUnit に設定する
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    /**
     * volume のゲッターメソッドです。
     * 
     * @return the volume
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * volume のセッターメソッドです。
     * 
     * @param volume volume に設定する
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * curWhCompCd のゲッターメソッドです。
     * 
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }

    /**
     * curWhCompCd のセッターメソッドです。
     * 
     * @param curWhCompCd curWhCompCd に設定する
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }

    /**
     * curWhCd のゲッターメソッドです。
     * 
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * curWhCd のセッターメソッドです。
     * 
     * @param curWhCd curWhCd に設定する
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
    }

    /**
     * stgInstrNo のゲッターメソッドです。
     * 
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * stgInstrNo のセッターメソッドです。
     * 
     * @param stgInstrNo stgInstrNo に設定する
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * stgActNo のゲッターメソッドです。
     * 
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * stgActNo のセッターメソッドです。
     * 
     * @param stgActNo stgActNo に設定する
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }

    /**
     * shippingFirmNo のゲッターメソッドです。
     * 
     * @return the shippingFirmNo
     */
    public String getShippingFirmNo() {
        return shippingFirmNo;
    }

    /**
     * shippingFirmNo のセッターメソッドです。
     * 
     * @param shippingFirmNo shippingFirmNo に設定する
     */
    public void setShippingFirmNo(String shippingFirmNo) {
        this.shippingFirmNo = shippingFirmNo;
    }

    /**
     * supplierInvoiceNo のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNo
     */
    public String getSupplierInvoiceNo() {
        return supplierInvoiceNo;
    }

    /**
     * supplierInvoiceNo のセッターメソッドです。
     * 
     * @param supplierInvoiceNo supplierInvoiceNo に設定する
     */
    public void setSupplierInvoiceNo(String supplierInvoiceNo) {
        this.supplierInvoiceNo = supplierInvoiceNo;
    }

    /**
     * impInvoiceNo1 のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1
     */
    public String getImpInvoiceNo1() {
        return impInvoiceNo1;
    }

    /**
     * impInvoiceNo1 のセッターメソッドです。
     * 
     * @param impInvoiceNo1 impInvoiceNo1 に設定する
     */
    public void setImpInvoiceNo1(String impInvoiceNo1) {
        this.impInvoiceNo1 = impInvoiceNo1;
    }

    /**
     * impInvoiceNo2 のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2
     */
    public String getImpInvoiceNo2() {
        return impInvoiceNo2;
    }

    /**
     * impInvoiceNo2 のセッターメソッドです。
     * 
     * @param impInvoiceNo2 impInvoiceNo2 に設定する
     */
    public void setImpInvoiceNo2(String impInvoiceNo2) {
        this.impInvoiceNo2 = impInvoiceNo2;
    }

    /**
     * pltzStatus のゲッターメソッドです。
     * 
     * @return the pltzStatus
     */
    public String getPltzStatus() {
        return pltzStatus;
    }

    /**
     * pltzStatus のセッターメソッドです。
     * 
     * @param pltzStatus pltzStatus に設定する
     */
    public void setPltzStatus(String pltzStatus) {
        this.pltzStatus = pltzStatus;
    }

    /**
     * splitShippingNgFlg のゲッターメソッドです。
     * 
     * @return the splitShippingNgFlg
     */
    public String getSplitShippingNgFlg() {
        return splitShippingNgFlg;
    }

    /**
     * splitShippingNgFlg のセッターメソッドです。
     * 
     * @param splitShippingNgFlg splitShippingNgFlg に設定する
     */
    public void setSplitShippingNgFlg(String splitShippingNgFlg) {
        this.splitShippingNgFlg = splitShippingNgFlg;
    }

    /**
     * migrationFlg のゲッターメソッドです。
     * 
     * @return the migrationFlg
     */
    public String getMigrationFlg() {
        return migrationFlg;
    }

    /**
     * migrationFlg のセッターメソッドです。
     * 
     * @param migrationFlg migrationFlg に設定する
     */
    public void setMigrationFlg(String migrationFlg) {
        this.migrationFlg = migrationFlg;
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
     * forwarderCompCd のゲッターメソッドです。
     * 
     * @return the forwarderCompCd
     */
    public String getForwarderCompCd() {
        return forwarderCompCd;
    }

    /**
     * forwarderCompCd のセッターメソッドです。
     * 
     * @param forwarderCompCd forwarderCompCd に設定する
     */
    public void setForwarderCompCd(String forwarderCompCd) {
        this.forwarderCompCd = forwarderCompCd;
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
     * arrivalTime のゲッターメソッドです。
     * 
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * arrivalTime のセッターメソッドです。
     * 
     * @param arrivalTime arrivalTime に設定する
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * grpNo1 のゲッターメソッドです。
     * 
     * @return the grpNo1
     */
    public String getGrpNo1() {
        return grpNo1;
    }

    /**
     * grpNo1 のセッターメソッドです。
     * 
     * @param grpNo1 grpNo1 に設定する
     */
    public void setGrpNo1(String grpNo1) {
        this.grpNo1 = grpNo1;
    }

    /**
     * removeFlg のゲッターメソッドです。
     * 
     * @return the removeFlg
     */
    public String getRemoveFlg() {
        return removeFlg;
    }

    /**
     * removeFlg のセッターメソッドです。
     * 
     * @param removeFlg removeFlg に設定する
     */
    public void setRemoveFlg(String removeFlg) {
        this.removeFlg = removeFlg;
    }

    /**
     * decisionFlg のゲッターメソッドです。
     * 
     * @return the decisionFlg
     */
    public String getDecisionFlg() {
        return decisionFlg;
    }

    /**
     * decisionFlg のセッターメソッドです。
     * 
     * @param decisionFlg decisionFlg に設定する
     */
    public void setDecisionFlg(String decisionFlg) {
        this.decisionFlg = decisionFlg;
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
