/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a parameter domain of ECA0027_WS_2508.
 * <br />ECA0027_WS_2508のパラメータドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class Ws2508MixTagRootCriteriaDomain extends AbstractDomain {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;
    
    /**
     * SHIPPER_CD
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * CUSTOMER_CD
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * LGCY_SHIP_TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;
    
    /**
     * TRNS_CD
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    private String lgcyWhCd;
    
    /**
     * WAREHOUSE COMPANY CODE
     * <br />倉庫会社コード
     */
    private String whCompCd;
    
    /**
     * WAREHOUSE CODE
     * <br />倉庫コード
     */
    private String whCd;
    
    /**
     * NEXUS W/H flag
     * <br />NEXUS倉庫フラグ
     */
    private String nxsStockFlg;
    
    /**
     * Box No
     */
    private String boxNo;
    
    /**
     * ITEM NO LIST
     * <br />かんばん情報リスト
     */
    @XmlElementWrapper
    @XmlElement(name = "itemNo")
    private List<? extends Ws2508ItemNoCriteriaDomain> itemNoCriteriaList;
    
    /**
     * PACKAGE ITEM NO LIST
     * <br />包装材品目番号リスト
     */
    @XmlElementWrapper
    @XmlElement(name = "pkgItemNo")
    private List<? extends Ws2508PkgItemNoCriteriaDomain> pkgItemNoCriteriaList;
    
    /**
     * BUSINESS START TIME
     * <br />業務開始時間
     */
    private String businessStartTime;
    
    /**
     * BUSINESS END TIME
     * <br />業務終了時間
     */
    private String businessEndTime;
    
    /**
     * PRODUCTIVITY DATA INFOMATION LIST
     * <br />生産性データ情報リスト
     */
    @XmlElementWrapper
    @XmlElement(name = "productivityDataInfo")
    private List<? extends Ws2508ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2508MixTagRootCriteriaDomain() {
    }

    /**
     * Getter method for pltzInstrNo.
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo.
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
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
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for lgcyWhCd.
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * Setter method for lgcyWhCd.
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * Getter method for whCompCd.
     *
     * @return the whCompCd
     */
    public String getWhCompCd() {
        return whCompCd;
    }

    /**
     * Setter method for whCompCd.
     *
     * @param whCompCd Set for whCompCd
     */
    public void setWhCompCd(String whCompCd) {
        this.whCompCd = whCompCd;
    }

    /**
     * Getter method for whCd.
     *
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * Setter method for whCd.
     *
     * @param whCd Set for whCd
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    /**
     * Getter method for nxsStockFlg.
     *
     * @return the nxsStockFlg
     */
    public String getNxsStockFlg() {
        return nxsStockFlg;
    }

    /**
     * Setter method for nxsStockFlg.
     *
     * @param nxsStockFlg Set for nxsStockFlg
     */
    public void setNxsStockFlg(String nxsStockFlg) {
        this.nxsStockFlg = nxsStockFlg;
    }

    /**
     * Getter method for boxNo.
     *
     * @return the boxNo
     */
    public String getBoxNo() {
        return boxNo;
    }

    /**
     * Setter method for boxNo.
     *
     * @param boxNo Set for boxNo
     */
    public void setBoxNo(String boxNo) {
        this.boxNo = boxNo;
    }

    /**
     * Getter method for itemNoCriteriaList.
     *
     * @return the itemNoCriteriaList
     */
    public List<? extends Ws2508ItemNoCriteriaDomain> getItemNoCriteriaList() {
        return itemNoCriteriaList;
    }

    /**
     * Setter method for itemNoCriteriaList.
     *
     * @param itemNoCriteriaList Set for itemNoCriteriaList
     */
    public void setItemNoCriteriaList(
        List<? extends Ws2508ItemNoCriteriaDomain> itemNoCriteriaList) {
        this.itemNoCriteriaList = itemNoCriteriaList;
    }

    /**
     * Getter method for pkgItemNoCriteriaList.
     *
     * @return the pkgItemNoCriteriaList
     */
    public List<? extends Ws2508PkgItemNoCriteriaDomain> getPkgItemNoCriteriaList() {
        return pkgItemNoCriteriaList;
    }

    /**
     * Setter method for pkgItemNoCriteriaList.
     *
     * @param pkgItemNoCriteriaList Set for pkgItemNoCriteriaList
     */
    public void setPkgItemNoCriteriaList(
        List<? extends Ws2508PkgItemNoCriteriaDomain> pkgItemNoCriteriaList) {
        this.pkgItemNoCriteriaList = pkgItemNoCriteriaList;
    }

    /**
     * Getter method for businessStartTime.
     *
     * @return the businessStartTime
     */
    public String getBusinessStartTime() {
        return businessStartTime;
    }

    /**
     * Setter method for businessStartTime.
     *
     * @param businessStartTime Set for businessStartTime
     */
    public void setBusinessStartTime(String businessStartTime) {
        this.businessStartTime = businessStartTime;
    }

    /**
     * Getter method for businessEndTime.
     *
     * @return the businessEndTime
     */
    public String getBusinessEndTime() {
        return businessEndTime;
    }

    /**
     * Setter method for businessEndTime.
     *
     * @param businessEndTime Set for businessEndTime
     */
    public void setBusinessEndTime(String businessEndTime) {
        this.businessEndTime = businessEndTime;
    }

    /**
     * Getter method for productivityDataInfoCriteriaList.
     *
     * @return the productivityDataInfoCriteriaList
     */
    public List<? extends Ws2508ProductivityDataInfoCriteriaDomain> getProductivityDataInfoCriteriaList() {
        return productivityDataInfoCriteriaList;
    }

    /**
     * Setter method for productivityDataInfoCriteriaList.
     *
     * @param productivityDataInfoCriteriaList Set for productivityDataInfoCriteriaList
     */
    public void setProductivityDataInfoCriteriaList(
        List<? extends Ws2508ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList) {
        this.productivityDataInfoCriteriaList = productivityDataInfoCriteriaList;
    }


}
