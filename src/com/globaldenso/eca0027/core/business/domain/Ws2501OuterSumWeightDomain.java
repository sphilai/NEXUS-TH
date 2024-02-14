/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain holding the result of SearchOuterSumWeight.
 * <br />SearchOuterSumWeightの結果を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501OuterSumWeightDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SUM_WEIGHT
     */
    private BigDecimal  sumWeight;

    /**
     * WEIGHT_UNIT
     */
    private String  weightUnit;


    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501OuterSumWeightDomain() {
    }

    /**
     * Getter method for sumWeight.
     *
     * @return the sumWeight
     */
    public BigDecimal getSumWeight() {
        return sumWeight;
    }

    /**
     * Setter method for sumWeight.
     *
     * @param sumWeight Set for sumWeight
     */
    public void setSumWeight(BigDecimal sumWeight) {
        this.sumWeight = sumWeight;
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
}
