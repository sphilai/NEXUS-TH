/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of holds for the information of Shipping Actuality Invoice Work.
 * <br />船積実績対象インボイスワークを保持するドメインです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001ShippingActTwInvoiceDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * SHIPPER CODE<br />
     * 荷主コード
     */
    private String shipperCd;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ShippingActTwInvoiceDomain() {
        super();
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

}
