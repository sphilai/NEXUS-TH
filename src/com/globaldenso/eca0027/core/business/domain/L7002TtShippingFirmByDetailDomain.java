/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class that holds the information of the document [L7001].
 * <br/>帳票【L7001】の情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10839 $
 */
public class L7002TtShippingFirmByDetailDomain extends AbstractDomain {
    
    
    /**
     * serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * CONTAINER_NO
     */
    private String containerNo = "";
    
    /**
     * MAIN_MARK
     */
    private String mainMark = "";
    
    /**
     * SHIPPER_CD
     */
    private String shipperCd = "";
    
    /**
     * INVOICE_NO
     */
    private String invoiceNo = "";
    
    /**
     * SITE_TYP
     */
    private String siteTyp = "";
    
    /**
     * VOLUME
     */
    private BigDecimal volume = null;
    
    /**
     * VOLUME_UNIT
     */
    private String volumeUnit = "";
    
    /**
     * BILLD_NO
     */
    private String billdNo = "";
    
    // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//    /**
//     * COMP_CD
//     */
//    private String compCd = "";
    
    /**
     * SHIP_TO_COMP_CD
     */
    private String shipToCompCd = "";

    /**
     * Shipper name abb.<br />
     * 荷主会社名の略称
     */
    private String shipperNmAbb = null;

    /**
     * Ship To Company name abb.
     * 送荷先会社名の略称
     */
    private String shipToCompNmAbb = null;
    // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
    
    /**
     * Default Constructor
     */
    public L7002TtShippingFirmByDetailDomain() {
    }
    
    /**
     * Getter method for containerNo
     *
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }

    /**
     * Setter method for containerNo
     *
     * @param containerNo Set for containerNo
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    /**
     * Getter method for mainMark
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * Getter method for shipperCd
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for invoiceNo
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Setter method for invoiceNo
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Getter method for siteTyp
     *
     * @return the siteTyp
     */
    public String getSiteTyp() {
        return siteTyp;
    }

    /**
     * Setter method for siteTyp
     *
     * @param siteTyp Set for siteTyp
     */
    public void setSiteTyp(String siteTyp) {
        this.siteTyp = siteTyp;
    }

    /**
     * Getter method for volume
     *
     * @return the volume
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Setter method for volume
     *
     * @param volume Set for volume
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * Getter method for volumeUnit
     *
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * Setter method for volumeUnit
     *
     * @param volumeUnit Set for volumeUnit
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    /**
     * Getter method for billdNo
     *
     * @return the billdNo
     */
    public String getBilldNo() {
        return billdNo;
    }

    /**
     * Setter method for billdNo
     *
     * @param billdNo Set for billdNo
     */
    public void setBilldNo(String billdNo) {
        this.billdNo = billdNo;
    }

    // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
//  /**
//   * Getter method for compCd
//   *
//   * @return the compCd
//   */
//  public String getCompCd() {
//      return compCd;
//  }
//
//  /**
//   * Setter method for compCd
//   *
//   * @param compCd Set for compCd
//   */
//  public void setCompCd(String compCd) {
//      this.compCd = compCd;
//  }
  
    /**
     * <p>Getter method for shipToCompCd.</p>
     *
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * <p>Setter method for shipToCompCd.</p>
     *
     * @param shipToCompCd Set for shipToCompCd
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
    }

    /**
     * <p>Getter method for shipperNmAbb.</p>
     *
     * @return the shipperNmAbb
     */
    public String getShipperNmAbb() {
        return shipperNmAbb;
    }

    /**
     * <p>Setter method for shipperNmAbb.</p>
     *
     * @param shipperNmAbb Set for shipperNmAbb
     */
    public void setShipperNmAbb(String shipperNmAbb) {
        this.shipperNmAbb = shipperNmAbb;
    }

    /**
     * <p>Getter method for shipToCompNmAbb.</p>
     *
     * @return the shipToCompNmAbb
     */
    public String getShipToCompNmAbb() {
        return shipToCompNmAbb;
    }

    /**
     * <p>Setter method for shipToCompNmAbb.</p>
     *
     * @param shipToCompNmAbb Set for shipToCompNmAbb
     */
    public void setShipToCompNmAbb(String shipToCompNmAbb) {
        this.shipToCompNmAbb = shipToCompNmAbb;
    }
    // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<

}
