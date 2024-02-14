/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class that holds the information of Staging Instruction / Staging Actuality corresponding to the Shipping Confirmation
 * <br />出荷確認に対応する荷揃え指示/山作り実績の情報を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5001StgDomain extends AbstractDomain {
    
    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Container loose type.
     */
    private String containerLooseTyp;
    
    /**
     * Staging instruction no.
     */
    private String stgInstrNo;
    
    /**
     * Staging actuality no.
     */
    private String stgActNo;
    
    /**
     * Estimated time of departure.
     */
    private Date etd;
    
    /**
     * Carrier Company code.
     */
    private String carrierCompCd;
    
    /**
     * Package quantity.
     */
    private BigDecimal pkgQty;
    
    /**
     * Gross weight.
     */
    private BigDecimal grossWeight;
    
    /**
     * Weight unit.
     */
    private String weightUnit;
    
    /**
     * Volume.
     */
    private BigDecimal volume;
    
    /**
     * Volume unit.
     */
    private String volumeUnit;
    
    /**
     * constructor.
     */
    public W5001StgDomain() {
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
     * Getter method for stgInstrNo.
     *
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * Setter method for stgInstrNo.
     *
     * @param stgInstrNo Set for stgInstrNo
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * Getter method for stgActNo.
     *
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * Setter method for stgActNo.
     *
     * @param stgActNo Set for stgActNo
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }

    /**
     * Getter method for etd.
     *
     * @return the etd
     */
    public Date getEtd() {
        return etd;
    }

    /**
     * Setter method for etd.
     *
     * @param etd Set for etd
     */
    public void setEtd(Date etd) {
        this.etd = etd;
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
     * Getter method for pkgQty.
     *
     * @return the pkgQty
     */
    public BigDecimal getPkgQty() {
        return pkgQty;
    }

    /**
     * Setter method for pkgQty.
     *
     * @param pkgQty Set for pkgQty
     */
    public void setPkgQty(BigDecimal pkgQty) {
        this.pkgQty = pkgQty;
    }

    /**
     * Getter method for grossWeight.
     *
     * @return the grossWeight
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * Setter method for grossWeight.
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * Getter method for volume.
     *
     * @return the volume
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Setter method for volume.
     *
     * @param volume Set for volume
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * Getter method for volumeUnit.
     *
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * Setter method for volumeUnit.
     *
     * @param volumeUnit Set for volumeUnit
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }
}
