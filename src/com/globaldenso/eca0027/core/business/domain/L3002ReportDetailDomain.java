/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the detail information of Carry out list report (By Part Number).
 *
 * @author $Author: chonthicha.a@denso.co.th $
 * @version $Revision: XXXX $
 */
public class L3002ReportDetailDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Plant CD
     */
    private String plantCd;

    /**
     * Ship Lot
     */
    private String shipLot;

    /**
     * Item No.
     */
    private String itemNo;

    /**
     * Package code
     */
    private String pkgCd;

    /**
     * Transferable QTY
     */
    private String transferableQty;

    /**
     * On Hand QTY
     */
    private String onHandQty;

    /**
     * Constructor.
     */
    public L3002ReportDetailDomain() {
    }

    /**
     * <p>Getter method for transferableQty.</p>
     *
     * @return the transferableQty
     */
    public String getTransferableQty() {
        return transferableQty;
    }

    /**
     * <p>Setter method for transferableQty.</p>
     *
     * @param transferableQty Set for transferableQty
     */
    public void setTransferableQty(String transferableQty) {
        this.transferableQty = transferableQty;
    }

    /**
     * <p>Getter method for shipLot.</p>
     *
     * @return the shipLot
     */
    public String getShipLot() {
        return shipLot;
    }

    /**
     * <p>Setter method for shipLot.</p>
     *
     * @param shipLot Set for shipLot
     */
    public void setShipLot(String shipLot) {
        this.shipLot = shipLot;
    }

    /**
     * <p>Getter method for plantCd.</p>
     *
     * @return the plantCd
     */
    public String getPlantCd() {
        return plantCd;
    }

    /**
     * <p>Setter method for plantCd.</p>
     *
     * @param plantCd Set for plantCd
     */
    public void setPlantCd(String plantCd) {
        this.plantCd = plantCd;
    }

    /**
     * <p>Getter method for itemNo.</p>
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * <p>Setter method for itemNo.</p>
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * <p>Getter method for onHandQty.</p>
     *
     * @return the onHandQty
     */
    public String getOnHandQty() {
        return onHandQty;
    }

    /**
     * <p>Setter method for onHandQty.</p>
     *
     * @param onHandQty Set for onHandQty
     */
    public void setOnHandQty(String onHandQty) {
        this.onHandQty = onHandQty;
    }

    /**
     * Getter method for pkgCd.
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * Setter method for pkgCd.
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }
}
