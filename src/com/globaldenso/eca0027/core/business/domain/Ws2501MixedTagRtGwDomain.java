/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a domain holding the result of SearchMixedTagRtGw.
 * <br />SearchMixedTagRtGwの結果を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501MixedTagRtGwDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * WEIGHT_UNIT
     */
    private String  weightUnit;
    
    /**
     * SUM_PKG_WEIGHT 
     */
    private String  sumPkgWeight;


    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501MixedTagRtGwDomain() {
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
     * Getter method for sumPkgWeight.
     *
     * @return the sumPkgWeight
     */
    public String getSumPkgWeight() {
        return sumPkgWeight;
    }


    /**
     * Setter method for sumPkgWeight.
     *
     * @param sumPkgWeight Set for sumPkgWeight
     */
    public void setSumPkgWeight(String sumPkgWeight) {
        this.sumPkgWeight = sumPkgWeight;
    }




}
