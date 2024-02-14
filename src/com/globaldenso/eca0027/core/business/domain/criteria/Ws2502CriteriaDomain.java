/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The parameter domain of ECA0027_WS_2502.
 * <br />ECA0027_WS_2502のパラメータドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2502CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * XML input parameter
     * <br />XML入力パラメータ
     */
    private Ws2502XmlRootCriteriaDomain xmlRoot;
    
    /**
     * VOLUME UNIT
     * <br />容積単位
     */
    private String volumeUnit;
    
    /**
     * VOLUME
     * <br />容積
     */
    private BigDecimal volume;
    
    /**
     * LENGTH UNIT
     * <br />長さ単位
     */
    private String lengthUnit;
    
    /**
     * LENGTH(EXPORT PACKAGE)
     * <br />縦(輸出荷姿)
     * 
     */
    private BigDecimal length;
    
    /**
     * WIDTH(EXPORT PACKAGE)
     * <br />横(輸出荷姿)
     */
    private BigDecimal width;
    
    /**
     * HEIGHT(EXPORT PACKAGE)
     * <br />高さ(輸出荷姿)
     */
    private BigDecimal height;
    
    /**
     * VOLUME UNIT
     * <br />容積単位
     */
    private String volumeUnitPalletize;
    
    /**
     * VOLUME (PALLETIZE)
     * <br />容積（パレタイズ）
     */
    private BigDecimal volumePalletize;
    
    /**
     * LENGTH UNIT
     * <br />長さ単位
     */
    private String lengthUnitPalletize;
    
    /**
     * LENGTH(PALLETIZE)
     * <br />たて（パレタイズ）
     */
    private BigDecimal lengthPalletize;
    
    /**
     * WIDTH (PALLETIZE)
     * <br />よこ（パレタイズ）
     */
    private BigDecimal widthPalletize;
    
    /**
     * HEIGHT (PALLETIZE)
     * <br />高さ（パレタイズ）
     */
    private BigDecimal heightPalletize;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2502CriteriaDomain() {
    }

    /**
     * Getter method for xmlRoot.
     *
     * @return the xmlRoot
     */
    public Ws2502XmlRootCriteriaDomain getXmlRoot() {
        return xmlRoot;
    }

    /**
     * Setter method for xmlRoot.
     *
     * @param xmlRoot Set for xmlRoot
     */
    public void setXmlRoot(Ws2502XmlRootCriteriaDomain xmlRoot) {
        this.xmlRoot = xmlRoot;
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
     * Getter method for lengthUnit.
     *
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * Setter method for lengthUnit.
     *
     * @param lengthUnit Set for lengthUnit
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
    }

    /**
     * Getter method for length.
     *
     * @return the length
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Setter method for length.
     *
     * @param length Set for length
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * Getter method for width.
     *
     * @return the width
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Setter method for width.
     *
     * @param width Set for width
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * Getter method for height.
     *
     * @return the height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Setter method for height.
     *
     * @param height Set for height
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * Getter method for volumeUnitPalletize.
     *
     * @return the volumeUnitPalletize
     */
    public String getVolumeUnitPalletize() {
        return volumeUnitPalletize;
    }

    /**
     * Setter method for volumeUnitPalletize.
     *
     * @param volumeUnitPalletize Set for volumeUnitPalletize
     */
    public void setVolumeUnitPalletize(String volumeUnitPalletize) {
        this.volumeUnitPalletize = volumeUnitPalletize;
    }

    /**
     * Getter method for volumePalletize.
     *
     * @return the volumePalletize
     */
    public BigDecimal getVolumePalletize() {
        return volumePalletize;
    }

    /**
     * Setter method for volumePalletize.
     *
     * @param volumePalletize Set for volumePalletize
     */
    public void setVolumePalletize(BigDecimal volumePalletize) {
        this.volumePalletize = volumePalletize;
    }

    /**
     * Getter method for lengthUnitPalletize.
     *
     * @return the lengthUnitPalletize
     */
    public String getLengthUnitPalletize() {
        return lengthUnitPalletize;
    }

    /**
     * Setter method for lengthUnitPalletize.
     *
     * @param lengthUnitPalletize Set for lengthUnitPalletize
     */
    public void setLengthUnitPalletize(String lengthUnitPalletize) {
        this.lengthUnitPalletize = lengthUnitPalletize;
    }

    /**
     * Getter method for lengthPalletize.
     *
     * @return the lengthPalletize
     */
    public BigDecimal getLengthPalletize() {
        return lengthPalletize;
    }

    /**
     * Setter method for lengthPalletize.
     *
     * @param lengthPalletize Set for lengthPalletize
     */
    public void setLengthPalletize(BigDecimal lengthPalletize) {
        this.lengthPalletize = lengthPalletize;
    }

    /**
     * Getter method for widthPalletize.
     *
     * @return the widthPalletize
     */
    public BigDecimal getWidthPalletize() {
        return widthPalletize;
    }

    /**
     * Setter method for widthPalletize.
     *
     * @param widthPalletize Set for widthPalletize
     */
    public void setWidthPalletize(BigDecimal widthPalletize) {
        this.widthPalletize = widthPalletize;
    }

    /**
     * Getter method for heightPalletize.
     *
     * @return the heightPalletize
     */
    public BigDecimal getHeightPalletize() {
        return heightPalletize;
    }

    /**
     * Setter method for heightPalletize.
     *
     * @param heightPalletize Set for heightPalletize
     */
    public void setHeightPalletize(BigDecimal heightPalletize) {
        this.heightPalletize = heightPalletize;
    }
}
