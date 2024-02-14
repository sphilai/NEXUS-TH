/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.Date;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the search condition of Export-Receive-Order-information
 * <br />輸出受注の検索条件を保持するドメインです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2001PltzInstrItemCriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC-ID
     * <br />DSC-ID
     */
    private String dscId;
    
    /**
     * SHIPPER CD
     * <br />荷主コード
     */
    private String shipperCd;
    
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
     * TRANSPORT CODE
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
     * PALLETIZE INSTRUCTION DATE
     * <br />梱包指示日
     */
    private Date pltzInstrDt;
    
    /**
     * CUSTOMER PO NO
     * <br />得意先PO NO
     */
    private String customerPoNo;
    
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
     * Operating days
     * <br />稼働日
     */
    private List<Date> workingDayList;
    
    /**
     * Beginning-of-mission day (time zone converted date of Shipper)
     * <br />運用開始日 (Shipperのタイムゾーン変換日付)
     */
    private Date aplyStrtDt;
    
    /**
     * P/O Due Date(From)
     * <br />船積期限日(From)
     */
    private Date poDueDtFrom;
    
    /**
     * P/O Due Date(To)
     * <br />船積期限日(To)
     */
    private Date poDueDtTo;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2001PltzInstrItemCriteriaDomain() {
        super();
    }

    /**
     * Getter method for dscId.
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * Setter method for dscId.
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
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
     * Getter method for pltzInstrDt.
     *
     * @return the pltzInstrDt
     */
    public Date getPltzInstrDt() {
        return pltzInstrDt;
    }

    /**
     * Setter method for pltzInstrDt.
     *
     * @param pltzInstrDt Set for pltzInstrDt
     */
    public void setPltzInstrDt(Date pltzInstrDt) {
        this.pltzInstrDt = pltzInstrDt;
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
     * Getter method for workingDayList.
     *
     * @return the workingDayList
     */
    public List<Date> getWorkingDayList() {
        return workingDayList;
    }

    /**
     * Setter method for workingDayList.
     *
     * @param workingDayList Set for workingDayList
     */
    public void setWorkingDayList(List<Date> workingDayList) {
        this.workingDayList = workingDayList;
    }

    /**
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public Date getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(Date aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * <p>poDueDtFrom のゲッターメソッドです。</p>
     *
     * @return the poDueDtFrom
     */
    public Date getPoDueDtFrom() {
        return poDueDtFrom;
    }

    /**
     * <p>poDueDtFrom のセッターメソッドです。</p>
     *
     * @param poDueDtFrom poDueDtFrom に設定する
     */
    public void setPoDueDtFrom(Date poDueDtFrom) {
        this.poDueDtFrom = poDueDtFrom;
    }

    /**
     * <p>poDueDtTo のゲッターメソッドです。</p>
     *
     * @return the poDueDtTo
     */
    public Date getPoDueDtTo() {
        return poDueDtTo;
    }

    /**
     * <p>poDueDtTo のセッターメソッドです。</p>
     *
     * @param poDueDtTo poDueDtTo に設定する
     */
    public void setPoDueDtTo(Date poDueDtTo) {
        this.poDueDtTo = poDueDtTo;
    }

}
