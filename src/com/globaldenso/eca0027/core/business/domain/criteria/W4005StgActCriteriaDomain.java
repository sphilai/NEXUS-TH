/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.Date;
import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the search criteria for the Staging Actuality
 * <br />山作り実績の検索条件を保持するドメインクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4746 $
 */
public class W4005StgActCriteriaDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Staging actuality no.
     */
    private String stgActNo;

    /**
     * Warehouse company code.
     */
    private String whCompCd;

    /**
     * Warehouse code.
     */
    private String whCd;

    /**
     * Transport code.
     */
    private String trnsCd;

    /**
     * Container sorting key.
     */
    private String containerSortingKey;

    /**
     * Transport type code.
     */
    private String trnsTypCd;

    /**
     * Transport type name.
     */
    private String trnsTypNm;

    /**
     * Staging instruction date from.
     */
    private Date stgActDtFrom;

    /**
     * Staging instruction date to.
     */
    private Date stgActDtTo;

    /**
     * Staging actuality issuer ID.
     */
    private String stgActIssuerId;

    /**
     * Weight unit.
     */
    private String weightUnit;

    /**
     * Weight unit display.
     */
    private String weightUnitDisp;

    /**
     * Volume unit.
     */
    private String volumeUnit;

    /**
     * Volume unit display.
     */
    private String volumeUnitDisp;

    /**
     * X-tag.
     */
    private String xmainMark;

    /**
     * Main mark.
     */
    private String mainMark;

    /**
     * Shipper code.
     */
    private String shipperCd;

    /**
     * Staging instruction no.
     */
    private String stgInstrNo;

    /**
     * Server ID.
     */
    private String serverId;

    /**
     * Function authority list.
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * Date format (for print report).
     */
    private String reportDateFormat;

    /**
     * Constructor.
     */
    public W4005StgActCriteriaDomain() {
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
     * Getter method for trnsTypCd.
     *
     * @return the trnsTypCd
     */
    public String getTrnsTypCd() {
        return trnsTypCd;
    }

    /**
     * Setter method for trnsTypCd.
     *
     * @param trnsTypCd Set for trnsTypCd
     */
    public void setTrnsTypCd(String trnsTypCd) {
        this.trnsTypCd = trnsTypCd;
    }

    /**
     * Getter method for trnsTypNm.
     *
     * @return the trnsTypNm
     */
    public String getTrnsTypNm() {
        return trnsTypNm;
    }

    /**
     * Setter method for trnsTypNm.
     *
     * @param trnsTypNm Set for trnsTypNm
     */
    public void setTrnsTypNm(String trnsTypNm) {
        this.trnsTypNm = trnsTypNm;
    }

    /**
     * Getter method for stgActDtFrom.
     *
     * @return the stgActDtFrom
     */
    public Date getStgActDtFrom() {
        return stgActDtFrom;
    }

    /**
     * Setter method for stgActDtFrom.
     *
     * @param stgActDtFrom Set for stgActDtFrom
     */
    public void setStgActDtFrom(Date stgActDtFrom) {
        this.stgActDtFrom = stgActDtFrom;
    }

    /**
     * Getter method for stgActDtTo.
     *
     * @return the stgActDtTo
     */
    public Date getStgActDtTo() {
        return stgActDtTo;
    }

    /**
     * Setter method for stgActDtTo.
     *
     * @param stgActDtTo Set for stgActDtTo
     */
    public void setStgActDtTo(Date stgActDtTo) {
        this.stgActDtTo = stgActDtTo;
    }

    /**
     * Getter method for stgActIssuerId.
     *
     * @return the stgActIssuerId
     */
    public String getStgActIssuerId() {
        return stgActIssuerId;
    }

    /**
     * Setter method for stgActIssuerId.
     *
     * @param stgActIssuerId Set for stgActIssuerId
     */
    public void setStgActIssuerId(String stgActIssuerId) {
        this.stgActIssuerId = stgActIssuerId;
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
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
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
     * Getter method for reportDateFormat.
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * Setter method for reportDateFormat.
     *
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
    }
}
