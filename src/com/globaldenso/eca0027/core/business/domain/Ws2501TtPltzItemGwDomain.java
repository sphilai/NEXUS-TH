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
 * The domain holding the result of SearchTtPltzItemGw.
 * <br />SearchTtPltzItemGwの結果を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501TtPltzItemGwDomain extends AbstractDomain implements Serializable {

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
     * NET_WEIGHT
     */
    private BigDecimal  netWeight;


    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501TtPltzItemGwDomain() {
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
     * Getter method for netWeight.
     *
     * @return the netWeight
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }


    /**
     * Setter method for netWeight.
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }
}