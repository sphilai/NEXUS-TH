/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain that holds the information of Export Formalities by Item MA screen.
 * <br />Export Formalities by Item MA画面の情報を保持するドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9016ExpShippingItemSpInfoMaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     *COMPANY CODE<br />
     * 会社コード
     */
    private String compCd;

    /**
     *ITEM NO<br />
     * 品目番号
     */
    private String itemNo;

    /**
     *PACKAGE CODE<br />
     * 包装区分
     */
    private String pkgCd;

    /**
     *CUSTOMER CODE<br />
     * 得意先コード
     */
    private String customerCd;

    /**
     *LEGACY SHIP TO<br />
     * LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     *CONTAINER SORTING KEY<br />
     * コンテナ層別キー
     */
    private String containerSortingKey;

    /**
     *STAGING INSTRUCTION ITEM FLAG<br />
     * 荷揃指示品フラグ
     */
    private String stgInstrItemFlg;

    /**
     *CUSTOM TIMING TYPE<br />
     * 通関タイミング区分
     */
    private String customTimingTyp;

    /**
     *INVOICE KEY<br />
     * インボイスキー
     */
    private String invoiceKey;

    /**
     *APPLY START DATE<br />
     * 適用開始日
     */
    private String aplyStrtDt;

    /**
     *ITEM DESCRIPTION<br />
     * 品目名称
     */
    private String itemDescription;

    /**
     *SHIPPING LOT<br />
     * 出荷ロット
     */
    private String shippingLot;

    /**
     *LOADING CODE<br />
     * 荷積位置コード
     */
    private String loadingCd;

    /**
     *CONTAINER LOOSE TYPE<br />
     * コンテナルーズ区分
     */
    private String containerLooseTyp;

    /**
     *CASEMARK NOTATION<br />
     * ケースマーク注意書き
     */
    private String casemarkNotation;

    /**
     *UPDATE TIMESTAMP<br />
     * 更新日時
     */
    private Timestamp comUpdateTimestamp;
    
    /**
     *Exp Shipping Item Sp Info Ma Item Domain List<br />
     * 輸出出荷品目番号原単位リスト
     */
    private List<? extends W9016ExpShippingItemSpInfoMaItemDomain> w9016ExpShippingItemSpInfoMaItemDomain;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9016ExpShippingItemSpInfoMaDomain() {
    }

    /**
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * Getter method for itemNo.
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Setter method for itemNo.
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * Getter method for pkgCd.
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * Setter method for pkgCd.
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * Getter method for customerCd.
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * Getter method for lgcyShipTo.
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for stgInstrItemFlg.
     *
     * @return the stgInstrItemFlg
     */
    public String getStgInstrItemFlg() {
        return stgInstrItemFlg;
    }

    /**
     * Setter method for stgInstrItemFlg.
     *
     * @param stgInstrItemFlg Set for stgInstrItemFlg
     */
    public void setStgInstrItemFlg(String stgInstrItemFlg) {
        this.stgInstrItemFlg = stgInstrItemFlg;
    }

    /**
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * Getter method for invoiceKey.
     *
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * Setter method for invoiceKey.
     *
     * @param invoiceKey Set for invoiceKey
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    /**
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public String getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(String aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * Getter method for itemDescription.
     *
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Setter method for itemDescription.
     *
     * @param itemDescription Set for itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * Getter method for shippingLot.
     *
     * @return the shippingLot
     */
    public String getShippingLot() {
        return shippingLot;
    }

    /**
     * Setter method for shippingLot.
     *
     * @param shippingLot Set for shippingLot
     */
    public void setShippingLot(String shippingLot) {
        this.shippingLot = shippingLot;
    }

    /**
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method for casemarkNotation.
     *
     * @return the casemarkNotation
     */
    public String getCasemarkNotation() {
        return casemarkNotation;
    }

    /**
     * Setter method for casemarkNotation.
     *
     * @param casemarkNotation Set for casemarkNotation
     */
    public void setCasemarkNotation(String casemarkNotation) {
        this.casemarkNotation = casemarkNotation;
    }

    /**
     * Getter method for comUpdateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * Getter method for w9016ExpShippingItemSpInfoMaItemDomain.
     *
     * @return the w9016ExpShippingItemSpInfoMaItemDomain
     */
    public List<? extends W9016ExpShippingItemSpInfoMaItemDomain> getW9016ExpShippingItemSpInfoMaItemDomain() {
        return w9016ExpShippingItemSpInfoMaItemDomain;
    }

    /**
     * Setter method for w9016ExpShippingItemSpInfoMaItemDomain.
     *
     * @param expShippingItemSpInfoMaItemDomain Set for w9016ExpShippingItemSpInfoMaItemDomain
     */
    public void setW9016ExpShippingItemSpInfoMaItemDomain(
        List<? extends W9016ExpShippingItemSpInfoMaItemDomain> expShippingItemSpInfoMaItemDomain) {
        w9016ExpShippingItemSpInfoMaItemDomain = expShippingItemSpInfoMaItemDomain;
    }
}
