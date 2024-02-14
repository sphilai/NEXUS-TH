/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain holding the result of SearchMixedTagItemNoNw.
 * <br />SearchMixedTagItemNoNwの結果を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501MixedTagItemNoNwDomain extends AbstractDomain implements Serializable {

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
     * SUM_ITEM_WEIGHT
     */
    private String  sumItemWeight;


    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501MixedTagItemNoNwDomain() {
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
     * Getter method for sumItemWeight.
     *
     * @return the sumItemWeight
     */
    public String getSumItemWeight() {
        return sumItemWeight;
    }


    /**
     * Setter method for sumItemWeight.
     *
     * @param sumItemWeight Set for sumItemWeight
     */
    public void setSumItemWeight(String sumItemWeight) {
        this.sumItemWeight = sumItemWeight;
    }




}
