/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain class of search condition for the Create Screen of Shipping Actuality.
 * <br />船積実績Create画面の検索条件ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7003CriteriaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Shipper
     */
    private String shipperCd;
    
    /**
     * Consignee
     */
    private String consigneeCd;
    
    /**
     * NEXUS Ship to Com.
     */
    private String shipToCompCd;
    
    /**
     * Trans.
     */
    private String trnsCd;
    
    /**
     * C/L
     */
    private String containerLooseTyp;
    
    /**
     * Carrier
     */
    private String carrierCompCd;
    
    /**
     * Vessel
     */
    private String vessel;

    /**
     * F/R
     */
    private String freightResponsibleCd;
    
    /**
     * FM) ETD
     */
    private String fmEtd;
    
    /**
     * TO) ETD
     */
    private String toEtd;
    
    /**
     * Inv. No.
     */
    private String invoiceNo;
    
    /**
     * Container No.
     */
    private String containerNo;
    
    /**
     * Auto Invoice Register<br />
     * インボイス自動作成フラグ
     */
    private String autoInvoiceRegisterFlg;

    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * PageInfoCreator Object<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7003CriteriaDomain() {
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
     * Getter method for carrierCompCd.
     *
     * @return the carrierCompCd
     */
    public String getCarrierCompCd() {
        return carrierCompCd;
    }

    /**
     * Setter method for carrierCompCd.
     *
     * @param carrierCompCd Set for carrierCompCd
     */
    public void setCarrierCompCd(String carrierCompCd) {
        this.carrierCompCd = carrierCompCd;
    }

    /**
     * Getter method for vessel.
     *
     * @return the vessel
     */
    public String getVessel() {
        return vessel;
    }

    /**
     * Setter method for vessel.
     *
     * @param vessel Set for vessel
     */
    public void setVessel(String vessel) {
        this.vessel = vessel;
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
     * Getter method for autoInvoiceRegisterFlg.
     *
     * @return the autoInvoiceRegisterFlg
     */
    public String getAutoInvoiceRegisterFlg() {
        return autoInvoiceRegisterFlg;
    }

    /**
     * Setter method for autoInvoiceRegisterFlg.
     *
     * @param autoInvoiceRegisterFlg Set for autoInvoiceRegisterFlg
     */
    public void setAutoInvoiceRegisterFlg(String autoInvoiceRegisterFlg) {
        this.autoInvoiceRegisterFlg = autoInvoiceRegisterFlg;
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
