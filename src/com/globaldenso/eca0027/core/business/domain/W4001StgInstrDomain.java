/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the information of the Staging Instruction
 * <br />荷揃え指示の情報を保持するドメインクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4746 $
 */
public class W4001StgInstrDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * W/H company code.
     */
    private String whCompCd;

    /**
     * W/H code.
     */
    private String whCd;

    /**
     * Transportation code.
     */
    private String trnsCd;

    /**
     * Container sorting key.
     */
    private String containerSortingKey;

    /**
     * Container loose type.
     */
    private String containerLooseTyp;

    /**
     * Custom timing type.
     */
    private String customTimingTyp;

    /**
     * Shipper code.
     */
    private String shipperCd;

    /**
     * Staging instruction no.
     */
    private String stgInstrNo;

    /**
     * Staging instruction status.
     */
    private String stgInstrStatus;

    /**
     * ETD.
     */
    private Date etd;

    /**
     * Worked issuer ID.
     */
    private String workedId;

    /**
     * Staging instruction date.
     */
    private Date stgInstrDt;

    /**
     * Worked date.
     */
    private Date workedDt;

    /**
     * Worked method value.
     */
    private String workedMethValue;

    /**
     * Staging instruction issuer ID.
     */
    private String stgInstrIssuerId;

    /**
     * Staging instruction issuer name.
     */
    private String stgInstrIssuerNm;

    /**
     * Package QTY.
     */
    private Integer pkgQty;

    /**
     * Gross weight.
     */
    private BigDecimal grossWeight;

    /**
     * Weight unit.
     */
    private String weightUnit;

    /**
     * Weight unit display.
     */
    private String weightUnitDisp;

    /**
     * Volume.
     */
    private BigDecimal volume;

    /**
     * Volume unit.
     */
    private String volumeUnit;

    /**
     * Volume unit display.
     */
    private String volumeUnitDisp;

    /**
     * Worked issuer name.
     */
    private String workedIssuerNm;

    /**
     * Carrier company code.
     */
    private String carrierCompCd;

    /**
     * Palletize domain list.
     */
    private List<? extends W4001PltzDomain> pltzDomainList;

    /**
     * Constructor.
     */
    public W4001StgInstrDomain() {
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
     * Getter method for stgInstrStatus.
     *
     * @return the stgInstrStatus
     */
    public String getStgInstrStatus() {
        return stgInstrStatus;
    }

    /**
     * Setter method for stgInstrStatus.
     *
     * @param stgInstrStatus Set for stgInstrStatus
     */
    public void setStgInstrStatus(String stgInstrStatus) {
        this.stgInstrStatus = stgInstrStatus;
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
     * Getter method for workedId.
     *
     * @return the workedId
     */
    public String getWorkedId() {
        return workedId;
    }

    /**
     * Setter method for workedId.
     *
     * @param workedId Set for workedId
     */
    public void setWorkedId(String workedId) {
        this.workedId = workedId;
    }

    /**
     * Getter method for stgInstrDt.
     *
     * @return the stgInstrDt
     */
    public Date getStgInstrDt() {
        return stgInstrDt;
    }

    /**
     * Setter method for stgInstrDt.
     *
     * @param stgInstrDt Set for stgInstrDt
     */
    public void setStgInstrDt(Date stgInstrDt) {
        this.stgInstrDt = stgInstrDt;
    }

    /**
     * Getter method for workedDt.
     *
     * @return the workedDt
     */
    public Date getWorkedDt() {
        return workedDt;
    }

    /**
     * Setter method for workedDt.
     *
     * @param workedDt Set for workedDt
     */
    public void setWorkedDt(Date workedDt) {
        this.workedDt = workedDt;
    }

    /**
     * Getter method for workedMethValue.
     *
     * @return the workedMethValue
     */
    public String getWorkedMethValue() {
        return workedMethValue;
    }

    /**
     * Setter method for workedMethValue.
     *
     * @param workedMethValue Set for workedMethValue
     */
    public void setWorkedMethValue(String workedMethValue) {
        this.workedMethValue = workedMethValue;
    }

    /**
     * Getter method for stgInstrIssuerId.
     *
     * @return the stgInstrIssuerId
     */
    public String getStgInstrIssuerId() {
        return stgInstrIssuerId;
    }

    /**
     * Setter method for stgInstrIssuerId.
     *
     * @param stgInstrIssuerId Set for stgInstrIssuerId
     */
    public void setStgInstrIssuerId(String stgInstrIssuerId) {
        this.stgInstrIssuerId = stgInstrIssuerId;
    }

    /**
     * Getter method for stgInstrIssuerNm.
     *
     * @return the stgInstrIssuerNm
     */
    public String getStgInstrIssuerNm() {
        return stgInstrIssuerNm;
    }

    /**
     * Setter method for stgInstrIssuerNm.
     *
     * @param stgInstrIssuerNm Set for stgInstrIssuerNm
     */
    public void setStgInstrIssuerNm(String stgInstrIssuerNm) {
        this.stgInstrIssuerNm = stgInstrIssuerNm;
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
    public Integer getPkgQty() {
        return pkgQty;
    }

    /**
     * Setter method for pkgQty.
     *
     * @param pkgQty Set for pkgQty
     */
    public void setPkgQty(Integer pkgQty) {
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
     * Getter method for weightUnitDisp.
     *
     * @return the weightUnitDisp
     */
    public String getWeightUnitDisp() {
        return weightUnitDisp;
    }

    /**
     * Setter method for weightUnitDisp.
     *
     * @param weightUnitDisp Set for weightUnitDisp
     */
    public void setWeightUnitDisp(String weightUnitDisp) {
        this.weightUnitDisp = weightUnitDisp;
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

    /**
     * Getter method for volumeUnitDisp.
     *
     * @return the volumeUnitDisp
     */
    public String getVolumeUnitDisp() {
        return volumeUnitDisp;
    }

    /**
     * Setter method for volumeUnitDisp.
     *
     * @param volumeUnitDisp Set for volumeUnitDisp
     */
    public void setVolumeUnitDisp(String volumeUnitDisp) {
        this.volumeUnitDisp = volumeUnitDisp;
    }

    /**
     * Getter method for workedIssuerNm.
     *
     * @return the workedIssuerNm
     */
    public String getWorkedIssuerNm() {
        return workedIssuerNm;
    }

    /**
     * Setter method for workedIssuerNm.
     *
     * @param workedIssuerNm Set for workedIssuerNm
     */
    public void setWorkedIssuerNm(String workedIssuerNm) {
        this.workedIssuerNm = workedIssuerNm;
    }

    /**
     * Getter method for pltzDomainList.
     *
     * @return the pltzDomainList
     */
    public List<? extends W4001PltzDomain> getPltzDomainList() {
        return pltzDomainList;
    }

    /**
     * Setter method for pltzDomainList.
     *
     * @param pltzDomainList Set for pltzDomainList
     */
    public void setPltzDomainList(List<? extends W4001PltzDomain> pltzDomainList) {
        this.pltzDomainList = pltzDomainList;
    }
}
