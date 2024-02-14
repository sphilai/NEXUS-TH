/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class to hold the result of a summary of the number and weight of the form [L6003].
 * <br/>帳票【L6003】の数量、重量のサマリの結果を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L6003TtInvoiceAttachedBySumQtyDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * QUANTITY UNIT<br />
     * 数量単位
     */
    private String qtyUnit = null;
    
    /**
     * Total of QUANTITY<br />
     * 数量の合計
     */
    private String sumQty = null;
    
    /**
     * Default Constructor
     */
    public L6003TtInvoiceAttachedBySumQtyDomain() {
    }

    /**
     * Getter method for qtyUnit.
     *
     * @return the qtyUnit
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * Setter method for qtyUnit.
     *
     * @param qtyUnit qtyUnit
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    /**
     * Getter method for sumQty.
     *
     * @return the sumQty
     */
    public String getSumQty() {
        return sumQty;
    }

    /**
     * Setter method for sumQty.
     *
     * @param sumQty sumQty.
     */
    public void setSumQty(String sumQty) {
        this.sumQty = sumQty;
    }

}
