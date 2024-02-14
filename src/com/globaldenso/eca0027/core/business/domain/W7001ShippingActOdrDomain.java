/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of holds for the information of Shipping Actuality Receive Order.
 * <br />船積実績対象品受注情報の情報を保持するドメインです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001ShippingActOdrDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPING ACTUALITY NO<br />
     * 船積実績NO
     */
    private String shippingActNo;
    
    /**
     * INVOICE NO<br />
     * インボイスNO
     */
    private String invoiceNo;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ShippingActOdrDomain() {
        super();
    }

    /**
     * Getter method for shippingActNo.
     *
     * @return the shippingActNo
     */
    public String getShippingActNo() {
        return shippingActNo;
    }

    /**
     * Setter method for shippingActNo.
     *
     * @param shippingActNo Set for shippingActNo
     */
    public void setShippingActNo(String shippingActNo) {
        this.shippingActNo = shippingActNo;
    }

    /**
     * Getter method for invoiceNo.
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Setter method for invoiceNo.
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
}
