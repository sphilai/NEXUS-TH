/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The PL layer domain class that holds the detail information of Ship to Search
 * Sub Screen List section. <br />
 * 送荷先選択子画面一覧部の明細情報を保持するPL層用のドメインクラスです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12983 $
 */

public class Wt014ListDomain extends AbstractDomain{

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIP TO CODE/送荷先コード
     */
    private String shipToCd;

    /**
     * SHIP TO NAME/送荷先名称
     */
    private String shipToNm;

    /**
     * SHIP TO NAME ABBREVIATION/送荷先略称
     */
    private String shipToNmAbb;
    
    /**
     * SHIP_TO_ADDR
     */
    private String shipToAddr;

    /**
     * SHIP_TO_TEL
     */
    private String shipToTel;
    
    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * PRINT SHIP TO NAME/印刷用送荷先名称
     */
    private String printShipToNm;

    /**
     * PRINT SHIP TO ADDRESS/印刷用送荷先住所
     */
    private String printShipToAddr;

    /**
     * Default constructor.
     */
    public Wt014ListDomain() {
    }

    /**
     * <p>Getter method for shipToCd.</p>
     *
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * <p>Setter method for shipToCd.</p>
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * <p>Getter method for shipToNm.</p>
     *
     * @return the shipToNm
     */
    public String getShipToNm() {
        return shipToNm;
    }

    /**
     * <p>Setter method for shipToNm.</p>
     *
     * @param shipToNm Set for shipToNm
     */
    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
    }

    /**
     * <p>Getter method for shipToNmAbb.</p>
     *
     * @return the shipToNmAbb
     */
    public String getShipToNmAbb() {
        return shipToNmAbb;
    }

    /**
     * <p>Setter method for shipToNmAbb.</p>
     *
     * @param shipToNmAbb Set for shipToNmAbb
     */
    public void setShipToNmAbb(String shipToNmAbb) {
        this.shipToNmAbb = shipToNmAbb;
    }
    
    /**
     * <p>Getter method for shipToAddr.</p>
     *
     * @return the shipToAddr
     */
    public String getShipToAddr() {
        return shipToAddr;
    }

    /**
     * <p>Setter method for shipToAddr.</p>
     *
     * @param shipToAddr Set for shipToAddr
     */
    public void setShipToAddr(String shipToAddr) {
        this.shipToAddr = shipToAddr;
    }

    /**
     * <p>Getter method for shipToTel.</p>
     *
     * @return the shipToTel
     */
    public String getShipToTel() {
        return shipToTel;
    }

    /**
     * <p>Setter method for shipToTel.</p>
     *
     * @param shipToTel Set for shipToTel
     */
    public void setShipToTel(String shipToTel) {
        this.shipToTel = shipToTel;
    }
    
    /**
     * <p>Getter method for compCd.</p>
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * <p>Setter method for compCd.</p>
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * <p>Getter method for printShipToNm.</p>
     *
     * @return the printShipToNm
     */
    public String getPrintShipToNm() {
        return printShipToNm;
    }

    /**
     * <p>Setter method for printShipToNm.</p>
     *
     * @param printShipToNm Set for printShipToNm
     */
    public void setPrintShipToNm(String printShipToNm) {
        this.printShipToNm = printShipToNm;
    }

    /**
     * <p>Getter method for printShipToAddr.</p>
     *
     * @return the printShipToAddr
     */
    public String getPrintShipToAddr() {
        return printShipToAddr;
    }

    /**
     * <p>Setter method for printShipToAddr.</p>
     *
     * @param printShipToAddr Set for printShipToAddr
     */
    public void setPrintShipToAddr(String printShipToAddr) {
        this.printShipToAddr = printShipToAddr;
    }

}
