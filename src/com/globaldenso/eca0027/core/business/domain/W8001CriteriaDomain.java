/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;


/**
 * The domain class of search condition for the Main Screen of Progress Control.
 * <br />進度管理Main画面の検索条件ドメインです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8001CriteriaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Server ID<br />
     * サーバーID
     */
    private String serverId;

    /**
     * User function use authority<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * Shipper
     */
    private String shipperCd;
    
    /**
     * Consignee
     */
    private String consigneeCd;
    
    /**
     * NEXUS Ship to
     */
    private String shipToCd;
    
    /**
     * Cust. No.
     */
    private String customerCd;
    
    /**
     * Ship to
     */
    private String lgcyShipTo;
    
    /**
     * Trans.
     */
    private String trnsCd;
    
    /**
     * FM) Issue Date
     */
    private String fmExpPackingDt;
    
    /**
     * TO) Issue Date
     */
    private String toExpPackingDt;
    
    /**
     * CML Issuer
     */
    private String expPackingIssuerId;
    
    /**
     * Status
     */
    private String status;
   
    /**
     * CML No.
     */
    private String mainMark;
    
    /**
     * CML TYP
     */
    private String cmlTyp;
    
    /**
     * C/C TYP
     */
    private String customTimingTyp;
    
    /**
     * W/H Com.
     */
    private String curWhCompCd;
    
    /**
     * NEXUS W/H
     */
    private String curWhCd;
    
    /**
     * Radio button selected state<br />
     * ラジオボタン選択状態
     */
    private String selectCondition;
    
    /**
     * Item No.
     */
    private String pltzItemNo;
    
    /**
     * P/O No.
     */
    private String customerPoNo;
    
    /**
     * PKG CD
     */
    private String pkgCd;
    
    /**
     * Ex. Requester
     */
    private String requestIssuerId;
    
    /**
     * Ex. Req. No.
     */
    private String expRequestNo;
    
    /**
     * Return Style CD
     */
    private String returnStyleCd;
    
    /**
     * Container No.
     */
    private String containerNo;
    
    /**
     * Inv. No.
     */
    private String invoiceNo;
    
    /**
     * Inv. Ctg.
     */
    private String invoiceCtgry;
    
    /**
     * FM) ETD
     */
    private String fmEtd;
    
    /**
     * TO) ETD
     */
    private String toEtd;
    
    /**
     * FM) ATD
     */
    private String fmAtd;
    
    /**
     * TO) ATD
     */
    private String toAtd;

    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * PageInfoCreator Object
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W8001CriteriaDomain() {
        super();
    }

    /**
     * Getter method for serverId.
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Setter method for serverId.
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter method for userAuthList.
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for consigneeCd.
     *
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * Setter method for consigneeCd.
     *
     * @param consigneeCd Set for consigneeCd
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
    }

    /**
     * Getter method for shipToCd.
     *
     * @return the shipToCompCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * Setter method for shipToCd.
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
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
     * Getter method for fmExpPackingDt.
     *
     * @return the fmExpPackingDt
     */
    public String getFmExpPackingDt() {
        return fmExpPackingDt;
    }

    /**
     * Setter method for fmExpPackingDt.
     *
     * @param fmExpPackingDt Set for fmExpPackingDt
     */
    public void setFmExpPackingDt(String fmExpPackingDt) {
        this.fmExpPackingDt = fmExpPackingDt;
    }

    /**
     * Getter method for toExpPackingDt.
     *
     * @return the toExpPackingDt
     */
    public String getToExpPackingDt() {
        return toExpPackingDt;
    }

    /**
     * Setter method for toExpPackingDt.
     *
     * @param toExpPackingDt Set for toExpPackingDt
     */
    public void setToExpPackingDt(String toExpPackingDt) {
        this.toExpPackingDt = toExpPackingDt;
    }

    /**
     * Getter method for expPackingIssuerId.
     *
     * @return the expPackingIssuerId
     */
    public String getExpPackingIssuerId() {
        return expPackingIssuerId;
    }

    /**
     * Setter method for expPackingIssuerId.
     *
     * @param expPackingIssuerId Set for expPackingIssuerId
     */
    public void setExpPackingIssuerId(String expPackingIssuerId) {
        this.expPackingIssuerId = expPackingIssuerId;
    }

    /**
     * Getter method for status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param status Set for status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * Getter method for cmlTyp.
     *
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * Setter method for cmlTyp.
     *
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
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
     * Getter method for curWhCompCd.
     *
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }

    /**
     * Setter method for curWhCompCd.
     *
     * @param curWhCompCd Set for curWhCompCd
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }

    /**
     * Getter method for curWhCd.
     *
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * Setter method for curWhCd.
     *
     * @param curWhCd Set for curWhCd
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
    }

    /**
     * Getter method for selectCondition.
     *
     * @return the selectCondition
     */
    public String getSelectCondition() {
        return selectCondition;
    }

    /**
     * Setter method for selectCondition.
     *
     * @param selectCondition Set for selectCondition
     */
    public void setSelectCondition(String selectCondition) {
        this.selectCondition = selectCondition;
    }

    /**
     * Getter method for pltzItemNo.
     *
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * Setter method for pltzItemNo.
     *
     * @param pltzItemNo Set for pltzItemNo
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }

    /**
     * Getter method for customerPoNo.
     *
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * Setter method for customerPoNo.
     *
     * @param customerPoNo Set for customerPoNo
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
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
     * Getter method for requestIssuerId.
     *
     * @return the requestIssuerId
     */
    public String getRequestIssuerId() {
        return requestIssuerId;
    }

    /**
     * Setter method for requestIssuerId.
     *
     * @param requestIssuerId Set for requestIssuerId
     */
    public void setRequestIssuerId(String requestIssuerId) {
        this.requestIssuerId = requestIssuerId;
    }

    /**
     * Getter method for expRequestNo.
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * Setter method for expRequestNo.
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * Getter method for returnStyleCd.
     *
     * @return the returnStyleCd
     */
    public String getReturnStyleCd() {
        return returnStyleCd;
    }

    /**
     * Setter method for returnStyleCd.
     *
     * @param returnStyleCd Set for returnStyleCd
     */
    public void setReturnStyleCd(String returnStyleCd) {
        this.returnStyleCd = returnStyleCd;
    }

    /**
     * Getter method for containerNo.
     *
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }

    /**
     * Setter method for containerNo.
     *
     * @param containerNo Set for containerNo
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    /**
     * Getter method for invoiceNo.
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Setter method for invoiceNo.
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Getter method for invoiceCtgry.
     *
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * Setter method for invoiceCtgry.
     *
     * @param invoiceCtgry Set for invoiceCtgry
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * Getter method for fmEtd.
     *
     * @return the fmEtd
     */
    public String getFmEtd() {
        return fmEtd;
    }

    /**
     * Setter method for fmEtd.
     *
     * @param fmEtd Set for fmEtd
     */
    public void setFmEtd(String fmEtd) {
        this.fmEtd = fmEtd;
    }

    /**
     * Getter method for toEtd.
     *
     * @return the toEtd
     */
    public String getToEtd() {
        return toEtd;
    }

    /**
     * Setter method for toEtd.
     *
     * @param toEtd Set for toEtd
     */
    public void setToEtd(String toEtd) {
        this.toEtd = toEtd;
    }

    /**
     * Getter method for fmAtd.
     *
     * @return the fmAtd
     */
    public String getFmAtd() {
        return fmAtd;
    }

    /**
     * Setter method for fmAtd.
     *
     * @param fmAtd Set for fmAtd
     */
    public void setFmAtd(String fmAtd) {
        this.fmAtd = fmAtd;
    }

    /**
     * Getter method for toAtd.
     *
     * @return the toAtd
     */
    public String getToAtd() {
        return toAtd;
    }

    /**
     * Setter method for toAtd.
     *
     * @param toAtd Set for toAtd
     */
    public void setToAtd(String toAtd) {
        this.toAtd = toAtd;
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
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
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
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

}
