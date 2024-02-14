/*
 * PROJECT：eca0027
 * 
 * TmExpItemNoSpInfo のDomainクラス
 * テーブル概要：TM_EXP_ITEM_NO_SP_INFO
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
 * TmExpItemNoSpInfo のDomainクラスです。<BR>
 * テーブル概要：TM_EXP_ITEM_NO_SP_INFO<BR>
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
public class TmExpItemNoSpInfoDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * CUSTOMER_CD
     */
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;

    /**
     * APLY_STRT_DT
     */
    private Date aplyStrtDt;

    /**
     * ITEM_DESCRIPTION
     */
    private String itemDescription;

    /**
     * SHIPPING_LOT
     */
    private BigDecimal shippingLot;

    /**
     * INVOICE_KEY
     */
    private String invoiceKey;

    /**
     * STG_INSTR_ITEM_FLG
     */
    private String stgInstrItemFlg;

    /**
     * CUSTOM_TIMING_TYP
     */
    private String customTimingTyp;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * LOADING_CD
     */
    private String loadingCd;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * CASEMARK_NOTATION
     */
    private String casemarkNotation;

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
    public TmExpItemNoSpInfoDomain() {
    }

    /**
     * compCd のゲッターメソッドです。
     * 
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * compCd のセッターメソッドです。
     * 
     * @param compCd compCd に設定する
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
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
     * aplyStrtDt のゲッターメソッドです。
     * 
     * @return the aplyStrtDt
     */
    public Date getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * aplyStrtDt のセッターメソッドです。
     * 
     * @param aplyStrtDt aplyStrtDt に設定する
     */
    public void setAplyStrtDt(Date aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * itemDescription のゲッターメソッドです。
     * 
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * itemDescription のセッターメソッドです。
     * 
     * @param itemDescription itemDescription に設定する
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
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
     * stgInstrItemFlg のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlg
     */
    public String getStgInstrItemFlg() {
        return stgInstrItemFlg;
    }

    /**
     * stgInstrItemFlg のセッターメソッドです。
     * 
     * @param stgInstrItemFlg stgInstrItemFlg に設定する
     */
    public void setStgInstrItemFlg(String stgInstrItemFlg) {
        this.stgInstrItemFlg = stgInstrItemFlg;
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
     * loadingCd のゲッターメソッドです。
     * 
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * loadingCd のセッターメソッドです。
     * 
     * @param loadingCd loadingCd に設定する
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
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
     * casemarkNotation のゲッターメソッドです。
     * 
     * @return the casemarkNotation
     */
    public String getCasemarkNotation() {
        return casemarkNotation;
    }

    /**
     * casemarkNotation のセッターメソッドです。
     * 
     * @param casemarkNotation casemarkNotation に設定する
     */
    public void setCasemarkNotation(String casemarkNotation) {
        this.casemarkNotation = casemarkNotation;
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
