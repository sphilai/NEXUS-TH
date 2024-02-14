/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain that holds the Documentation screen.
 * <br/>通関書類作成業務画面を保持するドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6001DocDomain extends AbstractDomain {
    
    /**
     * Serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    // --- インボイスグループワーク ----------------------------------------------------------------
    /**
     * Shipper Cd
     */
    private String shipperCd;
    
    /**
     * Consignee Cd
     */
    private String consigneeCd;

    /**
     * Ship To Cd
     */
    private String shipToCd;
    
    /**
     * Ship To Comp Cd
     */
    private String shipToCompCd;
    
    /**
     * Customer Cd
     */
    private String customerCd;
    
    /**
     * Lgcy Ship To
     */
    private String lgcyShipTo;
    
    /**
     * Price Terms
     */
    private String priceTerms;
    
    /**
     * Trade Terms
     */
    private String tradeTerms;
    
    /**
     * Terms Point
     */
    private String termsPoint;
    
    /**
     * Freight Responsible Cd
     */
    private String freightResponsibleCd;
    
    /**
     * Pay Terms
     */
    private String payTerms;
    
    /**
     * Pay Meth
     */
    private String payMeth;
    
    /**
     * Trns Cd
     */
    private String trnsCd;
    
    /**
     * Invoice Ctgry
     */
    private String invoiceCtgry;

    /**
     * Inv Curr Cd
     */
    private String currCd;
    
    /**
     * Shipped Dt
     */
    private Date shippedDt;
    
    /**
     * Supplier Invoice No
     */
    private String supplierInvoiceNo;
    
    /**
     *Imp Invoice No 1
     */
    private String impInvoiceNo1;

    /**
     *Imp Invoice No 2
     */
    private String impInvoiceNo2;

    // ---------------------------------------------------------------------------------------------
    /**
     *Doc No
     */
    private String docNo;

    /**
     *Free 1 Disp Flg
     */
    private String free1DispFlg;

    /**
     *Free 2 Disp Flg
     */
    private String free2DispFlg;

    /**
     *Free 3 Disp Flg
     */
    private String free3DispFlg;

    /**
     *Hs Cd Disp Flg
     */
    private String hsCdDispFlg;

    /**
     *Sub Total
     */
    private String subTotal;
    
    /**
     *Free Col Nm1
     */
    private String freeColNm1;
    
    /**
     *Free Col Nm2
     */
    private String freeColNm2;
    
    /**
     *Free Col Nm3
     */
    private String freeColNm3;
    
    // ---------------------------------------------------------------------------------------------
    /**
     * Invoice<br />
     *インボイス
     */
    private List<? extends W6001DocInvoiceDomain> docInvoiceList;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001DocDomain() {
        super();
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
     * @return the shipToCd
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
     * Getter method for shipToCompCd.
     *
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * Setter method for shipToCompCd.
     *
     * @param shipToCompCd Set for shipToCompCd
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
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
     * Getter method for priceTerms.
     *
     * @return the priceTerms
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * Setter method for priceTerms.
     *
     * @param priceTerms Set for priceTerms
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms;
    }

    /**
     * Getter method for tradeTerms.
     *
     * @return the tradeTerms
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * Setter method for tradeTerms.
     *
     * @param tradeTerms Set for tradeTerms
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    /**
     * Getter method for termsPoint.
     *
     * @return the termsPoint
     */
    public String getTermsPoint() {
        return termsPoint;
    }

    /**
     * Setter method for termsPoint.
     *
     * @param termsPoint Set for termsPoint
     */
    public void setTermsPoint(String termsPoint) {
        this.termsPoint = termsPoint;
    }

    /**
     * Getter method for freightResponsibleCd.
     *
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * Setter method for freightResponsibleCd.
     *
     * @param freightResponsibleCd Set for freightResponsibleCd
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
    }

    /**
     * Getter method for payTerms.
     *
     * @return the payTerms
     */
    public String getPayTerms() {
        return payTerms;
    }

    /**
     * Setter method for payTerms.
     *
     * @param payTerms Set for payTerms
     */
    public void setPayTerms(String payTerms) {
        this.payTerms = payTerms;
    }

    /**
     * Getter method for payMeth.
     *
     * @return the payMeth
     */
    public String getPayMeth() {
        return payMeth;
    }

    /**
     * Setter method for payMeth.
     *
     * @param payMeth Set for payMeth
     */
    public void setPayMeth(String payMeth) {
        this.payMeth = payMeth;
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
     * Getter method for currCd.
     *
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * Setter method for currCd.
     *
     * @param currCd Set for currCd
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    /**
     * Getter method for shippedDt.
     *
     * @return the shippedDt
     */
    public Date getShippedDt() {
        return shippedDt;
    }

    /**
     * Setter method for shippedDt.
     *
     * @param shippedDt Set for shippedDt
     */
    public void setShippedDt(Date shippedDt) {
        this.shippedDt = shippedDt;
    }

    /**
     * Getter method for supplierInvoiceNo.
     *
     * @return the supplierInvoiceNo
     */
    public String getSupplierInvoiceNo() {
        return supplierInvoiceNo;
    }

    /**
     * Setter method for supplierInvoiceNo.
     *
     * @param supplierInvoiceNo Set for supplierInvoiceNo
     */
    public void setSupplierInvoiceNo(String supplierInvoiceNo) {
        this.supplierInvoiceNo = supplierInvoiceNo;
    }

    /**
     * Getter method for impInvoiceNo1.
     *
     * @return the impInvoiceNo1
     */
    public String getImpInvoiceNo1() {
        return impInvoiceNo1;
    }

    /**
     * Setter method for impInvoiceNo1.
     *
     * @param impInvoiceNo1 Set for impInvoiceNo1
     */
    public void setImpInvoiceNo1(String impInvoiceNo1) {
        this.impInvoiceNo1 = impInvoiceNo1;
    }

    /**
     * Getter method for impInvoiceNo2.
     *
     * @return the impInvoiceNo2
     */
    public String getImpInvoiceNo2() {
        return impInvoiceNo2;
    }

    /**
     * Setter method for impInvoiceNo2.
     *
     * @param impInvoiceNo2 Set for impInvoiceNo2
     */
    public void setImpInvoiceNo2(String impInvoiceNo2) {
        this.impInvoiceNo2 = impInvoiceNo2;
    }

    /**
     * Getter method for docNo.
     *
     * @return the docNo
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * Setter method for docNo.
     *
     * @param docNo Set for docNo
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    /**
     * Getter method for free1DispFlg.
     *
     * @return the free1DispFlg
     */
    public String getFree1DispFlg() {
        return free1DispFlg;
    }

    /**
     * Setter method for free1DispFlg.
     *
     * @param free1DispFlg Set for free1DispFlg
     */
    public void setFree1DispFlg(String free1DispFlg) {
        this.free1DispFlg = free1DispFlg;
    }

    /**
     * Getter method for free2DispFlg.
     *
     * @return the free2DispFlg
     */
    public String getFree2DispFlg() {
        return free2DispFlg;
    }

    /**
     * Setter method for free2DispFlg.
     *
     * @param free2DispFlg Set for free2DispFlg
     */
    public void setFree2DispFlg(String free2DispFlg) {
        this.free2DispFlg = free2DispFlg;
    }

    /**
     * Getter method for free3DispFlg.
     *
     * @return the free3DispFlg
     */
    public String getFree3DispFlg() {
        return free3DispFlg;
    }

    /**
     * Setter method for free3DispFlg.
     *
     * @param free3DispFlg Set for free3DispFlg
     */
    public void setFree3DispFlg(String free3DispFlg) {
        this.free3DispFlg = free3DispFlg;
    }

    /**
     * Getter method for hsCdDispFlg.
     *
     * @return the hsCdDispFlg
     */
    public String getHsCdDispFlg() {
        return hsCdDispFlg;
    }

    /**
     * Setter method for hsCdDispFlg.
     *
     * @param hsCdDispFlg Set for hsCdDispFlg
     */
    public void setHsCdDispFlg(String hsCdDispFlg) {
        this.hsCdDispFlg = hsCdDispFlg;
    }

    /**
     * Getter method for subTotal.
     *
     * @return the subTotal
     */
    public String getSubTotal() {
        return subTotal;
    }

    /**
     * Setter method for subTotal.
     *
     * @param subTotal Set for subTotal
     */
    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * Getter method for freeColNm1.
     *
     * @return the freeColNm1
     */
    public String getFreeColNm1() {
        return freeColNm1;
    }

    /**
     * Setter method for freeColNm1.
     *
     * @param freeColNm1 Set for freeColNm1
     */
    public void setFreeColNm1(String freeColNm1) {
        this.freeColNm1 = freeColNm1;
    }

    /**
     * Getter method for freeColNm2.
     *
     * @return the freeColNm2
     */
    public String getFreeColNm2() {
        return freeColNm2;
    }

    /**
     * Setter method for freeColNm2.
     *
     * @param freeColNm2 Set for freeColNm2
     */
    public void setFreeColNm2(String freeColNm2) {
        this.freeColNm2 = freeColNm2;
    }

    /**
     * Getter method for freeColNm3.
     *
     * @return the freeColNm3
     */
    public String getFreeColNm3() {
        return freeColNm3;
    }

    /**
     * Setter method for freeColNm3.
     *
     * @param freeColNm3 Set for freeColNm3
     */
    public void setFreeColNm3(String freeColNm3) {
        this.freeColNm3 = freeColNm3;
    }

    /**
     * Getter method for docInvoiceList.
     *
     * @return the docInvoiceList
     */
    public List<? extends W6001DocInvoiceDomain> getDocInvoiceList() {
        return docInvoiceList;
    }

    /**
     * Setter method for docInvoiceList.
     *
     * @param docInvoiceList Set for docInvoiceList
     */
    public void setDocInvoiceList(
        List<? extends W6001DocInvoiceDomain> docInvoiceList) {
        this.docInvoiceList = docInvoiceList;
    }
}
