/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The PL layer domain class that holds the detail information of Outer Package
 * Search Sub Screen List section. <br />
 * 外装選択子画面一覧部の明細情報を保持するPL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10090 $
 */
public class Wt006ListDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * OWNER COMPANY/責任会社
     */
    private String ownerComp;

    /**
     * OUTER PKG CODE/外装記号
     */
    private String outerPkgCd;

    /**
     * PACKAGE ITEM NO/包装材品目番号
     */
    private String pkgItemNo;

    /**
     * VOLUME UNIT/容積単位(会社)
     */
    private String volumeUnitComp;

    /**
     * LENGHT UNIT DISPLAY/縦単位表記
     */
    private String lengthUnitDisp;

    /**
     * VOLUME UNIT DISPLAY/容積単位表記
     */
    private String volumeUnitDisp;

    /**
     * LENGTH(EXPORT PACKAGE)AFTER CHANGE/縦(輸出荷姿)変更後
     */
    private String lengthAfter;

    /**
     * WIDTH(EXPORT PACKAGE)AFTER CHANGE/横(輸出荷姿)変更後
     */
    private String widthAfter;

    /**
     * HEIGHT(EXPORT PACKAGE)AFTER CHANGE/高さ(輸出荷姿)変更後
     */
    private String heightAfter;

    /**
     * VOLUME AFTER CHANGE/容積 変更後
     */
    private String volumeAfter;

    /**
     * Default constructor.
     */
    public Wt006ListDomain() {
    }

    /**
     * <p>Getter method for ownerComp.</p>
     *
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * <p>Setter method for ownerComp.</p>
     *
     * @param ownerComp Set for ownerComp
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * <p>Getter method for outerPkgCd.</p>
     *
     * @return the outerPkgCd
     */
    public String getOuterPkgCd() {
        return outerPkgCd;
    }

    /**
     * <p>Setter method for outerPkgCd.</p>
     *
     * @param outerPkgCd Set for outerPkgCd
     */
    public void setOuterPkgCd(String outerPkgCd) {
        this.outerPkgCd = outerPkgCd;
    }

    /**
     * <p>Getter method for pkgItemNo.</p>
     *
     * @return the pkgItemNo
     */
    public String getPkgItemNo() {
        return pkgItemNo;
    }

    /**
     * <p>Setter method for pkgItemNo.</p>
     *
     * @param pkgItemNo Set for pkgItemNo
     */
    public void setPkgItemNo(String pkgItemNo) {
        this.pkgItemNo = pkgItemNo;
    }

    /**
     * <p>Getter method for volumeUnitComp.</p>
     *
     * @return the volumeUnitComp
     */
    public String getVolumeUnitComp() {
        return volumeUnitComp;
    }

    /**
     * <p>Setter method for volumeUnitComp.</p>
     *
     * @param volumeUnitComp Set for volumeUnitComp
     */
    public void setVolumeUnitComp(String volumeUnitComp) {
        this.volumeUnitComp = volumeUnitComp;
    }

    /**
     * <p>Getter method for lengthUnitDisp.</p>
     *
     * @return the lengthUnitDisp
     */
    public String getLengthUnitDisp() {
        return lengthUnitDisp;
    }

    /**
     * <p>Setter method for lengthUnitDisp.</p>
     *
     * @param lengthUnitDisp Set for lengthUnitDisp
     */
    public void setLengthUnitDisp(String lengthUnitDisp) {
        this.lengthUnitDisp = lengthUnitDisp;
    }

    /**
     * <p>Getter method for volumeUnitDisp.</p>
     *
     * @return the volumeUnitDisp
     */
    public String getVolumeUnitDisp() {
        return volumeUnitDisp;
    }

    /**
     * <p>Setter method for volumeUnitDisp.</p>
     *
     * @param volumeUnitDisp Set for volumeUnitDisp
     */
    public void setVolumeUnitDisp(String volumeUnitDisp) {
        this.volumeUnitDisp = volumeUnitDisp;
    }

    /**
     * <p>Getter method for lengthAfter.</p>
     *
     * @return the lengthAfter
     */
    public String getLengthAfter() {
        return lengthAfter;
    }

    /**
     * <p>Setter method for lengthAfter.</p>
     *
     * @param lengthAfter Set for lengthAfter
     */
    public void setLengthAfter(String lengthAfter) {
        this.lengthAfter = lengthAfter;
    }

    /**
     * <p>Getter method for widthAfter.</p>
     *
     * @return the widthAfter
     */
    public String getWidthAfter() {
        return widthAfter;
    }

    /**
     * <p>Setter method for widthAfter.</p>
     *
     * @param widthAfter Set for widthAfter
     */
    public void setWidthAfter(String widthAfter) {
        this.widthAfter = widthAfter;
    }

    /**
     * <p>Getter method for heightAfter.</p>
     *
     * @return the heightAfter
     */
    public String getHeightAfter() {
        return heightAfter;
    }

    /**
     * <p>Setter method for heightAfter.</p>
     *
     * @param heightAfter Set for heightAfter
     */
    public void setHeightAfter(String heightAfter) {
        this.heightAfter = heightAfter;
    }

    /**
     * <p>Getter method for volumeAfter.</p>
     *
     * @return the volumeAfter
     */
    public String getVolumeAfter() {
        return volumeAfter;
    }

    /**
     * <p>Setter method for volumeAfter.</p>
     *
     * @param volumeAfter Set for volumeAfter
     */
    public void setVolumeAfter(String volumeAfter) {
        this.volumeAfter = volumeAfter;
    }

}
