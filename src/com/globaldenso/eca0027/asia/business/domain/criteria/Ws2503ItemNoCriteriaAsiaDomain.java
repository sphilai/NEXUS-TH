/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.business.domain.criteria;

import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503ItemNoCriteriaDomain;

/**
 * <br />ECA0027_WS_2503のパラメータドメインです。
 *
 * @author $Author: 10088DS01595 $
 * @version $Revision: 13582 $
 */
public class Ws2503ItemNoCriteriaAsiaDomain extends Ws2503ItemNoCriteriaDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * PRODUCT DATE<br />PRODUCT DATE
     */
    private String productDate;
    
    /**
     * ORDER NO<br />ORDER NO
     */
    private String orderNo;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2503ItemNoCriteriaAsiaDomain() {
    }

    /**
     * Getter method for productDate.
     *
     * @return the productDate
     */
    public String getProductDate() {
        return productDate;
    }

    /**
     * Setter method for productDate.
     *
     * @param productDate set for productDate.
     */
    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }

    /**
     * Getter method for orderNo.
     *
     * @return the orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Setter method for orderNo.
     *
     * @param orderNo set for orderNo.
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
