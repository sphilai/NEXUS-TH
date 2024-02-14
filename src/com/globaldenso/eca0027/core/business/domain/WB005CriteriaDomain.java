/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * This is a search-condition domain of ordering search detailed screen.
 * <br />受注検索詳細画面の検索条件ドメインです。
 *
 * @version $Revision: 5759 $
 */
public class WB005CriteriaDomain extends AbstractDomain {

    /**
     * serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * RECEIVE ORDER COMPANY CODE
     * <br />受注会社コード
     */
    private String rcvOdrCompCd;
    
    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;
    
    /**
     * ITEM NO
     * <br />品目番号
     */
    private String itemNo;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCd;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * ORDER QUANTITY
     * <br />注文数量
     */
    private String odrQty;
    
    /**
     * PALLETIZE ALLOC QUANTITY
     * <br />梱包引当数量
     */
    private String pltzAllocQty;
    
    /**
     * SHIPPED QUANTITY
     * <br />出荷数量
     */
    private String shippedQty;
    
    /**
     * COMPANY NAME
     * <br />会社名称
     */
    private String compNm;
    
    /**
     * SHIP TO NAME
     * <br />送荷先名称
     */
    private String shipToNm;
    
    /**
     * ITEM DESCRIPTION
     * <br />品目名称
     */
    private String itemDescription;
    
    /**
     * Date format (for screen display)  
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * PageInfoCreator object
     * <br />PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB005CriteriaDomain() {
    }

    /**
     * Getter method for rcvOdrCompCd.
     *
     * @return the rcvOdrCompCd
     */
    public String getRcvOdrCompCd() {
        return rcvOdrCompCd;
    }

    /**
     * Setter method for rcvOdrCompCd.
     *
     * @param rcvOdrCompCd Set for rcvOdrCompCd
     */
    public void setRcvOdrCompCd(String rcvOdrCompCd) {
        this.rcvOdrCompCd = rcvOdrCompCd;
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
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for odrQty.
     *
     * @return the odrQty
     */
    public String getOdrQty() {
        return odrQty;
    }

    /**
     * Setter method for odrQty.
     *
     * @param odrQty Set for odrQty
     */
    public void setOdrQty(String odrQty) {
        this.odrQty = odrQty;
    }

    /**
     * Getter method for pltzAllocQty.
     *
     * @return the pltzAllocQty
     */
    public String getPltzAllocQty() {
        return pltzAllocQty;
    }

    /**
     * Setter method for pltzAllocQty.
     *
     * @param pltzAllocQty Set for pltzAllocQty
     */
    public void setPltzAllocQty(String pltzAllocQty) {
        this.pltzAllocQty = pltzAllocQty;
    }

    /**
     * Getter method for shippedQty.
     *
     * @return the shippedQty
     */
    public String getShippedQty() {
        return shippedQty;
    }

    /**
     * Setter method for shippedQty.
     *
     * @param shippedQty Set for shippedQty
     */
    public void setShippedQty(String shippedQty) {
        this.shippedQty = shippedQty;
    }

    /**
     * Getter method for compNm.
     *
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * Setter method for compNm.
     *
     * @param compNm Set for compNm
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * Getter method for shipToNm.
     *
     * @return the shipToNm
     */
    public String getShipToNm() {
        return shipToNm;
    }

    /**
     * Setter method for shipToNm.
     *
     * @param shipToNm Set for shipToNm
     */
    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
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
     * Getter method for pageInfoCreator.
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * Setter method for pageInfoCreator.
     *
     * @param pageInfoCreator pageInfoCreator<br />pageInfoCreator に設定する
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

    /**
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat screenDateFormat<br />screenDateFormat に設定する
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }
}
