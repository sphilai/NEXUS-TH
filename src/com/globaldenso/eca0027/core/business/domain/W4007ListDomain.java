/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the detail information of Staging Actuality Create Screen List section
 * <br />山作り実績Create画面一覧部の明細情報を保持するドメインクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4746 $
 */
public class W4007ListDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * If Main mark then "1", if X-Main mark then "2".
     */
    private String mainMarkTyp;

    /**
     * If Main mark then mainMark, if X-Main mark then xmainMark.
     */
    private String mainMarkOrXmainMark;

    /**
     * Shipper code.
     */
    private String shipperCd;

    /**
     * Ship to code.
     */
    private String shipToCd;

    /**
     * Staging instruction no.
     */
    private String stgInstrNo;

    /**
     * Loading code.
     */
    private String loadingCd;

    /**
     * Gross weight.
     */
    private String grossWeight;

    /**
     * Volume.
     */
    private String volume;

    /**
     * Last tr receive date.
     */
    private String lastTrRcvDt;

    /**
     * Deisabled flag for checkbox. Cause already selected.
     */
    private String disabledFlg;

    /**
     * Constructor.
     */
    public W4007ListDomain() {
    }

    /**
     * Getter method for mainMarkTyp.
     *
     * @return the mainMarkTyp
     */
    public String getMainMarkTyp() {
        return mainMarkTyp;
    }

    /**
     * Setter method for mainMarkTyp.
     *
     * @param mainMarkTyp Set for mainMarkTyp
     */
    public void setMainMarkTyp(String mainMarkTyp) {
        this.mainMarkTyp = mainMarkTyp;
    }

    /**
     * Getter method for mainMarkOrXmainMark.
     *
     * @return the mainMarkOrXmainMark
     */
    public String getMainMarkOrXmainMark() {
        return mainMarkOrXmainMark;
    }

    /**
     * Setter method for mainMarkOrXmainMark.
     *
     * @param mainMarkOrXmainMark Set for mainMarkOrXmainMark
     */
    public void setMainMarkOrXmainMark(String mainMarkOrXmainMark) {
        this.mainMarkOrXmainMark = mainMarkOrXmainMark;
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
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for grossWeight.
     *
     * @return the grossWeight
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /**
     * Setter method for grossWeight.
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * Getter method for volume.
     *
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Setter method for volume.
     *
     * @param volume Set for volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * Getter method for lastTrRcvDt.
     *
     * @return the lastTrRcvDt
     */
    public String getLastTrRcvDt() {
        return lastTrRcvDt;
    }

    /**
     * Setter method for lastTrRcvDt.
     *
     * @param lastTrRcvDt Set for lastTrRcvDt
     */
    public void setLastTrRcvDt(String lastTrRcvDt) {
        this.lastTrRcvDt = lastTrRcvDt;
    }

    /**
     * Getter method for disabledFlg.
     *
     * @return the disabledFlg
     */
    public String getDisabledFlg() {
        return disabledFlg;
    }

    /**
     * Setter method for disabledFlg.
     *
     * @param disabledFlg Set for disabledFlg
     */
    public void setDisabledFlg(String disabledFlg) {
        this.disabledFlg = disabledFlg;
    }
}
