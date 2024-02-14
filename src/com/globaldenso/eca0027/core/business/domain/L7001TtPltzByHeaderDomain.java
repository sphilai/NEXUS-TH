/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class that holds the header information of the document Header (7001).
 * </br>Header帳票(7001)のヘッダ情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10836 $
 */
public class L7001TtPltzByHeaderDomain extends AbstractDomain {
    
    /**
     * serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * SHIPPER_CD
     */
    private String shipperCd = null;

    /**
     * record number<br />
     * レコード件数
     */
    private int countShipperCd = 0;
    
    // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
    /**
     * Shipper name abb.<br />
     * 荷主会社名の略称
     */
    private String shipperNmAbb = null;
    // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<

    /**
     * Default Constructor
     */
    public L7001TtPltzByHeaderDomain() {
    }

    /**
     * Getter method for shipperCd.<br />
     * shipperCd のゲッターメソッドです。
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.<br />
     * shipperCd のセッターメソッドです。
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for countShipperCd.<br />
     * countShipperCd のゲッターメソッドです。
     *
     * @return the countShipperCd
     */
    public int getCountShipperCd() {
        return countShipperCd;
    }

    /**
     * Setter method for countShipperCd.<br />
     * countShipperCd のセッターメソッドです。
     *
     * @param countShipperCd Set for countShipperCd
     */
    public void setCountShipperCd(int countShipperCd) {
        this.countShipperCd = countShipperCd;
    }

    // 2015/2/24 DNJP.Kawamura UT112対応 START >>>>>
    /**
     * <p>Getter method for shipperNmAbb.</p>
     *
     * @return the shipperNmAbb
     */
    public String getShipperNmAbb() {
        return shipperNmAbb;
    }

    /**
     * <p>Setter method for shipperNmAbb.</p>
     *
     * @param shipperNmAbb Set for shipperNmAbb
     */
    public void setShipperNmAbb(String shipperNmAbb) {
        this.shipperNmAbb = shipperNmAbb;
    }
    // 2015/2/24 DNJP.Kawamura UT112対応 END <<<<<
    
}
